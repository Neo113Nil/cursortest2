package com.startapp.sdk.adsbase.crashreport;

import android.os.Looper;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class ThreadsState implements Serializable {
    private static final long serialVersionUID = -4777916407910409315L;

    /* renamed from: a, reason: collision with root package name */
    public final transient String f6399a;

    /* renamed from: b, reason: collision with root package name */
    public final transient boolean f6400b;

    /* renamed from: c, reason: collision with root package name */
    public final transient boolean f6401c;

    /* renamed from: d, reason: collision with root package name */
    public final transient HashSet f6402d;
    private final long delay;
    private final String handlerDescription;
    private Map<String, ShrunkStackTraceElement[]> threadsStackTraces;

    public static class ShrunkStackTraceElement implements Serializable {
        private static final long serialVersionUID = -7615438011343681512L;
        private final long skipBeforeAmount;
        private final StackTraceElement stackTraceElement;

        public ShrunkStackTraceElement(long j4, StackTraceElement stackTraceElement) {
            this.skipBeforeAmount = j4;
            this.stackTraceElement = stackTraceElement;
        }

        public final long a() {
            return this.skipBeforeAmount;
        }

        public final StackTraceElement b() {
            return this.stackTraceElement;
        }
    }

    public ThreadsState(zh zhVar) {
        this.f6399a = zhVar.f8045a;
        this.f6400b = zhVar.f8049e;
        this.f6401c = zhVar.f8050f;
        this.delay = zhVar.f8048d;
        this.handlerDescription = zhVar.f8046b;
        this.f6402d = zhVar.f8047c;
        Thread thread = Looper.getMainLooper().getThread();
        String str = thread.getName() + " (state = " + thread.getState() + ")";
        int i4 = 0;
        TreeMap treeMap = new TreeMap(new MainThreadComparator(i4));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            if (value != null && value.length > 0) {
                ShrunkStackTraceElement[] b4 = b(value);
                if (b4 != null && b4.length > 0) {
                    Thread.State state = key.getState();
                    if (key == thread) {
                        if (a(value)) {
                            return;
                        }
                        treeMap.put(str, b4);
                        i4 = 1;
                    } else if (!this.f6401c || state == Thread.State.BLOCKED || state == Thread.State.WAITING) {
                        treeMap.put(key.getName() + " (state = " + key.getState() + ")", b4);
                    }
                } else if (key == thread) {
                    return;
                }
            } else if (key == thread) {
                return;
            }
        }
        if (i4 == 0) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            ShrunkStackTraceElement[] b5 = b(stackTrace);
            if (b5 == null || b5.length <= 0 || a(stackTrace)) {
                return;
            } else {
                treeMap.put(str, b5);
            }
        }
        this.threadsStackTraces = treeMap;
    }

    public final long a() {
        return this.delay;
    }

    public final String b() {
        return this.handlerDescription;
    }

    public final Map c() {
        return this.threadsStackTraces;
    }

    public static class MainThreadComparator implements Comparator<String>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final transient String f6403a;

        private MainThreadComparator() {
            this.f6403a = Looper.getMainLooper().getThread().getName();
        }

        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (str3.startsWith(this.f6403a)) {
                return -1;
            }
            if (str4.startsWith(this.f6403a)) {
                return 1;
            }
            return str3.compareTo(str4);
        }

        public /* synthetic */ MainThreadComparator(int i4) {
            this();
        }
    }

    public final boolean a(StackTraceElement[] stackTraceElementArr) {
        if (this.f6402d == null) {
            return false;
        }
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (className != null && methodName != null) {
                if (this.f6402d.contains(className + '.' + methodName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ShrunkStackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        String className;
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        StackTraceElement stackTraceElement = null;
        int i4 = 0;
        boolean z = false;
        boolean z4 = false;
        while (i4 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement2 = stackTraceElementArr[i4];
            if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                boolean z5 = i4 < 3;
                String str = this.f6399a;
                boolean z6 = str == null || className.startsWith(str);
                if (z6) {
                    z = true;
                }
                if (!this.f6400b || z6 || z5 || z4) {
                    if (stackTraceElement != null) {
                        arrayList.add(new ShrunkStackTraceElement(j4, stackTraceElement));
                        j4 = 0;
                        stackTraceElement = null;
                    }
                    arrayList.add(new ShrunkStackTraceElement(0L, stackTraceElement2));
                } else {
                    if (stackTraceElement != null) {
                        j4++;
                    }
                    stackTraceElement = stackTraceElement2;
                }
                z4 = z6;
            }
            i4++;
        }
        if (stackTraceElement != null) {
            arrayList.add(new ShrunkStackTraceElement(j4 + 1, null));
        }
        if (z) {
            return (ShrunkStackTraceElement[]) arrayList.toArray(new ShrunkStackTraceElement[0]);
        }
        return null;
    }
}

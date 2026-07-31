package com.startapp.sdk.adsbase.crashreport;

import android.os.Looper;
import com.startapp.sdk.internal.ih;
import java.io.Serializable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class ThreadsState implements Serializable {
    private static final long serialVersionUID = -4777916407910409315L;

    /* renamed from: a, reason: collision with root package name */
    public final transient String f137a;
    public final transient boolean b;
    public final transient boolean c;
    public final transient HashSet d;
    private final long delay;
    private final String handlerDescription;
    private Map<String, ShrunkStackTraceElement[]> threadsStackTraces;

    public static class ShrunkStackTraceElement implements Serializable {
        private static final long serialVersionUID = -7615438011343681512L;
        private final long skipBeforeAmount;
        private final StackTraceElement stackTraceElement;

        public ShrunkStackTraceElement(long j, StackTraceElement stackTraceElement) {
            this.skipBeforeAmount = j;
            this.stackTraceElement = stackTraceElement;
        }

        public final long a() {
            return this.skipBeforeAmount;
        }

        public final StackTraceElement b() {
            return this.stackTraceElement;
        }
    }

    public ThreadsState(ih ihVar) {
        this.f137a = ihVar.f278a;
        this.b = ihVar.e;
        this.c = ihVar.f;
        this.delay = ihVar.d;
        this.handlerDescription = ihVar.b;
        this.d = ihVar.c;
        Thread thread = Looper.getMainLooper().getThread();
        String str = thread.getName() + " (state = " + thread.getState() + ")";
        int i = 0;
        TreeMap treeMap = new TreeMap(new MainThreadComparator(i));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            if (value != null && value.length > 0) {
                ShrunkStackTraceElement[] b = b(value);
                if (b != null && b.length > 0) {
                    Thread.State state = key.getState();
                    if (key == thread) {
                        if (a(value)) {
                            return;
                        }
                        treeMap.put(str, b);
                        i = 1;
                    } else if (!this.c || state == Thread.State.BLOCKED || state == Thread.State.WAITING) {
                        treeMap.put(key.getName() + " (state = " + key.getState() + ")", b);
                    }
                } else if (key == thread) {
                    return;
                }
            } else if (key == thread) {
                return;
            }
        }
        if (i == 0) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            ShrunkStackTraceElement[] b2 = b(stackTrace);
            if (b2 == null || b2.length <= 0 || a(stackTrace)) {
                return;
            } else {
                treeMap.put(str, b2);
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

    public final boolean a(StackTraceElement[] stackTraceElementArr) {
        if (this.d == null) {
            return false;
        }
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (className != null && methodName != null && this.d.contains(className + '.' + methodName)) {
                return true;
            }
        }
        return false;
    }

    public final ShrunkStackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        String className;
        ArrayList arrayList = new ArrayList();
        long j = 0;
        StackTraceElement stackTraceElement = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement2 = stackTraceElementArr[i];
            if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                boolean z3 = i < 3;
                String str = this.f137a;
                boolean z4 = str == null || className.startsWith(str);
                if (z4) {
                    z = true;
                }
                if (!this.b || z4 || z3 || z2) {
                    if (stackTraceElement != null) {
                        arrayList.add(new ShrunkStackTraceElement(j, stackTraceElement));
                        j = 0;
                        stackTraceElement = null;
                    }
                    arrayList.add(new ShrunkStackTraceElement(0L, stackTraceElement2));
                } else {
                    if (stackTraceElement != null) {
                        j++;
                    }
                    stackTraceElement = stackTraceElement2;
                }
                z2 = z4;
            }
            i++;
        }
        if (stackTraceElement != null) {
            arrayList.add(new ShrunkStackTraceElement(j + 1, null));
        }
        if (z) {
            return (ShrunkStackTraceElement[]) arrayList.toArray(new ShrunkStackTraceElement[0]);
        }
        return null;
    }

    public static class MainThreadComparator implements Comparator<String>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final transient String f138a;

        private MainThreadComparator() {
            this.f138a = Looper.getMainLooper().getThread().getName();
        }

        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (str3.startsWith(this.f138a)) {
                return -1;
            }
            if (str4.startsWith(this.f138a)) {
                return 1;
            }
            return str3.compareTo(str4);
        }

        public /* synthetic */ MainThreadComparator(int i) {
            this();
        }
    }
}

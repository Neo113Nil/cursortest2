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
    public final transient String f3309a;

    /* renamed from: b, reason: collision with root package name */
    public final transient boolean f3310b;

    /* renamed from: c, reason: collision with root package name */
    public final transient boolean f3311c;

    /* renamed from: d, reason: collision with root package name */
    public final transient HashSet f3312d;
    private final long delay;
    private final String handlerDescription;
    private Map<String, ShrunkStackTraceElement[]> threadsStackTraces;

    public static class ShrunkStackTraceElement implements Serializable {
        private static final long serialVersionUID = -7615438011343681512L;
        private final long skipBeforeAmount;
        private final StackTraceElement stackTraceElement;

        public ShrunkStackTraceElement(long j3, StackTraceElement stackTraceElement) {
            this.skipBeforeAmount = j3;
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
        this.f3309a = zhVar.f4893a;
        this.f3310b = zhVar.f4897e;
        this.f3311c = zhVar.f;
        this.delay = zhVar.f4896d;
        this.handlerDescription = zhVar.f4894b;
        this.f3312d = zhVar.f4895c;
        Thread thread = Looper.getMainLooper().getThread();
        String str = thread.getName() + " (state = " + thread.getState() + ")";
        int i3 = 0;
        TreeMap treeMap = new TreeMap(new MainThreadComparator(i3));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            if (value != null && value.length > 0) {
                ShrunkStackTraceElement[] b3 = b(value);
                if (b3 != null && b3.length > 0) {
                    Thread.State state = key.getState();
                    if (key == thread) {
                        if (a(value)) {
                            return;
                        }
                        treeMap.put(str, b3);
                        i3 = 1;
                    } else if (!this.f3311c || state == Thread.State.BLOCKED || state == Thread.State.WAITING) {
                        treeMap.put(key.getName() + " (state = " + key.getState() + ")", b3);
                    }
                } else if (key == thread) {
                    return;
                }
            } else if (key == thread) {
                return;
            }
        }
        if (i3 == 0) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            ShrunkStackTraceElement[] b4 = b(stackTrace);
            if (b4 == null || b4.length <= 0 || a(stackTrace)) {
                return;
            } else {
                treeMap.put(str, b4);
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
        public final transient String f3313a;

        private MainThreadComparator() {
            this.f3313a = Looper.getMainLooper().getThread().getName();
        }

        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (str3.startsWith(this.f3313a)) {
                return -1;
            }
            if (str4.startsWith(this.f3313a)) {
                return 1;
            }
            return str3.compareTo(str4);
        }

        public /* synthetic */ MainThreadComparator(int i3) {
            this();
        }
    }

    public final boolean a(StackTraceElement[] stackTraceElementArr) {
        if (this.f3312d == null) {
            return false;
        }
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (className != null && methodName != null) {
                if (this.f3312d.contains(className + '.' + methodName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final ShrunkStackTraceElement[] b(StackTraceElement[] stackTraceElementArr) {
        String className;
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        StackTraceElement stackTraceElement = null;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        while (i3 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement2 = stackTraceElementArr[i3];
            if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null) {
                boolean z3 = i3 < 3;
                String str = this.f3309a;
                boolean z4 = str == null || className.startsWith(str);
                if (z4) {
                    z = true;
                }
                if (!this.f3310b || z4 || z3 || z2) {
                    if (stackTraceElement != null) {
                        arrayList.add(new ShrunkStackTraceElement(j3, stackTraceElement));
                        j3 = 0;
                        stackTraceElement = null;
                    }
                    arrayList.add(new ShrunkStackTraceElement(0L, stackTraceElement2));
                } else {
                    if (stackTraceElement != null) {
                        j3++;
                    }
                    stackTraceElement = stackTraceElement2;
                }
                z2 = z4;
            }
            i3++;
        }
        if (stackTraceElement != null) {
            arrayList.add(new ShrunkStackTraceElement(j3 + 1, null));
        }
        if (z) {
            return (ShrunkStackTraceElement[]) arrayList.toArray(new ShrunkStackTraceElement[0]);
        }
        return null;
    }
}

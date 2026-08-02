package defpackage;

import android.os.Looper;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class csw {
    private static ClassLoader a;
    private static Thread b;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x009f, code lost:
    
        if (r1 == null) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        synchronized (csw.class) {
            classLoader = a;
            if (classLoader == null) {
                Thread thread2 = b;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                int activeGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= activeGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i2];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int activeCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[activeCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i >= activeCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (thread == null) {
                                    try {
                                        csv csvVar = new csv(threadGroup);
                                        try {
                                            csvVar.setContextClassLoader(null);
                                            csvVar.start();
                                            thread = csvVar;
                                        } catch (SecurityException e2) {
                                            e = e2;
                                            thread = csvVar;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                                            thread2 = thread;
                                            b = thread2;
                                        }
                                    } catch (SecurityException e3) {
                                        e = e3;
                                    }
                                }
                            } catch (SecurityException e4) {
                                e = e4;
                                thread = null;
                            }
                        }
                        thread2 = thread;
                    }
                    b = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = b.getContextClassLoader();
                    } catch (SecurityException e5) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e5.getMessage());
                    }
                }
                classLoader = classLoader2;
                a = classLoader;
            }
        }
        return classLoader;
    }
}

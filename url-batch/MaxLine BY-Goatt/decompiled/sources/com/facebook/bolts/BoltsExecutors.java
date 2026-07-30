package com.facebook.bolts;

import defpackage.up2;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class BoltsExecutors {
    public static final Companion Companion = new Companion(null);
    private static final BoltsExecutors INSTANCE = new BoltsExecutors();
    private final ExecutorService background;
    private final Executor immediate;
    private final ScheduledExecutorService scheduled;

    private BoltsExecutors() {
        ExecutorService newCachedThreadPool;
        if (Companion.isAndroidRuntime()) {
            newCachedThreadPool = AndroidExecutors.Companion.newCachedThreadPool();
        } else {
            newCachedThreadPool = Executors.newCachedThreadPool();
            newCachedThreadPool.getClass();
        }
        this.background = newCachedThreadPool;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        newSingleThreadScheduledExecutor.getClass();
        this.scheduled = newSingleThreadScheduledExecutor;
        this.immediate = new ImmediateExecutor();
    }

    public static final ExecutorService background() {
        return Companion.background();
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class ImmediateExecutor implements Executor {
        public static final Companion Companion = new Companion(null);
        private static final int MAX_DEPTH = 15;
        private final ThreadLocal<Integer> executionDepth = new ThreadLocal<>();

        private final int decrementDepth() {
            Integer num = this.executionDepth.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            ThreadLocal<Integer> threadLocal = this.executionDepth;
            if (intValue == 0) {
                threadLocal.remove();
                return intValue;
            }
            threadLocal.set(Integer.valueOf(intValue));
            return intValue;
        }

        private final int incrementDepth() {
            Integer num = this.executionDepth.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.executionDepth.set(Integer.valueOf(intValue));
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.getClass();
            try {
                if (incrementDepth() <= 15) {
                    runnable.run();
                } else {
                    BoltsExecutors.Companion.background().execute(runnable);
                }
                decrementDepth();
            } catch (Throwable th) {
                decrementDepth();
                throw th;
            }
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isAndroidRuntime() {
            String property = System.getProperty("java.runtime.name");
            if (property == null) {
                return false;
            }
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = property.toLowerCase(locale);
            lowerCase.getClass();
            return up2.q(lowerCase, "android");
        }

        public final ExecutorService background() {
            return BoltsExecutors.INSTANCE.background;
        }

        public final Executor immediate$facebook_bolts_release() {
            return BoltsExecutors.INSTANCE.immediate;
        }

        public final ScheduledExecutorService scheduled$facebook_bolts_release() {
            return BoltsExecutors.INSTANCE.scheduled;
        }

        private Companion() {
        }
    }
}

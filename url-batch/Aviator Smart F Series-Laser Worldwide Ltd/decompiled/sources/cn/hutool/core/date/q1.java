package cn.hutool.core.date;

import java.sql.Timestamp;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class q1 {
    private volatile long now = System.currentTimeMillis();
    private final long period;

    private static class a {
        public static final q1 INSTANCE = new q1(1);

        private a() {
        }
    }

    public q1(long j8) {
        this.period = j8;
        scheduleClockUpdating();
    }

    private long currentTimeMillis() {
        return this.now;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$scheduleClockUpdating$0(Runnable runnable) {
        Thread thread = new Thread(runnable, "System Clock");
        thread.setDaemon(true);
        return thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleClockUpdating$1() {
        this.now = System.currentTimeMillis();
    }

    public static long now() {
        return a.INSTANCE.currentTimeMillis();
    }

    public static String nowDate() {
        return new Timestamp(a.INSTANCE.currentTimeMillis()).toString();
    }

    private void scheduleClockUpdating() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: cn.hutool.core.date.o1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread lambda$scheduleClockUpdating$0;
                lambda$scheduleClockUpdating$0 = q1.lambda$scheduleClockUpdating$0(runnable);
                return lambda$scheduleClockUpdating$0;
            }
        });
        Runnable runnable = new Runnable() { // from class: cn.hutool.core.date.p1
            @Override // java.lang.Runnable
            public final void run() {
                q1.this.lambda$scheduleClockUpdating$1();
            }
        };
        long j8 = this.period;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(runnable, j8, j8, TimeUnit.MILLISECONDS);
    }
}

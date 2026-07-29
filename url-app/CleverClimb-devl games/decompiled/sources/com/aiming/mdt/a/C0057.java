package com.aiming.mdt.a;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.aiming.mdt.a.ʻʼʿˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0057 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f122 = 1;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static volatile C0057 f123;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f124;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private ThreadPoolExecutor.DiscardPolicy f125 = new ThreadPoolExecutor.DiscardPolicy();

    /* renamed from: ʼ, reason: contains not printable characters */
    private ScheduledThreadPoolExecutor f126 = new ScheduledThreadPoolExecutor(5);

    private C0057() {
        this.f126.setKeepAliveTime(40L, TimeUnit.SECONDS);
        this.f126.setMaximumPoolSize(30);
        this.f126.setRejectedExecutionHandler(new RejectedExecutionHandlerC0141(this));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static /* synthetic */ ThreadPoolExecutor.DiscardPolicy m176(C0057 c0057) {
        int i = f122 + 55;
        f124 = i % 128;
        if (!(i % 2 != 0)) {
            return c0057.f125;
        }
        ThreadPoolExecutor.DiscardPolicy discardPolicy = c0057.f125;
        Object obj = null;
        super.hashCode();
        return discardPolicy;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static C0057 m177() {
        if (f123 == null) {
            synchronized (C0057.class) {
                if (f123 == null) {
                    f123 = new C0057();
                }
            }
        }
        return f123;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final ScheduledFuture<?> m178(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        int i = f124 + 113;
        f122 = i % 128;
        int i2 = i % 2;
        ScheduledFuture<?> scheduleWithFixedDelay = this.f126.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        int i3 = f124 + 67;
        f122 = i3 % 128;
        if (i3 % 2 == 0) {
        }
        return scheduleWithFixedDelay;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m179(Runnable runnable) {
        int i = f124 + 41;
        f122 = i % 128;
        int i2 = i % 2;
        this.f126.execute(runnable);
        int i3 = f124 + 77;
        f122 = i3 % 128;
        if (i3 % 2 == 0) {
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final ScheduledFuture<?> m180(Runnable runnable, long j, TimeUnit timeUnit) {
        int i = f124 + 25;
        f122 = i % 128;
        if (i % 2 == 0) {
        }
        ScheduledFuture<?> schedule = this.f126.schedule(runnable, j, timeUnit);
        int i2 = f124 + 47;
        f122 = i2 % 128;
        if (i2 % 2 == 0) {
        }
        return schedule;
    }
}

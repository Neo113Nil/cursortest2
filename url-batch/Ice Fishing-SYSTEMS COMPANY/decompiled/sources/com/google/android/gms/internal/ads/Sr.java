package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Sr implements Rs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27626a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f27627b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27628c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27629d;

    public Sr(S2.a aVar, C3226fu c3226fu, long j9) {
        this.f27628c = aVar;
        this.f27629d = c3226fu;
        this.f27627b = j9;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final J3.a a() {
        switch (this.f27626a) {
            case 0:
                ((S2.a) this.f27628c).getClass();
                return C3686oN.c(new Tr((C3226fu) this.f27629d, System.currentTimeMillis(), this.f27627b));
            default:
                J3.a a9 = ((Rs) this.f27628c).a();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31617a3)).booleanValue()) {
                    timeUnit = TimeUnit.MICROSECONDS;
                }
                long j9 = this.f27627b;
                if (j9 > 0) {
                    a9 = C3686oN.w(a9, j9, timeUnit, (ScheduledExecutorService) this.f27629d);
                }
                return C3686oN.v(a9, Throwable.class, new C3907sc(8, this), AbstractC3212fg.f30745h);
        }
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        switch (this.f27626a) {
            case 0:
                return 4;
            default:
                return ((Rs) this.f27628c).d();
        }
    }

    public Sr(Rs rs, long j9, ScheduledExecutorService scheduledExecutorService) {
        this.f27628c = rs;
        this.f27627b = j9;
        this.f27629d = scheduledExecutorService;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.is, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3385is implements Rs {

    /* renamed from: a, reason: collision with root package name */
    public final C2892Zf f32014a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.e f32015b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f32016c;

    /* renamed from: d, reason: collision with root package name */
    public final C3157eg f32017d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f32018e;

    public C3385is(Context context, C2892Zf c2892Zf, ScheduledExecutorService scheduledExecutorService, C3157eg c3157eg) {
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31538R3)).booleanValue()) {
            this.f32015b = new S0.e(context, 7);
        }
        this.f32018e = context;
        this.f32014a = c2892Zf;
        this.f32016c = scheduledExecutorService;
        this.f32017d = c3157eg;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final J3.a a() {
        h3.n a9;
        C3151ea c3151ea = AbstractC3368ia.f31504N3;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            if (!((Boolean) rVar.f40119c.a(AbstractC3368ia.f31547S3)).booleanValue()) {
                if (!((Boolean) rVar.f40119c.a(AbstractC3368ia.f31513O3)).booleanValue()) {
                    return C3686oN.A(AbstractC2655Lg.e(this.f32015b.a()), J2.f25701m, AbstractC3212fg.f30745h);
                }
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31538R3)).booleanValue()) {
                    AbstractC3035cL.k(this.f32018e, false);
                    synchronized (AbstractC3035cL.f29683F) {
                        a9 = AbstractC3035cL.f29681D;
                    }
                } else {
                    a9 = this.f32015b.a();
                }
                if (a9 == null) {
                    return C3686oN.c(new C3438js(null, -1, 0));
                }
                J3.a y6 = C3686oN.y(AbstractC2655Lg.e(a9), C2538Ei.f24797j, AbstractC3212fg.f30745h);
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31521P3)).booleanValue()) {
                    y6 = C3686oN.w(y6, ((Long) rVar.f40119c.a(AbstractC3368ia.Q3)).longValue(), TimeUnit.MILLISECONDS, this.f32016c);
                }
                return C3686oN.u(y6, Exception.class, new C2670Me(4, this), this.f32017d);
            }
        }
        return C3686oN.c(new C3438js(null, -1, 0));
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        return 11;
    }
}

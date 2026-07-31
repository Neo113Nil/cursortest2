package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class oi2 implements ij2<pi2> {

    /* renamed from: a, reason: collision with root package name */
    private final String f9678a;

    /* renamed from: b, reason: collision with root package name */
    private final dc3 f9679b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f9680c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f9681d;

    /* renamed from: e, reason: collision with root package name */
    private final ks2 f9682e;

    /* renamed from: f, reason: collision with root package name */
    private final bw0 f9683f;

    oi2(dc3 dc3Var, ScheduledExecutorService scheduledExecutorService, String str, Context context, ks2 ks2Var, bw0 bw0Var) {
        this.f9679b = dc3Var;
        this.f9680c = scheduledExecutorService;
        this.f9678a = str;
        this.f9681d = context;
        this.f9682e = ks2Var;
        this.f9683f = bw0Var;
    }

    public static /* synthetic */ cc3 b(oi2 oi2Var) {
        String str = oi2Var.f9678a;
        if (((Boolean) sw.c().b(m10.f8317u5)).booleanValue()) {
            str = r2.b.UNKNOWN.name();
        }
        g3.p v6 = oi2Var.f9683f.v();
        fa1 fa1Var = new fa1();
        fa1Var.c(oi2Var.f9681d);
        is2 is2Var = new is2();
        is2Var.H("adUnitId");
        is2Var.d(oi2Var.f9682e.f7618d);
        is2Var.G(new pv());
        fa1Var.f(is2Var.f());
        v6.b(fa1Var.g());
        g3.h0 h0Var = new g3.h0();
        h0Var.a(str);
        v6.a(h0Var.b());
        new mg1();
        return rb3.f(rb3.m((ib3) rb3.o(ib3.E(v6.c().a()), ((Long) sw.c().b(m10.f8324v5)).longValue(), TimeUnit.MILLISECONDS, oi2Var.f9680c), new e43() { // from class: com.google.android.gms.internal.ads.ki2
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                g3.j jVar = (g3.j) obj;
                return jVar != null ? new pi2(jVar.f16655a) : new pi2(null);
            }
        }, oi2Var.f9679b), Exception.class, new e43() { // from class: com.google.android.gms.internal.ads.li2
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                io0.e("", (Exception) obj);
                return new pi2(null);
            }
        }, oi2Var.f9679b);
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<pi2> a() {
        return (!((Boolean) sw.c().b(m10.f8310t5)).booleanValue() || "adUnitId".equals(this.f9682e.f7620f)) ? this.f9679b.E(new Callable() { // from class: com.google.android.gms.internal.ads.ni2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new pi2(null);
            }
        }) : rb3.l(new wa3() { // from class: com.google.android.gms.internal.ads.mi2
            @Override // com.google.android.gms.internal.ads.wa3
            public final cc3 zza() {
                return oi2.b(oi2.this);
            }
        }, this.f9679b);
    }
}

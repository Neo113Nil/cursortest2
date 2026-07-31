package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class uy0 implements ax1 {

    /* renamed from: a, reason: collision with root package name */
    private final Long f13019a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13020b;

    /* renamed from: c, reason: collision with root package name */
    private final b01 f13021c;

    /* renamed from: d, reason: collision with root package name */
    private final yy0 f13022d;

    /* renamed from: e, reason: collision with root package name */
    private final uy0 f13023e = this;

    /* synthetic */ uy0(b01 b01Var, yy0 yy0Var, Long l7, String str, ty0 ty0Var) {
        this.f13021c = b01Var;
        this.f13022d = yy0Var;
        this.f13019a = l7;
        this.f13020b = str;
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public final ox1 a() {
        Context context;
        dx1 c7;
        long longValue = this.f13019a.longValue();
        context = this.f13022d.f14847a;
        c7 = ex1.c(this.f13022d.f14848b);
        return px1.b(longValue, context, c7, this.f13021c, this.f13020b);
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public final kx1 zza() {
        Context context;
        dx1 c7;
        long longValue = this.f13019a.longValue();
        context = this.f13022d.f14847a;
        c7 = ex1.c(this.f13022d.f14848b);
        return lx1.b(longValue, context, c7, this.f13021c, this.f13020b);
    }
}

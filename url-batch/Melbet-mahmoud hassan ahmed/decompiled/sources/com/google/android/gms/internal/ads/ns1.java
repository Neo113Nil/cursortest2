package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ns1 implements kv3<a52<hs1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<fa2<hs1, at2, z62>> f9300a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<fa2<hs1, at2, y62>> f9301b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ks2> f9302c;

    public ns1(yv3<fa2<hs1, at2, z62>> yv3Var, yv3<fa2<hs1, at2, y62>> yv3Var2, yv3<ks2> yv3Var3) {
        this.f9300a = yv3Var;
        this.f9301b = yv3Var2;
        this.f9302c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* synthetic */ Object a() {
        yv3<fa2<hs1, at2, z62>> yv3Var = this.f9300a;
        yv3<fa2<hs1, at2, y62>> yv3Var2 = this.f9301b;
        int i7 = ((ma1) this.f9302c).b().f7629o.f15240a;
        int i8 = i7 - 1;
        if (i7 != 0) {
            return i8 != 0 ? ((ga2) yv3Var2).a() : ((ga2) yv3Var).a();
        }
        throw null;
    }
}

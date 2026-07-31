package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ps1 implements kv3<jr> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ks2> f10368a;

    public ps1(yv3<ks2> yv3Var) {
        this.f10368a = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        jr jrVar = ((ma1) this.f10368a).b().f7629o.f15240a == 3 ? jr.REWARDED_INTERSTITIAL : jr.REWARD_BASED_VIDEO_AD;
        sv3.b(jrVar);
        return jrVar;
    }
}

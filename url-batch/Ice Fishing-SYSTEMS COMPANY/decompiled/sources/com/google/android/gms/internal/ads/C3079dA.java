package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3079dA implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3133eA f29982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ My f29983c;

    public /* synthetic */ C3079dA(C3133eA c3133eA, My my, int i) {
        this.f29981a = i;
        this.f29982b = c3133eA;
        this.f29983c = my;
    }

    @Override // com.google.android.gms.internal.ads.CD
    public final J3.a b(Object obj) {
        switch (this.f29981a) {
            case 0:
                C3133eA c3133eA = this.f29982b;
                RunnableFutureC3083dE a9 = c3133eA.f30323b.a(this.f29983c);
                c3133eA.i.e(15303, a9);
                return a9;
            default:
                C3133eA c3133eA2 = this.f29982b;
                RunnableFutureC3083dE a10 = c3133eA2.f30323b.a(this.f29983c);
                c3133eA2.i.e(15303, a10);
                return a10;
        }
    }
}

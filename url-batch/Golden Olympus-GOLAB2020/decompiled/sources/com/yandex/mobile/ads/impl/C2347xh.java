package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.xh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2347xh implements InterfaceC2301vh {

    /* renamed from: a, reason: collision with root package name */
    public final int f34560a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34561b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34562c;

    private C2347xh(int i4, int i5, int i6) {
        this.f34560a = i4;
        this.f34561b = i5;
        this.f34562c = i6;
    }

    public static C2347xh a(sf1 sf1Var) {
        int k4 = sf1Var.k();
        sf1Var.f(8);
        int k5 = sf1Var.k();
        int k6 = sf1Var.k();
        sf1Var.f(4);
        sf1Var.k();
        sf1Var.f(12);
        return new C2347xh(k4, k5, k6);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2301vh
    public final int getType() {
        return 1751742049;
    }
}

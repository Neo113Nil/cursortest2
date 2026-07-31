package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class vn1 extends w32 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ wn1 f33698e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    vn1(wn1 wn1Var, String str) {
        super(str);
        this.f33698e = wn1Var;
    }

    @Override // com.yandex.mobile.ads.impl.w32
    public final long e() {
        return this.f33698e.a(System.nanoTime());
    }
}

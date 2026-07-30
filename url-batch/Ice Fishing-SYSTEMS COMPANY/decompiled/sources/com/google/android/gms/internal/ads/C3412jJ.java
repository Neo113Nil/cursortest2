package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;

/* renamed from: com.google.android.gms.internal.ads.jJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3412jJ extends KJ {

    /* renamed from: b, reason: collision with root package name */
    public final C3306hJ f32098b;

    /* renamed from: c, reason: collision with root package name */
    public final ECPoint f32099c;

    /* renamed from: d, reason: collision with root package name */
    public final C3791qK f32100d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f32101e;

    public C3412jJ(C3306hJ c3306hJ, ECPoint eCPoint, C3791qK c3791qK, Integer num) {
        this.f32098b = c3306hJ;
        this.f32099c = eCPoint;
        this.f32100d = c3791qK;
        this.f32101e = num;
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final /* synthetic */ AbstractC4000uE b() {
        return this.f32098b;
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final Integer g() {
        return this.f32101e;
    }

    @Override // com.google.android.gms.internal.ads.KJ
    public final C3791qK j() {
        return this.f32100d;
    }
}

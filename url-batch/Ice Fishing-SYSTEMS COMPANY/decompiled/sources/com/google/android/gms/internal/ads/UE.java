package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class UE extends AbstractC4270zE {

    /* renamed from: b, reason: collision with root package name */
    public final WE f27948b;

    /* renamed from: c, reason: collision with root package name */
    public final Mu f27949c;

    /* renamed from: d, reason: collision with root package name */
    public final C3791qK f27950d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f27951e;

    public UE(WE we, Mu mu, C3791qK c3791qK, Integer num) {
        this.f27948b = we;
        this.f27949c = mu;
        this.f27950d = c3791qK;
        this.f27951e = num;
    }

    public static UE k(HE he, Mu mu, Integer num) {
        C3791qK b9;
        HE he2 = HE.f25333h;
        String str = he.f25338b;
        if (he != he2 && num == null) {
            throw new GeneralSecurityException(D.y.o(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (he == he2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        C3791qK c3791qK = (C3791qK) mu.f26395u;
        if (c3791qK.f33687a.length != 32) {
            int length = c3791qK.f33687a.length;
            throw new GeneralSecurityException(D.y.j(length, "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 74)));
        }
        WE we = new WE(he);
        if (he == he2) {
            b9 = AbstractC3571mG.f32676a;
        } else if (he == HE.f25332g) {
            b9 = AbstractC3571mG.a(num.intValue());
        } else {
            if (he != HE.f25331f) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            b9 = AbstractC3571mG.b(num.intValue());
        }
        return new UE(we, mu, b9, num);
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final /* synthetic */ AbstractC4000uE b() {
        return this.f27948b;
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final Integer g() {
        return this.f27951e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4270zE
    public final C3791qK j() {
        return this.f27950d;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.cH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3031cH extends XC {

    /* renamed from: b, reason: collision with root package name */
    public final C3086dH f29663b;

    /* renamed from: c, reason: collision with root package name */
    public final Mu f29664c;

    public C3031cH(C3086dH c3086dH, Mu mu) {
        this.f29663b = c3086dH;
        this.f29664c = mu;
    }

    public static C3031cH j(C3086dH c3086dH, Mu mu) {
        if (c3086dH.f29995a == ((C3791qK) mu.f26395u).f33687a.length) {
            return new C3031cH(c3086dH, mu);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final /* synthetic */ AbstractC4000uE b() {
        return this.f29663b;
    }

    @Override // com.google.android.gms.internal.ads.XC
    public final Integer g() {
        return null;
    }
}

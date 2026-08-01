package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.Zc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0995Zc implements C2M {
    public final SharedPreferences A00;

    public C0995Zc(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.X.C2M
    public final C0996Zd A5N() {
        return new C0996Zd(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.X.C2M
    public final long A7C(String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.facebook.ads.redexgen.X.C2M
    public final String A7x(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}

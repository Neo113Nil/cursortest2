package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.gf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1360gf implements O8 {
    public final SharedPreferences A00;

    public C1360gf(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.instagram.common.viewpoint.core.O8
    public final C1361gg A6A() {
        return new C1361gg(this.A00.edit());
    }

    @Override // com.instagram.common.viewpoint.core.O8
    public final long A8I(String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.instagram.common.viewpoint.core.O8
    public final String A96(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}

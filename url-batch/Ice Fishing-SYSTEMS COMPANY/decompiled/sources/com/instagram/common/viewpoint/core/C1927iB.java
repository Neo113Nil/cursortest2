package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.iB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1927iB implements InterfaceC1135Om {
    public final SharedPreferences A00;

    public C1927iB(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1135Om
    public final C1928iC A6I() {
        return new C1928iC(this.A00.edit());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1135Om
    public final long A8Q(String str, long j9) {
        return this.A00.getLong(str, j9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1135Om
    public final String A9E(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}

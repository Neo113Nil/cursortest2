package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
final class j10 implements q30 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k10 f6928a;

    j10(k10 k10Var) {
        this.f6928a = k10Var;
    }

    @Override // com.google.android.gms.internal.ads.q30
    public final Double a(String str, double d7) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.f6928a.f7325e;
        return Double.valueOf(sharedPreferences.getFloat(str, (float) d7));
    }

    @Override // com.google.android.gms.internal.ads.q30
    public final String b(String str, String str2) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.f6928a.f7325e;
        return sharedPreferences.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.q30
    public final Long c(String str, long j7) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.f6928a.f7325e;
            return Long.valueOf(sharedPreferences2.getLong(str, j7));
        } catch (ClassCastException unused) {
            sharedPreferences = this.f6928a.f7325e;
            return Long.valueOf(sharedPreferences.getInt(str, (int) j7));
        }
    }

    @Override // com.google.android.gms.internal.ads.q30
    public final Boolean d(String str, boolean z6) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.f6928a.f7325e;
        return Boolean.valueOf(sharedPreferences.getBoolean(str, z6));
    }
}

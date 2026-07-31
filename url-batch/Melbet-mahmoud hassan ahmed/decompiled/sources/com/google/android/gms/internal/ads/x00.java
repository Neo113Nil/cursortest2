package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class x00 extends e10<Boolean> {
    x00(int i7, String str, Boolean bool) {
        super(i7, str, bool, null);
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ Boolean a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(m(), l().booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ Boolean b(Bundle bundle) {
        String m7 = m();
        if (!bundle.containsKey(m7.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m7) : new String("com.google.android.gms.ads.flag."))) {
            return l();
        }
        String m8 = m();
        return Boolean.valueOf(bundle.getBoolean(m8.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m8) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ Boolean c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(m(), l().booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Boolean bool) {
        editor.putBoolean(m(), bool.booleanValue());
    }
}

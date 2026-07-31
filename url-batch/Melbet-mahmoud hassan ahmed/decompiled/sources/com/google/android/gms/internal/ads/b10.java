package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class b10 extends e10<String> {
    b10(int i7, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ String a(JSONObject jSONObject) {
        return jSONObject.optString(m(), l());
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ String b(Bundle bundle) {
        String m7 = m();
        if (!bundle.containsKey(m7.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m7) : new String("com.google.android.gms.ads.flag."))) {
            return l();
        }
        String m8 = m();
        return bundle.getString(m8.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m8) : new String("com.google.android.gms.ads.flag."));
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ String c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(m(), l());
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, String str) {
        editor.putString(m(), str);
    }
}

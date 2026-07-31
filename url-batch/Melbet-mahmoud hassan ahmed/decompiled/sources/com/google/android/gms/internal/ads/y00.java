package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class y00 extends e10<Integer> {
    y00(int i7, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ Integer a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(m(), l().intValue()));
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ Integer b(Bundle bundle) {
        String m7 = m();
        if (!bundle.containsKey(m7.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m7) : new String("com.google.android.gms.ads.flag."))) {
            return l();
        }
        String m8 = m();
        return Integer.valueOf(bundle.getInt(m8.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m8) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ Integer c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(m(), l().intValue()));
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Integer num) {
        editor.putInt(m(), num.intValue());
    }
}

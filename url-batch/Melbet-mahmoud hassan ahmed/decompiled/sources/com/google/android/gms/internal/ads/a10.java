package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class a10 extends e10<Float> {
    a10(int i7, String str, Float f7) {
        super(1, str, f7, null);
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ Float a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(m(), l().floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ Float b(Bundle bundle) {
        String m7 = m();
        if (!bundle.containsKey(m7.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m7) : new String("com.google.android.gms.ads.flag."))) {
            return l();
        }
        String m8 = m();
        return Float.valueOf(bundle.getFloat(m8.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m8) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ Float c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(m(), l().floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Float f7) {
        editor.putFloat(m(), f7.floatValue());
    }
}

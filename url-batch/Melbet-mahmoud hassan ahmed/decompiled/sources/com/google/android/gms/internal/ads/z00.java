package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class z00 extends e10<Long> {
    z00(int i7, String str, Long l7) {
        super(1, str, l7, null);
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ Long a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(m(), l().longValue()));
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ Long b(Bundle bundle) {
        String m7 = m();
        if (!bundle.containsKey(m7.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m7) : new String("com.google.android.gms.ads.flag."))) {
            return l();
        }
        String m8 = m();
        return Long.valueOf(bundle.getLong(m8.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m8) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ Long c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(m(), l().longValue()));
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Long l7) {
        editor.putLong(m(), l7.longValue());
    }
}

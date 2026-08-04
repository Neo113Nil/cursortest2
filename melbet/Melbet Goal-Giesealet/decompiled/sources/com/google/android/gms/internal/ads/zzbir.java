package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbir implements zzbjl {
    zzbir() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(zzcekVar.getContext()).edit();
            for (int i = 0; i < jSONArray.length(); i++) {
                edit.remove(jSONArray.getString(i));
            }
            edit.apply();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "GMSG clear local storage keys handler");
        }
    }
}

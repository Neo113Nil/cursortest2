package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbzx {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzbyu zzd;

    zzbzx(Context context, zzbyu zzbyuVar) {
        this.zzc = context;
        this.zzd = zzbyuVar;
    }

    final /* synthetic */ void zzb(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zze();
        }
    }

    final synchronized void zzc(String str) {
        SharedPreferences defaultSharedPreferences;
        if (this.zza.containsKey(str)) {
            return;
        }
        if (str != "__default__" && (str == null || !str.equals("__default__"))) {
            defaultSharedPreferences = this.zzc.getSharedPreferences(str, 0);
            zzbzw zzbzwVar = new zzbzw(this, str);
            this.zza.put(str, zzbzwVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbzwVar);
        }
        defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
        zzbzw zzbzwVar2 = new zzbzw(this, str);
        this.zza.put(str, zzbzwVar2);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbzwVar2);
    }

    final synchronized void zzd(zzbzv zzbzvVar) {
        this.zzb.add(zzbzvVar);
    }
}

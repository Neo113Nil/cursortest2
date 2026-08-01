package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbzw implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbzx zza;
    private final String zzb;

    public zzbzw(zzbzx zzbzxVar, String str) {
        this.zza = zzbzxVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzbzv> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzbzv zzbzvVar : list) {
                zzbzvVar.zza.zzb(zzbzvVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}

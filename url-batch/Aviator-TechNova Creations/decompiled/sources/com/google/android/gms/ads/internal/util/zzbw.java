package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbw implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbz zza;
    private final String zzb;

    public zzbw(zzbz zzbzVar, String str) {
        Objects.requireNonNull(zzbzVar);
        this.zza = zzbzVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzbz zzbzVar = this.zza;
        synchronized (zzbzVar) {
            Iterator it = zzbzVar.zzd().iterator();
            while (it.hasNext()) {
                ((zzbx) it.next()).zza(sharedPreferences, this.zzb, str);
            }
        }
    }
}

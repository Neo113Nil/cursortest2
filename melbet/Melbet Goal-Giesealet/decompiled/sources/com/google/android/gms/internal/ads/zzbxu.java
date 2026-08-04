package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbxu implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbxx zza;
    private final String zzb;

    public zzbxu(zzbxx zzbxxVar, String str) {
        Objects.requireNonNull(zzbxxVar);
        this.zza = zzbxxVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzbxx zzbxxVar = this.zza;
        synchronized (zzbxxVar) {
            Iterator it = zzbxxVar.zzd().iterator();
            while (it.hasNext()) {
                ((zzbxv) it.next()).zza(sharedPreferences, this.zzb, str);
            }
        }
    }
}

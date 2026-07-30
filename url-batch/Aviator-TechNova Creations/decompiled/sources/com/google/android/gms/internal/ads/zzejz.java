package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzejz {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfir zzc;
    private final zzcjl zzd;
    private final zzdxz zze;
    private zzfsv zzf;

    zzejz(Context context, VersionInfoParcel versionInfoParcel, zzfir zzfirVar, zzcjl zzcjlVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfirVar;
        this.zzd = zzcjlVar;
        this.zze = zzdxzVar;
    }

    public final synchronized boolean zza(boolean z) {
        zzcjl zzcjlVar;
        zzfir zzfirVar = this.zzc;
        if (zzfirVar.zzT) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgj)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && (zzcjlVar = this.zzd) != null) {
                    if (this.zzf != null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to initialize omid.");
                        return false;
                    }
                    if (zzfirVar.zzV.zzb()) {
                        zzfsv zzi = com.google.android.gms.ads.internal.zzt.zzu().zzi(this.zzb, zzcjlVar.zzD(), true);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgn)).booleanValue()) {
                            zzdxz zzdxzVar = this.zze;
                            String str = zzi != null ? AppEventsConstants.EVENT_PARAM_VALUE_YES : AppEventsConstants.EVENT_PARAM_VALUE_NO;
                            zzdxy zza = zzdxzVar.zza();
                            zza.zzc("omid_js_session_success", str);
                            zza.zzd();
                        }
                        if (zzi == null) {
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to create javascript session service.");
                            return false;
                        }
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Created omid javascript session service.");
                        this.zzf = zzi;
                        zzcjlVar.zzal(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized boolean zzb() {
        return this.zzf != null;
    }

    public final synchronized void zzc() {
        zzcjl zzcjlVar;
        zzfsv zzfsvVar = this.zzf;
        if (zzfsvVar == null || (zzcjlVar = this.zzd) == null) {
            return;
        }
        Iterator it = zzcjlVar.zzF().iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzk(zzfsvVar, (View) it.next());
        }
        zzcjlVar.zze("onSdkLoaded", zzgui.zza());
    }

    public final synchronized void zzd() {
        zzcjl zzcjlVar;
        if (this.zzf == null || (zzcjlVar = this.zzd) == null) {
            return;
        }
        zzcjlVar.zze("onSdkImpression", zzgui.zza());
    }

    public final synchronized void zze(zzfsu zzfsuVar) {
        zzcjl zzcjlVar;
        zzfsv zzfsvVar = this.zzf;
        if (zzfsvVar == null || (zzcjlVar = this.zzd) == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzj(zzfsvVar, zzfsuVar);
        this.zzf = null;
        zzcjlVar.zzal(null);
    }

    public final synchronized void zzf(View view) {
        zzfsv zzfsvVar = this.zzf;
        if (zzfsvVar != null) {
            com.google.android.gms.ads.internal.zzt.zzu().zzk(zzfsvVar, view);
        }
    }
}

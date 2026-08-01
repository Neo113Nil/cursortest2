package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeqg implements zzeuy {
    private static final Object zzb = new Object();
    final Context zza;
    private final String zzc;
    private final String zzd;
    private final zzcvl zze;
    private final zzffx zzf;
    private final zzfeq zzg;
    private final com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzo().zzi();
    private final zzdtk zzi;
    private final zzcvy zzj;

    public zzeqg(Context context, String str, String str2, zzcvl zzcvlVar, zzffx zzffxVar, zzfeq zzfeqVar, zzdtk zzdtkVar, zzcvy zzcvyVar) {
        this.zza = context;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzcvlVar;
        this.zzf = zzffxVar;
        this.zzg = zzfeqVar;
        this.zzi = zzdtkVar;
        this.zzj = zzcvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhy)).booleanValue()) {
            zzdtk zzdtkVar = this.zzi;
            zzdtkVar.zza().put("seq_num", this.zzc);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfz)).booleanValue()) {
            this.zze.zzk(this.zzg.zzd);
            bundle.putAll(this.zzf.zzb());
        }
        return zzgbb.zzh(new zzeux() { // from class: com.google.android.gms.internal.ads.zzeqf
            @Override // com.google.android.gms.internal.ads.zzeux
            public final void zzj(Object obj) {
                zzeqg.this.zzc(bundle, (Bundle) obj);
            }
        });
    }

    final /* synthetic */ void zzc(Bundle bundle, Bundle bundle2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfz)).booleanValue()) {
            bundle2.putBundle("quality_signals", bundle);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfy)).booleanValue()) {
                synchronized (zzb) {
                    this.zze.zzk(this.zzg.zzd);
                    bundle2.putBundle("quality_signals", this.zzf.zzb());
                }
            } else {
                this.zze.zzk(this.zzg.zzd);
                bundle2.putBundle("quality_signals", this.zzf.zzb());
            }
        }
        bundle2.putString("seq_num", this.zzc);
        if (!this.zzh.zzQ()) {
            bundle2.putString("session_id", this.zzd);
        }
        bundle2.putBoolean("client_purpose_one", !this.zzh.zzQ());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfA)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzp();
                bundle2.putString("_app_id", com.google.android.gms.ads.internal.util.zzt.zzp(this.zza));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "AppStatsSignal_AppId");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzfB)).booleanValue() && this.zzg.zzf != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("dload", this.zzj.zzb(this.zzg.zzf));
            bundle3.putInt("pcc", this.zzj.zza(this.zzg.zzf));
            bundle2.putBundle("ad_unit_quality_signals", bundle3);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzju)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzo().zza() <= 0) {
            return;
        }
        bundle2.putInt("nrwv", com.google.android.gms.ads.internal.zzt.zzo().zza());
    }
}

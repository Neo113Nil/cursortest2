package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcrs extends zzcrp {
    private final Context zzc;
    private final View zzd;
    private final zzcgv zze;
    private final zzfdv zzf;
    private final zzctp zzg;
    private final zzdkv zzh;
    private final zzdgg zzi;
    private final zzhdj zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzq zzl;

    zzcrs(zzctq zzctqVar, Context context, zzfdv zzfdvVar, View view, zzcgv zzcgvVar, zzctp zzctpVar, zzdkv zzdkvVar, zzdgg zzdggVar, zzhdj zzhdjVar, Executor executor) {
        super(zzctqVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcgvVar;
        this.zzf = zzfdvVar;
        this.zzg = zzctpVar;
        this.zzh = zzdkvVar;
        this.zzi = zzdggVar;
        this.zzj = zzhdjVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzi(zzcrs zzcrsVar) {
        zzdkv zzdkvVar = zzcrsVar.zzh;
        if (zzdkvVar.zze() == null) {
            return;
        }
        try {
            zzdkvVar.zze().zze((com.google.android.gms.ads.internal.client.zzbu) zzcrsVar.zzj.zzb(), ObjectWrapper.wrap(zzcrsVar.zzc));
        } catch (RemoteException e) {
            zzcbn.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrp
    public final int zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhH)).booleanValue() && this.zzb.zzah) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhI)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcrp
    public final View zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcrp
    public final com.google.android.gms.ads.internal.client.zzdq zzd() {
        try {
            return this.zzg.zza();
        } catch (zzfev unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrp
    public final zzfdv zze() {
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzl;
        if (zzqVar != null) {
            return zzfeu.zzb(zzqVar);
        }
        zzfdu zzfduVar = this.zzb;
        if (zzfduVar.zzad) {
            for (String str : zzfduVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfdv(view.getWidth(), view.getHeight(), false);
        }
        return (zzfdv) this.zzb.zzs.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcrp
    public final zzfdv zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcrp
    public final void zzg() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcrp
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzcgv zzcgvVar;
        if (viewGroup == null || (zzcgvVar = this.zze) == null) {
            return;
        }
        zzcgvVar.zzag(zzcik.zzc(zzqVar));
        viewGroup.setMinimumHeight(zzqVar.zzc);
        viewGroup.setMinimumWidth(zzqVar.zzf);
        this.zzl = zzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzctr
    public final void zzj() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrr
            @Override // java.lang.Runnable
            public final void run() {
                zzcrs.zzi(zzcrs.this);
            }
        });
        super.zzj();
    }
}

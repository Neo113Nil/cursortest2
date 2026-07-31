package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes3.dex */
final class zzlh implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdg zzb;
    private final /* synthetic */ zzkx zzc;

    zzlh(zzkx zzkxVar, zzo zzoVar, com.google.android.gms.internal.measurement.zzdg zzdgVar) {
        this.zza = zzoVar;
        this.zzb = zzdgVar;
        this.zzc = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        try {
            if (!this.zzc.zzk().zzn().zzj()) {
                this.zzc.zzj().zzv().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzm().zzc((String) null);
                this.zzc.zzk().zze.zza(null);
                return;
            }
            zzflVar = this.zzc.zzb;
            if (zzflVar == null) {
                this.zzc.zzj().zzg().zza("Failed to get app instance id");
                return;
            }
            Preconditions.checkNotNull(this.zza);
            String zzb = zzflVar.zzb(this.zza);
            if (zzb != null) {
                this.zzc.zzm().zzc(zzb);
                this.zzc.zzk().zze.zza(zzb);
            }
            this.zzc.zzaq();
            this.zzc.zzq().zza(this.zzb, zzb);
        } catch (RemoteException e) {
            this.zzc.zzj().zzg().zza("Failed to get app instance id", e);
        } finally {
            this.zzc.zzq().zza(this.zzb, (String) null);
        }
    }
}

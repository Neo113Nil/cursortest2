package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes3.dex */
final class zzlu implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzo zzc;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzdg zzd;
    private final /* synthetic */ zzkx zze;

    zzlu(zzkx zzkxVar, String str, String str2, zzo zzoVar, com.google.android.gms.internal.measurement.zzdg zzdgVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzoVar;
        this.zzd = zzdgVar;
        this.zze = zzkxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfl zzflVar;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            zzflVar = this.zze.zzb;
            if (zzflVar == null) {
                this.zze.zzj().zzg().zza("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                return;
            }
            Preconditions.checkNotNull(this.zzc);
            ArrayList<Bundle> zzb = zznp.zzb(zzflVar.zza(this.zza, this.zzb, this.zzc));
            this.zze.zzaq();
            this.zze.zzq().zza(this.zzd, zzb);
        } catch (RemoteException e) {
            this.zze.zzj().zzg().zza("Failed to get conditional properties; remote exception", this.zza, this.zzb, e);
        } finally {
            this.zze.zzq().zza(this.zzd, arrayList);
        }
    }
}

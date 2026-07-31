package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* loaded from: classes.dex */
final class zzmu implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzr zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy zze;
    final /* synthetic */ zzny zzf;

    zzmu(zzny zznyVar, String str, String str2, zzr zzrVar, boolean z4, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = z4;
        this.zze = zzcyVar;
        this.zzf = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e4;
        zzgl zzglVar;
        Bundle bundle2 = new Bundle();
        try {
            zzny zznyVar = this.zzf;
            zzglVar = zznyVar.zzb;
            if (zzglVar == null) {
                zzio zzioVar = zznyVar.zzu;
                zzioVar.zzaW().zze().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                zzioVar.zzw().zzV(this.zze, bundle2);
                return;
            }
            zzr zzrVar = this.zzc;
            Preconditions.checkNotNull(zzrVar);
            List<zzqb> zzk = zzglVar.zzk(this.zza, this.zzb, this.zzd, zzrVar);
            int i4 = zzqf.zza;
            bundle = new Bundle();
            if (zzk != null) {
                for (zzqb zzqbVar : zzk) {
                    String str = zzqbVar.zze;
                    if (str != null) {
                        bundle.putString(zzqbVar.zzb, str);
                    } else {
                        Long l4 = zzqbVar.zzd;
                        if (l4 != null) {
                            bundle.putLong(zzqbVar.zzb, l4.longValue());
                        } else {
                            Double d4 = zzqbVar.zzg;
                            if (d4 != null) {
                                bundle.putDouble(zzqbVar.zzb, d4.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    zznyVar.zzag();
                    zzio zzioVar2 = zznyVar.zzu;
                    zzioVar2.zzw().zzV(this.zze, bundle);
                } catch (RemoteException e5) {
                    e4 = e5;
                    this.zzf.zzu.zzaW().zze().zzc("Failed to get user properties; remote exception", this.zza, e4);
                    zzny zznyVar2 = this.zzf;
                    zznyVar2.zzu.zzw().zzV(this.zze, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                zzny zznyVar3 = this.zzf;
                zznyVar3.zzu.zzw().zzV(this.zze, bundle2);
                throw th;
            }
        } catch (RemoteException e6) {
            bundle = bundle2;
            e4 = e6;
        } catch (Throwable th2) {
            th = th2;
            zzny zznyVar32 = this.zzf;
            zznyVar32.zzu.zzw().zzV(this.zze, bundle2);
            throw th;
        }
    }
}

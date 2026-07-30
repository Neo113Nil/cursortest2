package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* loaded from: classes3.dex */
final class zziz implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzq zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zze;
    final /* synthetic */ zzjy zzf;

    zziz(zzjy zzjyVar, String str, String str2, zzq zzqVar, boolean z7, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzf = zzjyVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = z7;
        this.zze = zzcfVar;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x009b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:156), block:B:44:0x009a */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e8;
        Bundle bundle2;
        zzek zzekVar;
        Bundle bundle3 = new Bundle();
        try {
            try {
                zzjy zzjyVar = this.zzf;
                zzekVar = zzjyVar.zzb;
                if (zzekVar == null) {
                    zzjyVar.zzt.zzaA().zzd().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                    this.zzf.zzt.zzv().zzS(this.zze, bundle3);
                    return;
                }
                Preconditions.checkNotNull(this.zzc);
                List<zzlj> zzh = zzekVar.zzh(this.zza, this.zzb, this.zzd, this.zzc);
                bundle = new Bundle();
                if (zzh != null) {
                    for (zzlj zzljVar : zzh) {
                        String str = zzljVar.zze;
                        if (str != null) {
                            bundle.putString(zzljVar.zzb, str);
                        } else {
                            Long l8 = zzljVar.zzd;
                            if (l8 != null) {
                                bundle.putLong(zzljVar.zzb, l8.longValue());
                            } else {
                                Double d8 = zzljVar.zzg;
                                if (d8 != null) {
                                    bundle.putDouble(zzljVar.zzb, d8.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    this.zzf.zzQ();
                    this.zzf.zzt.zzv().zzS(this.zze, bundle);
                } catch (RemoteException e9) {
                    e8 = e9;
                    this.zzf.zzt.zzaA().zzd().zzc("Failed to get user properties; remote exception", this.zza, e8);
                    this.zzf.zzt.zzv().zzS(this.zze, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle3 = bundle2;
                this.zzf.zzt.zzv().zzS(this.zze, bundle3);
                throw th;
            }
        } catch (RemoteException e10) {
            bundle = bundle3;
            e8 = e10;
        } catch (Throwable th2) {
            th = th2;
            this.zzf.zzt.zzv().zzS(this.zze, bundle3);
            throw th;
        }
    }
}

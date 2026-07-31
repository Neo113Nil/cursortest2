package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.common.util.concurrent.FutureCallback;

/* loaded from: classes.dex */
final class zzkt implements FutureCallback {
    final /* synthetic */ zzov zza;
    final /* synthetic */ zzlw zzb;

    zzkt(zzlw zzlwVar, zzov zzovVar) {
        this.zza = zzovVar;
        this.zzb = zzlwVar;
    }

    private final void zza() {
        zzio zzioVar = this.zzb.zzu;
        SparseArray zze = zzioVar.zzm().zze();
        zzov zzovVar = this.zza;
        zze.put(zzovVar.zzc, Long.valueOf(zzovVar.zzb));
        zzht zzm = zzioVar.zzm();
        int[] iArr = new int[zze.size()];
        long[] jArr = new long[zze.size()];
        for (int i4 = 0; i4 < zze.size(); i4++) {
            iArr[i4] = zze.keyAt(i4);
            jArr[i4] = ((Long) zze.valueAt(i4)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        zzm.zzi.zzb(bundle);
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(Throwable th) {
        int i4;
        int i5;
        int i6;
        int i7;
        zzlw zzlwVar = this.zzb;
        zzlwVar.zzg();
        zzlwVar.zzi = false;
        zzio zzioVar = zzlwVar.zzu;
        int zzaq = (zzioVar.zzf().zzx(null, zzgi.zzaZ) ? zzlw.zzaq(zzlwVar, th) : 2) - 1;
        if (zzaq == 0) {
            zzioVar.zzaW().zzk().zzc("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", zzhe.zzn(zzlwVar.zzu.zzh().zzm()), zzhe.zzn(th.toString()));
            zzlwVar.zzj = 1;
            zzlwVar.zzy().add(this.zza);
            return;
        }
        if (zzaq != 1) {
            zzioVar.zzaW().zze().zzc("registerTriggerAsync failed. Dropping URI. App ID, Throwable", zzhe.zzn(zzlwVar.zzu.zzh().zzm()), th);
            zza();
            zzlwVar.zzj = 1;
            zzlwVar.zzU();
            return;
        }
        zzlwVar.zzy().add(this.zza);
        i4 = zzlwVar.zzj;
        if (i4 > ((Integer) zzgi.zzav.zza(null)).intValue()) {
            zzlwVar.zzj = 1;
            zzioVar.zzaW().zzk().zzc("registerTriggerAsync failed. May try later. App ID, throwable", zzhe.zzn(zzlwVar.zzu.zzh().zzm()), zzhe.zzn(th.toString()));
            return;
        }
        zzhc zzk = zzioVar.zzaW().zzk();
        Object zzn = zzhe.zzn(zzlwVar.zzu.zzh().zzm());
        i5 = zzlwVar.zzj;
        zzk.zzd("registerTriggerAsync failed. App ID, delay in seconds, throwable", zzn, zzhe.zzn(String.valueOf(i5)), zzhe.zzn(th.toString()));
        i6 = zzlwVar.zzj;
        zzlw.zzF(zzlwVar, i6);
        i7 = zzlwVar.zzj;
        zzlwVar.zzj = i7 + i7;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(Object obj) {
        zzlw zzlwVar = this.zzb;
        zzlwVar.zzg();
        zza();
        zzlwVar.zzi = false;
        zzlwVar.zzj = 1;
        zzlwVar.zzu.zzaW().zzd().zzb("Successfully registered trigger URI", this.zza.zza);
        zzlwVar.zzU();
    }
}

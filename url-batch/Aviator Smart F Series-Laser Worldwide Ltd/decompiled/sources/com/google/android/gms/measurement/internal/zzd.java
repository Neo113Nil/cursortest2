package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzd extends zze {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzd(zzge zzgeVar) {
        super(zzgeVar);
        this.zzb = new ArrayMap();
        this.zza = new ArrayMap();
    }

    static /* synthetic */ void zza(zzd zzdVar, String str, long j8) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.zzb.isEmpty()) {
            zzdVar.zzc = j8;
        }
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzdVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.zzb.size() >= 100) {
            zzdVar.zzt.zzaA().zzk().zza("Too many ads visible");
        } else {
            zzdVar.zzb.put(str, 1);
            zzdVar.zza.put(str, Long.valueOf(j8));
        }
    }

    static /* synthetic */ void zzb(zzd zzdVar, String str, long j8) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num == null) {
            zzdVar.zzt.zzaA().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zziq zzj = zzdVar.zzt.zzs().zzj(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            zzdVar.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzdVar.zzb.remove(str);
        Long l8 = (Long) zzdVar.zza.get(str);
        if (l8 == null) {
            zzdVar.zzt.zzaA().zzd().zza("First ad unit exposure time was never set");
        } else {
            long longValue = j8 - l8.longValue();
            zzdVar.zza.remove(str);
            zzdVar.zzi(str, longValue, zzj);
        }
        if (zzdVar.zzb.isEmpty()) {
            long j9 = zzdVar.zzc;
            if (j9 == 0) {
                zzdVar.zzt.zzaA().zzd().zza("First ad exposure time was never set");
            } else {
                zzdVar.zzh(j8 - j9, zzj);
                zzdVar.zzc = 0L;
            }
        }
    }

    @WorkerThread
    private final void zzh(long j8, zziq zziqVar) {
        if (zziqVar == null) {
            this.zzt.zzaA().zzj().zza("Not logging ad exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            this.zzt.zzaA().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j8);
        zzlo.zzK(zziqVar, bundle, true);
        this.zzt.zzq().zzG("am", "_xa", bundle);
    }

    @WorkerThread
    private final void zzi(String str, long j8, zziq zziqVar) {
        if (zziqVar == null) {
            this.zzt.zzaA().zzj().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            this.zzt.zzaA().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j8);
        zzlo.zzK(zziqVar, bundle, true);
        this.zzt.zzq().zzG("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzj(long j8) {
        Iterator it = this.zza.keySet().iterator();
        while (it.hasNext()) {
            this.zza.put((String) it.next(), Long.valueOf(j8));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j8;
    }

    public final void zzd(String str, long j8) {
        if (str == null || str.length() == 0) {
            this.zzt.zzaA().zzd().zza("Ad unit id must be a non-empty string");
        } else {
            this.zzt.zzaB().zzp(new zza(this, str, j8));
        }
    }

    public final void zze(String str, long j8) {
        if (str == null || str.length() == 0) {
            this.zzt.zzaA().zzd().zza("Ad unit id must be a non-empty string");
        } else {
            this.zzt.zzaB().zzp(new zzb(this, str, j8));
        }
    }

    @WorkerThread
    public final void zzf(long j8) {
        zziq zzj = this.zzt.zzs().zzj(false);
        for (String str : this.zza.keySet()) {
            zzi(str, j8 - ((Long) this.zza.get(str)).longValue(), zzj);
        }
        if (!this.zza.isEmpty()) {
            zzh(j8 - this.zzc, zzj);
        }
        zzj(j8);
    }
}

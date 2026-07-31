package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzd extends zzf {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzd(zzio zzioVar) {
        super(zzioVar);
        this.zzb = new androidx.collection.a();
        this.zza = new androidx.collection.a();
    }

    static /* synthetic */ void zza(zzd zzdVar, String str, long j4) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Map map = zzdVar.zzb;
        if (map.isEmpty()) {
            zzdVar.zzc = j4;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            zzdVar.zzu.zzaW().zzk().zza("Too many ads visible");
        } else {
            map.put(str, 1);
            zzdVar.zza.put(str, Long.valueOf(j4));
        }
    }

    static /* synthetic */ void zzb(zzd zzdVar, String str, long j4) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Map map = zzdVar.zzb;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            zzdVar.zzu.zzaW().zze().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzmh zzj = zzdVar.zzu.zzt().zzj(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            map.put(str, Integer.valueOf(intValue));
            return;
        }
        map.remove(str);
        Map map2 = zzdVar.zza;
        Long l4 = (Long) map2.get(str);
        if (l4 == null) {
            zzdVar.zzu.zzaW().zze().zza("First ad unit exposure time was never set");
        } else {
            long longValue = j4 - l4.longValue();
            map2.remove(str);
            zzdVar.zzi(str, longValue, zzj);
        }
        if (map.isEmpty()) {
            long j5 = zzdVar.zzc;
            if (j5 == 0) {
                zzdVar.zzu.zzaW().zze().zza("First ad exposure time was never set");
            } else {
                zzdVar.zzh(j4 - j5, zzj);
                zzdVar.zzc = 0L;
            }
        }
    }

    private final void zzh(long j4, zzmh zzmhVar) {
        if (zzmhVar == null) {
            this.zzu.zzaW().zzj().zza("Not logging ad exposure. No active activity");
            return;
        }
        if (j4 < 1000) {
            this.zzu.zzaW().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j4));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j4);
        zzqf.zzN(zzmhVar, bundle, true);
        this.zzu.zzq().zzR("am", "_xa", bundle);
    }

    private final void zzi(String str, long j4, zzmh zzmhVar) {
        if (zzmhVar == null) {
            this.zzu.zzaW().zzj().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j4 < 1000) {
            this.zzu.zzaW().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j4));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j4);
        zzqf.zzN(zzmhVar, bundle, true);
        this.zzu.zzq().zzR("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(long j4) {
        Map map = this.zza;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j4));
        }
        if (map.isEmpty()) {
            return;
        }
        this.zzc = j4;
    }

    public final void zzd(String str, long j4) {
        if (str == null || str.length() == 0) {
            this.zzu.zzaW().zze().zza("Ad unit id must be a non-empty string");
        } else {
            this.zzu.zzaX().zzq(new zza(this, str, j4));
        }
    }

    public final void zze(String str, long j4) {
        if (str == null || str.length() == 0) {
            this.zzu.zzaW().zze().zza("Ad unit id must be a non-empty string");
        } else {
            this.zzu.zzaX().zzq(new zzb(this, str, j4));
        }
    }

    public final void zzf(long j4) {
        zzmh zzj = this.zzu.zzt().zzj(false);
        Map map = this.zza;
        for (String str : map.keySet()) {
            zzi(str, j4 - ((Long) map.get(str)).longValue(), zzj);
        }
        if (!map.isEmpty()) {
            zzh(j4 - this.zzc, zzj);
        }
        zzj(j4);
    }
}

package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzic extends zzda {
    private final int zzc;
    private final zzwd zzd;

    public zzic(boolean z, zzwd zzwdVar) {
        this.zzd = zzwdVar;
        this.zzc = zzwdVar.zzc();
    }

    private final int zzw(int i, boolean z) {
        if (z) {
            return this.zzd.zzd(i);
        }
        if (i >= this.zzc - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z) {
        if (z) {
            return this.zzd.zze(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final int zza(Object obj) {
        int zza;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int zzp = zzp(obj2);
            if (zzp != -1 && (zza = zzu(zzp).zza(obj3)) != -1) {
                return zzs(zzp) + zza;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final zzcx zzd(int i, zzcx zzcxVar, boolean z) {
        int zzq = zzq(i);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i - zzs(zzq), zzcxVar, z);
        zzcxVar.zzd += zzt;
        if (z) {
            Object zzv = zzv(zzq);
            Object obj = zzcxVar.zzc;
            obj.getClass();
            zzcxVar.zzc = Pair.create(zzv, obj);
        }
        return zzcxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final zzcz zze(int i, zzcz zzczVar, long j) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i - zzt, zzczVar, j);
        Object zzv = zzv(zzr);
        if (!zzcz.zza.equals(zzczVar.zzc)) {
            zzv = Pair.create(zzv, zzczVar.zzc);
        }
        zzczVar.zzc = zzv;
        zzczVar.zzp += zzs;
        zzczVar.zzq += zzs;
        return zzczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final Object zzf(int i) {
        int zzq = zzq(i);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i - zzs(zzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final int zzg(boolean z) {
        if (this.zzc != 0) {
            int zza = z ? this.zzd.zza() : 0;
            while (zzu(zza).zzo()) {
                zza = zzw(zza, z);
                if (zza == -1) {
                }
            }
            return zzt(zza) + zzu(zza).zzg(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final int zzh(boolean z) {
        int i = this.zzc;
        if (i != 0) {
            int zzb = z ? this.zzd.zzb() : i - 1;
            while (zzu(zzb).zzo()) {
                zzb = zzx(zzb, z);
                if (zzb == -1) {
                }
            }
            return zzt(zzb) + zzu(zzb).zzh(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final int zzj(int i, int i2, boolean z) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzj = zzu(zzr).zzj(i - zzt, i2 == 2 ? 0 : i2, z);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z);
        while (zzw != -1 && zzu(zzw).zzo()) {
            zzw = zzw(zzw, z);
        }
        if (zzw != -1) {
            return zzt(zzw) + zzu(zzw).zzg(z);
        }
        if (i2 == 2) {
            return zzg(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final int zzk(int i, int i2, boolean z) {
        int zzr = zzr(i);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i - zzt, 0, false);
        if (zzk != -1) {
            return zzt + zzk;
        }
        int zzx = zzx(zzr, false);
        while (zzx != -1 && zzu(zzx).zzo()) {
            zzx = zzx(zzx, false);
        }
        if (zzx != -1) {
            return zzt(zzx) + zzu(zzx).zzh(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzda
    public final zzcx zzn(Object obj, zzcx zzcxVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzcxVar);
        zzcxVar.zzd += zzt;
        zzcxVar.zzc = obj;
        return zzcxVar;
    }

    protected abstract int zzp(Object obj);

    protected abstract int zzq(int i);

    protected abstract int zzr(int i);

    protected abstract int zzs(int i);

    protected abstract int zzt(int i);

    protected abstract zzda zzu(int i);

    protected abstract Object zzv(int i);
}

package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzda {
    public static final zzda zza = new zzcv();
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(2, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcu
    };

    protected zzda() {
    }

    public final boolean equals(Object obj) {
        int zzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzda)) {
            return false;
        }
        zzda zzdaVar = (zzda) obj;
        if (zzdaVar.zzc() == zzc() && zzdaVar.zzb() == zzb()) {
            zzcz zzczVar = new zzcz();
            zzcx zzcxVar = new zzcx();
            zzcz zzczVar2 = new zzcz();
            zzcx zzcxVar2 = new zzcx();
            for (int i = 0; i < zzc(); i++) {
                if (!zze(i, zzczVar, 0L).equals(zzdaVar.zze(i, zzczVar2, 0L))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < zzb(); i2++) {
                if (!zzd(i2, zzcxVar, true).equals(zzdaVar.zzd(i2, zzcxVar2, true))) {
                    return false;
                }
            }
            int zzg = zzg(true);
            if (zzg == zzdaVar.zzg(true) && (zzh = zzh(true)) == zzdaVar.zzh(true)) {
                while (zzg != zzh) {
                    int zzj = zzj(zzg, 0, true);
                    if (zzj != zzdaVar.zzj(zzg, 0, true)) {
                        return false;
                    }
                    zzg = zzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        zzcz zzczVar = new zzcz();
        zzcx zzcxVar = new zzcx();
        int zzc2 = zzc() + 217;
        int i2 = 0;
        while (true) {
            i = zzc2 * 31;
            if (i2 >= zzc()) {
                break;
            }
            zzc2 = i + zze(i2, zzczVar, 0L).hashCode();
            i2++;
        }
        int zzb2 = i + zzb();
        for (int i3 = 0; i3 < zzb(); i3++) {
            zzb2 = (zzb2 * 31) + zzd(i3, zzcxVar, true).hashCode();
        }
        int zzg = zzg(true);
        while (zzg != -1) {
            zzb2 = (zzb2 * 31) + zzg;
            zzg = zzj(zzg, 0, true);
        }
        return zzb2;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzcx zzd(int i, zzcx zzcxVar, boolean z);

    public abstract zzcz zze(int i, zzcz zzczVar, long j);

    public abstract Object zzf(int i);

    public int zzg(boolean z) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i, zzcx zzcxVar, zzcz zzczVar, int i2, boolean z) {
        int i3 = zzd(i, zzcxVar, false).zzd;
        if (zze(i3, zzczVar, 0L).zzq != i) {
            return i + 1;
        }
        int zzj = zzj(i3, i2, z);
        if (zzj == -1) {
            return -1;
        }
        return zze(zzj, zzczVar, 0L).zzp;
    }

    public int zzj(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == zzh(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == zzh(z) ? zzg(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int zzk(int i, int i2, boolean z) {
        if (i == zzg(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair zzl(zzcz zzczVar, zzcx zzcxVar, int i, long j) {
        Pair zzm = zzm(zzczVar, zzcxVar, i, j, 0L);
        zzm.getClass();
        return zzm;
    }

    public final Pair zzm(zzcz zzczVar, zzcx zzcxVar, int i, long j, long j2) {
        zzef.zza(i, 0, zzc());
        zze(i, zzczVar, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzczVar.zzn;
            j = 0;
        }
        int i2 = zzczVar.zzp;
        zzd(i2, zzcxVar, false);
        while (i2 < zzczVar.zzq) {
            long j4 = zzcxVar.zzf;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = zzd(i3, zzcxVar, false).zzf;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        zzd(i2, zzcxVar, true);
        long j6 = zzcxVar.zzf;
        long j7 = zzcxVar.zze;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0L, j);
        Object obj = zzcxVar.zzc;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzcx zzn(Object obj, zzcx zzcxVar) {
        return zzd(zza(obj), zzcxVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}

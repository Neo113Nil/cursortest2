package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzpz {
    static {
        zzmj zzi = zzml.zzi();
        zzi.zzf(-315576000000L);
        zzi.zze(-999999999);
        zzmj zzi2 = zzml.zzi();
        zzi2.zzf(315576000000L);
        zzi2.zze(999999999);
        zzmj zzi3 = zzml.zzi();
        zzi3.zzf(0L);
        zzi3.zze(0);
    }

    public static zzml zza(long j4) {
        int i4 = (int) (j4 % 1000000000);
        long j5 = j4 / 1000000000;
        if (i4 <= -1000000000 || i4 >= 1000000000) {
            j5 = zzkk.zza(j5, i4 / 1000000000);
            i4 %= 1000000000;
        }
        if (j5 > 0 && i4 < 0) {
            i4 += 1000000000;
            j5--;
        }
        if (j5 < 0 && i4 > 0) {
            i4 -= 1000000000;
            j5++;
        }
        zzmj zzi = zzml.zzi();
        zzi.zzf(j5);
        zzi.zze(i4);
        zzml zzmlVar = (zzml) zzi.zzk();
        long zzg = zzmlVar.zzg();
        int zzf = zzmlVar.zzf();
        if (zzg < -315576000000L || zzg > 315576000000L || zzf < -999999999 || zzf >= 1000000000 || ((zzg < 0 || zzf < 0) && (zzg > 0 || zzf > 0))) {
            throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(zzg), Integer.valueOf(zzf)));
        }
        return zzmlVar;
    }
}

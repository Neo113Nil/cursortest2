package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
final class zzll implements zzor {
    private final zzlk zza;

    private zzll(zzlk zzlkVar) {
        byte[] bArr = zzmk.zzb;
        this.zza = zzlkVar;
        zzlkVar.zza = this;
    }

    public static zzll zza(zzlk zzlkVar) {
        zzll zzllVar = zzlkVar.zza;
        return zzllVar != null ? zzllVar : new zzll(zzlkVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzA(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzmw)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i6 += 8;
            }
            zzlkVar.zzt(i6);
            while (i5 < list.size()) {
                zzlkVar.zzi(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        if (!z4) {
            while (i5 < zzmwVar.size()) {
                this.zza.zzh(i4, zzmwVar.zza(i5));
                i5++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmwVar.size(); i9++) {
            zzmwVar.zza(i9);
            i8 += 8;
        }
        zzlkVar2.zzt(i8);
        while (i5 < zzmwVar.size()) {
            zzlkVar2.zzi(zzmwVar.zza(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzB(int i4, int i5) {
        this.zza.zzs(i4, (i5 >> 31) ^ (i5 + i5));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzC(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzme)) {
            if (!z4) {
                while (i5 < list.size()) {
                    zzlk zzlkVar = this.zza;
                    int intValue = ((Integer) list.get(i5)).intValue();
                    zzlkVar.zzs(i4, (intValue >> 31) ^ (intValue + intValue));
                    i5++;
                }
                return;
            }
            zzlk zzlkVar2 = this.zza;
            zzlkVar2.zzr(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                int intValue2 = ((Integer) list.get(i7)).intValue();
                i6 += zzlk.zzz((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzlkVar2.zzt(i6);
            while (i5 < list.size()) {
                int intValue3 = ((Integer) list.get(i5)).intValue();
                zzlkVar2.zzt((intValue3 >> 31) ^ (intValue3 + intValue3));
                i5++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z4) {
            while (i5 < zzmeVar.size()) {
                zzlk zzlkVar3 = this.zza;
                int zze = zzmeVar.zze(i5);
                zzlkVar3.zzs(i4, (zze >> 31) ^ (zze + zze));
                i5++;
            }
            return;
        }
        zzlk zzlkVar4 = this.zza;
        zzlkVar4.zzr(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmeVar.size(); i9++) {
            int zze2 = zzmeVar.zze(i9);
            i8 += zzlk.zzz((zze2 >> 31) ^ (zze2 + zze2));
        }
        zzlkVar4.zzt(i8);
        while (i5 < zzmeVar.size()) {
            int zze3 = zzmeVar.zze(i5);
            zzlkVar4.zzt((zze3 >> 31) ^ (zze3 + zze3));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzD(int i4, long j4) {
        this.zza.zzu(i4, (j4 >> 63) ^ (j4 + j4));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzE(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzmw)) {
            if (!z4) {
                while (i5 < list.size()) {
                    zzlk zzlkVar = this.zza;
                    long longValue = ((Long) list.get(i5)).longValue();
                    zzlkVar.zzu(i4, (longValue >> 63) ^ (longValue + longValue));
                    i5++;
                }
                return;
            }
            zzlk zzlkVar2 = this.zza;
            zzlkVar2.zzr(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                long longValue2 = ((Long) list.get(i7)).longValue();
                i6 += zzlk.zzA((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzlkVar2.zzt(i6);
            while (i5 < list.size()) {
                long longValue3 = ((Long) list.get(i5)).longValue();
                zzlkVar2.zzv((longValue3 >> 63) ^ (longValue3 + longValue3));
                i5++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        if (!z4) {
            while (i5 < zzmwVar.size()) {
                zzlk zzlkVar3 = this.zza;
                long zza = zzmwVar.zza(i5);
                zzlkVar3.zzu(i4, (zza >> 63) ^ (zza + zza));
                i5++;
            }
            return;
        }
        zzlk zzlkVar4 = this.zza;
        zzlkVar4.zzr(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmwVar.size(); i9++) {
            long zza2 = zzmwVar.zza(i9);
            i8 += zzlk.zzA((zza2 >> 63) ^ (zza2 + zza2));
        }
        zzlkVar4.zzt(i8);
        while (i5 < zzmwVar.size()) {
            long zza3 = zzmwVar.zza(i5);
            zzlkVar4.zzv((zza3 >> 63) ^ (zza3 + zza3));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    @Deprecated
    public final void zzF(int i4) {
        this.zza.zzr(i4, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzG(int i4, String str) {
        this.zza.zzp(i4, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzH(int i4, List list) {
        int i5 = 0;
        if (!(list instanceof zzmt)) {
            while (i5 < list.size()) {
                this.zza.zzp(i4, (String) list.get(i5));
                i5++;
            }
            return;
        }
        zzmt zzmtVar = (zzmt) list;
        while (i5 < list.size()) {
            Object zzc = zzmtVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzp(i4, (String) zzc);
            } else {
                this.zza.zze(i4, (zzld) zzc);
            }
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzI(int i4, int i5) {
        this.zza.zzs(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzJ(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzme)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzs(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzlk.zzz(((Integer) list.get(i7)).intValue());
            }
            zzlkVar.zzt(i6);
            while (i5 < list.size()) {
                zzlkVar.zzt(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z4) {
            while (i5 < zzmeVar.size()) {
                this.zza.zzs(i4, zzmeVar.zze(i5));
                i5++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmeVar.size(); i9++) {
            i8 += zzlk.zzz(zzmeVar.zze(i9));
        }
        zzlkVar2.zzt(i8);
        while (i5 < zzmeVar.size()) {
            zzlkVar2.zzt(zzmeVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzK(int i4, long j4) {
        this.zza.zzu(i4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzL(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzmw)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzu(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzlk.zzA(((Long) list.get(i7)).longValue());
            }
            zzlkVar.zzt(i6);
            while (i5 < list.size()) {
                zzlkVar.zzv(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        if (!z4) {
            while (i5 < zzmwVar.size()) {
                this.zza.zzu(i4, zzmwVar.zza(i5));
                i5++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmwVar.size(); i9++) {
            i8 += zzlk.zzA(zzmwVar.zza(i9));
        }
        zzlkVar2.zzt(i8);
        while (i5 < zzmwVar.size()) {
            zzlkVar2.zzv(zzmwVar.zza(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzb(int i4, boolean z4) {
        this.zza.zzd(i4, z4);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzc(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzku)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzd(i4, ((Boolean) list.get(i5)).booleanValue());
                    i5++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Boolean) list.get(i7)).getClass();
                i6++;
            }
            zzlkVar.zzt(i6);
            while (i5 < list.size()) {
                zzlkVar.zzb(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
                i5++;
            }
            return;
        }
        zzku zzkuVar = (zzku) list;
        if (!z4) {
            while (i5 < zzkuVar.size()) {
                this.zza.zzd(i4, zzkuVar.zzf(i5));
                i5++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzkuVar.size(); i9++) {
            zzkuVar.zzf(i9);
            i8++;
        }
        zzlkVar2.zzt(i8);
        while (i5 < zzkuVar.size()) {
            zzlkVar2.zzb(zzkuVar.zzf(i5) ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzd(int i4, zzld zzldVar) {
        this.zza.zze(i4, zzldVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zze(int i4, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.zza.zze(i4, (zzld) list.get(i5));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzf(int i4, double d4) {
        this.zza.zzh(i4, Double.doubleToRawLongBits(d4));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzg(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzlm)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i4, Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                    i5++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Double) list.get(i7)).getClass();
                i6 += 8;
            }
            zzlkVar.zzt(i6);
            while (i5 < list.size()) {
                zzlkVar.zzi(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z4) {
            while (i5 < zzlmVar.size()) {
                this.zza.zzh(i4, Double.doubleToRawLongBits(zzlmVar.zze(i5)));
                i5++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzlmVar.size(); i9++) {
            zzlmVar.zze(i9);
            i8 += 8;
        }
        zzlkVar2.zzt(i8);
        while (i5 < zzlmVar.size()) {
            zzlkVar2.zzi(Double.doubleToRawLongBits(zzlmVar.zze(i5)));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    @Deprecated
    public final void zzh(int i4) {
        this.zza.zzr(i4, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzi(int i4, int i5) {
        this.zza.zzj(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzj(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzme)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzj(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzlk.zzA(((Integer) list.get(i7)).intValue());
            }
            zzlkVar.zzt(i6);
            while (i5 < list.size()) {
                zzlkVar.zzk(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z4) {
            while (i5 < zzmeVar.size()) {
                this.zza.zzj(i4, zzmeVar.zze(i5));
                i5++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmeVar.size(); i9++) {
            i8 += zzlk.zzA(zzmeVar.zze(i9));
        }
        zzlkVar2.zzt(i8);
        while (i5 < zzmeVar.size()) {
            zzlkVar2.zzk(zzmeVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzk(int i4, int i5) {
        this.zza.zzf(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzl(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzme)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzf(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            zzlkVar.zzt(i6);
            while (i5 < list.size()) {
                zzlkVar.zzg(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z4) {
            while (i5 < zzmeVar.size()) {
                this.zza.zzf(i4, zzmeVar.zze(i5));
                i5++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmeVar.size(); i9++) {
            zzmeVar.zze(i9);
            i8 += 4;
        }
        zzlkVar2.zzt(i8);
        while (i5 < zzmeVar.size()) {
            zzlkVar2.zzg(zzmeVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzm(int i4, long j4) {
        this.zza.zzh(i4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzn(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzmw)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i6 += 8;
            }
            zzlkVar.zzt(i6);
            while (i5 < list.size()) {
                zzlkVar.zzi(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        if (!z4) {
            while (i5 < zzmwVar.size()) {
                this.zza.zzh(i4, zzmwVar.zza(i5));
                i5++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmwVar.size(); i9++) {
            zzmwVar.zza(i9);
            i8 += 8;
        }
        zzlkVar2.zzt(i8);
        while (i5 < zzmwVar.size()) {
            zzlkVar2.zzi(zzmwVar.zza(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzo(int i4, float f4) {
        this.zza.zzf(i4, Float.floatToRawIntBits(f4));
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzp(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzlw)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzf(i4, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                    i5++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Float) list.get(i7)).getClass();
                i6 += 4;
            }
            zzlkVar.zzt(i6);
            while (i5 < list.size()) {
                zzlkVar.zzg(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
            return;
        }
        zzlw zzlwVar = (zzlw) list;
        if (!z4) {
            while (i5 < zzlwVar.size()) {
                this.zza.zzf(i4, Float.floatToRawIntBits(zzlwVar.zze(i5)));
                i5++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzlwVar.size(); i9++) {
            zzlwVar.zze(i9);
            i8 += 4;
        }
        zzlkVar2.zzt(i8);
        while (i5 < zzlwVar.size()) {
            zzlkVar2.zzg(Float.floatToRawIntBits(zzlwVar.zze(i5)));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzq(int i4, Object obj, zzns zznsVar) {
        zzlk zzlkVar = this.zza;
        zzlkVar.zzr(i4, 3);
        zznsVar.zzi((zznh) obj, zzlkVar.zza);
        zzlkVar.zzr(i4, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzr(int i4, int i5) {
        this.zza.zzj(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzs(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzme)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzj(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzlk.zzA(((Integer) list.get(i7)).intValue());
            }
            zzlkVar.zzt(i6);
            while (i5 < list.size()) {
                zzlkVar.zzk(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z4) {
            while (i5 < zzmeVar.size()) {
                this.zza.zzj(i4, zzmeVar.zze(i5));
                i5++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmeVar.size(); i9++) {
            i8 += zzlk.zzA(zzmeVar.zze(i9));
        }
        zzlkVar2.zzt(i8);
        while (i5 < zzmeVar.size()) {
            zzlkVar2.zzk(zzmeVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzt(int i4, long j4) {
        this.zza.zzu(i4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzu(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzmw)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzu(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzlk.zzA(((Long) list.get(i7)).longValue());
            }
            zzlkVar.zzt(i6);
            while (i5 < list.size()) {
                zzlkVar.zzv(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zzmw zzmwVar = (zzmw) list;
        if (!z4) {
            while (i5 < zzmwVar.size()) {
                this.zza.zzu(i4, zzmwVar.zza(i5));
                i5++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmwVar.size(); i9++) {
            i8 += zzlk.zzA(zzmwVar.zza(i9));
        }
        zzlkVar2.zzt(i8);
        while (i5 < zzmwVar.size()) {
            zzlkVar2.zzv(zzmwVar.zza(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzv(int i4, Object obj, zzns zznsVar) {
        this.zza.zzm(i4, (zznh) obj, zznsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzw(int i4, Object obj) {
        if (obj instanceof zzld) {
            this.zza.zzo(i4, (zzld) obj);
        } else {
            this.zza.zzn(i4, (zznh) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzx(int i4, int i5) {
        this.zza.zzf(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzy(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzme)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzf(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            zzlk zzlkVar = this.zza;
            zzlkVar.zzr(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            zzlkVar.zzt(i6);
            while (i5 < list.size()) {
                zzlkVar.zzg(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzme zzmeVar = (zzme) list;
        if (!z4) {
            while (i5 < zzmeVar.size()) {
                this.zza.zzf(i4, zzmeVar.zze(i5));
                i5++;
            }
            return;
        }
        zzlk zzlkVar2 = this.zza;
        zzlkVar2.zzr(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzmeVar.size(); i9++) {
            zzmeVar.zze(i9);
            i8 += 4;
        }
        zzlkVar2.zzt(i8);
        while (i5 < zzmeVar.size()) {
            zzlkVar2.zzg(zzmeVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzor
    public final void zzz(int i4, long j4) {
        this.zza.zzh(i4, j4);
    }
}

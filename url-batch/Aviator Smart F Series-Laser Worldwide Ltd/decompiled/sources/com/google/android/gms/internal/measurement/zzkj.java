package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
final class zzkj implements zzoc {
    private final zzki zza;

    private zzkj(zzki zzkiVar) {
        byte[] bArr = zzlj.zzd;
        this.zza = zzkiVar;
        zzkiVar.zza = this;
    }

    public static zzkj zza(zzki zzkiVar) {
        zzkj zzkjVar = zzkiVar.zza;
        return zzkjVar != null ? zzkjVar : new zzkj(zzkiVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzA(int i8, int i9) {
        this.zza.zzp(i8, (i9 >> 31) ^ (i9 + i9));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzB(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                zzki zzkiVar = this.zza;
                int intValue = ((Integer) list.get(i9)).intValue();
                zzkiVar.zzp(i8, (intValue >> 31) ^ (intValue + intValue));
                i9++;
            }
            return;
        }
        this.zza.zzo(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int intValue2 = ((Integer) list.get(i11)).intValue();
            i10 += zzki.zzx((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            zzki zzkiVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i9)).intValue();
            zzkiVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzC(int i8, long j8) {
        this.zza.zzr(i8, (j8 >> 63) ^ (j8 + j8));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzD(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                zzki zzkiVar = this.zza;
                long longValue = ((Long) list.get(i9)).longValue();
                zzkiVar.zzr(i8, (longValue >> 63) ^ (longValue + longValue));
                i9++;
            }
            return;
        }
        this.zza.zzo(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long longValue2 = ((Long) list.get(i11)).longValue();
            i10 += zzki.zzy((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            zzki zzkiVar2 = this.zza;
            long longValue3 = ((Long) list.get(i9)).longValue();
            zzkiVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    @Deprecated
    public final void zzE(int i8) {
        this.zza.zzo(i8, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzF(int i8, String str) {
        this.zza.zzm(i8, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzG(int i8, List list) {
        int i9 = 0;
        if (!(list instanceof zzlq)) {
            while (i9 < list.size()) {
                this.zza.zzm(i8, (String) list.get(i9));
                i9++;
            }
            return;
        }
        zzlq zzlqVar = (zzlq) list;
        while (i9 < list.size()) {
            Object zzf = zzlqVar.zzf(i9);
            if (zzf instanceof String) {
                this.zza.zzm(i8, (String) zzf);
            } else {
                this.zza.zze(i8, (zzka) zzf);
            }
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzH(int i8, int i9) {
        this.zza.zzp(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzI(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.zza.zzp(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzki.zzx(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzq(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzJ(int i8, long j8) {
        this.zza.zzr(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzK(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.zza.zzr(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzki.zzy(((Long) list.get(i11)).longValue());
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzs(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzb(int i8, boolean z7) {
        this.zza.zzd(i8, z7);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzc(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.zza.zzd(i8, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Boolean) list.get(i11)).booleanValue();
            i10++;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzd(int i8, zzka zzkaVar) {
        this.zza.zze(i8, zzkaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zze(int i8, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            this.zza.zze(i8, (zzka) list.get(i9));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzf(int i8, double d8) {
        this.zza.zzh(i8, Double.doubleToRawLongBits(d8));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzg(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.zza.zzh(i8, Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
                i9++;
            }
            return;
        }
        this.zza.zzo(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Double) list.get(i11)).doubleValue();
            i10 += 8;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    @Deprecated
    public final void zzh(int i8) {
        this.zza.zzo(i8, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzi(int i8, int i9) {
        this.zza.zzj(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzj(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.zza.zzj(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzki.zzu(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzk(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzk(int i8, int i9) {
        this.zza.zzf(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzl(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.zza.zzf(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Integer) list.get(i11)).intValue();
            i10 += 4;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzg(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzm(int i8, long j8) {
        this.zza.zzh(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzn(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.zza.zzh(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).longValue();
            i10 += 8;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzi(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzo(int i8, float f8) {
        this.zza.zzf(i8, Float.floatToRawIntBits(f8));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzp(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.zza.zzf(i8, Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                i9++;
            }
            return;
        }
        this.zza.zzo(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Float) list.get(i11)).floatValue();
            i10 += 4;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzq(int i8, Object obj, zzmt zzmtVar) {
        zzki zzkiVar = this.zza;
        zzkiVar.zzo(i8, 3);
        zzmtVar.zzi((zzmi) obj, zzkiVar.zza);
        zzkiVar.zzo(i8, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzr(int i8, int i9) {
        this.zza.zzj(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzs(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.zza.zzj(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzki.zzu(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzk(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzt(int i8, long j8) {
        this.zza.zzr(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzu(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.zza.zzr(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += zzki.zzy(((Long) list.get(i11)).longValue());
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzs(((Long) list.get(i9)).longValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzv(int i8, Object obj, zzmt zzmtVar) {
        zzmi zzmiVar = (zzmi) obj;
        zzkf zzkfVar = (zzkf) this.zza;
        zzkfVar.zzq((i8 << 3) | 2);
        zzkfVar.zzq(((zzjk) zzmiVar).zzbu(zzmtVar));
        zzmtVar.zzi(zzmiVar, zzkfVar.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzw(int i8, int i9) {
        this.zza.zzf(i8, i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzx(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.zza.zzf(i8, ((Integer) list.get(i9)).intValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Integer) list.get(i11)).intValue();
            i10 += 4;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzg(((Integer) list.get(i9)).intValue());
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzy(int i8, long j8) {
        this.zza.zzh(i8, j8);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzz(int i8, List list, boolean z7) {
        int i9 = 0;
        if (!z7) {
            while (i9 < list.size()) {
                this.zza.zzh(i8, ((Long) list.get(i9)).longValue());
                i9++;
            }
            return;
        }
        this.zza.zzo(i8, 2);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((Long) list.get(i11)).longValue();
            i10 += 8;
        }
        this.zza.zzq(i10);
        while (i9 < list.size()) {
            this.zza.zzi(((Long) list.get(i9)).longValue());
            i9++;
        }
    }
}

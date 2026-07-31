package com.google.android.gms.internal.play_billing;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzfd implements zzit {
    private final zzfc zza;

    private zzfd(zzfc zzfcVar) {
        byte[] bArr = zzga.zzb;
        this.zza = zzfcVar;
        zzfcVar.zza = this;
    }

    public static zzfd zza(zzfc zzfcVar) {
        Object obj = zzfcVar.zza;
        return obj != null ? (zzfd) obj : new zzfd(zzfcVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzA(int i4, long j4) {
        this.zza.zzj(i4, j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzB(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzgp)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzj(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i6 += 8;
            }
            zzfcVar.zzu(i6);
            while (i5 < list.size()) {
                zzfcVar.zzk(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        if (!z4) {
            while (i5 < zzgpVar.size()) {
                this.zza.zzj(i4, zzgpVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzgpVar.size(); i9++) {
            zzgpVar.zze(i9);
            i8 += 8;
        }
        zzfcVar2.zzu(i8);
        while (i5 < zzgpVar.size()) {
            zzfcVar2.zzk(zzgpVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzC(int i4, int i5) {
        this.zza.zzt(i4, (i5 >> 31) ^ (i5 + i5));
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzD(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzfv)) {
            if (!z4) {
                while (i5 < list.size()) {
                    zzfc zzfcVar = this.zza;
                    int intValue = ((Integer) list.get(i5)).intValue();
                    zzfcVar.zzt(i4, (intValue >> 31) ^ (intValue + intValue));
                    i5++;
                }
                return;
            }
            zzfc zzfcVar2 = this.zza;
            zzfcVar2.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                int intValue2 = ((Integer) list.get(i7)).intValue();
                i6 += zzfc.zzy((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            zzfcVar2.zzu(i6);
            while (i5 < list.size()) {
                int intValue3 = ((Integer) list.get(i5)).intValue();
                zzfcVar2.zzu((intValue3 >> 31) ^ (intValue3 + intValue3));
                i5++;
            }
            return;
        }
        zzfv zzfvVar = (zzfv) list;
        if (!z4) {
            while (i5 < zzfvVar.size()) {
                zzfc zzfcVar3 = this.zza;
                int zze = zzfvVar.zze(i5);
                zzfcVar3.zzt(i4, (zze >> 31) ^ (zze + zze));
                i5++;
            }
            return;
        }
        zzfc zzfcVar4 = this.zza;
        zzfcVar4.zzs(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzfvVar.size(); i9++) {
            int zze2 = zzfvVar.zze(i9);
            i8 += zzfc.zzy((zze2 >> 31) ^ (zze2 + zze2));
        }
        zzfcVar4.zzu(i8);
        while (i5 < zzfvVar.size()) {
            int zze3 = zzfvVar.zze(i5);
            zzfcVar4.zzu((zze3 >> 31) ^ (zze3 + zze3));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzE(int i4, long j4) {
        this.zza.zzv(i4, (j4 >> 63) ^ (j4 + j4));
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzF(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzgp)) {
            if (!z4) {
                while (i5 < list.size()) {
                    zzfc zzfcVar = this.zza;
                    long longValue = ((Long) list.get(i5)).longValue();
                    zzfcVar.zzv(i4, (longValue >> 63) ^ (longValue + longValue));
                    i5++;
                }
                return;
            }
            zzfc zzfcVar2 = this.zza;
            zzfcVar2.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                long longValue2 = ((Long) list.get(i7)).longValue();
                i6 += zzfc.zzz((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            zzfcVar2.zzu(i6);
            while (i5 < list.size()) {
                long longValue3 = ((Long) list.get(i5)).longValue();
                zzfcVar2.zzw((longValue3 >> 63) ^ (longValue3 + longValue3));
                i5++;
            }
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        if (!z4) {
            while (i5 < zzgpVar.size()) {
                zzfc zzfcVar3 = this.zza;
                long zze = zzgpVar.zze(i5);
                zzfcVar3.zzv(i4, (zze >> 63) ^ (zze + zze));
                i5++;
            }
            return;
        }
        zzfc zzfcVar4 = this.zza;
        zzfcVar4.zzs(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzgpVar.size(); i9++) {
            long zze2 = zzgpVar.zze(i9);
            i8 += zzfc.zzz((zze2 >> 63) ^ (zze2 + zze2));
        }
        zzfcVar4.zzu(i8);
        while (i5 < zzgpVar.size()) {
            long zze3 = zzgpVar.zze(i5);
            zzfcVar4.zzw((zze3 >> 63) ^ (zze3 + zze3));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    @Deprecated
    public final void zzG(int i4) {
        this.zza.zzs(i4, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzH(int i4, String str) {
        this.zza.zzq(i4, str);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzI(int i4, List list) {
        int i5 = 0;
        if (!(list instanceof zzgj)) {
            while (i5 < list.size()) {
                this.zza.zzq(i4, (String) list.get(i5));
                i5++;
            }
            return;
        }
        zzgj zzgjVar = (zzgj) list;
        while (i5 < list.size()) {
            Object zza = zzgjVar.zza();
            if (zza instanceof String) {
                this.zza.zzq(i4, (String) zza);
            } else {
                this.zza.zzf(i4, (zzev) zza);
            }
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzJ(int i4, int i5) {
        this.zza.zzt(i4, i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzK(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzfv)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzt(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzfc.zzy(((Integer) list.get(i7)).intValue());
            }
            zzfcVar.zzu(i6);
            while (i5 < list.size()) {
                zzfcVar.zzu(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzfv zzfvVar = (zzfv) list;
        if (!z4) {
            while (i5 < zzfvVar.size()) {
                this.zza.zzt(i4, zzfvVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzfvVar.size(); i9++) {
            i8 += zzfc.zzy(zzfvVar.zze(i9));
        }
        zzfcVar2.zzu(i8);
        while (i5 < zzfvVar.size()) {
            zzfcVar2.zzu(zzfvVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzL(int i4, long j4) {
        this.zza.zzv(i4, j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzM(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzgp)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzv(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzfc.zzz(((Long) list.get(i7)).longValue());
            }
            zzfcVar.zzu(i6);
            while (i5 < list.size()) {
                zzfcVar.zzw(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        if (!z4) {
            while (i5 < zzgpVar.size()) {
                this.zza.zzv(i4, zzgpVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzgpVar.size(); i9++) {
            i8 += zzfc.zzz(zzgpVar.zze(i9));
        }
        zzfcVar2.zzu(i8);
        while (i5 < zzgpVar.size()) {
            zzfcVar2.zzw(zzgpVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzb(int i4, boolean z4) {
        this.zza.zzd(i4, z4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzc(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzel)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzd(i4, ((Boolean) list.get(i5)).booleanValue());
                    i5++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Boolean) list.get(i7)).getClass();
                i6++;
            }
            zzfcVar.zzu(i6);
            while (i5 < list.size()) {
                zzfcVar.zzb(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
                i5++;
            }
            return;
        }
        zzel zzelVar = (zzel) list;
        if (!z4) {
            while (i5 < zzelVar.size()) {
                this.zza.zzd(i4, zzelVar.zzf(i5));
                i5++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzelVar.size(); i9++) {
            zzelVar.zzf(i9);
            i8++;
        }
        zzfcVar2.zzu(i8);
        while (i5 < zzelVar.size()) {
            zzfcVar2.zzb(zzelVar.zzf(i5) ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzd(int i4, zzev zzevVar) {
        this.zza.zzf(i4, zzevVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zze(int i4, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.zza.zzf(i4, (zzev) list.get(i5));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzf(int i4, double d4) {
        this.zza.zzj(i4, Double.doubleToRawLongBits(d4));
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzg(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzfe)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzj(i4, Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                    i5++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Double) list.get(i7)).getClass();
                i6 += 8;
            }
            zzfcVar.zzu(i6);
            while (i5 < list.size()) {
                zzfcVar.zzk(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
            return;
        }
        zzfe zzfeVar = (zzfe) list;
        if (!z4) {
            while (i5 < zzfeVar.size()) {
                this.zza.zzj(i4, Double.doubleToRawLongBits(zzfeVar.zze(i5)));
                i5++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzfeVar.size(); i9++) {
            zzfeVar.zze(i9);
            i8 += 8;
        }
        zzfcVar2.zzu(i8);
        while (i5 < zzfeVar.size()) {
            zzfcVar2.zzk(Double.doubleToRawLongBits(zzfeVar.zze(i5)));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    @Deprecated
    public final void zzh(int i4) {
        this.zza.zzs(i4, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzi(int i4, int i5) {
        this.zza.zzl(i4, i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzj(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzfv)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzl(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzfc.zzz(((Integer) list.get(i7)).intValue());
            }
            zzfcVar.zzu(i6);
            while (i5 < list.size()) {
                zzfcVar.zzm(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzfv zzfvVar = (zzfv) list;
        if (!z4) {
            while (i5 < zzfvVar.size()) {
                this.zza.zzl(i4, zzfvVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzfvVar.size(); i9++) {
            i8 += zzfc.zzz(zzfvVar.zze(i9));
        }
        zzfcVar2.zzu(i8);
        while (i5 < zzfvVar.size()) {
            zzfcVar2.zzm(zzfvVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzk(int i4, int i5) {
        this.zza.zzh(i4, i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzl(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzfv)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            zzfcVar.zzu(i6);
            while (i5 < list.size()) {
                zzfcVar.zzi(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzfv zzfvVar = (zzfv) list;
        if (!z4) {
            while (i5 < zzfvVar.size()) {
                this.zza.zzh(i4, zzfvVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzfvVar.size(); i9++) {
            zzfvVar.zze(i9);
            i8 += 4;
        }
        zzfcVar2.zzu(i8);
        while (i5 < zzfvVar.size()) {
            zzfcVar2.zzi(zzfvVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzm(int i4, long j4) {
        this.zza.zzj(i4, j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzn(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzgp)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzj(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i6 += 8;
            }
            zzfcVar.zzu(i6);
            while (i5 < list.size()) {
                zzfcVar.zzk(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        if (!z4) {
            while (i5 < zzgpVar.size()) {
                this.zza.zzj(i4, zzgpVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzgpVar.size(); i9++) {
            zzgpVar.zze(i9);
            i8 += 8;
        }
        zzfcVar2.zzu(i8);
        while (i5 < zzgpVar.size()) {
            zzfcVar2.zzk(zzgpVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzo(int i4, float f4) {
        this.zza.zzh(i4, Float.floatToRawIntBits(f4));
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzp(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzfo)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i4, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                    i5++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Float) list.get(i7)).getClass();
                i6 += 4;
            }
            zzfcVar.zzu(i6);
            while (i5 < list.size()) {
                zzfcVar.zzi(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
            return;
        }
        zzfo zzfoVar = (zzfo) list;
        if (!z4) {
            while (i5 < zzfoVar.size()) {
                this.zza.zzh(i4, Float.floatToRawIntBits(zzfoVar.zze(i5)));
                i5++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzfoVar.size(); i9++) {
            zzfoVar.zze(i9);
            i8 += 4;
        }
        zzfcVar2.zzu(i8);
        while (i5 < zzfoVar.size()) {
            zzfcVar2.zzi(Float.floatToRawIntBits(zzfoVar.zze(i5)));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzq(int i4, Object obj, zzhl zzhlVar) {
        zzfc zzfcVar = this.zza;
        zzfcVar.zzs(i4, 3);
        zzhlVar.zzi((zzeg) obj, this);
        zzfcVar.zzs(i4, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzr(int i4, int i5) {
        this.zza.zzl(i4, i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzs(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzfv)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzl(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzfc.zzz(((Integer) list.get(i7)).intValue());
            }
            zzfcVar.zzu(i6);
            while (i5 < list.size()) {
                zzfcVar.zzm(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzfv zzfvVar = (zzfv) list;
        if (!z4) {
            while (i5 < zzfvVar.size()) {
                this.zza.zzl(i4, zzfvVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzfvVar.size(); i9++) {
            i8 += zzfc.zzz(zzfvVar.zze(i9));
        }
        zzfcVar2.zzu(i8);
        while (i5 < zzfvVar.size()) {
            zzfcVar2.zzm(zzfvVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzt(int i4, long j4) {
        this.zza.zzv(i4, j4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzu(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzgp)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzv(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += zzfc.zzz(((Long) list.get(i7)).longValue());
            }
            zzfcVar.zzu(i6);
            while (i5 < list.size()) {
                zzfcVar.zzw(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        zzgp zzgpVar = (zzgp) list;
        if (!z4) {
            while (i5 < zzgpVar.size()) {
                this.zza.zzv(i4, zzgpVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzgpVar.size(); i9++) {
            i8 += zzfc.zzz(zzgpVar.zze(i9));
        }
        zzfcVar2.zzu(i8);
        while (i5 < zzgpVar.size()) {
            zzfcVar2.zzw(zzgpVar.zze(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzv(int i4, zzgt zzgtVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i4, 2);
            zzfcVar.zzu(zzgu.zzb(zzgtVar, entry.getKey(), entry.getValue()));
            zzgu.zze(zzfcVar, zzgtVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzw(int i4, Object obj, zzhl zzhlVar) {
        zzfc zzfcVar = this.zza;
        zzeg zzegVar = (zzeg) obj;
        zzfcVar.zzs(i4, 2);
        zzfcVar.zzu(zzegVar.zzi(zzhlVar));
        zzhlVar.zzi(zzegVar, this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzx(int i4, Object obj) {
        if (obj instanceof zzev) {
            this.zza.zzp(i4, (zzev) obj);
        } else {
            this.zza.zzo(i4, (zzhb) obj);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzy(int i4, int i5) {
        this.zza.zzh(i4, i5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzit
    public final void zzz(int i4, List list, boolean z4) {
        int i5 = 0;
        if (!(list instanceof zzfv)) {
            if (!z4) {
                while (i5 < list.size()) {
                    this.zza.zzh(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            zzfc zzfcVar = this.zza;
            zzfcVar.zzs(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            zzfcVar.zzu(i6);
            while (i5 < list.size()) {
                zzfcVar.zzi(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        zzfv zzfvVar = (zzfv) list;
        if (!z4) {
            while (i5 < zzfvVar.size()) {
                this.zza.zzh(i4, zzfvVar.zze(i5));
                i5++;
            }
            return;
        }
        zzfc zzfcVar2 = this.zza;
        zzfcVar2.zzs(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < zzfvVar.size(); i9++) {
            zzfvVar.zze(i9);
            i8 += 4;
        }
        zzfcVar2.zzu(i8);
        while (i5 < zzfvVar.size()) {
            zzfcVar2.zzi(zzfvVar.zze(i5));
            i5++;
        }
    }
}

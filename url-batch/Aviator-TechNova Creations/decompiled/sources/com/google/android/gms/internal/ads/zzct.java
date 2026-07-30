package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzct {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final zzcr zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private double zzq;

    public zzct(int i, int i2, float f, float f2, int i3, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = i / i3;
        this.zzf = i / 400;
        int i4 = i / 65;
        this.zzg = i4;
        this.zzh = i4 + i4;
        this.zzi = z ? new zzcq(this) : new zzcs(this);
    }

    private final void zzo(int i, int i2) {
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzk(i2);
        Object zzr = zzcrVar.zzr();
        Object zzq = zzcrVar.zzq();
        int i3 = this.zzk;
        int i4 = this.zzb;
        System.arraycopy(zzr, i * i4, zzq, i3 * i4, i2 * i4);
        this.zzk += i2;
    }

    public final int zza() {
        return this.zzj * this.zzb * this.zzi.zza();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        zzcr zzcrVar = this.zzi;
        int remaining = byteBuffer.remaining();
        int zza = remaining / (this.zzb * zzcrVar.zza());
        zzcrVar.zzj(zza);
        zzcrVar.zzn(byteBuffer, remaining);
        this.zzj += zza;
        zzp();
    }

    public final void zzc(ByteBuffer byteBuffer) {
        zzgrc.zzi(this.zzk >= 0);
        int i = this.zzb;
        int remaining = byteBuffer.remaining();
        zzcr zzcrVar = this.zzi;
        int min = Math.min(remaining / (zzcrVar.zza() * i), this.zzk);
        zzcrVar.zzo(byteBuffer, min);
        this.zzk -= min;
        System.arraycopy(zzcrVar.zzq(), min * i, zzcrVar.zzq(), 0, this.zzk * i);
    }

    public final void zzd() {
        int i = this.zzj;
        int i2 = this.zzo;
        int i3 = this.zzk;
        float f = this.zzc;
        float f2 = this.zzd;
        int i4 = i3 + ((int) (((((((i - i2) / (f / f2)) + i2) + this.zzq) + this.zzl) / (this.zze * f2)) + 0.5d));
        this.zzq = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        int i5 = this.zzh;
        int i6 = i5 + i5;
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzj(i + i6);
        zzcrVar.zzm(i * this.zzb, i6);
        this.zzj += i6;
        zzp();
        if (this.zzk > i4) {
            this.zzk = Math.max(i4, 0);
        }
        this.zzj = 0;
        this.zzo = 0;
        this.zzl = 0;
    }

    public final void zze() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 0;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.zzi.zzg();
    }

    public final int zzf() {
        zzgrc.zzi(this.zzk >= 0);
        return this.zzk * this.zzb * this.zzi.zza();
    }

    final /* synthetic */ int zzg() {
        return this.zzb;
    }

    final /* synthetic */ int zzh() {
        return this.zzh;
    }

    final /* synthetic */ int zzi() {
        return this.zzj;
    }

    final /* synthetic */ int zzj() {
        return this.zzk;
    }

    final /* synthetic */ int zzk() {
        return this.zzl;
    }

    final /* synthetic */ int zzl() {
        return this.zzm;
    }

    final /* synthetic */ int zzm() {
        return this.zzn;
    }

    final /* synthetic */ int zzn() {
        return this.zzp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzp() {
        float f;
        int i;
        int i2;
        double d;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        long j;
        long j2;
        float f3 = this.zzc;
        float f4 = this.zzd;
        double d2 = f3 / f4;
        int i9 = this.zzk;
        int i10 = 0;
        int i11 = 1;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i12 = this.zzj;
            int i13 = this.zzh;
            if (i12 >= i13) {
                int i14 = 0;
                while (true) {
                    int i15 = this.zzo;
                    if (i15 > 0) {
                        int min = Math.min(i13, i15);
                        zzo(i14, min);
                        this.zzo -= min;
                        i14 += min;
                        f = f4;
                        d = d2;
                        i3 = i11;
                        i4 = i13;
                    } else {
                        int i16 = this.zza;
                        int i17 = i16 > 4000 ? i16 / 4000 : i11;
                        int i18 = this.zzb;
                        if (i18 == i11) {
                            if (i17 == i11) {
                                i = this.zzi.zzf(i14, this.zzf, this.zzg);
                                f = f4;
                                i2 = i11;
                                zzcr zzcrVar = this.zzi;
                                int i19 = !zzcrVar.zzc() ? this.zzp : i;
                                int i20 = i14 + i19;
                                zzcrVar.zzi();
                                this.zzp = i;
                                double d3 = i19;
                                if (d2 <= 1.0d) {
                                    double d4 = d2 - 1.0d;
                                    if (d2 >= 2.0d) {
                                        i3 = i11;
                                        i4 = i13;
                                        double d5 = (d3 / d4) + this.zzq;
                                        int round = (int) Math.round(d5);
                                        d = d2;
                                        this.zzq = d5 - round;
                                        i6 = round;
                                    } else {
                                        d = d2;
                                        i3 = i11;
                                        i4 = i13;
                                        double d6 = ((d3 * (2.0d - d)) / d4) + this.zzq;
                                        int round2 = (int) Math.round(d6);
                                        this.zzo = round2;
                                        this.zzq = d6 - round2;
                                        i6 = i19;
                                    }
                                    zzcrVar.zzk(i6);
                                    zzcrVar.zzh(i6, i2, this.zzk, i14, i20);
                                    this.zzk += i6;
                                    i14 += i19 + i6;
                                } else {
                                    d = d2;
                                    i3 = i11;
                                    i4 = i13;
                                    double d7 = 1.0d - d;
                                    if (d < 0.5d) {
                                        double d8 = ((d3 * d) / d7) + this.zzq;
                                        int round3 = (int) Math.round(d8);
                                        this.zzq = d8 - round3;
                                        i5 = round3;
                                    } else {
                                        double d9 = ((d3 * ((d + d) - 1.0d)) / d7) + this.zzq;
                                        int round4 = (int) Math.round(d9);
                                        this.zzo = round4;
                                        this.zzq = d9 - round4;
                                        i5 = i19;
                                    }
                                    int i21 = i19 + i5;
                                    zzcrVar.zzk(i21);
                                    System.arraycopy(zzcrVar.zzr(), i14 * i2, zzcrVar.zzq(), this.zzk * i2, i19 * i2);
                                    int i22 = i14;
                                    zzcrVar.zzh(i5, i2, this.zzk + i19, i20, i22);
                                    this.zzk += i21;
                                    i14 = i22 + i5;
                                }
                            } else {
                                i18 = i11;
                            }
                        }
                        zzcr zzcrVar2 = this.zzi;
                        zzcrVar2.zzd(i14, i17);
                        int i23 = this.zzf;
                        int i24 = this.zzg;
                        f = f4;
                        int zze = zzcrVar2.zze(i10, i23 / i17, i24 / i17);
                        if (i17 != i11) {
                            int i25 = zze * i17;
                            int i26 = i17 * 4;
                            int i27 = i25 - i26;
                            if (i27 >= i23) {
                                i23 = i27;
                            }
                            int i28 = i25 + i26;
                            if (i28 <= i24) {
                                i24 = i28;
                            }
                            if (i18 == i11) {
                                i = zzcrVar2.zzf(i14, i23, i24);
                            } else {
                                zzcrVar2.zzd(i14, i11);
                                i = zzcrVar2.zze(i10, i23, i24);
                            }
                        } else {
                            i = zze;
                        }
                        i2 = i18;
                        zzcr zzcrVar3 = this.zzi;
                        if (!zzcrVar3.zzc()) {
                        }
                        int i202 = i14 + i19;
                        zzcrVar3.zzi();
                        this.zzp = i;
                        double d32 = i19;
                        if (d2 <= 1.0d) {
                        }
                    }
                    if (i14 + i4 > i12) {
                        break;
                    }
                    f4 = f;
                    i11 = i3;
                    i13 = i4;
                    d2 = d;
                    i10 = 0;
                }
                int i29 = this.zzj - i14;
                zzcr zzcrVar4 = this.zzi;
                int i30 = this.zzb;
                System.arraycopy(zzcrVar4.zzr(), i14 * i30, zzcrVar4.zzr(), 0, i30 * i29);
                this.zzj = i29;
                f2 = this.zze * f;
                if (f2 != 1.0f || this.zzk == i9) {
                }
                int i31 = this.zza;
                long j3 = i31;
                long j4 = (long) (i31 / f2);
                while (j4 != 0 && j3 != 0 && j4 % 2 == 0 && j3 % 2 == 0) {
                    j4 /= 2;
                    j3 /= 2;
                }
                int i32 = this.zzk - i9;
                zzcr zzcrVar5 = this.zzi;
                zzcrVar5.zzl(i32);
                int i33 = this.zzb;
                System.arraycopy(zzcrVar5.zzq(), i9 * i33, zzcrVar5.zzp(), this.zzl * i33, i32 * i33);
                this.zzk = i9;
                this.zzl += i32;
                int i34 = 0;
                while (true) {
                    i7 = this.zzl - 1;
                    if (i34 >= i7) {
                        break;
                    }
                    while (true) {
                        i8 = this.zzm + 1;
                        j = i8;
                        long j5 = j * j4;
                        j2 = this.zzn;
                        if (j5 <= j2 * j3) {
                            break;
                        }
                        int i35 = i3;
                        zzcrVar5.zzk(i35);
                        zzcrVar5.zzb(i34, j3, j4);
                        this.zzn += i35;
                        this.zzk += i35;
                    }
                    int i36 = i3;
                    this.zzm = i8;
                    if (j == j3) {
                        this.zzm = 0;
                        zzgrc.zzi(j2 == j4 ? i36 : 0);
                        this.zzn = 0;
                    }
                    i34++;
                    i3 = i36;
                }
                if (i7 != 0) {
                    System.arraycopy(zzcrVar5.zzp(), i7 * i33, zzcrVar5.zzp(), 0, (this.zzl - i7) * i33);
                    this.zzl -= i7;
                    return;
                }
                return;
            }
        } else {
            zzo(0, this.zzj);
            this.zzj = 0;
        }
        f = f4;
        i3 = 1;
        f2 = this.zze * f;
        if (f2 != 1.0f) {
        }
    }
}

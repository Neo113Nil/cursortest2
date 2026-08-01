package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzakp implements zzall {
    private final zzajy zza;
    private final zzfi zzb = new zzfi(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfq zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzakp(zzajy zzajyVar) {
        this.zza = zzajyVar;
    }

    private final void zzd(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zze(zzfj zzfjVar, byte[] bArr, int i) {
        int min = Math.min(zzfjVar.zza(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzfjVar.zzH(min);
        } else {
            zzfjVar.zzC(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        return i2 == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v16, types: [com.google.android.gms.internal.ads.zzfi] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.google.android.gms.internal.ads.zzajy] */
    @Override // com.google.android.gms.internal.ads.zzall
    public final void zza(zzfj zzfjVar, int i) throws zzcf {
        int i2;
        boolean z;
        int i3;
        int i4;
        long j;
        int i5;
        zzef.zzb(this.zze);
        int i6 = -1;
        int i7 = 2;
        ?? r6 = 0;
        int i8 = 1;
        if ((i & 1) != 0) {
            int i9 = this.zzc;
            if (i9 != 0 && i9 != 1) {
                if (i9 != 2) {
                    int i10 = this.zzj;
                    if (i10 != -1) {
                        zzez.zzf("PesReader", "Unexpected start indicator: expected " + i10 + " more bytes");
                    }
                    this.zza.zzc(zzfjVar.zzd() == 0);
                } else {
                    zzez.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i11 = i;
        while (zzfjVar.zza() > 0) {
            int i12 = this.zzc;
            if (i12 == 0) {
                i2 = i7;
                z = r6;
                i3 = i8;
                zzfjVar.zzH(zzfjVar.zza());
            } else if (i12 != i8) {
                if (i12 != i7) {
                    int zza = zzfjVar.zza();
                    int i13 = this.zzj;
                    int i14 = i13 == i6 ? r6 : zza - i13;
                    if (i14 > 0) {
                        zza -= i14;
                        zzfjVar.zzF(zzfjVar.zzc() + zza);
                    }
                    this.zza.zza(zzfjVar);
                    int i15 = this.zzj;
                    if (i15 != i6) {
                        int i16 = i15 - zza;
                        this.zzj = i16;
                        if (i16 == 0) {
                            this.zza.zzc(r6);
                            zzd(i8);
                        }
                    }
                } else {
                    if (zze(zzfjVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzfjVar, null, this.zzi)) {
                        this.zzb.zzj(r6);
                        if (this.zzf) {
                            this.zzb.zzl(4);
                            long zzd = this.zzb.zzd(3);
                            this.zzb.zzl(i8);
                            int zzd2 = this.zzb.zzd(15) << 15;
                            this.zzb.zzl(i8);
                            long zzd3 = this.zzb.zzd(15);
                            this.zzb.zzl(i8);
                            if (this.zzh || !this.zzg) {
                                i5 = zzd2;
                            } else {
                                this.zzb.zzl(4);
                                this.zzb.zzl(i8);
                                int zzd4 = this.zzb.zzd(15) << 15;
                                this.zzb.zzl(i8);
                                long zzd5 = this.zzb.zzd(15);
                                this.zzb.zzl(i8);
                                i5 = zzd2;
                                this.zze.zzb((this.zzb.zzd(3) << 30) | zzd4 | zzd5);
                                this.zzh = true;
                            }
                            j = this.zze.zzb((zzd << 30) | i5 | zzd3);
                        } else {
                            j = -9223372036854775807L;
                        }
                        i11 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(j, i11);
                        zzd(3);
                        i6 = -1;
                        i7 = 2;
                        r6 = 0;
                        i8 = 1;
                    }
                }
                i2 = i7;
                z = r6;
                i3 = i8;
            } else if (zze(zzfjVar, this.zzb.zza, 9)) {
                z = false;
                this.zzb.zzj(0);
                int zzd6 = this.zzb.zzd(24);
                i3 = 1;
                if (zzd6 != 1) {
                    zzez.zzf("PesReader", "Unexpected start code prefix: " + zzd6);
                    i6 = -1;
                    this.zzj = -1;
                    i4 = 0;
                    i2 = 2;
                } else {
                    this.zzb.zzl(8);
                    zzfi zzfiVar = this.zzb;
                    int zzd7 = zzfiVar.zzd(16);
                    zzfiVar.zzl(5);
                    this.zzk = this.zzb.zzn();
                    i2 = 2;
                    this.zzb.zzl(2);
                    this.zzf = this.zzb.zzn();
                    this.zzg = this.zzb.zzn();
                    this.zzb.zzl(6);
                    int zzd8 = this.zzb.zzd(8);
                    this.zzi = zzd8;
                    if (zzd7 == 0) {
                        this.zzj = -1;
                        i6 = -1;
                    } else {
                        int i17 = (zzd7 - 3) - zzd8;
                        this.zzj = i17;
                        if (i17 < 0) {
                            zzez.zzf("PesReader", "Found negative packet payload size: " + i17);
                            i6 = -1;
                            this.zzj = -1;
                        } else {
                            i6 = -1;
                        }
                    }
                    i4 = 2;
                }
                zzd(i4);
            } else {
                i6 = -1;
                z = false;
                i3 = 1;
                i2 = 2;
            }
            i8 = i3;
            r6 = z;
            i7 = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzall
    public final void zzb(zzfq zzfqVar, zzach zzachVar, zzalk zzalkVar) {
        this.zze = zzfqVar;
        this.zza.zzb(zzachVar, zzalkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzall
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}

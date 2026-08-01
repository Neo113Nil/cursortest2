package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzajw implements zzajy {
    private final String zzb;
    private String zzc;
    private zzadk zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private zzam zzi;
    private int zzj;
    private final zzfj zza = new zzfj(new byte[18]);
    private int zze = 0;
    private long zzk = -9223372036854775807L;

    public zzajw(String str) {
        this.zzb = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    @Override // com.google.android.gms.internal.ads.zzajy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfj zzfjVar) {
        int i;
        int i2;
        byte b;
        boolean z;
        int i3;
        int i4;
        byte b2;
        int i5;
        byte b3;
        int i6;
        zzef.zzb(this.zzd);
        while (zzfjVar.zza() > 0) {
            int i7 = this.zze;
            if (i7 == 0) {
                while (zzfjVar.zza() > 0) {
                    int i8 = this.zzg << 8;
                    this.zzg = i8;
                    int zzl = i8 | zzfjVar.zzl();
                    this.zzg = zzl;
                    int i9 = zzacb.zza;
                    if (zzl == 2147385345 || zzl == -25230976 || zzl == 536864768 || zzl == -14745368) {
                        byte[] zzI = this.zza.zzI();
                        int i10 = this.zzg;
                        zzI[0] = (byte) ((i10 >> 24) & 255);
                        zzI[1] = (byte) ((i10 >> 16) & 255);
                        zzI[2] = (byte) ((i10 >> 8) & 255);
                        zzI[3] = (byte) (i10 & 255);
                        this.zzf = 4;
                        this.zzg = 0;
                        this.zze = 1;
                        break;
                    }
                }
            } else if (i7 != 1) {
                int min = Math.min(zzfjVar.zza(), this.zzj - this.zzf);
                this.zzd.zzr(zzfjVar, min);
                int i11 = this.zzf + min;
                this.zzf = i11;
                int i12 = this.zzj;
                if (i11 == i12) {
                    long j = this.zzk;
                    if (j != -9223372036854775807L) {
                        this.zzd.zzt(j, 1, i12, 0, null);
                        this.zzk += this.zzh;
                    }
                    this.zze = 0;
                }
            } else {
                byte[] zzI2 = this.zza.zzI();
                int min2 = Math.min(zzfjVar.zza(), 18 - this.zzf);
                zzfjVar.zzC(zzI2, this.zzf, min2);
                int i13 = this.zzf + min2;
                this.zzf = i13;
                if (i13 == 18) {
                    byte[] zzI3 = this.zza.zzI();
                    if (this.zzi == null) {
                        zzam zza = zzacb.zza(zzI3, this.zzc, this.zzb, null);
                        this.zzi = zza;
                        this.zzd.zzl(zza);
                    }
                    int i14 = zzacb.zza;
                    byte b4 = zzI3[0];
                    if (b4 != -2) {
                        if (b4 == -1) {
                            i6 = ((zzI3[7] & 3) << 12) | ((zzI3[6] & 255) << 4) | ((zzI3[9] & 60) >> 2);
                        } else if (b4 != 31) {
                            i = (zzI3[5] & 3) << 12;
                            i2 = (zzI3[6] & 255) << 4;
                            b = zzI3[7];
                        } else {
                            i6 = ((zzI3[8] & 60) >> 2) | ((3 & zzI3[6]) << 12) | ((zzI3[7] & 255) << 4);
                        }
                        i3 = i6 + 1;
                        z = true;
                        if (z) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.zzj = i3;
                        if (b4 == -2) {
                            if (b4 == -1) {
                                i4 = (zzI3[4] & 7) << 4;
                                b3 = zzI3[7];
                            } else if (b4 != 31) {
                                i4 = (zzI3[4] & 1) << 6;
                                b2 = zzI3[5];
                            } else {
                                i4 = (zzI3[5] & 7) << 4;
                                b3 = zzI3[6];
                            }
                            i5 = b3 & 60;
                            this.zzh = (int) ((((((i5 >> 2) | i4) + 1) * 32) * 1000000) / this.zzi.zzA);
                            this.zza.zzG(0);
                            this.zzd.zzr(this.zza, 18);
                            this.zze = 2;
                        } else {
                            i4 = (zzI3[5] & 1) << 6;
                            b2 = zzI3[4];
                        }
                        i5 = b2 & 252;
                        this.zzh = (int) ((((((i5 >> 2) | i4) + 1) * 32) * 1000000) / this.zzi.zzA);
                        this.zza.zzG(0);
                        this.zzd.zzr(this.zza, 18);
                        this.zze = 2;
                    } else {
                        i = (zzI3[4] & 3) << 12;
                        i2 = (zzI3[7] & 255) << 4;
                        b = zzI3[6];
                    }
                    i3 = (i | i2 | ((b & 240) >> 4)) + 1;
                    z = false;
                    if (z) {
                    }
                    this.zzj = i3;
                    if (b4 == -2) {
                    }
                    i5 = b2 & 252;
                    this.zzh = (int) ((((((i5 >> 2) | i4) + 1) * 32) * 1000000) / this.zzi.zzA);
                    this.zza.zzG(0);
                    this.zzd.zzr(this.zza, 18);
                    this.zze = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzb(zzach zzachVar, zzalk zzalkVar) {
        zzalkVar.zzc();
        this.zzc = zzalkVar.zzb();
        this.zzd = zzachVar.zzw(zzalkVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zze() {
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
    }
}

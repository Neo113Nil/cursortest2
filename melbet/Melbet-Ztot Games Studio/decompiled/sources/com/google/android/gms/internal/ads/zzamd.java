package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzamd implements zzamf {
    private final zzek zza;
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzadp zzf;
    private int zzh;
    private int zzi;
    private long zzj;
    private zzaf zzk;
    private int zzl;
    private int zzm;
    private int zzg = 0;
    private long zzp = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzn = -1;
    private int zzo = -1;

    public zzamd(String str, int i, int i2) {
        this.zza = new zzek(new byte[i2]);
        this.zzc = str;
        this.zzd = i;
    }

    @RequiresNonNull({"output"})
    private final void zzf(zzacg zzacgVar) {
        int i;
        int i2 = zzacgVar.zzb;
        if (i2 == -2147483647 || (i = zzacgVar.zzc) == -1) {
            return;
        }
        zzaf zzafVar = this.zzk;
        if (zzafVar != null && i == zzafVar.zzz && i2 == zzafVar.zzA && zzet.zzG(zzacgVar.zza, zzafVar.zzm)) {
            return;
        }
        zzaf zzafVar2 = this.zzk;
        zzad zzadVar = zzafVar2 == null ? new zzad() : zzafVar2.zzb();
        zzadVar.zzK(this.zze);
        zzadVar.zzX(zzacgVar.zza);
        zzadVar.zzy(zzacgVar.zzc);
        zzadVar.zzY(zzacgVar.zzb);
        zzadVar.zzO(this.zzc);
        zzadVar.zzV(this.zzd);
        zzaf zzad = zzadVar.zzad();
        this.zzk = zzad;
        this.zzf.zzl(zzad);
    }

    private final boolean zzg(zzek zzekVar, byte[] bArr, int i) {
        int min = Math.min(zzekVar.zzb(), i - this.zzh);
        zzekVar.zzG(bArr, this.zzh, min);
        int i2 = this.zzh + min;
        this.zzh = i2;
        return i2 == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01db  */
    @Override // com.google.android.gms.internal.ads.zzamf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzek zzekVar) throws zzbo {
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
        zzdi.zzb(this.zzf);
        while (zzekVar.zzb() > 0) {
            int i7 = this.zzg;
            if (i7 == 0) {
                while (true) {
                    if (zzekVar.zzb() > 0) {
                        int i8 = this.zzi << 8;
                        this.zzi = i8;
                        int zzm = i8 | zzekVar.zzm();
                        this.zzi = zzm;
                        int i9 = zzach.zza;
                        int i10 = (zzm == 2147385345 || zzm == -25230976 || zzm == 536864768 || zzm == -14745368) ? 1 : (zzm == 1683496997 || zzm == 622876772) ? 2 : (zzm == 1078008818 || zzm == -233094848) ? 3 : (zzm == 1908687592 || zzm == -398277519) ? 4 : 0;
                        this.zzm = i10;
                        if (i10 != 0) {
                            byte[] zzM = this.zza.zzM();
                            int i11 = this.zzi;
                            zzM[0] = (byte) ((i11 >> 24) & 255);
                            zzM[1] = (byte) ((i11 >> 16) & 255);
                            zzM[2] = (byte) ((i11 >> 8) & 255);
                            zzM[3] = (byte) (i11 & 255);
                            this.zzh = 4;
                            this.zzi = 0;
                            if (i10 == 3 || i10 == 4) {
                                this.zzg = 4;
                            } else if (i10 == 1) {
                                this.zzg = 1;
                            } else {
                                this.zzg = 2;
                            }
                        }
                    }
                }
            } else if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                int min = Math.min(zzekVar.zzb(), this.zzl - this.zzh);
                                this.zzf.zzq(zzekVar, min);
                                int i12 = this.zzh + min;
                                this.zzh = i12;
                                if (i12 == this.zzl) {
                                    zzdi.zzf(this.zzp != -9223372036854775807L);
                                    this.zzf.zzs(this.zzp, this.zzm == 4 ? 0 : 1, this.zzl, 0, null);
                                    this.zzp += this.zzj;
                                    this.zzg = 0;
                                }
                            } else if (zzg(zzekVar, this.zza.zzM(), this.zzo)) {
                                zzacg zze = zzach.zze(this.zza.zzM(), this.zzb);
                                if (this.zzm == 3) {
                                    zzf(zze);
                                }
                                this.zzl = zze.zzd;
                                long j = zze.zze;
                                this.zzj = j != -9223372036854775807L ? j : 0L;
                                this.zza.zzK(0);
                                this.zzf.zzq(this.zza, this.zzo);
                                this.zzg = 6;
                            }
                        } else if (zzg(zzekVar, this.zza.zzM(), 6)) {
                            int zzb = zzach.zzb(this.zza.zzM());
                            this.zzo = zzb;
                            int i13 = this.zzh;
                            if (i13 > zzb) {
                                int i14 = i13 - zzb;
                                this.zzh = i13 - i14;
                                zzekVar.zzK(zzekVar.zzd() - i14);
                            }
                            this.zzg = 5;
                        }
                    } else if (zzg(zzekVar, this.zza.zzM(), this.zzn)) {
                        zzacg zzd = zzach.zzd(this.zza.zzM());
                        zzf(zzd);
                        this.zzl = zzd.zzd;
                        long j2 = zzd.zze;
                        this.zzj = j2 != -9223372036854775807L ? j2 : 0L;
                        this.zza.zzK(0);
                        this.zzf.zzq(this.zza, this.zzn);
                        this.zzg = 6;
                    }
                } else if (zzg(zzekVar, this.zza.zzM(), 7)) {
                    this.zzn = zzach.zza(this.zza.zzM());
                    this.zzg = 3;
                }
            } else if (zzg(zzekVar, this.zza.zzM(), 18)) {
                byte[] zzM2 = this.zza.zzM();
                if (this.zzk == null) {
                    zzaf zzc = zzach.zzc(zzM2, this.zze, this.zzc, this.zzd, null);
                    this.zzk = zzc;
                    this.zzf.zzl(zzc);
                }
                int i15 = zzach.zza;
                byte b4 = zzM2[0];
                if (b4 != -2) {
                    if (b4 == -1) {
                        i6 = ((zzM2[7] & 3) << 12) | ((zzM2[6] & 255) << 4) | ((zzM2[9] & 60) >> 2);
                    } else if (b4 != 31) {
                        i = (zzM2[5] & 3) << 12;
                        i2 = (zzM2[6] & 255) << 4;
                        b = zzM2[7];
                    } else {
                        i6 = ((zzM2[8] & 60) >> 2) | ((3 & zzM2[6]) << 12) | ((zzM2[7] & 255) << 4);
                    }
                    i3 = i6 + 1;
                    z = true;
                    if (z) {
                        i3 = (i3 * 16) / 14;
                    }
                    this.zzl = i3;
                    if (b4 == -2) {
                        if (b4 == -1) {
                            i4 = (zzM2[4] & 7) << 4;
                            b3 = zzM2[7];
                        } else if (b4 != 31) {
                            i4 = (zzM2[4] & 1) << 6;
                            b2 = zzM2[5];
                        } else {
                            i4 = (zzM2[5] & 7) << 4;
                            b3 = zzM2[6];
                        }
                        i5 = b3 & 60;
                        this.zzj = zzgap.zzb(zzet.zzs((((i5 >> 2) | i4) + 1) * 32, this.zzk.zzA));
                        this.zza.zzK(0);
                        this.zzf.zzq(this.zza, 18);
                        this.zzg = 6;
                    } else {
                        i4 = (zzM2[5] & 1) << 6;
                        b2 = zzM2[4];
                    }
                    i5 = b2 & 252;
                    this.zzj = zzgap.zzb(zzet.zzs((((i5 >> 2) | i4) + 1) * 32, this.zzk.zzA));
                    this.zza.zzK(0);
                    this.zzf.zzq(this.zza, 18);
                    this.zzg = 6;
                } else {
                    i = (zzM2[4] & 3) << 12;
                    i2 = (zzM2[7] & 255) << 4;
                    b = zzM2[6];
                }
                i3 = (i | i2 | ((b & 240) >> 4)) + 1;
                z = false;
                if (z) {
                }
                this.zzl = i3;
                if (b4 == -2) {
                }
                i5 = b2 & 252;
                this.zzj = zzgap.zzb(zzet.zzs((((i5 >> 2) | i4) + 1) * 32, this.zzk.zzA));
                this.zza.zzK(0);
                this.zzf.zzq(this.zza, 18);
                this.zzg = 6;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zze = zzansVar.zzb();
        this.zzf = zzacnVar.zzw(zzansVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j, int i) {
        this.zzp = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zzp = -9223372036854775807L;
        this.zzb.set(0);
    }
}

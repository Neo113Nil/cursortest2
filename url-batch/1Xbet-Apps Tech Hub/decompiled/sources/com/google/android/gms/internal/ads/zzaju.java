package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import com.google.android.material.internal.ViewUtils;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaju implements zzajy {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzfi zzc = new zzfi(new byte[7], 7);
    private final zzfj zzd = new zzfj(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzadk zzg;
    private zzadk zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzadk zzu;
    private long zzv;

    public zzaju(boolean z, String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzadk zzadkVar, long j, int i, int i2) {
        this.zzi = 4;
        this.zzj = i;
        this.zzu = zzadkVar;
        this.zzv = j;
        this.zzs = i2;
    }

    private final boolean zzk(zzfj zzfjVar, byte[] bArr, int i) {
        int min = Math.min(zzfjVar.zza(), i - this.zzj);
        zzfjVar.zzC(bArr, this.zzj, min);
        int i2 = this.zzj + min;
        this.zzj = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzfj zzfjVar, byte[] bArr, int i) {
        if (zzfjVar.zza() < i) {
            return false;
        }
        zzfjVar.zzC(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zza(zzfj zzfjVar) throws zzcf {
        int i;
        int i2;
        int i3;
        int i4;
        this.zzg.getClass();
        int i5 = zzfs.zza;
        while (zzfjVar.zza() > 0) {
            int i6 = this.zzi;
            int i7 = 13;
            int i8 = 2;
            if (i6 == 0) {
                byte[] zzI = zzfjVar.zzI();
                int zzc = zzfjVar.zzc();
                int zzd = zzfjVar.zzd();
                while (true) {
                    if (zzc >= zzd) {
                        zzfjVar.zzG(zzc);
                        break;
                    }
                    i = zzc + 1;
                    i2 = zzI[zzc] & 255;
                    if (this.zzk == 512 && zzl((byte) -1, (byte) i2)) {
                        if (!this.zzm) {
                            int i9 = i - 2;
                            zzfjVar.zzG(i9 + 1);
                            if (zzm(zzfjVar, this.zzc.zza, 1)) {
                                this.zzc.zzj(4);
                                int zzd2 = this.zzc.zzd(1);
                                int i10 = this.zzn;
                                if (i10 == -1 || zzd2 == i10) {
                                    if (this.zzo != -1) {
                                        if (!zzm(zzfjVar, this.zzc.zza, 1)) {
                                            break;
                                        }
                                        this.zzc.zzj(i8);
                                        if (this.zzc.zzd(4) == this.zzo) {
                                            zzfjVar.zzG(i9 + 2);
                                        }
                                    }
                                    if (!zzm(zzfjVar, this.zzc.zza, 4)) {
                                        break;
                                    }
                                    this.zzc.zzj(14);
                                    int zzd3 = this.zzc.zzd(i7);
                                    if (zzd3 >= 7) {
                                        byte[] zzI2 = zzfjVar.zzI();
                                        int zzd4 = zzfjVar.zzd();
                                        int i11 = i9 + zzd3;
                                        if (i11 < zzd4) {
                                            byte b = zzI2[i11];
                                            if (b != -1) {
                                                if (b == 73) {
                                                    int i12 = i11 + 1;
                                                    if (i12 == zzd4) {
                                                        break;
                                                    }
                                                    if (zzI2[i12] == 68) {
                                                        int i13 = i11 + 2;
                                                        if (i13 == zzd4) {
                                                            break;
                                                        } else if (zzI2[i13] == 51) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int i14 = i11 + 1;
                                                if (i14 == zzd4) {
                                                    break;
                                                }
                                                byte b2 = zzI2[i14];
                                                if (zzl((byte) -1, b2) && ((b2 & 8) >> 3) == zzd2) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    int i15 = this.zzk;
                    int i16 = i15 | i2;
                    if (i16 == 329) {
                        i3 = 2;
                        i4 = ViewUtils.EDGE_TO_EDGE_FLAGS;
                    } else if (i16 == 511) {
                        i3 = 2;
                        i4 = 512;
                    } else if (i16 == 836) {
                        i3 = 2;
                        i4 = 1024;
                    } else {
                        if (i16 == 1075) {
                            this.zzi = 2;
                            this.zzj = 3;
                            this.zzs = 0;
                            this.zzd.zzG(0);
                            zzfjVar.zzG(i);
                            break;
                        }
                        if (i15 != 256) {
                            this.zzk = 256;
                            zzc = i - 1;
                            i7 = 13;
                            i8 = 2;
                        } else {
                            i3 = 2;
                            i8 = i3;
                            zzc = i;
                            i7 = 13;
                        }
                    }
                    this.zzk = i4;
                    i8 = i3;
                    zzc = i;
                    i7 = 13;
                }
                this.zzp = (i2 & 8) >> 3;
                this.zzl = 1 == ((i2 & 1) ^ 1);
                if (this.zzm) {
                    zzi();
                } else {
                    this.zzi = 1;
                    this.zzj = 0;
                }
                zzfjVar.zzG(i);
            } else if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        int min = Math.min(zzfjVar.zza(), this.zzs - this.zzj);
                        this.zzu.zzr(zzfjVar, min);
                        int i17 = this.zzj + min;
                        this.zzj = i17;
                        int i18 = this.zzs;
                        if (i17 == i18) {
                            long j = this.zzt;
                            if (j != -9223372036854775807L) {
                                this.zzu.zzt(j, 1, i18, 0, null);
                                this.zzt += this.zzv;
                            }
                            zzh();
                        }
                    } else {
                        if (zzk(zzfjVar, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzj(0);
                            if (this.zzq) {
                                this.zzc.zzl(10);
                            } else {
                                int zzd5 = this.zzc.zzd(2) + 1;
                                if (zzd5 != 2) {
                                    zzez.zzf("AdtsReader", "Detected audio object type: " + zzd5 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzl(5);
                                int zzd6 = this.zzc.zzd(3);
                                int i19 = this.zzo;
                                int i20 = zzabc.zza;
                                byte[] bArr = {(byte) (((i19 >> 1) & 7) | 16), (byte) (((zzd6 << 3) & 120) | ((i19 << 7) & 128))};
                                zzabb zza2 = zzabc.zza(bArr);
                                zzak zzakVar = new zzak();
                                zzakVar.zzJ(this.zzf);
                                zzakVar.zzU("audio/mp4a-latm");
                                zzakVar.zzz(zza2.zzc);
                                zzakVar.zzy(zza2.zzb);
                                zzakVar.zzV(zza2.zza);
                                zzakVar.zzK(Collections.singletonList(bArr));
                                zzakVar.zzM(this.zze);
                                zzam zzac = zzakVar.zzac();
                                this.zzr = 1024000000 / zzac.zzA;
                                this.zzg.zzl(zzac);
                                this.zzq = true;
                            }
                            this.zzc.zzl(4);
                            int zzd7 = this.zzc.zzd(13) - 7;
                            if (this.zzl) {
                                zzd7 -= 2;
                            }
                            zzj(this.zzg, this.zzr, 0, zzd7);
                        }
                    }
                } else if (zzk(zzfjVar, this.zzd.zzI(), 10)) {
                    this.zzh.zzr(this.zzd, 10);
                    this.zzd.zzG(6);
                    zzj(this.zzh, 0L, 10, 10 + this.zzd.zzk());
                }
            } else if (zzfjVar.zza() != 0) {
                zzfi zzfiVar = this.zzc;
                zzfiVar.zza[0] = zzfjVar.zzI()[zzfjVar.zzc()];
                zzfiVar.zzj(2);
                int zzd8 = this.zzc.zzd(4);
                int i21 = this.zzo;
                if (i21 == -1 || zzd8 == i21) {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = zzd8;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzb(zzach zzachVar, zzalk zzalkVar) {
        zzalkVar.zzc();
        this.zzf = zzalkVar.zzb();
        zzadk zzw = zzachVar.zzw(zzalkVar.zza(), 1);
        this.zzg = zzw;
        this.zzu = zzw;
        if (!this.zzb) {
            this.zzh = new zzacd();
            return;
        }
        zzalkVar.zzc();
        zzadk zzw2 = zzachVar.zzw(zzalkVar.zza(), 5);
        this.zzh = zzw2;
        zzak zzakVar = new zzak();
        zzakVar.zzJ(zzalkVar.zzb());
        zzakVar.zzU("application/id3");
        zzw2.zzl(zzakVar.zzac());
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzt = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }
}

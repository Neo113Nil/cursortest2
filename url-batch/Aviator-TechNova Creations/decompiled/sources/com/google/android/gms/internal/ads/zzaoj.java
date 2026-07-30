package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import com.google.android.material.internal.ViewUtils;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaoj implements zzaon {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzagh zzi;
    private zzagh zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzagh zzw;
    private long zzx;
    private final zzeq zzc = new zzeq(new byte[7], 7);
    private final zzer zzd = new zzer(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzaoj(boolean z, String str, int i, String str2) {
        this.zzb = z;
        this.zze = str;
        this.zzf = i;
        this.zzg = str2;
        zzi();
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(zzer zzerVar, byte[] bArr, int i) {
        int min = Math.min(zzerVar.zzd(), i - this.zzl);
        zzerVar.zzm(bArr, this.zzl, min);
        int i2 = this.zzl + min;
        this.zzl = i2;
        return i2 == i;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzagh zzaghVar, long j, int i, int i2) {
        this.zzk = 4;
        this.zzl = i;
        this.zzw = zzaghVar;
        this.zzx = j;
        this.zzu = i2;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzer zzerVar, byte[] bArr, int i) {
        if (zzerVar.zzd() < i) {
            return false;
        }
        zzerVar.zzm(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzv = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzh = zzaqbVar.zzc();
        zzagh zzu = zzaexVar.zzu(zzaqbVar.zzb(), 1);
        this.zzi = zzu;
        this.zzw = zzu;
        if (!this.zzb) {
            this.zzj = new zzaer();
            return;
        }
        zzaqbVar.zza();
        zzagh zzu2 = zzaexVar.zzu(zzaqbVar.zzb(), 5);
        this.zzj = zzu2;
        zzt zztVar = new zzt();
        zztVar.zza(zzaqbVar.zzc());
        zztVar.zzl(this.zzg);
        zztVar.zzm("application/id3");
        zzu2.zzz(zztVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j, int i) {
        this.zzv = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) throws zzat {
        int i;
        byte b;
        char c;
        int i2;
        int i3;
        boolean z;
        int i4;
        this.zzi.getClass();
        String str = zzfj.zza;
        while (zzerVar.zzd() > 0) {
            int i5 = this.zzk;
            char c2 = 7;
            int i6 = 3;
            int i7 = 2;
            if (i5 == 0) {
                byte[] zzi = zzerVar.zzi();
                int zzg = zzerVar.zzg();
                int zze = zzerVar.zze();
                while (true) {
                    if (zzg >= zze) {
                        zzerVar.zzh(zzg);
                        break;
                    }
                    i = zzg + 1;
                    b = zzi[zzg];
                    int i8 = b & 255;
                    int i9 = i6;
                    if (this.zzm != 512 || !zzl((byte) -1, (byte) i8)) {
                        c = c2;
                    } else {
                        if (this.zzo) {
                            break;
                        }
                        int i10 = zzg - 1;
                        zzerVar.zzh(zzg);
                        zzeq zzeqVar = this.zzc;
                        if (zzm(zzerVar, zzeqVar.zza, 1)) {
                            zzeqVar.zzf(4);
                            int zzj = zzeqVar.zzj(1);
                            int i11 = this.zzp;
                            if (i11 == -1 || zzj == i11) {
                                if (this.zzq != -1) {
                                    if (!zzm(zzerVar, zzeqVar.zza, 1)) {
                                        break;
                                    }
                                    zzeqVar.zzf(i7);
                                    if (zzeqVar.zzj(4) == this.zzq) {
                                        zzerVar.zzh(zzg + 1);
                                    }
                                }
                                if (!zzm(zzerVar, zzeqVar.zza, 4)) {
                                    break;
                                }
                                zzeqVar.zzf(14);
                                int zzj2 = zzeqVar.zzj(13);
                                c = 7;
                                if (zzj2 >= 7) {
                                    byte[] zzi2 = zzerVar.zzi();
                                    int zze2 = zzerVar.zze();
                                    int i12 = i10 + zzj2;
                                    if (i12 < zze2) {
                                        byte b2 = zzi2[i12];
                                        if (b2 != -1) {
                                            if (b2 == 73) {
                                                int i13 = i12 + 1;
                                                if (i13 == zze2) {
                                                    break;
                                                }
                                                if (zzi2[i13] == 68) {
                                                    int i14 = i12 + 2;
                                                    if (i14 == zze2) {
                                                        break;
                                                    } else if (zzi2[i14] == 51) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            int i15 = i12 + 1;
                                            if (i15 == zze2) {
                                                break;
                                            }
                                            byte b3 = zzi2[i15];
                                            if (zzl((byte) -1, b3) && ((b3 & 8) >> 3) == zzj) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                        c = 7;
                    }
                    int i16 = this.zzm;
                    int i17 = i16 | i8;
                    if (i17 == 329) {
                        i2 = i9;
                        i3 = 2;
                        z = false;
                        i4 = ViewUtils.EDGE_TO_EDGE_FLAGS;
                    } else if (i17 == 511) {
                        i2 = i9;
                        i3 = 2;
                        z = false;
                        i4 = 512;
                    } else if (i17 == 836) {
                        i2 = i9;
                        i3 = 2;
                        z = false;
                        i4 = 1024;
                    } else {
                        if (i17 == 1075) {
                            this.zzk = 2;
                            this.zzl = i9;
                            this.zzu = 0;
                            this.zzd.zzh(0);
                            zzerVar.zzh(i);
                            break;
                        }
                        if (i16 != 256) {
                            this.zzm = 256;
                            c2 = c;
                            i6 = i9;
                            i7 = 2;
                        } else {
                            i2 = i9;
                            i3 = 2;
                            z = false;
                            zzg = i;
                            i6 = i2;
                            c2 = c;
                            i7 = i3;
                        }
                    }
                    this.zzm = i4;
                    zzg = i;
                    i6 = i2;
                    c2 = c;
                    i7 = i3;
                }
                this.zzr = (b & 8) >> 3;
                this.zzn = 1 == ((b & 1) ^ 1);
                if (this.zzo) {
                    zzk();
                } else {
                    this.zzk = 1;
                    this.zzl = 0;
                }
                zzerVar.zzh(i);
            } else if (i5 != 1) {
                if (i5 == 2) {
                    zzer zzerVar2 = this.zzd;
                    if (zzh(zzerVar, zzerVar2.zzi(), 10)) {
                        this.zzj.zzc(zzerVar2, 10);
                        zzerVar2.zzh(6);
                        zzj(this.zzj, 0L, 10, zzerVar2.zzG() + 10);
                    }
                } else if (i5 != 3) {
                    int min = Math.min(zzerVar.zzd(), this.zzu - this.zzl);
                    this.zzw.zzc(zzerVar, min);
                    int i18 = this.zzl + min;
                    this.zzl = i18;
                    if (i18 == this.zzu) {
                        zzgrc.zzi(this.zzv != -9223372036854775807L);
                        this.zzw.zze(this.zzv, 1, this.zzu, 0, null);
                        this.zzv += this.zzx;
                        zzi();
                    }
                } else {
                    int i19 = true != this.zzn ? 5 : 7;
                    zzeq zzeqVar2 = this.zzc;
                    if (zzh(zzerVar, zzeqVar2.zza, i19)) {
                        zzeqVar2.zzf(0);
                        if (this.zzs) {
                            zzeqVar2.zzh(10);
                        } else {
                            int zzj3 = zzeqVar2.zzj(2) + 1;
                            if (zzj3 != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(zzj3).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(zzj3);
                                sb.append(", but assuming AAC LC.");
                                zzee.zzc("AdtsReader", sb.toString());
                            }
                            zzeqVar2.zzh(5);
                            int zzj4 = zzeqVar2.zzj(3);
                            int i20 = this.zzq;
                            int i21 = zzadt.zza;
                            byte[] bArr = {(byte) (((i20 >> 1) & 7) | 16), (byte) (((zzj4 << 3) & 120) | ((i20 << 7) & 128))};
                            zzads zza2 = zzadt.zza(bArr);
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzh);
                            zztVar.zzl(this.zzg);
                            zztVar.zzm("audio/mp4a-latm");
                            zztVar.zzj(zza2.zzc);
                            zztVar.zzE(zza2.zzb);
                            zztVar.zzF(zza2.zza);
                            zztVar.zzp(Collections.singletonList(bArr));
                            zztVar.zze(this.zze);
                            zztVar.zzg(this.zzf);
                            zzv zzM = zztVar.zzM();
                            this.zzt = 1024000000 / zzM.zzH;
                            this.zzi.zzz(zzM);
                            this.zzs = true;
                        }
                        zzeqVar2.zzh(4);
                        int zzj5 = zzeqVar2.zzj(13);
                        int i22 = zzj5 - 7;
                        if (this.zzn) {
                            i22 = zzj5 - 9;
                        }
                        zzj(this.zzi, this.zzt, 0, i22);
                    }
                }
            } else if (zzerVar.zzd() != 0) {
                zzeq zzeqVar3 = this.zzc;
                zzeqVar3.zza[0] = zzerVar.zzi()[zzerVar.zzg()];
                zzeqVar3.zzf(2);
                int zzj6 = zzeqVar3.zzj(4);
                int i23 = this.zzq;
                if (i23 == -1 || zzj6 == i23) {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = zzj6;
                    }
                    zzk();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z) {
    }
}

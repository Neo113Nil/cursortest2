package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzabj {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return zzf((b & 192) >> 6, b & 63);
        }
        int i = bArr[2] & 7;
        int i2 = ((bArr[3] & 255) | (i << 8)) + 1;
        return i2 + i2;
    }

    public static zzaf zzc(zzek zzekVar, String str, String str2, zzy zzyVar) {
        zzej zzejVar = new zzej();
        zzejVar.zzj(zzekVar);
        int i = zzc[zzejVar.zzd(2)];
        zzejVar.zzn(8);
        int i2 = zze[zzejVar.zzd(3)];
        if (zzejVar.zzd(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzejVar.zzd(5)] * 1000;
        zzejVar.zzf();
        zzekVar.zzK(zzejVar.zzb());
        zzad zzadVar = new zzad();
        zzadVar.zzK(str);
        zzadVar.zzX("audio/ac3");
        zzadVar.zzy(i2);
        zzadVar.zzY(i);
        zzadVar.zzE(zzyVar);
        zzadVar.zzO(str2);
        zzadVar.zzx(i3);
        zzadVar.zzS(i3);
        return zzadVar.zzad();
    }

    public static zzaf zzd(zzek zzekVar, String str, String str2, zzy zzyVar) {
        String str3;
        zzej zzejVar = new zzej();
        zzejVar.zzj(zzekVar);
        int zzd2 = zzejVar.zzd(13) * 1000;
        zzejVar.zzn(3);
        int i = zzc[zzejVar.zzd(2)];
        zzejVar.zzn(10);
        int i2 = zze[zzejVar.zzd(3)];
        if (zzejVar.zzd(1) != 0) {
            i2++;
        }
        zzejVar.zzn(3);
        int zzd3 = zzejVar.zzd(4);
        zzejVar.zzn(1);
        if (zzd3 > 0) {
            zzejVar.zzn(6);
            if (zzejVar.zzd(1) != 0) {
                i2 += 2;
            }
            zzejVar.zzn(1);
        }
        if (zzejVar.zza() > 7) {
            zzejVar.zzn(7);
            if (zzejVar.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
                zzejVar.zzf();
                zzekVar.zzK(zzejVar.zzb());
                zzad zzadVar = new zzad();
                zzadVar.zzK(str);
                zzadVar.zzX(str3);
                zzadVar.zzy(i2);
                zzadVar.zzY(i);
                zzadVar.zzE(zzyVar);
                zzadVar.zzO(str2);
                zzadVar.zzS(zzd2);
                return zzadVar.zzad();
            }
        }
        str3 = "audio/eac3";
        zzejVar.zzf();
        zzekVar.zzK(zzejVar.zzb());
        zzad zzadVar2 = new zzad();
        zzadVar2.zzK(str);
        zzadVar2.zzX(str3);
        zzadVar2.zzy(i2);
        zzadVar2.zzY(i);
        zzadVar2.zzE(zzyVar);
        zzadVar2.zzO(str2);
        zzadVar2.zzS(zzd2);
        return zzadVar2.zzad();
    }

    public static zzabi zze(zzej zzejVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int zzc2 = zzejVar.zzc();
        zzejVar.zzn(40);
        int zzd2 = zzejVar.zzd(5);
        zzejVar.zzl(zzc2);
        int i12 = -1;
        if (zzd2 > 10) {
            zzejVar.zzn(16);
            int zzd3 = zzejVar.zzd(2);
            if (zzd3 == 0) {
                i12 = 0;
            } else if (zzd3 == 1) {
                i12 = 1;
            } else if (zzd3 == 2) {
                i12 = 2;
            }
            zzejVar.zzn(3);
            int zzd4 = zzejVar.zzd(11) + 1;
            int zzd5 = zzejVar.zzd(2);
            if (zzd5 == 3) {
                i8 = zzd[zzejVar.zzd(2)];
                i7 = 3;
                i9 = 6;
            } else {
                int zzd6 = zzejVar.zzd(2);
                int i13 = zzb[zzd6];
                i7 = zzd6;
                i8 = zzc[zzd5];
                i9 = i13;
            }
            int i14 = zzd4 + zzd4;
            int i15 = (i14 * i8) / (i9 * 32);
            int zzd7 = zzejVar.zzd(3);
            boolean zzp = zzejVar.zzp();
            int i16 = zze[zzd7] + (zzp ? 1 : 0);
            zzejVar.zzn(10);
            if (zzejVar.zzp()) {
                zzejVar.zzn(8);
            }
            if (zzd7 == 0) {
                zzejVar.zzn(5);
                if (zzejVar.zzp()) {
                    zzejVar.zzn(8);
                }
                i10 = 0;
                zzd7 = 0;
            } else {
                i10 = zzd7;
            }
            if (i12 == 1) {
                if (zzejVar.zzp()) {
                    zzejVar.zzn(16);
                }
                i11 = 1;
            } else {
                i11 = i12;
            }
            if (zzejVar.zzp()) {
                if (i10 > 2) {
                    zzejVar.zzn(2);
                }
                if ((i10 & 1) != 0 && i10 > 2) {
                    zzejVar.zzn(6);
                }
                if ((i10 & 4) != 0) {
                    zzejVar.zzn(6);
                }
                if (zzp && zzejVar.zzp()) {
                    zzejVar.zzn(5);
                }
                if (i11 == 0) {
                    if (zzejVar.zzp()) {
                        zzejVar.zzn(6);
                    }
                    if (i10 == 0 && zzejVar.zzp()) {
                        zzejVar.zzn(6);
                    }
                    if (zzejVar.zzp()) {
                        zzejVar.zzn(6);
                    }
                    int zzd8 = zzejVar.zzd(2);
                    if (zzd8 == 1) {
                        zzejVar.zzn(5);
                    } else if (zzd8 == 2) {
                        zzejVar.zzn(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzejVar.zzd(5);
                        if (zzejVar.zzp()) {
                            zzejVar.zzn(5);
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                if (zzejVar.zzp()) {
                                    zzejVar.zzn(4);
                                }
                                if (zzejVar.zzp()) {
                                    zzejVar.zzn(4);
                                }
                            }
                        }
                        if (zzejVar.zzp()) {
                            zzejVar.zzn(5);
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(7);
                                if (zzejVar.zzp()) {
                                    zzejVar.zzn(8);
                                }
                            }
                        }
                        zzejVar.zzn((zzd9 + 2) * 8);
                        zzejVar.zzf();
                    }
                    if (i10 < 2) {
                        if (zzejVar.zzp()) {
                            zzejVar.zzn(14);
                        }
                        if (zzd7 == 0 && zzejVar.zzp()) {
                            zzejVar.zzn(14);
                        }
                    }
                    if (zzejVar.zzp()) {
                        if (i7 == 0) {
                            zzejVar.zzn(5);
                            i11 = 0;
                            i7 = 0;
                        } else {
                            for (int i17 = 0; i17 < i9; i17++) {
                                if (zzejVar.zzp()) {
                                    zzejVar.zzn(5);
                                }
                            }
                        }
                    }
                    i11 = 0;
                }
            }
            if (zzejVar.zzp()) {
                zzejVar.zzn(5);
                if (i10 == 2) {
                    zzejVar.zzn(4);
                    i10 = 2;
                }
                if (i10 >= 6) {
                    zzejVar.zzn(2);
                }
                if (zzejVar.zzp()) {
                    zzejVar.zzn(8);
                }
                if (i10 == 0 && zzejVar.zzp()) {
                    zzejVar.zzn(8);
                }
                if (zzd5 < 3) {
                    zzejVar.zzm();
                }
            }
            if (i11 == 0 && i7 != 3) {
                zzejVar.zzm();
            }
            if (i11 == 2 && (i7 == 3 || zzejVar.zzp())) {
                zzejVar.zzn(6);
            }
            str = (zzejVar.zzp() && zzejVar.zzd(6) == 1 && zzejVar.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i2 = i14;
            i3 = i8;
            i6 = i9 * 256;
            i = i15;
            i4 = i16;
        } else {
            zzejVar.zzn(32);
            int zzd10 = zzejVar.zzd(2);
            String str2 = zzd10 == 3 ? null : "audio/ac3";
            int zzd11 = zzejVar.zzd(6);
            int i18 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzejVar.zzn(8);
            int zzd12 = zzejVar.zzd(3);
            if ((zzd12 & 1) != 0 && zzd12 != 1) {
                zzejVar.zzn(2);
            }
            if ((zzd12 & 4) != 0) {
                zzejVar.zzn(2);
            }
            if (zzd12 == 2) {
                zzejVar.zzn(2);
            }
            str = str2;
            i = i18;
            i2 = zzf2;
            i3 = zzd10 < 3 ? zzc[zzd10] : -1;
            i4 = zze[zzd12] + (zzejVar.zzp() ? 1 : 0);
            i5 = -1;
            i6 = 1536;
        }
        return new zzabi(str, i5, i4, i3, i2, i6, i, null);
    }

    private static int zzf(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}

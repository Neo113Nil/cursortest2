package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.nio.ByteBuffer;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzabf {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, Opcodes.IF_ICMPNE, Opcodes.CHECKCAST, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, Opcodes.F2I, Opcodes.FRETURN, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

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

    public static zzam zzc(zzfj zzfjVar, String str, String str2, zzad zzadVar) {
        zzfi zzfiVar = new zzfi();
        zzfiVar.zzh(zzfjVar);
        int i = zzc[zzfiVar.zzd(2)];
        zzfiVar.zzl(8);
        int i2 = zze[zzfiVar.zzd(3)];
        if (zzfiVar.zzd(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzfiVar.zzd(5)] * 1000;
        zzfiVar.zze();
        zzfjVar.zzG(zzfiVar.zzb());
        zzak zzakVar = new zzak();
        zzakVar.zzJ(str);
        zzakVar.zzU("audio/ac3");
        zzakVar.zzy(i2);
        zzakVar.zzV(i);
        zzakVar.zzD(zzadVar);
        zzakVar.zzM(str2);
        zzakVar.zzx(i3);
        zzakVar.zzQ(i3);
        return zzakVar.zzac();
    }

    public static zzam zzd(zzfj zzfjVar, String str, String str2, zzad zzadVar) {
        String str3;
        zzfi zzfiVar = new zzfi();
        zzfiVar.zzh(zzfjVar);
        int zzd2 = zzfiVar.zzd(13) * 1000;
        zzfiVar.zzl(3);
        int i = zzc[zzfiVar.zzd(2)];
        zzfiVar.zzl(10);
        int i2 = zze[zzfiVar.zzd(3)];
        if (zzfiVar.zzd(1) != 0) {
            i2++;
        }
        zzfiVar.zzl(3);
        int zzd3 = zzfiVar.zzd(4);
        zzfiVar.zzl(1);
        if (zzd3 > 0) {
            zzfiVar.zzl(6);
            if (zzfiVar.zzd(1) != 0) {
                i2 += 2;
            }
            zzfiVar.zzl(1);
        }
        if (zzfiVar.zza() > 7) {
            zzfiVar.zzl(7);
            if (zzfiVar.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
                zzfiVar.zze();
                zzfjVar.zzG(zzfiVar.zzb());
                zzak zzakVar = new zzak();
                zzakVar.zzJ(str);
                zzakVar.zzU(str3);
                zzakVar.zzy(i2);
                zzakVar.zzV(i);
                zzakVar.zzD(zzadVar);
                zzakVar.zzM(str2);
                zzakVar.zzQ(zzd2);
                return zzakVar.zzac();
            }
        }
        str3 = "audio/eac3";
        zzfiVar.zze();
        zzfjVar.zzG(zzfiVar.zzb());
        zzak zzakVar2 = new zzak();
        zzakVar2.zzJ(str);
        zzakVar2.zzU(str3);
        zzakVar2.zzy(i2);
        zzakVar2.zzV(i);
        zzakVar2.zzD(zzadVar);
        zzakVar2.zzM(str2);
        zzakVar2.zzQ(zzd2);
        return zzakVar2.zzac();
    }

    public static zzabe zze(zzfi zzfiVar) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int zzc2 = zzfiVar.zzc();
        zzfiVar.zzl(40);
        int zzd2 = zzfiVar.zzd(5);
        zzfiVar.zzj(zzc2);
        int i12 = -1;
        if (zzd2 > 10) {
            zzfiVar.zzl(16);
            int zzd3 = zzfiVar.zzd(2);
            if (zzd3 == 0) {
                i12 = 0;
            } else if (zzd3 == 1) {
                i12 = 1;
            } else if (zzd3 == 2) {
                i12 = 2;
            }
            zzfiVar.zzl(3);
            int zzd4 = zzfiVar.zzd(11) + 1;
            int zzd5 = zzfiVar.zzd(2);
            if (zzd5 == 3) {
                i8 = zzd[zzfiVar.zzd(2)];
                i9 = 6;
                i7 = 3;
            } else {
                int zzd6 = zzfiVar.zzd(2);
                int i13 = zzb[zzd6];
                i7 = zzd6;
                i8 = zzc[zzd5];
                i9 = i13;
            }
            int i14 = zzd4 + zzd4;
            int i15 = (i14 * i8) / (i9 * 32);
            int zzd7 = zzfiVar.zzd(3);
            boolean zzn = zzfiVar.zzn();
            i = zze[zzd7] + (zzn ? 1 : 0);
            zzfiVar.zzl(10);
            if (zzfiVar.zzn()) {
                zzfiVar.zzl(8);
            }
            if (zzd7 == 0) {
                zzfiVar.zzl(5);
                if (zzfiVar.zzn()) {
                    zzfiVar.zzl(8);
                }
                i10 = 0;
                zzd7 = 0;
            } else {
                i10 = zzd7;
            }
            if (i12 == 1) {
                if (zzfiVar.zzn()) {
                    zzfiVar.zzl(16);
                }
                i11 = 1;
            } else {
                i11 = i12;
            }
            if (zzfiVar.zzn()) {
                if (i10 > 2) {
                    zzfiVar.zzl(2);
                }
                if ((i10 & 1) != 0 && i10 > 2) {
                    zzfiVar.zzl(6);
                }
                if ((i10 & 4) != 0) {
                    zzfiVar.zzl(6);
                }
                if (zzn && zzfiVar.zzn()) {
                    zzfiVar.zzl(5);
                }
                if (i11 == 0) {
                    if (zzfiVar.zzn()) {
                        zzfiVar.zzl(6);
                    }
                    if (i10 == 0 && zzfiVar.zzn()) {
                        zzfiVar.zzl(6);
                    }
                    if (zzfiVar.zzn()) {
                        zzfiVar.zzl(6);
                    }
                    int zzd8 = zzfiVar.zzd(2);
                    if (zzd8 == 1) {
                        zzfiVar.zzl(5);
                    } else if (zzd8 == 2) {
                        zzfiVar.zzl(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzfiVar.zzd(5);
                        if (zzfiVar.zzn()) {
                            zzfiVar.zzl(5);
                            if (zzfiVar.zzn()) {
                                zzfiVar.zzl(4);
                            }
                            if (zzfiVar.zzn()) {
                                zzfiVar.zzl(4);
                            }
                            if (zzfiVar.zzn()) {
                                zzfiVar.zzl(4);
                            }
                            if (zzfiVar.zzn()) {
                                zzfiVar.zzl(4);
                            }
                            if (zzfiVar.zzn()) {
                                zzfiVar.zzl(4);
                            }
                            if (zzfiVar.zzn()) {
                                zzfiVar.zzl(4);
                            }
                            if (zzfiVar.zzn()) {
                                zzfiVar.zzl(4);
                            }
                            if (zzfiVar.zzn()) {
                                if (zzfiVar.zzn()) {
                                    zzfiVar.zzl(4);
                                }
                                if (zzfiVar.zzn()) {
                                    zzfiVar.zzl(4);
                                }
                            }
                        }
                        if (zzfiVar.zzn()) {
                            zzfiVar.zzl(5);
                            if (zzfiVar.zzn()) {
                                zzfiVar.zzl(7);
                                if (zzfiVar.zzn()) {
                                    zzfiVar.zzl(8);
                                }
                            }
                        }
                        zzfiVar.zzl((zzd9 + 2) * 8);
                        zzfiVar.zze();
                    }
                    if (i10 < 2) {
                        if (zzfiVar.zzn()) {
                            zzfiVar.zzl(14);
                        }
                        if (zzd7 == 0 && zzfiVar.zzn()) {
                            zzfiVar.zzl(14);
                        }
                    }
                    if (zzfiVar.zzn()) {
                        if (i7 == 0) {
                            zzfiVar.zzl(5);
                            i11 = 0;
                            i7 = 0;
                        } else {
                            for (int i16 = 0; i16 < i9; i16++) {
                                if (zzfiVar.zzn()) {
                                    zzfiVar.zzl(5);
                                }
                            }
                        }
                    }
                    i11 = 0;
                }
            }
            if (zzfiVar.zzn()) {
                zzfiVar.zzl(5);
                if (i10 == 2) {
                    zzfiVar.zzl(4);
                    i10 = 2;
                }
                if (i10 >= 6) {
                    zzfiVar.zzl(2);
                }
                if (zzfiVar.zzn()) {
                    zzfiVar.zzl(8);
                }
                if (i10 == 0 && zzfiVar.zzn()) {
                    zzfiVar.zzl(8);
                }
                if (zzd5 < 3) {
                    zzfiVar.zzk();
                }
            }
            if (i11 == 0 && i7 != 3) {
                zzfiVar.zzk();
            }
            if (i11 == 2 && (i7 == 3 || zzfiVar.zzn())) {
                zzfiVar.zzl(6);
            }
            str = (zzfiVar.zzn() && zzfiVar.zzd(6) == 1 && zzfiVar.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i12;
            i4 = i14;
            i5 = i8;
            i6 = i9 * 256;
            i3 = i15;
        } else {
            zzfiVar.zzl(32);
            int zzd10 = zzfiVar.zzd(2);
            String str2 = zzd10 == 3 ? null : "audio/ac3";
            int zzd11 = zzfiVar.zzd(6);
            int i17 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzfiVar.zzl(8);
            int zzd12 = zzfiVar.zzd(3);
            if ((zzd12 & 1) != 0 && zzd12 != 1) {
                zzfiVar.zzl(2);
            }
            if ((zzd12 & 4) != 0) {
                zzfiVar.zzl(2);
            }
            if (zzd12 == 2) {
                zzfiVar.zzl(2);
            }
            int i18 = zzd10 < 3 ? zzc[zzd10] : -1;
            i = zze[zzd12] + (zzfiVar.zzn() ? 1 : 0);
            i2 = -1;
            str = str2;
            i3 = i17;
            i4 = zzf2;
            i5 = i18;
            i6 = 1536;
        }
        return new zzabe(str, i2, i, i5, i4, i6, i3, null);
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

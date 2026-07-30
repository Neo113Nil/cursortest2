package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzadv {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, Opcodes.IF_ICMPNE, Opcodes.CHECKCAST, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, Opcodes.LSHL, Opcodes.F2I, Opcodes.FRETURN, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzv zza(zzer zzerVar, String str, String str2, zzq zzqVar) {
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzerVar);
        int i = zzc[zzeqVar.zzj(2)];
        zzeqVar.zzh(8);
        int i2 = zze[zzeqVar.zzj(3)];
        if (zzeqVar.zzj(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzeqVar.zzj(5)] * 1000;
        zzeqVar.zzm();
        zzerVar.zzh(zzeqVar.zze());
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzm("audio/ac3");
        zztVar.zzE(i2);
        zztVar.zzF(i);
        zztVar.zzq(zzqVar);
        zztVar.zze(str2);
        zztVar.zzh(i3);
        zztVar.zzi(i3);
        return zztVar.zzM();
    }

    public static zzv zzb(zzer zzerVar, String str, String str2, zzq zzqVar) {
        String str3;
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzerVar);
        int zzj = zzeqVar.zzj(13) * 1000;
        zzeqVar.zzh(3);
        int i = zzc[zzeqVar.zzj(2)];
        zzeqVar.zzh(10);
        int i2 = zze[zzeqVar.zzj(3)];
        if (zzeqVar.zzj(1) != 0) {
            i2++;
        }
        zzeqVar.zzh(3);
        int zzj2 = zzeqVar.zzj(4);
        zzeqVar.zzh(1);
        if (zzj2 > 0) {
            zzeqVar.zzh(6);
            if (zzeqVar.zzj(1) != 0) {
                i2 += 2;
            }
            zzeqVar.zzh(1);
        }
        if (zzeqVar.zzc() > 7) {
            zzeqVar.zzh(7);
            if (zzeqVar.zzj(1) != 0) {
                str3 = "audio/eac3-joc";
                zzeqVar.zzm();
                zzerVar.zzh(zzeqVar.zze());
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzm(str3);
                zztVar.zzE(i2);
                zztVar.zzF(i);
                zztVar.zzq(zzqVar);
                zztVar.zze(str2);
                zztVar.zzi(zzj);
                return zztVar.zzM();
            }
        }
        str3 = "audio/eac3";
        zzeqVar.zzm();
        zzerVar.zzh(zzeqVar.zze());
        zzt zztVar2 = new zzt();
        zztVar2.zza(str);
        zztVar2.zzm(str3);
        zztVar2.zzE(i2);
        zztVar2.zzF(i);
        zztVar2.zzq(zzqVar);
        zztVar2.zze(str2);
        zztVar2.zzi(zzj);
        return zztVar2.zzM();
    }

    public static zzadu zzc(zzeq zzeqVar) {
        int zzf2;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int zzd2 = zzeqVar.zzd();
        zzeqVar.zzh(40);
        int zzj = zzeqVar.zzj(5);
        zzeqVar.zzf(zzd2);
        int i9 = -1;
        if (zzj > 10) {
            zzeqVar.zzh(16);
            int zzj2 = zzeqVar.zzj(2);
            if (zzj2 == 0) {
                i9 = 0;
            } else if (zzj2 == 1) {
                i9 = 1;
            } else if (zzj2 == 2) {
                i9 = 2;
            }
            zzeqVar.zzh(3);
            int zzj3 = zzeqVar.zzj(11) + 1;
            int zzj4 = zzeqVar.zzj(2);
            if (zzj4 == 3) {
                i = zzd[zzeqVar.zzj(2)];
                i6 = 6;
                i5 = 3;
            } else {
                int zzj5 = zzeqVar.zzj(2);
                int i10 = zzb[zzj5];
                i5 = zzj5;
                i = zzc[zzj4];
                i6 = i10;
            }
            zzf2 = zzj3 + zzj3;
            int i11 = (zzf2 * i) / (i6 * 32);
            int zzj6 = zzeqVar.zzj(3);
            boolean zzi = zzeqVar.zzi();
            i2 = zze[zzj6] + (zzi ? 1 : 0);
            zzeqVar.zzh(10);
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(8);
            }
            if (zzj6 == 0) {
                zzeqVar.zzh(5);
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(8);
                }
                i7 = 0;
                zzj6 = 0;
            } else {
                i7 = zzj6;
            }
            if (i9 == 1) {
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(16);
                }
                i8 = 1;
            } else {
                i8 = i9;
            }
            if (zzeqVar.zzi()) {
                if (i7 > 2) {
                    zzeqVar.zzh(2);
                }
                if ((i7 & 1) != 0 && i7 > 2) {
                    zzeqVar.zzh(6);
                }
                if ((i7 & 4) != 0) {
                    zzeqVar.zzh(6);
                }
                if (zzi && zzeqVar.zzi()) {
                    zzeqVar.zzh(5);
                }
                if (i8 == 0) {
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(6);
                    }
                    if (i7 == 0 && zzeqVar.zzi()) {
                        zzeqVar.zzh(6);
                    }
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(6);
                    }
                    int zzj7 = zzeqVar.zzj(2);
                    if (zzj7 == 1) {
                        zzeqVar.zzh(5);
                    } else if (zzj7 == 2) {
                        zzeqVar.zzh(12);
                    } else if (zzj7 == 3) {
                        int zzj8 = zzeqVar.zzj(5);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(5);
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(4);
                            }
                            if (zzeqVar.zzi()) {
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(4);
                                }
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(4);
                                }
                            }
                        }
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(5);
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(7);
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(8);
                                }
                            }
                        }
                        zzeqVar.zzh((zzj8 + 2) * 8);
                        zzeqVar.zzm();
                    }
                    if (i7 < 2) {
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(14);
                        }
                        if (zzj6 == 0 && zzeqVar.zzi()) {
                            zzeqVar.zzh(14);
                        }
                    }
                    if (zzeqVar.zzi()) {
                        if (i5 == 0) {
                            zzeqVar.zzh(5);
                            i8 = 0;
                            i5 = 0;
                        } else {
                            for (int i12 = 0; i12 < i6; i12++) {
                                if (zzeqVar.zzi()) {
                                    zzeqVar.zzh(5);
                                }
                            }
                        }
                    }
                    i8 = 0;
                }
            }
            if (zzeqVar.zzi()) {
                zzeqVar.zzh(5);
                if (i7 == 2) {
                    zzeqVar.zzh(4);
                    i7 = 2;
                }
                if (i7 >= 6) {
                    zzeqVar.zzh(2);
                }
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(8);
                }
                if (i7 == 0 && zzeqVar.zzi()) {
                    zzeqVar.zzh(8);
                }
                if (zzj4 < 3) {
                    zzeqVar.zzg();
                }
            }
            if (i8 == 0 && i5 != 3) {
                zzeqVar.zzg();
            }
            if (i8 == 2 && (i5 == 3 || zzeqVar.zzi())) {
                zzeqVar.zzh(6);
            }
            i3 = i6 * 256;
            str = (zzeqVar.zzi() && zzeqVar.zzj(6) == 1 && zzeqVar.zzj(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i11;
        } else {
            zzeqVar.zzh(32);
            int zzj9 = zzeqVar.zzj(2);
            String str2 = zzj9 == 3 ? null : "audio/ac3";
            int zzj10 = zzeqVar.zzj(6);
            int i13 = zzf[zzj10 / 2] * 1000;
            zzf2 = zzf(zzj9, zzj10);
            zzeqVar.zzh(8);
            int zzj11 = zzeqVar.zzj(3);
            if ((zzj11 & 1) != 0 && zzj11 != 1) {
                zzeqVar.zzh(2);
            }
            if ((zzj11 & 4) != 0) {
                zzeqVar.zzh(2);
            }
            if (zzj11 == 2) {
                zzeqVar.zzh(2);
            }
            i = zzj9 < 3 ? zzc[zzj9] : -1;
            i2 = zze[zzj11] + (zzeqVar.zzi() ? 1 : 0);
            i3 = 1536;
            str = str2;
            i4 = i13;
        }
        return new zzadu(str, i9, i2, i, zzf2, i3, i4, null);
    }

    public static int zzd(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return zzf((b & 192) >> 6, b & Utf8.REPLACEMENT_BYTE);
        }
        int i = bArr[2] & 7;
        int i2 = ((bArr[3] & 255) | (i << 8)) + 1;
        return i2 + i2;
    }

    public static int zze(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
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

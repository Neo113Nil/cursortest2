package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaga {
    public static final zzafy zza = new zzafy() { // from class: com.google.android.gms.internal.ads.zzafx
    };

    /* JADX WARN: Removed duplicated region for block: B:6:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzcb zza(byte[] bArr, int i, zzafy zzafyVar, zzafb zzafbVar) {
        zzafz zzafzVar;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        zzfj zzfjVar = new zzfj(bArr, i);
        boolean z2 = false;
        if (zzfjVar.zza() < 10) {
            zzez.zzf("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int zzn = zzfjVar.zzn();
            if (zzn == 4801587) {
                int zzl = zzfjVar.zzl();
                zzfjVar.zzH(1);
                int zzl2 = zzfjVar.zzl();
                int zzk = zzfjVar.zzk();
                if (zzl == 2) {
                    if ((zzl2 & 64) != 0) {
                        zzez.zzf("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    zzafzVar = new zzafz(zzl, zzl >= 4 && (zzl2 & 128) != 0, zzk);
                } else {
                    if (zzl == 3) {
                        if ((zzl2 & 64) != 0) {
                            int zzf = zzfjVar.zzf();
                            zzfjVar.zzH(zzf);
                            zzk -= zzf + 4;
                        }
                    } else if (zzl == 4) {
                        if ((zzl2 & 64) != 0) {
                            int zzk2 = zzfjVar.zzk();
                            zzfjVar.zzH(zzk2 - 4);
                            zzk -= zzk2;
                        }
                        if ((zzl2 & 16) != 0) {
                            zzk -= 10;
                        }
                    } else {
                        zzez.zzf("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + zzl);
                    }
                    zzafzVar = new zzafz(zzl, zzl >= 4 && (zzl2 & 128) != 0, zzk);
                }
                if (zzafzVar != null) {
                    return null;
                }
                int zzc = zzfjVar.zzc();
                i2 = zzafzVar.zza;
                int i9 = i2 == 2 ? 6 : 10;
                i3 = zzafzVar.zzc;
                z = zzafzVar.zzb;
                if (z) {
                    i8 = zzafzVar.zzc;
                    i3 = zze(zzfjVar, i8);
                }
                zzfjVar.zzF(zzc + i3);
                i4 = zzafzVar.zza;
                if (!zzk(zzfjVar, i4, i9, false)) {
                    i6 = zzafzVar.zza;
                    if (i6 != 4 || !zzk(zzfjVar, 4, i9, true)) {
                        i7 = zzafzVar.zza;
                        zzez.zzf("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + i7);
                        return null;
                    }
                    z2 = true;
                }
                while (zzfjVar.zza() >= i9) {
                    i5 = zzafzVar.zza;
                    zzagb zzf2 = zzf(i5, zzfjVar, z2, i9, zzafyVar);
                    if (zzf2 != null) {
                        arrayList.add(zzf2);
                    }
                }
                return new zzcb(arrayList);
            }
            zzez.zzf("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", Integer.valueOf(zzn)))));
        }
        zzafzVar = null;
        if (zzafzVar != null) {
        }
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int zzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            int i3 = zzd + 1;
            if ((zzd - i) % 2 == 0 && bArr[i3] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, i3);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zze(zzfj zzfjVar, int i) {
        byte[] zzI = zzfjVar.zzI();
        int zzc = zzfjVar.zzc();
        int i2 = zzc;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzc + i) {
                return i;
            }
            if ((zzI[i2] & 255) == 255 && zzI[i3] == 0) {
                System.arraycopy(zzI, i2 + 2, zzI, i3, (i - (i2 - zzc)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x026e, code lost:
    
        if (r9 == 67) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04f7 A[Catch: all -> 0x051c, TRY_LEAVE, TryCatch #1 {all -> 0x051c, blocks: (B:57:0x04f7, B:98:0x021a, B:109:0x0270, B:111:0x0282, B:115:0x02c7, B:117:0x02a4, B:119:0x02bd, B:131:0x0309, B:138:0x0350, B:141:0x0385, B:144:0x0396, B:145:0x039e, B:147:0x03a4, B:150:0x03ab, B:155:0x03af, B:162:0x03d1, B:165:0x03fc, B:167:0x0406, B:169:0x0439, B:170:0x0445, B:172:0x044b, B:175:0x0452, B:180:0x0456, B:183:0x046b, B:194:0x0496, B:196:0x04c0, B:198:0x04cf, B:199:0x04e6), top: B:46:0x00f4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzagb zzf(int i, zzfj zzfjVar, boolean z, int i2, zzafy zzafyVar) {
        int zzo;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        int i7;
        String str;
        int i8;
        int i9;
        int i10;
        int zzd;
        String zza2;
        int zzl = zzfjVar.zzl();
        int zzl2 = zzfjVar.zzl();
        int zzl3 = zzfjVar.zzl();
        int zzl4 = i >= 3 ? zzfjVar.zzl() : 0;
        if (i == 4) {
            zzo = zzfjVar.zzo();
            if (!z) {
                zzo = ((zzo >> 24) << 21) | (zzo & 255) | (((zzo >> 8) & 255) << 7) | (((zzo >> 16) & 255) << 14);
            }
        } else {
            zzo = i == 3 ? zzfjVar.zzo() : zzfjVar.zzn();
        }
        int zzp = i >= 3 ? zzfjVar.zzp() : 0;
        zzagb zzagbVar = null;
        if (zzl == 0 && zzl2 == 0 && zzl3 == 0 && zzl4 == 0 && zzo == 0 && zzp == 0) {
            zzfjVar.zzG(zzfjVar.zzd());
            return null;
        }
        int zzc = zzfjVar.zzc() + zzo;
        if (zzc > zzfjVar.zzd()) {
            zzez.zzf("Id3Decoder", "Frame size exceeds remaining tag data");
            zzfjVar.zzG(zzfjVar.zzd());
            return null;
        }
        if (zzafyVar != null) {
            zzfjVar.zzG(zzc);
            return null;
        }
        if (i == 3) {
            int i11 = zzp & 64;
            i3 = (zzp & 128) != 0 ? 1 : 0;
            boolean z5 = i11 != 0;
            z2 = (zzp & 32) != 0;
            z3 = z5;
            z4 = false;
            i4 = i3;
        } else if (i == 4) {
            boolean z6 = (zzp & 64) != 0;
            i4 = (zzp & 8) != 0 ? 1 : 0;
            z3 = (zzp & 4) != 0;
            z4 = (zzp & 2) != 0;
            int i12 = zzp & 1;
            z2 = z6;
            i3 = i12;
        } else {
            i3 = 0;
            z2 = false;
            i4 = 0;
            z3 = false;
            z4 = false;
        }
        if (i4 != 0 || z3) {
            zzez.zzf("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zzfjVar.zzG(zzc);
            return null;
        }
        if (z2) {
            zzfjVar.zzH(1);
            zzo--;
        }
        if (i3 != 0) {
            zzfjVar.zzH(4);
            zzo -= 4;
        }
        if (z4) {
            zzo = zze(zzfjVar, zzo);
        }
        try {
            try {
                if (zzl == 84 && zzl2 == 88 && zzl3 == 88 && (i == 2 || zzl4 == 88)) {
                    if (zzo > 0) {
                        int zzl5 = zzfjVar.zzl();
                        int i13 = zzo - 1;
                        byte[] bArr = new byte[i13];
                        zzfjVar.zzC(bArr, 0, i13);
                        int zzc2 = zzc(bArr, 0, zzl5);
                        zzagbVar = new zzagj("TXXX", new String(bArr, 0, zzc2, zzj(zzl5)), zzg(bArr, zzl5, zzc2 + zzb(zzl5)));
                    }
                } else if (zzl == 84) {
                    String zzi = zzi(i, 84, zzl2, zzl3, zzl4);
                    if (zzo > 0) {
                        int zzl6 = zzfjVar.zzl();
                        int i14 = zzo - 1;
                        byte[] bArr2 = new byte[i14];
                        zzfjVar.zzC(bArr2, 0, i14);
                        zzagj zzagjVar = new zzagj(zzi, null, zzg(bArr2, zzl6, 0));
                        i7 = zzl;
                        i10 = zzl2;
                        i9 = zzl3;
                        str = "Id3Decoder";
                        zzagbVar = zzagjVar;
                        i8 = zzl4;
                        i6 = zzc;
                        if (zzagbVar == null) {
                            zzez.zzf(str, "Failed to decode frame: id=" + zzi(i, i7, i10, i9, i8) + ", frameSize=" + zzo);
                        }
                        zzfjVar.zzG(i6);
                        return zzagbVar;
                    }
                } else {
                    if (zzl != 87) {
                        i5 = zzl;
                    } else if (zzl2 != 88 || zzl3 != 88 || (i != 2 && zzl4 != 88)) {
                        i5 = 87;
                    } else if (zzo > 0) {
                        int zzl7 = zzfjVar.zzl();
                        int i15 = zzo - 1;
                        byte[] bArr3 = new byte[i15];
                        zzfjVar.zzC(bArr3, 0, i15);
                        int zzc3 = zzc(bArr3, 0, zzl7);
                        String str2 = new String(bArr3, 0, zzc3, zzj(zzl7));
                        int zzb = zzc3 + zzb(zzl7);
                        zzagbVar = new zzagl("WXXX", str2, zzh(bArr3, zzb, zzd(bArr3, zzb), zzftl.zzb));
                    }
                    if (i5 != 87) {
                        if (i5 == 80) {
                            if (zzl2 == 82 && zzl3 == 73 && zzl4 == 86) {
                                byte[] bArr4 = new byte[zzo];
                                zzfjVar.zzC(bArr4, 0, zzo);
                                int zzd2 = zzd(bArr4, 0);
                                zzagbVar = new zzagh(new String(bArr4, 0, zzd2, zzftl.zzb), zzl(bArr4, zzd2 + 1, zzo));
                            } else {
                                i5 = 80;
                            }
                        }
                        if (i5 == 71) {
                            if (zzl2 == 69 && zzl3 == 79) {
                                if (zzl4 != 66 && i != 2) {
                                    i5 = 71;
                                }
                                int zzl8 = zzfjVar.zzl();
                                Charset zzj = zzj(zzl8);
                                int i16 = zzo - 1;
                                byte[] bArr5 = new byte[i16];
                                zzfjVar.zzC(bArr5, 0, i16);
                                int zzd3 = zzd(bArr5, 0);
                                i6 = zzc;
                                String str3 = new String(bArr5, 0, zzd3, zzftl.zzb);
                                int i17 = zzd3 + 1;
                                int zzc4 = zzc(bArr5, i17, zzl8);
                                String zzh = zzh(bArr5, i17, zzc4, zzj);
                                int zzb2 = zzc4 + zzb(zzl8);
                                int zzc5 = zzc(bArr5, zzb2, zzl8);
                                zzafw zzafwVar = new zzafw(str3, zzh, zzh(bArr5, zzb2, zzc5, zzj), zzl(bArr5, zzc5 + zzb(zzl8), i16));
                                i7 = zzl;
                                i10 = zzl2;
                                i9 = zzl3;
                                str = "Id3Decoder";
                                zzagbVar = zzafwVar;
                                i8 = zzl4;
                                if (zzagbVar == null) {
                                }
                                zzfjVar.zzG(i6);
                                return zzagbVar;
                            }
                            i6 = zzc;
                            i5 = 71;
                            if (i != 2) {
                                if (i5 == 80 && zzl2 == 73 && zzl3 == 67) {
                                    int zzl9 = zzfjVar.zzl();
                                    Charset zzj2 = zzj(zzl9);
                                    int i18 = zzo - 1;
                                    byte[] bArr6 = new byte[i18];
                                    zzfjVar.zzC(bArr6, 0, i18);
                                    if (i == 2) {
                                        zza2 = "image/".concat(String.valueOf(zzftf.zza(new String(bArr6, 0, 3, zzftl.zzb))));
                                        if ("image/jpg".equals(zza2)) {
                                            zza2 = "image/jpeg";
                                        }
                                        zzd = 2;
                                    } else {
                                        zzd = zzd(bArr6, 0);
                                        zza2 = zzftf.zza(new String(bArr6, 0, zzd, zzftl.zzb));
                                        if (zza2.indexOf(47) == -1) {
                                            zza2 = "image/".concat(String.valueOf(zza2));
                                        }
                                    }
                                    int i19 = bArr6[zzd + 1] & 255;
                                    int i20 = zzd + 2;
                                    int zzc6 = zzc(bArr6, i20, zzl9);
                                    str = "Id3Decoder";
                                    i7 = zzl;
                                    zzagbVar = new zzafm(zza2, new String(bArr6, i20, zzc6 - i20, zzj2), i19, zzl(bArr6, zzc6 + zzb(zzl9), i18));
                                    i10 = zzl2;
                                    i9 = zzl3;
                                    i8 = zzl4;
                                }
                                i7 = zzl;
                                str = "Id3Decoder";
                                if (i5 != 67 && zzl2 == 79 && zzl3 == 77 && (zzl4 == 77 || i == 2)) {
                                    if (zzo < 4) {
                                        i10 = zzl2;
                                        i9 = zzl3;
                                        i8 = zzl4;
                                        zzagbVar = null;
                                    } else {
                                        int zzl10 = zzfjVar.zzl();
                                        Charset zzj3 = zzj(zzl10);
                                        byte[] bArr7 = new byte[3];
                                        zzfjVar.zzC(bArr7, 0, 3);
                                        String str4 = new String(bArr7, 0, 3);
                                        int i21 = zzo - 4;
                                        byte[] bArr8 = new byte[i21];
                                        zzfjVar.zzC(bArr8, 0, i21);
                                        int zzc7 = zzc(bArr8, 0, zzl10);
                                        String str5 = new String(bArr8, 0, zzc7, zzj3);
                                        int zzb3 = zzc7 + zzb(zzl10);
                                        zzagbVar = new zzafu(str4, str5, zzh(bArr8, zzb3, zzc(bArr8, zzb3, zzl10), zzj3));
                                        i10 = zzl2;
                                        i9 = zzl3;
                                        i8 = zzl4;
                                    }
                                } else if (i5 != 67 && zzl2 == 72 && zzl3 == 65 && zzl4 == 80) {
                                    int zzc8 = zzfjVar.zzc();
                                    int zzd4 = zzd(zzfjVar.zzI(), zzc8);
                                    String str6 = new String(zzfjVar.zzI(), zzc8, zzd4 - zzc8, zzftl.zzb);
                                    zzfjVar.zzG(zzd4 + 1);
                                    int zzf = zzfjVar.zzf();
                                    int zzf2 = zzfjVar.zzf();
                                    long zzt = zzfjVar.zzt();
                                    if (zzt == 4294967295L) {
                                        zzt = -1;
                                    }
                                    long j = zzt;
                                    long zzt2 = zzfjVar.zzt();
                                    if (zzt2 == 4294967295L) {
                                        zzt2 = -1;
                                    }
                                    long j2 = zzt2;
                                    ArrayList arrayList = new ArrayList();
                                    int i22 = zzc8 + zzo;
                                    while (zzfjVar.zzc() < i22) {
                                        zzagb zzf3 = zzf(i, zzfjVar, z, i2, null);
                                        if (zzf3 != null) {
                                            arrayList.add(zzf3);
                                        }
                                    }
                                    zzagbVar = new zzafq(str6, zzf, zzf2, j, j2, (zzagb[]) arrayList.toArray(new zzagb[0]));
                                    i10 = zzl2;
                                    i9 = zzl3;
                                    i8 = zzl4;
                                } else if (i5 != 67 && zzl2 == 84 && zzl3 == 79 && zzl4 == 67) {
                                    int zzc9 = zzfjVar.zzc();
                                    int zzd5 = zzd(zzfjVar.zzI(), zzc9);
                                    String str7 = new String(zzfjVar.zzI(), zzc9, zzd5 - zzc9, zzftl.zzb);
                                    zzfjVar.zzG(zzd5 + 1);
                                    int zzl11 = zzfjVar.zzl();
                                    boolean z7 = (zzl11 & 2) != 0;
                                    int i23 = zzl11 & 1;
                                    int zzl12 = zzfjVar.zzl();
                                    String[] strArr = new String[zzl12];
                                    int i24 = 0;
                                    while (i24 < zzl12) {
                                        int zzc10 = zzfjVar.zzc();
                                        int zzd6 = zzd(zzfjVar.zzI(), zzc10);
                                        strArr[i24] = new String(zzfjVar.zzI(), zzc10, zzd6 - zzc10, zzftl.zzb);
                                        zzfjVar.zzG(zzd6 + 1);
                                        i24++;
                                        zzl12 = zzl12;
                                        zzl4 = zzl4;
                                        zzl3 = zzl3;
                                        zzl2 = zzl2;
                                    }
                                    int i25 = zzl2;
                                    int i26 = zzl3;
                                    int i27 = zzl4;
                                    ArrayList arrayList2 = new ArrayList();
                                    int i28 = zzc9 + zzo;
                                    while (zzfjVar.zzc() < i28) {
                                        zzagb zzf4 = zzf(i, zzfjVar, z, i2, null);
                                        if (zzf4 != null) {
                                            arrayList2.add(zzf4);
                                        }
                                    }
                                    zzagbVar = new zzafs(str7, z7, 1 == i23, strArr, (zzagb[]) arrayList2.toArray(new zzagb[0]));
                                    i8 = i27;
                                    i9 = i26;
                                    i10 = i25;
                                } else {
                                    int i29 = zzl4;
                                    if (i5 != 77) {
                                        i10 = zzl2;
                                        if (i10 == 76) {
                                            i9 = zzl3;
                                            i8 = i29;
                                            if (i9 == 76 && i8 == 84) {
                                                int zzp2 = zzfjVar.zzp();
                                                int zzn = zzfjVar.zzn();
                                                int zzn2 = zzfjVar.zzn();
                                                int zzl13 = zzfjVar.zzl();
                                                int zzl14 = zzfjVar.zzl();
                                                zzfi zzfiVar = new zzfi();
                                                zzfiVar.zzh(zzfjVar);
                                                int i30 = ((zzo - 10) * 8) / (zzl13 + zzl14);
                                                int[] iArr = new int[i30];
                                                int[] iArr2 = new int[i30];
                                                for (int i31 = 0; i31 < i30; i31++) {
                                                    int zzd7 = zzfiVar.zzd(zzl13);
                                                    int zzd8 = zzfiVar.zzd(zzl14);
                                                    iArr[i31] = zzd7;
                                                    iArr2[i31] = zzd8;
                                                }
                                                zzagbVar = new zzagf(zzp2, zzn, zzn2, iArr, iArr2);
                                            }
                                        } else {
                                            i8 = i29;
                                            i9 = zzl3;
                                        }
                                    } else {
                                        i8 = i29;
                                        i9 = zzl3;
                                        i10 = zzl2;
                                    }
                                    String zzi2 = zzi(i, i5, i10, i9, i8);
                                    byte[] bArr9 = new byte[zzo];
                                    zzfjVar.zzC(bArr9, 0, zzo);
                                    zzagbVar = new zzafo(zzi2, bArr9);
                                }
                            } else {
                                if (i5 == 65) {
                                    if (zzl2 == 80) {
                                        if (zzl3 == 73) {
                                        }
                                    }
                                }
                                i7 = zzl;
                                str = "Id3Decoder";
                                if (i5 != 67) {
                                }
                                if (i5 != 67) {
                                }
                                if (i5 != 67) {
                                }
                                int i292 = zzl4;
                                if (i5 != 77) {
                                }
                                String zzi22 = zzi(i, i5, i10, i9, i8);
                                byte[] bArr92 = new byte[zzo];
                                zzfjVar.zzC(bArr92, 0, zzo);
                                zzagbVar = new zzafo(zzi22, bArr92);
                            }
                            if (zzagbVar == null) {
                            }
                            zzfjVar.zzG(i6);
                            return zzagbVar;
                        }
                        i6 = zzc;
                        if (i != 2) {
                        }
                        if (zzagbVar == null) {
                        }
                        zzfjVar.zzG(i6);
                        return zzagbVar;
                    }
                    String zzi3 = zzi(i, 87, zzl2, zzl3, zzl4);
                    byte[] bArr10 = new byte[zzo];
                    zzfjVar.zzC(bArr10, 0, zzo);
                    zzagbVar = new zzagl(zzi3, null, new String(bArr10, 0, zzd(bArr10, 0), zzftl.zzb));
                }
                i7 = zzl;
                i10 = zzl2;
                i9 = zzl3;
                str = "Id3Decoder";
                i8 = zzl4;
                i6 = zzc;
                if (zzagbVar == null) {
                }
                zzfjVar.zzG(i6);
                return zzagbVar;
            } catch (Throwable th) {
                th = th;
                zzfjVar.zzG(zzc);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zzc = i6;
            zzfjVar.zzG(zzc);
            throw th;
        }
    }

    private static zzfwu zzg(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzfwu.zzm("");
        }
        zzfwr zzfwrVar = new zzfwr();
        int zzc = zzc(bArr, i2, i);
        while (i2 < zzc) {
            zzfwrVar.zzf(new String(bArr, i2, zzc - i2, zzj(i)));
            i2 = zzb(i) + zzc;
            zzc = zzc(bArr, i2, i);
        }
        zzfwu zzi = zzfwrVar.zzi();
        return zzi.isEmpty() ? zzfwu.zzm("") : zzi;
    }

    private static String zzh(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String zzi(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzk(zzfj zzfjVar, int i, int i2, boolean z) {
        boolean z2;
        int zzn;
        long zzn2;
        int i3;
        int i4;
        int zzc = zzfjVar.zzc();
        while (true) {
            try {
                z2 = true;
                z2 = true;
                int i5 = 1;
                int i6 = 1;
                if (zzfjVar.zza() >= i2) {
                    if (i >= 3) {
                        zzn = zzfjVar.zzf();
                        zzn2 = zzfjVar.zzt();
                        i3 = zzfjVar.zzp();
                    } else {
                        zzn = zzfjVar.zzn();
                        zzn2 = zzfjVar.zzn();
                        i3 = 0;
                    }
                    if (zzn == 0 && zzn2 == 0 && i3 == 0) {
                        break;
                    }
                    if (i == 4 && !z) {
                        if ((8421504 & zzn2) != 0) {
                            break;
                        }
                        zzn2 = ((zzn2 >> 24) << 21) | (((zzn2 >> 16) & 255) << 14) | (zzn2 & 255) | (((zzn2 >> 8) & 255) << 7);
                    }
                    if (i == 4) {
                        if ((i3 & 64) == 0) {
                            i5 = 0;
                        }
                        int i7 = i5;
                        i6 = i3 & 1;
                        i4 = i7;
                    } else if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                        if ((i3 & 128) == 0) {
                            i6 = 0;
                        }
                    } else {
                        i4 = 0;
                        i6 = 0;
                    }
                    if (i6 != 0) {
                        i4 += 4;
                    }
                    if (zzn2 >= i4 && zzfjVar.zza() >= zzn2) {
                        zzfjVar.zzH((int) zzn2);
                    }
                } else {
                    break;
                }
            } finally {
                zzfjVar.zzG(zzc);
            }
        }
        return z2;
    }

    private static byte[] zzl(byte[] bArr, int i, int i2) {
        return i2 <= i ? zzfs.zzf : Arrays.copyOfRange(bArr, i, i2);
    }

    private static Charset zzj(int i) {
        return i != 1 ? i != 2 ? i != 3 ? zzftl.zzb : zzftl.zzc : zzftl.zzd : zzftl.zzf;
    }
}

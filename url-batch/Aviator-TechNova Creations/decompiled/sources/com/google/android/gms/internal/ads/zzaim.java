package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaim {
    public static final zzaij zza = zzaik.zza;

    /* JADX WARN: Removed duplicated region for block: B:6:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzap zza(byte[] bArr, int i, zzaij zzaijVar, zzahw zzahwVar) {
        zzail zzailVar;
        ArrayList arrayList = new ArrayList();
        zzer zzerVar = new zzer(bArr, i);
        boolean z = false;
        if (zzerVar.zzd() < 10) {
            zzee.zzc("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int zzx = zzerVar.zzx();
            if (zzx == 4801587) {
                int zzs = zzerVar.zzs();
                zzerVar.zzk(1);
                int zzs2 = zzerVar.zzs();
                int zzG = zzerVar.zzG();
                if (zzs == 2) {
                    if ((zzs2 & 64) != 0) {
                        zzee.zzc("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    zzailVar = new zzail(zzs, zzs >= 4 && (zzs2 & 128) != 0, zzG);
                } else {
                    if (zzs == 3) {
                        if ((zzs2 & 64) != 0) {
                            int zzB = zzerVar.zzB();
                            zzerVar.zzk(zzB);
                            zzG -= zzB + 4;
                        }
                    } else if (zzs == 4) {
                        if ((zzs2 & 64) != 0) {
                            int zzG2 = zzerVar.zzG();
                            zzerVar.zzk(zzG2 - 4);
                            zzG -= zzG2;
                        }
                        if ((zzs2 & 16) != 0) {
                            zzG -= 10;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(zzs).length() + 46);
                        sb.append("Skipped ID3 tag with unsupported majorVersion=");
                        sb.append(zzs);
                        zzee.zzc("Id3Decoder", sb.toString());
                    }
                    zzailVar = new zzail(zzs, zzs >= 4 && (zzs2 & 128) != 0, zzG);
                }
                if (zzailVar != null) {
                    return null;
                }
                int zzg = zzerVar.zzg();
                int i2 = zzailVar.zza() == 2 ? 6 : 10;
                boolean zzb = zzailVar.zzb();
                int zzc = zzailVar.zzc();
                if (zzb) {
                    zzc = zze(zzerVar, zzailVar.zzc());
                }
                zzerVar.zzf(zzg + zzc);
                if (!zzb(zzerVar, zzailVar.zza(), i2, false)) {
                    if (zzailVar.zza() != 4 || !zzb(zzerVar, 4, i2, true)) {
                        int zza2 = zzailVar.zza();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(zza2).length() + 45);
                        sb2.append("Failed to validate ID3 tag with majorVersion=");
                        sb2.append(zza2);
                        zzee.zzc("Id3Decoder", sb2.toString());
                        return null;
                    }
                    z = true;
                }
                while (zzerVar.zzd() >= i2) {
                    zzain zzc2 = zzc(zzailVar.zza(), zzerVar, z, i2, zzaijVar);
                    if (zzc2 != null) {
                        arrayList.add(zzc2);
                    }
                }
                return new zzap(arrayList);
            }
            String format = String.format("%06X", Integer.valueOf(zzx));
            String.valueOf(format);
            zzee.zzc("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(format)));
        }
        zzailVar = null;
        if (zzailVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzb(zzer zzerVar, int i, int i2, boolean z) {
        boolean z2;
        int zzx;
        long zzx2;
        int i3;
        int i4;
        int zzg = zzerVar.zzg();
        while (true) {
            try {
                z2 = true;
                z2 = true;
                int i5 = 1;
                int i6 = 1;
                if (zzerVar.zzd() >= i2) {
                    if (i >= 3) {
                        zzx = zzerVar.zzB();
                        zzx2 = zzerVar.zzz();
                        i3 = zzerVar.zzt();
                    } else {
                        zzx = zzerVar.zzx();
                        zzx2 = zzerVar.zzx();
                        i3 = 0;
                    }
                    if (zzx == 0 && zzx2 == 0 && i3 == 0) {
                        break;
                    }
                    if (i == 4 && !z) {
                        if ((8421504 & zzx2) != 0) {
                            break;
                        }
                        zzx2 = ((zzx2 >> 24) << 21) | (((zzx2 >> 16) & 255) << 14) | (zzx2 & 255) | (((zzx2 >> 8) & 255) << 7);
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
                    if (zzx2 >= i4 && zzerVar.zzd() >= zzx2) {
                        zzerVar.zzk((int) zzx2);
                    }
                } else {
                    break;
                }
            } finally {
                zzerVar.zzh(zzg);
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:216:0x0287, code lost:
    
        if (r9 == 67) goto L153;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0507  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzain zzc(int i, zzer zzerVar, boolean z, int i2, zzaij zzaijVar) {
        int zzH;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        String str;
        zzain zzainVar;
        int i6;
        zzain zzaieVar;
        zzain zzaiqVar;
        zzain zzainVar2;
        int zzi;
        String str2;
        int zzs = zzerVar.zzs();
        int zzs2 = zzerVar.zzs();
        int zzs3 = zzerVar.zzs();
        int zzs4 = i >= 3 ? zzerVar.zzs() : 0;
        if (i == 4) {
            zzH = zzerVar.zzH();
            if (!z) {
                zzH = ((zzH >> 24) << 21) | (zzH & 255) | (((zzH >> 8) & 255) << 7) | (((zzH >> 16) & 255) << 14);
            }
        } else {
            zzH = i == 3 ? zzerVar.zzH() : zzerVar.zzx();
        }
        int zzt = i >= 3 ? zzerVar.zzt() : 0;
        if (zzs == 0 && zzs2 == 0 && zzs3 == 0 && zzs4 == 0 && zzH == 0 && zzt == 0) {
            zzerVar.zzh(zzerVar.zze());
            return null;
        }
        int zzg = zzerVar.zzg() + zzH;
        if (zzg > zzerVar.zze()) {
            zzee.zzc("Id3Decoder", "Frame size exceeds remaining tag data");
            zzerVar.zzh(zzerVar.zze());
            return null;
        }
        if (zzaijVar != null) {
            zzerVar.zzh(zzg);
            return null;
        }
        if (i == 3) {
            int i7 = zzt & 64;
            i3 = (zzt & 128) != 0 ? 1 : 0;
            i5 = 0;
            z3 = i7 != 0;
            z2 = (zzt & 32) != 0;
            i4 = i3;
        } else if (i == 4) {
            boolean z4 = (zzt & 64) != 0;
            int i8 = (zzt & 8) != 0 ? 1 : 0;
            z3 = (zzt & 4) != 0;
            i5 = (zzt & 2) != 0 ? 1 : 0;
            i4 = zzt & 1;
            int i9 = i8;
            z2 = z4;
            i3 = i9;
        } else {
            i3 = 0;
            i4 = 0;
            z2 = false;
            z3 = false;
            i5 = 0;
        }
        if (i3 != 0 || z3) {
            zzee.zzc("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zzerVar.zzh(zzg);
            return null;
        }
        if (z2) {
            zzerVar.zzk(1);
            zzH--;
        }
        if (i4 != 0) {
            zzerVar.zzk(4);
            zzH -= 4;
        }
        if (i5 != 0) {
            zzH = zze(zzerVar, zzH);
        }
        try {
            try {
                if (zzs == 84 && zzs2 == 88 && zzs3 == 88 && (i == 2 || zzs4 == 88)) {
                    if (zzH > 0) {
                        int zzs5 = zzerVar.zzs();
                        int i10 = zzH - 1;
                        byte[] bArr = new byte[i10];
                        zzerVar.zzm(bArr, 0, i10);
                        int zzh = zzh(bArr, 0, zzs5);
                        zzainVar2 = new zzais("TXXX", new String(bArr, 0, zzh, zzf(zzs5)), zzd(bArr, zzs5, zzh + zzj(zzs5)));
                        i5 = zzs;
                        str = "Id3Decoder";
                        zzerVar.zzh(zzg);
                        zzainVar = zzainVar2;
                        e = null;
                    }
                    i5 = zzs;
                    str = "Id3Decoder";
                    zzainVar2 = null;
                    zzerVar.zzh(zzg);
                    zzainVar = zzainVar2;
                    e = null;
                } else if (zzs == 84) {
                    String zzg2 = zzg(i, 84, zzs2, zzs3, zzs4);
                    if (zzH > 0) {
                        int zzs6 = zzerVar.zzs();
                        int i11 = zzH - 1;
                        byte[] bArr2 = new byte[i11];
                        zzerVar.zzm(bArr2, 0, i11);
                        i5 = zzs;
                        zzainVar2 = new zzais(zzg2, null, zzd(bArr2, zzs6, 0));
                        str = "Id3Decoder";
                        zzerVar.zzh(zzg);
                        zzainVar = zzainVar2;
                        e = null;
                    }
                    i5 = zzs;
                    str = "Id3Decoder";
                    zzainVar2 = null;
                    zzerVar.zzh(zzg);
                    zzainVar = zzainVar2;
                    e = null;
                } else {
                    if (zzs != 87) {
                        i6 = zzs;
                    } else if (zzs2 != 88 || zzs3 != 88 || (i != 2 && zzs4 != 88)) {
                        i6 = 87;
                    } else if (zzH <= 0) {
                        i5 = zzs;
                        str = "Id3Decoder";
                        zzainVar2 = null;
                        zzerVar.zzh(zzg);
                        zzainVar = zzainVar2;
                        e = null;
                    } else {
                        int zzs7 = zzerVar.zzs();
                        int i12 = zzH - 1;
                        byte[] bArr3 = new byte[i12];
                        zzerVar.zzm(bArr3, 0, i12);
                        int zzh2 = zzh(bArr3, 0, zzs7);
                        String str3 = new String(bArr3, 0, zzh2, zzf(zzs7));
                        int zzj = zzh2 + zzj(zzs7);
                        zzainVar2 = new zzait("WXXX", str3, zzl(bArr3, zzj, zzi(bArr3, zzj), StandardCharsets.ISO_8859_1));
                        i5 = zzs;
                        str = "Id3Decoder";
                        zzerVar.zzh(zzg);
                        zzainVar = zzainVar2;
                        e = null;
                    }
                    if (i6 == 87) {
                        String zzg3 = zzg(i, 87, zzs2, zzs3, zzs4);
                        byte[] bArr4 = new byte[zzH];
                        zzerVar.zzm(bArr4, 0, zzH);
                        zzainVar2 = new zzait(zzg3, null, new String(bArr4, 0, zzi(bArr4, 0), StandardCharsets.ISO_8859_1));
                    } else {
                        if (i6 == 80) {
                            if (zzs2 == 82 && zzs3 == 73 && zzs4 == 86) {
                                byte[] bArr5 = new byte[zzH];
                                zzerVar.zzm(bArr5, 0, zzH);
                                int zzi2 = zzi(bArr5, 0);
                                zzainVar2 = new zzair(new String(bArr5, 0, zzi2, StandardCharsets.ISO_8859_1), zzk(bArr5, zzi2 + 1, zzH));
                            } else {
                                i6 = 80;
                            }
                        }
                        try {
                        } catch (Exception e) {
                            e = e;
                        } catch (OutOfMemoryError e2) {
                            e = e2;
                        }
                        try {
                            if (i6 == 71) {
                                if (zzs2 != 69 || zzs3 != 79) {
                                    str = "Id3Decoder";
                                    i6 = 71;
                                    if (i != 2) {
                                        if (i6 == 80 && zzs2 == 73 && zzs3 == 67) {
                                            int zzs8 = zzerVar.zzs();
                                            Charset zzf = zzf(zzs8);
                                            int i13 = zzH - 1;
                                            byte[] bArr6 = new byte[i13];
                                            zzerVar.zzm(bArr6, 0, i13);
                                            if (i == 2) {
                                                i5 = zzs;
                                                String zza2 = zzgql.zza(new String(bArr6, 0, 3, StandardCharsets.ISO_8859_1));
                                                String.valueOf(zza2);
                                                str2 = "image/".concat(String.valueOf(zza2));
                                                if ("image/jpg".equals(str2)) {
                                                    str2 = "image/jpeg";
                                                }
                                                zzi = 2;
                                            } else {
                                                i5 = zzs;
                                                zzi = zzi(bArr6, 0);
                                                String zza3 = zzgql.zza(new String(bArr6, 0, zzi, StandardCharsets.ISO_8859_1));
                                                if (zza3.indexOf(47) == -1) {
                                                    String.valueOf(zza3);
                                                    str2 = "image/".concat(String.valueOf(zza3));
                                                } else {
                                                    str2 = zza3;
                                                }
                                            }
                                            int i14 = bArr6[zzi + 1] & 255;
                                            int i15 = zzi + 2;
                                            int zzh3 = zzh(bArr6, i15, zzs8);
                                            zzaieVar = new zzaid(str2, new String(bArr6, i15, zzh3 - i15, zzf), i14, zzk(bArr6, zzh3 + zzj(zzs8), i13));
                                            zzainVar2 = zzaieVar;
                                            zzerVar.zzh(zzg);
                                            zzainVar = zzainVar2;
                                            e = null;
                                        }
                                        i5 = zzs;
                                        if (i6 == 67 || zzs2 != 79 || zzs3 != 77 || (zzs4 != 77 && i != 2)) {
                                            if (i6 != 67 && zzs2 == 72 && zzs3 == 65 && zzs4 == 80) {
                                                int zzg4 = zzerVar.zzg();
                                                int zzi3 = zzi(zzerVar.zzi(), zzg4);
                                                String str4 = new String(zzerVar.zzi(), zzg4, zzi3 - zzg4, StandardCharsets.ISO_8859_1);
                                                zzerVar.zzh(zzi3 + 1);
                                                int zzB = zzerVar.zzB();
                                                int zzB2 = zzerVar.zzB();
                                                long zzz = zzerVar.zzz();
                                                if (zzz == 4294967295L) {
                                                    zzz = -1;
                                                }
                                                long j = zzz;
                                                long zzz2 = zzerVar.zzz();
                                                if (zzz2 == 4294967295L) {
                                                    zzz2 = -1;
                                                }
                                                long j2 = zzz2;
                                                ArrayList arrayList = new ArrayList();
                                                int i16 = zzg4 + zzH;
                                                while (zzerVar.zzg() < i16) {
                                                    zzain zzc = zzc(i, zzerVar, z, i2, null);
                                                    if (zzc != null) {
                                                        arrayList.add(zzc);
                                                    }
                                                }
                                                zzaiqVar = new zzaif(str4, zzB, zzB2, j, j2, (zzain[]) arrayList.toArray(new zzain[0]));
                                            } else if (i6 != 67 && zzs2 == 84 && zzs3 == 79 && zzs4 == 67) {
                                                int zzg5 = zzerVar.zzg();
                                                int zzi4 = zzi(zzerVar.zzi(), zzg5);
                                                String str5 = new String(zzerVar.zzi(), zzg5, zzi4 - zzg5, StandardCharsets.ISO_8859_1);
                                                zzerVar.zzh(zzi4 + 1);
                                                int zzs9 = zzerVar.zzs();
                                                boolean z5 = (zzs9 & 2) != 0;
                                                int i17 = zzs9 & 1;
                                                int zzs10 = zzerVar.zzs();
                                                String[] strArr = new String[zzs10];
                                                int i18 = 0;
                                                while (i18 < zzs10) {
                                                    int zzg6 = zzerVar.zzg();
                                                    int i19 = zzg5;
                                                    int zzi5 = zzi(zzerVar.zzi(), zzg6);
                                                    String[] strArr2 = strArr;
                                                    strArr2[i18] = new String(zzerVar.zzi(), zzg6, zzi5 - zzg6, StandardCharsets.ISO_8859_1);
                                                    zzerVar.zzh(zzi5 + 1);
                                                    i18++;
                                                    zzg5 = i19;
                                                    zzs10 = zzs10;
                                                    str5 = str5;
                                                    strArr = strArr2;
                                                }
                                                int i20 = zzg5;
                                                String str6 = str5;
                                                String[] strArr3 = strArr;
                                                ArrayList arrayList2 = new ArrayList();
                                                int i21 = i20 + zzH;
                                                while (zzerVar.zzg() < i21) {
                                                    zzain zzc2 = zzc(i, zzerVar, z, i2, null);
                                                    if (zzc2 != null) {
                                                        arrayList2.add(zzc2);
                                                    }
                                                }
                                                zzaiqVar = new zzaig(str6, z5, 1 == i17, strArr3, (zzain[]) arrayList2.toArray(new zzain[0]));
                                            } else if (i6 != 77 && zzs2 == 76 && zzs3 == 76 && zzs4 == 84) {
                                                int zzt2 = zzerVar.zzt();
                                                int zzx = zzerVar.zzx();
                                                int zzx2 = zzerVar.zzx();
                                                int zzs11 = zzerVar.zzs();
                                                int zzs12 = zzerVar.zzs();
                                                zzeq zzeqVar = new zzeq();
                                                zzeqVar.zza(zzerVar);
                                                int i22 = ((zzH - 10) * 8) / (zzs11 + zzs12);
                                                int[] iArr = new int[i22];
                                                int[] iArr2 = new int[i22];
                                                for (int i23 = 0; i23 < i22; i23++) {
                                                    int zzj2 = zzeqVar.zzj(zzs11);
                                                    int zzj3 = zzeqVar.zzj(zzs12);
                                                    iArr[i23] = zzj2;
                                                    iArr2[i23] = zzj3;
                                                }
                                                zzaiqVar = new zzaiq(zzt2, zzx, zzx2, iArr, iArr2);
                                            } else {
                                                String zzg7 = zzg(i, i6, zzs2, zzs3, zzs4);
                                                byte[] bArr7 = new byte[zzH];
                                                zzerVar.zzm(bArr7, 0, zzH);
                                                zzaieVar = new zzaie(zzg7, bArr7);
                                                zzainVar2 = zzaieVar;
                                            }
                                            zzainVar2 = zzaiqVar;
                                        } else if (zzH < 4) {
                                            zzainVar2 = null;
                                        } else {
                                            int zzs13 = zzerVar.zzs();
                                            Charset zzf2 = zzf(zzs13);
                                            byte[] bArr8 = new byte[3];
                                            zzerVar.zzm(bArr8, 0, 3);
                                            String str7 = new String(bArr8, 0, 3);
                                            int i24 = zzH - 4;
                                            byte[] bArr9 = new byte[i24];
                                            zzerVar.zzm(bArr9, 0, i24);
                                            int zzh4 = zzh(bArr9, 0, zzs13);
                                            String str8 = new String(bArr9, 0, zzh4, zzf2);
                                            int zzj4 = zzh4 + zzj(zzs13);
                                            zzainVar2 = new zzaih(str7, str8, zzl(bArr9, zzj4, zzh(bArr9, zzj4, zzs13), zzf2));
                                        }
                                        zzerVar.zzh(zzg);
                                        zzainVar = zzainVar2;
                                        e = null;
                                    } else {
                                        if (i6 == 65) {
                                            if (zzs2 == 80) {
                                                if (zzs3 == 73) {
                                                }
                                            }
                                        }
                                        i5 = zzs;
                                        if (i6 == 67) {
                                        }
                                        if (i6 != 67) {
                                        }
                                        if (i6 != 67) {
                                        }
                                        if (i6 != 77) {
                                        }
                                        String zzg72 = zzg(i, i6, zzs2, zzs3, zzs4);
                                        byte[] bArr72 = new byte[zzH];
                                        zzerVar.zzm(bArr72, 0, zzH);
                                        zzaieVar = new zzaie(zzg72, bArr72);
                                        zzainVar2 = zzaieVar;
                                        zzerVar.zzh(zzg);
                                        zzainVar = zzainVar2;
                                        e = null;
                                    }
                                } else if (zzs4 == 66 || i == 2) {
                                    try {
                                        int zzs14 = zzerVar.zzs();
                                        Charset zzf3 = zzf(zzs14);
                                        int i25 = zzH - 1;
                                        byte[] bArr10 = new byte[i25];
                                        zzerVar.zzm(bArr10, 0, i25);
                                        int zzi6 = zzi(bArr10, 0);
                                        str = "Id3Decoder";
                                        String zzh5 = zzas.zzh(new String(bArr10, 0, zzi6, StandardCharsets.ISO_8859_1));
                                        int i26 = zzi6 + 1;
                                        int zzh6 = zzh(bArr10, i26, zzs14);
                                        String zzl = zzl(bArr10, i26, zzh6, zzf3);
                                        int zzj5 = zzh6 + zzj(zzs14);
                                        int zzh7 = zzh(bArr10, zzj5, zzs14);
                                        i5 = zzs;
                                        zzainVar2 = new zzaii(zzh5, zzl, zzl(bArr10, zzj5, zzh7, zzf3), zzk(bArr10, zzh7 + zzj(zzs14), i25));
                                        zzerVar.zzh(zzg);
                                        zzainVar = zzainVar2;
                                        e = null;
                                    } catch (Exception e3) {
                                        e = e3;
                                        str = "Id3Decoder";
                                        i5 = zzs;
                                        zzerVar.zzh(zzg);
                                        zzainVar = null;
                                        if (zzainVar == null) {
                                        }
                                        return zzainVar;
                                    } catch (OutOfMemoryError e4) {
                                        e = e4;
                                        str = "Id3Decoder";
                                        i5 = zzs;
                                        zzerVar.zzh(zzg);
                                        zzainVar = null;
                                        if (zzainVar == null) {
                                        }
                                        return zzainVar;
                                    }
                                } else {
                                    i6 = 71;
                                }
                            }
                            if (i != 2) {
                            }
                        } catch (Exception e5) {
                            e = e5;
                            zzerVar.zzh(zzg);
                            zzainVar = null;
                            if (zzainVar == null) {
                            }
                            return zzainVar;
                        } catch (OutOfMemoryError e6) {
                            e = e6;
                            zzerVar.zzh(zzg);
                            zzainVar = null;
                            if (zzainVar == null) {
                            }
                            return zzainVar;
                        }
                        str = "Id3Decoder";
                    }
                    i5 = zzs;
                    str = "Id3Decoder";
                    zzerVar.zzh(zzg);
                    zzainVar = zzainVar2;
                    e = null;
                }
            } catch (Throwable th) {
                zzerVar.zzh(zzg);
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            i5 = zzs;
            str = "Id3Decoder";
            zzerVar.zzh(zzg);
            zzainVar = null;
            if (zzainVar == null) {
            }
            return zzainVar;
        } catch (OutOfMemoryError e8) {
            e = e8;
            i5 = zzs;
            str = "Id3Decoder";
            zzerVar.zzh(zzg);
            zzainVar = null;
            if (zzainVar == null) {
            }
            return zzainVar;
        }
        if (zzainVar == null) {
            String zzg8 = zzg(i, i5, zzs2, zzs3, zzs4);
            StringBuilder sb = new StringBuilder(String.valueOf(zzg8).length() + 39 + String.valueOf(zzH).length());
            sb.append("Failed to decode frame: id=");
            sb.append(zzg8);
            sb.append(", frameSize=");
            sb.append(zzH);
            zzee.zzd(str, sb.toString(), e);
        }
        return zzainVar;
    }

    private static zzguf zzd(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzguf.zzj("");
        }
        int i3 = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        int zzh = zzh(bArr, i2, i);
        while (i2 < zzh) {
            zzgucVar.zzf(new String(bArr, i2, zzh - i2, zzf(i)));
            i2 = zzj(i) + zzh;
            zzh = zzh(bArr, i2, i);
        }
        zzguf zzi = zzgucVar.zzi();
        return zzi.isEmpty() ? zzguf.zzj("") : zzi;
    }

    private static int zze(zzer zzerVar, int i) {
        byte[] zzi = zzerVar.zzi();
        int zzg = zzerVar.zzg();
        int i2 = zzg;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzg + i) {
                return i;
            }
            if ((zzi[i2] & 255) == 255 && zzi[i3] == 0) {
                System.arraycopy(zzi, i2 + 2, zzi, i3, (i - (i2 - zzg)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static String zzg(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int zzh(byte[] bArr, int i, int i2) {
        int zzi = zzi(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzi;
        }
        while (true) {
            int length = bArr.length;
            if (zzi >= length - 1) {
                return length;
            }
            int i3 = zzi + 1;
            if ((zzi - i) % 2 == 0 && bArr[i3] == 0) {
                return zzi;
            }
            zzi = zzi(bArr, i3);
        }
    }

    private static int zzi(byte[] bArr, int i) {
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

    private static int zzj(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static byte[] zzk(byte[] bArr, int i, int i2) {
        return i2 <= i ? zzfj.zzb : Arrays.copyOfRange(bArr, i, i2);
    }

    private static String zzl(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static Charset zzf(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }
}

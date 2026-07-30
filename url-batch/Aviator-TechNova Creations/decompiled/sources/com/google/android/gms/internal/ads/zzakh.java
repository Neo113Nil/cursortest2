package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.work.WorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzakh {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzfj.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        if (r24 == 0) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0e2b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0e5f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0c16  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0c18  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0dc0  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0dc4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:586:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List zzb(zzfu zzfuVar, zzafn zzafnVar, long j, zzq zzqVar, boolean z, boolean z2, zzgqt zzgqtVar, boolean z3) throws zzat {
        int i;
        long j2;
        int i2;
        int i3;
        int i4;
        boolean z4;
        int i5;
        long j3;
        long j4;
        long zzt;
        int i6;
        int zza2;
        int i7;
        zzfu zzfuVar2;
        long j5;
        long j6;
        int i8;
        int i9;
        String str;
        zzfv zzc;
        ArrayList arrayList;
        zzfu zzfuVar3;
        long[] jArr;
        long[] jArr2;
        zzv zzvVar;
        zzgqt zzgqtVar2;
        zzalc zzalcVar;
        Pair zzn;
        int i10;
        boolean z5;
        short s;
        short s2;
        int i11;
        int i12;
        long j7;
        int i13;
        ArrayList arrayList2;
        String str2;
        zzq zzqVar2;
        int i14;
        String str3;
        long j8;
        int i15;
        char c;
        int i16;
        int i17;
        String str4;
        zzakd zzakdVar;
        int i18;
        int i19;
        int i20;
        boolean z6;
        zzakd zzakdVar2;
        String str5;
        int i21;
        int i22;
        int i23;
        int i24;
        zzgj zzgjVar;
        int i25;
        zzguf zzgufVar;
        boolean z7;
        char c2;
        int i26;
        int i27;
        boolean z8;
        int i28;
        String str6;
        zzgj zzgjVar2;
        boolean z9;
        int i29;
        int i30;
        int i31;
        boolean z10;
        boolean z11;
        zzq zzqVar3;
        int i32;
        zzguf zzgufVar2;
        String str7;
        zzguf zzgufVar3;
        String str8;
        long j9;
        boolean z12;
        zzalc zzalcVar2;
        ArrayList arrayList3;
        zzfu zzfuVar4 = zzfuVar;
        ArrayList arrayList4 = new ArrayList();
        int i33 = 0;
        while (true) {
            List list = zzfuVar4.zzc;
            if (i33 >= list.size()) {
                return arrayList4;
            }
            zzfu zzfuVar5 = (zzfu) list.get(i33);
            if (zzfuVar5.zzd != 1953653099) {
                arrayList3 = arrayList4;
                i = i33;
            } else {
                zzfv zzc2 = zzfuVar4.zzc(1836476516);
                zzc2.getClass();
                zzfu zzd = zzfuVar5.zzd(1835297121);
                zzd.getClass();
                zzfv zzc3 = zzd.zzc(1751411826);
                zzc3.getClass();
                int zzi = zzi(zzc3.zza);
                int i34 = zzi == 1936684398 ? 1 : zzi == 1986618469 ? 2 : (zzi == 1952807028 || zzi == 1935832172 || zzi == 1937072756 || zzi == 1668047728 || zzi == 1937072752) ? 3 : zzi == 1835365473 ? 5 : -1;
                if (i34 == -1) {
                    zzgqtVar2 = zzgqtVar;
                    arrayList = arrayList4;
                    i = i33;
                    zzfuVar3 = zzfuVar5;
                } else {
                    zzfv zzc4 = zzfuVar5.zzc(1953196132);
                    zzc4.getClass();
                    zzer zzerVar = zzc4.zza;
                    int i35 = 8;
                    zzerVar.zzh(8);
                    int zza3 = zza(zzerVar.zzB());
                    zzerVar.zzk(zza3 == 0 ? 8 : 16);
                    int zzB = zzerVar.zzB();
                    char c3 = 0;
                    int i36 = 4;
                    zzerVar.zzk(4);
                    int zzg = zzerVar.zzg();
                    int i37 = 0;
                    while (true) {
                        if (zza3 == 0) {
                            i35 = i36;
                        }
                        i = i33;
                        if (i37 >= i35) {
                            zzerVar.zzk(i35);
                            break;
                        }
                        if (zzerVar.zzi()[zzg + i37] != -1) {
                            j2 = zza3 == 0 ? zzerVar.zzz() : zzerVar.zzJ();
                        } else {
                            i37++;
                            i33 = i;
                            i35 = 8;
                            i36 = 4;
                        }
                    }
                    j2 = -9223372036854775807L;
                    zzerVar.zzk(10);
                    int zzt2 = zzerVar.zzt();
                    zzerVar.zzk(4);
                    int zzB2 = zzerVar.zzB();
                    int zzB3 = zzerVar.zzB();
                    zzerVar.zzk(4);
                    int zzB4 = zzerVar.zzB();
                    int zzB5 = zzerVar.zzB();
                    if (zzB2 == 0) {
                        if (zzB3 == 65536) {
                            if (zzB4 != -65536) {
                                if (zzB4 == 65536) {
                                    z12 = zzB5 != 0;
                                    zzB4 = 65536;
                                }
                                zzB3 = 65536;
                            } else {
                                z12 = zzB5 != 0;
                            }
                            if (true != z12) {
                                i5 = 90;
                                i4 = i5;
                                i2 = 1;
                                zzerVar.zzk(16);
                                short zzv = zzerVar.zzv();
                                zzerVar.zzk(2);
                                short zzv2 = zzerVar.zzv();
                                j3 = j == -9223372036854775807L ? j2 : j;
                                long j10 = zzd(zzc2.zza).zzc;
                                if (j3 == -9223372036854775807L) {
                                    j4 = j10;
                                    zzt = -9223372036854775807L;
                                } else {
                                    j4 = j10;
                                    zzt = zzfj.zzt(j3, 1000000L, j4, RoundingMode.DOWN);
                                }
                                zzfu zzd2 = zzd.zzd(1835626086);
                                zzd2.getClass();
                                zzfu zzd3 = zzd2.zzd(1937007212);
                                zzd3.getClass();
                                zzfv zzc5 = zzd.zzc(1835296868);
                                zzc5.getClass();
                                zzer zzerVar2 = zzc5.zza;
                                i6 = 8;
                                zzerVar2.zzh(8);
                                zza2 = zza(zzerVar2.zzB());
                                zzerVar2.zzk(zza2 == 0 ? 8 : 16);
                                long zzz = zzerVar2.zzz();
                                int zzg2 = zzerVar2.zzg();
                                i7 = 0;
                                while (true) {
                                    if (zza2 == 0) {
                                        i6 = 4;
                                    }
                                    if (i7 >= i6) {
                                        zzfuVar2 = zzfuVar5;
                                        j5 = zzz;
                                        zzerVar2.zzk(i6);
                                        j6 = -9223372036854775807L;
                                        break;
                                    }
                                    if (zzerVar2.zzi()[zzg2 + i7] != -1) {
                                        long zzz2 = zza2 == 0 ? zzerVar2.zzz() : zzerVar2.zzJ();
                                        if (zzz2 == 0) {
                                            zzfuVar2 = zzfuVar5;
                                            j6 = -9223372036854775807L;
                                        } else {
                                            j6 = zzfj.zzt(zzz2, 1000000L, zzz, RoundingMode.DOWN);
                                            zzfuVar2 = zzfuVar5;
                                        }
                                        j5 = zzz;
                                    } else {
                                        i7++;
                                        zzfuVar5 = zzfuVar5;
                                        i6 = 8;
                                    }
                                }
                                int zzt3 = zzerVar2.zzt();
                                char c4 = (char) (((zzt3 >> 10) & 31) + 96);
                                char c5 = (char) (((zzt3 >> 5) & 31) + 96);
                                char c6 = (char) ((zzt3 & 31) + 96);
                                char[] cArr = new char[3];
                                cArr[0] = c4;
                                cArr[i2] = c5;
                                char c7 = 2;
                                cArr[2] = c6;
                                i9 = 0;
                                for (i8 = 3; i9 < i8; i8 = 3) {
                                    char c8 = cArr[i9];
                                    if (c8 < 'a' || c8 > 'z') {
                                        str = null;
                                        break;
                                    }
                                    i9++;
                                }
                                str = new String(cArr);
                                zzc = zzd3.zzc(1937011556);
                                if (zzc == null) {
                                    zzee.zzc("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                                    zzgqtVar2 = zzgqtVar;
                                    arrayList = arrayList4;
                                    zzfuVar3 = zzfuVar2;
                                } else {
                                    long j11 = j6;
                                    String zzc6 = zzaka.zzc(j5, j11, str);
                                    zzer zzerVar3 = zzc.zza;
                                    zzerVar3.zzh(12);
                                    int zzB6 = zzerVar3.zzB();
                                    zzakd zzakdVar3 = new zzakd(zzB6);
                                    int i38 = zzt2;
                                    int i39 = 0;
                                    while (i39 < zzB6) {
                                        int i40 = i34;
                                        int zzg3 = zzerVar3.zzg();
                                        int zzB7 = zzerVar3.zzB();
                                        if (zzB7 > 0) {
                                            i10 = zzg3;
                                            z5 = i2;
                                        } else {
                                            i10 = zzg3;
                                            z5 = c3;
                                        }
                                        long j12 = j11;
                                        String str9 = "childAtomSize must be positive";
                                        zzaey.zza(z5, "childAtomSize must be positive");
                                        int zzB8 = zzerVar3.zzB();
                                        int i41 = zzB6;
                                        if (zzB8 == 1635148593 || zzB8 == 1635148595 || zzB8 == 1701733238 || zzB8 == 1831958048 || zzB8 == 1836070006 || zzB8 == 1752589105 || zzB8 == 1751479857 || zzB8 == 1932670515 || zzB8 == 1211250227 || zzB8 == 1748121139 || zzB8 == 1987063864 || zzB8 == 1987063865 || zzB8 == 1635135537 || zzB8 == 1685479798 || zzB8 == 1685479729 || zzB8 == 1685481573 || zzB8 == 1685481521 || zzB8 == 1634760241) {
                                            s = zzv2;
                                            s2 = zzv;
                                            i11 = i38;
                                            i12 = i40;
                                            j7 = j12;
                                            int i42 = zzB8;
                                            int i43 = zzB;
                                            int i44 = zzB7;
                                            int i45 = i10;
                                            zzerVar3.zzh(i45 + 16);
                                            zzerVar3.zzk(16);
                                            int zzt4 = zzerVar3.zzt();
                                            i13 = i39;
                                            int zzt5 = zzerVar3.zzt();
                                            arrayList2 = arrayList4;
                                            zzerVar3.zzk(50);
                                            int zzg4 = zzerVar3.zzg();
                                            str2 = str;
                                            int i46 = 1701733238;
                                            if (i42 == 1701733238) {
                                                Pair zzr = zzr(zzerVar3, i45, i44);
                                                if (zzr != null) {
                                                    int intValue = ((Integer) zzr.first).intValue();
                                                    if (zzqVar == null) {
                                                        i32 = intValue;
                                                        zzqVar3 = null;
                                                    } else {
                                                        i32 = intValue;
                                                        zzqVar3 = zzqVar.zzb(((zzald) zzr.second).zzb);
                                                    }
                                                    zzakdVar3.zza[i13] = (zzald) zzr.second;
                                                    i46 = i32;
                                                } else {
                                                    zzqVar3 = zzqVar;
                                                }
                                                zzerVar3.zzh(zzg4);
                                                i42 = i46;
                                                zzqVar2 = zzqVar3;
                                            } else {
                                                zzqVar2 = zzqVar;
                                            }
                                            i10 = i45;
                                            if (i42 == 1831958048) {
                                                int i47 = i42;
                                                str3 = "video/mpeg";
                                                i14 = i47;
                                            } else {
                                                i14 = 1211250227;
                                                if (i42 == 1211250227) {
                                                    str3 = "video/3gpp";
                                                } else {
                                                    i14 = i42;
                                                    str3 = null;
                                                }
                                            }
                                            zzq zzqVar4 = zzqVar2;
                                            String str10 = zzc6;
                                            int i48 = zzg4;
                                            int i49 = i4;
                                            j8 = j5;
                                            float f = 1.0f;
                                            int i50 = 8;
                                            int i51 = -1;
                                            int i52 = -1;
                                            int i53 = 8;
                                            List list2 = null;
                                            int i54 = -1;
                                            zzgj zzgjVar3 = null;
                                            int i55 = -1;
                                            ByteBuffer byteBuffer = null;
                                            zzajw zzajwVar = null;
                                            zzajy zzajyVar = null;
                                            int i56 = -1;
                                            int i57 = -1;
                                            byte[] bArr = null;
                                            int i58 = -1;
                                            boolean z13 = false;
                                            int i59 = -1;
                                            String str11 = null;
                                            while (i48 - i10 < i44) {
                                                zzerVar3.zzh(i48);
                                                int zzg5 = zzerVar3.zzg();
                                                int zzB9 = zzerVar3.zzB();
                                                if (zzB9 == 0) {
                                                    i18 = i48;
                                                    if (zzerVar3.zzg() - i10 == i44) {
                                                        break;
                                                    }
                                                    i19 = 0;
                                                } else {
                                                    i18 = i48;
                                                    i19 = zzB9;
                                                }
                                                if (i19 > 0) {
                                                    i20 = i44;
                                                    z6 = true;
                                                } else {
                                                    i20 = i44;
                                                    z6 = false;
                                                }
                                                zzaey.zza(z6, str9);
                                                int zzB10 = zzerVar3.zzB();
                                                if (zzB10 == 1635148611) {
                                                    int i60 = zzg5 + 8;
                                                    zzaey.zza(str3 == null, null);
                                                    zzerVar3.zzh(i60);
                                                    zzadz zza4 = zzadz.zza(zzerVar3);
                                                    List list3 = zza4.zza;
                                                    zzakdVar3.zzc = zza4.zzb;
                                                    if (z13) {
                                                        z11 = true;
                                                    } else {
                                                        f = zza4.zzk;
                                                        z11 = false;
                                                    }
                                                    String str12 = zza4.zzl;
                                                    int i61 = zza4.zzj;
                                                    int i62 = zza4.zzg;
                                                    int i63 = zza4.zzh;
                                                    int i64 = zza4.zzi;
                                                    int i65 = zza4.zze;
                                                    i21 = zza4.zzf;
                                                    zzakdVar2 = zzakdVar3;
                                                    i23 = i14;
                                                    str11 = str12;
                                                    str5 = str9;
                                                    z13 = z11;
                                                    i52 = i62;
                                                    i50 = i65;
                                                    zzgjVar = zzgjVar3;
                                                    str3 = "video/avc";
                                                    i57 = i61;
                                                    i51 = i64;
                                                    i54 = i63;
                                                    list2 = list3;
                                                } else if (zzB10 == 1752589123) {
                                                    int i66 = zzg5 + 8;
                                                    zzaey.zza(str3 == null, null);
                                                    zzerVar3.zzh(i66);
                                                    zzafo zza5 = zzafo.zza(zzerVar3);
                                                    List list4 = zza5.zza;
                                                    zzakdVar3.zzc = zza5.zzb;
                                                    if (z13) {
                                                        z10 = true;
                                                    } else {
                                                        f = zza5.zzl;
                                                        z10 = false;
                                                    }
                                                    int i67 = zza5.zzm;
                                                    int i68 = zza5.zzc;
                                                    String str13 = zza5.zzn;
                                                    int i69 = zza5.zzk;
                                                    if (i69 == -1) {
                                                        i69 = i55;
                                                    }
                                                    int i70 = zza5.zzd;
                                                    int i71 = zza5.zze;
                                                    int i72 = zza5.zzh;
                                                    i54 = zza5.zzi;
                                                    int i73 = zza5.zzj;
                                                    int i74 = zza5.zzf;
                                                    int i75 = zza5.zzg;
                                                    zzgjVar = zza5.zzo;
                                                    zzakdVar2 = zzakdVar3;
                                                    i23 = i14;
                                                    i21 = i75;
                                                    str5 = str9;
                                                    str11 = str13;
                                                    i59 = i70;
                                                    i50 = i74;
                                                    str3 = "video/hevc";
                                                    z13 = z10;
                                                    i58 = i71;
                                                    i52 = i72;
                                                    i55 = i69;
                                                    list2 = list4;
                                                    i56 = i68;
                                                    i51 = i73;
                                                    i57 = i67;
                                                } else if (zzB10 == 1818785347) {
                                                    int i76 = zzg5 + 8;
                                                    zzaey.zza("video/hevc".equals(str3), "lhvC must follow hvcC atom");
                                                    if (zzgjVar3 == null) {
                                                        zzgjVar2 = null;
                                                    } else if (zzgjVar3.zza.size() >= 2) {
                                                        zzgjVar2 = zzgjVar3;
                                                        z9 = true;
                                                        zzaey.zza(z9, "must have at least two layers");
                                                        zzerVar3.zzh(i76);
                                                        zzgjVar2.getClass();
                                                        zzafo zzb2 = zzafo.zzb(zzerVar3, zzgjVar2);
                                                        zzaey.zza(zzakdVar3.zzc != zzb2.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                                        i29 = zzb2.zzh;
                                                        if (i29 != -1) {
                                                            zzaey.zza(i52 == i29, "colorSpace must be the same for both views");
                                                        }
                                                        i30 = zzb2.zzi;
                                                        if (i30 != -1) {
                                                            zzaey.zza(i54 == i30, "colorRange must be the same for both views");
                                                        }
                                                        i31 = zzb2.zzj;
                                                        if (i31 != -1) {
                                                            zzaey.zza(i51 == i31, "colorTransfer must be the same for both views");
                                                        }
                                                        zzaey.zza(i50 != zzb2.zzf, "bitdepthLuma must be the same for both views");
                                                        zzaey.zza(i53 != zzb2.zzg, "bitdepthChroma must be the same for both views");
                                                        if (list2 == null) {
                                                            int i77 = zzguf.zzd;
                                                            zzguc zzgucVar = new zzguc();
                                                            zzgucVar.zzh(list2);
                                                            zzgucVar.zzh(zzb2.zza);
                                                            list2 = zzgucVar.zzi();
                                                        } else {
                                                            zzaey.zza(false, "initializationData must be already set from hvcC atom");
                                                            list2 = null;
                                                        }
                                                        str3 = "video/mv-hevc";
                                                        zzakdVar2 = zzakdVar3;
                                                        i23 = i14;
                                                        zzgjVar = zzgjVar2;
                                                        str11 = zzb2.zzn;
                                                        str5 = str9;
                                                        i21 = i53;
                                                    } else {
                                                        zzgjVar2 = zzgjVar3;
                                                    }
                                                    z9 = false;
                                                    zzaey.zza(z9, "must have at least two layers");
                                                    zzerVar3.zzh(i76);
                                                    zzgjVar2.getClass();
                                                    zzafo zzb22 = zzafo.zzb(zzerVar3, zzgjVar2);
                                                    zzaey.zza(zzakdVar3.zzc != zzb22.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                                    i29 = zzb22.zzh;
                                                    if (i29 != -1) {
                                                    }
                                                    i30 = zzb22.zzi;
                                                    if (i30 != -1) {
                                                    }
                                                    i31 = zzb22.zzj;
                                                    if (i31 != -1) {
                                                    }
                                                    zzaey.zza(i50 != zzb22.zzf, "bitdepthLuma must be the same for both views");
                                                    zzaey.zza(i53 != zzb22.zzg, "bitdepthChroma must be the same for both views");
                                                    if (list2 == null) {
                                                    }
                                                    str3 = "video/mv-hevc";
                                                    zzakdVar2 = zzakdVar3;
                                                    i23 = i14;
                                                    zzgjVar = zzgjVar2;
                                                    str11 = zzb22.zzn;
                                                    str5 = str9;
                                                    i21 = i53;
                                                } else if (zzB10 == 1986361461) {
                                                    zzerVar3.zzh(zzg5 + 8);
                                                    int zzg6 = zzerVar3.zzg();
                                                    zzakdVar2 = zzakdVar3;
                                                    zzajz zzajzVar = null;
                                                    while (zzg6 - zzg5 < i19) {
                                                        zzerVar3.zzh(zzg6);
                                                        int zzB11 = zzerVar3.zzB();
                                                        if (zzB11 > 0) {
                                                            i27 = zzg6;
                                                            z8 = true;
                                                        } else {
                                                            i27 = zzg6;
                                                            z8 = false;
                                                        }
                                                        zzaey.zza(z8, str9);
                                                        int i78 = i53;
                                                        if (zzerVar3.zzB() == 1702454643) {
                                                            zzerVar3.zzh(i27 + 8);
                                                            int zzg7 = zzerVar3.zzg();
                                                            while (true) {
                                                                if (zzg7 - i27 >= zzB11) {
                                                                    i28 = zzB11;
                                                                    str6 = str9;
                                                                    zzajzVar = null;
                                                                    break;
                                                                }
                                                                zzerVar3.zzh(zzg7);
                                                                int zzB12 = zzerVar3.zzB();
                                                                zzaey.zza(zzB12 > 0, str9);
                                                                i28 = zzB11;
                                                                if (zzerVar3.zzB() == 1937011305) {
                                                                    zzerVar3.zzk(4);
                                                                    int zzs = zzerVar3.zzs();
                                                                    str6 = str9;
                                                                    zzajzVar = new zzajz(new zzakc(1 == (zzs & 1), (zzs & 2) == 2, (zzs & 8) == 8));
                                                                } else {
                                                                    zzg7 += zzB12;
                                                                    zzB11 = i28;
                                                                }
                                                            }
                                                        } else {
                                                            i28 = zzB11;
                                                            str6 = str9;
                                                        }
                                                        zzg6 = i27 + i28;
                                                        i53 = i78;
                                                        str9 = str6;
                                                    }
                                                    str5 = str9;
                                                    i21 = i53;
                                                    zzakg zzakgVar = zzajzVar == null ? null : new zzakg(zzajzVar);
                                                    if (zzakgVar != null) {
                                                        if (zzgjVar3 == null) {
                                                            zzgjVar3 = null;
                                                        } else if (zzgjVar3.zza.size() >= 2) {
                                                            zzaey.zza(zzakgVar.zza(), "both eye views must be marked as available");
                                                            zzaey.zza(!zzakgVar.zzb().zza().zzc(), "for MV-HEVC, eye_views_reversed must be set to false");
                                                        }
                                                        if (i55 != -1) {
                                                            i23 = i14;
                                                            zzgjVar = zzgjVar3;
                                                        } else if (true != zzakgVar.zzb().zza().zzc()) {
                                                            i23 = i14;
                                                            zzgjVar = zzgjVar3;
                                                            i55 = 4;
                                                        } else {
                                                            i55 = 5;
                                                            i23 = i14;
                                                            zzgjVar = zzgjVar3;
                                                        }
                                                    }
                                                    i22 = i50;
                                                    i23 = i14;
                                                    i24 = i54;
                                                    zzgjVar = zzgjVar3;
                                                    i25 = i55;
                                                    i50 = i22;
                                                    i54 = i24;
                                                    i55 = i25;
                                                } else {
                                                    zzakdVar2 = zzakdVar3;
                                                    str5 = str9;
                                                    i21 = i53;
                                                    if (zzB10 == 1685480259 || zzB10 == 1685485123 || zzB10 == 1685485379) {
                                                        i22 = i50;
                                                        i23 = i14;
                                                        i24 = i54;
                                                        zzgjVar = zzgjVar3;
                                                        i25 = i55;
                                                        int i79 = i19 - 8;
                                                        int i80 = zzg5 + 8;
                                                        byte[] bArr2 = new byte[i79];
                                                        zzerVar3.zzm(bArr2, 0, i79);
                                                        if (list2 != null) {
                                                            int i81 = zzguf.zzd;
                                                            zzguc zzgucVar2 = new zzguc();
                                                            zzgucVar2.zzh(list2);
                                                            zzgucVar2.zzf(bArr2);
                                                            zzgufVar = zzgucVar2.zzi();
                                                        } else {
                                                            zzaey.zza(false, "initializationData must already be set from hvcC or avcC atom");
                                                            zzgufVar = null;
                                                        }
                                                        zzerVar3.zzh(i80);
                                                        zzfr zza6 = zzfr.zza(zzerVar3);
                                                        if (zza6 != null) {
                                                            str11 = zza6.zza;
                                                            list2 = zzgufVar;
                                                            str3 = "video/dolby-vision";
                                                        } else {
                                                            list2 = zzgufVar;
                                                        }
                                                    } else if (zzB10 == 1987076931) {
                                                        int i82 = zzg5 + 12;
                                                        zzaey.zza(str3 == null, null);
                                                        zzerVar3.zzh(i82);
                                                        byte zzs2 = (byte) zzerVar3.zzs();
                                                        byte zzs3 = (byte) zzerVar3.zzs();
                                                        int zzs4 = zzerVar3.zzs();
                                                        int i83 = zzs4 >> 4;
                                                        int i84 = zzs4 >> 1;
                                                        String str14 = i14 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                        if (str14.equals("video/x-vnd.on2.vp9")) {
                                                            int i85 = zzdo.zza;
                                                            i26 = 1;
                                                            c2 = 3;
                                                            list2 = zzguf.zzj(new byte[]{1, 1, zzs2, 2, 1, zzs3, 3, 1, (byte) i83, 4, 1, (byte) (i84 & 7)});
                                                        } else {
                                                            c2 = 3;
                                                            i26 = 1;
                                                        }
                                                        int i86 = zzs4 & 1;
                                                        int zzs5 = zzerVar3.zzs();
                                                        int zzs6 = zzerVar3.zzs();
                                                        int zzb3 = zzi.zzb(zzs5);
                                                        int i87 = i26 != i86 ? 2 : 1;
                                                        i51 = zzi.zzc(zzs6);
                                                        i54 = i87;
                                                        i23 = i14;
                                                        i52 = zzb3;
                                                        i21 = i83;
                                                        str3 = str14;
                                                        zzgjVar = zzgjVar3;
                                                        i50 = i21;
                                                    } else if (zzB10 == 1635135811) {
                                                        int i88 = i19 - 8;
                                                        byte[] bArr3 = new byte[i88];
                                                        zzerVar3.zzm(bArr3, 0, i88);
                                                        zzguf zzj = zzguf.zzj(bArr3);
                                                        zzerVar3.zzh(zzg5 + 8);
                                                        zzi zzk = zzk(zzerVar3);
                                                        int i89 = zzk.zzf;
                                                        int i90 = zzk.zzg;
                                                        int i91 = zzk.zzb;
                                                        i23 = i14;
                                                        i21 = i90;
                                                        i54 = zzk.zzc;
                                                        str3 = "video/av01";
                                                        zzgjVar = zzgjVar3;
                                                        list2 = zzj;
                                                        i51 = zzk.zzd;
                                                        i50 = i89;
                                                        i52 = i91;
                                                    } else if (zzB10 == 1668050025) {
                                                        if (byteBuffer == null) {
                                                            byteBuffer = zzm();
                                                        }
                                                        ByteBuffer byteBuffer2 = byteBuffer;
                                                        byteBuffer2.position(21);
                                                        byteBuffer2.putShort(zzerVar3.zzv());
                                                        byteBuffer2.putShort(zzerVar3.zzv());
                                                        i23 = i14;
                                                        byteBuffer = byteBuffer2;
                                                        zzgjVar = zzgjVar3;
                                                    } else if (zzB10 == 1835295606) {
                                                        if (byteBuffer == null) {
                                                            byteBuffer = zzm();
                                                        }
                                                        ByteBuffer byteBuffer3 = byteBuffer;
                                                        short zzv3 = zzerVar3.zzv();
                                                        short zzv4 = zzerVar3.zzv();
                                                        short zzv5 = zzerVar3.zzv();
                                                        short zzv6 = zzerVar3.zzv();
                                                        i23 = i14;
                                                        short zzv7 = zzerVar3.zzv();
                                                        zzgjVar = zzgjVar3;
                                                        short zzv8 = zzerVar3.zzv();
                                                        int i92 = i50;
                                                        short zzv9 = zzerVar3.zzv();
                                                        int i93 = i54;
                                                        short zzv10 = zzerVar3.zzv();
                                                        long zzz3 = zzerVar3.zzz();
                                                        long zzz4 = zzerVar3.zzz();
                                                        byteBuffer3.position(1);
                                                        byteBuffer3.putShort(zzv7);
                                                        byteBuffer3.putShort(zzv8);
                                                        byteBuffer3.putShort(zzv3);
                                                        byteBuffer3.putShort(zzv4);
                                                        byteBuffer3.putShort(zzv5);
                                                        byteBuffer3.putShort(zzv6);
                                                        byteBuffer3.putShort(zzv9);
                                                        byteBuffer3.putShort(zzv10);
                                                        byteBuffer3.putShort((short) (zzz3 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                        byteBuffer3.putShort((short) (zzz4 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                        byteBuffer = byteBuffer3;
                                                        i50 = i92;
                                                        i54 = i93;
                                                        i55 = i55;
                                                    } else {
                                                        i22 = i50;
                                                        i23 = i14;
                                                        i24 = i54;
                                                        zzgjVar = zzgjVar3;
                                                        i25 = i55;
                                                        if (zzB10 == 1681012275) {
                                                            zzaey.zza(str3 == null, null);
                                                            str3 = "video/3gpp";
                                                        } else if (zzB10 == 1702061171) {
                                                            zzaey.zza(str3 == null, null);
                                                            zzajy zzp = zzp(zzerVar3, zzg5);
                                                            String zza7 = zzp.zza();
                                                            byte[] zzb4 = zzp.zzb();
                                                            if (zzb4 != null) {
                                                                zzajyVar = zzp;
                                                                str3 = zza7;
                                                                list2 = zzguf.zzj(zzb4);
                                                            } else {
                                                                zzajyVar = zzp;
                                                                str3 = zza7;
                                                            }
                                                        } else if (zzB10 == 1651798644) {
                                                            zzajwVar = zzq(zzerVar3, zzg5);
                                                        } else if (zzB10 == 1885434736) {
                                                            zzerVar3.zzh(zzg5 + 8);
                                                            f = zzerVar3.zzH() / zzerVar3.zzH();
                                                            i50 = i22;
                                                            i54 = i24;
                                                            i55 = i25;
                                                            z13 = true;
                                                        } else if (zzB10 == 1937126244) {
                                                            int i94 = zzg5 + 8;
                                                            while (true) {
                                                                if (i94 - zzg5 >= i19) {
                                                                    bArr = null;
                                                                    break;
                                                                }
                                                                zzerVar3.zzh(i94);
                                                                int zzB13 = zzerVar3.zzB() + i94;
                                                                if (zzerVar3.zzB() == 1886547818) {
                                                                    bArr = Arrays.copyOfRange(zzerVar3.zzi(), i94, zzB13);
                                                                    break;
                                                                }
                                                                i94 = zzB13;
                                                            }
                                                        } else if (zzB10 == 1936995172) {
                                                            int zzs7 = zzerVar3.zzs();
                                                            zzerVar3.zzk(3);
                                                            if (zzs7 == 0) {
                                                                int zzs8 = zzerVar3.zzs();
                                                                if (zzs8 == 0) {
                                                                    i50 = i22;
                                                                    i54 = i24;
                                                                    i55 = 0;
                                                                } else if (zzs8 == 1) {
                                                                    i50 = i22;
                                                                    i54 = i24;
                                                                    i55 = 1;
                                                                } else if (zzs8 == 2) {
                                                                    i50 = i22;
                                                                    i54 = i24;
                                                                    i55 = 2;
                                                                } else if (zzs8 == 3) {
                                                                    i55 = 3;
                                                                    i50 = i22;
                                                                    i54 = i24;
                                                                }
                                                            }
                                                        } else if (zzB10 == 1634760259) {
                                                            int i95 = i19 - 12;
                                                            byte[] bArr4 = new byte[i95];
                                                            zzerVar3.zzh(zzg5 + 12);
                                                            zzerVar3.zzm(bArr4, 0, i95);
                                                            String zzc7 = zzdo.zzc(bArr4);
                                                            zzguf zzj2 = zzguf.zzj(bArr4);
                                                            zzi zzl = zzl(new zzer(bArr4));
                                                            int i96 = zzl.zzf;
                                                            int i97 = zzl.zzg;
                                                            i52 = zzl.zzb;
                                                            str11 = zzc7;
                                                            i50 = i96;
                                                            i21 = i97;
                                                            i54 = zzl.zzc;
                                                            str3 = "video/apv";
                                                            i55 = i25;
                                                            i51 = zzl.zzd;
                                                            list2 = zzj2;
                                                        } else if (zzB10 == 1668246642) {
                                                            if (i52 == -1) {
                                                                if (i51 == -1) {
                                                                    int zzB14 = zzerVar3.zzB();
                                                                    if (zzB14 == 1852009592 || zzB14 == 1852009571) {
                                                                        int zzt6 = zzerVar3.zzt();
                                                                        int zzt7 = zzerVar3.zzt();
                                                                        zzerVar3.zzk(2);
                                                                        if (i19 == 19) {
                                                                            if ((zzerVar3.zzs() & 128) != 0) {
                                                                                i19 = 19;
                                                                                z7 = true;
                                                                                int zzb5 = zzi.zzb(zzt6);
                                                                                int i98 = true == z7 ? 2 : 1;
                                                                                i52 = zzb5;
                                                                                i54 = i98;
                                                                                i50 = i22;
                                                                                i55 = i25;
                                                                                i51 = zzi.zzc(zzt7);
                                                                            } else {
                                                                                i19 = 19;
                                                                            }
                                                                        }
                                                                        z7 = false;
                                                                        int zzb52 = zzi.zzb(zzt6);
                                                                        if (true == z7) {
                                                                        }
                                                                        i52 = zzb52;
                                                                        i54 = i98;
                                                                        i50 = i22;
                                                                        i55 = i25;
                                                                        i51 = zzi.zzc(zzt7);
                                                                    } else {
                                                                        zzee.zzc("BoxParsers", "Unsupported color type: ".concat(zzfw.zze(zzB14)));
                                                                        i51 = -1;
                                                                        i52 = -1;
                                                                        i50 = i22;
                                                                        i54 = i24;
                                                                        i55 = i25;
                                                                    }
                                                                } else {
                                                                    i52 = -1;
                                                                }
                                                            }
                                                        }
                                                        i50 = i22;
                                                        i54 = i24;
                                                        i55 = i25;
                                                    }
                                                    i50 = i22;
                                                    i54 = i24;
                                                    i55 = i25;
                                                }
                                                i48 = i18 + i19;
                                                i44 = i20;
                                                zzakdVar3 = zzakdVar2;
                                                i14 = i23;
                                                i53 = i21;
                                                zzgjVar3 = zzgjVar;
                                                str9 = str5;
                                            }
                                            int i99 = i50;
                                            zzakd zzakdVar4 = zzakdVar3;
                                            i15 = i44;
                                            int i100 = i53;
                                            int i101 = i54;
                                            int i102 = i55;
                                            c = 2;
                                            if (str3 == null) {
                                                str4 = str10;
                                                i17 = i49;
                                                i16 = i43;
                                                zzakdVar = zzakdVar4;
                                            } else {
                                                zzt zztVar = new zzt();
                                                i16 = i43;
                                                zztVar.zzb(i16);
                                                zztVar.zzm(str3);
                                                zztVar.zzj(str11);
                                                zztVar.zzt(zzt4);
                                                zztVar.zzu(zzt5);
                                                zztVar.zzv(i59);
                                                zztVar.zzw(i58);
                                                zztVar.zzz(f);
                                                i17 = i49;
                                                zztVar.zzy(i17);
                                                zztVar.zzA(bArr);
                                                zztVar.zzB(i102);
                                                zztVar.zzp(list2);
                                                zztVar.zzo(i57);
                                                zztVar.zzD(i56);
                                                zztVar.zzq(zzqVar4);
                                                str4 = str10;
                                                zztVar.zze(str4);
                                                zzh zzhVar = new zzh();
                                                zzhVar.zza(i52);
                                                zzhVar.zzb(i101);
                                                zzhVar.zzc(i51);
                                                zzhVar.zzd(byteBuffer != null ? byteBuffer.array() : null);
                                                zzhVar.zze(i99);
                                                zzhVar.zzf(i100);
                                                zztVar.zzC(zzhVar.zzg());
                                                if (zzajwVar != null) {
                                                    zztVar.zzh(zzgxz.zzb(zzajwVar.zza()));
                                                    zztVar.zzi(zzgxz.zzb(zzajwVar.zzb()));
                                                } else if (zzajyVar != null) {
                                                    zztVar.zzh(zzgxz.zzb(zzajyVar.zzc()));
                                                    zztVar.zzi(zzgxz.zzb(zzajyVar.zzd()));
                                                }
                                                zzakdVar = zzakdVar4;
                                                zzakdVar.zzb = zztVar.zzM();
                                            }
                                        } else if (zzB8 == 1836069985 || zzB8 == 1701733217 || zzB8 == 1633889587 || zzB8 == 1700998451 || zzB8 == 1633889588 || zzB8 == 1835823201 || zzB8 == 1685353315 || zzB8 == 1685353317 || zzB8 == 1685353320 || zzB8 == 1685353324 || zzB8 == 1685353336 || zzB8 == 1935764850 || zzB8 == 1935767394 || zzB8 == 1819304813 || zzB8 == 1936684916 || zzB8 == 1953984371 || zzB8 == 778924082 || zzB8 == 778924083 || zzB8 == 1835557169 || zzB8 == 1835560241 || zzB8 == 1634492771 || zzB8 == 1634492791 || zzB8 == 1970037111 || zzB8 == 1332770163 || zzB8 == 1716281667 || zzB8 == 1767992678 || zzB8 == 1768973165 || zzB8 == 1718641517) {
                                            zzakdVar = zzakdVar3;
                                            s = zzv2;
                                            s2 = zzv;
                                            i11 = i38;
                                            i12 = i40;
                                            int i103 = i10;
                                            j7 = j12;
                                            i16 = zzB;
                                            zzo(zzerVar3, zzB8, i103, zzB7, i16, zzc6, z2, zzqVar, zzakdVar, i39);
                                            str2 = str;
                                            i10 = i103;
                                            i15 = zzB7;
                                            str4 = zzc6;
                                            i13 = i39;
                                            arrayList2 = arrayList4;
                                            i17 = i4;
                                            j8 = j5;
                                            c = 2;
                                        } else {
                                            if (zzB8 == 1414810956 || zzB8 == 1954034535 || zzB8 == 2004251764 || zzB8 == 1937010800 || zzB8 == 1664495672 || zzB8 == 1836070003) {
                                                zzerVar3.zzh(i10 + 16);
                                                if (zzB8 == 1414810956) {
                                                    str8 = "application/ttml+xml";
                                                } else {
                                                    if (zzB8 == 1954034535) {
                                                        int i104 = zzB7 - 16;
                                                        byte[] bArr5 = new byte[i104];
                                                        zzerVar3.zzm(bArr5, 0, i104);
                                                        zzgufVar3 = zzguf.zzj(bArr5);
                                                        str8 = "application/x-quicktime-tx3g";
                                                    } else if (zzB8 == 2004251764) {
                                                        str8 = "application/x-mp4-vtt";
                                                    } else if (zzB8 == 1937010800) {
                                                        str8 = "application/ttml+xml";
                                                        j9 = 0;
                                                        zzgufVar3 = null;
                                                        if (str8 != null) {
                                                            zzer zzerVar4 = zzerVar3;
                                                            zzt zztVar2 = new zzt();
                                                            zztVar2.zzb(zzB);
                                                            zztVar2.zzm(str8);
                                                            zztVar2.zze(zzc6);
                                                            zztVar2.zzr(j9);
                                                            zztVar2.zzp(zzgufVar3);
                                                            zzakdVar3.zzb = zztVar2.zzM();
                                                            zzakdVar = zzakdVar3;
                                                            s = zzv2;
                                                            str4 = zzc6;
                                                            i13 = i39;
                                                            s2 = zzv;
                                                            c = c7;
                                                            i11 = i38;
                                                            i12 = i40;
                                                            i15 = zzB7;
                                                            j7 = j12;
                                                            zzerVar3 = zzerVar4;
                                                            str2 = str;
                                                            i16 = zzB;
                                                            arrayList2 = arrayList4;
                                                            i17 = i4;
                                                            j8 = j5;
                                                        }
                                                    } else if (zzB8 == 1664495672) {
                                                        zzakdVar3.zzd = i2;
                                                        str8 = "application/x-mp4-cea-608";
                                                    } else {
                                                        int zzg8 = zzerVar3.zzg();
                                                        zzerVar3.zzk(4);
                                                        if (zzerVar3.zzB() == 1702061171) {
                                                            zzajy zzp2 = zzp(zzerVar3, zzg8);
                                                            if (zzp2.zzb() != null && zzp2.zzb().length == 64) {
                                                                String zzj3 = zzj(zzp2.zzb(), zzv, zzv2);
                                                                String str15 = zzfj.zza;
                                                                zzgufVar2 = zzguf.zzj(zzj3.getBytes(StandardCharsets.UTF_8));
                                                                str7 = "application/vobsub";
                                                            }
                                                        } else {
                                                            zzgufVar2 = null;
                                                            str7 = null;
                                                        }
                                                        zzgufVar3 = zzgufVar2;
                                                        str8 = str7;
                                                    }
                                                    j9 = Long.MAX_VALUE;
                                                    if (str8 != null) {
                                                    }
                                                }
                                                j9 = Long.MAX_VALUE;
                                                zzgufVar3 = null;
                                                if (str8 != null) {
                                                }
                                            } else if (zzB8 == 1835365492) {
                                                zzerVar3.zzh(i10 + 16);
                                                char c9 = c3;
                                                zzerVar3.zzM(c9);
                                                String zzM = zzerVar3.zzM(c9);
                                                if (zzM != null) {
                                                    zzt zztVar3 = new zzt();
                                                    zztVar3.zzb(zzB);
                                                    zztVar3.zzm(zzM);
                                                    zzakdVar3.zzb = zztVar3.zzM();
                                                }
                                            } else if (zzB8 == 1667329389) {
                                                zzt zztVar4 = new zzt();
                                                zztVar4.zzb(zzB);
                                                zztVar4.zzm("application/x-camera-motion");
                                                zzakdVar3.zzb = zztVar4.zzM();
                                            }
                                            zzakdVar = zzakdVar3;
                                            s = zzv2;
                                            str4 = zzc6;
                                            i13 = i39;
                                            s2 = zzv;
                                            c = c7;
                                            i11 = i38;
                                            i12 = i40;
                                            i15 = zzB7;
                                            j7 = j12;
                                            str2 = str;
                                            i16 = zzB;
                                            arrayList2 = arrayList4;
                                            i17 = i4;
                                            j8 = j5;
                                        }
                                        zzerVar3.zzh(i10 + i15);
                                        char c10 = c;
                                        i39 = i13 + 1;
                                        str = str2;
                                        c7 = c10;
                                        i4 = i17;
                                        zzB = i16;
                                        zzc6 = str4;
                                        zzakdVar3 = zzakdVar;
                                        zzv2 = s;
                                        i34 = i12;
                                        arrayList4 = arrayList2;
                                        j5 = j8;
                                        zzB6 = i41;
                                        zzv = s2;
                                        i38 = i11;
                                        j11 = j7;
                                        i2 = 1;
                                        c3 = 0;
                                    }
                                    String str16 = str;
                                    zzakd zzakdVar5 = zzakdVar3;
                                    int i105 = i34;
                                    int i106 = zzB;
                                    long j13 = j11;
                                    arrayList = arrayList4;
                                    long j14 = j5;
                                    int i107 = i38;
                                    if (z) {
                                        zzfuVar3 = zzfuVar2;
                                    } else {
                                        zzfuVar3 = zzfuVar2;
                                        zzfu zzd4 = zzfuVar3.zzd(1701082227);
                                        if (zzd4 != null && (zzn = zzn(zzd4)) != null) {
                                            long[] jArr3 = (long[]) zzn.first;
                                            jArr2 = (long[]) zzn.second;
                                            jArr = jArr3;
                                            zzvVar = zzakdVar5.zzb;
                                            if (zzvVar != null) {
                                                zzgqtVar2 = zzgqtVar;
                                                zzalcVar = null;
                                            } else {
                                                if (i107 != 0) {
                                                    zzft zzftVar = new zzft(i107);
                                                    zzt zza8 = zzvVar.zza();
                                                    zzap zzapVar = zzvVar.zzl;
                                                    zza8.zzk(zzapVar != null ? zzapVar.zzg(zzftVar) : new zzap(-9223372036854775807L, zzftVar));
                                                    zzvVar = zza8.zzM();
                                                }
                                                zzalc zzalcVar3 = new zzalc(i106, i105, zzaka.zza(j14, j13, str16), j4, zzt, zzaka.zzb(j14, j13, str16), zzvVar, zzakdVar5.zzd, zzakdVar5.zza, zzakdVar5.zzc, jArr, jArr2);
                                                zzgqtVar2 = zzgqtVar;
                                                zzalcVar = zzalcVar3;
                                            }
                                            zzalcVar2 = (zzalc) zzgqtVar2.apply(zzalcVar);
                                            if (zzalcVar2 != null) {
                                                zzfu zzd5 = zzfuVar3.zzd(1835297121);
                                                zzd5.getClass();
                                                zzfu zzd6 = zzd5.zzd(1835626086);
                                                zzd6.getClass();
                                                zzfu zzd7 = zzd6.zzd(1937007212);
                                                zzd7.getClass();
                                                zzalf zzg9 = zzg(zzalcVar2, zzd7, zzafnVar, false);
                                                arrayList3 = arrayList;
                                                arrayList3.add(zzg9);
                                                i33 = i + 1;
                                                zzfuVar4 = zzfuVar;
                                                arrayList4 = arrayList3;
                                            } else {
                                                arrayList3 = arrayList;
                                            }
                                        }
                                    }
                                    jArr = null;
                                    jArr2 = null;
                                    zzvVar = zzakdVar5.zzb;
                                    if (zzvVar != null) {
                                    }
                                    zzalcVar2 = (zzalc) zzgqtVar2.apply(zzalcVar);
                                    if (zzalcVar2 != null) {
                                    }
                                }
                            }
                            zzB3 = 65536;
                        }
                        zzB2 = 0;
                    }
                    if (zzB2 == 0) {
                        if (zzB3 == -65536) {
                            if (zzB4 != 65536) {
                                if (zzB4 == -65536) {
                                    z4 = zzB5 != 0;
                                    zzB4 = -65536;
                                }
                                zzB3 = -65536;
                            } else {
                                z4 = zzB5 != 0;
                            }
                            if (true != z4) {
                                i5 = 270;
                                i4 = i5;
                                i2 = 1;
                                zzerVar.zzk(16);
                                short zzv11 = zzerVar.zzv();
                                zzerVar.zzk(2);
                                short zzv22 = zzerVar.zzv();
                                if (j == -9223372036854775807L) {
                                }
                                long j102 = zzd(zzc2.zza).zzc;
                                if (j3 == -9223372036854775807L) {
                                }
                                zzfu zzd22 = zzd.zzd(1835626086);
                                zzd22.getClass();
                                zzfu zzd32 = zzd22.zzd(1937007212);
                                zzd32.getClass();
                                zzfv zzc52 = zzd.zzc(1835296868);
                                zzc52.getClass();
                                zzer zzerVar22 = zzc52.zza;
                                i6 = 8;
                                zzerVar22.zzh(8);
                                zza2 = zza(zzerVar22.zzB());
                                zzerVar22.zzk(zza2 == 0 ? 8 : 16);
                                long zzz5 = zzerVar22.zzz();
                                int zzg22 = zzerVar22.zzg();
                                i7 = 0;
                                while (true) {
                                    if (zza2 == 0) {
                                    }
                                    if (i7 >= i6) {
                                    }
                                    i7++;
                                    zzfuVar5 = zzfuVar5;
                                    i6 = 8;
                                }
                                int zzt32 = zzerVar22.zzt();
                                char c42 = (char) (((zzt32 >> 10) & 31) + 96);
                                char c52 = (char) (((zzt32 >> 5) & 31) + 96);
                                char c62 = (char) ((zzt32 & 31) + 96);
                                char[] cArr2 = new char[3];
                                cArr2[0] = c42;
                                cArr2[i2] = c52;
                                char c72 = 2;
                                cArr2[2] = c62;
                                i9 = 0;
                                while (i9 < i8) {
                                }
                                str = new String(cArr2);
                                zzc = zzd32.zzc(1937011556);
                                if (zzc == null) {
                                }
                            }
                            zzB3 = -65536;
                        }
                        i2 = 1;
                        i3 = 0;
                    } else {
                        int i108 = zzB2;
                        i2 = 1;
                        i3 = i108;
                    }
                    i4 = ((i3 == -65536 || i3 == 65536) && zzB3 == 0 && zzB4 == 0 && zzB5 == -65536) ? 180 : 0;
                    zzerVar.zzk(16);
                    short zzv112 = zzerVar.zzv();
                    zzerVar.zzk(2);
                    short zzv222 = zzerVar.zzv();
                    if (j == -9223372036854775807L) {
                    }
                    long j1022 = zzd(zzc2.zza).zzc;
                    if (j3 == -9223372036854775807L) {
                    }
                    zzfu zzd222 = zzd.zzd(1835626086);
                    zzd222.getClass();
                    zzfu zzd322 = zzd222.zzd(1937007212);
                    zzd322.getClass();
                    zzfv zzc522 = zzd.zzc(1835296868);
                    zzc522.getClass();
                    zzer zzerVar222 = zzc522.zza;
                    i6 = 8;
                    zzerVar222.zzh(8);
                    zza2 = zza(zzerVar222.zzB());
                    zzerVar222.zzk(zza2 == 0 ? 8 : 16);
                    long zzz52 = zzerVar222.zzz();
                    int zzg222 = zzerVar222.zzg();
                    i7 = 0;
                    while (true) {
                        if (zza2 == 0) {
                        }
                        if (i7 >= i6) {
                        }
                        i7++;
                        zzfuVar5 = zzfuVar5;
                        i6 = 8;
                    }
                    int zzt322 = zzerVar222.zzt();
                    char c422 = (char) (((zzt322 >> 10) & 31) + 96);
                    char c522 = (char) (((zzt322 >> 5) & 31) + 96);
                    char c622 = (char) ((zzt322 & 31) + 96);
                    char[] cArr22 = new char[3];
                    cArr22[0] = c422;
                    cArr22[i2] = c522;
                    char c722 = 2;
                    cArr22[2] = c622;
                    i9 = 0;
                    while (i9 < i8) {
                    }
                    str = new String(cArr22);
                    zzc = zzd322.zzc(1937011556);
                    if (zzc == null) {
                    }
                }
                zzalcVar = null;
                zzalcVar2 = (zzalc) zzgqtVar2.apply(zzalcVar);
                if (zzalcVar2 != null) {
                }
            }
            i33 = i + 1;
            zzfuVar4 = zzfuVar;
            arrayList4 = arrayList3;
        }
    }

    public static zzap zzc(zzfv zzfvVar) {
        int zzF;
        zzer zzerVar = zzfvVar.zza;
        zzerVar.zzh(8);
        zzap zzapVar = new zzap(-9223372036854775807L, new zzao[0]);
        while (zzerVar.zzd() >= 8) {
            int zzg = zzerVar.zzg();
            int zzB = zzerVar.zzB() + zzg;
            int zzB2 = zzerVar.zzB();
            zzap zzapVar2 = null;
            if (zzB2 == 1835365473) {
                zzerVar.zzh(zzg);
                zzerVar.zzk(8);
                zzf(zzerVar);
                while (true) {
                    if (zzerVar.zzg() >= zzB) {
                        break;
                    }
                    int zzg2 = zzerVar.zzg();
                    int zzB3 = zzerVar.zzB() + zzg2;
                    if (zzerVar.zzB() == 1768715124) {
                        zzerVar.zzh(zzg2);
                        zzerVar.zzk(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzerVar.zzg() < zzB3) {
                            zzao zzc = zzakq.zzc(zzerVar);
                            if (zzc != null) {
                                arrayList.add(zzc);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzapVar2 = new zzap(arrayList);
                        }
                    } else {
                        zzerVar.zzh(zzB3);
                    }
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (zzB2 == 1936553057) {
                zzerVar.zzh(zzg);
                zzerVar.zzk(12);
                while (true) {
                    if (zzerVar.zzg() >= zzB) {
                        break;
                    }
                    int zzg3 = zzerVar.zzg();
                    int zzB4 = zzerVar.zzB();
                    if (zzerVar.zzB() != 1935766900) {
                        zzerVar.zzh(zzg3 + zzB4);
                    } else if (zzB4 >= 16) {
                        zzerVar.zzk(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int zzs = zzerVar.zzs();
                            int zzs2 = zzerVar.zzs();
                            if (zzs == 0) {
                                i = zzs2;
                            } else if (zzs == 1) {
                                i2 = zzs2;
                            }
                        }
                        if (i == 12) {
                            zzF = 240;
                        } else if (i == 13) {
                            zzF = 120;
                        } else {
                            if (i == 21 && zzerVar.zzd() >= 8 && zzerVar.zzg() + 8 <= zzB) {
                                int zzB5 = zzerVar.zzB();
                                int zzB6 = zzerVar.zzB();
                                if (zzB5 >= 12 && zzB6 == 1936877170) {
                                    zzF = zzerVar.zzF();
                                }
                            }
                            zzF = -2147483647;
                        }
                        if (zzF != -2147483647) {
                            zzapVar2 = new zzap(-9223372036854775807L, new zzaix(zzF, i2));
                        }
                    }
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (zzB2 == -1451722374) {
                zzapVar = zzapVar.zzf(zzh(zzerVar));
            }
            zzerVar.zzh(zzB);
        }
        return zzapVar;
    }

    public static zzfy zzd(zzer zzerVar) {
        long zzD;
        long zzD2;
        zzerVar.zzh(8);
        if (zza(zzerVar.zzB()) == 0) {
            zzD = zzerVar.zzz();
            zzD2 = zzerVar.zzz();
        } else {
            zzD = zzerVar.zzD();
            zzD2 = zzerVar.zzD();
        }
        return new zzfy(zzD, zzD2, zzerVar.zzz());
    }

    public static zzap zze(zzfu zzfuVar) {
        zzfs zzfsVar;
        zzfv zzc = zzfuVar.zzc(1751411826);
        zzfv zzc2 = zzfuVar.zzc(1801812339);
        zzfv zzc3 = zzfuVar.zzc(1768715124);
        if (zzc != null && zzc2 != null && zzc3 != null && zzi(zzc.zza) == 1835299937) {
            zzer zzerVar = zzc2.zza;
            zzerVar.zzh(12);
            int zzB = zzerVar.zzB();
            String[] strArr = new String[zzB];
            for (int i = 0; i < zzB; i++) {
                int zzB2 = zzerVar.zzB();
                zzerVar.zzk(4);
                strArr[i] = zzerVar.zzK(zzB2 - 8, StandardCharsets.UTF_8);
            }
            zzer zzerVar2 = zzc3.zza;
            zzerVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzerVar2.zzd() > 8) {
                int zzg = zzerVar2.zzg() + zzerVar2.zzB();
                int zzB3 = zzerVar2.zzB() - 1;
                if (zzB3 < 0 || zzB3 >= zzB) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzB3).length() + 41);
                    sb.append("Skipped metadata with unknown key index: ");
                    sb.append(zzB3);
                    zzee.zzc("BoxParsers", sb.toString());
                } else {
                    String str = strArr[zzB3];
                    while (true) {
                        int zzg2 = zzerVar2.zzg();
                        if (zzg2 >= zzg) {
                            zzfsVar = null;
                            break;
                        }
                        int zzB4 = zzerVar2.zzB();
                        if (zzerVar2.zzB() == 1684108385) {
                            int zzB5 = zzerVar2.zzB();
                            int zzB6 = zzerVar2.zzB();
                            int i2 = zzB4 - 16;
                            byte[] bArr = new byte[i2];
                            zzerVar2.zzm(bArr, 0, i2);
                            zzfsVar = new zzfs(str, bArr, zzB6, zzB5);
                            break;
                        }
                        zzerVar2.zzh(zzg2 + zzB4);
                    }
                    if (zzfsVar != null) {
                        arrayList.add(zzfsVar);
                    }
                }
                zzerVar2.zzh(zzg);
            }
            if (!arrayList.isEmpty()) {
                return new zzap(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzer zzerVar) {
        int zzg = zzerVar.zzg();
        zzerVar.zzk(4);
        if (zzerVar.zzB() != 1751411826) {
            zzg += 4;
        }
        zzerVar.zzh(zzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x044d  */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzalf zzg(zzalc zzalcVar, zzfu zzfuVar, zzafn zzafnVar, boolean z) throws zzat {
        zzakb zzakfVar;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        zzv zzvVar;
        long[] jArr;
        int[] iArr;
        int i7;
        long[] jArr2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j;
        long[] jArr3;
        int i15;
        int[] iArr2;
        long j2;
        long j3;
        int i16;
        int i17;
        int i18;
        long j4;
        long[] jArr4;
        long j5;
        int i19;
        boolean z3;
        long[] jArr5;
        int i20;
        int i21;
        boolean z4;
        int length;
        zzalc zzalcVar2 = zzalcVar;
        zzfv zzc = zzfuVar.zzc(1937011578);
        if (zzc != null) {
            zzakfVar = new zzake(zzc, zzalcVar2.zzg);
        } else {
            zzfv zzc2 = zzfuVar.zzc(1937013298);
            if (zzc2 == null) {
                throw zzat.zzb("Track has no sample table size information", null);
            }
            zzakfVar = new zzakf(zzc2);
        }
        int zza2 = zzakfVar.zza();
        if (zza2 == 0) {
            return new zzalf(zzalcVar2, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (zzalcVar2.zzb == 2) {
            long j6 = zzalcVar2.zzf;
            if (j6 > 0) {
                zzt zza3 = zzalcVar2.zzg.zza();
                zza3.zzx(zza2 / (j6 / 1000000.0f));
                zzalcVar2 = zzalcVar2.zzb(zza3.zzM());
            }
        }
        zzfv zzc3 = zzfuVar.zzc(1937007471);
        if (zzc3 == null) {
            zzc3 = zzfuVar.zzc(1668232756);
            zzc3.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        zzfv zzc4 = zzfuVar.zzc(1937011555);
        zzc4.getClass();
        zzer zzerVar = zzc4.zza;
        zzfv zzc5 = zzfuVar.zzc(1937011827);
        zzc5.getClass();
        zzer zzerVar2 = zzc5.zza;
        zzfv zzc6 = zzfuVar.zzc(1937011571);
        zzer zzerVar3 = zzc6 != null ? zzc6.zza : null;
        zzfv zzc7 = zzfuVar.zzc(1668576371);
        zzer zzerVar4 = zzc7 != null ? zzc7.zza : null;
        zzajx zzajxVar = new zzajx(zzerVar, zzc3.zza, z2);
        zzerVar2.zzh(12);
        int zzH = zzerVar2.zzH() - 1;
        int zzH2 = zzerVar2.zzH();
        int zzH3 = zzerVar2.zzH();
        if (zzerVar4 != null) {
            zzerVar4.zzh(12);
            i = zzerVar4.zzH();
        } else {
            i = 0;
        }
        if (zzerVar3 != null) {
            zzerVar3.zzh(12);
            i2 = zzerVar3.zzH();
            if (i2 > 0) {
                i4 = zzerVar3.zzH() - 1;
                i3 = 0;
            } else {
                i3 = 0;
                i4 = -1;
                zzerVar3 = null;
            }
        } else {
            i2 = 0;
            i3 = 0;
            i4 = -1;
        }
        int zzb2 = zzakfVar.zzb();
        zzv zzvVar2 = zzalcVar2.zzg;
        if (zzb2 != -1) {
            String str = zzvVar2.zzo;
            i5 = 1;
            if (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && zzH == 0) {
                if (i == 0 && i2 == 0) {
                    zzH = i3;
                    i6 = 1;
                } else {
                    i6 = i3;
                    zzH = i6;
                }
                ArrayList arrayList = new ArrayList();
                ?? r31 = zzerVar3 != null ? i5 : i3;
                if (i6 == 0) {
                    int i22 = zzajxVar.zza;
                    long[] jArr6 = new long[i22];
                    int[] iArr3 = new int[i22];
                    while (zzajxVar.zza()) {
                        int i23 = zzajxVar.zzb;
                        jArr6[i23] = zzajxVar.zzd;
                        iArr3[i23] = zzajxVar.zzc;
                    }
                    long j7 = zzH3;
                    int i24 = 8192 / zzb2;
                    int i25 = i3;
                    int i26 = i25;
                    while (i25 < i22) {
                        int i27 = iArr3[i25];
                        String str2 = zzfj.zza;
                        i26 += ((i27 + i24) - 1) / i24;
                        i25++;
                    }
                    jArr = new long[i26];
                    int[] iArr4 = new int[i26];
                    jArr3 = new long[i26];
                    iArr = new int[i26];
                    int i28 = i3;
                    int i29 = i28;
                    int i30 = i29;
                    int i31 = i30;
                    int i32 = i31;
                    while (i28 < i22) {
                        int i33 = iArr3[i28];
                        long j8 = jArr6[i28];
                        int i34 = i32;
                        int i35 = i22;
                        int i36 = i31;
                        int i37 = i34;
                        int i38 = i28;
                        int i39 = i33;
                        while (i39 > 0) {
                            int min = Math.min(i24, i39);
                            jArr[i37] = j8;
                            int i40 = i39;
                            int i41 = zzb2 * min;
                            iArr4[i37] = i41;
                            int i42 = i30 + i41;
                            i36 = Math.max(i36, i41);
                            long j9 = j7;
                            jArr3[i37] = j9 * i29;
                            iArr[i37] = i5;
                            j8 += iArr4[i37];
                            i29 += min;
                            i39 = i40 - min;
                            i37++;
                            i30 = i42;
                            j7 = j9;
                        }
                        long j10 = j7;
                        i28 = i38 + 1;
                        int i43 = i37;
                        i31 = i36;
                        i22 = i35;
                        i32 = i43;
                        j7 = j10;
                    }
                    j3 = i30;
                    j2 = j7 * i29;
                    zzvVar = zzvVar2;
                    i15 = i26;
                    iArr2 = iArr4;
                    i16 = i31;
                } else {
                    long[] jArr7 = new long[zza2];
                    int[] iArr5 = new int[zza2];
                    zzer zzerVar5 = zzerVar4;
                    long[] jArr8 = new long[zza2];
                    int i44 = i2;
                    int[] iArr6 = new int[zza2];
                    int i45 = i4;
                    zzakb zzakbVar = zzakfVar;
                    int i46 = i45;
                    zzvVar = zzvVar2;
                    int i47 = i;
                    int i48 = zzH;
                    long j11 = 0;
                    long j12 = 0;
                    long j13 = 0;
                    int i49 = i3;
                    int i50 = i49;
                    int i51 = i50;
                    int i52 = i51;
                    int i53 = zzH3;
                    int i54 = i52;
                    while (true) {
                        if (i49 >= zza2) {
                            jArr = jArr7;
                            iArr = iArr6;
                            break;
                        }
                        long j14 = j11;
                        int i55 = i5;
                        while (true) {
                            if (i51 != 0) {
                                i17 = i51;
                                i18 = i55;
                                break;
                            }
                            boolean zza4 = zzajxVar.zza();
                            if (zza4 == 0) {
                                i17 = i3;
                                i18 = zza4;
                                break;
                            }
                            j14 = zzajxVar.zzd;
                            i51 = zzajxVar.zzc;
                            zza2 = zza2;
                            i55 = zza4;
                        }
                        int i56 = zza2;
                        if (i18 == 0) {
                            zzee.zzc("BoxParsers", "Unexpected end of chunk data");
                            long[] copyOf = Arrays.copyOf(jArr7, i49);
                            int[] copyOf2 = Arrays.copyOf(iArr5, i49);
                            jArr8 = Arrays.copyOf(jArr8, i49);
                            jArr = copyOf;
                            iArr5 = copyOf2;
                            iArr = Arrays.copyOf(iArr6, i49);
                            zza2 = i49;
                            break;
                        }
                        if (zzerVar5 != null) {
                            while (true) {
                                if (i52 != 0) {
                                    break;
                                }
                                if (i47 <= 0) {
                                    i52 = i3;
                                    break;
                                }
                                i47--;
                                i52 = zzerVar5.zzH();
                                i54 = zzerVar5.zzB();
                            }
                            i52--;
                        }
                        int zzc8 = zzakbVar.zzc();
                        int[] iArr7 = iArr6;
                        long[] jArr9 = jArr7;
                        long j15 = zzc8;
                        j13 += j15;
                        if (zzc8 > i50) {
                            i50 = zzc8;
                        }
                        jArr9[i49] = j14;
                        iArr5[i49] = zzc8;
                        int i57 = i17;
                        jArr8[i49] = j12 + i54;
                        iArr7[i49] = r31;
                        if (i49 == i46) {
                            iArr7[i49] = i5;
                            arrayList.add(Integer.valueOf(i49));
                        }
                        if (zzerVar3 != null && i49 == i46) {
                            int i58 = i44 - 1;
                            if (i58 > 0) {
                                i44 = i58;
                                i46 = zzerVar3.zzH() - 1;
                            } else {
                                i44 = i58;
                            }
                        }
                        j12 += i53;
                        zzH2--;
                        if (zzH2 == 0) {
                            if (i48 > 0) {
                                i48--;
                                zzH2 = zzerVar2.zzH();
                                i53 = zzerVar2.zzB();
                            } else {
                                zzH2 = i3;
                            }
                        }
                        long j16 = j14 + j15;
                        i51 = i57 - 1;
                        i49++;
                        jArr7 = jArr9;
                        iArr6 = iArr7;
                        zza2 = i56;
                        j11 = j16;
                    }
                    long j17 = j12 + i54;
                    if (zzerVar5 != null) {
                        while (i47 > 0) {
                            if (zzerVar5.zzH() != 0) {
                                i7 = i3;
                                break;
                            }
                            zzerVar5.zzB();
                            i47--;
                        }
                    }
                    i7 = i5;
                    if (i44 == 0) {
                        if (zzH2 != 0) {
                            jArr2 = jArr8;
                            i8 = i7;
                            i9 = zza2;
                            i10 = zzH2;
                            i14 = i3;
                        } else if (i51 != 0) {
                            jArr2 = jArr8;
                            i8 = i7;
                            i9 = zza2;
                            i14 = i3;
                            i10 = i14;
                        } else if (i48 != 0) {
                            jArr2 = jArr8;
                            i8 = i7;
                            i9 = zza2;
                            i14 = i3;
                            i10 = i14;
                            i11 = i10;
                            i12 = i48;
                            i13 = i52;
                        } else if (i52 != 0) {
                            jArr2 = jArr8;
                            i8 = i7;
                            i9 = zza2;
                            i14 = i3;
                            i10 = i14;
                            i11 = i10;
                            i12 = i11;
                            i13 = i52;
                        } else if (i7 == 0) {
                            jArr2 = jArr8;
                            i9 = zza2;
                            i8 = i3;
                            i14 = i8;
                            i10 = i14;
                            i11 = i10;
                            i12 = i11;
                            i13 = i12;
                        } else {
                            jArr2 = jArr8;
                            i9 = zza2;
                            j = j17;
                            jArr3 = jArr2;
                            i15 = i9;
                            iArr2 = iArr5;
                            j2 = j;
                            j3 = j13;
                            i16 = i50;
                        }
                        i11 = i51;
                        i12 = i48;
                        i13 = i52;
                    } else {
                        jArr2 = jArr8;
                        i8 = i7;
                        i9 = zza2;
                        i10 = zzH2;
                        i11 = i51;
                        i12 = i48;
                        i13 = i52;
                        i14 = i44;
                    }
                    int i59 = zzalcVar2.zza;
                    int length2 = String.valueOf(i59).length() + 66 + String.valueOf(i14).length() + 35 + String.valueOf(i10).length() + 26 + String.valueOf(i11).length() + 33 + String.valueOf(i12).length() + 36;
                    int length3 = String.valueOf(i13).length();
                    j = j17;
                    String str3 = i5 != i8 ? ", ctts invalid" : "";
                    StringBuilder sb = new StringBuilder(length2 + length3 + str3.length());
                    sb.append("Inconsistent stbl box for track ");
                    sb.append(i59);
                    sb.append(": remainingSynchronizationSamples ");
                    sb.append(i14);
                    sb.append(", remainingSamplesAtTimestampDelta ");
                    sb.append(i10);
                    sb.append(", remainingSamplesInChunk ");
                    sb.append(i11);
                    sb.append(", remainingTimestampDeltaChanges ");
                    sb.append(i12);
                    sb.append(", remainingSamplesAtTimestampOffset ");
                    sb.append(i13);
                    sb.append(str3);
                    zzee.zzc("BoxParsers", sb.toString());
                    jArr3 = jArr2;
                    i15 = i9;
                    iArr2 = iArr5;
                    j2 = j;
                    j3 = j13;
                    i16 = i50;
                }
                long[] jArr10 = jArr;
                j4 = zzalcVar2.zzf;
                if (j4 > 0) {
                    long zzt = zzfj.zzt(j3 * 8, 1000000L, j4, RoundingMode.HALF_DOWN);
                    if (zzt > 0 && zzt < 2147483647L) {
                        zzt zza5 = zzvVar.zza();
                        zza5.zzh((int) zzt);
                        zzalcVar2 = zzalcVar2.zzb(zza5.zzM());
                    }
                }
                long j18 = zzalcVar2.zzc;
                long zzt2 = zzfj.zzt(j2, 1000000L, j18, RoundingMode.DOWN);
                int[] zzf = zzgxz.zzf(arrayList);
                jArr4 = zzalcVar2.zzi;
                if (jArr4 != null) {
                    zzfj.zzu(jArr3, 1000000L, j18);
                    return new zzalf(zzalcVar2, jArr10, iArr2, i16, jArr3, iArr, zzf, r31, zzt2, i15);
                }
                int[] iArr8 = iArr;
                int length4 = jArr4.length;
                if (length4 == 1) {
                    if (zzalcVar2.zzb != 1 || (length = jArr3.length) < 2) {
                        j5 = j18;
                    } else {
                        long[] jArr11 = zzalcVar2.zzj;
                        jArr11.getClass();
                        long j19 = jArr11[i3];
                        long j20 = jArr4[i3];
                        long j21 = zzalcVar2.zzd;
                        long zzt3 = zzfj.zzt(j20, j18, j21, RoundingMode.DOWN) + j19;
                        int i60 = length - 1;
                        int i61 = i3;
                        int max = Math.max(i61, Math.min(4, i60));
                        int max2 = Math.max(i61, Math.min(length - 4, i60));
                        if (jArr3[i61] > j19 || j19 >= jArr3[max] || jArr3[max2] >= zzt3 || zzt3 > 2 + j2) {
                            j5 = j18;
                        } else {
                            long max3 = Math.max(0L, j2 - zzt3);
                            long j22 = j19 - jArr3[0];
                            long j23 = zzalcVar2.zzg.zzH;
                            long zzt4 = zzfj.zzt(j22, j23, j18, RoundingMode.DOWN);
                            long zzt5 = zzfj.zzt(max3, j23, j18, RoundingMode.DOWN);
                            j5 = j18;
                            if (zzt4 == 0) {
                                if (zzt5 != 0) {
                                    zzt4 = 0;
                                }
                            }
                            if (zzt4 <= 2147483647L && zzt5 <= 2147483647L) {
                                zzafnVar.zza = (int) zzt4;
                                zzafnVar.zzb = (int) zzt5;
                                zzfj.zzu(jArr3, 1000000L, j5);
                                return new zzalf(zzalcVar2, jArr10, iArr2, i16, jArr3, iArr8, zzf, r31, zzfj.zzt(jArr4[0], 1000000L, j21, RoundingMode.DOWN), i15);
                            }
                        }
                    }
                    i19 = 1;
                    length4 = 1;
                } else {
                    j5 = j18;
                    i19 = 1;
                }
                if (length4 == i19 && jArr4[0] == 0) {
                    long[] jArr12 = zzalcVar2.zzj;
                    jArr12.getClass();
                    long j24 = jArr12[0];
                    int i62 = 0;
                    while (i62 < jArr3.length) {
                        long j25 = j5;
                        jArr3[i62] = zzfj.zzt(jArr3[i62] - j24, 1000000L, j25, RoundingMode.DOWN);
                        i62++;
                        j5 = j25;
                    }
                    return new zzalf(zzalcVar2, jArr10, iArr2, i16, jArr3, iArr8, zzf, r31, zzfj.zzt(j2 - j24, 1000000L, j5, RoundingMode.DOWN), i15);
                }
                long j26 = j5;
                int[] iArr9 = iArr2;
                int i63 = i15;
                boolean z5 = zzalcVar2.zzb == 1;
                long[] jArr13 = zzalcVar2.zzj;
                int[] iArr10 = new int[length4];
                int[] iArr11 = new int[length4];
                jArr13.getClass();
                long[] jArr14 = jArr13;
                int i64 = 0;
                int i65 = 0;
                int i66 = 0;
                boolean z6 = false;
                while (i65 < jArr4.length) {
                    int[] iArr12 = iArr10;
                    long j27 = jArr14[i65];
                    if (j27 != -1) {
                        jArr5 = jArr14;
                        i20 = i65;
                        long j28 = j26;
                        j26 = j28;
                        long zzt6 = zzfj.zzt(jArr4[i65], j28, zzalcVar2.zzd, RoundingMode.DOWN) + j27;
                        boolean z7 = z6;
                        iArr12[i20] = zzfj.zzm(jArr3, j27, true, true);
                        int zzo = zzfj.zzo(jArr3, zzt6, z5, false);
                        z3 = z5;
                        int i67 = zzo - 1;
                        int i68 = 0;
                        for (int i69 = zzo; i69 < jArr3.length; i69++) {
                            if (jArr3[i69] >= zzt6) {
                                i68++;
                                if (i68 > zzalcVar2.zzg.zzq) {
                                    break;
                                }
                            } else {
                                i67 = i69;
                            }
                        }
                        iArr11[i20] = i67 + 1;
                        int i70 = iArr12[i20];
                        while (true) {
                            i21 = iArr12[i20];
                            if (i21 <= 0 || (iArr8[i21] & 1) != 0) {
                                break;
                            }
                            iArr12[i20] = i21 - 1;
                        }
                        if (i21 == 0) {
                            z4 = false;
                            if ((iArr8[0] & 1) == 0) {
                                iArr12[i20] = i70;
                                while (true) {
                                    i21 = iArr12[i20];
                                    if (i21 >= iArr11[i20] || (iArr8[i21] & 1) != 0) {
                                        break;
                                    }
                                    iArr12[i20] = i21 + 1;
                                }
                            }
                        } else {
                            z4 = false;
                        }
                        int i71 = iArr11[i20];
                        i66 += i71 - i21;
                        z6 = z7 | (i64 != i21 ? true : z4);
                        i64 = i71;
                    } else {
                        z3 = z5;
                        jArr5 = jArr14;
                        i20 = i65;
                    }
                    i65 = i20 + 1;
                    jArr14 = jArr5;
                    iArr10 = iArr12;
                    z5 = z3;
                }
                int[] iArr13 = iArr10;
                boolean z8 = z6 | (i66 != i63);
                long[] jArr15 = z8 ? new long[i66] : jArr10;
                int[] iArr14 = z8 ? new int[i66] : iArr9;
                if (true == z8) {
                    i16 = 0;
                }
                int[] iArr15 = z8 ? new int[i66] : iArr8;
                if (z8) {
                    arrayList = new ArrayList();
                }
                long[] jArr16 = new long[i66];
                int i72 = 0;
                boolean z9 = false;
                int i73 = 0;
                int i74 = i16;
                long j29 = 0;
                while (i72 < jArr4.length) {
                    long j30 = jArr13[i72];
                    int i75 = iArr13[i72];
                    long[] jArr17 = jArr4;
                    int i76 = iArr11[i72];
                    long[] jArr18 = jArr16;
                    if (z8) {
                        int i77 = i76 - i75;
                        System.arraycopy(jArr10, i75, jArr15, i73, i77);
                        System.arraycopy(iArr9, i75, iArr14, i73, i77);
                        System.arraycopy(iArr8, i75, iArr15, i73, i77);
                    }
                    while (i75 < i76) {
                        int[] iArr16 = iArr14;
                        int[] iArr17 = iArr15;
                        long zzt7 = zzfj.zzt(j29, 1000000L, zzalcVar2.zzd, RoundingMode.DOWN);
                        long zzt8 = zzfj.zzt(jArr3[i75] - j30, 1000000L, j26, RoundingMode.DOWN);
                        z9 = (!(zzt8 >= 0)) | z9;
                        jArr18[i73] = zzt7 + zzt8;
                        if (z8 && iArr16[i73] > i74) {
                            i74 = iArr9[i75];
                        }
                        if (z8 && r31 == 0 && (iArr17[i73] & 1) != 0) {
                            arrayList.add(Integer.valueOf(i73));
                        }
                        i73++;
                        i75++;
                        iArr14 = iArr16;
                        iArr15 = iArr17;
                    }
                    j29 += jArr17[i72];
                    i72++;
                    iArr14 = iArr14;
                    jArr4 = jArr17;
                    jArr16 = jArr18;
                    iArr15 = iArr15;
                }
                int[] iArr18 = iArr15;
                long[] jArr19 = jArr16;
                int[] iArr19 = iArr14;
                long zzt9 = zzfj.zzt(j29, 1000000L, zzalcVar2.zzd, RoundingMode.DOWN);
                if (z9) {
                    zzt zza6 = zzalcVar2.zzg.zza();
                    zza6.zzs(true);
                    zzalcVar2 = zzalcVar2.zzb(zza6.zzM());
                }
                return new zzalf(zzalcVar2, jArr15, iArr19, i74, jArr19, iArr18, zzgxz.zzf(arrayList), r31, zzt9, jArr15.length);
            }
        } else {
            i5 = 1;
        }
        i6 = i3;
        ArrayList arrayList2 = new ArrayList();
        if (zzerVar3 != null) {
        }
        if (i6 == 0) {
        }
        long[] jArr102 = jArr;
        j4 = zzalcVar2.zzf;
        if (j4 > 0) {
        }
        long j182 = zzalcVar2.zzc;
        long zzt22 = zzfj.zzt(j2, 1000000L, j182, RoundingMode.DOWN);
        int[] zzf2 = zzgxz.zzf(arrayList2);
        jArr4 = zzalcVar2.zzi;
        if (jArr4 != null) {
        }
    }

    private static zzap zzh(zzer zzerVar) {
        short zzv = zzerVar.zzv();
        zzerVar.zzk(2);
        String zzK = zzerVar.zzK(zzv, StandardCharsets.UTF_8);
        int max = Math.max(zzK.lastIndexOf(43), zzK.lastIndexOf(45));
        try {
            return new zzap(-9223372036854775807L, new zzfx(Float.parseFloat(zzK.substring(0, max)), Float.parseFloat(zzK.substring(max, zzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzi(zzer zzerVar) {
        zzerVar.zzh(16);
        return zzerVar.zzB();
    }

    private static String zzj(byte[] bArr, int i, int i2) {
        zzgrc.zzi(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            int zze = zzgxz.zze(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3]);
            String str = zzfj.zza;
            int i4 = ((zze >> 8) & 255) - 128;
            int i5 = (zze >> 16) & 255;
            int i6 = (zze & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(i5 + ((i6 * 17790) / 10000), 255)) | (Math.max(0, Math.min(((i4 * 14075) / 10000) + i5, 255)) << 16) | (Math.max(0, Math.min((i5 - ((i6 * 3455) / 10000)) - ((i4 * 7169) / 10000), 255)) << 8))));
        }
        String zzd = zzgqw.zzd(arrayList, ", ");
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 7 + String.valueOf(i2).length() + 10 + zzd.length() + 1);
        sb.append("size: ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("\npalette: ");
        sb.append(zzd);
        sb.append("\n");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x014e, code lost:
    
        if (r6 == 1) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzi zzk(zzer zzerVar) {
        int i;
        int zzj;
        int zzj2;
        zzh zzhVar = new zzh();
        byte[] zzi = zzerVar.zzi();
        zzeq zzeqVar = new zzeq(zzi, zzi.length);
        zzeqVar.zzf(zzerVar.zzg() * 8);
        zzeqVar.zzo(1);
        int zzj3 = zzeqVar.zzj(3);
        zzeqVar.zzh(6);
        boolean zzi2 = zzeqVar.zzi();
        boolean zzi3 = zzeqVar.zzi();
        boolean z = false;
        if (zzj3 == 2) {
            if (zzi2) {
                i = true == zzi3 ? 12 : 10;
                zzhVar.zze(i);
                zzhVar.zzf(i);
                int i2 = 13;
                zzeqVar.zzh(13);
                zzeqVar.zzg();
                zzj = zzeqVar.zzj(4);
                if (zzj == 1) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzj).length() + 22);
                    sb.append("Unsupported obu_type: ");
                    sb.append(zzj);
                    zzee.zzb("BoxParsers", sb.toString());
                    return zzhVar.zzg();
                }
                if (zzeqVar.zzi()) {
                    zzee.zzb("BoxParsers", "Unsupported obu_extension_flag");
                    return zzhVar.zzg();
                }
                boolean zzi4 = zzeqVar.zzi();
                zzeqVar.zzg();
                if (zzi4 && zzeqVar.zzj(8) > 127) {
                    zzee.zzb("BoxParsers", "Excessive obu_size");
                    return zzhVar.zzg();
                }
                int zzj4 = zzeqVar.zzj(3);
                zzeqVar.zzg();
                if (zzeqVar.zzi()) {
                    zzee.zzb("BoxParsers", "Unsupported reduced_still_picture_header");
                    return zzhVar.zzg();
                }
                if (zzeqVar.zzi()) {
                    zzee.zzb("BoxParsers", "Unsupported timing_info_present_flag");
                    return zzhVar.zzg();
                }
                if (zzeqVar.zzi()) {
                    zzee.zzb("BoxParsers", "Unsupported initial_display_delay_present_flag");
                    return zzhVar.zzg();
                }
                int zzj5 = zzeqVar.zzj(5);
                for (int i3 = 0; i3 <= zzj5; i3++) {
                    zzeqVar.zzh(12);
                    if (zzeqVar.zzj(5) > 7) {
                        zzeqVar.zzg();
                    }
                }
                int zzj6 = zzeqVar.zzj(4);
                int zzj7 = zzeqVar.zzj(4);
                zzeqVar.zzh(zzj6 + 1);
                zzeqVar.zzh(zzj7 + 1);
                if (zzeqVar.zzi()) {
                    zzeqVar.zzh(7);
                }
                zzeqVar.zzh(7);
                boolean zzi5 = zzeqVar.zzi();
                if (zzi5) {
                    zzeqVar.zzh(2);
                }
                if ((zzeqVar.zzi() || zzeqVar.zzj(1) > 0) && !zzeqVar.zzi()) {
                    zzeqVar.zzh(1);
                }
                if (zzi5) {
                    zzeqVar.zzh(3);
                }
                zzeqVar.zzh(3);
                boolean zzi6 = zzeqVar.zzi();
                if (zzj4 == 2) {
                    if (zzi6) {
                        zzeqVar.zzg();
                    }
                }
                if (zzeqVar.zzi()) {
                    z = true;
                }
                if (zzeqVar.zzi()) {
                    int zzj8 = zzeqVar.zzj(8);
                    int zzj9 = zzeqVar.zzj(8);
                    int zzj10 = zzeqVar.zzj(8);
                    if (!z && zzj8 == 1) {
                        if (zzj9 != 13) {
                            zzj8 = 1;
                        } else if (zzj10 == 0) {
                            zzj2 = 1;
                            zzj8 = 1;
                            zzhVar.zza(zzi.zzb(zzj8));
                            zzhVar.zzb(zzj2 != 1 ? 2 : 1);
                            zzhVar.zzc(zzi.zzc(i2));
                        } else {
                            zzj8 = 1;
                            zzj2 = zzeqVar.zzj(1);
                            zzhVar.zza(zzi.zzb(zzj8));
                            zzhVar.zzb(zzj2 != 1 ? 2 : 1);
                            zzhVar.zzc(zzi.zzc(i2));
                        }
                    }
                    i2 = zzj9;
                    zzj2 = zzeqVar.zzj(1);
                    zzhVar.zza(zzi.zzb(zzj8));
                    zzhVar.zzb(zzj2 != 1 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(i2));
                }
                return zzhVar.zzg();
            }
            zzi2 = false;
            zzj3 = 2;
        }
        if (zzj3 <= 2) {
            i = true != zzi2 ? 8 : 10;
            zzhVar.zze(i);
            zzhVar.zzf(i);
        }
        int i22 = 13;
        zzeqVar.zzh(13);
        zzeqVar.zzg();
        zzj = zzeqVar.zzj(4);
        if (zzj == 1) {
        }
    }

    private static zzi zzl(zzer zzerVar) {
        zzh zzhVar = new zzh();
        byte[] zzi = zzerVar.zzi();
        zzeq zzeqVar = new zzeq(zzi, zzi.length);
        zzeqVar.zzf(zzerVar.zzg() * 8);
        zzeqVar.zzo(1);
        int zzj = zzeqVar.zzj(8);
        for (int i = 0; i < zzj; i++) {
            zzeqVar.zzo(1);
            int zzj2 = zzeqVar.zzj(8);
            for (int i2 = 0; i2 < zzj2; i2++) {
                zzeqVar.zzh(6);
                boolean zzi2 = zzeqVar.zzi();
                zzeqVar.zzg();
                zzeqVar.zzo(11);
                zzeqVar.zzh(4);
                int zzj3 = zzeqVar.zzj(4) + 8;
                zzhVar.zze(zzj3);
                zzhVar.zzf(zzj3);
                zzeqVar.zzo(1);
                if (zzi2) {
                    int zzj4 = zzeqVar.zzj(8);
                    int zzj5 = zzeqVar.zzj(8);
                    zzeqVar.zzo(1);
                    boolean zzi3 = zzeqVar.zzi();
                    zzhVar.zza(zzi.zzb(zzj4));
                    zzhVar.zzb(true != zzi3 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(zzj5));
                }
            }
        }
        return zzhVar.zzg();
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static Pair zzn(zzfu zzfuVar) {
        zzfv zzc = zzfuVar.zzc(1701606260);
        if (zzc == null) {
            return null;
        }
        zzer zzerVar = zzc.zza;
        zzerVar.zzh(8);
        int zza2 = zza(zzerVar.zzB());
        int zzH = zzerVar.zzH();
        long[] jArr = new long[zzH];
        long[] jArr2 = new long[zzH];
        for (int i = 0; i < zzH; i++) {
            jArr[i] = zza2 == 1 ? zzerVar.zzJ() : zzerVar.zzz();
            jArr2[i] = zza2 == 1 ? zzerVar.zzD() : zzerVar.zzB();
            if (zzerVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzerVar.zzk(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x049e, code lost:
    
        r1.zzk(com.google.android.gms.internal.ads.zzgxz.zza(r1.zzP()));
     */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzo(zzer zzerVar, int i, int i2, int i3, int i4, String str, boolean z, zzq zzqVar, zzakd zzakdVar, int i5) throws zzat {
        int i6;
        int i7;
        int zzt;
        int zzF;
        int zzB;
        int i8;
        int i9;
        String str2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str3;
        int i16;
        int i17;
        int i18;
        boolean z2;
        int i19 = i;
        int i20 = i3;
        zzq zzqVar2 = zzqVar;
        zzerVar.zzh(i2 + 16);
        if (z) {
            i6 = zzerVar.zzt();
            zzerVar.zzk(6);
        } else {
            zzerVar.zzk(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            i7 = 2;
            zzt = zzerVar.zzt();
            zzerVar.zzk(6);
            zzF = zzerVar.zzF();
            zzerVar.zzh(zzerVar.zzg() - 4);
            zzB = zzerVar.zzB();
            i8 = 32;
            if (i6 == 1) {
                zzerVar.zzk(16);
            }
            i9 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            zzerVar.zzk(16);
            zzF = (int) Math.round(Double.longBitsToDouble(zzerVar.zzD()));
            int zzH = zzerVar.zzH();
            zzerVar.zzk(4);
            i7 = 2;
            int zzH2 = zzerVar.zzH();
            int zzH3 = zzerVar.zzH();
            int i21 = zzH3 & 1;
            int i22 = zzH3 & 2;
            if (i21 == 0) {
                if (zzH2 == 8) {
                    i9 = 3;
                } else if (zzH2 == 16) {
                    i9 = i22 != 0 ? 268435456 : 2;
                } else if (zzH2 == 24) {
                    i9 = i22 != 0 ? 1342177280 : 21;
                } else {
                    if (zzH2 == 32) {
                        i9 = i22 != 0 ? 1610612736 : 22;
                    }
                    i9 = -1;
                }
                zzerVar.zzk(8);
                zzt = zzH;
                i8 = 32;
                zzB = 0;
            } else {
                if (zzH2 == 32) {
                    i9 = 4;
                    zzerVar.zzk(8);
                    zzt = zzH;
                    i8 = 32;
                    zzB = 0;
                }
                i9 = -1;
                zzerVar.zzk(8);
                zzt = zzH;
                i8 = 32;
                zzB = 0;
            }
        }
        if (i19 == 1767992678) {
            zzt = -1;
            zzF = -1;
        } else {
            if (i19 == 1935764850) {
                zzF = 8000;
            } else if (i19 == 1935767394) {
                zzF = 16000;
                i19 = 1935767394;
            }
            zzt = 1;
        }
        int zzg = zzerVar.zzg();
        int i23 = 1701733217;
        if (i19 == 1701733217) {
            Pair zzr = zzr(zzerVar, i2, i20);
            if (zzr != null) {
                i23 = ((Integer) zzr.first).intValue();
                zzqVar2 = zzqVar2 == null ? null : zzqVar2.zzb(((zzald) zzr.second).zzb);
                zzakdVar.zza[i5] = (zzald) zzr.second;
            }
            i19 = i23;
            zzerVar.zzh(zzg);
        }
        if (i19 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i19 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i19 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i19 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i19 == 1685353320 || i19 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i19 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i19 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i19 == 1935764850) {
            str2 = "audio/3gpp";
        } else {
            if (i19 != 1935767394) {
                if (i19 != 1936684916) {
                    if (i19 == 1953984371) {
                        i10 = i19;
                        str2 = "audio/raw";
                        i9 = 268435456;
                    } else if (i19 == 1819304813) {
                        if (i9 != -1) {
                            i10 = i19;
                            str2 = "audio/raw";
                        }
                    } else if (i19 == 778924082 || i19 == 778924083) {
                        str2 = "audio/mpeg";
                    } else if (i19 == 1835557169) {
                        str2 = "audio/mha1";
                    } else if (i19 == 1835560241) {
                        i10 = i19;
                        str2 = "audio/mhm1";
                    } else if (i19 == 1634492771) {
                        str2 = "audio/alac";
                    } else if (i19 == 1634492791) {
                        str2 = "audio/g711-alaw";
                    } else if (i19 == 1970037111) {
                        str2 = "audio/g711-mlaw";
                    } else if (i19 == 1332770163) {
                        str2 = "audio/opus";
                    } else if (i19 == 1716281667) {
                        str2 = "audio/flac";
                    } else if (i19 == 1835823201) {
                        str2 = "audio/true-hd";
                    } else if (i19 == 1767992678) {
                        i10 = 1767992678;
                        str2 = "audio/iamf";
                    } else {
                        i10 = i19;
                        str2 = null;
                    }
                    int i24 = i9;
                    String str4 = null;
                    List list = null;
                    zzajy zzajyVar = null;
                    zzajw zzajwVar = null;
                    while (zzg - i2 < i20) {
                        zzerVar.zzh(zzg);
                        int zzB2 = zzerVar.zzB();
                        String str5 = str4;
                        String str6 = "childAtomSize must be positive";
                        zzaey.zza(zzB2 > 0, "childAtomSize must be positive");
                        int zzB3 = zzerVar.zzB();
                        int i25 = zzF;
                        if (zzB3 == 1835557187) {
                            zzerVar.zzh(zzg + 8);
                            zzerVar.zzk(1);
                            int zzs = zzerVar.zzs();
                            zzerVar.zzk(1);
                            String format = Objects.equals(str2, "audio/mhm1") ? String.format("mhm1.%02X", Integer.valueOf(zzs)) : String.format("mha1.%02X", Integer.valueOf(zzs));
                            int zzt2 = zzerVar.zzt();
                            byte[] bArr = new byte[zzt2];
                            str5 = format;
                            zzerVar.zzm(bArr, 0, zzt2);
                            if (list == null) {
                                list = zzguf.zzj(bArr);
                                zzF = i25;
                                i11 = zzB2;
                                i12 = zzg;
                                i13 = zzB;
                                str4 = str5;
                                zzg = i12 + i11;
                                zzB = i13;
                                i7 = 2;
                                i8 = 32;
                                i20 = i3;
                            } else {
                                list = zzguf.zzk(bArr, (byte[]) list.get(0));
                                str4 = str5;
                                zzF = i25;
                                i11 = zzB2;
                                i12 = zzg;
                                i13 = zzB;
                            }
                        } else {
                            if (zzB3 == 1835557200) {
                                zzerVar.zzh(zzg + 8);
                                int zzs2 = zzerVar.zzs();
                                if (zzs2 > 0) {
                                    byte[] bArr2 = new byte[zzs2];
                                    zzerVar.zzm(bArr2, 0, zzs2);
                                    if (list == null) {
                                        list = zzguf.zzj(bArr2);
                                        str4 = str5;
                                        i11 = zzB2;
                                        i12 = zzg;
                                        i13 = zzB;
                                        zzF = i25;
                                    } else {
                                        list = zzguf.zzk((byte[]) list.get(0), bArr2);
                                        str4 = str5;
                                        zzF = i25;
                                        i11 = zzB2;
                                        i12 = zzg;
                                        i13 = zzB;
                                    }
                                }
                                zzF = i25;
                                i11 = zzB2;
                                i12 = zzg;
                                i13 = zzB;
                                str4 = str5;
                            } else {
                                if (zzB3 == 1702061171) {
                                    zzF = i25;
                                    i11 = zzB2;
                                    i12 = zzg;
                                    i13 = zzB;
                                    i14 = i12;
                                    i15 = -1;
                                } else if (z && zzB3 == 2002876005) {
                                    int zzg2 = zzerVar.zzg();
                                    zzaey.zza(zzg2 >= zzg, null);
                                    int i26 = zzg2;
                                    while (true) {
                                        if (i26 - zzg >= zzB2) {
                                            zzF = i25;
                                            i11 = zzB2;
                                            i12 = zzg;
                                            i13 = zzB;
                                            i14 = -1;
                                            i15 = -1;
                                            break;
                                        }
                                        zzerVar.zzh(i26);
                                        int zzB4 = zzerVar.zzB();
                                        if (zzB4 > 0) {
                                            i18 = i26;
                                            z2 = true;
                                        } else {
                                            i18 = i26;
                                            z2 = false;
                                        }
                                        zzaey.zza(z2, str6);
                                        String str7 = str6;
                                        if (zzerVar.zzB() == 1702061171) {
                                            zzF = i25;
                                            i12 = zzg;
                                            i13 = zzB;
                                            i14 = i18;
                                            i15 = -1;
                                            i11 = zzB2;
                                            break;
                                        }
                                        i26 = i18 + zzB4;
                                        str6 = str7;
                                    }
                                } else if (zzB3 == 1651798644) {
                                    zzajwVar = zzq(zzerVar, zzg);
                                    str4 = str5;
                                    zzF = i25;
                                    i11 = zzB2;
                                    i12 = zzg;
                                    i13 = zzB;
                                } else {
                                    if (zzB3 == 1684103987) {
                                        zzerVar.zzh(zzg + 8);
                                        zzakdVar.zzb = zzadv.zza(zzerVar, Integer.toString(i4), str, zzqVar2);
                                    } else if (zzB3 == 1684366131) {
                                        zzerVar.zzh(zzg + 8);
                                        zzakdVar.zzb = zzadv.zzb(zzerVar, Integer.toString(i4), str, zzqVar2);
                                    } else if (zzB3 == 1684103988) {
                                        zzerVar.zzh(zzg + 8);
                                        zzakdVar.zzb = zzady.zza(zzerVar, Integer.toString(i4), str, zzqVar2);
                                    } else if (zzB3 != 1684892784) {
                                        if (zzB3 == 1684305011 || zzB3 == 1969517683) {
                                            i11 = zzB2;
                                            i12 = zzg;
                                            i13 = zzB;
                                            zzt zztVar = new zzt();
                                            zztVar.zzb(i4);
                                            zztVar.zzm(str2);
                                            zztVar.zzE(zzt);
                                            zzF = i25;
                                            zztVar.zzF(zzF);
                                            zztVar.zzq(zzqVar2);
                                            zztVar.zze(str);
                                            zzakdVar.zzb = zztVar.zzM();
                                        } else {
                                            if (zzB3 == 1682927731) {
                                                int i27 = zzB2 - 8;
                                                byte[] bArr3 = zzb;
                                                int length = bArr3.length;
                                                i11 = zzB2;
                                                byte[] copyOf = Arrays.copyOf(bArr3, length + i27);
                                                zzerVar.zzh(zzg + 8);
                                                zzerVar.zzm(copyOf, length, i27);
                                                list = zzafu.zza(copyOf);
                                            } else {
                                                i11 = zzB2;
                                                if (zzB3 == 1684425825) {
                                                    byte[] bArr4 = new byte[i11 - 8];
                                                    bArr4[0] = 102;
                                                    bArr4[1] = 76;
                                                    bArr4[i7] = 97;
                                                    bArr4[3] = 67;
                                                    zzerVar.zzh(zzg + 12);
                                                    zzerVar.zzm(bArr4, 4, i11 - 12);
                                                    list = zzguf.zzj(bArr4);
                                                } else if (zzB3 == 1634492771) {
                                                    int i28 = i11 - 12;
                                                    byte[] bArr5 = new byte[i28];
                                                    zzerVar.zzh(zzg + 12);
                                                    zzerVar.zzm(bArr5, 0, i28);
                                                    int i29 = zzdo.zza;
                                                    zzer zzerVar2 = new zzer(bArr5);
                                                    zzerVar2.zzh(5);
                                                    int zzs3 = zzerVar2.zzs();
                                                    zzerVar2.zzh(9);
                                                    int zzs4 = zzerVar2.zzs();
                                                    zzerVar2.zzh(20);
                                                    int[] iArr = {zzerVar2.zzH(), zzs4, zzs3};
                                                    int i30 = iArr[0];
                                                    int i31 = iArr[1];
                                                    int zzz = zzfj.zzz(zzs3, ByteOrder.LITTLE_ENDIAN);
                                                    list = zzguf.zzj(bArr5);
                                                    zzt = i31;
                                                    i24 = zzz;
                                                    zzF = i30;
                                                    i12 = zzg;
                                                    i13 = zzB;
                                                    str4 = str5;
                                                } else if (zzB3 == 1767990114) {
                                                    zzerVar.zzh(zzg + 9);
                                                    int zza2 = zzgxz.zza(zzerVar.zzP());
                                                    byte[] bArr6 = new byte[zza2];
                                                    zzerVar.zzm(bArr6, 0, zza2);
                                                    int i32 = zzdo.zza;
                                                    zzer zzerVar3 = new zzer(bArr6);
                                                    String str8 = null;
                                                    String str9 = null;
                                                    while (zzerVar3.zzd() > 0 && (str8 == null || str9 == null)) {
                                                        int zzs5 = zzerVar3.zzs();
                                                        byte[] bArr7 = bArr6;
                                                        int i33 = zzs5 >> 3;
                                                        int i34 = zzs5 & 2;
                                                        int i35 = zzs5 & 1;
                                                        int zza3 = zzgxz.zza(zzerVar3.zzP());
                                                        if (i33 > 4 && i33 < 24 && i34 != 0) {
                                                            zzerVar3.zzQ();
                                                            zzerVar3.zzQ();
                                                        }
                                                        int zzg3 = zzerVar3.zzg() + zza3;
                                                        int i36 = zzg;
                                                        if (i33 == 31) {
                                                            zzerVar3.zzk(4);
                                                            Object[] objArr = {Integer.valueOf(zzerVar3.zzs()), Integer.valueOf(zzerVar3.zzs())};
                                                            String str10 = zzfj.zza;
                                                            str8 = String.format(Locale.US, "iamf.%03X.%03X", objArr);
                                                        } else if (i33 == 0) {
                                                            zzerVar3.zzQ();
                                                            String zzK = zzerVar3.zzK(4, StandardCharsets.UTF_8);
                                                            if (zzK.equals("mp4a")) {
                                                                zzerVar3.zzQ();
                                                                zzerVar3.zzk(i7);
                                                                zzeq zzeqVar = new zzeq();
                                                                zzeqVar.zza(zzerVar3);
                                                                int zzj = zzeqVar.zzj(5);
                                                                i17 = zzB;
                                                                if (zzj == 31) {
                                                                    zzj = zzeqVar.zzj(6) + 32;
                                                                }
                                                                StringBuilder sb = new StringBuilder(zzK.length() + 4 + String.valueOf(zzj).length());
                                                                sb.append(zzK);
                                                                sb.append(".40.");
                                                                sb.append(zzj);
                                                                zzK = sb.toString();
                                                            } else {
                                                                i17 = zzB;
                                                            }
                                                            str9 = zzK;
                                                            zzerVar3.zzh(zzg3);
                                                            bArr6 = bArr7;
                                                            zzg = i36;
                                                            zzB = i17;
                                                            i7 = 2;
                                                        }
                                                        i17 = zzB;
                                                        zzerVar3.zzh(zzg3);
                                                        bArr6 = bArr7;
                                                        zzg = i36;
                                                        zzB = i17;
                                                        i7 = 2;
                                                    }
                                                    byte[] bArr8 = bArr6;
                                                    i12 = zzg;
                                                    i13 = zzB;
                                                    if (str8 == null || str9 == null) {
                                                        str4 = null;
                                                    } else {
                                                        StringBuilder sb2 = new StringBuilder(str8.length() + 1 + str9.length());
                                                        sb2.append(str8);
                                                        sb2.append(".");
                                                        sb2.append(str9);
                                                        str4 = sb2.toString();
                                                    }
                                                    list = zzguf.zzj(bArr8);
                                                    zzF = i25;
                                                } else {
                                                    i12 = zzg;
                                                    i13 = zzB;
                                                    if (zzB3 == 1885564227) {
                                                        zzerVar.zzh(i12 + 12);
                                                        ByteOrder byteOrder = (zzerVar.zzs() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                                        int zzs6 = zzerVar.zzs();
                                                        if (i10 == 1768973165) {
                                                            i16 = zzfj.zzz(zzs6, byteOrder);
                                                        } else {
                                                            if (i10 == 1718641517 && zzs6 == i8 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                                                                i16 = 4;
                                                            }
                                                            i16 = i24;
                                                        }
                                                        zzF = i25;
                                                        i24 = i16;
                                                        if (i16 != -1) {
                                                            str2 = "audio/raw";
                                                        }
                                                    } else {
                                                        zzF = i25;
                                                    }
                                                }
                                            }
                                            str4 = str5;
                                            zzF = i25;
                                            i12 = zzg;
                                            i13 = zzB;
                                        }
                                        str4 = str5;
                                    } else {
                                        if (zzB <= 0) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(zzB).length() + 49);
                                            sb3.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                            sb3.append(zzB);
                                            throw zzat.zzb(sb3.toString(), null);
                                        }
                                        str4 = str5;
                                        i11 = zzB2;
                                        i12 = zzg;
                                        zzF = zzB;
                                        i13 = zzF;
                                        zzt = i7;
                                    }
                                    zzF = i25;
                                    i11 = zzB2;
                                    i12 = zzg;
                                    i13 = zzB;
                                    str4 = str5;
                                }
                                if (i14 != i15) {
                                    zzajyVar = zzp(zzerVar, i14);
                                    String zza4 = zzajyVar.zza();
                                    byte[] zzb2 = zzajyVar.zzb();
                                    if (zzb2 != null) {
                                        if ("audio/vorbis".equals(zza4)) {
                                            zzer zzerVar4 = new zzer(zzb2);
                                            int i37 = 1;
                                            zzerVar4.zzk(1);
                                            int i38 = 0;
                                            while (zzerVar4.zzd() > 0 && zzerVar4.zzn() == 255) {
                                                zzerVar4.zzk(i37);
                                                i38 += 255;
                                                i37 = 1;
                                            }
                                            int zzs7 = i38 + zzerVar4.zzs();
                                            int i39 = 0;
                                            while (zzerVar4.zzd() > 0 && zzerVar4.zzn() == 255) {
                                                zzerVar4.zzk(1);
                                                i39 += 255;
                                            }
                                            int zzs8 = i39 + zzerVar4.zzs();
                                            byte[] bArr9 = new byte[zzs7];
                                            int zzg4 = zzerVar4.zzg();
                                            System.arraycopy(zzb2, zzg4, bArr9, 0, zzs7);
                                            int i40 = zzg4 + zzs7 + zzs8;
                                            int length2 = zzb2.length - i40;
                                            byte[] bArr10 = new byte[length2];
                                            System.arraycopy(zzb2, i40, bArr10, 0, length2);
                                            list = zzguf.zzk(bArr9, bArr10);
                                        } else {
                                            if ("audio/mp4a-latm".equals(zza4)) {
                                                zzads zza5 = zzadt.zza(zzb2);
                                                zzF = zza5.zza;
                                                zzt = zza5.zzb;
                                                str3 = zza5.zzc;
                                            } else {
                                                str3 = str5;
                                            }
                                            zzguf zzj2 = zzguf.zzj(zzb2);
                                            str2 = zza4;
                                            str4 = str3;
                                            list = zzj2;
                                        }
                                    }
                                    str2 = zza4;
                                    str4 = str5;
                                }
                                str4 = str5;
                            }
                            zzg = i12 + i11;
                            zzB = i13;
                            i7 = 2;
                            i8 = 32;
                            i20 = i3;
                        }
                        zzg = i12 + i11;
                        zzB = i13;
                        i7 = 2;
                        i8 = 32;
                        i20 = i3;
                    }
                    String str11 = str4;
                    if (zzakdVar.zzb != null || str2 == null) {
                        return;
                    }
                    zzt zztVar2 = new zzt();
                    zztVar2.zzb(i4);
                    zztVar2.zzm(str2);
                    zztVar2.zzj(str11);
                    zztVar2.zzE(zzt);
                    zztVar2.zzF(zzF);
                    zztVar2.zzG(i24);
                    zztVar2.zzp(list);
                    zztVar2.zzq(zzqVar2);
                    zztVar2.zze(str);
                    if (zzajyVar != null) {
                        zztVar2.zzh(zzgxz.zzb(zzajyVar.zzc()));
                        zztVar2.zzi(zzgxz.zzb(zzajyVar.zzd()));
                    } else if (zzajwVar != null) {
                        zztVar2.zzh(zzgxz.zzb(zzajwVar.zza()));
                        zztVar2.zzi(zzgxz.zzb(zzajwVar.zzb()));
                    }
                    zzakdVar.zzb = zztVar2.zzM();
                    return;
                }
                i10 = i19;
                i9 = i7;
                str2 = "audio/raw";
                int i242 = i9;
                String str42 = null;
                List list2 = null;
                zzajy zzajyVar2 = null;
                zzajw zzajwVar2 = null;
                while (zzg - i2 < i20) {
                }
                String str112 = str42;
                if (zzakdVar.zzb != null) {
                    return;
                } else {
                    return;
                }
            }
            str2 = "audio/amr-wb";
        }
        i10 = i19;
        int i2422 = i9;
        String str422 = null;
        List list22 = null;
        zzajy zzajyVar22 = null;
        zzajw zzajwVar22 = null;
        while (zzg - i2 < i20) {
        }
        String str1122 = str422;
        if (zzakdVar.zzb != null) {
        }
    }

    private static zzajy zzp(zzer zzerVar, int i) {
        zzerVar.zzh(i + 12);
        zzerVar.zzk(1);
        zzs(zzerVar);
        zzerVar.zzk(2);
        int zzs = zzerVar.zzs();
        if ((zzs & 128) != 0) {
            zzerVar.zzk(2);
        }
        if ((zzs & 64) != 0) {
            zzerVar.zzk(zzerVar.zzs());
        }
        if ((zzs & 32) != 0) {
            zzerVar.zzk(2);
        }
        zzerVar.zzk(1);
        zzs(zzerVar);
        String zze = zzas.zze(zzerVar.zzs());
        if ("audio/mpeg".equals(zze) || "audio/vnd.dts".equals(zze) || "audio/vnd.dts.hd".equals(zze)) {
            return new zzajy(zze, null, -1L, -1L);
        }
        zzerVar.zzk(4);
        long zzz = zzerVar.zzz();
        long zzz2 = zzerVar.zzz();
        zzerVar.zzk(1);
        int zzs2 = zzs(zzerVar);
        long j = zzz2;
        byte[] bArr = new byte[zzs2];
        zzerVar.zzm(bArr, 0, zzs2);
        if (j <= 0) {
            j = -1;
        }
        return new zzajy(zze, bArr, j, zzz > 0 ? zzz : -1L);
    }

    private static zzajw zzq(zzer zzerVar, int i) {
        zzerVar.zzh(i + 8);
        zzerVar.zzk(4);
        return new zzajw(zzerVar.zzz(), zzerVar.zzz());
    }

    private static Pair zzr(zzer zzerVar, int i, int i2) throws zzat {
        Integer num;
        zzald zzaldVar;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int zzg = zzerVar.zzg();
        while (zzg - i < i2) {
            zzerVar.zzh(zzg);
            int zzB = zzerVar.zzB();
            zzaey.zza(zzB > 0, "childAtomSize must be positive");
            if (zzerVar.zzB() == 1936289382) {
                int i5 = zzg + 8;
                int i6 = 0;
                int i7 = -1;
                Integer num3 = null;
                String str = null;
                while (i5 - zzg < zzB) {
                    zzerVar.zzh(i5);
                    int zzB2 = zzerVar.zzB();
                    int zzB3 = zzerVar.zzB();
                    if (zzB3 == 1718775137) {
                        num3 = Integer.valueOf(zzerVar.zzB());
                    } else if (zzB3 == 1935894637) {
                        zzerVar.zzk(4);
                        str = zzerVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (zzB3 == 1935894633) {
                        i7 = i5;
                        i6 = zzB2;
                    }
                    i5 += zzB2;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzaey.zza(num3 != null, "frma atom is mandatory");
                    zzaey.zza(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = num3;
                            zzaldVar = null;
                            break;
                        }
                        zzerVar.zzh(i8);
                        int zzB4 = zzerVar.zzB();
                        if (zzerVar.zzB() == 1952804451) {
                            int zza2 = zza(zzerVar.zzB());
                            zzerVar.zzk(1);
                            if (zza2 == 0) {
                                zzerVar.zzk(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int zzs = zzerVar.zzs();
                                i3 = zzs & 15;
                                i4 = (zzs & 240) >> 4;
                            }
                            if (zzerVar.zzs() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int zzs2 = zzerVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzerVar.zzm(bArr2, 0, 16);
                            if (z && zzs2 == 0) {
                                int zzs3 = zzerVar.zzs();
                                byte[] bArr3 = new byte[zzs3];
                                zzerVar.zzm(bArr3, 0, zzs3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzaldVar = new zzald(z, str, zzs2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zzB4;
                        }
                    }
                    zzaey.zza(zzaldVar != null, "tenc atom is mandatory");
                    String str2 = zzfj.zza;
                    create = Pair.create(num, zzaldVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzg += zzB;
        }
        return null;
    }

    private static int zzs(zzer zzerVar) {
        int zzs = zzerVar.zzs();
        int i = zzs & 127;
        while ((zzs & 128) == 128) {
            zzs = zzerVar.zzs();
            i = (i << 7) | (zzs & 127);
        }
        return i;
    }
}

package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.work.WorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaia {
    private static final byte[] zza;

    static {
        int i = zzfs.zza;
        zza = "OpusHead".getBytes(zzftl.zzc);
    }

    public static zzcb zza(zzahq zzahqVar) {
        zzfw zzfwVar;
        zzahr zzb = zzahqVar.zzb(1751411826);
        zzahr zzb2 = zzahqVar.zzb(1801812339);
        zzahr zzb3 = zzahqVar.zzb(1768715124);
        if (zzb != null && zzb2 != null && zzb3 != null && zzg(zzb.zza) == 1835299937) {
            zzfj zzfjVar = zzb2.zza;
            zzfjVar.zzG(12);
            int zzf = zzfjVar.zzf();
            String[] strArr = new String[zzf];
            for (int i = 0; i < zzf; i++) {
                int zzf2 = zzfjVar.zzf();
                zzfjVar.zzH(4);
                strArr[i] = zzfjVar.zzy(zzf2 - 8, zzftl.zzc);
            }
            zzfj zzfjVar2 = zzb3.zza;
            zzfjVar2.zzG(8);
            ArrayList arrayList = new ArrayList();
            while (zzfjVar2.zza() > 8) {
                int zzc = zzfjVar2.zzc() + zzfjVar2.zzf();
                int zzf3 = zzfjVar2.zzf() - 1;
                if (zzf3 < 0 || zzf3 >= zzf) {
                    zzez.zzf("AtomParsers", "Skipped metadata with unknown key index: " + zzf3);
                } else {
                    String str = strArr[zzf3];
                    int i2 = zzaih.zzb;
                    while (true) {
                        int zzc2 = zzfjVar2.zzc();
                        if (zzc2 >= zzc) {
                            zzfwVar = null;
                            break;
                        }
                        int zzf4 = zzfjVar2.zzf();
                        if (zzfjVar2.zzf() == 1684108385) {
                            int zzf5 = zzfjVar2.zzf();
                            int zzf6 = zzfjVar2.zzf();
                            int i3 = zzf4 - 16;
                            byte[] bArr = new byte[i3];
                            zzfjVar2.zzC(bArr, 0, i3);
                            zzfwVar = new zzfw(str, bArr, zzf6, zzf5);
                            break;
                        }
                        zzfjVar2.zzG(zzc2 + zzf4);
                    }
                    if (zzfwVar != null) {
                        arrayList.add(zzfwVar);
                    }
                }
                zzfjVar2.zzG(zzc);
            }
            if (!arrayList.isEmpty()) {
                return new zzcb(arrayList);
            }
        }
        return null;
    }

    public static zzcb zzb(zzahr zzahrVar) {
        int zzm;
        zzfj zzfjVar = zzahrVar.zza;
        zzfjVar.zzG(8);
        zzcb zzcbVar = new zzcb(-9223372036854775807L, new zzca[0]);
        while (zzfjVar.zza() >= 8) {
            int zzc = zzfjVar.zzc();
            int zzf = zzfjVar.zzf() + zzc;
            int zzf2 = zzfjVar.zzf();
            zzcb zzcbVar2 = null;
            if (zzf2 == 1835365473) {
                zzfjVar.zzG(zzc);
                zzfjVar.zzH(8);
                zze(zzfjVar);
                while (true) {
                    if (zzfjVar.zzc() >= zzf) {
                        break;
                    }
                    int zzc2 = zzfjVar.zzc();
                    int zzf3 = zzfjVar.zzf() + zzc2;
                    if (zzfjVar.zzf() == 1768715124) {
                        zzfjVar.zzG(zzc2);
                        zzfjVar.zzH(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzfjVar.zzc() < zzf3) {
                            zzca zza2 = zzaih.zza(zzfjVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzcbVar2 = new zzcb(arrayList);
                        }
                    } else {
                        zzfjVar.zzG(zzf3);
                    }
                }
                zzcbVar = zzcbVar.zzd(zzcbVar2);
            } else if (zzf2 == 1936553057) {
                zzfjVar.zzG(zzc);
                zzfjVar.zzH(12);
                while (true) {
                    if (zzfjVar.zzc() >= zzf) {
                        break;
                    }
                    int zzc3 = zzfjVar.zzc();
                    int zzf4 = zzfjVar.zzf();
                    if (zzfjVar.zzf() != 1935766900) {
                        zzfjVar.zzG(zzc3 + zzf4);
                    } else if (zzf4 >= 16) {
                        zzfjVar.zzH(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int zzl = zzfjVar.zzl();
                            int zzl2 = zzfjVar.zzl();
                            if (zzl == 0) {
                                i = zzl2;
                            } else if (zzl == 1) {
                                i2 = zzl2;
                            }
                        }
                        if (i == 12) {
                            zzm = 240;
                        } else if (i == 13) {
                            zzm = 120;
                        } else {
                            if (i == 21 && zzfjVar.zza() >= 8 && zzfjVar.zzc() + 8 <= zzf) {
                                int zzf5 = zzfjVar.zzf();
                                int zzf6 = zzfjVar.zzf();
                                if (zzf5 >= 12 && zzf6 == 1936877170) {
                                    zzm = zzfjVar.zzm();
                                }
                            }
                            zzm = -2147483647;
                        }
                        if (zzm != -2147483647) {
                            zzcbVar2 = new zzcb(-9223372036854775807L, new zzagr(zzm, i2));
                        }
                    }
                }
                zzcbVar = zzcbVar.zzd(zzcbVar2);
            } else if (zzf2 == -1451722374) {
                zzcbVar = zzcbVar.zzd(zzi(zzfjVar));
            }
            zzfjVar.zzG(zzf);
        }
        return zzcbVar;
    }

    public static zzgc zzc(zzfj zzfjVar) {
        long zzs;
        long zzs2;
        zzfjVar.zzG(8);
        if (zzahs.zze(zzfjVar.zzf()) == 0) {
            zzs = zzfjVar.zzt();
            zzs2 = zzfjVar.zzt();
        } else {
            zzs = zzfjVar.zzs();
            zzs2 = zzfjVar.zzs();
        }
        return new zzgc(zzs, zzs2, zzfjVar.zzt());
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e5, code lost:
    
        if (r9 == 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:264:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x09f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List zzd(zzahq zzahqVar, zzacu zzacuVar, long j, zzad zzadVar, boolean z, boolean z2, zzftn zzftnVar) throws zzcf {
        long j2;
        int i;
        int i2;
        long j3;
        zzahr zzb;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        zzahq zzahqVar2;
        long[] jArr;
        long[] jArr2;
        zzaip zzaipVar;
        int i6;
        zzftn zzftnVar2;
        Pair create;
        int i7;
        boolean z3;
        String str;
        Pair pair;
        long j4;
        zzahq zzahqVar3;
        char c;
        zzfj zzfjVar;
        zzad zzadVar2;
        int i8;
        String str2;
        int i9;
        zzahw zzahwVar;
        int i10;
        int i11;
        float f;
        String str3;
        byte[] bArr;
        int i12;
        int i13;
        int i14;
        int i15;
        zzahw zzahwVar2;
        long j5;
        long j6;
        int i16;
        int i17;
        int i18;
        boolean z4;
        zzahw zzahwVar3;
        int i19;
        int i20;
        int i21;
        float f2;
        String str4;
        boolean z5;
        byte[] bArr2;
        int i22;
        List list;
        float f3;
        boolean z6;
        String str5;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        String str6;
        boolean z7;
        String str7;
        String str8;
        zzfwu zzm;
        Pair pair2;
        long j7;
        ArrayList arrayList2;
        zzahq zzahqVar4 = zzahqVar;
        zzad zzadVar3 = zzadVar;
        ArrayList arrayList3 = new ArrayList();
        int i28 = 0;
        while (i28 < zzahqVar4.zzc.size()) {
            zzahq zzahqVar5 = (zzahq) zzahqVar4.zzc.get(i28);
            if (zzahqVar5.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i5 = i28;
            } else {
                zzahr zzb2 = zzahqVar4.zzb(1836476516);
                zzb2.getClass();
                zzahq zza2 = zzahqVar5.zza(1835297121);
                zza2.getClass();
                zzahr zzb3 = zza2.zzb(1751411826);
                zzb3.getClass();
                int zzg = zzg(zzb3.zza);
                int i29 = zzg == 1936684398 ? 1 : zzg == 1986618469 ? 2 : (zzg == 1952807028 || zzg == 1935832172 || zzg == 1937072756 || zzg == 1668047728) ? 3 : zzg == 1835365473 ? 5 : -1;
                if (i29 == -1) {
                    zzftnVar2 = zzftnVar;
                    arrayList = arrayList3;
                    i5 = i28;
                    zzahqVar2 = zzahqVar5;
                    zzaipVar = null;
                } else {
                    zzahr zzb4 = zzahqVar5.zzb(1953196132);
                    zzb4.getClass();
                    zzfj zzfjVar2 = zzb4.zza;
                    zzfjVar2.zzG(8);
                    int zze = zzahs.zze(zzfjVar2.zzf());
                    zzfjVar2.zzH(zze == 0 ? 8 : 16);
                    int zzf = zzfjVar2.zzf();
                    zzfjVar2.zzH(4);
                    int zzc = zzfjVar2.zzc();
                    int i30 = 0;
                    while (true) {
                        int i31 = zze == 0 ? 4 : 8;
                        if (i30 >= i31) {
                            zzfjVar2.zzH(i31);
                            break;
                        }
                        if (zzfjVar2.zzI()[zzc + i30] != -1) {
                            j2 = zze == 0 ? zzfjVar2.zzt() : zzfjVar2.zzu();
                        } else {
                            i30++;
                        }
                    }
                    j2 = -9223372036854775807L;
                    zzfjVar2.zzH(16);
                    int zzf2 = zzfjVar2.zzf();
                    int zzf3 = zzfjVar2.zzf();
                    zzfjVar2.zzH(4);
                    int zzf4 = zzfjVar2.zzf();
                    int zzf5 = zzfjVar2.zzf();
                    int i32 = 65536;
                    if (zzf2 == 0) {
                        if (zzf3 == 65536) {
                            if (zzf4 == -65536) {
                                if (zzf5 == 0) {
                                    i2 = 90;
                                    zzahz zzahzVar = new zzahz(zzf, j2, i2);
                                    if (j == -9223372036854775807L) {
                                        j7 = zzahzVar.zzb;
                                        j3 = j7;
                                    } else {
                                        j3 = j;
                                    }
                                    long j8 = zzc(zzb2.zza).zzc;
                                    long zzs = j3 == -9223372036854775807L ? -9223372036854775807L : zzfs.zzs(j3, 1000000L, j8, RoundingMode.FLOOR);
                                    zzahq zza3 = zza2.zza(1835626086);
                                    zza3.getClass();
                                    zzahq zza4 = zza3.zza(1937007212);
                                    zza4.getClass();
                                    zzahr zzb5 = zza2.zzb(1835296868);
                                    zzb5.getClass();
                                    zzfj zzfjVar3 = zzb5.zza;
                                    zzfjVar3.zzG(8);
                                    int zze2 = zzahs.zze(zzfjVar3.zzf());
                                    zzfjVar3.zzH(zze2 == 0 ? 8 : 16);
                                    int i33 = zze2 == 0 ? 4 : 8;
                                    long zzt = zzfjVar3.zzt();
                                    zzfjVar3.zzH(i33);
                                    int zzp = zzfjVar3.zzp();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append((char) (((zzp >> 10) & 31) + 96));
                                    sb.append((char) (((zzp >> 5) & 31) + 96));
                                    sb.append((char) ((zzp & 31) + 96));
                                    Pair create2 = Pair.create(Long.valueOf(zzt), sb.toString());
                                    zzb = zza4.zzb(1937011556);
                                    if (zzb == null) {
                                        throw zzcf.zza("Malformed sample table (stbl) missing sample description (stsd)", null);
                                    }
                                    i3 = zzahzVar.zza;
                                    i4 = zzahzVar.zzc;
                                    String str9 = (String) create2.second;
                                    zzfj zzfjVar4 = zzb.zza;
                                    zzfjVar4.zzG(12);
                                    int zzf6 = zzfjVar4.zzf();
                                    zzahw zzahwVar4 = new zzahw(zzf6);
                                    i5 = i28;
                                    int i34 = 0;
                                    while (i34 < zzf6) {
                                        ArrayList arrayList4 = arrayList3;
                                        int zzc2 = zzfjVar4.zzc();
                                        zzahz zzahzVar2 = zzahzVar;
                                        int zzf7 = zzfjVar4.zzf();
                                        if (zzf7 > 0) {
                                            i7 = zzf6;
                                            z3 = true;
                                        } else {
                                            i7 = zzf6;
                                            z3 = false;
                                        }
                                        zzaci.zzb(z3, "childAtomSize must be positive");
                                        int zzf8 = zzfjVar4.zzf();
                                        int i35 = i29;
                                        if (zzf8 == 1635148593 || zzf8 == 1635148595 || zzf8 == 1701733238 || zzf8 == 1831958048 || zzf8 == 1836070006 || zzf8 == 1752589105 || zzf8 == 1751479857 || zzf8 == 1932670515 || zzf8 == 1211250227 || zzf8 == 1987063864 || zzf8 == 1987063865 || zzf8 == 1635135537 || zzf8 == 1685479798 || zzf8 == 1685479729 || zzf8 == 1685481573 || zzf8 == 1685481521) {
                                            str = str9;
                                            int i36 = i4;
                                            int i37 = i3;
                                            pair = create2;
                                            j4 = j8;
                                            zzahqVar3 = zzahqVar5;
                                            c = '\f';
                                            zzfjVar = zzfjVar4;
                                            zzfjVar.zzG(zzc2 + 16);
                                            zzfjVar.zzH(16);
                                            int zzp2 = zzfjVar.zzp();
                                            int zzp3 = zzfjVar.zzp();
                                            zzfjVar.zzH(50);
                                            int zzc3 = zzfjVar.zzc();
                                            if (zzf8 == 1701733238) {
                                                Pair zzh = zzh(zzfjVar, zzc2, zzf7);
                                                if (zzh != null) {
                                                    int intValue = ((Integer) zzh.first).intValue();
                                                    zzadVar2 = zzadVar3 == null ? null : zzadVar3.zzb(((zzaiq) zzh.second).zzb);
                                                    zzahwVar4.zza[i34] = (zzaiq) zzh.second;
                                                    zzf8 = intValue;
                                                } else {
                                                    zzf8 = 1701733238;
                                                    zzadVar2 = zzadVar3;
                                                }
                                                zzfjVar.zzG(zzc3);
                                            } else {
                                                zzadVar2 = zzadVar3;
                                            }
                                            if (zzf8 == 1831958048) {
                                                i8 = zzf8;
                                                str2 = "video/mpeg";
                                            } else {
                                                i8 = 1211250227;
                                                if (zzf8 == 1211250227) {
                                                    str2 = "video/3gpp";
                                                } else {
                                                    i8 = zzf8;
                                                    str2 = null;
                                                }
                                            }
                                            int i38 = zzc3;
                                            zzad zzadVar4 = zzadVar2;
                                            float f4 = 1.0f;
                                            i9 = i34;
                                            boolean z8 = false;
                                            ByteBuffer byteBuffer = null;
                                            String str10 = null;
                                            byte[] bArr3 = null;
                                            int i39 = -1;
                                            int i40 = -1;
                                            zzahu zzahuVar = null;
                                            int i41 = 8;
                                            int i42 = 8;
                                            int i43 = -1;
                                            List list2 = null;
                                            int i44 = -1;
                                            while (true) {
                                                if (i38 - zzc2 >= zzf7) {
                                                    zzahwVar = zzahwVar4;
                                                    i10 = zzp2;
                                                    i11 = zzp3;
                                                    f = f4;
                                                    str3 = str10;
                                                    bArr = bArr3;
                                                    break;
                                                }
                                                zzfjVar.zzG(i38);
                                                int zzc4 = zzfjVar.zzc();
                                                int zzf9 = zzfjVar.zzf();
                                                if (zzf9 == 0) {
                                                    bArr = bArr3;
                                                    if (zzfjVar.zzc() - zzc2 == zzf7) {
                                                        zzahwVar = zzahwVar4;
                                                        i10 = zzp2;
                                                        i11 = zzp3;
                                                        f = f4;
                                                        str3 = str10;
                                                        break;
                                                    }
                                                    i16 = 0;
                                                } else {
                                                    bArr = bArr3;
                                                    i16 = zzf9;
                                                }
                                                if (i16 > 0) {
                                                    i17 = zzc2;
                                                    i18 = zzf7;
                                                    z4 = true;
                                                } else {
                                                    i17 = zzc2;
                                                    i18 = zzf7;
                                                    z4 = false;
                                                }
                                                zzaci.zzb(z4, "childAtomSize must be positive");
                                                int zzf10 = zzfjVar.zzf();
                                                if (zzf10 == 1635148611) {
                                                    int i45 = zzc4 + 8;
                                                    zzaci.zzb(str2 == null, null);
                                                    zzfjVar.zzG(i45);
                                                    zzabj zza5 = zzabj.zza(zzfjVar);
                                                    list = zza5.zza;
                                                    zzahwVar4.zzc = zza5.zzb;
                                                    if (z8) {
                                                        f3 = f4;
                                                        z7 = true;
                                                    } else {
                                                        f3 = zza5.zzj;
                                                        z7 = false;
                                                    }
                                                    str5 = zza5.zzk;
                                                    i23 = zza5.zzg;
                                                    i24 = zza5.zzh;
                                                    i25 = zza5.zzi;
                                                    z8 = z7;
                                                    i26 = zza5.zze;
                                                    i27 = zza5.zzf;
                                                    str6 = "video/avc";
                                                } else if (zzf10 == 1752589123) {
                                                    int i46 = zzc4 + 8;
                                                    zzaci.zzb(str2 == null, null);
                                                    zzfjVar.zzG(i46);
                                                    zzacv zza6 = zzacv.zza(zzfjVar);
                                                    list = zza6.zza;
                                                    zzahwVar4.zzc = zza6.zzb;
                                                    if (z8) {
                                                        f3 = f4;
                                                        z6 = true;
                                                    } else {
                                                        f3 = zza6.zzh;
                                                        z6 = false;
                                                    }
                                                    str5 = zza6.zzi;
                                                    i23 = zza6.zze;
                                                    i24 = zza6.zzf;
                                                    i25 = zza6.zzg;
                                                    z8 = z6;
                                                    i26 = zza6.zzc;
                                                    i27 = zza6.zzd;
                                                    str6 = "video/hevc";
                                                } else {
                                                    if (zzf10 == 1685480259 || zzf10 == 1685485123) {
                                                        zzahwVar3 = zzahwVar4;
                                                        i19 = zzp2;
                                                        i20 = zzp3;
                                                        i21 = i8;
                                                        f2 = f4;
                                                        str4 = str10;
                                                        zzaca zza7 = zzaca.zza(zzfjVar);
                                                        if (zza7 != null) {
                                                            str10 = zza7.zza;
                                                            str2 = "video/dolby-vision";
                                                            f4 = f2;
                                                        }
                                                        f4 = f2;
                                                        str10 = str4;
                                                    } else {
                                                        if (zzf10 != 1987076931) {
                                                            if (zzf10 == 1635135811) {
                                                                int i47 = zzc4 + 8;
                                                                zzaci.zzb(str2 == null, null);
                                                                zzfjVar.zzG(i47);
                                                                zzfjVar.zzH(1);
                                                                int zzl = zzfjVar.zzl() >> 5;
                                                                int zzl2 = zzfjVar.zzl();
                                                                int i48 = (zzl2 >> 6) & 1;
                                                                i41 = 10;
                                                                if (zzl != 2) {
                                                                    i22 = 1;
                                                                    if (zzl > 2) {
                                                                        i41 = i42;
                                                                        str2 = "video/av01";
                                                                        zzahwVar3 = zzahwVar4;
                                                                        i19 = zzp2;
                                                                        i20 = zzp3;
                                                                        i21 = i8;
                                                                        i42 = i41;
                                                                    }
                                                                    if (i22 != i48) {
                                                                    }
                                                                    str2 = "video/av01";
                                                                    zzahwVar3 = zzahwVar4;
                                                                    i19 = zzp2;
                                                                    i20 = zzp3;
                                                                    i21 = i8;
                                                                    i42 = i41;
                                                                } else if (i48 != 0) {
                                                                    if (1 == ((zzl2 >> 5) & 1)) {
                                                                        i41 = 12;
                                                                    }
                                                                    str2 = "video/av01";
                                                                    zzahwVar3 = zzahwVar4;
                                                                    i19 = zzp2;
                                                                    i20 = zzp3;
                                                                    i21 = i8;
                                                                    i42 = i41;
                                                                } else {
                                                                    i22 = 1;
                                                                    if (i22 != i48) {
                                                                        i41 = 8;
                                                                    }
                                                                    str2 = "video/av01";
                                                                    zzahwVar3 = zzahwVar4;
                                                                    i19 = zzp2;
                                                                    i20 = zzp3;
                                                                    i21 = i8;
                                                                    i42 = i41;
                                                                }
                                                            } else if (zzf10 == 1668050025) {
                                                                if (byteBuffer == null) {
                                                                    byteBuffer = zzl();
                                                                }
                                                                byteBuffer.position(21);
                                                                byteBuffer.putShort(zzfjVar.zzz());
                                                                byteBuffer.putShort(zzfjVar.zzz());
                                                                zzahwVar3 = zzahwVar4;
                                                                i19 = zzp2;
                                                                i20 = zzp3;
                                                                i21 = i8;
                                                            } else {
                                                                if (zzf10 == 1835295606) {
                                                                    if (byteBuffer == null) {
                                                                        byteBuffer = zzl();
                                                                    }
                                                                    short zzz = zzfjVar.zzz();
                                                                    short zzz2 = zzfjVar.zzz();
                                                                    short zzz3 = zzfjVar.zzz();
                                                                    i21 = i8;
                                                                    short zzz4 = zzfjVar.zzz();
                                                                    zzahwVar3 = zzahwVar4;
                                                                    short zzz5 = zzfjVar.zzz();
                                                                    f2 = f4;
                                                                    short zzz6 = zzfjVar.zzz();
                                                                    i20 = zzp3;
                                                                    short zzz7 = zzfjVar.zzz();
                                                                    i19 = zzp2;
                                                                    short zzz8 = zzfjVar.zzz();
                                                                    long zzt2 = zzfjVar.zzt();
                                                                    long zzt3 = zzfjVar.zzt();
                                                                    str4 = str10;
                                                                    byteBuffer.position(1);
                                                                    byteBuffer.putShort(zzz5);
                                                                    byteBuffer.putShort(zzz6);
                                                                    byteBuffer.putShort(zzz);
                                                                    byteBuffer.putShort(zzz2);
                                                                    byteBuffer.putShort(zzz3);
                                                                    byteBuffer.putShort(zzz4);
                                                                    byteBuffer.putShort(zzz7);
                                                                    byteBuffer.putShort(zzz8);
                                                                    byteBuffer.putShort((short) (zzt2 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                                    byteBuffer.putShort((short) (zzt3 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                                } else {
                                                                    zzahwVar3 = zzahwVar4;
                                                                    i19 = zzp2;
                                                                    i20 = zzp3;
                                                                    i21 = i8;
                                                                    f2 = f4;
                                                                    str4 = str10;
                                                                    if (zzf10 == 1681012275) {
                                                                        zzaci.zzb(str2 == null, null);
                                                                        str2 = "video/3gpp";
                                                                    } else if (zzf10 == 1702061171) {
                                                                        zzaci.zzb(str2 == null, null);
                                                                        zzahu zzj = zzj(zzfjVar, zzc4);
                                                                        str2 = zzj.zza;
                                                                        bArr2 = zzj.zzb;
                                                                        if (bArr2 != null) {
                                                                            zzahuVar = zzj;
                                                                            list2 = zzfwu.zzm(bArr2);
                                                                        } else {
                                                                            zzahuVar = zzj;
                                                                        }
                                                                    } else if (zzf10 == 1885434736) {
                                                                        zzfjVar.zzG(zzc4 + 8);
                                                                        f4 = zzfjVar.zzo() / zzfjVar.zzo();
                                                                        str10 = str4;
                                                                        z8 = true;
                                                                    } else if (zzf10 == 1937126244) {
                                                                        int i49 = zzc4 + 8;
                                                                        while (i49 - zzc4 < i16) {
                                                                            zzfjVar.zzG(i49);
                                                                            int zzf11 = zzfjVar.zzf() + i49;
                                                                            if (zzfjVar.zzf() == 1886547818) {
                                                                                bArr = Arrays.copyOfRange(zzfjVar.zzI(), i49, zzf11);
                                                                            } else {
                                                                                i49 = zzf11;
                                                                            }
                                                                        }
                                                                        f4 = f2;
                                                                        str10 = str4;
                                                                        bArr = null;
                                                                    } else {
                                                                        if (zzf10 == 1936995172) {
                                                                            int zzl3 = zzfjVar.zzl();
                                                                            zzfjVar.zzH(3);
                                                                            if (zzl3 == 0) {
                                                                                int zzl4 = zzfjVar.zzl();
                                                                                if (zzl4 == 0) {
                                                                                    i44 = 0;
                                                                                } else if (zzl4 == 1) {
                                                                                    f4 = f2;
                                                                                    str10 = str4;
                                                                                    i44 = 1;
                                                                                } else if (zzl4 == 2) {
                                                                                    f4 = f2;
                                                                                    str10 = str4;
                                                                                    i44 = 2;
                                                                                } else if (zzl4 == 3) {
                                                                                    i44 = 3;
                                                                                }
                                                                                f4 = f2;
                                                                                str10 = str4;
                                                                            }
                                                                        } else if (zzf10 == 1668246642) {
                                                                            if (i40 == -1) {
                                                                                if (i39 == -1) {
                                                                                    int zzf12 = zzfjVar.zzf();
                                                                                    if (zzf12 == 1852009592 || zzf12 == 1852009571) {
                                                                                        int zzp4 = zzfjVar.zzp();
                                                                                        int zzp5 = zzfjVar.zzp();
                                                                                        zzfjVar.zzH(2);
                                                                                        if (i16 == 19) {
                                                                                            if ((zzfjVar.zzl() & 128) != 0) {
                                                                                                i16 = 19;
                                                                                                z5 = true;
                                                                                                int zza8 = zzs.zza(zzp4);
                                                                                                int i50 = true == z5 ? 2 : 1;
                                                                                                i40 = zza8;
                                                                                                i39 = zzs.zzb(zzp5);
                                                                                                i43 = i50;
                                                                                            } else {
                                                                                                i16 = 19;
                                                                                            }
                                                                                        }
                                                                                        z5 = false;
                                                                                        int zza82 = zzs.zza(zzp4);
                                                                                        if (true == z5) {
                                                                                        }
                                                                                        i40 = zza82;
                                                                                        i39 = zzs.zzb(zzp5);
                                                                                        i43 = i50;
                                                                                    } else {
                                                                                        zzez.zzf("AtomParsers", "Unsupported color type: ".concat(zzahs.zzf(zzf12)));
                                                                                        i39 = -1;
                                                                                        i40 = -1;
                                                                                    }
                                                                                } else {
                                                                                    i40 = -1;
                                                                                }
                                                                            }
                                                                            f4 = f2;
                                                                            str10 = str4;
                                                                        }
                                                                        f4 = f2;
                                                                        str10 = str4;
                                                                    }
                                                                }
                                                                f4 = f2;
                                                                str10 = str4;
                                                            }
                                                            break;
                                                        }
                                                        zzaci.zzb(str2 == null, null);
                                                        zzfjVar.zzG(zzc4 + 12);
                                                        zzfjVar.zzH(2);
                                                        int zzl5 = zzfjVar.zzl();
                                                        int i51 = zzl5 >> 4;
                                                        int i52 = zzl5 & 1;
                                                        int zzl6 = zzfjVar.zzl();
                                                        int zzl7 = zzfjVar.zzl();
                                                        int zza9 = zzs.zza(zzl6);
                                                        int i53 = 1 != i52 ? 2 : 1;
                                                        int zzb6 = zzs.zzb(zzl7);
                                                        zzahwVar3 = zzahwVar4;
                                                        i43 = i53;
                                                        i19 = zzp2;
                                                        i20 = zzp3;
                                                        i21 = i8;
                                                        i41 = i51;
                                                        i42 = i41;
                                                        str2 = i8 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                        i39 = zzb6;
                                                        i40 = zza9;
                                                    }
                                                    i38 += i16;
                                                    zzc2 = i17;
                                                    bArr3 = bArr;
                                                    zzf7 = i18;
                                                    i8 = i21;
                                                    zzahwVar4 = zzahwVar3;
                                                    zzp3 = i20;
                                                    zzp2 = i19;
                                                }
                                                zzahwVar3 = zzahwVar4;
                                                i19 = zzp2;
                                                i20 = zzp3;
                                                i21 = i8;
                                                i42 = i26;
                                                list2 = list;
                                                f4 = f3;
                                                str10 = str5;
                                                i43 = i24;
                                                i39 = i25;
                                                i40 = i23;
                                                String str11 = str6;
                                                i41 = i27;
                                                str2 = str11;
                                                i38 += i16;
                                                zzc2 = i17;
                                                bArr3 = bArr;
                                                zzf7 = i18;
                                                i8 = i21;
                                                zzahwVar4 = zzahwVar3;
                                                zzp3 = i20;
                                                zzp2 = i19;
                                            }
                                            i12 = zzc2;
                                            i13 = zzf7;
                                            if (str2 == null) {
                                                i15 = i36;
                                                i14 = i37;
                                                zzahwVar2 = zzahwVar;
                                            } else {
                                                zzak zzakVar = new zzak();
                                                i14 = i37;
                                                zzakVar.zzI(i14);
                                                zzakVar.zzU(str2);
                                                zzakVar.zzz(str3);
                                                zzakVar.zzab(i10);
                                                zzakVar.zzH(i11);
                                                zzakVar.zzR(f);
                                                i15 = i36;
                                                zzakVar.zzT(i15);
                                                zzakVar.zzS(bArr);
                                                zzakVar.zzX(i44);
                                                zzakVar.zzK(list2);
                                                zzakVar.zzD(zzadVar4);
                                                zzr zzrVar = new zzr();
                                                zzrVar.zzc(i40);
                                                zzrVar.zzb(i43);
                                                zzrVar.zzd(i39);
                                                zzrVar.zze(byteBuffer != null ? byteBuffer.array() : null);
                                                zzrVar.zzf(i42);
                                                zzrVar.zza(i41);
                                                zzakVar.zzA(zzrVar.zzg());
                                                if (zzahuVar != null) {
                                                    j5 = zzahuVar.zzc;
                                                    zzakVar.zzx(zzfzi.zzc(j5));
                                                    j6 = zzahuVar.zzd;
                                                    zzakVar.zzQ(zzfzi.zzc(j6));
                                                }
                                                zzahwVar2 = zzahwVar;
                                                zzahwVar2.zzb = zzakVar.zzac();
                                            }
                                        } else if (zzf8 == 1836069985 || zzf8 == 1701733217 || zzf8 == 1633889587 || zzf8 == 1700998451 || zzf8 == 1633889588 || zzf8 == 1835823201 || zzf8 == 1685353315 || zzf8 == 1685353317 || zzf8 == 1685353320 || zzf8 == 1685353324 || zzf8 == 1685353336 || zzf8 == 1935764850 || zzf8 == 1935767394 || zzf8 == 1819304813 || zzf8 == 1936684916 || zzf8 == 1953984371 || zzf8 == 778924082 || zzf8 == 778924083 || zzf8 == 1835557169 || zzf8 == 1835560241 || zzf8 == 1634492771 || zzf8 == 1634492791 || zzf8 == 1970037111 || zzf8 == 1332770163 || zzf8 == 1716281667) {
                                            c = '\f';
                                            str = str9;
                                            zzahqVar3 = zzahqVar5;
                                            zzfjVar = zzfjVar4;
                                            pair = create2;
                                            j4 = j8;
                                            zzm(zzfjVar4, zzf8, zzc2, zzf7, i3, str, z2, zzadVar, zzahwVar4, i34);
                                            zzahwVar2 = zzahwVar4;
                                            i12 = zzc2;
                                            i13 = zzf7;
                                            i9 = i34;
                                            i15 = i4;
                                            i14 = i3;
                                        } else if (zzf8 == 1414810956 || zzf8 == 1954034535 || zzf8 == 2004251764 || zzf8 == 1937010800 || zzf8 == 1664495672) {
                                            zzfjVar4.zzG(zzc2 + 16);
                                            long j9 = Long.MAX_VALUE;
                                            if (zzf8 == 1414810956) {
                                                str8 = "application/ttml+xml";
                                            } else if (zzf8 == 1954034535) {
                                                int i54 = zzf7 - 16;
                                                byte[] bArr4 = new byte[i54];
                                                zzfjVar4.zzC(bArr4, 0, i54);
                                                zzm = zzfwu.zzm(bArr4);
                                                str7 = "application/x-quicktime-tx3g";
                                                pair2 = create2;
                                                long j10 = j9;
                                                int i55 = i4;
                                                zzak zzakVar2 = new zzak();
                                                zzakVar2.zzI(i3);
                                                zzakVar2.zzU(str7);
                                                zzakVar2.zzM(str9);
                                                zzakVar2.zzY(j10);
                                                zzakVar2.zzK(zzm);
                                                zzahwVar4.zzb = zzakVar2.zzac();
                                                zzahwVar2 = zzahwVar4;
                                                str = str9;
                                                i14 = i3;
                                                i12 = zzc2;
                                                i13 = zzf7;
                                                i9 = i34;
                                                zzahqVar3 = zzahqVar5;
                                                i15 = i55;
                                                pair = pair2;
                                                c = '\f';
                                                zzfjVar = zzfjVar4;
                                                j4 = j8;
                                            } else if (zzf8 == 2004251764) {
                                                str8 = "application/x-mp4-vtt";
                                            } else if (zzf8 == 1937010800) {
                                                j9 = 0;
                                                str8 = "application/ttml+xml";
                                            } else {
                                                zzahwVar4.zzd = 1;
                                                str7 = "application/x-mp4-cea-608";
                                                pair2 = create2;
                                                zzm = null;
                                                long j102 = j9;
                                                int i552 = i4;
                                                zzak zzakVar22 = new zzak();
                                                zzakVar22.zzI(i3);
                                                zzakVar22.zzU(str7);
                                                zzakVar22.zzM(str9);
                                                zzakVar22.zzY(j102);
                                                zzakVar22.zzK(zzm);
                                                zzahwVar4.zzb = zzakVar22.zzac();
                                                zzahwVar2 = zzahwVar4;
                                                str = str9;
                                                i14 = i3;
                                                i12 = zzc2;
                                                i13 = zzf7;
                                                i9 = i34;
                                                zzahqVar3 = zzahqVar5;
                                                i15 = i552;
                                                pair = pair2;
                                                c = '\f';
                                                zzfjVar = zzfjVar4;
                                                j4 = j8;
                                            }
                                            str7 = str8;
                                            pair2 = create2;
                                            zzm = null;
                                            long j1022 = j9;
                                            int i5522 = i4;
                                            zzak zzakVar222 = new zzak();
                                            zzakVar222.zzI(i3);
                                            zzakVar222.zzU(str7);
                                            zzakVar222.zzM(str9);
                                            zzakVar222.zzY(j1022);
                                            zzakVar222.zzK(zzm);
                                            zzahwVar4.zzb = zzakVar222.zzac();
                                            zzahwVar2 = zzahwVar4;
                                            str = str9;
                                            i14 = i3;
                                            i12 = zzc2;
                                            i13 = zzf7;
                                            i9 = i34;
                                            zzahqVar3 = zzahqVar5;
                                            i15 = i5522;
                                            pair = pair2;
                                            c = '\f';
                                            zzfjVar = zzfjVar4;
                                            j4 = j8;
                                        } else {
                                            if (zzf8 == 1835365492) {
                                                zzfjVar4.zzG(zzc2 + 16);
                                                zzfjVar4.zzw((char) 0);
                                                String zzw = zzfjVar4.zzw((char) 0);
                                                if (zzw != null) {
                                                    zzak zzakVar3 = new zzak();
                                                    zzakVar3.zzI(i3);
                                                    zzakVar3.zzU(zzw);
                                                    zzahwVar4.zzb = zzakVar3.zzac();
                                                }
                                            } else if (zzf8 == 1667329389) {
                                                zzak zzakVar4 = new zzak();
                                                zzakVar4.zzI(i3);
                                                zzakVar4.zzU("application/x-camera-motion");
                                                zzahwVar4.zzb = zzakVar4.zzac();
                                            }
                                            zzahwVar2 = zzahwVar4;
                                            str = str9;
                                            i15 = i4;
                                            i14 = i3;
                                            pair = create2;
                                            j4 = j8;
                                            i12 = zzc2;
                                            i13 = zzf7;
                                            i9 = i34;
                                            zzahqVar3 = zzahqVar5;
                                            c = '\f';
                                            zzfjVar = zzfjVar4;
                                        }
                                        zzfjVar.zzG(i12 + i13);
                                        i34 = i9 + 1;
                                        zzadVar3 = zzadVar;
                                        i4 = i15;
                                        i3 = i14;
                                        zzahwVar4 = zzahwVar2;
                                        zzfjVar4 = zzfjVar;
                                        zzahzVar = zzahzVar2;
                                        str9 = str;
                                        zzf6 = i7;
                                        i29 = i35;
                                        arrayList3 = arrayList4;
                                        j8 = j4;
                                        create2 = pair;
                                        zzahqVar5 = zzahqVar3;
                                    }
                                    int i56 = i29;
                                    Pair pair3 = create2;
                                    long j11 = j8;
                                    arrayList = arrayList3;
                                    zzahz zzahzVar3 = zzahzVar;
                                    zzahw zzahwVar5 = zzahwVar4;
                                    zzahqVar2 = zzahqVar5;
                                    zzahq zza10 = zzahqVar2.zza(1701082227);
                                    if (zza10 != null) {
                                        zzahr zzb7 = zza10.zzb(1701606260);
                                        if (zzb7 == null) {
                                            create = null;
                                        } else {
                                            zzfj zzfjVar5 = zzb7.zza;
                                            zzfjVar5.zzG(8);
                                            int zze3 = zzahs.zze(zzfjVar5.zzf());
                                            int zzo = zzfjVar5.zzo();
                                            long[] jArr3 = new long[zzo];
                                            long[] jArr4 = new long[zzo];
                                            for (int i57 = 0; i57 < zzo; i57++) {
                                                jArr3[i57] = zze3 == 1 ? zzfjVar5.zzu() : zzfjVar5.zzt();
                                                jArr4[i57] = zze3 == 1 ? zzfjVar5.zzs() : zzfjVar5.zzf();
                                                if (zzfjVar5.zzz() != 1) {
                                                    throw new IllegalArgumentException("Unsupported media rate.");
                                                }
                                                zzfjVar5.zzH(2);
                                            }
                                            create = Pair.create(jArr3, jArr4);
                                        }
                                        if (create != null) {
                                            jArr = (long[]) create.first;
                                            jArr2 = (long[]) create.second;
                                            if (zzahwVar5.zzb != null) {
                                                zzftnVar2 = zzftnVar;
                                                zzaipVar = null;
                                            } else {
                                                i6 = zzahzVar3.zza;
                                                zzaipVar = new zzaip(i6, i56, ((Long) pair3.first).longValue(), j11, zzs, zzahwVar5.zzb, zzahwVar5.zzd, zzahwVar5.zza, zzahwVar5.zzc, jArr, jArr2);
                                                zzftnVar2 = zzftnVar;
                                            }
                                        }
                                    }
                                    jArr = null;
                                    jArr2 = null;
                                    if (zzahwVar5.zzb != null) {
                                    }
                                } else {
                                    zzf4 = -65536;
                                }
                            }
                            zzf3 = 65536;
                        }
                        zzf2 = 0;
                    }
                    if (zzf2 == 0) {
                        if (zzf3 == -65536) {
                            if (zzf4 != 65536) {
                                zzf3 = -65536;
                            } else if (zzf5 == 0) {
                                i2 = 270;
                                zzahz zzahzVar4 = new zzahz(zzf, j2, i2);
                                if (j == -9223372036854775807L) {
                                }
                                long j82 = zzc(zzb2.zza).zzc;
                                if (j3 == -9223372036854775807L) {
                                }
                                zzahq zza32 = zza2.zza(1835626086);
                                zza32.getClass();
                                zzahq zza42 = zza32.zza(1937007212);
                                zza42.getClass();
                                zzahr zzb52 = zza2.zzb(1835296868);
                                zzb52.getClass();
                                zzfj zzfjVar32 = zzb52.zza;
                                zzfjVar32.zzG(8);
                                int zze22 = zzahs.zze(zzfjVar32.zzf());
                                zzfjVar32.zzH(zze22 == 0 ? 8 : 16);
                                if (zze22 == 0) {
                                }
                                long zzt4 = zzfjVar32.zzt();
                                zzfjVar32.zzH(i33);
                                int zzp6 = zzfjVar32.zzp();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append((char) (((zzp6 >> 10) & 31) + 96));
                                sb2.append((char) (((zzp6 >> 5) & 31) + 96));
                                sb2.append((char) ((zzp6 & 31) + 96));
                                Pair create22 = Pair.create(Long.valueOf(zzt4), sb2.toString());
                                zzb = zza42.zzb(1937011556);
                                if (zzb == null) {
                                }
                            } else {
                                zzf3 = -65536;
                                i = 0;
                            }
                        }
                        i32 = zzf4;
                        i = 0;
                    } else {
                        i32 = zzf4;
                        i = zzf2;
                    }
                    i2 = (i == -65536 && zzf3 == 0 && i32 == 0 && zzf5 == -65536) ? Opcodes.GETFIELD : 0;
                    zzahz zzahzVar42 = new zzahz(zzf, j2, i2);
                    if (j == -9223372036854775807L) {
                    }
                    long j822 = zzc(zzb2.zza).zzc;
                    if (j3 == -9223372036854775807L) {
                    }
                    zzahq zza322 = zza2.zza(1835626086);
                    zza322.getClass();
                    zzahq zza422 = zza322.zza(1937007212);
                    zza422.getClass();
                    zzahr zzb522 = zza2.zzb(1835296868);
                    zzb522.getClass();
                    zzfj zzfjVar322 = zzb522.zza;
                    zzfjVar322.zzG(8);
                    int zze222 = zzahs.zze(zzfjVar322.zzf());
                    zzfjVar322.zzH(zze222 == 0 ? 8 : 16);
                    if (zze222 == 0) {
                    }
                    long zzt42 = zzfjVar322.zzt();
                    zzfjVar322.zzH(i33);
                    int zzp62 = zzfjVar322.zzp();
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append((char) (((zzp62 >> 10) & 31) + 96));
                    sb22.append((char) (((zzp62 >> 5) & 31) + 96));
                    sb22.append((char) ((zzp62 & 31) + 96));
                    Pair create222 = Pair.create(Long.valueOf(zzt42), sb22.toString());
                    zzb = zza422.zzb(1937011556);
                    if (zzb == null) {
                    }
                }
                zzaip zzaipVar2 = (zzaip) zzftnVar2.apply(zzaipVar);
                if (zzaipVar2 != null) {
                    zzahq zza11 = zzahqVar2.zza(1835297121);
                    zza11.getClass();
                    zzahq zza12 = zza11.zza(1835626086);
                    zza12.getClass();
                    zzahq zza13 = zza12.zza(1937007212);
                    zza13.getClass();
                    zzais zzk = zzk(zzaipVar2, zza13, zzacuVar);
                    arrayList2 = arrayList;
                    arrayList2.add(zzk);
                } else {
                    arrayList2 = arrayList;
                }
            }
            i28 = i5 + 1;
            zzahqVar4 = zzahqVar;
            zzadVar3 = zzadVar;
            arrayList3 = arrayList2;
        }
        return arrayList3;
    }

    public static void zze(zzfj zzfjVar) {
        int zzc = zzfjVar.zzc();
        zzfjVar.zzH(4);
        if (zzfjVar.zzf() != 1751411826) {
            zzc += 4;
        }
        zzfjVar.zzG(zzc);
    }

    private static int zzf(zzfj zzfjVar) {
        int zzl = zzfjVar.zzl();
        int i = zzl & 127;
        while ((zzl & 128) == 128) {
            zzl = zzfjVar.zzl();
            i = (i << 7) | (zzl & 127);
        }
        return i;
    }

    private static int zzg(zzfj zzfjVar) {
        zzfjVar.zzG(16);
        return zzfjVar.zzf();
    }

    private static Pair zzh(zzfj zzfjVar, int i, int i2) throws zzcf {
        Integer num;
        zzaiq zzaiqVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int zzc = zzfjVar.zzc();
        while (zzc - i < i2) {
            zzfjVar.zzG(zzc);
            int zzf = zzfjVar.zzf();
            zzaci.zzb(zzf > 0, "childAtomSize must be positive");
            if (zzfjVar.zzf() == 1936289382) {
                int i5 = zzc + 8;
                int i6 = 0;
                int i7 = -1;
                String str = null;
                Integer num2 = null;
                while (i5 - zzc < zzf) {
                    zzfjVar.zzG(i5);
                    int zzf2 = zzfjVar.zzf();
                    int zzf3 = zzfjVar.zzf();
                    if (zzf3 == 1718775137) {
                        num2 = Integer.valueOf(zzfjVar.zzf());
                    } else if (zzf3 == 1935894637) {
                        zzfjVar.zzH(4);
                        str = zzfjVar.zzy(4, zzftl.zzc);
                    } else if (zzf3 == 1935894633) {
                        i7 = i5;
                        i6 = zzf2;
                    }
                    i5 += zzf2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzaci.zzb(num2 != null, "frma atom is mandatory");
                    zzaci.zzb(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = num2;
                            zzaiqVar = null;
                            break;
                        }
                        zzfjVar.zzG(i8);
                        int zzf4 = zzfjVar.zzf();
                        if (zzfjVar.zzf() == 1952804451) {
                            int zze = zzahs.zze(zzfjVar.zzf());
                            zzfjVar.zzH(1);
                            if (zze == 0) {
                                zzfjVar.zzH(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int zzl = zzfjVar.zzl();
                                int i9 = (zzl & 240) >> 4;
                                i3 = zzl & 15;
                                i4 = i9;
                            }
                            boolean z = zzfjVar.zzl() == 1;
                            int zzl2 = zzfjVar.zzl();
                            byte[] bArr2 = new byte[16];
                            zzfjVar.zzC(bArr2, 0, 16);
                            if (z && zzl2 == 0) {
                                int zzl3 = zzfjVar.zzl();
                                byte[] bArr3 = new byte[zzl3];
                                zzfjVar.zzC(bArr3, 0, zzl3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzaiqVar = new zzaiq(z, str, zzl2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zzf4;
                        }
                    }
                    zzaci.zzb(zzaiqVar != null, "tenc atom is mandatory");
                    int i10 = zzfs.zza;
                    create = Pair.create(num, zzaiqVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzc += zzf;
        }
        return null;
    }

    private static zzcb zzi(zzfj zzfjVar) {
        short zzz = zzfjVar.zzz();
        zzfjVar.zzH(2);
        String zzy = zzfjVar.zzy(zzz, zzftl.zzc);
        int max = Math.max(zzy.lastIndexOf(43), zzy.lastIndexOf(45));
        try {
            return new zzcb(-9223372036854775807L, new zzfz(Float.parseFloat(zzy.substring(0, max)), Float.parseFloat(zzy.substring(max, zzy.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzahu zzj(zzfj zzfjVar, int i) {
        zzfjVar.zzG(i + 12);
        zzfjVar.zzH(1);
        zzf(zzfjVar);
        zzfjVar.zzH(2);
        int zzl = zzfjVar.zzl();
        if ((zzl & 128) != 0) {
            zzfjVar.zzH(2);
        }
        if ((zzl & 64) != 0) {
            zzfjVar.zzH(zzfjVar.zzl());
        }
        if ((zzl & 32) != 0) {
            zzfjVar.zzH(2);
        }
        zzfjVar.zzH(1);
        zzf(zzfjVar);
        String zzd = zzce.zzd(zzfjVar.zzl());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzahu(zzd, null, -1L, -1L);
        }
        zzfjVar.zzH(4);
        long zzt = zzfjVar.zzt();
        long zzt2 = zzfjVar.zzt();
        zzfjVar.zzH(1);
        int zzf = zzf(zzfjVar);
        byte[] bArr = new byte[zzf];
        zzfjVar.zzC(bArr, 0, zzf);
        return new zzahu(zzd, bArr, zzt2 <= 0 ? -1L : zzt2, zzt > 0 ? zzt : -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0271 A[ADDED_TO_REGION, LOOP:12: B:217:0x0271->B:220:0x027b, LOOP_START, PHI: r16
      0x0271: PHI (r16v6 int) = (r16v2 int), (r16v7 int) binds: [B:216:0x026f, B:220:0x027b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x025f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0350  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzais zzk(zzaip zzaipVar, zzahq zzahqVar, zzacu zzacuVar) throws zzcf {
        zzahv zzahyVar;
        boolean z;
        int i;
        int i2;
        int i3;
        int zza2;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        long[] jArr3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        zzaip zzaipVar2;
        int i15;
        int[] iArr2;
        long[] jArr4;
        int[] iArr3;
        int i16;
        int[] iArr4;
        int i17;
        long j2;
        int i18;
        int i19;
        int i20;
        long[] jArr5;
        int i21;
        int i22;
        long[] jArr6;
        int[] iArr5;
        int[] iArr6;
        boolean z4;
        int i23;
        int i24;
        int i25;
        int i26;
        int length;
        zzahr zzb = zzahqVar.zzb(1937011578);
        if (zzb != null) {
            zzahyVar = new zzahx(zzb, zzaipVar.zzf);
        } else {
            zzahr zzb2 = zzahqVar.zzb(1937013298);
            if (zzb2 == null) {
                throw zzcf.zza("Track has no sample table size information", null);
            }
            zzahyVar = new zzahy(zzb2);
        }
        int zzb3 = zzahyVar.zzb();
        if (zzb3 == 0) {
            return new zzais(zzaipVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        zzahr zzb4 = zzahqVar.zzb(1937007471);
        if (zzb4 == null) {
            zzb4 = zzahqVar.zzb(1668232756);
            zzb4.getClass();
            z = true;
        } else {
            z = false;
        }
        zzahr zzb5 = zzahqVar.zzb(1937011555);
        zzb5.getClass();
        zzahr zzb6 = zzahqVar.zzb(1937011827);
        zzb6.getClass();
        zzahr zzb7 = zzahqVar.zzb(1937011571);
        zzfj zzfjVar = zzb7 != null ? zzb7.zza : null;
        zzahr zzb8 = zzahqVar.zzb(1668576371);
        zzfj zzfjVar2 = zzb8 != null ? zzb8.zza : null;
        zzfj zzfjVar3 = zzb6.zza;
        zzaht zzahtVar = new zzaht(zzb5.zza, zzb4.zza, z);
        zzfjVar3.zzG(12);
        int zzo = zzfjVar3.zzo() - 1;
        int zzo2 = zzfjVar3.zzo();
        int zzo3 = zzfjVar3.zzo();
        if (zzfjVar2 != null) {
            zzfjVar2.zzG(12);
            i = zzfjVar2.zzo();
        } else {
            i = 0;
        }
        if (zzfjVar != null) {
            zzfjVar.zzG(12);
            i2 = zzfjVar.zzo();
            if (i2 > 0) {
                i3 = zzfjVar.zzo() - 1;
                zza2 = zzahyVar.zza();
                String str = zzaipVar.zzf.zzm;
                if (zza2 != -1 && (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && zzo == 0)) {
                    if (i != 0 && i2 == 0) {
                        int i27 = zzahtVar.zza;
                        long[] jArr7 = new long[i27];
                        int[] iArr7 = new int[i27];
                        while (zzahtVar.zza()) {
                            int i28 = zzahtVar.zzb;
                            jArr7[i28] = zzahtVar.zzd;
                            iArr7[i28] = zzahtVar.zzc;
                        }
                        long j3 = zzo3;
                        int i29 = 8192 / zza2;
                        int i30 = 0;
                        for (int i31 = 0; i31 < i27; i31++) {
                            int i32 = iArr7[i31];
                            int i33 = zzfs.zza;
                            i30 += ((i32 + i29) - 1) / i29;
                        }
                        long[] jArr8 = new long[i30];
                        int[] iArr8 = new int[i30];
                        long[] jArr9 = new long[i30];
                        int[] iArr9 = new int[i30];
                        int i34 = 0;
                        int i35 = 0;
                        int i36 = 0;
                        int i37 = 0;
                        while (i34 < i27) {
                            int i38 = iArr7[i34];
                            long j4 = jArr7[i34];
                            int i39 = i27;
                            int i40 = i38;
                            while (i40 > 0) {
                                int min = Math.min(i29, i40);
                                jArr8[i37] = j4;
                                long[] jArr10 = jArr7;
                                int i41 = zza2 * min;
                                iArr8[i37] = i41;
                                i36 = Math.max(i36, i41);
                                jArr9[i37] = i35 * j3;
                                iArr9[i37] = 1;
                                j4 += iArr8[i37];
                                i35 += min;
                                i40 -= min;
                                i37++;
                                jArr7 = jArr10;
                                iArr7 = iArr7;
                            }
                            i34++;
                            i27 = i39;
                        }
                        i17 = zzb3;
                        j2 = j3 * i35;
                        jArr4 = jArr8;
                        iArr3 = iArr9;
                        iArr4 = iArr8;
                        jArr2 = jArr9;
                        i16 = i36;
                        zzaipVar2 = zzaipVar;
                        long zzs = zzfs.zzs(j2, 1000000L, zzaipVar2.zzc, RoundingMode.FLOOR);
                        jArr5 = zzaipVar2.zzh;
                        if (jArr5 != null) {
                            zzfs.zzE(jArr2, 1000000L, zzaipVar2.zzc);
                            return new zzais(zzaipVar, jArr4, iArr4, i16, jArr2, iArr3, zzs);
                        }
                        if (jArr5.length == 1 && zzaipVar2.zzb == 1 && (length = jArr2.length) >= 2) {
                            long[] jArr11 = zzaipVar2.zzi;
                            jArr11.getClass();
                            long j5 = jArr11[0];
                            int i42 = i17;
                            long zzs2 = zzfs.zzs(jArr5[0], zzaipVar2.zzc, zzaipVar2.zzd, RoundingMode.FLOOR) + j5;
                            int i43 = length - 1;
                            int max = Math.max(0, Math.min(4, i43));
                            int max2 = Math.max(0, Math.min(length - 4, i43));
                            long j6 = jArr2[0];
                            if (j6 > j5 || j5 >= jArr2[max] || jArr2[max2] >= zzs2 || zzs2 > j2) {
                                i21 = i42;
                            } else {
                                long zzs3 = zzfs.zzs(j5 - j6, zzaipVar2.zzf.zzA, zzaipVar2.zzc, RoundingMode.FLOOR);
                                i21 = i42;
                                long zzs4 = zzfs.zzs(j2 - zzs2, zzaipVar2.zzf.zzA, zzaipVar2.zzc, RoundingMode.FLOOR);
                                if (zzs3 == 0) {
                                    if (zzs4 != 0) {
                                        zzs3 = 0;
                                    }
                                }
                                if (zzs3 <= 2147483647L && zzs4 <= 2147483647L) {
                                    zzacuVar.zza = (int) zzs3;
                                    zzacuVar.zzb = (int) zzs4;
                                    zzfs.zzE(jArr2, 1000000L, zzaipVar2.zzc);
                                    return new zzais(zzaipVar, jArr4, iArr4, i16, jArr2, iArr3, zzfs.zzs(zzaipVar2.zzh[0], 1000000L, zzaipVar2.zzd, RoundingMode.FLOOR));
                                }
                            }
                        } else {
                            i21 = i17;
                        }
                        long[] jArr12 = zzaipVar2.zzh;
                        int length2 = jArr12.length;
                        if (length2 == 1) {
                            if (jArr12[0] == 0) {
                                long[] jArr13 = zzaipVar2.zzi;
                                jArr13.getClass();
                                long j7 = jArr13[0];
                                for (int i44 = 0; i44 < jArr2.length; i44++) {
                                    jArr2[i44] = zzfs.zzs(jArr2[i44] - j7, 1000000L, zzaipVar2.zzc, RoundingMode.FLOOR);
                                }
                                return new zzais(zzaipVar, jArr4, iArr4, i16, jArr2, iArr3, zzfs.zzs(j2 - j7, 1000000L, zzaipVar2.zzc, RoundingMode.FLOOR));
                            }
                            length2 = 1;
                        }
                        boolean z5 = zzaipVar2.zzb == 1;
                        long[] jArr14 = zzaipVar2.zzi;
                        int[] iArr10 = new int[length2];
                        int[] iArr11 = new int[length2];
                        jArr14.getClass();
                        int i45 = 0;
                        boolean z6 = false;
                        int i46 = 0;
                        int i47 = 0;
                        while (true) {
                            long[] jArr15 = zzaipVar2.zzh;
                            i22 = i16;
                            if (i46 >= jArr15.length) {
                                break;
                            }
                            int[] iArr12 = iArr4;
                            long j8 = jArr14[i46];
                            if (j8 != -1) {
                                i23 = i21;
                                int i48 = i45;
                                boolean z7 = z6;
                                long zzs5 = zzfs.zzs(jArr15[i46], zzaipVar2.zzc, zzaipVar2.zzd, RoundingMode.FLOOR);
                                int i49 = 1;
                                iArr10[i46] = zzfs.zzc(jArr2, j8, true, true);
                                iArr11[i46] = zzfs.zza(jArr2, j8 + zzs5, z5, false);
                                while (true) {
                                    i25 = iArr10[i46];
                                    i26 = iArr11[i46];
                                    if (i25 >= i26 || (iArr3[i25] & i49) != 0) {
                                        break;
                                    }
                                    iArr10[i46] = i25 + 1;
                                    i49 = 1;
                                }
                                i24 = i48 + (i26 - i25);
                                z4 = z7 | (i47 != i25);
                                i47 = i26;
                            } else {
                                z4 = z6;
                                i23 = i21;
                                i24 = i45;
                            }
                            i46++;
                            i16 = i22;
                            i45 = i24;
                            iArr4 = iArr12;
                            i21 = i23;
                            z6 = z4;
                        }
                        int[] iArr13 = iArr4;
                        boolean z8 = z6;
                        int i50 = i45;
                        int i51 = 0;
                        boolean z9 = z8 | (i50 != i21);
                        long[] jArr16 = z9 ? new long[i50] : jArr4;
                        int[] iArr14 = z9 ? new int[i50] : iArr13;
                        int i52 = true == z9 ? 0 : i22;
                        int[] iArr15 = z9 ? new int[i50] : iArr3;
                        long[] jArr17 = new long[i50];
                        int i53 = i52;
                        int i54 = 0;
                        long j9 = 0;
                        while (i51 < zzaipVar2.zzh.length) {
                            long j10 = zzaipVar2.zzi[i51];
                            int i55 = iArr10[i51];
                            int[] iArr16 = iArr10;
                            int i56 = iArr11[i51];
                            int[] iArr17 = iArr11;
                            if (z9) {
                                int i57 = i56 - i55;
                                System.arraycopy(jArr4, i55, jArr16, i54, i57);
                                jArr6 = jArr4;
                                iArr5 = iArr13;
                                System.arraycopy(iArr5, i55, iArr14, i54, i57);
                                System.arraycopy(iArr3, i55, iArr15, i54, i57);
                            } else {
                                jArr6 = jArr4;
                                iArr5 = iArr13;
                            }
                            int i58 = i53;
                            while (i55 < i56) {
                                int i59 = i56;
                                int i60 = i51;
                                long zzs6 = zzfs.zzs(j9, 1000000L, zzaipVar2.zzd, RoundingMode.FLOOR);
                                long[] jArr18 = jArr2;
                                int[] iArr18 = iArr3;
                                long zzs7 = zzfs.zzs(jArr2[i55] - j10, 1000000L, zzaipVar2.zzc, RoundingMode.FLOOR);
                                int[] iArr19 = iArr15;
                                long[] jArr19 = jArr16;
                                if (zzaipVar2.zzb != 1) {
                                    iArr6 = iArr14;
                                    zzs7 = Math.max(0L, zzs7);
                                } else {
                                    iArr6 = iArr14;
                                }
                                jArr17[i54] = zzs6 + zzs7;
                                if (z9 && iArr6[i54] > i58) {
                                    i58 = iArr5[i55];
                                }
                                i54++;
                                i55++;
                                i56 = i59;
                                iArr14 = iArr6;
                                i51 = i60;
                                jArr2 = jArr18;
                                iArr3 = iArr18;
                                iArr15 = iArr19;
                                jArr16 = jArr19;
                            }
                            int i61 = i51;
                            j9 += zzaipVar2.zzh[i61];
                            i51 = i61 + 1;
                            i53 = i58;
                            iArr13 = iArr5;
                            iArr14 = iArr14;
                            iArr10 = iArr16;
                            jArr2 = jArr2;
                            iArr11 = iArr17;
                            jArr4 = jArr6;
                            iArr15 = iArr15;
                            jArr16 = jArr16;
                        }
                        return new zzais(zzaipVar, jArr16, iArr14, i53, jArr17, iArr15, zzfs.zzs(j9, 1000000L, zzaipVar2.zzd, RoundingMode.FLOOR));
                    }
                    zzo = 0;
                }
                jArr = new long[zzb3];
                iArr = new int[zzb3];
                jArr2 = new long[zzb3];
                int[] iArr20 = new int[zzb3];
                int i62 = zzo;
                i4 = 0;
                i5 = 0;
                int i63 = 0;
                i6 = 0;
                int i64 = 0;
                j = 0;
                long j11 = 0;
                while (true) {
                    if (i4 < zzb3) {
                        i7 = zzo2;
                        i8 = i64;
                        i9 = i6;
                        break;
                    }
                    boolean z10 = true;
                    while (true) {
                        if (i5 != 0) {
                            i18 = zzb3;
                            i7 = zzo2;
                            i19 = zzo3;
                            i20 = i5;
                            break;
                        }
                        z10 = zzahtVar.zza();
                        if (!z10) {
                            i18 = zzb3;
                            i7 = zzo2;
                            i19 = zzo3;
                            i20 = 0;
                            break;
                        }
                        int i65 = zzo2;
                        long j12 = zzahtVar.zzd;
                        i5 = zzahtVar.zzc;
                        j = j12;
                        zzo2 = i65;
                        zzo3 = zzo3;
                        zzb3 = zzb3;
                    }
                    if (!z10) {
                        zzez.zzf("AtomParsers", "Unexpected end of chunk data");
                        jArr = Arrays.copyOf(jArr, i4);
                        iArr = Arrays.copyOf(iArr, i4);
                        jArr2 = Arrays.copyOf(jArr2, i4);
                        iArr20 = Arrays.copyOf(iArr20, i4);
                        zzb3 = i4;
                        i9 = i6;
                        i8 = i64;
                        break;
                    }
                    if (zzfjVar2 != null) {
                        while (true) {
                            if (i63 != 0) {
                                break;
                            }
                            if (i <= 0) {
                                i63 = 0;
                                break;
                            }
                            i--;
                            i63 = zzfjVar2.zzo();
                            i6 = zzfjVar2.zzf();
                        }
                        i63--;
                    }
                    int i66 = i6;
                    jArr[i4] = j;
                    int zzc = zzahyVar.zzc();
                    iArr[i4] = zzc;
                    int i67 = i64;
                    i64 = zzc > i67 ? zzc : i67;
                    jArr2[i4] = j11 + i66;
                    iArr20[i4] = zzfjVar == null ? 1 : 0;
                    if (i4 == i3) {
                        iArr20[i4] = 1;
                        i2--;
                        if (i2 > 0) {
                            zzfjVar.getClass();
                            i3 = zzfjVar.zzo() - 1;
                        }
                    }
                    int i68 = i3;
                    long[] jArr20 = jArr2;
                    zzo3 = i19;
                    j11 += zzo3;
                    int i69 = i7 - 1;
                    if (i69 == 0) {
                        if (i62 > 0) {
                            i69 = zzfjVar3.zzo();
                            i62--;
                            zzo3 = zzfjVar3.zzf();
                        } else {
                            i69 = 0;
                        }
                    }
                    int[] iArr21 = iArr;
                    j += iArr[i4];
                    int i70 = i20 - 1;
                    i4++;
                    i6 = i66;
                    jArr2 = jArr20;
                    jArr = jArr;
                    zzb3 = i18;
                    zzo2 = i69;
                    i3 = i68;
                    i5 = i70;
                    iArr = iArr21;
                }
                long j13 = j11 + i9;
                if (zzfjVar2 != null) {
                    while (i > 0) {
                        if (zzfjVar2.zzo() != 0) {
                            z2 = false;
                            break;
                        }
                        zzfjVar2.zzf();
                        i--;
                    }
                }
                z2 = true;
                if (i2 != 0) {
                    if (i7 == 0) {
                        if (i5 != 0) {
                            i14 = 0;
                            zzaipVar2 = zzaipVar;
                            z3 = z2;
                            jArr3 = jArr;
                            i11 = i5;
                        } else if (i62 != 0) {
                            i14 = 0;
                            i11 = 0;
                            zzaipVar2 = zzaipVar;
                            z3 = z2;
                            jArr3 = jArr;
                        } else if (i63 != 0) {
                            i14 = 0;
                            i11 = 0;
                            i12 = 0;
                            zzaipVar2 = zzaipVar;
                            z3 = z2;
                            jArr3 = jArr;
                            i13 = i63;
                        } else if (z2) {
                            zzaipVar2 = zzaipVar;
                            jArr3 = jArr;
                            iArr2 = iArr;
                            i15 = zzb3;
                            jArr4 = jArr3;
                            iArr3 = iArr20;
                            i16 = i8;
                            iArr4 = iArr2;
                            i17 = i15;
                            j2 = j13;
                            long zzs8 = zzfs.zzs(j2, 1000000L, zzaipVar2.zzc, RoundingMode.FLOOR);
                            jArr5 = zzaipVar2.zzh;
                            if (jArr5 != null) {
                            }
                        } else {
                            i10 = 0;
                            i14 = 0;
                            z3 = false;
                            i11 = 0;
                            i12 = 0;
                            i13 = 0;
                            zzaipVar2 = zzaipVar;
                            jArr3 = jArr;
                        }
                        i12 = i62;
                        i13 = i63;
                    } else {
                        zzaipVar2 = zzaipVar;
                        z3 = z2;
                        jArr3 = jArr;
                        i11 = i5;
                        i12 = i62;
                        i13 = i63;
                        i14 = i7;
                    }
                    i10 = 0;
                } else {
                    z3 = z2;
                    jArr3 = jArr;
                    i10 = i2;
                    i11 = i5;
                    i12 = i62;
                    i13 = i63;
                    i14 = i7;
                    zzaipVar2 = zzaipVar;
                }
                int i71 = zzaipVar2.zza;
                iArr2 = iArr;
                i15 = zzb3;
                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                sb.append(i71);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i10);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i14);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i11);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i12);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i13);
                sb.append(true == z3 ? ", ctts invalid" : "");
                zzez.zzf("AtomParsers", sb.toString());
                jArr4 = jArr3;
                iArr3 = iArr20;
                i16 = i8;
                iArr4 = iArr2;
                i17 = i15;
                j2 = j13;
                long zzs82 = zzfs.zzs(j2, 1000000L, zzaipVar2.zzc, RoundingMode.FLOOR);
                jArr5 = zzaipVar2.zzh;
                if (jArr5 != null) {
                }
            } else {
                zzfjVar = null;
            }
        } else {
            i2 = 0;
        }
        i3 = -1;
        zza2 = zzahyVar.zza();
        String str2 = zzaipVar.zzf.zzm;
        if (zza2 != -1) {
            if (i != 0) {
            }
            zzo = 0;
        }
        jArr = new long[zzb3];
        iArr = new int[zzb3];
        jArr2 = new long[zzb3];
        int[] iArr202 = new int[zzb3];
        int i622 = zzo;
        i4 = 0;
        i5 = 0;
        int i632 = 0;
        i6 = 0;
        int i642 = 0;
        j = 0;
        long j112 = 0;
        while (true) {
            if (i4 < zzb3) {
            }
            int[] iArr212 = iArr;
            j += iArr[i4];
            int i702 = i20 - 1;
            i4++;
            i6 = i66;
            jArr2 = jArr20;
            jArr = jArr;
            zzb3 = i18;
            zzo2 = i69;
            i3 = i68;
            i5 = i702;
            iArr = iArr212;
        }
        long j132 = j112 + i9;
        if (zzfjVar2 != null) {
        }
        z2 = true;
        if (i2 != 0) {
        }
        int i712 = zzaipVar2.zza;
        iArr2 = iArr;
        i15 = zzb3;
        StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
        sb2.append(i712);
        sb2.append(": remainingSynchronizationSamples ");
        sb2.append(i10);
        sb2.append(", remainingSamplesAtTimestampDelta ");
        sb2.append(i14);
        sb2.append(", remainingSamplesInChunk ");
        sb2.append(i11);
        sb2.append(", remainingTimestampDeltaChanges ");
        sb2.append(i12);
        sb2.append(", remainingSamplesAtTimestampOffset ");
        sb2.append(i13);
        sb2.append(true == z3 ? ", ctts invalid" : "");
        zzez.zzf("AtomParsers", sb2.toString());
        jArr4 = jArr3;
        iArr3 = iArr202;
        i16 = i8;
        iArr4 = iArr2;
        i17 = i15;
        j2 = j132;
        long zzs822 = zzfs.zzs(j2, 1000000L, zzaipVar2.zzc, RoundingMode.FLOOR);
        jArr5 = zzaipVar2.zzh;
        if (jArr5 != null) {
        }
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzm(zzfj zzfjVar, int i, int i2, int i3, int i4, String str, boolean z, zzad zzadVar, zzahw zzahwVar, int i5) throws zzcf {
        int i6;
        int zzm;
        int zzf;
        int i7;
        int i8;
        zzad zzadVar2;
        String str2;
        int i9;
        long j;
        long j2;
        String str3;
        int i10;
        int i11;
        int i12;
        String str4;
        byte[] bArr;
        int i13;
        String str5;
        boolean z2;
        boolean z3;
        zzfj zzfjVar2 = zzfjVar;
        int i14 = i2;
        int i15 = i3;
        zzfjVar2.zzG(i14 + 16);
        if (z) {
            i6 = zzfjVar.zzp();
            zzfjVar2.zzH(6);
        } else {
            zzfjVar2.zzH(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            int zzp = zzfjVar.zzp();
            zzfjVar2.zzH(6);
            zzm = zzfjVar.zzm();
            zzfjVar2.zzG(zzfjVar.zzc() - 4);
            zzf = zzfjVar.zzf();
            if (i6 == 1) {
                zzfjVar2.zzH(16);
            }
            i7 = zzp;
            i8 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            zzfjVar2.zzH(16);
            zzm = (int) Math.round(Double.longBitsToDouble(zzfjVar.zzs()));
            i7 = zzfjVar.zzo();
            zzfjVar2.zzH(4);
            int zzo = zzfjVar.zzo();
            int zzo2 = zzfjVar.zzo();
            int i16 = zzo2 & 1;
            int i17 = zzo2 & 2;
            if (i16 == 0) {
                if (zzo == 8) {
                    i8 = 3;
                } else if (zzo == 16) {
                    i8 = i17 != 0 ? 268435456 : 2;
                } else if (zzo == 24) {
                    i8 = i17 != 0 ? 1342177280 : 536870912;
                } else {
                    if (zzo == 32) {
                        i8 = i17 != 0 ? 1610612736 : 805306368;
                    }
                    i8 = -1;
                }
                zzfjVar2.zzH(8);
                zzf = 0;
            } else {
                if (zzo == 32) {
                    i8 = 4;
                    zzfjVar2.zzH(8);
                    zzf = 0;
                }
                i8 = -1;
                zzfjVar2.zzH(8);
                zzf = 0;
            }
        }
        int zzc = zzfjVar.zzc();
        int i18 = 1701733217;
        int i19 = i;
        if (i19 == 1701733217) {
            Pair zzh = zzh(zzfjVar2, i14, i15);
            if (zzh != null) {
                i18 = ((Integer) zzh.first).intValue();
                zzadVar2 = zzadVar == null ? null : zzadVar.zzb(((zzaiq) zzh.second).zzb);
                zzahwVar.zza[i5] = (zzaiq) zzh.second;
            } else {
                zzadVar2 = zzadVar;
            }
            zzfjVar2.zzG(zzc);
            i19 = i18;
        } else {
            zzadVar2 = zzadVar;
        }
        if (i19 == 1633889587) {
            str2 = "audio/ac3";
        } else {
            if (i19 != 1700998451) {
                if (i19 == 1633889588) {
                    i9 = i8;
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
                } else if (i19 == 1935767394) {
                    str2 = "audio/amr-wb";
                } else {
                    if (i19 != 1936684916) {
                        if (i19 == 1953984371) {
                            str2 = "audio/raw";
                            i9 = 268435456;
                        } else if (i19 == 1819304813) {
                            if (i8 != -1) {
                                i9 = i8;
                                str2 = "audio/raw";
                            }
                        } else if (i19 == 778924082 || i19 == 778924083) {
                            str2 = "audio/mpeg";
                        } else if (i19 == 1835557169) {
                            str2 = "audio/mha1";
                        } else if (i19 == 1835560241) {
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
                        } else {
                            i9 = i8;
                            str2 = null;
                        }
                    }
                    str2 = "audio/raw";
                    i9 = 2;
                }
                String str6 = null;
                zzahu zzahuVar = null;
                List list = null;
                while (zzc - i14 < i15) {
                    zzfjVar2.zzG(zzc);
                    int zzf2 = zzfjVar.zzf();
                    String str7 = "childAtomSize must be positive";
                    zzaci.zzb(zzf2 > 0, "childAtomSize must be positive");
                    int zzf3 = zzfjVar.zzf();
                    int i20 = i9;
                    if (zzf3 == 1835557187) {
                        int i21 = zzf2 - 13;
                        byte[] bArr2 = new byte[i21];
                        zzfjVar2.zzG(zzc + 13);
                        zzfjVar2.zzC(bArr2, 0, i21);
                        list = zzfwu.zzm(bArr2);
                        i12 = zzf;
                    } else {
                        if (zzf3 == 1702061171) {
                            str3 = str6;
                            i10 = zzc;
                            i11 = -1;
                        } else if (z && zzf3 == 2002876005) {
                            int zzc2 = zzfjVar.zzc();
                            if (zzc2 >= zzc) {
                                i13 = zzc2;
                                str5 = null;
                                z2 = true;
                            } else {
                                i13 = zzc2;
                                str5 = null;
                                z2 = false;
                            }
                            zzaci.zzb(z2, str5);
                            i10 = i13;
                            while (true) {
                                if (i10 - zzc >= zzf2) {
                                    str3 = str6;
                                    i10 = -1;
                                    break;
                                }
                                zzfjVar2.zzG(i10);
                                int zzf4 = zzfjVar.zzf();
                                if (zzf4 > 0) {
                                    str3 = str6;
                                    z3 = true;
                                } else {
                                    str3 = str6;
                                    z3 = false;
                                }
                                zzaci.zzb(z3, str7);
                                String str8 = str7;
                                if (zzfjVar.zzf() == 1702061171) {
                                    break;
                                }
                                i10 += zzf4;
                                str6 = str3;
                                str7 = str8;
                            }
                            i11 = -1;
                        } else {
                            str3 = str6;
                            if (zzf3 == 1684103987) {
                                zzfjVar2.zzG(zzc + 8);
                                zzahwVar.zzb = zzabf.zzc(zzfjVar2, Integer.toString(i4), str, zzadVar2);
                            } else if (zzf3 == 1684366131) {
                                zzfjVar2.zzG(zzc + 8);
                                zzahwVar.zzb = zzabf.zzd(zzfjVar2, Integer.toString(i4), str, zzadVar2);
                            } else if (zzf3 == 1684103988) {
                                zzfjVar2.zzG(zzc + 8);
                                String num = Integer.toString(i4);
                                int i22 = zzabi.zza;
                                zzfjVar2.zzH(1);
                                int zzl = zzfjVar.zzl() & 32;
                                zzak zzakVar = new zzak();
                                zzakVar.zzJ(num);
                                zzakVar.zzU("audio/ac4");
                                zzakVar.zzy(2);
                                zzakVar.zzV(1 != (zzl >> 5) ? 44100 : 48000);
                                zzakVar.zzD(zzadVar2);
                                zzakVar.zzM(str);
                                zzahwVar.zzb = zzakVar.zzac();
                            } else if (zzf3 != 1684892784) {
                                if (zzf3 == 1684305011 || zzf3 == 1969517683) {
                                    zzak zzakVar2 = new zzak();
                                    zzakVar2.zzI(i4);
                                    zzakVar2.zzU(str2);
                                    zzakVar2.zzy(i7);
                                    zzakVar2.zzV(zzm);
                                    zzakVar2.zzD(zzadVar2);
                                    zzakVar2.zzM(str);
                                    zzahwVar.zzb = zzakVar2.zzac();
                                } else if (zzf3 == 1682927731) {
                                    int i23 = zzf2 - 8;
                                    byte[] bArr3 = zza;
                                    byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i23);
                                    zzfjVar2.zzG(zzc + 8);
                                    zzfjVar2.zzC(copyOf, bArr3.length, i23);
                                    list = zzada.zze(copyOf);
                                    i12 = zzf;
                                    str6 = str3;
                                } else {
                                    if (zzf3 == 1684425825) {
                                        int i24 = zzf2 - 12;
                                        byte[] bArr4 = new byte[i24 + 4];
                                        bArr4[0] = 102;
                                        bArr4[1] = 76;
                                        bArr4[2] = 97;
                                        bArr4[3] = 67;
                                        zzfjVar2.zzG(zzc + 12);
                                        zzfjVar2.zzC(bArr4, 4, i24);
                                        list = zzfwu.zzm(bArr4);
                                    } else if (zzf3 == 1634492771) {
                                        int i25 = zzf2 - 12;
                                        byte[] bArr5 = new byte[i25];
                                        zzfjVar2.zzG(zzc + 12);
                                        zzfjVar2.zzC(bArr5, 0, i25);
                                        int i26 = zzeh.zza;
                                        zzfj zzfjVar3 = new zzfj(bArr5);
                                        zzfjVar3.zzG(9);
                                        int zzl2 = zzfjVar3.zzl();
                                        zzfjVar3.zzG(20);
                                        Pair create = Pair.create(Integer.valueOf(zzfjVar3.zzo()), Integer.valueOf(zzl2));
                                        zzm = ((Integer) create.first).intValue();
                                        int intValue = ((Integer) create.second).intValue();
                                        list = zzfwu.zzm(bArr5);
                                        i7 = intValue;
                                    }
                                    i12 = zzf;
                                    str6 = str3;
                                    zzc += zzf2;
                                    zzfjVar2 = zzfjVar;
                                    i14 = i2;
                                    i15 = i3;
                                    i9 = i20;
                                    zzf = i12;
                                }
                                i12 = zzf;
                                str6 = str3;
                                zzc += zzf2;
                                zzfjVar2 = zzfjVar;
                                i14 = i2;
                                i15 = i3;
                                i9 = i20;
                                zzf = i12;
                            } else {
                                if (zzf <= 0) {
                                    throw zzcf.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + zzf, null);
                                }
                                zzm = zzf;
                                i12 = zzm;
                                str6 = str3;
                                i7 = 2;
                            }
                            i12 = zzf;
                            str6 = str3;
                            zzc += zzf2;
                            zzfjVar2 = zzfjVar;
                            i14 = i2;
                            i15 = i3;
                            i9 = i20;
                            zzf = i12;
                        }
                        if (i10 != i11) {
                            zzahuVar = zzj(zzfjVar2, i10);
                            str4 = zzahuVar.zza;
                            bArr = zzahuVar.zzb;
                            if (bArr == null) {
                                i12 = zzf;
                            } else if ("audio/vorbis".equals(str4)) {
                                zzfj zzfjVar4 = new zzfj(bArr);
                                zzfjVar4.zzH(1);
                                int i27 = 0;
                                while (zzfjVar4.zza() > 0 && zzfjVar4.zze() == 255) {
                                    zzfjVar4.zzH(1);
                                    i27 += 255;
                                }
                                int zzl3 = i27 + zzfjVar4.zzl();
                                int i28 = 0;
                                while (true) {
                                    i12 = zzf;
                                    if (zzfjVar4.zza() <= 0 || zzfjVar4.zze() != 255) {
                                        break;
                                    }
                                    zzfjVar4.zzH(1);
                                    i28 += 255;
                                    zzf = i12;
                                }
                                int zzl4 = i28 + zzfjVar4.zzl();
                                byte[] bArr6 = new byte[zzl3];
                                int zzc3 = zzfjVar4.zzc();
                                System.arraycopy(bArr, zzc3, bArr6, 0, zzl3);
                                int i29 = zzc3 + zzl3 + zzl4;
                                int length = bArr.length - i29;
                                byte[] bArr7 = new byte[length];
                                System.arraycopy(bArr, i29, bArr7, 0, length);
                                list = zzfwu.zzn(bArr6, bArr7);
                            } else {
                                i12 = zzf;
                                if ("audio/mp4a-latm".equals(str4)) {
                                    zzabb zza2 = zzabc.zza(bArr);
                                    zzm = zza2.zza;
                                    i7 = zza2.zzb;
                                    str6 = zza2.zzc;
                                } else {
                                    str6 = str3;
                                }
                                list = zzfwu.zzm(bArr);
                                str2 = str4;
                                zzc += zzf2;
                                zzfjVar2 = zzfjVar;
                                i14 = i2;
                                i15 = i3;
                                i9 = i20;
                                zzf = i12;
                            }
                            str2 = str4;
                            str6 = str3;
                            zzc += zzf2;
                            zzfjVar2 = zzfjVar;
                            i14 = i2;
                            i15 = i3;
                            i9 = i20;
                            zzf = i12;
                        }
                        i12 = zzf;
                        str6 = str3;
                        zzc += zzf2;
                        zzfjVar2 = zzfjVar;
                        i14 = i2;
                        i15 = i3;
                        i9 = i20;
                        zzf = i12;
                    }
                    zzc += zzf2;
                    zzfjVar2 = zzfjVar;
                    i14 = i2;
                    i15 = i3;
                    i9 = i20;
                    zzf = i12;
                }
                String str9 = str6;
                int i30 = i9;
                if (zzahwVar.zzb == null || str2 == null) {
                }
                zzak zzakVar3 = new zzak();
                zzakVar3.zzI(i4);
                zzakVar3.zzU(str2);
                zzakVar3.zzz(str9);
                zzakVar3.zzy(i7);
                zzakVar3.zzV(zzm);
                zzakVar3.zzP(i30);
                zzakVar3.zzK(list);
                zzakVar3.zzD(zzadVar2);
                zzakVar3.zzM(str);
                if (zzahuVar != null) {
                    j = zzahuVar.zzc;
                    zzakVar3.zzx(zzfzi.zzc(j));
                    j2 = zzahuVar.zzd;
                    zzakVar3.zzQ(zzfzi.zzc(j2));
                }
                zzahwVar.zzb = zzakVar3.zzac();
                return;
            }
            str2 = "audio/eac3";
        }
        i9 = i8;
        String str62 = null;
        zzahu zzahuVar2 = null;
        List list2 = null;
        while (zzc - i14 < i15) {
        }
        String str92 = str62;
        int i302 = i9;
        if (zzahwVar.zzb == null) {
        }
    }
}

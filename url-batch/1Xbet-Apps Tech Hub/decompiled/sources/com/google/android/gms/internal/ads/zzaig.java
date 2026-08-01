package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaig implements zzace {
    public static final zzacl zza = new zzacl() { // from class: com.google.android.gms.internal.ads.zzaic
        @Override // com.google.android.gms.internal.ads.zzacl
        public final /* synthetic */ zzace[] zza(Uri uri, Map map) {
            int i = zzack.zza;
            zzacl zzaclVar = zzaig.zza;
            return new zzace[]{new zzaig(0, null)};
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzam zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzach zzD;
    private zzadk[] zzE;
    private zzadk[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzfj zzf;
    private final zzfj zzg;
    private final zzfj zzh;
    private final byte[] zzi;
    private final zzfj zzj;
    private final zzafe zzk;
    private final zzfj zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzfj zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzaif zzy;
    private int zzz;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zzU("application/x-emsg");
        zzc = zzakVar.zzac();
    }

    public zzaig() {
        this(0, null);
    }

    private static int zza(int i) throws zzcf {
        if (i >= 0) {
            return i;
        }
        throw zzcf.zza("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzad zzf(List list) {
        zzaim zzaimVar;
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzahr zzahrVar = (zzahr) list.get(i);
            if (zzahrVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] zzI = zzahrVar.zza.zzI();
                zzfj zzfjVar = new zzfj(zzI);
                if (zzfjVar.zzd() >= 32) {
                    zzfjVar.zzG(0);
                    if (zzfjVar.zzf() == zzfjVar.zza() + 4 && zzfjVar.zzf() == 1886614376) {
                        int zze = zzahs.zze(zzfjVar.zzf());
                        if (zze > 1) {
                            zzez.zzf("PsshAtomUtil", "Unsupported pssh version: " + zze);
                        } else {
                            UUID uuid2 = new UUID(zzfjVar.zzs(), zzfjVar.zzs());
                            if (zze == 1) {
                                zzfjVar.zzH(zzfjVar.zzo() * 16);
                            }
                            int zzo = zzfjVar.zzo();
                            if (zzo == zzfjVar.zza()) {
                                byte[] bArr = new byte[zzo];
                                zzfjVar.zzC(bArr, 0, zzo);
                                zzaimVar = new zzaim(uuid2, zze, bArr);
                                uuid = zzaimVar != null ? null : zzaimVar.zza;
                                if (uuid != null) {
                                    zzez.zzf("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                } else {
                                    arrayList.add(new zzac(uuid, null, "video/mp4", zzI));
                                }
                            }
                        }
                    }
                }
                zzaimVar = null;
                if (zzaimVar != null) {
                }
                if (uuid != null) {
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzad(arrayList);
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzfj zzfjVar, int i, zzair zzairVar) throws zzcf {
        zzfjVar.zzG(i + 8);
        int zzf = zzfjVar.zzf() & ViewCompat.MEASURED_SIZE_MASK;
        if ((zzf & 1) != 0) {
            throw zzcf.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzf & 2) != 0;
        int zzo = zzfjVar.zzo();
        if (zzo == 0) {
            Arrays.fill(zzairVar.zzl, 0, zzairVar.zze, false);
            return;
        }
        int i2 = zzairVar.zze;
        if (zzo != i2) {
            throw zzcf.zza("Senc sample count " + zzo + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(zzairVar.zzl, 0, zzo, z);
        zzairVar.zza(zzfjVar.zza());
        zzfj zzfjVar2 = zzairVar.zzn;
        zzfjVar.zzC(zzfjVar2.zzI(), 0, zzfjVar2.zzd());
        zzairVar.zzn.zzG(0);
        zzairVar.zzo = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0317, code lost:
    
        if (com.google.android.gms.internal.ads.zzfs.zzs(r35, 1000000, r5.zzd, java.math.RoundingMode.FLOOR) < r5.zze) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzi(long j) throws zzcf {
        zzaig zzaigVar;
        SparseArray sparseArray;
        zzahq zzahqVar;
        int i;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        boolean z;
        int i6;
        zzahq zzahqVar2;
        byte[] bArr4;
        zzair zzairVar;
        List list;
        int i7;
        int i8;
        int i9;
        zzahq zzahqVar3;
        zzaif zzaifVar;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        zzaib zzaibVar;
        int i18;
        long[] jArr;
        final zzaig zzaigVar2 = this;
        while (!zzaigVar2.zzm.isEmpty() && ((zzahq) zzaigVar2.zzm.peek()).zza == j) {
            zzahq zzahqVar4 = (zzahq) zzaigVar2.zzm.pop();
            int i19 = zzahqVar4.zzd;
            int i20 = 12;
            int i21 = 8;
            if (i19 == 1836019574) {
                zzad zzf = zzf(zzahqVar4.zzb);
                zzahq zza2 = zzahqVar4.zza(1836475768);
                zza2.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = zza2.zzb.size();
                long j2 = -9223372036854775807L;
                int i22 = 0;
                while (i22 < size) {
                    zzahr zzahrVar = (zzahr) zza2.zzb.get(i22);
                    int i23 = zzahrVar.zzd;
                    if (i23 == 1953654136) {
                        zzfj zzfjVar = zzahrVar.zza;
                        zzfjVar.zzG(i20);
                        Pair create = Pair.create(Integer.valueOf(zzfjVar.zzf()), new zzaib(zzfjVar.zzf() - 1, zzfjVar.zzf(), zzfjVar.zzf(), zzfjVar.zzf()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zzaib) create.second);
                    } else if (i23 == 1835362404) {
                        zzfj zzfjVar2 = zzahrVar.zza;
                        zzfjVar2.zzG(8);
                        j2 = zzahs.zze(zzfjVar2.zzf()) == 0 ? zzfjVar2.zzt() : zzfjVar2.zzu();
                    }
                    i22++;
                    i20 = 12;
                }
                List zzd = zzaia.zzd(zzahqVar4, new zzacu(), j2, zzf, false, false, new zzftn() { // from class: com.google.android.gms.internal.ads.zzaid
                    @Override // com.google.android.gms.internal.ads.zzftn
                    public final Object apply(Object obj) {
                        return (zzaip) obj;
                    }
                });
                int size2 = zzd.size();
                if (zzaigVar2.zze.size() == 0) {
                    for (int i24 = 0; i24 < size2; i24++) {
                        zzais zzaisVar = (zzais) zzd.get(i24);
                        zzaip zzaipVar = zzaisVar.zza;
                        zzaigVar2.zze.put(zzaipVar.zza, new zzaif(zzaigVar2.zzD.zzw(i24, zzaipVar.zzb), zzaisVar, zzj(sparseArray2, zzaipVar.zza)));
                        zzaigVar2.zzw = Math.max(zzaigVar2.zzw, zzaipVar.zze);
                    }
                    zzaigVar2.zzD.zzD();
                } else {
                    zzef.zzf(zzaigVar2.zze.size() == size2);
                    for (int i25 = 0; i25 < size2; i25++) {
                        zzais zzaisVar2 = (zzais) zzd.get(i25);
                        zzaip zzaipVar2 = zzaisVar2.zza;
                        ((zzaif) zzaigVar2.zze.get(zzaipVar2.zza)).zzh(zzaisVar2, zzj(sparseArray2, zzaipVar2.zza));
                    }
                }
            } else {
                if (i19 == 1836019558) {
                    SparseArray sparseArray3 = zzaigVar2.zze;
                    byte[] bArr5 = zzaigVar2.zzi;
                    int size3 = zzahqVar4.zzc.size();
                    int i26 = 0;
                    while (i26 < size3) {
                        zzahq zzahqVar5 = (zzahq) zzahqVar4.zzc.get(i26);
                        if (zzahqVar5.zzd == 1953653094) {
                            zzahr zzb2 = zzahqVar5.zzb(1952868452);
                            zzb2.getClass();
                            zzfj zzfjVar3 = zzb2.zza;
                            zzfjVar3.zzG(i21);
                            int zzf2 = zzfjVar3.zzf() & ViewCompat.MEASURED_SIZE_MASK;
                            zzaif zzaifVar2 = (zzaif) sparseArray3.get(zzfjVar3.zzf());
                            if (zzaifVar2 == null) {
                                zzaifVar2 = null;
                            } else {
                                if ((zzf2 & 1) != 0) {
                                    long zzu = zzfjVar3.zzu();
                                    zzair zzairVar2 = zzaifVar2.zzb;
                                    zzairVar2.zzb = zzu;
                                    zzairVar2.zzc = zzu;
                                }
                                zzaib zzaibVar2 = zzaifVar2.zze;
                                zzaifVar2.zzb.zza = new zzaib((zzf2 & 2) != 0 ? zzfjVar3.zzf() - 1 : zzaibVar2.zza, (zzf2 & 8) != 0 ? zzfjVar3.zzf() : zzaibVar2.zzb, (zzf2 & 16) != 0 ? zzfjVar3.zzf() : zzaibVar2.zzc, (zzf2 & 32) != 0 ? zzfjVar3.zzf() : zzaibVar2.zzd);
                            }
                            if (zzaifVar2 != null) {
                                zzair zzairVar3 = zzaifVar2.zzb;
                                long j3 = zzairVar3.zzp;
                                boolean z3 = zzairVar3.zzq;
                                zzaifVar2.zzi();
                                zzaifVar2.zzl = true;
                                zzahr zzb3 = zzahqVar5.zzb(1952867444);
                                if (zzb3 != null) {
                                    zzfj zzfjVar4 = zzb3.zza;
                                    zzfjVar4.zzG(i21);
                                    zzairVar3.zzp = zzahs.zze(zzfjVar4.zzf()) == 1 ? zzfjVar4.zzu() : zzfjVar4.zzt();
                                    zzairVar3.zzq = true;
                                } else {
                                    zzairVar3.zzp = j3;
                                    zzairVar3.zzq = z3;
                                }
                                List list2 = zzahqVar5.zzb;
                                int size4 = list2.size();
                                int i27 = 0;
                                int i28 = 0;
                                int i29 = 0;
                                while (true) {
                                    i4 = 1953658222;
                                    if (i27 >= size4) {
                                        break;
                                    }
                                    zzahr zzahrVar2 = (zzahr) list2.get(i27);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzahrVar2.zzd == 1953658222) {
                                        zzfj zzfjVar5 = zzahrVar2.zza;
                                        zzfjVar5.zzG(12);
                                        int zzo = zzfjVar5.zzo();
                                        if (zzo > 0) {
                                            i29 += zzo;
                                            i28++;
                                        }
                                    }
                                    i27++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzaifVar2.zzh = 0;
                                zzaifVar2.zzg = 0;
                                zzaifVar2.zzf = 0;
                                zzair zzairVar4 = zzaifVar2.zzb;
                                zzairVar4.zzd = i28;
                                zzairVar4.zze = i29;
                                if (zzairVar4.zzg.length < i28) {
                                    zzairVar4.zzf = new long[i28];
                                    zzairVar4.zzg = new int[i28];
                                }
                                if (zzairVar4.zzh.length < i29) {
                                    int i30 = (i29 * 125) / 100;
                                    zzairVar4.zzh = new int[i30];
                                    zzairVar4.zzi = new long[i30];
                                    zzairVar4.zzj = new boolean[i30];
                                    zzairVar4.zzl = new boolean[i30];
                                }
                                int i31 = 0;
                                int i32 = 0;
                                int i33 = 0;
                                while (true) {
                                    long j4 = 0;
                                    if (i31 >= size4) {
                                        break;
                                    }
                                    zzahr zzahrVar3 = (zzahr) list2.get(i31);
                                    if (zzahrVar3.zzd == i4) {
                                        int i34 = i32 + 1;
                                        zzfj zzfjVar6 = zzahrVar3.zza;
                                        zzfjVar6.zzG(8);
                                        int zzf3 = zzfjVar6.zzf() & ViewCompat.MEASURED_SIZE_MASK;
                                        list = list2;
                                        zzaip zzaipVar3 = zzaifVar2.zzd.zza;
                                        i7 = size3;
                                        zzair zzairVar5 = zzaifVar2.zzb;
                                        i9 = size4;
                                        zzaib zzaibVar3 = zzairVar5.zza;
                                        int i35 = zzfs.zza;
                                        zzairVar5.zzg[i32] = zzfjVar6.zzo();
                                        long[] jArr2 = zzairVar5.zzf;
                                        zzahqVar2 = zzahqVar4;
                                        bArr4 = bArr5;
                                        long j5 = zzairVar5.zzb;
                                        jArr2[i32] = j5;
                                        if ((zzf3 & 1) != 0) {
                                            i6 = i31;
                                            jArr2[i32] = j5 + zzfjVar6.zzf();
                                        } else {
                                            i6 = i31;
                                        }
                                        boolean z4 = (zzf3 & 4) != 0;
                                        int i36 = zzaibVar3.zzd;
                                        if (z4) {
                                            i36 = zzfjVar6.zzf();
                                        }
                                        int i37 = zzf3 & 256;
                                        int i38 = zzf3 & 512;
                                        int i39 = zzf3 & 1024;
                                        int i40 = zzf3 & 2048;
                                        int i41 = i36;
                                        long[] jArr3 = zzaipVar3.zzh;
                                        if (jArr3 != null) {
                                            i8 = i26;
                                            zzahqVar3 = zzahqVar5;
                                            if (jArr3.length != 1 || (jArr = zzaipVar3.zzi) == null) {
                                                z2 = z4;
                                                i10 = i40;
                                                zzaifVar = zzaifVar2;
                                            } else {
                                                long j6 = jArr3[0];
                                                if (j6 == 0) {
                                                    z2 = z4;
                                                    i10 = i40;
                                                    zzaifVar = zzaifVar2;
                                                } else {
                                                    long j7 = j6 + jArr[0];
                                                    i10 = i40;
                                                    z2 = z4;
                                                    zzaifVar = zzaifVar2;
                                                }
                                                j4 = zzaipVar3.zzi[0];
                                            }
                                        } else {
                                            i8 = i26;
                                            zzahqVar3 = zzahqVar5;
                                            i10 = i40;
                                            zzaifVar = zzaifVar2;
                                            z2 = z4;
                                        }
                                        int[] iArr = zzairVar5.zzh;
                                        long[] jArr4 = zzairVar5.zzi;
                                        boolean[] zArr = zzairVar5.zzj;
                                        int i42 = zzairVar5.zzg[i32] + i33;
                                        zzair zzairVar6 = zzairVar3;
                                        long j8 = zzaipVar3.zzc;
                                        zzairVar = zzairVar6;
                                        long j9 = zzairVar5.zzp;
                                        while (i33 < i42) {
                                            if (i37 != 0) {
                                                i11 = i37;
                                                i12 = zzfjVar6.zzf();
                                            } else {
                                                i11 = i37;
                                                i12 = zzaibVar3.zzb;
                                            }
                                            zza(i12);
                                            if (i38 != 0) {
                                                i13 = i38;
                                                i14 = zzfjVar6.zzf();
                                            } else {
                                                i13 = i38;
                                                i14 = zzaibVar3.zzc;
                                            }
                                            zza(i14);
                                            if (i39 != 0) {
                                                i15 = i42;
                                                i16 = zzfjVar6.zzf();
                                            } else {
                                                i15 = i42;
                                                if (i33 == 0) {
                                                    if (z2) {
                                                        i16 = i41;
                                                        i33 = 0;
                                                    } else {
                                                        i33 = 0;
                                                    }
                                                }
                                                i16 = zzaibVar3.zzd;
                                            }
                                            if (i10 != 0) {
                                                i17 = i10;
                                                zzaibVar = zzaibVar3;
                                                i18 = zzfjVar6.zzf();
                                            } else {
                                                i17 = i10;
                                                zzaibVar = zzaibVar3;
                                                i18 = 0;
                                            }
                                            long zzs = zzfs.zzs((i18 + j9) - j4, 1000000L, j8, RoundingMode.FLOOR);
                                            jArr4[i33] = zzs;
                                            long j10 = j8;
                                            if (!zzairVar5.zzq) {
                                                jArr4[i33] = zzs + zzaifVar.zzd.zzh;
                                            }
                                            iArr[i33] = i14;
                                            zArr[i33] = 1 == (((i16 >> 16) & 1) ^ 1);
                                            j9 += i12;
                                            i33++;
                                            j8 = j10;
                                            i37 = i11;
                                            i38 = i13;
                                            i42 = i15;
                                            i10 = i17;
                                            zzaibVar3 = zzaibVar;
                                        }
                                        int i43 = i42;
                                        zzairVar5.zzp = j9;
                                        i32 = i34;
                                        i33 = i43;
                                    } else {
                                        i6 = i31;
                                        zzahqVar2 = zzahqVar4;
                                        bArr4 = bArr5;
                                        zzairVar = zzairVar3;
                                        list = list2;
                                        i7 = size3;
                                        i8 = i26;
                                        i9 = size4;
                                        zzahqVar3 = zzahqVar5;
                                        zzaifVar = zzaifVar2;
                                    }
                                    i31 = i6 + 1;
                                    list2 = list;
                                    size3 = i7;
                                    size4 = i9;
                                    zzahqVar4 = zzahqVar2;
                                    bArr5 = bArr4;
                                    i26 = i8;
                                    zzahqVar5 = zzahqVar3;
                                    zzaifVar2 = zzaifVar;
                                    zzairVar3 = zzairVar;
                                    i4 = 1953658222;
                                }
                                zzahqVar = zzahqVar4;
                                byte[] bArr6 = bArr5;
                                zzair zzairVar7 = zzairVar3;
                                i = size3;
                                i3 = i26;
                                zzahq zzahqVar6 = zzahqVar5;
                                zzaip zzaipVar4 = zzaifVar2.zzd.zza;
                                zzaib zzaibVar4 = zzairVar7.zza;
                                zzaibVar4.getClass();
                                zzaiq zza3 = zzaipVar4.zza(zzaibVar4.zza);
                                zzahr zzb4 = zzahqVar6.zzb(1935763834);
                                if (zzb4 != null) {
                                    zza3.getClass();
                                    zzfj zzfjVar7 = zzb4.zza;
                                    zzfjVar7.zzG(8);
                                    if ((zzfjVar7.zzf() & 1) == 1) {
                                        zzfjVar7.zzH(8);
                                    }
                                    int zzl = zzfjVar7.zzl();
                                    int zzo2 = zzfjVar7.zzo();
                                    int i44 = zzairVar7.zze;
                                    if (zzo2 > i44) {
                                        throw zzcf.zza("Saiz sample count " + zzo2 + " is greater than fragment sample count" + i44, null);
                                    }
                                    int i45 = zza3.zzd;
                                    if (zzl == 0) {
                                        boolean[] zArr2 = zzairVar7.zzl;
                                        i5 = 0;
                                        for (int i46 = 0; i46 < zzo2; i46++) {
                                            int zzl2 = zzfjVar7.zzl();
                                            i5 += zzl2;
                                            zArr2[i46] = zzl2 > i45;
                                        }
                                        z = false;
                                    } else {
                                        boolean z5 = zzl > i45;
                                        i5 = zzl * zzo2;
                                        z = false;
                                        Arrays.fill(zzairVar7.zzl, 0, zzo2, z5);
                                    }
                                    Arrays.fill(zzairVar7.zzl, zzo2, zzairVar7.zze, z);
                                    if (i5 > 0) {
                                        zzairVar7.zza(i5);
                                    }
                                }
                                zzahr zzb5 = zzahqVar6.zzb(1935763823);
                                if (zzb5 != null) {
                                    zzfj zzfjVar8 = zzb5.zza;
                                    zzfjVar8.zzG(8);
                                    int zzf4 = zzfjVar8.zzf();
                                    if ((zzf4 & 1) == 1) {
                                        zzfjVar8.zzH(8);
                                    }
                                    int zzo3 = zzfjVar8.zzo();
                                    if (zzo3 != 1) {
                                        throw zzcf.zza("Unexpected saio entry count: " + zzo3, null);
                                    }
                                    zzairVar7.zzc += zzahs.zze(zzf4) == 0 ? zzfjVar8.zzt() : zzfjVar8.zzu();
                                }
                                zzahr zzb6 = zzahqVar6.zzb(1936027235);
                                if (zzb6 != null) {
                                    zzh(zzb6.zza, 0, zzairVar7);
                                }
                                String str = zza3 != null ? zza3.zzb : null;
                                zzfj zzfjVar9 = null;
                                zzfj zzfjVar10 = null;
                                for (int i47 = 0; i47 < zzahqVar6.zzb.size(); i47++) {
                                    zzahr zzahrVar4 = (zzahr) zzahqVar6.zzb.get(i47);
                                    zzfj zzfjVar11 = zzahrVar4.zza;
                                    int i48 = zzahrVar4.zzd;
                                    if (i48 == 1935828848) {
                                        zzfjVar11.zzG(12);
                                        if (zzfjVar11.zzf() == 1936025959) {
                                            zzfjVar9 = zzfjVar11;
                                        }
                                    } else if (i48 == 1936158820) {
                                        zzfjVar11.zzG(12);
                                        if (zzfjVar11.zzf() == 1936025959) {
                                            zzfjVar10 = zzfjVar11;
                                        }
                                    }
                                }
                                if (zzfjVar9 != null && zzfjVar10 != null) {
                                    zzfjVar9.zzG(8);
                                    int zze = zzahs.zze(zzfjVar9.zzf());
                                    zzfjVar9.zzH(4);
                                    if (zze == 1) {
                                        zzfjVar9.zzH(4);
                                    }
                                    if (zzfjVar9.zzf() != 1) {
                                        throw zzcf.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzfjVar10.zzG(8);
                                    int zze2 = zzahs.zze(zzfjVar10.zzf());
                                    zzfjVar10.zzH(4);
                                    if (zze2 == 1) {
                                        if (zzfjVar10.zzt() == 0) {
                                            throw zzcf.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (zze2 >= 2) {
                                        zzfjVar10.zzH(4);
                                    }
                                    if (zzfjVar10.zzt() != 1) {
                                        throw zzcf.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzfjVar10.zzH(1);
                                    int zzl3 = zzfjVar10.zzl();
                                    int i49 = (zzl3 & 240) >> 4;
                                    int i50 = zzl3 & 15;
                                    if (zzfjVar10.zzl() == 1) {
                                        int zzl4 = zzfjVar10.zzl();
                                        byte[] bArr7 = new byte[16];
                                        zzfjVar10.zzC(bArr7, 0, 16);
                                        if (zzl4 == 0) {
                                            int zzl5 = zzfjVar10.zzl();
                                            byte[] bArr8 = new byte[zzl5];
                                            zzfjVar10.zzC(bArr8, 0, zzl5);
                                            bArr3 = bArr8;
                                        } else {
                                            bArr3 = null;
                                        }
                                        zzairVar7.zzk = true;
                                        zzairVar7.zzm = new zzaiq(true, str, zzl4, bArr7, i49, i50, bArr3);
                                    }
                                }
                                int size5 = zzahqVar6.zzb.size();
                                int i51 = 0;
                                while (i51 < size5) {
                                    zzahr zzahrVar5 = (zzahr) zzahqVar6.zzb.get(i51);
                                    if (zzahrVar5.zzd == 1970628964) {
                                        zzfj zzfjVar12 = zzahrVar5.zza;
                                        zzfjVar12.zzG(8);
                                        bArr2 = bArr6;
                                        zzfjVar12.zzC(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzh(zzfjVar12, 16, zzairVar7);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i51++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                i2 = 8;
                                i21 = i2;
                                bArr5 = bArr;
                                size3 = i;
                                zzahqVar4 = zzahqVar;
                                i26 = i3 + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        zzahqVar = zzahqVar4;
                        i = size3;
                        i2 = i21;
                        i3 = i26;
                        bArr = bArr5;
                        i21 = i2;
                        bArr5 = bArr;
                        size3 = i;
                        zzahqVar4 = zzahqVar;
                        i26 = i3 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzad zzf5 = zzf(zzahqVar4.zzb);
                    zzaigVar = this;
                    if (zzf5 != null) {
                        int size6 = zzaigVar.zze.size();
                        for (int i52 = 0; i52 < size6; i52++) {
                            zzaif zzaifVar3 = (zzaif) zzaigVar.zze.valueAt(i52);
                            zzaip zzaipVar5 = zzaifVar3.zzd.zza;
                            zzaib zzaibVar5 = zzaifVar3.zzb.zza;
                            int i53 = zzfs.zza;
                            zzaiq zza4 = zzaipVar5.zza(zzaibVar5.zza);
                            zzad zzb7 = zzf5.zzb(zza4 != null ? zza4.zzb : null);
                            zzak zzb8 = zzaifVar3.zzd.zza.zzf.zzb();
                            zzb8.zzD(zzb7);
                            zzaifVar3.zza.zzl(zzb8.zzac());
                        }
                    }
                    if (zzaigVar.zzv != -9223372036854775807L) {
                        int size7 = zzaigVar.zze.size();
                        for (int i54 = 0; i54 < size7; i54++) {
                            zzaif zzaifVar4 = (zzaif) zzaigVar.zze.valueAt(i54);
                            long j11 = zzaigVar.zzv;
                            int i55 = zzaifVar4.zzf;
                            while (true) {
                                zzair zzairVar8 = zzaifVar4.zzb;
                                if (i55 < zzairVar8.zze && zzairVar8.zzi[i55] <= j11) {
                                    if (zzairVar8.zzj[i55]) {
                                        zzaifVar4.zzi = i55;
                                    }
                                    i55++;
                                }
                            }
                        }
                        zzaigVar.zzv = -9223372036854775807L;
                    }
                } else {
                    zzaigVar = zzaigVar2;
                    if (!zzaigVar.zzm.isEmpty()) {
                        ((zzahq) zzaigVar.zzm.peek()).zzc(zzahqVar4);
                    }
                }
                zzaigVar2 = zzaigVar;
            }
        }
        zzg();
    }

    private static final zzaib zzj(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzaib) sparseArray.valueAt(0);
        }
        zzaib zzaibVar = (zzaib) sparseArray.get(i);
        zzaibVar.getClass();
        return zzaibVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:307:0x0099, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x009c, code lost:
    
        if (r33.zzo != 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x009e, code lost:
    
        r3 = r2.zzb();
        r33.zzz = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x00a8, code lost:
    
        if (r2.zzf >= r2.zzi) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x00aa, code lost:
    
        ((com.google.android.gms.internal.ads.zzabu) r34).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x00b3, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x00b6, code lost:
    
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00bc, code lost:
    
        if (r1 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x00be, code lost:
    
        r3.zzH(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x00c9, code lost:
    
        if (r2.zzb.zzb(r2.zzf) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x00cb, code lost:
    
        r3.zzH(r3.zzp() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x00d7, code lost:
    
        if (r2.zzk() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x00d9, code lost:
    
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00db, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0293, code lost:
    
        r33.zzo = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0296, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00e4, code lost:
    
        if (r2.zzd.zza.zzg != 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00e6, code lost:
    
        r33.zzz = r3 - 8;
        ((com.google.android.gms.internal.ads.zzabu) r34).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0100, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzm) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0102, code lost:
    
        r33.zzA = r2.zzc(r33.zzz, 7);
        com.google.android.gms.internal.ads.zzabi.zzb(r33.zzz, r33.zzj);
        r2.zza.zzr(r33.zzj, 7);
        r3 = r33.zzA + 7;
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0127, code lost:
    
        r33.zzz += r3;
        r33.zzo = 4;
        r33.zzB = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x011f, code lost:
    
        r3 = r2.zzc(r33.zzz, 0);
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0131, code lost:
    
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r10 = r2.zze();
        r6 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x013d, code lost:
    
        if (r6 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x013f, code lost:
    
        r3 = r33.zzA;
        r4 = r33.zzz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0143, code lost:
    
        if (r3 >= r4) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0145, code lost:
    
        r33.zzA += r5.zzf(r34, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0234, code lost:
    
        r20 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x023c, code lost:
    
        if (r1 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x023e, code lost:
    
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0245, code lost:
    
        r5.zzt(r10, r20, r33.zzz, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0258, code lost:
    
        if (r33.zzn.isEmpty() != false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x025a, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzaie) r33.zzn.removeFirst();
        r33.zzu -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x026d, code lost:
    
        if (r1.zzb == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x026f, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0270, code lost:
    
        r5 = r33.zzE;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0274, code lost:
    
        if (r8 >= r6) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0276, code lost:
    
        r5[r8].zzt(r3, 1, r1.zzc, r33.zzu, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x028e, code lost:
    
        if (r2.zzk() != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0290, code lost:
    
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0292, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0243, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0150, code lost:
    
        r13 = r33.zzg.zzI();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0166, code lost:
    
        if (r33.zzA >= r33.zzz) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0168, code lost:
    
        r12 = r33.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x016c, code lost:
    
        if (r12 != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x016e, code lost:
    
        ((com.google.android.gms.internal.ads.zzabu) r34).zzn(r13, r6, r14, r9);
        r33.zzg.zzG(r9);
        r12 = r33.zzg.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x017f, code lost:
    
        if (r12 <= 0) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0181, code lost:
    
        r33.zzB = r12 - 1;
        r33.zzf.zzG(r9);
        r5.zzr(r33.zzf, 4);
        r5.zzr(r33.zzg, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0198, code lost:
    
        if (r33.zzF.length <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x019a, code lost:
    
        r12 = r3.zzf.zzm;
        r17 = r13[4];
        r9 = com.google.android.gms.internal.ads.zzgg.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x01a8, code lost:
    
        if ("video/avc".equals(r12) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x01ac, code lost:
    
        if ((r17 & com.google.common.base.Ascii.US) == r4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x01af, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x01c0, code lost:
    
        r33.zzC = r9;
        r33.zzA += 5;
        r33.zzz += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0230, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x01b5, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x01bc, code lost:
    
        if (((r17 & 126) >> r8) != 39) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x01bf, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x01d4, code lost:
    
        throw com.google.android.gms.internal.ads.zzcf.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x01d7, code lost:
    
        if (r33.zzC == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x01d9, code lost:
    
        r33.zzh.zzD(r12);
        ((com.google.android.gms.internal.ads.zzabu) r34).zzn(r33.zzh.zzI(), 0, r33.zzB, false);
        r5.zzr(r33.zzh, r33.zzB);
        r4 = r33.zzB;
        r8 = r33.zzh;
        r8 = com.google.android.gms.internal.ads.zzgg.zzb(r8.zzI(), r8.zzd());
        r33.zzh.zzG("video/hevc".equals(r3.zzf.zzm) ? 1 : 0);
        r33.zzh.zzF(r8);
        com.google.android.gms.internal.ads.zzabr.zza(r10, r33.zzh, r33.zzF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0224, code lost:
    
        r33.zzA += r4;
        r33.zzB -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x021e, code lost:
    
        r4 = r5.zzf(r34, r12, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.google.android.gms.internal.ads.zzace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        boolean z;
        boolean z2;
        long zzs;
        long zzs2;
        String str;
        String str2;
        long zzt;
        long j;
        long zzu;
        long zzu2;
        while (true) {
            int i = this.zzo;
            int i2 = 1;
            ?? r9 = 0;
            if (i == 0) {
                if (this.zzr == 0) {
                    if (!zzacfVar.zzn(this.zzl.zzI(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzr = 8;
                    this.zzl.zzG(0);
                    this.zzq = this.zzl.zzt();
                    this.zzp = this.zzl.zzf();
                }
                long j2 = this.zzq;
                if (j2 == 1) {
                    ((zzabu) zzacfVar).zzn(this.zzl.zzI(), 8, 8, false);
                    this.zzr += 8;
                    this.zzq = this.zzl.zzu();
                } else if (j2 == 0) {
                    long zzd = zzacfVar.zzd();
                    if (zzd == -1) {
                        zzd = !this.zzm.isEmpty() ? ((zzahq) this.zzm.peek()).zza : -1L;
                    }
                    if (zzd != -1) {
                        this.zzq = (zzd - zzacfVar.zzf()) + this.zzr;
                    }
                }
                long j3 = this.zzq;
                long j4 = this.zzr;
                if (j3 < j4) {
                    throw zzcf.zzc("Atom size less than header length (unsupported).");
                }
                long zzf = zzacfVar.zzf() - j4;
                int i3 = this.zzp;
                if ((i3 == 1836019558 || i3 == 1835295092) && !this.zzG) {
                    this.zzD.zzO(new zzadd(this.zzw, zzf));
                    this.zzG = true;
                }
                if (this.zzp == 1836019558) {
                    int size = this.zze.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        zzair zzairVar = ((zzaif) this.zze.valueAt(i4)).zzb;
                        zzairVar.zzc = zzf;
                        zzairVar.zzb = zzf;
                    }
                }
                int i5 = this.zzp;
                if (i5 == 1835295092) {
                    this.zzy = null;
                    this.zzt = zzf + this.zzq;
                    this.zzo = 2;
                } else if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1836019558 || i5 == 1953653094 || i5 == 1836475768 || i5 == 1701082227) {
                    long zzf2 = (zzacfVar.zzf() + this.zzq) - 8;
                    this.zzm.push(new zzahq(i5, zzf2));
                    if (this.zzq == this.zzr) {
                        zzi(zzf2);
                    } else {
                        zzg();
                    }
                } else if (i5 == 1751411826 || i5 == 1835296868 || i5 == 1836476516 || i5 == 1936286840 || i5 == 1937011556 || i5 == 1937011827 || i5 == 1668576371 || i5 == 1937011555 || i5 == 1937011578 || i5 == 1937013298 || i5 == 1937007471 || i5 == 1668232756 || i5 == 1937011571 || i5 == 1952867444 || i5 == 1952868452 || i5 == 1953196132 || i5 == 1953654136 || i5 == 1953658222 || i5 == 1886614376 || i5 == 1935763834 || i5 == 1935763823 || i5 == 1936027235 || i5 == 1970628964 || i5 == 1935828848 || i5 == 1936158820 || i5 == 1701606260 || i5 == 1835362404 || i5 == 1701671783) {
                    if (this.zzr != 8) {
                        throw zzcf.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.zzq > 2147483647L) {
                        throw zzcf.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    zzfj zzfjVar = new zzfj((int) this.zzq);
                    System.arraycopy(this.zzl.zzI(), 0, zzfjVar.zzI(), 0, 8);
                    this.zzs = zzfjVar;
                    this.zzo = 1;
                } else {
                    if (this.zzq > 2147483647L) {
                        throw zzcf.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.zzs = null;
                    this.zzo = 1;
                }
            } else if (i != 1) {
                long j5 = Long.MAX_VALUE;
                if (i != 2) {
                    zzaif zzaifVar = this.zzy;
                    if (zzaifVar != null) {
                        break;
                    }
                    SparseArray sparseArray = this.zze;
                    int size2 = sparseArray.size();
                    long j6 = Long.MAX_VALUE;
                    zzaif zzaifVar2 = null;
                    for (int i6 = 0; i6 < size2; i6++) {
                        zzaif zzaifVar3 = (zzaif) sparseArray.valueAt(i6);
                        z = zzaifVar3.zzl;
                        if (z || zzaifVar3.zzf != zzaifVar3.zzd.zzb) {
                            z2 = zzaifVar3.zzl;
                            if (!z2 || zzaifVar3.zzh != zzaifVar3.zzb.zzd) {
                                long zzd2 = zzaifVar3.zzd();
                                if (zzd2 < j6) {
                                    zzaifVar2 = zzaifVar3;
                                    j6 = zzd2;
                                }
                            }
                        }
                    }
                    if (zzaifVar2 == null) {
                        int zzf3 = (int) (this.zzt - zzacfVar.zzf());
                        if (zzf3 < 0) {
                            throw zzcf.zza("Offset to end of mdat was negative.", null);
                        }
                        ((zzabu) zzacfVar).zzo(zzf3, false);
                        zzg();
                    } else {
                        int zzd3 = (int) (zzaifVar2.zzd() - zzacfVar.zzf());
                        if (zzd3 < 0) {
                            zzez.zzf("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            zzd3 = 0;
                        }
                        ((zzabu) zzacfVar).zzo(zzd3, false);
                        this.zzy = zzaifVar2;
                        zzaifVar = zzaifVar2;
                    }
                } else {
                    int size3 = this.zze.size();
                    zzaif zzaifVar4 = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        zzair zzairVar2 = ((zzaif) this.zze.valueAt(i7)).zzb;
                        if (zzairVar2.zzo) {
                            long j7 = zzairVar2.zzc;
                            if (j7 < j5) {
                                zzaifVar4 = (zzaif) this.zze.valueAt(i7);
                                j5 = j7;
                            }
                        }
                    }
                    if (zzaifVar4 == null) {
                        this.zzo = 3;
                    } else {
                        int zzf4 = (int) (j5 - zzacfVar.zzf());
                        if (zzf4 < 0) {
                            throw zzcf.zza("Offset to encryption data was negative.", null);
                        }
                        zzabu zzabuVar = (zzabu) zzacfVar;
                        zzabuVar.zzo(zzf4, false);
                        zzair zzairVar3 = zzaifVar4.zzb;
                        zzfj zzfjVar2 = zzairVar3.zzn;
                        zzabuVar.zzn(zzfjVar2.zzI(), 0, zzfjVar2.zzd(), false);
                        zzairVar3.zzn.zzG(0);
                        zzairVar3.zzo = false;
                    }
                }
            } else {
                int i8 = ((int) this.zzq) - this.zzr;
                zzfj zzfjVar3 = this.zzs;
                if (zzfjVar3 != null) {
                    ((zzabu) zzacfVar).zzn(zzfjVar3.zzI(), 8, i8, false);
                    zzahr zzahrVar = new zzahr(this.zzp, zzfjVar3);
                    long zzf5 = zzacfVar.zzf();
                    if (this.zzm.isEmpty()) {
                        int i9 = zzahrVar.zzd;
                        if (i9 == 1936286840) {
                            zzfj zzfjVar4 = zzahrVar.zza;
                            zzfjVar4.zzG(8);
                            int zze = zzahs.zze(zzfjVar4.zzf());
                            zzfjVar4.zzH(4);
                            long zzt2 = zzfjVar4.zzt();
                            if (zze == 0) {
                                zzu = zzfjVar4.zzt();
                                zzu2 = zzfjVar4.zzt();
                            } else {
                                zzu = zzfjVar4.zzu();
                                zzu2 = zzfjVar4.zzu();
                            }
                            long j8 = zzf5 + zzu2;
                            long zzs3 = zzfs.zzs(zzu, 1000000L, zzt2, RoundingMode.FLOOR);
                            zzfjVar4.zzH(2);
                            int zzp = zzfjVar4.zzp();
                            int[] iArr = new int[zzp];
                            long[] jArr = new long[zzp];
                            long[] jArr2 = new long[zzp];
                            long[] jArr3 = new long[zzp];
                            long j9 = zzs3;
                            int i10 = 0;
                            while (i10 < zzp) {
                                int zzf6 = zzfjVar4.zzf();
                                if ((zzf6 & Integer.MIN_VALUE) != 0) {
                                    throw zzcf.zza("Unhandled indirect reference", null);
                                }
                                long zzt3 = zzfjVar4.zzt();
                                iArr[i10] = zzf6 & Integer.MAX_VALUE;
                                jArr[i10] = j8;
                                jArr3[i10] = j9;
                                long j10 = zzu + zzt3;
                                long[] jArr4 = jArr3;
                                int i11 = i10;
                                long[] jArr5 = jArr2;
                                j9 = zzfs.zzs(j10, 1000000L, zzt2, RoundingMode.FLOOR);
                                jArr5[i11] = j9 - jArr4[i11];
                                zzfjVar4.zzH(4);
                                j8 += r3[i11];
                                i10 = i11 + 1;
                                iArr = iArr;
                                jArr2 = jArr5;
                                jArr3 = jArr4;
                                zzu = j10;
                                jArr = jArr;
                            }
                            Pair create = Pair.create(Long.valueOf(zzs3), new zzabs(iArr, jArr, jArr2, jArr3));
                            this.zzx = ((Long) create.first).longValue();
                            this.zzD.zzO((zzade) create.second);
                            this.zzG = true;
                        } else if (i9 == 1701671783) {
                            zzfj zzfjVar5 = zzahrVar.zza;
                            if (this.zzE.length != 0) {
                                zzfjVar5.zzG(8);
                                int zze2 = zzahs.zze(zzfjVar5.zzf());
                                if (zze2 == 0) {
                                    String zzw = zzfjVar5.zzw((char) 0);
                                    zzw.getClass();
                                    String zzw2 = zzfjVar5.zzw((char) 0);
                                    zzw2.getClass();
                                    long zzt4 = zzfjVar5.zzt();
                                    zzs = zzfs.zzs(zzfjVar5.zzt(), 1000000L, zzt4, RoundingMode.FLOOR);
                                    long j11 = this.zzx;
                                    long j12 = j11 != -9223372036854775807L ? j11 + zzs : -9223372036854775807L;
                                    zzs2 = zzfs.zzs(zzfjVar5.zzt(), 1000L, zzt4, RoundingMode.FLOOR);
                                    str = zzw;
                                    str2 = zzw2;
                                    zzt = zzfjVar5.zzt();
                                    j = j12;
                                } else if (zze2 != 1) {
                                    zzez.zzf("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + zze2);
                                } else {
                                    long zzt5 = zzfjVar5.zzt();
                                    long zzs4 = zzfs.zzs(zzfjVar5.zzu(), 1000000L, zzt5, RoundingMode.FLOOR);
                                    long zzs5 = zzfs.zzs(zzfjVar5.zzt(), 1000L, zzt5, RoundingMode.FLOOR);
                                    long zzt6 = zzfjVar5.zzt();
                                    String zzw3 = zzfjVar5.zzw((char) 0);
                                    zzw3.getClass();
                                    String zzw4 = zzfjVar5.zzw((char) 0);
                                    zzw4.getClass();
                                    zzs2 = zzs5;
                                    zzt = zzt6;
                                    str = zzw3;
                                    str2 = zzw4;
                                    j = zzs4;
                                    zzs = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzfjVar5.zza()];
                                zzfjVar5.zzC(bArr, 0, zzfjVar5.zza());
                                zzfj zzfjVar6 = new zzfj(this.zzk.zza(new zzafd(str, str2, zzs2, zzt, bArr)));
                                int zza2 = zzfjVar6.zza();
                                for (zzadk zzadkVar : this.zzE) {
                                    zzfjVar6.zzG(0);
                                    zzadkVar.zzr(zzfjVar6, zza2);
                                }
                                if (j == -9223372036854775807L) {
                                    this.zzn.addLast(new zzaie(zzs, true, zza2));
                                    this.zzu += zza2;
                                } else if (this.zzn.isEmpty()) {
                                    for (zzadk zzadkVar2 : this.zzE) {
                                        zzadkVar2.zzt(j, 1, zza2, 0, null);
                                    }
                                } else {
                                    this.zzn.addLast(new zzaie(j, false, zza2));
                                    this.zzu += zza2;
                                }
                            }
                        }
                    } else {
                        ((zzahq) this.zzm.peek()).zzd(zzahrVar);
                    }
                } else {
                    ((zzabu) zzacfVar).zzo(i8, false);
                }
                zzi(zzacfVar.zzf());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzD = zzachVar;
        zzg();
        zzadk[] zzadkVarArr = new zzadk[2];
        this.zzE = zzadkVarArr;
        int i = 0;
        zzadk[] zzadkVarArr2 = (zzadk[]) zzfs.zzK(zzadkVarArr, 0);
        this.zzE = zzadkVarArr2;
        for (zzadk zzadkVar : zzadkVarArr2) {
            zzadkVar.zzl(zzc);
        }
        this.zzF = new zzadk[this.zzd.size()];
        int i2 = 100;
        while (i < this.zzF.length) {
            int i3 = i2 + 1;
            zzadk zzw = this.zzD.zzw(i2, 3);
            zzw.zzl((zzam) this.zzd.get(i));
            this.zzF[i] = zzw;
            i++;
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        int size = this.zze.size();
        for (int i = 0; i < size; i++) {
            ((zzaif) this.zze.valueAt(i)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j2;
        this.zzm.clear();
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        return zzaio.zza(zzacfVar);
    }

    public zzaig(int i, zzfq zzfqVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzafe();
        this.zzl = new zzfj(16);
        this.zzf = new zzfj(zzgg.zza);
        this.zzg = new zzfj(5);
        this.zzh = new zzfj();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzfj(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzach.zza;
        this.zzE = new zzadk[0];
        this.zzF = new zzadk[0];
    }
}

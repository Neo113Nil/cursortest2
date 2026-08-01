package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzalf implements zzakx {
    final /* synthetic */ zzalg zza;
    private final zzfi zzb = new zzfi(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzalf(zzalg zzalgVar, int i) {
        this.zza = zzalgVar;
        this.zze = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0111, code lost:
    
        if (r28.zzl() == 21) goto L25;
     */
    @Override // com.google.android.gms.internal.ads.zzakx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfj zzfjVar) {
        List list;
        SparseArray sparseArray;
        int i;
        zzach zzachVar;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        zzfq zzfqVar;
        int i2;
        zzach zzachVar2;
        SparseArray sparseArray2;
        zzfq zzfqVar2;
        int i3;
        int i4;
        SparseBooleanArray sparseBooleanArray3;
        zzalj zzaljVar;
        zzfq zzfqVar3;
        int i5;
        int i6;
        int i7;
        if (zzfjVar.zzl() != 2) {
            return;
        }
        list = this.zza.zzb;
        zzfq zzfqVar4 = (zzfq) list.get(0);
        if ((zzfjVar.zzl() & 128) != 0) {
            zzfjVar.zzH(1);
            int zzp = zzfjVar.zzp();
            int i8 = 3;
            zzfjVar.zzH(3);
            zzfjVar.zzB(this.zzb, 2);
            this.zzb.zzl(3);
            int i9 = 13;
            this.zza.zzq = this.zzb.zzd(13);
            zzfjVar.zzB(this.zzb, 2);
            int i10 = 4;
            this.zzb.zzl(4);
            int i11 = 12;
            zzfjVar.zzH(this.zzb.zzd(12));
            this.zzc.clear();
            this.zzd.clear();
            int zza = zzfjVar.zza();
            while (zza > 0) {
                int i12 = 5;
                zzfjVar.zzB(this.zzb, 5);
                zzfi zzfiVar = this.zzb;
                int zzd = zzfiVar.zzd(8);
                zzfiVar.zzl(i8);
                int zzd2 = this.zzb.zzd(i9);
                this.zzb.zzl(i10);
                int zzd3 = this.zzb.zzd(i11);
                int zzc = zzfjVar.zzc();
                int i13 = zzc + zzd3;
                ArrayList arrayList = null;
                String str = null;
                int i14 = -1;
                while (true) {
                    if (zzfjVar.zzc() >= i13) {
                        zzfqVar2 = zzfqVar4;
                        i3 = zzp;
                        i4 = i10;
                        break;
                    }
                    int zzl = zzfjVar.zzl();
                    int zzc2 = zzfjVar.zzc() + zzfjVar.zzl();
                    if (zzc2 > i13) {
                        zzfqVar2 = zzfqVar4;
                        i3 = zzp;
                        i4 = 4;
                        break;
                    }
                    if (zzl == i12) {
                        long zzt = zzfjVar.zzt();
                        if (zzt != 1094921523) {
                            if (zzt != 1161904947) {
                                if (zzt != 1094921524) {
                                    if (zzt == 1212503619) {
                                        i7 = 36;
                                        zzfqVar3 = zzfqVar4;
                                        i14 = i7;
                                        i5 = zzp;
                                    }
                                    zzfqVar3 = zzfqVar4;
                                    i5 = zzp;
                                }
                                zzfqVar3 = zzfqVar4;
                                i5 = zzp;
                                i14 = 172;
                            }
                            zzfqVar3 = zzfqVar4;
                            i5 = zzp;
                            i14 = 135;
                        }
                        zzfqVar3 = zzfqVar4;
                        i14 = 129;
                        i6 = 4;
                        i5 = zzp;
                        zzfjVar.zzH(zzc2 - zzfjVar.zzc());
                        i10 = i6;
                        zzfqVar4 = zzfqVar3;
                        zzp = i5;
                        i8 = 3;
                        i12 = 5;
                    } else {
                        if (zzl != 106) {
                            if (zzl != 122) {
                                if (zzl != 127) {
                                    if (zzl == 123) {
                                        i7 = Opcodes.L2D;
                                        zzfqVar3 = zzfqVar4;
                                        i14 = i7;
                                        i5 = zzp;
                                    } else if (zzl == 10) {
                                        zzfqVar3 = zzfqVar4;
                                        str = zzfjVar.zzy(i8, zzftl.zzc).trim();
                                        i5 = zzp;
                                    } else {
                                        if (zzl == 89) {
                                            ArrayList arrayList2 = new ArrayList();
                                            while (zzfjVar.zzc() < zzc2) {
                                                String trim = zzfjVar.zzy(i8, zzftl.zzc).trim();
                                                int zzl2 = zzfjVar.zzl();
                                                zzfq zzfqVar5 = zzfqVar4;
                                                byte[] bArr = new byte[4];
                                                zzfjVar.zzC(bArr, 0, 4);
                                                arrayList2.add(new zzalh(trim, zzl2, bArr));
                                                zzfqVar4 = zzfqVar5;
                                                zzp = zzp;
                                                i8 = 3;
                                            }
                                            zzfqVar3 = zzfqVar4;
                                            i5 = zzp;
                                            i6 = 4;
                                            arrayList = arrayList2;
                                            i14 = 89;
                                        } else {
                                            zzfqVar3 = zzfqVar4;
                                            i5 = zzp;
                                            i6 = 4;
                                            if (zzl == 111) {
                                                i14 = 257;
                                            }
                                        }
                                        zzfjVar.zzH(zzc2 - zzfjVar.zzc());
                                        i10 = i6;
                                        zzfqVar4 = zzfqVar3;
                                        zzp = i5;
                                        i8 = 3;
                                        i12 = 5;
                                    }
                                }
                            }
                            zzfqVar3 = zzfqVar4;
                            i5 = zzp;
                            i14 = 135;
                        }
                        zzfqVar3 = zzfqVar4;
                        i14 = 129;
                        i6 = 4;
                        i5 = zzp;
                        zzfjVar.zzH(zzc2 - zzfjVar.zzc());
                        i10 = i6;
                        zzfqVar4 = zzfqVar3;
                        zzp = i5;
                        i8 = 3;
                        i12 = 5;
                    }
                    i6 = 4;
                    zzfjVar.zzH(zzc2 - zzfjVar.zzc());
                    i10 = i6;
                    zzfqVar4 = zzfqVar3;
                    zzp = i5;
                    i8 = 3;
                    i12 = 5;
                }
                zzfjVar.zzG(i13);
                zzali zzaliVar = new zzali(i14, str, arrayList, Arrays.copyOfRange(zzfjVar.zzI(), zzc, i13));
                if (zzd == 6 || zzd == 5) {
                    zzd = zzaliVar.zza;
                }
                zza -= zzd3 + 5;
                sparseBooleanArray3 = this.zza.zzg;
                if (!sparseBooleanArray3.get(zzd2)) {
                    zzaljVar = this.zza.zze;
                    zzall zza2 = zzaljVar.zza(zzd, zzaliVar);
                    this.zzd.put(zzd2, zzd2);
                    this.zzc.put(zzd2, zza2);
                }
                i10 = i4;
                zzfqVar4 = zzfqVar2;
                zzp = i3;
                i8 = 3;
                i11 = 12;
                i9 = 13;
            }
            zzfq zzfqVar6 = zzfqVar4;
            int i15 = zzp;
            int size = this.zzd.size();
            int i16 = 0;
            while (i16 < size) {
                SparseIntArray sparseIntArray = this.zzd;
                zzalg zzalgVar = this.zza;
                int keyAt = sparseIntArray.keyAt(i16);
                int valueAt = sparseIntArray.valueAt(i16);
                sparseBooleanArray = zzalgVar.zzg;
                sparseBooleanArray.put(keyAt, true);
                sparseBooleanArray2 = this.zza.zzh;
                sparseBooleanArray2.put(valueAt, true);
                zzall zzallVar = (zzall) this.zzc.valueAt(i16);
                if (zzallVar != null) {
                    zzachVar2 = this.zza.zzk;
                    i2 = i15;
                    zzalk zzalkVar = new zzalk(i2, keyAt, 8192);
                    zzfqVar = zzfqVar6;
                    zzallVar.zzb(zzfqVar, zzachVar2, zzalkVar);
                    sparseArray2 = this.zza.zzf;
                    sparseArray2.put(valueAt, zzallVar);
                } else {
                    zzfqVar = zzfqVar6;
                    i2 = i15;
                }
                i16++;
                zzfqVar6 = zzfqVar;
                i15 = i2;
            }
            zzalg zzalgVar2 = this.zza;
            int i17 = this.zze;
            sparseArray = zzalgVar2.zzf;
            sparseArray.remove(i17);
            this.zza.zzl = 0;
            zzalg zzalgVar3 = this.zza;
            i = zzalgVar3.zzl;
            if (i == 0) {
                zzachVar = zzalgVar3.zzk;
                zzachVar.zzD();
                this.zza.zzm = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakx
    public final void zzb(zzfq zzfqVar, zzach zzachVar, zzalk zzalkVar) {
    }
}

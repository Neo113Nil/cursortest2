package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzyb extends zzye {
    private zzya zza;

    protected abstract Pair zzb(zzya zzyaVar, int[][][] iArr, int[] iArr2, zzuk zzukVar, zzda zzdaVar) throws zzit;

    @Override // com.google.android.gms.internal.ads.zzye
    public final zzyf zzo(zzmb[] zzmbVarArr, zzwl zzwlVar, zzuk zzukVar, zzda zzdaVar) throws zzit {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzdc[][] zzdcVarArr = new zzdc[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzwlVar.zzc;
            zzdcVarArr[i] = new zzdc[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzmbVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzwlVar.zzc) {
            zzdc zzb = zzwlVar.zzb(i5);
            int i6 = zzb.zzd;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                zzmb zzmbVar = zzmbVarArr[i8];
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int i12 = zzb.zzb;
                    if (i10 > 0) {
                        break;
                    }
                    i11 = Math.max(i11, zzmbVar.zzW(zzb.zzb(i10)) & 7);
                    i10++;
                }
                boolean z3 = iArr2[i8] == 0;
                if (i11 > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = i11;
                } else if (i11 == i9 && i6 == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = i11;
                    z2 = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                int i13 = zzb.zzb;
                iArr = new int[1];
            } else {
                zzmb zzmbVar2 = zzmbVarArr[i7];
                int i14 = zzb.zzb;
                int[] iArr5 = new int[1];
                int i15 = 0;
                while (true) {
                    int i16 = zzb.zzb;
                    if (i15 > 0) {
                        break;
                    }
                    iArr5[i15] = zzmbVar2.zzW(zzb.zzb(i15));
                    i15++;
                }
                iArr = iArr5;
            }
            int i17 = iArr2[i7];
            zzdcVarArr[i7][i17] = zzb;
            iArr3[i7][i17] = iArr;
            iArr2[i7] = i17 + 1;
            i5++;
            i3 = 2;
        }
        zzwl[] zzwlVarArr = new zzwl[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i18 = 0;
        while (i18 < i3) {
            int i19 = iArr2[i18];
            zzwlVarArr[i18] = new zzwl((zzdc[]) zzfs.zzK(zzdcVarArr[i18], i19));
            iArr3[i18] = (int[][]) zzfs.zzK(iArr3[i18], i19);
            strArr[i18] = zzmbVarArr[i18].zzS();
            iArr6[i18] = zzmbVarArr[i18].zzb();
            i18++;
            i3 = 2;
        }
        int i20 = i3;
        zzya zzyaVar = new zzya(strArr, iArr6, zzwlVarArr, iArr4, iArr3, new zzwl((zzdc[]) zzfs.zzK(zzdcVarArr[i20], iArr2[i20])));
        Pair zzb2 = zzb(zzyaVar, iArr3, iArr4, zzukVar, zzdaVar);
        zzyc[] zzycVarArr = (zzyc[]) zzb2.second;
        List[] listArr = new List[zzycVarArr.length];
        for (int i21 = 0; i21 < zzycVarArr.length; i21++) {
            zzyc zzycVar = zzycVarArr[i21];
            listArr[i21] = zzycVar != null ? zzfwu.zzm(zzycVar) : zzfwu.zzl();
        }
        zzfwr zzfwrVar = new zzfwr();
        for (int i22 = 0; i22 < 2; i22++) {
            zzwl zzd = zzyaVar.zzd(i22);
            List list = listArr[i22];
            for (int i23 = 0; i23 < zzd.zzc; i23++) {
                zzdc zzb3 = zzd.zzb(i23);
                boolean z4 = zzyaVar.zza(i22, i23, false) != 0;
                int i24 = zzb3.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                int i25 = 0;
                while (true) {
                    int i26 = zzb3.zzb;
                    if (i25 <= 0) {
                        iArr7[i25] = zzyaVar.zzb(i22, i23, i25) & 7;
                        int i27 = 0;
                        while (true) {
                            if (i27 >= list.size()) {
                                z = false;
                                break;
                            }
                            zzyc zzycVar2 = (zzyc) list.get(i27);
                            if (zzycVar2.zze().equals(zzb3) && zzycVar2.zzb(i25) != -1) {
                                z = true;
                                break;
                            }
                            i27++;
                        }
                        zArr[i25] = z;
                        i25++;
                    }
                }
                zzfwrVar.zzf(new zzdm(zzb3, z4, iArr7, zArr));
            }
        }
        zzwl zze = zzyaVar.zze();
        for (int i28 = 0; i28 < zze.zzc; i28++) {
            zzdc zzb4 = zze.zzb(i28);
            int i29 = zzb4.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            int i30 = zzb4.zzb;
            zzfwrVar.zzf(new zzdm(zzb4, false, iArr8, new boolean[1]));
        }
        return new zzyf((zzmc[]) zzb2.first, (zzxy[]) zzb2.second, new zzdn(zzfwrVar.zzi()), zzyaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzp(Object obj) {
        this.zza = (zzya) obj;
    }
}

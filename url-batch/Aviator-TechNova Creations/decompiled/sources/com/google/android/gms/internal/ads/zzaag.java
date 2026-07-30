package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzaag extends zzaaj {
    protected abstract Pair zzh(zzaaf zzaafVar, int[][][] iArr, int[] iArr2, zzwk zzwkVar, zzbf zzbfVar) throws zziw;

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zzp(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final zzaak zzq(zzmn[] zzmnVarArr, zzyn zzynVar, zzwk zzwkVar, zzbf zzbfVar) throws zziw {
        List[] listArr;
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzynVar.zzb;
            zzbgVarArr[i] = new zzbg[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzmnVarArr[i4].zzu();
        }
        int i5 = 0;
        while (i5 < zzynVar.zzb) {
            zzbg zza = zzynVar.zza(i5);
            int i6 = zza.zzc;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                zzmn zzmnVar = zzmnVarArr[i8];
                int i10 = 0;
                for (int i11 = 0; i11 < zza.zza; i11++) {
                    i10 = Math.max(i10, zzmnVar.zzab(zza.zza(i11)) & 7);
                }
                boolean z3 = iArr2[i8] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = i10;
                    z2 = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[zza.zza];
            } else {
                zzmn zzmnVar2 = zzmnVarArr[i7];
                int i12 = zza.zza;
                int[] iArr5 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr5[i13] = zzmnVar2.zzab(zza.zza(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i7];
            zzbgVarArr[i7][i14] = zza;
            iArr3[i7][i14] = iArr;
            iArr2[i7] = i14 + 1;
            i5++;
            i3 = 2;
        }
        zzyn[] zzynVarArr = new zzyn[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i15 = 0;
        while (i15 < i3) {
            int i16 = iArr2[i15];
            zzynVarArr[i15] = new zzyn((zzbg[]) zzfj.zzb(zzbgVarArr[i15], i16));
            iArr3[i15] = (int[][]) zzfj.zzb(iArr3[i15], i16);
            strArr[i15] = zzmnVarArr[i15].zzS();
            iArr6[i15] = zzmnVarArr[i15].zza();
            i15++;
            i3 = 2;
        }
        int i17 = i3;
        zzaaf zzaafVar = new zzaaf(strArr, iArr6, zzynVarArr, iArr4, iArr3, new zzyn((zzbg[]) zzfj.zzb(zzbgVarArr[i17], iArr2[i17])));
        Pair zzh = zzh(zzaafVar, iArr3, iArr4, zzwkVar, zzbfVar);
        zzaah[] zzaahVarArr = (zzaah[]) zzh.second;
        List[] listArr2 = new List[zzaahVarArr.length];
        for (int i18 = 0; i18 < zzaahVarArr.length; i18++) {
            zzaah zzaahVar = zzaahVarArr[i18];
            listArr2[i18] = zzaahVar != null ? zzguf.zzj(zzaahVar) : zzguf.zzi();
        }
        zzguc zzgucVar = new zzguc();
        for (int i19 = 0; i19 < 2; i19++) {
            zzyn zzb = zzaafVar.zzb(i19);
            List list = listArr2[i19];
            int i20 = 0;
            while (i20 < zzb.zzb) {
                zzbg zza2 = zzb.zza(i20);
                boolean z4 = zzaafVar.zzd(i19, i20, false) != 0;
                int i21 = zza2.zza;
                int[] iArr7 = new int[i21];
                boolean[] zArr = new boolean[i21];
                int i22 = 0;
                while (i22 < i21) {
                    iArr7[i22] = zzaafVar.zzc(i19, i20, i22) & 7;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= list.size()) {
                            listArr = listArr2;
                            z = false;
                            break;
                        }
                        zzaah zzaahVar2 = (zzaah) list.get(i23);
                        listArr = listArr2;
                        if (zzaahVar2.zza().equals(zza2) && zzaahVar2.zzg(i22) != -1) {
                            z = true;
                            break;
                        }
                        i23++;
                        listArr2 = listArr;
                    }
                    zArr[i22] = z;
                    i22++;
                    listArr2 = listArr;
                }
                zzgucVar.zzf(new zzbm(zza2, z4, iArr7, zArr));
                i20++;
                listArr2 = listArr2;
            }
        }
        zzyn zze = zzaafVar.zze();
        for (int i24 = 0; i24 < zze.zzb; i24++) {
            zzbg zza3 = zze.zza(i24);
            int i25 = zza3.zza;
            int[] iArr8 = new int[i25];
            Arrays.fill(iArr8, 0);
            zzgucVar.zzf(new zzbm(zza3, false, iArr8, new boolean[i25]));
        }
        return new zzaak((zzmo[]) zzh.first, (zzaac[]) zzh.second, new zzbn(zzgucVar.zzi()), zzaafVar);
    }
}

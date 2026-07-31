package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class kl extends ol {

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<Map<al, jl>> f7533b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f7534c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    private il f7535d;

    @Override // com.google.android.gms.internal.ads.ol
    public final pl a(df[] dfVarArr, al alVar) {
        int[] iArr;
        int[] iArr2 = new int[3];
        zk[][] zkVarArr = new zk[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i7 = 0; i7 < 3; i7++) {
            int i8 = alVar.f2855a;
            zkVarArr[i7] = new zk[i8];
            iArr3[i7] = new int[i8][];
        }
        int i9 = 2;
        int[] iArr4 = new int[2];
        for (int i10 = 0; i10 < 2; i10++) {
            dfVarArr[i10].b();
            iArr4[i10] = 4;
        }
        int i11 = 0;
        while (i11 < alVar.f2855a) {
            zk b7 = alVar.b(i11);
            int i12 = 0;
            int i13 = 0;
            int i14 = 2;
            while (true) {
                if (i12 >= i9) {
                    i12 = i14;
                    break;
                }
                df dfVar = dfVarArr[i12];
                int i15 = 0;
                while (true) {
                    int i16 = b7.f15166a;
                    if (i15 <= 0) {
                        int g7 = dfVar.g(b7.b(i15)) & 3;
                        if (g7 > i13) {
                            if (g7 == 3) {
                                break;
                            }
                            i14 = i12;
                            i13 = g7;
                        }
                        i15++;
                    }
                }
                i12++;
                i9 = 2;
            }
            if (i12 == 2) {
                int i17 = b7.f15166a;
                iArr = new int[1];
            } else {
                df dfVar2 = dfVarArr[i12];
                int i18 = b7.f15166a;
                int[] iArr5 = new int[1];
                for (int i19 = 0; i19 <= 0; i19++) {
                    iArr5[i19] = dfVar2.g(b7.b(i19));
                }
                iArr = iArr5;
            }
            int i20 = iArr2[i12];
            zkVarArr[i12][i20] = b7;
            iArr3[i12][i20] = iArr;
            iArr2[i12] = i20 + 1;
            i11++;
            i9 = 2;
        }
        al[] alVarArr = new al[2];
        int[] iArr6 = new int[2];
        int i21 = 0;
        for (int i22 = 2; i21 < i22; i22 = 2) {
            int i23 = iArr2[i21];
            alVarArr[i21] = new al((zk[]) Arrays.copyOf(zkVarArr[i21], i23));
            iArr3[i21] = (int[][]) Arrays.copyOf(iArr3[i21], i23);
            iArr6[i21] = dfVarArr[i21].c();
            i21++;
        }
        al alVar2 = new al((zk[]) Arrays.copyOf(zkVarArr[2], iArr2[2]));
        el[] e7 = e(dfVarArr, alVarArr, iArr3);
        int i24 = 0;
        for (int i25 = 2; i24 < i25; i25 = 2) {
            if (this.f7534c.get(i24)) {
                e7[i24] = null;
            } else {
                al alVar3 = alVarArr[i24];
                Map<al, jl> map = this.f7533b.get(i24);
                if ((map == null ? null : map.get(alVar3)) != null) {
                    throw null;
                }
            }
            i24++;
        }
        il ilVar = new il(iArr6, alVarArr, iArr4, iArr3, alVar2);
        ef[] efVarArr = new ef[2];
        for (int i26 = 0; i26 < 2; i26++) {
            efVarArr[i26] = e7[i26] != null ? ef.f4589b : null;
        }
        return new pl(alVar, new ml(e7, null), ilVar, efVarArr);
    }

    @Override // com.google.android.gms.internal.ads.ol
    public final void b(Object obj) {
        this.f7535d = (il) obj;
    }

    protected abstract el[] e(df[] dfVarArr, al[] alVarArr, int[][][] iArr);

    public final void f(int i7, boolean z6) {
        if (this.f7534c.get(i7) == z6) {
            return;
        }
        this.f7534c.put(i7, z6);
        d();
    }
}

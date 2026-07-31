package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class gl extends kl {

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference<fl> f5677e = new AtomicReference<>(new fl());

    public gl(ll llVar) {
    }

    protected static boolean g(int i7, boolean z6) {
        int i8 = i7 & 3;
        return i8 == 3 || (z6 && i8 == 2);
    }

    private static int h(int i7, int i8) {
        if (i7 == -1) {
            return i8 != -1 ? -1 : 0;
        }
        if (i8 == -1) {
            return 1;
        }
        return i7 - i8;
    }

    @Override // com.google.android.gms.internal.ads.kl
    protected final el[] e(df[] dfVarArr, al[] alVarArr, int[][][] iArr) {
        zk zkVar;
        int[] iArr2;
        ArrayList arrayList;
        boolean z6;
        boolean z7;
        int i7 = 2;
        el[] elVarArr = new el[2];
        fl flVar = this.f5677e.get();
        int i8 = 0;
        boolean z8 = false;
        while (true) {
            int i9 = -1;
            int i10 = 1;
            if (i8 >= i7) {
                break;
            }
            if (dfVarArr[i8].c() == i7) {
                if (!z8) {
                    df dfVar = dfVarArr[i8];
                    al alVar = alVarArr[i8];
                    int[][] iArr3 = iArr[i8];
                    int i11 = flVar.f5129d;
                    int i12 = -1;
                    int i13 = 0;
                    zk zkVar2 = null;
                    int i14 = 0;
                    int i15 = 0;
                    while (i13 < alVar.f2855a) {
                        zk b7 = alVar.b(i13);
                        int i16 = b7.f15166a;
                        ArrayList arrayList2 = new ArrayList(i10);
                        for (int i17 = 0; i17 <= 0; i17++) {
                            arrayList2.add(Integer.valueOf(i17));
                        }
                        int[] iArr4 = iArr3[i13];
                        int i18 = 0;
                        while (i18 <= 0) {
                            al alVar2 = alVar;
                            if (g(iArr4[i18], true)) {
                                xe b8 = b7.b(i18);
                                if (arrayList2.contains(Integer.valueOf(i18))) {
                                    int i19 = b8.f14169o;
                                    zkVar = b7;
                                    z6 = true;
                                    z7 = true;
                                } else {
                                    zkVar = b7;
                                    z6 = true;
                                    z7 = false;
                                }
                                arrayList = arrayList2;
                                int i20 = z6 != z7 ? 1 : 2;
                                iArr2 = iArr4;
                                boolean g7 = g(iArr4[i18], false);
                                if (g7) {
                                    i20 += 1000;
                                }
                                boolean z9 = i20 > i15;
                                if (i20 == i15) {
                                    int h7 = b8.a() != i12 ? h(b8.a(), i12) : h(b8.f14161g, i9);
                                    z9 = !(g7 && z7) ? h7 >= 0 : h7 <= 0;
                                }
                                if (z9) {
                                    i9 = b8.f14161g;
                                    i12 = b8.a();
                                    i15 = i20;
                                    i14 = i18;
                                    zkVar2 = zkVar;
                                }
                            } else {
                                zkVar = b7;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i18++;
                            alVar = alVar2;
                            b7 = zkVar;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        i13++;
                        i10 = 1;
                    }
                    hl hlVar = zkVar2 == null ? null : new hl(zkVar2, i14, 0, null);
                    elVarArr[i8] = hlVar;
                    z8 = hlVar != null;
                }
                int i21 = alVarArr[i8].f2855a;
            }
            i8++;
            i7 = 2;
        }
        int i22 = 0;
        boolean z10 = false;
        while (i22 < i7) {
            if (dfVarArr[i22].c() == 1 && !z10) {
                al alVar3 = alVarArr[i22];
                int[][] iArr5 = iArr[i22];
                String str = flVar.f5126a;
                int i23 = 0;
                int i24 = 0;
                int i25 = -1;
                int i26 = -1;
                while (i23 < alVar3.f2855a) {
                    zk b9 = alVar3.b(i23);
                    int[] iArr6 = iArr5[i23];
                    int i27 = i26;
                    int i28 = i25;
                    int i29 = i24;
                    int i30 = 0;
                    while (true) {
                        int i31 = b9.f15166a;
                        if (i30 <= 0) {
                            if (g(iArr6[i30], true)) {
                                xe b10 = b9.b(i30);
                                int i32 = iArr6[i30];
                                int i33 = 1 != (b10.C & 1) ? 1 : 2;
                                if (g(i32, false)) {
                                    i33 += 1000;
                                }
                                if (i33 > i29) {
                                    i28 = i23;
                                    i27 = i30;
                                    i29 = i33;
                                }
                            }
                            i30++;
                        }
                    }
                    i23++;
                    i24 = i29;
                    i25 = i28;
                    i26 = i27;
                }
                hl hlVar2 = i25 == -1 ? null : new hl(alVar3.b(i25), i26, 0, null);
                elVarArr[i22] = hlVar2;
                z10 = hlVar2 != null;
            }
            i22++;
            i7 = 2;
        }
        return elVarArr;
    }
}

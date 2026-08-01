package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ad;
import defpackage.bd;
import defpackage.ea0;
import defpackage.kj;
import defpackage.lc;
import defpackage.lj;
import defpackage.om;
import defpackage.qc;
import defpackage.qx;
import defpackage.v7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class Flow extends ea0 {
    public final lj o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new int[32];
        this.l = new HashMap();
        this.h = context;
        super.g(attributeSet);
        lj ljVar = new lj();
        ljVar.s0 = 0;
        ljVar.t0 = 0;
        ljVar.u0 = 0;
        ljVar.v0 = 0;
        ljVar.w0 = 0;
        ljVar.x0 = 0;
        ljVar.y0 = false;
        ljVar.z0 = 0;
        ljVar.A0 = 0;
        ljVar.B0 = new v7();
        ljVar.C0 = null;
        ljVar.D0 = -1;
        ljVar.E0 = -1;
        ljVar.F0 = -1;
        ljVar.G0 = -1;
        ljVar.H0 = -1;
        ljVar.I0 = -1;
        ljVar.J0 = 0.5f;
        ljVar.K0 = 0.5f;
        ljVar.L0 = 0.5f;
        ljVar.M0 = 0.5f;
        ljVar.N0 = 0.5f;
        ljVar.O0 = 0.5f;
        ljVar.P0 = 0;
        ljVar.Q0 = 0;
        ljVar.R0 = 2;
        ljVar.S0 = 2;
        ljVar.T0 = 0;
        ljVar.U0 = -1;
        ljVar.V0 = 0;
        ljVar.W0 = new ArrayList();
        ljVar.X0 = null;
        ljVar.Y0 = null;
        ljVar.Z0 = null;
        ljVar.b1 = 0;
        this.o = ljVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, qx.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.o.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    lj ljVar2 = this.o;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    ljVar2.s0 = dimensionPixelSize;
                    ljVar2.t0 = dimensionPixelSize;
                    ljVar2.u0 = dimensionPixelSize;
                    ljVar2.v0 = dimensionPixelSize;
                } else if (index == 18) {
                    lj ljVar3 = this.o;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    ljVar3.u0 = dimensionPixelSize2;
                    ljVar3.w0 = dimensionPixelSize2;
                    ljVar3.x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.o.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.o.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.o.s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.o.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.o.t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.o.T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.o.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.o.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.o.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.o.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.o.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.o.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.o.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.o.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.o.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.o.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.o.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.o.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.o.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.o.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.o.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.o.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.o.U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.i = this.o;
        i();
    }

    @Override // defpackage.nc
    public final void h(ad adVar, boolean z) {
        lj ljVar = this.o;
        int i = ljVar.u0;
        if (i > 0 || ljVar.v0 > 0) {
            if (z) {
                ljVar.w0 = ljVar.v0;
                ljVar.x0 = i;
            } else {
                ljVar.w0 = i;
                ljVar.x0 = ljVar.v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0732  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v46 */
    @Override // defpackage.ea0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(lj ljVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        ad[] adVarArr;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        int i10;
        kj kjVar;
        char c;
        ?? r12;
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj;
        ad adVar;
        boolean z2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        lc lcVar;
        lc lcVar2;
        lc lcVar3;
        ArrayList arrayList;
        int i20;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (ljVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        int[] iArr2 = ljVar.p0;
        lc lcVar4 = ljVar.J;
        lc lcVar5 = ljVar.I;
        lc lcVar6 = ljVar.K;
        lc lcVar7 = ljVar.L;
        ArrayList arrayList2 = ljVar.W0;
        if (ljVar.r0 > 0) {
            v7 v7Var = ljVar.B0;
            ad adVar2 = ljVar.T;
            qc qcVar = adVar2 != null ? ((bd) adVar2).u0 : null;
            if (qcVar == null) {
                ljVar.z0 = 0;
                ljVar.A0 = 0;
                ljVar.y0 = false;
                setMeasuredDimension(ljVar.z0, ljVar.A0);
            }
            int i21 = 0;
            while (i21 < ljVar.r0) {
                ad adVar3 = ljVar.q0[i21];
                if (adVar3 == null) {
                    lcVar = lcVar5;
                } else {
                    lcVar = lcVar5;
                    if (!(adVar3 instanceof om)) {
                        lcVar2 = lcVar6;
                        int j = adVar3.j(0);
                        lcVar3 = lcVar7;
                        int j2 = adVar3.j(1);
                        arrayList = arrayList2;
                        if (j == 3) {
                            i20 = i21;
                            if (adVar3.r != 1 && j2 == 3 && adVar3.s != 1) {
                                i21 = i20 + 1;
                                lcVar5 = lcVar;
                                lcVar6 = lcVar2;
                                lcVar7 = lcVar3;
                                arrayList2 = arrayList;
                            }
                        } else {
                            i20 = i21;
                        }
                        if (j == 3) {
                            j = 2;
                        }
                        if (j2 == 3) {
                            j2 = 2;
                        }
                        v7Var.a = j;
                        v7Var.b = j2;
                        v7Var.c = adVar3.q();
                        v7Var.d = adVar3.k();
                        qcVar.b(adVar3, v7Var);
                        adVar3.O(v7Var.e);
                        adVar3.L(v7Var.f);
                        adVar3.I(v7Var.g);
                        i21 = i20 + 1;
                        lcVar5 = lcVar;
                        lcVar6 = lcVar2;
                        lcVar7 = lcVar3;
                        arrayList2 = arrayList;
                    }
                }
                lcVar2 = lcVar6;
                lcVar3 = lcVar7;
                arrayList = arrayList2;
                i20 = i21;
                i21 = i20 + 1;
                lcVar5 = lcVar;
                lcVar6 = lcVar2;
                lcVar7 = lcVar3;
                arrayList2 = arrayList;
            }
        }
        lc lcVar8 = lcVar5;
        lc lcVar9 = lcVar6;
        lc lcVar10 = lcVar7;
        ArrayList arrayList3 = arrayList2;
        int i22 = ljVar.w0;
        int i23 = ljVar.x0;
        int i24 = ljVar.s0;
        int i25 = ljVar.t0;
        int[] iArr3 = new int[2];
        int i26 = (size - i22) - i23;
        int i27 = ljVar.V0;
        if (i27 == 1) {
            i26 = (size2 - i24) - i25;
        }
        int i28 = i26;
        int i29 = ljVar.D0;
        if (i27 == 0) {
            if (i29 == -1) {
                ljVar.D0 = 0;
            }
            if (ljVar.E0 == -1) {
                ljVar.E0 = 0;
            }
        } else {
            if (i29 == -1) {
                ljVar.D0 = 0;
            }
            if (ljVar.E0 == -1) {
                ljVar.E0 = 0;
            }
        }
        ad[] adVarArr2 = ljVar.q0;
        int i30 = 0;
        int i31 = 0;
        while (true) {
            i3 = ljVar.r0;
            i4 = i24;
            if (i30 >= i3) {
                break;
            }
            if (ljVar.q0[i30].g0 == 8) {
                i31++;
            }
            i30++;
            i24 = i4;
        }
        if (i31 > 0) {
            adVarArr = new ad[i3 - i31];
            int i32 = 0;
            int i33 = 0;
            while (i32 < ljVar.r0) {
                ad adVar4 = ljVar.q0[i32];
                ad[] adVarArr3 = adVarArr;
                if (adVar4.g0 != 8) {
                    adVarArr3[i33] = adVar4;
                    i33++;
                }
                i32++;
                adVarArr = adVarArr3;
            }
            i5 = i33;
        } else {
            i5 = i3;
            adVarArr = adVarArr2;
        }
        ljVar.a1 = adVarArr;
        ljVar.b1 = i5;
        int i34 = ljVar.T0;
        if (i34 == 0) {
            ad[] adVarArr4 = adVarArr;
            int i35 = i5;
            i6 = i25;
            iArr = iArr3;
            i7 = size2;
            i8 = i22;
            i9 = i23;
            i10 = i4;
            int i36 = ljVar.V0;
            if (i35 != 0) {
                if (arrayList3.size() == 0) {
                    kjVar = new kj(ljVar, i36, ljVar.I, ljVar.J, ljVar.K, ljVar.L, i28);
                    arrayList3.add(kjVar);
                } else {
                    kj kjVar2 = (kj) arrayList3.get(0);
                    kjVar2.c = 0;
                    kjVar2.b = null;
                    kjVar2.l = 0;
                    kjVar2.m = 0;
                    kjVar2.n = 0;
                    kjVar2.o = 0;
                    kjVar2.p = 0;
                    kjVar2.f(i36, ljVar.I, ljVar.J, ljVar.K, ljVar.L, ljVar.w0, ljVar.s0, ljVar.x0, ljVar.t0, i28);
                    kjVar = kjVar2;
                }
                for (int i37 = 0; i37 < i35; i37++) {
                    kjVar.a(adVarArr4[i37]);
                }
                c = 0;
                iArr[0] = kjVar.d();
                r12 = 1;
                iArr[1] = kjVar.c();
                int i38 = iArr[c] + i8 + i9;
                int i39 = iArr[r12] + i10 + i6;
                if (mode != 1073741824) {
                }
                if (mode2 == 1073741824) {
                }
                ljVar.z0 = size;
                ljVar.A0 = r0;
                ljVar.O(size);
                ljVar.L(r0);
                ljVar.y0 = ljVar.r0 > 0 ? r12 : false;
                setMeasuredDimension(ljVar.z0, ljVar.A0);
            }
        } else {
            if (i34 != 1) {
                if (i34 == 2) {
                    ad[] adVarArr5 = adVarArr;
                    int i40 = i5;
                    i6 = i25;
                    iArr = iArr3;
                    i7 = size2;
                    i8 = i22;
                    i9 = i23;
                    i10 = i4;
                    int i41 = ljVar.V0;
                    int i42 = ljVar.U0;
                    if (i41 == 0) {
                        if (i42 <= 0) {
                            int i43 = 0;
                            i14 = 0;
                            for (int i44 = 0; i44 < i40; i44++) {
                                if (i44 > 0) {
                                    i43 += ljVar.P0;
                                }
                                ad adVar5 = adVarArr5[i44];
                                if (adVar5 != null) {
                                    int U = ljVar.U(adVar5, i28) + i43;
                                    if (U > i28) {
                                        break;
                                    }
                                    i14++;
                                    i43 = U;
                                }
                            }
                        } else {
                            i14 = i42;
                        }
                        i42 = 0;
                    } else {
                        if (i42 <= 0) {
                            int i45 = 0;
                            int i46 = 0;
                            for (int i47 = 0; i47 < i40; i47++) {
                                if (i47 > 0) {
                                    i45 += ljVar.Q0;
                                }
                                ad adVar6 = adVarArr5[i47];
                                if (adVar6 != null) {
                                    int T = ljVar.T(adVar6, i28) + i45;
                                    if (T > i28) {
                                        break;
                                    }
                                    i46++;
                                    i45 = T;
                                }
                            }
                            i42 = i46;
                        }
                        i14 = 0;
                    }
                    if (ljVar.Z0 == null) {
                        ljVar.Z0 = new int[2];
                    }
                    boolean z3 = (i42 == 0 && i41 == 1) || (i14 == 0 && i41 == 0);
                    while (!z3) {
                        if (i41 == 0) {
                            i42 = (int) Math.ceil(i40 / i14);
                        } else {
                            i14 = (int) Math.ceil(i40 / i42);
                        }
                        ad[] adVarArr6 = ljVar.Y0;
                        if (adVarArr6 == null || adVarArr6.length < i14) {
                            obj = null;
                            ljVar.Y0 = new ad[i14];
                        } else {
                            obj = null;
                            Arrays.fill(adVarArr6, (Object) null);
                        }
                        ad[] adVarArr7 = ljVar.X0;
                        if (adVarArr7 == null || adVarArr7.length < i42) {
                            ljVar.X0 = new ad[i42];
                        } else {
                            Arrays.fill(adVarArr7, obj);
                        }
                        for (int i48 = 0; i48 < i14; i48++) {
                            for (int i49 = 0; i49 < i42; i49++) {
                                int i50 = (i49 * i14) + i48;
                                if (i41 == 1) {
                                    i50 = (i48 * i42) + i49;
                                }
                                if (i50 < adVarArr5.length && (adVar = adVarArr5[i50]) != null) {
                                    int U2 = ljVar.U(adVar, i28);
                                    ad adVar7 = ljVar.Y0[i48];
                                    if (adVar7 == null || adVar7.q() < U2) {
                                        ljVar.Y0[i48] = adVar;
                                    }
                                    int T2 = ljVar.T(adVar, i28);
                                    ad adVar8 = ljVar.X0[i49];
                                    if (adVar8 == null || adVar8.k() < T2) {
                                        ljVar.X0[i49] = adVar;
                                    }
                                }
                            }
                        }
                        int i51 = 0;
                        for (int i52 = 0; i52 < i14; i52++) {
                            ad adVar9 = ljVar.Y0[i52];
                            if (adVar9 != null) {
                                if (i52 > 0) {
                                    i51 += ljVar.P0;
                                }
                                i51 = ljVar.U(adVar9, i28) + i51;
                            }
                        }
                        int i53 = 0;
                        for (int i54 = 0; i54 < i42; i54++) {
                            ad adVar10 = ljVar.X0[i54];
                            if (adVar10 != null) {
                                if (i54 > 0) {
                                    i53 += ljVar.Q0;
                                }
                                i53 = ljVar.T(adVar10, i28) + i53;
                            }
                        }
                        iArr[0] = i51;
                        iArr[1] = i53;
                        if (i41 == 0) {
                            if (i51 > i28 && i14 > 1) {
                                i14--;
                            }
                            z3 = true;
                        } else {
                            if (i53 > i28 && i42 > 1) {
                                i42--;
                            }
                            z3 = true;
                        }
                    }
                    z = true;
                    int[] iArr4 = ljVar.Z0;
                    iArr4[0] = i14;
                    iArr4[1] = i42;
                } else if (i34 != 3) {
                    i6 = i25;
                    iArr = iArr3;
                    i7 = size2;
                    i8 = i22;
                    i9 = i23;
                    i10 = i4;
                } else {
                    int i55 = i5;
                    int i56 = ljVar.V0;
                    if (i55 == 0) {
                        i6 = i25;
                        iArr = iArr3;
                        i7 = size2;
                        i8 = i22;
                        i9 = i23;
                        i10 = i4;
                        z2 = true;
                    } else {
                        arrayList3.clear();
                        ad[] adVarArr8 = adVarArr;
                        i8 = i22;
                        i6 = i25;
                        i9 = i23;
                        i10 = i4;
                        iArr = iArr3;
                        z2 = true;
                        kj kjVar3 = new kj(ljVar, i56, ljVar.I, ljVar.J, ljVar.K, ljVar.L, i28);
                        arrayList3.add(kjVar3);
                        if (i56 == 0) {
                            int i57 = 0;
                            int i58 = 0;
                            i15 = 0;
                            int i59 = 0;
                            while (i57 < i55) {
                                i58++;
                                ad adVar11 = adVarArr8[i57];
                                int U3 = ljVar.U(adVar11, i28);
                                int i60 = i56;
                                int i61 = i57;
                                if (adVar11.p0[0] == 3) {
                                    i15++;
                                }
                                int i62 = i15;
                                boolean z4 = (i59 == i28 || (ljVar.P0 + i59) + U3 > i28) && kjVar3.b != null;
                                if (!z4 && i61 > 0 && (i19 = ljVar.U0) > 0 && i58 > i19) {
                                    z4 = true;
                                }
                                if (z4) {
                                    i17 = size2;
                                    i56 = i60;
                                    i18 = i61;
                                    kjVar3 = new kj(ljVar, i56, ljVar.I, ljVar.J, ljVar.K, ljVar.L, i28);
                                    kjVar3.n = i18;
                                    arrayList3.add(kjVar3);
                                    i58 = 1;
                                } else {
                                    i17 = size2;
                                    i56 = i60;
                                    i18 = i61;
                                    if (i18 > 0) {
                                        i59 = ljVar.P0 + U3 + i59;
                                        kjVar3.a(adVar11);
                                        i57 = i18 + 1;
                                        i15 = i62;
                                        size2 = i17;
                                    }
                                }
                                i59 = U3;
                                kjVar3.a(adVar11);
                                i57 = i18 + 1;
                                i15 = i62;
                                size2 = i17;
                            }
                            i7 = size2;
                        } else {
                            i7 = size2;
                            int i63 = 0;
                            int i64 = 0;
                            int i65 = 0;
                            int i66 = 0;
                            while (i63 < i55) {
                                i64++;
                                ad adVar12 = adVarArr8[i63];
                                int T3 = ljVar.T(adVar12, i28);
                                int i67 = i56;
                                if (adVar12.p0[1] == 3) {
                                    i65++;
                                }
                                int i68 = i65;
                                boolean z5 = (i66 == i28 || (ljVar.Q0 + i66) + T3 > i28) && kjVar3.b != null;
                                if (!z5 && i63 > 0 && (i16 = ljVar.U0) > 0 && i64 > i16) {
                                    z5 = true;
                                }
                                if (z5) {
                                    i56 = i67;
                                    kjVar3 = new kj(ljVar, i56, ljVar.I, ljVar.J, ljVar.K, ljVar.L, i28);
                                    kjVar3.n = i63;
                                    arrayList3.add(kjVar3);
                                    i64 = 1;
                                } else {
                                    i56 = i67;
                                    if (i63 > 0) {
                                        i66 = ljVar.Q0 + T3 + i66;
                                        kjVar3.a(adVar12);
                                        i63++;
                                        i65 = i68;
                                    }
                                }
                                i66 = T3;
                                kjVar3.a(adVar12);
                                i63++;
                                i65 = i68;
                            }
                            i15 = i65;
                        }
                        int size3 = arrayList3.size();
                        int i69 = ljVar.w0;
                        int i70 = ljVar.s0;
                        int i71 = ljVar.x0;
                        int i72 = ljVar.t0;
                        boolean z6 = iArr2[0] == 2 || iArr2[1] == 2;
                        if (i15 > 0 && z6) {
                            for (int i73 = 0; i73 < size3; i73++) {
                                kj kjVar4 = (kj) arrayList3.get(i73);
                                if (i56 == 0) {
                                    kjVar4.e(i28 - kjVar4.d());
                                } else {
                                    kjVar4.e(i28 - kjVar4.c());
                                }
                            }
                        }
                        int i74 = i69;
                        int i75 = i70;
                        int i76 = i71;
                        int i77 = i72;
                        lc lcVar11 = lcVar8;
                        lc lcVar12 = lcVar9;
                        lc lcVar13 = lcVar10;
                        lc lcVar14 = lcVar4;
                        int i78 = 0;
                        int i79 = 0;
                        for (int i80 = 0; i80 < size3; i80++) {
                            kj kjVar5 = (kj) arrayList3.get(i80);
                            if (i56 == 0) {
                                if (i80 < size3 - 1) {
                                    lcVar13 = ((kj) arrayList3.get(i80 + 1)).b.J;
                                    i77 = 0;
                                } else {
                                    i77 = ljVar.t0;
                                    lcVar13 = lcVar10;
                                }
                                lc lcVar15 = kjVar5.b.L;
                                kjVar5.f(i56, lcVar11, lcVar14, lcVar12, lcVar13, i74, i75, i76, i77, i28);
                                i78 = Math.max(i78, kjVar5.d());
                                int c2 = kjVar5.c() + i79;
                                if (i80 > 0) {
                                    c2 += ljVar.Q0;
                                }
                                i79 = c2;
                                lcVar14 = lcVar15;
                                i75 = 0;
                            } else {
                                if (i80 < size3 - 1) {
                                    lcVar12 = ((kj) arrayList3.get(i80 + 1)).b.I;
                                    i76 = 0;
                                } else {
                                    i76 = ljVar.x0;
                                    lcVar12 = lcVar9;
                                }
                                lc lcVar16 = kjVar5.b.K;
                                kjVar5.f(i56, lcVar11, lcVar14, lcVar12, lcVar13, i74, i75, i76, i77, i28);
                                int d = kjVar5.d() + i78;
                                int max = Math.max(i79, kjVar5.c());
                                if (i80 > 0) {
                                    d += ljVar.P0;
                                }
                                i79 = max;
                                i78 = d;
                                lcVar11 = lcVar16;
                                i74 = 0;
                            }
                        }
                        iArr[0] = i78;
                        iArr[1] = i79;
                    }
                    z = z2;
                }
                c = 0;
                r12 = z;
                int i382 = iArr[c] + i8 + i9;
                int i392 = iArr[r12] + i10 + i6;
                if (mode != 1073741824) {
                    size = mode == Integer.MIN_VALUE ? Math.min(i382, size) : mode == 0 ? i382 : 0;
                }
                int min = mode2 == 1073741824 ? i7 : mode2 == Integer.MIN_VALUE ? Math.min(i392, i7) : mode2 == 0 ? i392 : 0;
                ljVar.z0 = size;
                ljVar.A0 = min;
                ljVar.O(size);
                ljVar.L(min);
                ljVar.y0 = ljVar.r0 > 0 ? r12 : false;
                setMeasuredDimension(ljVar.z0, ljVar.A0);
            }
            i6 = i25;
            iArr = iArr3;
            i7 = size2;
            i8 = i22;
            i9 = i23;
            i10 = i4;
            int i81 = i5;
            ad[] adVarArr9 = adVarArr;
            int i82 = ljVar.V0;
            if (i81 != 0) {
                arrayList3.clear();
                kj kjVar6 = new kj(ljVar, i82, ljVar.I, ljVar.J, ljVar.K, ljVar.L, i28);
                arrayList3.add(kjVar6);
                if (i82 == 0) {
                    int i83 = 0;
                    i11 = 0;
                    int i84 = 0;
                    while (i83 < i81) {
                        ad adVar13 = adVarArr9[i83];
                        int U4 = ljVar.U(adVar13, i28);
                        if (adVar13.p0[0] == 3) {
                            i11++;
                        }
                        int i85 = i11;
                        boolean z7 = (i84 == i28 || (ljVar.P0 + i84) + U4 > i28) && kjVar6.b != null;
                        if (!z7 && i83 > 0 && (i13 = ljVar.U0) > 0 && i83 % i13 == 0) {
                            z7 = true;
                        }
                        if (z7) {
                            kjVar6 = new kj(ljVar, i82, ljVar.I, ljVar.J, ljVar.K, ljVar.L, i28);
                            kjVar6.n = i83;
                            arrayList3.add(kjVar6);
                        } else if (i83 > 0) {
                            i84 = ljVar.P0 + U4 + i84;
                            kjVar6.a(adVar13);
                            i83++;
                            i11 = i85;
                        }
                        i84 = U4;
                        kjVar6.a(adVar13);
                        i83++;
                        i11 = i85;
                    }
                } else {
                    int i86 = 0;
                    i11 = 0;
                    int i87 = 0;
                    while (i86 < i81) {
                        ad adVar14 = adVarArr9[i86];
                        int T4 = ljVar.T(adVar14, i28);
                        if (adVar14.p0[1] == 3) {
                            i11++;
                        }
                        int i88 = i11;
                        boolean z8 = (i87 == i28 || (ljVar.Q0 + i87) + T4 > i28) && kjVar6.b != null;
                        if (!z8 && i86 > 0 && (i12 = ljVar.U0) > 0 && i86 % i12 == 0) {
                            z8 = true;
                        }
                        if (z8) {
                            kjVar6 = new kj(ljVar, i82, ljVar.I, ljVar.J, ljVar.K, ljVar.L, i28);
                            kjVar6.n = i86;
                            arrayList3.add(kjVar6);
                        } else if (i86 > 0) {
                            i87 = ljVar.Q0 + T4 + i87;
                            kjVar6.a(adVar14);
                            i86++;
                            i11 = i88;
                        }
                        i87 = T4;
                        kjVar6.a(adVar14);
                        i86++;
                        i11 = i88;
                    }
                }
                int size4 = arrayList3.size();
                int i89 = ljVar.w0;
                int i90 = ljVar.s0;
                int i91 = ljVar.x0;
                int i92 = ljVar.t0;
                boolean z9 = iArr2[0] == 2 || iArr2[1] == 2;
                if (i11 > 0 && z9) {
                    for (int i93 = 0; i93 < size4; i93++) {
                        kj kjVar7 = (kj) arrayList3.get(i93);
                        if (i82 == 0) {
                            kjVar7.e(i28 - kjVar7.d());
                        } else {
                            kjVar7.e(i28 - kjVar7.c());
                        }
                    }
                }
                int i94 = i89;
                int i95 = i90;
                int i96 = i91;
                int i97 = i92;
                lc lcVar17 = lcVar8;
                lc lcVar18 = lcVar9;
                lc lcVar19 = lcVar10;
                lc lcVar20 = lcVar4;
                int i98 = 0;
                int i99 = 0;
                for (int i100 = 0; i100 < size4; i100++) {
                    kj kjVar8 = (kj) arrayList3.get(i100);
                    if (i82 == 0) {
                        if (i100 < size4 - 1) {
                            lcVar19 = ((kj) arrayList3.get(i100 + 1)).b.J;
                            i97 = 0;
                        } else {
                            i97 = ljVar.t0;
                            lcVar19 = lcVar10;
                        }
                        lc lcVar21 = kjVar8.b.L;
                        kjVar8.f(i82, lcVar17, lcVar20, lcVar18, lcVar19, i94, i95, i96, i97, i28);
                        i98 = Math.max(i98, kjVar8.d());
                        int c3 = kjVar8.c() + i99;
                        if (i100 > 0) {
                            c3 += ljVar.Q0;
                        }
                        i99 = c3;
                        lcVar20 = lcVar21;
                        i95 = 0;
                    } else {
                        if (i100 < size4 - 1) {
                            lcVar18 = ((kj) arrayList3.get(i100 + 1)).b.I;
                            i96 = 0;
                        } else {
                            i96 = ljVar.x0;
                            lcVar18 = lcVar9;
                        }
                        lc lcVar22 = kjVar8.b.K;
                        kjVar8.f(i82, lcVar17, lcVar20, lcVar18, lcVar19, i94, i95, i96, i97, i28);
                        int d2 = kjVar8.d() + i98;
                        int max2 = Math.max(i99, kjVar8.c());
                        if (i100 > 0) {
                            d2 += ljVar.P0;
                        }
                        i99 = max2;
                        i98 = d2;
                        lcVar17 = lcVar22;
                        i94 = 0;
                    }
                }
                iArr[0] = i98;
                iArr[1] = i99;
            }
        }
        z = true;
        c = 0;
        r12 = z;
        int i3822 = iArr[c] + i8 + i9;
        int i3922 = iArr[r12] + i10 + i6;
        if (mode != 1073741824) {
        }
        if (mode2 == 1073741824) {
        }
        ljVar.z0 = size;
        ljVar.A0 = min;
        ljVar.O(size);
        ljVar.L(min);
        ljVar.y0 = ljVar.r0 > 0 ? r12 : false;
        setMeasuredDimension(ljVar.z0, ljVar.A0);
    }

    @Override // defpackage.nc, android.view.View
    public final void onMeasure(int i, int i2) {
        j(this.o, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.o.L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.o.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.o.M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.o.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.o.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.o.J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.o.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.o.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.o.N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.o.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.o.O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.o.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.o.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.o.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        lj ljVar = this.o;
        ljVar.s0 = i;
        ljVar.t0 = i;
        ljVar.u0 = i;
        ljVar.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.o.t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.o.w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.o.x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.o.s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.o.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.o.K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.o.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.o.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.o.T0 = i;
        requestLayout();
    }
}

package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ae;
import defpackage.be;
import defpackage.i8;
import defpackage.ld;
import defpackage.md0;
import defpackage.nl;
import defpackage.ol;
import defpackage.qd;
import defpackage.t00;
import defpackage.yo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class Flow extends md0 {
    public final ol o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new int[32];
        this.l = new HashMap();
        this.h = context;
        super.g(attributeSet);
        ol olVar = new ol();
        olVar.s0 = 0;
        olVar.t0 = 0;
        olVar.u0 = 0;
        olVar.v0 = 0;
        olVar.w0 = 0;
        olVar.x0 = 0;
        olVar.y0 = false;
        olVar.z0 = 0;
        olVar.A0 = 0;
        olVar.B0 = new i8();
        olVar.C0 = null;
        olVar.D0 = -1;
        olVar.E0 = -1;
        olVar.F0 = -1;
        olVar.G0 = -1;
        olVar.H0 = -1;
        olVar.I0 = -1;
        olVar.J0 = 0.5f;
        olVar.K0 = 0.5f;
        olVar.L0 = 0.5f;
        olVar.M0 = 0.5f;
        olVar.N0 = 0.5f;
        olVar.O0 = 0.5f;
        olVar.P0 = 0;
        olVar.Q0 = 0;
        olVar.R0 = 2;
        olVar.S0 = 2;
        olVar.T0 = 0;
        olVar.U0 = -1;
        olVar.V0 = 0;
        olVar.W0 = new ArrayList();
        olVar.X0 = null;
        olVar.Y0 = null;
        olVar.Z0 = null;
        olVar.b1 = 0;
        this.o = olVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t00.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.o.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    ol olVar2 = this.o;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    olVar2.s0 = dimensionPixelSize;
                    olVar2.t0 = dimensionPixelSize;
                    olVar2.u0 = dimensionPixelSize;
                    olVar2.v0 = dimensionPixelSize;
                } else if (index == 18) {
                    ol olVar3 = this.o;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    olVar3.u0 = dimensionPixelSize2;
                    olVar3.w0 = dimensionPixelSize2;
                    olVar3.x0 = dimensionPixelSize2;
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

    @Override // defpackage.nd
    public final void h(ae aeVar, boolean z) {
        ol olVar = this.o;
        int i = olVar.u0;
        if (i > 0 || olVar.v0 > 0) {
            if (z) {
                olVar.w0 = olVar.v0;
                olVar.x0 = i;
            } else {
                olVar.w0 = i;
                olVar.x0 = olVar.v0;
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
    @Override // defpackage.md0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(ol olVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        ae[] aeVarArr;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        int i10;
        nl nlVar;
        char c;
        ?? r12;
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj;
        ae aeVar;
        boolean z2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ld ldVar;
        ld ldVar2;
        ld ldVar3;
        ArrayList arrayList;
        int i20;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (olVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        int[] iArr2 = olVar.p0;
        ld ldVar4 = olVar.J;
        ld ldVar5 = olVar.I;
        ld ldVar6 = olVar.K;
        ld ldVar7 = olVar.L;
        ArrayList arrayList2 = olVar.W0;
        if (olVar.r0 > 0) {
            i8 i8Var = olVar.B0;
            ae aeVar2 = olVar.T;
            qd qdVar = aeVar2 != null ? ((be) aeVar2).u0 : null;
            if (qdVar == null) {
                olVar.z0 = 0;
                olVar.A0 = 0;
                olVar.y0 = false;
                setMeasuredDimension(olVar.z0, olVar.A0);
            }
            int i21 = 0;
            while (i21 < olVar.r0) {
                ae aeVar3 = olVar.q0[i21];
                if (aeVar3 == null) {
                    ldVar = ldVar5;
                } else {
                    ldVar = ldVar5;
                    if (!(aeVar3 instanceof yo)) {
                        ldVar2 = ldVar6;
                        int j = aeVar3.j(0);
                        ldVar3 = ldVar7;
                        int j2 = aeVar3.j(1);
                        arrayList = arrayList2;
                        if (j == 3) {
                            i20 = i21;
                            if (aeVar3.r != 1 && j2 == 3 && aeVar3.s != 1) {
                                i21 = i20 + 1;
                                ldVar5 = ldVar;
                                ldVar6 = ldVar2;
                                ldVar7 = ldVar3;
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
                        i8Var.a = j;
                        i8Var.b = j2;
                        i8Var.c = aeVar3.q();
                        i8Var.d = aeVar3.k();
                        qdVar.b(aeVar3, i8Var);
                        aeVar3.O(i8Var.e);
                        aeVar3.L(i8Var.f);
                        aeVar3.I(i8Var.g);
                        i21 = i20 + 1;
                        ldVar5 = ldVar;
                        ldVar6 = ldVar2;
                        ldVar7 = ldVar3;
                        arrayList2 = arrayList;
                    }
                }
                ldVar2 = ldVar6;
                ldVar3 = ldVar7;
                arrayList = arrayList2;
                i20 = i21;
                i21 = i20 + 1;
                ldVar5 = ldVar;
                ldVar6 = ldVar2;
                ldVar7 = ldVar3;
                arrayList2 = arrayList;
            }
        }
        ld ldVar8 = ldVar5;
        ld ldVar9 = ldVar6;
        ld ldVar10 = ldVar7;
        ArrayList arrayList3 = arrayList2;
        int i22 = olVar.w0;
        int i23 = olVar.x0;
        int i24 = olVar.s0;
        int i25 = olVar.t0;
        int[] iArr3 = new int[2];
        int i26 = (size - i22) - i23;
        int i27 = olVar.V0;
        if (i27 == 1) {
            i26 = (size2 - i24) - i25;
        }
        int i28 = i26;
        int i29 = olVar.D0;
        if (i27 == 0) {
            if (i29 == -1) {
                olVar.D0 = 0;
            }
            if (olVar.E0 == -1) {
                olVar.E0 = 0;
            }
        } else {
            if (i29 == -1) {
                olVar.D0 = 0;
            }
            if (olVar.E0 == -1) {
                olVar.E0 = 0;
            }
        }
        ae[] aeVarArr2 = olVar.q0;
        int i30 = 0;
        int i31 = 0;
        while (true) {
            i3 = olVar.r0;
            i4 = i24;
            if (i30 >= i3) {
                break;
            }
            if (olVar.q0[i30].g0 == 8) {
                i31++;
            }
            i30++;
            i24 = i4;
        }
        if (i31 > 0) {
            aeVarArr = new ae[i3 - i31];
            int i32 = 0;
            int i33 = 0;
            while (i32 < olVar.r0) {
                ae aeVar4 = olVar.q0[i32];
                ae[] aeVarArr3 = aeVarArr;
                if (aeVar4.g0 != 8) {
                    aeVarArr3[i33] = aeVar4;
                    i33++;
                }
                i32++;
                aeVarArr = aeVarArr3;
            }
            i5 = i33;
        } else {
            i5 = i3;
            aeVarArr = aeVarArr2;
        }
        olVar.a1 = aeVarArr;
        olVar.b1 = i5;
        int i34 = olVar.T0;
        if (i34 == 0) {
            ae[] aeVarArr4 = aeVarArr;
            int i35 = i5;
            i6 = i25;
            iArr = iArr3;
            i7 = size2;
            i8 = i22;
            i9 = i23;
            i10 = i4;
            int i36 = olVar.V0;
            if (i35 != 0) {
                if (arrayList3.size() == 0) {
                    nlVar = new nl(olVar, i36, olVar.I, olVar.J, olVar.K, olVar.L, i28);
                    arrayList3.add(nlVar);
                } else {
                    nl nlVar2 = (nl) arrayList3.get(0);
                    nlVar2.c = 0;
                    nlVar2.b = null;
                    nlVar2.l = 0;
                    nlVar2.m = 0;
                    nlVar2.n = 0;
                    nlVar2.o = 0;
                    nlVar2.p = 0;
                    nlVar2.f(i36, olVar.I, olVar.J, olVar.K, olVar.L, olVar.w0, olVar.s0, olVar.x0, olVar.t0, i28);
                    nlVar = nlVar2;
                }
                for (int i37 = 0; i37 < i35; i37++) {
                    nlVar.a(aeVarArr4[i37]);
                }
                c = 0;
                iArr[0] = nlVar.d();
                r12 = 1;
                iArr[1] = nlVar.c();
                int i38 = iArr[c] + i8 + i9;
                int i39 = iArr[r12] + i10 + i6;
                if (mode != 1073741824) {
                }
                if (mode2 == 1073741824) {
                }
                olVar.z0 = size;
                olVar.A0 = r0;
                olVar.O(size);
                olVar.L(r0);
                olVar.y0 = olVar.r0 > 0 ? r12 : false;
                setMeasuredDimension(olVar.z0, olVar.A0);
            }
        } else {
            if (i34 != 1) {
                if (i34 == 2) {
                    ae[] aeVarArr5 = aeVarArr;
                    int i40 = i5;
                    i6 = i25;
                    iArr = iArr3;
                    i7 = size2;
                    i8 = i22;
                    i9 = i23;
                    i10 = i4;
                    int i41 = olVar.V0;
                    int i42 = olVar.U0;
                    if (i41 == 0) {
                        if (i42 <= 0) {
                            int i43 = 0;
                            i14 = 0;
                            for (int i44 = 0; i44 < i40; i44++) {
                                if (i44 > 0) {
                                    i43 += olVar.P0;
                                }
                                ae aeVar5 = aeVarArr5[i44];
                                if (aeVar5 != null) {
                                    int U = olVar.U(aeVar5, i28) + i43;
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
                                    i45 += olVar.Q0;
                                }
                                ae aeVar6 = aeVarArr5[i47];
                                if (aeVar6 != null) {
                                    int T = olVar.T(aeVar6, i28) + i45;
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
                    if (olVar.Z0 == null) {
                        olVar.Z0 = new int[2];
                    }
                    boolean z3 = (i42 == 0 && i41 == 1) || (i14 == 0 && i41 == 0);
                    while (!z3) {
                        if (i41 == 0) {
                            i42 = (int) Math.ceil(i40 / i14);
                        } else {
                            i14 = (int) Math.ceil(i40 / i42);
                        }
                        ae[] aeVarArr6 = olVar.Y0;
                        if (aeVarArr6 == null || aeVarArr6.length < i14) {
                            obj = null;
                            olVar.Y0 = new ae[i14];
                        } else {
                            obj = null;
                            Arrays.fill(aeVarArr6, (Object) null);
                        }
                        ae[] aeVarArr7 = olVar.X0;
                        if (aeVarArr7 == null || aeVarArr7.length < i42) {
                            olVar.X0 = new ae[i42];
                        } else {
                            Arrays.fill(aeVarArr7, obj);
                        }
                        for (int i48 = 0; i48 < i14; i48++) {
                            for (int i49 = 0; i49 < i42; i49++) {
                                int i50 = (i49 * i14) + i48;
                                if (i41 == 1) {
                                    i50 = (i48 * i42) + i49;
                                }
                                if (i50 < aeVarArr5.length && (aeVar = aeVarArr5[i50]) != null) {
                                    int U2 = olVar.U(aeVar, i28);
                                    ae aeVar7 = olVar.Y0[i48];
                                    if (aeVar7 == null || aeVar7.q() < U2) {
                                        olVar.Y0[i48] = aeVar;
                                    }
                                    int T2 = olVar.T(aeVar, i28);
                                    ae aeVar8 = olVar.X0[i49];
                                    if (aeVar8 == null || aeVar8.k() < T2) {
                                        olVar.X0[i49] = aeVar;
                                    }
                                }
                            }
                        }
                        int i51 = 0;
                        for (int i52 = 0; i52 < i14; i52++) {
                            ae aeVar9 = olVar.Y0[i52];
                            if (aeVar9 != null) {
                                if (i52 > 0) {
                                    i51 += olVar.P0;
                                }
                                i51 = olVar.U(aeVar9, i28) + i51;
                            }
                        }
                        int i53 = 0;
                        for (int i54 = 0; i54 < i42; i54++) {
                            ae aeVar10 = olVar.X0[i54];
                            if (aeVar10 != null) {
                                if (i54 > 0) {
                                    i53 += olVar.Q0;
                                }
                                i53 = olVar.T(aeVar10, i28) + i53;
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
                    int[] iArr4 = olVar.Z0;
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
                    int i56 = olVar.V0;
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
                        ae[] aeVarArr8 = aeVarArr;
                        i8 = i22;
                        i6 = i25;
                        i9 = i23;
                        i10 = i4;
                        iArr = iArr3;
                        z2 = true;
                        nl nlVar3 = new nl(olVar, i56, olVar.I, olVar.J, olVar.K, olVar.L, i28);
                        arrayList3.add(nlVar3);
                        if (i56 == 0) {
                            int i57 = 0;
                            int i58 = 0;
                            i15 = 0;
                            int i59 = 0;
                            while (i57 < i55) {
                                i58++;
                                ae aeVar11 = aeVarArr8[i57];
                                int U3 = olVar.U(aeVar11, i28);
                                int i60 = i56;
                                int i61 = i57;
                                if (aeVar11.p0[0] == 3) {
                                    i15++;
                                }
                                int i62 = i15;
                                boolean z4 = (i59 == i28 || (olVar.P0 + i59) + U3 > i28) && nlVar3.b != null;
                                if (!z4 && i61 > 0 && (i19 = olVar.U0) > 0 && i58 > i19) {
                                    z4 = true;
                                }
                                if (z4) {
                                    i17 = size2;
                                    i56 = i60;
                                    i18 = i61;
                                    nlVar3 = new nl(olVar, i56, olVar.I, olVar.J, olVar.K, olVar.L, i28);
                                    nlVar3.n = i18;
                                    arrayList3.add(nlVar3);
                                    i58 = 1;
                                } else {
                                    i17 = size2;
                                    i56 = i60;
                                    i18 = i61;
                                    if (i18 > 0) {
                                        i59 = olVar.P0 + U3 + i59;
                                        nlVar3.a(aeVar11);
                                        i57 = i18 + 1;
                                        i15 = i62;
                                        size2 = i17;
                                    }
                                }
                                i59 = U3;
                                nlVar3.a(aeVar11);
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
                                ae aeVar12 = aeVarArr8[i63];
                                int T3 = olVar.T(aeVar12, i28);
                                int i67 = i56;
                                if (aeVar12.p0[1] == 3) {
                                    i65++;
                                }
                                int i68 = i65;
                                boolean z5 = (i66 == i28 || (olVar.Q0 + i66) + T3 > i28) && nlVar3.b != null;
                                if (!z5 && i63 > 0 && (i16 = olVar.U0) > 0 && i64 > i16) {
                                    z5 = true;
                                }
                                if (z5) {
                                    i56 = i67;
                                    nlVar3 = new nl(olVar, i56, olVar.I, olVar.J, olVar.K, olVar.L, i28);
                                    nlVar3.n = i63;
                                    arrayList3.add(nlVar3);
                                    i64 = 1;
                                } else {
                                    i56 = i67;
                                    if (i63 > 0) {
                                        i66 = olVar.Q0 + T3 + i66;
                                        nlVar3.a(aeVar12);
                                        i63++;
                                        i65 = i68;
                                    }
                                }
                                i66 = T3;
                                nlVar3.a(aeVar12);
                                i63++;
                                i65 = i68;
                            }
                            i15 = i65;
                        }
                        int size3 = arrayList3.size();
                        int i69 = olVar.w0;
                        int i70 = olVar.s0;
                        int i71 = olVar.x0;
                        int i72 = olVar.t0;
                        boolean z6 = iArr2[0] == 2 || iArr2[1] == 2;
                        if (i15 > 0 && z6) {
                            for (int i73 = 0; i73 < size3; i73++) {
                                nl nlVar4 = (nl) arrayList3.get(i73);
                                if (i56 == 0) {
                                    nlVar4.e(i28 - nlVar4.d());
                                } else {
                                    nlVar4.e(i28 - nlVar4.c());
                                }
                            }
                        }
                        int i74 = i69;
                        int i75 = i70;
                        int i76 = i71;
                        int i77 = i72;
                        ld ldVar11 = ldVar8;
                        ld ldVar12 = ldVar9;
                        ld ldVar13 = ldVar10;
                        ld ldVar14 = ldVar4;
                        int i78 = 0;
                        int i79 = 0;
                        for (int i80 = 0; i80 < size3; i80++) {
                            nl nlVar5 = (nl) arrayList3.get(i80);
                            if (i56 == 0) {
                                if (i80 < size3 - 1) {
                                    ldVar13 = ((nl) arrayList3.get(i80 + 1)).b.J;
                                    i77 = 0;
                                } else {
                                    i77 = olVar.t0;
                                    ldVar13 = ldVar10;
                                }
                                ld ldVar15 = nlVar5.b.L;
                                nlVar5.f(i56, ldVar11, ldVar14, ldVar12, ldVar13, i74, i75, i76, i77, i28);
                                i78 = Math.max(i78, nlVar5.d());
                                int c2 = nlVar5.c() + i79;
                                if (i80 > 0) {
                                    c2 += olVar.Q0;
                                }
                                i79 = c2;
                                ldVar14 = ldVar15;
                                i75 = 0;
                            } else {
                                if (i80 < size3 - 1) {
                                    ldVar12 = ((nl) arrayList3.get(i80 + 1)).b.I;
                                    i76 = 0;
                                } else {
                                    i76 = olVar.x0;
                                    ldVar12 = ldVar9;
                                }
                                ld ldVar16 = nlVar5.b.K;
                                nlVar5.f(i56, ldVar11, ldVar14, ldVar12, ldVar13, i74, i75, i76, i77, i28);
                                int d = nlVar5.d() + i78;
                                int max = Math.max(i79, nlVar5.c());
                                if (i80 > 0) {
                                    d += olVar.P0;
                                }
                                i79 = max;
                                i78 = d;
                                ldVar11 = ldVar16;
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
                olVar.z0 = size;
                olVar.A0 = min;
                olVar.O(size);
                olVar.L(min);
                olVar.y0 = olVar.r0 > 0 ? r12 : false;
                setMeasuredDimension(olVar.z0, olVar.A0);
            }
            i6 = i25;
            iArr = iArr3;
            i7 = size2;
            i8 = i22;
            i9 = i23;
            i10 = i4;
            int i81 = i5;
            ae[] aeVarArr9 = aeVarArr;
            int i82 = olVar.V0;
            if (i81 != 0) {
                arrayList3.clear();
                nl nlVar6 = new nl(olVar, i82, olVar.I, olVar.J, olVar.K, olVar.L, i28);
                arrayList3.add(nlVar6);
                if (i82 == 0) {
                    int i83 = 0;
                    i11 = 0;
                    int i84 = 0;
                    while (i83 < i81) {
                        ae aeVar13 = aeVarArr9[i83];
                        int U4 = olVar.U(aeVar13, i28);
                        if (aeVar13.p0[0] == 3) {
                            i11++;
                        }
                        int i85 = i11;
                        boolean z7 = (i84 == i28 || (olVar.P0 + i84) + U4 > i28) && nlVar6.b != null;
                        if (!z7 && i83 > 0 && (i13 = olVar.U0) > 0 && i83 % i13 == 0) {
                            z7 = true;
                        }
                        if (z7) {
                            nlVar6 = new nl(olVar, i82, olVar.I, olVar.J, olVar.K, olVar.L, i28);
                            nlVar6.n = i83;
                            arrayList3.add(nlVar6);
                        } else if (i83 > 0) {
                            i84 = olVar.P0 + U4 + i84;
                            nlVar6.a(aeVar13);
                            i83++;
                            i11 = i85;
                        }
                        i84 = U4;
                        nlVar6.a(aeVar13);
                        i83++;
                        i11 = i85;
                    }
                } else {
                    int i86 = 0;
                    i11 = 0;
                    int i87 = 0;
                    while (i86 < i81) {
                        ae aeVar14 = aeVarArr9[i86];
                        int T4 = olVar.T(aeVar14, i28);
                        if (aeVar14.p0[1] == 3) {
                            i11++;
                        }
                        int i88 = i11;
                        boolean z8 = (i87 == i28 || (olVar.Q0 + i87) + T4 > i28) && nlVar6.b != null;
                        if (!z8 && i86 > 0 && (i12 = olVar.U0) > 0 && i86 % i12 == 0) {
                            z8 = true;
                        }
                        if (z8) {
                            nlVar6 = new nl(olVar, i82, olVar.I, olVar.J, olVar.K, olVar.L, i28);
                            nlVar6.n = i86;
                            arrayList3.add(nlVar6);
                        } else if (i86 > 0) {
                            i87 = olVar.Q0 + T4 + i87;
                            nlVar6.a(aeVar14);
                            i86++;
                            i11 = i88;
                        }
                        i87 = T4;
                        nlVar6.a(aeVar14);
                        i86++;
                        i11 = i88;
                    }
                }
                int size4 = arrayList3.size();
                int i89 = olVar.w0;
                int i90 = olVar.s0;
                int i91 = olVar.x0;
                int i92 = olVar.t0;
                boolean z9 = iArr2[0] == 2 || iArr2[1] == 2;
                if (i11 > 0 && z9) {
                    for (int i93 = 0; i93 < size4; i93++) {
                        nl nlVar7 = (nl) arrayList3.get(i93);
                        if (i82 == 0) {
                            nlVar7.e(i28 - nlVar7.d());
                        } else {
                            nlVar7.e(i28 - nlVar7.c());
                        }
                    }
                }
                int i94 = i89;
                int i95 = i90;
                int i96 = i91;
                int i97 = i92;
                ld ldVar17 = ldVar8;
                ld ldVar18 = ldVar9;
                ld ldVar19 = ldVar10;
                ld ldVar20 = ldVar4;
                int i98 = 0;
                int i99 = 0;
                for (int i100 = 0; i100 < size4; i100++) {
                    nl nlVar8 = (nl) arrayList3.get(i100);
                    if (i82 == 0) {
                        if (i100 < size4 - 1) {
                            ldVar19 = ((nl) arrayList3.get(i100 + 1)).b.J;
                            i97 = 0;
                        } else {
                            i97 = olVar.t0;
                            ldVar19 = ldVar10;
                        }
                        ld ldVar21 = nlVar8.b.L;
                        nlVar8.f(i82, ldVar17, ldVar20, ldVar18, ldVar19, i94, i95, i96, i97, i28);
                        i98 = Math.max(i98, nlVar8.d());
                        int c3 = nlVar8.c() + i99;
                        if (i100 > 0) {
                            c3 += olVar.Q0;
                        }
                        i99 = c3;
                        ldVar20 = ldVar21;
                        i95 = 0;
                    } else {
                        if (i100 < size4 - 1) {
                            ldVar18 = ((nl) arrayList3.get(i100 + 1)).b.I;
                            i96 = 0;
                        } else {
                            i96 = olVar.x0;
                            ldVar18 = ldVar9;
                        }
                        ld ldVar22 = nlVar8.b.K;
                        nlVar8.f(i82, ldVar17, ldVar20, ldVar18, ldVar19, i94, i95, i96, i97, i28);
                        int d2 = nlVar8.d() + i98;
                        int max2 = Math.max(i99, nlVar8.c());
                        if (i100 > 0) {
                            d2 += olVar.P0;
                        }
                        i99 = max2;
                        i98 = d2;
                        ldVar17 = ldVar22;
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
        olVar.z0 = size;
        olVar.A0 = min;
        olVar.O(size);
        olVar.L(min);
        olVar.y0 = olVar.r0 > 0 ? r12 : false;
        setMeasuredDimension(olVar.z0, olVar.A0);
    }

    @Override // defpackage.nd, android.view.View
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
        ol olVar = this.o;
        olVar.s0 = i;
        olVar.t0 = i;
        olVar.u0 = i;
        olVar.v0 = i;
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

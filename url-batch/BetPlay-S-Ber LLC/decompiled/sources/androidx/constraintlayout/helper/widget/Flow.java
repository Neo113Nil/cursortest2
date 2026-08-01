package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.b8;
import defpackage.bn;
import defpackage.ed;
import defpackage.ej;
import defpackage.fd;
import defpackage.fj;
import defpackage.gy;
import defpackage.la0;
import defpackage.pc;
import defpackage.uc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class Flow extends la0 {
    public final fj o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new int[32];
        this.l = new HashMap();
        this.h = context;
        super.g(attributeSet);
        fj fjVar = new fj();
        fjVar.s0 = 0;
        fjVar.t0 = 0;
        fjVar.u0 = 0;
        fjVar.v0 = 0;
        fjVar.w0 = 0;
        fjVar.x0 = 0;
        fjVar.y0 = false;
        fjVar.z0 = 0;
        fjVar.A0 = 0;
        fjVar.B0 = new b8();
        fjVar.C0 = null;
        fjVar.D0 = -1;
        fjVar.E0 = -1;
        fjVar.F0 = -1;
        fjVar.G0 = -1;
        fjVar.H0 = -1;
        fjVar.I0 = -1;
        fjVar.J0 = 0.5f;
        fjVar.K0 = 0.5f;
        fjVar.L0 = 0.5f;
        fjVar.M0 = 0.5f;
        fjVar.N0 = 0.5f;
        fjVar.O0 = 0.5f;
        fjVar.P0 = 0;
        fjVar.Q0 = 0;
        fjVar.R0 = 2;
        fjVar.S0 = 2;
        fjVar.T0 = 0;
        fjVar.U0 = -1;
        fjVar.V0 = 0;
        fjVar.W0 = new ArrayList();
        fjVar.X0 = null;
        fjVar.Y0 = null;
        fjVar.Z0 = null;
        fjVar.b1 = 0;
        this.o = fjVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gy.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.o.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    fj fjVar2 = this.o;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fjVar2.s0 = dimensionPixelSize;
                    fjVar2.t0 = dimensionPixelSize;
                    fjVar2.u0 = dimensionPixelSize;
                    fjVar2.v0 = dimensionPixelSize;
                } else if (index == 18) {
                    fj fjVar3 = this.o;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fjVar3.u0 = dimensionPixelSize2;
                    fjVar3.w0 = dimensionPixelSize2;
                    fjVar3.x0 = dimensionPixelSize2;
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

    @Override // defpackage.rc
    public final void h(ed edVar, boolean z) {
        fj fjVar = this.o;
        int i = fjVar.u0;
        if (i > 0 || fjVar.v0 > 0) {
            if (z) {
                fjVar.w0 = fjVar.v0;
                fjVar.x0 = i;
            } else {
                fjVar.w0 = i;
                fjVar.x0 = fjVar.v0;
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
    @Override // defpackage.la0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(fj fjVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        ed[] edVarArr;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        int i10;
        ej ejVar;
        char c;
        ?? r12;
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj;
        ed edVar;
        boolean z2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        pc pcVar;
        pc pcVar2;
        pc pcVar3;
        ArrayList arrayList;
        int i20;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (fjVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        int[] iArr2 = fjVar.p0;
        pc pcVar4 = fjVar.J;
        pc pcVar5 = fjVar.I;
        pc pcVar6 = fjVar.K;
        pc pcVar7 = fjVar.L;
        ArrayList arrayList2 = fjVar.W0;
        if (fjVar.r0 > 0) {
            b8 b8Var = fjVar.B0;
            ed edVar2 = fjVar.T;
            uc ucVar = edVar2 != null ? ((fd) edVar2).u0 : null;
            if (ucVar == null) {
                fjVar.z0 = 0;
                fjVar.A0 = 0;
                fjVar.y0 = false;
                setMeasuredDimension(fjVar.z0, fjVar.A0);
            }
            int i21 = 0;
            while (i21 < fjVar.r0) {
                ed edVar3 = fjVar.q0[i21];
                if (edVar3 == null) {
                    pcVar = pcVar5;
                } else {
                    pcVar = pcVar5;
                    if (!(edVar3 instanceof bn)) {
                        pcVar2 = pcVar6;
                        int j = edVar3.j(0);
                        pcVar3 = pcVar7;
                        int j2 = edVar3.j(1);
                        arrayList = arrayList2;
                        if (j == 3) {
                            i20 = i21;
                            if (edVar3.r != 1 && j2 == 3 && edVar3.s != 1) {
                                i21 = i20 + 1;
                                pcVar5 = pcVar;
                                pcVar6 = pcVar2;
                                pcVar7 = pcVar3;
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
                        b8Var.a = j;
                        b8Var.b = j2;
                        b8Var.c = edVar3.q();
                        b8Var.d = edVar3.k();
                        ucVar.b(edVar3, b8Var);
                        edVar3.O(b8Var.e);
                        edVar3.L(b8Var.f);
                        edVar3.I(b8Var.g);
                        i21 = i20 + 1;
                        pcVar5 = pcVar;
                        pcVar6 = pcVar2;
                        pcVar7 = pcVar3;
                        arrayList2 = arrayList;
                    }
                }
                pcVar2 = pcVar6;
                pcVar3 = pcVar7;
                arrayList = arrayList2;
                i20 = i21;
                i21 = i20 + 1;
                pcVar5 = pcVar;
                pcVar6 = pcVar2;
                pcVar7 = pcVar3;
                arrayList2 = arrayList;
            }
        }
        pc pcVar8 = pcVar5;
        pc pcVar9 = pcVar6;
        pc pcVar10 = pcVar7;
        ArrayList arrayList3 = arrayList2;
        int i22 = fjVar.w0;
        int i23 = fjVar.x0;
        int i24 = fjVar.s0;
        int i25 = fjVar.t0;
        int[] iArr3 = new int[2];
        int i26 = (size - i22) - i23;
        int i27 = fjVar.V0;
        if (i27 == 1) {
            i26 = (size2 - i24) - i25;
        }
        int i28 = i26;
        int i29 = fjVar.D0;
        if (i27 == 0) {
            if (i29 == -1) {
                fjVar.D0 = 0;
            }
            if (fjVar.E0 == -1) {
                fjVar.E0 = 0;
            }
        } else {
            if (i29 == -1) {
                fjVar.D0 = 0;
            }
            if (fjVar.E0 == -1) {
                fjVar.E0 = 0;
            }
        }
        ed[] edVarArr2 = fjVar.q0;
        int i30 = 0;
        int i31 = 0;
        while (true) {
            i3 = fjVar.r0;
            i4 = i24;
            if (i30 >= i3) {
                break;
            }
            if (fjVar.q0[i30].g0 == 8) {
                i31++;
            }
            i30++;
            i24 = i4;
        }
        if (i31 > 0) {
            edVarArr = new ed[i3 - i31];
            int i32 = 0;
            int i33 = 0;
            while (i32 < fjVar.r0) {
                ed edVar4 = fjVar.q0[i32];
                ed[] edVarArr3 = edVarArr;
                if (edVar4.g0 != 8) {
                    edVarArr3[i33] = edVar4;
                    i33++;
                }
                i32++;
                edVarArr = edVarArr3;
            }
            i5 = i33;
        } else {
            i5 = i3;
            edVarArr = edVarArr2;
        }
        fjVar.a1 = edVarArr;
        fjVar.b1 = i5;
        int i34 = fjVar.T0;
        if (i34 == 0) {
            ed[] edVarArr4 = edVarArr;
            int i35 = i5;
            i6 = i25;
            iArr = iArr3;
            i7 = size2;
            i8 = i22;
            i9 = i23;
            i10 = i4;
            int i36 = fjVar.V0;
            if (i35 != 0) {
                if (arrayList3.size() == 0) {
                    ejVar = new ej(fjVar, i36, fjVar.I, fjVar.J, fjVar.K, fjVar.L, i28);
                    arrayList3.add(ejVar);
                } else {
                    ej ejVar2 = (ej) arrayList3.get(0);
                    ejVar2.c = 0;
                    ejVar2.b = null;
                    ejVar2.l = 0;
                    ejVar2.m = 0;
                    ejVar2.n = 0;
                    ejVar2.o = 0;
                    ejVar2.p = 0;
                    ejVar2.f(i36, fjVar.I, fjVar.J, fjVar.K, fjVar.L, fjVar.w0, fjVar.s0, fjVar.x0, fjVar.t0, i28);
                    ejVar = ejVar2;
                }
                for (int i37 = 0; i37 < i35; i37++) {
                    ejVar.a(edVarArr4[i37]);
                }
                c = 0;
                iArr[0] = ejVar.d();
                r12 = 1;
                iArr[1] = ejVar.c();
                int i38 = iArr[c] + i8 + i9;
                int i39 = iArr[r12] + i10 + i6;
                if (mode != 1073741824) {
                }
                if (mode2 == 1073741824) {
                }
                fjVar.z0 = size;
                fjVar.A0 = r0;
                fjVar.O(size);
                fjVar.L(r0);
                fjVar.y0 = fjVar.r0 > 0 ? r12 : false;
                setMeasuredDimension(fjVar.z0, fjVar.A0);
            }
        } else {
            if (i34 != 1) {
                if (i34 == 2) {
                    ed[] edVarArr5 = edVarArr;
                    int i40 = i5;
                    i6 = i25;
                    iArr = iArr3;
                    i7 = size2;
                    i8 = i22;
                    i9 = i23;
                    i10 = i4;
                    int i41 = fjVar.V0;
                    int i42 = fjVar.U0;
                    if (i41 == 0) {
                        if (i42 <= 0) {
                            int i43 = 0;
                            i14 = 0;
                            for (int i44 = 0; i44 < i40; i44++) {
                                if (i44 > 0) {
                                    i43 += fjVar.P0;
                                }
                                ed edVar5 = edVarArr5[i44];
                                if (edVar5 != null) {
                                    int U = fjVar.U(edVar5, i28) + i43;
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
                                    i45 += fjVar.Q0;
                                }
                                ed edVar6 = edVarArr5[i47];
                                if (edVar6 != null) {
                                    int T = fjVar.T(edVar6, i28) + i45;
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
                    if (fjVar.Z0 == null) {
                        fjVar.Z0 = new int[2];
                    }
                    boolean z3 = (i42 == 0 && i41 == 1) || (i14 == 0 && i41 == 0);
                    while (!z3) {
                        if (i41 == 0) {
                            i42 = (int) Math.ceil(i40 / i14);
                        } else {
                            i14 = (int) Math.ceil(i40 / i42);
                        }
                        ed[] edVarArr6 = fjVar.Y0;
                        if (edVarArr6 == null || edVarArr6.length < i14) {
                            obj = null;
                            fjVar.Y0 = new ed[i14];
                        } else {
                            obj = null;
                            Arrays.fill(edVarArr6, (Object) null);
                        }
                        ed[] edVarArr7 = fjVar.X0;
                        if (edVarArr7 == null || edVarArr7.length < i42) {
                            fjVar.X0 = new ed[i42];
                        } else {
                            Arrays.fill(edVarArr7, obj);
                        }
                        for (int i48 = 0; i48 < i14; i48++) {
                            for (int i49 = 0; i49 < i42; i49++) {
                                int i50 = (i49 * i14) + i48;
                                if (i41 == 1) {
                                    i50 = (i48 * i42) + i49;
                                }
                                if (i50 < edVarArr5.length && (edVar = edVarArr5[i50]) != null) {
                                    int U2 = fjVar.U(edVar, i28);
                                    ed edVar7 = fjVar.Y0[i48];
                                    if (edVar7 == null || edVar7.q() < U2) {
                                        fjVar.Y0[i48] = edVar;
                                    }
                                    int T2 = fjVar.T(edVar, i28);
                                    ed edVar8 = fjVar.X0[i49];
                                    if (edVar8 == null || edVar8.k() < T2) {
                                        fjVar.X0[i49] = edVar;
                                    }
                                }
                            }
                        }
                        int i51 = 0;
                        for (int i52 = 0; i52 < i14; i52++) {
                            ed edVar9 = fjVar.Y0[i52];
                            if (edVar9 != null) {
                                if (i52 > 0) {
                                    i51 += fjVar.P0;
                                }
                                i51 = fjVar.U(edVar9, i28) + i51;
                            }
                        }
                        int i53 = 0;
                        for (int i54 = 0; i54 < i42; i54++) {
                            ed edVar10 = fjVar.X0[i54];
                            if (edVar10 != null) {
                                if (i54 > 0) {
                                    i53 += fjVar.Q0;
                                }
                                i53 = fjVar.T(edVar10, i28) + i53;
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
                    int[] iArr4 = fjVar.Z0;
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
                    int i56 = fjVar.V0;
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
                        ed[] edVarArr8 = edVarArr;
                        i8 = i22;
                        i6 = i25;
                        i9 = i23;
                        i10 = i4;
                        iArr = iArr3;
                        z2 = true;
                        ej ejVar3 = new ej(fjVar, i56, fjVar.I, fjVar.J, fjVar.K, fjVar.L, i28);
                        arrayList3.add(ejVar3);
                        if (i56 == 0) {
                            int i57 = 0;
                            int i58 = 0;
                            i15 = 0;
                            int i59 = 0;
                            while (i57 < i55) {
                                i58++;
                                ed edVar11 = edVarArr8[i57];
                                int U3 = fjVar.U(edVar11, i28);
                                int i60 = i56;
                                int i61 = i57;
                                if (edVar11.p0[0] == 3) {
                                    i15++;
                                }
                                int i62 = i15;
                                boolean z4 = (i59 == i28 || (fjVar.P0 + i59) + U3 > i28) && ejVar3.b != null;
                                if (!z4 && i61 > 0 && (i19 = fjVar.U0) > 0 && i58 > i19) {
                                    z4 = true;
                                }
                                if (z4) {
                                    i17 = size2;
                                    i56 = i60;
                                    i18 = i61;
                                    ejVar3 = new ej(fjVar, i56, fjVar.I, fjVar.J, fjVar.K, fjVar.L, i28);
                                    ejVar3.n = i18;
                                    arrayList3.add(ejVar3);
                                    i58 = 1;
                                } else {
                                    i17 = size2;
                                    i56 = i60;
                                    i18 = i61;
                                    if (i18 > 0) {
                                        i59 = fjVar.P0 + U3 + i59;
                                        ejVar3.a(edVar11);
                                        i57 = i18 + 1;
                                        i15 = i62;
                                        size2 = i17;
                                    }
                                }
                                i59 = U3;
                                ejVar3.a(edVar11);
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
                                ed edVar12 = edVarArr8[i63];
                                int T3 = fjVar.T(edVar12, i28);
                                int i67 = i56;
                                if (edVar12.p0[1] == 3) {
                                    i65++;
                                }
                                int i68 = i65;
                                boolean z5 = (i66 == i28 || (fjVar.Q0 + i66) + T3 > i28) && ejVar3.b != null;
                                if (!z5 && i63 > 0 && (i16 = fjVar.U0) > 0 && i64 > i16) {
                                    z5 = true;
                                }
                                if (z5) {
                                    i56 = i67;
                                    ejVar3 = new ej(fjVar, i56, fjVar.I, fjVar.J, fjVar.K, fjVar.L, i28);
                                    ejVar3.n = i63;
                                    arrayList3.add(ejVar3);
                                    i64 = 1;
                                } else {
                                    i56 = i67;
                                    if (i63 > 0) {
                                        i66 = fjVar.Q0 + T3 + i66;
                                        ejVar3.a(edVar12);
                                        i63++;
                                        i65 = i68;
                                    }
                                }
                                i66 = T3;
                                ejVar3.a(edVar12);
                                i63++;
                                i65 = i68;
                            }
                            i15 = i65;
                        }
                        int size3 = arrayList3.size();
                        int i69 = fjVar.w0;
                        int i70 = fjVar.s0;
                        int i71 = fjVar.x0;
                        int i72 = fjVar.t0;
                        boolean z6 = iArr2[0] == 2 || iArr2[1] == 2;
                        if (i15 > 0 && z6) {
                            for (int i73 = 0; i73 < size3; i73++) {
                                ej ejVar4 = (ej) arrayList3.get(i73);
                                if (i56 == 0) {
                                    ejVar4.e(i28 - ejVar4.d());
                                } else {
                                    ejVar4.e(i28 - ejVar4.c());
                                }
                            }
                        }
                        int i74 = i69;
                        int i75 = i70;
                        int i76 = i71;
                        int i77 = i72;
                        pc pcVar11 = pcVar8;
                        pc pcVar12 = pcVar9;
                        pc pcVar13 = pcVar10;
                        pc pcVar14 = pcVar4;
                        int i78 = 0;
                        int i79 = 0;
                        for (int i80 = 0; i80 < size3; i80++) {
                            ej ejVar5 = (ej) arrayList3.get(i80);
                            if (i56 == 0) {
                                if (i80 < size3 - 1) {
                                    pcVar13 = ((ej) arrayList3.get(i80 + 1)).b.J;
                                    i77 = 0;
                                } else {
                                    i77 = fjVar.t0;
                                    pcVar13 = pcVar10;
                                }
                                pc pcVar15 = ejVar5.b.L;
                                ejVar5.f(i56, pcVar11, pcVar14, pcVar12, pcVar13, i74, i75, i76, i77, i28);
                                i78 = Math.max(i78, ejVar5.d());
                                int c2 = ejVar5.c() + i79;
                                if (i80 > 0) {
                                    c2 += fjVar.Q0;
                                }
                                i79 = c2;
                                pcVar14 = pcVar15;
                                i75 = 0;
                            } else {
                                if (i80 < size3 - 1) {
                                    pcVar12 = ((ej) arrayList3.get(i80 + 1)).b.I;
                                    i76 = 0;
                                } else {
                                    i76 = fjVar.x0;
                                    pcVar12 = pcVar9;
                                }
                                pc pcVar16 = ejVar5.b.K;
                                ejVar5.f(i56, pcVar11, pcVar14, pcVar12, pcVar13, i74, i75, i76, i77, i28);
                                int d = ejVar5.d() + i78;
                                int max = Math.max(i79, ejVar5.c());
                                if (i80 > 0) {
                                    d += fjVar.P0;
                                }
                                i79 = max;
                                i78 = d;
                                pcVar11 = pcVar16;
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
                fjVar.z0 = size;
                fjVar.A0 = min;
                fjVar.O(size);
                fjVar.L(min);
                fjVar.y0 = fjVar.r0 > 0 ? r12 : false;
                setMeasuredDimension(fjVar.z0, fjVar.A0);
            }
            i6 = i25;
            iArr = iArr3;
            i7 = size2;
            i8 = i22;
            i9 = i23;
            i10 = i4;
            int i81 = i5;
            ed[] edVarArr9 = edVarArr;
            int i82 = fjVar.V0;
            if (i81 != 0) {
                arrayList3.clear();
                ej ejVar6 = new ej(fjVar, i82, fjVar.I, fjVar.J, fjVar.K, fjVar.L, i28);
                arrayList3.add(ejVar6);
                if (i82 == 0) {
                    int i83 = 0;
                    i11 = 0;
                    int i84 = 0;
                    while (i83 < i81) {
                        ed edVar13 = edVarArr9[i83];
                        int U4 = fjVar.U(edVar13, i28);
                        if (edVar13.p0[0] == 3) {
                            i11++;
                        }
                        int i85 = i11;
                        boolean z7 = (i84 == i28 || (fjVar.P0 + i84) + U4 > i28) && ejVar6.b != null;
                        if (!z7 && i83 > 0 && (i13 = fjVar.U0) > 0 && i83 % i13 == 0) {
                            z7 = true;
                        }
                        if (z7) {
                            ejVar6 = new ej(fjVar, i82, fjVar.I, fjVar.J, fjVar.K, fjVar.L, i28);
                            ejVar6.n = i83;
                            arrayList3.add(ejVar6);
                        } else if (i83 > 0) {
                            i84 = fjVar.P0 + U4 + i84;
                            ejVar6.a(edVar13);
                            i83++;
                            i11 = i85;
                        }
                        i84 = U4;
                        ejVar6.a(edVar13);
                        i83++;
                        i11 = i85;
                    }
                } else {
                    int i86 = 0;
                    i11 = 0;
                    int i87 = 0;
                    while (i86 < i81) {
                        ed edVar14 = edVarArr9[i86];
                        int T4 = fjVar.T(edVar14, i28);
                        if (edVar14.p0[1] == 3) {
                            i11++;
                        }
                        int i88 = i11;
                        boolean z8 = (i87 == i28 || (fjVar.Q0 + i87) + T4 > i28) && ejVar6.b != null;
                        if (!z8 && i86 > 0 && (i12 = fjVar.U0) > 0 && i86 % i12 == 0) {
                            z8 = true;
                        }
                        if (z8) {
                            ejVar6 = new ej(fjVar, i82, fjVar.I, fjVar.J, fjVar.K, fjVar.L, i28);
                            ejVar6.n = i86;
                            arrayList3.add(ejVar6);
                        } else if (i86 > 0) {
                            i87 = fjVar.Q0 + T4 + i87;
                            ejVar6.a(edVar14);
                            i86++;
                            i11 = i88;
                        }
                        i87 = T4;
                        ejVar6.a(edVar14);
                        i86++;
                        i11 = i88;
                    }
                }
                int size4 = arrayList3.size();
                int i89 = fjVar.w0;
                int i90 = fjVar.s0;
                int i91 = fjVar.x0;
                int i92 = fjVar.t0;
                boolean z9 = iArr2[0] == 2 || iArr2[1] == 2;
                if (i11 > 0 && z9) {
                    for (int i93 = 0; i93 < size4; i93++) {
                        ej ejVar7 = (ej) arrayList3.get(i93);
                        if (i82 == 0) {
                            ejVar7.e(i28 - ejVar7.d());
                        } else {
                            ejVar7.e(i28 - ejVar7.c());
                        }
                    }
                }
                int i94 = i89;
                int i95 = i90;
                int i96 = i91;
                int i97 = i92;
                pc pcVar17 = pcVar8;
                pc pcVar18 = pcVar9;
                pc pcVar19 = pcVar10;
                pc pcVar20 = pcVar4;
                int i98 = 0;
                int i99 = 0;
                for (int i100 = 0; i100 < size4; i100++) {
                    ej ejVar8 = (ej) arrayList3.get(i100);
                    if (i82 == 0) {
                        if (i100 < size4 - 1) {
                            pcVar19 = ((ej) arrayList3.get(i100 + 1)).b.J;
                            i97 = 0;
                        } else {
                            i97 = fjVar.t0;
                            pcVar19 = pcVar10;
                        }
                        pc pcVar21 = ejVar8.b.L;
                        ejVar8.f(i82, pcVar17, pcVar20, pcVar18, pcVar19, i94, i95, i96, i97, i28);
                        i98 = Math.max(i98, ejVar8.d());
                        int c3 = ejVar8.c() + i99;
                        if (i100 > 0) {
                            c3 += fjVar.Q0;
                        }
                        i99 = c3;
                        pcVar20 = pcVar21;
                        i95 = 0;
                    } else {
                        if (i100 < size4 - 1) {
                            pcVar18 = ((ej) arrayList3.get(i100 + 1)).b.I;
                            i96 = 0;
                        } else {
                            i96 = fjVar.x0;
                            pcVar18 = pcVar9;
                        }
                        pc pcVar22 = ejVar8.b.K;
                        ejVar8.f(i82, pcVar17, pcVar20, pcVar18, pcVar19, i94, i95, i96, i97, i28);
                        int d2 = ejVar8.d() + i98;
                        int max2 = Math.max(i99, ejVar8.c());
                        if (i100 > 0) {
                            d2 += fjVar.P0;
                        }
                        i99 = max2;
                        i98 = d2;
                        pcVar17 = pcVar22;
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
        fjVar.z0 = size;
        fjVar.A0 = min;
        fjVar.O(size);
        fjVar.L(min);
        fjVar.y0 = fjVar.r0 > 0 ? r12 : false;
        setMeasuredDimension(fjVar.z0, fjVar.A0);
    }

    @Override // defpackage.rc, android.view.View
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
        fj fjVar = this.o;
        fjVar.s0 = i;
        fjVar.t0 = i;
        fjVar.u0 = i;
        fjVar.v0 = i;
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

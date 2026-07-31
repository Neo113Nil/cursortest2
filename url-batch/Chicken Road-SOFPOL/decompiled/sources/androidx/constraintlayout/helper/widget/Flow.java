package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import b3.s;
import b3.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import y2.c;
import y2.d;
import y2.e;
import y2.f;
import y2.g;
import y2.h;
import z2.b;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class Flow extends u {

    /* renamed from: m, reason: collision with root package name */
    public final g f569m;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1073d = new int[32];
        this.f1078j = new HashMap();
        this.f1075f = context;
        super.g(attributeSet);
        g gVar = new g();
        gVar.f8817s0 = 0;
        gVar.f8818t0 = 0;
        gVar.f8819u0 = 0;
        gVar.f8820v0 = 0;
        gVar.f8821w0 = 0;
        gVar.f8822x0 = 0;
        gVar.f8823y0 = false;
        gVar.f8824z0 = 0;
        gVar.A0 = 0;
        gVar.B0 = new b();
        gVar.C0 = null;
        gVar.D0 = -1;
        gVar.E0 = -1;
        gVar.F0 = -1;
        gVar.G0 = -1;
        gVar.H0 = -1;
        gVar.I0 = -1;
        gVar.J0 = 0.5f;
        gVar.K0 = 0.5f;
        gVar.L0 = 0.5f;
        gVar.M0 = 0.5f;
        gVar.N0 = 0.5f;
        gVar.O0 = 0.5f;
        gVar.P0 = 0;
        gVar.Q0 = 0;
        gVar.R0 = 2;
        gVar.S0 = 2;
        gVar.T0 = 0;
        gVar.U0 = -1;
        gVar.V0 = 0;
        gVar.W0 = new ArrayList();
        gVar.X0 = null;
        gVar.Y0 = null;
        gVar.Z0 = null;
        gVar.f8816b1 = 0;
        this.f569m = gVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f1229b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f569m.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f569m;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f8817s0 = dimensionPixelSize;
                    gVar2.f8818t0 = dimensionPixelSize;
                    gVar2.f8819u0 = dimensionPixelSize;
                    gVar2.f8820v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f569m;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f8819u0 = dimensionPixelSize2;
                    gVar3.f8821w0 = dimensionPixelSize2;
                    gVar3.f8822x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f569m.f8820v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f569m.f8821w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f569m.f8817s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f569m.f8822x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f569m.f8818t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f569m.T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f569m.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f569m.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f569m.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f569m.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f569m.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f569m.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f569m.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f569m.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f569m.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f569m.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f569m.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f569m.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f569m.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f569m.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f569m.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f569m.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f569m.U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1076g = this.f569m;
        i();
    }

    @Override // b3.c
    public final void h(d dVar, boolean z3) {
        g gVar = this.f569m;
        int i = gVar.f8819u0;
        if (i > 0 || gVar.f8820v0 > 0) {
            if (z3) {
                gVar.f8821w0 = gVar.f8820v0;
                gVar.f8822x0 = i;
            } else {
                gVar.f8821w0 = i;
                gVar.f8822x0 = gVar.f8820v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0759  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v46 */
    @Override // b3.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(g gVar, int i, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        d[] dVarArr;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        int i17;
        f fVar;
        char c8;
        ?? r12;
        boolean z3;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Object obj;
        d dVar;
        boolean z7;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        c cVar;
        c cVar2;
        c cVar3;
        ArrayList arrayList;
        int i29;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        int[] iArr2 = gVar.f8777p0;
        c cVar4 = gVar.J;
        c cVar5 = gVar.I;
        c cVar6 = gVar.K;
        c cVar7 = gVar.L;
        ArrayList arrayList2 = gVar.W0;
        if (gVar.f8832r0 > 0) {
            b bVar = gVar.B0;
            d dVar2 = gVar.T;
            b3.f fVar2 = dVar2 != null ? ((e) dVar2).f8792u0 : null;
            if (fVar2 == null) {
                gVar.f8824z0 = 0;
                gVar.A0 = 0;
                gVar.f8823y0 = false;
                setMeasuredDimension(gVar.f8824z0, gVar.A0);
            }
            int i30 = 0;
            while (i30 < gVar.f8832r0) {
                d dVar3 = gVar.f8831q0[i30];
                if (dVar3 == null) {
                    cVar = cVar5;
                } else {
                    cVar = cVar5;
                    if (!(dVar3 instanceof h)) {
                        cVar2 = cVar6;
                        int j7 = dVar3.j(0);
                        cVar3 = cVar7;
                        int j8 = dVar3.j(1);
                        arrayList = arrayList2;
                        if (j7 == 3) {
                            i29 = i30;
                            if (dVar3.f8779r != 1 && j8 == 3 && dVar3.f8780s != 1) {
                                i30 = i29 + 1;
                                cVar5 = cVar;
                                cVar6 = cVar2;
                                cVar7 = cVar3;
                                arrayList2 = arrayList;
                            }
                        } else {
                            i29 = i30;
                        }
                        if (j7 == 3) {
                            j7 = 2;
                        }
                        if (j8 == 3) {
                            j8 = 2;
                        }
                        bVar.f9118a = j7;
                        bVar.f9119b = j8;
                        bVar.f9120c = dVar3.q();
                        bVar.f9121d = dVar3.k();
                        fVar2.b(dVar3, bVar);
                        dVar3.O(bVar.f9122e);
                        dVar3.L(bVar.f9123f);
                        dVar3.I(bVar.f9124g);
                        i30 = i29 + 1;
                        cVar5 = cVar;
                        cVar6 = cVar2;
                        cVar7 = cVar3;
                        arrayList2 = arrayList;
                    }
                }
                cVar2 = cVar6;
                cVar3 = cVar7;
                arrayList = arrayList2;
                i29 = i30;
                i30 = i29 + 1;
                cVar5 = cVar;
                cVar6 = cVar2;
                cVar7 = cVar3;
                arrayList2 = arrayList;
            }
        }
        c cVar8 = cVar5;
        c cVar9 = cVar6;
        c cVar10 = cVar7;
        ArrayList arrayList3 = arrayList2;
        int i31 = gVar.f8821w0;
        int i32 = gVar.f8822x0;
        int i33 = gVar.f8817s0;
        int i34 = gVar.f8818t0;
        int[] iArr3 = new int[2];
        int i35 = (size - i31) - i32;
        int i36 = gVar.V0;
        if (i36 == 1) {
            i35 = (size2 - i33) - i34;
        }
        int i37 = i35;
        if (i36 == 0) {
            if (gVar.D0 == -1) {
                i28 = 0;
                gVar.D0 = 0;
            } else {
                i28 = 0;
            }
            i9 = i32;
            if (gVar.E0 == -1) {
                gVar.E0 = i28;
            }
        } else {
            i9 = i32;
            if (gVar.D0 == -1) {
                gVar.D0 = 0;
            }
            if (gVar.E0 == -1) {
                gVar.E0 = 0;
            }
        }
        d[] dVarArr2 = gVar.f8831q0;
        int i38 = 0;
        int i39 = 0;
        while (true) {
            i10 = gVar.f8832r0;
            i11 = i33;
            if (i38 >= i10) {
                break;
            }
            if (gVar.f8831q0[i38].f8760g0 == 8) {
                i39++;
            }
            i38++;
            i33 = i11;
        }
        if (i39 > 0) {
            dVarArr = new d[i10 - i39];
            int i40 = 0;
            int i41 = 0;
            while (i40 < gVar.f8832r0) {
                d dVar4 = gVar.f8831q0[i40];
                d[] dVarArr3 = dVarArr;
                if (dVar4.f8760g0 != 8) {
                    dVarArr3[i41] = dVar4;
                    i41++;
                }
                i40++;
                dVarArr = dVarArr3;
            }
            i12 = i41;
        } else {
            i12 = i10;
            dVarArr = dVarArr2;
        }
        gVar.f8815a1 = dVarArr;
        gVar.f8816b1 = i12;
        int i42 = gVar.T0;
        if (i42 == 0) {
            d[] dVarArr4 = dVarArr;
            int i43 = i12;
            i13 = i34;
            iArr = iArr3;
            i14 = size2;
            i15 = i31;
            i16 = i9;
            i17 = i11;
            int i44 = gVar.V0;
            if (i43 != 0) {
                if (arrayList3.size() == 0) {
                    fVar = new f(gVar, i44, gVar.I, gVar.J, gVar.K, gVar.L, i37);
                    arrayList3.add(fVar);
                } else {
                    f fVar3 = (f) arrayList3.get(0);
                    fVar3.f8800c = 0;
                    fVar3.f8799b = null;
                    fVar3.f8808l = 0;
                    fVar3.f8809m = 0;
                    fVar3.f8810n = 0;
                    fVar3.f8811o = 0;
                    fVar3.f8812p = 0;
                    fVar3.f(i44, gVar.I, gVar.J, gVar.K, gVar.L, gVar.f8821w0, gVar.f8817s0, gVar.f8822x0, gVar.f8818t0, i37);
                    fVar = fVar3;
                }
                for (int i45 = 0; i45 < i43; i45++) {
                    fVar.a(dVarArr4[i45]);
                }
                c8 = 0;
                iArr[0] = fVar.d();
                r12 = 1;
                iArr[1] = fVar.c();
                int i46 = iArr[c8] + i15 + i16;
                int i47 = iArr[r12] + i17 + i13;
                if (mode != 1073741824) {
                }
                if (mode2 == 1073741824) {
                }
                gVar.f8824z0 = size;
                gVar.A0 = r0;
                gVar.O(size);
                gVar.L(r0);
                gVar.f8823y0 = gVar.f8832r0 > 0 ? r12 : false;
                setMeasuredDimension(gVar.f8824z0, gVar.A0);
            }
        } else {
            if (i42 != 1) {
                if (i42 == 2) {
                    d[] dVarArr5 = dVarArr;
                    int i48 = i12;
                    i13 = i34;
                    iArr = iArr3;
                    i14 = size2;
                    i15 = i31;
                    i16 = i9;
                    i17 = i11;
                    int i49 = gVar.V0;
                    if (i49 == 0) {
                        int i50 = gVar.U0;
                        if (i50 <= 0) {
                            int i51 = 0;
                            i22 = 0;
                            for (int i52 = 0; i52 < i48; i52++) {
                                if (i52 > 0) {
                                    i51 += gVar.P0;
                                }
                                d dVar5 = dVarArr5[i52];
                                if (dVar5 != null) {
                                    int U = gVar.U(dVar5, i37) + i51;
                                    if (U > i37) {
                                        break;
                                    }
                                    i22++;
                                    i51 = U;
                                }
                            }
                        } else {
                            i22 = i50;
                        }
                        i21 = 0;
                    } else {
                        i21 = gVar.U0;
                        if (i21 <= 0) {
                            int i53 = 0;
                            int i54 = 0;
                            for (int i55 = 0; i55 < i48; i55++) {
                                if (i55 > 0) {
                                    i53 += gVar.Q0;
                                }
                                d dVar6 = dVarArr5[i55];
                                if (dVar6 != null) {
                                    int T = gVar.T(dVar6, i37) + i53;
                                    if (T > i37) {
                                        break;
                                    }
                                    i54++;
                                    i53 = T;
                                }
                            }
                            i21 = i54;
                        }
                        i22 = 0;
                    }
                    if (gVar.Z0 == null) {
                        gVar.Z0 = new int[2];
                    }
                    boolean z8 = (i21 == 0 && i49 == 1) || (i22 == 0 && i49 == 0);
                    while (!z8) {
                        if (i49 == 0) {
                            i21 = (int) Math.ceil(i48 / i22);
                        } else {
                            i22 = (int) Math.ceil(i48 / i21);
                        }
                        d[] dVarArr6 = gVar.Y0;
                        if (dVarArr6 == null || dVarArr6.length < i22) {
                            obj = null;
                            gVar.Y0 = new d[i22];
                        } else {
                            obj = null;
                            Arrays.fill(dVarArr6, (Object) null);
                        }
                        d[] dVarArr7 = gVar.X0;
                        if (dVarArr7 == null || dVarArr7.length < i21) {
                            gVar.X0 = new d[i21];
                        } else {
                            Arrays.fill(dVarArr7, obj);
                        }
                        for (int i56 = 0; i56 < i22; i56++) {
                            for (int i57 = 0; i57 < i21; i57++) {
                                int i58 = (i57 * i22) + i56;
                                if (i49 == 1) {
                                    i58 = (i56 * i21) + i57;
                                }
                                if (i58 < dVarArr5.length && (dVar = dVarArr5[i58]) != null) {
                                    int U2 = gVar.U(dVar, i37);
                                    d dVar7 = gVar.Y0[i56];
                                    if (dVar7 == null || dVar7.q() < U2) {
                                        gVar.Y0[i56] = dVar;
                                    }
                                    int T2 = gVar.T(dVar, i37);
                                    d dVar8 = gVar.X0[i57];
                                    if (dVar8 == null || dVar8.k() < T2) {
                                        gVar.X0[i57] = dVar;
                                    }
                                }
                            }
                        }
                        int i59 = 0;
                        for (int i60 = 0; i60 < i22; i60++) {
                            d dVar9 = gVar.Y0[i60];
                            if (dVar9 != null) {
                                if (i60 > 0) {
                                    i59 += gVar.P0;
                                }
                                i59 = gVar.U(dVar9, i37) + i59;
                            }
                        }
                        int i61 = 0;
                        for (int i62 = 0; i62 < i21; i62++) {
                            d dVar10 = gVar.X0[i62];
                            if (dVar10 != null) {
                                if (i62 > 0) {
                                    i61 += gVar.Q0;
                                }
                                i61 = gVar.T(dVar10, i37) + i61;
                            }
                        }
                        iArr[0] = i59;
                        iArr[1] = i61;
                        if (i49 == 0) {
                            if (i59 > i37 && i22 > 1) {
                                i22--;
                            }
                            z8 = true;
                        } else {
                            if (i61 > i37 && i21 > 1) {
                                i21--;
                            }
                            z8 = true;
                        }
                    }
                    z3 = true;
                    int[] iArr4 = gVar.Z0;
                    iArr4[0] = i22;
                    iArr4[1] = i21;
                } else if (i42 != 3) {
                    i13 = i34;
                    iArr = iArr3;
                    i14 = size2;
                    i15 = i31;
                    i16 = i9;
                    i17 = i11;
                } else {
                    int i63 = i12;
                    int i64 = gVar.V0;
                    if (i63 == 0) {
                        i13 = i34;
                        iArr = iArr3;
                        i14 = size2;
                        i15 = i31;
                        i16 = i9;
                        i17 = i11;
                        z7 = true;
                    } else {
                        arrayList3.clear();
                        d[] dVarArr8 = dVarArr;
                        i15 = i31;
                        i13 = i34;
                        i16 = i9;
                        i17 = i11;
                        iArr = iArr3;
                        z7 = true;
                        f fVar4 = new f(gVar, i64, gVar.I, gVar.J, gVar.K, gVar.L, i37);
                        arrayList3.add(fVar4);
                        if (i64 == 0) {
                            int i65 = 0;
                            int i66 = 0;
                            i23 = 0;
                            int i67 = 0;
                            while (i65 < i63) {
                                i66++;
                                d dVar11 = dVarArr8[i65];
                                int U3 = gVar.U(dVar11, i37);
                                int i68 = i64;
                                int i69 = i65;
                                if (dVar11.f8777p0[0] == 3) {
                                    i23++;
                                }
                                int i70 = i23;
                                boolean z9 = (i67 == i37 || (gVar.P0 + i67) + U3 > i37) && fVar4.f8799b != null;
                                if (!z9 && i69 > 0 && (i27 = gVar.U0) > 0 && i66 > i27) {
                                    z9 = true;
                                }
                                if (z9) {
                                    i25 = size2;
                                    i64 = i68;
                                    i26 = i69;
                                    fVar4 = new f(gVar, i64, gVar.I, gVar.J, gVar.K, gVar.L, i37);
                                    fVar4.f8810n = i26;
                                    arrayList3.add(fVar4);
                                    i66 = 1;
                                } else {
                                    i25 = size2;
                                    i64 = i68;
                                    i26 = i69;
                                    if (i26 > 0) {
                                        i67 = gVar.P0 + U3 + i67;
                                        fVar4.a(dVar11);
                                        i65 = i26 + 1;
                                        i23 = i70;
                                        size2 = i25;
                                    }
                                }
                                i67 = U3;
                                fVar4.a(dVar11);
                                i65 = i26 + 1;
                                i23 = i70;
                                size2 = i25;
                            }
                            i14 = size2;
                        } else {
                            i14 = size2;
                            int i71 = 0;
                            int i72 = 0;
                            int i73 = 0;
                            int i74 = 0;
                            while (i71 < i63) {
                                i72++;
                                d dVar12 = dVarArr8[i71];
                                int T3 = gVar.T(dVar12, i37);
                                int i75 = i64;
                                if (dVar12.f8777p0[1] == 3) {
                                    i73++;
                                }
                                int i76 = i73;
                                boolean z10 = (i74 == i37 || (gVar.Q0 + i74) + T3 > i37) && fVar4.f8799b != null;
                                if (!z10 && i71 > 0 && (i24 = gVar.U0) > 0 && i72 > i24) {
                                    z10 = true;
                                }
                                if (z10) {
                                    i64 = i75;
                                    fVar4 = new f(gVar, i64, gVar.I, gVar.J, gVar.K, gVar.L, i37);
                                    fVar4.f8810n = i71;
                                    arrayList3.add(fVar4);
                                    i72 = 1;
                                } else {
                                    i64 = i75;
                                    if (i71 > 0) {
                                        i74 = gVar.Q0 + T3 + i74;
                                        fVar4.a(dVar12);
                                        i71++;
                                        i73 = i76;
                                    }
                                }
                                i74 = T3;
                                fVar4.a(dVar12);
                                i71++;
                                i73 = i76;
                            }
                            i23 = i73;
                        }
                        int size3 = arrayList3.size();
                        int i77 = gVar.f8821w0;
                        int i78 = gVar.f8817s0;
                        int i79 = gVar.f8822x0;
                        int i80 = gVar.f8818t0;
                        boolean z11 = iArr2[0] == 2 || iArr2[1] == 2;
                        if (i23 > 0 && z11) {
                            for (int i81 = 0; i81 < size3; i81++) {
                                f fVar5 = (f) arrayList3.get(i81);
                                if (i64 == 0) {
                                    fVar5.e(i37 - fVar5.d());
                                } else {
                                    fVar5.e(i37 - fVar5.c());
                                }
                            }
                        }
                        int i82 = i77;
                        int i83 = i78;
                        int i84 = i79;
                        int i85 = i80;
                        c cVar11 = cVar8;
                        c cVar12 = cVar9;
                        c cVar13 = cVar10;
                        c cVar14 = cVar4;
                        int i86 = 0;
                        int i87 = 0;
                        for (int i88 = 0; i88 < size3; i88++) {
                            f fVar6 = (f) arrayList3.get(i88);
                            if (i64 == 0) {
                                if (i88 < size3 - 1) {
                                    cVar13 = ((f) arrayList3.get(i88 + 1)).f8799b.J;
                                    i85 = 0;
                                } else {
                                    i85 = gVar.f8818t0;
                                    cVar13 = cVar10;
                                }
                                c cVar15 = fVar6.f8799b.L;
                                fVar6.f(i64, cVar11, cVar14, cVar12, cVar13, i82, i83, i84, i85, i37);
                                i86 = Math.max(i86, fVar6.d());
                                int c9 = fVar6.c() + i87;
                                if (i88 > 0) {
                                    c9 += gVar.Q0;
                                }
                                i87 = c9;
                                cVar14 = cVar15;
                                i83 = 0;
                            } else {
                                if (i88 < size3 - 1) {
                                    cVar12 = ((f) arrayList3.get(i88 + 1)).f8799b.I;
                                    i84 = 0;
                                } else {
                                    i84 = gVar.f8822x0;
                                    cVar12 = cVar9;
                                }
                                c cVar16 = fVar6.f8799b.K;
                                fVar6.f(i64, cVar11, cVar14, cVar12, cVar13, i82, i83, i84, i85, i37);
                                int d8 = fVar6.d() + i86;
                                int max = Math.max(i87, fVar6.c());
                                if (i88 > 0) {
                                    d8 += gVar.P0;
                                }
                                i87 = max;
                                i86 = d8;
                                cVar11 = cVar16;
                                i82 = 0;
                            }
                        }
                        iArr[0] = i86;
                        iArr[1] = i87;
                    }
                    z3 = z7;
                }
                c8 = 0;
                r12 = z3;
                int i462 = iArr[c8] + i15 + i16;
                int i472 = iArr[r12] + i17 + i13;
                if (mode != 1073741824) {
                    size = mode == Integer.MIN_VALUE ? Math.min(i462, size) : mode == 0 ? i462 : 0;
                }
                int min = mode2 == 1073741824 ? i14 : mode2 == Integer.MIN_VALUE ? Math.min(i472, i14) : mode2 == 0 ? i472 : 0;
                gVar.f8824z0 = size;
                gVar.A0 = min;
                gVar.O(size);
                gVar.L(min);
                gVar.f8823y0 = gVar.f8832r0 > 0 ? r12 : false;
                setMeasuredDimension(gVar.f8824z0, gVar.A0);
            }
            i13 = i34;
            iArr = iArr3;
            i14 = size2;
            i15 = i31;
            i16 = i9;
            i17 = i11;
            int i89 = i12;
            d[] dVarArr9 = dVarArr;
            int i90 = gVar.V0;
            if (i89 != 0) {
                arrayList3.clear();
                f fVar7 = new f(gVar, i90, gVar.I, gVar.J, gVar.K, gVar.L, i37);
                arrayList3.add(fVar7);
                if (i90 == 0) {
                    int i91 = 0;
                    i18 = 0;
                    int i92 = 0;
                    while (i91 < i89) {
                        d dVar13 = dVarArr9[i91];
                        int U4 = gVar.U(dVar13, i37);
                        if (dVar13.f8777p0[0] == 3) {
                            i18++;
                        }
                        int i93 = i18;
                        boolean z12 = (i92 == i37 || (gVar.P0 + i92) + U4 > i37) && fVar7.f8799b != null;
                        if (!z12 && i91 > 0 && (i20 = gVar.U0) > 0 && i91 % i20 == 0) {
                            z12 = true;
                        }
                        if (z12) {
                            fVar7 = new f(gVar, i90, gVar.I, gVar.J, gVar.K, gVar.L, i37);
                            fVar7.f8810n = i91;
                            arrayList3.add(fVar7);
                        } else if (i91 > 0) {
                            i92 = gVar.P0 + U4 + i92;
                            fVar7.a(dVar13);
                            i91++;
                            i18 = i93;
                        }
                        i92 = U4;
                        fVar7.a(dVar13);
                        i91++;
                        i18 = i93;
                    }
                } else {
                    int i94 = 0;
                    i18 = 0;
                    int i95 = 0;
                    while (i94 < i89) {
                        d dVar14 = dVarArr9[i94];
                        int T4 = gVar.T(dVar14, i37);
                        if (dVar14.f8777p0[1] == 3) {
                            i18++;
                        }
                        int i96 = i18;
                        boolean z13 = (i95 == i37 || (gVar.Q0 + i95) + T4 > i37) && fVar7.f8799b != null;
                        if (!z13 && i94 > 0 && (i19 = gVar.U0) > 0 && i94 % i19 == 0) {
                            z13 = true;
                        }
                        if (z13) {
                            fVar7 = new f(gVar, i90, gVar.I, gVar.J, gVar.K, gVar.L, i37);
                            fVar7.f8810n = i94;
                            arrayList3.add(fVar7);
                        } else if (i94 > 0) {
                            i95 = gVar.Q0 + T4 + i95;
                            fVar7.a(dVar14);
                            i94++;
                            i18 = i96;
                        }
                        i95 = T4;
                        fVar7.a(dVar14);
                        i94++;
                        i18 = i96;
                    }
                }
                int size4 = arrayList3.size();
                int i97 = gVar.f8821w0;
                int i98 = gVar.f8817s0;
                int i99 = gVar.f8822x0;
                int i100 = gVar.f8818t0;
                boolean z14 = iArr2[0] == 2 || iArr2[1] == 2;
                if (i18 > 0 && z14) {
                    for (int i101 = 0; i101 < size4; i101++) {
                        f fVar8 = (f) arrayList3.get(i101);
                        if (i90 == 0) {
                            fVar8.e(i37 - fVar8.d());
                        } else {
                            fVar8.e(i37 - fVar8.c());
                        }
                    }
                }
                int i102 = i97;
                int i103 = i98;
                int i104 = i99;
                int i105 = i100;
                c cVar17 = cVar8;
                c cVar18 = cVar9;
                c cVar19 = cVar10;
                c cVar20 = cVar4;
                int i106 = 0;
                int i107 = 0;
                for (int i108 = 0; i108 < size4; i108++) {
                    f fVar9 = (f) arrayList3.get(i108);
                    if (i90 == 0) {
                        if (i108 < size4 - 1) {
                            cVar19 = ((f) arrayList3.get(i108 + 1)).f8799b.J;
                            i105 = 0;
                        } else {
                            i105 = gVar.f8818t0;
                            cVar19 = cVar10;
                        }
                        c cVar21 = fVar9.f8799b.L;
                        fVar9.f(i90, cVar17, cVar20, cVar18, cVar19, i102, i103, i104, i105, i37);
                        i106 = Math.max(i106, fVar9.d());
                        int c10 = fVar9.c() + i107;
                        if (i108 > 0) {
                            c10 += gVar.Q0;
                        }
                        i107 = c10;
                        cVar20 = cVar21;
                        i103 = 0;
                    } else {
                        if (i108 < size4 - 1) {
                            cVar18 = ((f) arrayList3.get(i108 + 1)).f8799b.I;
                            i104 = 0;
                        } else {
                            i104 = gVar.f8822x0;
                            cVar18 = cVar9;
                        }
                        c cVar22 = fVar9.f8799b.K;
                        fVar9.f(i90, cVar17, cVar20, cVar18, cVar19, i102, i103, i104, i105, i37);
                        int d9 = fVar9.d() + i106;
                        int max2 = Math.max(i107, fVar9.c());
                        if (i108 > 0) {
                            d9 += gVar.P0;
                        }
                        i107 = max2;
                        i106 = d9;
                        cVar17 = cVar22;
                        i102 = 0;
                    }
                }
                iArr[0] = i106;
                iArr[1] = i107;
            }
        }
        z3 = true;
        c8 = 0;
        r12 = z3;
        int i4622 = iArr[c8] + i15 + i16;
        int i4722 = iArr[r12] + i17 + i13;
        if (mode != 1073741824) {
        }
        if (mode2 == 1073741824) {
        }
        gVar.f8824z0 = size;
        gVar.A0 = min;
        gVar.O(size);
        gVar.L(min);
        gVar.f8823y0 = gVar.f8832r0 > 0 ? r12 : false;
        setMeasuredDimension(gVar.f8824z0, gVar.A0);
    }

    @Override // b3.c, android.view.View
    public final void onMeasure(int i, int i8) {
        j(this.f569m, i, i8);
    }

    public void setFirstHorizontalBias(float f6) {
        this.f569m.L0 = f6;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f569m.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f6) {
        this.f569m.M0 = f6;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f569m.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f569m.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f6) {
        this.f569m.J0 = f6;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f569m.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f569m.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f6) {
        this.f569m.N0 = f6;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f569m.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f6) {
        this.f569m.O0 = f6;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f569m.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f569m.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f569m.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.f569m;
        gVar.f8817s0 = i;
        gVar.f8818t0 = i;
        gVar.f8819u0 = i;
        gVar.f8820v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f569m.f8818t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f569m.f8821w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f569m.f8822x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f569m.f8817s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f569m.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f6) {
        this.f569m.K0 = f6;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f569m.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f569m.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f569m.T0 = i;
        requestLayout();
    }
}

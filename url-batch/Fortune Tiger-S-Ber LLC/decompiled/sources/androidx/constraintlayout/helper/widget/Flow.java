package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import s.c;
import s.d;
import s.e;
import s.f;
import s.g;
import s.h;
import t.b;
import v.q;
import v.s;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class Flow extends s {

    /* renamed from: o, reason: collision with root package name */
    public final g f257o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3439f = new int[32];
        this.f3443l = new HashMap();
        this.h = context;
        super.g(attributeSet);
        g gVar = new g();
        gVar.f3297s0 = 0;
        gVar.f3298t0 = 0;
        gVar.f3299u0 = 0;
        gVar.f3300v0 = 0;
        gVar.f3301w0 = 0;
        gVar.f3302x0 = 0;
        gVar.f3303y0 = false;
        gVar.f3304z0 = 0;
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
        gVar.f3296b1 = 0;
        this.f257o = gVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f3569b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 0) {
                    this.f257o.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f257o;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f3297s0 = dimensionPixelSize;
                    gVar2.f3298t0 = dimensionPixelSize;
                    gVar2.f3299u0 = dimensionPixelSize;
                    gVar2.f3300v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f257o;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f3299u0 = dimensionPixelSize2;
                    gVar3.f3301w0 = dimensionPixelSize2;
                    gVar3.f3302x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f257o.f3300v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f257o.f3301w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f257o.f3297s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f257o.f3302x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f257o.f3298t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f257o.T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f257o.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f257o.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f257o.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f257o.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f257o.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f257o.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f257o.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f257o.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f257o.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f257o.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f257o.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f257o.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f257o.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f257o.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f257o.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f257o.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f257o.U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3440i = this.f257o;
        i();
    }

    @Override // v.c
    public final void h(d dVar, boolean z3) {
        g gVar = this.f257o;
        int i4 = gVar.f3299u0;
        if (i4 > 0 || gVar.f3300v0 > 0) {
            if (z3) {
                gVar.f3301w0 = gVar.f3300v0;
                gVar.f3302x0 = i4;
            } else {
                gVar.f3301w0 = i4;
                gVar.f3302x0 = gVar.f3300v0;
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
    @Override // v.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(g gVar, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        d[] dVarArr;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        f fVar;
        char c;
        ?? r12;
        boolean z3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Object obj;
        d dVar;
        boolean z4;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        c cVar;
        c cVar2;
        c cVar3;
        ArrayList arrayList;
        int i26;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        int[] iArr2 = gVar.f3259p0;
        c cVar4 = gVar.J;
        c cVar5 = gVar.I;
        c cVar6 = gVar.K;
        c cVar7 = gVar.L;
        ArrayList arrayList2 = gVar.W0;
        if (gVar.f3312r0 > 0) {
            b bVar = gVar.B0;
            d dVar2 = gVar.T;
            v.f fVar2 = dVar2 != null ? ((e) dVar2).f3274u0 : null;
            if (fVar2 == null) {
                gVar.f3304z0 = 0;
                gVar.A0 = 0;
                gVar.f3303y0 = false;
                setMeasuredDimension(gVar.f3304z0, gVar.A0);
            }
            int i27 = 0;
            while (i27 < gVar.f3312r0) {
                d dVar3 = gVar.f3311q0[i27];
                if (dVar3 == null) {
                    cVar = cVar5;
                } else {
                    cVar = cVar5;
                    if (!(dVar3 instanceof h)) {
                        cVar2 = cVar6;
                        int j4 = dVar3.j(0);
                        cVar3 = cVar7;
                        int j5 = dVar3.j(1);
                        arrayList = arrayList2;
                        if (j4 == 3) {
                            i26 = i27;
                            if (dVar3.f3261r != 1 && j5 == 3 && dVar3.f3262s != 1) {
                                i27 = i26 + 1;
                                cVar5 = cVar;
                                cVar6 = cVar2;
                                cVar7 = cVar3;
                                arrayList2 = arrayList;
                            }
                        } else {
                            i26 = i27;
                        }
                        if (j4 == 3) {
                            j4 = 2;
                        }
                        if (j5 == 3) {
                            j5 = 2;
                        }
                        bVar.f3319a = j4;
                        bVar.f3320b = j5;
                        bVar.c = dVar3.q();
                        bVar.f3321d = dVar3.k();
                        fVar2.b(dVar3, bVar);
                        dVar3.O(bVar.f3322e);
                        dVar3.L(bVar.f3323f);
                        dVar3.I(bVar.g);
                        i27 = i26 + 1;
                        cVar5 = cVar;
                        cVar6 = cVar2;
                        cVar7 = cVar3;
                        arrayList2 = arrayList;
                    }
                }
                cVar2 = cVar6;
                cVar3 = cVar7;
                arrayList = arrayList2;
                i26 = i27;
                i27 = i26 + 1;
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
        int i28 = gVar.f3301w0;
        int i29 = gVar.f3302x0;
        int i30 = gVar.f3297s0;
        int i31 = gVar.f3298t0;
        int[] iArr3 = new int[2];
        int i32 = (size - i28) - i29;
        int i33 = gVar.V0;
        if (i33 == 1) {
            i32 = (size2 - i30) - i31;
        }
        int i34 = i32;
        if (i33 == 0) {
            if (gVar.D0 == -1) {
                i25 = 0;
                gVar.D0 = 0;
            } else {
                i25 = 0;
            }
            i6 = i29;
            if (gVar.E0 == -1) {
                gVar.E0 = i25;
            }
        } else {
            i6 = i29;
            if (gVar.D0 == -1) {
                gVar.D0 = 0;
            }
            if (gVar.E0 == -1) {
                gVar.E0 = 0;
            }
        }
        d[] dVarArr2 = gVar.f3311q0;
        int i35 = 0;
        int i36 = 0;
        while (true) {
            i7 = gVar.f3312r0;
            i8 = i30;
            if (i35 >= i7) {
                break;
            }
            if (gVar.f3311q0[i35].f3242g0 == 8) {
                i36++;
            }
            i35++;
            i30 = i8;
        }
        if (i36 > 0) {
            dVarArr = new d[i7 - i36];
            int i37 = 0;
            int i38 = 0;
            while (i37 < gVar.f3312r0) {
                d dVar4 = gVar.f3311q0[i37];
                d[] dVarArr3 = dVarArr;
                if (dVar4.f3242g0 != 8) {
                    dVarArr3[i38] = dVar4;
                    i38++;
                }
                i37++;
                dVarArr = dVarArr3;
            }
            i9 = i38;
        } else {
            i9 = i7;
            dVarArr = dVarArr2;
        }
        gVar.f3295a1 = dVarArr;
        gVar.f3296b1 = i9;
        int i39 = gVar.T0;
        if (i39 == 0) {
            d[] dVarArr4 = dVarArr;
            int i40 = i9;
            i10 = i31;
            iArr = iArr3;
            i11 = size2;
            i12 = i28;
            i13 = i6;
            i14 = i8;
            int i41 = gVar.V0;
            if (i40 != 0) {
                if (arrayList3.size() == 0) {
                    fVar = new f(gVar, i41, gVar.I, gVar.J, gVar.K, gVar.L, i34);
                    arrayList3.add(fVar);
                } else {
                    f fVar3 = (f) arrayList3.get(0);
                    fVar3.c = 0;
                    fVar3.f3281b = null;
                    fVar3.f3288l = 0;
                    fVar3.f3289m = 0;
                    fVar3.f3290n = 0;
                    fVar3.f3291o = 0;
                    fVar3.f3292p = 0;
                    fVar3.f(i41, gVar.I, gVar.J, gVar.K, gVar.L, gVar.f3301w0, gVar.f3297s0, gVar.f3302x0, gVar.f3298t0, i34);
                    fVar = fVar3;
                }
                for (int i42 = 0; i42 < i40; i42++) {
                    fVar.a(dVarArr4[i42]);
                }
                c = 0;
                iArr[0] = fVar.d();
                r12 = 1;
                iArr[1] = fVar.c();
                int i43 = iArr[c] + i12 + i13;
                int i44 = iArr[r12] + i14 + i10;
                if (mode != 1073741824) {
                }
                if (mode2 == 1073741824) {
                }
                gVar.f3304z0 = size;
                gVar.A0 = r0;
                gVar.O(size);
                gVar.L(r0);
                gVar.f3303y0 = gVar.f3312r0 > 0 ? r12 : false;
                setMeasuredDimension(gVar.f3304z0, gVar.A0);
            }
        } else {
            if (i39 != 1) {
                if (i39 == 2) {
                    d[] dVarArr5 = dVarArr;
                    int i45 = i9;
                    i10 = i31;
                    iArr = iArr3;
                    i11 = size2;
                    i12 = i28;
                    i13 = i6;
                    i14 = i8;
                    int i46 = gVar.V0;
                    if (i46 == 0) {
                        int i47 = gVar.U0;
                        if (i47 <= 0) {
                            int i48 = 0;
                            i19 = 0;
                            for (int i49 = 0; i49 < i45; i49++) {
                                if (i49 > 0) {
                                    i48 += gVar.P0;
                                }
                                d dVar5 = dVarArr5[i49];
                                if (dVar5 != null) {
                                    int U = gVar.U(dVar5, i34) + i48;
                                    if (U > i34) {
                                        break;
                                    }
                                    i19++;
                                    i48 = U;
                                }
                            }
                        } else {
                            i19 = i47;
                        }
                        i18 = 0;
                    } else {
                        i18 = gVar.U0;
                        if (i18 <= 0) {
                            int i50 = 0;
                            int i51 = 0;
                            for (int i52 = 0; i52 < i45; i52++) {
                                if (i52 > 0) {
                                    i50 += gVar.Q0;
                                }
                                d dVar6 = dVarArr5[i52];
                                if (dVar6 != null) {
                                    int T = gVar.T(dVar6, i34) + i50;
                                    if (T > i34) {
                                        break;
                                    }
                                    i51++;
                                    i50 = T;
                                }
                            }
                            i18 = i51;
                        }
                        i19 = 0;
                    }
                    if (gVar.Z0 == null) {
                        gVar.Z0 = new int[2];
                    }
                    boolean z5 = (i18 == 0 && i46 == 1) || (i19 == 0 && i46 == 0);
                    while (!z5) {
                        if (i46 == 0) {
                            i18 = (int) Math.ceil(i45 / i19);
                        } else {
                            i19 = (int) Math.ceil(i45 / i18);
                        }
                        d[] dVarArr6 = gVar.Y0;
                        if (dVarArr6 == null || dVarArr6.length < i19) {
                            obj = null;
                            gVar.Y0 = new d[i19];
                        } else {
                            obj = null;
                            Arrays.fill(dVarArr6, (Object) null);
                        }
                        d[] dVarArr7 = gVar.X0;
                        if (dVarArr7 == null || dVarArr7.length < i18) {
                            gVar.X0 = new d[i18];
                        } else {
                            Arrays.fill(dVarArr7, obj);
                        }
                        for (int i53 = 0; i53 < i19; i53++) {
                            for (int i54 = 0; i54 < i18; i54++) {
                                int i55 = (i54 * i19) + i53;
                                if (i46 == 1) {
                                    i55 = (i53 * i18) + i54;
                                }
                                if (i55 < dVarArr5.length && (dVar = dVarArr5[i55]) != null) {
                                    int U2 = gVar.U(dVar, i34);
                                    d dVar7 = gVar.Y0[i53];
                                    if (dVar7 == null || dVar7.q() < U2) {
                                        gVar.Y0[i53] = dVar;
                                    }
                                    int T2 = gVar.T(dVar, i34);
                                    d dVar8 = gVar.X0[i54];
                                    if (dVar8 == null || dVar8.k() < T2) {
                                        gVar.X0[i54] = dVar;
                                    }
                                }
                            }
                        }
                        int i56 = 0;
                        for (int i57 = 0; i57 < i19; i57++) {
                            d dVar9 = gVar.Y0[i57];
                            if (dVar9 != null) {
                                if (i57 > 0) {
                                    i56 += gVar.P0;
                                }
                                i56 = gVar.U(dVar9, i34) + i56;
                            }
                        }
                        int i58 = 0;
                        for (int i59 = 0; i59 < i18; i59++) {
                            d dVar10 = gVar.X0[i59];
                            if (dVar10 != null) {
                                if (i59 > 0) {
                                    i58 += gVar.Q0;
                                }
                                i58 = gVar.T(dVar10, i34) + i58;
                            }
                        }
                        iArr[0] = i56;
                        iArr[1] = i58;
                        if (i46 == 0) {
                            if (i56 > i34 && i19 > 1) {
                                i19--;
                            }
                            z5 = true;
                        } else {
                            if (i58 > i34 && i18 > 1) {
                                i18--;
                            }
                            z5 = true;
                        }
                    }
                    z3 = true;
                    int[] iArr4 = gVar.Z0;
                    iArr4[0] = i19;
                    iArr4[1] = i18;
                } else if (i39 != 3) {
                    i10 = i31;
                    iArr = iArr3;
                    i11 = size2;
                    i12 = i28;
                    i13 = i6;
                    i14 = i8;
                } else {
                    int i60 = i9;
                    int i61 = gVar.V0;
                    if (i60 == 0) {
                        i10 = i31;
                        iArr = iArr3;
                        i11 = size2;
                        i12 = i28;
                        i13 = i6;
                        i14 = i8;
                        z4 = true;
                    } else {
                        arrayList3.clear();
                        d[] dVarArr8 = dVarArr;
                        i12 = i28;
                        i10 = i31;
                        i13 = i6;
                        i14 = i8;
                        iArr = iArr3;
                        z4 = true;
                        f fVar4 = new f(gVar, i61, gVar.I, gVar.J, gVar.K, gVar.L, i34);
                        arrayList3.add(fVar4);
                        if (i61 == 0) {
                            int i62 = 0;
                            int i63 = 0;
                            i20 = 0;
                            int i64 = 0;
                            while (i62 < i60) {
                                i63++;
                                d dVar11 = dVarArr8[i62];
                                int U3 = gVar.U(dVar11, i34);
                                int i65 = i61;
                                int i66 = i62;
                                if (dVar11.f3259p0[0] == 3) {
                                    i20++;
                                }
                                int i67 = i20;
                                boolean z6 = (i64 == i34 || (gVar.P0 + i64) + U3 > i34) && fVar4.f3281b != null;
                                if (!z6 && i66 > 0 && (i24 = gVar.U0) > 0 && i63 > i24) {
                                    z6 = true;
                                }
                                if (z6) {
                                    i22 = size2;
                                    i61 = i65;
                                    i23 = i66;
                                    fVar4 = new f(gVar, i61, gVar.I, gVar.J, gVar.K, gVar.L, i34);
                                    fVar4.f3290n = i23;
                                    arrayList3.add(fVar4);
                                    i63 = 1;
                                } else {
                                    i22 = size2;
                                    i61 = i65;
                                    i23 = i66;
                                    if (i23 > 0) {
                                        i64 = gVar.P0 + U3 + i64;
                                        fVar4.a(dVar11);
                                        i62 = i23 + 1;
                                        i20 = i67;
                                        size2 = i22;
                                    }
                                }
                                i64 = U3;
                                fVar4.a(dVar11);
                                i62 = i23 + 1;
                                i20 = i67;
                                size2 = i22;
                            }
                            i11 = size2;
                        } else {
                            i11 = size2;
                            int i68 = 0;
                            int i69 = 0;
                            int i70 = 0;
                            int i71 = 0;
                            while (i68 < i60) {
                                i69++;
                                d dVar12 = dVarArr8[i68];
                                int T3 = gVar.T(dVar12, i34);
                                int i72 = i61;
                                if (dVar12.f3259p0[1] == 3) {
                                    i70++;
                                }
                                int i73 = i70;
                                boolean z7 = (i71 == i34 || (gVar.Q0 + i71) + T3 > i34) && fVar4.f3281b != null;
                                if (!z7 && i68 > 0 && (i21 = gVar.U0) > 0 && i69 > i21) {
                                    z7 = true;
                                }
                                if (z7) {
                                    i61 = i72;
                                    fVar4 = new f(gVar, i61, gVar.I, gVar.J, gVar.K, gVar.L, i34);
                                    fVar4.f3290n = i68;
                                    arrayList3.add(fVar4);
                                    i69 = 1;
                                } else {
                                    i61 = i72;
                                    if (i68 > 0) {
                                        i71 = gVar.Q0 + T3 + i71;
                                        fVar4.a(dVar12);
                                        i68++;
                                        i70 = i73;
                                    }
                                }
                                i71 = T3;
                                fVar4.a(dVar12);
                                i68++;
                                i70 = i73;
                            }
                            i20 = i70;
                        }
                        int size3 = arrayList3.size();
                        int i74 = gVar.f3301w0;
                        int i75 = gVar.f3297s0;
                        int i76 = gVar.f3302x0;
                        int i77 = gVar.f3298t0;
                        boolean z8 = iArr2[0] == 2 || iArr2[1] == 2;
                        if (i20 > 0 && z8) {
                            for (int i78 = 0; i78 < size3; i78++) {
                                f fVar5 = (f) arrayList3.get(i78);
                                if (i61 == 0) {
                                    fVar5.e(i34 - fVar5.d());
                                } else {
                                    fVar5.e(i34 - fVar5.c());
                                }
                            }
                        }
                        int i79 = i74;
                        int i80 = i75;
                        int i81 = i76;
                        int i82 = i77;
                        c cVar11 = cVar8;
                        c cVar12 = cVar9;
                        c cVar13 = cVar10;
                        c cVar14 = cVar4;
                        int i83 = 0;
                        int i84 = 0;
                        for (int i85 = 0; i85 < size3; i85++) {
                            f fVar6 = (f) arrayList3.get(i85);
                            if (i61 == 0) {
                                if (i85 < size3 - 1) {
                                    cVar13 = ((f) arrayList3.get(i85 + 1)).f3281b.J;
                                    i82 = 0;
                                } else {
                                    i82 = gVar.f3298t0;
                                    cVar13 = cVar10;
                                }
                                c cVar15 = fVar6.f3281b.L;
                                fVar6.f(i61, cVar11, cVar14, cVar12, cVar13, i79, i80, i81, i82, i34);
                                i83 = Math.max(i83, fVar6.d());
                                int c4 = fVar6.c() + i84;
                                if (i85 > 0) {
                                    c4 += gVar.Q0;
                                }
                                i84 = c4;
                                cVar14 = cVar15;
                                i80 = 0;
                            } else {
                                if (i85 < size3 - 1) {
                                    cVar12 = ((f) arrayList3.get(i85 + 1)).f3281b.I;
                                    i81 = 0;
                                } else {
                                    i81 = gVar.f3302x0;
                                    cVar12 = cVar9;
                                }
                                c cVar16 = fVar6.f3281b.K;
                                fVar6.f(i61, cVar11, cVar14, cVar12, cVar13, i79, i80, i81, i82, i34);
                                int d4 = fVar6.d() + i83;
                                int max = Math.max(i84, fVar6.c());
                                if (i85 > 0) {
                                    d4 += gVar.P0;
                                }
                                i84 = max;
                                i83 = d4;
                                cVar11 = cVar16;
                                i79 = 0;
                            }
                        }
                        iArr[0] = i83;
                        iArr[1] = i84;
                    }
                    z3 = z4;
                }
                c = 0;
                r12 = z3;
                int i432 = iArr[c] + i12 + i13;
                int i442 = iArr[r12] + i14 + i10;
                if (mode != 1073741824) {
                    size = mode == Integer.MIN_VALUE ? Math.min(i432, size) : mode == 0 ? i432 : 0;
                }
                int min = mode2 == 1073741824 ? i11 : mode2 == Integer.MIN_VALUE ? Math.min(i442, i11) : mode2 == 0 ? i442 : 0;
                gVar.f3304z0 = size;
                gVar.A0 = min;
                gVar.O(size);
                gVar.L(min);
                gVar.f3303y0 = gVar.f3312r0 > 0 ? r12 : false;
                setMeasuredDimension(gVar.f3304z0, gVar.A0);
            }
            i10 = i31;
            iArr = iArr3;
            i11 = size2;
            i12 = i28;
            i13 = i6;
            i14 = i8;
            int i86 = i9;
            d[] dVarArr9 = dVarArr;
            int i87 = gVar.V0;
            if (i86 != 0) {
                arrayList3.clear();
                f fVar7 = new f(gVar, i87, gVar.I, gVar.J, gVar.K, gVar.L, i34);
                arrayList3.add(fVar7);
                if (i87 == 0) {
                    int i88 = 0;
                    i15 = 0;
                    int i89 = 0;
                    while (i88 < i86) {
                        d dVar13 = dVarArr9[i88];
                        int U4 = gVar.U(dVar13, i34);
                        if (dVar13.f3259p0[0] == 3) {
                            i15++;
                        }
                        int i90 = i15;
                        boolean z9 = (i89 == i34 || (gVar.P0 + i89) + U4 > i34) && fVar7.f3281b != null;
                        if (!z9 && i88 > 0 && (i17 = gVar.U0) > 0 && i88 % i17 == 0) {
                            z9 = true;
                        }
                        if (z9) {
                            fVar7 = new f(gVar, i87, gVar.I, gVar.J, gVar.K, gVar.L, i34);
                            fVar7.f3290n = i88;
                            arrayList3.add(fVar7);
                        } else if (i88 > 0) {
                            i89 = gVar.P0 + U4 + i89;
                            fVar7.a(dVar13);
                            i88++;
                            i15 = i90;
                        }
                        i89 = U4;
                        fVar7.a(dVar13);
                        i88++;
                        i15 = i90;
                    }
                } else {
                    int i91 = 0;
                    i15 = 0;
                    int i92 = 0;
                    while (i91 < i86) {
                        d dVar14 = dVarArr9[i91];
                        int T4 = gVar.T(dVar14, i34);
                        if (dVar14.f3259p0[1] == 3) {
                            i15++;
                        }
                        int i93 = i15;
                        boolean z10 = (i92 == i34 || (gVar.Q0 + i92) + T4 > i34) && fVar7.f3281b != null;
                        if (!z10 && i91 > 0 && (i16 = gVar.U0) > 0 && i91 % i16 == 0) {
                            z10 = true;
                        }
                        if (z10) {
                            fVar7 = new f(gVar, i87, gVar.I, gVar.J, gVar.K, gVar.L, i34);
                            fVar7.f3290n = i91;
                            arrayList3.add(fVar7);
                        } else if (i91 > 0) {
                            i92 = gVar.Q0 + T4 + i92;
                            fVar7.a(dVar14);
                            i91++;
                            i15 = i93;
                        }
                        i92 = T4;
                        fVar7.a(dVar14);
                        i91++;
                        i15 = i93;
                    }
                }
                int size4 = arrayList3.size();
                int i94 = gVar.f3301w0;
                int i95 = gVar.f3297s0;
                int i96 = gVar.f3302x0;
                int i97 = gVar.f3298t0;
                boolean z11 = iArr2[0] == 2 || iArr2[1] == 2;
                if (i15 > 0 && z11) {
                    for (int i98 = 0; i98 < size4; i98++) {
                        f fVar8 = (f) arrayList3.get(i98);
                        if (i87 == 0) {
                            fVar8.e(i34 - fVar8.d());
                        } else {
                            fVar8.e(i34 - fVar8.c());
                        }
                    }
                }
                int i99 = i94;
                int i100 = i95;
                int i101 = i96;
                int i102 = i97;
                c cVar17 = cVar8;
                c cVar18 = cVar9;
                c cVar19 = cVar10;
                c cVar20 = cVar4;
                int i103 = 0;
                int i104 = 0;
                for (int i105 = 0; i105 < size4; i105++) {
                    f fVar9 = (f) arrayList3.get(i105);
                    if (i87 == 0) {
                        if (i105 < size4 - 1) {
                            cVar19 = ((f) arrayList3.get(i105 + 1)).f3281b.J;
                            i102 = 0;
                        } else {
                            i102 = gVar.f3298t0;
                            cVar19 = cVar10;
                        }
                        c cVar21 = fVar9.f3281b.L;
                        fVar9.f(i87, cVar17, cVar20, cVar18, cVar19, i99, i100, i101, i102, i34);
                        i103 = Math.max(i103, fVar9.d());
                        int c5 = fVar9.c() + i104;
                        if (i105 > 0) {
                            c5 += gVar.Q0;
                        }
                        i104 = c5;
                        cVar20 = cVar21;
                        i100 = 0;
                    } else {
                        if (i105 < size4 - 1) {
                            cVar18 = ((f) arrayList3.get(i105 + 1)).f3281b.I;
                            i101 = 0;
                        } else {
                            i101 = gVar.f3302x0;
                            cVar18 = cVar9;
                        }
                        c cVar22 = fVar9.f3281b.K;
                        fVar9.f(i87, cVar17, cVar20, cVar18, cVar19, i99, i100, i101, i102, i34);
                        int d5 = fVar9.d() + i103;
                        int max2 = Math.max(i104, fVar9.c());
                        if (i105 > 0) {
                            d5 += gVar.P0;
                        }
                        i104 = max2;
                        i103 = d5;
                        cVar17 = cVar22;
                        i99 = 0;
                    }
                }
                iArr[0] = i103;
                iArr[1] = i104;
            }
        }
        z3 = true;
        c = 0;
        r12 = z3;
        int i4322 = iArr[c] + i12 + i13;
        int i4422 = iArr[r12] + i14 + i10;
        if (mode != 1073741824) {
        }
        if (mode2 == 1073741824) {
        }
        gVar.f3304z0 = size;
        gVar.A0 = min;
        gVar.O(size);
        gVar.L(min);
        gVar.f3303y0 = gVar.f3312r0 > 0 ? r12 : false;
        setMeasuredDimension(gVar.f3304z0, gVar.A0);
    }

    @Override // v.c, android.view.View
    public final void onMeasure(int i4, int i5) {
        j(this.f257o, i4, i5);
    }

    public void setFirstHorizontalBias(float f4) {
        this.f257o.L0 = f4;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i4) {
        this.f257o.F0 = i4;
        requestLayout();
    }

    public void setFirstVerticalBias(float f4) {
        this.f257o.M0 = f4;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i4) {
        this.f257o.G0 = i4;
        requestLayout();
    }

    public void setHorizontalAlign(int i4) {
        this.f257o.R0 = i4;
        requestLayout();
    }

    public void setHorizontalBias(float f4) {
        this.f257o.J0 = f4;
        requestLayout();
    }

    public void setHorizontalGap(int i4) {
        this.f257o.P0 = i4;
        requestLayout();
    }

    public void setHorizontalStyle(int i4) {
        this.f257o.D0 = i4;
        requestLayout();
    }

    public void setLastHorizontalBias(float f4) {
        this.f257o.N0 = f4;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i4) {
        this.f257o.H0 = i4;
        requestLayout();
    }

    public void setLastVerticalBias(float f4) {
        this.f257o.O0 = f4;
        requestLayout();
    }

    public void setLastVerticalStyle(int i4) {
        this.f257o.I0 = i4;
        requestLayout();
    }

    public void setMaxElementsWrap(int i4) {
        this.f257o.U0 = i4;
        requestLayout();
    }

    public void setOrientation(int i4) {
        this.f257o.V0 = i4;
        requestLayout();
    }

    public void setPadding(int i4) {
        g gVar = this.f257o;
        gVar.f3297s0 = i4;
        gVar.f3298t0 = i4;
        gVar.f3299u0 = i4;
        gVar.f3300v0 = i4;
        requestLayout();
    }

    public void setPaddingBottom(int i4) {
        this.f257o.f3298t0 = i4;
        requestLayout();
    }

    public void setPaddingLeft(int i4) {
        this.f257o.f3301w0 = i4;
        requestLayout();
    }

    public void setPaddingRight(int i4) {
        this.f257o.f3302x0 = i4;
        requestLayout();
    }

    public void setPaddingTop(int i4) {
        this.f257o.f3297s0 = i4;
        requestLayout();
    }

    public void setVerticalAlign(int i4) {
        this.f257o.S0 = i4;
        requestLayout();
    }

    public void setVerticalBias(float f4) {
        this.f257o.K0 = f4;
        requestLayout();
    }

    public void setVerticalGap(int i4) {
        this.f257o.Q0 = i4;
        requestLayout();
    }

    public void setVerticalStyle(int i4) {
        this.f257o.E0 = i4;
        requestLayout();
    }

    public void setWrapMode(int i4) {
        this.f257o.T0 = i4;
        requestLayout();
    }
}

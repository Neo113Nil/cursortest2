package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import v.c;
import v.d;
import v.e;
import v.f;
import v.g;
import v.h;
import w.b;
import y.q;
import y.s;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class Flow extends s {

    /* renamed from: o, reason: collision with root package name */
    public final g f366o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3956f = new int[32];
        this.f3960l = new HashMap();
        this.h = context;
        super.g(attributeSet);
        g gVar = new g();
        gVar.f3675s0 = 0;
        gVar.f3676t0 = 0;
        gVar.f3677u0 = 0;
        gVar.f3678v0 = 0;
        gVar.f3679w0 = 0;
        gVar.f3680x0 = 0;
        gVar.f3681y0 = false;
        gVar.f3682z0 = 0;
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
        gVar.f3674b1 = 0;
        this.f366o = gVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f4087b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f366o.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f366o;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f3675s0 = dimensionPixelSize;
                    gVar2.f3676t0 = dimensionPixelSize;
                    gVar2.f3677u0 = dimensionPixelSize;
                    gVar2.f3678v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f366o;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f3677u0 = dimensionPixelSize2;
                    gVar3.f3679w0 = dimensionPixelSize2;
                    gVar3.f3680x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f366o.f3678v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f366o.f3679w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f366o.f3675s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f366o.f3680x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f366o.f3676t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f366o.T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f366o.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f366o.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f366o.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f366o.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f366o.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f366o.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f366o.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f366o.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f366o.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f366o.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f366o.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f366o.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f366o.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f366o.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f366o.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f366o.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f366o.U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.i = this.f366o;
        i();
    }

    @Override // y.c
    public final void h(d dVar, boolean z4) {
        g gVar = this.f366o;
        int i = gVar.f3677u0;
        if (i > 0 || gVar.f3678v0 > 0) {
            if (z4) {
                gVar.f3679w0 = gVar.f3678v0;
                gVar.f3680x0 = i;
            } else {
                gVar.f3679w0 = i;
                gVar.f3680x0 = gVar.f3678v0;
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
    @Override // y.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(g gVar, int i, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        d[] dVarArr;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        f fVar;
        char c5;
        ?? r12;
        boolean z4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Object obj;
        d dVar;
        boolean z5;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        c cVar;
        c cVar2;
        c cVar3;
        ArrayList arrayList;
        int i25;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        int[] iArr2 = gVar.f3637p0;
        c cVar4 = gVar.J;
        c cVar5 = gVar.I;
        c cVar6 = gVar.K;
        c cVar7 = gVar.L;
        ArrayList arrayList2 = gVar.W0;
        if (gVar.f3690r0 > 0) {
            b bVar = gVar.B0;
            d dVar2 = gVar.T;
            y.f fVar2 = dVar2 != null ? ((e) dVar2).f3652u0 : null;
            if (fVar2 == null) {
                gVar.f3682z0 = 0;
                gVar.A0 = 0;
                gVar.f3681y0 = false;
                setMeasuredDimension(gVar.f3682z0, gVar.A0);
            }
            int i26 = 0;
            while (i26 < gVar.f3690r0) {
                d dVar3 = gVar.f3689q0[i26];
                if (dVar3 == null) {
                    cVar = cVar5;
                } else {
                    cVar = cVar5;
                    if (!(dVar3 instanceof h)) {
                        cVar2 = cVar6;
                        int j2 = dVar3.j(0);
                        cVar3 = cVar7;
                        int j4 = dVar3.j(1);
                        arrayList = arrayList2;
                        if (j2 == 3) {
                            i25 = i26;
                            if (dVar3.f3639r != 1 && j4 == 3 && dVar3.f3640s != 1) {
                                i26 = i25 + 1;
                                cVar5 = cVar;
                                cVar6 = cVar2;
                                cVar7 = cVar3;
                                arrayList2 = arrayList;
                            }
                        } else {
                            i25 = i26;
                        }
                        if (j2 == 3) {
                            j2 = 2;
                        }
                        if (j4 == 3) {
                            j4 = 2;
                        }
                        bVar.f3735a = j2;
                        bVar.f3736b = j4;
                        bVar.f3737c = dVar3.q();
                        bVar.d = dVar3.k();
                        fVar2.b(dVar3, bVar);
                        dVar3.O(bVar.f3738e);
                        dVar3.L(bVar.f3739f);
                        dVar3.I(bVar.f3740g);
                        i26 = i25 + 1;
                        cVar5 = cVar;
                        cVar6 = cVar2;
                        cVar7 = cVar3;
                        arrayList2 = arrayList;
                    }
                }
                cVar2 = cVar6;
                cVar3 = cVar7;
                arrayList = arrayList2;
                i25 = i26;
                i26 = i25 + 1;
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
        int i27 = gVar.f3679w0;
        int i28 = gVar.f3680x0;
        int i29 = gVar.f3675s0;
        int i30 = gVar.f3676t0;
        int[] iArr3 = new int[2];
        int i31 = (size - i27) - i28;
        int i32 = gVar.V0;
        if (i32 == 1) {
            i31 = (size2 - i29) - i30;
        }
        int i33 = i31;
        if (i32 == 0) {
            if (gVar.D0 == -1) {
                i24 = 0;
                gVar.D0 = 0;
            } else {
                i24 = 0;
            }
            i5 = i28;
            if (gVar.E0 == -1) {
                gVar.E0 = i24;
            }
        } else {
            i5 = i28;
            if (gVar.D0 == -1) {
                gVar.D0 = 0;
            }
            if (gVar.E0 == -1) {
                gVar.E0 = 0;
            }
        }
        d[] dVarArr2 = gVar.f3689q0;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            i6 = gVar.f3690r0;
            i7 = i29;
            if (i34 >= i6) {
                break;
            }
            if (gVar.f3689q0[i34].f3622g0 == 8) {
                i35++;
            }
            i34++;
            i29 = i7;
        }
        if (i35 > 0) {
            dVarArr = new d[i6 - i35];
            int i36 = 0;
            int i37 = 0;
            while (i36 < gVar.f3690r0) {
                d dVar4 = gVar.f3689q0[i36];
                d[] dVarArr3 = dVarArr;
                if (dVar4.f3622g0 != 8) {
                    dVarArr3[i37] = dVar4;
                    i37++;
                }
                i36++;
                dVarArr = dVarArr3;
            }
            i8 = i37;
        } else {
            i8 = i6;
            dVarArr = dVarArr2;
        }
        gVar.f3673a1 = dVarArr;
        gVar.f3674b1 = i8;
        int i38 = gVar.T0;
        if (i38 == 0) {
            d[] dVarArr4 = dVarArr;
            int i39 = i8;
            i9 = i30;
            iArr = iArr3;
            i10 = size2;
            i11 = i27;
            i12 = i5;
            i13 = i7;
            int i40 = gVar.V0;
            if (i39 != 0) {
                if (arrayList3.size() == 0) {
                    fVar = new f(gVar, i40, gVar.I, gVar.J, gVar.K, gVar.L, i33);
                    arrayList3.add(fVar);
                } else {
                    f fVar3 = (f) arrayList3.get(0);
                    fVar3.f3660c = 0;
                    fVar3.f3659b = null;
                    fVar3.f3666l = 0;
                    fVar3.f3667m = 0;
                    fVar3.f3668n = 0;
                    fVar3.f3669o = 0;
                    fVar3.f3670p = 0;
                    fVar3.f(i40, gVar.I, gVar.J, gVar.K, gVar.L, gVar.f3679w0, gVar.f3675s0, gVar.f3680x0, gVar.f3676t0, i33);
                    fVar = fVar3;
                }
                for (int i41 = 0; i41 < i39; i41++) {
                    fVar.a(dVarArr4[i41]);
                }
                c5 = 0;
                iArr[0] = fVar.d();
                r12 = 1;
                iArr[1] = fVar.c();
                int i42 = iArr[c5] + i11 + i12;
                int i43 = iArr[r12] + i13 + i9;
                if (mode != 1073741824) {
                }
                if (mode2 == 1073741824) {
                }
                gVar.f3682z0 = size;
                gVar.A0 = r0;
                gVar.O(size);
                gVar.L(r0);
                gVar.f3681y0 = gVar.f3690r0 > 0 ? r12 : false;
                setMeasuredDimension(gVar.f3682z0, gVar.A0);
            }
        } else {
            if (i38 != 1) {
                if (i38 == 2) {
                    d[] dVarArr5 = dVarArr;
                    int i44 = i8;
                    i9 = i30;
                    iArr = iArr3;
                    i10 = size2;
                    i11 = i27;
                    i12 = i5;
                    i13 = i7;
                    int i45 = gVar.V0;
                    if (i45 == 0) {
                        int i46 = gVar.U0;
                        if (i46 <= 0) {
                            int i47 = 0;
                            i18 = 0;
                            for (int i48 = 0; i48 < i44; i48++) {
                                if (i48 > 0) {
                                    i47 += gVar.P0;
                                }
                                d dVar5 = dVarArr5[i48];
                                if (dVar5 != null) {
                                    int U = gVar.U(dVar5, i33) + i47;
                                    if (U > i33) {
                                        break;
                                    }
                                    i18++;
                                    i47 = U;
                                }
                            }
                        } else {
                            i18 = i46;
                        }
                        i17 = 0;
                    } else {
                        i17 = gVar.U0;
                        if (i17 <= 0) {
                            int i49 = 0;
                            int i50 = 0;
                            for (int i51 = 0; i51 < i44; i51++) {
                                if (i51 > 0) {
                                    i49 += gVar.Q0;
                                }
                                d dVar6 = dVarArr5[i51];
                                if (dVar6 != null) {
                                    int T = gVar.T(dVar6, i33) + i49;
                                    if (T > i33) {
                                        break;
                                    }
                                    i50++;
                                    i49 = T;
                                }
                            }
                            i17 = i50;
                        }
                        i18 = 0;
                    }
                    if (gVar.Z0 == null) {
                        gVar.Z0 = new int[2];
                    }
                    boolean z6 = (i17 == 0 && i45 == 1) || (i18 == 0 && i45 == 0);
                    while (!z6) {
                        if (i45 == 0) {
                            i17 = (int) Math.ceil(i44 / i18);
                        } else {
                            i18 = (int) Math.ceil(i44 / i17);
                        }
                        d[] dVarArr6 = gVar.Y0;
                        if (dVarArr6 == null || dVarArr6.length < i18) {
                            obj = null;
                            gVar.Y0 = new d[i18];
                        } else {
                            obj = null;
                            Arrays.fill(dVarArr6, (Object) null);
                        }
                        d[] dVarArr7 = gVar.X0;
                        if (dVarArr7 == null || dVarArr7.length < i17) {
                            gVar.X0 = new d[i17];
                        } else {
                            Arrays.fill(dVarArr7, obj);
                        }
                        for (int i52 = 0; i52 < i18; i52++) {
                            for (int i53 = 0; i53 < i17; i53++) {
                                int i54 = (i53 * i18) + i52;
                                if (i45 == 1) {
                                    i54 = (i52 * i17) + i53;
                                }
                                if (i54 < dVarArr5.length && (dVar = dVarArr5[i54]) != null) {
                                    int U2 = gVar.U(dVar, i33);
                                    d dVar7 = gVar.Y0[i52];
                                    if (dVar7 == null || dVar7.q() < U2) {
                                        gVar.Y0[i52] = dVar;
                                    }
                                    int T2 = gVar.T(dVar, i33);
                                    d dVar8 = gVar.X0[i53];
                                    if (dVar8 == null || dVar8.k() < T2) {
                                        gVar.X0[i53] = dVar;
                                    }
                                }
                            }
                        }
                        int i55 = 0;
                        for (int i56 = 0; i56 < i18; i56++) {
                            d dVar9 = gVar.Y0[i56];
                            if (dVar9 != null) {
                                if (i56 > 0) {
                                    i55 += gVar.P0;
                                }
                                i55 = gVar.U(dVar9, i33) + i55;
                            }
                        }
                        int i57 = 0;
                        for (int i58 = 0; i58 < i17; i58++) {
                            d dVar10 = gVar.X0[i58];
                            if (dVar10 != null) {
                                if (i58 > 0) {
                                    i57 += gVar.Q0;
                                }
                                i57 = gVar.T(dVar10, i33) + i57;
                            }
                        }
                        iArr[0] = i55;
                        iArr[1] = i57;
                        if (i45 == 0) {
                            if (i55 > i33 && i18 > 1) {
                                i18--;
                            }
                            z6 = true;
                        } else {
                            if (i57 > i33 && i17 > 1) {
                                i17--;
                            }
                            z6 = true;
                        }
                    }
                    z4 = true;
                    int[] iArr4 = gVar.Z0;
                    iArr4[0] = i18;
                    iArr4[1] = i17;
                } else if (i38 != 3) {
                    i9 = i30;
                    iArr = iArr3;
                    i10 = size2;
                    i11 = i27;
                    i12 = i5;
                    i13 = i7;
                } else {
                    int i59 = i8;
                    int i60 = gVar.V0;
                    if (i59 == 0) {
                        i9 = i30;
                        iArr = iArr3;
                        i10 = size2;
                        i11 = i27;
                        i12 = i5;
                        i13 = i7;
                        z5 = true;
                    } else {
                        arrayList3.clear();
                        d[] dVarArr8 = dVarArr;
                        i11 = i27;
                        i9 = i30;
                        i12 = i5;
                        i13 = i7;
                        iArr = iArr3;
                        z5 = true;
                        f fVar4 = new f(gVar, i60, gVar.I, gVar.J, gVar.K, gVar.L, i33);
                        arrayList3.add(fVar4);
                        if (i60 == 0) {
                            int i61 = 0;
                            int i62 = 0;
                            i19 = 0;
                            int i63 = 0;
                            while (i61 < i59) {
                                i62++;
                                d dVar11 = dVarArr8[i61];
                                int U3 = gVar.U(dVar11, i33);
                                int i64 = i60;
                                int i65 = i61;
                                if (dVar11.f3637p0[0] == 3) {
                                    i19++;
                                }
                                int i66 = i19;
                                boolean z7 = (i63 == i33 || (gVar.P0 + i63) + U3 > i33) && fVar4.f3659b != null;
                                if (!z7 && i65 > 0 && (i23 = gVar.U0) > 0 && i62 > i23) {
                                    z7 = true;
                                }
                                if (z7) {
                                    i21 = size2;
                                    i60 = i64;
                                    i22 = i65;
                                    fVar4 = new f(gVar, i60, gVar.I, gVar.J, gVar.K, gVar.L, i33);
                                    fVar4.f3668n = i22;
                                    arrayList3.add(fVar4);
                                    i62 = 1;
                                } else {
                                    i21 = size2;
                                    i60 = i64;
                                    i22 = i65;
                                    if (i22 > 0) {
                                        i63 = gVar.P0 + U3 + i63;
                                        fVar4.a(dVar11);
                                        i61 = i22 + 1;
                                        i19 = i66;
                                        size2 = i21;
                                    }
                                }
                                i63 = U3;
                                fVar4.a(dVar11);
                                i61 = i22 + 1;
                                i19 = i66;
                                size2 = i21;
                            }
                            i10 = size2;
                        } else {
                            i10 = size2;
                            int i67 = 0;
                            int i68 = 0;
                            int i69 = 0;
                            int i70 = 0;
                            while (i67 < i59) {
                                i68++;
                                d dVar12 = dVarArr8[i67];
                                int T3 = gVar.T(dVar12, i33);
                                int i71 = i60;
                                if (dVar12.f3637p0[1] == 3) {
                                    i69++;
                                }
                                int i72 = i69;
                                boolean z8 = (i70 == i33 || (gVar.Q0 + i70) + T3 > i33) && fVar4.f3659b != null;
                                if (!z8 && i67 > 0 && (i20 = gVar.U0) > 0 && i68 > i20) {
                                    z8 = true;
                                }
                                if (z8) {
                                    i60 = i71;
                                    fVar4 = new f(gVar, i60, gVar.I, gVar.J, gVar.K, gVar.L, i33);
                                    fVar4.f3668n = i67;
                                    arrayList3.add(fVar4);
                                    i68 = 1;
                                } else {
                                    i60 = i71;
                                    if (i67 > 0) {
                                        i70 = gVar.Q0 + T3 + i70;
                                        fVar4.a(dVar12);
                                        i67++;
                                        i69 = i72;
                                    }
                                }
                                i70 = T3;
                                fVar4.a(dVar12);
                                i67++;
                                i69 = i72;
                            }
                            i19 = i69;
                        }
                        int size3 = arrayList3.size();
                        int i73 = gVar.f3679w0;
                        int i74 = gVar.f3675s0;
                        int i75 = gVar.f3680x0;
                        int i76 = gVar.f3676t0;
                        boolean z9 = iArr2[0] == 2 || iArr2[1] == 2;
                        if (i19 > 0 && z9) {
                            for (int i77 = 0; i77 < size3; i77++) {
                                f fVar5 = (f) arrayList3.get(i77);
                                if (i60 == 0) {
                                    fVar5.e(i33 - fVar5.d());
                                } else {
                                    fVar5.e(i33 - fVar5.c());
                                }
                            }
                        }
                        int i78 = i73;
                        int i79 = i74;
                        int i80 = i75;
                        int i81 = i76;
                        c cVar11 = cVar8;
                        c cVar12 = cVar9;
                        c cVar13 = cVar10;
                        c cVar14 = cVar4;
                        int i82 = 0;
                        int i83 = 0;
                        for (int i84 = 0; i84 < size3; i84++) {
                            f fVar6 = (f) arrayList3.get(i84);
                            if (i60 == 0) {
                                if (i84 < size3 - 1) {
                                    cVar13 = ((f) arrayList3.get(i84 + 1)).f3659b.J;
                                    i81 = 0;
                                } else {
                                    i81 = gVar.f3676t0;
                                    cVar13 = cVar10;
                                }
                                c cVar15 = fVar6.f3659b.L;
                                fVar6.f(i60, cVar11, cVar14, cVar12, cVar13, i78, i79, i80, i81, i33);
                                i82 = Math.max(i82, fVar6.d());
                                int c6 = fVar6.c() + i83;
                                if (i84 > 0) {
                                    c6 += gVar.Q0;
                                }
                                i83 = c6;
                                cVar14 = cVar15;
                                i79 = 0;
                            } else {
                                if (i84 < size3 - 1) {
                                    cVar12 = ((f) arrayList3.get(i84 + 1)).f3659b.I;
                                    i80 = 0;
                                } else {
                                    i80 = gVar.f3680x0;
                                    cVar12 = cVar9;
                                }
                                c cVar16 = fVar6.f3659b.K;
                                fVar6.f(i60, cVar11, cVar14, cVar12, cVar13, i78, i79, i80, i81, i33);
                                int d = fVar6.d() + i82;
                                int max = Math.max(i83, fVar6.c());
                                if (i84 > 0) {
                                    d += gVar.P0;
                                }
                                i83 = max;
                                i82 = d;
                                cVar11 = cVar16;
                                i78 = 0;
                            }
                        }
                        iArr[0] = i82;
                        iArr[1] = i83;
                    }
                    z4 = z5;
                }
                c5 = 0;
                r12 = z4;
                int i422 = iArr[c5] + i11 + i12;
                int i432 = iArr[r12] + i13 + i9;
                if (mode != 1073741824) {
                    size = mode == Integer.MIN_VALUE ? Math.min(i422, size) : mode == 0 ? i422 : 0;
                }
                int min = mode2 == 1073741824 ? i10 : mode2 == Integer.MIN_VALUE ? Math.min(i432, i10) : mode2 == 0 ? i432 : 0;
                gVar.f3682z0 = size;
                gVar.A0 = min;
                gVar.O(size);
                gVar.L(min);
                gVar.f3681y0 = gVar.f3690r0 > 0 ? r12 : false;
                setMeasuredDimension(gVar.f3682z0, gVar.A0);
            }
            i9 = i30;
            iArr = iArr3;
            i10 = size2;
            i11 = i27;
            i12 = i5;
            i13 = i7;
            int i85 = i8;
            d[] dVarArr9 = dVarArr;
            int i86 = gVar.V0;
            if (i85 != 0) {
                arrayList3.clear();
                f fVar7 = new f(gVar, i86, gVar.I, gVar.J, gVar.K, gVar.L, i33);
                arrayList3.add(fVar7);
                if (i86 == 0) {
                    int i87 = 0;
                    i14 = 0;
                    int i88 = 0;
                    while (i87 < i85) {
                        d dVar13 = dVarArr9[i87];
                        int U4 = gVar.U(dVar13, i33);
                        if (dVar13.f3637p0[0] == 3) {
                            i14++;
                        }
                        int i89 = i14;
                        boolean z10 = (i88 == i33 || (gVar.P0 + i88) + U4 > i33) && fVar7.f3659b != null;
                        if (!z10 && i87 > 0 && (i16 = gVar.U0) > 0 && i87 % i16 == 0) {
                            z10 = true;
                        }
                        if (z10) {
                            fVar7 = new f(gVar, i86, gVar.I, gVar.J, gVar.K, gVar.L, i33);
                            fVar7.f3668n = i87;
                            arrayList3.add(fVar7);
                        } else if (i87 > 0) {
                            i88 = gVar.P0 + U4 + i88;
                            fVar7.a(dVar13);
                            i87++;
                            i14 = i89;
                        }
                        i88 = U4;
                        fVar7.a(dVar13);
                        i87++;
                        i14 = i89;
                    }
                } else {
                    int i90 = 0;
                    i14 = 0;
                    int i91 = 0;
                    while (i90 < i85) {
                        d dVar14 = dVarArr9[i90];
                        int T4 = gVar.T(dVar14, i33);
                        if (dVar14.f3637p0[1] == 3) {
                            i14++;
                        }
                        int i92 = i14;
                        boolean z11 = (i91 == i33 || (gVar.Q0 + i91) + T4 > i33) && fVar7.f3659b != null;
                        if (!z11 && i90 > 0 && (i15 = gVar.U0) > 0 && i90 % i15 == 0) {
                            z11 = true;
                        }
                        if (z11) {
                            fVar7 = new f(gVar, i86, gVar.I, gVar.J, gVar.K, gVar.L, i33);
                            fVar7.f3668n = i90;
                            arrayList3.add(fVar7);
                        } else if (i90 > 0) {
                            i91 = gVar.Q0 + T4 + i91;
                            fVar7.a(dVar14);
                            i90++;
                            i14 = i92;
                        }
                        i91 = T4;
                        fVar7.a(dVar14);
                        i90++;
                        i14 = i92;
                    }
                }
                int size4 = arrayList3.size();
                int i93 = gVar.f3679w0;
                int i94 = gVar.f3675s0;
                int i95 = gVar.f3680x0;
                int i96 = gVar.f3676t0;
                boolean z12 = iArr2[0] == 2 || iArr2[1] == 2;
                if (i14 > 0 && z12) {
                    for (int i97 = 0; i97 < size4; i97++) {
                        f fVar8 = (f) arrayList3.get(i97);
                        if (i86 == 0) {
                            fVar8.e(i33 - fVar8.d());
                        } else {
                            fVar8.e(i33 - fVar8.c());
                        }
                    }
                }
                int i98 = i93;
                int i99 = i94;
                int i100 = i95;
                int i101 = i96;
                c cVar17 = cVar8;
                c cVar18 = cVar9;
                c cVar19 = cVar10;
                c cVar20 = cVar4;
                int i102 = 0;
                int i103 = 0;
                for (int i104 = 0; i104 < size4; i104++) {
                    f fVar9 = (f) arrayList3.get(i104);
                    if (i86 == 0) {
                        if (i104 < size4 - 1) {
                            cVar19 = ((f) arrayList3.get(i104 + 1)).f3659b.J;
                            i101 = 0;
                        } else {
                            i101 = gVar.f3676t0;
                            cVar19 = cVar10;
                        }
                        c cVar21 = fVar9.f3659b.L;
                        fVar9.f(i86, cVar17, cVar20, cVar18, cVar19, i98, i99, i100, i101, i33);
                        i102 = Math.max(i102, fVar9.d());
                        int c7 = fVar9.c() + i103;
                        if (i104 > 0) {
                            c7 += gVar.Q0;
                        }
                        i103 = c7;
                        cVar20 = cVar21;
                        i99 = 0;
                    } else {
                        if (i104 < size4 - 1) {
                            cVar18 = ((f) arrayList3.get(i104 + 1)).f3659b.I;
                            i100 = 0;
                        } else {
                            i100 = gVar.f3680x0;
                            cVar18 = cVar9;
                        }
                        c cVar22 = fVar9.f3659b.K;
                        fVar9.f(i86, cVar17, cVar20, cVar18, cVar19, i98, i99, i100, i101, i33);
                        int d5 = fVar9.d() + i102;
                        int max2 = Math.max(i103, fVar9.c());
                        if (i104 > 0) {
                            d5 += gVar.P0;
                        }
                        i103 = max2;
                        i102 = d5;
                        cVar17 = cVar22;
                        i98 = 0;
                    }
                }
                iArr[0] = i102;
                iArr[1] = i103;
            }
        }
        z4 = true;
        c5 = 0;
        r12 = z4;
        int i4222 = iArr[c5] + i11 + i12;
        int i4322 = iArr[r12] + i13 + i9;
        if (mode != 1073741824) {
        }
        if (mode2 == 1073741824) {
        }
        gVar.f3682z0 = size;
        gVar.A0 = min;
        gVar.O(size);
        gVar.L(min);
        gVar.f3681y0 = gVar.f3690r0 > 0 ? r12 : false;
        setMeasuredDimension(gVar.f3682z0, gVar.A0);
    }

    @Override // y.c, android.view.View
    public final void onMeasure(int i, int i4) {
        j(this.f366o, i, i4);
    }

    public void setFirstHorizontalBias(float f5) {
        this.f366o.L0 = f5;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f366o.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f5) {
        this.f366o.M0 = f5;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f366o.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f366o.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f5) {
        this.f366o.J0 = f5;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f366o.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f366o.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f5) {
        this.f366o.N0 = f5;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f366o.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f5) {
        this.f366o.O0 = f5;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f366o.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f366o.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f366o.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.f366o;
        gVar.f3675s0 = i;
        gVar.f3676t0 = i;
        gVar.f3677u0 = i;
        gVar.f3678v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f366o.f3676t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f366o.f3679w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f366o.f3680x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f366o.f3675s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f366o.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f5) {
        this.f366o.K0 = f5;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f366o.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f366o.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f366o.T0 = i;
        requestLayout();
    }
}

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
import y.r;
import y.t;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class Flow extends t {

    /* renamed from: o, reason: collision with root package name */
    public final g f241o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3629f = new int[32];
        this.f3634l = new HashMap();
        this.f3631h = context;
        super.g(attributeSet);
        g gVar = new g();
        gVar.f3457s0 = 0;
        gVar.f3458t0 = 0;
        gVar.f3459u0 = 0;
        gVar.f3460v0 = 0;
        gVar.f3461w0 = 0;
        gVar.f3462x0 = 0;
        gVar.f3463y0 = false;
        gVar.f3464z0 = 0;
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
        gVar.f3456b1 = 0;
        this.f241o = gVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f3768b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f241o.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f241o;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f3457s0 = dimensionPixelSize;
                    gVar2.f3458t0 = dimensionPixelSize;
                    gVar2.f3459u0 = dimensionPixelSize;
                    gVar2.f3460v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f241o;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f3459u0 = dimensionPixelSize2;
                    gVar3.f3461w0 = dimensionPixelSize2;
                    gVar3.f3462x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f241o.f3460v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f241o.f3461w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f241o.f3457s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f241o.f3462x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f241o.f3458t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f241o.T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f241o.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f241o.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f241o.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f241o.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f241o.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f241o.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f241o.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f241o.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f241o.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f241o.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f241o.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f241o.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f241o.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f241o.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f241o.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f241o.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f241o.U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.i = this.f241o;
        i();
    }

    @Override // y.c
    public final void h(d dVar, boolean z3) {
        g gVar = this.f241o;
        int i = gVar.f3459u0;
        if (i > 0 || gVar.f3460v0 > 0) {
            if (z3) {
                gVar.f3461w0 = gVar.f3460v0;
                gVar.f3462x0 = i;
            } else {
                gVar.f3461w0 = i;
                gVar.f3462x0 = gVar.f3460v0;
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
    @Override // y.t
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
        char c4;
        ?? r12;
        boolean z3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Object obj;
        d dVar;
        boolean z4;
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
        int[] iArr2 = gVar.f3418p0;
        c cVar4 = gVar.J;
        c cVar5 = gVar.I;
        c cVar6 = gVar.K;
        c cVar7 = gVar.L;
        ArrayList arrayList2 = gVar.W0;
        if (gVar.f3472r0 > 0) {
            b bVar = gVar.B0;
            d dVar2 = gVar.T;
            y.f fVar2 = dVar2 != null ? ((e) dVar2).f3433u0 : null;
            if (fVar2 == null) {
                gVar.f3464z0 = 0;
                gVar.A0 = 0;
                gVar.f3463y0 = false;
                setMeasuredDimension(gVar.f3464z0, gVar.A0);
            }
            int i26 = 0;
            while (i26 < gVar.f3472r0) {
                d dVar3 = gVar.f3471q0[i26];
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
                            i25 = i26;
                            if (dVar3.f3420r != 1 && j5 == 3 && dVar3.f3421s != 1) {
                                i26 = i25 + 1;
                                cVar5 = cVar;
                                cVar6 = cVar2;
                                cVar7 = cVar3;
                                arrayList2 = arrayList;
                            }
                        } else {
                            i25 = i26;
                        }
                        if (j4 == 3) {
                            j4 = 2;
                        }
                        if (j5 == 3) {
                            j5 = 2;
                        }
                        bVar.f3510a = j4;
                        bVar.f3511b = j5;
                        bVar.f3512c = dVar3.q();
                        bVar.d = dVar3.k();
                        fVar2.b(dVar3, bVar);
                        dVar3.O(bVar.f3513e);
                        dVar3.L(bVar.f3514f);
                        dVar3.I(bVar.f3515g);
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
        int i27 = gVar.f3461w0;
        int i28 = gVar.f3462x0;
        int i29 = gVar.f3457s0;
        int i30 = gVar.f3458t0;
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
        d[] dVarArr2 = gVar.f3471q0;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            i6 = gVar.f3472r0;
            i7 = i29;
            if (i34 >= i6) {
                break;
            }
            if (gVar.f3471q0[i34].f3402g0 == 8) {
                i35++;
            }
            i34++;
            i29 = i7;
        }
        if (i35 > 0) {
            dVarArr = new d[i6 - i35];
            int i36 = 0;
            int i37 = 0;
            while (i36 < gVar.f3472r0) {
                d dVar4 = gVar.f3471q0[i36];
                d[] dVarArr3 = dVarArr;
                if (dVar4.f3402g0 != 8) {
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
        gVar.f3455a1 = dVarArr;
        gVar.f3456b1 = i8;
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
                    fVar3.f3441c = 0;
                    fVar3.f3440b = null;
                    fVar3.f3448l = 0;
                    fVar3.f3449m = 0;
                    fVar3.f3450n = 0;
                    fVar3.f3451o = 0;
                    fVar3.f3452p = 0;
                    fVar3.f(i40, gVar.I, gVar.J, gVar.K, gVar.L, gVar.f3461w0, gVar.f3457s0, gVar.f3462x0, gVar.f3458t0, i33);
                    fVar = fVar3;
                }
                for (int i41 = 0; i41 < i39; i41++) {
                    fVar.a(dVarArr4[i41]);
                }
                c4 = 0;
                iArr[0] = fVar.d();
                r12 = 1;
                iArr[1] = fVar.c();
                int i42 = iArr[c4] + i11 + i12;
                int i43 = iArr[r12] + i13 + i9;
                if (mode != 1073741824) {
                }
                if (mode2 == 1073741824) {
                }
                gVar.f3464z0 = size;
                gVar.A0 = r0;
                gVar.O(size);
                gVar.L(r0);
                gVar.f3463y0 = gVar.f3472r0 > 0 ? r12 : false;
                setMeasuredDimension(gVar.f3464z0, gVar.A0);
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
                    boolean z5 = (i17 == 0 && i45 == 1) || (i18 == 0 && i45 == 0);
                    while (!z5) {
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
                            z5 = true;
                        } else {
                            if (i57 > i33 && i17 > 1) {
                                i17--;
                            }
                            z5 = true;
                        }
                    }
                    z3 = true;
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
                        z4 = true;
                    } else {
                        arrayList3.clear();
                        d[] dVarArr8 = dVarArr;
                        i11 = i27;
                        i9 = i30;
                        i12 = i5;
                        i13 = i7;
                        iArr = iArr3;
                        z4 = true;
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
                                if (dVar11.f3418p0[0] == 3) {
                                    i19++;
                                }
                                int i66 = i19;
                                boolean z6 = (i63 == i33 || (gVar.P0 + i63) + U3 > i33) && fVar4.f3440b != null;
                                if (!z6 && i65 > 0 && (i23 = gVar.U0) > 0 && i62 > i23) {
                                    z6 = true;
                                }
                                if (z6) {
                                    i21 = size2;
                                    i60 = i64;
                                    i22 = i65;
                                    fVar4 = new f(gVar, i60, gVar.I, gVar.J, gVar.K, gVar.L, i33);
                                    fVar4.f3450n = i22;
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
                                if (dVar12.f3418p0[1] == 3) {
                                    i69++;
                                }
                                int i72 = i69;
                                boolean z7 = (i70 == i33 || (gVar.Q0 + i70) + T3 > i33) && fVar4.f3440b != null;
                                if (!z7 && i67 > 0 && (i20 = gVar.U0) > 0 && i68 > i20) {
                                    z7 = true;
                                }
                                if (z7) {
                                    i60 = i71;
                                    fVar4 = new f(gVar, i60, gVar.I, gVar.J, gVar.K, gVar.L, i33);
                                    fVar4.f3450n = i67;
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
                        int i73 = gVar.f3461w0;
                        int i74 = gVar.f3457s0;
                        int i75 = gVar.f3462x0;
                        int i76 = gVar.f3458t0;
                        boolean z8 = iArr2[0] == 2 || iArr2[1] == 2;
                        if (i19 > 0 && z8) {
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
                                    cVar13 = ((f) arrayList3.get(i84 + 1)).f3440b.J;
                                    i81 = 0;
                                } else {
                                    i81 = gVar.f3458t0;
                                    cVar13 = cVar10;
                                }
                                c cVar15 = fVar6.f3440b.L;
                                fVar6.f(i60, cVar11, cVar14, cVar12, cVar13, i78, i79, i80, i81, i33);
                                i82 = Math.max(i82, fVar6.d());
                                int c5 = fVar6.c() + i83;
                                if (i84 > 0) {
                                    c5 += gVar.Q0;
                                }
                                i83 = c5;
                                cVar14 = cVar15;
                                i79 = 0;
                            } else {
                                if (i84 < size3 - 1) {
                                    cVar12 = ((f) arrayList3.get(i84 + 1)).f3440b.I;
                                    i80 = 0;
                                } else {
                                    i80 = gVar.f3462x0;
                                    cVar12 = cVar9;
                                }
                                c cVar16 = fVar6.f3440b.K;
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
                    z3 = z4;
                }
                c4 = 0;
                r12 = z3;
                int i422 = iArr[c4] + i11 + i12;
                int i432 = iArr[r12] + i13 + i9;
                if (mode != 1073741824) {
                    size = mode == Integer.MIN_VALUE ? Math.min(i422, size) : mode == 0 ? i422 : 0;
                }
                int min = mode2 == 1073741824 ? i10 : mode2 == Integer.MIN_VALUE ? Math.min(i432, i10) : mode2 == 0 ? i432 : 0;
                gVar.f3464z0 = size;
                gVar.A0 = min;
                gVar.O(size);
                gVar.L(min);
                gVar.f3463y0 = gVar.f3472r0 > 0 ? r12 : false;
                setMeasuredDimension(gVar.f3464z0, gVar.A0);
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
                        if (dVar13.f3418p0[0] == 3) {
                            i14++;
                        }
                        int i89 = i14;
                        boolean z9 = (i88 == i33 || (gVar.P0 + i88) + U4 > i33) && fVar7.f3440b != null;
                        if (!z9 && i87 > 0 && (i16 = gVar.U0) > 0 && i87 % i16 == 0) {
                            z9 = true;
                        }
                        if (z9) {
                            fVar7 = new f(gVar, i86, gVar.I, gVar.J, gVar.K, gVar.L, i33);
                            fVar7.f3450n = i87;
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
                        if (dVar14.f3418p0[1] == 3) {
                            i14++;
                        }
                        int i92 = i14;
                        boolean z10 = (i91 == i33 || (gVar.Q0 + i91) + T4 > i33) && fVar7.f3440b != null;
                        if (!z10 && i90 > 0 && (i15 = gVar.U0) > 0 && i90 % i15 == 0) {
                            z10 = true;
                        }
                        if (z10) {
                            fVar7 = new f(gVar, i86, gVar.I, gVar.J, gVar.K, gVar.L, i33);
                            fVar7.f3450n = i90;
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
                int i93 = gVar.f3461w0;
                int i94 = gVar.f3457s0;
                int i95 = gVar.f3462x0;
                int i96 = gVar.f3458t0;
                boolean z11 = iArr2[0] == 2 || iArr2[1] == 2;
                if (i14 > 0 && z11) {
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
                            cVar19 = ((f) arrayList3.get(i104 + 1)).f3440b.J;
                            i101 = 0;
                        } else {
                            i101 = gVar.f3458t0;
                            cVar19 = cVar10;
                        }
                        c cVar21 = fVar9.f3440b.L;
                        fVar9.f(i86, cVar17, cVar20, cVar18, cVar19, i98, i99, i100, i101, i33);
                        i102 = Math.max(i102, fVar9.d());
                        int c6 = fVar9.c() + i103;
                        if (i104 > 0) {
                            c6 += gVar.Q0;
                        }
                        i103 = c6;
                        cVar20 = cVar21;
                        i99 = 0;
                    } else {
                        if (i104 < size4 - 1) {
                            cVar18 = ((f) arrayList3.get(i104 + 1)).f3440b.I;
                            i100 = 0;
                        } else {
                            i100 = gVar.f3462x0;
                            cVar18 = cVar9;
                        }
                        c cVar22 = fVar9.f3440b.K;
                        fVar9.f(i86, cVar17, cVar20, cVar18, cVar19, i98, i99, i100, i101, i33);
                        int d3 = fVar9.d() + i102;
                        int max2 = Math.max(i103, fVar9.c());
                        if (i104 > 0) {
                            d3 += gVar.P0;
                        }
                        i103 = max2;
                        i102 = d3;
                        cVar17 = cVar22;
                        i98 = 0;
                    }
                }
                iArr[0] = i102;
                iArr[1] = i103;
            }
        }
        z3 = true;
        c4 = 0;
        r12 = z3;
        int i4222 = iArr[c4] + i11 + i12;
        int i4322 = iArr[r12] + i13 + i9;
        if (mode != 1073741824) {
        }
        if (mode2 == 1073741824) {
        }
        gVar.f3464z0 = size;
        gVar.A0 = min;
        gVar.O(size);
        gVar.L(min);
        gVar.f3463y0 = gVar.f3472r0 > 0 ? r12 : false;
        setMeasuredDimension(gVar.f3464z0, gVar.A0);
    }

    @Override // y.c, android.view.View
    public final void onMeasure(int i, int i4) {
        j(this.f241o, i, i4);
    }

    public void setFirstHorizontalBias(float f2) {
        this.f241o.L0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f241o.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.f241o.M0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f241o.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f241o.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.f241o.J0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f241o.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f241o.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f2) {
        this.f241o.N0 = f2;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f241o.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f2) {
        this.f241o.O0 = f2;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f241o.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f241o.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f241o.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.f241o;
        gVar.f3457s0 = i;
        gVar.f3458t0 = i;
        gVar.f3459u0 = i;
        gVar.f3460v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f241o.f3458t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f241o.f3461w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f241o.f3462x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f241o.f3457s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f241o.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.f241o.K0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f241o.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f241o.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f241o.T0 = i;
        requestLayout();
    }
}

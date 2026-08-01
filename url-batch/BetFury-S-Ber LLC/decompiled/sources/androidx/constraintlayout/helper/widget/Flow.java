package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ef;
import defpackage.ln0;
import defpackage.os;
import defpackage.qf;
import defpackage.rf;
import defpackage.sf;
import defpackage.t8;
import defpackage.to;
import defpackage.uo;
import defpackage.x60;
import defpackage.xe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class Flow extends ln0 {
    public final uo o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new int[32];
        this.l = new HashMap();
        this.h = context;
        super.g(attributeSet);
        uo uoVar = new uo();
        uoVar.s0 = 0;
        uoVar.t0 = 0;
        uoVar.u0 = 0;
        uoVar.v0 = 0;
        uoVar.w0 = 0;
        uoVar.x0 = 0;
        uoVar.y0 = false;
        uoVar.z0 = 0;
        uoVar.A0 = 0;
        uoVar.B0 = new t8();
        uoVar.C0 = null;
        uoVar.D0 = -1;
        uoVar.E0 = -1;
        uoVar.F0 = -1;
        uoVar.G0 = -1;
        uoVar.H0 = -1;
        uoVar.I0 = -1;
        uoVar.J0 = 0.5f;
        uoVar.K0 = 0.5f;
        uoVar.L0 = 0.5f;
        uoVar.M0 = 0.5f;
        uoVar.N0 = 0.5f;
        uoVar.O0 = 0.5f;
        uoVar.P0 = 0;
        uoVar.Q0 = 0;
        uoVar.R0 = 2;
        uoVar.S0 = 2;
        uoVar.T0 = 0;
        uoVar.U0 = -1;
        uoVar.V0 = 0;
        uoVar.W0 = new ArrayList();
        uoVar.X0 = null;
        uoVar.Y0 = null;
        uoVar.Z0 = null;
        uoVar.b1 = 0;
        this.o = uoVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x60.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.o.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    uo uoVar2 = this.o;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    uoVar2.s0 = dimensionPixelSize;
                    uoVar2.t0 = dimensionPixelSize;
                    uoVar2.u0 = dimensionPixelSize;
                    uoVar2.v0 = dimensionPixelSize;
                } else if (index == 18) {
                    uo uoVar3 = this.o;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    uoVar3.u0 = dimensionPixelSize2;
                    uoVar3.w0 = dimensionPixelSize2;
                    uoVar3.x0 = dimensionPixelSize2;
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

    @Override // defpackage.af
    public final void h(rf rfVar, boolean z) {
        uo uoVar = this.o;
        int i = uoVar.u0;
        if (i > 0 || uoVar.v0 > 0) {
            if (z) {
                uoVar.w0 = uoVar.v0;
                uoVar.x0 = i;
            } else {
                uoVar.w0 = i;
                uoVar.x0 = uoVar.v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v5 */
    @Override // defpackage.ln0
    public final void j(uo uoVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        to toVar;
        char c;
        ?? r12;
        boolean z;
        int i10;
        int i11;
        int i12;
        int i13;
        Object obj;
        rf rfVar;
        boolean z2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        xe xeVar;
        xe xeVar2;
        xe xeVar3;
        ArrayList arrayList;
        int i19;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (uoVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        qf[] qfVarArr = uoVar.T;
        xe xeVar4 = uoVar.J;
        xe xeVar5 = uoVar.I;
        xe xeVar6 = uoVar.K;
        xe xeVar7 = uoVar.L;
        ArrayList arrayList2 = uoVar.W0;
        if (uoVar.r0 > 0) {
            t8 t8Var = uoVar.B0;
            rf rfVar2 = uoVar.U;
            ef efVar = rfVar2 != null ? ((sf) rfVar2).u0 : null;
            if (efVar == null) {
                uoVar.z0 = 0;
                uoVar.A0 = 0;
                uoVar.y0 = false;
                setMeasuredDimension(uoVar.z0, uoVar.A0);
            }
            int i20 = 0;
            while (i20 < uoVar.r0) {
                rf rfVar3 = uoVar.q0[i20];
                if (rfVar3 == null) {
                    xeVar = xeVar5;
                } else {
                    xeVar = xeVar5;
                    if (!(rfVar3 instanceof os)) {
                        xeVar2 = xeVar6;
                        qf j = rfVar3.j(0);
                        xeVar3 = xeVar7;
                        qf j2 = rfVar3.j(1);
                        qf qfVar = qf.MATCH_CONSTRAINT;
                        arrayList = arrayList2;
                        if (j == qfVar) {
                            i19 = i20;
                            if (rfVar3.r != 1 && j2 == qfVar && rfVar3.s != 1) {
                                i20 = i19 + 1;
                                xeVar5 = xeVar;
                                xeVar6 = xeVar2;
                                xeVar7 = xeVar3;
                                arrayList2 = arrayList;
                            }
                        } else {
                            i19 = i20;
                        }
                        if (j == qfVar) {
                            j = qf.WRAP_CONTENT;
                        }
                        if (j2 == qfVar) {
                            j2 = qf.WRAP_CONTENT;
                        }
                        t8Var.a = j;
                        t8Var.b = j2;
                        t8Var.c = rfVar3.q();
                        t8Var.d = rfVar3.k();
                        efVar.b(rfVar3, t8Var);
                        rfVar3.O(t8Var.e);
                        rfVar3.L(t8Var.f);
                        rfVar3.I(t8Var.g);
                        i20 = i19 + 1;
                        xeVar5 = xeVar;
                        xeVar6 = xeVar2;
                        xeVar7 = xeVar3;
                        arrayList2 = arrayList;
                    }
                }
                xeVar2 = xeVar6;
                xeVar3 = xeVar7;
                arrayList = arrayList2;
                i19 = i20;
                i20 = i19 + 1;
                xeVar5 = xeVar;
                xeVar6 = xeVar2;
                xeVar7 = xeVar3;
                arrayList2 = arrayList;
            }
        }
        xe xeVar8 = xeVar5;
        xe xeVar9 = xeVar6;
        xe xeVar10 = xeVar7;
        ArrayList arrayList3 = arrayList2;
        int i21 = uoVar.w0;
        int i22 = uoVar.x0;
        int i23 = uoVar.s0;
        int i24 = uoVar.t0;
        int[] iArr2 = new int[2];
        int i25 = (size - i21) - i22;
        int i26 = uoVar.V0;
        if (i26 == 1) {
            i25 = (size2 - i23) - i24;
        }
        int i27 = i25;
        int i28 = uoVar.D0;
        if (i26 == 0) {
            if (i28 == -1) {
                uoVar.D0 = 0;
            }
            if (uoVar.E0 == -1) {
                uoVar.E0 = 0;
            }
        } else {
            if (i28 == -1) {
                uoVar.D0 = 0;
            }
            if (uoVar.E0 == -1) {
                uoVar.E0 = 0;
            }
        }
        rf[] rfVarArr = uoVar.q0;
        int i29 = 0;
        int i30 = 0;
        while (true) {
            i3 = uoVar.r0;
            i4 = i23;
            if (i29 >= i3) {
                break;
            }
            if (uoVar.q0[i29].h0 == 8) {
                i30++;
            }
            i29++;
            i23 = i4;
        }
        if (i30 > 0) {
            rfVarArr = new rf[i3 - i30];
            int i31 = 0;
            int i32 = 0;
            while (i31 < uoVar.r0) {
                rf rfVar4 = uoVar.q0[i31];
                int i33 = i31;
                if (rfVar4.h0 != 8) {
                    rfVarArr[i32] = rfVar4;
                    i32++;
                }
                i31 = i33 + 1;
            }
            i3 = i32;
        }
        rf[] rfVarArr2 = rfVarArr;
        uoVar.a1 = rfVarArr2;
        uoVar.b1 = i3;
        int i34 = uoVar.T0;
        if (i34 == 0) {
            i5 = i21;
            int i35 = i3;
            i6 = i24;
            iArr = iArr2;
            i7 = size2;
            i8 = i22;
            i9 = i4;
            int i36 = uoVar.V0;
            if (i35 != 0) {
                if (arrayList3.size() == 0) {
                    toVar = new to(uoVar, i36, uoVar.I, uoVar.J, uoVar.K, uoVar.L, i27);
                    arrayList3.add(toVar);
                } else {
                    to toVar2 = (to) arrayList3.get(0);
                    toVar2.c = 0;
                    toVar2.b = null;
                    toVar2.l = 0;
                    toVar2.m = 0;
                    toVar2.n = 0;
                    toVar2.o = 0;
                    toVar2.p = 0;
                    toVar2.f(i36, uoVar.I, uoVar.J, uoVar.K, uoVar.L, uoVar.w0, uoVar.s0, uoVar.x0, uoVar.t0, i27);
                    toVar = toVar2;
                }
                for (int i37 = 0; i37 < i35; i37++) {
                    toVar.a(rfVarArr2[i37]);
                }
                c = 0;
                iArr[0] = toVar.d();
                r12 = 1;
                iArr[1] = toVar.c();
            }
            z = true;
            c = 0;
            r12 = z;
        } else if (i34 != 1) {
            if (i34 == 2) {
                int i38 = i3;
                i6 = i24;
                iArr = iArr2;
                i7 = size2;
                i5 = i21;
                i8 = i22;
                i9 = i4;
                int i39 = uoVar.V0;
                int i40 = uoVar.U0;
                if (i39 == 0) {
                    if (i40 <= 0) {
                        int i41 = 0;
                        i13 = 0;
                        for (int i42 = 0; i42 < i38; i42++) {
                            if (i42 > 0) {
                                i41 += uoVar.P0;
                            }
                            rf rfVar5 = rfVarArr2[i42];
                            if (rfVar5 != null) {
                                int U = uoVar.U(rfVar5, i27) + i41;
                                if (U > i27) {
                                    break;
                                }
                                i13++;
                                i41 = U;
                            }
                        }
                    } else {
                        i13 = i40;
                    }
                    i40 = 0;
                } else {
                    if (i40 <= 0) {
                        int i43 = 0;
                        int i44 = 0;
                        for (int i45 = 0; i45 < i38; i45++) {
                            if (i45 > 0) {
                                i43 += uoVar.Q0;
                            }
                            rf rfVar6 = rfVarArr2[i45];
                            if (rfVar6 != null) {
                                int T = uoVar.T(rfVar6, i27) + i43;
                                if (T > i27) {
                                    break;
                                }
                                i44++;
                                i43 = T;
                            }
                        }
                        i40 = i44;
                    }
                    i13 = 0;
                }
                if (uoVar.Z0 == null) {
                    uoVar.Z0 = new int[2];
                }
                boolean z3 = (i40 == 0 && i39 == 1) || (i13 == 0 && i39 == 0);
                while (!z3) {
                    if (i39 == 0) {
                        i40 = (int) Math.ceil(i38 / i13);
                    } else {
                        i13 = (int) Math.ceil(i38 / i40);
                    }
                    rf[] rfVarArr3 = uoVar.Y0;
                    if (rfVarArr3 == null || rfVarArr3.length < i13) {
                        obj = null;
                        uoVar.Y0 = new rf[i13];
                    } else {
                        obj = null;
                        Arrays.fill(rfVarArr3, (Object) null);
                    }
                    rf[] rfVarArr4 = uoVar.X0;
                    if (rfVarArr4 == null || rfVarArr4.length < i40) {
                        uoVar.X0 = new rf[i40];
                    } else {
                        Arrays.fill(rfVarArr4, obj);
                    }
                    for (int i46 = 0; i46 < i13; i46++) {
                        for (int i47 = 0; i47 < i40; i47++) {
                            int i48 = (i47 * i13) + i46;
                            if (i39 == 1) {
                                i48 = (i46 * i40) + i47;
                            }
                            if (i48 < rfVarArr2.length && (rfVar = rfVarArr2[i48]) != null) {
                                int U2 = uoVar.U(rfVar, i27);
                                rf rfVar7 = uoVar.Y0[i46];
                                if (rfVar7 == null || rfVar7.q() < U2) {
                                    uoVar.Y0[i46] = rfVar;
                                }
                                int T2 = uoVar.T(rfVar, i27);
                                rf rfVar8 = uoVar.X0[i47];
                                if (rfVar8 == null || rfVar8.k() < T2) {
                                    uoVar.X0[i47] = rfVar;
                                }
                            }
                        }
                    }
                    int i49 = 0;
                    for (int i50 = 0; i50 < i13; i50++) {
                        rf rfVar9 = uoVar.Y0[i50];
                        if (rfVar9 != null) {
                            if (i50 > 0) {
                                i49 += uoVar.P0;
                            }
                            i49 = uoVar.U(rfVar9, i27) + i49;
                        }
                    }
                    int i51 = 0;
                    for (int i52 = 0; i52 < i40; i52++) {
                        rf rfVar10 = uoVar.X0[i52];
                        if (rfVar10 != null) {
                            if (i52 > 0) {
                                i51 += uoVar.Q0;
                            }
                            i51 = uoVar.T(rfVar10, i27) + i51;
                        }
                    }
                    iArr[0] = i49;
                    iArr[1] = i51;
                    if (i39 == 0) {
                        if (i49 > i27 && i13 > 1) {
                            i13--;
                        }
                        z3 = true;
                    } else {
                        if (i51 > i27 && i40 > 1) {
                            i40--;
                        }
                        z3 = true;
                    }
                }
                int[] iArr3 = uoVar.Z0;
                iArr3[0] = i13;
                iArr3[1] = i40;
                z = true;
            } else if (i34 != 3) {
                i6 = i24;
                iArr = iArr2;
                i7 = size2;
                i5 = i21;
                i8 = i22;
                i9 = i4;
                c = 0;
                r12 = 1;
            } else {
                int i53 = uoVar.V0;
                if (i3 == 0) {
                    i6 = i24;
                    iArr = iArr2;
                    z2 = true;
                    i7 = size2;
                    i5 = i21;
                    i8 = i22;
                    i9 = i4;
                } else {
                    arrayList3.clear();
                    int i54 = i3;
                    i5 = i21;
                    z2 = true;
                    i6 = i24;
                    i8 = i22;
                    i9 = i4;
                    iArr = iArr2;
                    to toVar3 = new to(uoVar, i53, uoVar.I, uoVar.J, uoVar.K, uoVar.L, i27);
                    arrayList3.add(toVar3);
                    if (i53 == 0) {
                        int i55 = 0;
                        int i56 = 0;
                        i14 = 0;
                        int i57 = 0;
                        while (i55 < i54) {
                            i56++;
                            rf rfVar11 = rfVarArr2[i55];
                            int U3 = uoVar.U(rfVar11, i27);
                            int i58 = i53;
                            int i59 = i55;
                            if (rfVar11.T[0] == qf.MATCH_CONSTRAINT) {
                                i14++;
                            }
                            int i60 = i14;
                            boolean z4 = (i57 == i27 || (uoVar.P0 + i57) + U3 > i27) && toVar3.b != null;
                            if (!z4 && i59 > 0 && (i18 = uoVar.U0) > 0 && i56 > i18) {
                                z4 = true;
                            }
                            if (z4) {
                                i53 = i58;
                                i16 = size2;
                                i17 = i59;
                                toVar3 = new to(uoVar, i53, uoVar.I, uoVar.J, uoVar.K, uoVar.L, i27);
                                toVar3.n = i17;
                                arrayList3.add(toVar3);
                                i56 = 1;
                            } else {
                                i53 = i58;
                                i16 = size2;
                                i17 = i59;
                                if (i17 > 0) {
                                    i57 = uoVar.P0 + U3 + i57;
                                    toVar3.a(rfVar11);
                                    i55 = i17 + 1;
                                    i14 = i60;
                                    size2 = i16;
                                }
                            }
                            i57 = U3;
                            toVar3.a(rfVar11);
                            i55 = i17 + 1;
                            i14 = i60;
                            size2 = i16;
                        }
                        i7 = size2;
                    } else {
                        i7 = size2;
                        int i61 = 0;
                        int i62 = 0;
                        int i63 = 0;
                        int i64 = 0;
                        while (i61 < i54) {
                            i62++;
                            rf rfVar12 = rfVarArr2[i61];
                            int T3 = uoVar.T(rfVar12, i27);
                            int i65 = i53;
                            if (rfVar12.T[1] == qf.MATCH_CONSTRAINT) {
                                i63++;
                            }
                            int i66 = i63;
                            boolean z5 = (i64 == i27 || (uoVar.Q0 + i64) + T3 > i27) && toVar3.b != null;
                            if (!z5 && i61 > 0 && (i15 = uoVar.U0) > 0 && i62 > i15) {
                                z5 = true;
                            }
                            if (z5) {
                                i53 = i65;
                                toVar3 = new to(uoVar, i53, uoVar.I, uoVar.J, uoVar.K, uoVar.L, i27);
                                toVar3.n = i61;
                                arrayList3.add(toVar3);
                                i62 = 1;
                            } else {
                                i53 = i65;
                                if (i61 > 0) {
                                    i64 = uoVar.Q0 + T3 + i64;
                                    toVar3.a(rfVar12);
                                    i61++;
                                    i63 = i66;
                                }
                            }
                            i64 = T3;
                            toVar3.a(rfVar12);
                            i61++;
                            i63 = i66;
                        }
                        i14 = i63;
                    }
                    int size3 = arrayList3.size();
                    int i67 = uoVar.w0;
                    int i68 = uoVar.s0;
                    int i69 = uoVar.x0;
                    int i70 = uoVar.t0;
                    qf qfVar2 = qfVarArr[0];
                    qf qfVar3 = qf.WRAP_CONTENT;
                    boolean z6 = qfVar2 == qfVar3 || qfVarArr[1] == qfVar3;
                    if (i14 > 0 && z6) {
                        for (int i71 = 0; i71 < size3; i71++) {
                            to toVar4 = (to) arrayList3.get(i71);
                            if (i53 == 0) {
                                toVar4.e(i27 - toVar4.d());
                            } else {
                                toVar4.e(i27 - toVar4.c());
                            }
                        }
                    }
                    int i72 = i67;
                    int i73 = i68;
                    int i74 = i69;
                    int i75 = i70;
                    xe xeVar11 = xeVar8;
                    xe xeVar12 = xeVar9;
                    xe xeVar13 = xeVar10;
                    xe xeVar14 = xeVar4;
                    int i76 = 0;
                    int i77 = 0;
                    for (int i78 = 0; i78 < size3; i78++) {
                        to toVar5 = (to) arrayList3.get(i78);
                        if (i53 == 0) {
                            if (i78 < size3 - 1) {
                                xeVar13 = ((to) arrayList3.get(i78 + 1)).b.J;
                                i75 = 0;
                            } else {
                                i75 = uoVar.t0;
                                xeVar13 = xeVar10;
                            }
                            xe xeVar15 = toVar5.b.L;
                            toVar5.f(i53, xeVar11, xeVar14, xeVar12, xeVar13, i72, i73, i74, i75, i27);
                            i76 = Math.max(i76, toVar5.d());
                            int c2 = toVar5.c() + i77;
                            if (i78 > 0) {
                                c2 += uoVar.Q0;
                            }
                            i77 = c2;
                            xeVar14 = xeVar15;
                            i73 = 0;
                        } else {
                            if (i78 < size3 - 1) {
                                xeVar12 = ((to) arrayList3.get(i78 + 1)).b.I;
                                i74 = 0;
                            } else {
                                i74 = uoVar.x0;
                                xeVar12 = xeVar9;
                            }
                            xe xeVar16 = toVar5.b.K;
                            toVar5.f(i53, xeVar11, xeVar14, xeVar12, xeVar13, i72, i73, i74, i75, i27);
                            int d = toVar5.d() + i76;
                            int max = Math.max(i77, toVar5.c());
                            if (i78 > 0) {
                                d += uoVar.P0;
                            }
                            i77 = max;
                            i76 = d;
                            xeVar11 = xeVar16;
                            i72 = 0;
                        }
                    }
                    iArr[0] = i76;
                    iArr[1] = i77;
                }
                z = z2;
            }
            c = 0;
            r12 = z;
        } else {
            i5 = i21;
            i6 = i24;
            iArr = iArr2;
            i7 = size2;
            i8 = i22;
            i9 = i4;
            int i79 = i3;
            int i80 = uoVar.V0;
            if (i79 != 0) {
                arrayList3.clear();
                to toVar6 = new to(uoVar, i80, uoVar.I, uoVar.J, uoVar.K, uoVar.L, i27);
                arrayList3.add(toVar6);
                if (i80 == 0) {
                    int i81 = 0;
                    i10 = 0;
                    int i82 = 0;
                    while (i81 < i79) {
                        rf rfVar13 = rfVarArr2[i81];
                        int U4 = uoVar.U(rfVar13, i27);
                        if (rfVar13.T[0] == qf.MATCH_CONSTRAINT) {
                            i10++;
                        }
                        int i83 = i10;
                        boolean z7 = (i82 == i27 || (uoVar.P0 + i82) + U4 > i27) && toVar6.b != null;
                        if (!z7 && i81 > 0 && (i12 = uoVar.U0) > 0 && i81 % i12 == 0) {
                            z7 = true;
                        }
                        if (z7) {
                            toVar6 = new to(uoVar, i80, uoVar.I, uoVar.J, uoVar.K, uoVar.L, i27);
                            toVar6.n = i81;
                            arrayList3.add(toVar6);
                        } else if (i81 > 0) {
                            i82 = uoVar.P0 + U4 + i82;
                            toVar6.a(rfVar13);
                            i81++;
                            i10 = i83;
                        }
                        i82 = U4;
                        toVar6.a(rfVar13);
                        i81++;
                        i10 = i83;
                    }
                } else {
                    int i84 = 0;
                    i10 = 0;
                    int i85 = 0;
                    while (i84 < i79) {
                        rf rfVar14 = rfVarArr2[i84];
                        int T4 = uoVar.T(rfVar14, i27);
                        if (rfVar14.T[1] == qf.MATCH_CONSTRAINT) {
                            i10++;
                        }
                        int i86 = i10;
                        boolean z8 = (i85 == i27 || (uoVar.Q0 + i85) + T4 > i27) && toVar6.b != null;
                        if (!z8 && i84 > 0 && (i11 = uoVar.U0) > 0 && i84 % i11 == 0) {
                            z8 = true;
                        }
                        if (z8) {
                            toVar6 = new to(uoVar, i80, uoVar.I, uoVar.J, uoVar.K, uoVar.L, i27);
                            toVar6.n = i84;
                            arrayList3.add(toVar6);
                        } else if (i84 > 0) {
                            i85 = uoVar.Q0 + T4 + i85;
                            toVar6.a(rfVar14);
                            i84++;
                            i10 = i86;
                        }
                        i85 = T4;
                        toVar6.a(rfVar14);
                        i84++;
                        i10 = i86;
                    }
                }
                int size4 = arrayList3.size();
                int i87 = uoVar.w0;
                int i88 = uoVar.s0;
                int i89 = uoVar.x0;
                int i90 = uoVar.t0;
                qf qfVar4 = qfVarArr[0];
                qf qfVar5 = qf.WRAP_CONTENT;
                boolean z9 = qfVar4 == qfVar5 || qfVarArr[1] == qfVar5;
                if (i10 > 0 && z9) {
                    for (int i91 = 0; i91 < size4; i91++) {
                        to toVar7 = (to) arrayList3.get(i91);
                        if (i80 == 0) {
                            toVar7.e(i27 - toVar7.d());
                        } else {
                            toVar7.e(i27 - toVar7.c());
                        }
                    }
                }
                int i92 = i87;
                int i93 = i88;
                int i94 = i89;
                int i95 = i90;
                xe xeVar17 = xeVar8;
                xe xeVar18 = xeVar9;
                xe xeVar19 = xeVar10;
                xe xeVar20 = xeVar4;
                int i96 = 0;
                int i97 = 0;
                for (int i98 = 0; i98 < size4; i98++) {
                    to toVar8 = (to) arrayList3.get(i98);
                    if (i80 == 0) {
                        if (i98 < size4 - 1) {
                            xeVar19 = ((to) arrayList3.get(i98 + 1)).b.J;
                            i95 = 0;
                        } else {
                            i95 = uoVar.t0;
                            xeVar19 = xeVar10;
                        }
                        xe xeVar21 = toVar8.b.L;
                        toVar8.f(i80, xeVar17, xeVar20, xeVar18, xeVar19, i92, i93, i94, i95, i27);
                        i96 = Math.max(i96, toVar8.d());
                        int c3 = toVar8.c() + i97;
                        if (i98 > 0) {
                            c3 += uoVar.Q0;
                        }
                        i97 = c3;
                        xeVar20 = xeVar21;
                        i93 = 0;
                    } else {
                        if (i98 < size4 - 1) {
                            xeVar18 = ((to) arrayList3.get(i98 + 1)).b.I;
                            i94 = 0;
                        } else {
                            i94 = uoVar.x0;
                            xeVar18 = xeVar9;
                        }
                        xe xeVar22 = toVar8.b.K;
                        toVar8.f(i80, xeVar17, xeVar20, xeVar18, xeVar19, i92, i93, i94, i95, i27);
                        int d2 = toVar8.d() + i96;
                        int max2 = Math.max(i97, toVar8.c());
                        if (i98 > 0) {
                            d2 += uoVar.P0;
                        }
                        i97 = max2;
                        i96 = d2;
                        xeVar17 = xeVar22;
                        i92 = 0;
                    }
                }
                iArr[0] = i96;
                iArr[1] = i97;
            }
            z = true;
            c = 0;
            r12 = z;
        }
        int i99 = iArr[c] + i5 + i8;
        int i100 = iArr[r12] + i9 + i6;
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(i99, size) : mode == 0 ? i99 : 0;
        }
        int min = mode2 == 1073741824 ? i7 : mode2 == Integer.MIN_VALUE ? Math.min(i100, i7) : mode2 == 0 ? i100 : 0;
        uoVar.z0 = size;
        uoVar.A0 = min;
        uoVar.O(size);
        uoVar.L(min);
        uoVar.y0 = uoVar.r0 > 0 ? r12 : false;
        setMeasuredDimension(uoVar.z0, uoVar.A0);
    }

    @Override // defpackage.af, android.view.View
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
        uo uoVar = this.o;
        uoVar.s0 = i;
        uoVar.t0 = i;
        uoVar.u0 = i;
        uoVar.v0 = i;
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

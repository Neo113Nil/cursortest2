package defpackage;

import android.graphics.Path;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.internal.l;
import com.feathherdashh.dashgame.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class y90 {
    public static final Object A(Object[] objArr, h61 h61Var, Function0 function0, hl hlVar, int i, int i2) {
        Object[] objArr2;
        final Object obj;
        Object d;
        if ((i2 & 2) != 0) {
            h61Var = yr1.q;
        }
        final h61 h61Var2 = h61Var;
        final String l = Long.toString(hlVar.T, CharsKt.checkRadix(36));
        l.getClass();
        h61Var2.getClass();
        final t51 t51Var = (t51) hlVar.j(v51.a);
        Object L = hlVar.L();
        Object obj2 = bl.a;
        if (L == obj2) {
            Object b = (t51Var == null || (d = t51Var.d(l)) == null) ? null : h61Var2.b(d);
            if (b == null) {
                b = function0.invoke();
            }
            objArr2 = objArr;
            Object o51Var = new o51(h61Var2, t51Var, l, b, objArr2);
            hlVar.h0(o51Var);
            L = o51Var;
        } else {
            objArr2 = objArr;
        }
        final o51 o51Var2 = (o51) L;
        Object obj3 = Arrays.equals(objArr2, o51Var2.i) ? o51Var2.h : null;
        if (obj3 == null) {
            obj3 = function0.invoke();
        }
        boolean h = hlVar.h(o51Var2) | hlVar.h(h61Var2) | hlVar.h(t51Var) | hlVar.f(l) | hlVar.h(obj3) | hlVar.h(objArr2);
        Object L2 = hlVar.L();
        if (h || L2 == obj2) {
            final Object[] objArr3 = objArr2;
            obj = obj3;
            Object obj4 = new Function0() { // from class: l21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z;
                    o51 o51Var3 = o51.this;
                    t51 t51Var2 = o51Var3.e;
                    t51 t51Var3 = t51Var;
                    boolean z2 = true;
                    if (t51Var2 != t51Var3) {
                        o51Var3.e = t51Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = o51Var3.g;
                    String str2 = l;
                    if (Intrinsics.a(str, str2)) {
                        z2 = z;
                    } else {
                        o51Var3.g = str2;
                    }
                    o51Var3.d = h61Var2;
                    o51Var3.h = obj;
                    o51Var3.i = objArr3;
                    s51 s51Var = o51Var3.j;
                    if (s51Var != null && z2) {
                        ((i8) s51Var).w();
                        o51Var3.j = null;
                        o51Var3.a();
                    }
                    return Unit.a;
                }
            };
            hlVar.h0(obj4);
            L2 = obj4;
        } else {
            obj = obj3;
        }
        p4.k((Function0) L2, hlVar);
        return obj;
    }

    public static final void B(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final x90 C(s11 s11Var) {
        return new x90(Math.round(s11Var.a), Math.round(s11Var.b), Math.round(s11Var.c), Math.round(s11Var.d));
    }

    public static final void D(bt0 bt0Var, int i, Object obj) {
        bt0Var.e[(bt0Var.f - bt0Var.a[bt0Var.b - 1].b) + i] = obj;
    }

    public static final void E(bt0 bt0Var, int i, Object obj, int i2, Object obj2) {
        int i3 = bt0Var.f - bt0Var.a[bt0Var.b - 1].b;
        Object[] objArr = bt0Var.e;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final Object F(ni1 ni1Var, Function2 function2) {
        Object hjVar;
        Object Z;
        t80.A(ni1Var, true, new us(mo.r(ni1Var.j.g()).e(ni1Var.k, ni1Var, ni1Var.i)));
        try {
            if (function2 instanceof yc) {
                tj1.b(2, function2);
                hjVar = function2.b(ni1Var, ni1Var);
            } else {
                hjVar = qa0.c(function2, ni1Var, ni1Var);
            }
        } catch (Throwable th) {
            hjVar = new hj(th, false);
        }
        tn tnVar = tn.d;
        if (hjVar == tnVar || (Z = ni1Var.Z(hjVar)) == yr1.j) {
            return tnVar;
        }
        if (Z instanceof hj) {
            Throwable th2 = ((hj) Z).a;
            if (!(th2 instanceof mi1)) {
                throw th2;
            }
            if (((mi1) th2).d != ni1Var) {
                throw th2;
            }
            if (hjVar instanceof hj) {
                throw ((hj) hjVar).a;
            }
        } else {
            hjVar = yr1.f0(Z);
        }
        return hjVar;
    }

    public static final Object G(y61 y61Var, y61 y61Var2, Function2 function2) {
        Object hjVar;
        Object Z;
        try {
            tj1.b(2, function2);
            hjVar = function2.b(y61Var2, y61Var);
        } catch (Throwable th) {
            hjVar = new hj(th, false);
        }
        tn tnVar = tn.d;
        if (hjVar == tnVar || (Z = y61Var.Z(hjVar)) == yr1.j) {
            return tnVar;
        }
        if (Z instanceof hj) {
            throw ((hj) Z).a;
        }
        return yr1.f0(Z);
    }

    public static final void H(List list, c6 c6Var) {
        Path path;
        int i;
        float f;
        int i2;
        zv0 zv0Var;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        Path path2 = c6Var.a;
        Path path3 = c6Var.a;
        Path.FillType fillType = path2.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path3.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path3.setFillType(fillType2);
        zv0 zv0Var2 = list2.isEmpty() ? hv0.c : (zv0) list2.get(0);
        int size = list2.size();
        float f10 = 0.0f;
        int i3 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i3 < size) {
            zv0 zv0Var3 = (zv0) list2.get(i3);
            if (zv0Var3 instanceof hv0) {
                path3.close();
                path = path3;
                i = size;
                f = f10;
                i2 = i3;
                zv0Var = zv0Var3;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (zv0Var3 instanceof tv0) {
                    tv0 tv0Var = (tv0) zv0Var3;
                    float f17 = tv0Var.c;
                    f13 += f17;
                    float f18 = tv0Var.d;
                    f14 += f18;
                    path3.rMoveTo(f17, f18);
                    path = path3;
                    i = size;
                    f = f10;
                    i2 = i3;
                    f15 = f13;
                    f16 = f14;
                } else {
                    if (zv0Var3 instanceof lv0) {
                        lv0 lv0Var = (lv0) zv0Var3;
                        float f19 = lv0Var.c;
                        float f20 = lv0Var.d;
                        path3.moveTo(f19, f20);
                        f14 = f20;
                        f16 = f14;
                        path = path3;
                        f13 = f19;
                        f15 = f13;
                    } else {
                        if (zv0Var3 instanceof sv0) {
                            sv0 sv0Var = (sv0) zv0Var3;
                            float f21 = sv0Var.d;
                            float f22 = sv0Var.c;
                            path3.rLineTo(f22, f21);
                            f13 += f22;
                            f14 += f21;
                        } else if (zv0Var3 instanceof kv0) {
                            kv0 kv0Var = (kv0) zv0Var3;
                            float f23 = kv0Var.d;
                            float f24 = kv0Var.c;
                            path3.lineTo(f24, f23);
                            f13 = f24;
                            path = path3;
                            f14 = f23;
                        } else if (zv0Var3 instanceof rv0) {
                            float f25 = ((rv0) zv0Var3).c;
                            path3.rLineTo(f25, f10);
                            f13 += f25;
                        } else if (zv0Var3 instanceof jv0) {
                            float f26 = ((jv0) zv0Var3).c;
                            path3.lineTo(f26, f14);
                            f13 = f26;
                        } else {
                            if (zv0Var3 instanceof xv0) {
                                f9 = ((xv0) zv0Var3).c;
                                path3.rLineTo(f10, f9);
                            } else if (zv0Var3 instanceof yv0) {
                                float f27 = ((yv0) zv0Var3).c;
                                path3.lineTo(f13, f27);
                                f14 = f27;
                            } else if (zv0Var3 instanceof qv0) {
                                qv0 qv0Var = (qv0) zv0Var3;
                                path3.rCubicTo(qv0Var.c, qv0Var.d, qv0Var.e, qv0Var.f, qv0Var.g, qv0Var.h);
                                f11 = qv0Var.e + f13;
                                f12 = qv0Var.f + f14;
                                f13 += qv0Var.g;
                                f9 = qv0Var.h;
                            } else {
                                if (zv0Var3 instanceof iv0) {
                                    iv0 iv0Var = (iv0) zv0Var3;
                                    path3.cubicTo(iv0Var.c, iv0Var.d, iv0Var.e, iv0Var.f, iv0Var.g, iv0Var.h);
                                    f11 = iv0Var.e;
                                    f12 = iv0Var.f;
                                    f5 = iv0Var.g;
                                    f6 = iv0Var.h;
                                } else if (zv0Var3 instanceof vv0) {
                                    if (zv0Var2.a) {
                                        f8 = f14 - f12;
                                        f7 = f13 - f11;
                                    } else {
                                        f7 = f10;
                                        f8 = f7;
                                    }
                                    vv0 vv0Var = (vv0) zv0Var3;
                                    path3.rCubicTo(f7, f8, vv0Var.c, vv0Var.d, vv0Var.e, vv0Var.f);
                                    f11 = vv0Var.c + f13;
                                    f12 = vv0Var.d + f14;
                                    f13 += vv0Var.e;
                                    f9 = vv0Var.f;
                                } else if (zv0Var3 instanceof nv0) {
                                    if (zv0Var2.a) {
                                        f13 = (f13 * 2.0f) - f11;
                                        f14 = (2.0f * f14) - f12;
                                    }
                                    nv0 nv0Var = (nv0) zv0Var3;
                                    path3.cubicTo(f13, f14, nv0Var.c, nv0Var.d, nv0Var.e, nv0Var.f);
                                    f11 = nv0Var.c;
                                    f12 = nv0Var.d;
                                    f5 = nv0Var.e;
                                    f6 = nv0Var.f;
                                } else if (zv0Var3 instanceof uv0) {
                                    uv0 uv0Var = (uv0) zv0Var3;
                                    float f28 = uv0Var.f;
                                    float f29 = uv0Var.e;
                                    float f30 = uv0Var.d;
                                    float f31 = uv0Var.c;
                                    path3.rQuadTo(f31, f30, f29, f28);
                                    float f32 = f31 + f13;
                                    float f33 = f30 + f14;
                                    f13 += f29;
                                    f14 += f28;
                                    f11 = f32;
                                    path = path3;
                                    f12 = f33;
                                } else {
                                    if (zv0Var3 instanceof mv0) {
                                        mv0 mv0Var = (mv0) zv0Var3;
                                        float f34 = mv0Var.f;
                                        float f35 = mv0Var.e;
                                        float f36 = mv0Var.d;
                                        f4 = mv0Var.c;
                                        path3.quadTo(f4, f36, f35, f34);
                                        path = path3;
                                        f14 = f34;
                                        f13 = f35;
                                        f12 = f36;
                                    } else if (zv0Var3 instanceof wv0) {
                                        if (zv0Var2.b) {
                                            f2 = f13 - f11;
                                            f3 = f14 - f12;
                                        } else {
                                            f2 = f10;
                                            f3 = f2;
                                        }
                                        wv0 wv0Var = (wv0) zv0Var3;
                                        float f37 = wv0Var.d;
                                        float f38 = wv0Var.c;
                                        path3.rQuadTo(f2, f3, f38, f37);
                                        f4 = f2 + f13;
                                        float f39 = f3 + f14;
                                        f13 += f38;
                                        f14 += f37;
                                        path = path3;
                                        f12 = f39;
                                    } else if (zv0Var3 instanceof ov0) {
                                        if (zv0Var2.b) {
                                            f13 = (f13 * 2.0f) - f11;
                                            f14 = (2.0f * f14) - f12;
                                        }
                                        ov0 ov0Var = (ov0) zv0Var3;
                                        float f40 = ov0Var.d;
                                        float f41 = ov0Var.c;
                                        path3.quadTo(f13, f14, f41, f40);
                                        path = path3;
                                        i = size;
                                        f = f10;
                                        i2 = i3;
                                        f12 = f14;
                                        zv0Var = zv0Var3;
                                        f14 = f40;
                                        f11 = f13;
                                        f13 = f41;
                                    } else if (zv0Var3 instanceof pv0) {
                                        pv0 pv0Var = (pv0) zv0Var3;
                                        float f42 = pv0Var.h + f13;
                                        float f43 = pv0Var.i + f14;
                                        i = size;
                                        f = 0.0f;
                                        path = path3;
                                        i2 = i3;
                                        o(c6Var, f13, f14, f42, f43, pv0Var.c, pv0Var.d, pv0Var.e, pv0Var.f, pv0Var.g);
                                        f11 = f42;
                                        f13 = f11;
                                        f12 = f43;
                                        f14 = f12;
                                        zv0Var = zv0Var3;
                                    } else {
                                        path = path3;
                                        i = size;
                                        f = f10;
                                        i2 = i3;
                                        if (!(zv0Var3 instanceof gv0)) {
                                            l.a();
                                            return;
                                        }
                                        gv0 gv0Var = (gv0) zv0Var3;
                                        float f44 = gv0Var.i;
                                        float f45 = gv0Var.h;
                                        zv0Var = zv0Var3;
                                        o(c6Var, f13, f14, f45, f44, gv0Var.c, gv0Var.d, gv0Var.e, gv0Var.f, gv0Var.g);
                                        f12 = f44;
                                        f14 = f12;
                                        f11 = f45;
                                        f13 = f11;
                                    }
                                    i = size;
                                    f = f10;
                                    i2 = i3;
                                    zv0Var = zv0Var3;
                                    f11 = f4;
                                }
                                f14 = f6;
                                path = path3;
                                f13 = f5;
                            }
                            f14 += f9;
                        }
                        path = path3;
                    }
                    i = size;
                    f = f10;
                    i2 = i3;
                }
                zv0Var = zv0Var3;
            }
            i3 = i2 + 1;
            list2 = list;
            size = i;
            path3 = path;
            zv0Var2 = zv0Var;
            f10 = f;
        }
    }

    public static void I(float[] fArr, float f, float f2) {
        if (fArr.length < 16) {
            return;
        }
        float f3 = (fArr[8] * 0.0f) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f4 = (fArr[9] * 0.0f) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f5 = (fArr[10] * 0.0f) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f6 = (fArr[11] * 0.0f) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(long j, Function2 function2, fn fnVar) {
        oi1 oi1Var;
        int i;
        z11 z11Var;
        if (fnVar instanceof oi1) {
            oi1Var = (oi1) fnVar;
            int i2 = oi1Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oi1Var.j = i2 - Integer.MIN_VALUE;
                Object obj = oi1Var.i;
                tn tnVar = tn.d;
                i = oi1Var.j;
                if (i != 0) {
                    ca0.v(obj);
                    if (j > 0) {
                        z11 z11Var2 = new z11();
                        try {
                            oi1Var.h = z11Var2;
                            oi1Var.j = 1;
                            ni1 ni1Var = new ni1(j, oi1Var);
                            z11Var2.d = ni1Var;
                            Object F = F(ni1Var, function2);
                            return F == tnVar ? tnVar : F;
                        } catch (mi1 e) {
                            e = e;
                            z11Var = z11Var2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z11Var = oi1Var.h;
                try {
                    ca0.v(obj);
                    return obj;
                } catch (mi1 e2) {
                    e = e2;
                }
                if (e.d != z11Var.d) {
                    throw e;
                }
                return null;
            }
        }
        oi1Var = new oi1(fnVar);
        Object obj2 = oi1Var.i;
        tn tnVar2 = tn.d;
        i = oi1Var.j;
        if (i != 0) {
        }
        if (e.d != z11Var.d) {
        }
        return null;
    }

    public static void K(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int P = P(parcel, i);
        parcel.writeBundle(bundle);
        Q(parcel, P);
    }

    public static void L(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int P = P(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        Q(parcel, P);
    }

    public static void M(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int P = P(parcel, i);
        parcel.writeString(str);
        Q(parcel, P);
    }

    public static void N(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int P = P(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        Q(parcel, P);
    }

    public static void O(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int P = P(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        Q(parcel, P);
    }

    public static int P(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void Q(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void R(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static final void a(Object obj, int i, ye0 ye0Var, hk hkVar, hl hlVar, int i2) {
        int i3;
        hlVar.Y(872548579);
        if ((i2 & 6) == 0) {
            i3 = (hlVar.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= hlVar.h(ye0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= hlVar.h(hkVar) ? 2048 : 1024;
        }
        if (hlVar.O(i3 & 1, (i3 & 1171) != 1170)) {
            boolean f = hlVar.f(obj) | hlVar.f(ye0Var);
            Object L = hlVar.L();
            Object obj2 = bl.a;
            if (f || L == obj2) {
                L = new we0(obj, ye0Var);
                hlVar.h0(L);
            }
            we0 we0Var = (we0) L;
            we0Var.c = i;
            av0 av0Var = we0Var.g;
            m01 m01Var = xw0.a;
            we0 we0Var2 = (we0) hlVar.j(m01Var);
            ib1 n = ca0.n();
            Function1 e = n != null ? n.e() : null;
            ib1 s = ca0.s(n);
            try {
                if (we0Var2 != ((we0) av0Var.getValue())) {
                    av0Var.setValue(we0Var2);
                    if (we0Var.d > 0) {
                        we0 we0Var3 = we0Var.e;
                        if (we0Var3 != null) {
                            we0Var3.b();
                        }
                        if (we0Var2 != null) {
                            we0Var2.a();
                        } else {
                            we0Var2 = null;
                        }
                        we0Var.e = we0Var2;
                    }
                }
                ca0.u(n, s, e);
                boolean f2 = hlVar.f(we0Var);
                Object L2 = hlVar.L();
                if (f2 || L2 == obj2) {
                    L2 = new l(7, we0Var);
                    hlVar.h0(L2);
                }
                p4.b(we0Var, (Function1) L2, hlVar);
                op.a(m01Var.a(we0Var), hkVar, hlVar, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                ca0.u(n, s, e);
                throw th;
            }
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new xe0(obj, i, ye0Var, hkVar, i2);
        }
    }

    public static final boolean b(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static final void c(int i, int i2) {
        if (i < 0 || i >= i2) {
            af.h(i, i2, ", size: ", "index: ");
        }
    }

    public static void d(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            dd0.e("Given String is empty or null");
        }
    }

    public static void f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            dd0.e(str2);
        }
    }

    public static void g() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                dd0.j("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static void h(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        dd0.j(str);
    }

    public static void i(Object obj) {
        if (obj != null) {
            return;
        }
        l.b("null reference");
    }

    public static void j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        l.b(str);
    }

    public static final void k(int i, int i2) {
        if (i < 0 || i > i2) {
            af.h(i, i2, ", size: ", "index: ");
        }
    }

    public static final void l(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
    }

    public static float[] m() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final void n(q50 q50Var, lm1 lm1Var) {
        List list = lm1Var.n;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nm1 nm1Var = (nm1) list.get(i);
            if (nm1Var instanceof pm1) {
                fv0 fv0Var = new fv0();
                pm1 pm1Var = (pm1) nm1Var;
                fv0Var.d = pm1Var.e;
                fv0Var.n = true;
                fv0Var.c();
                fv0Var.s.a.setFillType(pm1Var.g == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                fv0Var.c();
                fv0Var.c();
                fv0Var.b = pm1Var.h;
                fv0Var.c();
                fv0Var.c = pm1Var.i;
                fv0Var.c();
                fv0Var.g = pm1Var.j;
                fv0Var.c();
                fv0Var.e = pm1Var.k;
                fv0Var.c();
                fv0Var.f = pm1Var.l;
                fv0Var.o = true;
                fv0Var.c();
                fv0Var.h = pm1Var.m;
                fv0Var.o = true;
                fv0Var.c();
                fv0Var.i = pm1Var.n;
                fv0Var.o = true;
                fv0Var.c();
                fv0Var.j = pm1Var.o;
                fv0Var.o = true;
                fv0Var.c();
                fv0Var.k = pm1Var.p;
                fv0Var.p = true;
                fv0Var.c();
                fv0Var.l = pm1Var.q;
                fv0Var.p = true;
                fv0Var.c();
                fv0Var.m = pm1Var.r;
                fv0Var.p = true;
                fv0Var.c();
                q50Var.e(i, fv0Var);
            } else if (nm1Var instanceof lm1) {
                q50 q50Var2 = new q50();
                lm1 lm1Var2 = (lm1) nm1Var;
                q50Var2.k = lm1Var2.d;
                q50Var2.c();
                q50Var2.l = lm1Var2.e;
                q50Var2.s = true;
                q50Var2.c();
                q50Var2.o = lm1Var2.i;
                q50Var2.s = true;
                q50Var2.c();
                q50Var2.p = lm1Var2.j;
                q50Var2.s = true;
                q50Var2.c();
                q50Var2.q = lm1Var2.k;
                q50Var2.s = true;
                q50Var2.c();
                q50Var2.r = lm1Var2.l;
                q50Var2.s = true;
                q50Var2.c();
                q50Var2.m = lm1Var2.g;
                q50Var2.s = true;
                q50Var2.c();
                q50Var2.n = lm1Var2.h;
                q50Var2.s = true;
                q50Var2.c();
                q50Var2.f = lm1Var2.m;
                q50Var2.g = true;
                q50Var2.c();
                n(q50Var2, lm1Var2);
                q50Var.e(i, q50Var2);
            }
        }
    }

    public static final void o(c6 c6Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            o(c6Var, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d21);
        double d22 = d16 * sqrt2;
        double d23 = sqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double atan2 = Math.atan2(d13 - d9, d12 - d8);
        double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * cos) - (d25 * sin);
        double d27 = (d25 * cos) + (d24 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d11);
        double sin2 = Math.sin(d11);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d28 = -d10;
        double d29 = d28 * cos2;
        double d30 = d6 * sin2;
        double d31 = (d29 * sin3) - (d30 * cos3);
        double d32 = d28 * sin2;
        double d33 = d6 * cos2;
        double d34 = (cos3 * d33) + (sin3 * d32);
        double d35 = atan22 / ceil;
        double d36 = atan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < ceil) {
            double d40 = d36 + d35;
            double sin4 = Math.sin(d40);
            double cos4 = Math.cos(d40);
            int i2 = ceil;
            double d41 = (((d10 * cos2) * cos4) + d26) - (d30 * sin4);
            double d42 = (d33 * sin4) + (d10 * sin2 * cos4) + d27;
            double d43 = (d29 * sin4) - (d30 * cos4);
            double d44 = (cos4 * d33) + (sin4 * d32);
            double d45 = d40 - d36;
            double tan = Math.tan(d45 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            c6Var.a.cubicTo((float) ((d37 * sqrt3) + d), (float) ((d38 * sqrt3) + d39), (float) (d41 - (sqrt3 * d43)), (float) (d42 - (sqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            sin2 = sin2;
            d26 = d26;
            d = d41;
            i++;
            d32 = d32;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            ceil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    public static final void p(hu huVar, long j, float f, float f2) {
        float f3 = f / 2.0f;
        float intBitsToFloat = (Float.intBitsToFloat((int) (huVar.x() >> 32)) - f3) - f2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (huVar.x() & 4294967295L)) / 2.0f;
        hu.T(huVar, j, f3, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), 120);
    }

    public static final String q(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final wj r(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            wj wjVar = tag instanceof wj ? (wj) tag : null;
            if (wjVar != null) {
                return wjVar;
            }
            Object x = gb0.x(view);
            view = x instanceof View ? (View) x : null;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class s(yg ygVar) {
        ygVar.getClass();
        Class cls = ygVar.a;
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    public static final void t(ad0 ad0Var) {
        op.I(ad0Var).C();
    }

    public static final long u(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1.0f / (((f6 * intBitsToFloat2) + (f3 * intBitsToFloat)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        float f11 = ((f5 * intBitsToFloat2) + (f2 * intBitsToFloat) + f8) * f10;
        return (Float.floatToRawIntBits((((f4 * intBitsToFloat2) + (f * intBitsToFloat)) + f7) * f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
    }

    public static final void v(float[] fArr, un0 un0Var) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float f10 = un0Var.a;
        float f11 = un0Var.b;
        float f12 = un0Var.c;
        float f13 = un0Var.d;
        float f14 = f3 * f10;
        float f15 = f6 * f11;
        float f16 = 1.0f / ((f14 + f15) + f9);
        if ((Float.floatToRawIntBits(f16) & Integer.MAX_VALUE) >= 2139095040) {
            f16 = 0.0f;
        }
        float f17 = f * f10;
        float f18 = f4 * f11;
        float f19 = (f17 + f18 + f7) * f16;
        float f20 = f10 * f2;
        float f21 = f11 * f5;
        float f22 = (f20 + f21 + f8) * f16;
        float f23 = f6 * f13;
        float f24 = 1.0f / ((f14 + f23) + f9);
        if ((Float.floatToRawIntBits(f24) & Integer.MAX_VALUE) >= 2139095040) {
            f24 = 0.0f;
        }
        float f25 = f4 * f13;
        float f26 = (f17 + f25 + f7) * f24;
        float f27 = f5 * f13;
        float f28 = (f20 + f27 + f8) * f24;
        float f29 = f3 * f12;
        float f30 = 1.0f / ((f15 + f29) + f9);
        if ((Float.floatToRawIntBits(f30) & Integer.MAX_VALUE) >= 2139095040) {
            f30 = 0.0f;
        }
        float f31 = f * f12;
        float f32 = (f31 + f18 + f7) * f30;
        float f33 = f12 * f2;
        float f34 = (f21 + f33 + f8) * f30;
        float f35 = 1.0f / ((f29 + f23) + f9);
        float f36 = (Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) < 2139095040 ? f35 : 0.0f;
        float f37 = (f31 + f25 + f7) * f36;
        float f38 = (f33 + f27 + f8) * f36;
        un0Var.a = Math.min(f19, Math.min(f26, Math.min(f32, f37)));
        un0Var.b = Math.min(f22, Math.min(f28, Math.min(f34, f38)));
        un0Var.c = Math.max(f19, Math.max(f26, Math.max(f32, f37)));
        un0Var.d = Math.max(f22, Math.max(f28, Math.max(f34, f38)));
    }

    public static String w(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            dd0.e("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final long x(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : hi.b(hi.d(j) * f, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List y(db1 db1Var, int i, db1 db1Var2, boolean z, boolean z2, boolean z3) {
        nv nvVar;
        boolean z4;
        int i2;
        int i3;
        int u = db1Var.u(i);
        int i4 = i + u;
        int f = db1Var.f(i);
        int f2 = db1Var.f(i4);
        int i5 = f2 - f;
        boolean z5 = i >= 0 && (db1Var.b[(db1Var.r(i) * 5) + 1] & 201326592) != 0;
        db1Var2.w(u);
        db1Var2.x(i5, db1Var2.t);
        if (db1Var.g < i4) {
            db1Var.B(i4);
        }
        if (db1Var.k < f2) {
            db1Var.C(f2, i4);
        }
        int[] iArr = db1Var2.b;
        int i6 = db1Var2.t;
        int i7 = i6 * 5;
        w9.a(db1Var.b, iArr, i7, i * 5, i4 * 5);
        Object[] objArr = db1Var2.c;
        int i8 = db1Var2.i;
        System.arraycopy(db1Var.c, f, objArr, i8, i5);
        int i9 = db1Var2.v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + u;
        int g = i8 - db1Var2.g(iArr, i6);
        int i12 = db1Var2.m;
        int i13 = db1Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int g2 = db1Var2.g(iArr, i15) + g;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = db1Var2.k;
            }
            iArr2[(i15 * 5) + 4] = db1.i(g2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        db1Var2.m = i14;
        int a = cb1.a(db1Var.d, i, db1Var.p());
        int a2 = cb1.a(db1Var.d, i4, db1Var.p());
        if (a < a2) {
            ArrayList arrayList = db1Var.d;
            ArrayList arrayList2 = new ArrayList(a2 - a);
            for (int i17 = a; i17 < a2; i17++) {
                d3 d3Var = (d3) arrayList.get(i17);
                d3Var.a += i10;
                arrayList2.add(d3Var);
            }
            db1Var2.d.addAll(cb1.a(db1Var2.d, db1Var2.t, db1Var2.p()), arrayList2);
            arrayList.subList(a, a2).clear();
            nvVar = arrayList2;
        } else {
            nvVar = nv.d;
        }
        if (!nvVar.isEmpty()) {
            HashMap hashMap = db1Var.e;
            HashMap hashMap2 = db1Var2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = nvVar.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = db1Var2.v;
        db1Var2.O(i9);
        int E = db1Var.E(db1Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = E >= 0;
            if (z7) {
                db1Var.P();
                db1Var.a(E - db1Var.t);
                db1Var.P();
            }
            db1Var.a(i - db1Var.t);
            boolean H = db1Var.H();
            if (z7) {
                db1Var.M();
                db1Var.j();
                db1Var.M();
                db1Var.j();
            }
            z4 = H;
        } else {
            boolean I = db1Var.I(i, u);
            db1Var.J(f, i5, i - 1);
            z4 = I;
        }
        if (z4) {
            kl.a("Unexpectedly removed anchors");
        }
        int i20 = db1Var2.o;
        int i21 = iArr3[i7 + 1];
        db1Var2.o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            db1Var2.t = i11;
            db1Var2.i = i8 + i5;
        }
        if (z6) {
            db1Var2.T(i9);
        }
        return nvVar;
    }

    public static final Object z(Object[] objArr, h61 h61Var, Function0 function0, hl hlVar, int i) {
        return A(Arrays.copyOf(objArr, objArr.length), h61Var, function0, hlVar, 384 | ((i << 3) & 7168), 0);
    }
}

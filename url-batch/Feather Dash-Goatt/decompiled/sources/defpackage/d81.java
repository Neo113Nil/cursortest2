package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class d81 {
    public w71 a;
    public i5 b;
    public xp c;
    public et0 d;
    public boolean e;
    public wo0 f;
    public final v71 g;
    public final r71 h;
    public boolean i;
    public int j = 1;
    public f71 k = p71.b;
    public final b81 l = new b81(this);
    public final l m = new l(20, this);

    public d81(w71 w71Var, i5 i5Var, xp xpVar, et0 et0Var, boolean z, wo0 wo0Var, v71 v71Var, r71 r71Var) {
        this.a = w71Var;
        this.b = i5Var;
        this.c = xpVar;
        this.d = et0Var;
        this.e = z;
        this.f = wo0Var;
        this.g = v71Var;
        this.h = r71Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, fn fnVar) {
        y71 y71Var;
        int i;
        d81 d81Var;
        Throwable th;
        y11 y11Var;
        if (fnVar instanceof y71) {
            y71Var = (y71) fnVar;
            int i2 = y71Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y71Var.k = i2 - Integer.MIN_VALUE;
                Object obj = y71Var.i;
                tn tnVar = tn.d;
                i = y71Var.k;
                if (i != 0) {
                    ca0.v(obj);
                    y11 y11Var2 = new y11();
                    y11Var2.d = j;
                    this.i = true;
                    try {
                        go0 go0Var = go0.d;
                        d81Var = this;
                        try {
                            a81 a81Var = new a81(d81Var, y11Var2, j, null);
                            y71Var.h = y11Var2;
                            y71Var.k = 1;
                            if (d81Var.f(go0Var, a81Var, y71Var) == tnVar) {
                                return tnVar;
                            }
                            y11Var = y11Var2;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            d81Var.i = false;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        d81Var = this;
                    }
                } else {
                    if (i != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y11Var = y71Var.h;
                    try {
                        ca0.v(obj);
                        d81Var = this;
                    } catch (Throwable th4) {
                        th = th4;
                        d81Var = this;
                        d81Var.i = false;
                        throw th;
                    }
                }
                d81Var.i = false;
                return new xm1(y11Var.d);
            }
        }
        y71Var = new y71(this, fnVar);
        Object obj2 = y71Var.i;
        tn tnVar2 = tn.d;
        i = y71Var.k;
        if (i != 0) {
        }
        d81Var.i = false;
        return new xm1(y11Var.d);
    }

    public final Object b(long j, boolean z, sf1 sf1Var) {
        if (z) {
            xp xpVar = this.c;
            k61 k61Var = p71.a;
            if (xpVar instanceof xp) {
                return Unit.a;
            }
        }
        long a = xm1.a(j, 0.0f, 0.0f, this.d == et0.e ? 1 : 2);
        c81 c81Var = new c81(this, null);
        i5 i5Var = this.b;
        if (i5Var != null && (this.a.d() || this.a.a())) {
            Object b = i5Var.b(a, c81Var, sf1Var);
            return b == tn.d ? b : Unit.a;
        }
        c81 c81Var2 = new c81(this, sf1Var);
        c81Var2.k = a;
        Unit unit = Unit.a;
        Object k = c81Var2.k(unit);
        return k == tn.d ? k : unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [zl0] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, kj1] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [zl0] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [eo0] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [eo0] */
    public final long c(f71 f71Var, long j, int i) {
        int i2;
        ap0 ap0Var;
        ap0 ap0Var2;
        long j2;
        long j3;
        ap0 ap0Var3;
        l7 l7Var;
        zl0 zl0Var;
        kj1 kj1Var;
        l7 l7Var2;
        zl0 zl0Var2;
        ap0 ap0Var4 = this.f.a;
        int i3 = 262144;
        Object obj = null;
        if (ap0Var4 == null || !ap0Var4.r) {
            i2 = 262144;
            ap0Var = null;
        } else {
            if (!ap0Var4.d.r) {
                o80.b("visitAncestors called on an unattached node");
            }
            zl0 zl0Var3 = ap0Var4.d.i;
            jd0 I = op.I(ap0Var4);
            loop0: while (true) {
                if (I == null) {
                    i2 = i3;
                    kj1Var = null;
                    break;
                }
                if ((((zl0) I.J.g).h & i3) != 0) {
                    while (zl0Var3 != null) {
                        if ((zl0Var3.g & i3) != 0) {
                            eo0 eo0Var = null;
                            zq zqVar = zl0Var3;
                            while (zqVar != 0) {
                                if (zqVar instanceof kj1) {
                                    kj1Var = (kj1) zqVar;
                                    i2 = i3;
                                    if (Intrinsics.a(ap0Var4.h(), kj1Var.h()) && ap0.class == kj1Var.getClass()) {
                                        break loop0;
                                    }
                                } else {
                                    i2 = i3;
                                    if ((zqVar.g & i2) != 0 && (zqVar instanceof zq)) {
                                        zl0 zl0Var4 = zqVar.t;
                                        int i4 = 0;
                                        zl0Var2 = zqVar;
                                        eo0Var = eo0Var;
                                        while (zl0Var4 != null) {
                                            if ((zl0Var4.g & i2) != 0) {
                                                i4++;
                                                eo0Var = eo0Var;
                                                if (i4 == 1) {
                                                    zl0Var2 = zl0Var4;
                                                } else {
                                                    if (eo0Var == null) {
                                                        eo0Var = new eo0(new zl0[16]);
                                                    }
                                                    if (zl0Var2 != null) {
                                                        eo0Var.b(zl0Var2);
                                                        zl0Var2 = null;
                                                    }
                                                    eo0Var.b(zl0Var4);
                                                }
                                            }
                                            zl0Var4 = zl0Var4.j;
                                            zl0Var2 = zl0Var2;
                                            eo0Var = eo0Var;
                                        }
                                        if (i4 == 1) {
                                            i3 = i2;
                                            zqVar = zl0Var2;
                                            eo0Var = eo0Var;
                                        }
                                    }
                                }
                                zl0Var2 = op.o(eo0Var);
                                i3 = i2;
                                zqVar = zl0Var2;
                                eo0Var = eo0Var;
                            }
                        }
                        zl0Var3 = zl0Var3.i;
                        i3 = i3;
                    }
                }
                int i5 = i3;
                I = I.s();
                zl0Var3 = (I == null || (l7Var2 = I.J) == null) ? null : (ig1) l7Var2.f;
                i3 = i5;
            }
            ap0Var = (ap0) kj1Var;
        }
        long d0 = ap0Var != null ? ap0Var.d0(i, j) : 0L;
        long d = wq0.d(j, d0);
        long e = e(h(f71Var.a(g(e(this.d == et0.e ? wq0.a(1, d) : wq0.a(2, d))))));
        v71 v71Var = this.g;
        if (v71Var.r) {
            ViewTreeObserver viewTreeObserver = ((d4) op.J(v71Var)).getViewTreeObserver();
            try {
                if (d4.Q0 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    d4.Q0 = declaredMethod;
                }
                Method method = d4.Q0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long d2 = wq0.d(d, e);
        ap0 ap0Var5 = this.f.a;
        if (ap0Var5 == null || !ap0Var5.r) {
            ap0Var2 = null;
        } else {
            if (!ap0Var5.d.r) {
                o80.b("visitAncestors called on an unattached node");
            }
            zl0 zl0Var5 = ap0Var5.d.i;
            jd0 I2 = op.I(ap0Var5);
            loop3: while (true) {
                if (I2 == null) {
                    ap0Var3 = null;
                    break;
                }
                if ((((zl0) I2.J.g).h & i2) != 0) {
                    while (zl0Var5 != null) {
                        if ((zl0Var5.g & i2) != 0) {
                            zq zqVar2 = zl0Var5;
                            ?? r7 = obj;
                            while (zqVar2 != 0) {
                                if (zqVar2 instanceof kj1) {
                                    ?? r6 = (kj1) zqVar2;
                                    if (Intrinsics.a(ap0Var5.h(), r6.h()) && ap0.class == r6.getClass()) {
                                        ap0Var3 = r6;
                                        break loop3;
                                    }
                                } else if ((zqVar2.g & i2) != 0 && (zqVar2 instanceof zq)) {
                                    zl0 zl0Var6 = zqVar2.t;
                                    int i6 = 0;
                                    zl0Var = zqVar2;
                                    r7 = r7;
                                    while (zl0Var6 != null) {
                                        if ((zl0Var6.g & i2) != 0) {
                                            i6++;
                                            r7 = r7;
                                            if (i6 == 1) {
                                                zl0Var = zl0Var6;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new eo0(new zl0[16]);
                                                }
                                                if (zl0Var != null) {
                                                    r7.b(zl0Var);
                                                    zl0Var = null;
                                                }
                                                r7.b(zl0Var6);
                                            }
                                        }
                                        zl0Var6 = zl0Var6.j;
                                        zl0Var = zl0Var;
                                        r7 = r7;
                                    }
                                    if (i6 == 1) {
                                        zqVar2 = zl0Var;
                                        r7 = r7;
                                    }
                                }
                                zl0Var = op.o(r7);
                                zqVar2 = zl0Var;
                                r7 = r7;
                            }
                        }
                        zl0Var5 = zl0Var5.i;
                        obj = null;
                    }
                }
                I2 = I2.s();
                zl0Var5 = (I2 == null || (l7Var = I2.J) == null) ? null : (ig1) l7Var.f;
                obj = null;
            }
            ap0Var2 = ap0Var3;
        }
        if (ap0Var2 != null) {
            j3 = ap0Var2.E(i, e, d2);
            j2 = e;
        } else {
            j2 = e;
            j3 = 0;
        }
        return wq0.e(wq0.e(d0, j2), j3);
    }

    public final float d(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long e(long j) {
        return this.e ? wq0.f(-1.0f, j) : j;
    }

    public final Object f(go0 go0Var, Function2 function2, fn fnVar) {
        Object c = this.a.c(go0Var, new f(this, function2, null, 12), fnVar);
        return c == tn.d ? c : Unit.a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == et0.e ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == et0.e) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double atan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        et0 et0Var = this.d;
        if (atan2 >= 0.7853981633974483d) {
            if (et0Var == et0.d) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (et0Var == et0.e) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}

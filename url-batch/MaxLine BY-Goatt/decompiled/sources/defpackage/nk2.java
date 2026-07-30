package defpackage;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class nk2 {
    public static x01 a;

    public static final void a(a00 a00Var, vl1 vl1Var) {
        k9 k9Var = k9.i;
        int D = iv1.D(a00Var);
        vl1 E = bd3.E(a00Var, vl1Var);
        v02 l = a00Var.l();
        pz.b.getClass();
        o00 o00Var = oz.b;
        a00Var.b0();
        if (a00Var.S) {
            a00Var.k(o00Var);
        } else {
            a00Var.l0();
        }
        uj2.e(a00Var, k9Var, oz.f);
        uj2.e(a00Var, l, oz.e);
        uj2.e(a00Var, E, oz.d);
        sc scVar = oz.g;
        if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
            q40.r(D, a00Var, D, scVar);
        }
        a00Var.q(true);
    }

    public static final void b(boolean z, k92 k92Var, gv2 gv2Var, a00 a00Var, int i) {
        int i2;
        vl1 k;
        a00Var.Z(-1344558920);
        if ((i & 6) == 0) {
            i2 = (a00Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= a00Var.f(k92Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= a00Var.h(gv2Var) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && a00Var.B()) {
            a00Var.S();
        } else {
            int i3 = i2 & 14;
            boolean f = (i3 == 4) | a00Var.f(gv2Var);
            Object M = a00Var.M();
            nj njVar = sz.a;
            if (f || M == njVar) {
                M = new fv2(gv2Var, z);
                a00Var.i0(M);
            }
            bu2 bu2Var = (bu2) M;
            boolean h = a00Var.h(gv2Var) | (i3 == 4);
            Object M2 = a00Var.M();
            if (h || M2 == njVar) {
                M2 = new hv2(gv2Var, z);
                a00Var.i0(M2);
            }
            du1 du1Var = (du1) M2;
            boolean f2 = jw2.f(gv2Var.j().b);
            boolean h2 = a00Var.h(bu2Var);
            Object M3 = a00Var.M();
            if (h2 || M3 == njVar) {
                M3 = new z62(8, null, bu2Var);
                a00Var.i0(M3);
            }
            k = sl1.a.k(new SuspendPointerInputElement(bu2Var, null, new qr2((Function2) M3), 6));
            iv1.j(du1Var, z, k92Var, f2, 0L, k, a00Var, (i2 << 3) & 1008);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new mb(z, k92Var, gv2Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e0 A[Catch: CancellationException -> 0x0039, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0039, blocks: (B:16:0x0034, B:18:0x00cb, B:20:0x00e0, B:25:0x0103), top: B:15:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(nd ndVar, hd hdVar, long j, Function1 function1, r30 r30Var) {
        lr2 lr2Var;
        lr2 lr2Var2;
        b50 b50Var;
        int i;
        c82 c82Var;
        nd ndVar2;
        nd ndVar3;
        nr2 nr2Var;
        c82 c82Var2;
        Function1 function12;
        ld ldVar;
        ld ldVar2;
        Object obj;
        or2 or2Var;
        hd hdVar2 = hdVar;
        if (r30Var instanceof lr2) {
            lr2Var = (lr2) r30Var;
            int i2 = lr2Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lr2Var.r = i2 - Integer.MIN_VALUE;
                lr2Var2 = lr2Var;
                Object obj2 = lr2Var2.q;
                b50Var = b50.m;
                i = lr2Var2.r;
                int i3 = 1;
                if (i != 0) {
                    ca2.b(obj2);
                    Object b = hdVar2.b(0L);
                    sd f = hdVar2.f(0L);
                    c82Var = new c82();
                    if (j == Long.MIN_VALUE) {
                        try {
                            ndVar2 = ndVar;
                        } catch (CancellationException e) {
                            e = e;
                            ndVar2 = ndVar;
                        }
                        try {
                            nr2Var = new nr2(c82Var, b, hdVar2, f, ndVar2, k(lr2Var2.getContext()), function1);
                            c82Var2 = c82Var;
                        } catch (CancellationException e2) {
                            e = e2;
                            ndVar3 = ndVar2;
                            ldVar = (ld) c82Var.m;
                            if (ldVar != null) {
                                ldVar.i.setValue(Boolean.FALSE);
                            }
                            ldVar2 = (ld) c82Var.m;
                            if (ldVar2 != null && ldVar2.g == ndVar3.p) {
                                ndVar3.r = false;
                            }
                            throw e;
                        }
                        try {
                            lr2Var2.m = ndVar2;
                            lr2Var2.n = hdVar2;
                            lr2Var2.o = function1;
                            lr2Var2.p = c82Var2;
                            lr2Var2.r = 1;
                            if (f(hdVar2, nr2Var, lr2Var2) != b50Var) {
                                ndVar3 = ndVar2;
                                function12 = function1;
                            }
                            return b50Var;
                        } catch (CancellationException e3) {
                            e = e3;
                            ndVar3 = ndVar2;
                            c82Var = c82Var2;
                            ldVar = (ld) c82Var.m;
                            if (ldVar != null) {
                            }
                            ldVar2 = (ld) c82Var.m;
                            if (ldVar2 != null) {
                            }
                            throw e;
                        }
                    }
                    c82Var2 = c82Var;
                    try {
                        ld ldVar3 = new ld(b, hdVar2.d(), f, j, hdVar2.e(), j, new mr2(ndVar, i3));
                        g(ldVar3, j, k(lr2Var2.getContext()), hdVar2, ndVar, function1);
                        c82Var2.m = ldVar3;
                        ndVar3 = ndVar;
                        hdVar2 = hdVar;
                        function12 = function1;
                    } catch (CancellationException e4) {
                        e = e4;
                        ndVar3 = ndVar;
                        c82Var = c82Var2;
                        ldVar = (ld) c82Var.m;
                        if (ldVar != null) {
                        }
                        ldVar2 = (ld) c82Var.m;
                        if (ldVar2 != null) {
                            ndVar3.r = false;
                        }
                        throw e;
                    }
                    c82Var = c82Var2;
                } else {
                    if (i != 1 && i != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c82Var = lr2Var2.p;
                    function12 = lr2Var2.o;
                    hdVar2 = lr2Var2.n;
                    ndVar3 = lr2Var2.m;
                    try {
                        ca2.b(obj2);
                    } catch (CancellationException e5) {
                        e = e5;
                        ldVar = (ld) c82Var.m;
                        if (ldVar != null) {
                        }
                        ldVar2 = (ld) c82Var.m;
                        if (ldVar2 != null) {
                        }
                        throw e;
                    }
                }
                do {
                    obj = c82Var.m;
                    obj.getClass();
                    if (((Boolean) ((ld) obj).i.getValue()).booleanValue()) {
                        return Unit.a;
                    }
                    c82 c82Var3 = c82Var;
                    Function1 function13 = function12;
                    hd hdVar3 = hdVar2;
                    nd ndVar4 = ndVar3;
                    try {
                        or2Var = new or2(c82Var3, k(lr2Var2.getContext()), hdVar3, ndVar4, function13);
                        c82Var = c82Var3;
                        hdVar2 = hdVar3;
                        ndVar3 = ndVar4;
                        function12 = function13;
                        lr2Var2.m = ndVar3;
                        lr2Var2.n = hdVar2;
                        lr2Var2.o = function12;
                        lr2Var2.p = c82Var;
                        lr2Var2.r = 2;
                    } catch (CancellationException e6) {
                        e = e6;
                        c82Var = c82Var3;
                        ndVar3 = ndVar4;
                        ldVar = (ld) c82Var.m;
                        if (ldVar != null) {
                        }
                        ldVar2 = (ld) c82Var.m;
                        if (ldVar2 != null) {
                        }
                        throw e;
                    }
                } while (f(hdVar2, or2Var, lr2Var2) != b50Var);
                return b50Var;
            }
        }
        lr2Var = new lr2(r30Var);
        lr2Var2 = lr2Var;
        Object obj22 = lr2Var2.q;
        b50Var = b50.m;
        i = lr2Var2.r;
        int i32 = 1;
        if (i != 0) {
        }
        do {
            obj = c82Var.m;
            obj.getClass();
            if (((Boolean) ((ld) obj).i.getValue()).booleanValue()) {
            }
        } while (f(hdVar2, or2Var, lr2Var2) != b50Var);
        return b50Var;
    }

    public static Object d(float f, float f2, md mdVar, Function2 function2, pr2 pr2Var, int i) {
        if ((i & 8) != 0) {
            mdVar = bd3.G(7, null);
        }
        k03 k03Var = v33.a;
        Float f3 = new Float(f);
        Float f4 = new Float(f2);
        od odVar = new od(new Float(0.0f).floatValue());
        Object c = c(new nd(k03Var, f3, odVar, 56), new bt2(mdVar, k03Var, f3, f4, odVar), Long.MIN_VALUE, new s72(function2), pr2Var);
        b50 b50Var = b50.m;
        if (c != b50Var) {
            c = Unit.a;
        }
        return c == b50Var ? c : Unit.a;
    }

    public static final Object e(nd ndVar, q70 q70Var, boolean z, Function1 function1, r30 r30Var) {
        Object c = c(ndVar, new p70(q70Var, ndVar.m, ndVar.n.getValue(), ndVar.o), z ? ndVar.p : Long.MIN_VALUE, function1, r30Var);
        return c == b50.m ? c : Unit.a;
    }

    public static final Object f(hd hdVar, Function1 function1, lr2 lr2Var) {
        if (!hdVar.a()) {
            return iv1.F(lr2Var.getContext()).B(new s72(10, function1), lr2Var);
        }
        if (lr2Var.getContext().m(qb2.T) == null) {
            return iv1.F(lr2Var.getContext()).B(function1, lr2Var);
        }
        b71.o();
        return null;
    }

    public static final void g(ld ldVar, long j, float f, hd hdVar, nd ndVar, Function1 function1) {
        long c = f == 0.0f ? hdVar.c() : (long) ((j - ldVar.c) / f);
        ldVar.g = j;
        ldVar.e.setValue(hdVar.b(c));
        ldVar.f = hdVar.f(c);
        if (hdVar.g(c)) {
            ldVar.h = ldVar.g;
            ldVar.i.setValue(Boolean.FALSE);
        }
        q(ldVar, ndVar);
        function1.invoke(ldVar);
    }

    public static final boolean h(long j, long j2) {
        return j == j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [ul1] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ul1] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eo1] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final rz2 i(o90 o90Var, Object obj) {
        fs1 fs1Var;
        if (!((ul1) o90Var).m.z) {
            h21.b("visitAncestors called on an unattached node");
        }
        ul1 ul1Var = ((ul1) o90Var).m.q;
        i91 J = s03.J(o90Var);
        while (J != null) {
            if ((J.P.f.p & 262144) != 0) {
                while (ul1Var != null) {
                    if ((ul1Var.o & 262144) != 0) {
                        p90 p90Var = ul1Var;
                        ?? r4 = 0;
                        while (p90Var != 0) {
                            if (p90Var instanceof rz2) {
                                rz2 rz2Var = (rz2) p90Var;
                                if (obj.equals(rz2Var.r())) {
                                    return rz2Var;
                                }
                            } else if ((p90Var.o & 262144) != 0 && (p90Var instanceof p90)) {
                                ul1 ul1Var2 = p90Var.B;
                                int i = 0;
                                p90Var = p90Var;
                                r4 = r4;
                                while (ul1Var2 != null) {
                                    if ((ul1Var2.o & 262144) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            p90Var = ul1Var2;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new eo1(new ul1[16]);
                                            }
                                            if (p90Var != 0) {
                                                r4.b(p90Var);
                                                p90Var = 0;
                                            }
                                            r4.b(ul1Var2);
                                        }
                                    }
                                    ul1Var2 = ul1Var2.r;
                                    p90Var = p90Var;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            p90Var = s03.c(r4);
                        }
                    }
                    ul1Var = ul1Var.q;
                }
            }
            J = J.u();
            ul1Var = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, o90, rz2] */
    /* JADX WARN: Type inference failed for: r3v10, types: [ul1] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [ul1] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eo1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final rz2 j(rz2 rz2Var) {
        fs1 fs1Var;
        ul1 ul1Var = (ul1) rz2Var;
        if (!ul1Var.m.z) {
            h21.b("visitAncestors called on an unattached node");
        }
        ul1 ul1Var2 = ul1Var.m.q;
        i91 J = s03.J(rz2Var);
        while (J != null) {
            if ((J.P.f.p & 262144) != 0) {
                while (ul1Var2 != null) {
                    if ((ul1Var2.o & 262144) != 0) {
                        p90 p90Var = ul1Var2;
                        ?? r5 = 0;
                        while (p90Var != 0) {
                            if (p90Var instanceof rz2) {
                                rz2 rz2Var2 = (rz2) p90Var;
                                if (Intrinsics.b(rz2Var.r(), rz2Var2.r()) && rz2Var.getClass() == rz2Var2.getClass()) {
                                    return rz2Var2;
                                }
                            } else if ((p90Var.o & 262144) != 0 && (p90Var instanceof p90)) {
                                ul1 ul1Var3 = p90Var.B;
                                int i = 0;
                                p90Var = p90Var;
                                r5 = r5;
                                while (ul1Var3 != null) {
                                    if ((ul1Var3.o & 262144) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            p90Var = ul1Var3;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new eo1(new ul1[16]);
                                            }
                                            if (p90Var != 0) {
                                                r5.b(p90Var);
                                                p90Var = 0;
                                            }
                                            r5.b(ul1Var3);
                                        }
                                    }
                                    ul1Var3 = ul1Var3.r;
                                    p90Var = p90Var;
                                    r5 = r5;
                                }
                                if (i == 1) {
                                }
                            }
                            p90Var = s03.c(r5);
                        }
                    }
                    ul1Var2 = ul1Var2.q;
                }
            }
            J = J.u();
            ul1Var2 = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
        }
        return null;
    }

    public static final float k(CoroutineContext coroutineContext) {
        fm1 fm1Var = (fm1) coroutineContext.m(qb2.X);
        float C = fm1Var != null ? fm1Var.C() : 1.0f;
        if (C >= 0.0f) {
            return C;
        }
        w32.b("negative scale factor");
        return C;
    }

    public static final boolean l(gv2 gv2Var, boolean z) {
        t81 c;
        sc1 sc1Var = gv2Var.d;
        if (sc1Var == null || (c = sc1Var.c()) == null) {
            return false;
        }
        w72 l = ph2.l(c);
        long i = gv2Var.i(z);
        float f = l.a;
        float f2 = l.c;
        float d = au1.d(i);
        if (f > d || d > f2) {
            return false;
        }
        float f3 = l.b;
        float f4 = l.d;
        float e = au1.e(i);
        return f3 <= e && e <= f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, o90, rz2] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [ul1] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ul1] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eo1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void o(rz2 rz2Var, Function1 function1) {
        fs1 fs1Var;
        ul1 ul1Var = (ul1) rz2Var;
        if (!ul1Var.m.z) {
            h21.b("visitAncestors called on an unattached node");
        }
        ul1 ul1Var2 = ul1Var.m.q;
        i91 J = s03.J(rz2Var);
        while (J != null) {
            if ((J.P.f.p & 262144) != 0) {
                while (ul1Var2 != null) {
                    if ((ul1Var2.o & 262144) != 0) {
                        p90 p90Var = ul1Var2;
                        ?? r5 = 0;
                        while (p90Var != 0) {
                            boolean z = true;
                            if (p90Var instanceof rz2) {
                                rz2 rz2Var2 = (rz2) p90Var;
                                if (Intrinsics.b(rz2Var.r(), rz2Var2.r()) && rz2Var.getClass() == rz2Var2.getClass()) {
                                    z = ((Boolean) function1.invoke(rz2Var2)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((p90Var.o & 262144) != 0 && (p90Var instanceof p90)) {
                                ul1 ul1Var3 = p90Var.B;
                                int i = 0;
                                p90Var = p90Var;
                                r5 = r5;
                                while (ul1Var3 != null) {
                                    if ((ul1Var3.o & 262144) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            p90Var = ul1Var3;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new eo1(new ul1[16]);
                                            }
                                            if (p90Var != 0) {
                                                r5.b(p90Var);
                                                p90Var = 0;
                                            }
                                            r5.b(ul1Var3);
                                        }
                                    }
                                    ul1Var3 = ul1Var3.r;
                                    p90Var = p90Var;
                                    r5 = r5;
                                }
                                if (i == 1) {
                                }
                            }
                            p90Var = s03.c(r5);
                        }
                    }
                    ul1Var2 = ul1Var2.q;
                }
            }
            J = J.u();
            ul1Var2 = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, rz2] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [ul1] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [ul1] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [eo1] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void p(rz2 rz2Var, Function1 function1) {
        if (!((ul1) rz2Var).m.z) {
            h21.b("visitSubtreeIf called on an unattached node");
        }
        eo1 eo1Var = new eo1(new ul1[16]);
        ul1 ul1Var = ((ul1) rz2Var).m;
        ul1 ul1Var2 = ul1Var.r;
        if (ul1Var2 == null) {
            s03.b(eo1Var, ul1Var);
        } else {
            eo1Var.b(ul1Var2);
        }
        while (true) {
            int i = eo1Var.o;
            if (i == 0) {
                return;
            }
            ul1 ul1Var3 = (ul1) eo1Var.l(i - 1);
            if ((ul1Var3.p & 262144) != 0) {
                for (ul1 ul1Var4 = ul1Var3; ul1Var4 != null; ul1Var4 = ul1Var4.r) {
                    if ((ul1Var4.o & 262144) != 0) {
                        p90 p90Var = ul1Var4;
                        ?? r7 = 0;
                        while (p90Var != 0) {
                            if (p90Var instanceof rz2) {
                                rz2 rz2Var2 = (rz2) p90Var;
                                qz2 qz2Var = (Intrinsics.b(rz2Var.r(), rz2Var2.r()) && rz2Var.getClass() == rz2Var2.getClass()) ? (qz2) function1.invoke(rz2Var2) : qz2.m;
                                if (qz2Var == qz2.o) {
                                    return;
                                }
                                if (qz2Var == qz2.n) {
                                    break;
                                }
                            } else if ((p90Var.o & 262144) != 0 && (p90Var instanceof p90)) {
                                ul1 ul1Var5 = p90Var.B;
                                int i2 = 0;
                                p90Var = p90Var;
                                r7 = r7;
                                while (ul1Var5 != null) {
                                    if ((ul1Var5.o & 262144) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            p90Var = ul1Var5;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new eo1(new ul1[16]);
                                            }
                                            if (p90Var != 0) {
                                                r7.b(p90Var);
                                                p90Var = 0;
                                            }
                                            r7.b(ul1Var5);
                                        }
                                    }
                                    ul1Var5 = ul1Var5.r;
                                    p90Var = p90Var;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            p90Var = s03.c(r7);
                        }
                    }
                }
            }
            s03.b(eo1Var, ul1Var3);
        }
    }

    public static final void q(ld ldVar, nd ndVar) {
        ndVar.n.setValue(ldVar.e.getValue());
        sd sdVar = ndVar.o;
        sd sdVar2 = ldVar.f;
        int b = sdVar.b();
        for (int i = 0; i < b; i++) {
            sdVar.e(i, sdVar2.a(i));
        }
        ndVar.q = ldVar.h;
        ndVar.p = ldVar.g;
        ndVar.r = ((Boolean) ldVar.i.getValue()).booleanValue();
    }

    public static kc3 r(Object obj) {
        if (obj == null) {
            return kc3.f;
        }
        if (obj instanceof String) {
            return new pc3((String) obj);
        }
        if (obj instanceof Double) {
            return new xb3((Double) obj);
        }
        if (obj instanceof Long) {
            return new xb3(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new xb3(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new sb3((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                lh.e("Invalid value type");
                return null;
            }
            qb3 qb3Var = new qb3();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                qb3Var.p(qb3Var.n(), r(it.next()));
            }
            return qb3Var;
        }
        fc3 fc3Var = new fc3();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            kc3 r = r(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                fc3Var.b((String) obj2, r);
            }
        }
        return fc3Var;
    }

    public static kc3 s(nk3 nk3Var) {
        if (nk3Var == null) {
            return kc3.e;
        }
        int x = nk3Var.x() - 1;
        if (x == 1) {
            return nk3Var.r() ? new pc3(nk3Var.s()) : kc3.l;
        }
        if (x == 2) {
            return nk3Var.v() ? new xb3(Double.valueOf(nk3Var.w())) : new xb3(null);
        }
        if (x == 3) {
            return nk3Var.t() ? new sb3(Boolean.valueOf(nk3Var.u())) : new sb3(null);
        }
        if (x != 4) {
            lh.e("Unknown type found. Cannot convert entity");
            return null;
        }
        List p = nk3Var.p();
        ArrayList arrayList = new ArrayList();
        Iterator it = p.iterator();
        while (it.hasNext()) {
            arrayList.add(s((nk3) it.next()));
        }
        return new lc3(nk3Var.q(), arrayList);
    }

    public abstract void n(boolean z);

    public void m(boolean z) {
    }
}

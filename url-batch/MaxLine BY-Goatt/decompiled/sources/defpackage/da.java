package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class da extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public /* synthetic */ Object o;
    public Object p;
    public Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(x22 x22Var, xt0 xt0Var, Function1 function1, s42 s42Var, o30 o30Var) {
        super(2, o30Var);
        this.m = 8;
        this.p = x22Var;
        this.r = xt0Var;
        this.q = function1;
        this.s = s42Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.s;
        Object obj3 = this.r;
        switch (i) {
            case 0:
                da daVar = new da((ua) this.p, (Function1) this.q, (ea) obj3, (nc1) obj2, o30Var, 0);
                daVar.o = obj;
                return daVar;
            case 1:
                da daVar2 = new da((z23) this.p, (h20) this.q, (wp) obj3, (g61) obj2, o30Var, 1);
                daVar2.o = obj;
                return daVar2;
            case 2:
                return new da((sc1) this.o, (zn1) this.p, (sv2) this.q, (gv2) obj3, (c11) obj2, o30Var, 2);
            case 3:
                return new da((op) this.o, (nv2) this.p, (sc1) this.q, (cw2) obj3, (cu1) obj2, o30Var, 3);
            case 4:
                da daVar3 = new da((ez) this.p, (hz1) this.q, (zn1) obj3, (zn1) obj2, o30Var, 4);
                daVar3.o = obj;
                return daVar3;
            case 5:
                return new da((r01) this.o, (b72) this.p, (pl2) this.q, (oi0) obj3, (Bitmap) obj2, o30Var, 5);
            case 6:
                da daVar4 = new da((r72) this.q, (q72) obj3, (em1) obj2, o30Var);
                daVar4.o = obj;
                return daVar4;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return new da((tg2) obj3, this.o, (fz2) obj2, o30Var);
            case 8:
                da daVar5 = new da((x22) this.p, (xt0) obj3, (Function1) this.q, (s42) obj2, o30Var);
                daVar5.o = obj;
                return daVar5;
            default:
                da daVar6 = new da((a50) this.p, (zn1) this.q, (bn1) obj3, (zn1) obj2, o30Var, 9);
                daVar6.o = obj;
                return daVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                ((da) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
                return b50.m;
            case 1:
                return ((da) create((ag2) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((da) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((da) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((da) create((xm0) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((da) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((da) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((da) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((da) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            default:
                return ((da) create((x22) obj, (o30) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0236, code lost:
    
        if (defpackage.tg2.A(r7, r21) == r9) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0229, code lost:
    
        if (defpackage.tg2.z(r7, r21) == r9) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016a, code lost:
    
        if (defpackage.tg2.B(r13, r21) == r14) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0161, code lost:
    
        if (r0 == r14) goto L45;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0325 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017b  */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, k4] */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long a;
        w72 w72Var;
        cp1 cp1Var;
        g61 E;
        vo2 vo2Var;
        d12 d12Var;
        d12 d12Var2;
        r72 r72Var;
        List w;
        k4 k4Var;
        qo1 qo1Var;
        tg2 tg2Var;
        Object C;
        b50 b50Var;
        lz1 lz1Var;
        Object obj2;
        tg2 tg2Var2;
        kg2 kg2Var;
        hz1 hz1Var;
        long j;
        od odVar;
        int i = 4;
        int i2 = 2;
        int i3 = 3;
        switch (this.m) {
            case 0:
                ea eaVar = (ea) this.r;
                ua uaVar = (ua) this.p;
                b50 b50Var2 = b50.m;
                int i4 = this.n;
                try {
                    if (i4 != 0) {
                        if (i4 != 1) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca2.b(obj);
                        throw new k81();
                    }
                    ca2.b(obj);
                    a50 a50Var = (a50) this.o;
                    pc1 pc1Var = qc1.a;
                    View view = uaVar.m;
                    pc1Var.getClass();
                    t21 t21Var = new t21(view);
                    tc1 tc1Var = new tc1(uaVar.m, new ca((nc1) this.s), t21Var);
                    if (aq2.a) {
                        z71.H(a50Var, null, new v(eaVar, t21Var, null, i), 3);
                    }
                    Function1 function1 = (Function1) this.q;
                    if (function1 != null) {
                        function1.invoke(tc1Var);
                    }
                    eaVar.c = tc1Var;
                    this.n = 1;
                    uaVar.a(tc1Var, this);
                    return b50Var2;
                } catch (Throwable th) {
                    eaVar.c = null;
                    throw th;
                }
            case 1:
                wp wpVar = (wp) this.r;
                h20 h20Var = (h20) this.q;
                z23 z23Var = (z23) this.p;
                b50 b50Var3 = b50.m;
                int i5 = this.n;
                if (i5 == 0) {
                    ca2.b(obj);
                    ag2 ag2Var = (ag2) this.o;
                    z23Var.e = h20.G0(h20Var, wpVar);
                    oc ocVar = new oc(h20Var, (g61) this.s, ag2Var, i2);
                    bn bnVar = new bn(h20Var, z23Var, wpVar, i3);
                    this.n = 1;
                    if (z23Var.a(ocVar, bnVar, this) == b50Var3) {
                        return b50Var3;
                    }
                } else {
                    if (i5 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 2:
                sc1 sc1Var = (sc1) this.o;
                b50 b50Var4 = b50.m;
                int i6 = this.n;
                try {
                    if (i6 == 0) {
                        ca2.b(obj);
                        x60 x60Var = new x60(2, new oh0(new x30((zn1) this.p, 0), null));
                        ot otVar = new ot(sc1Var, (sv2) this.q, (gv2) this.r, (c11) this.s, 1);
                        this.n = 1;
                        if (x60Var.a(otVar, this) == b50Var4) {
                            return b50Var4;
                        }
                    } else {
                        if (i6 != 1) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca2.b(obj);
                    }
                    s93.u(sc1Var);
                    return Unit.a;
                } catch (Throwable th2) {
                    s93.u(sc1Var);
                    throw th2;
                }
            case 3:
                b50 b50Var5 = b50.m;
                int i7 = this.n;
                if (i7 == 0) {
                    ca2.b(obj);
                    op opVar = (op) this.o;
                    nv2 nv2Var = (nv2) this.p;
                    zt2 zt2Var = ((sc1) this.q).a;
                    bw2 bw2Var = ((cw2) this.r).a;
                    cu1 cu1Var = (cu1) this.s;
                    this.n = 1;
                    int g = cu1Var.g(jw2.d(nv2Var.b));
                    if (g < bw2Var.a.a.n.length()) {
                        w72Var = bw2Var.b(g);
                    } else if (g != 0) {
                        w72Var = bw2Var.b(g - 1);
                    } else {
                        a = iu2.a(zt2Var.b, zt2Var.g, zt2Var.h, iu2.a, 1);
                        w72Var = new w72(0.0f, 0.0f, 1.0f, (int) (a & 4294967295L));
                    }
                    Object a2 = opVar.a(w72Var, this);
                    if (a2 != b50Var5) {
                        a2 = Unit.a;
                    }
                    if (a2 == b50Var5) {
                        return b50Var5;
                    }
                } else {
                    if (i7 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 4:
                hz1 hz1Var2 = (hz1) this.q;
                zn1 zn1Var = (zn1) this.s;
                ez ezVar = (ez) this.p;
                zn1 zn1Var2 = (zn1) this.r;
                b50 b50Var6 = b50.m;
                int i8 = this.n;
                try {
                    if (i8 == 0) {
                        ca2.b(obj);
                        xm0 xm0Var = (xm0) this.o;
                        hz1Var2.i(0.0f);
                        cp1 cp1Var2 = (cp1) zv.C((List) zn1Var2.getValue());
                        cp1Var2.getClass();
                        ezVar.g(cp1Var2);
                        ezVar.g((cp1) ((List) zn1Var2.getValue()).get(((List) zn1Var2.getValue()).size() - 2));
                        kc0 kc0Var = new kc0(5, zn1Var, hz1Var2);
                        this.o = cp1Var2;
                        this.n = 1;
                        if (xm0Var.a(kc0Var, this) == b50Var6) {
                            return b50Var6;
                        }
                        cp1Var = cp1Var2;
                    } else {
                        if (i8 != 1) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cp1Var = (cp1) this.o;
                        ca2.b(obj);
                    }
                    zn1Var.setValue(Boolean.FALSE);
                    ezVar.e(cp1Var, false);
                } catch (CancellationException unused) {
                    zn1Var.setValue(Boolean.FALSE);
                }
                return Unit.a;
            case 5:
                b50 b50Var7 = b50.m;
                int i9 = this.n;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ca2.b(obj);
                        return obj;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                r01 r01Var = (r01) this.o;
                d72 d72Var = new d72(r01Var, ((b72) this.p).g, 0, r01Var, (pl2) this.q, (oi0) this.r, ((Bitmap) this.s) != null);
                this.n = 1;
                Object b = d72Var.b(r01Var, this);
                return b == b50Var7 ? b50Var7 : b;
            case 6:
                b50 b50Var8 = b50.m;
                k4 k4Var2 = this.n;
                try {
                    if (k4Var2 == 0) {
                        ca2.b(obj);
                        E = l41.E(((a50) this.o).n());
                        r72 r72Var2 = (r72) this.q;
                        synchronized (r72Var2.b) {
                            Throwable th3 = r72Var2.d;
                            if (th3 != null) {
                                throw th3;
                            }
                            if (((o72) r72Var2.t.getValue()).compareTo(o72.n) <= 0) {
                                throw new IllegalStateException("Recomposer shut down");
                            }
                            if (r72Var2.c != null) {
                                throw new IllegalStateException("Recomposer already running");
                            }
                            r72Var2.c = E;
                            r72Var2.t();
                        }
                        ia iaVar = new ia(4, (r72) this.q);
                        tm2.f(tm2.a);
                        synchronized (tm2.c) {
                            tm2.h = zv.F(tm2.h, iaVar);
                            Unit unit = Unit.a;
                        }
                        k4Var2 = new k4(13, iaVar);
                        vo2 vo2Var2 = r72.x;
                        nm1 nm1Var = ((r72) this.q).w;
                        do {
                            vo2Var = r72.x;
                            d12Var = (d12) vo2Var.getValue();
                            qb2 qb2Var = qb2.Q;
                            w02 w02Var = d12Var.p;
                            if (w02Var.containsKey(nm1Var)) {
                                d12Var2 = d12Var;
                            } else if (d12Var.isEmpty()) {
                                d12Var2 = new d12(nm1Var, nm1Var, w02Var.f(nm1Var, new je1(qb2Var, qb2Var)));
                            } else {
                                Object obj3 = d12Var.o;
                                Object obj4 = w02Var.get(obj3);
                                obj4.getClass();
                                d12Var2 = new d12(d12Var.n, nm1Var, w02Var.f(obj3, new je1(((je1) obj4).a, nm1Var)).f(nm1Var, new je1(obj3, qb2Var)));
                            }
                            if (d12Var != d12Var2) {
                            }
                            r72Var = (r72) this.q;
                            synchronized (r72Var.b) {
                                w = r72Var.w();
                            }
                            int size = w.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                ((k00) w.get(i10)).s();
                            }
                            ed edVar = new ed((q72) this.r, (em1) this.s, (o30) null, 14);
                            this.o = E;
                            this.p = k4Var2;
                            this.n = 1;
                            k4Var = k4Var2;
                            if (j8.t(edVar, this) == b50Var8) {
                                return b50Var8;
                            }
                        } while (!vo2Var.j(d12Var, d12Var2));
                        r72Var = (r72) this.q;
                        synchronized (r72Var.b) {
                        }
                    } else {
                        if (k4Var2 != 1) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k4 k4Var3 = (k4) this.p;
                        E = (g61) this.o;
                        ca2.b(obj);
                        k4Var = k4Var3;
                    }
                    k4Var.d();
                    r72 r72Var3 = (r72) this.q;
                    synchronized (r72Var3.b) {
                        try {
                            if (r72Var3.c == E) {
                                r72Var3.c = null;
                            }
                            r72Var3.t();
                        } finally {
                        }
                    }
                    vo2 vo2Var3 = r72.x;
                    nm1.j(((r72) this.q).w);
                    return Unit.a;
                } catch (Throwable th4) {
                    k4Var2.d();
                    r72 r72Var4 = (r72) this.q;
                    synchronized (r72Var4.b) {
                        try {
                            if (r72Var4.c == E) {
                                r72Var4.c = null;
                            }
                            r72Var4.t();
                            vo2 vo2Var4 = r72.x;
                            nm1.j(((r72) this.q).w);
                            throw th4;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                od odVar2 = tg2.E;
                fz2 fz2Var = (fz2) this.s;
                od odVar3 = tg2.D;
                Object obj5 = this.o;
                tg2 tg2Var3 = (tg2) this.r;
                b50 b50Var9 = b50.m;
                int i11 = this.n;
                try {
                    if (i11 == 0) {
                        ca2.b(obj);
                        Object value = tg2Var3.n.getValue();
                        if (!obj5.equals(value)) {
                            tg2.x(tg2Var3);
                            tg2Var3.G(0.0f);
                            fz2Var.q(obj5);
                            fz2Var.o(0L);
                            tg2Var3.m(value);
                            tg2Var3.n.setValue(obj5);
                        }
                        qo1Var = tg2Var3.v;
                        this.p = qo1Var;
                        this.q = tg2Var3;
                        this.n = 1;
                        if (qo1Var.f(this) != b50Var9) {
                            tg2Var = tg2Var3;
                        }
                        b50Var = b50Var9;
                        return b50Var;
                    }
                    if (i11 == 1) {
                        tg2Var = (tg2) this.q;
                        qo1Var = (qo1) this.p;
                        ca2.b(obj);
                    } else if (i11 == 2) {
                        ca2.b(obj);
                        this.n = 3;
                        break;
                    } else {
                        if (i11 == 3) {
                            ca2.b(obj);
                            lz1Var = tg2Var3.o;
                            hz1 hz1Var3 = tg2Var3.t;
                            if (!Intrinsics.b(lz1Var.getValue(), obj5)) {
                                if (hz1Var3.h() >= 1.0f || ((kg2Var = tg2Var3.z) != null && Intrinsics.b(null, kg2Var.b))) {
                                    obj2 = obj5;
                                    tg2Var2 = tg2Var3;
                                    b50Var = b50Var9;
                                } else {
                                    e43 e43Var = kg2Var != null ? kg2Var.b : null;
                                    if (e43Var != null) {
                                        obj2 = obj5;
                                        tg2Var2 = tg2Var3;
                                        long j2 = kg2Var.a;
                                        b50Var = b50Var9;
                                        od odVar4 = kg2Var.e;
                                        od odVar5 = kg2Var.f;
                                        hz1Var = hz1Var3;
                                        j = 0;
                                        odVar = (od) e43Var.l(j2, odVar4, odVar2, odVar5 == null ? odVar3 : odVar5);
                                    } else {
                                        hz1Var = hz1Var3;
                                        obj2 = obj5;
                                        tg2Var2 = tg2Var3;
                                        b50Var = b50Var9;
                                        j = 0;
                                        if (kg2Var != null && kg2Var.a != 0) {
                                            long j3 = kg2Var.g;
                                            if (j3 == Long.MIN_VALUE) {
                                                j3 = tg2Var2.r;
                                            }
                                            float f = j3 / 1.0E9f;
                                            if (f > 0.0f) {
                                                odVar = new od(1.0f / f);
                                            }
                                        }
                                        odVar = odVar3;
                                    }
                                    if (kg2Var == null) {
                                        kg2Var = new kg2();
                                    }
                                    od odVar6 = kg2Var.e;
                                    kg2Var.b = null;
                                    kg2Var.c = false;
                                    kg2Var.d = hz1Var.h();
                                    odVar6.e(0, hz1Var.h());
                                    long j4 = tg2Var2.r;
                                    kg2Var.g = j4;
                                    kg2Var.a = j;
                                    kg2Var.f = odVar;
                                    kg2Var.h = si1.c((1.0d - hz1Var.h()) * j4);
                                    tg2Var2.z = kg2Var;
                                }
                                this.p = null;
                                this.q = null;
                                this.n = 4;
                                break;
                            }
                            return Unit.a;
                        }
                        if (i11 != 4) {
                            if (i11 != 5) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca2.b(obj);
                            tg2Var2 = tg2Var3;
                            tg2Var2.G(0.0f);
                            return Unit.a;
                        }
                        ca2.b(obj);
                        obj2 = obj5;
                        tg2Var2 = tg2Var3;
                        b50Var = b50Var9;
                        tg2Var2.m(obj2);
                        this.n = 5;
                        break;
                    }
                    Object obj6 = tg2Var.p;
                    qo1Var.b(null);
                    if (!obj5.equals(obj6)) {
                        this.p = null;
                        this.q = null;
                        this.n = 2;
                        if (tg2Var3.x == Long.MIN_VALUE) {
                            C = iv1.F(getContext()).B(tg2Var3.A, this);
                            if (C != b50Var9) {
                                C = Unit.a;
                                break;
                            }
                        } else {
                            C = tg2Var3.C(this);
                            if (C != b50Var9) {
                                C = Unit.a;
                                break;
                            }
                        }
                    }
                    lz1Var = tg2Var3.o;
                    hz1 hz1Var32 = tg2Var3.t;
                    if (!Intrinsics.b(lz1Var.getValue(), obj5)) {
                    }
                    return Unit.a;
                } catch (Throwable th6) {
                    qo1Var.b(null);
                    throw th6;
                }
            case 8:
                b50 b50Var10 = b50.m;
                int i12 = this.n;
                if (i12 == 0) {
                    ca2.b(obj);
                    a50 a50Var2 = (a50) this.o;
                    x22 x22Var = (x22) this.p;
                    vs2 vs2Var = new vs2(a50Var2, (xt0) this.r, (Function1) this.q, (s42) this.s, null, 0);
                    this.n = 1;
                    if (yj1.j(x22Var, vs2Var, this) == b50Var10) {
                        return b50Var10;
                    }
                } else {
                    if (i12 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            default:
                Object obj7 = b50.m;
                int i13 = this.n;
                if (i13 == 0) {
                    ca2.b(obj);
                    x22 x22Var2 = (x22) this.o;
                    zu2 zu2Var = new zu2((a50) this.p, (zn1) this.q, (bn1) this.r, null);
                    l8 l8Var = new l8((zn1) this.s, i3);
                    this.n = 1;
                    qd0 qd0Var = zs2.a;
                    Object t = j8.t(new da(x22Var2, zu2Var, l8Var, new s42(x22Var2), null), this);
                    if (t != obj7) {
                        t = Unit.a;
                    }
                    if (t == obj7) {
                        return obj7;
                    }
                } else {
                    if (i13 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(r72 r72Var, q72 q72Var, em1 em1Var, o30 o30Var) {
        super(2, o30Var);
        this.m = 6;
        this.q = r72Var;
        this.r = q72Var;
        this.s = em1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(tg2 tg2Var, Object obj, fz2 fz2Var, o30 o30Var) {
        super(2, o30Var);
        this.m = 7;
        this.r = tg2Var;
        this.o = obj;
        this.s = fz2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da(Object obj, Object obj2, Object obj3, Object obj4, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.p = obj;
        this.q = obj2;
        this.r = obj3;
        this.s = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
        this.s = obj5;
    }
}

package v;

import d2.k1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final h f9746a = new h(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final i f9747b = new i(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final j f9748c = new j(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final k f9749d = new k(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final h f9750e = new h(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final i f9751f = new i(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final j g = new j(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final k f9752h = new k(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f9753i = new float[91];
    public static final q4.f j = new q4.f(4);

    /* renamed from: k, reason: collision with root package name */
    public static final c6.s f9754k = new c6.s(new q4.f(5), new q4.f(22));

    /* renamed from: l, reason: collision with root package name */
    public static final c6.s f9755l = new c6.s(new q4.f(6), new q4.f(7));

    /* renamed from: m, reason: collision with root package name */
    public static final c6.s f9756m = new c6.s(new q4.f(8), new q4.f(9));

    /* renamed from: n, reason: collision with root package name */
    public static final c6.s f9757n = new c6.s(new q4.f(10), new q4.f(11));

    /* renamed from: o, reason: collision with root package name */
    public static final c6.s f9758o = new c6.s(new q4.f(12), new q4.f(13));

    /* renamed from: p, reason: collision with root package name */
    public static final c6.s f9759p = new c6.s(new q4.f(14), new q4.f(15));

    /* renamed from: q, reason: collision with root package name */
    public static final c6.s f9760q = new c6.s(new q4.f(16), new q4.f(17));

    /* renamed from: r, reason: collision with root package name */
    public static final c6.s f9761r = new c6.s(new q4.f(18), new q4.f(19));

    /* renamed from: s, reason: collision with root package name */
    public static final c6.s f9762s = new c6.s(new q4.f(20), new q4.f(21));

    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd A[Catch: CancellationException -> 0x0039, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0039, blocks: (B:16:0x0034, B:18:0x00c8, B:20:0x00dd, B:25:0x0100), top: B:15:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, q0 q0Var, long j3, final Function1 function1, nd.c cVar) {
        p0 p0Var;
        p0 p0Var2;
        md.a aVar;
        int i3;
        final wd.b0 b0Var;
        final g gVar2;
        g gVar3;
        final float f3;
        Function1 function12;
        wd.b0 b0Var2;
        Function1 function13;
        e eVar;
        e eVar2;
        Object obj;
        Function1 function14;
        final q0 q0Var2 = q0Var;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i10 = p0Var.f9861t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                p0Var.f9861t = i10 - Integer.MIN_VALUE;
                p0Var2 = p0Var;
                Object obj2 = p0Var2.f9860s;
                aVar = md.a.f6622d;
                i3 = p0Var2.f9861t;
                if (i3 != 0) {
                    cf.c.M(obj2);
                    final Object b10 = q0Var2.b(0L);
                    final l c10 = q0Var2.c(0L);
                    b0Var = new wd.b0();
                    if (j3 == Long.MIN_VALUE) {
                        try {
                            f3 = f(p0Var2.getContext());
                            gVar2 = gVar;
                        } catch (CancellationException e2) {
                            e = e2;
                            gVar2 = gVar;
                        }
                        try {
                            function12 = new Function1() { // from class: v.m0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    long longValue = ((Long) obj3).longValue();
                                    q0 q0Var3 = q0Var2;
                                    c6.s sVar = q0Var3.f9863b;
                                    Object obj4 = q0Var3.f9864c;
                                    g gVar4 = gVar2;
                                    e eVar3 = new e(b10, c10, longValue, obj4, longValue, new n0(gVar4, 1));
                                    c.e(eVar3, longValue, f3, q0Var3, gVar4, function1);
                                    wd.b0.this.f10141d = eVar3;
                                    return Unit.f5554a;
                                }
                            };
                            b0Var2 = b0Var;
                        } catch (CancellationException e9) {
                            e = e9;
                            gVar3 = gVar2;
                            eVar = (e) b0Var.f10141d;
                            if (eVar != null) {
                            }
                            eVar2 = (e) b0Var.f10141d;
                            if (eVar2 != null) {
                                gVar3.f9802t = false;
                            }
                            throw e;
                        }
                        try {
                            p0Var2.f9856d = gVar2;
                            p0Var2.f9857e = q0Var2;
                            p0Var2.f9858i = function1;
                            p0Var2.f9859r = b0Var2;
                            p0Var2.f9861t = 1;
                            if (b(q0Var2, function12, p0Var2) != aVar) {
                                gVar3 = gVar2;
                                function13 = function1;
                            }
                            return aVar;
                        } catch (CancellationException e10) {
                            e = e10;
                            gVar3 = gVar2;
                            b0Var = b0Var2;
                            eVar = (e) b0Var.f10141d;
                            if (eVar != null) {
                            }
                            eVar2 = (e) b0Var.f10141d;
                            if (eVar2 != null) {
                            }
                            throw e;
                        }
                    }
                    b0Var2 = b0Var;
                    try {
                        e eVar3 = new e(b10, c10, j3, q0Var2.f9864c, j3, new n0(gVar, 0));
                        e(eVar3, j3, f(p0Var2.getContext()), q0Var2, gVar, function1);
                        b0Var2.f10141d = eVar3;
                        gVar3 = gVar;
                        q0Var2 = q0Var;
                        function13 = function1;
                    } catch (CancellationException e11) {
                        e = e11;
                        gVar3 = gVar;
                        b0Var = b0Var2;
                        eVar = (e) b0Var.f10141d;
                        if (eVar != null) {
                        }
                        eVar2 = (e) b0Var.f10141d;
                        if (eVar2 != null) {
                        }
                        throw e;
                    }
                    b0Var = b0Var2;
                } else {
                    if (i3 != 1 && i3 != 2) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b0Var = p0Var2.f9859r;
                    function13 = p0Var2.f9858i;
                    q0Var2 = p0Var2.f9857e;
                    gVar3 = p0Var2.f9856d;
                    try {
                        cf.c.M(obj2);
                    } catch (CancellationException e12) {
                        e = e12;
                        eVar = (e) b0Var.f10141d;
                        if (eVar != null) {
                        }
                        eVar2 = (e) b0Var.f10141d;
                        if (eVar2 != null) {
                        }
                        throw e;
                    }
                }
                do {
                    obj = b0Var.f10141d;
                    obj.getClass();
                    if (((Boolean) ((e) obj).f9785h.getValue()).booleanValue()) {
                        return Unit.f5554a;
                    }
                    final float f10 = f(p0Var2.getContext());
                    final wd.b0 b0Var3 = b0Var;
                    final Function1 function15 = function13;
                    final q0 q0Var3 = q0Var2;
                    final g gVar4 = gVar3;
                    try {
                        function14 = new Function1() { // from class: v.o0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                long longValue = ((Long) obj3).longValue();
                                Object obj4 = wd.b0.this.f10141d;
                                obj4.getClass();
                                c.e((e) obj4, longValue, f10, q0Var3, gVar4, function15);
                                return Unit.f5554a;
                            }
                        };
                        b0Var = b0Var3;
                        q0Var2 = q0Var3;
                        gVar3 = gVar4;
                        function13 = function15;
                        p0Var2.f9856d = gVar3;
                        p0Var2.f9857e = q0Var2;
                        p0Var2.f9858i = function13;
                        p0Var2.f9859r = b0Var;
                        p0Var2.f9861t = 2;
                    } catch (CancellationException e13) {
                        e = e13;
                        b0Var = b0Var3;
                        gVar3 = gVar4;
                        eVar = (e) b0Var.f10141d;
                        if (eVar != null) {
                            eVar.f9785h.setValue(Boolean.FALSE);
                        }
                        eVar2 = (e) b0Var.f10141d;
                        if (eVar2 != null && eVar2.f9784f == gVar3.f9800r) {
                            gVar3.f9802t = false;
                        }
                        throw e;
                    }
                } while (b(q0Var2, function14, p0Var2) != aVar);
                return aVar;
            }
        }
        p0Var = new p0(cVar);
        p0Var2 = p0Var;
        Object obj22 = p0Var2.f9860s;
        aVar = md.a.f6622d;
        i3 = p0Var2.f9861t;
        if (i3 != 0) {
        }
        do {
            obj = b0Var.f10141d;
            obj.getClass();
            if (((Boolean) ((e) obj).f9785h.getValue()).booleanValue()) {
            }
        } while (b(q0Var2, function14, p0Var2) != aVar);
        return aVar;
    }

    public static final Object b(q0 q0Var, Function1 function1, p0 p0Var) {
        if (!q0Var.f9862a.a()) {
            return n0.h.q(p0Var.getContext()).s(new b1.q(1, function1), p0Var);
        }
        if (p0Var.getContext().m(k1.f3453d) == null) {
            return n0.h.q(p0Var.getContext()).s(function1, p0Var);
        }
        kotlin.collections.i0.j();
        return null;
    }

    public static final l c(l lVar) {
        l c10 = lVar.c();
        int b10 = c10.b();
        for (int i3 = 0; i3 < b10; i3++) {
            c10.e(i3, lVar.a(i3));
        }
        return c10;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.functions.Function1, wd.p] */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.jvm.functions.Function1, wd.p] */
    public static final t0 d(z0 z0Var, c6.s sVar, String str, n0.i0 i0Var, int i3, int i10) {
        s0 s0Var;
        if ((i10 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean f3 = i0Var.f(z0Var);
        Object L = i0Var.L();
        Object obj = n0.k.f6729a;
        if (f3 || L == obj) {
            L = new t0(z0Var, sVar, str);
            i0Var.g0(L);
        }
        t0 t0Var = (t0) L;
        boolean f10 = i0Var.f(z0Var) | i0Var.h(t0Var);
        Object L2 = i0Var.L();
        if (f10 || L2 == obj) {
            L2 = new b0.l0(21, z0Var, t0Var);
            i0Var.g0(L2);
        }
        n0.h.d(t0Var, (Function1) L2, i0Var);
        if (z0Var.g() && (s0Var = (s0) t0Var.f9884b.getValue()) != null) {
            z0 z0Var2 = t0Var.f9885c;
            s0Var.f9878d.h(s0Var.f9880i.invoke(z0Var2.f().a()), s0Var.f9880i.invoke(z0Var2.f().c()), (p) s0Var.f9879e.invoke(z0Var2.f()));
        }
        return t0Var;
    }

    public static final void e(e eVar, long j3, float f3, q0 q0Var, g gVar, Function1 function1) {
        long a9 = f3 == 0.0f ? q0Var.a() : (long) ((j3 - eVar.f9780b) / f3);
        eVar.f9784f = j3;
        eVar.f9782d.setValue(q0Var.b(a9));
        eVar.f9783e = q0Var.c(a9);
        if (a9 >= q0Var.a()) {
            eVar.g = eVar.f9784f;
            eVar.f9785h.setValue(Boolean.FALSE);
        }
        i(eVar, gVar);
        function1.invoke(eVar);
    }

    public static final float f(CoroutineContext coroutineContext) {
        d1.n nVar = (d1.n) coroutineContext.m(d1.a.B);
        float C = nVar != null ? nVar.C() : 1.0f;
        if (C >= 0.0f) {
            return C;
        }
        y.b("negative scale factor");
        return C;
    }

    public static j0 g(int i3, Object obj) {
        float f3 = (i3 & 2) != 0 ? 1500.0f : 400.0f;
        if ((i3 & 4) != 0) {
            obj = null;
        }
        return new j0(f3, obj);
    }

    public static a1 h(int i3, int i10, n nVar) {
        int i11 = (i10 & 2) != 0 ? 0 : 90;
        if ((i10 & 4) != 0) {
            nVar = o.f9849a;
        }
        return new a1(i3, i11, nVar);
    }

    public static final void i(e eVar, g gVar) {
        gVar.f9798e.setValue(eVar.f9782d.getValue());
        l lVar = gVar.f9799i;
        l lVar2 = eVar.f9783e;
        int b10 = lVar.b();
        for (int i3 = 0; i3 < b10; i3++) {
            lVar.e(i3, lVar2.a(i3));
        }
        gVar.f9801s = eVar.g;
        gVar.f9800r = eVar.f9784f;
        gVar.f9802t = ((Boolean) eVar.f9785h.getValue()).booleanValue();
    }
}

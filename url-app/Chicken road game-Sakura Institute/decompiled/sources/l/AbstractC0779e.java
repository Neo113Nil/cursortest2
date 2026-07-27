package l;

import G.C0192d;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s0.C1165r0;
import y2.AbstractC1343r;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0779e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0789o f7729a = new C0789o(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final C0790p f7730b = new C0790p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final C0791q f7731c = new C0791q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final r f7732d = new r(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final C0789o f7733e = new C0789o(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    public static final C0790p f7734f = new C0790p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final C0791q f7735g = new C0791q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final r f7736h = new r(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static C0778d a(float f4) {
        return new C0778d(Float.valueOf(f4), w0.f7856a, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7 A[Catch: CancellationException -> 0x003a, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x003a, blocks: (B:13:0x0036, B:16:0x00d2, B:18:0x00e7), top: B:12:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C0788n c0788n, InterfaceC0783i interfaceC0783i, long j4, Function1 function1, C2.a aVar) {
        C0773a0 c0773a0;
        C0773a0 c0773a02;
        D2.a aVar2;
        int i2;
        M2.E e4;
        Function1 function12;
        C0788n c0788n2;
        C0786l c0786l;
        C0786l c0786l2;
        Object obj;
        C0777c0 c0777c0;
        Function1 function13;
        InterfaceC0783i interfaceC0783i2;
        C0788n c0788n3 = c0788n;
        InterfaceC0783i interfaceC0783i3 = interfaceC0783i;
        if (aVar instanceof C0773a0) {
            c0773a0 = (C0773a0) aVar;
            int i4 = c0773a0.f7675o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0773a0.f7675o = i4 - Integer.MIN_VALUE;
                c0773a02 = c0773a0;
                Object obj2 = c0773a02.f7674n;
                aVar2 = D2.a.f2163d;
                i2 = c0773a02.f7675o;
                if (i2 == 0) {
                    if (i2 == 1) {
                        e4 = c0773a02.f7673m;
                        function13 = c0773a02.f7672l;
                        interfaceC0783i2 = c0773a02.f7671k;
                        c0788n2 = c0773a02.f7670j;
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e4 = c0773a02.f7673m;
                        function13 = c0773a02.f7672l;
                        interfaceC0783i2 = c0773a02.f7671k;
                        c0788n2 = c0773a02.f7670j;
                    }
                    try {
                        AbstractC1343r.b(obj2);
                        function12 = function13;
                        interfaceC0783i3 = interfaceC0783i2;
                    } catch (CancellationException e5) {
                        e = e5;
                        c0788n3 = c0788n2;
                        c0786l = (C0786l) e4.f3580d;
                        if (c0786l != null) {
                            c0786l.f7798i.setValue(Boolean.FALSE);
                        }
                        c0786l2 = (C0786l) e4.f3580d;
                        if (c0786l2 != null && c0786l2.f7796g == c0788n3.f7815j) {
                            c0788n3.f7817l = false;
                        }
                        throw e;
                    }
                } else {
                    AbstractC1343r.b(obj2);
                    Object b4 = interfaceC0783i3.b(0L);
                    AbstractC0792s g4 = interfaceC0783i3.g(0L);
                    M2.E e6 = new M2.E();
                    CoroutineContext coroutineContext = c0773a02.f2311e;
                    try {
                        if (j4 == Long.MIN_VALUE) {
                            Intrinsics.c(coroutineContext);
                            C0775b0 c0775b0 = new C0775b0(e6, b4, interfaceC0783i, g4, c0788n, h(coroutineContext), function1);
                            c0773a02.f7670j = c0788n3;
                            c0773a02.f7671k = interfaceC0783i3;
                            function12 = function1;
                            c0773a02.f7672l = function12;
                            c0773a02.f7673m = e6;
                            c0773a02.f7675o = 1;
                            if (e(interfaceC0783i3, c0775b0, c0773a02) == aVar2) {
                                return aVar2;
                            }
                        } else {
                            function12 = function1;
                            try {
                                C0786l c0786l3 = new C0786l(b4, interfaceC0783i.d(), g4, j4, interfaceC0783i.e(), j4, new A.I(c0788n3, 2));
                                Intrinsics.c(coroutineContext);
                                e6 = e6;
                                g(c0786l3, j4, h(coroutineContext), interfaceC0783i, c0788n, function1);
                                e6.f3580d = c0786l3;
                            } catch (CancellationException e7) {
                                e = e7;
                                e6 = e6;
                                e4 = e6;
                                c0786l = (C0786l) e4.f3580d;
                                if (c0786l != null) {
                                }
                                c0786l2 = (C0786l) e4.f3580d;
                                if (c0786l2 != null) {
                                    c0788n3.f7817l = false;
                                }
                                throw e;
                            }
                        }
                        c0788n2 = c0788n3;
                        e4 = e6;
                    } catch (CancellationException e8) {
                        e = e8;
                    }
                }
                do {
                    obj = e4.f3580d;
                    Intrinsics.c(obj);
                    if (((Boolean) ((C0786l) obj).f7798i.getValue()).booleanValue()) {
                        return Unit.f7487a;
                    }
                    CoroutineContext coroutineContext2 = c0773a02.f2311e;
                    Intrinsics.c(coroutineContext2);
                    c0777c0 = new C0777c0(e4, h(coroutineContext2), interfaceC0783i3, c0788n2, function12);
                    c0773a02.f7670j = c0788n2;
                    c0773a02.f7671k = interfaceC0783i3;
                    c0773a02.f7672l = function12;
                    c0773a02.f7673m = e4;
                    c0773a02.f7675o = 2;
                } while (e(interfaceC0783i3, c0777c0, c0773a02) != aVar2);
                return aVar2;
            }
        }
        c0773a0 = new C0773a0(aVar);
        c0773a02 = c0773a0;
        Object obj22 = c0773a02.f7674n;
        aVar2 = D2.a.f2163d;
        i2 = c0773a02.f7675o;
        if (i2 == 0) {
        }
        do {
            obj = e4.f3580d;
            Intrinsics.c(obj);
            if (((Boolean) ((C0786l) obj).f7798i.getValue()).booleanValue()) {
            }
        } while (e(interfaceC0783i3, c0777c0, c0773a02) != aVar2);
        return aVar2;
    }

    public static Object c(float f4, float f5, u0 u0Var, Function2 function2, E2.j jVar, int i2) {
        InterfaceC0799z i4 = (i2 & 8) != 0 ? i(0.0f, null, 7) : u0Var;
        v0 v0Var = w0.f7856a;
        Float f6 = new Float(f4);
        Float f7 = new Float(f5);
        C0789o c0789o = new C0789o(new Float(0.0f).floatValue());
        Object b4 = b(new C0788n(v0Var, f6, c0789o, 56), new e0(i4, v0Var, f6, f7, c0789o), Long.MIN_VALUE, new G.Y(function2), jVar);
        D2.a aVar = D2.a.f2163d;
        if (b4 != aVar) {
            b4 = Unit.f7487a;
        }
        return b4 == aVar ? b4 : Unit.f7487a;
    }

    public static Object d(C0788n c0788n, Float f4, X x2, E2.j jVar) {
        Object b4 = b(c0788n, new e0(x2, c0788n.f7812d, c0788n.f7813e.getValue(), f4, c0788n.f7814i), c0788n.f7815j, d0.f7709e, jVar);
        return b4 == D2.a.f2163d ? b4 : Unit.f7487a;
    }

    public static final Object e(InterfaceC0783i interfaceC0783i, Function1 function1, C0773a0 c0773a0) {
        if (!interfaceC0783i.a()) {
            return C0192d.F(c0773a0.p()).f(new G.Y(3, function1), c0773a0);
        }
        CoroutineContext coroutineContext = c0773a0.f2311e;
        Intrinsics.c(coroutineContext);
        if (coroutineContext.k(C1165r0.f10311d) != null) {
            throw new ClassCastException();
        }
        Intrinsics.c(coroutineContext);
        return C0192d.F(coroutineContext).f(function1, c0773a0);
    }

    public static final AbstractC0792s f(AbstractC0792s abstractC0792s) {
        AbstractC0792s c4 = abstractC0792s.c();
        int b4 = c4.b();
        for (int i2 = 0; i2 < b4; i2++) {
            c4.e(abstractC0792s.a(i2), i2);
        }
        return c4;
    }

    public static final void g(C0786l c0786l, long j4, float f4, InterfaceC0783i interfaceC0783i, C0788n c0788n, Function1 function1) {
        long c4 = f4 == 0.0f ? interfaceC0783i.c() : (long) ((j4 - c0786l.f7792c) / f4);
        c0786l.f7796g = j4;
        c0786l.f7794e.setValue(interfaceC0783i.b(c4));
        c0786l.f7795f = interfaceC0783i.g(c4);
        if (interfaceC0783i.f(c4)) {
            c0786l.f7797h = c0786l.f7796g;
            c0786l.f7798i.setValue(Boolean.FALSE);
        }
        k(c0786l, c0788n);
        function1.invoke(c0786l);
    }

    public static final float h(CoroutineContext coroutineContext) {
        S.p pVar = (S.p) coroutineContext.k(S.b.f3966u);
        float v4 = pVar != null ? pVar.v() : 1.0f;
        if (v4 >= 0.0f) {
            return v4;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static X i(float f4, Object obj, int i2) {
        if ((i2 & 2) != 0) {
            f4 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new X(1.0f, f4, obj);
    }

    public static u0 j(int i2, int i4, InterfaceC0797x interfaceC0797x, int i5) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            interfaceC0797x = AbstractC0798y.f7865a;
        }
        return new u0(i2, i4, interfaceC0797x);
    }

    public static final void k(C0786l c0786l, C0788n c0788n) {
        c0788n.f7813e.setValue(c0786l.f7794e.getValue());
        AbstractC0792s abstractC0792s = c0788n.f7814i;
        AbstractC0792s abstractC0792s2 = c0786l.f7795f;
        int b4 = abstractC0792s.b();
        for (int i2 = 0; i2 < b4; i2++) {
            abstractC0792s.e(abstractC0792s2.a(i2), i2);
        }
        c0788n.f7816k = c0786l.f7797h;
        c0788n.f7815j = c0786l.f7796g;
        c0788n.f7817l = ((Boolean) c0786l.f7798i.getValue()).booleanValue();
    }
}

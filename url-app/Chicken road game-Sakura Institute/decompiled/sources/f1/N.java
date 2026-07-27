package f1;

import A.g0;
import W2.AbstractC0275a;
import W2.AbstractC0296s;
import W2.C0292n;
import W2.C0294p;
import W2.EnumC0303z;
import W2.InterfaceC0291m;
import W2.InterfaceC0302y;
import W2.l0;
import W2.r0;
import Z.C0311h;
import Z2.C0327c;
import Z2.InterfaceC0330f;
import h1.C0653f;
import h1.C0656i;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;
import y2.C1331f;
import y2.C1336k;
import y2.C1338m;
import y2.InterfaceC1335j;

/* loaded from: classes.dex */
public final class N implements InterfaceC0615i {

    /* renamed from: d, reason: collision with root package name */
    public final C0653f f6519d;

    /* renamed from: e, reason: collision with root package name */
    public final H1.f f6520e;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0302y f6521i;

    /* renamed from: j, reason: collision with root package name */
    public final Z2.A f6522j;

    /* renamed from: k, reason: collision with root package name */
    public final Z2.C f6523k;

    /* renamed from: l, reason: collision with root package name */
    public final C0327c f6524l;

    /* renamed from: m, reason: collision with root package name */
    public final C0607a f6525m;

    /* renamed from: n, reason: collision with root package name */
    public final Y0.b f6526n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC1335j f6527o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC1335j f6528p;

    /* renamed from: q, reason: collision with root package name */
    public final Y0.b f6529q;

    public N(C0653f storage, List initTasksList, H1.f corruptionHandler, InterfaceC0302y scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f6519d = storage;
        this.f6520e = corruptionHandler;
        this.f6521i = scope;
        Z2.C c4 = new Z2.C(new H(this, null));
        kotlin.time.a.f7548e.getClass();
        int i2 = ((int) 0) & 1;
        Z2.O o4 = new Z2.O((i2 != 1 || kotlin.time.a.e(0L)) ? kotlin.time.a.j(0L, U2.b.f4131i) : 0L, (i2 != 1 || kotlin.time.a.e(0L)) ? kotlin.time.a.j(0L, U2.b.f4131i) : 0L);
        C0311h g4 = Z2.H.g(c4, 0);
        Z2.G a4 = Z2.H.a(0, g4.f4524a, (Y2.a) g4.f4526c);
        b3.t tVar = Z2.H.f4632a;
        InterfaceC0330f interfaceC0330f = (InterfaceC0330f) g4.f4525b;
        EnumC0303z enumC0303z = o4.equals(Z2.K.f4641a) ? EnumC0303z.f4304d : EnumC0303z.f4307j;
        Z2.x xVar = new Z2.x(o4, interfaceC0330f, a4, tVar, null);
        CoroutineContext a5 = AbstractC0296s.a(scope.q(), (CoroutineContext) g4.f4527d, true);
        d3.e eVar = W2.J.f4225a;
        if (a5 != eVar && a5.k(kotlin.coroutines.e.f7496f) == null) {
            a5 = a5.s(eVar);
        }
        AbstractC0275a l0Var = enumC0303z == EnumC0303z.f4305e ? new l0(a5, xVar) : new r0(a5, true);
        l0Var.j0(enumC0303z, l0Var, xVar);
        this.f6522j = new Z2.A(a4);
        this.f6523k = new Z2.C(new C0629x(this, null));
        this.f6524l = new C0327c(new r(this, null), kotlin.coroutines.i.f7498d, -2, Y2.a.f4398d);
        this.f6525m = new C0607a(1);
        this.f6526n = new Y0.b(this, initTasksList);
        this.f6527o = C1336k.a(new C0620n(this, 1));
        this.f6528p = C1336k.a(new C0620n(this, 0));
        this.f6529q = new Y0.b(scope, new g0(12, this), new K(this, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(2:3|(14:5|6|7|(7:(1:(1:(1:12)(2:23|24))(3:25|26|27))(1:39)|13|14|15|(1:17)(1:21)|18|19)(4:40|41|42|(10:44|45|46|(1:48)|32|14|15|(0)(0)|18|19)(3:51|(1:53)(1:69)|(2:55|(2:57|(2:59|60))(2:61|62))(2:63|(2:65|66)(2:67|68))))|28|29|30|(1:33)|32|14|15|(0)(0)|18|19))|72|6|7|(0)(0)|28|29|30|(0)|32|14|15|(0)(0)|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0036, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v7, types: [E2.j, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v8, types: [E2.j, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v0, types: [f1.N, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(N n2, P p4, E2.c cVar) {
        C0625t c0625t;
        D2.a aVar;
        int i2;
        C0292n c0292n;
        Throwable a4;
        C0292n c0292n2;
        Y w4;
        Object b4;
        N n4;
        InterfaceC0291m interfaceC0291m;
        n2.getClass();
        if (cVar instanceof C0625t) {
            c0625t = (C0625t) cVar;
            int i4 = c0625t.f6623o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0625t.f6623o = i4 - Integer.MIN_VALUE;
                Object obj = c0625t.f6621m;
                aVar = D2.a.f2163d;
                i2 = c0625t.f6623o;
                boolean z4 = true;
                if (i2 == 0) {
                    if (i2 == 1) {
                        interfaceC0291m = (InterfaceC0291m) c0625t.f6618j;
                    } else if (i2 == 2) {
                        C0292n c0292n3 = c0625t.f6620l;
                        N n5 = c0625t.f6619k;
                        P p5 = (P) c0625t.f6618j;
                        AbstractC1343r.b(obj);
                        c0292n2 = c0292n3;
                        n4 = n5;
                        p4 = p5;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC0291m = (InterfaceC0291m) c0625t.f6618j;
                    }
                    AbstractC1343r.b(obj);
                    n2 = interfaceC0291m;
                    AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                    c0292n = n2;
                    a4 = AbstractC1341p.a(obj);
                    C0292n c0292n4 = c0292n;
                    if (a4 == null) {
                        c0292n4.U(obj);
                    } else {
                        c0292n4.getClass();
                        c0292n4.U(new C0294p(a4, false));
                    }
                    return Unit.f7487a;
                }
                AbstractC1343r.b(obj);
                c0292n2 = p4.f6532b;
                try {
                    AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
                    w4 = n2.f6525m.w();
                } catch (Throwable th) {
                    th = th;
                    n2 = c0292n2;
                    AbstractC1341p.a aVar4 = AbstractC1341p.f11673d;
                    obj = AbstractC1343r.a(th);
                    c0292n = n2;
                    a4 = AbstractC1341p.a(obj);
                    C0292n c0292n42 = c0292n;
                    if (a4 == null) {
                    }
                    return Unit.f7487a;
                }
                if (w4 instanceof C0610d) {
                    ?? r2 = p4.f6531a;
                    CoroutineContext coroutineContext = p4.f6534d;
                    c0625t.f6618j = c0292n2;
                    c0625t.f6623o = 1;
                    try {
                        b4 = n2.e().b(new C0604E((N) n2, coroutineContext, (Function2) r2, (C2.a) null), c0625t);
                        if (b4 == aVar) {
                            return aVar;
                        }
                        C0292n c0292n5 = c0292n2;
                        obj = b4;
                        n2 = c0292n5;
                        AbstractC1341p.a aVar22 = AbstractC1341p.f11673d;
                        c0292n = n2;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        n2 = c0292n2;
                        AbstractC1341p.a aVar42 = AbstractC1341p.f11673d;
                        obj = AbstractC1343r.a(th);
                        c0292n = n2;
                        a4 = AbstractC1341p.a(obj);
                        C0292n c0292n422 = c0292n;
                        if (a4 == null) {
                        }
                        return Unit.f7487a;
                    }
                    a4 = AbstractC1341p.a(obj);
                    C0292n c0292n4222 = c0292n;
                    if (a4 == null) {
                    }
                    return Unit.f7487a;
                }
                if (!(w4 instanceof Q)) {
                    z4 = w4 instanceof a0;
                }
                if (!z4) {
                    if (w4 instanceof O) {
                        throw ((O) w4).f6530b;
                    }
                    throw new C1338m();
                }
                if (w4 != p4.f6533c) {
                    Intrinsics.d(w4, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$0>");
                    throw ((Q) w4).f6535b;
                }
                c0625t.f6618j = p4;
                c0625t.f6619k = n2;
                c0625t.f6620l = c0292n2;
                c0625t.f6623o = 2;
                Object f4 = n2.f(c0625t);
                n4 = n2;
                if (f4 == aVar) {
                    return aVar;
                }
                ?? r22 = p4.f6531a;
                CoroutineContext coroutineContext2 = p4.f6534d;
                c0625t.f6618j = c0292n2;
                c0625t.f6619k = null;
                c0625t.f6620l = null;
                c0625t.f6623o = 3;
                b4 = n4.e().b(new C0604E(n4, coroutineContext2, (Function2) r22, (C2.a) null), c0625t);
                if (b4 == aVar) {
                    return aVar;
                }
                C0292n c0292n52 = c0292n2;
                obj = b4;
                n2 = c0292n52;
                AbstractC1341p.a aVar222 = AbstractC1341p.f11673d;
                c0292n = n2;
                a4 = AbstractC1341p.a(obj);
                C0292n c0292n42222 = c0292n;
                if (a4 == null) {
                }
                return Unit.f7487a;
            }
        }
        c0625t = new C0625t(n2, cVar);
        Object obj2 = c0625t.f6621m;
        aVar = D2.a.f2163d;
        i2 = c0625t.f6623o;
        boolean z42 = true;
        if (i2 == 0) {
        }
        ?? r222 = p4.f6531a;
        CoroutineContext coroutineContext22 = p4.f6534d;
        c0625t.f6618j = c0292n2;
        c0625t.f6619k = null;
        c0625t.f6620l = null;
        c0625t.f6623o = 3;
        b4 = n4.e().b(new C0604E(n4, coroutineContext22, (Function2) r222, (C2.a) null), c0625t);
        if (b4 == aVar) {
        }
        C0292n c0292n522 = c0292n2;
        obj2 = b4;
        n2 = c0292n522;
        AbstractC1341p.a aVar2222 = AbstractC1341p.f11673d;
        c0292n = n2;
        a4 = AbstractC1341p.a(obj2);
        C0292n c0292n422222 = c0292n;
        if (a4 == null) {
        }
        return Unit.f7487a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(N n2, boolean z4, C2.a aVar) {
        C0631z c0631z;
        int i2;
        N n4;
        Y y4;
        boolean z5;
        N n5;
        Pair pair;
        n2.getClass();
        if (aVar instanceof C0631z) {
            c0631z = (C0631z) aVar;
            int i4 = c0631z.f6644o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0631z.f6644o = i4 - Integer.MIN_VALUE;
                Object obj = c0631z.f6642m;
                D2.a aVar2 = D2.a.f2163d;
                i2 = c0631z.f6644o;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    Y w4 = n2.f6525m.w();
                    if (w4 instanceof a0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    X e4 = n2.e();
                    c0631z.f6639j = n2;
                    c0631z.f6640k = w4;
                    c0631z.f6641l = z4;
                    c0631z.f6644o = 1;
                    Integer a4 = e4.a();
                    if (a4 == aVar2) {
                        return aVar2;
                    }
                    n4 = n2;
                    y4 = w4;
                    obj = a4;
                } else if (i2 == 1) {
                    z4 = c0631z.f6641l;
                    y4 = c0631z.f6640k;
                    n4 = c0631z.f6639j;
                    AbstractC1343r.b(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        n5 = c0631z.f6639j;
                        AbstractC1343r.b(obj);
                        pair = (Pair) obj;
                        Y y5 = (Y) pair.f7485d;
                        if (((Boolean) pair.f7486e).booleanValue()) {
                            return y5;
                        }
                        n5.f6525m.y(y5);
                        return y5;
                    }
                    n5 = c0631z.f6639j;
                    AbstractC1343r.b(obj);
                    pair = (Pair) obj;
                    Y y52 = (Y) pair.f7485d;
                    if (((Boolean) pair.f7486e).booleanValue()) {
                    }
                }
                int intValue = ((Number) obj).intValue();
                z5 = y4 instanceof C0610d;
                int i5 = !z5 ? y4.f6557a : -1;
                if (!z5 && intValue == i5) {
                    return y4;
                }
                if (z4) {
                    X e5 = n4.e();
                    C0601B c0601b = new C0601B(n4, i5, null);
                    c0631z.f6639j = n4;
                    c0631z.f6640k = null;
                    c0631z.f6644o = 3;
                    obj = e5.c(c0601b, c0631z);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    n5 = n4;
                    pair = (Pair) obj;
                    Y y522 = (Y) pair.f7485d;
                    if (((Boolean) pair.f7486e).booleanValue()) {
                    }
                } else {
                    X e6 = n4.e();
                    C0600A c0600a = new C0600A(n4, null);
                    c0631z.f6639j = n4;
                    c0631z.f6640k = null;
                    c0631z.f6644o = 2;
                    obj = e6.b(c0600a, c0631z);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    n5 = n4;
                    pair = (Pair) obj;
                    Y y5222 = (Y) pair.f7485d;
                    if (((Boolean) pair.f7486e).booleanValue()) {
                    }
                }
            }
        }
        c0631z = new C0631z(n2, aVar);
        Object obj2 = c0631z.f6642m;
        D2.a aVar22 = D2.a.f2163d;
        i2 = c0631z.f6644o;
        if (i2 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z5 = y4 instanceof C0610d;
        if (!z5) {
        }
        if (!z5) {
        }
        if (z4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea A[Catch: c -> 0x00ab, TryCatch #0 {c -> 0x00ab, blocks: (B:36:0x00a6, B:37:0x0144, B:41:0x00b4, B:42:0x0127, B:58:0x00d1, B:60:0x00ea, B:61:0x00ee, B:67:0x00da, B:71:0x0115), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(N n2, boolean z4, E2.c cVar) {
        C0602C c0602c;
        Integer a4;
        Object obj;
        N n4;
        int i2;
        C0609c c0609c;
        Object b4;
        M2.C c4;
        M2.E e4;
        n2.getClass();
        try {
            if (cVar instanceof C0602C) {
                c0602c = (C0602C) cVar;
                int i4 = c0602c.f6481r;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0602c.f6481r = i4 - Integer.MIN_VALUE;
                    Object obj2 = c0602c.f6479p;
                    D2.a aVar = D2.a.f2163d;
                    switch (c0602c.f6481r) {
                        case 0:
                            AbstractC1343r.b(obj2);
                            if (!z4) {
                                X e5 = n2.e();
                                c0602c.f6473j = n2;
                                c0602c.f6477n = z4;
                                c0602c.f6481r = 3;
                                obj2 = e5.a();
                                if (obj2 == aVar) {
                                    return aVar;
                                }
                                int intValue = ((Number) obj2).intValue();
                                X e6 = n2.e();
                                C0603D c0603d = new C0603D(n2, intValue, null);
                                c0602c.f6473j = n2;
                                c0602c.f6477n = z4;
                                c0602c.f6481r = 4;
                                obj2 = e6.c(c0603d, c0602c);
                                if (obj2 == aVar) {
                                    return aVar;
                                }
                                return (C0610d) obj2;
                            }
                            c0602c.f6473j = n2;
                            c0602c.f6477n = z4;
                            c0602c.f6481r = 1;
                            obj2 = n2.g(c0602c);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            int hashCode = obj2 != null ? obj2.hashCode() : 0;
                            X e7 = n2.e();
                            c0602c.f6473j = n2;
                            c0602c.f6474k = obj2;
                            c0602c.f6477n = z4;
                            c0602c.f6478o = hashCode;
                            c0602c.f6481r = 2;
                            a4 = e7.a();
                            if (a4 != aVar) {
                                return aVar;
                            }
                            obj = obj2;
                            obj2 = a4;
                            n4 = n2;
                            i2 = hashCode;
                            return new C0610d(i2, ((Number) obj2).intValue(), obj);
                        case 1:
                            z4 = c0602c.f6477n;
                            n2 = (N) c0602c.f6473j;
                            AbstractC1343r.b(obj2);
                            if (obj2 != null) {
                            }
                            X e72 = n2.e();
                            c0602c.f6473j = n2;
                            c0602c.f6474k = obj2;
                            c0602c.f6477n = z4;
                            c0602c.f6478o = hashCode;
                            c0602c.f6481r = 2;
                            a4 = e72.a();
                            if (a4 != aVar) {
                            }
                            break;
                        case 2:
                            i2 = c0602c.f6478o;
                            z4 = c0602c.f6477n;
                            obj = c0602c.f6474k;
                            n4 = (N) c0602c.f6473j;
                            try {
                                AbstractC1343r.b(obj2);
                                return new C0610d(i2, ((Number) obj2).intValue(), obj);
                            } catch (C0609c e8) {
                                e = e8;
                                n2 = n4;
                                M2.E e9 = new M2.E();
                                H1.f fVar = n2.f6520e;
                                c0602c.f6473j = n2;
                                c0602c.f6474k = e;
                                c0602c.f6475l = e9;
                                c0602c.f6476m = e9;
                                c0602c.f6477n = z4;
                                c0602c.f6481r = 5;
                                throw e;
                            }
                        case 3:
                            z4 = c0602c.f6477n;
                            n2 = (N) c0602c.f6473j;
                            AbstractC1343r.b(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            X e62 = n2.e();
                            C0603D c0603d2 = new C0603D(n2, intValue2, null);
                            c0602c.f6473j = n2;
                            c0602c.f6477n = z4;
                            c0602c.f6481r = 4;
                            obj2 = e62.c(c0603d2, c0602c);
                            if (obj2 == aVar) {
                            }
                            return (C0610d) obj2;
                        case 4:
                            boolean z5 = c0602c.f6477n;
                            AbstractC1343r.b(obj2);
                            return (C0610d) obj2;
                        case 5:
                            boolean z6 = c0602c.f6477n;
                            M2.E e10 = c0602c.f6476m;
                            M2.E e11 = (M2.E) c0602c.f6475l;
                            C0609c c0609c2 = (C0609c) c0602c.f6474k;
                            N n5 = (N) c0602c.f6473j;
                            AbstractC1343r.b(obj2);
                            e10.f3580d = obj2;
                            M2.C c5 = new M2.C();
                            try {
                                C0604E c0604e = new C0604E(e11, n5, c5, (C2.a) null);
                                c0602c.f6473j = c0609c2;
                                c0602c.f6474k = e11;
                                c0602c.f6475l = c5;
                                c0602c.f6476m = null;
                                c0602c.f6481r = 6;
                                if (z6) {
                                    n5.getClass();
                                    b4 = c0604e.invoke(c0602c);
                                } else {
                                    b4 = n5.e().b(new C0624s(c0604e, null), c0602c);
                                }
                                if (b4 == aVar) {
                                    return aVar;
                                }
                                c4 = c5;
                                e4 = e11;
                                Object obj3 = e4.f3580d;
                                return new C0610d(obj3 != null ? obj3.hashCode() : 0, c4.f3578d, obj3);
                            } catch (Throwable th) {
                                th = th;
                                c0609c = c0609c2;
                                C1331f.a(c0609c, th);
                                throw c0609c;
                            }
                        case 6:
                            c4 = (M2.C) c0602c.f6475l;
                            e4 = (M2.E) c0602c.f6474k;
                            c0609c = (C0609c) c0602c.f6473j;
                            try {
                                AbstractC1343r.b(obj2);
                                Object obj32 = e4.f3580d;
                                return new C0610d(obj32 != null ? obj32.hashCode() : 0, c4.f3578d, obj32);
                            } catch (Throwable th2) {
                                th = th2;
                                C1331f.a(c0609c, th);
                                throw c0609c;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (c0602c.f6481r) {
            }
        } catch (C0609c e12) {
            e = e12;
        }
        c0602c = new C0602C(n2, cVar);
        Object obj22 = c0602c.f6479p;
        D2.a aVar2 = D2.a.f2163d;
    }

    @Override // f1.InterfaceC0615i
    public final Object d(Function2 function2, E2.c cVar) {
        c0 c0Var = (c0) cVar.p().k(b0.f6563d);
        if (c0Var != null) {
            c0Var.c(this);
        }
        return W2.B.q(new c0(c0Var, this), new I(this, function2, null), cVar);
    }

    public final X e() {
        return (X) this.f6528p.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(E2.c cVar) {
        C0630y c0630y;
        Object obj;
        int i2;
        N n2;
        int intValue;
        int i4;
        Throwable th;
        N n4;
        Y0.b bVar;
        try {
            if (cVar instanceof C0630y) {
                c0630y = (C0630y) cVar;
                int i5 = c0630y.f6638n;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c0630y.f6638n = i5 - Integer.MIN_VALUE;
                    Object obj2 = c0630y.f6636l;
                    obj = D2.a.f2163d;
                    i2 = c0630y.f6638n;
                    if (i2 != 0) {
                        AbstractC1343r.b(obj2);
                        X e4 = e();
                        c0630y.f6634j = this;
                        c0630y.f6638n = 1;
                        obj2 = e4.a();
                        if (obj2 == obj) {
                            return obj;
                        }
                        n2 = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i4 = c0630y.f6635k;
                            n4 = c0630y.f6634j;
                            try {
                                AbstractC1343r.b(obj2);
                                return Unit.f7487a;
                            } catch (Throwable th2) {
                                th = th2;
                                n4.f6525m.y(new Q(th, i4));
                                throw th;
                            }
                        }
                        n2 = c0630y.f6634j;
                        AbstractC1343r.b(obj2);
                    }
                    intValue = ((Number) obj2).intValue();
                    bVar = n2.f6526n;
                    c0630y.f6634j = n2;
                    c0630y.f6635k = intValue;
                    c0630y.f6638n = 2;
                    if (bVar.x(c0630y) == obj) {
                        return obj;
                    }
                    return Unit.f7487a;
                }
            }
            bVar = n2.f6526n;
            c0630y.f6634j = n2;
            c0630y.f6635k = intValue;
            c0630y.f6638n = 2;
            if (bVar.x(c0630y) == obj) {
            }
            return Unit.f7487a;
        } catch (Throwable th3) {
            i4 = intValue;
            th = th3;
            n4 = n2;
            n4.f6525m.y(new Q(th, i4));
            throw th;
        }
        c0630y = new C0630y(this, cVar);
        Object obj22 = c0630y.f6636l;
        obj = D2.a.f2163d;
        i2 = c0630y.f6638n;
        if (i2 != 0) {
        }
        intValue = ((Number) obj22).intValue();
    }

    public final Object g(E2.c cVar) {
        return ((C0656i) this.f6527o.getValue()).a(new Z(3, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj, boolean z4, E2.c cVar) {
        L l4;
        int i2;
        M2.C c4;
        if (cVar instanceof L) {
            l4 = (L) cVar;
            int i4 = l4.f6511m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                l4.f6511m = i4 - Integer.MIN_VALUE;
                Object obj2 = l4.f6509k;
                D2.a aVar = D2.a.f2163d;
                i2 = l4.f6511m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj2);
                    M2.C c5 = new M2.C();
                    C0656i c0656i = (C0656i) this.f6527o.getValue();
                    M m4 = new M(c5, this, obj, z4, null);
                    l4.f6508j = c5;
                    l4.f6511m = 1;
                    if (c0656i.b(m4, l4) == aVar) {
                        return aVar;
                    }
                    c4 = c5;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4 = l4.f6508j;
                    AbstractC1343r.b(obj2);
                }
                return new Integer(c4.f3578d);
            }
        }
        l4 = new L(this, cVar);
        Object obj22 = l4.f6509k;
        D2.a aVar2 = D2.a.f2163d;
        i2 = l4.f6511m;
        if (i2 != 0) {
        }
        return new Integer(c4.f3578d);
    }

    @Override // f1.InterfaceC0615i
    public final InterfaceC0330f n() {
        return this.f6524l;
    }
}

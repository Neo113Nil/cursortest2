package Z2;

import A.AbstractC0017m;
import Z.C0311h;
import a3.AbstractC0425c;
import a3.C0423a;
import a3.C0432j;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;
import y2.C1331f;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static final b3.t f4632a = new b3.t("NO_VALUE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final b3.t f4633b = new b3.t("NONE", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final b3.t f4634c = new b3.t("PENDING", 0);

    public static final G a(int i2, int i4, Y2.a aVar) {
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.g(i2, "replay cannot be negative, but was ").toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.g(i4, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i2 <= 0 && i4 <= 0 && aVar != Y2.a.f4398d) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i5 = i4 + i2;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        return new G(i2, i5, aVar);
    }

    public static /* synthetic */ G b(int i2, int i4, Y2.a aVar, int i5) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return a(i2, i4, aVar);
    }

    public static final S c(Object obj) {
        if (obj == null) {
            obj = AbstractC0425c.f4947b;
        }
        return new S(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(U u4, L2.c cVar, Throwable th, E2.c cVar2) {
        C0333i c0333i;
        int i2;
        try {
            if (cVar2 instanceof C0333i) {
                c0333i = (C0333i) cVar2;
                int i4 = c0333i.f4683l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0333i.f4683l = i4 - Integer.MIN_VALUE;
                    Object obj = c0333i.f4682k;
                    Object obj2 = D2.a.f2163d;
                    i2 = c0333i.f4683l;
                    if (i2 != 0) {
                        AbstractC1343r.b(obj);
                        c0333i.f4681j = th;
                        c0333i.f4683l = 1;
                        if (cVar.g(u4, th, c0333i) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = c0333i.f4681j;
                        AbstractC1343r.b(obj);
                    }
                    return Unit.f7487a;
                }
            }
            if (i2 != 0) {
            }
            return Unit.f7487a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                C1331f.a(th2, th);
            }
            throw th2;
        }
        c0333i = new C0333i(cVar2);
        Object obj3 = c0333i.f4682k;
        Object obj22 = D2.a.f2163d;
        i2 = c0333i.f4683l;
    }

    public static final void e(Object[] objArr, long j4, Object obj) {
        objArr[((int) j4) & (objArr.length - 1)] = obj;
    }

    public static InterfaceC0330f f(InterfaceC0330f interfaceC0330f, int i2) {
        Y2.a aVar = Y2.a.f4398d;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            throw new IllegalArgumentException(AbstractC0017m.g(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i2 == -1) {
            aVar = Y2.a.f4399e;
            i2 = 0;
        }
        return interfaceC0330f instanceof a3.q ? ((a3.q) interfaceC0330f).c(kotlin.coroutines.i.f7498d, i2, aVar) : new C0432j(i2, aVar, interfaceC0330f, kotlin.coroutines.i.f7498d);
    }

    public static final C0311h g(C c4, int i2) {
        Y2.i.f4441b.getClass();
        int i4 = Y2.h.f4440b;
        if (i2 >= i4) {
            i4 = i2;
        }
        return new C0311h(i4 - i2, Y2.a.f4398d, c4, kotlin.coroutines.i.f7498d);
    }

    public static final InterfaceC0330f h(InterfaceC0330f interfaceC0330f) {
        if (interfaceC0330f instanceof P) {
            return interfaceC0330f;
        }
        if (!(interfaceC0330f instanceof C0329e)) {
            return new C0329e(interfaceC0330f);
        }
        ((C0329e) interfaceC0330f).getClass();
        return interfaceC0330f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0056, B:19:0x006b, B:21:0x0073, B:32:0x0047, B:35:0x0052), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0085 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(InterfaceC0331g interfaceC0331g, Y2.r rVar, boolean z4, C2.a aVar) {
        C0332h c0332h;
        int i2;
        Y2.c it;
        Y2.c cVar;
        InterfaceC0331g interfaceC0331g2;
        Object b4;
        try {
            if (aVar instanceof C0332h) {
                c0332h = (C0332h) aVar;
                int i4 = c0332h.f4680o;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0332h.f4680o = i4 - Integer.MIN_VALUE;
                    Object obj = c0332h.f4679n;
                    D2.a aVar2 = D2.a.f2163d;
                    i2 = c0332h.f4680o;
                    CancellationException cancellationException = null;
                    if (i2 != 0) {
                        AbstractC1343r.b(obj);
                        if (interfaceC0331g instanceof U) {
                            throw ((U) interfaceC0331g).f4662d;
                        }
                        it = rVar.iterator();
                        c0332h.f4675j = interfaceC0331g;
                        c0332h.f4676k = rVar;
                        c0332h.f4677l = it;
                        c0332h.f4678m = z4;
                        c0332h.f4680o = 1;
                        b4 = it.b(c0332h);
                        if (b4 == aVar2) {
                        }
                    } else if (i2 == 1) {
                        z4 = c0332h.f4678m;
                        cVar = c0332h.f4677l;
                        rVar = c0332h.f4676k;
                        interfaceC0331g2 = c0332h.f4675j;
                        AbstractC1343r.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z4 = c0332h.f4678m;
                        cVar = c0332h.f4677l;
                        rVar = c0332h.f4676k;
                        interfaceC0331g2 = c0332h.f4675j;
                        AbstractC1343r.b(obj);
                        it = cVar;
                        interfaceC0331g = interfaceC0331g2;
                        c0332h.f4675j = interfaceC0331g;
                        c0332h.f4676k = rVar;
                        c0332h.f4677l = it;
                        c0332h.f4678m = z4;
                        c0332h.f4680o = 1;
                        b4 = it.b(c0332h);
                        if (b4 == aVar2) {
                            return aVar2;
                        }
                        interfaceC0331g2 = interfaceC0331g;
                        cVar = it;
                        obj = b4;
                        if (((Boolean) obj).booleanValue()) {
                            if (z4) {
                                rVar.a(null);
                            }
                            return Unit.f7487a;
                        }
                        Object c4 = cVar.c();
                        c0332h.f4675j = interfaceC0331g2;
                        c0332h.f4676k = rVar;
                        c0332h.f4677l = cVar;
                        c0332h.f4678m = z4;
                        c0332h.f4680o = 2;
                        if (interfaceC0331g2.d(c4, c0332h) == aVar2) {
                            return aVar2;
                        }
                        it = cVar;
                        interfaceC0331g = interfaceC0331g2;
                        c0332h.f4675j = interfaceC0331g;
                        c0332h.f4676k = rVar;
                        c0332h.f4677l = it;
                        c0332h.f4678m = z4;
                        c0332h.f4680o = 1;
                        b4 = it.b(c0332h);
                        if (b4 == aVar2) {
                        }
                    }
                }
            }
            if (i2 != 0) {
            }
        } finally {
        }
        c0332h = new C0332h(aVar);
        Object obj2 = c0332h.f4679n;
        D2.a aVar22 = D2.a.f2163d;
        i2 = c0332h.f4680o;
        CancellationException cancellationException2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(InterfaceC0330f interfaceC0330f, E2.c cVar) {
        C0343t c0343t;
        Object obj;
        int i2;
        Object obj2;
        M2.E e4;
        C0423a e5;
        r rVar;
        if (cVar instanceof C0343t) {
            c0343t = (C0343t) cVar;
            int i4 = c0343t.f4726m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0343t.f4726m = i4 - Integer.MIN_VALUE;
                Object obj3 = c0343t.f4725l;
                obj = D2.a.f2163d;
                i2 = c0343t.f4726m;
                obj2 = AbstractC0425c.f4947b;
                if (i2 != 0) {
                    AbstractC1343r.b(obj3);
                    M2.E e6 = new M2.E();
                    e6.f3580d = obj2;
                    r rVar2 = new r(0, e6);
                    try {
                        c0343t.f4723j = e6;
                        c0343t.f4724k = rVar2;
                        c0343t.f4726m = 1;
                        if (interfaceC0330f.e(rVar2, c0343t) != obj) {
                            e4 = e6;
                        }
                    } catch (C0423a e7) {
                        e4 = e6;
                        e5 = e7;
                        rVar = rVar2;
                        if (e5.f4941d != rVar) {
                        }
                        obj = e4.f3580d;
                        if (obj == obj2) {
                        }
                        return obj;
                    }
                    return obj;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = c0343t.f4724k;
                e4 = c0343t.f4723j;
                try {
                    AbstractC1343r.b(obj3);
                } catch (C0423a e8) {
                    e5 = e8;
                    if (e5.f4941d != rVar) {
                        throw e5;
                    }
                    obj = e4.f3580d;
                    if (obj == obj2) {
                    }
                    return obj;
                }
                obj = e4.f3580d;
                if (obj == obj2) {
                    throw new NoSuchElementException("Expected at least one element");
                }
                return obj;
            }
        }
        c0343t = new C0343t(cVar);
        Object obj32 = c0343t.f4725l;
        obj = D2.a.f2163d;
        i2 = c0343t.f4726m;
        obj2 = AbstractC0425c.f4947b;
        if (i2 != 0) {
        }
        obj = e4.f3580d;
        if (obj == obj2) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(InterfaceC0330f interfaceC0330f, Function2 function2, E2.c cVar) {
        C0344u c0344u;
        Object obj;
        int i2;
        Object obj2;
        Function2 function22;
        M2.E e4;
        C0423a e5;
        A.M m4;
        if (cVar instanceof C0344u) {
            c0344u = (C0344u) cVar;
            int i4 = c0344u.f4731n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0344u.f4731n = i4 - Integer.MIN_VALUE;
                Object obj3 = c0344u.f4730m;
                obj = D2.a.f2163d;
                i2 = c0344u.f4731n;
                obj2 = AbstractC0425c.f4947b;
                if (i2 != 0) {
                    AbstractC1343r.b(obj3);
                    M2.E e6 = new M2.E();
                    e6.f3580d = obj2;
                    A.M m5 = new A.M(function2, e6);
                    try {
                        c0344u.f4727j = function2;
                        c0344u.f4728k = e6;
                        c0344u.f4729l = m5;
                        c0344u.f4731n = 1;
                        if (interfaceC0330f.e(m5, c0344u) != obj) {
                            function22 = function2;
                            e4 = e6;
                        }
                    } catch (C0423a e7) {
                        function22 = function2;
                        e4 = e6;
                        e5 = e7;
                        m4 = m5;
                        if (e5.f4941d != m4) {
                        }
                        obj = e4.f3580d;
                        if (obj == obj2) {
                        }
                        return obj;
                    }
                    return obj;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m4 = c0344u.f4729l;
                e4 = c0344u.f4728k;
                function22 = c0344u.f4727j;
                try {
                    AbstractC1343r.b(obj3);
                } catch (C0423a e8) {
                    e5 = e8;
                    if (e5.f4941d != m4) {
                        throw e5;
                    }
                    obj = e4.f3580d;
                    if (obj == obj2) {
                    }
                    return obj;
                }
                obj = e4.f3580d;
                if (obj == obj2) {
                    throw new NoSuchElementException("Expected at least one element matching the predicate " + function22);
                }
                return obj;
            }
        }
        c0344u = new C0344u(cVar);
        Object obj32 = c0344u.f4730m;
        obj = D2.a.f2163d;
        i2 = c0344u.f4731n;
        obj2 = AbstractC0425c.f4947b;
        if (i2 != 0) {
        }
        obj = e4.f3580d;
        if (obj == obj2) {
        }
        return obj;
    }

    public static final InterfaceC0330f l(D d4, CoroutineContext coroutineContext, int i2, Y2.a aVar) {
        return ((i2 == 0 || i2 == -3) && aVar == Y2.a.f4398d) ? d4 : new C0432j(i2, aVar, d4, coroutineContext);
    }
}

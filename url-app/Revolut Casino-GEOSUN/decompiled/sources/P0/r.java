package P0;

import D.A;
import D.C0017s;
import R0.w;
import java.util.concurrent.CancellationException;
import u0.C0247g;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final A.j f826a;

    /* renamed from: b, reason: collision with root package name */
    public static final A.j f827b;

    static {
        int i2 = 11;
        f826a = new A.j(i2, "NONE");
        f827b = new A.j(i2, "PENDING");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(t tVar, C0017s c0017s, Throwable th, y0.b bVar) {
        g gVar;
        int i2;
        try {
            if (bVar instanceof g) {
                gVar = (g) bVar;
                int i3 = gVar.f780j;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    gVar.f780j = i3 - Integer.MIN_VALUE;
                    Object obj = gVar.f779i;
                    Object obj2 = x0.a.f3094e;
                    i2 = gVar.f780j;
                    if (i2 != 0) {
                        o.g.z(obj);
                        gVar.f778h = th;
                        gVar.f780j = 1;
                        if (c0017s.n(tVar, th, gVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = gVar.f778h;
                        o.g.z(obj);
                    }
                    return C0247g.f3005a;
                }
            }
            if (i2 != 0) {
            }
            return C0247g.f3005a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                o.g.a(th2, th);
            }
            throw th2;
        }
        gVar = new g(bVar);
        Object obj3 = gVar.f779i;
        Object obj22 = x0.a.f3094e;
        i2 = gVar.f780j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:19:0x0072, B:21:0x007a, B:23:0x0080, B:25:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [O0.q] */
    /* JADX WARN: Type inference failed for: r9v6, types: [O0.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, O0.o oVar, boolean z2, y0.b bVar) {
        f fVar;
        int i2;
        O0.a aVar;
        O0.o oVar2;
        O0.a aVar2;
        e eVar2;
        O0.o oVar3;
        try {
            if (bVar instanceof f) {
                fVar = (f) bVar;
                int i3 = fVar.f777m;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fVar.f777m = i3 - Integer.MIN_VALUE;
                    Object obj = fVar.f776l;
                    x0.a aVar3 = x0.a.f3094e;
                    i2 = fVar.f777m;
                    if (i2 != 0) {
                        o.g.z(obj);
                        if (eVar instanceof t) {
                            throw ((t) eVar).f829e;
                        }
                        O0.b bVar2 = oVar.f749h;
                        bVar2.getClass();
                        aVar = new O0.a(bVar2);
                        oVar3 = oVar;
                        fVar.f772h = eVar;
                        fVar.f773i = oVar3;
                        fVar.f774j = aVar;
                        fVar.f775k = z2;
                        fVar.f777m = 1;
                        obj = aVar.b(fVar);
                        if (obj == aVar3) {
                        }
                    } else if (i2 == 1) {
                        z2 = fVar.f775k;
                        aVar2 = fVar.f774j;
                        ?? r9 = fVar.f773i;
                        eVar2 = fVar.f772h;
                        o.g.z(obj);
                        oVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z2 = fVar.f775k;
                        aVar2 = fVar.f774j;
                        ?? r92 = fVar.f773i;
                        eVar2 = fVar.f772h;
                        o.g.z(obj);
                        O0.o oVar4 = r92;
                        e eVar3 = eVar2;
                        aVar = aVar2;
                        eVar = eVar3;
                        oVar3 = oVar4;
                        fVar.f772h = eVar;
                        fVar.f773i = oVar3;
                        fVar.f774j = aVar;
                        fVar.f775k = z2;
                        fVar.f777m = 1;
                        obj = aVar.b(fVar);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        O0.a aVar4 = aVar;
                        eVar2 = eVar;
                        aVar2 = aVar4;
                        oVar2 = oVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z2) {
                                oVar2.a(null);
                            }
                            return C0247g.f3005a;
                        }
                        Object obj2 = aVar2.f705e;
                        A.j jVar = O0.d.f735p;
                        if (obj2 == jVar) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        aVar2.f705e = jVar;
                        if (obj2 == O0.d.f731l) {
                            Throwable n2 = aVar2.f707g.n();
                            int i4 = w.f939a;
                            throw n2;
                        }
                        fVar.f772h = eVar2;
                        fVar.f773i = oVar2;
                        fVar.f774j = aVar2;
                        fVar.f775k = z2;
                        fVar.f777m = 2;
                        oVar4 = oVar2;
                        if (eVar2.a(obj2, fVar) == aVar3) {
                            return aVar3;
                        }
                        e eVar32 = eVar2;
                        aVar = aVar2;
                        eVar = eVar32;
                        oVar3 = oVar4;
                        fVar.f772h = eVar;
                        fVar.f773i = oVar3;
                        fVar.f774j = aVar;
                        fVar.f775k = z2;
                        fVar.f777m = 1;
                        obj = aVar.b(fVar);
                        if (obj == aVar3) {
                        }
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z2) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    oVar.a(cancellationException);
                }
                throw th2;
            }
        }
        fVar = new f(bVar);
        Object obj3 = fVar.f776l;
        x0.a aVar32 = x0.a.f3094e;
        i2 = fVar.f777m;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, y0.b bVar) {
        o oVar;
        int i2;
        F0.p pVar;
        Q0.a e2;
        A a2;
        if (bVar instanceof o) {
            oVar = (o) bVar;
            int i3 = oVar.f815k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oVar.f815k = i3 - Integer.MIN_VALUE;
                Object obj = oVar.f814j;
                Object obj2 = x0.a.f3094e;
                i2 = oVar.f815k;
                if (i2 != 0) {
                    o.g.z(obj);
                    F0.p pVar2 = new F0.p();
                    A a3 = new A(1, pVar2);
                    try {
                        oVar.f812h = pVar2;
                        oVar.f813i = a3;
                        oVar.f815k = 1;
                        if (dVar.d(a3, oVar) == obj2) {
                            return obj2;
                        }
                        pVar = pVar2;
                    } catch (Q0.a e3) {
                        pVar = pVar2;
                        e2 = e3;
                        a2 = a3;
                        if (e2.f831e != a2) {
                        }
                        return pVar.f324e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a2 = oVar.f813i;
                    pVar = oVar.f812h;
                    try {
                        o.g.z(obj);
                    } catch (Q0.a e4) {
                        e2 = e4;
                        if (e2.f831e != a2) {
                            throw e2;
                        }
                        return pVar.f324e;
                    }
                }
                return pVar.f324e;
            }
        }
        oVar = new o(bVar);
        Object obj3 = oVar.f814j;
        Object obj22 = x0.a.f3094e;
        i2 = oVar.f815k;
        if (i2 != 0) {
        }
        return pVar.f324e;
    }
}

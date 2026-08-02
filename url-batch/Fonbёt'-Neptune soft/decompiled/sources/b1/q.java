package b1;

import I.C0083s;
import I.C0090z;
import a.AbstractC0132a;
import d1.w;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final B.m f1959a;

    /* renamed from: b, reason: collision with root package name */
    public static final B.m f1960b;

    static {
        int i2 = 19;
        f1959a = new B.m(i2, "NONE");
        f1960b = new B.m(i2, "PENDING");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(s sVar, C0083s c0083s, Throwable th, J0.b bVar) {
        g gVar;
        int i2;
        try {
            if (bVar instanceof g) {
                gVar = (g) bVar;
                int i3 = gVar.f1917j;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    gVar.f1917j = i3 - Integer.MIN_VALUE;
                    Object obj = gVar.f1916i;
                    Object obj2 = I0.a.f733e;
                    i2 = gVar.f1917j;
                    if (i2 != 0) {
                        i1.a.G(obj);
                        gVar.f1915h = th;
                        gVar.f1917j = 1;
                        if (c0083s.p(sVar, th, gVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = gVar.f1915h;
                        i1.a.G(obj);
                    }
                    return F0.h.f469a;
                }
            }
            if (i2 != 0) {
            }
            return F0.h.f469a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC0132a.c(th2, th);
            }
            throw th2;
        }
        gVar = new g(bVar);
        Object obj3 = gVar.f1916i;
        Object obj22 = I0.a.f733e;
        i2 = gVar.f1917j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:19:0x0072, B:21:0x007a, B:23:0x0080, B:25:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [a1.q] */
    /* JADX WARN: Type inference failed for: r9v6, types: [a1.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, a1.o oVar, boolean z2, J0.b bVar) {
        f fVar;
        int i2;
        a1.a aVar;
        a1.o oVar2;
        a1.a aVar2;
        e eVar2;
        a1.o oVar3;
        try {
            if (bVar instanceof f) {
                fVar = (f) bVar;
                int i3 = fVar.f1914m;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fVar.f1914m = i3 - Integer.MIN_VALUE;
                    Object obj = fVar.f1913l;
                    I0.a aVar3 = I0.a.f733e;
                    i2 = fVar.f1914m;
                    if (i2 != 0) {
                        i1.a.G(obj);
                        if (eVar instanceof s) {
                            throw ((s) eVar).f1962e;
                        }
                        a1.b bVar2 = oVar.f1333h;
                        bVar2.getClass();
                        aVar = new a1.a(bVar2);
                        oVar3 = oVar;
                        fVar.f1909h = eVar;
                        fVar.f1910i = oVar3;
                        fVar.f1911j = aVar;
                        fVar.f1912k = z2;
                        fVar.f1914m = 1;
                        obj = aVar.b(fVar);
                        if (obj == aVar3) {
                        }
                    } else if (i2 == 1) {
                        z2 = fVar.f1912k;
                        aVar2 = fVar.f1911j;
                        ?? r9 = fVar.f1910i;
                        eVar2 = fVar.f1909h;
                        i1.a.G(obj);
                        oVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z2 = fVar.f1912k;
                        aVar2 = fVar.f1911j;
                        ?? r92 = fVar.f1910i;
                        eVar2 = fVar.f1909h;
                        i1.a.G(obj);
                        a1.o oVar4 = r92;
                        e eVar3 = eVar2;
                        aVar = aVar2;
                        eVar = eVar3;
                        oVar3 = oVar4;
                        fVar.f1909h = eVar;
                        fVar.f1910i = oVar3;
                        fVar.f1911j = aVar;
                        fVar.f1912k = z2;
                        fVar.f1914m = 1;
                        obj = aVar.b(fVar);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        a1.a aVar4 = aVar;
                        eVar2 = eVar;
                        aVar2 = aVar4;
                        oVar2 = oVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z2) {
                                oVar2.a(null);
                            }
                            return F0.h.f469a;
                        }
                        Object obj2 = aVar2.f1288e;
                        B.m mVar = a1.d.f1318p;
                        if (obj2 == mVar) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        aVar2.f1288e = mVar;
                        if (obj2 == a1.d.f1314l) {
                            Throwable n2 = aVar2.f1290g.n();
                            int i4 = w.f2108a;
                            throw n2;
                        }
                        fVar.f1909h = eVar2;
                        fVar.f1910i = oVar2;
                        fVar.f1911j = aVar2;
                        fVar.f1912k = z2;
                        fVar.f1914m = 2;
                        oVar4 = oVar2;
                        if (eVar2.a(obj2, fVar) == aVar3) {
                            return aVar3;
                        }
                        e eVar32 = eVar2;
                        aVar = aVar2;
                        eVar = eVar32;
                        oVar3 = oVar4;
                        fVar.f1909h = eVar;
                        fVar.f1910i = oVar3;
                        fVar.f1911j = aVar;
                        fVar.f1912k = z2;
                        fVar.f1914m = 1;
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
        Object obj3 = fVar.f1913l;
        I0.a aVar32 = I0.a.f733e;
        i2 = fVar.f1914m;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, J0.b bVar) {
        n nVar;
        int i2;
        Q0.o oVar;
        c1.a e2;
        C0090z c0090z;
        if (bVar instanceof n) {
            nVar = (n) bVar;
            int i3 = nVar.f1948k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nVar.f1948k = i3 - Integer.MIN_VALUE;
                Object obj = nVar.f1947j;
                Object obj2 = I0.a.f733e;
                i2 = nVar.f1948k;
                if (i2 != 0) {
                    i1.a.G(obj);
                    Q0.o oVar2 = new Q0.o();
                    C0090z c0090z2 = new C0090z(2, oVar2);
                    try {
                        nVar.f1945h = oVar2;
                        nVar.f1946i = c0090z2;
                        nVar.f1948k = 1;
                        if (dVar.k(c0090z2, nVar) == obj2) {
                            return obj2;
                        }
                        oVar = oVar2;
                    } catch (c1.a e3) {
                        oVar = oVar2;
                        e2 = e3;
                        c0090z = c0090z2;
                        if (e2.f1998e != c0090z) {
                        }
                        return oVar.f983e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0090z = nVar.f1946i;
                    oVar = nVar.f1945h;
                    try {
                        i1.a.G(obj);
                    } catch (c1.a e4) {
                        e2 = e4;
                        if (e2.f1998e != c0090z) {
                            throw e2;
                        }
                        return oVar.f983e;
                    }
                }
                return oVar.f983e;
            }
        }
        nVar = new n(bVar);
        Object obj3 = nVar.f1947j;
        Object obj22 = I0.a.f733e;
        i2 = nVar.f1948k;
        if (i2 != 0) {
        }
        return oVar.f983e;
    }
}

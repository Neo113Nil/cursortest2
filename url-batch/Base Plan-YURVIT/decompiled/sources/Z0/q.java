package Z0;

import B0.E;
import F.C0036s;
import F.C0043z;
import a.AbstractC0086a;
import b1.w;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final E f1131a;

    /* renamed from: b, reason: collision with root package name */
    public static final E f1132b;

    static {
        int i2 = 14;
        f1131a = new E(i2, "NONE");
        f1132b = new E(i2, "PENDING");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(s sVar, C0036s c0036s, Throwable th, I0.b bVar) {
        g gVar;
        int i2;
        try {
            if (bVar instanceof g) {
                gVar = (g) bVar;
                int i3 = gVar.f1089j;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    gVar.f1089j = i3 - Integer.MIN_VALUE;
                    Object obj = gVar.f1088i;
                    i2 = gVar.f1089j;
                    if (i2 != 0) {
                        AbstractC0086a.I(obj);
                        gVar.f1087h = th;
                        gVar.f1089j = 1;
                        Object k2 = c0036s.k(sVar, th, gVar);
                        Object obj2 = H0.a.f511e;
                        if (k2 == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = gVar.f1087h;
                        AbstractC0086a.I(obj);
                    }
                    return D0.h.f206a;
                }
            }
            if (i2 != 0) {
            }
            return D0.h.f206a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC0086a.c(th2, th);
            }
            throw th2;
        }
        gVar = new g(bVar);
        Object obj3 = gVar.f1088i;
        i2 = gVar.f1089j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r1.a(r11, r0) == r5) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:20:0x0072, B:22:0x007a, B:24:0x0080, B:26:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [Y0.q] */
    /* JADX WARN: Type inference failed for: r9v6, types: [Y0.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, Y0.o oVar, boolean z2, I0.b bVar) {
        f fVar;
        int i2;
        Y0.a aVar;
        Y0.o oVar2;
        Y0.a aVar2;
        e eVar2;
        Y0.o oVar3;
        try {
            if (bVar instanceof f) {
                fVar = (f) bVar;
                int i3 = fVar.f1086m;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fVar.f1086m = i3 - Integer.MIN_VALUE;
                    Object obj = fVar.f1085l;
                    i2 = fVar.f1086m;
                    H0.a aVar3 = H0.a.f511e;
                    if (i2 != 0) {
                        AbstractC0086a.I(obj);
                        if (eVar instanceof s) {
                            throw ((s) eVar).f1134e;
                        }
                        Y0.b bVar2 = oVar.f1049h;
                        bVar2.getClass();
                        aVar = new Y0.a(bVar2);
                        oVar3 = oVar;
                        fVar.f1081h = eVar;
                        fVar.f1082i = oVar3;
                        fVar.f1083j = aVar;
                        fVar.f1084k = z2;
                        fVar.f1086m = 1;
                        obj = aVar.b(fVar);
                        if (obj != aVar3) {
                        }
                    } else if (i2 == 1) {
                        z2 = fVar.f1084k;
                        aVar2 = fVar.f1083j;
                        ?? r9 = fVar.f1082i;
                        eVar2 = fVar.f1081h;
                        AbstractC0086a.I(obj);
                        oVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z2 = fVar.f1084k;
                        aVar2 = fVar.f1083j;
                        ?? r92 = fVar.f1082i;
                        eVar2 = fVar.f1081h;
                        AbstractC0086a.I(obj);
                        Y0.o oVar4 = r92;
                        e eVar3 = eVar2;
                        aVar = aVar2;
                        eVar = eVar3;
                        oVar3 = oVar4;
                        fVar.f1081h = eVar;
                        fVar.f1082i = oVar3;
                        fVar.f1083j = aVar;
                        fVar.f1084k = z2;
                        fVar.f1086m = 1;
                        obj = aVar.b(fVar);
                        if (obj != aVar3) {
                            return aVar3;
                        }
                        Y0.a aVar4 = aVar;
                        eVar2 = eVar;
                        aVar2 = aVar4;
                        oVar2 = oVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z2) {
                                oVar2.b(null);
                            }
                            return D0.h.f206a;
                        }
                        Object obj2 = aVar2.f1005e;
                        E e2 = Y0.d.f1034p;
                        if (obj2 == e2) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        aVar2.f1005e = e2;
                        if (obj2 == Y0.d.f1030l) {
                            Throwable n2 = aVar2.f1007g.n();
                            int i4 = w.f1778a;
                            throw n2;
                        }
                        fVar.f1081h = eVar2;
                        fVar.f1082i = oVar2;
                        fVar.f1083j = aVar2;
                        fVar.f1084k = z2;
                        fVar.f1086m = 2;
                        oVar4 = oVar2;
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
                    oVar.b(cancellationException);
                }
                throw th2;
            }
        }
        fVar = new f(bVar);
        Object obj3 = fVar.f1085l;
        i2 = fVar.f1086m;
        H0.a aVar32 = H0.a.f511e;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, I0.b bVar) {
        n nVar;
        int i2;
        P0.o oVar;
        a1.a e2;
        C0043z c0043z;
        if (bVar instanceof n) {
            nVar = (n) bVar;
            int i3 = nVar.f1120k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nVar.f1120k = i3 - Integer.MIN_VALUE;
                Object obj = nVar.f1119j;
                i2 = nVar.f1120k;
                if (i2 != 0) {
                    AbstractC0086a.I(obj);
                    P0.o oVar2 = new P0.o();
                    C0043z c0043z2 = new C0043z(2, oVar2);
                    try {
                        nVar.f1117h = oVar2;
                        nVar.f1118i = c0043z2;
                        nVar.f1120k = 1;
                        Object m2 = dVar.m(c0043z2, nVar);
                        Object obj2 = H0.a.f511e;
                        if (m2 == obj2) {
                            return obj2;
                        }
                        oVar = oVar2;
                    } catch (a1.a e3) {
                        oVar = oVar2;
                        e2 = e3;
                        c0043z = c0043z2;
                        if (e2.f1140e != c0043z) {
                        }
                        return oVar.f807e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0043z = nVar.f1118i;
                    oVar = nVar.f1117h;
                    try {
                        AbstractC0086a.I(obj);
                    } catch (a1.a e4) {
                        e2 = e4;
                        if (e2.f1140e != c0043z) {
                            throw e2;
                        }
                        return oVar.f807e;
                    }
                }
                return oVar.f807e;
            }
        }
        nVar = new n(bVar);
        Object obj3 = nVar.f1119j;
        i2 = nVar.f1120k;
        if (i2 != 0) {
        }
        return oVar.f807e;
    }
}

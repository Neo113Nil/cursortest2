package q6;

import P.C0160z;
import R5.C0164d;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.D;
import l0.C0654a;
import p6.EnumC0830a;
import r6.C0853a;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0654a f7422a = new C0654a("NONE", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final C0654a f7423b = new C0654a("PENDING", 1);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(y yVar, P.r rVar, Throwable th, X5.c cVar) {
        g gVar;
        int i2;
        try {
            if (cVar instanceof g) {
                gVar = (g) cVar;
                int i5 = gVar.f7370i;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    gVar.f7370i = i5 - Integer.MIN_VALUE;
                    Object obj = gVar.f7369e;
                    Object obj2 = W5.a.f2787d;
                    i2 = gVar.f7370i;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        gVar.f7368d = th;
                        gVar.f7370i = 1;
                        if (rVar.invoke(yVar, th, gVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = gVar.f7368d;
                        V6.b.P(obj);
                    }
                    return Unit.f6114a;
                }
            }
            if (i2 != 0) {
            }
            return Unit.f6114a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                C0164d.a(th2, th);
            }
            throw th2;
        }
        gVar = new g(cVar);
        Object obj3 = gVar.f7369e;
        Object obj22 = W5.a.f2787d;
        i2 = gVar.f7370i;
    }

    public static d b(d dVar, int i2) {
        EnumC0830a enumC0830a = EnumC0830a.f7215d;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            throw new IllegalArgumentException(C4.p.g(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i2 == -1) {
            enumC0830a = EnumC0830a.f7216e;
            i2 = 0;
        }
        return dVar instanceof r6.p ? r6.s.a((r6.p) dVar, null, i2, enumC0830a, 1) : new r6.h(dVar, kotlin.coroutines.g.f6146d, i2, enumC0830a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r2.a(r11, r0) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:20:0x0072, B:22:0x007a, B:24:0x0080, B:26:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [p6.r] */
    /* JADX WARN: Type inference failed for: r9v6, types: [p6.r] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(e eVar, p6.p pVar, boolean z7, X5.c cVar) {
        f fVar;
        int i2;
        p6.b bVar;
        p6.p pVar2;
        p6.b bVar2;
        e eVar2;
        p6.p pVar3;
        try {
            if (cVar instanceof f) {
                fVar = (f) cVar;
                int i5 = fVar.f7367n;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    fVar.f7367n = i5 - Integer.MIN_VALUE;
                    Object obj = fVar.f7366m;
                    W5.a aVar = W5.a.f2787d;
                    i2 = fVar.f7367n;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        if (eVar instanceof y) {
                            throw ((y) eVar).f7425d;
                        }
                        p6.c cVar2 = pVar.f7263l;
                        cVar2.getClass();
                        bVar = new p6.b(cVar2);
                        pVar3 = pVar;
                        fVar.f7362d = eVar;
                        fVar.f7363e = pVar3;
                        fVar.f7364i = bVar;
                        fVar.f7365l = z7;
                        fVar.f7367n = 1;
                        obj = bVar.b(fVar);
                        if (obj != aVar) {
                        }
                    } else if (i2 == 1) {
                        z7 = fVar.f7365l;
                        bVar2 = fVar.f7364i;
                        ?? r9 = fVar.f7363e;
                        eVar2 = fVar.f7362d;
                        V6.b.P(obj);
                        pVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z7 = fVar.f7365l;
                        bVar2 = fVar.f7364i;
                        ?? r92 = fVar.f7363e;
                        eVar2 = fVar.f7362d;
                        V6.b.P(obj);
                        p6.p pVar4 = r92;
                        e eVar3 = eVar2;
                        bVar = bVar2;
                        eVar = eVar3;
                        pVar3 = pVar4;
                        fVar.f7362d = eVar;
                        fVar.f7363e = pVar3;
                        fVar.f7364i = bVar;
                        fVar.f7365l = z7;
                        fVar.f7367n = 1;
                        obj = bVar.b(fVar);
                        if (obj != aVar) {
                            return aVar;
                        }
                        p6.b bVar3 = bVar;
                        eVar2 = eVar;
                        bVar2 = bVar3;
                        pVar2 = pVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z7) {
                                pVar2.d(null);
                            }
                            return Unit.f6114a;
                        }
                        Object obj2 = bVar2.f7219d;
                        C0654a c0654a = p6.e.f7247p;
                        if (obj2 == c0654a) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        bVar2.f7219d = c0654a;
                        if (obj2 == p6.e.f7243l) {
                            Throwable o7 = bVar2.f7221i.o();
                            int i7 = s6.s.f7855a;
                            throw o7;
                        }
                        fVar.f7362d = eVar2;
                        fVar.f7363e = pVar2;
                        fVar.f7364i = bVar2;
                        fVar.f7365l = z7;
                        fVar.f7367n = 2;
                        pVar4 = pVar2;
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z7) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    pVar.d(cancellationException);
                }
                throw th2;
            }
        }
        fVar = new f(cVar);
        Object obj3 = fVar.f7366m;
        W5.a aVar2 = W5.a.f2787d;
        i2 = fVar.f7367n;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(d dVar, X5.c cVar) {
        q qVar;
        int i2;
        D d7;
        C0853a e7;
        C0160z c0160z;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i5 = qVar.f7410l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                qVar.f7410l = i5 - Integer.MIN_VALUE;
                Object obj = qVar.f7409i;
                Object obj2 = W5.a.f2787d;
                i2 = qVar.f7410l;
                if (i2 != 0) {
                    V6.b.P(obj);
                    D d8 = new D();
                    C0160z c0160z2 = new C0160z(1, d8);
                    try {
                        qVar.f7407d = d8;
                        qVar.f7408e = c0160z2;
                        qVar.f7410l = 1;
                        if (dVar.e(c0160z2, qVar) == obj2) {
                            return obj2;
                        }
                        d7 = d8;
                    } catch (C0853a e8) {
                        d7 = d8;
                        e7 = e8;
                        c0160z = c0160z2;
                        if (e7.f7541d != c0160z) {
                            throw e7;
                        }
                        return d7.f6152d;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0160z = qVar.f7408e;
                    d7 = qVar.f7407d;
                    try {
                        V6.b.P(obj);
                    } catch (C0853a e9) {
                        e7 = e9;
                        if (e7.f7541d != c0160z) {
                        }
                        return d7.f6152d;
                    }
                }
                return d7.f6152d;
            }
        }
        qVar = new q(cVar);
        Object obj3 = qVar.f7409i;
        Object obj22 = W5.a.f2787d;
        i2 = qVar.f7410l;
        if (i2 != 0) {
        }
        return d7.f6152d;
    }

    public static final d e(t tVar, CoroutineContext coroutineContext, int i2, EnumC0830a enumC0830a) {
        return ((((i2 < 0 || i2 >= 2) && i2 != -2) || enumC0830a != EnumC0830a.f7216e) && !((i2 == 0 || i2 == -3) && enumC0830a == EnumC0830a.f7215d)) ? new r6.h(tVar, coroutineContext, i2, enumC0830a) : tVar;
    }
}

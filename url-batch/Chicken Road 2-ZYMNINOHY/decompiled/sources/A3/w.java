package A3;

import K.C0068q;
import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final C3.v f141a = new C3.v("NONE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final C3.v f142b = new C3.v("PENDING", 0);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(y yVar, C0068q c0068q, Throwable th, h3.c cVar) {
        g gVar;
        int i4;
        try {
            if (cVar instanceof g) {
                gVar = (g) cVar;
                int i5 = gVar.f86c;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    gVar.f86c = i5 - Integer.MIN_VALUE;
                    Object obj = gVar.f85b;
                    Object obj2 = EnumC0441a.f9038a;
                    i4 = gVar.f86c;
                    if (i4 != 0) {
                        O3.l.w(obj);
                        gVar.f84a = th;
                        gVar.f86c = 1;
                        if (c0068q.a(yVar, th, gVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = gVar.f84a;
                        O3.l.w(obj);
                    }
                    return C0297i.f5732a;
                }
            }
            if (i4 != 0) {
            }
            return C0297i.f5732a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                O3.d.c(th2, th);
            }
            throw th2;
        }
        gVar = new g(cVar);
        Object obj3 = gVar.f85b;
        Object obj22 = EnumC0441a.f9038a;
        i4 = gVar.f86c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r2.emit(r11, r0) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:20:0x0072, B:22:0x007a, B:24:0x0080, B:26:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [z3.q] */
    /* JADX WARN: Type inference failed for: r9v6, types: [z3.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, z3.o oVar, boolean z, h3.c cVar) {
        f fVar;
        int i4;
        z3.b bVar;
        z3.o oVar2;
        z3.b bVar2;
        e eVar2;
        z3.o oVar3;
        try {
            if (cVar instanceof f) {
                fVar = (f) cVar;
                int i5 = fVar.f83f;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    fVar.f83f = i5 - Integer.MIN_VALUE;
                    Object obj = fVar.f82e;
                    EnumC0441a enumC0441a = EnumC0441a.f9038a;
                    i4 = fVar.f83f;
                    if (i4 != 0) {
                        O3.l.w(obj);
                        if (eVar instanceof y) {
                            throw ((y) eVar).f144a;
                        }
                        z3.c cVar2 = oVar.f16336d;
                        cVar2.getClass();
                        bVar = new z3.b(cVar2);
                        oVar3 = oVar;
                        fVar.f78a = eVar;
                        fVar.f79b = oVar3;
                        fVar.f80c = bVar;
                        fVar.f81d = z;
                        fVar.f83f = 1;
                        obj = bVar.b(fVar);
                        if (obj != enumC0441a) {
                        }
                    } else if (i4 == 1) {
                        z = fVar.f81d;
                        bVar2 = fVar.f80c;
                        ?? r9 = fVar.f79b;
                        eVar2 = fVar.f78a;
                        O3.l.w(obj);
                        oVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = fVar.f81d;
                        bVar2 = fVar.f80c;
                        ?? r92 = fVar.f79b;
                        eVar2 = fVar.f78a;
                        O3.l.w(obj);
                        z3.o oVar4 = r92;
                        e eVar3 = eVar2;
                        bVar = bVar2;
                        eVar = eVar3;
                        oVar3 = oVar4;
                        fVar.f78a = eVar;
                        fVar.f79b = oVar3;
                        fVar.f80c = bVar;
                        fVar.f81d = z;
                        fVar.f83f = 1;
                        obj = bVar.b(fVar);
                        if (obj != enumC0441a) {
                            return enumC0441a;
                        }
                        z3.b bVar3 = bVar;
                        eVar2 = eVar;
                        bVar2 = bVar3;
                        oVar2 = oVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z) {
                                oVar2.b(null);
                            }
                            return C0297i.f5732a;
                        }
                        Object obj2 = bVar2.f16294a;
                        C3.v vVar = z3.e.f16321p;
                        if (obj2 == vVar) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        bVar2.f16294a = vVar;
                        if (obj2 == z3.e.f16319l) {
                            Throwable n = bVar2.f16296c.n();
                            int i6 = C3.u.f319a;
                            throw n;
                        }
                        fVar.f78a = eVar2;
                        fVar.f79b = oVar2;
                        fVar.f80c = bVar2;
                        fVar.f81d = z;
                        fVar.f83f = 2;
                        oVar4 = oVar2;
                    }
                }
            }
            if (i4 != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z) {
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
        fVar = new f(cVar);
        Object obj3 = fVar.f82e;
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
        i4 = fVar.f83f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, InterfaceC0425c interfaceC0425c) {
        r rVar;
        int i4;
        kotlin.jvm.internal.p pVar;
        B3.a e4;
        q qVar;
        if (interfaceC0425c instanceof r) {
            rVar = (r) interfaceC0425c;
            int i5 = rVar.f128d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                rVar.f128d = i5 - Integer.MIN_VALUE;
                Object obj = rVar.f127c;
                Object obj2 = EnumC0441a.f9038a;
                i4 = rVar.f128d;
                if (i4 != 0) {
                    O3.l.w(obj);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    q qVar2 = new q(0, pVar2);
                    try {
                        rVar.f125a = pVar2;
                        rVar.f126b = qVar2;
                        rVar.f128d = 1;
                        if (dVar.collect(qVar2, rVar) == obj2) {
                            return obj2;
                        }
                        pVar = pVar2;
                    } catch (B3.a e5) {
                        pVar = pVar2;
                        e4 = e5;
                        qVar = qVar2;
                        if (e4.f218a != qVar) {
                        }
                        return pVar.f14159a;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = rVar.f126b;
                    pVar = rVar.f125a;
                    try {
                        O3.l.w(obj);
                    } catch (B3.a e6) {
                        e4 = e6;
                        if (e4.f218a != qVar) {
                            throw e4;
                        }
                        return pVar.f14159a;
                    }
                }
                return pVar.f14159a;
            }
        }
        rVar = new r(interfaceC0425c);
        Object obj3 = rVar.f127c;
        Object obj22 = EnumC0441a.f9038a;
        i4 = rVar.f128d;
        if (i4 != 0) {
        }
        return pVar.f14159a;
    }
}

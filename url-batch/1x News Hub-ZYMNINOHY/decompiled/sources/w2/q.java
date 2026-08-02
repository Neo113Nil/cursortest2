package w2;

import K.C0053q;
import K.C0060y;
import a.AbstractC0129a;
import b2.C0195i;
import e2.EnumC0317a;
import f2.AbstractC0326c;
import java.util.concurrent.CancellationException;
import n0.C1148j;
import y2.u;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C1148j f10688a = new C1148j("NONE");

    /* renamed from: b, reason: collision with root package name */
    public static final C1148j f10689b = new C1148j("PENDING");

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(s sVar, C0053q c0053q, Throwable th, AbstractC0326c abstractC0326c) {
        g gVar;
        int i3;
        try {
            if (abstractC0326c instanceof g) {
                gVar = (g) abstractC0326c;
                int i4 = gVar.f;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    gVar.f = i4 - Integer.MIN_VALUE;
                    Object obj = gVar.f10653e;
                    Object obj2 = EnumC0317a.f4969a;
                    i3 = gVar.f;
                    if (i3 != 0) {
                        android.support.v4.media.session.a.T(obj);
                        gVar.f10652d = th;
                        gVar.f = 1;
                        if (c0053q.i(sVar, th, gVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = gVar.f10652d;
                        android.support.v4.media.session.a.T(obj);
                    }
                    return C0195i.f2555a;
                }
            }
            if (i3 != 0) {
            }
            return C0195i.f2555a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC0129a.e(th2, th);
            }
            throw th2;
        }
        gVar = new g(abstractC0326c);
        Object obj3 = gVar.f10653e;
        Object obj22 = EnumC0317a.f4969a;
        i3 = gVar.f;
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
    /* JADX WARN: Type inference failed for: r9v4, types: [v2.q] */
    /* JADX WARN: Type inference failed for: r9v6, types: [v2.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, v2.o oVar, boolean z, AbstractC0326c abstractC0326c) {
        f fVar;
        int i3;
        v2.b bVar;
        v2.o oVar2;
        v2.b bVar2;
        e eVar2;
        v2.o oVar3;
        try {
            if (abstractC0326c instanceof f) {
                fVar = (f) abstractC0326c;
                int i4 = fVar.f10651i;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    fVar.f10651i = i4 - Integer.MIN_VALUE;
                    Object obj = fVar.f10650h;
                    EnumC0317a enumC0317a = EnumC0317a.f4969a;
                    i3 = fVar.f10651i;
                    if (i3 != 0) {
                        android.support.v4.media.session.a.T(obj);
                        if (eVar instanceof s) {
                            throw ((s) eVar).f10691a;
                        }
                        v2.c cVar = oVar.f10614d;
                        cVar.getClass();
                        bVar = new v2.b(cVar);
                        oVar3 = oVar;
                        fVar.f10647d = eVar;
                        fVar.f10648e = oVar3;
                        fVar.f = bVar;
                        fVar.f10649g = z;
                        fVar.f10651i = 1;
                        obj = bVar.b(fVar);
                        if (obj != enumC0317a) {
                        }
                    } else if (i3 == 1) {
                        z = fVar.f10649g;
                        bVar2 = fVar.f;
                        ?? r9 = fVar.f10648e;
                        eVar2 = fVar.f10647d;
                        android.support.v4.media.session.a.T(obj);
                        oVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = fVar.f10649g;
                        bVar2 = fVar.f;
                        ?? r92 = fVar.f10648e;
                        eVar2 = fVar.f10647d;
                        android.support.v4.media.session.a.T(obj);
                        v2.o oVar4 = r92;
                        e eVar3 = eVar2;
                        bVar = bVar2;
                        eVar = eVar3;
                        oVar3 = oVar4;
                        fVar.f10647d = eVar;
                        fVar.f10648e = oVar3;
                        fVar.f = bVar;
                        fVar.f10649g = z;
                        fVar.f10651i = 1;
                        obj = bVar.b(fVar);
                        if (obj != enumC0317a) {
                            return enumC0317a;
                        }
                        v2.b bVar3 = bVar;
                        eVar2 = eVar;
                        bVar2 = bVar3;
                        oVar2 = oVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z) {
                                oVar2.b(null);
                            }
                            return C0195i.f2555a;
                        }
                        Object obj2 = bVar2.f10575a;
                        C1148j c1148j = v2.e.f10601p;
                        if (obj2 == c1148j) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        bVar2.f10575a = c1148j;
                        if (obj2 == v2.e.f10598l) {
                            Throwable n3 = bVar2.f10577c.n();
                            int i5 = u.f10867a;
                            throw n3;
                        }
                        fVar.f10647d = eVar2;
                        fVar.f10648e = oVar2;
                        fVar.f = bVar2;
                        fVar.f10649g = z;
                        fVar.f10651i = 2;
                        oVar4 = oVar2;
                    }
                }
            }
            if (i3 != 0) {
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
        fVar = new f(abstractC0326c);
        Object obj3 = fVar.f10650h;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
        i3 = fVar.f10651i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, AbstractC0326c abstractC0326c) {
        n nVar;
        int i3;
        kotlin.jvm.internal.q qVar;
        x2.a e3;
        C0060y c0060y;
        if (abstractC0326c instanceof n) {
            nVar = (n) abstractC0326c;
            int i4 = nVar.f10678g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nVar.f10678g = i4 - Integer.MIN_VALUE;
                Object obj = nVar.f;
                Object obj2 = EnumC0317a.f4969a;
                i3 = nVar.f10678g;
                if (i3 != 0) {
                    android.support.v4.media.session.a.T(obj);
                    kotlin.jvm.internal.q qVar2 = new kotlin.jvm.internal.q();
                    C0060y c0060y2 = new C0060y(2, qVar2);
                    try {
                        nVar.f10676d = qVar2;
                        nVar.f10677e = c0060y2;
                        nVar.f10678g = 1;
                        if (dVar.n(c0060y2, nVar) == obj2) {
                            return obj2;
                        }
                        qVar = qVar2;
                    } catch (x2.a e4) {
                        qVar = qVar2;
                        e3 = e4;
                        c0060y = c0060y2;
                        if (e3.f10770a != c0060y) {
                        }
                        return qVar.f9692a;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0060y = nVar.f10677e;
                    qVar = nVar.f10676d;
                    try {
                        android.support.v4.media.session.a.T(obj);
                    } catch (x2.a e5) {
                        e3 = e5;
                        if (e3.f10770a != c0060y) {
                            throw e3;
                        }
                        return qVar.f9692a;
                    }
                }
                return qVar.f9692a;
            }
        }
        nVar = new n(abstractC0326c);
        Object obj3 = nVar.f;
        Object obj22 = EnumC0317a.f4969a;
        i3 = nVar.f10678g;
        if (i3 != 0) {
        }
        return qVar.f9692a;
    }
}

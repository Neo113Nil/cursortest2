package n1;

import f0.l;
import java.util.concurrent.CancellationException;
import m1.q;
import p1.v;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final o0.a f967a = new o0.a(2, "NONE");

    /* renamed from: b, reason: collision with root package name */
    public static final o0.a f968b = new o0.a(2, "PENDING");

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r1.b(r11, r0) == r5) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x0058, B:20:0x006c, B:22:0x0074, B:24:0x007a, B:26:0x0080, B:28:0x0091, B:30:0x0099, B:31:0x00a0, B:32:0x00a2, B:33:0x00a3, B:34:0x00aa, B:42:0x0047, B:44:0x004e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [m1.g] */
    /* JADX WARN: Type inference failed for: r9v5, types: [m1.g] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008e -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, q qVar, boolean z2, x0.b bVar) {
        e eVar;
        int i2;
        m1.a aVar;
        q qVar2;
        m1.a aVar2;
        d dVar2;
        q qVar3;
        try {
            if (bVar instanceof e) {
                eVar = (e) bVar;
                int i3 = eVar.f953j;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    eVar.f953j = i3 - Integer.MIN_VALUE;
                    Object obj = eVar.f952i;
                    i2 = eVar.f953j;
                    w0.a aVar3 = w0.a.f1227b;
                    if (i2 != 0) {
                        a.a.C(obj);
                        m1.c cVar = qVar.f884e;
                        cVar.getClass();
                        aVar = new m1.a(cVar);
                        qVar3 = qVar;
                        eVar.f948e = dVar;
                        eVar.f949f = qVar3;
                        eVar.f950g = aVar;
                        eVar.f951h = z2;
                        eVar.f953j = 1;
                        obj = aVar.b(eVar);
                        if (obj != aVar3) {
                        }
                    } else if (i2 == 1) {
                        z2 = eVar.f951h;
                        aVar2 = eVar.f950g;
                        ?? r9 = eVar.f949f;
                        dVar2 = eVar.f948e;
                        a.a.C(obj);
                        qVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            l.b("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = eVar.f951h;
                        aVar2 = eVar.f950g;
                        ?? r92 = eVar.f949f;
                        dVar2 = eVar.f948e;
                        a.a.C(obj);
                        q qVar4 = r92;
                        d dVar3 = dVar2;
                        aVar = aVar2;
                        dVar = dVar3;
                        qVar3 = qVar4;
                        eVar.f948e = dVar;
                        eVar.f949f = qVar3;
                        eVar.f950g = aVar;
                        eVar.f951h = z2;
                        eVar.f953j = 1;
                        obj = aVar.b(eVar);
                        if (obj != aVar3) {
                            return aVar3;
                        }
                        m1.a aVar4 = aVar;
                        dVar2 = dVar;
                        aVar2 = aVar4;
                        qVar2 = qVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z2) {
                                qVar2.g(null);
                            }
                            return t0.g.f1178a;
                        }
                        Object obj2 = aVar2.f840b;
                        o0.a aVar5 = m1.e.f868p;
                        if (obj2 == aVar5) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        aVar2.f840b = aVar5;
                        if (obj2 == m1.e.f865l) {
                            Throwable k2 = aVar2.f842d.k();
                            if (k2 == null) {
                                k2 = new m1.l("Channel was closed");
                            }
                            int i4 = v.f1076a;
                            throw k2;
                        }
                        eVar.f948e = dVar2;
                        eVar.f949f = qVar2;
                        eVar.f950g = aVar2;
                        eVar.f951h = z2;
                        eVar.f953j = 2;
                        qVar4 = qVar2;
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
                    qVar.g(cancellationException);
                }
                throw th2;
            }
        }
        eVar = new e(bVar);
        Object obj3 = eVar.f952i;
        i2 = eVar.f953j;
        w0.a aVar32 = w0.a.f1227b;
    }
}

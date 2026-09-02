package n0;

import java.util.concurrent.CancellationException;
import m0.l;
import m0.q;
import p0.w;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1105a = new io.flutter.plugin.platform.c(4, "NONE");

    /* renamed from: b, reason: collision with root package name */
    public static final io.flutter.plugin.platform.c f1106b = new io.flutter.plugin.platform.c(4, "PENDING");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005a, B:19:0x006e, B:21:0x0076, B:23:0x007c, B:25:0x0082, B:28:0x0093, B:30:0x009b, B:31:0x00a2, B:32:0x00a4, B:33:0x00a5, B:34:0x00ac, B:42:0x0049, B:44:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [m0.s] */
    /* JADX WARN: Type inference failed for: r9v6, types: [m0.s] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0090 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, q qVar, boolean z2, Y.b bVar) {
        e eVar;
        int i2;
        m0.a aVar;
        q qVar2;
        m0.a aVar2;
        d dVar2;
        q qVar3;
        try {
            if (bVar instanceof e) {
                eVar = (e) bVar;
                int i3 = eVar.f1094j;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    eVar.f1094j = i3 - Integer.MIN_VALUE;
                    Object obj = eVar.f1093i;
                    X.a aVar3 = X.a.f395b;
                    i2 = eVar.f1094j;
                    if (i2 != 0) {
                        a.a.B(obj);
                        m0.c cVar = qVar.f1032e;
                        cVar.getClass();
                        aVar = new m0.a(cVar);
                        qVar3 = qVar;
                        eVar.f1089e = dVar;
                        eVar.f1090f = qVar3;
                        eVar.f1091g = aVar;
                        eVar.f1092h = z2;
                        eVar.f1094j = 1;
                        obj = aVar.b(eVar);
                        if (obj == aVar3) {
                        }
                    } else if (i2 == 1) {
                        z2 = eVar.f1092h;
                        aVar2 = eVar.f1091g;
                        ?? r9 = eVar.f1090f;
                        dVar2 = eVar.f1089e;
                        a.a.B(obj);
                        qVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z2 = eVar.f1092h;
                        aVar2 = eVar.f1091g;
                        ?? r92 = eVar.f1090f;
                        dVar2 = eVar.f1089e;
                        a.a.B(obj);
                        q qVar4 = r92;
                        d dVar3 = dVar2;
                        aVar = aVar2;
                        dVar = dVar3;
                        qVar3 = qVar4;
                        eVar.f1089e = dVar;
                        eVar.f1090f = qVar3;
                        eVar.f1091g = aVar;
                        eVar.f1092h = z2;
                        eVar.f1094j = 1;
                        obj = aVar.b(eVar);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        m0.a aVar4 = aVar;
                        dVar2 = dVar;
                        aVar2 = aVar4;
                        qVar2 = qVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z2) {
                                qVar2.a(null);
                            }
                            return U.g.f378a;
                        }
                        Object obj2 = aVar2.f986b;
                        io.flutter.plugin.platform.c cVar2 = m0.e.f1016p;
                        if (obj2 == cVar2) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        aVar2.f986b = cVar2;
                        if (obj2 == m0.e.f1012l) {
                            Throwable k2 = aVar2.f988d.k();
                            if (k2 == null) {
                                k2 = new l("Channel was closed");
                            }
                            int i4 = w.f1172a;
                            throw k2;
                        }
                        eVar.f1089e = dVar2;
                        eVar.f1090f = qVar2;
                        eVar.f1091g = aVar2;
                        eVar.f1092h = z2;
                        eVar.f1094j = 2;
                        qVar4 = qVar2;
                        if (dVar2.b(obj2, eVar) == aVar3) {
                            return aVar3;
                        }
                        d dVar32 = dVar2;
                        aVar = aVar2;
                        dVar = dVar32;
                        qVar3 = qVar4;
                        eVar.f1089e = dVar;
                        eVar.f1090f = qVar3;
                        eVar.f1091g = aVar;
                        eVar.f1092h = z2;
                        eVar.f1094j = 1;
                        obj = aVar.b(eVar);
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
                    qVar.a(cancellationException);
                }
                throw th2;
            }
        }
        eVar = new e(bVar);
        Object obj3 = eVar.f1093i;
        X.a aVar32 = X.a.f395b;
        i2 = eVar.f1094j;
    }
}

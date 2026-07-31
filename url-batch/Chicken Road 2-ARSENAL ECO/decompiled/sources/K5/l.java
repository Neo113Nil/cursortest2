package K5;

import J5.p;
import M5.u;
import M5.v;
import java.util.concurrent.CancellationException;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final v f1413a = new v("NONE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final v f1414b = new v("PENDING", 0);

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (r2.a(r11, r0) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005a, B:20:0x006e, B:22:0x0076, B:24:0x007c, B:26:0x0082, B:28:0x0093, B:29:0x009b, B:30:0x009c, B:31:0x00a3, B:39:0x0049, B:41:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [J5.r] */
    /* JADX WARN: Type inference failed for: r9v6, types: [J5.r] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0090 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, p pVar, boolean z5, AbstractC0607c abstractC0607c) {
        e eVar;
        int i7;
        J5.a aVar;
        p pVar2;
        J5.a aVar2;
        d dVar2;
        p pVar3;
        try {
            if (abstractC0607c instanceof e) {
                eVar = (e) abstractC0607c;
                int i8 = eVar.f1397k;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    eVar.f1397k = i8 - Integer.MIN_VALUE;
                    Object obj = eVar.f1396j;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = eVar.f1397k;
                    if (i7 != 0) {
                        AbstractC0676f.w(obj);
                        J5.b bVar = pVar.f1338i;
                        bVar.getClass();
                        aVar = new J5.a(bVar);
                        pVar3 = pVar;
                        eVar.f1392f = dVar;
                        eVar.f1393g = pVar3;
                        eVar.f1394h = aVar;
                        eVar.f1395i = z5;
                        eVar.f1397k = 1;
                        obj = aVar.b(eVar);
                        if (obj != enumC0580a) {
                        }
                    } else if (i7 == 1) {
                        z5 = eVar.f1395i;
                        aVar2 = eVar.f1394h;
                        ?? r9 = eVar.f1393g;
                        dVar2 = eVar.f1392f;
                        AbstractC0676f.w(obj);
                        pVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z5 = eVar.f1395i;
                        aVar2 = eVar.f1394h;
                        ?? r92 = eVar.f1393g;
                        dVar2 = eVar.f1392f;
                        AbstractC0676f.w(obj);
                        p pVar4 = r92;
                        d dVar3 = dVar2;
                        aVar = aVar2;
                        dVar = dVar3;
                        pVar3 = pVar4;
                        eVar.f1392f = dVar;
                        eVar.f1393g = pVar3;
                        eVar.f1394h = aVar;
                        eVar.f1395i = z5;
                        eVar.f1397k = 1;
                        obj = aVar.b(eVar);
                        if (obj != enumC0580a) {
                            return enumC0580a;
                        }
                        J5.a aVar3 = aVar;
                        dVar2 = dVar;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z5) {
                                pVar2.d(null);
                            }
                            return k5.v.f5219a;
                        }
                        Object obj2 = aVar2.f1291f;
                        v vVar = J5.d.f1320p;
                        if (obj2 == vVar) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        aVar2.f1291f = vVar;
                        if (obj2 == J5.d.f1316l) {
                            Throwable o7 = aVar2.f1293h.o();
                            int i9 = u.f1623a;
                            throw o7;
                        }
                        eVar.f1392f = dVar2;
                        eVar.f1393g = pVar2;
                        eVar.f1394h = aVar2;
                        eVar.f1395i = z5;
                        eVar.f1397k = 2;
                        pVar4 = pVar2;
                    }
                }
            }
            if (i7 != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z5) {
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
        eVar = new e(abstractC0607c);
        Object obj3 = eVar.f1396j;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = eVar.f1397k;
    }
}

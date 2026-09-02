package m0;

import k0.C0046e;
import k0.C0058q;
import v.C0106i;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1024a = new i();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v5, types: [d0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(r rVar, C0106i c0106i, Y.b bVar) {
        o oVar;
        int i2;
        try {
            if (bVar instanceof o) {
                oVar = (o) bVar;
                int i3 = oVar.f1030g;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    oVar.f1030g = i3 - Integer.MIN_VALUE;
                    Object obj = oVar.f1029f;
                    X.a aVar = X.a.f395b;
                    i2 = oVar.f1030g;
                    if (i2 != 0) {
                        a.a.B(obj);
                        W.i iVar = oVar.f399c;
                        e0.h.b(iVar);
                        if (iVar.k(C0058q.f883c) != rVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        oVar.f1028e = c0106i;
                        oVar.f1030g = 1;
                        C0046e c0046e = new C0046e(a.a.o(oVar), 1);
                        c0046e.q();
                        ((q) rVar).N(new p(c0046e));
                        c0106i = c0106i;
                        if (c0046e.p() == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = oVar.f1028e;
                        a.a.B(obj);
                        c0106i = r5;
                    }
                    c0106i.a();
                    return U.g.f378a;
                }
            }
            if (i2 != 0) {
            }
            c0106i.a();
            return U.g.f378a;
        } catch (Throwable th) {
            c0106i.a();
            throw th;
        }
        oVar = new o(bVar);
        Object obj2 = oVar.f1029f;
        X.a aVar2 = X.a.f395b;
        i2 = oVar.f1030g;
    }
}

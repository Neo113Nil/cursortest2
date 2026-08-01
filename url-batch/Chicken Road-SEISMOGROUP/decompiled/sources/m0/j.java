package m0;

import a.AbstractC0016a;
import k0.C0044e;
import k0.C0056q;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1067a = new i();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v5, types: [d0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(r rVar, u.i iVar, Y.b bVar) {
        o oVar;
        int i2;
        try {
            if (bVar instanceof o) {
                oVar = (o) bVar;
                int i3 = oVar.f1073g;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    oVar.f1073g = i3 - Integer.MIN_VALUE;
                    Object obj = oVar.f1072f;
                    X.a aVar = X.a.f450b;
                    i2 = oVar.f1073g;
                    if (i2 != 0) {
                        AbstractC0016a.D(obj);
                        W.i iVar2 = oVar.f454c;
                        e0.h.b(iVar2);
                        if (iVar2.k(C0056q.f936c) != rVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        oVar.f1071e = iVar;
                        oVar.f1073g = 1;
                        C0044e c0044e = new C0044e(AbstractC0016a.t(oVar), 1);
                        c0044e.q();
                        ((q) rVar).N(new p(c0044e));
                        iVar = iVar;
                        if (c0044e.p() == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = oVar.f1071e;
                        AbstractC0016a.D(obj);
                        iVar = r5;
                    }
                    iVar.a();
                    return U.g.f433a;
                }
            }
            if (i2 != 0) {
            }
            iVar.a();
            return U.g.f433a;
        } catch (Throwable th) {
            iVar.a();
            throw th;
        }
        oVar = new o(bVar);
        Object obj2 = oVar.f1072f;
        X.a aVar2 = X.a.f450b;
        i2 = oVar.f1073g;
    }
}

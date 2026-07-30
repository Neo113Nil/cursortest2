package m1;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f876a = new i();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(q qVar, w.i iVar, x0.b bVar) {
        o oVar;
        int i2;
        try {
            if (bVar instanceof o) {
                oVar = (o) bVar;
                int i3 = oVar.f882g;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    oVar.f882g = i3 - Integer.MIN_VALUE;
                    Object obj = oVar.f881f;
                    i2 = oVar.f882g;
                    if (i2 != 0) {
                        a.a.C(obj);
                        v0.h hVar = oVar.f1231c;
                        hVar.getClass();
                        if (hVar.j(k1.q.f713c) != qVar) {
                            f0.l.b("awaitClose() can only be invoked from the producer context");
                            return null;
                        }
                        oVar.f880e = iVar;
                        oVar.f882g = 1;
                        k1.d dVar = new k1.d(a.a.m(oVar), 1);
                        dVar.q();
                        qVar.N(new p(dVar));
                        Object p2 = dVar.p();
                        w0.a aVar = w0.a.f1227b;
                        if (p2 == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            f0.l.b("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iVar = oVar.f880e;
                        a.a.C(obj);
                    }
                    iVar.a();
                    return t0.g.f1178a;
                }
            }
            if (i2 != 0) {
            }
            iVar.a();
            return t0.g.f1178a;
        } catch (Throwable th) {
            iVar.a();
            throw th;
        }
        oVar = new o(bVar);
        Object obj2 = oVar.f881f;
        i2 = oVar.f882g;
    }
}

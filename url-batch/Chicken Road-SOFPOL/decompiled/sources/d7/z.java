package d7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z implements f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2431d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2432e;

    public z(m mVar) {
        this.f2432e = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Type inference failed for: r6v4, types: [i6.i, p6.e] */
    @Override // d7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(g gVar, g6.c cVar) {
        a aVar;
        int i;
        Throwable th;
        e7.q qVar;
        switch (this.f2431d) {
            case 0:
                if (cVar instanceof a) {
                    aVar = (a) cVar;
                    int i8 = aVar.f2334j;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        aVar.f2334j = i8 - Integer.MIN_VALUE;
                        Object obj = aVar.f2333h;
                        i = aVar.f2334j;
                        c6.m mVar = c6.m.f1757a;
                        if (i != 0) {
                            s6.a.K(obj);
                            g6.h hVar = aVar.f3460e;
                            q6.i.b(hVar);
                            e7.q qVar2 = new e7.q(gVar, hVar);
                            try {
                                aVar.f2332g = qVar2;
                                aVar.f2334j = 1;
                                Object g3 = ((i6.i) this.f2432e).g(qVar2, aVar);
                                h6.a aVar2 = h6.a.f3204d;
                                if (g3 != aVar2) {
                                    g3 = mVar;
                                }
                                if (g3 == aVar2) {
                                    return aVar2;
                                }
                                qVar = qVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                qVar = qVar2;
                                qVar.q();
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            qVar = aVar.f2332g;
                            try {
                                s6.a.K(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                qVar.q();
                                throw th;
                            }
                        }
                        qVar.q();
                        return mVar;
                    }
                }
                aVar = new a(this, cVar);
                Object obj2 = aVar.f2333h;
                i = aVar.f2334j;
                c6.m mVar2 = c6.m.f1757a;
                if (i != 0) {
                }
                qVar.q();
                return mVar2;
            default:
                Object c8 = ((m) this.f2432e).c(new b6.p(gVar, 6), cVar);
                return c8 == h6.a.f3204d ? c8 : c6.m.f1757a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(p6.e eVar) {
        this.f2432e = (i6.i) eVar;
    }
}

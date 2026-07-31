package d7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m implements f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2390f;

    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.f2388d = i;
        this.f2390f = obj;
        this.f2389e = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Type inference failed for: r3v6, types: [i6.i, p6.e] */
    @Override // d7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(g gVar, g6.c cVar) {
        l lVar;
        int i;
        h6.a aVar;
        Throwable th;
        e7.q qVar;
        m mVar;
        g gVar2;
        f fVar;
        p pVar;
        int i8;
        d dVar;
        switch (this.f2388d) {
            case 0:
                if (cVar instanceof l) {
                    lVar = (l) cVar;
                    int i9 = lVar.f2384h;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        lVar.f2384h = i9 - Integer.MIN_VALUE;
                        Object obj = lVar.f2383g;
                        i = lVar.f2384h;
                        aVar = h6.a.f3204d;
                        if (i != 0) {
                            s6.a.K(obj);
                            g6.h hVar = lVar.f3460e;
                            q6.i.b(hVar);
                            e7.q qVar2 = new e7.q(gVar, hVar);
                            try {
                                y3.l lVar2 = (y3.l) this.f2390f;
                                lVar.f2385j = this;
                                lVar.f2386k = gVar;
                                lVar.f2387l = qVar2;
                                lVar.f2384h = 1;
                                if (lVar2.g(qVar2, lVar) == aVar) {
                                    return aVar;
                                }
                                mVar = this;
                                gVar2 = gVar;
                                qVar = qVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                qVar = qVar2;
                                qVar.q();
                                throw th;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s6.a.K(obj);
                                return c6.m.f1757a;
                            }
                            qVar = lVar.f2387l;
                            gVar2 = lVar.f2386k;
                            mVar = lVar.f2385j;
                            try {
                                s6.a.K(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                qVar.q();
                                throw th;
                            }
                        }
                        qVar.q();
                        fVar = (f) mVar.f2389e;
                        lVar.f2385j = null;
                        lVar.f2386k = null;
                        lVar.f2387l = null;
                        lVar.f2384h = 2;
                        if (fVar.c(gVar2, lVar) == aVar) {
                            return aVar;
                        }
                        return c6.m.f1757a;
                    }
                }
                lVar = new l(this, cVar);
                Object obj2 = lVar.f2383g;
                i = lVar.f2384h;
                aVar = h6.a.f3204d;
                if (i != 0) {
                }
                qVar.q();
                fVar = (f) mVar.f2389e;
                lVar.f2385j = null;
                lVar.f2386k = null;
                lVar.f2387l = null;
                lVar.f2384h = 2;
                if (fVar.c(gVar2, lVar) == aVar) {
                }
                return c6.m.f1757a;
            case 1:
                Object c8 = ((f) this.f2389e).c(new o(new q6.o(), gVar, (i6.i) this.f2390f), cVar);
                return c8 == h6.a.f3204d ? c8 : c6.m.f1757a;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                if (cVar instanceof p) {
                    pVar = (p) cVar;
                    int i10 = pVar.f2409h;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        pVar.f2409h = i10 - Integer.MIN_VALUE;
                        Object obj3 = pVar.f2408g;
                        i8 = pVar.f2409h;
                        if (i8 != 0) {
                            s6.a.K(obj3);
                            m mVar2 = (m) this.f2390f;
                            d dVar2 = new d(1, (b6.m) this.f2389e, gVar);
                            try {
                                pVar.f2410j = dVar2;
                                pVar.f2409h = 1;
                                Object c9 = mVar2.c(dVar2, pVar);
                                h6.a aVar2 = h6.a.f3204d;
                                if (c9 == aVar2) {
                                    return aVar2;
                                }
                            } catch (e7.a e8) {
                                e = e8;
                                dVar = dVar2;
                                if (e.f2538d != dVar) {
                                    throw e;
                                }
                                return c6.m.f1757a;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            dVar = pVar.f2410j;
                            try {
                                s6.a.K(obj3);
                            } catch (e7.a e9) {
                                e = e9;
                                if (e.f2538d != dVar) {
                                }
                                return c6.m.f1757a;
                            }
                        }
                        return c6.m.f1757a;
                    }
                }
                pVar = new p(this, cVar);
                Object obj32 = pVar.f2408g;
                i8 = pVar.f2409h;
                if (i8 != 0) {
                }
                return c6.m.f1757a;
            default:
                Object c10 = ((f) this.f2389e).c(new d(4, gVar, (k0.g) this.f2390f, false), cVar);
                return c10 == h6.a.f3204d ? c10 : c6.m.f1757a;
        }
    }

    public m(f fVar, k0.g gVar) {
        this.f2388d = 3;
        this.f2389e = fVar;
        this.f2390f = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(f fVar, p6.e eVar) {
        this.f2388d = 1;
        this.f2389e = fVar;
        this.f2390f = (i6.i) eVar;
    }
}

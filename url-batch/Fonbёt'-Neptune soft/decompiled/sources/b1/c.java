package b1;

/* loaded from: classes.dex */
public final class c extends c1.f {

    /* renamed from: h, reason: collision with root package name */
    public final a0.j f1907h;

    /* renamed from: i, reason: collision with root package name */
    public final a0.j f1908i;

    public c(a0.j jVar, H0.i iVar, int i2, int i3) {
        super(iVar, i2, i3);
        this.f1907h = jVar;
        this.f1908i = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // c1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(a1.p pVar, H0.d dVar) {
        b bVar;
        int i2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i3 = bVar.f1906k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f1906k = i3 - Integer.MIN_VALUE;
                Object obj = bVar.f1904i;
                I0.a aVar = I0.a.f733e;
                i2 = bVar.f1906k;
                F0.h hVar = F0.h.f469a;
                if (i2 != 0) {
                    i1.a.G(obj);
                    bVar.f1903h = pVar;
                    bVar.f1906k = 1;
                    Object h2 = this.f1907h.h(pVar, bVar);
                    if (h2 != aVar) {
                        h2 = hVar;
                    }
                    if (h2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = bVar.f1903h;
                    i1.a.G(obj);
                }
                if (((a1.o) pVar).f1333h.s()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return hVar;
            }
        }
        bVar = new b(this, (J0.b) dVar);
        Object obj2 = bVar.f1904i;
        I0.a aVar2 = I0.a.f733e;
        i2 = bVar.f1906k;
        F0.h hVar2 = F0.h.f469a;
        if (i2 != 0) {
        }
        if (((a1.o) pVar).f1333h.s()) {
        }
    }

    @Override // c1.f
    public final c1.f b(H0.i iVar, int i2, int i3) {
        return new c(this.f1908i, iVar, i2, i3);
    }

    @Override // c1.f
    public final String toString() {
        return "block[" + this.f1907h + "] -> " + super.toString();
    }
}

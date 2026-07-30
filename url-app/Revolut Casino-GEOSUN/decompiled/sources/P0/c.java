package P0;

import u0.C0247g;

/* loaded from: classes.dex */
public final class c extends Q0.f {

    /* renamed from: h, reason: collision with root package name */
    public final U.j f770h;

    /* renamed from: i, reason: collision with root package name */
    public final U.j f771i;

    public c(U.j jVar, w0.i iVar, int i2, int i3) {
        super(iVar, i2, i3);
        this.f770h = jVar;
        this.f771i = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // Q0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(O0.p pVar, w0.d dVar) {
        b bVar;
        int i2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i3 = bVar.f769k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f769k = i3 - Integer.MIN_VALUE;
                Object obj = bVar.f767i;
                x0.a aVar = x0.a.f3094e;
                i2 = bVar.f769k;
                C0247g c0247g = C0247g.f3005a;
                if (i2 != 0) {
                    o.g.z(obj);
                    bVar.f766h = pVar;
                    bVar.f769k = 1;
                    Object f2 = this.f770h.f(pVar, bVar);
                    if (f2 != aVar) {
                        f2 = c0247g;
                    }
                    if (f2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = bVar.f766h;
                    o.g.z(obj);
                }
                if (((O0.o) pVar).f749h.s()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return c0247g;
            }
        }
        bVar = new b(this, (y0.b) dVar);
        Object obj2 = bVar.f767i;
        x0.a aVar2 = x0.a.f3094e;
        i2 = bVar.f769k;
        C0247g c0247g2 = C0247g.f3005a;
        if (i2 != 0) {
        }
        if (((O0.o) pVar).f749h.s()) {
        }
    }

    @Override // Q0.f
    public final Q0.f b(w0.i iVar, int i2, int i3) {
        return new c(this.f771i, iVar, i2, i3);
    }

    @Override // Q0.f
    public final String toString() {
        return "block[" + this.f770h + "] -> " + super.toString();
    }
}

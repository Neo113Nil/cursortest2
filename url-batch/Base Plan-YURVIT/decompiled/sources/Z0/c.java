package Z0;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class c extends a1.f {

    /* renamed from: h, reason: collision with root package name */
    public final W.j f1079h;

    /* renamed from: i, reason: collision with root package name */
    public final W.j f1080i;

    public c(W.j jVar, G0.i iVar, int i2, int i3) {
        super(iVar, i2, i3);
        this.f1079h = jVar;
        this.f1080i = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // a1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Y0.p pVar, G0.d dVar) {
        b bVar;
        int i2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i3 = bVar.f1078k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f1078k = i3 - Integer.MIN_VALUE;
                Object obj = bVar.f1076i;
                i2 = bVar.f1078k;
                D0.h hVar = D0.h.f206a;
                if (i2 != 0) {
                    AbstractC0086a.I(obj);
                    bVar.f1075h = pVar;
                    bVar.f1078k = 1;
                    Object i4 = this.f1079h.i(pVar, bVar);
                    H0.a aVar = H0.a.f511e;
                    if (i4 != aVar) {
                        i4 = hVar;
                    }
                    if (i4 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = bVar.f1075h;
                    AbstractC0086a.I(obj);
                }
                if (((Y0.o) pVar).f1049h.s()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return hVar;
            }
        }
        bVar = new b(this, (I0.b) dVar);
        Object obj2 = bVar.f1076i;
        i2 = bVar.f1078k;
        D0.h hVar2 = D0.h.f206a;
        if (i2 != 0) {
        }
        if (((Y0.o) pVar).f1049h.s()) {
        }
    }

    @Override // a1.f
    public final String toString() {
        return "block[" + this.f1079h + "] -> " + super.toString();
    }
}

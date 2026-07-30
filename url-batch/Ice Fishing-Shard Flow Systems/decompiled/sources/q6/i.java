package q6;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l2.c f7376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P.r f7377e;

    public i(l2.c cVar, P.r rVar) {
        this.f7376d = cVar;
        this.f7377e = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // q6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(e eVar, V5.b bVar) {
        h hVar;
        W5.a aVar;
        int i2;
        i iVar;
        y yVar;
        P.r rVar;
        r6.t tVar;
        Throwable th;
        r6.t tVar2;
        P.r rVar2;
        try {
            if (bVar instanceof h) {
                hVar = (h) bVar;
                int i5 = hVar.f7372e;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    hVar.f7372e = i5 - Integer.MIN_VALUE;
                    Object obj = hVar.f7371d;
                    aVar = W5.a.f2787d;
                    i2 = hVar.f7372e;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        try {
                            l2.c cVar = this.f7376d;
                            hVar.f7374l = this;
                            hVar.f7375m = eVar;
                            hVar.f7372e = 1;
                            if (cVar.e(eVar, hVar) != aVar) {
                                iVar = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            iVar = this;
                            yVar = new y(th);
                            rVar = iVar.f7377e;
                            hVar.f7374l = th;
                            hVar.f7375m = null;
                            hVar.f7372e = 2;
                            if (w.a(yVar, rVar, th, hVar) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                        return aVar;
                    }
                    if (i2 != 1) {
                        if (i2 == 2) {
                            Throwable th3 = (Throwable) hVar.f7374l;
                            V6.b.P(obj);
                            throw th3;
                        }
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tVar2 = (r6.t) hVar.f7374l;
                        try {
                            V6.b.P(obj);
                            tVar2.releaseIntercepted();
                            return Unit.f6114a;
                        } catch (Throwable th4) {
                            th = th4;
                            tVar2.releaseIntercepted();
                            throw th;
                        }
                    }
                    eVar = hVar.f7375m;
                    iVar = (i) hVar.f7374l;
                    try {
                        V6.b.P(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        yVar = new y(th);
                        rVar = iVar.f7377e;
                        hVar.f7374l = th;
                        hVar.f7375m = null;
                        hVar.f7372e = 2;
                        if (w.a(yVar, rVar, th, hVar) != aVar) {
                        }
                    }
                    tVar = new r6.t(eVar, hVar.getContext());
                    rVar2 = iVar.f7377e;
                    hVar.f7374l = tVar;
                    hVar.f7375m = null;
                    hVar.f7372e = 3;
                    if (rVar2.invoke(tVar, null, hVar) != aVar) {
                        tVar2 = tVar;
                        tVar2.releaseIntercepted();
                        return Unit.f6114a;
                    }
                    return aVar;
                }
            }
            rVar2 = iVar.f7377e;
            hVar.f7374l = tVar;
            hVar.f7375m = null;
            hVar.f7372e = 3;
            if (rVar2.invoke(tVar, null, hVar) != aVar) {
            }
            return aVar;
        } catch (Throwable th6) {
            th = th6;
            tVar2 = tVar;
            tVar2.releaseIntercepted();
            throw th;
        }
        hVar = new h(this, bVar);
        Object obj2 = hVar.f7371d;
        aVar = W5.a.f2787d;
        i2 = hVar.f7372e;
        if (i2 != 0) {
        }
        tVar = new r6.t(eVar, hVar.getContext());
    }
}

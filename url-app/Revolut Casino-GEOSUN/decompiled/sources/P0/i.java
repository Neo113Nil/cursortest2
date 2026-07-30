package P0;

import D.C0017s;
import u0.C0247g;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A.j f786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0017s f787f;

    public i(A.j jVar, C0017s c0017s) {
        this.f786e = jVar;
        this.f787f = c0017s;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // P0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(e eVar, w0.d dVar) {
        h hVar;
        x0.a aVar;
        int i2;
        i iVar;
        t tVar;
        C0017s c0017s;
        Q0.n nVar;
        Throwable th;
        Q0.n nVar2;
        C0017s c0017s2;
        try {
            if (dVar instanceof h) {
                hVar = (h) dVar;
                int i3 = hVar.f782i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hVar.f782i = i3 - Integer.MIN_VALUE;
                    Object obj = hVar.f781h;
                    aVar = x0.a.f3094e;
                    i2 = hVar.f782i;
                    if (i2 != 0) {
                        o.g.z(obj);
                        try {
                            A.j jVar = this.f786e;
                            hVar.f784k = this;
                            hVar.f785l = eVar;
                            hVar.f782i = 1;
                            if (jVar.d(eVar, hVar) == aVar) {
                                return aVar;
                            }
                            iVar = this;
                        } catch (Throwable th2) {
                            th = th2;
                            iVar = this;
                            tVar = new t(th);
                            c0017s = iVar.f787f;
                            hVar.f784k = th;
                            hVar.f785l = null;
                            hVar.f782i = 2;
                            if (r.a(tVar, c0017s, th, hVar) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                Throwable th3 = (Throwable) hVar.f784k;
                                o.g.z(obj);
                                throw th3;
                            }
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            nVar2 = (Q0.n) hVar.f784k;
                            try {
                                o.g.z(obj);
                                nVar2.m();
                                return C0247g.f3005a;
                            } catch (Throwable th4) {
                                th = th4;
                                nVar2.m();
                                throw th;
                            }
                        }
                        eVar = hVar.f785l;
                        iVar = (i) hVar.f784k;
                        try {
                            o.g.z(obj);
                        } catch (Throwable th5) {
                            th = th5;
                            tVar = new t(th);
                            c0017s = iVar.f787f;
                            hVar.f784k = th;
                            hVar.f785l = null;
                            hVar.f782i = 2;
                            if (r.a(tVar, c0017s, th, hVar) != aVar) {
                            }
                        }
                    }
                    w0.i iVar2 = hVar.f3098f;
                    F0.i.b(iVar2);
                    nVar = new Q0.n(eVar, iVar2);
                    c0017s2 = iVar.f787f;
                    hVar.f784k = nVar;
                    hVar.f785l = null;
                    hVar.f782i = 3;
                    if (c0017s2.n(nVar, null, hVar) != aVar) {
                        return aVar;
                    }
                    nVar2 = nVar;
                    nVar2.m();
                    return C0247g.f3005a;
                }
            }
            c0017s2 = iVar.f787f;
            hVar.f784k = nVar;
            hVar.f785l = null;
            hVar.f782i = 3;
            if (c0017s2.n(nVar, null, hVar) != aVar) {
            }
        } catch (Throwable th6) {
            th = th6;
            nVar2 = nVar;
            nVar2.m();
            throw th;
        }
        hVar = new h(this, dVar);
        Object obj2 = hVar.f781h;
        aVar = x0.a.f3094e;
        i2 = hVar.f782i;
        if (i2 != 0) {
        }
        w0.i iVar22 = hVar.f3098f;
        F0.i.b(iVar22);
        nVar = new Q0.n(eVar, iVar22);
    }
}

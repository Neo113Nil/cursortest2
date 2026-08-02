package b1;

import I.C0083s;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B.m f1923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0083s f1924f;

    public i(B.m mVar, C0083s c0083s) {
        this.f1923e = mVar;
        this.f1924f = c0083s;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // b1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(e eVar, H0.d dVar) {
        h hVar;
        I0.a aVar;
        int i2;
        i iVar;
        s sVar;
        C0083s c0083s;
        c1.n nVar;
        Throwable th;
        c1.n nVar2;
        C0083s c0083s2;
        try {
            if (dVar instanceof h) {
                hVar = (h) dVar;
                int i3 = hVar.f1919i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hVar.f1919i = i3 - Integer.MIN_VALUE;
                    Object obj = hVar.f1918h;
                    aVar = I0.a.f733e;
                    i2 = hVar.f1919i;
                    if (i2 != 0) {
                        i1.a.G(obj);
                        try {
                            B.m mVar = this.f1923e;
                            hVar.f1921k = this;
                            hVar.f1922l = eVar;
                            hVar.f1919i = 1;
                            if (mVar.k(eVar, hVar) == aVar) {
                                return aVar;
                            }
                            iVar = this;
                        } catch (Throwable th2) {
                            th = th2;
                            iVar = this;
                            sVar = new s(th);
                            c0083s = iVar.f1924f;
                            hVar.f1921k = th;
                            hVar.f1922l = null;
                            hVar.f1919i = 2;
                            if (q.a(sVar, c0083s, th, hVar) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                Throwable th3 = (Throwable) hVar.f1921k;
                                i1.a.G(obj);
                                throw th3;
                            }
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            nVar2 = (c1.n) hVar.f1921k;
                            try {
                                i1.a.G(obj);
                                nVar2.m();
                                return F0.h.f469a;
                            } catch (Throwable th4) {
                                th = th4;
                                nVar2.m();
                                throw th;
                            }
                        }
                        eVar = hVar.f1922l;
                        iVar = (i) hVar.f1921k;
                        try {
                            i1.a.G(obj);
                        } catch (Throwable th5) {
                            th = th5;
                            sVar = new s(th);
                            c0083s = iVar.f1924f;
                            hVar.f1921k = th;
                            hVar.f1922l = null;
                            hVar.f1919i = 2;
                            if (q.a(sVar, c0083s, th, hVar) != aVar) {
                            }
                        }
                    }
                    H0.i iVar2 = hVar.f737f;
                    Q0.h.b(iVar2);
                    nVar = new c1.n(eVar, iVar2);
                    c0083s2 = iVar.f1924f;
                    hVar.f1921k = nVar;
                    hVar.f1922l = null;
                    hVar.f1919i = 3;
                    if (c0083s2.p(nVar, null, hVar) != aVar) {
                        return aVar;
                    }
                    nVar2 = nVar;
                    nVar2.m();
                    return F0.h.f469a;
                }
            }
            c0083s2 = iVar.f1924f;
            hVar.f1921k = nVar;
            hVar.f1922l = null;
            hVar.f1919i = 3;
            if (c0083s2.p(nVar, null, hVar) != aVar) {
            }
        } catch (Throwable th6) {
            th = th6;
            nVar2 = nVar;
            nVar2.m();
            throw th;
        }
        hVar = new h(this, dVar);
        Object obj2 = hVar.f1918h;
        aVar = I0.a.f733e;
        i2 = hVar.f1919i;
        if (i2 != 0) {
        }
        H0.i iVar22 = hVar.f737f;
        Q0.h.b(iVar22);
        nVar = new c1.n(eVar, iVar22);
    }
}

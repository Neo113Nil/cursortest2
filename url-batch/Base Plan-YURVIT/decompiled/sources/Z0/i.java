package Z0;

import B0.E;
import F.C0036s;
import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E f1095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0036s f1096f;

    public i(E e2, C0036s c0036s) {
        this.f1095e = e2;
        this.f1096f = c0036s;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // Z0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(e eVar, G0.d dVar) {
        h hVar;
        int i2;
        H0.a aVar;
        i iVar;
        s sVar;
        C0036s c0036s;
        a1.n nVar;
        Throwable th;
        a1.n nVar2;
        C0036s c0036s2;
        try {
            if (dVar instanceof h) {
                hVar = (h) dVar;
                int i3 = hVar.f1091i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hVar.f1091i = i3 - Integer.MIN_VALUE;
                    Object obj = hVar.f1090h;
                    i2 = hVar.f1091i;
                    aVar = H0.a.f511e;
                    if (i2 != 0) {
                        AbstractC0086a.I(obj);
                        try {
                            E e2 = this.f1095e;
                            hVar.f1093k = this;
                            hVar.f1094l = eVar;
                            hVar.f1091i = 1;
                            if (e2.m(eVar, hVar) != aVar) {
                                iVar = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            iVar = this;
                            sVar = new s(th);
                            c0036s = iVar.f1096f;
                            hVar.f1093k = th;
                            hVar.f1094l = null;
                            hVar.f1091i = 2;
                            if (q.a(sVar, c0036s, th, hVar) != aVar) {
                                return aVar;
                            }
                            throw th;
                        }
                        return aVar;
                    }
                    if (i2 != 1) {
                        if (i2 == 2) {
                            Throwable th3 = (Throwable) hVar.f1093k;
                            AbstractC0086a.I(obj);
                            throw th3;
                        }
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nVar2 = (a1.n) hVar.f1093k;
                        try {
                            AbstractC0086a.I(obj);
                            nVar2.o();
                            return D0.h.f206a;
                        } catch (Throwable th4) {
                            th = th4;
                            nVar2.o();
                            throw th;
                        }
                    }
                    eVar = hVar.f1094l;
                    iVar = (i) hVar.f1093k;
                    try {
                        AbstractC0086a.I(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        sVar = new s(th);
                        c0036s = iVar.f1096f;
                        hVar.f1093k = th;
                        hVar.f1094l = null;
                        hVar.f1091i = 2;
                        if (q.a(sVar, c0036s, th, hVar) != aVar) {
                        }
                    }
                    G0.i iVar2 = hVar.f527f;
                    P0.h.b(iVar2);
                    nVar = new a1.n(eVar, iVar2);
                    c0036s2 = iVar.f1096f;
                    hVar.f1093k = nVar;
                    hVar.f1094l = null;
                    hVar.f1091i = 3;
                    if (c0036s2.k(nVar, null, hVar) != aVar) {
                        nVar2 = nVar;
                        nVar2.o();
                        return D0.h.f206a;
                    }
                    return aVar;
                }
            }
            c0036s2 = iVar.f1096f;
            hVar.f1093k = nVar;
            hVar.f1094l = null;
            hVar.f1091i = 3;
            if (c0036s2.k(nVar, null, hVar) != aVar) {
            }
            return aVar;
        } catch (Throwable th6) {
            th = th6;
            nVar2 = nVar;
            nVar2.o();
            throw th;
        }
        hVar = new h(this, dVar);
        Object obj2 = hVar.f1090h;
        i2 = hVar.f1091i;
        aVar = H0.a.f511e;
        if (i2 != 0) {
        }
        G0.i iVar22 = hVar.f527f;
        P0.h.b(iVar22);
        nVar = new a1.n(eVar, iVar22);
    }
}

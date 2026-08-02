package a1;

import D0.P;
import Y0.C0112f;
import Y0.C0125t;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1326a = new h();

    public static b a(int i2, int i3, int i4) {
        b mVar;
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if (i2 != -2) {
            if (i2 == -1) {
                if (i3 == 1) {
                    return new m(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i2 != 0) {
                return i2 != Integer.MAX_VALUE ? i3 == 1 ? new b(i2, null) : new m(i2, i3, null) : new b(Integer.MAX_VALUE, null);
            }
            mVar = i3 == 1 ? new b(0, null) : new m(1, i3, null);
        } else if (i3 == 1) {
            f.f1324d.getClass();
            mVar = new b(e.f1323b, null);
        } else {
            mVar = new m(1, i3, null);
        }
        return mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v5, types: [P0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(p pVar, K.b bVar, J0.b bVar2) {
        n nVar;
        int i2;
        try {
            if (bVar2 instanceof n) {
                nVar = (n) bVar2;
                int i3 = nVar.f1332j;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    nVar.f1332j = i3 - Integer.MIN_VALUE;
                    Object obj = nVar.f1331i;
                    I0.a aVar = I0.a.f733e;
                    i2 = nVar.f1332j;
                    if (i2 != 0) {
                        i1.a.G(obj);
                        H0.i iVar = nVar.f737f;
                        Q0.h.b(iVar);
                        if (iVar.k(C0125t.f1230f) != pVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        nVar.f1330h = bVar;
                        nVar.f1332j = 1;
                        C0112f c0112f = new C0112f(1, i1.a.t(nVar));
                        c0112f.v();
                        ((o) pVar).X(new P(3, c0112f));
                        bVar = bVar;
                        if (c0112f.u() == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = nVar.f1330h;
                        i1.a.G(obj);
                        bVar = r5;
                    }
                    bVar.g();
                    return F0.h.f469a;
                }
            }
            if (i2 != 0) {
            }
            bVar.g();
            return F0.h.f469a;
        } catch (Throwable th) {
            bVar.g();
            throw th;
        }
        nVar = new n(bVar2);
        Object obj2 = nVar.f1331i;
        I0.a aVar2 = I0.a.f733e;
        i2 = nVar.f1332j;
    }
}

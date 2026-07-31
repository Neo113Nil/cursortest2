package Y0;

import F.L;
import W0.C0066f;
import W0.C0079t;
import a.AbstractC0086a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1042a = new h();

    public static b a(int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if (i2 == -2) {
            if (i3 != 1) {
                return new m(1, i3);
            }
            f.f1040d.getClass();
            return new b(e.f1039b);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? i3 == 1 ? new b(i2) : new m(i2, i3) : new b(Integer.MAX_VALUE) : i3 == 1 ? new b(0) : new m(1, i3);
        }
        if (i3 == 1) {
            return new m(1, 2);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(p pVar, H.b bVar, I0.b bVar2) {
        n nVar;
        int i2;
        try {
            if (bVar2 instanceof n) {
                nVar = (n) bVar2;
                int i3 = nVar.f1048j;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    nVar.f1048j = i3 - Integer.MIN_VALUE;
                    Object obj = nVar.f1047i;
                    i2 = nVar.f1048j;
                    if (i2 != 0) {
                        AbstractC0086a.I(obj);
                        G0.i iVar = nVar.f527f;
                        P0.h.b(iVar);
                        if (iVar.m(C0079t.f974f) != pVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        nVar.f1046h = bVar;
                        nVar.f1048j = 1;
                        C0066f c0066f = new C0066f(1, AbstractC0086a.v(nVar));
                        c0066f.u();
                        ((o) pVar).W(new L(1, c0066f));
                        Object t = c0066f.t();
                        H0.a aVar = H0.a.f511e;
                        if (t == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = nVar.f1046h;
                        AbstractC0086a.I(obj);
                    }
                    bVar.h();
                    return D0.h.f206a;
                }
            }
            if (i2 != 0) {
            }
            bVar.h();
            return D0.h.f206a;
        } catch (Throwable th) {
            bVar.h();
            throw th;
        }
        nVar = new n(bVar2);
        Object obj2 = nVar.f1047i;
        i2 = nVar.f1048j;
    }
}

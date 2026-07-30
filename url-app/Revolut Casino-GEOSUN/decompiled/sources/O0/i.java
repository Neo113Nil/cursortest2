package O0;

import D.M;
import M0.C0048f;
import M0.C0061t;
import u0.C0247g;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f742a = new h();

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
            f.f740b.getClass();
            mVar = new b(e.f739b, null);
        } else {
            mVar = new m(1, i3, null);
        }
        return mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v5, types: [E0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(p pVar, F.b bVar, y0.b bVar2) {
        n nVar;
        int i2;
        try {
            if (bVar2 instanceof n) {
                nVar = (n) bVar2;
                int i3 = nVar.f748j;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    nVar.f748j = i3 - Integer.MIN_VALUE;
                    Object obj = nVar.f747i;
                    x0.a aVar = x0.a.f3094e;
                    i2 = nVar.f748j;
                    if (i2 != 0) {
                        o.g.z(obj);
                        w0.i iVar = nVar.f3098f;
                        F0.i.b(iVar);
                        if (iVar.f(C0061t.f687f) != pVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        nVar.f746h = bVar;
                        nVar.f748j = 1;
                        C0048f c0048f = new C0048f(1, o.g.r(nVar));
                        c0048f.t();
                        ((o) pVar).V(new M(1, c0048f));
                        bVar = bVar;
                        if (c0048f.s() == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = nVar.f746h;
                        o.g.z(obj);
                        bVar = r5;
                    }
                    bVar.d();
                    return C0247g.f3005a;
                }
            }
            if (i2 != 0) {
            }
            bVar.d();
            return C0247g.f3005a;
        } catch (Throwable th) {
            bVar.d();
            throw th;
        }
        nVar = new n(bVar2);
        Object obj2 = nVar.f747i;
        x0.a aVar2 = x0.a.f3094e;
        i2 = nVar.f748j;
    }
}

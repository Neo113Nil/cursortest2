package E;

import I.C0143d;
import I.C0156j0;
import I.W;
import a0.C0238c;
import m.AbstractC0620e;
import m.C0619d;
import q2.AbstractC0837y;
import q2.C0827n;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public C0238c f980a;

    /* renamed from: b, reason: collision with root package name */
    public final float f981b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f982c;

    /* renamed from: d, reason: collision with root package name */
    public Float f983d;

    /* renamed from: e, reason: collision with root package name */
    public C0238c f984e;

    /* renamed from: f, reason: collision with root package name */
    public final C0619d f985f = AbstractC0620e.a();

    /* renamed from: g, reason: collision with root package name */
    public final C0619d f986g = AbstractC0620e.a();

    /* renamed from: h, reason: collision with root package name */
    public final C0619d f987h = AbstractC0620e.a();

    /* renamed from: i, reason: collision with root package name */
    public final C0827n f988i;

    /* renamed from: j, reason: collision with root package name */
    public final C0156j0 f989j;

    /* renamed from: k, reason: collision with root package name */
    public final C0156j0 f990k;

    public p(C0238c c0238c, float f3, boolean z3) {
        this.f980a = c0238c;
        this.f981b = f3;
        this.f982c = z3;
        C0827n c0827n = new C0827n(true);
        c0827n.S(null);
        this.f988i = c0827n;
        Boolean bool = Boolean.FALSE;
        W w2 = W.f2783i;
        this.f989j = C0143d.K(bool, w2);
        this.f990k = C0143d.K(bool, w2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(X1.c cVar) {
        i iVar;
        W1.a aVar;
        int i3;
        R1.y yVar;
        p pVar;
        Object e3;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i4 = iVar.f967j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iVar.f967j = i4 - Integer.MIN_VALUE;
                Object obj = iVar.f965h;
                aVar = W1.a.f4608d;
                i3 = iVar.f967j;
                yVar = R1.y.f4171a;
                if (i3 != 0) {
                    R1.a.e(obj);
                    iVar.f964g = this;
                    iVar.f967j = 1;
                    Object e4 = AbstractC0837y.e(new m(this, null), iVar);
                    if (e4 != aVar) {
                        e4 = yVar;
                    }
                    if (e4 == aVar) {
                        return aVar;
                    }
                    pVar = this;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                R1.a.e(obj);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pVar = iVar.f964g;
                        R1.a.e(obj);
                        iVar.f964g = null;
                        iVar.f967j = 3;
                        pVar.getClass();
                        e3 = AbstractC0837y.e(new o(pVar, null), iVar);
                        if (e3 != aVar) {
                            e3 = yVar;
                        }
                        return e3 == aVar ? aVar : yVar;
                    }
                    pVar = iVar.f964g;
                    R1.a.e(obj);
                }
                pVar.f989j.setValue(Boolean.TRUE);
                iVar.f964g = pVar;
                iVar.f967j = 2;
                if (pVar.f988i.i0(iVar) == aVar) {
                    return aVar;
                }
                iVar.f964g = null;
                iVar.f967j = 3;
                pVar.getClass();
                e3 = AbstractC0837y.e(new o(pVar, null), iVar);
                if (e3 != aVar) {
                }
                if (e3 == aVar) {
                }
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.f965h;
        aVar = W1.a.f4608d;
        i3 = iVar.f967j;
        yVar = R1.y.f4171a;
        if (i3 != 0) {
        }
        pVar.f989j.setValue(Boolean.TRUE);
        iVar.f964g = pVar;
        iVar.f967j = 2;
        if (pVar.f988i.i0(iVar) == aVar) {
        }
        iVar.f964g = null;
        iVar.f967j = 3;
        pVar.getClass();
        e3 = AbstractC0837y.e(new o(pVar, null), iVar);
        if (e3 != aVar) {
        }
        if (e3 == aVar) {
        }
    }
}

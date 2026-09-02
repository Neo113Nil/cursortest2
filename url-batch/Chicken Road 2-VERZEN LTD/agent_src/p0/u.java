package p0;

import k0.AbstractC0042a;
import k0.C0052k;

/* loaded from: classes.dex */
public class u extends AbstractC0042a implements Y.c {

    /* renamed from: e, reason: collision with root package name */
    public final Y.f f1169e;

    public u(W.i iVar, Y.f fVar) {
        super(iVar, true);
        this.f1169e = fVar;
    }

    @Override // Y.c
    public final Y.c g() {
        Y.f fVar = this.f1169e;
        if (fVar != null) {
            return fVar;
        }
        return null;
    }

    @Override // k0.T
    public final void m(Object obj) {
        W.d o2 = a.a.o(this.f1169e);
        if (obj instanceof C0052k) {
            obj = a.a.h(((C0052k) obj).f872a);
        }
        AbstractC0090a.i(o2, obj, null);
    }

    @Override // k0.T
    public final void n(Object obj) {
        Y.f fVar = this.f1169e;
        if (obj instanceof C0052k) {
            obj = a.a.h(((C0052k) obj).f872a);
        }
        fVar.d(obj);
    }
}

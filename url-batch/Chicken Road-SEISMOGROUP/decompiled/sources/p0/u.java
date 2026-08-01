package p0;

import a.AbstractC0016a;
import k0.AbstractC0040a;
import k0.C0050k;

/* loaded from: classes.dex */
public class u extends AbstractC0040a implements Y.c {

    /* renamed from: e, reason: collision with root package name */
    public final Y.f f1177e;

    public u(W.i iVar, Y.f fVar) {
        super(iVar, true);
        this.f1177e = fVar;
    }

    @Override // Y.c
    public final Y.c g() {
        Y.f fVar = this.f1177e;
        if (fVar != null) {
            return fVar;
        }
        return null;
    }

    @Override // k0.T
    public final void m(Object obj) {
        W.d t = AbstractC0016a.t(this.f1177e);
        if (obj instanceof C0050k) {
            obj = AbstractC0016a.h(((C0050k) obj).f925a);
        }
        AbstractC0084a.i(t, obj, null);
    }

    @Override // k0.T
    public final void n(Object obj) {
        Y.f fVar = this.f1177e;
        if (obj instanceof C0050k) {
            obj = AbstractC0016a.h(((C0050k) obj).f925a);
        }
        fVar.d(obj);
    }
}

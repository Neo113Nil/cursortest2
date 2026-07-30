package M0;

import u0.C0247g;

/* loaded from: classes.dex */
public final class D implements c0, E0.l {

    /* renamed from: e, reason: collision with root package name */
    public final C f618e;

    public D(C c2) {
        this.f618e = c2;
    }

    public final void a(Throwable th) {
        this.f618e.a();
    }

    @Override // E0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        a((Throwable) obj);
        return C0247g.f3005a;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f618e + ']';
    }
}

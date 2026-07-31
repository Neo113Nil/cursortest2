package W0;

/* loaded from: classes.dex */
public final class D implements c0, O0.l {

    /* renamed from: e, reason: collision with root package name */
    public final C f907e;

    public D(C c2) {
        this.f907e = c2;
    }

    public final void a(Throwable th) {
        this.f907e.b();
    }

    @Override // O0.l
    public final /* bridge */ /* synthetic */ Object j(Object obj) {
        a((Throwable) obj);
        return D0.h.f206a;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f907e + ']';
    }
}

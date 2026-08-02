package Y0;

/* loaded from: classes.dex */
public final class D implements c0, P0.l {

    /* renamed from: e, reason: collision with root package name */
    public final C f1161e;

    public D(C c2) {
        this.f1161e = c2;
    }

    public final void a(Throwable th) {
        this.f1161e.a();
    }

    @Override // P0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        a((Throwable) obj);
        return F0.h.f469a;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f1161e + ']';
    }
}

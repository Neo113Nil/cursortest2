package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0511t {

    /* renamed from: n, reason: collision with root package name */
    public final M f5256n;

    public SavedStateHandleAttacher(M m8) {
        this.f5256n = m8;
    }

    @Override // androidx.lifecycle.InterfaceC0511t
    public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
        if (enumC0506n == EnumC0506n.ON_CREATE) {
            interfaceC0513v.getLifecycle().b(this);
            this.f5256n.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0506n).toString());
        }
    }
}

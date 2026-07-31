package androidx.lifecycle;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class N implements InterfaceC0234t, Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final String f3983d;

    /* renamed from: e, reason: collision with root package name */
    public final M f3984e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3985f;

    public N(String str, M m3) {
        this.f3983d = str;
        this.f3984e = m3;
    }

    @Override // androidx.lifecycle.InterfaceC0234t
    public final void b(InterfaceC0236v interfaceC0236v, EnumC0229n enumC0229n) {
        if (enumC0229n == EnumC0229n.ON_DESTROY) {
            this.f3985f = false;
            interfaceC0236v.e().f(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void i(C0238x c0238x, u1.e eVar) {
        Z1.i.f(eVar, "registry");
        Z1.i.f(c0238x, "lifecycle");
        if (this.f3985f) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f3985f = true;
        c0238x.a(this);
        eVar.c(this.f3983d, this.f3984e.f3982e);
    }
}

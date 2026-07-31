package androidx.lifecycle;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class N implements InterfaceC0290t, Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final String f5184d;

    /* renamed from: e, reason: collision with root package name */
    public final M f5185e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5186f;

    public N(String str, M m3) {
        this.f5184d = str;
        this.f5185e = m3;
    }

    @Override // androidx.lifecycle.InterfaceC0290t
    public final void b(InterfaceC0292v interfaceC0292v, EnumC0285n enumC0285n) {
        if (enumC0285n == EnumC0285n.ON_DESTROY) {
            this.f5186f = false;
            interfaceC0292v.e().f(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void g(C0294x c0294x, y1.e eVar) {
        f2.j.f(eVar, "registry");
        f2.j.f(c0294x, "lifecycle");
        if (this.f5186f) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f5186f = true;
        c0294x.a(this);
        eVar.c(this.f5184d, this.f5185e.f5183e);
    }
}

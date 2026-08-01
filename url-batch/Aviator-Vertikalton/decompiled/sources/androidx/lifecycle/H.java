package androidx.lifecycle;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class H implements r, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f1450a;

    /* renamed from: b, reason: collision with root package name */
    public final G f1451b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1452c;

    public H(String str, G g2) {
        this.f1450a = str;
        this.f1451b = g2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.r
    public final void g(InterfaceC0086t interfaceC0086t, EnumC0080m enumC0080m) {
        if (enumC0080m == EnumC0080m.ON_DESTROY) {
            this.f1452c = false;
            interfaceC0086t.getLifecycle().b(this);
        }
    }

    public final void h(g0.d dVar, AbstractC0082o abstractC0082o) {
        X0.f.e(dVar, "registry");
        X0.f.e(abstractC0082o, "lifecycle");
        if (this.f1452c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1452c = true;
        abstractC0082o.a(this);
        dVar.c(this.f1450a, this.f1451b.f1449e);
    }
}

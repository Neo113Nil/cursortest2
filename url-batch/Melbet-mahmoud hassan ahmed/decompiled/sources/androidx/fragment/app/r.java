package androidx.fragment.app;

import androidx.lifecycle.e;

/* loaded from: classes.dex */
class r implements androidx.lifecycle.i {

    /* renamed from: f, reason: collision with root package name */
    private androidx.lifecycle.j f854f = null;

    r() {
    }

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.e a() {
        c();
        return this.f854f;
    }

    void b(e.b bVar) {
        this.f854f.h(bVar);
    }

    void c() {
        if (this.f854f == null) {
            this.f854f = new androidx.lifecycle.j(this);
        }
    }

    boolean d() {
        return this.f854f != null;
    }
}

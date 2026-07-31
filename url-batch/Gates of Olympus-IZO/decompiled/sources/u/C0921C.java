package u;

import I.C0089d;
import I.C0096g0;
import I.C0102j0;
import I.X;

/* renamed from: u.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0921C {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7999a;

    /* renamed from: b, reason: collision with root package name */
    public final C0922D f8000b;

    /* renamed from: c, reason: collision with root package name */
    public final C0096g0 f8001c = C0089d.I(-1);

    /* renamed from: d, reason: collision with root package name */
    public final C0096g0 f8002d = C0089d.I(0);

    /* renamed from: e, reason: collision with root package name */
    public final C0102j0 f8003e;

    /* renamed from: f, reason: collision with root package name */
    public final C0102j0 f8004f;

    public C0921C(Object obj, C0922D c0922d) {
        this.f7999a = obj;
        this.f8000b = c0922d;
        X x3 = X.f2228i;
        this.f8003e = C0089d.J(null, x3);
        this.f8004f = C0089d.J(null, x3);
    }

    public final C0921C a() {
        C0096g0 c0096g0 = this.f8002d;
        if (c0096g0.g() == 0) {
            this.f8000b.f8005d.add(this);
            C0921C c0921c = (C0921C) this.f8004f.getValue();
            if (c0921c != null) {
                c0921c.a();
            } else {
                c0921c = null;
            }
            this.f8003e.setValue(c0921c);
        }
        c0096g0.h(c0096g0.g() + 1);
        return this;
    }

    public final void b() {
        C0096g0 c0096g0 = this.f8002d;
        if (c0096g0.g() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        c0096g0.h(c0096g0.g() - 1);
        if (c0096g0.g() == 0) {
            this.f8000b.f8005d.remove(this);
            C0102j0 c0102j0 = this.f8003e;
            C0921C c0921c = (C0921C) c0102j0.getValue();
            if (c0921c != null) {
                c0921c.b();
            }
            c0102j0.setValue(null);
        }
    }
}

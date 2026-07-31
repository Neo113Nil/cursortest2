package c;

import a7.h1;
import a7.u;
import a7.x;
import b.o;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public final o f1541b;

    /* renamed from: c, reason: collision with root package name */
    public final u f1542c;

    /* renamed from: e, reason: collision with root package name */
    public c7.c f1544e;

    /* renamed from: f, reason: collision with root package name */
    public h1 f1545f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1546g;

    /* renamed from: a, reason: collision with root package name */
    public final b.u f1540a = new b.u(1, this);

    /* renamed from: d, reason: collision with root package name */
    public p6.e f1543d = new b(2, 0, null);

    public d(u uVar, g gVar) {
        this.f1541b = new o(this, gVar);
        this.f1542c = uVar;
    }

    public final boolean a() {
        return this.f1540a.f1022b && this.f1541b.f1009b;
    }

    public final void b() {
        c7.c cVar = this.f1544e;
        if (cVar != null) {
            cVar.f(new CancellationException("onBack cancelled"), true);
        }
        h1 h1Var = this.f1545f;
        if (h1Var != null) {
            h1Var.a(null);
        }
        this.f1544e = null;
        this.f1545f = null;
        this.f1546g = false;
    }

    public final void c() {
        if (this.f1544e != null && !this.f1546g) {
            b();
        }
        g6.c cVar = null;
        if (this.f1544e == null) {
            this.f1546g = false;
            this.f1544e = c7.j.a(-2, c7.a.f1760d, 4);
            this.f1545f = x.n(this.f1542c, null, new b0.d(this, cVar, 1), 3);
        }
        c7.c cVar2 = this.f1544e;
        if (cVar2 != null) {
            cVar2.f(null, false);
        }
        this.f1546g = false;
    }

    public final void d() {
        b();
        if (a()) {
            this.f1546g = true;
            this.f1544e = c7.j.a(-2, c7.a.f1760d, 4);
            this.f1545f = x.n(this.f1542c, null, new b0.d(this, (g6.c) null, 1), 3);
        }
    }

    public final void e(boolean z3) {
        h1 h1Var;
        if (!z3 && a() && (h1Var = this.f1545f) != null && !h1Var.b()) {
            b();
        }
        this.f1540a.d(z3);
        this.f1541b.c(z3);
    }
}

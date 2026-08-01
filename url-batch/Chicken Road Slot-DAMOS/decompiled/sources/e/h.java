package e;

import a3.t;
import d.d0;
import d2.j0;
import ge.a0;
import ge.r1;
import ge.x;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends d2.b {

    /* renamed from: c, reason: collision with root package name */
    public final x f3747c;

    /* renamed from: d, reason: collision with root package name */
    public Function2 f3748d;

    /* renamed from: e, reason: collision with root package name */
    public ie.c f3749e;

    /* renamed from: f, reason: collision with root package name */
    public r1 f3750f;
    public boolean g;

    public h(x xVar, j jVar) {
        super(jVar);
        this.f3747c = xVar;
        this.f3748d = new j0(2, 1, null);
    }

    @Override // d2.b
    public final void e() {
        ie.c cVar = this.f3749e;
        if (cVar != null) {
            cVar.h(new CancellationException("onBack cancelled"), true);
        }
        r1 r1Var = this.f3750f;
        if (r1Var != null) {
            r1Var.a(null);
        }
        this.f3749e = null;
        this.f3750f = null;
        this.g = false;
    }

    @Override // d2.b
    public final void f() {
        if (this.f3749e != null && !this.g) {
            e();
        }
        ld.a aVar = null;
        if (this.f3749e == null) {
            this.g = false;
            this.f3749e = ie.j.a(-2, 4, ie.a.f4712d);
            this.f3750f = a0.s(this.f3747c, null, new t(this, aVar, 6), 3);
        }
        ie.c cVar = this.f3749e;
        if (cVar != null) {
            cVar.h(null, false);
        }
        this.g = false;
    }

    @Override // d2.b
    public final void g(d.a aVar) {
        ie.c cVar = this.f3749e;
        if (cVar != null) {
            cVar.b(aVar);
        }
    }

    @Override // d2.b
    public final void h() {
        e();
        if (super.d()) {
            this.g = true;
            this.f3749e = ie.j.a(-2, 4, ie.a.f4712d);
            this.f3750f = a0.s(this.f3747c, null, new t(this, (ld.a) null, 6), 3);
        }
    }

    public final void j(boolean z10) {
        r1 r1Var;
        if (!z10 && super.d() && (r1Var = this.f3750f) != null && !r1Var.d()) {
            e();
        }
        ((d0) this.f3336a).d(z10);
        ((f.a) this.f3337b).f(z10);
    }
}

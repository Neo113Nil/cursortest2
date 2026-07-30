package c;

import a0.s0;
import b.y;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends y {

    /* renamed from: d, reason: collision with root package name */
    public h7.c f1424d;

    /* renamed from: e, reason: collision with root package name */
    public q6.e f1425e;

    /* renamed from: f, reason: collision with root package name */
    public s0 f1426f;

    @Override // b.y
    public final void a() {
        s0 s0Var = this.f1426f;
        if (s0Var != null) {
            s0Var.c();
        }
        s0 s0Var2 = this.f1426f;
        if (s0Var2 == null) {
            return;
        }
        s0Var2.f136b = false;
    }

    @Override // b.y
    public final void b() {
        s0 s0Var = this.f1426f;
        if (s0Var != null && !s0Var.f136b) {
            s0Var.c();
            this.f1426f = null;
        }
        if (this.f1426f == null) {
            this.f1426f = new s0(this.f1424d, false, this.f1425e, this);
        }
        s0 s0Var2 = this.f1426f;
        if (s0Var2 != null) {
            r4.a.q((e7.e) s0Var2.f137c);
        }
        s0 s0Var3 = this.f1426f;
        if (s0Var3 == null) {
            return;
        }
        s0Var3.f136b = false;
    }

    @Override // b.y
    public final void c(b.b bVar) {
        super.c(bVar);
        s0 s0Var = this.f1426f;
        if (s0Var != null) {
            ((e7.e) s0Var.f137c).e(bVar);
        }
    }

    @Override // b.y
    public final void d(b.b bVar) {
        super.d(bVar);
        s0 s0Var = this.f1426f;
        if (s0Var != null) {
            s0Var.c();
        }
        if (this.f1220a) {
            this.f1426f = new s0(this.f1424d, true, this.f1425e, this);
        }
    }
}

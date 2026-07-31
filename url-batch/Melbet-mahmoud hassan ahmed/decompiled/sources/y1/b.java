package y1;

import g1.h0;
import o2.i0;
import r0.s1;
import w0.a0;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: d, reason: collision with root package name */
    private static final a0 f23246d = new a0();

    /* renamed from: a, reason: collision with root package name */
    final w0.l f23247a;

    /* renamed from: b, reason: collision with root package name */
    private final s1 f23248b;

    /* renamed from: c, reason: collision with root package name */
    private final i0 f23249c;

    public b(w0.l lVar, s1 s1Var, i0 i0Var) {
        this.f23247a = lVar;
        this.f23248b = s1Var;
        this.f23249c = i0Var;
    }

    @Override // y1.j
    public boolean a() {
        w0.l lVar = this.f23247a;
        return (lVar instanceof g1.h) || (lVar instanceof g1.b) || (lVar instanceof g1.e) || (lVar instanceof d1.f);
    }

    @Override // y1.j
    public boolean b(w0.m mVar) {
        return this.f23247a.e(mVar, f23246d) == 0;
    }

    @Override // y1.j
    public void c() {
        this.f23247a.b(0L, 0L);
    }

    @Override // y1.j
    public void d(w0.n nVar) {
        this.f23247a.d(nVar);
    }

    @Override // y1.j
    public boolean e() {
        w0.l lVar = this.f23247a;
        return (lVar instanceof h0) || (lVar instanceof e1.g);
    }

    @Override // y1.j
    public j f() {
        w0.l fVar;
        o2.a.f(!e());
        w0.l lVar = this.f23247a;
        if (lVar instanceof t) {
            fVar = new t(this.f23248b.f20947h, this.f23249c);
        } else if (lVar instanceof g1.h) {
            fVar = new g1.h();
        } else if (lVar instanceof g1.b) {
            fVar = new g1.b();
        } else if (lVar instanceof g1.e) {
            fVar = new g1.e();
        } else {
            if (!(lVar instanceof d1.f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f23247a.getClass().getSimpleName());
            }
            fVar = new d1.f();
        }
        return new b(fVar, this.f23248b, this.f23249c);
    }
}

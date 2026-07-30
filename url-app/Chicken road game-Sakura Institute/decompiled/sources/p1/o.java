package p1;

import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o implements h0, m {

    /* renamed from: f, reason: collision with root package name */
    public final m2.k f7068f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f7069g;

    public o(m mVar, m2.k kVar) {
        this.f7068f = kVar;
        this.f7069g = mVar;
    }

    @Override // m2.b
    public final float G(long j8) {
        return this.f7069g.G(j8);
    }

    @Override // m2.b
    public final int K(float f9) {
        return this.f7069g.K(f9);
    }

    @Override // m2.b
    public final long U(long j8) {
        return this.f7069g.U(j8);
    }

    @Override // m2.b
    public final float X(long j8) {
        return this.f7069g.X(j8);
    }

    @Override // m2.b
    public final float a() {
        return this.f7069g.a();
    }

    @Override // m2.b
    public final long g0(float f9) {
        return this.f7069g.g0(f9);
    }

    @Override // p1.m
    public final m2.k getLayoutDirection() {
        return this.f7068f;
    }

    @Override // m2.b
    public final float k0(int i7) {
        return this.f7069g.k0(i7);
    }

    @Override // m2.b
    public final float l0(float f9) {
        return this.f7069g.l0(f9);
    }

    @Override // m2.b
    public final float m() {
        return this.f7069g.m();
    }

    @Override // p1.h0
    public final g0 q(int i7, int i8, Map map, q6.c cVar) {
        if (i7 < 0) {
            i7 = 0;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if ((i7 & (-16777216)) == 0 && ((-16777216) & i8) == 0) {
            return new n(i7, i8, map);
        }
        a.a.M("Size(" + i7 + " x " + i8 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // p1.m
    public final boolean v() {
        return this.f7069g.v();
    }

    @Override // m2.b
    public final long w(float f9) {
        return this.f7069g.w(f9);
    }

    @Override // m2.b
    public final long x(long j8) {
        return this.f7069g.x(j8);
    }

    @Override // m2.b
    public final float y(float f9) {
        return this.f7069g.y(f9);
    }
}

package p1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u implements w0, h0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f7087f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f7088g;

    public u(b0 b0Var) {
        this.f7088g = b0Var;
        this.f7087f = b0Var.f7025m;
    }

    @Override // p1.h0
    public final g0 C(int i7, int i8, Map map, q6.c cVar) {
        return this.f7087f.q(i7, i8, map, cVar);
    }

    @Override // p1.w0
    public final List D(Object obj, q6.e eVar) {
        b0 b0Var = this.f7088g;
        r1.d0 d0Var = (r1.d0) b0Var.f7024l.get(obj);
        List m8 = d0Var != null ? d0Var.m() : null;
        if (m8 != null) {
            return m8;
        }
        HashMap hashMap = b0Var.f7027o;
        i0.d dVar = b0Var.f7030r;
        int i7 = dVar.f4842h;
        int i8 = b0Var.f7022j;
        if (i7 < i8) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        if (i7 == i8) {
            dVar.b(obj);
        } else {
            Object[] objArr = dVar.f4840f;
            Object obj2 = objArr[i8];
            objArr[i8] = obj;
        }
        b0Var.f7022j++;
        if (!hashMap.containsKey(obj)) {
            b0Var.f7029q.put(obj, b0Var.g(obj, eVar));
            r1.d0 d0Var2 = b0Var.f7018f;
            if (d0Var2.B.f7833c == 3) {
                d0Var2.Q(true);
            } else {
                r1.d0.R(d0Var2, true, 6);
            }
        }
        r1.d0 d0Var3 = (r1.d0) hashMap.get(obj);
        if (d0Var3 == null) {
            return e6.u.f2826f;
        }
        List p02 = d0Var3.B.f7848r.p0();
        i0.a aVar = (i0.a) p02;
        int i9 = aVar.f4834f.f4842h;
        for (int i10 = 0; i10 < i9; i10++) {
            ((r1.j0) aVar.get(i10)).K.f7832b = true;
        }
        return p02;
    }

    @Override // m2.b
    public final float G(long j8) {
        return this.f7087f.G(j8);
    }

    @Override // m2.b
    public final int K(float f9) {
        return this.f7087f.K(f9);
    }

    @Override // m2.b
    public final long U(long j8) {
        return this.f7087f.U(j8);
    }

    @Override // m2.b
    public final float X(long j8) {
        return this.f7087f.X(j8);
    }

    @Override // m2.b
    public final float a() {
        return this.f7087f.f7103g;
    }

    @Override // m2.b
    public final long g0(float f9) {
        return this.f7087f.g0(f9);
    }

    @Override // p1.m
    public final m2.k getLayoutDirection() {
        return this.f7087f.f7102f;
    }

    @Override // m2.b
    public final float k0(int i7) {
        return this.f7087f.k0(i7);
    }

    @Override // m2.b
    public final float l0(float f9) {
        return f9 / this.f7087f.a();
    }

    @Override // m2.b
    public final float m() {
        return this.f7087f.f7104h;
    }

    @Override // p1.h0
    public final g0 q(int i7, int i8, Map map, q6.c cVar) {
        return this.f7087f.q(i7, i8, map, cVar);
    }

    @Override // p1.m
    public final boolean v() {
        return this.f7087f.v();
    }

    @Override // m2.b
    public final long w(float f9) {
        return this.f7087f.w(f9);
    }

    @Override // m2.b
    public final long x(long j8) {
        return this.f7087f.x(j8);
    }

    @Override // m2.b
    public final float y(float f9) {
        return this.f7087f.a() * f9;
    }
}

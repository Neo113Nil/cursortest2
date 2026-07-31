package u1;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s implements x0, g0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f7264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f7265e;

    public s(a0 a0Var) {
        this.f7265e = a0Var;
        this.f7264d = a0Var.f7175k;
    }

    @Override // r2.c
    public final float E(long j7) {
        return this.f7264d.E(j7);
    }

    @Override // r2.c
    public final int H(float f6) {
        return this.f7264d.H(f6);
    }

    @Override // u1.g0
    public final f0 J(int i, int i8, Map map, p6.c cVar, p6.c cVar2) {
        return this.f7264d.J(i, i8, map, cVar, cVar2);
    }

    @Override // r2.c
    public final long O(long j7) {
        return this.f7264d.O(j7);
    }

    @Override // r2.c
    public final float R(long j7) {
        return this.f7264d.R(j7);
    }

    @Override // r2.c
    public final long V(float f6) {
        return this.f7264d.V(f6);
    }

    @Override // r2.c
    public final float a0(int i) {
        return this.f7264d.a0(i);
    }

    @Override // r2.c
    public final float b() {
        return this.f7264d.f7283e;
    }

    @Override // r2.c
    public final float c0(float f6) {
        return f6 / this.f7264d.b();
    }

    @Override // u1.g0
    public final f0 e0(int i, int i8, Map map, p6.c cVar) {
        return this.f7264d.J(i, i8, map, null, cVar);
    }

    @Override // u1.g0
    public final r2.l getLayoutDirection() {
        return this.f7264d.f7282d;
    }

    @Override // r2.c
    public final float i() {
        return this.f7264d.f7284f;
    }

    @Override // u1.g0
    public final boolean p() {
        return this.f7264d.p();
    }

    @Override // r2.c
    public final long s(float f6) {
        return this.f7264d.s(f6);
    }

    @Override // r2.c
    public final float u(float f6) {
        return this.f7264d.b() * f6;
    }

    @Override // u1.x0
    public final List z(Object obj, p6.e eVar) {
        a0 a0Var = this.f7265e;
        o.j0 j0Var = a0Var.f7179o;
        o.j0 j0Var2 = a0Var.f7177m;
        w1.f0 f0Var = a0Var.f7169d;
        o.j0 j0Var3 = a0Var.f7174j;
        w1.f0 f0Var2 = (w1.f0) j0Var3.g(obj);
        if (f0Var2 != null && ((o0.b) f0Var.n()).f5572d.i(f0Var2) < a0Var.f7172g) {
            return f0Var2.G.f7700p.Z();
        }
        o0.e eVar2 = a0Var.f7180p;
        if (eVar2.f5580f < a0Var.f7173h) {
            t1.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i = eVar2.f5580f;
        int i8 = a0Var.f7173h;
        if (i == i8) {
            eVar2.b(obj);
        } else {
            Object[] objArr = eVar2.f5578d;
            Object obj2 = objArr[i8];
            objArr[i8] = obj;
        }
        a0Var.f7173h++;
        if (j0Var2.b(obj)) {
            w1.f0 f0Var3 = (w1.f0) j0Var2.g(obj);
            t tVar = f0Var3 != null ? (t) a0Var.i.g(f0Var3) : null;
            if (tVar != null && tVar.f7270d) {
                a0Var.h(f0Var3, obj, false, eVar);
            }
        } else {
            if (f0Var.G()) {
                a0Var.e();
                if (!j0Var3.c(obj)) {
                    j0Var.k(obj);
                    Object g3 = j0Var2.g(obj);
                    if (g3 == null) {
                        g3 = a0Var.i(obj);
                        if (g3 != null) {
                            int i9 = ((o0.b) f0Var.n()).f5572d.i(g3);
                            int i10 = ((o0.b) f0Var.n()).f5572d.f5580f;
                            f0Var.f7652r = true;
                            f0Var.K(i9, i10, 1);
                            f0Var.f7652r = false;
                            a0Var.f7182r++;
                        } else {
                            int i11 = ((o0.b) f0Var.n()).f5572d.f5580f;
                            w1.f0 f0Var4 = new w1.f0(2);
                            f0Var.f7652r = true;
                            f0Var.z(i11, f0Var4);
                            f0Var.f7652r = false;
                            a0Var.f7182r++;
                            g3 = f0Var4;
                        }
                        j0Var2.m(obj, g3);
                    }
                    a0Var.h((w1.f0) g3, obj, false, eVar);
                }
            }
            j0Var.m(obj, !f0Var.G() ? new y() : new z(a0Var, obj));
            if (f0Var.G.f7689d == w1.b0.f7592f) {
                f0Var.R(true);
            } else {
                w1.f0.S(f0Var, true, 6);
            }
        }
        w1.f0 f0Var5 = (w1.f0) j0Var2.g(obj);
        if (f0Var5 == null) {
            return d6.u.f2326d;
        }
        List Z = f0Var5.G.f7700p.Z();
        o0.b bVar = (o0.b) Z;
        int i12 = bVar.f5572d.f5580f;
        for (int i13 = 0; i13 < i12; i13++) {
            ((w1.w0) bVar.get(i13)).i.f7687b = true;
        }
        return Z;
    }
}

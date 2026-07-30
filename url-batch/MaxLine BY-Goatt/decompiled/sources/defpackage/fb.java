package defpackage;

import android.view.ViewGroup;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fb implements r82, xa2, a21 {
    public final boolean m;
    public final du n;
    public final boolean o;
    public final float p;
    public final zn1 q;
    public final zn1 r;
    public final ViewGroup s;
    public wa2 t;
    public final lz1 u = ij2.j(null);
    public final lz1 v = ij2.j(Boolean.TRUE);
    public long w = 0;
    public int x = -1;
    public final u y = new u(2, this);

    public fb(boolean z, float f, zn1 zn1Var, zn1 zn1Var2, ViewGroup viewGroup) {
        this.m = z;
        this.n = new du(new x30(zn1Var2, 3), z);
        this.o = z;
        this.p = f;
        this.q = zn1Var;
        this.r = zn1Var2;
        this.s = viewGroup;
    }

    @Override // defpackage.r82
    public final void c() {
        wa2 wa2Var = this.t;
        if (wa2Var != null) {
            j0();
            tt1 tt1Var = wa2Var.p;
            ya2 ya2Var = (ya2) ((LinkedHashMap) tt1Var.n).get(this);
            if (ya2Var != null) {
                ya2Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) tt1Var.n;
                ya2 ya2Var2 = (ya2) linkedHashMap.get(this);
                if (ya2Var2 != null) {
                }
                linkedHashMap.remove(this);
                wa2Var.o.add(ya2Var);
            }
        }
    }

    @Override // defpackage.r82
    public final void d() {
        wa2 wa2Var = this.t;
        if (wa2Var != null) {
            j0();
            tt1 tt1Var = wa2Var.p;
            ya2 ya2Var = (ya2) ((LinkedHashMap) tt1Var.n).get(this);
            if (ya2Var != null) {
                ya2Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) tt1Var.n;
                ya2 ya2Var2 = (ya2) linkedHashMap.get(this);
                if (ya2Var2 != null) {
                }
                linkedHashMap.remove(this);
                wa2Var.o.add(ya2Var);
            }
        }
    }

    @Override // defpackage.a21
    public final void e(k91 k91Var) {
        ns nsVar = k91Var.m;
        this.w = nsVar.f();
        float f = this.p;
        this.x = Float.isNaN(f) ? si1.b(o70.A(k91Var, this.o, nsVar.f())) : nsVar.R(f);
        long j = ((aw) this.q.getValue()).a;
        float f2 = ((qa2) this.r.getValue()).d;
        k91Var.a();
        this.n.b(k91Var, Float.isNaN(f) ? o70.A(k91Var, this.m, nsVar.f()) : k91Var.D(f), j);
        ls o = nsVar.n.o();
        ((Boolean) this.v.getValue()).booleanValue();
        ya2 ya2Var = (ya2) this.u.getValue();
        if (ya2Var != null) {
            ya2Var.e(f2, nsVar.f(), j);
            ya2Var.draw(z6.a(o));
        }
    }

    @Override // defpackage.xa2
    public final void j0() {
        this.u.setValue(null);
    }

    @Override // defpackage.r82
    public final void a() {
    }
}

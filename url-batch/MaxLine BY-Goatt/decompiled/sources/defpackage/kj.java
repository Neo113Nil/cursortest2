package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import kotlin.Unit;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kj extends xy1 implements r82 {
    public static final zd F = new zd(2);
    public int A;
    public boolean B;
    public final lz1 C;
    public final lz1 D;
    public final lz1 E;
    public m30 r;
    public final vo2 s = zm3.f(new ql2(0));
    public final lz1 t = ij2.j(null);
    public final hz1 u = new hz1(1.0f);
    public final lz1 v = ij2.j(null);
    public cj w;
    public xy1 x;
    public Function1 y;
    public q20 z;

    public kj(r01 r01Var, b72 b72Var) {
        yi yiVar = yi.a;
        this.w = yiVar;
        this.y = F;
        this.z = p20.b;
        this.A = 1;
        this.C = ij2.j(yiVar);
        this.D = ij2.j(r01Var);
        this.E = ij2.j(b72Var);
    }

    @Override // defpackage.r82
    public final void a() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.r == null) {
                oq2 a = gk2.a();
                t80 t80Var = vb0.a;
                m30 b = j8.b(f.c(a, qh1.a.r));
                this.r = b;
                Object obj = this.x;
                o30 o30Var = null;
                r82 r82Var = obj instanceof r82 ? (r82) obj : null;
                if (r82Var != null) {
                    r82Var.a();
                }
                if (this.B) {
                    q01 a2 = r01.a((r01) this.D.getValue());
                    a2.b = ((b72) this.E.getValue()).b;
                    a2.p = null;
                    a2.a().z.getClass();
                    r80 r80Var = k.a;
                    k(new aj(null));
                } else {
                    z71.H(b, null, new fj(0, o30Var, this), 3);
                }
            }
            Unit unit = Unit.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.xy1
    public final boolean b(float f) {
        this.u.i(f);
        return true;
    }

    @Override // defpackage.r82
    public final void c() {
        m30 m30Var = this.r;
        if (m30Var != null) {
            j8.m(m30Var, null);
        }
        this.r = null;
        Object obj = this.x;
        r82 r82Var = obj instanceof r82 ? (r82) obj : null;
        if (r82Var != null) {
            r82Var.c();
        }
    }

    @Override // defpackage.r82
    public final void d() {
        m30 m30Var = this.r;
        if (m30Var != null) {
            j8.m(m30Var, null);
        }
        this.r = null;
        Object obj = this.x;
        r82 r82Var = obj instanceof r82 ? (r82) obj : null;
        if (r82Var != null) {
            r82Var.d();
        }
    }

    @Override // defpackage.xy1
    public final boolean e(mo moVar) {
        this.v.setValue(moVar);
        return true;
    }

    @Override // defpackage.xy1
    public final long h() {
        xy1 xy1Var = (xy1) this.t.getValue();
        if (xy1Var != null) {
            return xy1Var.h();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.xy1
    public final void i(yd0 yd0Var) {
        ql2 ql2Var = new ql2(yd0Var.f());
        vo2 vo2Var = this.s;
        vo2Var.getClass();
        vo2Var.j(null, ql2Var);
        xy1 xy1Var = (xy1) this.t.getValue();
        if (xy1Var != null) {
            xy1Var.g(yd0Var, yd0Var.f(), this.u.h(), (mo) this.v.getValue());
        }
    }

    public final xy1 j(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            return new ee0(drawable.mutate());
        }
        y9 y9Var = new y9(((BitmapDrawable) drawable).getBitmap());
        int i = this.A;
        ko koVar = new ko(y9Var, (r8.getWidth() << 32) | (r8.getHeight() & 4294967295L));
        koVar.t = i;
        return koVar;
    }

    public final void k(cj cjVar) {
        s01 s01Var;
        cj cjVar2 = this.w;
        cj cjVar3 = (cj) this.y.invoke(cjVar);
        this.w = cjVar3;
        this.C.setValue(cjVar3);
        if (!(cjVar3 instanceof bj)) {
            if (cjVar3 instanceof zi) {
                s01Var = ((zi) cjVar3).b;
            }
            xy1 a = cjVar3.a();
            this.x = a;
            this.t.setValue(a);
            if (this.r != null || cjVar2.a() == cjVar3.a()) {
            }
            Object a2 = cjVar2.a();
            r82 r82Var = a2 instanceof r82 ? (r82) a2 : null;
            if (r82Var != null) {
                r82Var.d();
            }
            Object a3 = cjVar3.a();
            r82 r82Var2 = a3 instanceof r82 ? (r82) a3 : null;
            if (r82Var2 != null) {
                r82Var2.a();
                return;
            }
            return;
        }
        s01Var = ((bj) cjVar3).b;
        s01Var.a().g.getClass();
        xy1 a4 = cjVar3.a();
        this.x = a4;
        this.t.setValue(a4);
        if (this.r != null) {
        }
    }
}

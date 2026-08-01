package k0;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class i1 {

    /* renamed from: b, reason: collision with root package name */
    public static final m1 f2746b;

    /* renamed from: a, reason: collision with root package name */
    public final m1 f2747a;

    static {
        int i4 = Build.VERSION.SDK_INT;
        f2746b = (i4 >= 34 ? new a1() : i4 >= 30 ? new z0() : i4 >= 29 ? new y0() : new x0()).b().f2760a.a().f2760a.b().f2760a.c();
    }

    public i1(m1 m1Var) {
        this.f2747a = m1Var;
    }

    public m1 a() {
        return this.f2747a;
    }

    public m1 b() {
        return this.f2747a;
    }

    public m1 c() {
        return this.f2747a;
    }

    public h e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return o() == i1Var.o() && n() == i1Var.n() && Objects.equals(k(), i1Var.k()) && Objects.equals(i(), i1Var.i()) && Objects.equals(e(), i1Var.e());
    }

    public c0.c f(int i4) {
        return c0.c.f977e;
    }

    public c0.c g(int i4) {
        if ((i4 & 8) == 0) {
            return c0.c.f977e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public c0.c h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public c0.c i() {
        return c0.c.f977e;
    }

    public c0.c j() {
        return k();
    }

    public c0.c k() {
        return c0.c.f977e;
    }

    public c0.c l() {
        return k();
    }

    public m1 m(int i4, int i5, int i6, int i7) {
        return f2746b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public void d(View view) {
    }

    public void p(c0.c[] cVarArr) {
    }

    public void q(m1 m1Var) {
    }

    public void r(c0.c cVar) {
    }

    public void s(int i4) {
    }
}

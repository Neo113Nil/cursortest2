package L;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class x0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f585b;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f586a;

    static {
        int i = Build.VERSION.SDK_INT;
        f585b = (i >= 30 ? new q0() : i >= 29 ? new p0() : new o0()).b().f589a.a().f589a.b().f589a.c();
    }

    public x0(z0 z0Var) {
        this.f586a = z0Var;
    }

    public z0 a() {
        return this.f586a;
    }

    public z0 b() {
        return this.f586a;
    }

    public z0 c() {
        return this.f586a;
    }

    public void d(View view) {
    }

    public C0012j e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return n() == x0Var.n() && m() == x0Var.m() && Objects.equals(j(), x0Var.j()) && Objects.equals(h(), x0Var.h()) && Objects.equals(e(), x0Var.e());
    }

    public D.c f(int i) {
        return D.c.f113e;
    }

    public D.c g() {
        return j();
    }

    public D.c h() {
        return D.c.f113e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public D.c i() {
        return j();
    }

    public D.c j() {
        return D.c.f113e;
    }

    public D.c k() {
        return j();
    }

    public z0 l(int i, int i2, int i3, int i4) {
        return f585b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(D.c[] cVarArr) {
    }

    public void p(z0 z0Var) {
    }

    public void q(D.c cVar) {
    }
}

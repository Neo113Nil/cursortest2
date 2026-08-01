package K;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class x0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f532b;

    /* renamed from: a, reason: collision with root package name */
    public final z0 f533a;

    static {
        int i = Build.VERSION.SDK_INT;
        f532b = (i >= 30 ? new q0() : i >= 29 ? new p0() : new o0()).b().f536a.a().f536a.b().f536a.c();
    }

    public x0(z0 z0Var) {
        this.f533a = z0Var;
    }

    public z0 a() {
        return this.f533a;
    }

    public z0 b() {
        return this.f533a;
    }

    public z0 c() {
        return this.f533a;
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

    public C.c f(int i) {
        return C.c.f71e;
    }

    public C.c g() {
        return j();
    }

    public C.c h() {
        return C.c.f71e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public C.c i() {
        return j();
    }

    public C.c j() {
        return C.c.f71e;
    }

    public C.c k() {
        return j();
    }

    public z0 l(int i, int i2, int i3, int i4) {
        return f532b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(C.c[] cVarArr) {
    }

    public void p(z0 z0Var) {
    }

    public void q(C.c cVar) {
    }
}

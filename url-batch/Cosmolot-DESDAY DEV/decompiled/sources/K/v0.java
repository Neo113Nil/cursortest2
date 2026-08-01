package K;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class v0 {

    /* renamed from: b, reason: collision with root package name */
    public static final x0 f464b;

    /* renamed from: a, reason: collision with root package name */
    public final x0 f465a;

    static {
        int i = Build.VERSION.SDK_INT;
        f464b = (i >= 30 ? new o0() : i >= 29 ? new n0() : new m0()).b().f468a.a().f468a.b().f468a.c();
    }

    public v0(x0 x0Var) {
        this.f465a = x0Var;
    }

    public x0 a() {
        return this.f465a;
    }

    public x0 b() {
        return this.f465a;
    }

    public x0 c() {
        return this.f465a;
    }

    public void d(View view) {
    }

    public C0010j e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return n() == v0Var.n() && m() == v0Var.m() && Objects.equals(j(), v0Var.j()) && Objects.equals(h(), v0Var.h()) && Objects.equals(e(), v0Var.e());
    }

    public C.d f(int i) {
        return C.d.f147e;
    }

    public C.d g() {
        return j();
    }

    public C.d h() {
        return C.d.f147e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public C.d i() {
        return j();
    }

    public C.d j() {
        return C.d.f147e;
    }

    public C.d k() {
        return j();
    }

    public x0 l(int i, int i2, int i3, int i4) {
        return f464b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(C.d[] dVarArr) {
    }

    public void p(x0 x0Var) {
    }

    public void q(C.d dVar) {
    }
}

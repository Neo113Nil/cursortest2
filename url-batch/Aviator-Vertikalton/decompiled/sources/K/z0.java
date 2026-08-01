package K;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class z0 {

    /* renamed from: b, reason: collision with root package name */
    public static final B0 f518b;

    /* renamed from: a, reason: collision with root package name */
    public final B0 f519a;

    static {
        int i = Build.VERSION.SDK_INT;
        f518b = (i >= 30 ? new s0() : i >= 29 ? new r0() : new q0()).b().f395a.a().f395a.b().f395a.c();
    }

    public z0(B0 b02) {
        this.f519a = b02;
    }

    public B0 a() {
        return this.f519a;
    }

    public B0 b() {
        return this.f519a;
    }

    public B0 c() {
        return this.f519a;
    }

    public void d(View view) {
    }

    public C0014j e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return n() == z0Var.n() && m() == z0Var.m() && Objects.equals(j(), z0Var.j()) && Objects.equals(h(), z0Var.h()) && Objects.equals(e(), z0Var.e());
    }

    public C.d f(int i) {
        return C.d.f157e;
    }

    public C.d g() {
        return j();
    }

    public C.d h() {
        return C.d.f157e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public C.d i() {
        return j();
    }

    public C.d j() {
        return C.d.f157e;
    }

    public C.d k() {
        return j();
    }

    public B0 l(int i, int i2, int i3, int i4) {
        return f518b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(C.d[] dVarArr) {
    }

    public void p(B0 b02) {
    }

    public void q(C.d dVar) {
    }
}

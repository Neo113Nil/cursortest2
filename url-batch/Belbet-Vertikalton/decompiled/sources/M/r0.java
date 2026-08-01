package M;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f787b;

    /* renamed from: a, reason: collision with root package name */
    public final t0 f788a;

    static {
        int i = Build.VERSION.SDK_INT;
        f787b = (i >= 30 ? new k0() : i >= 29 ? new j0() : new i0()).b().f794a.a().f794a.b().f794a.c();
    }

    public r0(t0 t0Var) {
        this.f788a = t0Var;
    }

    public t0 a() {
        return this.f788a;
    }

    public t0 b() {
        return this.f788a;
    }

    public t0 c() {
        return this.f788a;
    }

    public void d(View view) {
    }

    public C0013i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return n() == r0Var.n() && m() == r0Var.m() && Objects.equals(j(), r0Var.j()) && Objects.equals(h(), r0Var.h()) && Objects.equals(e(), r0Var.e());
    }

    public E.c f(int i) {
        return E.c.e;
    }

    public E.c g() {
        return j();
    }

    public E.c h() {
        return E.c.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public E.c i() {
        return j();
    }

    public E.c j() {
        return E.c.e;
    }

    public E.c k() {
        return j();
    }

    public t0 l(int i, int i2, int i3, int i4) {
        return f787b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(E.c[] cVarArr) {
    }

    public void p(t0 t0Var) {
    }

    public void q(E.c cVar) {
    }
}

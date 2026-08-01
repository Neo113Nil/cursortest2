package K;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f505b;

    /* renamed from: a, reason: collision with root package name */
    public final w0 f506a;

    static {
        int i = Build.VERSION.SDK_INT;
        f505b = (i >= 30 ? new n0() : i >= 29 ? new m0() : new l0()).b().f509a.a().f509a.b().f509a.c();
    }

    public u0(w0 w0Var) {
        this.f506a = w0Var;
    }

    public w0 a() {
        return this.f506a;
    }

    public w0 b() {
        return this.f506a;
    }

    public w0 c() {
        return this.f506a;
    }

    public void d(View view) {
    }

    public C0009j e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return n() == u0Var.n() && m() == u0Var.m() && Objects.equals(j(), u0Var.j()) && Objects.equals(h(), u0Var.h()) && Objects.equals(e(), u0Var.e());
    }

    public C.c f(int i) {
        return C.c.f58e;
    }

    public C.c g() {
        return j();
    }

    public C.c h() {
        return C.c.f58e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public C.c i() {
        return j();
    }

    public C.c j() {
        return C.c.f58e;
    }

    public C.c k() {
        return j();
    }

    public w0 l(int i, int i2, int i3, int i4) {
        return f505b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(C.c[] cVarArr) {
    }

    public void p(w0 w0Var) {
    }

    public void q(C.c cVar) {
    }
}

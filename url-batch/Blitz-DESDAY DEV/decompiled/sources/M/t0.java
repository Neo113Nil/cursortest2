package M;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class t0 {

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f592b;

    /* renamed from: a, reason: collision with root package name */
    public final v0 f593a;

    static {
        int i = Build.VERSION.SDK_INT;
        f592b = (i >= 30 ? new m0() : i >= 29 ? new l0() : new k0()).b().f596a.a().f596a.b().f596a.c();
    }

    public t0(v0 v0Var) {
        this.f593a = v0Var;
    }

    public v0 a() {
        return this.f593a;
    }

    public v0 b() {
        return this.f593a;
    }

    public v0 c() {
        return this.f593a;
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
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return n() == t0Var.n() && m() == t0Var.m() && Objects.equals(j(), t0Var.j()) && Objects.equals(h(), t0Var.h()) && Objects.equals(e(), t0Var.e());
    }

    public E.c f(int i) {
        return E.c.f161e;
    }

    public E.c g() {
        return j();
    }

    public E.c h() {
        return E.c.f161e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public E.c i() {
        return j();
    }

    public E.c j() {
        return E.c.f161e;
    }

    public E.c k() {
        return j();
    }

    public v0 l(int i, int i2, int i3, int i4) {
        return f592b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(E.c[] cVarArr) {
    }

    public void p(v0 v0Var) {
    }

    public void q(E.c cVar) {
    }
}

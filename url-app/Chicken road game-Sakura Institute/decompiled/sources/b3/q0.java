package b3;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f1359b;

    /* renamed from: a, reason: collision with root package name */
    public final t0 f1360a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f1359b = (i7 >= 30 ? new j0() : i7 >= 29 ? new i0() : new h0()).b().f1367a.a().f1367a.b().f1367a.c();
    }

    public q0(t0 t0Var) {
        this.f1360a = t0Var;
    }

    public t0 a() {
        return this.f1360a;
    }

    public t0 b() {
        return this.f1360a;
    }

    public t0 c() {
        return this.f1360a;
    }

    public e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return n() == q0Var.n() && m() == q0Var.m() && Objects.equals(k(), q0Var.k()) && Objects.equals(i(), q0Var.i()) && Objects.equals(e(), q0Var.e());
    }

    public v2.c f(int i7) {
        return v2.c.f9101e;
    }

    public v2.c g(int i7) {
        if ((i7 & 8) == 0) {
            return v2.c.f9101e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public v2.c h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), k(), i(), e());
    }

    public v2.c i() {
        return v2.c.f9101e;
    }

    public v2.c j() {
        return k();
    }

    public v2.c k() {
        return v2.c.f9101e;
    }

    public v2.c l() {
        return k();
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i7) {
        return true;
    }

    public void d(View view) {
    }

    public void p(v2.c[] cVarArr) {
    }

    public void q(t0 t0Var) {
    }

    public void r(v2.c cVar) {
    }
}

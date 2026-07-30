package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class fp1 {
    public static final ip1 b;
    public final ip1 a;

    static {
        b = (Build.VERSION.SDK_INT >= 34 ? new xo1() : new wo1()).b().a.a().a.b().a.c();
    }

    public fp1(ip1 ip1Var) {
        this.a = ip1Var;
    }

    public ip1 a() {
        return this.a;
    }

    public ip1 b() {
        return this.a;
    }

    public ip1 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp1)) {
            return false;
        }
        fp1 fp1Var = (fp1) obj;
        return p() == fp1Var.p() && o() == fp1Var.o() && Objects.equals(l(), fp1Var.l()) && Objects.equals(j(), fp1Var.j()) && Objects.equals(f(), fp1Var.f());
    }

    public ms f() {
        return null;
    }

    public c90 g(int i) {
        return c90.e;
    }

    public c90 h(int i) {
        if ((i & 8) == 0) {
            return c90.e;
        }
        dd0.e("Unable to query the maximum insets for IME");
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public c90 i() {
        return l();
    }

    public c90 j() {
        return c90.e;
    }

    public c90 k() {
        return l();
    }

    public c90 l() {
        return c90.e;
    }

    public c90 m() {
        return l();
    }

    public ip1 n(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void e(ip1 ip1Var) {
    }

    public void r(c90[] c90VarArr) {
    }

    public void s(c90 c90Var) {
    }

    public void t(ip1 ip1Var) {
    }

    public void u(int i) {
    }
}

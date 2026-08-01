package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class ap0 {
    public static final dp0 b;
    public final dp0 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new qo0() : i >= 35 ? new po0() : i >= 34 ? new oo0() : i >= 31 ? new no0() : i >= 30 ? new mo0() : i >= 29 ? new lo0() : new ko0()).b().a.a().a.b().a.c();
    }

    public ap0(dp0 dp0Var) {
        this.a = dp0Var;
    }

    public dp0 a() {
        return this.a;
    }

    public dp0 b() {
        return this.a;
    }

    public dp0 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap0)) {
            return false;
        }
        ap0 ap0Var = (ap0) obj;
        return s() == ap0Var.s() && r() == ap0Var.r() && Objects.equals(m(), ap0Var.m()) && Objects.equals(k(), ap0Var.k()) && Objects.equals(g(), ap0Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public jk g() {
        return null;
    }

    public fv h(int i) {
        return fv.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public fv i(int i) {
        if ((i & 8) == 0) {
            return fv.e;
        }
        s9.k("Unable to query the maximum insets for IME");
        return null;
    }

    public fv j() {
        return m();
    }

    public fv k() {
        return fv.e;
    }

    public fv l() {
        return m();
    }

    public fv m() {
        return fv.e;
    }

    public fv n() {
        return m();
    }

    public dp0 q(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public void d(View view) {
    }

    public void o(View view) {
    }

    public void t(lk lkVar) {
    }

    public void u(fv[] fvVarArr) {
    }

    public void v(dp0 dp0Var) {
    }

    public void w(fv fvVar) {
    }

    public void x(int i) {
    }

    public void y(Rect[][] rectArr) {
    }

    public void z(Rect[][] rectArr) {
    }

    public void p() {
    }
}

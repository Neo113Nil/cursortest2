package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class xb0 {
    public static final ac0 b;
    public final ac0 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new nb0() : i >= 35 ? new mb0() : i >= 34 ? new lb0() : i >= 31 ? new kb0() : i >= 30 ? new jb0() : i >= 29 ? new ib0() : new hb0()).b().a.a().a.b().a.c();
    }

    public xb0(ac0 ac0Var) {
        this.a = ac0Var;
    }

    public ac0 a() {
        return this.a;
    }

    public ac0 b() {
        return this.a;
    }

    public ac0 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb0)) {
            return false;
        }
        xb0 xb0Var = (xb0) obj;
        return s() == xb0Var.s() && r() == xb0Var.r() && Objects.equals(m(), xb0Var.m()) && Objects.equals(k(), xb0Var.k()) && Objects.equals(g(), xb0Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public sf g() {
        return null;
    }

    public ip h(int i) {
        return ip.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public ip i(int i) {
        if ((i & 8) == 0) {
            return ip.e;
        }
        o8.j("Unable to query the maximum insets for IME");
        return null;
    }

    public ip j() {
        return m();
    }

    public ip k() {
        return ip.e;
    }

    public ip l() {
        return m();
    }

    public ip m() {
        return ip.e;
    }

    public ip n() {
        return m();
    }

    public ac0 q(int i, int i2, int i3, int i4) {
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

    public void t(uf ufVar) {
    }

    public void u(ip[] ipVarArr) {
    }

    public void v(ac0 ac0Var) {
    }

    public void w(ip ipVar) {
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

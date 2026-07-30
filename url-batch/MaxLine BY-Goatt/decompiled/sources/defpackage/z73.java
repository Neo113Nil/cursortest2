package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class z73 {
    public static final c83 b;
    public final c83 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new p73() : i >= 35 ? new o73() : i >= 34 ? new n73() : i >= 31 ? new m73() : i >= 30 ? new l73() : i >= 29 ? new k73() : new j73()).b().a.a().a.b().a.c();
    }

    public z73(c83 c83Var) {
        this.a = c83Var;
    }

    public c83 a() {
        return this.a;
    }

    public c83 b() {
        return this.a;
    }

    public c83 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z73)) {
            return false;
        }
        z73 z73Var = (z73) obj;
        return s() == z73Var.s() && r() == z73Var.r() && Objects.equals(m(), z73Var.m()) && Objects.equals(k(), z73Var.k()) && Objects.equals(g(), z73Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public wb0 g() {
        return null;
    }

    public z21 h(int i) {
        return z21.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public z21 i(int i) {
        if ((i & 8) == 0) {
            return z21.e;
        }
        lh.e("Unable to query the maximum insets for IME");
        return null;
    }

    public z21 j() {
        return m();
    }

    public z21 k() {
        return z21.e;
    }

    public z21 l() {
        return m();
    }

    public z21 m() {
        return z21.e;
    }

    public z21 n() {
        return m();
    }

    public c83 q(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public boolean t(int i) {
        return true;
    }

    public void p() {
    }

    public void A(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void o(View view) {
    }

    public void u(yb0 yb0Var) {
    }

    public void v(z21[] z21VarArr) {
    }

    public void w(c83 c83Var) {
    }

    public void x(z21 z21Var) {
    }

    public void y(int i) {
    }

    public void z(Rect[][] rectArr) {
    }
}

package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class ob0 {
    public static final rb0 b;
    public final rb0 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new eb0() : i >= 35 ? new db0() : i >= 34 ? new cb0() : i >= 31 ? new bb0() : i >= 30 ? new ab0() : i >= 29 ? new za0() : new ya0()).b().a.a().a.b().a.c();
    }

    public ob0(rb0 rb0Var) {
        this.a = rb0Var;
    }

    public rb0 a() {
        return this.a;
    }

    public rb0 b() {
        return this.a;
    }

    public rb0 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob0)) {
            return false;
        }
        ob0 ob0Var = (ob0) obj;
        return s() == ob0Var.s() && r() == ob0Var.r() && Objects.equals(m(), ob0Var.m()) && Objects.equals(k(), ob0Var.k()) && Objects.equals(g(), ob0Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public ag g() {
        return null;
    }

    public to h(int i) {
        return to.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public to i(int i) {
        if ((i & 8) == 0) {
            return to.e;
        }
        t8.k("Unable to query the maximum insets for IME");
        return null;
    }

    public to j() {
        return m();
    }

    public to k() {
        return to.e;
    }

    public to l() {
        return m();
    }

    public to m() {
        return to.e;
    }

    public to n() {
        return m();
    }

    public rb0 q(int i, int i2, int i3, int i4) {
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

    public void t(cg cgVar) {
    }

    public void u(to[] toVarArr) {
    }

    public void v(rb0 rb0Var) {
    }

    public void w(to toVar) {
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

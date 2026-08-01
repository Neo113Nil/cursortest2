package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class ve0 {
    public static final ye0 b;
    public final ye0 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 36 ? new le0() : i >= 35 ? new ke0() : i >= 34 ? new je0() : i >= 31 ? new ie0() : i >= 30 ? new he0() : i >= 29 ? new ge0() : new fe0()).b().a.a().a.b().a.c();
    }

    public ve0(ye0 ye0Var) {
        this.a = ye0Var;
    }

    public ye0 a() {
        return this.a;
    }

    public ye0 b() {
        return this.a;
    }

    public ye0 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve0)) {
            return false;
        }
        ve0 ve0Var = (ve0) obj;
        return s() == ve0Var.s() && r() == ve0Var.r() && Objects.equals(m(), ve0Var.m()) && Objects.equals(k(), ve0Var.k()) && Objects.equals(g(), ve0Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public ai g() {
        return null;
    }

    public er h(int i) {
        return er.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public er i(int i) {
        if ((i & 8) == 0) {
            return er.e;
        }
        g9.i("Unable to query the maximum insets for IME");
        return null;
    }

    public er j() {
        return m();
    }

    public er k() {
        return er.e;
    }

    public er l() {
        return m();
    }

    public er m() {
        return er.e;
    }

    public er n() {
        return m();
    }

    public ye0 q(int i, int i2, int i3, int i4) {
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

    public void t(ci ciVar) {
    }

    public void u(er[] erVarArr) {
    }

    public void v(ye0 ye0Var) {
    }

    public void w(er erVar) {
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

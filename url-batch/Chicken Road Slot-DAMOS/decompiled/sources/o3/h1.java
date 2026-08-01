package o3;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class h1 {

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f7397b;

    /* renamed from: a, reason: collision with root package name */
    public final k1 f7398a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        f7397b = (i3 >= 36 ? new x0() : i3 >= 35 ? new w0() : i3 >= 34 ? new v0() : i3 >= 31 ? new u0() : i3 >= 30 ? new t0() : i3 >= 29 ? new s0() : new r0()).b().f7415a.a().f7415a.b().f7415a.c();
    }

    public h1(k1 k1Var) {
        this.f7398a = k1Var;
    }

    public k1 a() {
        return this.f7398a;
    }

    public k1 b() {
        return this.f7398a;
    }

    public k1 c() {
        return this.f7398a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return t() == h1Var.t() && s() == h1Var.s() && Objects.equals(n(), h1Var.n()) && Objects.equals(l(), h1Var.l()) && Objects.equals(h(), h1Var.h());
    }

    public List<Rect> f(int i3) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i3) {
        return Collections.EMPTY_LIST;
    }

    public d h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public h3.b i(int i3) {
        return h3.b.f4442e;
    }

    public h3.b j(int i3) {
        if ((i3 & 8) == 0) {
            return h3.b.f4442e;
        }
        te.a1.e("Unable to query the maximum insets for IME");
        return null;
    }

    public h3.b k() {
        return n();
    }

    public h3.b l() {
        return h3.b.f4442e;
    }

    public h3.b m() {
        return n();
    }

    public h3.b n() {
        return h3.b.f4442e;
    }

    public h3.b o() {
        return n();
    }

    public k1 r(int i3, int i10, int i11, int i12) {
        return f7397b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i3) {
        return true;
    }

    public void q() {
    }

    public void A(int i3) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void C(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void e(k1 k1Var) {
    }

    public void p(View view) {
    }

    public void v(f fVar) {
    }

    public void w(h3.b[] bVarArr) {
    }

    public void x(h3.b bVar) {
    }

    public void y(k1 k1Var) {
    }

    public void z(h3.b bVar) {
    }
}

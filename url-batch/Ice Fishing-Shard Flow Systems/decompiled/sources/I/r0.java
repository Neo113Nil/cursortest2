package I;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f1234b;

    /* renamed from: a, reason: collision with root package name */
    public final v0 f1235a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f1234b = (i2 >= 36 ? new g0() : i2 >= 35 ? new f0() : i2 >= 34 ? new e0() : i2 >= 31 ? new d0() : i2 >= 30 ? new c0() : i2 >= 29 ? new b0() : new a0()).b().f1239a.a().f1239a.b().f1239a.c();
    }

    public r0(v0 v0Var) {
        this.f1235a = v0Var;
    }

    public v0 a() {
        return this.f1235a;
    }

    public v0 b() {
        return this.f1235a;
    }

    public v0 c() {
        return this.f1235a;
    }

    public List<Rect> e(int i2) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return q() == r0Var.q() && p() == r0Var.p() && Objects.equals(k(), r0Var.k()) && Objects.equals(i(), r0Var.i()) && Objects.equals(g(), r0Var.g());
    }

    public List<Rect> f(int i2) {
        return Collections.EMPTY_LIST;
    }

    public C0112h g() {
        return null;
    }

    public B.c h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(q()), Boolean.valueOf(p()), k(), i(), g());
    }

    public B.c i() {
        return B.c.f146e;
    }

    public B.c j() {
        return k();
    }

    public B.c k() {
        return B.c.f146e;
    }

    public B.c l() {
        return k();
    }

    public v0 o(int i2, int i5, int i7, int i8) {
        return f1234b;
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public boolean r(int i2) {
        return true;
    }

    public void n() {
    }

    public void d(View view) {
    }

    public void m(View view) {
    }

    public void s(C0114j c0114j) {
    }

    public void t(B.c[] cVarArr) {
    }

    public void u(v0 v0Var) {
    }

    public void v(B.c cVar) {
    }

    public void w(int i2) {
    }

    public void x(Rect[][] rectArr) {
    }

    public void y(Rect[][] rectArr) {
    }
}

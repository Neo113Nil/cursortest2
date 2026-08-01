package n0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class s1 {

    /* renamed from: b, reason: collision with root package name */
    public static final v1 f2832b;

    /* renamed from: a, reason: collision with root package name */
    public final v1 f2833a;

    static {
        int i = Build.VERSION.SDK_INT;
        f2832b = (i >= 36 ? new i1() : i >= 35 ? new h1() : i >= 34 ? new g1() : i >= 31 ? new f1() : i >= 30 ? new e1() : i >= 29 ? new d1() : new c1()).b().f2842a.a().f2842a.b().f2842a.c();
    }

    public s1(v1 v1Var) {
        this.f2833a = v1Var;
    }

    public v1 a() {
        return this.f2833a;
    }

    public v1 b() {
        return this.f2833a;
    }

    public v1 c() {
        return this.f2833a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return s() == s1Var.s() && r() == s1Var.r() && Objects.equals(m(), s1Var.m()) && Objects.equals(k(), s1Var.k()) && Objects.equals(g(), s1Var.g());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public i g() {
        return null;
    }

    public f0.c h(int i) {
        return f0.c.f1414e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public f0.c i(int i) {
        if ((i & 8) == 0) {
            return f0.c.f1414e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public f0.c j() {
        return m();
    }

    public f0.c k() {
        return f0.c.f1414e;
    }

    public f0.c l() {
        return m();
    }

    public f0.c m() {
        return f0.c.f1414e;
    }

    public f0.c n() {
        return m();
    }

    public v1 q(int i, int i4, int i5, int i6) {
        return f2832b;
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

    public void t(k kVar) {
    }

    public void u(f0.c[] cVarArr) {
    }

    public void v(v1 v1Var) {
    }

    public void w(f0.c cVar) {
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

package n0;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class n1 {

    /* renamed from: b, reason: collision with root package name */
    public static final q1 f2765b;

    /* renamed from: a, reason: collision with root package name */
    public final q1 f2766a;

    static {
        int i = Build.VERSION.SDK_INT;
        f2765b = (i >= 34 ? new e1() : i >= 31 ? new d1() : i >= 30 ? new c1() : i >= 29 ? new b1() : new z0()).b().f2775a.a().f2775a.b().f2775a.c();
    }

    public n1(q1 q1Var) {
        this.f2766a = q1Var;
    }

    public q1 a() {
        return this.f2766a;
    }

    public q1 b() {
        return this.f2766a;
    }

    public q1 c() {
        return this.f2766a;
    }

    public h e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return o() == n1Var.o() && n() == n1Var.n() && Objects.equals(k(), n1Var.k()) && Objects.equals(i(), n1Var.i()) && Objects.equals(e(), n1Var.e());
    }

    public f0.c f(int i) {
        return f0.c.f1265e;
    }

    public f0.c g(int i) {
        if ((i & 8) == 0) {
            return f0.c.f1265e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public f0.c h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public f0.c i() {
        return f0.c.f1265e;
    }

    public f0.c j() {
        return k();
    }

    public f0.c k() {
        return f0.c.f1265e;
    }

    public f0.c l() {
        return k();
    }

    public q1 m(int i, int i4, int i5, int i6) {
        return f2765b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public void d(View view) {
    }

    public void p(f0.c[] cVarArr) {
    }

    public void q(q1 q1Var) {
    }

    public void r(f0.c cVar) {
    }

    public void s(int i) {
    }
}

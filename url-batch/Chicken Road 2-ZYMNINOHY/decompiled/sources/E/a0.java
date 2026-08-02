package E;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import x.C1513b;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f401b;

    /* renamed from: a, reason: collision with root package name */
    public final e0 f402a;

    static {
        int i4 = Build.VERSION.SDK_INT;
        f401b = (i4 >= 34 ? new Q() : i4 >= 31 ? new P() : i4 >= 30 ? new O() : i4 >= 29 ? new N() : new L()).b().f416a.a().f416a.b().f416a.c();
    }

    public a0(e0 e0Var) {
        this.f402a = e0Var;
    }

    public e0 a() {
        return this.f402a;
    }

    public e0 b() {
        return this.f402a;
    }

    public e0 c() {
        return this.f402a;
    }

    public C0004e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return l() == a0Var.l() && k() == a0Var.k() && Objects.equals(i(), a0Var.i()) && Objects.equals(g(), a0Var.g()) && Objects.equals(e(), a0Var.e());
    }

    public C1513b f() {
        return i();
    }

    public C1513b g() {
        return C1513b.f15954e;
    }

    public C1513b h() {
        return i();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), g(), e());
    }

    public C1513b i() {
        return C1513b.f15954e;
    }

    public C1513b j() {
        return i();
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m(int i4) {
        return true;
    }

    public void d(View view) {
    }

    public void n(C1513b[] c1513bArr) {
    }

    public void o(e0 e0Var) {
    }

    public void p(C1513b c1513b) {
    }

    public void q(int i4) {
    }
}

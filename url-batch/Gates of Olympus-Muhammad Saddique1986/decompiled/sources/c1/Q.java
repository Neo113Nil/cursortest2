package c1;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class Q {

    /* renamed from: b, reason: collision with root package name */
    public static final U f5586b;

    /* renamed from: a, reason: collision with root package name */
    public final U f5587a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        f5586b = (i3 >= 30 ? new J() : i3 >= 29 ? new I() : new H()).b().f5589a.a().f5589a.b().f5589a.c();
    }

    public Q(U u3) {
        this.f5587a = u3;
    }

    public U a() {
        return this.f5587a;
    }

    public U b() {
        return this.f5587a;
    }

    public U c() {
        return this.f5587a;
    }

    public C0381e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q3 = (Q) obj;
        return n() == q3.n() && m() == q3.m() && Objects.equals(k(), q3.k()) && Objects.equals(i(), q3.i()) && Objects.equals(e(), q3.e());
    }

    public X0.c f(int i3) {
        return X0.c.f4622e;
    }

    public X0.c g(int i3) {
        if ((i3 & 8) == 0) {
            return X0.c.f4622e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public X0.c h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), k(), i(), e());
    }

    public X0.c i() {
        return X0.c.f4622e;
    }

    public X0.c j() {
        return k();
    }

    public X0.c k() {
        return X0.c.f4622e;
    }

    public X0.c l() {
        return k();
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i3) {
        return true;
    }

    public void d(View view) {
    }

    public void p(X0.c[] cVarArr) {
    }

    public void q(U u3) {
    }

    public void r(X0.c cVar) {
    }
}

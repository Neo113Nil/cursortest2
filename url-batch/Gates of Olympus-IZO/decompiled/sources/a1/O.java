package a1;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class O {

    /* renamed from: b, reason: collision with root package name */
    public static final Q f3539b;

    /* renamed from: a, reason: collision with root package name */
    public final Q f3540a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        f3539b = (i3 >= 30 ? new H() : i3 >= 29 ? new G() : new F()).b().f3542a.a().f3542a.b().f3542a.c();
    }

    public O(Q q2) {
        this.f3540a = q2;
    }

    public Q a() {
        return this.f3540a;
    }

    public Q b() {
        return this.f3540a;
    }

    public Q c() {
        return this.f3540a;
    }

    public C0167e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o3 = (O) obj;
        return n() == o3.n() && m() == o3.m() && Objects.equals(k(), o3.k()) && Objects.equals(i(), o3.i()) && Objects.equals(e(), o3.e());
    }

    public V0.c f(int i3) {
        return V0.c.f3348e;
    }

    public V0.c g(int i3) {
        if ((i3 & 8) == 0) {
            return V0.c.f3348e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public V0.c h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), k(), i(), e());
    }

    public V0.c i() {
        return V0.c.f3348e;
    }

    public V0.c j() {
        return k();
    }

    public V0.c k() {
        return V0.c.f3348e;
    }

    public V0.c l() {
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

    public void p(V0.c[] cVarArr) {
    }

    public void q(Q q2) {
    }

    public void r(V0.c cVar) {
    }
}

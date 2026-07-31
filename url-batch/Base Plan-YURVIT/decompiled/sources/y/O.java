package y;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import r.C0224c;

/* loaded from: classes.dex */
public class O {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3128b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Q f3129a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 30 ? new G() : i2 >= 29 ? new C0256F() : new C0255E()).b().f3130a.a().f3130a.b().f3130a.c();
    }

    public O(Q q2) {
        this.f3129a = q2;
    }

    public Q a() {
        return this.f3129a;
    }

    public Q b() {
        return this.f3129a;
    }

    public Q c() {
        return this.f3129a;
    }

    public C0261e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o2 = (O) obj;
        return l() == o2.l() && k() == o2.k() && Objects.equals(i(), o2.i()) && Objects.equals(g(), o2.g()) && Objects.equals(e(), o2.e());
    }

    public C0224c f() {
        return i();
    }

    public C0224c g() {
        return C0224c.f2960e;
    }

    public C0224c h() {
        return i();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), g(), e());
    }

    public C0224c i() {
        return C0224c.f2960e;
    }

    public C0224c j() {
        return i();
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m(int i2) {
        return true;
    }

    public void d(View view) {
    }

    public void n(C0224c[] c0224cArr) {
    }

    public void o(Q q2) {
    }

    public void p(C0224c c0224c) {
    }
}

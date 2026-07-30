package w;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import p.C0217c;

/* loaded from: classes.dex */
public class P {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3043b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final S f3044a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 30 ? new H() : i2 >= 29 ? new G() : new C0254F()).b().f3045a.a().f3045a.b().f3045a.c();
    }

    public P(S s2) {
        this.f3044a = s2;
    }

    public S a() {
        return this.f3044a;
    }

    public S b() {
        return this.f3044a;
    }

    public S c() {
        return this.f3044a;
    }

    public C0259e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p2 = (P) obj;
        return l() == p2.l() && k() == p2.k() && Objects.equals(i(), p2.i()) && Objects.equals(g(), p2.g()) && Objects.equals(e(), p2.e());
    }

    public C0217c f() {
        return i();
    }

    public C0217c g() {
        return C0217c.f2807e;
    }

    public C0217c h() {
        return i();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), g(), e());
    }

    public C0217c i() {
        return C0217c.f2807e;
    }

    public C0217c j() {
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

    public void n(C0217c[] c0217cArr) {
    }

    public void o(S s2) {
    }

    public void p(C0217c c0217c) {
    }
}

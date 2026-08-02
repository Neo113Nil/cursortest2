package E;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class T {

    /* renamed from: b, reason: collision with root package name */
    public static final W f268b;

    /* renamed from: a, reason: collision with root package name */
    public final W f269a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        f268b = (i3 >= 34 ? new J() : i3 >= 31 ? new I() : i3 >= 30 ? new H() : i3 >= 29 ? new F() : new D()).b().f270a.a().f270a.b().f270a.c();
    }

    public T(W w3) {
        this.f269a = w3;
    }

    public W a() {
        return this.f269a;
    }

    public W b() {
        return this.f269a;
    }

    public W c() {
        return this.f269a;
    }

    public C0004e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t3 = (T) obj;
        return m() == t3.m() && l() == t3.l() && Objects.equals(j(), t3.j()) && Objects.equals(h(), t3.h()) && Objects.equals(e(), t3.e());
    }

    public x.b f(int i3) {
        return x.b.f10693e;
    }

    public x.b g() {
        return j();
    }

    public x.b h() {
        return x.b.f10693e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(m()), Boolean.valueOf(l()), j(), h(), e());
    }

    public x.b i() {
        return j();
    }

    public x.b j() {
        return x.b.f10693e;
    }

    public x.b k() {
        return j();
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public boolean n(int i3) {
        return true;
    }

    public void d(View view) {
    }

    public void o(x.b[] bVarArr) {
    }

    public void p(W w3) {
    }

    public void q(x.b bVar) {
    }

    public void r(int i3) {
    }
}

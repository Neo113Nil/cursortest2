package D;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class W {

    /* renamed from: b, reason: collision with root package name */
    public static final Y f269b;

    /* renamed from: a, reason: collision with root package name */
    public final Y f270a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f269b = (i7 >= 30 ? new N() : i7 >= 29 ? new M() : new K()).b().f272a.a().f272a.b().f272a.c();
    }

    public W(Y y) {
        this.f270a = y;
    }

    public Y a() {
        return this.f270a;
    }

    public Y b() {
        return this.f270a;
    }

    public Y c() {
        return this.f270a;
    }

    public C0092e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w5 = (W) obj;
        return m() == w5.m() && l() == w5.l() && Objects.equals(i(), w5.i()) && Objects.equals(g(), w5.g()) && Objects.equals(e(), w5.e());
    }

    public w.c f() {
        return i();
    }

    public w.c g() {
        return w.c.f6126e;
    }

    public w.c h() {
        return i();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(m()), Boolean.valueOf(l()), i(), g(), e());
    }

    public w.c i() {
        return w.c.f6126e;
    }

    public w.c j() {
        return i();
    }

    public Y k(int i7, int i8, int i9, int i10) {
        return f269b;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public boolean n(int i7) {
        return true;
    }

    public void d(View view) {
    }

    public void o(w.c[] cVarArr) {
    }

    public void p(Y y) {
    }

    public void q(w.c cVar) {
    }
}

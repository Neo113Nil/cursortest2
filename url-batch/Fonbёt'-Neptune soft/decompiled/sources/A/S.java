package A;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import t.C0307c;

/* loaded from: classes.dex */
public class S {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f22b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final T f23a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 30 ? new J() : i2 >= 29 ? new I() : new G()).b().f24a.a().f24a.b().f24a.c();
    }

    public S(T t2) {
        this.f23a = t2;
    }

    public T a() {
        return this.f23a;
    }

    public T b() {
        return this.f23a;
    }

    public T c() {
        return this.f23a;
    }

    public C0005f e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s2 = (S) obj;
        return i() == s2.i() && h() == s2.h() && Objects.equals(g(), s2.g()) && Objects.equals(f(), s2.f()) && Objects.equals(e(), s2.e());
    }

    public C0307c f() {
        return C0307c.f3436e;
    }

    public C0307c g() {
        return C0307c.f3436e;
    }

    public boolean h() {
        return false;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(i()), Boolean.valueOf(h()), g(), f(), e());
    }

    public boolean i() {
        return false;
    }

    public void d(View view) {
    }

    public void j(C0307c[] c0307cArr) {
    }

    public void k(T t2) {
    }

    public void l(C0307c c0307c) {
    }
}

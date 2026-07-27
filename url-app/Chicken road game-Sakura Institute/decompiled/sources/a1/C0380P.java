package a1;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* renamed from: a1.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0380P {

    /* renamed from: b, reason: collision with root package name */
    public static final C0383T f4868b;

    /* renamed from: a, reason: collision with root package name */
    public final C0383T f4869a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f4868b = (i2 >= 30 ? new C0373I() : i2 >= 29 ? new C0372H() : new C0370F()).b().f4871a.a().f4871a.b().f4871a.c();
    }

    public C0380P(C0383T c0383t) {
        this.f4869a = c0383t;
    }

    public C0383T a() {
        return this.f4869a;
    }

    public C0383T b() {
        return this.f4869a;
    }

    public C0383T c() {
        return this.f4869a;
    }

    public void d(View view) {
    }

    public C0390e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0380P)) {
            return false;
        }
        C0380P c0380p = (C0380P) obj;
        return n() == c0380p.n() && m() == c0380p.m() && Objects.equals(k(), c0380p.k()) && Objects.equals(i(), c0380p.i()) && Objects.equals(e(), c0380p.e());
    }

    public V0.c f(int i2) {
        return V0.c.f4142e;
    }

    public V0.c g(int i2) {
        if ((i2 & 8) == 0) {
            return V0.c.f4142e;
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
        return V0.c.f4142e;
    }

    public V0.c j() {
        return k();
    }

    public V0.c k() {
        return V0.c.f4142e;
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

    public boolean o(int i2) {
        return true;
    }

    public void p(V0.c[] cVarArr) {
    }

    public void q(C0383T c0383t) {
    }

    public void r(V0.c cVar) {
    }
}

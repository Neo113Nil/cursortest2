package q3;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class i1 {

    /* renamed from: b, reason: collision with root package name */
    public static final l1 f6111b;

    /* renamed from: a, reason: collision with root package name */
    public final l1 f6112a;

    static {
        int i = Build.VERSION.SDK_INT;
        f6111b = (i >= 34 ? new z0() : i >= 31 ? new y0() : i >= 30 ? new x0() : i >= 29 ? new w0() : new v0()).b().f6127a.a().f6127a.b().f6127a.c();
    }

    public i1(l1 l1Var) {
        this.f6112a = l1Var;
    }

    public l1 a() {
        return this.f6112a;
    }

    public l1 b() {
        return this.f6112a;
    }

    public l1 c() {
        return this.f6112a;
    }

    public j e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return o() == i1Var.o() && n() == i1Var.n() && Objects.equals(k(), i1Var.k()) && Objects.equals(i(), i1Var.i()) && Objects.equals(e(), i1Var.e());
    }

    public i3.c f(int i) {
        return i3.c.f3420e;
    }

    public i3.c g(int i) {
        if ((i & 8) == 0) {
            return i3.c.f3420e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public i3.c h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public i3.c i() {
        return i3.c.f3420e;
    }

    public i3.c j() {
        return k();
    }

    public i3.c k() {
        return i3.c.f3420e;
    }

    public i3.c l() {
        return k();
    }

    public l1 m(int i, int i8, int i9, int i10) {
        return f6111b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void q(i3.c[] cVarArr) {
    }

    public void r(l1 l1Var) {
    }

    public void s(i3.c cVar) {
    }

    public void t(int i) {
    }
}

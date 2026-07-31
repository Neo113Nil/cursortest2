package I;

import j.C0503u;
import j.C0506x;

/* renamed from: I.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2344a;

    /* renamed from: b, reason: collision with root package name */
    public C0122u f2345b;

    /* renamed from: c, reason: collision with root package name */
    public C0087c f2346c;

    /* renamed from: d, reason: collision with root package name */
    public Y1.e f2347d;

    /* renamed from: e, reason: collision with root package name */
    public int f2348e;

    /* renamed from: f, reason: collision with root package name */
    public C0503u f2349f;

    /* renamed from: g, reason: collision with root package name */
    public C0506x f2350g;

    public C0119s0(C0122u c0122u) {
        this.f2345b = c0122u;
    }

    public static boolean a(G g3, C0506x c0506x) {
        Z1.i.d(g3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        X x3 = g3.f2116f;
        if (x3 == null) {
            x3 = X.f2228i;
        }
        return !x3.a(g3.h().f2093f, c0506x.e(g3));
    }

    public final boolean b() {
        if (this.f2345b == null) {
            return false;
        }
        C0087c c0087c = this.f2346c;
        return c0087c != null ? c0087c.a() : false;
    }

    public final int c(Object obj) {
        int p;
        C0122u c0122u = this.f2345b;
        if (c0122u == null || (p = c0122u.p(this, obj)) == 0) {
            return 1;
        }
        return p;
    }

    public final void d() {
        C0122u c0122u = this.f2345b;
        if (c0122u != null) {
            c0122u.f2380r = true;
        }
        this.f2345b = null;
        this.f2349f = null;
        this.f2350g = null;
    }

    public final void e(boolean z3) {
        if (z3) {
            this.f2344a |= 32;
        } else {
            this.f2344a &= -33;
        }
    }
}

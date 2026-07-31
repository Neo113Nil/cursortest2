package I;

import e2.InterfaceC0426e;
import j.C0547u;
import j.C0550x;

/* renamed from: I.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2903a;

    /* renamed from: b, reason: collision with root package name */
    public C0176u f2904b;

    /* renamed from: c, reason: collision with root package name */
    public C0141c f2905c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0426e f2906d;

    /* renamed from: e, reason: collision with root package name */
    public int f2907e;

    /* renamed from: f, reason: collision with root package name */
    public C0547u f2908f;

    /* renamed from: g, reason: collision with root package name */
    public C0550x f2909g;

    public C0173s0(C0176u c0176u) {
        this.f2904b = c0176u;
    }

    public static boolean a(F f3, C0550x c0550x) {
        f2.j.d(f3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        M0 m02 = f3.f2670f;
        if (m02 == null) {
            m02 = W.f2783i;
        }
        return !m02.a(f3.h().f2653f, c0550x.e(f3));
    }

    public final boolean b() {
        if (this.f2904b == null) {
            return false;
        }
        C0141c c0141c = this.f2905c;
        return c0141c != null ? c0141c.a() : false;
    }

    public final int c(Object obj) {
        int p3;
        C0176u c0176u = this.f2904b;
        if (c0176u == null || (p3 = c0176u.p(this, obj)) == 0) {
            return 1;
        }
        return p3;
    }

    public final void d() {
        C0176u c0176u = this.f2904b;
        if (c0176u != null) {
            c0176u.f2940r = true;
        }
        this.f2904b = null;
        this.f2908f = null;
        this.f2909g = null;
    }

    public final void e(boolean z3) {
        if (z3) {
            this.f2903a |= 32;
        } else {
            this.f2903a &= -33;
        }
    }
}

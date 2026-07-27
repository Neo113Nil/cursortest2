package G;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: G.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2900a;

    /* renamed from: b, reason: collision with root package name */
    public C0225u f2901b;

    /* renamed from: c, reason: collision with root package name */
    public C0190c f2902c;

    /* renamed from: d, reason: collision with root package name */
    public Function2 f2903d;

    /* renamed from: e, reason: collision with root package name */
    public int f2904e;

    /* renamed from: f, reason: collision with root package name */
    public i.v f2905f;

    /* renamed from: g, reason: collision with root package name */
    public i.y f2906g;

    public C0222s0(C0225u c0225u) {
        this.f2901b = c0225u;
    }

    public static boolean a(F f4, i.y yVar) {
        Intrinsics.d(f4, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        M0 m02 = f4.f2668i;
        if (m02 == null) {
            m02 = W.f2779l;
        }
        return !m02.a(f4.f().f2651f, yVar.e(f4));
    }

    public final boolean b() {
        if (this.f2901b == null) {
            return false;
        }
        C0190c c0190c = this.f2902c;
        return c0190c != null ? c0190c.a() : false;
    }

    public final int c(Object obj) {
        int p4;
        C0225u c0225u = this.f2901b;
        if (c0225u == null || (p4 = c0225u.p(this, obj)) == 0) {
            return 1;
        }
        return p4;
    }

    public final void d() {
        C0225u c0225u = this.f2901b;
        if (c0225u != null) {
            c0225u.f2937u = true;
        }
        this.f2901b = null;
        this.f2905f = null;
        this.f2906g = null;
    }

    public final void e(boolean z4) {
        if (z4) {
            this.f2900a |= 32;
        } else {
            this.f2900a &= -33;
        }
    }
}

package b0;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o implements a2.g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final o f873b = new o(0);

    /* renamed from: c, reason: collision with root package name */
    public static final o f874c = new o(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f875a;

    public /* synthetic */ o(int i3) {
        this.f875a = i3;
    }

    @Override // a2.g0
    public final a2.h0 a(a2.i0 i0Var, List list, long j) {
        switch (this.f875a) {
            case 0:
                return a2.i0.V(i0Var, x2.a.j(j), x2.a.i(j), new a1.f(3));
            default:
                return a2.i0.V(i0Var, x2.a.f(j) ? x2.a.h(j) : 0, x2.a.e(j) ? x2.a.g(j) : 0, new a1.f(8));
        }
    }
}

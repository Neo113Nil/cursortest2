package q0;

import T.C0085c;
import T.C0107z;

/* renamed from: q0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1380w extends T.T {

    /* renamed from: b, reason: collision with root package name */
    public final C0107z f15079b;

    public C1380w(C0107z c0107z) {
        this.f15079b = c0107z;
    }

    @Override // T.T
    public final int b(Object obj) {
        return obj == C1379v.f15076e ? 0 : -1;
    }

    @Override // T.T
    public final T.Q f(int i4, T.Q q4, boolean z) {
        q4.h(z ? 0 : null, z ? C1379v.f15076e : null, 0, -9223372036854775807L, 0L, C0085c.f2767c, true);
        return q4;
    }

    @Override // T.T
    public final int h() {
        return 1;
    }

    @Override // T.T
    public final Object l(int i4) {
        return C1379v.f15076e;
    }

    @Override // T.T
    public final T.S m(int i4, T.S s4, long j4) {
        Object obj = T.S.f2688q;
        s4.b(this.f15079b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        s4.f2700k = true;
        return s4;
    }

    @Override // T.T
    public final int o() {
        return 1;
    }
}

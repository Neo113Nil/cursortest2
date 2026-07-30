package s;

import g0.g1;
import g0.m2;
import g0.t0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t implements m2 {

    /* renamed from: f, reason: collision with root package name */
    public final g1 f8059f;

    /* renamed from: g, reason: collision with root package name */
    public int f8060g;

    public t(int i7) {
        int i8 = (i7 / 30) * 30;
        this.f8059f = g0.d.J(v1.g.o(Math.max(i8 - 100, 0), i8 + 130), t0.f3903k);
        this.f8060g = i7;
    }

    @Override // g0.m2
    public final Object getValue() {
        return (w6.d) this.f8059f.getValue();
    }
}

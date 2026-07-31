package v1;

import m0.h1;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends r {

    /* renamed from: a, reason: collision with root package name */
    public final g f7457a;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f7458b = m0.b.q(null);

    public h(g gVar) {
        this.f7457a = gVar;
    }

    @Override // r2.r
    public final boolean q(g gVar) {
        return gVar == this.f7457a;
    }

    @Override // r2.r
    public final Object w(g gVar) {
        if (gVar != this.f7457a) {
            t1.a.b("Check failed.");
        }
        Object value = this.f7458b.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}

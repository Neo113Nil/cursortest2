package g0;

import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l2 implements Iterable, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final y1 f3788f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3789g;

    /* renamed from: h, reason: collision with root package name */
    public final d f3790h;

    public l2(y1 y1Var, int i7, l0 l0Var, d dVar) {
        this.f3788f = y1Var;
        this.f3789g = i7;
        this.f3790h = dVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new k0(this.f3788f, this.f3789g, null, this.f3790h);
    }
}

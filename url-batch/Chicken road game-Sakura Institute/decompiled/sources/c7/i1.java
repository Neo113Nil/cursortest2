package c7;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i1 extends h6.a implements x0 {

    /* renamed from: g, reason: collision with root package name */
    public static final i1 f1705g = new i1(u.f1748g);

    @Override // c7.x0
    public final i0 I(q6.c cVar) {
        return j1.f1710f;
    }

    @Override // c7.x0
    public final Object N(j6.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // c7.x0
    public final k T(f1 f1Var) {
        return j1.f1710f;
    }

    @Override // c7.x0
    public final boolean b() {
        return true;
    }

    @Override // c7.x0
    public final i0 n(boolean z8, boolean z9, a1 a1Var) {
        return j1.f1710f;
    }

    @Override // c7.x0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // c7.x0
    public final CancellationException w() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // c7.x0
    public final void c(CancellationException cancellationException) {
    }
}

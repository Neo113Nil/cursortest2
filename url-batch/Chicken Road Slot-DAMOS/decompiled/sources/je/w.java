package je;

import ge.c1;
import ge.r1;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w implements j0, e, ke.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f5239d;
    private final c1 job;

    public w(l0 l0Var, r1 r1Var) {
        this.f5239d = l0Var;
        this.job = r1Var;
    }

    @Override // ke.n
    public final e a(CoroutineContext coroutineContext, int i3, ie.a aVar) {
        return ((((i3 < 0 || i3 >= 2) && i3 != -2) || aVar != ie.a.f4713e) && !((i3 == 0 || i3 == -3) && aVar == ie.a.f4712d)) ? new ke.h(this, coroutineContext, i3, aVar) : this;
    }

    @Override // je.e
    public final Object c(f fVar, ld.a aVar) {
        this.f5239d.c(fVar, aVar);
        return md.a.f6622d;
    }

    @Override // je.j0
    public final Object getValue() {
        return this.f5239d.getValue();
    }
}

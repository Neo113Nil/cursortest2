package le;

import ge.a0;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class r extends ge.a implements nd.d {

    /* renamed from: r, reason: collision with root package name */
    public final ld.a f5997r;

    public r(CoroutineContext coroutineContext, ld.a aVar) {
        super(coroutineContext, true);
        this.f5997r = aVar;
    }

    @Override // ge.k1
    public final boolean R() {
        return true;
    }

    @Override // nd.d
    public final nd.d getCallerFrame() {
        ld.a aVar = this.f5997r;
        if (aVar instanceof nd.d) {
            return (nd.d) aVar;
        }
        return null;
    }

    @Override // ge.k1
    public void k(Object obj) {
        b.g(a0.u(obj), md.f.b(this.f5997r));
    }

    @Override // ge.k1
    public void l(Object obj) {
        this.f5997r.resumeWith(a0.u(obj));
    }

    public void i0() {
    }
}

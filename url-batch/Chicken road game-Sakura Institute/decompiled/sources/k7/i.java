package k7;

import h7.q;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f5395e;

    public i(long j8, i iVar, int i7) {
        super(j8, iVar, i7);
        this.f5395e = new AtomicReferenceArray(h.f5394f);
    }

    @Override // h7.q
    public final int f() {
        return h.f5394f;
    }

    @Override // h7.q
    public final void g(int i7, h6.i iVar) {
        this.f5395e.set(i7, h.f5393e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f4704c + ", hashCode=" + hashCode() + ']';
    }
}

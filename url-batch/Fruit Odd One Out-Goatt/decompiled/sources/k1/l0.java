package k1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class l0 extends q0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0() {
        super(true);
        boolean z2 = true;
        A(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q0.f715c;
        g gVar = (g) atomicReferenceFieldUpdater.get(this);
        h hVar = gVar instanceof h ? (h) gVar : null;
        if (hVar != null) {
            q0 n2 = hVar.n();
            while (!n2.v()) {
                g gVar2 = (g) atomicReferenceFieldUpdater.get(n2);
                h hVar2 = gVar2 instanceof h ? (h) gVar2 : null;
                if (hVar2 != null) {
                    n2 = hVar2.n();
                }
            }
            this.f691d = z2;
        }
        z2 = false;
        this.f691d = z2;
    }

    @Override // k1.q0
    public final boolean v() {
        return this.f691d;
    }
}

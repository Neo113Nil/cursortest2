package Z2;

import W2.C0286h;
import a3.AbstractC0424b;
import a3.AbstractC0425c;
import a3.AbstractC0426d;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;

/* loaded from: classes.dex */
public final class T extends AbstractC0426d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f4661a = new AtomicReference(null);

    @Override // a3.AbstractC0426d
    public final boolean a(AbstractC0424b abstractC0424b) {
        AtomicReference atomicReference = this.f4661a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(H.f4633b);
        return true;
    }

    @Override // a3.AbstractC0426d
    public final C2.a[] b(AbstractC0424b abstractC0424b) {
        this.f4661a.set(null);
        return AbstractC0425c.f4946a;
    }

    public final Object c(Q frame) {
        C0286h c0286h = new C0286h(1, D2.f.b(frame));
        c0286h.s();
        AtomicReference atomicReference = this.f4661a;
        b3.t tVar = H.f4633b;
        while (true) {
            if (atomicReference.compareAndSet(tVar, c0286h)) {
                break;
            }
            if (atomicReference.get() != tVar) {
                AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                c0286h.u(Unit.f7487a);
                break;
            }
        }
        Object r2 = c0286h.r();
        D2.a aVar2 = D2.a.f2163d;
        if (r2 == aVar2) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r2 == aVar2 ? r2 : Unit.f7487a;
    }
}

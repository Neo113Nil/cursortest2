package q6;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l0.C0654a;
import n6.C0775h;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f7424a = new AtomicReference(null);

    public final Object a(u frame) {
        C0775h c0775h = new C0775h(1, W5.d.b(frame));
        c0775h.s();
        while (true) {
            AtomicReference atomicReference = this.f7424a;
            C0654a c0654a = w.f7422a;
            if (atomicReference.compareAndSet(c0654a, c0775h)) {
                break;
            }
            if (atomicReference.get() != c0654a) {
                R5.l lVar = R5.n.f2421d;
                c0775h.resumeWith(Unit.f6114a);
                break;
            }
        }
        Object r7 = c0775h.r();
        W5.a aVar = W5.a.f2787d;
        if (r7 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r7 == aVar ? r7 : Unit.f6114a;
    }
}

package t2;

import java.util.concurrent.atomic.AtomicReference;
import u2.AbstractC1150b;
import u2.AbstractC1151c;
import u2.AbstractC1152d;

/* renamed from: t2.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1046Q extends AbstractC1152d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f9005a = new AtomicReference(null);

    @Override // u2.AbstractC1152d
    public final boolean a(AbstractC1150b abstractC1150b) {
        AtomicReference atomicReference = this.f9005a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC1035F.f8977b);
        return true;
    }

    @Override // u2.AbstractC1152d
    public final V1.d[] b(AbstractC1150b abstractC1150b) {
        this.f9005a.set(null);
        return AbstractC1151c.f9681a;
    }
}

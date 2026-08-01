package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class uc0 extends lc0 {
    public final /* synthetic */ AtomicReferenceArray e;

    public uc0(long j, uc0 uc0Var, int i) {
        super(j, uc0Var, i);
        this.e = new AtomicReferenceArray(tc0.f);
    }

    @Override // defpackage.lc0
    public final int d() {
        return tc0.f;
    }

    @Override // defpackage.lc0
    public final void e(int i) {
        this.e.set(i, tc0.e);
        if (lc0.d.incrementAndGet(this) == tc0.f) {
            b();
        }
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}

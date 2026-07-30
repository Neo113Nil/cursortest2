package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class b91 extends e81 {
    public final /* synthetic */ AtomicReferenceArray g;

    public b91(long j, b91 b91Var, int i) {
        super(j, b91Var, i);
        this.g = new AtomicReferenceArray(a91.f);
    }

    @Override // defpackage.e81
    public final int k() {
        return a91.f;
    }

    @Override // defpackage.e81
    public final void l(int i, CoroutineContext coroutineContext) {
        this.g.set(i, a91.e);
        m();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}

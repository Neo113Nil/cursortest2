package e3;

import b3.r;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class i extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f6275e;

    public i(long j4, i iVar, int i2) {
        super(j4, iVar, i2);
        this.f6275e = new AtomicReferenceArray(h.f6274f);
    }

    @Override // b3.r
    public final int f() {
        return h.f6274f;
    }

    @Override // b3.r
    public final void g(int i2, CoroutineContext coroutineContext) {
        this.f6275e.set(i2, h.f6273e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f5686c + ", hashCode=" + hashCode() + ']';
    }
}

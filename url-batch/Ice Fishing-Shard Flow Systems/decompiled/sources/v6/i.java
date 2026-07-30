package v6;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import s6.r;

/* loaded from: classes.dex */
public final class i extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f8254e;

    public i(long j, i iVar, int i2) {
        super(j, iVar, i2);
        this.f8254e = new AtomicReferenceArray(h.f8253f);
    }

    @Override // s6.r
    public final int f() {
        return h.f8253f;
    }

    @Override // s6.r
    public final void g(int i2, CoroutineContext coroutineContext) {
        this.f8254e.set(i2, h.f8252e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f7854c + ", hashCode=" + hashCode() + ']';
    }
}

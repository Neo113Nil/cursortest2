package i7;

import f7.r;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3484e;

    public i(long j7, i iVar, int i) {
        super(j7, iVar, i);
        this.f3484e = new AtomicReferenceArray(h.f3483f);
    }

    @Override // f7.r
    public final int f() {
        return h.f3483f;
    }

    @Override // f7.r
    public final void g(int i, g6.h hVar) {
        this.f3484e.set(i, h.f3482e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f2799c + ", hashCode=" + hashCode() + ']';
    }
}

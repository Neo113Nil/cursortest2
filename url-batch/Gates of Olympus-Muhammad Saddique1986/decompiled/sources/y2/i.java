package y2;

import java.util.concurrent.atomic.AtomicReferenceArray;
import v2.r;

/* loaded from: classes.dex */
public final class i extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f10415e;

    public i(long j3, i iVar, int i3) {
        super(j3, iVar, i3);
        this.f10415e = new AtomicReferenceArray(h.f10414f);
    }

    @Override // v2.r
    public final int f() {
        return h.f10414f;
    }

    @Override // v2.r
    public final void g(int i3, V1.i iVar) {
        this.f10415e.set(i3, h.f10413e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f9826c + ", hashCode=" + hashCode() + ']';
    }
}

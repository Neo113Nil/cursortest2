package s2;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p2.s;

/* loaded from: classes.dex */
public final class i extends s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f7569e;

    public i(long j3, i iVar, int i3) {
        super(j3, iVar, i3);
        this.f7569e = new AtomicReferenceArray(h.f7568f);
    }

    @Override // p2.s
    public final int f() {
        return h.f7568f;
    }

    @Override // p2.s
    public final void g(int i3, P1.i iVar) {
        this.f7569e.set(i3, h.f7567e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f6806c + ", hashCode=" + hashCode() + ']';
    }
}

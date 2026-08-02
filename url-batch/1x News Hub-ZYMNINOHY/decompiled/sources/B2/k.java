package B2;

import java.util.concurrent.atomic.AtomicReferenceArray;
import y2.t;

/* loaded from: classes.dex */
public final class k extends t {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f187e;

    public k(long j3, k kVar, int i3) {
        super(j3, kVar, i3);
        this.f187e = new AtomicReferenceArray(j.f);
    }

    @Override // y2.t
    public final int f() {
        return j.f;
    }

    @Override // y2.t
    public final void g(int i3, d2.h hVar) {
        this.f187e.set(i3, j.f186e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f10866c + ", hashCode=" + hashCode() + ']';
    }
}

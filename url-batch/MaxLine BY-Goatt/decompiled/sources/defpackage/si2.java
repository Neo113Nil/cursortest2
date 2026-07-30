package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class si2 extends vg2 {
    public final /* synthetic */ AtomicReferenceArray g;

    public si2(long j, si2 si2Var, int i) {
        super(j, si2Var, i);
        this.g = new AtomicReferenceArray(ri2.f);
    }

    @Override // defpackage.vg2
    public final int k() {
        return ri2.f;
    }

    @Override // defpackage.vg2
    public final void l(int i, CoroutineContext coroutineContext) {
        this.g.set(i, ri2.e);
        m();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}

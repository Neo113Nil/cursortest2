package oe;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import le.s;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f7583e;

    public j(long j, j jVar, int i3) {
        super(j, jVar, i3);
        this.f7583e = new AtomicReferenceArray(i.f7582f);
    }

    @Override // le.s
    public final int f() {
        return i.f7582f;
    }

    @Override // le.s
    public final void g(int i3, CoroutineContext coroutineContext) {
        this.f7583e.set(i3, i.f7581e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f5999c + ", hashCode=" + hashCode() + ']';
    }
}

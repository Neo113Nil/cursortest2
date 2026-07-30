package U0;

import R0.v;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends v {

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceArray f1047i;

    public j(long j2, j jVar, int i2) {
        super(j2, jVar, i2);
        this.f1047i = new AtomicReferenceArray(i.f1046f);
    }

    @Override // R0.v
    public final int f() {
        return i.f1046f;
    }

    @Override // R0.v
    public final void g(int i2, w0.i iVar) {
        this.f1047i.set(i2, i.f1045e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f938g + ", hashCode=" + hashCode() + ']';
    }
}

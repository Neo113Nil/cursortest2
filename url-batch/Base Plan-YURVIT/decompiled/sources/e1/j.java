package e1;

import b1.v;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends v {

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceArray f1887i;

    public j(long j2, j jVar, int i2) {
        super(j2, jVar, i2);
        this.f1887i = new AtomicReferenceArray(i.f1886f);
    }

    @Override // b1.v
    public final int f() {
        return i.f1886f;
    }

    @Override // b1.v
    public final void g(int i2, G0.i iVar) {
        this.f1887i.set(i2, i.f1885e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f1777g + ", hashCode=" + hashCode() + ']';
    }
}

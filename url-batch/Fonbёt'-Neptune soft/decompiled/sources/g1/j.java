package g1;

import d1.v;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends v {

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceArray f2245i;

    public j(long j2, j jVar, int i2) {
        super(j2, jVar, i2);
        this.f2245i = new AtomicReferenceArray(i.f2244f);
    }

    @Override // d1.v
    public final int f() {
        return i.f2244f;
    }

    @Override // d1.v
    public final void g(int i2, H0.i iVar) {
        this.f2245i.set(i2, i.f2243e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f2107g + ", hashCode=" + hashCode() + ']';
    }
}

package P5;

import M5.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public final class j extends t {

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceArray f1901j;

    public j(long j4, j jVar, int i7) {
        super(j4, jVar, i7);
        this.f1901j = new AtomicReferenceArray(i.f1900f);
    }

    @Override // M5.t
    public final int f() {
        return i.f1900f;
    }

    @Override // M5.t
    public final void g(int i7, InterfaceC0569i interfaceC0569i) {
        this.f1901j.set(i7, i.f1899e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f1622h + ", hashCode=" + hashCode() + ']';
    }
}

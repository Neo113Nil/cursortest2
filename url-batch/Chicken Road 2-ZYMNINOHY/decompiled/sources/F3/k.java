package F3;

import C3.t;
import f3.InterfaceC0430h;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class k extends t {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f813e;

    public k(long j4, k kVar, int i4) {
        super(j4, kVar, i4);
        this.f813e = new AtomicReferenceArray(j.f812f);
    }

    @Override // C3.t
    public final int f() {
        return j.f812f;
    }

    @Override // C3.t
    public final void g(int i4, InterfaceC0430h interfaceC0430h) {
        this.f813e.set(i4, j.f811e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f318c + ", hashCode=" + hashCode() + ']';
    }
}

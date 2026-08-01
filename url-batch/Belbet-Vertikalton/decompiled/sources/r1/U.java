package r1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class U extends w1.b {

    /* renamed from: b, reason: collision with root package name */
    public final Q f4057b;

    /* renamed from: c, reason: collision with root package name */
    public W f4058c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V f4059d;
    public final /* synthetic */ J e;

    public U(Q q2, V v2, J j) {
        this.f4059d = v2;
        this.e = j;
        this.f4057b = q2;
    }

    @Override // w1.b
    public final void b(Object obj, Object obj2) {
        w1.j jVar = (w1.j) obj;
        boolean z2 = obj2 == null;
        w1.j jVar2 = this.f4057b;
        w1.j jVar3 = z2 ? jVar2 : this.f4058c;
        if (jVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w1.j.f4482a;
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, this, jVar3)) {
                if (atomicReferenceFieldUpdater.get(jVar) != this) {
                    return;
                }
            }
            if (z2) {
                w1.j jVar4 = this.f4058c;
                j1.h.b(jVar4);
                jVar2.j(jVar4);
            }
        }
    }

    @Override // w1.b
    public final V.q c(Object obj) {
        if (this.f4059d.s() == this.e) {
            return null;
        }
        return w1.a.e;
    }
}

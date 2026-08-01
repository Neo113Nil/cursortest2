package o1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class T extends s1.b {

    /* renamed from: b, reason: collision with root package name */
    public final P f3324b;

    /* renamed from: c, reason: collision with root package name */
    public V f3325c;
    public final /* synthetic */ U d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ I f3326e;

    public T(P p2, U u2, I i) {
        this.d = u2;
        this.f3326e = i;
        this.f3324b = p2;
    }

    @Override // s1.b
    public final void b(Object obj, Object obj2) {
        s1.i iVar = (s1.i) obj;
        boolean z2 = obj2 == null;
        P p2 = this.f3324b;
        Object obj3 = z2 ? p2 : this.f3325c;
        if (obj3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.i.f3655a;
            while (!atomicReferenceFieldUpdater.compareAndSet(iVar, this, obj3)) {
                if (atomicReferenceFieldUpdater.get(iVar) != this) {
                    return;
                }
            }
            if (z2) {
                V v2 = this.f3325c;
                g1.f.b(v2);
                p2.j(v2);
            }
        }
    }

    @Override // s1.b
    public final T.r c(Object obj) {
        if (this.d.w() == this.f3326e) {
            return null;
        }
        return s1.a.d;
    }
}

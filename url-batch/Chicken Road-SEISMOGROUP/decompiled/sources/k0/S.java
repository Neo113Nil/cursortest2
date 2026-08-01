package k0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p0.AbstractC0084a;

/* loaded from: classes.dex */
public final class S extends p0.b {

    /* renamed from: b, reason: collision with root package name */
    public final O f899b;

    /* renamed from: c, reason: collision with root package name */
    public U f900c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T f901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f902e;

    public S(O o2, T t, H h2) {
        this.f901d = t;
        this.f902e = h2;
        this.f899b = o2;
    }

    @Override // p0.b
    public final void b(Object obj, Object obj2) {
        p0.l lVar = (p0.l) obj;
        boolean z = obj2 == null;
        O o2 = this.f899b;
        Object obj3 = z ? o2 : this.f900c;
        if (obj3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p0.l.f1160b;
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, this, obj3)) {
                if (atomicReferenceFieldUpdater.get(lVar) != this) {
                    return;
                }
            }
            if (z) {
                U u2 = this.f900c;
                e0.h.b(u2);
                o2.j(u2);
            }
        }
    }

    @Override // p0.b
    public final io.flutter.plugin.editing.a c(Object obj) {
        if (this.f901d.y() == this.f902e) {
            return null;
        }
        return AbstractC0084a.f1138e;
    }
}

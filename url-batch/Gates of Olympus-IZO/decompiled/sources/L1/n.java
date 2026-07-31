package L1;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n implements g, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2711f = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "e");

    /* renamed from: d, reason: collision with root package name */
    public volatile Y1.a f2712d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f2713e;

    @Override // L1.g
    public final Object getValue() {
        Object obj = this.f2713e;
        w wVar = w.f2726a;
        if (obj != wVar) {
            return obj;
        }
        Y1.a aVar = this.f2712d;
        if (aVar != null) {
            Object b2 = aVar.b();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2711f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, wVar, b2)) {
                if (atomicReferenceFieldUpdater.get(this) != wVar) {
                }
            }
            this.f2712d = null;
            return b2;
        }
        return this.f2713e;
    }

    public final String toString() {
        return this.f2713e != w.f2726a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

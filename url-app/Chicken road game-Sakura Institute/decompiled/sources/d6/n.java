package d6;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n implements g, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2621h = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "g");

    /* renamed from: f, reason: collision with root package name */
    public volatile q6.a f2622f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f2623g;

    @Override // d6.g
    public final Object getValue() {
        Object obj = this.f2623g;
        w wVar = w.f2636a;
        if (obj != wVar) {
            return obj;
        }
        q6.a aVar = this.f2622f;
        if (aVar != null) {
            Object a3 = aVar.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2621h;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, wVar, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != wVar) {
                }
            }
            this.f2622f = null;
            return a3;
        }
        return this.f2623g;
    }

    public final String toString() {
        return this.f2623g != w.f2636a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

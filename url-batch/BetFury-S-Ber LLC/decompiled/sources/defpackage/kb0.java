package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class kb0 implements ww, Serializable {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(kb0.class, Object.class, "g");
    public volatile ir f;
    public volatile Object g;

    @Override // defpackage.ww
    public final Object getValue() {
        Object obj = this.g;
        sl slVar = sl.o;
        if (obj != slVar) {
            return obj;
        }
        ir irVar = this.f;
        if (irVar != null) {
            Object a = irVar.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, slVar, a)) {
                if (atomicReferenceFieldUpdater.get(this) != slVar) {
                }
            }
            this.f = null;
            return a;
        }
        return this.g;
    }

    public final String toString() {
        return this.g != sl.o ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

package c6;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j implements d, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1750f = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "e");

    /* renamed from: d, reason: collision with root package name */
    public volatile p6.a f1751d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1752e;

    @Override // c6.d
    public final Object getValue() {
        Object obj = this.f1752e;
        l lVar = l.f1756a;
        if (obj != lVar) {
            return obj;
        }
        p6.a aVar = this.f1751d;
        if (aVar != null) {
            Object b8 = aVar.b();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1750f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, b8)) {
                if (atomicReferenceFieldUpdater.get(this) != lVar) {
                }
            }
            this.f1751d = null;
            return b8;
        }
        return this.f1752e;
    }

    public final String toString() {
        return this.f1752e != l.f1756a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

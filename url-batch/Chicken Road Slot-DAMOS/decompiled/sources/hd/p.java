package hd;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p implements g, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final o f4513i = new o(null);

    /* renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4514r = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "e");

    /* renamed from: d, reason: collision with root package name */
    public volatile Function0 f4515d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f4516e;

    @Override // hd.g
    public final Object getValue() {
        Object obj = this.f4516e;
        c0 c0Var = c0.f4498a;
        if (obj != c0Var) {
            return obj;
        }
        Function0 function0 = this.f4515d;
        if (function0 != null) {
            Object invoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4514r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0Var, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c0Var) {
                }
            }
            this.f4515d = null;
            return invoke;
        }
        return this.f4516e;
    }

    public final String toString() {
        return this.f4516e != c0.f4498a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

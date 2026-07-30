package R5;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class p implements InterfaceC0168h, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final o f2422i = new o(null);

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2423l = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "e");

    /* renamed from: d, reason: collision with root package name */
    public volatile Function0 f2424d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f2425e;

    @Override // R5.InterfaceC0168h
    public final Object getValue() {
        Object obj = this.f2425e;
        C c7 = C.f2403a;
        if (obj != c7) {
            return obj;
        }
        Function0 function0 = this.f2424d;
        if (function0 != null) {
            Object invoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2423l;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c7, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c7) {
                }
            }
            this.f2424d = null;
            return invoke;
        }
        return this.f2425e;
    }

    public final String toString() {
        return this.f2425e != C.f2403a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

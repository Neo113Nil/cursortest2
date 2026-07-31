package R1;

import e2.InterfaceC0422a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m implements f, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4153f = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "e");

    /* renamed from: d, reason: collision with root package name */
    public volatile InterfaceC0422a f4154d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f4155e;

    @Override // R1.f
    public final Object getValue() {
        Object obj = this.f4155e;
        v vVar = v.f4168a;
        if (obj != vVar) {
            return obj;
        }
        InterfaceC0422a interfaceC0422a = this.f4154d;
        if (interfaceC0422a != null) {
            Object b3 = interfaceC0422a.b();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4153f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, b3)) {
                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                }
            }
            this.f4154d = null;
            return b3;
        }
        return this.f4155e;
    }

    public final String toString() {
        return this.f4155e != v.f4168a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

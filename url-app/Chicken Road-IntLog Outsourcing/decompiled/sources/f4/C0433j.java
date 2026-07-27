package f4;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t4.InterfaceC1430a;

/* renamed from: f4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433j implements InterfaceC0428e, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5671c = AtomicReferenceFieldUpdater.newUpdater(C0433j.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC1430a f5672a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f5673b;

    @Override // f4.InterfaceC0428e
    public final Object getValue() {
        Object obj = this.f5673b;
        C0442s c0442s = C0442s.f5686a;
        if (obj != c0442s) {
            return obj;
        }
        InterfaceC1430a interfaceC1430a = this.f5672a;
        if (interfaceC1430a != null) {
            Object invoke = interfaceC1430a.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5671c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0442s, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c0442s) {
                }
            }
            this.f5672a = null;
            return invoke;
        }
        return this.f5673b;
    }

    public final String toString() {
        return this.f5673b != C0442s.f5686a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

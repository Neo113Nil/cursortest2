package k5;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x5.InterfaceC0732a;

/* renamed from: k5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480j implements InterfaceC0475e, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5201h = AtomicReferenceFieldUpdater.newUpdater(C0480j.class, Object.class, "g");

    /* renamed from: f, reason: collision with root package name */
    public volatile InterfaceC0732a f5202f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f5203g;

    @Override // k5.InterfaceC0475e
    public final Object getValue() {
        Object obj = this.f5203g;
        s sVar = s.f5216a;
        if (obj != sVar) {
            return obj;
        }
        InterfaceC0732a interfaceC0732a = this.f5202f;
        if (interfaceC0732a != null) {
            Object invoke = interfaceC0732a.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5201h;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != sVar) {
                }
            }
            this.f5202f = null;
            return invoke;
        }
        return this.f5203g;
    }

    @Override // k5.InterfaceC0475e
    public final boolean isInitialized() {
        return this.f5203g != s.f5216a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

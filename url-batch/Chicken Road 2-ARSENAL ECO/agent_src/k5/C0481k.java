package k5;

import java.io.Serializable;
import x5.InterfaceC0732a;

/* renamed from: k5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0481k implements InterfaceC0475e, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0732a f5204f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f5205g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5206h;

    public C0481k(InterfaceC0732a initializer) {
        kotlin.jvm.internal.i.e(initializer, "initializer");
        this.f5204f = initializer;
        this.f5205g = s.f5216a;
        this.f5206h = this;
    }

    @Override // k5.InterfaceC0475e
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f5205g;
        s sVar = s.f5216a;
        if (obj2 != sVar) {
            return obj2;
        }
        synchronized (this.f5206h) {
            obj = this.f5205g;
            if (obj == sVar) {
                InterfaceC0732a interfaceC0732a = this.f5204f;
                kotlin.jvm.internal.i.b(interfaceC0732a);
                obj = interfaceC0732a.invoke();
                this.f5205g = obj;
                this.f5204f = null;
            }
        }
        return obj;
    }

    @Override // k5.InterfaceC0475e
    public final boolean isInitialized() {
        return this.f5205g != s.f5216a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

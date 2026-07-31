package k5;

import java.io.Serializable;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class w implements InterfaceC0475e, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0732a f5220f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5221g;

    @Override // k5.InterfaceC0475e
    public final Object getValue() {
        if (this.f5221g == s.f5216a) {
            InterfaceC0732a interfaceC0732a = this.f5220f;
            kotlin.jvm.internal.i.b(interfaceC0732a);
            this.f5221g = interfaceC0732a.invoke();
            this.f5220f = null;
        }
        return this.f5221g;
    }

    @Override // k5.InterfaceC0475e
    public final boolean isInitialized() {
        return this.f5221g != s.f5216a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

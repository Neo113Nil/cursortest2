package R1;

import e2.InterfaceC0422a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class n implements f, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0422a f4156d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f4157e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4158f;

    public n(InterfaceC0422a interfaceC0422a) {
        f2.j.f(interfaceC0422a, "initializer");
        this.f4156d = interfaceC0422a;
        this.f4157e = v.f4168a;
        this.f4158f = this;
    }

    @Override // R1.f
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f4157e;
        v vVar = v.f4168a;
        if (obj2 != vVar) {
            return obj2;
        }
        synchronized (this.f4158f) {
            obj = this.f4157e;
            if (obj == vVar) {
                InterfaceC0422a interfaceC0422a = this.f4156d;
                f2.j.c(interfaceC0422a);
                obj = interfaceC0422a.b();
                this.f4157e = obj;
                this.f4156d = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f4157e != v.f4168a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

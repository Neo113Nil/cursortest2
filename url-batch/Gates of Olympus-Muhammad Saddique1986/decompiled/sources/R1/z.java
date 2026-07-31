package R1;

import e2.InterfaceC0422a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class z implements f, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0422a f4172d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4173e;

    @Override // R1.f
    public final Object getValue() {
        if (this.f4173e == v.f4168a) {
            InterfaceC0422a interfaceC0422a = this.f4172d;
            f2.j.c(interfaceC0422a);
            this.f4173e = interfaceC0422a.b();
            this.f4172d = null;
        }
        return this.f4173e;
    }

    public final String toString() {
        return this.f4173e != v.f4168a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

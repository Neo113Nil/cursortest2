package S0;

import a1.InterfaceC0058a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0058a f770a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f771b = d.f773b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f772c = this;

    public c(InterfaceC0058a interfaceC0058a) {
        this.f770a = interfaceC0058a;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f771b;
        d dVar = d.f773b;
        if (obj2 != dVar) {
            return obj2;
        }
        synchronized (this.f772c) {
            obj = this.f771b;
            if (obj == dVar) {
                InterfaceC0058a interfaceC0058a = this.f770a;
                b1.d.b(interfaceC0058a);
                obj = interfaceC0058a.a();
                this.f771b = obj;
                this.f770a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f771b != d.f773b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

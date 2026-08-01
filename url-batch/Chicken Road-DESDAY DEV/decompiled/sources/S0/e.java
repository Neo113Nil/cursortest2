package S0;

import a1.InterfaceC0059a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0059a f755a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f756b = f.f758b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f757c = this;

    public e(InterfaceC0059a interfaceC0059a) {
        this.f755a = interfaceC0059a;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f756b;
        f fVar = f.f758b;
        if (obj2 != fVar) {
            return obj2;
        }
        synchronized (this.f757c) {
            obj = this.f756b;
            if (obj == fVar) {
                InterfaceC0059a interfaceC0059a = this.f755a;
                b1.d.b(interfaceC0059a);
                obj = interfaceC0059a.a();
                this.f756b = obj;
                this.f755a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f756b != f.f758b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

package R0;

import c1.InterfaceC0085a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0085a f776a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f777b = f.f779b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f778c = this;

    public e(InterfaceC0085a interfaceC0085a) {
        this.f776a = interfaceC0085a;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f777b;
        f fVar = f.f779b;
        if (obj2 != fVar) {
            return obj2;
        }
        synchronized (this.f778c) {
            obj = this.f777b;
            if (obj == fVar) {
                InterfaceC0085a interfaceC0085a = this.f776a;
                d1.d.b(interfaceC0085a);
                obj = interfaceC0085a.b();
                this.f777b = obj;
                this.f776a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f777b != f.f779b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

package V0;

import g1.InterfaceC0110a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0110a f942a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f943b = e.f945b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f944c = this;

    public d(InterfaceC0110a interfaceC0110a) {
        this.f942a = interfaceC0110a;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f943b;
        e eVar = e.f945b;
        if (obj2 != eVar) {
            return obj2;
        }
        synchronized (this.f944c) {
            obj = this.f943b;
            if (obj == eVar) {
                InterfaceC0110a interfaceC0110a = this.f942a;
                h1.d.b(interfaceC0110a);
                obj = interfaceC0110a.b();
                this.f943b = obj;
                this.f942a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f943b != e.f945b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

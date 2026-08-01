package V0;

import d1.InterfaceC0081a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0081a f874a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f875b = e.f877b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f876c = this;

    public d(InterfaceC0081a interfaceC0081a) {
        this.f874a = interfaceC0081a;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f875b;
        e eVar = e.f877b;
        if (obj2 != eVar) {
            return obj2;
        }
        synchronized (this.f876c) {
            obj = this.f875b;
            if (obj == eVar) {
                InterfaceC0081a interfaceC0081a = this.f874a;
                e1.d.b(interfaceC0081a);
                obj = interfaceC0081a.a();
                this.f875b = obj;
                this.f874a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f875b != e.f877b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

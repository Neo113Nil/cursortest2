package W0;

import f1.InterfaceC0099a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0099a f952a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f953b = e.f955b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f954c = this;

    public d(InterfaceC0099a interfaceC0099a) {
        this.f952a = interfaceC0099a;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f953b;
        e eVar = e.f955b;
        if (obj2 != eVar) {
            return obj2;
        }
        synchronized (this.f954c) {
            obj = this.f953b;
            if (obj == eVar) {
                InterfaceC0099a interfaceC0099a = this.f952a;
                g1.d.b(interfaceC0099a);
                obj = interfaceC0099a.a();
                this.f953b = obj;
                this.f952a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f953b != e.f955b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

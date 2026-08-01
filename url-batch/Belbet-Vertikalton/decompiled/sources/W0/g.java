package W0;

import i1.InterfaceC0181a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class g implements b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0181a f1341a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f1342b = h.f1344a;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1343c = this;

    public g(InterfaceC0181a interfaceC0181a) {
        this.f1341a = interfaceC0181a;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f1342b;
        h hVar = h.f1344a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f1343c) {
            obj = this.f1342b;
            if (obj == hVar) {
                InterfaceC0181a interfaceC0181a = this.f1341a;
                j1.h.b(interfaceC0181a);
                obj = interfaceC0181a.c();
                this.f1342b = obj;
                this.f1341a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f1342b != h.f1344a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

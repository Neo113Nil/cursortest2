package X0;

import j1.InterfaceC0170a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class f implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0170a f1273a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f1274b = g.f1276b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1275c = this;

    public f(InterfaceC0170a interfaceC0170a) {
        this.f1273a = interfaceC0170a;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f1274b;
        g gVar = g.f1276b;
        if (obj2 != gVar) {
            return obj2;
        }
        synchronized (this.f1275c) {
            obj = this.f1274b;
            if (obj == gVar) {
                InterfaceC0170a interfaceC0170a = this.f1273a;
                k1.e.b(interfaceC0170a);
                obj = interfaceC0170a.c();
                this.f1274b = obj;
                this.f1273a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f1274b != g.f1276b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

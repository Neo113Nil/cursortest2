package d6;

import java.io.Serializable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o implements g, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public q6.a f2624f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f2625g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2626h;

    public o(q6.a aVar) {
        r6.k.f(aVar, "initializer");
        this.f2624f = aVar;
        this.f2625g = w.f2636a;
        this.f2626h = this;
    }

    @Override // d6.g
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f2625g;
        w wVar = w.f2636a;
        if (obj2 != wVar) {
            return obj2;
        }
        synchronized (this.f2626h) {
            obj = this.f2625g;
            if (obj == wVar) {
                q6.a aVar = this.f2624f;
                r6.k.c(aVar);
                obj = aVar.a();
                this.f2625g = obj;
                this.f2624f = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f2625g != w.f2636a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

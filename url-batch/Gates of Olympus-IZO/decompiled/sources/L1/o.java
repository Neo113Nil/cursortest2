package L1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class o implements g, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Y1.a f2714d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f2715e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2716f;

    public o(Y1.a aVar) {
        Z1.i.f(aVar, "initializer");
        this.f2714d = aVar;
        this.f2715e = w.f2726a;
        this.f2716f = this;
    }

    @Override // L1.g
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f2715e;
        w wVar = w.f2726a;
        if (obj2 != wVar) {
            return obj2;
        }
        synchronized (this.f2716f) {
            obj = this.f2715e;
            if (obj == wVar) {
                Y1.a aVar = this.f2714d;
                Z1.i.c(aVar);
                obj = aVar.b();
                this.f2715e = obj;
                this.f2714d = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f2715e != w.f2726a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

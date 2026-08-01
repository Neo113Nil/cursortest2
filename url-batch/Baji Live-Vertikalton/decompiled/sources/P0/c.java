package P0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public W0.a f622a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f623b = d.f625b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f624c = this;

    public c(W0.a aVar) {
        this.f622a = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f623b;
        d dVar = d.f625b;
        if (obj2 != dVar) {
            return obj2;
        }
        synchronized (this.f624c) {
            obj = this.f623b;
            if (obj == dVar) {
                W0.a aVar = this.f622a;
                X0.e.b(aVar);
                obj = aVar.a();
                this.f623b = obj;
                this.f622a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f623b != d.f625b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

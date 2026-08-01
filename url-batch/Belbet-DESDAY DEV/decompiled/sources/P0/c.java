package P0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public W0.a f623a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f624b = d.f626b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f625c = this;

    public c(W0.a aVar) {
        this.f623a = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f624b;
        d dVar = d.f626b;
        if (obj2 != dVar) {
            return obj2;
        }
        synchronized (this.f625c) {
            obj = this.f624b;
            if (obj == dVar) {
                W0.a aVar = this.f623a;
                X0.d.b(aVar);
                obj = aVar.a();
                this.f624b = obj;
                this.f623a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f624b != d.f626b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

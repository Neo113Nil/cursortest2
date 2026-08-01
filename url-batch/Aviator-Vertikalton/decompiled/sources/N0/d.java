package N0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public W0.a f672a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f673b = e.f675b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f674c = this;

    public d(W0.a aVar) {
        this.f672a = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f673b;
        e eVar = e.f675b;
        if (obj2 != eVar) {
            return obj2;
        }
        synchronized (this.f674c) {
            obj = this.f673b;
            if (obj == eVar) {
                W0.a aVar = this.f672a;
                X0.f.b(aVar);
                obj = aVar.a();
                this.f673b = obj;
                this.f672a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f673b != e.f675b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

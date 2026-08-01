package N0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public W0.a f673a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f674b = f.f676b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f675c = this;

    public e(W0.a aVar) {
        this.f673a = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f674b;
        f fVar = f.f676b;
        if (obj2 != fVar) {
            return obj2;
        }
        synchronized (this.f675c) {
            obj = this.f674b;
            if (obj == fVar) {
                W0.a aVar = this.f673a;
                X0.f.b(aVar);
                obj = aVar.a();
                this.f674b = obj;
                this.f673a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f674b != f.f676b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

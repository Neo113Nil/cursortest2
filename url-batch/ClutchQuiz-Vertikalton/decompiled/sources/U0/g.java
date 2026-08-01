package U0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class g implements b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public f1.a f860a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f861b = h.f863a;

    /* renamed from: c, reason: collision with root package name */
    public final Object f862c = this;

    public g(f1.a aVar) {
        this.f860a = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f861b;
        h hVar = h.f863a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f862c) {
            obj = this.f861b;
            if (obj == hVar) {
                f1.a aVar = this.f860a;
                g1.f.b(aVar);
                obj = aVar.c();
                this.f861b = obj;
                this.f860a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f861b != h.f863a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

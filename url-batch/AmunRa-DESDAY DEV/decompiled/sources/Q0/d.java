package Q0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Y0.a f690a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f691b = e.f693b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f692c = this;

    public d(Y0.a aVar) {
        this.f690a = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f691b;
        e eVar = e.f693b;
        if (obj2 != eVar) {
            return obj2;
        }
        synchronized (this.f692c) {
            obj = this.f691b;
            if (obj == eVar) {
                Y0.a aVar = this.f690a;
                Z0.d.b(aVar);
                obj = aVar.a();
                this.f691b = obj;
                this.f690a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f691b != e.f693b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

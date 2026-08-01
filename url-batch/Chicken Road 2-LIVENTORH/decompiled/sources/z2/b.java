package z2;

import java.io.Serializable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public e3.a f3881f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f3882g = d.f3887b;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3883h = this;

    public b(e3.a aVar) {
        this.f3881f = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f3882g;
        d dVar = d.f3887b;
        if (obj2 != dVar) {
            return obj2;
        }
        synchronized (this.f3883h) {
            obj = this.f3882g;
            if (obj == dVar) {
                e3.a aVar = this.f3881f;
                f3.d.b(aVar);
                obj = aVar.a();
                this.f3882g = obj;
                this.f3881f = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f3882g != d.f3887b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

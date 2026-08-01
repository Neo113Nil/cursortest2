package w2;

import java.io.Serializable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public h3.a f3817f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Object f3818g = d.f3819b;
    public final Object h = this;

    public c(h3.a aVar) {
        this.f3817f = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f3818g;
        d dVar = d.f3819b;
        if (obj2 != dVar) {
            return obj2;
        }
        synchronized (this.h) {
            obj = this.f3818g;
            if (obj == dVar) {
                h3.a aVar = this.f3817f;
                i3.d.b(aVar);
                obj = aVar.a();
                this.f3818g = obj;
                this.f3817f = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f3818g != d.f3819b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

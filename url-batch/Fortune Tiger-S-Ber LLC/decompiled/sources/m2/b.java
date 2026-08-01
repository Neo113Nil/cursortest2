package m2;

import java.io.Serializable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public t2.a f2915f;
    public volatile Object g = c.f2916b;
    public final Object h = this;

    public b(t2.a aVar) {
        this.f2915f = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.g;
        c cVar = c.f2916b;
        if (obj2 != cVar) {
            return obj2;
        }
        synchronized (this.h) {
            obj = this.g;
            if (obj == cVar) {
                t2.a aVar = this.f2915f;
                u2.c.b(aVar);
                obj = aVar.a();
                this.g = obj;
                this.f2915f = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.g != c.f2916b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

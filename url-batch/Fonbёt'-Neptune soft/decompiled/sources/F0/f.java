package F0;

import Q0.i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class f implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public i f465e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f466f = g.f468a;

    /* renamed from: g, reason: collision with root package name */
    public final Object f467g = this;

    /* JADX WARN: Multi-variable type inference failed */
    public f(P0.a aVar) {
        this.f465e = (i) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [P0.a, Q0.i, java.lang.Object] */
    public final Object a() {
        Object obj;
        Object obj2 = this.f466f;
        g gVar = g.f468a;
        if (obj2 != gVar) {
            return obj2;
        }
        synchronized (this.f467g) {
            obj = this.f466f;
            if (obj == gVar) {
                ?? r1 = this.f465e;
                Q0.h.b(r1);
                obj = r1.g();
                this.f466f = obj;
                this.f465e = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f466f != g.f468a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

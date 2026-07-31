package D0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class f implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public O0.a f202e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f203f = g.f205a;

    /* renamed from: g, reason: collision with root package name */
    public final Object f204g = this;

    public f(O0.a aVar) {
        this.f202e = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f203f;
        g gVar = g.f205a;
        if (obj2 != gVar) {
            return obj2;
        }
        synchronized (this.f204g) {
            obj = this.f203f;
            if (obj == gVar) {
                O0.a aVar = this.f202e;
                P0.h.b(aVar);
                obj = aVar.h();
                this.f203f = obj;
                this.f202e = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f203f != g.f205a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

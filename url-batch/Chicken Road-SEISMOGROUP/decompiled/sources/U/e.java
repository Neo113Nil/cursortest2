package U;

import e0.h;
import e0.i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public i f429b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f430c = f.f432a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f431d = this;

    /* JADX WARN: Multi-variable type inference failed */
    public e(d0.a aVar) {
        this.f429b = (i) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [d0.a, e0.i, java.lang.Object] */
    public final Object a() {
        Object obj;
        Object obj2 = this.f430c;
        f fVar = f.f432a;
        if (obj2 != fVar) {
            return obj2;
        }
        synchronized (this.f431d) {
            obj = this.f430c;
            if (obj == fVar) {
                ?? r1 = this.f429b;
                h.b(r1);
                obj = r1.a();
                this.f430c = obj;
                this.f429b = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f430c != f.f432a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

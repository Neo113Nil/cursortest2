package c6;

import java.io.Serializable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k implements d, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public p6.a f1753d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1754e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1755f;

    public k(p6.a aVar) {
        q6.i.e(aVar, "initializer");
        this.f1753d = aVar;
        this.f1754e = l.f1756a;
        this.f1755f = this;
    }

    @Override // c6.d
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f1754e;
        l lVar = l.f1756a;
        if (obj2 != lVar) {
            return obj2;
        }
        synchronized (this.f1755f) {
            obj = this.f1754e;
            if (obj == lVar) {
                p6.a aVar = this.f1753d;
                q6.i.b(aVar);
                obj = aVar.b();
                this.f1754e = obj;
                this.f1753d = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f1754e != l.f1756a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

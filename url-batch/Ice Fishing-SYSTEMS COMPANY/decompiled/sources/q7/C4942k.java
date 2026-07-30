package q7;

import java.io.Serializable;

/* renamed from: q7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4942k implements InterfaceC4936e, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public E7.a f40168n;

    /* renamed from: u, reason: collision with root package name */
    public volatile Object f40169u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f40170v;

    public C4942k(E7.a initializer) {
        kotlin.jvm.internal.h.e(initializer, "initializer");
        this.f40168n = initializer;
        this.f40169u = C4950s.f40180a;
        this.f40170v = this;
    }

    @Override // q7.InterfaceC4936e
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f40169u;
        C4950s c4950s = C4950s.f40180a;
        if (obj2 != c4950s) {
            return obj2;
        }
        synchronized (this.f40170v) {
            obj = this.f40169u;
            if (obj == c4950s) {
                E7.a aVar = this.f40168n;
                kotlin.jvm.internal.h.b(aVar);
                obj = aVar.invoke();
                this.f40169u = obj;
                this.f40168n = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f40169u != C4950s.f40180a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

package q7;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class w implements InterfaceC4936e, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public E7.a f40184n;

    /* renamed from: u, reason: collision with root package name */
    public Object f40185u;

    @Override // q7.InterfaceC4936e
    public final Object getValue() {
        if (this.f40185u == C4950s.f40180a) {
            E7.a aVar = this.f40184n;
            kotlin.jvm.internal.h.b(aVar);
            this.f40185u = aVar.invoke();
            this.f40184n = null;
        }
        return this.f40185u;
    }

    public final String toString() {
        return this.f40185u != C4950s.f40180a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

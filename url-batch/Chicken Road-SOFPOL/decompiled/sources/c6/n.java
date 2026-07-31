package c6;

import java.io.Serializable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n implements d, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public p6.a f1758d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1759e;

    @Override // c6.d
    public final Object getValue() {
        if (this.f1759e == l.f1756a) {
            p6.a aVar = this.f1758d;
            q6.i.b(aVar);
            this.f1759e = aVar.b();
            this.f1758d = null;
        }
        return this.f1759e;
    }

    public final String toString() {
        return this.f1759e != l.f1756a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

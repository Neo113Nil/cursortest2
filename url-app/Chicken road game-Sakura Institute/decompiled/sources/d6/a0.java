package d6;

import java.io.Serializable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 implements g, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public q6.a f2606f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2607g;

    @Override // d6.g
    public final Object getValue() {
        if (this.f2607g == w.f2636a) {
            q6.a aVar = this.f2606f;
            r6.k.c(aVar);
            this.f2607g = aVar.a();
            this.f2606f = null;
        }
        return this.f2607g;
    }

    public final String toString() {
        return this.f2607g != w.f2636a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

package L1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class A implements g, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Y1.a f2697d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2698e;

    @Override // L1.g
    public final Object getValue() {
        if (this.f2698e == w.f2726a) {
            Y1.a aVar = this.f2697d;
            Z1.i.c(aVar);
            this.f2698e = aVar.b();
            this.f2697d = null;
        }
        return this.f2698e;
    }

    public final String toString() {
        return this.f2698e != w.f2726a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

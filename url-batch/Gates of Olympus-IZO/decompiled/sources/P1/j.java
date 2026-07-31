package P1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final j f3073d = new j();

    public final int hashCode() {
        return 0;
    }

    @Override // P1.i
    public final g k(h hVar) {
        Z1.i.f(hVar, "key");
        return null;
    }

    @Override // P1.i
    public final i o(i iVar) {
        Z1.i.f(iVar, "context");
        return iVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // P1.i
    public final i x(h hVar) {
        Z1.i.f(hVar, "key");
        return this;
    }

    @Override // P1.i
    public final Object r(Object obj, Y1.e eVar) {
        return obj;
    }
}

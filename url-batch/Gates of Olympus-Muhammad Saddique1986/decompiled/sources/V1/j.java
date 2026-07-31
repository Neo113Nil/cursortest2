package V1;

import e2.InterfaceC0426e;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final j f4558d = new j();

    @Override // V1.i
    public final i d(i iVar) {
        f2.j.f(iVar, "context");
        return iVar;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // V1.i
    public final i l(h hVar) {
        f2.j.f(hVar, "key");
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // V1.i
    public final g v(h hVar) {
        f2.j.f(hVar, "key");
        return null;
    }

    @Override // V1.i
    public final Object e(Object obj, InterfaceC0426e interfaceC0426e) {
        return obj;
    }
}

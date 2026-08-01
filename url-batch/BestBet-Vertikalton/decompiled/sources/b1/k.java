package b1;

import j1.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class k implements j, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final k f2050a = new k();

    @Override // b1.j
    public final j d(i iVar) {
        k1.e.e(iVar, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // b1.j
    public final j j(j jVar) {
        k1.e.e(jVar, "context");
        return jVar;
    }

    @Override // b1.j
    public final Object k(Object obj, p pVar) {
        return obj;
    }

    @Override // b1.j
    public final h p(i iVar) {
        k1.e.e(iVar, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}

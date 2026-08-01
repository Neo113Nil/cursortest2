package androidx.lifecycle;

/* loaded from: classes.dex */
public interface S {
    default P a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default P b(X0.b bVar, Z.c cVar) {
        return c(q1.d.C(bVar), cVar);
    }

    default P c(Class cls, Z.c cVar) {
        return a(cls);
    }
}

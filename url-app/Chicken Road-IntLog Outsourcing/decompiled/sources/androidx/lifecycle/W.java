package androidx.lifecycle;

/* loaded from: classes.dex */
public interface W {
    default T a(Class cls, S.c cVar) {
        return b(cls);
    }

    default T b(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }
}

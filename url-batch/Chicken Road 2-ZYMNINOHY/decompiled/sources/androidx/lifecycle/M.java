package androidx.lifecycle;

/* loaded from: classes.dex */
public interface M {
    default J a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    default J b(Class cls, R.c cVar) {
        return a(cls);
    }
}

package androidx.lifecycle;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface w0 {
    default u0 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default u0 b(wd.h hVar, k4.e eVar) {
        Class a9 = hVar.a();
        a9.getClass();
        return c(a9, eVar);
    }

    default u0 c(Class cls, k4.e eVar) {
        return a(cls);
    }
}

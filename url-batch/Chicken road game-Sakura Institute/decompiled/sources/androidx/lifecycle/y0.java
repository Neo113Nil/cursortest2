package androidx.lifecycle;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface y0 {
    default w0 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default w0 b(r6.d dVar, q3.b bVar) {
        return c(r4.a.F(dVar), bVar);
    }

    default w0 c(Class cls, q3.b bVar) {
        return a(cls);
    }
}

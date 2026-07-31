package androidx.lifecycle;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public interface t0 {
    default r0 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default r0 b(q6.e eVar, l4.e eVar2) {
        return c(m.a.A(eVar), eVar2);
    }

    default r0 c(Class cls, l4.e eVar) {
        return a(cls);
    }
}

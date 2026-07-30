package e5;

import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface d {
    default Object a(Class cls) {
        return d(t.a(cls));
    }

    z5.b b(t tVar);

    z5.b c(t tVar);

    default Object d(t tVar) {
        z5.b b9 = b(tVar);
        if (b9 == null) {
            return null;
        }
        return b9.get();
    }

    default z5.b e(Class cls) {
        return b(t.a(cls));
    }

    default Set f(t tVar) {
        return (Set) c(tVar).get();
    }

    r g(t tVar);

    default r h(Class cls) {
        return g(t.a(cls));
    }
}

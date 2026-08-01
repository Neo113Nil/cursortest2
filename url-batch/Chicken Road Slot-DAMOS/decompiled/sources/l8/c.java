package l8;

import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface c {
    default Object a(Class cls) {
        return d(r.a(cls));
    }

    w8.a c(r rVar);

    default Object d(r rVar) {
        w8.a c10 = c(rVar);
        if (c10 == null) {
            return null;
        }
        return c10.get();
    }

    default Set e(r rVar) {
        return (Set) g(rVar).get();
    }

    default w8.a f(Class cls) {
        return c(r.a(cls));
    }

    w8.a g(r rVar);
}

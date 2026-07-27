package Z1;

import java.util.Set;
import u2.InterfaceC1229b;

/* loaded from: classes.dex */
public interface c {
    default Object a(Class cls) {
        return f(t.a(cls));
    }

    default InterfaceC1229b b(Class cls) {
        return e(t.a(cls));
    }

    InterfaceC1229b c(t tVar);

    default Set d(t tVar) {
        return (Set) c(tVar).get();
    }

    InterfaceC1229b e(t tVar);

    default Object f(t tVar) {
        InterfaceC1229b e4 = e(tVar);
        if (e4 == null) {
            return null;
        }
        return e4.get();
    }

    r g(t tVar);

    default r h(Class cls) {
        return g(t.a(cls));
    }
}

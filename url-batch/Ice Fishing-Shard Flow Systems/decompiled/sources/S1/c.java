package S1;

import e2.InterfaceC0372a;
import java.util.Set;

/* loaded from: classes.dex */
public interface c {
    default Object a(Class cls) {
        return d(r.a(cls));
    }

    default Set b(r rVar) {
        return (Set) c(rVar).get();
    }

    InterfaceC0372a c(r rVar);

    default Object d(r rVar) {
        InterfaceC0372a f7 = f(rVar);
        if (f7 == null) {
            return null;
        }
        return f7.get();
    }

    default InterfaceC0372a e(Class cls) {
        return f(r.a(cls));
    }

    InterfaceC0372a f(r rVar);
}

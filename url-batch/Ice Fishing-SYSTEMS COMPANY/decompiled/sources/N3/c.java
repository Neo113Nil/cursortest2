package N3;

import java.util.Set;

/* loaded from: classes2.dex */
public interface c {
    default Object a(Class cls) {
        return e(r.a(cls));
    }

    default Set b(r rVar) {
        return (Set) d(rVar).get();
    }

    default Y3.a c(Class cls) {
        return f(r.a(cls));
    }

    Y3.a d(r rVar);

    default Object e(r rVar) {
        Y3.a f6 = f(rVar);
        if (f6 == null) {
            return null;
        }
        return f6.get();
    }

    Y3.a f(r rVar);
}

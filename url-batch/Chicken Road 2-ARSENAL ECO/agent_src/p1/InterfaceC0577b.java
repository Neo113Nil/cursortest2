package p1;

import java.util.Set;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0577b {
    default Object a(Class cls) {
        return e(o.a(cls));
    }

    default Set b(o oVar) {
        return (Set) f(oVar).get();
    }

    default A1.a c(Class cls) {
        return d(o.a(cls));
    }

    A1.a d(o oVar);

    default Object e(o oVar) {
        A1.a d7 = d(oVar);
        if (d7 == null) {
            return null;
        }
        return d7.get();
    }

    A1.a f(o oVar);
}

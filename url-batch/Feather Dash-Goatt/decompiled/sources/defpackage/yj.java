package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public interface yj {
    default Object a(Class cls) {
        return f(v01.a(cls));
    }

    p01 b(v01 v01Var);

    default Set c(v01 v01Var) {
        return (Set) b(v01Var).get();
    }

    default p01 d(Class cls) {
        return e(v01.a(cls));
    }

    p01 e(v01 v01Var);

    default Object f(v01 v01Var) {
        p01 e = e(v01Var);
        if (e == null) {
            return null;
        }
        return e.get();
    }
}

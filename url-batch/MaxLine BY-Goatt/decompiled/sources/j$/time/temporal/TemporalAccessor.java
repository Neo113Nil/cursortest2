package j$.time.temporal;

import j$.time.a0;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public interface TemporalAccessor {
    default Object b(a0 a0Var) {
        if (a0Var == r.a || a0Var == r.b || a0Var == r.c) {
            return null;
        }
        return a0Var.j(this);
    }

    default int e(q qVar) {
        u k = k(qVar);
        if (!k.d()) {
            throw new t("Invalid field " + qVar + " for get() method, use getLong() instead");
        }
        long g = g(qVar);
        if (k.e(g)) {
            return (int) g;
        }
        throw new j$.time.c("Invalid value for " + qVar + " (valid values " + k + "): " + g);
    }

    boolean f(q qVar);

    long g(q qVar);

    default u k(q qVar) {
        if (!(qVar instanceof a)) {
            Objects.requireNonNull(qVar, "field");
            return qVar.B(this);
        }
        if (f(qVar)) {
            return ((a) qVar).b;
        }
        throw new t(j$.time.d.a("Unsupported field: ", qVar));
    }
}

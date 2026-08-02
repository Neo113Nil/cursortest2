package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hfu implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;
    final Object[] b;

    public hfu(Comparator comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    Object readResolve() {
        hft hftVar = new hft(this.a);
        hftVar.n(this.b);
        return hftVar.g();
    }
}

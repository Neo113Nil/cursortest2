package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hej implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public hej(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return hel.p(this.a);
    }
}

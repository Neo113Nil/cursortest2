package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hfl implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public hfl(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return hfm.o(this.a);
    }
}

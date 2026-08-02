package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hes implements Serializable {
    private static final long serialVersionUID = 0;
    final her a;

    public hes(her herVar) {
        this.a = herVar;
    }

    Object readResolve() {
        return this.a.entrySet();
    }
}

package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hey implements Serializable {
    private static final long serialVersionUID = 0;
    final her a;

    public hey(her herVar) {
        this.a = herVar;
    }

    Object readResolve() {
        return this.a.values();
    }
}

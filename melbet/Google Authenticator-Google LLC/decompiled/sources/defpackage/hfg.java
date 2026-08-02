package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hfg implements Serializable {
    final hfh a;

    public hfg(hfh hfhVar) {
        this.a = hfhVar;
    }

    Object readResolve() {
        return this.a.j();
    }
}

package defpackage;

import java.io.Serializable;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hec implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumMap a;

    public hec(EnumMap enumMap) {
        this.a = enumMap;
    }

    Object readResolve() {
        return new hed(this.a);
    }
}

package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hpg implements Serializable {
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;

    public hpg(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private Object readResolve() {
        return new hph(this.a, this.b);
    }
}

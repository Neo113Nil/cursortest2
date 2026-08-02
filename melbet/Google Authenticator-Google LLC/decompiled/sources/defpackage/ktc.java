package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ktc implements Serializable {
    public static final ktc a = new ktc();
    private static final long serialVersionUID = 0;

    private ktc() {
    }

    private final Object readResolve() {
        return kte.a;
    }
}

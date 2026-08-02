package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ksg implements Serializable {
    public static final ksg a = new ksg();

    private ksg() {
    }

    private Object readResolve() {
        return a;
    }
}

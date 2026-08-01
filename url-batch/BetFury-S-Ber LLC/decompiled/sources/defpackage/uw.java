package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class uw implements es, Serializable {
    @Override // defpackage.es
    public final int b() {
        return 0;
    }

    public final String toString() {
        b90.a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}

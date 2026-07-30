package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ai0 {
    public static final ai0 b = new ai0(new gz2((fk0) null, (ap) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 63));
    public final gz2 a;

    public ai0(gz2 gz2Var) {
        this.a = gz2Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ai0) && ((ai0) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        fk0 fk0Var = this.a.a;
        sb.append(fk0Var != null ? fk0Var.toString() : null);
        sb.append(",\nSlide - null,\nShrink - null,\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}

package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gzq implements Serializable {
    private static final long serialVersionUID = 747826592375603043L;
    public final Object a;
    public final Object b;

    public gzq(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gzq) {
            gzq gzqVar = (gzq) obj;
            if (Objects.equals(this.a, gzqVar.a) && Objects.equals(this.b, gzqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (hashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        Object obj = this.b;
        return "(" + String.valueOf(this.a) + ", " + String.valueOf(obj) + ")";
    }
}

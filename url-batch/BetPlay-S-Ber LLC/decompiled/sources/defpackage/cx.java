package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class cx implements Serializable {
    public final Object f;
    public final Object g;

    public cx(Object obj, Object obj2) {
        this.f = obj;
        this.g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx)) {
            return false;
        }
        cx cxVar = (cx) obj;
        return op.d(this.f, cxVar.f) && op.d(this.g, cxVar.g);
    }

    public final int hashCode() {
        Object obj = this.f;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.g;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f + ", " + this.g + ')';
    }
}

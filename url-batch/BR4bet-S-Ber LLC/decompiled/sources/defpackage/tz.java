package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class tz implements Serializable {
    public final Object f;
    public final Object g;

    public tz(Object obj, Object obj2) {
        this.f = obj;
        this.g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz)) {
            return false;
        }
        tz tzVar = (tz) obj;
        return kr.b(this.f, tzVar.f) && kr.b(this.g, tzVar.g);
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

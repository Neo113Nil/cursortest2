package m2;

import java.io.Serializable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Object f2914f;
    public final Object g;

    public a(Object obj, Object obj2) {
        this.f2914f = obj;
        this.g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return u2.c.a(this.f2914f, aVar.f2914f) && u2.c.a(this.g, aVar.g);
    }

    public final int hashCode() {
        Object obj = this.f2914f;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.g;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2914f + ", " + this.g + ')';
    }
}

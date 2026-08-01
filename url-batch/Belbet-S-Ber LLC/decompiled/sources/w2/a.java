package w2;

import java.io.Serializable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Object f3814f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3815g;

    public a(Object obj, Object obj2) {
        this.f3814f = obj;
        this.f3815g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i3.d.a(this.f3814f, aVar.f3814f) && i3.d.a(this.f3815g, aVar.f3815g);
    }

    public final int hashCode() {
        Object obj = this.f3814f;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f3815g;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f3814f + ", " + this.f3815g + ')';
    }
}

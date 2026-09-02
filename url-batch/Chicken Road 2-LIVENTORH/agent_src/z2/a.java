package z2;

import java.io.Serializable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Object f3879f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3880g;

    public a(Object obj, Object obj2) {
        this.f3879f = obj;
        this.f3880g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f3.d.a(this.f3879f, aVar.f3879f) && f3.d.a(this.f3880g, aVar.f3880g);
    }

    public final int hashCode() {
        Object obj = this.f3879f;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f3880g;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f3879f + ", " + this.f3880g + ')';
    }
}

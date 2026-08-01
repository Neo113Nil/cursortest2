package z2;

import java.io.Serializable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final String f3884f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f3885g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f3886h;

    public c(String str, Integer num, Integer num2) {
        this.f3884f = str;
        this.f3885g = num;
        this.f3886h = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3884f.equals(cVar.f3884f) && this.f3885g.equals(cVar.f3885g) && this.f3886h.equals(cVar.f3886h);
    }

    public final int hashCode() {
        return this.f3886h.hashCode() + ((this.f3885g.hashCode() + (this.f3884f.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "(" + ((Object) this.f3884f) + ", " + this.f3885g + ", " + this.f3886h + ')';
    }
}

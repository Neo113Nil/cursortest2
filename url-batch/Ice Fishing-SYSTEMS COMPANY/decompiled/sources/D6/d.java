package D6;

import Y5.n;
import java.util.List;

/* loaded from: classes2.dex */
public final class d extends Y5.f {

    /* renamed from: w, reason: collision with root package name */
    public static final c f713w;

    /* renamed from: v, reason: collision with root package name */
    public final List f714v;

    static {
        Y5.d dVar = Y5.d.f3983u;
        n nVar = n.f4023u;
        f713w = new c(d.class);
    }

    public d(Z5.d dVar, u8.h hVar) {
        super(f713w, hVar);
        this.f714v = com.bumptech.glide.f.k("values", dVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return a().equals(dVar.a()) && this.f714v.equals(dVar.f714v);
    }

    public final int hashCode() {
        int i = this.f3992u;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f714v.hashCode() + (a().hashCode() * 37);
        this.f3992u = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f714v;
        if (!list.isEmpty()) {
            sb.append(", values=");
            sb.append(list);
        }
        StringBuilder replace = sb.replace(0, 2, "ArrayValue{");
        replace.append('}');
        return replace.toString();
    }
}

package F6;

import Y5.d;
import Y5.f;
import Y5.n;
import java.util.List;
import u8.h;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: y, reason: collision with root package name */
    public static final a f1137y;

    /* renamed from: v, reason: collision with root package name */
    public final List f1138v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1139w;

    /* renamed from: x, reason: collision with root package name */
    public final List f1140x;

    static {
        d dVar = d.f3983u;
        n nVar = n.f4023u;
        f1137y = new a(b.class);
    }

    public b(Z5.d dVar, int i, Z5.d dVar2, h hVar) {
        super(f1137y, hVar);
        this.f1138v = com.bumptech.glide.f.k("attributes", dVar);
        this.f1139w = i;
        this.f1140x = com.bumptech.glide.f.k("entity_refs", dVar2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a().equals(bVar.a()) && this.f1138v.equals(bVar.f1138v) && com.bumptech.glide.f.f(Integer.valueOf(this.f1139w), Integer.valueOf(bVar.f1139w)) && this.f1140x.equals(bVar.f1140x);
    }

    public final int hashCode() {
        int i = this.f3992u;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f1140x.hashCode() + ((Integer.hashCode(this.f1139w) + ((this.f1138v.hashCode() + (a().hashCode() * 37)) * 37)) * 37);
        this.f3992u = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f1138v;
        if (!list.isEmpty()) {
            sb.append(", attributes=");
            sb.append(list);
        }
        sb.append(", dropped_attributes_count=");
        sb.append(this.f1139w);
        List list2 = this.f1140x;
        if (!list2.isEmpty()) {
            sb.append(", entity_refs=");
            sb.append(list2);
        }
        StringBuilder replace = sb.replace(0, 2, "Resource{");
        replace.append('}');
        return replace.toString();
    }
}

package D6;

import Y5.n;
import java.util.List;

/* loaded from: classes2.dex */
public final class h extends Y5.f {

    /* renamed from: z, reason: collision with root package name */
    public static final g f720z;

    /* renamed from: v, reason: collision with root package name */
    public final String f721v;

    /* renamed from: w, reason: collision with root package name */
    public final String f722w;

    /* renamed from: x, reason: collision with root package name */
    public final List f723x;

    /* renamed from: y, reason: collision with root package name */
    public final int f724y;

    static {
        Y5.d dVar = Y5.d.f3983u;
        n nVar = n.f4023u;
        f720z = new g(h.class);
    }

    public h(String str, String str2, Z5.d dVar, int i, u8.h hVar) {
        super(f720z, hVar);
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        }
        this.f721v = str;
        if (str2 == null) {
            throw new IllegalArgumentException("version == null");
        }
        this.f722w = str2;
        this.f723x = com.bumptech.glide.f.k("attributes", dVar);
        this.f724y = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return a().equals(hVar.a()) && com.bumptech.glide.f.f(this.f721v, hVar.f721v) && com.bumptech.glide.f.f(this.f722w, hVar.f722w) && this.f723x.equals(hVar.f723x) && com.bumptech.glide.f.f(Integer.valueOf(this.f724y), Integer.valueOf(hVar.f724y));
    }

    public final int hashCode() {
        int i = this.f3992u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f721v;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f722w;
        int hashCode3 = Integer.hashCode(this.f724y) + ((this.f723x.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37)) * 37);
        this.f3992u = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f721v;
        if (str != null) {
            sb.append(", name=");
            sb.append(com.bumptech.glide.f.n(str));
        }
        String str2 = this.f722w;
        if (str2 != null) {
            sb.append(", version=");
            sb.append(com.bumptech.glide.f.n(str2));
        }
        List list = this.f723x;
        if (!list.isEmpty()) {
            sb.append(", attributes=");
            sb.append(list);
        }
        sb.append(", dropped_attributes_count=");
        sb.append(this.f724y);
        StringBuilder replace = sb.replace(0, 2, "InstrumentationScope{");
        replace.append('}');
        return replace.toString();
    }
}

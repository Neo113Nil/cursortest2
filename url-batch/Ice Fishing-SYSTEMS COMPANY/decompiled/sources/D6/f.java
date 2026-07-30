package D6;

import Y5.n;
import java.util.List;
import r7.AbstractC4979j;

/* loaded from: classes2.dex */
public final class f extends Y5.f {

    /* renamed from: z, reason: collision with root package name */
    public static final e f715z;

    /* renamed from: v, reason: collision with root package name */
    public final String f716v;

    /* renamed from: w, reason: collision with root package name */
    public final String f717w;

    /* renamed from: x, reason: collision with root package name */
    public final List f718x;

    /* renamed from: y, reason: collision with root package name */
    public final List f719y;

    static {
        Y5.d dVar = Y5.d.f3983u;
        n nVar = n.f4023u;
        f715z = new e(f.class);
    }

    public f(String str, String str2, Z5.d dVar, Z5.d dVar2, u8.h hVar) {
        super(f715z, hVar);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f716v = str;
        if (str2 == null) {
            throw new IllegalArgumentException("type == null");
        }
        this.f717w = str2;
        this.f718x = com.bumptech.glide.f.k("id_keys", dVar);
        this.f719y = com.bumptech.glide.f.k("description_keys", dVar2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return a().equals(fVar.a()) && com.bumptech.glide.f.f(this.f716v, fVar.f716v) && com.bumptech.glide.f.f(this.f717w, fVar.f717w) && this.f718x.equals(fVar.f718x) && this.f719y.equals(fVar.f719y);
    }

    public final int hashCode() {
        int i = this.f3992u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f716v;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f717w;
        int hashCode3 = this.f719y.hashCode() + ((this.f718x.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37)) * 37);
        this.f3992u = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f716v;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(com.bumptech.glide.f.n(str));
        }
        String str2 = this.f717w;
        if (str2 != null) {
            sb.append(", type=");
            sb.append(com.bumptech.glide.f.n(str2));
        }
        List list = this.f718x;
        if (!list.isEmpty()) {
            sb.append(", id_keys=");
            sb.append(AbstractC4979j.K(list, null, "[", "]", Z5.b.f4277v, 25));
        }
        List list2 = this.f719y;
        if (!list2.isEmpty()) {
            sb.append(", description_keys=");
            sb.append(AbstractC4979j.K(list2, null, "[", "]", Z5.b.f4277v, 25));
        }
        StringBuilder replace = sb.replace(0, 2, "EntityRef{");
        replace.append('}');
        return replace.toString();
    }
}

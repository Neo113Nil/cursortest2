package E6;

import Y5.n;
import java.util.List;

/* loaded from: classes2.dex */
public final class f extends Y5.f {

    /* renamed from: y, reason: collision with root package name */
    public static final e f862y;

    /* renamed from: v, reason: collision with root package name */
    public final D6.h f863v;

    /* renamed from: w, reason: collision with root package name */
    public final List f864w;

    /* renamed from: x, reason: collision with root package name */
    public final String f865x;

    static {
        Y5.d dVar = Y5.d.f3983u;
        n nVar = n.f4023u;
        f862y = new e(f.class);
    }

    public f(D6.h hVar, Z5.d dVar, String str, u8.h hVar2) {
        super(f862y, hVar2);
        this.f863v = hVar;
        this.f864w = com.bumptech.glide.f.k("log_records", dVar);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f865x = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return a().equals(fVar.a()) && com.bumptech.glide.f.f(this.f863v, fVar.f863v) && this.f864w.equals(fVar.f864w) && com.bumptech.glide.f.f(this.f865x, fVar.f865x);
    }

    public final int hashCode() {
        int i = this.f3992u;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        D6.h hVar = this.f863v;
        int hashCode2 = (this.f864w.hashCode() + ((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 37)) * 37;
        String str = this.f865x;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.f3992u = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        D6.h hVar = this.f863v;
        if (hVar != null) {
            sb.append(", scope=");
            sb.append(hVar);
        }
        List list = this.f864w;
        if (!list.isEmpty()) {
            sb.append(", log_records=");
            sb.append(list);
        }
        String str = this.f865x;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(com.bumptech.glide.f.n(str));
        }
        StringBuilder replace = sb.replace(0, 2, "ScopeLogs{");
        replace.append('}');
        return replace.toString();
    }
}

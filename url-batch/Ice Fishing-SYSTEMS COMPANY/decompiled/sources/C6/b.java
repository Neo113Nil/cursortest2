package C6;

import Y5.d;
import Y5.f;
import Y5.n;
import java.util.List;
import u8.h;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: w, reason: collision with root package name */
    public static final a f488w;

    /* renamed from: v, reason: collision with root package name */
    public final List f489v;

    static {
        d dVar = d.f3983u;
        n nVar = n.f4023u;
        f488w = new a(b.class);
    }

    public b(Z5.d dVar, h hVar) {
        super(f488w, hVar);
        this.f489v = com.bumptech.glide.f.k("resource_logs", dVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a().equals(bVar.a()) && this.f489v.equals(bVar.f489v);
    }

    public final int hashCode() {
        int i = this.f3992u;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f489v.hashCode() + (a().hashCode() * 37);
        this.f3992u = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f489v;
        if (!list.isEmpty()) {
            sb.append(", resource_logs=");
            sb.append(list);
        }
        StringBuilder replace = sb.replace(0, 2, "ExportLogsServiceRequest{");
        replace.append('}');
        return replace.toString();
    }
}

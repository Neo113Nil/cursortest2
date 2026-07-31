package y4;

import java.util.List;
import n6.i;
import z3.m;

/* loaded from: classes.dex */
public final class f extends z3.f {

    /* renamed from: k, reason: collision with root package name */
    public static final e f6252k;

    /* renamed from: h, reason: collision with root package name */
    public final x4.h f6253h;

    /* renamed from: i, reason: collision with root package name */
    public final List f6254i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6255j;

    static {
        z3.d dVar = z3.d.f6297g;
        m mVar = m.f6336g;
        f6252k = new e(f.class);
    }

    public f(x4.h hVar, A3.d dVar, String str, i iVar) {
        super(f6252k, iVar);
        this.f6253h = hVar;
        this.f6254i = A3.c.R(dVar, "log_records");
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f6255j = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return a().equals(fVar.a()) && A3.c.O(this.f6253h, fVar.f6253h) && this.f6254i.equals(fVar.f6254i) && A3.c.O(this.f6255j, fVar.f6255j);
    }

    public final int hashCode() {
        int i7 = this.f6306g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = a().hashCode() * 37;
        x4.h hVar = this.f6253h;
        int hashCode2 = (this.f6254i.hashCode() + ((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 37)) * 37;
        String str = this.f6255j;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.f6306g = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        x4.h hVar = this.f6253h;
        if (hVar != null) {
            sb.append(", scope=");
            sb.append(hVar);
        }
        List list = this.f6254i;
        if (!list.isEmpty()) {
            sb.append(", log_records=");
            sb.append(list);
        }
        String str = this.f6255j;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(A3.c.b0(str));
        }
        StringBuilder replace = sb.replace(0, 2, "ScopeLogs{");
        replace.append('}');
        return replace.toString();
    }
}

package x4;

import java.util.List;
import l5.AbstractC0506j;
import z3.m;

/* loaded from: classes.dex */
public final class f extends z3.f {

    /* renamed from: l, reason: collision with root package name */
    public static final e f6208l;

    /* renamed from: h, reason: collision with root package name */
    public final String f6209h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6210i;

    /* renamed from: j, reason: collision with root package name */
    public final List f6211j;

    /* renamed from: k, reason: collision with root package name */
    public final List f6212k;

    static {
        z3.d dVar = z3.d.f6297g;
        m mVar = m.f6336g;
        f6208l = new e(f.class);
    }

    public f(String str, String str2, A3.d dVar, A3.d dVar2, n6.i iVar) {
        super(f6208l, iVar);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f6209h = str;
        if (str2 == null) {
            throw new IllegalArgumentException("type == null");
        }
        this.f6210i = str2;
        this.f6211j = A3.c.R(dVar, "id_keys");
        this.f6212k = A3.c.R(dVar2, "description_keys");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return a().equals(fVar.a()) && A3.c.O(this.f6209h, fVar.f6209h) && A3.c.O(this.f6210i, fVar.f6210i) && this.f6211j.equals(fVar.f6211j) && this.f6212k.equals(fVar.f6212k);
    }

    public final int hashCode() {
        int i7 = this.f6306g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f6209h;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f6210i;
        int hashCode3 = this.f6212k.hashCode() + ((this.f6211j.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37)) * 37);
        this.f6306g = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f6209h;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(A3.c.b0(str));
        }
        String str2 = this.f6210i;
        if (str2 != null) {
            sb.append(", type=");
            sb.append(A3.c.b0(str2));
        }
        List list = this.f6211j;
        if (!list.isEmpty()) {
            sb.append(", id_keys=");
            sb.append(AbstractC0506j.I(list, null, "[", "]", A3.b.f48f, 25));
        }
        List list2 = this.f6212k;
        if (!list2.isEmpty()) {
            sb.append(", description_keys=");
            sb.append(AbstractC0506j.I(list2, null, "[", "]", A3.b.f48f, 25));
        }
        StringBuilder replace = sb.replace(0, 2, "EntityRef{");
        replace.append('}');
        return replace.toString();
    }
}

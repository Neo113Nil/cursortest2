package x4;

import java.util.List;
import z3.m;

/* loaded from: classes.dex */
public final class h extends z3.f {

    /* renamed from: l, reason: collision with root package name */
    public static final g f6213l;

    /* renamed from: h, reason: collision with root package name */
    public final String f6214h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6215i;

    /* renamed from: j, reason: collision with root package name */
    public final List f6216j;

    /* renamed from: k, reason: collision with root package name */
    public final int f6217k;

    static {
        z3.d dVar = z3.d.f6297g;
        m mVar = m.f6336g;
        f6213l = new g(h.class);
    }

    public h(String str, String str2, A3.d dVar, int i7, n6.i iVar) {
        super(f6213l, iVar);
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        }
        this.f6214h = str;
        if (str2 == null) {
            throw new IllegalArgumentException("version == null");
        }
        this.f6215i = str2;
        this.f6216j = A3.c.R(dVar, "attributes");
        this.f6217k = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return a().equals(hVar.a()) && A3.c.O(this.f6214h, hVar.f6214h) && A3.c.O(this.f6215i, hVar.f6215i) && this.f6216j.equals(hVar.f6216j) && A3.c.O(Integer.valueOf(this.f6217k), Integer.valueOf(hVar.f6217k));
    }

    public final int hashCode() {
        int i7 = this.f6306g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f6214h;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f6215i;
        int hashCode3 = Integer.hashCode(this.f6217k) + ((this.f6216j.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37)) * 37);
        this.f6306g = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f6214h;
        if (str != null) {
            sb.append(", name=");
            sb.append(A3.c.b0(str));
        }
        String str2 = this.f6215i;
        if (str2 != null) {
            sb.append(", version=");
            sb.append(A3.c.b0(str2));
        }
        List list = this.f6216j;
        if (!list.isEmpty()) {
            sb.append(", attributes=");
            sb.append(list);
        }
        sb.append(", dropped_attributes_count=");
        sb.append(this.f6217k);
        StringBuilder replace = sb.replace(0, 2, "InstrumentationScope{");
        replace.append('}');
        return replace.toString();
    }
}

package y4;

import java.util.List;
import n6.i;
import z3.m;
import z4.C0774b;

/* renamed from: y4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765d extends z3.f {

    /* renamed from: k, reason: collision with root package name */
    public static final C0764c f6248k;

    /* renamed from: h, reason: collision with root package name */
    public final C0774b f6249h;

    /* renamed from: i, reason: collision with root package name */
    public final List f6250i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6251j;

    static {
        z3.d dVar = z3.d.f6297g;
        m mVar = m.f6336g;
        f6248k = new C0764c(C0765d.class);
    }

    public C0765d(C0774b c0774b, A3.d dVar, String str, i iVar) {
        super(f6248k, iVar);
        this.f6249h = c0774b;
        this.f6250i = A3.c.R(dVar, "scope_logs");
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f6251j = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0765d)) {
            return false;
        }
        C0765d c0765d = (C0765d) obj;
        return a().equals(c0765d.a()) && A3.c.O(this.f6249h, c0765d.f6249h) && this.f6250i.equals(c0765d.f6250i) && A3.c.O(this.f6251j, c0765d.f6251j);
    }

    public final int hashCode() {
        int i7 = this.f6306g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = a().hashCode() * 37;
        C0774b c0774b = this.f6249h;
        int hashCode2 = (this.f6250i.hashCode() + ((hashCode + (c0774b != null ? c0774b.hashCode() : 0)) * 37)) * 37;
        String str = this.f6251j;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.f6306g = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0774b c0774b = this.f6249h;
        if (c0774b != null) {
            sb.append(", resource=");
            sb.append(c0774b);
        }
        List list = this.f6250i;
        if (!list.isEmpty()) {
            sb.append(", scope_logs=");
            sb.append(list);
        }
        String str = this.f6251j;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(A3.c.b0(str));
        }
        StringBuilder replace = sb.replace(0, 2, "ResourceLogs{");
        replace.append('}');
        return replace.toString();
    }
}

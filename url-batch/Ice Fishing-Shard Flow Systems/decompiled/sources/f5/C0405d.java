package f5;

import T6.i;
import c4.AbstractC0300f;
import c4.EnumC0298d;
import c4.EnumC0307m;
import g5.C0451b;
import java.util.List;

/* renamed from: f5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405d extends AbstractC0300f {

    /* renamed from: n, reason: collision with root package name */
    public static final C0404c f4818n;

    /* renamed from: i, reason: collision with root package name */
    public final C0451b f4819i;

    /* renamed from: l, reason: collision with root package name */
    public final List f4820l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4821m;

    static {
        EnumC0298d enumC0298d = EnumC0298d.f4212e;
        EnumC0307m enumC0307m = EnumC0307m.f4251e;
        f4818n = new C0404c(C0405d.class);
    }

    public C0405d(C0451b c0451b, d4.d dVar, String str, i iVar) {
        super(f4818n, iVar);
        this.f4819i = c0451b;
        this.f4820l = V6.b.E("scope_logs", dVar);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f4821m = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0405d)) {
            return false;
        }
        C0405d c0405d = (C0405d) obj;
        return a().equals(c0405d.a()) && V6.b.z(this.f4819i, c0405d.f4819i) && this.f4820l.equals(c0405d.f4820l) && V6.b.z(this.f4821m, c0405d.f4821m);
    }

    public final int hashCode() {
        int i2 = this.f4221e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = a().hashCode() * 37;
        C0451b c0451b = this.f4819i;
        int hashCode2 = (this.f4820l.hashCode() + ((hashCode + (c0451b != null ? c0451b.hashCode() : 0)) * 37)) * 37;
        String str = this.f4821m;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.f4221e = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0451b c0451b = this.f4819i;
        if (c0451b != null) {
            sb.append(", resource=");
            sb.append(c0451b);
        }
        List list = this.f4820l;
        if (!list.isEmpty()) {
            sb.append(", scope_logs=");
            sb.append(list);
        }
        String str = this.f4821m;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(V6.b.M(str));
        }
        StringBuilder replace = sb.replace(0, 2, "ResourceLogs{");
        replace.append('}');
        return replace.toString();
    }
}

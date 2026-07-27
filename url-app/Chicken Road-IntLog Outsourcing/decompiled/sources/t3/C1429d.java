package t3;

import j5.i;
import java.util.List;
import m2.AbstractC1283f;
import m2.EnumC1281d;
import m2.EnumC1289l;
import n2.AbstractC1341c;
import n2.C1342d;
import u3.C1480b;

/* renamed from: t3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1429d extends AbstractC1283f {

    /* renamed from: f, reason: collision with root package name */
    public static final C1428c f11934f;

    /* renamed from: c, reason: collision with root package name */
    public final C1480b f11935c;

    /* renamed from: d, reason: collision with root package name */
    public final List f11936d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11937e;

    static {
        EnumC1281d enumC1281d = EnumC1281d.f11151b;
        EnumC1289l enumC1289l = EnumC1289l.f11190b;
        f11934f = new C1428c(C1429d.class);
    }

    public C1429d(C1480b c1480b, C1342d c1342d, String str, i iVar) {
        super(f11934f, iVar);
        this.f11935c = c1480b;
        this.f11936d = AbstractC1341c.u("scope_logs", c1342d);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f11937e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1429d)) {
            return false;
        }
        C1429d c1429d = (C1429d) obj;
        return a().equals(c1429d.a()) && AbstractC1341c.i(this.f11935c, c1429d.f11935c) && this.f11936d.equals(c1429d.f11936d) && AbstractC1341c.i(this.f11937e, c1429d.f11937e);
    }

    public final int hashCode() {
        int i2 = this.f11160b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = a().hashCode() * 37;
        C1480b c1480b = this.f11935c;
        int hashCode2 = (this.f11936d.hashCode() + ((hashCode + (c1480b != null ? c1480b.hashCode() : 0)) * 37)) * 37;
        String str = this.f11937e;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.f11160b = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C1480b c1480b = this.f11935c;
        if (c1480b != null) {
            sb.append(", resource=");
            sb.append(c1480b);
        }
        List list = this.f11936d;
        if (!list.isEmpty()) {
            sb.append(", scope_logs=");
            sb.append(list);
        }
        String str = this.f11937e;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(AbstractC1341c.C(str));
        }
        StringBuilder replace = sb.replace(0, 2, "ResourceLogs{");
        replace.append('}');
        return replace.toString();
    }
}

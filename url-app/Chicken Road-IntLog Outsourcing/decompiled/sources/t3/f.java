package t3;

import j5.i;
import java.util.List;
import m2.AbstractC1283f;
import m2.EnumC1281d;
import m2.EnumC1289l;
import n2.AbstractC1341c;
import n2.C1342d;

/* loaded from: classes.dex */
public final class f extends AbstractC1283f {

    /* renamed from: f, reason: collision with root package name */
    public static final e f11938f;

    /* renamed from: c, reason: collision with root package name */
    public final s3.h f11939c;

    /* renamed from: d, reason: collision with root package name */
    public final List f11940d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11941e;

    static {
        EnumC1281d enumC1281d = EnumC1281d.f11151b;
        EnumC1289l enumC1289l = EnumC1289l.f11190b;
        f11938f = new e(f.class);
    }

    public f(s3.h hVar, C1342d c1342d, String str, i iVar) {
        super(f11938f, iVar);
        this.f11939c = hVar;
        this.f11940d = AbstractC1341c.u("log_records", c1342d);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f11941e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return a().equals(fVar.a()) && AbstractC1341c.i(this.f11939c, fVar.f11939c) && this.f11940d.equals(fVar.f11940d) && AbstractC1341c.i(this.f11941e, fVar.f11941e);
    }

    public final int hashCode() {
        int i2 = this.f11160b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = a().hashCode() * 37;
        s3.h hVar = this.f11939c;
        int hashCode2 = (this.f11940d.hashCode() + ((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 37)) * 37;
        String str = this.f11941e;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.f11160b = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        s3.h hVar = this.f11939c;
        if (hVar != null) {
            sb.append(", scope=");
            sb.append(hVar);
        }
        List list = this.f11940d;
        if (!list.isEmpty()) {
            sb.append(", log_records=");
            sb.append(list);
        }
        String str = this.f11941e;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(AbstractC1341c.C(str));
        }
        StringBuilder replace = sb.replace(0, 2, "ScopeLogs{");
        replace.append('}');
        return replace.toString();
    }
}

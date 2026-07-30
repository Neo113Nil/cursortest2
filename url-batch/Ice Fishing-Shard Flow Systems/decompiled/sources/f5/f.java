package f5;

import T6.i;
import c4.AbstractC0300f;
import c4.EnumC0298d;
import c4.EnumC0307m;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends AbstractC0300f {

    /* renamed from: n, reason: collision with root package name */
    public static final e f4822n;

    /* renamed from: i, reason: collision with root package name */
    public final e5.h f4823i;

    /* renamed from: l, reason: collision with root package name */
    public final List f4824l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4825m;

    static {
        EnumC0298d enumC0298d = EnumC0298d.f4212e;
        EnumC0307m enumC0307m = EnumC0307m.f4251e;
        f4822n = new e(f.class);
    }

    public f(e5.h hVar, d4.d dVar, String str, i iVar) {
        super(f4822n, iVar);
        this.f4823i = hVar;
        this.f4824l = V6.b.E("log_records", dVar);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f4825m = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return a().equals(fVar.a()) && V6.b.z(this.f4823i, fVar.f4823i) && this.f4824l.equals(fVar.f4824l) && V6.b.z(this.f4825m, fVar.f4825m);
    }

    public final int hashCode() {
        int i2 = this.f4221e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = a().hashCode() * 37;
        e5.h hVar = this.f4823i;
        int hashCode2 = (this.f4824l.hashCode() + ((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 37)) * 37;
        String str = this.f4825m;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.f4221e = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        e5.h hVar = this.f4823i;
        if (hVar != null) {
            sb.append(", scope=");
            sb.append(hVar);
        }
        List list = this.f4824l;
        if (!list.isEmpty()) {
            sb.append(", log_records=");
            sb.append(list);
        }
        String str = this.f4825m;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(V6.b.M(str));
        }
        StringBuilder replace = sb.replace(0, 2, "ScopeLogs{");
        replace.append('}');
        return replace.toString();
    }
}

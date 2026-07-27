package s3;

import m2.AbstractC1283f;
import m2.EnumC1281d;
import m2.EnumC1289l;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class j extends AbstractC1283f {

    /* renamed from: e, reason: collision with root package name */
    public static final i f11832e;

    /* renamed from: c, reason: collision with root package name */
    public final String f11833c;

    /* renamed from: d, reason: collision with root package name */
    public final b f11834d;

    static {
        EnumC1281d enumC1281d = EnumC1281d.f11151b;
        EnumC1289l enumC1289l = EnumC1289l.f11190b;
        f11832e = new i(j.class);
    }

    public j(String str, b bVar, j5.i iVar) {
        super(f11832e, iVar);
        if (str == null) {
            throw new IllegalArgumentException("key == null");
        }
        this.f11833c = str;
        this.f11834d = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return a().equals(jVar.a()) && AbstractC1341c.i(this.f11833c, jVar.f11833c) && AbstractC1341c.i(this.f11834d, jVar.f11834d);
    }

    public final int hashCode() {
        int i2 = this.f11160b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f11833c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        b bVar = this.f11834d;
        int hashCode3 = hashCode2 + (bVar != null ? bVar.hashCode() : 0);
        this.f11160b = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f11833c;
        if (str != null) {
            sb.append(", key=");
            sb.append(AbstractC1341c.C(str));
        }
        b bVar = this.f11834d;
        if (bVar != null) {
            sb.append(", value=");
            sb.append(bVar);
        }
        StringBuilder replace = sb.replace(0, 2, "KeyValue{");
        replace.append('}');
        return replace.toString();
    }
}

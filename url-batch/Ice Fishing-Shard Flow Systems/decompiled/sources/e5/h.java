package e5;

import c4.AbstractC0300f;
import c4.EnumC0298d;
import c4.EnumC0307m;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends AbstractC0300f {

    /* renamed from: o, reason: collision with root package name */
    public static final g f4727o;

    /* renamed from: i, reason: collision with root package name */
    public final String f4728i;

    /* renamed from: l, reason: collision with root package name */
    public final String f4729l;

    /* renamed from: m, reason: collision with root package name */
    public final List f4730m;

    /* renamed from: n, reason: collision with root package name */
    public final int f4731n;

    static {
        EnumC0298d enumC0298d = EnumC0298d.f4212e;
        EnumC0307m enumC0307m = EnumC0307m.f4251e;
        f4727o = new g(h.class);
    }

    public h(String str, String str2, d4.d dVar, int i2, T6.i iVar) {
        super(f4727o, iVar);
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        }
        this.f4728i = str;
        if (str2 == null) {
            throw new IllegalArgumentException("version == null");
        }
        this.f4729l = str2;
        this.f4730m = V6.b.E("attributes", dVar);
        this.f4731n = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return a().equals(hVar.a()) && V6.b.z(this.f4728i, hVar.f4728i) && V6.b.z(this.f4729l, hVar.f4729l) && this.f4730m.equals(hVar.f4730m) && V6.b.z(Integer.valueOf(this.f4731n), Integer.valueOf(hVar.f4731n));
    }

    public final int hashCode() {
        int i2 = this.f4221e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f4728i;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f4729l;
        int hashCode3 = Integer.hashCode(this.f4731n) + ((this.f4730m.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37)) * 37);
        this.f4221e = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f4728i;
        if (str != null) {
            sb.append(", name=");
            sb.append(V6.b.M(str));
        }
        String str2 = this.f4729l;
        if (str2 != null) {
            sb.append(", version=");
            sb.append(V6.b.M(str2));
        }
        List list = this.f4730m;
        if (!list.isEmpty()) {
            sb.append(", attributes=");
            sb.append(list);
        }
        sb.append(", dropped_attributes_count=");
        sb.append(this.f4731n);
        StringBuilder replace = sb.replace(0, 2, "InstrumentationScope{");
        replace.append('}');
        return replace.toString();
    }
}

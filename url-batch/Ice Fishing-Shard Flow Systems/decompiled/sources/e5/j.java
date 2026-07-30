package e5;

import c4.AbstractC0300f;
import c4.EnumC0298d;
import c4.EnumC0307m;

/* loaded from: classes.dex */
public final class j extends AbstractC0300f {

    /* renamed from: m, reason: collision with root package name */
    public static final i f4732m;

    /* renamed from: i, reason: collision with root package name */
    public final String f4733i;

    /* renamed from: l, reason: collision with root package name */
    public final b f4734l;

    static {
        EnumC0298d enumC0298d = EnumC0298d.f4212e;
        EnumC0307m enumC0307m = EnumC0307m.f4251e;
        f4732m = new i(j.class);
    }

    public j(String str, b bVar, T6.i iVar) {
        super(f4732m, iVar);
        if (str == null) {
            throw new IllegalArgumentException("key == null");
        }
        this.f4733i = str;
        this.f4734l = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return a().equals(jVar.a()) && V6.b.z(this.f4733i, jVar.f4733i) && V6.b.z(this.f4734l, jVar.f4734l);
    }

    public final int hashCode() {
        int i2 = this.f4221e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f4733i;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        b bVar = this.f4734l;
        int hashCode3 = hashCode2 + (bVar != null ? bVar.hashCode() : 0);
        this.f4221e = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f4733i;
        if (str != null) {
            sb.append(", key=");
            sb.append(V6.b.M(str));
        }
        b bVar = this.f4734l;
        if (bVar != null) {
            sb.append(", value=");
            sb.append(bVar);
        }
        StringBuilder replace = sb.replace(0, 2, "KeyValue{");
        replace.append('}');
        return replace.toString();
    }
}

package e5;

import c4.AbstractC0300f;
import c4.EnumC0298d;
import c4.EnumC0307m;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends AbstractC0300f {

    /* renamed from: l, reason: collision with root package name */
    public static final k f4735l;

    /* renamed from: i, reason: collision with root package name */
    public final List f4736i;

    static {
        EnumC0298d enumC0298d = EnumC0298d.f4212e;
        EnumC0307m enumC0307m = EnumC0307m.f4251e;
        f4735l = new k(l.class);
    }

    public l(d4.d dVar, T6.i iVar) {
        super(f4735l, iVar);
        this.f4736i = V6.b.E("values", dVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return a().equals(lVar.a()) && this.f4736i.equals(lVar.f4736i);
    }

    public final int hashCode() {
        int i2 = this.f4221e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f4736i.hashCode() + (a().hashCode() * 37);
        this.f4221e = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f4736i;
        if (!list.isEmpty()) {
            sb.append(", values=");
            sb.append(list);
        }
        StringBuilder replace = sb.replace(0, 2, "KeyValueList{");
        replace.append('}');
        return replace.toString();
    }
}

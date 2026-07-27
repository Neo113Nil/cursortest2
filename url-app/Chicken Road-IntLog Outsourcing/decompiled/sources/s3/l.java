package s3;

import java.util.List;
import m2.AbstractC1283f;
import m2.EnumC1281d;
import m2.EnumC1289l;
import n2.AbstractC1341c;
import n2.C1342d;

/* loaded from: classes.dex */
public final class l extends AbstractC1283f {

    /* renamed from: d, reason: collision with root package name */
    public static final k f11835d;

    /* renamed from: c, reason: collision with root package name */
    public final List f11836c;

    static {
        EnumC1281d enumC1281d = EnumC1281d.f11151b;
        EnumC1289l enumC1289l = EnumC1289l.f11190b;
        f11835d = new k(l.class);
    }

    public l(C1342d c1342d, j5.i iVar) {
        super(f11835d, iVar);
        this.f11836c = AbstractC1341c.u("values", c1342d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return a().equals(lVar.a()) && this.f11836c.equals(lVar.f11836c);
    }

    public final int hashCode() {
        int i2 = this.f11160b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = (a().hashCode() * 37) + this.f11836c.hashCode();
        this.f11160b = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f11836c;
        if (!list.isEmpty()) {
            sb.append(", values=");
            sb.append(list);
        }
        StringBuilder replace = sb.replace(0, 2, "KeyValueList{");
        replace.append('}');
        return replace.toString();
    }
}

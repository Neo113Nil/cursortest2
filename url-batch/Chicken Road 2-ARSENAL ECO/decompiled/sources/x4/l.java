package x4;

import java.util.List;
import z3.m;

/* loaded from: classes.dex */
public final class l extends z3.f {

    /* renamed from: i, reason: collision with root package name */
    public static final k f6221i;

    /* renamed from: h, reason: collision with root package name */
    public final List f6222h;

    static {
        z3.d dVar = z3.d.f6297g;
        m mVar = m.f6336g;
        f6221i = new k(l.class);
    }

    public l(A3.d dVar, n6.i iVar) {
        super(f6221i, iVar);
        this.f6222h = A3.c.R(dVar, "values");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return a().equals(lVar.a()) && this.f6222h.equals(lVar.f6222h);
    }

    public final int hashCode() {
        int i7 = this.f6306g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = this.f6222h.hashCode() + (a().hashCode() * 37);
        this.f6306g = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f6222h;
        if (!list.isEmpty()) {
            sb.append(", values=");
            sb.append(list);
        }
        StringBuilder replace = sb.replace(0, 2, "KeyValueList{");
        replace.append('}');
        return replace.toString();
    }
}

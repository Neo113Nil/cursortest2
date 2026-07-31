package x4;

import java.util.List;
import z3.m;

/* loaded from: classes.dex */
public final class d extends z3.f {

    /* renamed from: i, reason: collision with root package name */
    public static final c f6206i;

    /* renamed from: h, reason: collision with root package name */
    public final List f6207h;

    static {
        z3.d dVar = z3.d.f6297g;
        m mVar = m.f6336g;
        f6206i = new c(d.class);
    }

    public d(A3.d dVar, n6.i iVar) {
        super(f6206i, iVar);
        this.f6207h = A3.c.R(dVar, "values");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return a().equals(dVar.a()) && this.f6207h.equals(dVar.f6207h);
    }

    public final int hashCode() {
        int i7 = this.f6306g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = this.f6207h.hashCode() + (a().hashCode() * 37);
        this.f6306g = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f6207h;
        if (!list.isEmpty()) {
            sb.append(", values=");
            sb.append(list);
        }
        StringBuilder replace = sb.replace(0, 2, "ArrayValue{");
        replace.append('}');
        return replace.toString();
    }
}

package d2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import o2.C0924c;

/* renamed from: d2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0546c implements Iterable {
    public abstract Object B(Object obj);

    public abstract void C(u3.d dVar);

    public abstract AbstractC0546c D(Iterable iterable, Object obj);

    public abstract AbstractC0546c E(Object obj);

    public abstract boolean e(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0546c)) {
            return false;
        }
        AbstractC0546c abstractC0546c = (AbstractC0546c) obj;
        if (!j().equals(abstractC0546c.j()) || size() != abstractC0546c.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = abstractC0546c.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract Object h(C0924c c0924c);

    public final int hashCode() {
        int hashCode = j().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return hashCode;
    }

    public abstract boolean isEmpty();

    public abstract Comparator j();

    public abstract Object s();

    public abstract int size();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator it = iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }

    public abstract Object w();

    public abstract Iterator x();
}

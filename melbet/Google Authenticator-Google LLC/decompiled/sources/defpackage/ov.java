package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ov implements Iterable {
    public or a;
    public or b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public final or a(Object obj) {
        or orVar = this.a;
        while (orVar != null && !orVar.a.equals(obj)) {
            orVar = orVar.c;
        }
        return orVar;
    }

    public final Object b(Object obj, Object obj2) {
        or a = a(obj);
        if (a != null) {
            return a.b;
        }
        or orVar = new or(obj, obj2);
        this.d++;
        or orVar2 = this.b;
        if (orVar2 == null) {
            this.a = orVar;
        } else {
            orVar2.c = orVar;
            orVar.d = orVar2;
        }
        this.b = orVar;
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ov)) {
            return false;
        }
        ov ovVar = (ov) obj;
        if (this.d != ovVar.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = ovVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry next = ((ot) it).next();
            Map.Entry next2 = ((ot) it2).next();
            if (next == null) {
                if (next2 != null) {
                    return false;
                }
                next2 = null;
            }
            if (next != null && !next.equals(next2)) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((ot) it).next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ot otVar = new ot(this.a, this.b);
        this.c.put(otVar, false);
        return otVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((ot) it).next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

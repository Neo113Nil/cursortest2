package defpackage;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knt {
    final Collection a;
    final int b;

    public knt(jxx jxxVar) {
        jxxVar.getClass();
        if (jxxVar.e.size() < 10) {
            this.a = jxxVar.e;
        } else {
            this.a = new HashSet(jxxVar.e);
        }
        Iterator it = jxxVar.e.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((SocketAddress) it.next()).hashCode();
        }
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knt)) {
            return false;
        }
        knt kntVar = (knt) obj;
        if (kntVar.b == this.b) {
            Collection collection = kntVar.a;
            int size = collection.size();
            Collection<?> collection2 = this.a;
            if (size == collection2.size()) {
                return collection.containsAll(collection2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString();
    }
}

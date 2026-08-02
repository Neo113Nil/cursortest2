package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class knx extends jzi {
    private final List a;
    private final AtomicInteger b;
    private final int c;

    public knx(List list, AtomicInteger atomicInteger) {
        hoq.y(!list.isEmpty(), "empty list");
        this.a = list;
        this.b = atomicInteger;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((jzi) it.next()).hashCode();
        }
        this.c = i;
    }

    @Override // defpackage.jzi
    public final jze a(jzf jzfVar) {
        int andIncrement = this.b.getAndIncrement() & Integer.MAX_VALUE;
        List list = this.a;
        return ((jzi) list.get(andIncrement % list.size())).a(jzfVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof knx)) {
            return false;
        }
        knx knxVar = (knx) obj;
        if (knxVar == this) {
            return true;
        }
        if (this.c == knxVar.c && this.b == knxVar.b) {
            List list = this.a;
            int size = list.size();
            List list2 = knxVar.a;
            if (size == list2.size() && new HashSet(list).containsAll(list2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        gzo gzoVar = new gzo("knx");
        gzoVar.b("subchannelPickers", this.a);
        return gzoVar.toString();
    }
}

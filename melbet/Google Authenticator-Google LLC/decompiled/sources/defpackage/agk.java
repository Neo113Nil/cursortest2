package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agk {
    public final Map a = new LinkedHashMap();

    public final agd a(Object obj) {
        return (agd) this.a.get(obj);
    }

    public final Set b() {
        return ixc.s(this.a.keySet());
    }

    public final void c() {
        Map map = this.a;
        Map t = ixd.t(map);
        map.clear();
        Iterator it = t.values().iterator();
        while (it.hasNext()) {
            ((agd) it.next()).v();
        }
    }

    public final String toString() {
        int i = ksx.a;
        String c = new ksj(getClass()).c();
        if (c == null) {
            c = "ViewModelStore";
        }
        String num = Integer.toString(hashCode(), 16);
        num.getClass();
        return c + "@" + num + "(keys=" + b() + ")";
    }
}

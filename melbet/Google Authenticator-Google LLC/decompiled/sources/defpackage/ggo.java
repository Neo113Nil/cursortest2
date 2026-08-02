package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ggo {
    public static final ggo a;
    public final her b;
    private final her c;

    static {
        hjb hjbVar = hjb.a;
        a = new ggo(hjbVar, hjbVar);
    }

    public ggo(Set set, Set set2) {
        hen henVar = new hen(4);
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            ((ggi) it.next()).a(henVar);
        }
        this.c = henVar.d(true);
        hen henVar2 = new hen(4);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            ((ggi) it2.next()).a(henVar2);
        }
        this.b = henVar2.d(true);
    }

    public final ggn a(String str) {
        ggn ggnVar = (ggn) this.c.get(str);
        return ggnVar != null ? ggnVar : (ggn) this.b.get(str);
    }

    public final hfm b() {
        return this.b.keySet();
    }
}

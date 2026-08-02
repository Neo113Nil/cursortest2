package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihb implements hmz {
    private static final hlw a;
    private final jpt b;

    static {
        int i = hel.d;
        a = new igw("", his.a);
    }

    public ihb(jpt jptVar) {
        this.b = jptVar;
    }

    @Override // defpackage.hmz
    public final hlw a(String str) {
        Set set = (Set) this.b.b();
        int size = set.size();
        if (size == 0) {
            return a;
        }
        if (size == 1) {
            return ((hmz) set.iterator().next()).a(str);
        }
        heg d = hel.d(size);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d.h(((hmz) it.next()).a(str));
        }
        return new igw(str, d.g());
    }
}

package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hkj extends hky {
    public hkj(Class cls) {
        super("group_by", cls, true, true);
    }

    @Override // defpackage.hky
    public final void a(Iterator it, hkx hkxVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                hkxVar.a(this.a, next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.a;
            sb.append(']');
            hkxVar.a(str, sb.toString());
        }
    }
}

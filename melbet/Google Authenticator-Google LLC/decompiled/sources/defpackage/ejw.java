package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ejw {
    public static hel a(List list, long j, long j2) {
        if (j < 0 && j2 < 0) {
            Stream map = Collection.EL.stream(list).map(new ejs(5));
            int i = hel.d;
            return (hel) map.collect(hby.a);
        }
        Iterator it = list.iterator();
        long j3 = 0;
        while (it.hasNext()) {
            j3 += ((ejv) it.next()).a();
        }
        if (list.size() <= j && j3 <= j2) {
            Stream map2 = Collection.EL.stream(list).map(new ejs(5));
            int i2 = hel.d;
            return (hel) map2.collect(hby.a);
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        int i3 = hel.d;
        heg hegVar = new heg(4);
        int size = arrayList.size();
        long j4 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            ejv ejvVar = (ejv) arrayList.get(i5);
            i4++;
            j4 += ejvVar.a();
            if ((j >= 0 && i4 > j) || (j2 >= 0 && j4 > j2)) {
                break;
            }
            hegVar.h(ejvVar.b());
        }
        return hegVar.g();
    }
}

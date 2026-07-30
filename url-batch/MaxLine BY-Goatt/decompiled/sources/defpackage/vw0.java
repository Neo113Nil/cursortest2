package defpackage;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vw0 {
    public final cj0 a = cj0.o;
    public final int b = 1;
    public final int c = 1;
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final int g = 2;
    public final int h = 2;

    public final uw0 a() {
        int i;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        int i2 = this.g;
        if (i2 != 2 && (i = this.h) != 2) {
            ki kiVar = new ki(Date.class, i2, i);
            ki kiVar2 = new ki(Timestamp.class, i2, i);
            ki kiVar3 = new ki(java.sql.Date.class, i2, i);
            n03 n03Var = r03.a;
            arrayList3.add(new n03(Date.class, kiVar, 0));
            arrayList3.add(new n03(Timestamp.class, kiVar2, 0));
            arrayList3.add(new n03(java.sql.Date.class, kiVar3, 0));
        }
        return new uw0(this.a, this.c, this.d, this.b, arrayList3);
    }
}

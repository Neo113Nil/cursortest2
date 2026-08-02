package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccd {
    public final hel a;
    public final bov b;
    public final hvl c;
    public final hvl d;
    public final String e;
    public int f = -1;
    public int g = -1;
    public final bpr h;
    public final caz i;

    public ccd(Context context, bpr bprVar, caz cazVar, hel helVar, bov bovVar, hvl hvlVar, hvl hvlVar2) {
        this.h = bprVar;
        this.i = cazVar;
        this.a = helVar;
        this.b = bovVar;
        this.c = hvlVar2;
        this.d = hvlVar;
        this.e = cch.a(context);
    }

    public static final int a(String str, Collection collection) {
        Iterable f = hdb.c(collection).b(new bqg(str, 9)).f();
        if (f instanceof Collection) {
            return ((Collection) f).size();
        }
        Iterator it = f.iterator();
        long j = 0;
        while (it.hasNext()) {
            it.next();
            j++;
        }
        return hnu.ba(j);
    }
}

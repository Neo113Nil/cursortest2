package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwk {
    public static final hin a;

    static {
        int i = 0;
        hgw hgwVar = new hgw(ebn.d, new ebn[]{ebn.c, ebn.e});
        hen henVar = new hen(hgwVar.size());
        Iterator<E> it = hgwVar.iterator();
        while (it.hasNext()) {
            henVar.g(it.next(), Integer.valueOf(i));
            i++;
        }
        a = new hcx(henVar.d(true));
    }

    public static final kzq a(List list, Integer num, cfe cfeVar, eia eiaVar) {
        return eiaVar.c() ? new azc(new jia(View.generateViewId()), 3) : new eau(list, num, cfeVar, 1);
    }
}

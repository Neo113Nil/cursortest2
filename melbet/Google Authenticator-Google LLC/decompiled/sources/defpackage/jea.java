package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jea implements jdy {
    final List a;

    public jea(Context context, jdz jdzVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (jdzVar.b) {
            arrayList.add(new jeg(context, jdzVar));
        }
    }

    @Override // defpackage.jdy
    public final void a(jed jedVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jdy) it.next()).a(jedVar);
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kci extends kck {
    final /* synthetic */ kck[] a;

    public kci(kck[] kckVarArr) {
        this.a = kckVarArr;
    }

    @Override // defpackage.kck
    public final kbq a(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            kbq a = this.a[i2].a(i);
            if (a.g()) {
                return a;
            }
            arrayList.add(a);
        }
        Iterator it = arrayList.iterator();
        kbq kbqVar = (kbq) it.next();
        while (it.hasNext()) {
            kbq kbqVar2 = (kbq) it.next();
            kbqVar = kbqVar.a(kbqVar2.p);
            Throwable th = kbqVar2.q;
            if (th != null) {
                Throwable th2 = kbqVar.q;
                if (th2 != null) {
                    th2.addSuppressed(th);
                } else {
                    kbqVar = kbqVar.d(th);
                }
            }
        }
        return kbqVar;
    }
}

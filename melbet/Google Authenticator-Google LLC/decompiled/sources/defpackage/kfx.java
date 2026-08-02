package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kfx extends kft {
    final /* synthetic */ kgb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfx(kgc kgcVar, kgb kgbVar) {
        super(kgcVar.c);
        this.a = kgbVar;
    }

    @Override // defpackage.kft
    public final void a() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            kgb kgbVar = this.a;
            synchronized (kgbVar) {
                if (kgbVar.c.isEmpty()) {
                    kgbVar.c = null;
                    kgbVar.a = true;
                    return;
                } else {
                    list = kgbVar.c;
                    kgbVar.c = arrayList;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }
}

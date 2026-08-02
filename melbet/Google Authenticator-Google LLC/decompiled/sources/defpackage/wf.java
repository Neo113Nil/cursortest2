package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wf implements wo {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public wf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.wo
    public final /* synthetic */ void a(Object obj) {
        if (this.b != 0) {
            bsh bshVar = (bsh) obj;
            if (bshVar == null) {
                bshVar = new bsh(-3);
            }
            ((brr) this.a).n(bshVar);
            return;
        }
        bsh bshVar2 = (bsh) obj;
        synchronized (wg.c) {
            qy qyVar = wg.d;
            Object obj2 = this.a;
            ArrayList arrayList = (ArrayList) qyVar.get(obj2);
            if (arrayList == null) {
                return;
            }
            qyVar.remove(obj2);
            for (int i = 0; i < arrayList.size(); i++) {
                ((wo) arrayList.get(i)).a(bshVar2);
            }
        }
    }
}

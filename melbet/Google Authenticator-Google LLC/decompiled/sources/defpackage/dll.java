package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dll implements dlh {
    final /* synthetic */ dlm a;
    private int b = -1;

    public dll(dlm dlmVar) {
        this.a = dlmVar;
    }

    @Override // defpackage.dlh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(dks dksVar) {
        hoq.H(dksVar.c());
        jkl jklVar = dksVar.c;
        hre hreVar = ((dkx) jklVar.b).d;
        if (hreVar == null) {
            hreVar = hre.a;
        }
        hoq.H((hreVar.b & 2048) != 0);
        int A = a.A(((dkx) jklVar.b).e);
        if (A == 0 || A == 1) {
            dlm dlmVar = this.a;
            List list = dlmVar.e;
            int size = list.size();
            list.add(dksVar.a());
            dlmVar.f.put(size, this.b);
            int i = this.b;
            this.b = size;
            dksVar.b.g(this);
            this.b = i;
        }
    }
}

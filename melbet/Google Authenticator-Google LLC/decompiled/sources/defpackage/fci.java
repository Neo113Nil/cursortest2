package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fci implements htr {
    public final List a;
    public final Executor b;

    public fci(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.htr
    public final /* bridge */ /* synthetic */ hvi a(Object obj) {
        List list = this.a;
        kee keeVar = (kee) obj;
        int i = ((his) list).c;
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        hjs listIterator = ((hel) list).listIterator(0);
        while (listIterator.hasNext()) {
            fwv fwvVar = (fwv) listIterator.next();
            arrayList.add(gwu.g(hoq.as(new bwr(fwvVar, fwvVar.a, 16), fwvVar.d.b)));
        }
        htr c = gvx.c(new fch(this, arrayList, i, i2));
        fcu fcuVar = (fcu) keeVar.a;
        gth gthVar = fcuVar.e;
        huf hufVar = huf.a;
        gthVar.a();
        return hti.g(exf.m(hti.g(hnu.aK(fcuVar.c.c()), gvx.c(new bpp(keeVar, c, hufVar, 8)), hufVar)), gvx.c(new fch(this, i, arrayList, 2)), hufVar);
    }
}

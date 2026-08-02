package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwg implements dtx {
    public final int a;
    public final kzq b;
    private final jiw c;
    private final eia d;
    private final duu e;
    private final jia f;
    private final kzq g;
    private lao h;
    private final dtd i;
    private final gjl j;
    private final dja k;

    /* JADX WARN: Multi-variable type inference failed */
    public dwg(gjl gjlVar, jiw jiwVar, dja djaVar, eia eiaVar, duu duuVar, dtd dtdVar) {
        this.j = gjlVar;
        this.c = jiwVar;
        this.k = djaVar;
        this.d = eiaVar;
        this.e = duuVar;
        this.i = dtdVar;
        jia jiaVar = new jia(View.generateViewId());
        this.f = jiaVar;
        this.h = lak.a(jiaVar);
        jit b = eiaVar.b();
        if (b != null) {
            gjlVar.f(b);
        }
        azc azcVar = new azc(null, 3);
        this.g = azcVar;
        this.a = View.generateViewId();
        dtdVar.b(eiaVar.b(), this);
        lao laoVar = this.h;
        if (duuVar != null) {
            throw null;
        }
        hin hinVar = dwk.a;
        int generateViewId = View.generateViewId();
        int generateViewId2 = View.generateViewId();
        eca ecaVar = ((dsf) gjlVar.c).e.f;
        int i = hel.d;
        hel helVar = his.a;
        ArrayList arrayList = new ArrayList(ixc.w(helVar));
        hjs listIterator = helVar.listIterator(0);
        if (listIterator.hasNext()) {
            throw null;
        }
        dsf dsfVar = (dsf) gjlVar.c;
        if (dsfVar.b.a() != null) {
            eca ecaVar2 = dsfVar.e.f;
        }
        cfe cfeVar = new cfe(jiwVar, (byte[]) null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            arrayList2.add(arrayList3);
        }
        ArrayList arrayList4 = new ArrayList(ixc.w(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList4.add(dwk.a((List) it.next(), null, cfeVar, eiaVar));
        }
        kzq[] kzqVarArr = new kzq[2];
        kzqVarArr[0] = dwk.a(arrayList, Integer.valueOf(generateViewId), cfeVar, eiaVar);
        List list = ((dsf) gjlVar.c).e.i;
        if (eiaVar.b() == null) {
            List arrayList5 = new ArrayList();
            hjs listIterator2 = list.listIterator(0);
            while (listIterator2.hasNext()) {
                E next = listIterator2.next();
                if (((ebp) next).g != ebn.d) {
                    arrayList5.add(next);
                }
            }
            list = arrayList5;
        }
        hin hinVar2 = dwk.a;
        list.getClass();
        hinVar2.getClass();
        hel t = hel.t(new dwi(hinVar2), list);
        t.getClass();
        ArrayList arrayList6 = new ArrayList(ixc.w(t));
        hjs listIterator3 = t.listIterator(0);
        while (listIterator3.hasNext()) {
            arrayList6.add(new eas((ebp) listIterator3.next()));
        }
        kzqVarArr[1] = new eau(arrayList6, Integer.valueOf(generateViewId2), cfeVar, 1);
        this.b = new kni(new kzq[]{azcVar, laoVar, new azc((kzq[]) ixc.p(ixc.l(arrayList4, ixc.D(kzqVarArr))).toArray(new kzq[0]), 2)}, new dwf(this, null), 5);
    }

    @Override // defpackage.dtx
    public final void a(jfq jfqVar) {
        jfqVar.getClass();
        this.h.d(jfqVar.c ? this.f : new jia(View.generateViewId()));
    }
}

package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ghl implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ghl(Object obj, Object obj2, int i, int i2) {
        this.d = i2;
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        ggj bG;
        her c;
        int i = this.d;
        if (i == 0) {
            ?? r2 = this.b;
            Object obj = this.c;
            try {
                Object aR = hnu.aR(r2);
                aR.getClass();
                bG = (ggj) aR;
            } catch (ExecutionException e) {
                if (!(e.getCause() instanceof IOException) || (((ghn) obj).p && (e.getCause() instanceof faz))) {
                    throw e;
                }
                jkj k = ggj.a.k();
                k.getClass();
                bG = hnu.bG(k);
            }
            jkj k2 = etl.a.k();
            if (!k2.b.M()) {
                k2.t();
            }
            int i2 = this.a;
            jkp jkpVar = k2.b;
            etl etlVar = (etl) jkpVar;
            etlVar.c = 2;
            etlVar.b |= 1;
            if (i2 != 0) {
                if (!jkpVar.M()) {
                    k2.t();
                }
                etl etlVar2 = (etl) k2.b;
                etlVar2.d = eos.M(i2);
                etlVar2.b |= 2;
            }
            try {
                c = ((ghn) obj).c(bG);
            } catch (RuntimeException e2) {
                Log.e("MendelPackageState", "Failed to parse flag", e2);
                jkj k3 = ggj.a.k();
                k3.getClass();
                bG = hnu.bG(k3);
                if (!k2.b.M()) {
                    k2.t();
                }
                jkp jkpVar2 = k2.b;
                etl etlVar3 = (etl) jkpVar2;
                etlVar3.c = 1;
                etlVar3.b |= 1;
                if (!jkpVar2.M()) {
                    k2.t();
                }
                etl etlVar4 = (etl) k2.b;
                etlVar4.d = eos.M(11);
                etlVar4.b |= 2;
                c = ((ghn) obj).c(bG);
            } catch (jld e3) {
                Log.e("MendelPackageState", "Failed to parse flag", e3);
                jkj k4 = ggj.a.k();
                k4.getClass();
                bG = hnu.bG(k4);
                if (!k2.b.M()) {
                    k2.t();
                }
                jkp jkpVar3 = k2.b;
                etl etlVar5 = (etl) jkpVar3;
                etlVar5.c = 1;
                etlVar5.b |= 1;
                if (!jkpVar3.M()) {
                    k2.t();
                }
                etl etlVar6 = (etl) k2.b;
                etlVar6.d = eos.M(13);
                etlVar6.b |= 2;
                c = ((ghn) obj).c(bG);
            }
            jkj k5 = etm.a.k();
            if (!k5.b.M()) {
                k5.t();
            }
            etm etmVar = (etm) k5.b;
            etl etlVar7 = (etl) k2.q();
            etlVar7.getClass();
            etmVar.d = etlVar7;
            etmVar.b |= 2;
            ghn ghnVar = (ghn) obj;
            ghnVar.e(k5);
            return (ghh) ghnVar.i.a(c, hnu.bv(bG, k5, ghnVar.a()));
        }
        if (i == 1) {
            return ((cyb) dih.x(((ddw) ((haf) ((cxs) this.b).a).a).e((Uri) this.c, this.a))).a;
        }
        ?? r0 = this.b;
        Object obj2 = this.c;
        int i3 = this.a;
        try {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((gjl) obj2).m.entrySet()) {
                hashMap.put(entry.getKey(), ((koe) entry.getValue()).b());
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                String str = (String) entry2.getKey();
                gjj gjjVar = (gjj) entry2.getValue();
                Set b = ((jsd) ((gjl) obj2).f).b();
                b.getClass();
                ArrayList arrayList = new ArrayList(ixc.w(b));
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    arrayList.add(new gjk((gka) it.next(), str, 0));
                }
                ((cka) ((gjl) obj2).k).m(new fxs(gjjVar, 14), hnu.ae(arrayList));
            }
            hnu.bo((RandomAccessFile) r0, i3);
            ixf.j(r0, null);
            return null;
        } finally {
        }
    }
}

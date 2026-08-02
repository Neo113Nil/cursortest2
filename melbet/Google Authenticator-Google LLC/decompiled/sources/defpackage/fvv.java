package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fvv implements krt {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fvv(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v36, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r14v20, types: [java.lang.Object, java.util.Map$Entry] */
    @Override // defpackage.krt
    public final Object a(Object obj) {
        int i = 7;
        byte[] bArr = null;
        int i2 = 1;
        final int i3 = 0;
        switch (this.c) {
            case 0:
                return ((fvw) this.a).a((String) this.b);
            case 1:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                onClickListener.getClass();
                return new dwd(onClickListener, 12);
            case 2:
                return hnu.bN((cfe) this.a, (gpj) this.b, (String) obj);
            case 3:
                return ((fym) ((gid) this.a).c.b()).d((String) this.b);
            case 4:
                gty aB = hoq.aB(177, "Updating configurations", gub.a, true);
                Object obj2 = this.b;
                try {
                    fym fymVar = (fym) ((gid) this.a).c.b();
                    String str = ((iae) obj2).g;
                    str.getClass();
                    hvi d = fymVar.d(str);
                    aB.b(d);
                    ixf.j(aB, null);
                    return d;
                } finally {
                }
            case 5:
                final iae iaeVar = (iae) obj;
                Object obj3 = this.b;
                final gid gidVar = (gid) this.a;
                final String str2 = (String) obj3;
                if (gidVar.c(str2, iaeVar)) {
                    return hnu.aJ(null);
                }
                hvi a = gidVar.a(str2, iaeVar);
                if (iaeVar == null) {
                    i3 = gidVar.d;
                } else if (iaeVar.c == 2) {
                    i3 = ((Integer) iaeVar.d).intValue();
                }
                return hoq.at(a, new gia(new krt() { // from class: gic
                    @Override // defpackage.krt
                    public final Object a(Object obj4) {
                        jjq jjqVar;
                        iae iaeVar2 = iae.this;
                        byte[] bArr2 = (byte[]) obj4;
                        if (bArr2 == null) {
                            bArr2 = null;
                            if (iaeVar2 != null && (jjqVar = iaeVar2.k) != null) {
                                bArr2 = jjqVar.x();
                            }
                        }
                        jkj k = iae.a.k();
                        if (!k.b.M()) {
                            k.t();
                        }
                        String str3 = str2;
                        jkp jkpVar = k.b;
                        iae iaeVar3 = (iae) jkpVar;
                        iaeVar3.b |= 1;
                        iaeVar3.g = str3;
                        if (!jkpVar.M()) {
                            k.t();
                        }
                        gid gidVar2 = gidVar;
                        int i4 = i3;
                        iae iaeVar4 = (iae) k.b;
                        iaeVar4.c = 2;
                        iaeVar4.d = Integer.valueOf(i4);
                        List L = ixc.L(gid.d(gidVar2.e, iaeVar2));
                        if (!k.b.M()) {
                            k.t();
                        }
                        iae iaeVar5 = (iae) k.b;
                        jkx jkxVar = iaeVar5.i;
                        if (!jkxVar.c()) {
                            iaeVar5.i = jkp.A(jkxVar);
                        }
                        jiz.f(L, iaeVar5.i);
                        if (bArr2 != null) {
                            jjq r = jjq.r(bArr2);
                            if (!k.b.M()) {
                                k.t();
                            }
                            iae iaeVar6 = (iae) k.b;
                            r.getClass();
                            iaeVar6.b |= 4;
                            iaeVar6.k = r;
                        }
                        return (iae) k.q();
                    }
                }, 3), gidVar.b);
            case 6:
                return hnu.bN((cfe) this.a, (gpj) this.b, (String) obj);
            case 7:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (!bool.booleanValue()) {
                    return hnu.aJ(false);
                }
                ?? r14 = this.b;
                Object obj4 = this.a;
                String str3 = (String) r14.getKey();
                str3.getClass();
                gjw gjwVar = (gjw) obj4;
                bst c = gjwVar.c();
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                sb.append("INSERT INTO ListenerSuccessfulRuns (listener_key, version_code) VALUES (?, ?)");
                arrayList.add(str3);
                arrayList.add(Long.valueOf(gjwVar.d));
                hvi t = c.t(exf.q(sb, arrayList));
                t.getClass();
                return hoq.au(t, new fvr(new ghz(i), 19), gjwVar.b);
            case 8:
                List list = (List) obj;
                list.getClass();
                Set entrySet = this.b.entrySet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : entrySet) {
                    if (!list.contains(((Map.Entry) obj5).getKey())) {
                        arrayList2.add(obj5);
                    }
                }
                int i4 = 10;
                kpt kptVar = new kpt(10);
                Iterator it = arrayList2.iterator();
                while (true) {
                    Object obj6 = this.a;
                    if (!it.hasNext()) {
                        List a2 = ixc.a(kptVar);
                        return hoq.aU(a2).s(new gqe(a2, i2), ((gjw) obj6).b);
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    gjw gjwVar2 = (gjw) obj6;
                    hvi as = hoq.as(new gib(obj6, entry, 8, bArr), gjwVar2.c);
                    gaj.d(185, as, "Client StartupAfterPackageReplacedListener failed for key: %s", new igk(igj.a, entry.getKey()));
                    brn aX = hoq.aX(as);
                    bws bwsVar = new bws(9);
                    huf hufVar = huf.a;
                    kptVar.add(hoq.au(hoq.ao(aX.s(bwsVar, hufVar), Exception.class, new gia(new ghz(6), i4), hufVar), new fvr(new fvv(obj6, entry, i), 16), gjwVar2.b));
                }
            case 9:
                kzq kzqVar = (kzq) obj;
                kzqVar.getClass();
                return new kni(new kzj(new akl(kzqVar, this.a, null, 2)), this.b, 0);
            default:
                ((kyg) this.b).a.removeCallbacks(this.a);
                return kow.a;
        }
    }

    public /* synthetic */ fvv(kyg kygVar, Runnable runnable, int i) {
        this.c = i;
        this.b = kygVar;
        this.a = runnable;
    }
}

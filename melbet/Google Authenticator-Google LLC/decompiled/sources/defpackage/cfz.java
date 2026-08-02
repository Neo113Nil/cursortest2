package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfz {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public cfz(kee keeVar) {
        this.c = keeVar;
        this.d = new ahi();
        int i = qu.a;
        new qt(6);
        this.a = new qt(6);
        this.b = new qt(6);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ccp, java.lang.Object] */
    public final void a(ccm ccmVar) {
        Object obj = this.c;
        cer cerVar = new cer((ces) this.b, ccmVar, this.d, (ccl) obj);
        ces cesVar = cerVar.a;
        ccm ccmVar2 = cerVar.c;
        ces a = cesVar.a(ccmVar2.b);
        cen b = ceo.b();
        b.f(System.currentTimeMillis());
        b.h(SystemClock.elapsedRealtime());
        b.g(cerVar.b);
        ccl cclVar = cerVar.e;
        ccp ccpVar = cerVar.d;
        Object obj2 = ccmVar2.a;
        ccpVar.a();
        b.e(new cem(cclVar, (byte[]) obj2));
        b.a = null;
        ceo a2 = b.a();
        cfm cfmVar = ((ceu) this.a).a;
        ((cfk) cfmVar).b.execute(new ajx(cfmVar, a, a2, 9));
    }

    public final void b(ahh ahhVar) {
        if (((qt) this.b).b(ahhVar)) {
            ((ahi) this.d).c(this, ahhVar, -1);
        }
    }

    public final void c(ahh ahhVar, int i) {
        if (i != 1) {
            i = 0;
        }
        if (((qt) this.b).b(ahhVar)) {
            ((ahi) this.d).c(this, ahhVar, i);
        }
    }

    public final void d(ahh ahhVar, ahd ahdVar) {
        ahi ahiVar = (ahi) this.d;
        if (ahiVar.d != 0) {
            return;
        }
        ahe a = ahiVar.a(-1);
        ahiVar.c = a;
        ahiVar.d = -1;
        ahiVar.e = ahhVar;
        if (ahdVar != null) {
            if (a != null) {
                a.e();
            }
            ahiVar.f.d(new ahk(ahdVar));
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [agh, java.lang.Object] */
    public final agd e(ktj ktjVar, String str) {
        agd a;
        synchronized (this.a) {
            Object obj = this.b;
            a = ((agk) obj).a(str);
            if (ktjVar.d(a)) {
                a.getClass();
            } else {
                agp agpVar = new agp((ago) this.c);
                agpVar.b(agj.a, str);
                a = yn.e(this.d, ktjVar, agpVar);
                a.getClass();
                agd agdVar = (agd) ((agk) obj).a.put(str, a);
                if (agdVar != null) {
                    agdVar.v();
                }
            }
        }
        return a;
    }

    public final ArrayList f(Object obj) {
        return (ArrayList) ((qy) this.d).get(obj);
    }

    public final void g(Object obj) {
        qy qyVar = (qy) this.d;
        if (qyVar.containsKey(obj)) {
            return;
        }
        qyVar.put(obj, null);
    }

    public final void h(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((qy) this.d).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                h(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public cfz(Context context, awp awpVar, awk awkVar, awp awpVar2) {
        this.c = context;
        this.a = awpVar;
        this.d = awkVar;
        this.b = awpVar2;
    }

    public cfz(ces cesVar, ccl cclVar, ccp ccpVar, cet cetVar) {
        this.b = cesVar;
        this.c = cclVar;
        this.d = ccpVar;
        this.a = cetVar;
    }

    public cfz(URL url, cdo cdoVar, String str, String str2) {
        this.b = url;
        this.c = cdoVar;
        this.a = str;
        this.d = str2;
    }

    public cfz(List list, bcn bcnVar, bek bekVar, ContentResolver contentResolver) {
        this.a = bcnVar;
        this.d = bekVar;
        this.c = contentResolver;
        this.b = list;
    }

    public cfz(Executor executor, cgp cgpVar, iyi iyiVar, cgp cgpVar2) {
        this.a = executor;
        this.b = cgpVar;
        this.c = iyiVar;
        this.d = cgpVar2;
    }

    public cfz(agk agkVar, agh aghVar, ago agoVar) {
        this.b = agkVar;
        this.d = aghVar;
        this.c = agoVar;
        this.a = new yn();
    }

    public cfz(byte[] bArr) {
        this.b = new wr(10);
        this.d = new qy(0);
        this.c = new ArrayList();
        this.a = new HashSet();
    }

    public cfz() {
        this.b = new qi();
        this.c = new SparseArray();
        this.d = new qq(null);
        this.a = new qi();
    }
}

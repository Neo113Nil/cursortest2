package defpackage;

import android.os.StrictMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkj {
    public final hvl a;
    public final dkh b;
    private final koe c;
    private final Set d;
    private final Executor e;
    private volatile her f;

    public dkj(hvl hvlVar, koe koeVar, Set set, dkh dkhVar) {
        this.a = hvlVar;
        this.c = koeVar;
        this.d = set;
        this.b = dkhVar;
        this.e = new hvv(hvlVar);
        hoq.I(!set.isEmpty(), "No logging result handlers provided.");
    }

    public static hvi c(dkk dkkVar) {
        try {
            return dkkVar.b();
        } catch (Throwable th) {
            return hnu.aI(th);
        }
    }

    private final void d(hvi hviVar) {
        for (dih dihVar : this.d) {
            hnu.aS(hviVar, new dkp(0), huf.a);
        }
    }

    public final List a(Class cls) {
        her herVar = this.f;
        if (herVar == null) {
            synchronized (this) {
                herVar = this.f;
                if (herVar == null) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (dkk dkkVar : (Set) ((jrx) this.c).a) {
                        if (dkkVar.a().isEmpty()) {
                            arrayList.add(dkkVar);
                        } else {
                            for (Class cls2 : dkkVar.a()) {
                                List list = (List) hashMap.get(cls2);
                                if (list == null) {
                                    list = new ArrayList();
                                    hashMap.put(cls2, list);
                                }
                                list.add(dkkVar);
                            }
                        }
                    }
                    hashMap.put(dkl.class, arrayList);
                    herVar = her.i(hashMap);
                    this.f = herVar;
                }
            }
        }
        int i = hel.d;
        return (List) herVar.getOrDefault(cls, his.a);
    }

    public final void b(dki dkiVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).detectAll().build());
        try {
            try {
                List a = dkiVar.a();
                if (a != null) {
                    if (!a.isEmpty()) {
                        Callable i = gvx.i(new bsp(this, a, 9));
                        Executor executor = this.e;
                        d(hti.g(hnu.aM(i, executor), gvx.c(new bpn(this, 19)), executor));
                    }
                }
            } catch (Throwable th) {
                hvi aI = hnu.aI(th);
                hnu.aI(th);
                d(aI);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}

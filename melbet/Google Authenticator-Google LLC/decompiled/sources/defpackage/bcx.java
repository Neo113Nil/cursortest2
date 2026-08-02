package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcx {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public azu c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public bbl h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public bbh m;
    public azw n;
    public bdg o;
    public boolean p;
    public boolean q;
    public cme r;

    final bbp a(Class cls) {
        bbp bbpVar = (bbp) this.i.get(cls);
        if (bbpVar == null) {
            Iterator it = this.i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    bbpVar = (bbp) entry.getValue();
                    break;
                }
            }
        }
        if (bbpVar != null) {
            return bbpVar;
        }
        if (this.i.isEmpty() && this.p) {
            throw new IllegalArgumentException(a.aj(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        }
        return bgz.b;
    }

    final bdt b(Class cls) {
        bdt bdtVar;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5 = cls;
        bac a = this.c.a();
        bkx bkxVar = a.a;
        AtomicReference atomicReference = bkxVar.c;
        Class cls6 = this.g;
        Class cls7 = this.j;
        bdt bdtVar2 = null;
        bmg bmgVar = (bmg) atomicReference.getAndSet(null);
        if (bmgVar == null) {
            bmgVar = new bmg();
        }
        bmgVar.a(cls5, cls6, cls7);
        qi qiVar = bkxVar.b;
        synchronized (qiVar) {
            bdtVar = (bdt) qiVar.get(bmgVar);
        }
        bkxVar.c.set(bmgVar);
        bkx bkxVar2 = a.a;
        bdt bdtVar3 = bkx.a;
        if (bdtVar3.equals(bdtVar)) {
            return null;
        }
        if (bdtVar != null) {
            return bdtVar;
        }
        ArrayList arrayList = new ArrayList();
        afr afrVar = a.f;
        for (Class cls8 : afrVar.t(cls5, cls6)) {
            brn brnVar = a.e;
            for (Class cls9 : brnVar.i(cls8, cls7)) {
                arrayList.add(new bda(cls5, cls8, cls9, afrVar.s(cls5, cls8), brnVar.h(cls8, cls9), a.b));
                cls5 = cls;
                brnVar = brnVar;
            }
            cls5 = cls;
        }
        if (arrayList.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            bdtVar2 = new bdt(cls2, cls3, cls4, arrayList, a.b);
        }
        qi qiVar2 = bkxVar2.b;
        synchronized (qiVar2) {
            bmg bmgVar2 = new bmg(cls2, cls3, cls4);
            if (bdtVar2 != null) {
                bdtVar3 = bdtVar2;
            }
            qiVar2.put(bmgVar2, bdtVar3);
        }
        return bdtVar2;
    }

    final bes c() {
        return this.r.e();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    final List d() {
        if (!this.l) {
            this.l = true;
            List list = this.b;
            list.clear();
            List e = e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                bvw bvwVar = (bvw) e.get(i);
                Object obj = bvwVar.c;
                if (!list.contains(obj)) {
                    list.add(obj);
                }
                int i2 = 0;
                while (true) {
                    ?? r7 = bvwVar.a;
                    if (i2 < r7.size()) {
                        if (!list.contains(r7.get(i2))) {
                            list.add((bbh) r7.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return this.b;
    }

    final List e() {
        if (!this.k) {
            this.k = true;
            List list = this.a;
            list.clear();
            List c = this.c.a().c(this.d);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                bvw b = ((bge) c.get(i)).b(this.d, this.e, this.f, this.h);
                if (b != null) {
                    list.add(b);
                }
            }
        }
        return this.a;
    }

    final List f(File file) {
        return this.c.a().c(file);
    }

    final boolean g(Class cls) {
        return b(cls) != null;
    }

    final bek h() {
        return this.c.f;
    }
}

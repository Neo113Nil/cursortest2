package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kgh implements kfg {
    private kbq b;
    private kgg c;
    public volatile boolean d;
    public kfi e;
    public kfg f;
    private long h;
    private long i;
    public List g = new ArrayList();
    private List j = new ArrayList();
    private final String a = "connecting_and_lb";

    private final void b(Runnable runnable) {
        hoq.I(this.e != null, "May only be called after start");
        synchronized (this) {
            if (this.d) {
                runnable.run();
            } else {
                this.g.add(runnable);
            }
        }
    }

    @Override // defpackage.kfg
    public final jwt a() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if (r0.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        kgg kggVar;
        List list;
        List list2;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.g.isEmpty()) {
                    break;
                }
                list2 = this.g;
                this.g = arrayList;
            }
            if (kggVar != null) {
                return;
            }
            List arrayList2 = new ArrayList();
            while (true) {
                synchronized (kggVar) {
                    if (kggVar.c.isEmpty()) {
                        kggVar.c = null;
                        kggVar.b = true;
                        return;
                    } else {
                        list = kggVar.c;
                        kggVar.c = arrayList2;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList2 = list;
            }
            list2.clear();
            arrayList = list2;
        }
        this.g = null;
        this.d = true;
        kggVar = this.c;
        if (kggVar != null) {
        }
    }

    @Override // defpackage.kmn
    public final void e() {
        hoq.I(this.e != null, "May only be called after start");
        if (this.d) {
            this.f.e();
        } else {
            b(new kgf(this, 3));
        }
    }

    @Override // defpackage.kmn
    public final void f() {
        hoq.I(this.e == null, "May only be called before start");
        this.j.add(new kgf(this, 0));
    }

    @Override // defpackage.kmn
    public final void g(int i) {
        hoq.I(this.e != null, "May only be called after start");
        if (this.d) {
            this.f.g(i);
        } else {
            b(new vz(this, i, 11, null));
        }
    }

    @Override // defpackage.kmn
    public final void h(jxe jxeVar) {
        hoq.I(this.e == null, "May only be called before start");
        this.j.add(new kga(this, jxeVar, 2, null));
    }

    public final void i(kfi kfiVar) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.j = null;
        this.f.t(kfiVar);
    }

    @Override // defpackage.kmn
    public final void j(InputStream inputStream) {
        hoq.I(this.e != null, "May only be called after start");
        if (this.d) {
            this.f.j(inputStream);
        } else {
            b(new kga(this, inputStream, 5));
        }
    }

    @Override // defpackage.kmn
    public final boolean k() {
        if (this.d) {
            return this.f.k();
        }
        return false;
    }

    public final void l(kfg kfgVar) {
        kfg kfgVar2 = this.f;
        hoq.K(kfgVar2 == null, "realStream already set to %s", kfgVar2);
        this.f = kfgVar;
        this.i = System.nanoTime();
    }

    @Override // defpackage.kfg
    public void m(khi khiVar) {
        synchronized (this) {
            if (this.e == null) {
                return;
            }
            kfg kfgVar = this.f;
            String str = this.a;
            if (kfgVar != null) {
                khiVar.b(str + "_delay", (this.i - this.h) + "ns");
                this.f.m(khiVar);
            } else {
                khiVar.b(str + "_delay", (System.nanoTime() - this.h) + "ns");
                khiVar.a("was_still_waiting");
            }
        }
    }

    @Override // defpackage.kfg
    public void n(kbq kbqVar) {
        boolean z = true;
        hoq.I(this.e != null, "May only be called after start");
        kbqVar.getClass();
        synchronized (this) {
            if (this.f == null) {
                l(kjl.a);
                this.b = kbqVar;
                z = false;
            }
        }
        if (z) {
            b(new kga(this, kbqVar, 6, null));
            return;
        }
        d();
        c();
        this.e.a(kbqVar, kfh.a, new kaa());
    }

    @Override // defpackage.kfg
    public final void o() {
        hoq.I(this.e != null, "May only be called after start");
        b(new kgf(this, 4));
    }

    @Override // defpackage.kfg
    public final void p(jxs jxsVar) {
        hoq.I(this.e == null, "May only be called before start");
        this.j.add(new kga(this, jxsVar, 4, null));
    }

    @Override // defpackage.kfg
    public final void q(jxv jxvVar) {
        hoq.I(this.e == null, "May only be called before start");
        jxvVar.getClass();
        this.j.add(new kga(this, jxvVar, 3, null));
    }

    @Override // defpackage.kfg
    public final void r(int i) {
        hoq.I(this.e == null, "May only be called before start");
        this.j.add(new vz(this, i, 12, null));
    }

    @Override // defpackage.kfg
    public final void s(int i) {
        hoq.I(this.e == null, "May only be called before start");
        this.j.add(new vz(this, i, 13, null));
    }

    @Override // defpackage.kfg
    public final void t(kfi kfiVar) {
        kbq kbqVar;
        boolean z;
        hoq.I(this.e == null, "already started");
        synchronized (this) {
            kbqVar = this.b;
            z = this.d;
            if (!z) {
                kgg kggVar = new kgg(kfiVar);
                this.c = kggVar;
                kfiVar = kggVar;
            }
            this.e = kfiVar;
            this.h = System.nanoTime();
        }
        if (kbqVar != null) {
            kfiVar.a(kbqVar, kfh.a, new kaa());
        } else if (z) {
            i(kfiVar);
        }
    }

    protected void c() {
    }
}

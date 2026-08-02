package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifo extends kav {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public boolean c;
    public kbq d;
    public kaa e;
    private final Executor g;
    private final hel h;
    private final Queue i;
    private final Set j;
    private int k;
    private boolean l;
    private boolean m;
    private kaa n;

    public ifo(iwr iwrVar, hel helVar, Set set, Executor executor) {
        super(iwrVar);
        this.a = new LinkedHashMap();
        this.i = new ArrayDeque();
        this.b = new LinkedHashMap();
        this.h = helVar;
        this.k = ((his) helVar).c;
        this.j = set;
        this.g = executor;
    }

    private final void l() {
        if (h() || !this.i.isEmpty() || !this.m || this.c) {
            return;
        }
        f();
    }

    @Override // defpackage.kav, defpackage.iwr
    public final void a(kbq kbqVar, kaa kaaVar) {
        this.d = kbqVar;
        this.e = kaaVar;
        this.m = true;
        l();
    }

    @Override // defpackage.kav, defpackage.iwr
    public final void b(kaa kaaVar) {
        this.n = kaaVar;
        g();
    }

    @Override // defpackage.kav, defpackage.iwr
    public final void c(Object obj) {
        this.i.add(new ifn(obj, ((his) this.h).c));
        e();
    }

    public final void e() {
        if (this.l) {
            for (ifn ifnVar : this.i) {
                Iterator it = hnu.F(this.h.subList(0, ifnVar.b)).iterator();
                while (it.hasNext()) {
                    for (ifg ifgVar : hnu.F((List) it.next())) {
                        if (this.j.contains(ifgVar)) {
                            bry bryVar = new bry(ifnVar.a);
                            try {
                                j(bryVar, ifgVar, ifgVar.h(bryVar), ifnVar);
                            } catch (Throwable th) {
                                this.d = kbq.c(th);
                                this.e = new kaa();
                                f();
                                this.c = true;
                                return;
                            }
                        }
                    }
                    if (!ifnVar.a()) {
                        return;
                    } else {
                        ifnVar.b--;
                    }
                }
            }
            while (true) {
                Queue queue = this.i;
                if (queue.isEmpty()) {
                    break;
                }
                ifn ifnVar2 = (ifn) queue.peek();
                if (!ifnVar2.a() || ifnVar2.b != 0) {
                    break;
                } else {
                    this.f.c(((ifn) queue.poll()).a);
                }
            }
            l();
        }
    }

    public final void f() {
        Iterator it = hnu.F(this.h).iterator();
        while (it.hasNext()) {
            for (ifg ifgVar : hnu.F((List) it.next())) {
                ikm ikmVar = new ikm(this.d, this.e, (byte[]) null);
                if (this.j.contains(ifgVar)) {
                    try {
                        i(ikmVar, ifgVar, ifgVar.g(ikmVar));
                    } catch (Throwable th) {
                        this.d = kbq.c(th);
                        this.e = new kaa();
                    }
                }
            }
        }
        if (this.b.isEmpty()) {
            this.f.a(this.d, this.e);
        }
    }

    public final void g() {
        bry bryVar = new bry(this.n);
        Iterator it = hnu.F(this.h.subList(0, this.k)).iterator();
        while (it.hasNext()) {
            this.k--;
            for (ifg ifgVar : hnu.F((List) it.next())) {
                if (this.j.contains(ifgVar)) {
                    try {
                        k(bryVar, ifgVar, ifgVar.i(bryVar));
                    } catch (Throwable th) {
                        this.d = kbq.c(th);
                        this.e = new kaa();
                        f();
                        return;
                    }
                }
            }
            if (h()) {
                return;
            }
        }
        this.f.b(this.n);
        this.l = true;
        e();
    }

    public final boolean h() {
        return !this.a.isEmpty();
    }

    public final void i(ikm ikmVar, ifg ifgVar, ift iftVar) {
        int i = iftVar.c - 1;
        byte[] bArr = null;
        if (i == 1) {
            throw null;
        }
        if (i != 2) {
            return;
        }
        hvi hviVar = iftVar.b;
        hviVar.c(gvx.h(new iep(this, ikmVar, 14, bArr)), this.g);
        this.b.put(ifgVar, hviVar);
    }

    public final void j(bry bryVar, ifg ifgVar, ift iftVar, ifn ifnVar) {
        int i = iftVar.c - 1;
        if (i != 0) {
            if (i == 1) {
                throw null;
            }
            hvi hviVar = iftVar.b;
            ((LinkedHashMap) ifnVar.c).put(ifgVar, hviVar);
            hviVar.c(gvx.h(new gbm(this, bryVar, ifnVar, 20, null)), this.g);
        }
    }

    public final void k(bry bryVar, ifg ifgVar, ift iftVar) {
        int i = iftVar.c - 1;
        if (i != 0) {
            byte[] bArr = null;
            if (i == 1) {
                throw null;
            }
            hvi hviVar = iftVar.b;
            this.a.put(ifgVar, hviVar);
            hviVar.c(gvx.h(new iep(this, bryVar, 13, bArr)), this.g);
        }
    }
}

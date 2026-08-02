package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifm extends iws {
    public final Executor a;
    public int d;
    public ifl e;
    public final ifk g;
    public iwr i;
    public iws j;
    private final jwx k;
    private final kae l;
    private final hel m;
    private jww q;
    private int s;
    private kaa t;
    public final Set b = hnu.l();
    private final LinkedHashMap n = new LinkedHashMap();
    private final Set o = hnu.l();
    public boolean f = false;
    public boolean h = false;
    public final Deque c = new ArrayDeque();
    private final Queue r = new ArrayDeque();
    private final Queue p = new ArrayDeque();

    public ifm(jwx jwxVar, kae kaeVar, jww jwwVar, hel helVar) {
        this.k = jwxVar;
        this.l = kaeVar;
        this.q = jwwVar;
        this.m = helVar;
        this.e = new ifl(((his) helVar).c, 1, 0, 0);
        Executor executor = jwwVar.c;
        ifk ifkVar = new ifk(executor == null ? huf.a : executor);
        this.g = ifkVar;
        this.a = new fwo(this, new hvv(ifkVar), 3);
    }

    private final void k() {
        while (true) {
            Deque deque = this.c;
            if (deque.isEmpty()) {
                return;
            }
            ifj ifjVar = (ifj) deque.peek();
            if (!ifjVar.b.isEmpty() || ifjVar.c != ifjVar.d.e.a) {
                return;
            }
            Object obj = ((ifj) deque.poll()).a;
            if (this.e.e == 4) {
                this.j.e(obj);
            } else {
                this.p.add(obj);
            }
        }
    }

    private final void l(ifj ifjVar, int i, int i2) {
        ifm ifmVar;
        ifj ifjVar2;
        bry bryVar = new bry(ifjVar.a, (byte[]) null);
        while (i < i2) {
            hel helVar = (hel) this.m.get(i);
            int size = helVar.size();
            int i3 = 0;
            while (i3 < size) {
                ifg ifgVar = (ifg) helVar.get(i3);
                ifs j = ifgVar.j(bryVar);
                if (j.d == 4) {
                    hvi a = j.a();
                    ifjVar.b.put(ifgVar, a);
                    ifmVar = this;
                    ifjVar2 = ifjVar;
                    a.c(gvx.h(new gbm(ifmVar, bryVar, ifjVar2, 16, null)), ifmVar.a);
                } else {
                    ifmVar = this;
                    ifjVar2 = ifjVar;
                }
                i3++;
                if (ifmVar.n(j)) {
                    return;
                }
                this = ifmVar;
                ifjVar = ifjVar2;
            }
            i++;
        }
        ifm ifmVar2 = this;
        ifj ifjVar3 = ifjVar;
        ifjVar3.c = i2;
        if (ifjVar3.b.isEmpty()) {
            ifmVar2.k();
            ifmVar2.f();
        }
    }

    private final void m() {
        ifl iflVar;
        ifl iflVar2 = this.e;
        int i = iflVar2.e;
        hoq.I(!(i == 4), "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        if (i == 3) {
            iflVar = new ifl(iflVar2.a, 4, iflVar2.b, iflVar2.c);
        } else if (i == 1 && iflVar2.d) {
            int i2 = iflVar2.a;
            int i3 = iflVar2.b;
            iflVar = new ifl(i2, 2, i3, i3);
        } else {
            int i4 = iflVar2.b;
            int i5 = i4 + 1;
            int i6 = iflVar2.a;
            int i7 = iflVar2.c;
            iflVar = i5 < i6 ? new ifl(i6, 1, i5, i7) : new ifl(i6, 3, i4, i7);
        }
        this.e = iflVar;
        int i8 = iflVar.e - 1;
        if (i8 == 0) {
            h(this.t);
            return;
        }
        if (i8 != 2) {
            g();
            return;
        }
        iws b = this.k.b(this.l, this.q);
        this.j = b;
        b.a(this.i, this.t);
        int i9 = this.d;
        if (i9 > 0) {
            this.j.d(i9);
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            this.j.e(it.next());
        }
        if (this.f && this.c.isEmpty()) {
            this.j.c();
        }
        m();
    }

    private final boolean n(ifs ifsVar) {
        int i = ifsVar.d - 1;
        if (i == 0) {
            return o(ifsVar);
        }
        if (i == 1) {
            ikm ikmVar = ifsVar.e;
            iwr iwrVar = this.i;
            kbq kbqVar = (kbq) ikmVar.b;
            iwrVar.a(kbqVar, (kaa) ikmVar.a);
            if (this.e.e == 4) {
                this.j.r("Aborted RPC with exception", kbqVar.q);
            }
            this.h = true;
            return true;
        }
        byte[] bArr = null;
        if (i == 2) {
            throw null;
        }
        if (i != 3) {
            this.e.d = true;
            return false;
        }
        hvi a = ifsVar.a();
        this.b.add(a);
        a.c(gvx.h(new iep(this, a, 5, bArr)), this.a);
        return o(ifsVar);
    }

    private final boolean o(ifs ifsVar) {
        jww jwwVar = ifsVar.c;
        if (jwwVar == null) {
            return false;
        }
        if (this.e.e == 1) {
            this.q = jwwVar;
            return false;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Cannot return *WithCallOptions() from message processing methods");
        this.i.a(kbq.c(illegalStateException), new kaa());
        if (this.e.e == 4) {
            this.j.r("Interceptor returned invalid outcome", illegalStateException);
        }
        return true;
    }

    private final iwq p(jww jwwVar, kaa kaaVar, String str) {
        jwwVar.getClass();
        kaaVar.getClass();
        str.getClass();
        return new iwq(this.l, jwwVar, kaaVar, str);
    }

    private final iwq q(iwq iwqVar) {
        jww jwwVar = this.q;
        if (jwwVar == iwqVar.b) {
            return iwqVar;
        }
        return p(jwwVar, (kaa) iwqVar.a, (String) iwqVar.d);
    }

    @Override // defpackage.iws
    public final void a(iwr iwrVar, kaa kaaVar) {
        hel helVar = this.m;
        Set set = this.o;
        Executor executor = this.a;
        this.i = new ifi(this, new ifu(new ifo(iwrVar, helVar, set, executor)));
        this.t = kaaVar;
        executor.execute(gvx.h(new iep(this, kaaVar, 6)));
    }

    @Override // defpackage.iws
    public final void c() {
        this.a.execute(gvx.h(new iaq(this, 5)));
    }

    @Override // defpackage.iws
    public final void d(int i) {
        synchronized (this.r) {
            this.s += i;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Queue queue = this.r;
        synchronized (queue) {
            if (!queue.isEmpty()) {
                int i2 = this.s;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object poll = queue.poll();
                    if (poll != null) {
                        arrayDeque.add(poll);
                        this.s--;
                    }
                }
                boolean isEmpty = queue.isEmpty();
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    this.i.c(it.next());
                }
                if (isEmpty) {
                    this.i.a(kbq.b, null);
                }
            }
        }
        this.a.execute(gvx.h(new vz(this, i, 8)));
    }

    @Override // defpackage.iws
    public final void e(Object obj) {
        this.a.execute(gvx.h(new iep(this, obj, 7)));
    }

    public final void f() {
        if (this.f) {
            ifj ifjVar = (ifj) this.c.peekLast();
            int i = this.e.e - 1;
            if (i != 1) {
                if (i == 3 && ifjVar == null) {
                    this.j.c();
                    return;
                }
                return;
            }
            if (ifjVar == null || (ifjVar.b.isEmpty() && ifjVar.c == ifjVar.d.e.c + 1)) {
                m();
            }
        }
    }

    public final void g() {
        int i = this.e.e - 1;
        if (i != 1) {
            if (i != 3) {
                return;
            }
            for (ifj ifjVar : this.c) {
                l(ifjVar, ifjVar.c, this.e.a);
            }
            return;
        }
        for (ifj ifjVar2 : this.c) {
            int i2 = ifjVar2.c;
            int i3 = this.e.c;
            if (i2 <= i3) {
                l(ifjVar2, i2, i3 + 1);
            }
        }
    }

    public final void h(kaa kaaVar) {
        iwq p = p(this.q, kaaVar, this.k.a());
        hel helVar = (hel) this.m.get(this.e.b);
        int size = helVar.size();
        for (int i = 0; i < size; i++) {
            ifg ifgVar = (ifg) helVar.get(i);
            ifs e = ifgVar.e(q(p));
            if (e.d == 4) {
                hvi a = e.a();
                this.n.put(ifgVar, a);
                a.c(gvx.h(new iep(this, p, 8, null)), this.a);
            }
            if (n(e)) {
                return;
            }
            this.o.add(ifgVar);
        }
        if (this.n.isEmpty()) {
            m();
        }
    }

    public final void i(iwq iwqVar) {
        LinkedHashMap linkedHashMap = this.n;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((hvi) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            ifg ifgVar = (ifg) entry.getKey();
            ifs d = ifgVar.d(q(iwqVar));
            if (d.d == 4) {
                hvi a = d.a();
                linkedHashMap.put(ifgVar, a);
                a.c(gvx.h(new iep(this, iwqVar, 10, null)), this.a);
            }
            if (n(d)) {
                return;
            }
        }
        if (!linkedHashMap.isEmpty() || this.h) {
            return;
        }
        m();
    }

    public final void j(bry bryVar, ifj ifjVar) {
        ifm ifmVar;
        bry bryVar2;
        ifj ifjVar2;
        LinkedHashMap linkedHashMap = ifjVar.b;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((hvi) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            ifg ifgVar = (ifg) entry.getKey();
            ifs a = ifgVar.a();
            if (a.d == 4) {
                hvi a2 = a.a();
                linkedHashMap.put(ifgVar, a2);
                ifmVar = this;
                bryVar2 = bryVar;
                ifjVar2 = ifjVar;
                a2.c(gvx.h(new gbm(ifmVar, bryVar2, ifjVar2, 18, null)), ifmVar.a);
            } else {
                ifmVar = this;
                bryVar2 = bryVar;
                ifjVar2 = ifjVar;
            }
            if (ifmVar.n(a)) {
                return;
            }
            this = ifmVar;
            bryVar = bryVar2;
            ifjVar = ifjVar2;
        }
        ifm ifmVar2 = this;
        if (linkedHashMap.isEmpty()) {
            ifmVar2.k();
            ifmVar2.f();
        }
    }

    @Override // defpackage.iws
    public final void r(String str, Throwable th) {
        this.a.execute(gvx.h(new gbm(this, str, th, 17)));
    }
}

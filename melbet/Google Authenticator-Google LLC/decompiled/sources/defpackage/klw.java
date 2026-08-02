package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klw extends kbf implements jyo {
    public static final Logger b = Logger.getLogger(klw.class.getName());
    public static final kmb c = new klq();
    public final kjm d;
    public Executor e;
    public final khk f;
    public final jyf g;
    public final List h;
    public final kbi[] i;
    public final long j;
    public boolean k;
    public boolean l;
    public kbq m;
    public boolean n;
    public final khl o;
    public boolean q;
    public final jxr s;
    public final jxv t;
    public final jyl u;
    public final kev v;
    public final iwy w;
    private final jyp x;
    private boolean y;
    public final Object p = new Object();
    public final Set r = new HashSet();

    public klw(kly klyVar, khl khlVar, jxr jxrVar) {
        List unmodifiableList;
        kjm kjmVar = klyVar.i;
        kjmVar.getClass();
        this.d = kjmVar;
        bst bstVar = klyVar.t;
        HashMap hashMap = new HashMap();
        Iterator it = ((HashMap) bstVar.a).values().iterator();
        while (it.hasNext()) {
            for (kuq kuqVar : ((kuq) it.next()).f()) {
                hashMap.put(((kae) kuqVar.b).b, kuqVar);
            }
        }
        DesugarCollections.unmodifiableList(new ArrayList(((HashMap) bstVar.a).values()));
        this.f = new khk(DesugarCollections.unmodifiableMap(hashMap));
        jyf jyfVar = klyVar.h;
        jyfVar.getClass();
        this.g = jyfVar;
        this.o = khlVar;
        synchronized (this.p) {
            unmodifiableList = DesugarCollections.unmodifiableList(hel.q(((kcp) khlVar).b));
        }
        this.x = jyp.b("Server", String.valueOf(unmodifiableList));
        jxrVar.getClass();
        this.s = new jxr(jxrVar.f, jxrVar.g + 1).l(jys.a, this);
        this.t = klyVar.j;
        this.h = DesugarCollections.unmodifiableList(new ArrayList(klyVar.d));
        List list = klyVar.e;
        this.i = (kbi[]) list.toArray(new kbi[list.size()]);
        this.j = klyVar.l;
        jyl jylVar = klyVar.q;
        this.u = jylVar;
        this.v = new kev(kmr.a);
        iwy iwyVar = klyVar.r;
        iwyVar.getClass();
        this.w = iwyVar;
        jyl.b(jylVar.b, this);
    }

    public final void a() {
        Object obj = this.p;
        synchronized (obj) {
            if (this.l && this.r.isEmpty() && this.q) {
                if (this.y) {
                    throw new AssertionError("Server already terminated");
                }
                this.y = true;
                jyl jylVar = this.u;
                jyl.c(jylVar.b, this);
                Executor executor = this.e;
                if (executor != null) {
                    this.d.b(executor);
                    this.e = null;
                }
                obj.notifyAll();
            }
        }
    }

    public final void b() {
        synchronized (this.p) {
            if (!this.l) {
                this.l = true;
                boolean z = this.k;
                if (!z) {
                    this.q = true;
                    a();
                }
                if (z) {
                    this.o.c();
                }
            }
        }
        kbq e = kbq.l.e("Server shutdownNow invoked");
        synchronized (this.p) {
            if (this.m != null) {
                return;
            }
            this.m = e;
            ArrayList arrayList = new ArrayList(this.r);
            boolean z2 = this.n;
            if (z2) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((kcq) arrayList.get(i)).f(e);
                }
            }
        }
    }

    @Override // defpackage.jyv
    public final jyp c() {
        return this.x;
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.f("logId", this.x.a);
        T.b("transportServer", this.o);
        return T.toString();
    }
}

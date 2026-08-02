package M0;

import E1.AbstractC0033i;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import b1.C0186a;
import c1.C0201a;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import p.C1169e;
import p.C1170f;

/* loaded from: classes.dex */
public final class m implements L0.g, L0.h {

    /* renamed from: c, reason: collision with root package name */
    public final L0.c f931c;

    /* renamed from: d, reason: collision with root package name */
    public final a f932d;

    /* renamed from: e, reason: collision with root package name */
    public final V0.e f933e;

    /* renamed from: h, reason: collision with root package name */
    public final int f935h;

    /* renamed from: i, reason: collision with root package name */
    public final v f936i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f937j;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f941n;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f930a = new LinkedList();
    public final HashSet f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f934g = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f938k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public K0.b f939l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f940m = 0;

    public m(c cVar, L0.f fVar) {
        this.f941n = cVar;
        Looper looper = cVar.f923m.getLooper();
        A0.f a3 = fVar.a();
        F1.c cVar2 = new F1.c((String) a3.f24c, (String) a3.f25d, (C1170f) a3.f23b);
        C2.b bVar = (C2.b) fVar.f881c.f1599b;
        N0.r.c(bVar);
        L0.c c3 = bVar.c(fVar.f879a, looper, cVar2, fVar.f882d, this, this);
        String str = fVar.f880b;
        if (str != null && (c3 instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) c3).f2697r = str;
        }
        if (str != null && (c3 instanceof g)) {
            AbstractC0033i.p(c3);
            throw null;
        }
        this.f931c = c3;
        this.f932d = fVar.f883e;
        this.f933e = new V0.e(10);
        this.f935h = fVar.f;
        if (!c3.m()) {
            this.f936i = null;
            return;
        }
        Context context = cVar.f916e;
        W0.e eVar = cVar.f923m;
        A0.f a4 = fVar.a();
        this.f936i = new v(context, eVar, new F1.c((String) a4.f24c, (String) a4.f25d, (C1170f) a4.f23b));
    }

    @Override // L0.g
    public final void a(int i3) {
        Looper myLooper = Looper.myLooper();
        c cVar = this.f941n;
        if (myLooper == cVar.f923m.getLooper()) {
            i(i3);
        } else {
            cVar.f923m.post(new l(this, i3));
        }
    }

    @Override // L0.g
    public final void b() {
        Looper myLooper = Looper.myLooper();
        c cVar = this.f941n;
        if (myLooper == cVar.f923m.getLooper()) {
            h();
        } else {
            cVar.f923m.post(new B.b(2, this));
        }
    }

    @Override // L0.h
    public final void c(K0.b bVar) {
        o(bVar, null);
    }

    public final void d(K0.b bVar) {
        HashSet hashSet = this.f;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (N0.r.e(bVar, K0.b.f834e)) {
                this.f931c.j();
            }
            throw null;
        }
    }

    public final void e(Status status) {
        N0.r.a(this.f941n.f923m);
        f(status, null, false);
    }

    public final void f(Status status, RuntimeException runtimeException, boolean z) {
        N0.r.a(this.f941n.f923m);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f930a.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (!z || rVar.f951a == 2) {
                if (status != null) {
                    rVar.c(status);
                } else {
                    rVar.d(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.f930a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            r rVar = (r) arrayList.get(i3);
            if (!this.f931c.a()) {
                return;
            }
            if (k(rVar)) {
                linkedList.remove(rVar);
            }
        }
    }

    public final void h() {
        c cVar = this.f941n;
        N0.r.a(cVar.f923m);
        this.f939l = null;
        d(K0.b.f834e);
        if (this.f937j) {
            W0.e eVar = cVar.f923m;
            a aVar = this.f932d;
            eVar.removeMessages(11, aVar);
            cVar.f923m.removeMessages(9, aVar);
            this.f937j = false;
        }
        Iterator it = this.f934g.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        g();
        j();
    }

    public final void i(int i3) {
        c cVar = this.f941n;
        N0.r.a(cVar.f923m);
        this.f939l = null;
        this.f937j = true;
        String k3 = this.f931c.k();
        V0.e eVar = this.f933e;
        eVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i3 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i3 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (k3 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(k3);
        }
        eVar.F(true, new Status(20, sb.toString(), null, null));
        W0.e eVar2 = cVar.f923m;
        a aVar = this.f932d;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 9, aVar), 5000L);
        W0.e eVar3 = cVar.f923m;
        eVar3.sendMessageDelayed(Message.obtain(eVar3, 11, aVar), 120000L);
        ((SparseIntArray) cVar.f917g.f1599b).clear();
        Iterator it = this.f934g.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void j() {
        c cVar = this.f941n;
        W0.e eVar = cVar.f923m;
        a aVar = this.f932d;
        eVar.removeMessages(12, aVar);
        W0.e eVar2 = cVar.f923m;
        eVar2.sendMessageDelayed(eVar2.obtainMessage(12, aVar), cVar.f912a);
    }

    public final boolean k(r rVar) {
        K0.d dVar;
        if (rVar == null) {
            L0.c cVar = this.f931c;
            rVar.f(this.f933e, cVar.m());
            try {
                rVar.e(this);
                return true;
            } catch (DeadObjectException unused) {
                a(1);
                cVar.c("DeadObjectException thrown while running ApiCallRunner.");
            }
        } else {
            K0.d[] b3 = rVar.b(this);
            if (b3 != null && b3.length != 0) {
                K0.d[] i3 = this.f931c.i();
                if (i3 == null) {
                    i3 = new K0.d[0];
                }
                C1169e c1169e = new C1169e(i3.length);
                for (K0.d dVar2 : i3) {
                    c1169e.put(dVar2.f842a, Long.valueOf(dVar2.a()));
                }
                int length = b3.length;
                for (int i4 = 0; i4 < length; i4++) {
                    dVar = b3[i4];
                    Long l3 = (Long) c1169e.get(dVar.f842a);
                    if (l3 == null || l3.longValue() < dVar.a()) {
                        break;
                    }
                }
            }
            dVar = null;
            if (dVar != null) {
                Log.w("GoogleApiManager", this.f931c.getClass().getName() + " could not execute call because it requires feature (" + dVar.f842a + ", " + dVar.a() + ").");
                if (!this.f941n.f924n || !rVar.a(this)) {
                    rVar.d(new L0.k(dVar));
                    return true;
                }
                n nVar = new n(this.f932d, dVar);
                int indexOf = this.f938k.indexOf(nVar);
                if (indexOf >= 0) {
                    n nVar2 = (n) this.f938k.get(indexOf);
                    this.f941n.f923m.removeMessages(15, nVar2);
                    W0.e eVar = this.f941n.f923m;
                    eVar.sendMessageDelayed(Message.obtain(eVar, 15, nVar2), 5000L);
                } else {
                    this.f938k.add(nVar);
                    W0.e eVar2 = this.f941n.f923m;
                    eVar2.sendMessageDelayed(Message.obtain(eVar2, 15, nVar), 5000L);
                    W0.e eVar3 = this.f941n.f923m;
                    eVar3.sendMessageDelayed(Message.obtain(eVar3, 16, nVar), 120000L);
                    K0.b bVar = new K0.b(2, null);
                    if (!l(bVar)) {
                        this.f941n.b(bVar, this.f935h);
                    }
                }
                return false;
            }
            L0.c cVar2 = this.f931c;
            rVar.f(this.f933e, cVar2.m());
            try {
                rVar.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                a(1);
                cVar2.c("DeadObjectException thrown while running ApiCallRunner.");
            }
        }
        return true;
    }

    public final boolean l(K0.b bVar) {
        synchronized (c.f910q) {
            this.f941n.getClass();
        }
        return false;
    }

    public final void m() {
        c cVar = this.f941n;
        N0.r.a(cVar.f923m);
        L0.c cVar2 = this.f931c;
        if (cVar2.a() || cVar2.h()) {
            return;
        }
        try {
            V0.e eVar = cVar.f917g;
            Context context = cVar.f916e;
            eVar.getClass();
            N0.r.c(context);
            int g3 = cVar2.g();
            SparseIntArray sparseIntArray = (SparseIntArray) eVar.f1599b;
            int i3 = sparseIntArray.get(g3, -1);
            if (i3 == -1) {
                i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= sparseIntArray.size()) {
                        i3 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i4);
                    if (keyAt > g3 && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i3 == -1) {
                    i3 = ((K0.e) eVar.f1600c).b(context, g3);
                }
                sparseIntArray.put(g3, i3);
            }
            if (i3 != 0) {
                K0.b bVar = new K0.b(i3, null);
                Log.w("GoogleApiManager", "The service for " + cVar2.getClass().getName() + " is not available: " + bVar.toString());
                o(bVar, null);
                return;
            }
            a aVar = this.f932d;
            o oVar = new o();
            oVar.f = cVar;
            oVar.f947d = null;
            oVar.f948e = null;
            oVar.f944a = false;
            oVar.f945b = cVar2;
            oVar.f946c = aVar;
            if (cVar2.m()) {
                v vVar = this.f936i;
                N0.r.c(vVar);
                C0201a c0201a = vVar.f969h;
                if (c0201a != null) {
                    c0201a.l();
                }
                Integer valueOf = Integer.valueOf(System.identityHashCode(vVar));
                F1.c cVar3 = vVar.f968g;
                cVar3.f = valueOf;
                W0.e eVar2 = vVar.f966d;
                vVar.f969h = (C0201a) vVar.f967e.c(vVar.f965c, eVar2.getLooper(), cVar3, (C0186a) cVar3.f490e, vVar, vVar);
                vVar.f970i = oVar;
                Set set = vVar.f;
                if (set == null || set.isEmpty()) {
                    eVar2.post(new B.b(4, vVar));
                } else {
                    C0201a c0201a2 = vVar.f969h;
                    c0201a2.getClass();
                    c0201a2.f(new N0.g(c0201a2));
                }
            }
            try {
                cVar2.f(oVar);
            } catch (SecurityException e3) {
                o(new K0.b(10), e3);
            }
        } catch (IllegalStateException e4) {
            o(new K0.b(10), e4);
        }
    }

    public final void n(r rVar) {
        N0.r.a(this.f941n.f923m);
        boolean a3 = this.f931c.a();
        LinkedList linkedList = this.f930a;
        if (a3) {
            if (k(rVar)) {
                j();
                return;
            } else {
                linkedList.add(rVar);
                return;
            }
        }
        linkedList.add(rVar);
        K0.b bVar = this.f939l;
        if (bVar == null || bVar.f836b == 0 || bVar.f837c == null) {
            m();
        } else {
            o(bVar, null);
        }
    }

    public final void o(K0.b bVar, RuntimeException runtimeException) {
        C0201a c0201a;
        N0.r.a(this.f941n.f923m);
        v vVar = this.f936i;
        if (vVar != null && (c0201a = vVar.f969h) != null) {
            c0201a.l();
        }
        N0.r.a(this.f941n.f923m);
        this.f939l = null;
        ((SparseIntArray) this.f941n.f917g.f1599b).clear();
        d(bVar);
        if ((this.f931c instanceof P0.d) && bVar.f836b != 24) {
            c cVar = this.f941n;
            cVar.f913b = true;
            W0.e eVar = cVar.f923m;
            eVar.sendMessageDelayed(eVar.obtainMessage(19), 300000L);
        }
        if (bVar.f836b == 4) {
            e(c.f909p);
            return;
        }
        if (this.f930a.isEmpty()) {
            this.f939l = bVar;
            return;
        }
        if (runtimeException != null) {
            N0.r.a(this.f941n.f923m);
            f(null, runtimeException, false);
            return;
        }
        if (!this.f941n.f924n) {
            e(c.c(this.f932d, bVar));
            return;
        }
        f(c.c(this.f932d, bVar), null, true);
        if (this.f930a.isEmpty() || l(bVar) || this.f941n.b(bVar, this.f935h)) {
            return;
        }
        if (bVar.f836b == 18) {
            this.f937j = true;
        }
        if (!this.f937j) {
            e(c.c(this.f932d, bVar));
            return;
        }
        c cVar2 = this.f941n;
        a aVar = this.f932d;
        W0.e eVar2 = cVar2.f923m;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 9, aVar), 5000L);
    }

    public final void p(K0.b bVar) {
        N0.r.a(this.f941n.f923m);
        L0.c cVar = this.f931c;
        cVar.c("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(bVar));
        o(bVar, null);
    }

    public final void q() {
        N0.r.a(this.f941n.f923m);
        Status status = c.o;
        e(status);
        this.f933e.F(false, status);
        for (f fVar : (f[]) this.f934g.keySet().toArray(new f[0])) {
            n(new x(new d1.e()));
        }
        d(new K0.b(4));
        L0.c cVar = this.f931c;
        if (cVar.a()) {
            cVar.d(new C0.e(8, this));
        }
    }
}

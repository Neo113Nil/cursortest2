package T0;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import h1.C0402a;
import i1.C0420a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import k.v0;
import m1.AbstractC0521b;
import q.AbstractC0584d;
import q.C0582b;
import q.C0583c;
import u0.C0673c;

/* loaded from: classes.dex */
public final class B implements S0.e, S0.f {

    /* renamed from: e, reason: collision with root package name */
    public final S0.a f2223e;

    /* renamed from: f, reason: collision with root package name */
    public final C0166a f2224f;

    /* renamed from: g, reason: collision with root package name */
    public final C0673c f2225g;

    /* renamed from: j, reason: collision with root package name */
    public final int f2228j;

    /* renamed from: k, reason: collision with root package name */
    public final L f2229k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2230l;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0169d f2233o;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedList f2222d = new LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f2226h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f2227i = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2231m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public R0.a f2232n = null;

    public B(C0169d c0169d, W0.c cVar) {
        this.f2233o = c0169d;
        Looper looper = c0169d.f2293m.getLooper();
        B0.c a7 = cVar.a();
        C0583c c0583c = (C0583c) a7.f72h;
        String str = (String) a7.f71g;
        String str2 = (String) a7.f73i;
        C0402a c0402a = C0402a.f4333a;
        v0 v0Var = new v0(c0583c, null, str, str2, c0402a);
        AbstractC0521b abstractC0521b = cVar.f2792c.f2200a;
        U0.t.f(abstractC0521b);
        S0.a c7 = abstractC0521b.c(cVar.f2790a, looper, v0Var, cVar.f2793d, this, this);
        String str3 = cVar.f2791b;
        if (str3 != null && (c7 instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) c7).f3888w = str3;
        }
        if (str3 != null && (c7 instanceof AbstractServiceConnectionC0173h)) {
            C1.c.l(c7);
            throw null;
        }
        this.f2223e = c7;
        this.f2224f = cVar.f2794e;
        this.f2225g = new C0673c(8);
        this.f2228j = cVar.f2795f;
        if (!c7.m()) {
            this.f2229k = null;
            return;
        }
        Context context = c0169d.f2285e;
        c1.e eVar = c0169d.f2293m;
        B0.c a8 = cVar.a();
        this.f2229k = new L(context, eVar, new v0((C0583c) a8.f72h, null, (String) a8.f71g, (String) a8.f73i, c0402a));
    }

    public final void a(R0.a aVar) {
        HashSet hashSet = this.f2226h;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (U0.t.i(aVar, R0.a.f2051j)) {
                this.f2223e.i();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        U0.t.b(this.f2233o.f2293m);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z5) {
        U0.t.b(this.f2233o.f2293m);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f2222d.iterator();
        while (it.hasNext()) {
            H h7 = (H) it.next();
            if (!z5 || h7.f2244a == 2) {
                if (status != null) {
                    h7.c(status);
                } else {
                    h7.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f2222d;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            H h7 = (H) arrayList.get(i7);
            if (!this.f2223e.a()) {
                return;
            }
            if (h(h7)) {
                linkedList.remove(h7);
            }
        }
    }

    public final void e() {
        C0169d c0169d = this.f2233o;
        U0.t.b(c0169d.f2293m);
        this.f2232n = null;
        a(R0.a.f2051j);
        c1.e eVar = c0169d.f2293m;
        if (this.f2230l) {
            C0166a c0166a = this.f2224f;
            eVar.removeMessages(11, c0166a);
            eVar.removeMessages(9, c0166a);
            this.f2230l = false;
        }
        Iterator it = this.f2227i.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        d();
        g();
    }

    public final void f(int i7) {
        C0169d c0169d = this.f2233o;
        c1.e eVar = c0169d.f2293m;
        U0.t.b(c0169d.f2293m);
        this.f2232n = null;
        this.f2230l = true;
        String k4 = this.f2223e.k();
        C0673c c0673c = this.f2225g;
        c0673c.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i7 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i7 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (k4 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(k4);
        }
        c0673c.m(true, new Status(20, sb.toString(), null, null));
        C0166a c0166a = this.f2224f;
        eVar.sendMessageDelayed(Message.obtain(eVar, 9, c0166a), 5000L);
        eVar.sendMessageDelayed(Message.obtain(eVar, 11, c0166a), 120000L);
        ((SparseIntArray) c0169d.f2287g.f6034f).clear();
        Iterator it = this.f2227i.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void g() {
        C0169d c0169d = this.f2233o;
        c1.e eVar = c0169d.f2293m;
        C0166a c0166a = this.f2224f;
        eVar.removeMessages(12, c0166a);
        eVar.sendMessageDelayed(eVar.obtainMessage(12, c0166a), c0169d.f2281a);
    }

    public final boolean h(H h7) {
        R0.c cVar;
        if (!(h7 instanceof H)) {
            C0673c c0673c = this.f2225g;
            S0.a aVar = this.f2223e;
            h7.f(c0673c, aVar.m());
            try {
                h7.e(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                aVar.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        R0.c[] b7 = h7.b(this);
        if (b7 != null && b7.length != 0) {
            R0.c[] h8 = this.f2223e.h();
            if (h8 == null) {
                h8 = new R0.c[0];
            }
            int length = h8.length;
            C0582b c0582b = new C0582b();
            if (length == 0) {
                c0582b.f5742f = AbstractC0584d.f5714a;
                c0582b.f5743g = AbstractC0584d.f5715b;
            } else {
                c0582b.a(length);
            }
            c0582b.f5744h = 0;
            for (R0.c cVar2 : h8) {
                c0582b.put(cVar2.f2059f, Long.valueOf(cVar2.a()));
            }
            int length2 = b7.length;
            for (int i7 = 0; i7 < length2; i7++) {
                cVar = b7[i7];
                Long l7 = (Long) c0582b.getOrDefault(cVar.f2059f, null);
                if (l7 == null || l7.longValue() < cVar.a()) {
                    break;
                }
            }
        }
        cVar = null;
        if (cVar == null) {
            C0673c c0673c2 = this.f2225g;
            S0.a aVar2 = this.f2223e;
            h7.f(c0673c2, aVar2.m());
            try {
                h7.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                aVar2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f2223e.getClass().getName();
        String str = cVar.f2059f;
        long a7 = cVar.a();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(a7);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f2233o.f2294n || !h7.a(this)) {
            h7.d(new S0.h(cVar));
            return true;
        }
        C c7 = new C(this.f2224f, cVar);
        int indexOf = this.f2231m.indexOf(c7);
        if (indexOf >= 0) {
            C c8 = (C) this.f2231m.get(indexOf);
            this.f2233o.f2293m.removeMessages(15, c8);
            c1.e eVar = this.f2233o.f2293m;
            eVar.sendMessageDelayed(Message.obtain(eVar, 15, c8), 5000L);
        } else {
            this.f2231m.add(c7);
            c1.e eVar2 = this.f2233o.f2293m;
            eVar2.sendMessageDelayed(Message.obtain(eVar2, 15, c7), 5000L);
            c1.e eVar3 = this.f2233o.f2293m;
            eVar3.sendMessageDelayed(Message.obtain(eVar3, 16, c7), 120000L);
            R0.a aVar3 = new R0.a(2, null);
            if (!i(aVar3)) {
                this.f2233o.a(aVar3, this.f2228j);
            }
        }
        return false;
    }

    public final boolean i(R0.a aVar) {
        synchronized (C0169d.f2279q) {
        }
        return false;
    }

    public final void j() {
        C0169d c0169d = this.f2233o;
        U0.t.b(c0169d.f2293m);
        S0.a aVar = this.f2223e;
        if (aVar.a() || aVar.f()) {
            return;
        }
        try {
            int v5 = c0169d.f2287g.v(c0169d.f2285e, aVar);
            if (v5 != 0) {
                R0.a aVar2 = new R0.a(v5, null);
                String name = aVar.getClass().getName();
                String aVar3 = aVar2.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + aVar3.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(aVar3);
                Log.w("GoogleApiManager", sb.toString());
                l(aVar2, null);
                return;
            }
            D d7 = new D(c0169d, aVar, this.f2224f);
            if (aVar.m()) {
                L l7 = this.f2229k;
                U0.t.f(l7);
                Handler handler = l7.f2250e;
                v0 v0Var = l7.f2253h;
                C0420a c0420a = l7.f2254i;
                if (c0420a != null) {
                    c0420a.l();
                }
                v0Var.f5142l = Integer.valueOf(System.identityHashCode(l7));
                l7.f2254i = (C0420a) l7.f2251f.c(l7.f2249d, handler.getLooper(), v0Var, (C0402a) v0Var.f5141k, l7, l7);
                l7.f2255j = d7;
                Set set = l7.f2252g;
                if (set == null || set.isEmpty()) {
                    handler.post(new A.b(9, l7));
                } else {
                    l7.f2254i.x();
                }
            }
            try {
                aVar.j(d7);
            } catch (SecurityException e4) {
                l(new R0.a(10), e4);
            }
        } catch (IllegalStateException e7) {
            l(new R0.a(10), e7);
        }
    }

    public final void k(H h7) {
        U0.t.b(this.f2233o.f2293m);
        boolean a7 = this.f2223e.a();
        LinkedList linkedList = this.f2222d;
        if (a7) {
            if (h(h7)) {
                g();
                return;
            } else {
                linkedList.add(h7);
                return;
            }
        }
        linkedList.add(h7);
        R0.a aVar = this.f2232n;
        if (aVar == null || !aVar.a()) {
            j();
        } else {
            l(this.f2232n, null);
        }
    }

    public final void l(R0.a aVar, RuntimeException runtimeException) {
        C0420a c0420a;
        U0.t.b(this.f2233o.f2293m);
        L l7 = this.f2229k;
        if (l7 != null && (c0420a = l7.f2254i) != null) {
            c0420a.l();
        }
        U0.t.b(this.f2233o.f2293m);
        this.f2232n = null;
        ((SparseIntArray) this.f2233o.f2287g.f6034f).clear();
        a(aVar);
        if ((this.f2223e instanceof W0.d) && aVar.f2053g != 24) {
            C0169d c0169d = this.f2233o;
            c0169d.f2282b = true;
            c1.e eVar = c0169d.f2293m;
            eVar.sendMessageDelayed(eVar.obtainMessage(19), 300000L);
        }
        if (aVar.f2053g == 4) {
            b(C0169d.f2278p);
            return;
        }
        if (this.f2222d.isEmpty()) {
            this.f2232n = aVar;
            return;
        }
        if (runtimeException != null) {
            U0.t.b(this.f2233o.f2293m);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f2233o.f2294n) {
            b(C0169d.b(this.f2224f, aVar));
            return;
        }
        c(C0169d.b(this.f2224f, aVar), null, true);
        if (this.f2222d.isEmpty() || i(aVar) || this.f2233o.a(aVar, this.f2228j)) {
            return;
        }
        if (aVar.f2053g == 18) {
            this.f2230l = true;
        }
        if (!this.f2230l) {
            b(C0169d.b(this.f2224f, aVar));
        } else {
            c1.e eVar2 = this.f2233o.f2293m;
            eVar2.sendMessageDelayed(Message.obtain(eVar2, 9, this.f2224f), 5000L);
        }
    }

    public final void m() {
        U0.t.b(this.f2233o.f2293m);
        Status status = C0169d.f2277o;
        b(status);
        this.f2225g.m(false, status);
        for (AbstractC0172g abstractC0172g : (AbstractC0172g[]) this.f2227i.keySet().toArray(new AbstractC0172g[0])) {
            k(new O(new k1.h()));
        }
        a(new R0.a(4));
        S0.a aVar = this.f2223e;
        if (aVar.a()) {
            aVar.c(new D3.M(24, this));
        }
    }

    @Override // S0.e
    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        c1.e eVar = this.f2233o.f2293m;
        if (myLooper == eVar.getLooper()) {
            e();
        } else {
            eVar.post(new A.b(7, this));
        }
    }

    @Override // S0.f
    public final void onConnectionFailed(R0.a aVar) {
        l(aVar, null);
    }

    @Override // S0.e
    public final void onConnectionSuspended(int i7) {
        Looper myLooper = Looper.myLooper();
        c1.e eVar = this.f2233o.f2293m;
        if (myLooper == eVar.getLooper()) {
            f(i7);
        } else {
            eVar.post(new A(this, i7, 0));
        }
    }
}

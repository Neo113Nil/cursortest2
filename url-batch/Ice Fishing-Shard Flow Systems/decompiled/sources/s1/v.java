package s1;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import i.C0511M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import n.w1;
import r1.InterfaceC0844c;
import t1.C0906C;
import t1.C0916c;
import u.C0934e;
import u.C0935f;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class v implements r1.k, r1.l {

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0844c f7736f;

    /* renamed from: g, reason: collision with root package name */
    public final C0870a f7737g;

    /* renamed from: h, reason: collision with root package name */
    public final P0.s f7738h;

    /* renamed from: k, reason: collision with root package name */
    public final int f7740k;

    /* renamed from: l, reason: collision with root package name */
    public final BinderC0864F f7741l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7742m;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0873d f7746q;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f7735e = new LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f7739i = new HashSet();
    public final HashMap j = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f7743n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public q1.b f7744o = null;

    /* renamed from: p, reason: collision with root package name */
    public int f7745p = 0;

    public v(C0873d c0873d, r1.j jVar) {
        this.f7746q = c0873d;
        Looper looper = c0873d.f7658m.getLooper();
        D0.j a7 = jVar.a();
        C0935f c0935f = (C0935f) a7.f330e;
        String str = (String) a7.f331i;
        String str2 = (String) a7.f332l;
        H1.a aVar = H1.a.f955b;
        w1 w1Var = new w1(c0935f, null, str, str2, aVar);
        AbstractC1053a abstractC1053a = jVar.f7452d.f7435a;
        t1.u.f(abstractC1053a);
        InterfaceC0844c g7 = abstractC1053a.g(jVar.f7449a, looper, w1Var, jVar.f7453e, this, this);
        C0511M c0511m = jVar.f7451c;
        if (c0511m == null || !(g7 instanceof com.google.android.gms.common.internal.a)) {
            String str3 = jVar.f7450b;
            if (str3 != null && (g7 instanceof com.google.android.gms.common.internal.a)) {
                ((com.google.android.gms.common.internal.a) g7).f4398w = str3;
            }
        } else {
            ((com.google.android.gms.common.internal.a) g7).f4399x = c0511m;
        }
        this.f7736f = g7;
        this.f7737g = jVar.f7454f;
        P0.s sVar = new P0.s();
        sVar.f2251d = Collections.synchronizedMap(new WeakHashMap());
        sVar.f2252e = Collections.synchronizedMap(new WeakHashMap());
        this.f7738h = sVar;
        this.f7740k = jVar.f7455g;
        if (!g7.b()) {
            this.f7741l = null;
            return;
        }
        Context context = c0873d.f7651e;
        C1.e eVar = c0873d.f7658m;
        D0.j a8 = jVar.a();
        this.f7741l = new BinderC0864F(context, eVar, new w1((C0935f) a8.f330e, null, (String) a8.f331i, (String) a8.f332l, aVar));
    }

    public final void a() {
        C0873d c0873d = this.f7746q;
        t1.u.b(c0873d.f7658m);
        this.f7744o = null;
        i(q1.b.f7309n);
        if (this.f7742m) {
            C1.e eVar = c0873d.f7658m;
            C0870a c0870a = this.f7737g;
            eVar.removeMessages(11, c0870a);
            c0873d.f7658m.removeMessages(9, c0870a);
            this.f7742m = false;
        }
        Iterator it = this.j.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        d();
        h();
    }

    public final void b(int i2) {
        t1.u.b(this.f7746q.f7658m);
        this.f7744o = null;
        this.f7742m = true;
        String str = ((com.google.android.gms.common.internal.a) this.f7736f).f4382f;
        P0.s sVar = this.f7738h;
        sVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        sVar.A(true, new Status(20, sb.toString(), null, null));
        C0870a c0870a = this.f7737g;
        C0873d c0873d = this.f7746q;
        C1.e eVar = c0873d.f7658m;
        eVar.sendMessageDelayed(Message.obtain(eVar, 9, c0870a), 5000L);
        C1.e eVar2 = c0873d.f7658m;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 11, c0870a), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) c0873d.f7653g.f2251d;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.j.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final boolean c(q1.b bVar) {
        synchronized (C0873d.f7645q) {
            this.f7746q.getClass();
        }
        return false;
    }

    public final void d() {
        LinkedList linkedList = this.f7735e;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0862D abstractC0862D = (AbstractC0862D) arrayList.get(i2);
            if (!((com.google.android.gms.common.internal.a) this.f7736f).m()) {
                return;
            }
            if (e(abstractC0862D)) {
                linkedList.remove(abstractC0862D);
            }
        }
    }

    public final boolean e(AbstractC0862D abstractC0862D) {
        if (!(abstractC0862D instanceof AbstractC0862D)) {
            P0.s sVar = this.f7738h;
            InterfaceC0844c interfaceC0844c = this.f7736f;
            abstractC0862D.f(sVar, interfaceC0844c.b());
            try {
                abstractC0862D.g(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                ((com.google.android.gms.common.internal.a) interfaceC0844c).e("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        q1.d[] a7 = abstractC0862D.a(this);
        q1.d dVar = null;
        if (a7 != null && a7.length != 0) {
            C0906C c0906c = ((com.google.android.gms.common.internal.a) this.f7736f).f4374A;
            q1.d[] dVarArr = c0906c == null ? null : c0906c.f7898e;
            if (dVarArr == null) {
                dVarArr = new q1.d[0];
            }
            C0934e c0934e = new C0934e(dVarArr.length);
            for (q1.d dVar2 : dVarArr) {
                c0934e.put(dVar2.f7318d, Long.valueOf(dVar2.a()));
            }
            for (q1.d dVar3 : a7) {
                Long l7 = (Long) c0934e.get(dVar3.f7318d);
                if (l7 == null || l7.longValue() < dVar3.a()) {
                    dVar = dVar3;
                    break;
                }
            }
        }
        if (dVar == null) {
            P0.s sVar2 = this.f7738h;
            InterfaceC0844c interfaceC0844c2 = this.f7736f;
            abstractC0862D.f(sVar2, interfaceC0844c2.b());
            try {
                abstractC0862D.g(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                ((com.google.android.gms.common.internal.a) interfaceC0844c2).e("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f7736f.getClass().getName();
        String str = dVar.f7318d;
        long a8 = dVar.a();
        StringBuilder sb = new StringBuilder(name.length() + 53 + String.valueOf(str).length() + 2 + String.valueOf(a8).length() + 2);
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(a8);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        C0873d c0873d = this.f7746q;
        if (!c0873d.f7659n || !abstractC0862D.b(this)) {
            abstractC0862D.e(new r1.n(dVar));
            return true;
        }
        int c7 = abstractC0862D.c(this);
        w wVar = new w(this.f7737g, dVar);
        ArrayList arrayList = this.f7743n;
        int indexOf = arrayList.indexOf(wVar);
        if (indexOf >= 0) {
            w wVar2 = (w) arrayList.get(indexOf);
            c0873d.f7658m.removeMessages(15, wVar2);
            c0873d.f7658m.sendMessageDelayed(Message.obtain(c0873d.f7658m, 15, wVar2), 5000L);
        } else {
            arrayList.add(wVar);
            c0873d.f7658m.sendMessageDelayed(Message.obtain(c0873d.f7658m, 15, wVar), 5000L);
            c0873d.f7658m.sendMessageDelayed(Message.obtain(c0873d.f7658m, 16, wVar), 120000L);
            q1.b bVar = new q1.b(1, 2, null, null, Integer.valueOf(c7));
            if (c(bVar)) {
                String str2 = dVar.f7318d;
                long a9 = dVar.a();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(a9).length());
                sb2.append("A dialog should be displayed for missing feature: ");
                sb2.append(str2);
                sb2.append(", version: ");
                sb2.append(a9);
                Log.w("GoogleApiManager", sb2.toString());
            } else if (c0873d.e(bVar, this.f7740k)) {
                String str3 = dVar.f7318d;
                long a10 = dVar.a();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(a10).length());
                sb3.append("Notification displayed for missing feature: ");
                sb3.append(str3);
                sb3.append(", version: ");
                sb3.append(a10);
                Log.w("GoogleApiManager", sb3.toString());
            }
        }
        return false;
    }

    public final void f(Status status, Exception exc, boolean z7) {
        t1.u.b(this.f7746q.f7658m);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f7735e.iterator();
        while (it.hasNext()) {
            AbstractC0862D abstractC0862D = (AbstractC0862D) it.next();
            if (!z7 || abstractC0862D.f7607a == 2) {
                if (status != null) {
                    abstractC0862D.d(status);
                } else {
                    abstractC0862D.e(exc);
                }
                it.remove();
            }
        }
    }

    public final void g(Status status) {
        t1.u.b(this.f7746q.f7658m);
        f(status, null, false);
    }

    public final void h() {
        C0873d c0873d = this.f7746q;
        C1.e eVar = c0873d.f7658m;
        C0870a c0870a = this.f7737g;
        eVar.removeMessages(12, c0870a);
        C1.e eVar2 = c0873d.f7658m;
        eVar2.sendMessageDelayed(eVar2.obtainMessage(12, c0870a), c0873d.f7647a);
    }

    public final void i(q1.b bVar) {
        HashSet hashSet = this.f7739i;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        if (t1.u.i(bVar, q1.b.f7309n)) {
            com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) this.f7736f;
            if (!aVar.m() || aVar.f4383g == null) {
                throw new RuntimeException("Failed to connect when checking package");
            }
        }
        throw null;
    }

    public final void j(q1.b bVar) {
        t1.u.b(this.f7746q.f7658m);
        InterfaceC0844c interfaceC0844c = this.f7736f;
        String name = interfaceC0844c.getClass().getName();
        String valueOf = String.valueOf(bVar);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        ((com.google.android.gms.common.internal.a) interfaceC0844c).e(sb.toString());
        k(bVar, null);
    }

    public final void k(q1.b bVar, RuntimeException runtimeException) {
        I1.a aVar;
        C0873d c0873d = this.f7746q;
        t1.u.b(c0873d.f7658m);
        BinderC0864F binderC0864F = this.f7741l;
        if (binderC0864F != null && (aVar = binderC0864F.j) != null) {
            aVar.d();
        }
        t1.u.b(this.f7746q.f7658m);
        this.f7744o = null;
        SparseIntArray sparseIntArray = (SparseIntArray) c0873d.f7653g.f2251d;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        i(bVar);
        if ((this.f7736f instanceof v1.e) && bVar.f7311e != 24) {
            c0873d.f7648b = true;
            C1.e eVar = c0873d.f7658m;
            eVar.sendMessageDelayed(eVar.obtainMessage(19), 300000L);
        }
        int i2 = bVar.f7311e;
        if (i2 == 4) {
            g(C0873d.f7644p);
            return;
        }
        if (i2 == 25) {
            g(C0873d.b(this.f7737g, bVar));
            return;
        }
        LinkedList linkedList = this.f7735e;
        if (linkedList.isEmpty()) {
            this.f7744o = bVar;
            return;
        }
        if (runtimeException != null) {
            t1.u.b(c0873d.f7658m);
            f(null, runtimeException, false);
            return;
        }
        if (!c0873d.f7659n) {
            g(C0873d.b(this.f7737g, bVar));
            return;
        }
        C0870a c0870a = this.f7737g;
        f(C0873d.b(c0870a, bVar), null, true);
        if (linkedList.isEmpty() || c(bVar) || c0873d.e(bVar, this.f7740k)) {
            return;
        }
        if (bVar.f7311e == 18) {
            this.f7742m = true;
        }
        if (!this.f7742m) {
            g(C0873d.b(c0870a, bVar));
        } else {
            C1.e eVar2 = c0873d.f7658m;
            eVar2.sendMessageDelayed(Message.obtain(eVar2, 9, c0870a), 5000L);
        }
    }

    public final void l(AbstractC0862D abstractC0862D) {
        t1.u.b(this.f7746q.f7658m);
        boolean m2 = ((com.google.android.gms.common.internal.a) this.f7736f).m();
        LinkedList linkedList = this.f7735e;
        if (m2) {
            if (e(abstractC0862D)) {
                h();
                return;
            } else {
                linkedList.add(abstractC0862D);
                return;
            }
        }
        linkedList.add(abstractC0862D);
        q1.b bVar = this.f7744o;
        if (bVar == null || !bVar.a()) {
            n();
        } else {
            k(this.f7744o, null);
        }
    }

    public final void m() {
        C0873d c0873d = this.f7746q;
        t1.u.b(c0873d.f7658m);
        Status status = C0873d.f7643o;
        g(status);
        this.f7738h.A(false, status);
        for (AbstractC0874e abstractC0874e : (AbstractC0874e[]) this.j.keySet().toArray(new AbstractC0874e[0])) {
            l(new C0866H(new K1.h()));
        }
        i(new q1.b(4, null, null));
        if (((com.google.android.gms.common.internal.a) this.f7736f).m()) {
            c0873d.f7658m.post(new F.b(22, new C0511M(20, this)));
        }
    }

    public final void n() {
        C0873d c0873d = this.f7746q;
        t1.u.b(c0873d.f7658m);
        InterfaceC0844c interfaceC0844c = this.f7736f;
        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) interfaceC0844c;
        if (aVar.m() || aVar.n()) {
            return;
        }
        try {
            int z7 = c0873d.f7653g.z(c0873d.f7651e, aVar);
            if (z7 != 0) {
                q1.b bVar = new q1.b(z7, null, null);
                String name = interfaceC0844c.getClass().getName();
                String bVar2 = bVar.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + bVar2.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(bVar2);
                Log.w("GoogleApiManager", sb.toString());
                k(bVar, null);
                return;
            }
            x xVar = new x(c0873d, aVar, this.f7737g);
            if (aVar.b()) {
                BinderC0864F binderC0864F = this.f7741l;
                t1.u.f(binderC0864F);
                I1.a aVar2 = binderC0864F.j;
                if (aVar2 != null) {
                    aVar2.d();
                }
                w1 w1Var = binderC0864F.f7616i;
                w1Var.f6947o = Integer.valueOf(System.identityHashCode(binderC0864F));
                D1.d dVar = binderC0864F.f7614g;
                Context context = binderC0864F.f7612e;
                Handler handler = binderC0864F.f7613f;
                binderC0864F.j = (I1.a) dVar.g(context, handler.getLooper(), w1Var, (H1.a) w1Var.f6946n, binderC0864F, binderC0864F);
                binderC0864F.f7617k = xVar;
                Set set = binderC0864F.f7615h;
                if (set == null || set.isEmpty()) {
                    handler.post(new F.b(binderC0864F));
                } else {
                    I1.a aVar3 = binderC0864F.j;
                    aVar3.getClass();
                    aVar3.f4389n = new C0916c(aVar3);
                    aVar3.p(2, null);
                }
            }
            try {
                aVar.f4389n = xVar;
                aVar.p(2, null);
            } catch (SecurityException e7) {
                k(new q1.b(10, null, null), e7);
            }
        } catch (IllegalStateException e8) {
            k(new q1.b(10, null, null), e8);
        }
    }

    @Override // r1.k
    public final void onConnected(Bundle bundle) {
        C0873d c0873d = this.f7746q;
        if (Looper.myLooper() == c0873d.f7658m.getLooper()) {
            a();
        } else {
            c0873d.f7658m.post(new F.b(21, this));
        }
    }

    @Override // r1.l
    public final void onConnectionFailed(q1.b bVar) {
        k(bVar, null);
    }

    @Override // r1.k
    public final void onConnectionSuspended(int i2) {
        C0873d c0873d = this.f7746q;
        if (Looper.myLooper() == c0873d.f7658m.getLooper()) {
            b(i2);
        } else {
            c0873d.f7658m.post(new O0.d(this, i2, 2));
        }
    }
}

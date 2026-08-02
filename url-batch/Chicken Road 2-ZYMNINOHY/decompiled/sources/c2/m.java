package c2;

import E.AbstractC0005f;
import E1.C0035k;
import a2.C0162b;
import a2.C0164d;
import a2.C0165e;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import d2.C0389g;
import f2.C0422d;
import i2.AbstractC0457a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import m2.HandlerC1312d;
import r2.C1403a;
import s2.C1411a;

/* loaded from: classes.dex */
public final class m implements b2.g, b2.h {

    /* renamed from: b, reason: collision with root package name */
    public final b2.c f5683b;

    /* renamed from: c, reason: collision with root package name */
    public final C0284a f5684c;

    /* renamed from: d, reason: collision with root package name */
    public final l2.e f5685d;

    /* renamed from: g, reason: collision with root package name */
    public final int f5688g;

    /* renamed from: h, reason: collision with root package name */
    public final u f5689h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5690i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0286c f5694m;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f5682a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f5686e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f5687f = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f5691j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public C0162b f5692k = null;

    /* renamed from: l, reason: collision with root package name */
    public int f5693l = 0;

    public m(C0286c c0286c, b2.f fVar) {
        this.f5694m = c0286c;
        Looper looper = c0286c.f5674m.getLooper();
        B1.j a3 = fVar.a();
        L1.h hVar = new L1.h((String) a3.f202c, (String) a3.f203d, (p.f) a3.f201b);
        AbstractC0457a abstractC0457a = (AbstractC0457a) fVar.f5389c.f14270b;
        d2.s.c(abstractC0457a);
        b2.c a4 = abstractC0457a.a(fVar.f5387a, looper, hVar, fVar.f5390d, this, this);
        String str = fVar.f5388b;
        if (str != null && (a4 instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) a4).f5793r = str;
        }
        if (str != null && (a4 instanceof g)) {
            AbstractC0005f.x(a4);
            throw null;
        }
        this.f5683b = a4;
        this.f5684c = fVar.f5391e;
        this.f5685d = new l2.e(28);
        this.f5688g = fVar.f5392f;
        if (!a4.m()) {
            this.f5689h = null;
            return;
        }
        Context context = c0286c.f5666e;
        HandlerC1312d handlerC1312d = c0286c.f5674m;
        B1.j a5 = fVar.a();
        this.f5689h = new u(context, handlerC1312d, new L1.h((String) a5.f202c, (String) a5.f203d, (p.f) a5.f201b));
    }

    @Override // b2.g
    public final void a(int i4) {
        Looper myLooper = Looper.myLooper();
        HandlerC1312d handlerC1312d = this.f5694m.f5674m;
        if (myLooper == handlerC1312d.getLooper()) {
            i(i4);
        } else {
            handlerC1312d.post(new l(this, i4));
        }
    }

    @Override // b2.g
    public final void b() {
        Looper myLooper = Looper.myLooper();
        HandlerC1312d handlerC1312d = this.f5694m.f5674m;
        if (myLooper == handlerC1312d.getLooper()) {
            h();
        } else {
            handlerC1312d.post(new B.b(9, this));
        }
    }

    @Override // b2.h
    public final void c(C0162b c0162b) {
        o(c0162b, null);
    }

    public final void d(C0162b c0162b) {
        HashSet hashSet = this.f5686e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (d2.s.e(c0162b, C0162b.f4263e)) {
                this.f5683b.d();
            }
            throw null;
        }
    }

    public final void e(Status status) {
        d2.s.a(this.f5694m.f5674m);
        f(status, null, false);
    }

    public final void f(Status status, Exception exc, boolean z) {
        d2.s.a(this.f5694m.f5674m);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f5682a.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (!z || qVar.f5699a == 2) {
                if (status != null) {
                    qVar.c(status);
                } else {
                    qVar.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.f5682a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            q qVar = (q) arrayList.get(i4);
            if (!this.f5683b.g()) {
                return;
            }
            if (k(qVar)) {
                linkedList.remove(qVar);
            }
        }
    }

    public final void h() {
        C0286c c0286c = this.f5694m;
        d2.s.a(c0286c.f5674m);
        this.f5692k = null;
        d(C0162b.f4263e);
        HandlerC1312d handlerC1312d = c0286c.f5674m;
        if (this.f5690i) {
            C0284a c0284a = this.f5684c;
            handlerC1312d.removeMessages(11, c0284a);
            handlerC1312d.removeMessages(9, c0284a);
            this.f5690i = false;
        }
        Iterator it = this.f5687f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        g();
        j();
    }

    public final void i(int i4) {
        C0286c c0286c = this.f5694m;
        HandlerC1312d handlerC1312d = c0286c.f5674m;
        d2.s.a(c0286c.f5674m);
        this.f5692k = null;
        this.f5690i = true;
        String l4 = this.f5683b.l();
        l2.e eVar = this.f5685d;
        eVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i4 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i4 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (l4 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(l4);
        }
        eVar.u(true, new Status(20, sb.toString(), null, null));
        C0284a c0284a = this.f5684c;
        handlerC1312d.sendMessageDelayed(Message.obtain(handlerC1312d, 9, c0284a), 5000L);
        handlerC1312d.sendMessageDelayed(Message.obtain(handlerC1312d, 11, c0284a), 120000L);
        ((SparseIntArray) c0286c.f5668g.f8264b).clear();
        Iterator it = this.f5687f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void j() {
        C0286c c0286c = this.f5694m;
        HandlerC1312d handlerC1312d = c0286c.f5674m;
        C0284a c0284a = this.f5684c;
        handlerC1312d.removeMessages(12, c0284a);
        handlerC1312d.sendMessageDelayed(handlerC1312d.obtainMessage(12, c0284a), c0286c.f5662a);
    }

    public final boolean k(q qVar) {
        C0164d c0164d;
        if (qVar == null) {
            l2.e eVar = this.f5685d;
            b2.c cVar = this.f5683b;
            qVar.f(eVar, cVar.m());
            try {
                qVar.e(this);
                return true;
            } catch (DeadObjectException unused) {
                a(1);
                cVar.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        C0164d[] b4 = qVar.b(this);
        if (b4 != null && b4.length != 0) {
            C0164d[] j4 = this.f5683b.j();
            if (j4 == null) {
                j4 = new C0164d[0];
            }
            p.e eVar2 = new p.e(j4.length);
            for (C0164d c0164d2 : j4) {
                eVar2.put(c0164d2.f4271a, Long.valueOf(c0164d2.a()));
            }
            int length = b4.length;
            for (int i4 = 0; i4 < length; i4++) {
                c0164d = b4[i4];
                Long l4 = (Long) eVar2.get(c0164d.f4271a);
                if (l4 == null || l4.longValue() < c0164d.a()) {
                    break;
                }
            }
        }
        c0164d = null;
        if (c0164d == null) {
            l2.e eVar3 = this.f5685d;
            b2.c cVar2 = this.f5683b;
            qVar.f(eVar3, cVar2.m());
            try {
                qVar.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                a(1);
                cVar2.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.f5683b.getClass().getName() + " could not execute call because it requires feature (" + c0164d.f4271a + ", " + c0164d.a() + ").");
        if (!this.f5694m.n || !qVar.a(this)) {
            qVar.d(new b2.k(c0164d));
            return true;
        }
        n nVar = new n(this.f5684c, c0164d);
        int indexOf = this.f5691j.indexOf(nVar);
        if (indexOf >= 0) {
            n nVar2 = (n) this.f5691j.get(indexOf);
            this.f5694m.f5674m.removeMessages(15, nVar2);
            HandlerC1312d handlerC1312d = this.f5694m.f5674m;
            handlerC1312d.sendMessageDelayed(Message.obtain(handlerC1312d, 15, nVar2), 5000L);
        } else {
            this.f5691j.add(nVar);
            HandlerC1312d handlerC1312d2 = this.f5694m.f5674m;
            handlerC1312d2.sendMessageDelayed(Message.obtain(handlerC1312d2, 15, nVar), 5000L);
            HandlerC1312d handlerC1312d3 = this.f5694m.f5674m;
            handlerC1312d3.sendMessageDelayed(Message.obtain(handlerC1312d3, 16, nVar), 120000L);
            C0162b c0162b = new C0162b(2, null);
            if (!l(c0162b)) {
                this.f5694m.b(c0162b, this.f5688g);
            }
        }
        return false;
    }

    public final boolean l(C0162b c0162b) {
        synchronized (C0286c.f5660q) {
        }
        return false;
    }

    public final void m() {
        C0286c c0286c = this.f5694m;
        d2.s.a(c0286c.f5674m);
        b2.c cVar = this.f5683b;
        if (cVar.g() || cVar.c()) {
            return;
        }
        try {
            C0389g c0389g = c0286c.f5668g;
            Context context = c0286c.f5666e;
            SparseIntArray sparseIntArray = (SparseIntArray) c0389g.f8264b;
            d2.s.c(context);
            int i4 = cVar.i();
            int i5 = ((SparseIntArray) c0389g.f8264b).get(i4, -1);
            if (i5 == -1) {
                i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i6 >= sparseIntArray.size()) {
                        i5 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i6);
                    if (keyAt > i4 && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i5 == -1) {
                    i5 = ((C0165e) c0389g.f8265c).b(context, i4);
                }
                sparseIntArray.put(i4, i5);
            }
            if (i5 != 0) {
                C0162b c0162b = new C0162b(i5, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + c0162b.toString());
                o(c0162b, null);
                return;
            }
            C0035k c0035k = new C0035k();
            c0035k.f629f = c0286c;
            c0035k.f627d = null;
            c0035k.f628e = null;
            c0035k.f624a = false;
            c0035k.f625b = cVar;
            c0035k.f626c = this.f5684c;
            if (cVar.m()) {
                u uVar = this.f5689h;
                d2.s.c(uVar);
                Handler handler = uVar.f5714c;
                L1.h hVar = uVar.f5717f;
                C1411a c1411a = uVar.f5718g;
                if (c1411a != null) {
                    c1411a.e();
                }
                hVar.f1634b = Integer.valueOf(System.identityHashCode(uVar));
                uVar.f5718g = (C1411a) uVar.f5715d.a(uVar.f5713b, handler.getLooper(), hVar, (C1403a) hVar.f1638f, uVar, uVar);
                uVar.f5719h = c0035k;
                Set set = uVar.f5716e;
                if (set == null || set.isEmpty()) {
                    handler.post(new B.b(11, uVar));
                } else {
                    C1411a c1411a2 = uVar.f5718g;
                    c1411a2.getClass();
                    c1411a2.f(new d2.h(c1411a2));
                }
            }
            try {
                cVar.f(c0035k);
            } catch (SecurityException e4) {
                o(new C0162b(10), e4);
            }
        } catch (IllegalStateException e5) {
            o(new C0162b(10), e5);
        }
    }

    public final void n(q qVar) {
        d2.s.a(this.f5694m.f5674m);
        boolean g4 = this.f5683b.g();
        LinkedList linkedList = this.f5682a;
        if (g4) {
            if (k(qVar)) {
                j();
                return;
            } else {
                linkedList.add(qVar);
                return;
            }
        }
        linkedList.add(qVar);
        C0162b c0162b = this.f5692k;
        if (c0162b == null || c0162b.f4265b == 0 || c0162b.f4266c == null) {
            m();
        } else {
            o(c0162b, null);
        }
    }

    public final void o(C0162b c0162b, RuntimeException runtimeException) {
        C1411a c1411a;
        d2.s.a(this.f5694m.f5674m);
        u uVar = this.f5689h;
        if (uVar != null && (c1411a = uVar.f5718g) != null) {
            c1411a.e();
        }
        d2.s.a(this.f5694m.f5674m);
        this.f5692k = null;
        ((SparseIntArray) this.f5694m.f5668g.f8264b).clear();
        d(c0162b);
        if ((this.f5683b instanceof C0422d) && c0162b.f4265b != 24) {
            C0286c c0286c = this.f5694m;
            c0286c.f5663b = true;
            HandlerC1312d handlerC1312d = c0286c.f5674m;
            handlerC1312d.sendMessageDelayed(handlerC1312d.obtainMessage(19), 300000L);
        }
        if (c0162b.f4265b == 4) {
            e(C0286c.f5659p);
            return;
        }
        if (this.f5682a.isEmpty()) {
            this.f5692k = c0162b;
            return;
        }
        if (runtimeException != null) {
            d2.s.a(this.f5694m.f5674m);
            f(null, runtimeException, false);
            return;
        }
        if (!this.f5694m.n) {
            e(C0286c.c(this.f5684c, c0162b));
            return;
        }
        f(C0286c.c(this.f5684c, c0162b), null, true);
        if (this.f5682a.isEmpty() || l(c0162b) || this.f5694m.b(c0162b, this.f5688g)) {
            return;
        }
        if (c0162b.f4265b == 18) {
            this.f5690i = true;
        }
        if (!this.f5690i) {
            e(C0286c.c(this.f5684c, c0162b));
            return;
        }
        C0286c c0286c2 = this.f5694m;
        C0284a c0284a = this.f5684c;
        HandlerC1312d handlerC1312d2 = c0286c2.f5674m;
        handlerC1312d2.sendMessageDelayed(Message.obtain(handlerC1312d2, 9, c0284a), 5000L);
    }

    public final void p(C0162b c0162b) {
        d2.s.a(this.f5694m.f5674m);
        b2.c cVar = this.f5683b;
        cVar.b("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(c0162b));
        o(c0162b, null);
    }

    public final void q() {
        d2.s.a(this.f5694m.f5674m);
        Status status = C0286c.o;
        e(status);
        this.f5685d.u(false, status);
        for (f fVar : (f[]) this.f5687f.keySet().toArray(new f[0])) {
            n(new w(new t2.d()));
        }
        d(new C0162b(4));
        b2.c cVar = this.f5683b;
        if (cVar.g()) {
            cVar.k(new t1.h(29, this));
        }
    }
}

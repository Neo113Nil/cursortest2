package G1;

import B1.C0097d;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import i.C0670e;
import i.C0671f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import w2.C1294c;

/* loaded from: classes.dex */
public final class l implements F1.c, F1.d {

    /* renamed from: b, reason: collision with root package name */
    public final F1.a f3131b;

    /* renamed from: c, reason: collision with root package name */
    public final a f3132c;

    /* renamed from: d, reason: collision with root package name */
    public final y.t f3133d;

    /* renamed from: g, reason: collision with root package name */
    public final int f3136g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3137h;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f3140k;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f3130a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f3134e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f3135f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f3138i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public E1.b f3139j = null;

    public l(d dVar, J1.c cVar) {
        this.f3140k = dVar;
        Looper looper = dVar.f3122m.getLooper();
        cVar.getClass();
        C0097d c0097d = new C0097d(4, false);
        Set emptySet = Collections.emptySet();
        if (((C0671f) c0097d.f987e) == null) {
            c0097d.f987e = new C0671f(0);
        }
        ((C0671f) c0097d.f987e).addAll(emptySet);
        Context context = cVar.f3384a;
        c0097d.f989j = context.getClass().getName();
        c0097d.f988i = context.getPackageName();
        C0097d c0097d2 = new C0097d((C0671f) c0097d.f987e, (String) c0097d.f988i, (String) c0097d.f989j);
        J1.b bVar = (J1.b) cVar.f3386c.f11494e;
        H1.o.d(bVar);
        Context context2 = cVar.f3384a;
        H1.i iVar = cVar.f3387d;
        bVar.getClass();
        J1.d dVar2 = new J1.d(context2, looper, c0097d2, iVar, this, this);
        String str = cVar.f3385b;
        if (str != null) {
            dVar2.f6051r = str;
        }
        this.f3131b = dVar2;
        this.f3132c = cVar.f3388e;
        this.f3133d = new y.t(8);
        this.f3136g = cVar.f3389f;
    }

    @Override // F1.c
    public final void a(int i2) {
        Looper myLooper = Looper.myLooper();
        d dVar = this.f3140k;
        if (myLooper == dVar.f3122m.getLooper()) {
            i(i2);
        } else {
            dVar.f3122m.post(new k(this, i2));
        }
    }

    @Override // F1.c
    public final void b() {
        Looper myLooper = Looper.myLooper();
        d dVar = this.f3140k;
        if (myLooper == dVar.f3122m.getLooper()) {
            h();
        } else {
            dVar.f3122m.post(new j(0, this));
        }
    }

    @Override // F1.d
    public final void c(E1.b bVar) {
        o(bVar, null);
    }

    public final void d(E1.b bVar) {
        HashSet hashSet = this.f3134e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (H1.o.f(bVar, E1.b.f2276k)) {
                this.f3131b.d();
            }
            throw null;
        }
    }

    public final void e(Status status) {
        H1.o.a(this.f3140k.f3122m);
        f(status, null, false);
    }

    public final void f(Status status, RuntimeException runtimeException, boolean z4) {
        H1.o.a(this.f3140k.f3122m);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f3130a.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (!z4 || rVar.f3154a == 2) {
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
        LinkedList linkedList = this.f3130a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            r rVar = (r) arrayList.get(i2);
            if (!this.f3131b.c()) {
                return;
            }
            if (k(rVar)) {
                linkedList.remove(rVar);
            }
        }
    }

    public final void h() {
        d dVar = this.f3140k;
        H1.o.a(dVar.f3122m);
        this.f3139j = null;
        d(E1.b.f2276k);
        if (this.f3137h) {
            P1.e eVar = dVar.f3122m;
            a aVar = this.f3132c;
            eVar.removeMessages(11, aVar);
            dVar.f3122m.removeMessages(9, aVar);
            this.f3137h = false;
        }
        Iterator it = this.f3135f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        g();
        j();
    }

    public final void i(int i2) {
        d dVar = this.f3140k;
        H1.o.a(dVar.f3122m);
        this.f3139j = null;
        this.f3137h = true;
        String f4 = this.f3131b.f();
        y.t tVar = this.f3133d;
        tVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (f4 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(f4);
        }
        tVar.v(true, new Status(20, sb.toString(), null, null));
        P1.e eVar = dVar.f3122m;
        a aVar = this.f3132c;
        eVar.sendMessageDelayed(Message.obtain(eVar, 9, aVar), 5000L);
        P1.e eVar2 = dVar.f3122m;
        eVar2.sendMessageDelayed(Message.obtain(eVar2, 11, aVar), 120000L);
        ((SparseIntArray) dVar.f3116g.f11494e).clear();
        Iterator it = this.f3135f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void j() {
        d dVar = this.f3140k;
        P1.e eVar = dVar.f3122m;
        a aVar = this.f3132c;
        eVar.removeMessages(12, aVar);
        P1.e eVar2 = dVar.f3122m;
        eVar2.sendMessageDelayed(eVar2.obtainMessage(12, aVar), dVar.f3110a);
    }

    public final boolean k(r rVar) {
        E1.d dVar;
        if (rVar == null) {
            F1.a aVar = this.f3131b;
            rVar.f(this.f3133d, aVar.l());
            try {
                rVar.e(this);
            } catch (DeadObjectException unused) {
                a(1);
                aVar.k("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        E1.d[] b4 = rVar.b(this);
        if (b4 != null && b4.length != 0) {
            E1.d[] b5 = this.f3131b.b();
            if (b5 == null) {
                b5 = new E1.d[0];
            }
            C0670e c0670e = new C0670e(b5.length);
            for (E1.d dVar2 : b5) {
                c0670e.put(dVar2.f2284d, Long.valueOf(dVar2.a()));
            }
            int length = b4.length;
            for (int i2 = 0; i2 < length; i2++) {
                dVar = b4[i2];
                Long l4 = (Long) c0670e.get(dVar.f2284d);
                if (l4 == null || l4.longValue() < dVar.a()) {
                    break;
                }
            }
        }
        dVar = null;
        if (dVar == null) {
            F1.a aVar2 = this.f3131b;
            rVar.f(this.f3133d, aVar2.l());
            try {
                rVar.e(this);
            } catch (DeadObjectException unused2) {
                a(1);
                aVar2.k("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.f3131b.getClass().getName() + " could not execute call because it requires feature (" + dVar.f2284d + ", " + dVar.a() + ").");
        if (!this.f3140k.f3123n || !rVar.a(this)) {
            rVar.d(new F1.g(dVar));
            return true;
        }
        m mVar = new m(this.f3132c, dVar);
        int indexOf = this.f3138i.indexOf(mVar);
        if (indexOf >= 0) {
            m mVar2 = (m) this.f3138i.get(indexOf);
            this.f3140k.f3122m.removeMessages(15, mVar2);
            P1.e eVar = this.f3140k.f3122m;
            Message obtain = Message.obtain(eVar, 15, mVar2);
            this.f3140k.getClass();
            eVar.sendMessageDelayed(obtain, 5000L);
        } else {
            this.f3138i.add(mVar);
            P1.e eVar2 = this.f3140k.f3122m;
            Message obtain2 = Message.obtain(eVar2, 15, mVar);
            this.f3140k.getClass();
            eVar2.sendMessageDelayed(obtain2, 5000L);
            P1.e eVar3 = this.f3140k.f3122m;
            Message obtain3 = Message.obtain(eVar3, 16, mVar);
            this.f3140k.getClass();
            eVar3.sendMessageDelayed(obtain3, 120000L);
            E1.b bVar = new E1.b(2, null);
            if (!l(bVar)) {
                this.f3140k.a(bVar, this.f3136g);
            }
        }
        return false;
    }

    public final boolean l(E1.b bVar) {
        synchronized (d.f3108q) {
            this.f3140k.getClass();
        }
        return false;
    }

    public final void m() {
        d dVar = this.f3140k;
        H1.o.a(dVar.f3122m);
        F1.a aVar = this.f3131b;
        if (aVar.c() || aVar.a()) {
            return;
        }
        try {
            y.t tVar = dVar.f3116g;
            Context context = dVar.f3114e;
            tVar.getClass();
            H1.o.d(context);
            int n2 = aVar.n();
            SparseIntArray sparseIntArray = (SparseIntArray) tVar.f11494e;
            int i2 = sparseIntArray.get(n2, -1);
            if (i2 == -1) {
                i2 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= sparseIntArray.size()) {
                        i2 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i4);
                    if (keyAt > n2 && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i2 == -1) {
                    i2 = ((E1.e) tVar.f11495i).b(context, n2);
                }
                sparseIntArray.put(n2, i2);
            }
            if (i2 == 0) {
                o oVar = new o(dVar, aVar, this.f3132c);
                if (aVar.l()) {
                    H1.o.d(null);
                    throw null;
                }
                try {
                    aVar.i(oVar);
                    return;
                } catch (SecurityException e4) {
                    o(new E1.b(10), e4);
                    return;
                }
            }
            E1.b bVar = new E1.b(i2, null);
            Log.w("GoogleApiManager", "The service for " + aVar.getClass().getName() + " is not available: " + bVar.toString());
            o(bVar, null);
        } catch (IllegalStateException e5) {
            o(new E1.b(10), e5);
        }
    }

    public final void n(r rVar) {
        H1.o.a(this.f3140k.f3122m);
        boolean c4 = this.f3131b.c();
        LinkedList linkedList = this.f3130a;
        if (c4) {
            if (k(rVar)) {
                j();
                return;
            } else {
                linkedList.add(rVar);
                return;
            }
        }
        linkedList.add(rVar);
        E1.b bVar = this.f3139j;
        if (bVar == null || bVar.f2278e == 0 || bVar.f2279i == null) {
            m();
        } else {
            o(bVar, null);
        }
    }

    public final void o(E1.b bVar, RuntimeException runtimeException) {
        H1.o.a(this.f3140k.f3122m);
        H1.o.a(this.f3140k.f3122m);
        this.f3139j = null;
        ((SparseIntArray) this.f3140k.f3116g.f11494e).clear();
        d(bVar);
        if ((this.f3131b instanceof J1.d) && bVar.f2278e != 24) {
            d dVar = this.f3140k;
            dVar.f3111b = true;
            P1.e eVar = dVar.f3122m;
            eVar.sendMessageDelayed(eVar.obtainMessage(19), 300000L);
        }
        if (bVar.f2278e == 4) {
            e(d.f3107p);
            return;
        }
        if (this.f3130a.isEmpty()) {
            this.f3139j = bVar;
            return;
        }
        if (runtimeException != null) {
            H1.o.a(this.f3140k.f3122m);
            f(null, runtimeException, false);
            return;
        }
        if (!this.f3140k.f3123n) {
            e(d.b(this.f3132c, bVar));
            return;
        }
        f(d.b(this.f3132c, bVar), null, true);
        if (this.f3130a.isEmpty() || l(bVar) || this.f3140k.a(bVar, this.f3136g)) {
            return;
        }
        if (bVar.f2278e == 18) {
            this.f3137h = true;
        }
        if (!this.f3137h) {
            e(d.b(this.f3132c, bVar));
            return;
        }
        P1.e eVar2 = this.f3140k.f3122m;
        Message obtain = Message.obtain(eVar2, 9, this.f3132c);
        this.f3140k.getClass();
        eVar2.sendMessageDelayed(obtain, 5000L);
    }

    public final void p() {
        H1.o.a(this.f3140k.f3122m);
        Status status = d.f3106o;
        e(status);
        this.f3133d.v(false, status);
        for (g gVar : (g[]) this.f3135f.keySet().toArray(new g[0])) {
            n(new x(new U1.e()));
        }
        d(new E1.b(4));
        F1.a aVar = this.f3131b;
        if (aVar.c()) {
            aVar.h(new C1294c(this));
        }
    }
}

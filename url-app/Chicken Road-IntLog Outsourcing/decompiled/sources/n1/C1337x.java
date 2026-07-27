package n1;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.onesignal.debug.internal.crash.AnrConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import l.q0;
import m1.C1277d;
import m1.InterfaceC1276c;
import r.C1392b;
import r.C1398h;
import r.C1400j;

/* renamed from: n1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1337x extends GoogleApiClient implements InterfaceC1306J {

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f11440b;

    /* renamed from: c, reason: collision with root package name */
    public final o1.o f11441c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1308L f11442d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11443e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f11444f;

    /* renamed from: g, reason: collision with root package name */
    public final Looper f11445g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedList f11446h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f11447i;

    /* renamed from: j, reason: collision with root package name */
    public final long f11448j;

    /* renamed from: k, reason: collision with root package name */
    public final long f11449k;

    /* renamed from: l, reason: collision with root package name */
    public final HandlerC1335v f11450l;

    /* renamed from: m, reason: collision with root package name */
    public final l1.f f11451m;

    /* renamed from: n, reason: collision with root package name */
    public C1305I f11452n;

    /* renamed from: o, reason: collision with root package name */
    public final C1392b f11453o;

    /* renamed from: p, reason: collision with root package name */
    public Set f11454p;

    /* renamed from: q, reason: collision with root package name */
    public final q0 f11455q;

    /* renamed from: r, reason: collision with root package name */
    public final C1392b f11456r;

    /* renamed from: s, reason: collision with root package name */
    public final E1.f f11457s;

    /* renamed from: t, reason: collision with root package name */
    public final V0.j f11458t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f11459u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f11460v;

    /* renamed from: w, reason: collision with root package name */
    public final S f11461w;

    public C1337x(Context context, ReentrantLock reentrantLock, Looper looper, q0 q0Var, C1392b c1392b, ArrayList arrayList, ArrayList arrayList2, C1392b c1392b2, int i2, int i3, ArrayList arrayList3) {
        l1.f fVar = l1.f.f11010d;
        E1.f fVar2 = F1.b.f675a;
        this.f11442d = null;
        this.f11446h = new LinkedList();
        this.f11448j = 120000L;
        this.f11449k = AnrConstants.DEFAULT_ANR_THRESHOLD_MS;
        this.f11454p = new HashSet();
        this.f11458t = new V0.j(19);
        this.f11460v = null;
        U.e eVar = new U.e(this);
        this.f11444f = context;
        this.f11440b = reentrantLock;
        this.f11441c = new o1.o(looper, eVar);
        this.f11445g = looper;
        this.f11450l = new HandlerC1335v(this, looper, 0);
        this.f11451m = fVar;
        this.f11443e = i2;
        if (i2 >= 0) {
            this.f11460v = Integer.valueOf(i3);
        }
        this.f11456r = c1392b;
        this.f11453o = c1392b2;
        this.f11459u = arrayList3;
        this.f11461w = new S(0);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m1.i iVar = (m1.i) it.next();
            o1.o oVar = this.f11441c;
            oVar.getClass();
            o1.u.g(iVar);
            synchronized (oVar.f11584i) {
                try {
                    if (oVar.f11577b.contains(iVar)) {
                        Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + String.valueOf(iVar) + " is already registered");
                    } else {
                        oVar.f11577b.add(iVar);
                    }
                } finally {
                }
            }
            if (((C1337x) oVar.f11576a.f3053a).f()) {
                A1.c cVar = oVar.f11583h;
                cVar.sendMessage(cVar.obtainMessage(1, iVar));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            m1.j jVar = (m1.j) it2.next();
            o1.o oVar2 = this.f11441c;
            oVar2.getClass();
            o1.u.g(jVar);
            synchronized (oVar2.f11584i) {
                try {
                    if (oVar2.f11579d.contains(jVar)) {
                        Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + String.valueOf(jVar) + " is already registered");
                    } else {
                        oVar2.f11579d.add(jVar);
                    }
                } finally {
                }
            }
        }
        this.f11455q = q0Var;
        this.f11457s = fVar2;
    }

    public static int g(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= ((InterfaceC1276c) it.next()).n();
        }
        return z5 ? 1 : 3;
    }

    public static /* bridge */ /* synthetic */ void h(C1337x c1337x) {
        c1337x.f11440b.lock();
        try {
            if (c1337x.f11447i) {
                c1337x.l();
            }
        } finally {
            c1337x.f11440b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final B1.n a(B1.n nVar) {
        C1392b c1392b = this.f11453o;
        m1.e eVar = nVar.f237m;
        o1.u.a("GoogleApiClient is not configured to use " + (eVar != null ? eVar.f11125c : "the API") + " required for this call.", c1392b.containsKey(nVar.f236l));
        this.f11440b.lock();
        try {
            InterfaceC1308L interfaceC1308L = this.f11442d;
            if (interfaceC1308L == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f11447i) {
                this.f11446h.add(nVar);
                while (!this.f11446h.isEmpty()) {
                    B1.n nVar2 = (B1.n) this.f11446h.remove();
                    S s2 = this.f11461w;
                    ((Set) s2.f11345a).add(nVar2);
                    nVar2.f4986g.set((W1.e) s2.f11346b);
                    nVar2.L(Status.f4974e);
                }
            } else {
                nVar = interfaceC1308L.c(nVar);
            }
            this.f11440b.unlock();
            return nVar;
        } catch (Throwable th) {
            this.f11440b.unlock();
            throw th;
        }
    }

    @Override // n1.InterfaceC1306J
    public final void b(Bundle bundle) {
        while (!this.f11446h.isEmpty()) {
            a((B1.n) this.f11446h.remove());
        }
        o1.o oVar = this.f11441c;
        if (Looper.myLooper() != oVar.f11583h.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (oVar.f11584i) {
            try {
                if (oVar.f11582g) {
                    throw new IllegalStateException();
                }
                oVar.f11583h.removeMessages(1);
                oVar.f11582g = true;
                if (!oVar.f11578c.isEmpty()) {
                    throw new IllegalStateException();
                }
                ArrayList arrayList = new ArrayList(oVar.f11577b);
                int i2 = oVar.f11581f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m1.i iVar = (m1.i) it.next();
                    if (!oVar.f11580e || !((C1337x) oVar.f11576a.f3053a).f() || oVar.f11581f.get() != i2) {
                        break;
                    } else if (!oVar.f11578c.contains(iVar)) {
                        iVar.onConnected(bundle);
                    }
                }
                oVar.f11578c.clear();
                oVar.f11582g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final InterfaceC1276c c() {
        InterfaceC1276c interfaceC1276c = (InterfaceC1276c) this.f11453o.getOrDefault(E1.c.f643c, null);
        o1.u.h(interfaceC1276c, "Appropriate Api was not requested.");
        return interfaceC1276c;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        ReentrantLock reentrantLock = this.f11440b;
        reentrantLock.lock();
        try {
            int i2 = 2;
            boolean z = false;
            if (this.f11443e >= 0) {
                o1.u.i("Sign-in mode should have been set explicitly by auto-manage.", this.f11460v != null);
            } else {
                Integer num = this.f11460v;
                if (num == null) {
                    this.f11460v = Integer.valueOf(g(this.f11453o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.f11460v;
            o1.u.g(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i2 = intValue;
                } else if (intValue != 2) {
                    i2 = intValue;
                    o1.u.a("Illegal sign-in mode: " + i2, z);
                    j(i2);
                    l();
                    reentrantLock.unlock();
                    return;
                }
                o1.u.a("Illegal sign-in mode: " + i2, z);
                j(i2);
                l();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context d() {
        return this.f11444f;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        ReentrantLock reentrantLock = this.f11440b;
        reentrantLock.lock();
        try {
            this.f11461w.a();
            InterfaceC1308L interfaceC1308L = this.f11442d;
            if (interfaceC1308L != null) {
                interfaceC1308L.b();
            }
            Set<C1322i> set = (Set) this.f11458t.f3212b;
            for (C1322i c1322i : set) {
                c1322i.f11388b = null;
                c1322i.f11389c = null;
            }
            set.clear();
            LinkedList<B1.n> linkedList = this.f11446h;
            for (B1.n nVar : linkedList) {
                nVar.f4986g.set(null);
                nVar.E();
            }
            linkedList.clear();
            if (this.f11442d != null) {
                i();
                o1.o oVar = this.f11441c;
                oVar.f11580e = false;
                oVar.f11581f.incrementAndGet();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper e() {
        return this.f11445g;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean f() {
        InterfaceC1308L interfaceC1308L = this.f11442d;
        return interfaceC1308L != null && interfaceC1308L.e();
    }

    public final boolean i() {
        if (!this.f11447i) {
            return false;
        }
        this.f11447i = false;
        this.f11450l.removeMessages(2);
        this.f11450l.removeMessages(1);
        C1305I c1305i = this.f11452n;
        if (c1305i != null) {
            c1305i.a();
            this.f11452n = null;
        }
        return true;
    }

    public final void j(int i2) {
        Integer num = this.f11460v;
        if (num == null) {
            this.f11460v = Integer.valueOf(i2);
        } else if (num.intValue() != i2) {
            int intValue = this.f11460v.intValue();
            String str = intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            StringBuilder sb = new StringBuilder("Cannot use sign-in mode: ");
            sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED");
            sb.append(". Mode was already set to ");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f11442d != null) {
            return;
        }
        C1392b c1392b = this.f11453o;
        Iterator it = ((C1400j) c1392b.values()).iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= ((InterfaceC1276c) it.next()).n();
        }
        int intValue2 = this.f11460v.intValue();
        ReentrantLock reentrantLock = this.f11440b;
        ArrayList arrayList = this.f11459u;
        if (intValue2 != 1) {
            if (intValue2 == 2 && z) {
                C1392b c1392b2 = new C1392b();
                C1392b c1392b3 = new C1392b();
                Iterator it2 = ((C1398h) c1392b.entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    InterfaceC1276c interfaceC1276c = (InterfaceC1276c) entry.getValue();
                    interfaceC1276c.getClass();
                    if (interfaceC1276c.n()) {
                        c1392b2.put((C1277d) entry.getKey(), interfaceC1276c);
                    } else {
                        c1392b3.put((C1277d) entry.getKey(), interfaceC1276c);
                    }
                }
                o1.u.i("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !c1392b2.isEmpty());
                C1392b c1392b4 = new C1392b();
                C1392b c1392b5 = new C1392b();
                C1392b c1392b6 = this.f11456r;
                Iterator it3 = ((C1398h) c1392b6.keySet()).iterator();
                while (it3.hasNext()) {
                    m1.e eVar = (m1.e) it3.next();
                    C1277d c1277d = eVar.f11124b;
                    if (c1392b2.containsKey(c1277d)) {
                        c1392b4.put(eVar, (Boolean) c1392b6.getOrDefault(eVar, null));
                    } else {
                        if (!c1392b3.containsKey(c1277d)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        c1392b5.put(eVar, (Boolean) c1392b6.getOrDefault(eVar, null));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    X x5 = (X) arrayList.get(i3);
                    if (c1392b4.containsKey(x5.f11354a)) {
                        arrayList2.add(x5);
                    } else {
                        if (!c1392b5.containsKey(x5.f11354a)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList3.add(x5);
                    }
                }
                this.f11442d = new C1325l(this.f11444f, this, reentrantLock, this.f11445g, this.f11451m, c1392b2, c1392b3, this.f11455q, this.f11457s, null, arrayList2, arrayList3, c1392b4, c1392b5);
                return;
            }
        } else if (!z) {
            throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
        }
        this.f11442d = new C1297A(this.f11444f, this, reentrantLock, this.f11445g, this.f11451m, this.f11453o, this.f11455q, this.f11456r, this.f11457s, arrayList, this);
    }

    @Override // n1.InterfaceC1306J
    public final void k(l1.b bVar) {
        l1.f fVar = this.f11451m;
        Context context = this.f11444f;
        int i2 = bVar.f11000b;
        fVar.getClass();
        int i3 = l1.i.f11015c;
        if (!(i2 == 18 ? true : i2 == 1 ? l1.i.a(context) : false)) {
            i();
        }
        if (this.f11447i) {
            return;
        }
        o1.o oVar = this.f11441c;
        if (Looper.myLooper() != oVar.f11583h.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        oVar.f11583h.removeMessages(1);
        synchronized (oVar.f11584i) {
            try {
                ArrayList arrayList = new ArrayList(oVar.f11579d);
                int i6 = oVar.f11581f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m1.j jVar = (m1.j) it.next();
                    if (oVar.f11580e && oVar.f11581f.get() == i6) {
                        if (oVar.f11579d.contains(jVar)) {
                            jVar.onConnectionFailed(bVar);
                        }
                    }
                }
            } finally {
            }
        }
        o1.o oVar2 = this.f11441c;
        oVar2.f11580e = false;
        oVar2.f11581f.incrementAndGet();
    }

    public final void l() {
        this.f11441c.f11580e = true;
        InterfaceC1308L interfaceC1308L = this.f11442d;
        o1.u.g(interfaceC1308L);
        interfaceC1308L.a();
    }

    @Override // n1.InterfaceC1306J
    public final void y(int i2) {
        if (i2 == 1) {
            if (!this.f11447i) {
                this.f11447i = true;
                if (this.f11452n == null) {
                    try {
                        l1.f fVar = this.f11451m;
                        Context applicationContext = this.f11444f.getApplicationContext();
                        C1336w c1336w = new C1336w(this);
                        fVar.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        C1305I c1305i = new C1305I(c1336w);
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 33) {
                            applicationContext.registerReceiver(c1305i, intentFilter, i3 >= 33 ? 2 : 0);
                        } else {
                            applicationContext.registerReceiver(c1305i, intentFilter);
                        }
                        c1305i.f11317a = applicationContext;
                        if (!l1.i.a(applicationContext)) {
                            c1336w.D();
                            c1305i.a();
                            c1305i = null;
                        }
                        this.f11452n = c1305i;
                    } catch (SecurityException unused) {
                    }
                }
                HandlerC1335v handlerC1335v = this.f11450l;
                handlerC1335v.sendMessageDelayed(handlerC1335v.obtainMessage(1), this.f11448j);
                HandlerC1335v handlerC1335v2 = this.f11450l;
                handlerC1335v2.sendMessageDelayed(handlerC1335v2.obtainMessage(2), this.f11449k);
            }
            i2 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) ((Set) this.f11461w.f11345a).toArray(new BasePendingResult[0])) {
            basePendingResult.F(S.f11344c);
        }
        o1.o oVar = this.f11441c;
        if (Looper.myLooper() != oVar.f11583h.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        oVar.f11583h.removeMessages(1);
        synchronized (oVar.f11584i) {
            try {
                oVar.f11582g = true;
                ArrayList arrayList = new ArrayList(oVar.f11577b);
                int i6 = oVar.f11581f.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m1.i iVar = (m1.i) it.next();
                    if (!oVar.f11580e || oVar.f11581f.get() != i6) {
                        break;
                    } else if (oVar.f11577b.contains(iVar)) {
                        iVar.onConnectionSuspended(i2);
                    }
                }
                oVar.f11578c.clear();
                oVar.f11582g = false;
            } finally {
            }
        }
        o1.o oVar2 = this.f11441c;
        oVar2.f11580e = false;
        oVar2.f11581f.incrementAndGet();
        if (i2 == 2) {
            l();
        }
    }
}

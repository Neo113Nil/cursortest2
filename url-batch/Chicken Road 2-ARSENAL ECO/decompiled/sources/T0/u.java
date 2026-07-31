package T0;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BasePendingResult;
import h1.AbstractC0403b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import k.v0;
import q.C0582b;
import q.C0588h;
import q.C0590j;

/* loaded from: classes.dex */
public final class u extends GoogleApiClient implements G {

    /* renamed from: A, reason: collision with root package name */
    public Integer f2343A;

    /* renamed from: B, reason: collision with root package name */
    public final J1.c f2344B;

    /* renamed from: g, reason: collision with root package name */
    public final ReentrantLock f2345g;

    /* renamed from: h, reason: collision with root package name */
    public final U0.n f2346h;

    /* renamed from: i, reason: collision with root package name */
    public I f2347i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2348j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f2349k;

    /* renamed from: l, reason: collision with root package name */
    public final Looper f2350l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedList f2351m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f2352n;

    /* renamed from: o, reason: collision with root package name */
    public final long f2353o;

    /* renamed from: p, reason: collision with root package name */
    public final long f2354p;

    /* renamed from: q, reason: collision with root package name */
    public final HandlerC0183s f2355q;

    /* renamed from: r, reason: collision with root package name */
    public final R0.d f2356r;

    /* renamed from: s, reason: collision with root package name */
    public F f2357s;

    /* renamed from: t, reason: collision with root package name */
    public final C0582b f2358t;

    /* renamed from: u, reason: collision with root package name */
    public Set f2359u;

    /* renamed from: v, reason: collision with root package name */
    public final v0 f2360v;

    /* renamed from: w, reason: collision with root package name */
    public final C0582b f2361w;

    /* renamed from: x, reason: collision with root package name */
    public final W0.b f2362x;
    public final D3.M y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f2363z;

    public u(Context context, ReentrantLock reentrantLock, Looper looper, v0 v0Var, C0582b c0582b, ArrayList arrayList, ArrayList arrayList2, C0582b c0582b2, int i7, ArrayList arrayList3) {
        R0.d dVar = R0.d.f2063c;
        W0.b bVar = AbstractC0403b.f4334a;
        this.f2347i = null;
        this.f2351m = new LinkedList();
        this.f2353o = 120000L;
        this.f2354p = 5000L;
        this.f2359u = new HashSet();
        this.y = new D3.M(22);
        this.f2343A = null;
        J1.c cVar = new J1.c(25, this);
        this.f2349k = context;
        this.f2345g = reentrantLock;
        this.f2346h = new U0.n(looper, cVar);
        this.f2350l = looper;
        this.f2355q = new HandlerC0183s(this, looper, 0);
        this.f2356r = dVar;
        this.f2348j = -1;
        this.f2361w = c0582b;
        this.f2358t = c0582b2;
        this.f2363z = arrayList3;
        this.f2344B = new J1.c(26);
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            S0.e eVar = (S0.e) obj;
            U0.n nVar = this.f2346h;
            nVar.getClass();
            U0.t.f(eVar);
            synchronized (nVar.f2563i) {
                try {
                    if (nVar.f2556b.contains(eVar)) {
                        String valueOf = String.valueOf(eVar);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                        sb.append("registerConnectionCallbacks(): listener ");
                        sb.append(valueOf);
                        sb.append(" is already registered");
                        Log.w("GmsClientEvents", sb.toString());
                    } else {
                        nVar.f2556b.add(eVar);
                    }
                } finally {
                }
            }
            if (((u) nVar.f2555a.f1289g).c()) {
                c1.e eVar2 = nVar.f2562h;
                eVar2.sendMessage(eVar2.obtainMessage(1, eVar));
            }
        }
        int size2 = arrayList2.size();
        while (i8 < size2) {
            Object obj2 = arrayList2.get(i8);
            i8++;
            S0.f fVar = (S0.f) obj2;
            U0.n nVar2 = this.f2346h;
            nVar2.getClass();
            U0.t.f(fVar);
            synchronized (nVar2.f2563i) {
                try {
                    if (nVar2.f2558d.contains(fVar)) {
                        String valueOf2 = String.valueOf(fVar);
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 67);
                        sb2.append("registerConnectionFailedListener(): listener ");
                        sb2.append(valueOf2);
                        sb2.append(" is already registered");
                        Log.w("GmsClientEvents", sb2.toString());
                    } else {
                        nVar2.f2558d.add(fVar);
                    }
                } finally {
                }
            }
        }
        this.f2360v = v0Var;
        this.f2362x = bVar;
    }

    public static int d(Collection collection, boolean z5) {
        Iterator it = collection.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= ((S0.a) it.next()).m();
        }
        return z6 ? 1 : 3;
    }

    public static /* bridge */ /* synthetic */ void e(u uVar) {
        uVar.f2345g.lock();
        try {
            if (uVar.f2352n) {
                uVar.h();
            }
        } finally {
            uVar.f2345g.unlock();
        }
    }

    @Override // T0.G
    public final void a(Bundle bundle) {
        if (!this.f2351m.isEmpty()) {
            this.f2351m.remove().getClass();
            throw new ClassCastException();
        }
        U0.n nVar = this.f2346h;
        if (Looper.myLooper() != nVar.f2562h.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (nVar.f2563i) {
            try {
                if (nVar.f2561g) {
                    throw new IllegalStateException();
                }
                nVar.f2562h.removeMessages(1);
                nVar.f2561g = true;
                if (!nVar.f2557c.isEmpty()) {
                    throw new IllegalStateException();
                }
                ArrayList arrayList = new ArrayList(nVar.f2556b);
                int i7 = nVar.f2560f.get();
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    S0.e eVar = (S0.e) obj;
                    if (!nVar.f2559e || !((u) nVar.f2555a.f1289g).c() || nVar.f2560f.get() != i7) {
                        break;
                    } else if (!nVar.f2557c.contains(eVar)) {
                        eVar.onConnected(bundle);
                    }
                }
                nVar.f2557c.clear();
                nVar.f2561g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // T0.G
    public final void b(R0.a aVar) {
        R0.d dVar = this.f2356r;
        Context context = this.f2349k;
        int i7 = aVar.f2053g;
        dVar.getClass();
        int i8 = R0.f.f2067c;
        if (!(i7 == 18 ? true : i7 == 1 ? R0.f.a(context) : false)) {
            f();
        }
        if (this.f2352n) {
            return;
        }
        U0.n nVar = this.f2346h;
        if (Looper.myLooper() != nVar.f2562h.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        nVar.f2562h.removeMessages(1);
        synchronized (nVar.f2563i) {
            try {
                ArrayList arrayList = new ArrayList(nVar.f2558d);
                int i9 = nVar.f2560f.get();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    S0.f fVar = (S0.f) obj;
                    if (nVar.f2559e && nVar.f2560f.get() == i9) {
                        if (nVar.f2558d.contains(fVar)) {
                            fVar.onConnectionFailed(aVar);
                        }
                    }
                }
            } finally {
            }
        }
        U0.n nVar2 = this.f2346h;
        nVar2.f2559e = false;
        nVar2.f2560f.incrementAndGet();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean c() {
        I i7 = this.f2347i;
        return i7 != null && i7.d();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        ReentrantLock reentrantLock = this.f2345g;
        reentrantLock.lock();
        try {
            int i7 = 2;
            boolean z5 = false;
            if (this.f2348j >= 0) {
                U0.t.h("Sign-in mode should have been set explicitly by auto-manage.", this.f2343A != null);
            } else {
                Integer num = this.f2343A;
                if (num == null) {
                    this.f2343A = Integer.valueOf(d(this.f2358t.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.f2343A;
            U0.t.f(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i7 = intValue;
                } else if (intValue != 2) {
                    i7 = intValue;
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(i7);
                    U0.t.a(sb.toString(), z5);
                    g(i7);
                    h();
                    reentrantLock.unlock();
                    return;
                }
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i7);
                U0.t.a(sb2.toString(), z5);
                g(i7);
                h();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z5 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        LinkedList linkedList = this.f2351m;
        ReentrantLock reentrantLock = this.f2345g;
        reentrantLock.lock();
        try {
            BasePendingResult[] basePendingResultArr = (BasePendingResult[]) ((Set) this.f2344B.f1289g).toArray(new BasePendingResult[0]);
            if (basePendingResultArr.length > 0) {
                BasePendingResult basePendingResult = basePendingResultArr[0];
                throw null;
            }
            I i7 = this.f2347i;
            if (i7 != null) {
                i7.b();
            }
            Set set = (Set) this.y.f401g;
            Iterator it = set.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            set.clear();
            Iterator it2 = linkedList.iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            linkedList.clear();
            if (this.f2347i == null) {
                reentrantLock.unlock();
                return;
            }
            f();
            U0.n nVar = this.f2346h;
            nVar.f2559e = false;
            nVar.f2560f.incrementAndGet();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean f() {
        if (!this.f2352n) {
            return false;
        }
        this.f2352n = false;
        this.f2355q.removeMessages(2);
        this.f2355q.removeMessages(1);
        F f7 = this.f2357s;
        if (f7 != null) {
            f7.a();
            this.f2357s = null;
        }
        return true;
    }

    public final void g(int i7) {
        ReentrantLock reentrantLock;
        Integer num = this.f2343A;
        if (num == null) {
            this.f2343A = Integer.valueOf(i7);
        } else if (num.intValue() != i7) {
            String str = i7 != 1 ? i7 != 2 ? i7 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            int intValue = this.f2343A.intValue();
            String str2 = intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            StringBuilder sb = new StringBuilder(str2.length() + str.length() + 51);
            sb.append("Cannot use sign-in mode: ");
            sb.append(str);
            sb.append(". Mode was already set to ");
            sb.append(str2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f2347i != null) {
            return;
        }
        C0582b c0582b = this.f2358t;
        Iterator it = ((C0590j) c0582b.values()).iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= ((S0.a) it.next()).m();
        }
        int intValue2 = this.f2343A.intValue();
        ArrayList arrayList = this.f2363z;
        ReentrantLock reentrantLock2 = this.f2345g;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z5) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
        } else {
            if (intValue2 == 2 && z5) {
                C0582b c0582b2 = new C0582b();
                C0582b c0582b3 = new C0582b();
                Iterator it2 = ((C0588h) c0582b.entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    S0.a aVar = (S0.a) entry.getValue();
                    aVar.getClass();
                    if (aVar.m()) {
                        c0582b2.put((S0.b) entry.getKey(), aVar);
                    } else {
                        c0582b3.put((S0.b) entry.getKey(), aVar);
                    }
                }
                U0.t.h("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !c0582b2.isEmpty());
                C0582b c0582b4 = new C0582b();
                C0582b c0582b5 = new C0582b();
                C0582b c0582b6 = this.f2361w;
                Iterator it3 = ((C0588h) c0582b6.keySet()).iterator();
                while (it3.hasNext()) {
                    S0.c cVar = (S0.c) it3.next();
                    S0.b bVar = cVar.f2201b;
                    if (c0582b2.containsKey(bVar)) {
                        c0582b4.put(cVar, (Boolean) c0582b6.getOrDefault(cVar, null));
                    } else {
                        if (!c0582b3.containsKey(bVar)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        c0582b5.put(cVar, (Boolean) c0582b6.getOrDefault(cVar, null));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    S s6 = (S) arrayList.get(i8);
                    if (c0582b4.containsKey(s6.f2265d)) {
                        arrayList2.add(s6);
                    } else {
                        if (!c0582b5.containsKey(s6.f2265d)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList3.add(s6);
                    }
                }
                this.f2347i = new C0174i(this.f2349k, this, reentrantLock2, this.f2350l, this.f2356r, c0582b2, c0582b3, this.f2360v, this.f2362x, null, arrayList2, arrayList3, c0582b4, c0582b5);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.f2347i = new x(this.f2349k, this, reentrantLock, this.f2350l, this.f2356r, this.f2358t, this.f2360v, this.f2361w, this.f2362x, arrayList, this);
    }

    public final void h() {
        this.f2346h.f2559e = true;
        I i7 = this.f2347i;
        U0.t.f(i7);
        i7.a();
    }

    @Override // T0.G
    public final void q(int i7) {
        if (i7 == 1) {
            if (!this.f2352n) {
                this.f2352n = true;
                if (this.f2357s == null) {
                    try {
                        R0.d dVar = this.f2356r;
                        Context applicationContext = this.f2349k.getApplicationContext();
                        C0184t c0184t = new C0184t(this);
                        dVar.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        F f7 = new F(c0184t);
                        applicationContext.registerReceiver(f7, intentFilter);
                        f7.f2242a = applicationContext;
                        if (!R0.f.a(applicationContext)) {
                            c0184t.N();
                            f7.a();
                            f7 = null;
                        }
                        this.f2357s = f7;
                    } catch (SecurityException unused) {
                    }
                }
                HandlerC0183s handlerC0183s = this.f2355q;
                handlerC0183s.sendMessageDelayed(handlerC0183s.obtainMessage(1), this.f2353o);
                HandlerC0183s handlerC0183s2 = this.f2355q;
                handlerC0183s2.sendMessageDelayed(handlerC0183s2.obtainMessage(2), this.f2354p);
            }
            i7 = 1;
        }
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) ((Set) this.f2344B.f1289g).toArray(new BasePendingResult[0]);
        if (basePendingResultArr.length > 0) {
            BasePendingResult basePendingResult = basePendingResultArr[0];
            throw null;
        }
        U0.n nVar = this.f2346h;
        if (Looper.myLooper() != nVar.f2562h.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        nVar.f2562h.removeMessages(1);
        synchronized (nVar.f2563i) {
            try {
                nVar.f2561g = true;
                ArrayList arrayList = new ArrayList(nVar.f2556b);
                int i8 = nVar.f2560f.get();
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    S0.e eVar = (S0.e) obj;
                    if (!nVar.f2559e || nVar.f2560f.get() != i8) {
                        break;
                    } else if (nVar.f2556b.contains(eVar)) {
                        eVar.onConnectionSuspended(i7);
                    }
                }
                nVar.f2557c.clear();
                nVar.f2561g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        U0.n nVar2 = this.f2346h;
        nVar2.f2559e = false;
        nVar2.f2560f.incrementAndGet();
        if (i7 == 2) {
            h();
        }
    }
}

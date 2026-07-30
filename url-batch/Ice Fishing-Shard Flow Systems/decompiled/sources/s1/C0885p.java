package s1;

import a.AbstractC0169a;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.datastore.preferences.protobuf.a0;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BasePendingResult;
import i.C0511M;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import n.w1;
import r1.C0845d;
import r1.InterfaceC0844c;
import u.C0931b;
import u.C0933d;
import u.C0934e;

/* renamed from: s1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0885p extends GoogleApiClient implements z {

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ int f7696F = 0;

    /* renamed from: A, reason: collision with root package name */
    public final D1.d f7697A;

    /* renamed from: B, reason: collision with root package name */
    public final C0511M f7698B;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f7699C;

    /* renamed from: D, reason: collision with root package name */
    public Integer f7700D;

    /* renamed from: E, reason: collision with root package name */
    public final l4.b f7701E;

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f7702e;

    /* renamed from: i, reason: collision with root package name */
    public final t1.p f7703i;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0859A f7704l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7705m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f7706n;

    /* renamed from: o, reason: collision with root package name */
    public final Looper f7707o;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedList f7708p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f7709q;

    /* renamed from: r, reason: collision with root package name */
    public final long f7710r;

    /* renamed from: s, reason: collision with root package name */
    public final long f7711s;

    /* renamed from: t, reason: collision with root package name */
    public final HandlerC0884o f7712t;

    /* renamed from: u, reason: collision with root package name */
    public final q1.e f7713u;

    /* renamed from: v, reason: collision with root package name */
    public com.google.firebase.messaging.B f7714v;

    /* renamed from: w, reason: collision with root package name */
    public final C0934e f7715w;

    /* renamed from: x, reason: collision with root package name */
    public Set f7716x;

    /* renamed from: y, reason: collision with root package name */
    public final w1 f7717y;

    /* renamed from: z, reason: collision with root package name */
    public final C0934e f7718z;

    public C0885p(Context context, ReentrantLock reentrantLock, Looper looper, w1 w1Var, C0934e c0934e, ArrayList arrayList, ArrayList arrayList2, C0934e c0934e2, int i2, ArrayList arrayList3) {
        q1.e eVar = q1.e.f7323e;
        D1.d dVar = H1.b.f956a;
        this.f7704l = null;
        this.f7708p = new LinkedList();
        this.f7710r = 120000L;
        this.f7711s = 5000L;
        this.f7716x = new HashSet();
        this.f7698B = new C0511M(18);
        this.f7700D = null;
        C0511M c0511m = new C0511M(19, this);
        this.f7706n = context;
        this.f7702e = reentrantLock;
        this.f7703i = new t1.p(looper, c0511m);
        this.f7707o = looper;
        this.f7712t = new HandlerC0884o(this, looper, 0);
        this.f7713u = eVar;
        this.f7705m = -1;
        this.f7718z = c0934e;
        this.f7715w = c0934e2;
        this.f7699C = arrayList3;
        this.f7701E = new l4.b(19);
        int size = arrayList.size();
        int i5 = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            r1.k kVar = (r1.k) obj;
            t1.p pVar = this.f7703i;
            pVar.getClass();
            t1.u.f(kVar);
            synchronized (pVar.f7984i) {
                try {
                    ArrayList arrayList4 = pVar.f7977b;
                    if (arrayList4.contains(kVar)) {
                        String valueOf = String.valueOf(kVar);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                        sb.append("registerConnectionCallbacks(): listener ");
                        sb.append(valueOf);
                        sb.append(" is already registered");
                        Log.w("GmsClientEvents", sb.toString());
                    } else {
                        arrayList4.add(kVar);
                    }
                } finally {
                }
            }
            if (((C0885p) pVar.f7976a.f5381e).a()) {
                C1.e eVar2 = pVar.f7983h;
                eVar2.sendMessage(eVar2.obtainMessage(1, kVar));
            }
        }
        int size2 = arrayList2.size();
        while (i5 < size2) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            r1.l lVar = (r1.l) obj2;
            t1.p pVar2 = this.f7703i;
            pVar2.getClass();
            t1.u.f(lVar);
            synchronized (pVar2.f7984i) {
                try {
                    ArrayList arrayList5 = pVar2.f7979d;
                    if (arrayList5.contains(lVar)) {
                        String valueOf2 = String.valueOf(lVar);
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 67);
                        sb2.append("registerConnectionFailedListener(): listener ");
                        sb2.append(valueOf2);
                        sb2.append(" is already registered");
                        Log.w("GmsClientEvents", sb2.toString());
                    } else {
                        arrayList5.add(lVar);
                    }
                } finally {
                }
            }
        }
        this.f7717y = w1Var;
        this.f7697A = dVar;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean a() {
        InterfaceC0859A interfaceC0859A = this.f7704l;
        return interfaceC0859A != null && interfaceC0859A.c();
    }

    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f7706n);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f7709q);
        printWriter.append(" mWorkQueue.size()=").print(this.f7708p.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(((Set) this.f7701E.f6272e).size());
        InterfaceC0859A interfaceC0859A = this.f7704l;
        if (interfaceC0859A != null) {
            interfaceC0859A.d(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean c() {
        if (!this.f7709q) {
            return false;
        }
        this.f7709q = false;
        HandlerC0884o handlerC0884o = this.f7712t;
        handlerC0884o.removeMessages(2);
        handlerC0884o.removeMessages(1);
        com.google.firebase.messaging.B b7 = this.f7714v;
        if (b7 != null) {
            b7.b();
            this.f7714v = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        ReentrantLock reentrantLock = this.f7702e;
        reentrantLock.lock();
        try {
            int i2 = 2;
            boolean z7 = false;
            if (this.f7705m >= 0) {
                t1.u.h("Sign-in mode should have been set explicitly by auto-manage.", this.f7700D != null);
            } else {
                Integer num = this.f7700D;
                if (num == null) {
                    Iterator it = this.f7715w.values().iterator();
                    boolean z8 = false;
                    while (it.hasNext()) {
                        z8 |= ((InterfaceC0844c) it.next()).b();
                    }
                    this.f7700D = Integer.valueOf(z8 ? 1 : 3);
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.f7700D;
            t1.u.f(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i2 = intValue;
                } else if (intValue != 2) {
                    i2 = intValue;
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(i2);
                    t1.u.a(sb.toString(), z7);
                    e(i2);
                    f();
                    reentrantLock.unlock();
                    return;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 22);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i2);
                t1.u.a(sb2.toString(), z7);
                e(i2);
                f();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z7 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ void d() {
        this.f7702e.lock();
        try {
            if (this.f7709q) {
                f();
            }
        } finally {
            this.f7702e.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        ReentrantLock reentrantLock = this.f7702e;
        reentrantLock.lock();
        try {
            BasePendingResult[] basePendingResultArr = (BasePendingResult[]) ((Set) this.f7701E.f6272e).toArray(new BasePendingResult[0]);
            if (basePendingResultArr.length > 0) {
                BasePendingResult basePendingResult = basePendingResultArr[0];
                throw null;
            }
            InterfaceC0859A interfaceC0859A = this.f7704l;
            if (interfaceC0859A != null) {
                interfaceC0859A.b();
            }
            Set set = (Set) this.f7698B.f5381e;
            Iterator it = set.iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            set.clear();
            LinkedList linkedList = this.f7708p;
            Iterator it2 = linkedList.iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            linkedList.clear();
            if (this.f7704l != null) {
                c();
                t1.p pVar = this.f7703i;
                pVar.f7980e = false;
                pVar.f7981f.incrementAndGet();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(int i2) {
        ReentrantLock reentrantLock;
        Integer num = this.f7700D;
        if (num == null) {
            this.f7700D = Integer.valueOf(i2);
        } else if (num.intValue() != i2) {
            int intValue = this.f7700D.intValue();
            String str = intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            String str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            StringBuilder sb = new StringBuilder(str.length() + str2.length() + 51);
            sb.append("Cannot use sign-in mode: ");
            sb.append(str2);
            sb.append(". Mode was already set to ");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f7704l != null) {
            return;
        }
        C0934e c0934e = this.f7715w;
        Iterator it = ((C0933d) c0934e.values()).iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= ((InterfaceC0844c) it.next()).b();
        }
        int intValue2 = this.f7700D.intValue();
        ArrayList arrayList = this.f7699C;
        ReentrantLock reentrantLock2 = this.f7702e;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z7) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            c0934e = c0934e;
        } else {
            if (intValue2 == 2 && z7) {
                C0934e c0934e2 = new C0934e(0);
                C0934e c0934e3 = new C0934e(0);
                Iterator it2 = ((a0) c0934e.entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    InterfaceC0844c interfaceC0844c = (InterfaceC0844c) entry.getValue();
                    interfaceC0844c.getClass();
                    if (interfaceC0844c.b()) {
                        c0934e2.put((C0845d) entry.getKey(), interfaceC0844c);
                    } else {
                        c0934e3.put((C0845d) entry.getKey(), interfaceC0844c);
                    }
                }
                t1.u.h("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !c0934e2.isEmpty());
                C0934e c0934e4 = new C0934e(0);
                C0934e c0934e5 = new C0934e(0);
                C0934e c0934e6 = this.f7718z;
                Iterator it3 = ((C0931b) c0934e6.keySet()).iterator();
                while (it3.hasNext()) {
                    r1.e eVar = (r1.e) it3.next();
                    C0845d c0845d = eVar.f7436b;
                    if (c0934e2.containsKey(c0845d)) {
                        c0934e4.put(eVar, (Boolean) c0934e6.get(eVar));
                    } else {
                        if (!c0934e3.containsKey(c0845d)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        c0934e5.put(eVar, (Boolean) c0934e6.get(eVar));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C0868J c0868j = (C0868J) arrayList.get(i5);
                    r1.e eVar2 = c0868j.f7622e;
                    if (c0934e4.containsKey(eVar2)) {
                        arrayList2.add(c0868j);
                    } else {
                        if (!c0934e5.containsKey(eVar2)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList3.add(c0868j);
                    }
                }
                this.f7704l = new C0869K(this.f7706n, this, reentrantLock2, this.f7707o, this.f7713u, c0934e2, c0934e3, this.f7717y, this.f7697A, arrayList2, arrayList3, c0934e4, c0934e5);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.f7704l = new C0888s(this.f7706n, this, reentrantLock, this.f7707o, this.f7713u, c0934e, this.f7717y, this.f7718z, this.f7697A, arrayList, this);
    }

    public final void f() {
        this.f7703i.f7980e = true;
        InterfaceC0859A interfaceC0859A = this.f7704l;
        t1.u.f(interfaceC0859A);
        interfaceC0859A.a();
    }

    @Override // s1.z
    public final void g(Bundle bundle) {
        LinkedList linkedList = this.f7708p;
        if (!linkedList.isEmpty()) {
            linkedList.remove().getClass();
            throw new ClassCastException();
        }
        t1.p pVar = this.f7703i;
        C1.e eVar = pVar.f7983h;
        if (Looper.myLooper() != eVar.getLooper()) {
            throw new IllegalStateException("onConnectionSuccess must only be called on the Handler thread");
        }
        synchronized (pVar.f7984i) {
            try {
                if (pVar.f7982g) {
                    throw new IllegalStateException();
                }
                eVar.removeMessages(1);
                pVar.f7982g = true;
                ArrayList arrayList = pVar.f7978c;
                if (!arrayList.isEmpty()) {
                    throw new IllegalStateException();
                }
                ArrayList arrayList2 = new ArrayList(pVar.f7977b);
                AtomicInteger atomicInteger = pVar.f7981f;
                int i2 = atomicInteger.get();
                int size = arrayList2.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList2.get(i5);
                    i5++;
                    r1.k kVar = (r1.k) obj;
                    if (!pVar.f7980e || !((C0885p) pVar.f7976a.f5381e).a() || atomicInteger.get() != i2) {
                        break;
                    } else if (!arrayList.contains(kVar)) {
                        kVar.onConnected(bundle);
                    }
                }
                arrayList.clear();
                pVar.f7982g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s1.z
    public final void m(q1.b bVar) {
        q1.e eVar = this.f7713u;
        Context context = this.f7706n;
        int i2 = bVar.f7311e;
        eVar.getClass();
        int i5 = q1.g.f7329c;
        if (!(i2 == 18 ? true : i2 == 1 ? q1.g.a(context) : false)) {
            c();
        }
        if (this.f7709q) {
            return;
        }
        t1.p pVar = this.f7703i;
        C1.e eVar2 = pVar.f7983h;
        if (Looper.myLooper() != eVar2.getLooper()) {
            throw new IllegalStateException("onConnectionFailure must only be called on the Handler thread");
        }
        eVar2.removeMessages(1);
        synchronized (pVar.f7984i) {
            try {
                ArrayList arrayList = pVar.f7979d;
                ArrayList arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = pVar.f7981f;
                int i7 = atomicInteger.get();
                int size = arrayList2.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList2.get(i8);
                    i8++;
                    r1.l lVar = (r1.l) obj;
                    if (pVar.f7980e && atomicInteger.get() == i7) {
                        if (arrayList.contains(lVar)) {
                            lVar.onConnectionFailed(bVar);
                        }
                    }
                }
            } finally {
            }
        }
        pVar.f7980e = false;
        pVar.f7981f.incrementAndGet();
    }

    @Override // s1.z
    public final void p(int i2) {
        if (i2 == 1) {
            if (!this.f7709q) {
                this.f7709q = true;
                if (this.f7714v == null) {
                    try {
                        q1.e eVar = this.f7713u;
                        Context applicationContext = this.f7706n.getApplicationContext();
                        l4.b bVar = new l4.b(this);
                        eVar.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        com.google.firebase.messaging.B b7 = new com.google.firebase.messaging.B(bVar);
                        AbstractC0169a.A(applicationContext, b7, intentFilter);
                        b7.f4416b = applicationContext;
                        if (!q1.g.a(applicationContext)) {
                            bVar.l();
                            b7.b();
                            b7 = null;
                        }
                        this.f7714v = b7;
                    } catch (SecurityException unused) {
                    }
                }
                HandlerC0884o handlerC0884o = this.f7712t;
                handlerC0884o.sendMessageDelayed(handlerC0884o.obtainMessage(1), this.f7710r);
                handlerC0884o.sendMessageDelayed(handlerC0884o.obtainMessage(2), this.f7711s);
            }
            i2 = 1;
        }
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) ((Set) this.f7701E.f6272e).toArray(new BasePendingResult[0]);
        if (basePendingResultArr.length > 0) {
            BasePendingResult basePendingResult = basePendingResultArr[0];
            throw null;
        }
        t1.p pVar = this.f7703i;
        C1.e eVar2 = pVar.f7983h;
        if (Looper.myLooper() != eVar2.getLooper()) {
            throw new IllegalStateException("onUnintentionalDisconnection must only be called on the Handler thread");
        }
        eVar2.removeMessages(1);
        synchronized (pVar.f7984i) {
            try {
                pVar.f7982g = true;
                ArrayList arrayList = pVar.f7977b;
                ArrayList arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = pVar.f7981f;
                int i5 = atomicInteger.get();
                int size = arrayList2.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    r1.k kVar = (r1.k) obj;
                    if (!pVar.f7980e || atomicInteger.get() != i5) {
                        break;
                    } else if (arrayList.contains(kVar)) {
                        kVar.onConnectionSuspended(i2);
                    }
                }
                pVar.f7978c.clear();
                pVar.f7982g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        pVar.f7980e = false;
        pVar.f7981f.incrementAndGet();
        if (i2 == 2) {
            f();
        }
    }
}

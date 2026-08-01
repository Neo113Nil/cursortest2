package b7;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.datastore.preferences.protobuf.b1;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.measurement.z5;
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
import m.g2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v extends GoogleApiClient implements h0 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f1365x = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f1366b;

    /* renamed from: c, reason: collision with root package name */
    public final c7.u f1367c;

    /* renamed from: d, reason: collision with root package name */
    public i0 f1368d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1369e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f1370f;
    public final Looper g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedList f1371h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f1372i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final long f1373k;

    /* renamed from: l, reason: collision with root package name */
    public final t f1374l;

    /* renamed from: m, reason: collision with root package name */
    public final z6.f f1375m;

    /* renamed from: n, reason: collision with root package name */
    public g0 f1376n;

    /* renamed from: o, reason: collision with root package name */
    public final s.e f1377o;

    /* renamed from: p, reason: collision with root package name */
    public Set f1378p;

    /* renamed from: q, reason: collision with root package name */
    public final g2 f1379q;

    /* renamed from: r, reason: collision with root package name */
    public final s.e f1380r;

    /* renamed from: s, reason: collision with root package name */
    public final aa f1381s;

    /* renamed from: t, reason: collision with root package name */
    public final g f1382t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f1383u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f1384v;

    /* renamed from: w, reason: collision with root package name */
    public final g f1385w;

    public v(Context context, ReentrantLock reentrantLock, Looper looper, g2 g2Var, s.e eVar, ArrayList arrayList, ArrayList arrayList2, s.e eVar2, int i3, ArrayList arrayList3) {
        z6.f fVar = z6.f.f10879e;
        aa aaVar = t7.b.f9323a;
        this.f1368d = null;
        this.f1371h = new LinkedList();
        this.j = 120000L;
        this.f1373k = 5000L;
        this.f1378p = new HashSet();
        this.f1382t = new g(0);
        this.f1384v = null;
        d9.c cVar = new d9.c(6, this);
        this.f1370f = context;
        this.f1366b = reentrantLock;
        this.f1367c = new c7.u(looper, cVar);
        this.g = looper;
        this.f1374l = new t(this, looper, 0);
        this.f1375m = fVar;
        this.f1369e = -1;
        this.f1380r = eVar;
        this.f1377o = eVar2;
        this.f1383u = arrayList3;
        this.f1385w = new g(1);
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            a7.k kVar = (a7.k) obj;
            c7.u uVar = this.f1367c;
            uVar.getClass();
            c7.c0.g(kVar);
            synchronized (uVar.f1989i) {
                try {
                    ArrayList arrayList4 = uVar.f1983b;
                    if (arrayList4.contains(kVar)) {
                        String valueOf = String.valueOf(kVar);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 62);
                        sb2.append("registerConnectionCallbacks(): listener ");
                        sb2.append(valueOf);
                        sb2.append(" is already registered");
                        Log.w("GmsClientEvents", sb2.toString());
                    } else {
                        arrayList4.add(kVar);
                    }
                } finally {
                }
            }
            if (((v) uVar.f1982a.f3701e).d()) {
                z5 z5Var = uVar.f1988h;
                z5Var.sendMessage(z5Var.obtainMessage(1, kVar));
            }
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            a7.l lVar = (a7.l) obj2;
            c7.u uVar2 = this.f1367c;
            uVar2.getClass();
            c7.c0.g(lVar);
            synchronized (uVar2.f1989i) {
                try {
                    ArrayList arrayList5 = uVar2.f1985d;
                    if (arrayList5.contains(lVar)) {
                        String valueOf2 = String.valueOf(lVar);
                        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 67);
                        sb3.append("registerConnectionFailedListener(): listener ");
                        sb3.append(valueOf2);
                        sb3.append(" is already registered");
                        Log.w("GmsClientEvents", sb3.toString());
                    } else {
                        arrayList5.add(lVar);
                    }
                } finally {
                }
            }
        }
        this.f1379q = g2Var;
        this.f1381s = aaVar;
    }

    @Override // b7.h0
    public final void a(z6.b bVar) {
        z6.f fVar = this.f1375m;
        Context context = this.f1370f;
        int i3 = bVar.f10867e;
        fVar.getClass();
        int i10 = z6.i.f10887e;
        if (!(i3 == 18 ? true : i3 == 1 ? z6.i.b(context) : false)) {
            f();
        }
        if (this.f1372i) {
            return;
        }
        c7.u uVar = this.f1367c;
        z5 z5Var = uVar.f1988h;
        if (Looper.myLooper() != z5Var.getLooper()) {
            kotlin.collections.i0.l("onConnectionFailure must only be called on the Handler thread");
            return;
        }
        z5Var.removeMessages(1);
        synchronized (uVar.f1989i) {
            try {
                ArrayList arrayList = uVar.f1985d;
                ArrayList arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = uVar.f1987f;
                int i11 = atomicInteger.get();
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    a7.l lVar = (a7.l) obj;
                    if (uVar.f1986e && atomicInteger.get() == i11) {
                        if (arrayList.contains(lVar)) {
                            lVar.onConnectionFailed(bVar);
                        }
                    }
                }
            } finally {
            }
        }
        uVar.f1986e = false;
        uVar.f1987f.incrementAndGet();
    }

    @Override // b7.h0
    public final void b(Bundle bundle) {
        LinkedList linkedList = this.f1371h;
        if (!linkedList.isEmpty()) {
            linkedList.remove().getClass();
            kotlin.collections.i0.j();
            return;
        }
        c7.u uVar = this.f1367c;
        z5 z5Var = uVar.f1988h;
        if (Looper.myLooper() != z5Var.getLooper()) {
            kotlin.collections.i0.l("onConnectionSuccess must only be called on the Handler thread");
            return;
        }
        synchronized (uVar.f1989i) {
            try {
                c7.c0.j(!uVar.g);
                z5Var.removeMessages(1);
                uVar.g = true;
                ArrayList arrayList = uVar.f1984c;
                c7.c0.j(arrayList.isEmpty());
                ArrayList arrayList2 = new ArrayList(uVar.f1983b);
                AtomicInteger atomicInteger = uVar.f1987f;
                int i3 = atomicInteger.get();
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    a7.k kVar = (a7.k) obj;
                    if (!uVar.f1986e || !((v) uVar.f1982a.f3701e).d() || atomicInteger.get() != i3) {
                        break;
                    } else if (!arrayList.contains(kVar)) {
                        kVar.onConnected(bundle);
                    }
                }
                arrayList.clear();
                uVar.g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // b7.h0
    public final void c(int i3) {
        if (i3 == 1) {
            if (!this.f1372i) {
                this.f1372i = true;
                if (this.f1376n == null) {
                    try {
                        z6.f fVar = this.f1375m;
                        Context applicationContext = this.f1370f.getApplicationContext();
                        u uVar = new u(this);
                        fVar.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        g0 g0Var = new g0(uVar);
                        k7.e.L(applicationContext, g0Var, intentFilter);
                        g0Var.f1289b = applicationContext;
                        if (!z6.i.b(applicationContext)) {
                            uVar.a();
                            g0Var.b();
                            g0Var = null;
                        }
                        this.f1376n = g0Var;
                    } catch (SecurityException unused) {
                    }
                }
                t tVar = this.f1374l;
                tVar.sendMessageDelayed(tVar.obtainMessage(1), this.j);
                tVar.sendMessageDelayed(tVar.obtainMessage(2), this.f1373k);
            }
            i3 = 1;
        }
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f1385w.f1287a.toArray(new BasePendingResult[0]);
        if (basePendingResultArr.length > 0) {
            BasePendingResult basePendingResult = basePendingResultArr[0];
            throw null;
        }
        c7.u uVar2 = this.f1367c;
        z5 z5Var = uVar2.f1988h;
        if (Looper.myLooper() != z5Var.getLooper()) {
            kotlin.collections.i0.l("onUnintentionalDisconnection must only be called on the Handler thread");
            return;
        }
        z5Var.removeMessages(1);
        synchronized (uVar2.f1989i) {
            try {
                uVar2.g = true;
                ArrayList arrayList = uVar2.f1983b;
                ArrayList arrayList2 = new ArrayList(arrayList);
                AtomicInteger atomicInteger = uVar2.f1987f;
                int i10 = atomicInteger.get();
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    a7.k kVar = (a7.k) obj;
                    if (!uVar2.f1986e || atomicInteger.get() != i10) {
                        break;
                    } else if (arrayList.contains(kVar)) {
                        kVar.onConnectionSuspended(i3);
                    }
                }
                uVar2.f1984c.clear();
                uVar2.g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        uVar2.f1986e = false;
        uVar2.f1987f.incrementAndGet();
        if (i3 == 2) {
            i();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        ReentrantLock reentrantLock = this.f1366b;
        reentrantLock.lock();
        try {
            int i3 = this.f1369e;
            Integer num = this.f1384v;
            int i10 = 2;
            boolean z10 = false;
            if (i3 >= 0) {
                c7.c0.i("Sign-in mode should have been set explicitly by auto-manage.", num != null);
            } else if (num == null) {
                Iterator it = this.f1377o.values().iterator();
                boolean z11 = false;
                while (it.hasNext()) {
                    z11 |= ((c7.i) it.next()).s();
                }
                this.f1384v = Integer.valueOf(z11 ? 1 : 3);
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            Integer num2 = this.f1384v;
            c7.c0.g(num2);
            int intValue = num2.intValue();
            reentrantLock.lock();
            try {
                if (intValue == 3 || intValue == 1) {
                    i10 = intValue;
                } else if (intValue != 2) {
                    i10 = intValue;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 22);
                    sb2.append("Illegal sign-in mode: ");
                    sb2.append(i10);
                    c7.c0.a(sb2.toString(), z10);
                    h(i10);
                    i();
                    reentrantLock.unlock();
                    return;
                }
                StringBuilder sb22 = new StringBuilder(String.valueOf(i10).length() + 22);
                sb22.append("Illegal sign-in mode: ");
                sb22.append(i10);
                c7.c0.a(sb22.toString(), z10);
                h(i10);
                i();
                reentrantLock.unlock();
                return;
            } finally {
                reentrantLock.unlock();
            }
            z10 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean d() {
        i0 i0Var = this.f1368d;
        return i0Var != null && i0Var.c();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        ReentrantLock reentrantLock = this.f1366b;
        reentrantLock.lock();
        try {
            BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f1385w.f1287a.toArray(new BasePendingResult[0]);
            if (basePendingResultArr.length > 0) {
                BasePendingResult basePendingResult = basePendingResultArr[0];
                throw null;
            }
            i0 i0Var = this.f1368d;
            if (i0Var != null) {
                i0Var.b();
            }
            Set set = this.f1382t.f1287a;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((f) it.next()).f1286b = null;
            }
            set.clear();
            LinkedList linkedList = this.f1371h;
            Iterator it2 = linkedList.iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            linkedList.clear();
            if (this.f1368d != null) {
                f();
                c7.u uVar = this.f1367c;
                uVar.f1986e = false;
                uVar.f1987f.incrementAndGet();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.f1366b.unlock();
            throw th;
        }
    }

    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f1370f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f1372i);
        printWriter.append(" mWorkQueue.size()=").print(this.f1371h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f1385w.f1287a.size());
        i0 i0Var = this.f1368d;
        if (i0Var != null) {
            i0Var.d(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean f() {
        if (!this.f1372i) {
            return false;
        }
        this.f1372i = false;
        t tVar = this.f1374l;
        tVar.removeMessages(2);
        tVar.removeMessages(1);
        g0 g0Var = this.f1376n;
        if (g0Var != null) {
            g0Var.b();
            this.f1376n = null;
        }
        return true;
    }

    public final /* synthetic */ void g() {
        this.f1366b.lock();
        try {
            if (this.f1372i) {
                i();
            }
        } finally {
            this.f1366b.unlock();
        }
    }

    public final void h(int i3) {
        ReentrantLock reentrantLock;
        Integer num = this.f1384v;
        if (num == null) {
            this.f1384v = Integer.valueOf(i3);
        } else if (num.intValue() != i3) {
            int intValue = this.f1384v.intValue();
            String str = intValue != 1 ? intValue != 2 ? intValue != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            String str2 = i3 != 1 ? i3 != 2 ? i3 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
            StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + 51);
            sb2.append("Cannot use sign-in mode: ");
            sb2.append(str2);
            sb2.append(". Mode was already set to ");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f1368d != null) {
            return;
        }
        s.e eVar = this.f1377o;
        Iterator it = ((s.d) eVar.values()).iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= ((c7.i) it.next()).s();
        }
        int intValue2 = this.f1384v.intValue();
        ArrayList arrayList = this.f1383u;
        ReentrantLock reentrantLock2 = this.f1366b;
        if (intValue2 == 1) {
            reentrantLock = reentrantLock2;
            if (!z10) {
                kotlin.collections.i0.l("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                return;
            }
            eVar = eVar;
        } else {
            if (intValue2 == 2 && z10) {
                s.e eVar2 = new s.e(0);
                s.e eVar3 = new s.e(0);
                Iterator it2 = ((b1) eVar.entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    c7.i iVar = (c7.i) entry.getValue();
                    iVar.getClass();
                    if (iVar.s()) {
                        eVar2.put((a7.c) entry.getKey(), iVar);
                    } else {
                        eVar3.put((a7.c) entry.getKey(), iVar);
                    }
                }
                c7.c0.i("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !eVar2.isEmpty());
                s.e eVar4 = new s.e(0);
                s.e eVar5 = new s.e(0);
                s.e eVar6 = this.f1380r;
                Iterator it3 = ((s.b) eVar6.keySet()).iterator();
                while (it3.hasNext()) {
                    a7.d dVar = (a7.d) it3.next();
                    a7.c cVar = dVar.f314b;
                    if (eVar2.containsKey(cVar)) {
                        eVar4.put(dVar, (Boolean) eVar6.get(dVar));
                    } else {
                        if (!eVar3.containsKey(cVar)) {
                            kotlin.collections.i0.l("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                            return;
                        }
                        eVar5.put(dVar, (Boolean) eVar6.get(dVar));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    u0 u0Var = (u0) arrayList.get(i10);
                    a7.d dVar2 = u0Var.f1362d;
                    if (eVar4.containsKey(dVar2)) {
                        arrayList2.add(u0Var);
                    } else {
                        if (!eVar5.containsKey(dVar2)) {
                            kotlin.collections.i0.l("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                            return;
                        }
                        arrayList3.add(u0Var);
                    }
                }
                this.f1368d = new w0(this.f1370f, this, reentrantLock2, this.g, this.f1375m, eVar2, eVar3, this.f1379q, this.f1381s, arrayList2, arrayList3, eVar4, eVar5);
                return;
            }
            reentrantLock = reentrantLock2;
        }
        this.f1368d = new y(this.f1370f, this, reentrantLock, this.g, this.f1375m, eVar, this.f1379q, this.f1380r, this.f1381s, arrayList, this);
    }

    public final void i() {
        this.f1367c.f1986e = true;
        i0 i0Var = this.f1368d;
        c7.c0.g(i0Var);
        i0Var.a();
    }
}

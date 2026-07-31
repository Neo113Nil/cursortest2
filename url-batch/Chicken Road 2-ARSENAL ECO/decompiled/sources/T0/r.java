package T0;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import c1.AbstractC0277b;
import h1.C0402a;
import i1.C0420a;
import i1.C0424e;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import k.v0;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final class r implements v {

    /* renamed from: f, reason: collision with root package name */
    public final x f2320f;

    /* renamed from: g, reason: collision with root package name */
    public final Lock f2321g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f2322h;

    /* renamed from: i, reason: collision with root package name */
    public final R0.e f2323i;

    /* renamed from: j, reason: collision with root package name */
    public R0.a f2324j;

    /* renamed from: k, reason: collision with root package name */
    public int f2325k;

    /* renamed from: m, reason: collision with root package name */
    public int f2327m;

    /* renamed from: p, reason: collision with root package name */
    public C0420a f2330p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2331q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2332r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2333s;

    /* renamed from: t, reason: collision with root package name */
    public U0.f f2334t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2335u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2336v;

    /* renamed from: w, reason: collision with root package name */
    public final v0 f2337w;

    /* renamed from: x, reason: collision with root package name */
    public final Map f2338x;
    public final AbstractC0521b y;

    /* renamed from: l, reason: collision with root package name */
    public int f2326l = 0;

    /* renamed from: n, reason: collision with root package name */
    public final Bundle f2328n = new Bundle();

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f2329o = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f2339z = new ArrayList();

    public r(x xVar, v0 v0Var, Map map, R0.e eVar, AbstractC0521b abstractC0521b, Lock lock, Context context) {
        this.f2320f = xVar;
        this.f2337w = v0Var;
        this.f2338x = map;
        this.f2323i = eVar;
        this.y = abstractC0521b;
        this.f2321g = lock;
        this.f2322h = context;
    }

    public final void a() {
        this.f2332r = false;
        x xVar = this.f2320f;
        u uVar = xVar.f2377p;
        HashMap hashMap = xVar.f2371j;
        uVar.f2359u = Collections.EMPTY_SET;
        Iterator it = this.f2329o.iterator();
        while (it.hasNext()) {
            S0.b bVar = (S0.b) it.next();
            if (!hashMap.containsKey(bVar)) {
                hashMap.put(bVar, new R0.a(17, null));
            }
        }
    }

    public final void b(boolean z5) {
        C0420a c0420a = this.f2330p;
        if (c0420a != null) {
            if (c0420a.a() && z5) {
                c0420a.getClass();
                try {
                    C0424e c0424e = (C0424e) c0420a.r();
                    Integer num = c0420a.f4420G;
                    U0.t.f(num);
                    int intValue = num.intValue();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(c0424e.f3774e);
                    obtain.writeInt(intValue);
                    c0424e.b(obtain, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            c0420a.l();
            U0.t.f(this.f2337w);
            this.f2334t = null;
        }
    }

    @Override // T0.v
    public final void c(Bundle bundle) {
        if (k(1)) {
            if (bundle != null) {
                this.f2328n.putAll(bundle);
            }
            if (l()) {
                d();
            }
        }
    }

    public final void d() {
        x xVar = this.f2320f;
        xVar.f2365d.lock();
        try {
            xVar.f2377p.f();
            xVar.f2375n = new C0175j(xVar);
            xVar.f2375n.h();
            xVar.f2366e.signalAll();
            xVar.f2365d.unlock();
            y.f2379a.execute(new A.b(6, this));
            C0420a c0420a = this.f2330p;
            if (c0420a != null) {
                if (this.f2335u) {
                    U0.f fVar = this.f2334t;
                    U0.t.f(fVar);
                    boolean z5 = this.f2336v;
                    c0420a.getClass();
                    try {
                        C0424e c0424e = (C0424e) c0420a.r();
                        Integer num = c0420a.f4420G;
                        U0.t.f(num);
                        int intValue = num.intValue();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(c0424e.f3774e);
                        int i7 = AbstractC0277b.f3775a;
                        if (fVar == null) {
                            obtain.writeStrongBinder(null);
                        } else {
                            obtain.writeStrongBinder(((U0.D) fVar).asBinder());
                        }
                        obtain.writeInt(intValue);
                        obtain.writeInt(z5 ? 1 : 0);
                        c0424e.b(obtain, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                b(false);
            }
            Iterator it = this.f2320f.f2371j.keySet().iterator();
            while (it.hasNext()) {
                S0.a aVar = (S0.a) this.f2320f.f2370i.get((S0.b) it.next());
                U0.t.f(aVar);
                aVar.l();
            }
            this.f2320f.f2378q.a(this.f2328n.isEmpty() ? null : this.f2328n);
        } catch (Throwable th) {
            xVar.f2365d.unlock();
            throw th;
        }
    }

    public final void e(R0.a aVar) {
        ArrayList arrayList = this.f2339z;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Future) arrayList.get(i7)).cancel(true);
        }
        arrayList.clear();
        b(!aVar.a());
        x xVar = this.f2320f;
        xVar.e();
        xVar.f2378q.b(aVar);
    }

    @Override // T0.v
    public final void f(int i7) {
        e(new R0.a(8, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.f2323i.a(r3.f2053g, null, null) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(R0.a aVar, S0.c cVar, boolean z5) {
        cVar.f2200a.getClass();
        if (z5 && !aVar.a()) {
        }
        if (this.f2324j == null || Integer.MAX_VALUE < this.f2325k) {
            this.f2324j = aVar;
            this.f2325k = Integer.MAX_VALUE;
        }
        this.f2320f.f2371j.put(cVar.f2201b, aVar);
    }

    @Override // T0.v
    public final void h() {
        x xVar = this.f2320f;
        HashMap hashMap = xVar.f2371j;
        u uVar = xVar.f2377p;
        Map map = xVar.f2370i;
        hashMap.clear();
        this.f2332r = false;
        this.f2324j = null;
        this.f2326l = 0;
        this.f2331q = true;
        this.f2333s = false;
        this.f2335u = false;
        HashMap hashMap2 = new HashMap();
        Map map2 = this.f2338x;
        for (S0.c cVar : map2.keySet()) {
            S0.a aVar = (S0.a) map.get(cVar.f2201b);
            U0.t.f(aVar);
            S0.a aVar2 = aVar;
            cVar.f2200a.getClass();
            boolean booleanValue = ((Boolean) map2.get(cVar)).booleanValue();
            if (aVar2.m()) {
                this.f2332r = true;
                if (booleanValue) {
                    this.f2329o.add(cVar.f2201b);
                } else {
                    this.f2331q = false;
                }
            }
            hashMap2.put(aVar2, new C0176k(this, cVar, booleanValue));
        }
        if (this.f2332r) {
            v0 v0Var = this.f2337w;
            U0.t.f(v0Var);
            U0.t.f(this.y);
            v0Var.f5142l = Integer.valueOf(System.identityHashCode(uVar));
            C0181p c0181p = new C0181p(this);
            this.f2330p = (C0420a) this.y.c(this.f2322h, uVar.f2350l, v0Var, (C0402a) v0Var.f5141k, c0181p, c0181p);
        }
        this.f2327m = map.size();
        this.f2339z.add(y.f2379a.submit(new C0179n(this, hashMap2, 0)));
    }

    public final void i() {
        if (this.f2327m != 0) {
            return;
        }
        if (!this.f2332r || this.f2333s) {
            ArrayList arrayList = new ArrayList();
            this.f2326l = 1;
            x xVar = this.f2320f;
            Map map = xVar.f2370i;
            Map map2 = xVar.f2370i;
            this.f2327m = map.size();
            for (S0.b bVar : map2.keySet()) {
                if (!xVar.f2371j.containsKey(bVar)) {
                    arrayList.add((S0.a) map2.get(bVar));
                } else if (l()) {
                    d();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f2339z.add(y.f2379a.submit(new C0179n(this, arrayList, 1)));
        }
    }

    public final boolean k(int i7) {
        if (this.f2326l == i7) {
            return true;
        }
        u uVar = this.f2320f.f2377p;
        uVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(uVar.f2349k);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(uVar.f2352n);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(uVar.f2351m.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) uVar.f2344B.f1289g).size());
        I i8 = uVar.f2347i;
        if (i8 != null) {
            i8.c("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i9 = this.f2327m;
        StringBuilder sb = new StringBuilder(33);
        sb.append("mRemainingConnections=");
        sb.append(i9);
        Log.w("GACConnecting", sb.toString());
        String str = this.f2326l != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        String str2 = i7 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + 70);
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(str);
        sb2.append(" but received callback for step ");
        sb2.append(str2);
        Log.e("GACConnecting", sb2.toString(), new Exception());
        e(new R0.a(8, null));
        return false;
    }

    public final boolean l() {
        x xVar = this.f2320f;
        int i7 = this.f2327m - 1;
        this.f2327m = i7;
        if (i7 > 0) {
            return false;
        }
        if (i7 >= 0) {
            R0.a aVar = this.f2324j;
            if (aVar == null) {
                return true;
            }
            xVar.f2376o = this.f2325k;
            e(aVar);
            return false;
        }
        u uVar = xVar.f2377p;
        uVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(uVar.f2349k);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(uVar.f2352n);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(uVar.f2351m.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) uVar.f2344B.f1289g).size());
        I i8 = uVar.f2347i;
        if (i8 != null) {
            i8.c("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        e(new R0.a(8, null));
        return false;
    }

    @Override // T0.v
    public final void n(R0.a aVar, S0.c cVar, boolean z5) {
        if (k(1)) {
            g(aVar, cVar, z5);
            if (l()) {
                d();
            }
        }
    }

    @Override // T0.v
    public final boolean o() {
        ArrayList arrayList = this.f2339z;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Future) arrayList.get(i7)).cancel(true);
        }
        arrayList.clear();
        b(true);
        this.f2320f.e();
        return true;
    }

    @Override // T0.v
    public final void j() {
    }
}

package N2;

import O2.InterfaceC0373j;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import e3.C4470a;
import f3.C4502a;
import f3.C4506e;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import m.c1;

/* renamed from: N2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332s implements w {

    /* renamed from: A, reason: collision with root package name */
    public int f2087A;

    /* renamed from: D, reason: collision with root package name */
    public C4502a f2090D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2091E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2092F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f2093G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC0373j f2094H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2095I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final c1 f2096K;

    /* renamed from: L, reason: collision with root package name */
    public final s.b f2097L;

    /* renamed from: M, reason: collision with root package name */
    public final Q2.b f2098M;

    /* renamed from: n, reason: collision with root package name */
    public final y f2100n;

    /* renamed from: u, reason: collision with root package name */
    public final ReentrantLock f2101u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f2102v;

    /* renamed from: w, reason: collision with root package name */
    public final L2.f f2103w;

    /* renamed from: x, reason: collision with root package name */
    public L2.b f2104x;

    /* renamed from: y, reason: collision with root package name */
    public int f2105y;

    /* renamed from: z, reason: collision with root package name */
    public int f2106z = 0;

    /* renamed from: B, reason: collision with root package name */
    public final Bundle f2088B = new Bundle();

    /* renamed from: C, reason: collision with root package name */
    public final HashSet f2089C = new HashSet();

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f2099N = new ArrayList();

    public C0332s(y yVar, c1 c1Var, s.b bVar, L2.f fVar, Q2.b bVar2, ReentrantLock reentrantLock, Context context) {
        this.f2100n = yVar;
        this.f2096K = c1Var;
        this.f2097L = bVar;
        this.f2103w = fVar;
        this.f2098M = bVar2;
        this.f2101u = reentrantLock;
        this.f2102v = context;
    }

    public final void a() {
        this.f2092F = false;
        y yVar = this.f2100n;
        yVar.f2137F.f2118I = Collections.EMPTY_SET;
        Iterator it = this.f2089C.iterator();
        while (it.hasNext()) {
            M2.d dVar = (M2.d) it.next();
            HashMap hashMap = yVar.f2145z;
            if (!hashMap.containsKey(dVar)) {
                hashMap.put(dVar, new L2.b(17, null, null));
            }
        }
    }

    public final void b(boolean z8) {
        C4502a c4502a = this.f2090D;
        if (c4502a != null) {
            if (c4502a.j() && z8) {
                c4502a.getClass();
                try {
                    C4506e c4506e = (C4506e) c4502a.u();
                    Integer num = c4502a.f37700n0;
                    O2.w.h(num);
                    int intValue = num.intValue();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(c4506e.f4244v);
                    obtain.writeInt(intValue);
                    c4506e.i0(obtain, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            c4502a.h();
            O2.w.h(this.f2096K);
            this.f2094H = null;
        }
    }

    @Override // N2.w
    public final void c(Bundle bundle) {
        if (i(1)) {
            if (bundle != null) {
                this.f2088B.putAll(bundle);
            }
            if (j()) {
                d();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        y yVar = this.f2100n;
        yVar.f2139n.lock();
        try {
            yVar.f2137F.d();
            yVar.f2135D = new C0325k(yVar);
            yVar.f2135D.t();
            yVar.f2140u.signalAll();
            yVar.f2139n.unlock();
            z.f2146a.execute(new F3.C(4, this));
            C4502a c4502a = this.f2090D;
            if (c4502a != null) {
                if (this.f2095I) {
                    InterfaceC0373j interfaceC0373j = this.f2094H;
                    O2.w.h(interfaceC0373j);
                    boolean z8 = this.J;
                    c4502a.getClass();
                    try {
                        C4506e c4506e = (C4506e) c4502a.u();
                        Integer num = c4502a.f37700n0;
                        O2.w.h(num);
                        int intValue = num.intValue();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(c4506e.f4244v);
                        int i = Z2.b.f4245a;
                        if (interfaceC0373j == null) {
                            obtain.writeStrongBinder(null);
                        } else {
                            obtain.writeStrongBinder(((Z2.a) interfaceC0373j).asBinder());
                        }
                        obtain.writeInt(intValue);
                        obtain.writeInt(z8 ? 1 : 0);
                        c4506e.i0(obtain, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                b(false);
            }
            Iterator it = this.f2100n.f2145z.keySet().iterator();
            while (it.hasNext()) {
                M2.c cVar = (M2.c) this.f2100n.f2144y.getOrDefault((M2.d) it.next(), null);
                O2.w.h(cVar);
                cVar.h();
            }
            this.f2100n.f2138G.n(this.f2088B.isEmpty() ? null : this.f2088B);
        } catch (Throwable th) {
            yVar.f2139n.unlock();
            throw th;
        }
    }

    public final void f(L2.b bVar) {
        ArrayList arrayList = this.f2099N;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        b(!bVar.a());
        y yVar = this.f2100n;
        yVar.e();
        yVar.f2138G.i(bVar);
    }

    public final void g(L2.b bVar, M2.e eVar, boolean z8) {
        eVar.f1881a.getClass();
        if ((!z8 || bVar.a() || this.f2103w.b(null, null, bVar.f1712u) != null) && (this.f2104x == null || Integer.MAX_VALUE < this.f2105y)) {
            this.f2104x = bVar;
            this.f2105y = Integer.MAX_VALUE;
        }
        this.f2100n.f2145z.put(eVar.f1882b, bVar);
    }

    public final void h() {
        if (this.f2087A != 0) {
            return;
        }
        if (!this.f2092F || this.f2093G) {
            ArrayList arrayList = new ArrayList();
            this.f2106z = 1;
            y yVar = this.f2100n;
            s.b bVar = yVar.f2144y;
            this.f2087A = bVar.f40409v;
            Iterator it = ((s.g) bVar.keySet()).iterator();
            while (it.hasNext()) {
                M2.d dVar = (M2.d) it.next();
                if (!yVar.f2145z.containsKey(dVar)) {
                    arrayList.add((M2.c) yVar.f2144y.getOrDefault(dVar, null));
                } else if (j()) {
                    d();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f2099N.add(z.f2146a.submit(new C0329o(this, arrayList, 1)));
        }
    }

    public final boolean i(int i) {
        if (this.f2106z == i) {
            return true;
        }
        v vVar = this.f2100n.f2137F;
        vVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(vVar.f2129y);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(vVar.f2111B);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(vVar.f2110A.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(vVar.f2124P.f2061a.size());
        J j9 = vVar.f2127w;
        if (j9 != null) {
            j9.d("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i4 = this.f2087A;
        StringBuilder sb = new StringBuilder(33);
        sb.append("mRemainingConnections=");
        sb.append(i4);
        Log.w("GACConnecting", sb.toString());
        String str = this.f2106z != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        String str2 = i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + 70);
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(str);
        sb2.append(" but received callback for step ");
        sb2.append(str2);
        Log.e("GACConnecting", sb2.toString(), new Exception());
        f(new L2.b(8, null, null));
        return false;
    }

    public final boolean j() {
        int i = this.f2087A - 1;
        this.f2087A = i;
        if (i > 0) {
            return false;
        }
        y yVar = this.f2100n;
        if (i >= 0) {
            L2.b bVar = this.f2104x;
            if (bVar == null) {
                return true;
            }
            yVar.f2136E = this.f2105y;
            f(bVar);
            return false;
        }
        v vVar = yVar.f2137F;
        vVar.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(vVar.f2129y);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(vVar.f2111B);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(vVar.f2110A.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(vVar.f2124P.f2061a.size());
        J j9 = vVar.f2127w;
        if (j9 != null) {
            j9.d("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        f(new L2.b(8, null, null));
        return false;
    }

    @Override // N2.w
    public final void r(int i) {
        f(new L2.b(8, null, null));
    }

    @Override // N2.w
    public final void t() {
        s.b bVar;
        y yVar = this.f2100n;
        yVar.f2145z.clear();
        this.f2092F = false;
        this.f2104x = null;
        this.f2106z = 0;
        this.f2091E = true;
        this.f2093G = false;
        this.f2095I = false;
        HashMap hashMap = new HashMap();
        s.b bVar2 = this.f2097L;
        Iterator it = ((s.g) bVar2.keySet()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            bVar = yVar.f2144y;
            if (!hasNext) {
                break;
            }
            M2.e eVar = (M2.e) it.next();
            M2.c cVar = (M2.c) bVar.getOrDefault(eVar.f1882b, null);
            O2.w.h(cVar);
            M2.c cVar2 = cVar;
            eVar.f1881a.getClass();
            boolean booleanValue = ((Boolean) bVar2.getOrDefault(eVar, null)).booleanValue();
            if (cVar2.n()) {
                this.f2092F = true;
                if (booleanValue) {
                    this.f2089C.add(eVar.f1882b);
                } else {
                    this.f2091E = false;
                }
            }
            hashMap.put(cVar2, new C0326l(this, eVar, booleanValue));
        }
        if (this.f2092F) {
            c1 c1Var = this.f2096K;
            O2.w.h(c1Var);
            O2.w.h(this.f2098M);
            v vVar = yVar.f2137F;
            c1Var.f39400z = Integer.valueOf(System.identityHashCode(vVar));
            C0331q c0331q = new C0331q(this);
            this.f2090D = (C4502a) this.f2098M.A(this.f2102v, vVar.f2130z, c1Var, (C4470a) c1Var.f39399y, c0331q, c0331q);
        }
        this.f2087A = bVar.f40409v;
        this.f2099N.add(z.f2146a.submit(new C0329o(this, hashMap, 0)));
    }

    @Override // N2.w
    public final boolean x() {
        ArrayList arrayList = this.f2099N;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        b(true);
        this.f2100n.e();
        return true;
    }

    @Override // N2.w
    public final void y(L2.b bVar, M2.e eVar, boolean z8) {
        if (i(1)) {
            g(bVar, eVar, z8);
            if (j()) {
                d();
            }
        }
    }

    @Override // N2.w
    public final void e() {
    }
}

package n1;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import l.q0;
import m1.C1277d;
import m1.InterfaceC1276c;
import o1.C1362G;
import o1.InterfaceC1369g;
import r.C1392b;
import r.C1398h;
import y1.AbstractC1555a;

/* renamed from: n1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1334u implements InterfaceC1338y {

    /* renamed from: a, reason: collision with root package name */
    public final C1297A f11416a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f11417b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f11418c;

    /* renamed from: d, reason: collision with root package name */
    public final l1.g f11419d;

    /* renamed from: e, reason: collision with root package name */
    public l1.b f11420e;

    /* renamed from: f, reason: collision with root package name */
    public int f11421f;

    /* renamed from: h, reason: collision with root package name */
    public int f11423h;

    /* renamed from: k, reason: collision with root package name */
    public G1.a f11426k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11427l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11428m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11429n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1369g f11430o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11431p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11432q;

    /* renamed from: r, reason: collision with root package name */
    public final q0 f11433r;

    /* renamed from: s, reason: collision with root package name */
    public final C1392b f11434s;

    /* renamed from: t, reason: collision with root package name */
    public final E1.f f11435t;

    /* renamed from: g, reason: collision with root package name */
    public int f11422g = 0;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f11424i = new Bundle();

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f11425j = new HashSet();

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f11436u = new ArrayList();

    public C1334u(C1297A c1297a, q0 q0Var, C1392b c1392b, l1.g gVar, E1.f fVar, ReentrantLock reentrantLock, Context context) {
        this.f11416a = c1297a;
        this.f11433r = q0Var;
        this.f11434s = c1392b;
        this.f11419d = gVar;
        this.f11435t = fVar;
        this.f11417b = reentrantLock;
        this.f11418c = context;
    }

    public final void a() {
        this.f11428m = false;
        C1297A c1297a = this.f11416a;
        c1297a.f11289p.f11454p = Collections.emptySet();
        Iterator it = this.f11425j.iterator();
        while (it.hasNext()) {
            C1277d c1277d = (C1277d) it.next();
            HashMap hashMap = c1297a.f11283j;
            if (!hashMap.containsKey(c1277d)) {
                hashMap.put(c1277d, new l1.b(17, null));
            }
        }
    }

    public final void b(boolean z) {
        G1.a aVar = this.f11426k;
        if (aVar != null) {
            if (aVar.a() && z) {
                aVar.getClass();
                try {
                    G1.e eVar = (G1.e) aVar.t();
                    Integer num = aVar.f918G;
                    o1.u.g(num);
                    int intValue = num.intValue();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(eVar.f211f);
                    obtain.writeInt(intValue);
                    eVar.b(obtain, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            aVar.l();
            o1.u.g(this.f11433r);
            this.f11430o = null;
        }
    }

    @Override // n1.InterfaceC1338y
    public final void c(Bundle bundle) {
        if (i(1)) {
            if (bundle != null) {
                this.f11424i.putAll(bundle);
            }
            if (k()) {
                d();
            }
        }
    }

    public final void d() {
        C1297A c1297a = this.f11416a;
        c1297a.f11277a.lock();
        try {
            c1297a.f11289p.i();
            c1297a.f11287n = new C1328o(c1297a);
            c1297a.f11287n.j();
            c1297a.f11278e.signalAll();
            c1297a.f11277a.unlock();
            AbstractC1298B.f11291a.execute(new B.a(17, this));
            G1.a aVar = this.f11426k;
            if (aVar != null) {
                if (this.f11431p) {
                    InterfaceC1369g interfaceC1369g = this.f11430o;
                    o1.u.g(interfaceC1369g);
                    boolean z = this.f11432q;
                    aVar.getClass();
                    try {
                        G1.e eVar = (G1.e) aVar.t();
                        Integer num = aVar.f918G;
                        o1.u.g(num);
                        int intValue = num.intValue();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(eVar.f211f);
                        int i2 = AbstractC1555a.f12339a;
                        if (interfaceC1369g == null) {
                            obtain.writeStrongBinder(null);
                        } else {
                            obtain.writeStrongBinder(((C1362G) interfaceC1369g).asBinder());
                        }
                        obtain.writeInt(intValue);
                        obtain.writeInt(z ? 1 : 0);
                        eVar.b(obtain, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                b(false);
            }
            Iterator it = this.f11416a.f11283j.keySet().iterator();
            while (it.hasNext()) {
                InterfaceC1276c interfaceC1276c = (InterfaceC1276c) this.f11416a.f11282i.getOrDefault((C1277d) it.next(), null);
                o1.u.g(interfaceC1276c);
                interfaceC1276c.l();
            }
            this.f11416a.f11290q.b(this.f11424i.isEmpty() ? null : this.f11424i);
        } catch (Throwable th) {
            c1297a.f11277a.unlock();
            throw th;
        }
    }

    public final void e(l1.b bVar) {
        ArrayList arrayList = this.f11436u;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Future) arrayList.get(i2)).cancel(true);
        }
        arrayList.clear();
        b(!bVar.a());
        C1297A c1297a = this.f11416a;
        c1297a.f();
        c1297a.f11290q.k(bVar);
    }

    public final void f(l1.b bVar, m1.e eVar, boolean z) {
        eVar.f11123a.getClass();
        if ((!z || bVar.a() || this.f11419d.a(null, null, bVar.f11000b) != null) && (this.f11420e == null || Integer.MAX_VALUE < this.f11421f)) {
            this.f11420e = bVar;
            this.f11421f = Integer.MAX_VALUE;
        }
        this.f11416a.f11283j.put(eVar.f11124b, bVar);
    }

    @Override // n1.InterfaceC1338y
    public final void g(int i2) {
        e(new l1.b(8, null));
    }

    public final void h() {
        if (this.f11423h != 0) {
            return;
        }
        if (!this.f11428m || this.f11429n) {
            ArrayList arrayList = new ArrayList();
            this.f11422g = 1;
            C1297A c1297a = this.f11416a;
            C1392b c1392b = c1297a.f11282i;
            this.f11423h = c1392b.f11713c;
            Iterator it = ((C1398h) c1392b.keySet()).iterator();
            while (it.hasNext()) {
                C1277d c1277d = (C1277d) it.next();
                if (!c1297a.f11283j.containsKey(c1277d)) {
                    arrayList.add((InterfaceC1276c) c1297a.f11282i.getOrDefault(c1277d, null));
                } else if (k()) {
                    d();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f11436u.add(AbstractC1298B.f11291a.submit(new C1331r(this, arrayList, 1)));
        }
    }

    public final boolean i(int i2) {
        if (this.f11422g == i2) {
            return true;
        }
        C1337x c1337x = this.f11416a.f11289p;
        c1337x.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(c1337x.f11444f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(c1337x.f11447i);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(c1337x.f11446h.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) c1337x.f11461w.f11345a).size());
        InterfaceC1308L interfaceC1308L = c1337x.f11442d;
        if (interfaceC1308L != null) {
            interfaceC1308L.d("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        Log.w("GACConnecting", "mRemainingConnections=" + this.f11423h);
        String str = this.f11422g != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        StringBuilder sb = new StringBuilder("GoogleApiClient connecting is in step ");
        sb.append(str);
        sb.append(" but received callback for step ");
        sb.append(i2 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN");
        Log.e("GACConnecting", sb.toString(), new Exception());
        e(new l1.b(8, null));
        return false;
    }

    @Override // n1.InterfaceC1338y
    public final void j() {
        C1392b c1392b;
        C1297A c1297a = this.f11416a;
        c1297a.f11283j.clear();
        this.f11428m = false;
        this.f11420e = null;
        this.f11422g = 0;
        this.f11427l = true;
        this.f11429n = false;
        this.f11431p = false;
        HashMap hashMap = new HashMap();
        C1392b c1392b2 = this.f11434s;
        Iterator it = ((C1398h) c1392b2.keySet()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c1392b = c1297a.f11282i;
            if (!hasNext) {
                break;
            }
            m1.e eVar = (m1.e) it.next();
            InterfaceC1276c interfaceC1276c = (InterfaceC1276c) c1392b.getOrDefault(eVar.f11124b, null);
            o1.u.g(interfaceC1276c);
            InterfaceC1276c interfaceC1276c2 = interfaceC1276c;
            eVar.f11123a.getClass();
            boolean booleanValue = ((Boolean) c1392b2.getOrDefault(eVar, null)).booleanValue();
            if (interfaceC1276c2.n()) {
                this.f11428m = true;
                if (booleanValue) {
                    this.f11425j.add(eVar.f11124b);
                } else {
                    this.f11427l = false;
                }
            }
            hashMap.put(interfaceC1276c2, new C1329p(this, eVar, booleanValue));
        }
        if (this.f11428m) {
            q0 q0Var = this.f11433r;
            o1.u.g(q0Var);
            o1.u.g(this.f11435t);
            C1337x c1337x = c1297a.f11289p;
            q0Var.f10947g = Integer.valueOf(System.identityHashCode(c1337x));
            C1333t c1333t = new C1333t(this);
            this.f11426k = (G1.a) this.f11435t.f(this.f11418c, c1337x.f11445g, q0Var, (F1.a) q0Var.f10946f, c1333t, c1333t);
        }
        this.f11423h = c1392b.f11713c;
        this.f11436u.add(AbstractC1298B.f11291a.submit(new C1331r(this, hashMap, 0)));
    }

    public final boolean k() {
        int i2 = this.f11423h - 1;
        this.f11423h = i2;
        if (i2 > 0) {
            return false;
        }
        C1297A c1297a = this.f11416a;
        if (i2 >= 0) {
            l1.b bVar = this.f11420e;
            if (bVar == null) {
                return true;
            }
            c1297a.f11288o = this.f11421f;
            e(bVar);
            return false;
        }
        C1337x c1337x = c1297a.f11289p;
        c1337x.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.append((CharSequence) "").append((CharSequence) "mContext=").println(c1337x.f11444f);
        printWriter.append((CharSequence) "").append((CharSequence) "mResuming=").print(c1337x.f11447i);
        printWriter.append((CharSequence) " mWorkQueue.size()=").print(c1337x.f11446h.size());
        printWriter.append((CharSequence) " mUnconsumedApiCalls.size()=").println(((Set) c1337x.f11461w.f11345a).size());
        InterfaceC1308L interfaceC1308L = c1337x.f11442d;
        if (interfaceC1308L != null) {
            interfaceC1308L.d("", null, printWriter, null);
        }
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        e(new l1.b(8, null));
        return false;
    }

    @Override // n1.InterfaceC1338y
    public final boolean r() {
        ArrayList arrayList = this.f11436u;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Future) arrayList.get(i2)).cancel(true);
        }
        arrayList.clear();
        b(true);
        this.f11416a.f();
        return true;
    }

    @Override // n1.InterfaceC1338y
    public final B1.n s(B1.n nVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // n1.InterfaceC1338y
    public final void x(l1.b bVar, m1.e eVar, boolean z) {
        if (i(1)) {
            f(bVar, eVar, z);
            if (k()) {
                d();
            }
        }
    }

    @Override // n1.InterfaceC1338y
    public final void n() {
    }
}

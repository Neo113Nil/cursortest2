package s1;

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
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import n.w1;
import r1.C0845d;
import r1.InterfaceC0844c;
import t1.C0912I;
import t1.InterfaceC0919f;
import z1.AbstractC1053a;

/* renamed from: s1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0883n implements InterfaceC0886q {

    /* renamed from: A, reason: collision with root package name */
    public final Map f7673A;

    /* renamed from: B, reason: collision with root package name */
    public final AbstractC1053a f7674B;

    /* renamed from: d, reason: collision with root package name */
    public final C0888s f7676d;

    /* renamed from: e, reason: collision with root package name */
    public final Lock f7677e;

    /* renamed from: i, reason: collision with root package name */
    public final Context f7678i;

    /* renamed from: l, reason: collision with root package name */
    public final q1.f f7679l;

    /* renamed from: m, reason: collision with root package name */
    public q1.b f7680m;

    /* renamed from: n, reason: collision with root package name */
    public int f7681n;

    /* renamed from: p, reason: collision with root package name */
    public int f7683p;

    /* renamed from: s, reason: collision with root package name */
    public I1.a f7686s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7687t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7688u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7689v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0919f f7690w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7691x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7692y;

    /* renamed from: z, reason: collision with root package name */
    public final w1 f7693z;

    /* renamed from: o, reason: collision with root package name */
    public int f7682o = 0;

    /* renamed from: q, reason: collision with root package name */
    public final Bundle f7684q = new Bundle();

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f7685r = new HashSet();

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f7675C = new ArrayList();

    public C0883n(C0888s c0888s, w1 w1Var, Map map, q1.f fVar, AbstractC1053a abstractC1053a, Lock lock, Context context) {
        this.f7676d = c0888s;
        this.f7693z = w1Var;
        this.f7673A = map;
        this.f7679l = fVar;
        this.f7674B = abstractC1053a;
        this.f7677e = lock;
        this.f7678i = context;
    }

    @Override // s1.InterfaceC0886q
    public final void b(q1.b bVar, r1.e eVar, boolean z7) {
        if (m(1)) {
            f(bVar, eVar, z7);
            if (n()) {
                e();
            }
        }
    }

    @Override // s1.InterfaceC0886q
    public final void c(int i2) {
        j(new q1.b(8, null, null));
    }

    public final void d() {
        if (this.f7683p != 0) {
            return;
        }
        if (!this.f7688u || this.f7689v) {
            ArrayList arrayList = new ArrayList();
            this.f7682o = 1;
            C0888s c0888s = this.f7676d;
            Map map = c0888s.j;
            this.f7683p = map.size();
            for (C0845d c0845d : map.keySet()) {
                if (!c0888s.f7725k.containsKey(c0845d)) {
                    arrayList.add((InterfaceC0844c) map.get(c0845d));
                } else if (n()) {
                    e();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f7675C.add(t.f7733a.submit(new C0880k(this, arrayList, 1)));
        }
    }

    public final void e() {
        C0888s c0888s = this.f7676d;
        c0888s.f7720e.lock();
        try {
            c0888s.f7731q.c();
            c0888s.f7729o = new C0876g(c0888s);
            c0888s.f7729o.l();
            c0888s.f7721f.signalAll();
            c0888s.f7720e.unlock();
            t.f7733a.execute(new F.b(20, this));
            I1.a aVar = this.f7686s;
            if (aVar != null) {
                if (this.f7691x) {
                    InterfaceC0919f interfaceC0919f = this.f7690w;
                    t1.u.f(interfaceC0919f);
                    boolean z7 = this.f7692y;
                    try {
                        I1.f fVar = (I1.f) aVar.i();
                        Integer num = aVar.f1267H;
                        t1.u.f(num);
                        int intValue = num.intValue();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(fVar.f289f);
                        int i2 = C1.b.f290a;
                        obtain.writeStrongBinder(((C0912I) interfaceC0919f).asBinder());
                        obtain.writeInt(intValue);
                        obtain.writeInt(z7 ? 1 : 0);
                        fVar.b(obtain, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                k(false);
            }
            Iterator it = c0888s.f7725k.keySet().iterator();
            while (it.hasNext()) {
                InterfaceC0844c interfaceC0844c = (InterfaceC0844c) c0888s.j.get((C0845d) it.next());
                t1.u.f(interfaceC0844c);
                ((com.google.android.gms.common.internal.a) interfaceC0844c).d();
            }
            Bundle bundle = this.f7684q;
            if (true == bundle.isEmpty()) {
                bundle = null;
            }
            c0888s.f7732r.g(bundle);
        } catch (Throwable th) {
            c0888s.f7720e.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.f7679l.a(r3.f7311e, null, null) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(q1.b bVar, r1.e eVar, boolean z7) {
        eVar.f7435a.getClass();
        if (z7 && !bVar.a()) {
        }
        if (this.f7680m == null || Integer.MAX_VALUE < this.f7681n) {
            this.f7680m = bVar;
            this.f7681n = Integer.MAX_VALUE;
        }
        this.f7676d.f7725k.put(eVar.f7436b, bVar);
    }

    public final void g() {
        this.f7688u = false;
        C0888s c0888s = this.f7676d;
        c0888s.f7731q.f7716x = Collections.EMPTY_SET;
        Iterator it = this.f7685r.iterator();
        while (it.hasNext()) {
            C0845d c0845d = (C0845d) it.next();
            HashMap hashMap = c0888s.f7725k;
            if (!hashMap.containsKey(c0845d)) {
                hashMap.put(c0845d, new q1.b(17, null, null));
            }
        }
    }

    @Override // s1.InterfaceC0886q
    public final void h(Bundle bundle) {
        if (m(1)) {
            if (bundle != null) {
                this.f7684q.putAll(bundle);
            }
            if (n()) {
                e();
            }
        }
    }

    @Override // s1.InterfaceC0886q
    public final boolean i() {
        ArrayList arrayList = this.f7675C;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Future) arrayList.get(i2)).cancel(true);
        }
        arrayList.clear();
        k(true);
        this.f7676d.e();
        return true;
    }

    public final void j(q1.b bVar) {
        ArrayList arrayList = this.f7675C;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Future) arrayList.get(i2)).cancel(true);
        }
        arrayList.clear();
        k(!bVar.a());
        C0888s c0888s = this.f7676d;
        c0888s.e();
        c0888s.f7732r.m(bVar);
    }

    public final void k(boolean z7) {
        I1.a aVar = this.f7686s;
        if (aVar != null) {
            I1.a aVar2 = aVar;
            if (aVar2.m() && z7) {
                try {
                    I1.f fVar = (I1.f) aVar.i();
                    Integer num = aVar.f1267H;
                    t1.u.f(num);
                    int intValue = num.intValue();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(fVar.f289f);
                    obtain.writeInt(intValue);
                    fVar.b(obtain, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            aVar2.d();
            t1.u.f(this.f7693z);
            this.f7690w = null;
        }
    }

    @Override // s1.InterfaceC0886q
    public final void l() {
        C0888s c0888s = this.f7676d;
        HashMap hashMap = c0888s.f7725k;
        Map map = c0888s.j;
        hashMap.clear();
        this.f7688u = false;
        this.f7680m = null;
        this.f7682o = 0;
        this.f7687t = true;
        this.f7689v = false;
        this.f7691x = false;
        HashMap hashMap2 = new HashMap();
        Map map2 = this.f7673A;
        for (r1.e eVar : map2.keySet()) {
            InterfaceC0844c interfaceC0844c = (InterfaceC0844c) map.get(eVar.f7436b);
            t1.u.f(interfaceC0844c);
            eVar.f7435a.getClass();
            boolean booleanValue = ((Boolean) map2.get(eVar)).booleanValue();
            if (interfaceC0844c.b()) {
                this.f7688u = true;
                if (booleanValue) {
                    this.f7685r.add(eVar.f7436b);
                } else {
                    this.f7687t = false;
                }
            }
            hashMap2.put(interfaceC0844c, new C0877h(this, eVar, booleanValue));
        }
        if (this.f7688u) {
            w1 w1Var = this.f7693z;
            t1.u.f(w1Var);
            AbstractC1053a abstractC1053a = this.f7674B;
            t1.u.f(abstractC1053a);
            C0885p c0885p = c0888s.f7731q;
            w1Var.f6947o = Integer.valueOf(System.identityHashCode(c0885p));
            C0882m c0882m = new C0882m(this);
            this.f7686s = (I1.a) abstractC1053a.g(this.f7678i, c0885p.f7707o, w1Var, (H1.a) w1Var.f6946n, c0882m, c0882m);
        }
        this.f7683p = map.size();
        this.f7675C.add(t.f7733a.submit(new C0880k(this, hashMap2, 0)));
    }

    public final boolean m(int i2) {
        if (this.f7682o == i2) {
            return true;
        }
        C0885p c0885p = this.f7676d.f7731q;
        c0885p.getClass();
        StringWriter stringWriter = new StringWriter();
        c0885p.b("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i5 = this.f7683p;
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 22);
        sb.append("mRemainingConnections=");
        sb.append(i5);
        Log.w("GACConnecting", sb.toString());
        String str = this.f7682o != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        String str2 = i2 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + 70);
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(str);
        sb2.append(" but received callback for step ");
        sb2.append(str2);
        Log.e("GACConnecting", sb2.toString(), new Exception());
        j(new q1.b(8, null, null));
        return false;
    }

    public final boolean n() {
        int i2 = this.f7683p - 1;
        this.f7683p = i2;
        if (i2 > 0) {
            return false;
        }
        C0888s c0888s = this.f7676d;
        if (i2 >= 0) {
            q1.b bVar = this.f7680m;
            if (bVar == null) {
                return true;
            }
            c0888s.f7730p = this.f7681n;
            j(bVar);
            return false;
        }
        C0885p c0885p = c0888s.f7731q;
        c0885p.getClass();
        StringWriter stringWriter = new StringWriter();
        c0885p.b("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        j(new q1.b(8, null, null));
        return false;
    }

    @Override // s1.InterfaceC0886q
    public final void a() {
    }
}

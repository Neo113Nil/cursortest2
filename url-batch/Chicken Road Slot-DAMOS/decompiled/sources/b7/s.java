package b7;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.p5;
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
import m.g2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s implements w {
    public boolean A;
    public boolean B;
    public c7.j C;
    public boolean D;
    public boolean E;
    public final g2 F;
    public final Map G;
    public final a.a H;

    /* renamed from: d, reason: collision with root package name */
    public final y f1344d;

    /* renamed from: e, reason: collision with root package name */
    public final Lock f1345e;

    /* renamed from: i, reason: collision with root package name */
    public final Context f1346i;

    /* renamed from: r, reason: collision with root package name */
    public final z6.g f1347r;

    /* renamed from: s, reason: collision with root package name */
    public z6.b f1348s;

    /* renamed from: t, reason: collision with root package name */
    public int f1349t;

    /* renamed from: v, reason: collision with root package name */
    public int f1351v;

    /* renamed from: y, reason: collision with root package name */
    public u7.a f1354y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1355z;

    /* renamed from: u, reason: collision with root package name */
    public int f1350u = 0;

    /* renamed from: w, reason: collision with root package name */
    public final Bundle f1352w = new Bundle();

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f1353x = new HashSet();
    public final ArrayList I = new ArrayList();

    public s(y yVar, g2 g2Var, Map map, z6.g gVar, a.a aVar, Lock lock, Context context) {
        this.f1344d = yVar;
        this.F = g2Var;
        this.G = map;
        this.f1347r = gVar;
        this.H = aVar;
        this.f1345e = lock;
        this.f1346i = context;
    }

    @Override // b7.w
    public final void b(int i3) {
        k(new z6.b(8, null, null));
    }

    public final void c() {
        if (this.f1351v != 0) {
            return;
        }
        if (!this.A || this.B) {
            ArrayList arrayList = new ArrayList();
            this.f1350u = 1;
            y yVar = this.f1344d;
            Map map = yVar.f1401i;
            this.f1351v = map.size();
            for (a7.c cVar : map.keySet()) {
                if (!yVar.j.containsKey(cVar)) {
                    arrayList.add((c7.i) map.get(cVar));
                } else if (n()) {
                    h();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.I.add(z.f1409a.submit(new o(this, arrayList, 1)));
        }
    }

    @Override // b7.w
    public final void d(Bundle bundle) {
        if (m(1)) {
            if (bundle != null) {
                this.f1352w.putAll(bundle);
            }
            if (n()) {
                h();
            }
        }
    }

    @Override // b7.w
    public final boolean e() {
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((Future) arrayList.get(i3)).cancel(true);
        }
        arrayList.clear();
        l(true);
        this.f1344d.e();
        return true;
    }

    @Override // b7.w
    public final void f(z6.b bVar, a7.d dVar, boolean z10) {
        if (m(1)) {
            i(bVar, dVar, z10);
            if (n()) {
                h();
            }
        }
    }

    @Override // b7.w
    public final void g() {
        y yVar = this.f1344d;
        HashMap hashMap = yVar.j;
        Map map = yVar.f1401i;
        hashMap.clear();
        this.A = false;
        this.f1348s = null;
        this.f1350u = 0;
        this.f1355z = true;
        this.B = false;
        this.D = false;
        HashMap hashMap2 = new HashMap();
        Map map2 = this.G;
        for (a7.d dVar : map2.keySet()) {
            c7.i iVar = (c7.i) map.get(dVar.f314b);
            c7.c0.g(iVar);
            dVar.f313a.getClass();
            boolean booleanValue = ((Boolean) map2.get(dVar)).booleanValue();
            if (iVar.s()) {
                this.A = true;
                if (booleanValue) {
                    this.f1353x.add(dVar.f314b);
                } else {
                    this.f1355z = false;
                }
            }
            hashMap2.put(iVar, new l(this, dVar, booleanValue));
        }
        if (this.A) {
            g2 g2Var = this.F;
            c7.c0.g(g2Var);
            a.a aVar = this.H;
            c7.c0.g(aVar);
            v vVar = yVar.f1407p;
            g2Var.f6083u = Integer.valueOf(System.identityHashCode(vVar));
            q qVar = new q(this);
            this.f1354y = (u7.a) aVar.i(this.f1346i, vVar.g, g2Var, (t7.a) g2Var.f6082t, qVar, qVar);
        }
        this.f1351v = map.size();
        this.I.add(z.f1409a.submit(new o(this, hashMap2, 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        y yVar = this.f1344d;
        yVar.f1397d.lock();
        try {
            yVar.f1407p.f();
            yVar.f1405n = new j(yVar);
            yVar.f1405n.g();
            yVar.f1398e.signalAll();
            yVar.f1397d.unlock();
            z.f1409a.execute(new k(0, this));
            u7.a aVar = this.f1354y;
            if (aVar != null) {
                if (this.D) {
                    c7.j jVar = this.C;
                    c7.c0.g(jVar);
                    boolean z10 = this.E;
                    try {
                        u7.c cVar = (u7.c) aVar.m();
                        Integer num = aVar.I;
                        c7.c0.g(num);
                        int intValue = num.intValue();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(cVar.f2666f);
                        int i3 = m7.a.f6567a;
                        obtain.writeStrongBinder(((p5) jVar).asBinder());
                        obtain.writeInt(intValue);
                        obtain.writeInt(z10 ? 1 : 0);
                        cVar.C(obtain, 9);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                l(false);
            }
            Iterator it = yVar.j.keySet().iterator();
            while (it.hasNext()) {
                c7.i iVar = (c7.i) yVar.f1401i.get((a7.c) it.next());
                c7.c0.g(iVar);
                iVar.d();
            }
            Bundle bundle = this.f1352w;
            if (true == bundle.isEmpty()) {
                bundle = null;
            }
            yVar.f1408q.b(bundle);
        } catch (Throwable th) {
            yVar.f1397d.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.f1347r.a(r3.f10867e, null, null) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(z6.b bVar, a7.d dVar, boolean z10) {
        dVar.f313a.getClass();
        if (z10 && !bVar.b()) {
        }
        if (this.f1348s == null || Integer.MAX_VALUE < this.f1349t) {
            this.f1348s = bVar;
            this.f1349t = Integer.MAX_VALUE;
        }
        this.f1344d.j.put(dVar.f314b, bVar);
    }

    public final void j() {
        this.A = false;
        y yVar = this.f1344d;
        yVar.f1407p.f1378p = Collections.EMPTY_SET;
        Iterator it = this.f1353x.iterator();
        while (it.hasNext()) {
            a7.c cVar = (a7.c) it.next();
            HashMap hashMap = yVar.j;
            if (!hashMap.containsKey(cVar)) {
                hashMap.put(cVar, new z6.b(17, null, null));
            }
        }
    }

    public final void k(z6.b bVar) {
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((Future) arrayList.get(i3)).cancel(true);
        }
        arrayList.clear();
        l(!bVar.b());
        y yVar = this.f1344d;
        yVar.e();
        yVar.f1408q.a(bVar);
    }

    public final void l(boolean z10) {
        u7.a aVar = this.f1354y;
        if (aVar != null) {
            if (aVar.q() && z10) {
                try {
                    u7.c cVar = (u7.c) aVar.m();
                    Integer num = aVar.I;
                    c7.c0.g(num);
                    int intValue = num.intValue();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(cVar.f2666f);
                    obtain.writeInt(intValue);
                    cVar.C(obtain, 7);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            aVar.d();
            c7.c0.g(this.F);
            this.C = null;
        }
    }

    public final boolean m(int i3) {
        if (this.f1350u == i3) {
            return true;
        }
        v vVar = this.f1344d.f1407p;
        vVar.getClass();
        StringWriter stringWriter = new StringWriter();
        vVar.e("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i10 = this.f1351v;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 22);
        sb2.append("mRemainingConnections=");
        sb2.append(i10);
        Log.w("GACConnecting", sb2.toString());
        String str = this.f1350u != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        String str2 = i3 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        StringBuilder sb3 = new StringBuilder(str2.length() + str.length() + 70);
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(str);
        sb3.append(" but received callback for step ");
        sb3.append(str2);
        Log.e("GACConnecting", sb3.toString(), new Exception());
        k(new z6.b(8, null, null));
        return false;
    }

    public final boolean n() {
        int i3 = this.f1351v - 1;
        this.f1351v = i3;
        if (i3 > 0) {
            return false;
        }
        y yVar = this.f1344d;
        if (i3 >= 0) {
            z6.b bVar = this.f1348s;
            if (bVar == null) {
                return true;
            }
            yVar.f1406o = this.f1349t;
            k(bVar);
            return false;
        }
        v vVar = yVar.f1407p;
        vVar.getClass();
        StringWriter stringWriter = new StringWriter();
        vVar.e("", null, new PrintWriter(stringWriter), null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        k(new z6.b(8, null, null));
        return false;
    }

    @Override // b7.w
    public final void a() {
    }
}

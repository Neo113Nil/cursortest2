package b7;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.measurement.z5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import m.g2;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b0 implements a7.k, a7.l {

    /* renamed from: e, reason: collision with root package name */
    public final c7.i f1242e;

    /* renamed from: f, reason: collision with root package name */
    public final a f1243f;
    public final c6.c g;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final q0 f1246k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1247l;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d f1251p;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedList f1241d = new LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f1244h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f1245i = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1248m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public z6.b f1249n = null;

    /* renamed from: o, reason: collision with root package name */
    public int f1250o = 0;

    public b0(d dVar, a7.j jVar) {
        this.f1251p = dVar;
        Looper looper = dVar.f1273m.getLooper();
        a1.n a9 = jVar.a();
        s.f fVar = (s.f) a9.f41i;
        String str = (String) a9.f40e;
        String str2 = (String) a9.f42r;
        t7.a aVar = t7.a.f9322b;
        g2 g2Var = new g2(fVar, null, str, str2, aVar);
        a.a aVar2 = jVar.f331d.f313a;
        c7.c0.g(aVar2);
        c7.i i3 = aVar2.i(jVar.f328a, looper, g2Var, jVar.f332e, this, this);
        d9.c cVar = jVar.f330c;
        if (cVar == null || !(i3 instanceof c7.f)) {
            String str3 = jVar.f329b;
            if (str3 != null && (i3 instanceof c7.f)) {
                i3.f1899x = str3;
            }
        } else {
            i3.f1900y = cVar;
        }
        this.f1242e = i3;
        this.f1243f = jVar.f333f;
        this.g = new c6.c(2);
        this.j = jVar.f334h;
        if (!i3.s()) {
            this.f1246k = null;
            return;
        }
        Context context = dVar.f1267e;
        z5 z5Var = dVar.f1273m;
        a1.n a10 = jVar.a();
        this.f1246k = new q0(context, z5Var, new g2((s.f) a10.f41i, null, (String) a10.f40e, (String) a10.f42r, aVar));
    }

    public final void a() {
        c7.i iVar = this.f1242e;
        d dVar = this.f1251p;
        c7.c0.c(dVar.f1273m);
        this.f1249n = null;
        i(z6.b.f10865t);
        if (this.f1247l) {
            z5 z5Var = dVar.f1273m;
            a aVar = this.f1243f;
            z5Var.removeMessages(11, aVar);
            dVar.f1273m.removeMessages(9, aVar);
            this.f1247l = false;
        }
        Iterator it = this.f1245i.values().iterator();
        while (it.hasNext()) {
            o0 o0Var = ((n0) it.next()).f1320a;
            if (j((z6.d[]) o0Var.f1327c) != null) {
                it.remove();
            } else {
                try {
                    ((a1.n) ((h) o0Var.f1328d).f1293b).accept(iVar, new w7.g());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    iVar.e("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e9) {
                    e = e9;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        d();
        h();
    }

    public final void b(int i3) {
        c7.c0.c(this.f1251p.f1273m);
        this.f1249n = null;
        this.f1247l = true;
        String str = this.f1242e.f1883f;
        c6.c cVar = this.g;
        cVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i3 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i3 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        cVar.k(true, new Status(20, sb2.toString(), null, null));
        a aVar = this.f1243f;
        d dVar = this.f1251p;
        z5 z5Var = dVar.f1273m;
        z5Var.sendMessageDelayed(Message.obtain(z5Var, 9, aVar), 5000L);
        z5 z5Var2 = dVar.f1273m;
        z5Var2.sendMessageDelayed(Message.obtain(z5Var2, 11, aVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) dVar.g.f1868d;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.f1245i.values().iterator();
        while (it.hasNext()) {
            ((n0) it.next()).getClass();
        }
    }

    public final boolean c(z6.b bVar) {
        synchronized (d.f1261q) {
            this.f1251p.getClass();
        }
        return false;
    }

    public final void d() {
        LinkedList linkedList = this.f1241d;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            l0 l0Var = (l0) arrayList.get(i3);
            if (!this.f1242e.q()) {
                return;
            }
            if (e(l0Var)) {
                linkedList.remove(l0Var);
            }
        }
    }

    public final boolean e(l0 l0Var) {
        if (!(l0Var instanceof l0)) {
            c6.c cVar = this.g;
            c7.i iVar = this.f1242e;
            l0Var.f(cVar, iVar.s());
            try {
                l0Var.g(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                iVar.e("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        z6.d j = j(l0Var.a(this));
        if (j == null) {
            c6.c cVar2 = this.g;
            c7.i iVar2 = this.f1242e;
            l0Var.f(cVar2, iVar2.s());
            try {
                l0Var.g(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                iVar2.e("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f1242e.getClass().getName();
        String str = j.f10874d;
        long b10 = j.b();
        int length = name.length();
        StringBuilder sb2 = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(b10).length() + 2);
        n0.l.l(sb2, name, " could not execute call because it requires feature (", str, ", ");
        sb2.append(b10);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        d dVar = this.f1251p;
        if (!dVar.f1274n || !l0Var.b(this)) {
            l0Var.e(new a7.n(j));
            return true;
        }
        int c10 = l0Var.c(this);
        c0 c0Var = new c0(this.f1243f, j);
        ArrayList arrayList = this.f1248m;
        int indexOf = arrayList.indexOf(c0Var);
        if (indexOf >= 0) {
            c0 c0Var2 = (c0) arrayList.get(indexOf);
            dVar.f1273m.removeMessages(15, c0Var2);
            dVar.f1273m.sendMessageDelayed(Message.obtain(dVar.f1273m, 15, c0Var2), 5000L);
            return false;
        }
        arrayList.add(c0Var);
        dVar.f1273m.sendMessageDelayed(Message.obtain(dVar.f1273m, 15, c0Var), 5000L);
        dVar.f1273m.sendMessageDelayed(Message.obtain(dVar.f1273m, 16, c0Var), 120000L);
        z6.b bVar = new z6.b(1, 2, null, null, Integer.valueOf(c10));
        if (c(bVar)) {
            String str2 = j.f10874d;
            long b11 = j.b();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(b11).length());
            sb3.append("A dialog should be displayed for missing feature: ");
            sb3.append(str2);
            sb3.append(", version: ");
            sb3.append(b11);
            Log.w("GoogleApiManager", sb3.toString());
            return false;
        }
        if (!dVar.f(bVar, this.j)) {
            return false;
        }
        String str3 = j.f10874d;
        long b12 = j.b();
        StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(b12).length());
        sb4.append("Notification displayed for missing feature: ");
        sb4.append(str3);
        sb4.append(", version: ");
        sb4.append(b12);
        Log.w("GoogleApiManager", sb4.toString());
        return false;
    }

    public final void f(Status status, Exception exc, boolean z10) {
        c7.c0.c(this.f1251p.f1273m);
        if ((status == null) == (exc == null)) {
            a1.e("Status XOR exception should be null");
            return;
        }
        Iterator it = this.f1241d.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (!z10 || l0Var.f1312a == 2) {
                if (status != null) {
                    l0Var.d(status);
                } else {
                    l0Var.e(exc);
                }
                it.remove();
            }
        }
    }

    public final void g(Status status) {
        c7.c0.c(this.f1251p.f1273m);
        f(status, null, false);
    }

    public final void h() {
        d dVar = this.f1251p;
        z5 z5Var = dVar.f1273m;
        a aVar = this.f1243f;
        z5Var.removeMessages(12, aVar);
        z5 z5Var2 = dVar.f1273m;
        z5Var2.sendMessageDelayed(z5Var2.obtainMessage(12, aVar), dVar.f1263a);
    }

    public final void i(z6.b bVar) {
        HashSet hashSet = this.f1244h;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            kotlin.collections.i0.j();
            return;
        }
        if (c7.c0.k(bVar, z6.b.f10865t)) {
            c7.i iVar = this.f1242e;
            if (!iVar.q() || iVar.g == null) {
                throw new RuntimeException("Failed to connect when checking package");
            }
        }
        throw null;
    }

    public final z6.d j(z6.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            c7.k0 k0Var = this.f1242e.B;
            z6.d[] dVarArr2 = k0Var == null ? null : k0Var.f1936e;
            if (dVarArr2 == null) {
                dVarArr2 = new z6.d[0];
            }
            s.e eVar = new s.e(dVarArr2.length);
            for (z6.d dVar : dVarArr2) {
                eVar.put(dVar.f10874d, Long.valueOf(dVar.b()));
            }
            for (z6.d dVar2 : dVarArr) {
                Long l10 = (Long) eVar.get(dVar2.f10874d);
                if (l10 == null || l10.longValue() < dVar2.b()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    public final void k(z6.b bVar) {
        c7.c0.c(this.f1251p.f1273m);
        c7.i iVar = this.f1242e;
        String name = iVar.getClass().getName();
        String valueOf = String.valueOf(bVar);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + valueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(valueOf);
        iVar.e(sb2.toString());
        l(bVar, null);
    }

    public final void l(z6.b bVar, RuntimeException runtimeException) {
        u7.a aVar;
        d dVar = this.f1251p;
        c7.c0.c(dVar.f1273m);
        q0 q0Var = this.f1246k;
        if (q0Var != null && (aVar = q0Var.j) != null) {
            aVar.d();
        }
        c7.c0.c(this.f1251p.f1273m);
        this.f1249n = null;
        SparseIntArray sparseIntArray = (SparseIntArray) dVar.g.f1868d;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        i(bVar);
        if ((this.f1242e instanceof e7.e) && bVar.f10867e != 24) {
            dVar.f1264b = true;
            z5 z5Var = dVar.f1273m;
            z5Var.sendMessageDelayed(z5Var.obtainMessage(19), 300000L);
        }
        int i3 = bVar.f10867e;
        if (i3 == 4) {
            g(d.f1260p);
            return;
        }
        if (i3 == 25) {
            g(d.c(this.f1243f, bVar));
            return;
        }
        LinkedList linkedList = this.f1241d;
        if (linkedList.isEmpty()) {
            this.f1249n = bVar;
            return;
        }
        if (runtimeException != null) {
            c7.c0.c(dVar.f1273m);
            f(null, runtimeException, false);
            return;
        }
        boolean z10 = dVar.f1274n;
        a aVar2 = this.f1243f;
        if (!z10) {
            g(d.c(aVar2, bVar));
            return;
        }
        f(d.c(aVar2, bVar), null, true);
        if (linkedList.isEmpty() || c(bVar) || dVar.f(bVar, this.j)) {
            return;
        }
        if (bVar.f10867e == 18) {
            this.f1247l = true;
        }
        if (!this.f1247l) {
            g(d.c(aVar2, bVar));
        } else {
            z5 z5Var2 = dVar.f1273m;
            z5Var2.sendMessageDelayed(Message.obtain(z5Var2, 9, aVar2), 5000L);
        }
    }

    public final void m(l0 l0Var) {
        c7.c0.c(this.f1251p.f1273m);
        boolean q3 = this.f1242e.q();
        LinkedList linkedList = this.f1241d;
        if (q3) {
            if (e(l0Var)) {
                h();
                return;
            } else {
                linkedList.add(l0Var);
                return;
            }
        }
        linkedList.add(l0Var);
        z6.b bVar = this.f1249n;
        if (bVar == null || !bVar.b()) {
            o();
        } else {
            l(this.f1249n, null);
        }
    }

    public final void n() {
        d dVar = this.f1251p;
        c7.c0.c(dVar.f1273m);
        Status status = d.f1259o;
        g(status);
        this.g.k(false, status);
        for (e eVar : (e[]) this.f1245i.keySet().toArray(new e[0])) {
            m(new r0(eVar, new w7.g()));
        }
        i(new z6.b(4, null, null));
        if (this.f1242e.q()) {
            dVar.f1273m.post(new k(2, new d9.c(7, this)));
        }
    }

    public final void o() {
        d dVar = this.f1251p;
        c7.c0.c(dVar.f1273m);
        c7.i iVar = this.f1242e;
        c7.i iVar2 = iVar;
        if (iVar2.q() || iVar2.r()) {
            return;
        }
        try {
            int i3 = dVar.g.i(dVar.f1267e, iVar);
            if (i3 != 0) {
                z6.b bVar = new z6.b(i3, null, null);
                String name = iVar.getClass().getName();
                String bVar2 = bVar.toString();
                StringBuilder sb2 = new StringBuilder(name.length() + 35 + bVar2.length());
                sb2.append("The service for ");
                sb2.append(name);
                sb2.append(" is not available: ");
                sb2.append(bVar2);
                Log.w("GoogleApiManager", sb2.toString());
                l(bVar, null);
                return;
            }
            d0 d0Var = new d0(dVar, iVar, this.f1243f);
            if (iVar.s()) {
                q0 q0Var = this.f1246k;
                c7.c0.g(q0Var);
                u7.a aVar = q0Var.j;
                if (aVar != null) {
                    aVar.d();
                }
                g2 g2Var = q0Var.f1337i;
                g2Var.f6083u = Integer.valueOf(System.identityHashCode(q0Var));
                aa aaVar = q0Var.g;
                Context context = q0Var.f1334e;
                Handler handler = q0Var.f1335f;
                q0Var.j = (u7.a) aaVar.i(context, handler.getLooper(), g2Var, (t7.a) g2Var.f6082t, q0Var, q0Var);
                q0Var.f1338k = d0Var;
                Set set = q0Var.f1336h;
                if (set == null || set.isEmpty()) {
                    handler.post(new k(q0Var));
                } else {
                    u7.a aVar2 = q0Var.j;
                    aVar2.getClass();
                    aVar2.b(new c7.e(aVar2));
                }
            }
            try {
                iVar2.b(d0Var);
            } catch (SecurityException e2) {
                l(new z6.b(10, null, null), e2);
            }
        } catch (IllegalStateException e9) {
            l(new z6.b(10, null, null), e9);
        }
    }

    @Override // a7.k
    public final void onConnected(Bundle bundle) {
        d dVar = this.f1251p;
        if (Looper.myLooper() == dVar.f1273m.getLooper()) {
            a();
        } else {
            dVar.f1273m.post(new k(1, this));
        }
    }

    @Override // a7.l
    public final void onConnectionFailed(z6.b bVar) {
        l(bVar, null);
    }

    @Override // a7.k
    public final void onConnectionSuspended(int i3) {
        d dVar = this.f1251p;
        if (Looper.myLooper() == dVar.f1273m.getLooper()) {
            b(i3);
        } else {
            dVar.f1273m.post(new b6.d(i3, 1, this));
        }
    }
}

package q3;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import p3.a;
import p3.a.d;
import p3.f;

/* loaded from: classes.dex */
public final class z<O extends a.d> implements f.a, f.b {

    /* renamed from: g, reason: collision with root package name */
    private final a.f f20336g;

    /* renamed from: h, reason: collision with root package name */
    private final b<O> f20337h;

    /* renamed from: i, reason: collision with root package name */
    private final p f20338i;

    /* renamed from: l, reason: collision with root package name */
    private final int f20341l;

    /* renamed from: m, reason: collision with root package name */
    private final o0 f20342m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20343n;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ e f20347r;

    /* renamed from: f, reason: collision with root package name */
    private final Queue<u0> f20335f = new LinkedList();

    /* renamed from: j, reason: collision with root package name */
    private final Set<v0> f20339j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    private final Map<h<?>, k0> f20340k = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private final List<a0> f20344o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    private o3.b f20345p = null;

    /* renamed from: q, reason: collision with root package name */
    private int f20346q = 0;

    public z(e eVar, p3.e<O> eVar2) {
        this.f20347r = eVar;
        a.f h7 = eVar2.h(eVar.f20259u.getLooper(), this);
        this.f20336g = h7;
        this.f20337h = eVar2.f();
        this.f20338i = new p();
        this.f20341l = eVar2.i();
        if (h7.o()) {
            this.f20342m = eVar2.j(eVar.f20250l, eVar.f20259u);
        } else {
            this.f20342m = null;
        }
    }

    static /* synthetic */ void I(z zVar, a0 a0Var) {
        if (zVar.f20344o.contains(a0Var) && !zVar.f20343n) {
            if (zVar.f20336g.a()) {
                zVar.e();
            } else {
                zVar.z();
            }
        }
    }

    static /* synthetic */ void J(z zVar, a0 a0Var) {
        o3.d dVar;
        o3.d[] f7;
        if (zVar.f20344o.remove(a0Var)) {
            zVar.f20347r.f20259u.removeMessages(15, a0Var);
            zVar.f20347r.f20259u.removeMessages(16, a0Var);
            dVar = a0Var.f20221b;
            ArrayList arrayList = new ArrayList(zVar.f20335f.size());
            for (u0 u0Var : zVar.f20335f) {
                if ((u0Var instanceof h0) && (f7 = ((h0) u0Var).f(zVar)) != null && v3.a.b(f7, dVar)) {
                    arrayList.add(u0Var);
                }
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                u0 u0Var2 = (u0) arrayList.get(i7);
                zVar.f20335f.remove(u0Var2);
                u0Var2.b(new p3.l(dVar));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        u();
        m(o3.b.f19842j);
        j();
        Iterator<k0> it = this.f20340k.values().iterator();
        if (it.hasNext()) {
            k<a.b, ?> kVar = it.next().f20289a;
            throw null;
        }
        e();
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i7) {
        u();
        this.f20343n = true;
        this.f20338i.d(i7, this.f20336g.n());
        this.f20347r.f20259u.sendMessageDelayed(Message.obtain(this.f20347r.f20259u, 9, this.f20337h), this.f20347r.f20244f);
        this.f20347r.f20259u.sendMessageDelayed(Message.obtain(this.f20347r.f20259u, 11, this.f20337h), this.f20347r.f20245g);
        this.f20347r.f20252n.c();
        Iterator<k0> it = this.f20340k.values().iterator();
        while (it.hasNext()) {
            it.next().f20290b.run();
        }
    }

    private final boolean d(o3.b bVar) {
        synchronized (e.f20242y) {
            q unused = this.f20347r.f20256r;
        }
        return false;
    }

    private final void e() {
        ArrayList arrayList = new ArrayList(this.f20335f);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            u0 u0Var = (u0) arrayList.get(i7);
            if (!this.f20336g.a()) {
                return;
            }
            if (f(u0Var)) {
                this.f20335f.remove(u0Var);
            }
        }
    }

    private final boolean f(u0 u0Var) {
        if (!(u0Var instanceof h0)) {
            g(u0Var);
            return true;
        }
        h0 h0Var = (h0) u0Var;
        o3.d n7 = n(h0Var.f(this));
        if (n7 == null) {
            g(u0Var);
            return true;
        }
        String name = this.f20336g.getClass().getName();
        String c7 = n7.c();
        long g7 = n7.g();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(c7).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(c7);
        sb.append(", ");
        sb.append(g7);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f20347r.f20260v || !h0Var.g(this)) {
            h0Var.b(new p3.l(n7));
            return true;
        }
        a0 a0Var = new a0(this.f20337h, n7, null);
        int indexOf = this.f20344o.indexOf(a0Var);
        if (indexOf >= 0) {
            a0 a0Var2 = this.f20344o.get(indexOf);
            this.f20347r.f20259u.removeMessages(15, a0Var2);
            this.f20347r.f20259u.sendMessageDelayed(Message.obtain(this.f20347r.f20259u, 15, a0Var2), this.f20347r.f20244f);
            return false;
        }
        this.f20344o.add(a0Var);
        this.f20347r.f20259u.sendMessageDelayed(Message.obtain(this.f20347r.f20259u, 15, a0Var), this.f20347r.f20244f);
        this.f20347r.f20259u.sendMessageDelayed(Message.obtain(this.f20347r.f20259u, 16, a0Var), this.f20347r.f20245g);
        o3.b bVar = new o3.b(2, null);
        if (d(bVar)) {
            return false;
        }
        this.f20347r.t(bVar, this.f20341l);
        return false;
    }

    private final void g(u0 u0Var) {
        u0Var.c(this.f20338i, C());
        try {
            u0Var.d(this);
        } catch (DeadObjectException unused) {
            q0(1);
            this.f20336g.f("DeadObjectException thrown while running ApiCallRunner.");
        } catch (Throwable th) {
            throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", this.f20336g.getClass().getName()), th);
        }
    }

    private final void h(Status status, Exception exc, boolean z6) {
        r3.o.d(this.f20347r.f20259u);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator<u0> it = this.f20335f.iterator();
        while (it.hasNext()) {
            u0 next = it.next();
            if (!z6 || next.f20322a == 2) {
                if (status != null) {
                    next.a(status);
                } else {
                    next.b(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Status status) {
        r3.o.d(this.f20347r.f20259u);
        h(status, null, false);
    }

    private final void j() {
        if (this.f20343n) {
            this.f20347r.f20259u.removeMessages(11, this.f20337h);
            this.f20347r.f20259u.removeMessages(9, this.f20337h);
            this.f20343n = false;
        }
    }

    private final void k() {
        this.f20347r.f20259u.removeMessages(12, this.f20337h);
        this.f20347r.f20259u.sendMessageDelayed(this.f20347r.f20259u.obtainMessage(12, this.f20337h), this.f20347r.f20246h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l(boolean z6) {
        r3.o.d(this.f20347r.f20259u);
        if (!this.f20336g.a() || this.f20340k.size() != 0) {
            return false;
        }
        if (!this.f20338i.b()) {
            this.f20336g.f("Timing out service connection.");
            return true;
        }
        if (z6) {
            k();
        }
        return false;
    }

    private final void m(o3.b bVar) {
        Iterator<v0> it = this.f20339j.iterator();
        while (it.hasNext()) {
            it.next().b(this.f20337h, bVar, r3.n.a(bVar, o3.b.f19842j) ? this.f20336g.m() : null);
        }
        this.f20339j.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final o3.d n(o3.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            o3.d[] l7 = this.f20336g.l();
            if (l7 == null) {
                l7 = new o3.d[0];
            }
            h.a aVar = new h.a(l7.length);
            for (o3.d dVar : l7) {
                aVar.put(dVar.c(), Long.valueOf(dVar.g()));
            }
            for (o3.d dVar2 : dVarArr) {
                Long l8 = (Long) aVar.get(dVar2.c());
                if (l8 == null || l8.longValue() < dVar2.g()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    public final void A(v0 v0Var) {
        r3.o.d(this.f20347r.f20259u);
        this.f20339j.add(v0Var);
    }

    final boolean B() {
        return this.f20336g.a();
    }

    public final boolean C() {
        return this.f20336g.o();
    }

    public final int D() {
        return this.f20341l;
    }

    @Override // q3.j
    public final void E(o3.b bVar) {
        p(bVar, null);
    }

    final int F() {
        return this.f20346q;
    }

    final void G() {
        this.f20346q++;
    }

    @Override // q3.d
    public final void O0(Bundle bundle) {
        if (Looper.myLooper() == this.f20347r.f20259u.getLooper()) {
            b();
        } else {
            this.f20347r.f20259u.post(new v(this));
        }
    }

    public final void o(o3.b bVar) {
        r3.o.d(this.f20347r.f20259u);
        a.f fVar = this.f20336g;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(bVar);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.f(sb.toString());
        p(bVar, null);
    }

    public final void p(o3.b bVar, Exception exc) {
        r3.o.d(this.f20347r.f20259u);
        o0 o0Var = this.f20342m;
        if (o0Var != null) {
            o0Var.o4();
        }
        u();
        this.f20347r.f20252n.c();
        m(bVar);
        if ((this.f20336g instanceof t3.e) && bVar.c() != 24) {
            e.a(this.f20347r, true);
            this.f20347r.f20259u.sendMessageDelayed(this.f20347r.f20259u.obtainMessage(19), 300000L);
        }
        if (bVar.c() == 4) {
            i(e.f20241x);
            return;
        }
        if (this.f20335f.isEmpty()) {
            this.f20345p = bVar;
            return;
        }
        if (exc != null) {
            r3.o.d(this.f20347r.f20259u);
            h(null, exc, false);
            return;
        }
        if (!this.f20347r.f20260v) {
            i(e.j(this.f20337h, bVar));
            return;
        }
        h(e.j(this.f20337h, bVar), null, true);
        if (this.f20335f.isEmpty() || d(bVar) || this.f20347r.t(bVar, this.f20341l)) {
            return;
        }
        if (bVar.c() == 18) {
            this.f20343n = true;
        }
        if (this.f20343n) {
            this.f20347r.f20259u.sendMessageDelayed(Message.obtain(this.f20347r.f20259u, 9, this.f20337h), this.f20347r.f20244f);
        } else {
            i(e.j(this.f20337h, bVar));
        }
    }

    public final void q(u0 u0Var) {
        r3.o.d(this.f20347r.f20259u);
        if (this.f20336g.a()) {
            if (f(u0Var)) {
                k();
                return;
            } else {
                this.f20335f.add(u0Var);
                return;
            }
        }
        this.f20335f.add(u0Var);
        o3.b bVar = this.f20345p;
        if (bVar == null || !bVar.i()) {
            z();
        } else {
            p(this.f20345p, null);
        }
    }

    @Override // q3.d
    public final void q0(int i7) {
        if (Looper.myLooper() == this.f20347r.f20259u.getLooper()) {
            c(i7);
        } else {
            this.f20347r.f20259u.post(new w(this, i7));
        }
    }

    public final void r() {
        r3.o.d(this.f20347r.f20259u);
        i(e.f20240w);
        this.f20338i.c();
        for (h hVar : (h[]) this.f20340k.keySet().toArray(new h[0])) {
            q(new t0(hVar, new j4.i()));
        }
        m(new o3.b(4));
        if (this.f20336g.a()) {
            this.f20336g.g(new y(this));
        }
    }

    public final a.f s() {
        return this.f20336g;
    }

    public final Map<h<?>, k0> t() {
        return this.f20340k;
    }

    public final void u() {
        r3.o.d(this.f20347r.f20259u);
        this.f20345p = null;
    }

    public final o3.b v() {
        r3.o.d(this.f20347r.f20259u);
        return this.f20345p;
    }

    public final void w() {
        r3.o.d(this.f20347r.f20259u);
        if (this.f20343n) {
            z();
        }
    }

    public final void x() {
        r3.o.d(this.f20347r.f20259u);
        if (this.f20343n) {
            j();
            i(this.f20347r.f20251m.g(this.f20347r.f20250l) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f20336g.f("Timing out connection while resuming.");
        }
    }

    public final boolean y() {
        return l(true);
    }

    public final void z() {
        o3.b bVar;
        r3.o.d(this.f20347r.f20259u);
        if (this.f20336g.a() || this.f20336g.k()) {
            return;
        }
        try {
            int a7 = this.f20347r.f20252n.a(this.f20347r.f20250l, this.f20336g);
            if (a7 == 0) {
                c0 c0Var = new c0(this.f20347r, this.f20336g, this.f20337h);
                if (this.f20336g.o()) {
                    ((o0) r3.o.i(this.f20342m)).C3(c0Var);
                }
                try {
                    this.f20336g.c(c0Var);
                    return;
                } catch (SecurityException e7) {
                    e = e7;
                    bVar = new o3.b(10);
                    p(bVar, e);
                    return;
                }
            }
            o3.b bVar2 = new o3.b(a7, null);
            String name = this.f20336g.getClass().getName();
            String valueOf = String.valueOf(bVar2);
            StringBuilder sb = new StringBuilder(name.length() + 35 + valueOf.length());
            sb.append("The service for ");
            sb.append(name);
            sb.append(" is not available: ");
            sb.append(valueOf);
            Log.w("GoogleApiManager", sb.toString());
            p(bVar2, null);
        } catch (IllegalStateException e8) {
            e = e8;
            bVar = new o3.b(10);
        }
    }
}

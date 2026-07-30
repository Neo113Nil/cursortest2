package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class es1 implements e50, f50 {
    public final b8 c;
    public final h8 d;
    public final c51 e;
    public final int h;
    public final ps1 i;
    public boolean j;
    public final /* synthetic */ g50 m;
    public final LinkedList b = new LinkedList();
    public final HashSet f = new HashSet();
    public final HashMap g = new HashMap();
    public final ArrayList k = new ArrayList();
    public fm l = null;

    public es1(g50 g50Var, ct1 ct1Var) {
        this.m = g50Var;
        Looper looper = g50Var.m.getLooper();
        i8 a = ct1Var.a();
        jb jbVar = new jb((t9) a.e, (String) a.g, (String) a.h);
        zr1 zr1Var = (zr1) ct1Var.c.e;
        y90.i(zr1Var);
        b8 p = zr1Var.p(ct1Var.a, looper, jbVar, ct1Var.d, this, this);
        String str = ct1Var.b;
        if (str != null && (p instanceof a)) {
            ((a) p).r = str;
        }
        if (str != null && (p instanceof wp0)) {
            qy0.u(p);
            throw null;
        }
        this.c = p;
        this.d = ct1Var.e;
        this.e = new c51(15);
        this.h = ct1Var.f;
        if (!p.k()) {
            this.i = null;
            return;
        }
        Context context = g50Var.e;
        gt1 gt1Var = g50Var.m;
        i8 a2 = ct1Var.a();
        this.i = new ps1(context, gt1Var, new jb((t9) a2.e, (String) a2.g, (String) a2.h));
    }

    @Override // defpackage.e50
    public final void a(int i) {
        Looper myLooper = Looper.myLooper();
        gt1 gt1Var = this.m.m;
        if (myLooper == gt1Var.getLooper()) {
            i(i);
        } else {
            gt1Var.post(new mf(i, 3, this));
        }
    }

    @Override // defpackage.f50
    public final void b(fm fmVar) {
        o(fmVar, null);
    }

    @Override // defpackage.e50
    public final void c() {
        Looper myLooper = Looper.myLooper();
        gt1 gt1Var = this.m.m;
        if (myLooper == gt1Var.getLooper()) {
            h();
        } else {
            gt1Var.post(new b4(2, this));
        }
    }

    public final void d(fm fmVar) {
        HashSet hashSet = this.f;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            af.c();
        } else {
            if (xa0.m(fmVar, fm.i)) {
                this.c.h();
            }
            throw null;
        }
    }

    public final void e(Status status) {
        y90.d(this.m.m);
        f(status, null, false);
    }

    public final void f(Status status, Exception exc, boolean z) {
        y90.d(this.m.m);
        if ((status == null) == (exc == null)) {
            dd0.e("Status XOR exception should be null");
            return;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ms1 ms1Var = (ms1) it.next();
            if (!z || ms1Var.a == 2) {
                if (status != null) {
                    ms1Var.c(status);
                } else {
                    ms1Var.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.b;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ms1 ms1Var = (ms1) arrayList.get(i);
            if (!this.c.a()) {
                return;
            }
            if (k(ms1Var)) {
                linkedList.remove(ms1Var);
            }
        }
    }

    public final void h() {
        g50 g50Var = this.m;
        y90.d(g50Var.m);
        this.l = null;
        d(fm.i);
        gt1 gt1Var = g50Var.m;
        if (this.j) {
            h8 h8Var = this.d;
            gt1Var.removeMessages(11, h8Var);
            gt1Var.removeMessages(9, h8Var);
            this.j = false;
        }
        Iterator it = this.g.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            af.c();
        } else {
            g();
            j();
        }
    }

    public final void i(int i) {
        g50 g50Var = this.m;
        gt1 gt1Var = g50Var.m;
        y90.d(g50Var.m);
        this.l = null;
        this.j = true;
        String j = this.c.j();
        c51 c51Var = this.e;
        c51Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (j != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(j);
        }
        c51Var.m(true, new Status(20, sb.toString(), null, null));
        h8 h8Var = this.d;
        gt1Var.sendMessageDelayed(Message.obtain(gt1Var, 9, h8Var), 5000L);
        gt1Var.sendMessageDelayed(Message.obtain(gt1Var, 11, h8Var), 120000L);
        ((SparseIntArray) g50Var.g.e).clear();
        Iterator it = this.g.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            af.c();
        }
    }

    public final void j() {
        g50 g50Var = this.m;
        gt1 gt1Var = g50Var.m;
        h8 h8Var = this.d;
        gt1Var.removeMessages(12, h8Var);
        gt1Var.sendMessageDelayed(gt1Var.obtainMessage(12, h8Var), g50Var.a);
    }

    public final boolean k(ms1 ms1Var) {
        vx vxVar;
        if (ms1Var == null) {
            c51 c51Var = this.e;
            b8 b8Var = this.c;
            ms1Var.f(c51Var, b8Var.k());
            try {
                ms1Var.e(this);
                return true;
            } catch (DeadObjectException unused) {
                a(1);
                b8Var.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        vx[] b = ms1Var.b(this);
        if (b != null && b.length != 0) {
            vx[] g = this.c.g();
            if (g == null) {
                g = new vx[0];
            }
            s9 s9Var = new s9(g.length);
            for (vx vxVar2 : g) {
                s9Var.put(vxVar2.d, Long.valueOf(vxVar2.a()));
            }
            int length = b.length;
            for (int i = 0; i < length; i++) {
                vxVar = b[i];
                Long l = (Long) s9Var.get(vxVar.d);
                if (l == null || l.longValue() < vxVar.a()) {
                    break;
                }
            }
        }
        vxVar = null;
        if (vxVar == null) {
            c51 c51Var2 = this.e;
            b8 b8Var2 = this.c;
            ms1Var.f(c51Var2, b8Var2.k());
            try {
                ms1Var.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                a(1);
                b8Var2.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.c.getClass().getName() + " could not execute call because it requires feature (" + vxVar.d + ", " + vxVar.a() + ").");
        if (!this.m.n || !ms1Var.a(this)) {
            ms1Var.d(new pl1(vxVar));
            return true;
        }
        fs1 fs1Var = new fs1(this.d, vxVar);
        int indexOf = this.k.indexOf(fs1Var);
        ArrayList arrayList = this.k;
        if (indexOf >= 0) {
            fs1 fs1Var2 = (fs1) arrayList.get(indexOf);
            this.m.m.removeMessages(15, fs1Var2);
            gt1 gt1Var = this.m.m;
            gt1Var.sendMessageDelayed(Message.obtain(gt1Var, 15, fs1Var2), 5000L);
            return false;
        }
        arrayList.add(fs1Var);
        gt1 gt1Var2 = this.m.m;
        gt1Var2.sendMessageDelayed(Message.obtain(gt1Var2, 15, fs1Var), 5000L);
        gt1 gt1Var3 = this.m.m;
        gt1Var3.sendMessageDelayed(Message.obtain(gt1Var3, 16, fs1Var), 120000L);
        fm fmVar = new fm(2, null);
        if (!l(fmVar)) {
            this.m.a(fmVar, this.h);
        }
        return false;
    }

    public final boolean l(fm fmVar) {
        synchronized (g50.q) {
        }
        return false;
    }

    public final void m() {
        g50 g50Var = this.m;
        y90.d(g50Var.m);
        b8 b8Var = this.c;
        if (b8Var.a() || b8Var.f()) {
            return;
        }
        int i = 10;
        try {
            c51 c51Var = g50Var.g;
            Context context = g50Var.e;
            SparseIntArray sparseIntArray = (SparseIntArray) c51Var.e;
            y90.i(context);
            int e = b8Var.e();
            int i2 = ((SparseIntArray) c51Var.e).get(e, -1);
            if (i2 == -1) {
                i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= sparseIntArray.size()) {
                        i2 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i3);
                    if (keyAt > e && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i2 == -1) {
                    i2 = ((c50) c51Var.g).b(context, e);
                }
                sparseIntArray.put(e, i2);
            }
            if (i2 != 0) {
                fm fmVar = new fm(i2, null);
                Log.w("GoogleApiManager", "The service for " + b8Var.getClass().getName() + " is not available: " + fmVar.toString());
                o(fmVar, null);
                return;
            }
            gs1 gs1Var = new gs1(g50Var, b8Var, this.d);
            if (b8Var.k()) {
                ps1 ps1Var = this.i;
                y90.i(ps1Var);
                Handler handler = ps1Var.d;
                jb jbVar = ps1Var.g;
                oa1 oa1Var = ps1Var.h;
                if (oa1Var != null) {
                    oa1Var.n();
                }
                jbVar.b = Integer.valueOf(System.identityHashCode(ps1Var));
                ps1Var.h = (oa1) ps1Var.e.p(ps1Var.c, handler.getLooper(), jbVar, (pa1) jbVar.f, ps1Var, ps1Var);
                ps1Var.i = gs1Var;
                Set set = ps1Var.f;
                if (set == null || set.isEmpty()) {
                    handler.post(new b4(4, ps1Var));
                } else {
                    oa1 oa1Var2 = ps1Var.h;
                    oa1Var2.getClass();
                    oa1Var2.i(new s40(i, oa1Var2));
                }
            }
            try {
                b8Var.i(gs1Var);
            } catch (SecurityException e2) {
                o(new fm(10), e2);
            }
        } catch (IllegalStateException e3) {
            o(new fm(10), e3);
        }
    }

    public final void n(ms1 ms1Var) {
        y90.d(this.m.m);
        boolean a = this.c.a();
        LinkedList linkedList = this.b;
        if (a) {
            if (k(ms1Var)) {
                j();
                return;
            } else {
                linkedList.add(ms1Var);
                return;
            }
        }
        linkedList.add(ms1Var);
        fm fmVar = this.l;
        if (fmVar == null || fmVar.e == 0 || fmVar.g == null) {
            m();
        } else {
            o(fmVar, null);
        }
    }

    public final void o(fm fmVar, RuntimeException runtimeException) {
        oa1 oa1Var;
        y90.d(this.m.m);
        ps1 ps1Var = this.i;
        if (ps1Var != null && (oa1Var = ps1Var.h) != null) {
            oa1Var.n();
        }
        y90.d(this.m.m);
        this.l = null;
        ((SparseIntArray) this.m.g.e).clear();
        d(fmVar);
        if ((this.c instanceof et1) && fmVar.e != 24) {
            g50 g50Var = this.m;
            g50Var.b = true;
            gt1 gt1Var = g50Var.m;
            gt1Var.sendMessageDelayed(gt1Var.obtainMessage(19), 300000L);
        }
        if (fmVar.e == 4) {
            e(g50.p);
            return;
        }
        if (this.b.isEmpty()) {
            this.l = fmVar;
            return;
        }
        g50 g50Var2 = this.m;
        if (runtimeException != null) {
            y90.d(g50Var2.m);
            f(null, runtimeException, false);
            return;
        }
        boolean z = g50Var2.n;
        h8 h8Var = this.d;
        if (!z) {
            e(g50.b(h8Var, fmVar));
            return;
        }
        f(g50.b(h8Var, fmVar), null, true);
        if (this.b.isEmpty() || l(fmVar) || this.m.a(fmVar, this.h)) {
            return;
        }
        if (fmVar.e == 18) {
            this.j = true;
        }
        if (!this.j) {
            e(g50.b(this.d, fmVar));
            return;
        }
        g50 g50Var3 = this.m;
        h8 h8Var2 = this.d;
        gt1 gt1Var2 = g50Var3.m;
        gt1Var2.sendMessageDelayed(Message.obtain(gt1Var2, 9, h8Var2), 5000L);
    }

    public final void p(fm fmVar) {
        y90.d(this.m.m);
        b8 b8Var = this.c;
        b8Var.c("onSignInFailed for " + b8Var.getClass().getName() + " with " + String.valueOf(fmVar));
        o(fmVar, null);
    }

    public final void q() {
        y90.d(this.m.m);
        Status status = g50.o;
        e(status);
        this.e.m(false, status);
        for (ai0 ai0Var : (ai0[]) this.g.keySet().toArray(new ai0[0])) {
            n(new ys1(new ng1()));
        }
        d(new fm(4));
        b8 b8Var = this.c;
        if (b8Var.a()) {
            b8Var.d(new nq0(23, this));
        }
    }
}

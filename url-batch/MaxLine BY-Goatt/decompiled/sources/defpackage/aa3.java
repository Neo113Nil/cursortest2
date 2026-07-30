package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class aa3 implements uv0, vv0 {
    public final ce h;
    public final oe i;
    public final tt1 j;
    public final int m;
    public final ja3 n;
    public boolean o;
    public final /* synthetic */ wv0 r;
    public final LinkedList g = new LinkedList();
    public final HashSet k = new HashSet();
    public final HashMap l = new HashMap();
    public final ArrayList p = new ArrayList();
    public c10 q = null;

    /* JADX WARN: Multi-variable type inference failed */
    public aa3(wv0 wv0Var, rv0 rv0Var) {
        this.r = wv0Var;
        Looper looper = wv0Var.y.getLooper();
        mh a = rv0Var.a();
        sf sfVar = new sf((ii) a.n, (String) a.o, (String) a.p);
        u93 u93Var = (u93) rv0Var.c.n;
        ll3.v(u93Var);
        ce l = u93Var.l(rv0Var.a, looper, sfVar, rv0Var.d, this, this);
        String str = rv0Var.b;
        if (str != null && (l instanceof ln)) {
            ((ln) l).E = str;
        }
        if (str != null && (l instanceof ss1)) {
            q40.t(l);
            throw null;
        }
        this.h = l;
        this.i = rv0Var.e;
        this.j = new tt1(19);
        this.m = rv0Var.f;
        if (!l.k()) {
            this.n = null;
            return;
        }
        Context context = wv0Var.q;
        bb3 bb3Var = wv0Var.y;
        mh a2 = rv0Var.a();
        this.n = new ja3(context, bb3Var, new sf((ii) a2.n, (String) a2.o, (String) a2.p));
    }

    public final void a(c10 c10Var) {
        HashSet hashSet = this.k;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            b71.o();
        } else {
            if (ll3.C(c10Var, c10.q)) {
                this.h.h();
            }
            throw null;
        }
    }

    @Override // defpackage.uv0
    public final void b(int i) {
        Looper myLooper = Looper.myLooper();
        bb3 bb3Var = this.r.y;
        if (myLooper == bb3Var.getLooper()) {
            i(i);
        } else {
            bb3Var.post(new xr(i, 2, this));
        }
    }

    @Override // defpackage.vv0
    public final void c(c10 c10Var) {
        o(c10Var, null);
    }

    @Override // defpackage.uv0
    public final void d() {
        Looper myLooper = Looper.myLooper();
        bb3 bb3Var = this.r.y;
        if (myLooper == bb3Var.getLooper()) {
            h();
        } else {
            bb3Var.post(new r7(11, this));
        }
    }

    public final void e(Status status) {
        ll3.r(this.r.y);
        f(status, null, false);
    }

    public final void f(Status status, Exception exc, boolean z) {
        ll3.r(this.r.y);
        if ((status == null) == (exc == null)) {
            lh.e("Status XOR exception should be null");
            return;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ga3 ga3Var = (ga3) it.next();
            if (!z || ga3Var.a == 2) {
                if (status != null) {
                    ga3Var.c(status);
                } else {
                    ga3Var.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.g;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ga3 ga3Var = (ga3) arrayList.get(i);
            if (!this.h.a()) {
                return;
            }
            if (k(ga3Var)) {
                linkedList.remove(ga3Var);
            }
        }
    }

    public final void h() {
        wv0 wv0Var = this.r;
        ll3.r(wv0Var.y);
        this.q = null;
        a(c10.q);
        bb3 bb3Var = wv0Var.y;
        if (this.o) {
            oe oeVar = this.i;
            bb3Var.removeMessages(11, oeVar);
            bb3Var.removeMessages(9, oeVar);
            this.o = false;
        }
        Iterator it = this.l.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            b71.o();
        } else {
            g();
            j();
        }
    }

    public final void i(int i) {
        wv0 wv0Var = this.r;
        bb3 bb3Var = wv0Var.y;
        ll3.r(wv0Var.y);
        this.q = null;
        this.o = true;
        String j = this.h.j();
        tt1 tt1Var = this.j;
        tt1Var.getClass();
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
        tt1Var.t(true, new Status(20, sb.toString(), null, null));
        oe oeVar = this.i;
        bb3Var.sendMessageDelayed(Message.obtain(bb3Var, 9, oeVar), 5000L);
        bb3Var.sendMessageDelayed(Message.obtain(bb3Var, 11, oeVar), 120000L);
        ((SparseIntArray) wv0Var.s.n).clear();
        Iterator it = this.l.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            b71.o();
        }
    }

    public final void j() {
        wv0 wv0Var = this.r;
        bb3 bb3Var = wv0Var.y;
        oe oeVar = this.i;
        bb3Var.removeMessages(12, oeVar);
        bb3Var.sendMessageDelayed(bb3Var.obtainMessage(12, oeVar), wv0Var.m);
    }

    public final boolean k(ga3 ga3Var) {
        mk0 mk0Var;
        if (ga3Var == null) {
            tt1 tt1Var = this.j;
            ce ceVar = this.h;
            ga3Var.f(tt1Var, ceVar.k());
            try {
                ga3Var.e(this);
                return true;
            } catch (DeadObjectException unused) {
                b(1);
                ceVar.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        mk0[] b = ga3Var.b(this);
        if (b != null && b.length != 0) {
            mk0[] g = this.h.g();
            if (g == null) {
                g = new mk0[0];
            }
            hi hiVar = new hi(g.length);
            for (mk0 mk0Var2 : g) {
                hiVar.put(mk0Var2.m, Long.valueOf(mk0Var2.a()));
            }
            int length = b.length;
            for (int i = 0; i < length; i++) {
                mk0Var = b[i];
                Long l = (Long) hiVar.get(mk0Var.m);
                if (l == null || l.longValue() < mk0Var.a()) {
                    break;
                }
            }
        }
        mk0Var = null;
        if (mk0Var == null) {
            tt1 tt1Var2 = this.j;
            ce ceVar2 = this.h;
            ga3Var.f(tt1Var2, ceVar2.k());
            try {
                ga3Var.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                b(1);
                ceVar2.c("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.h.getClass().getName() + " could not execute call because it requires feature (" + mk0Var.m + ", " + mk0Var.a() + ").");
        if (!this.r.z || !ga3Var.a(this)) {
            ga3Var.d(new x23(mk0Var));
            return true;
        }
        ba3 ba3Var = new ba3(this.i, mk0Var);
        int indexOf = this.p.indexOf(ba3Var);
        ArrayList arrayList = this.p;
        if (indexOf >= 0) {
            ba3 ba3Var2 = (ba3) arrayList.get(indexOf);
            this.r.y.removeMessages(15, ba3Var2);
            bb3 bb3Var = this.r.y;
            bb3Var.sendMessageDelayed(Message.obtain(bb3Var, 15, ba3Var2), 5000L);
        } else {
            arrayList.add(ba3Var);
            bb3 bb3Var2 = this.r.y;
            bb3Var2.sendMessageDelayed(Message.obtain(bb3Var2, 15, ba3Var), 5000L);
            bb3 bb3Var3 = this.r.y;
            bb3Var3.sendMessageDelayed(Message.obtain(bb3Var3, 16, ba3Var), 120000L);
            c10 c10Var = new c10(2, null);
            if (!l(c10Var)) {
                this.r.a(c10Var, this.m);
            }
        }
        return false;
    }

    public final boolean l(c10 c10Var) {
        synchronized (wv0.C) {
        }
        return false;
    }

    public final void m() {
        wv0 wv0Var = this.r;
        ll3.r(wv0Var.y);
        ce ceVar = this.h;
        if (ceVar.a() || ceVar.f()) {
            return;
        }
        int i = 10;
        try {
            tt1 tt1Var = wv0Var.s;
            Context context = wv0Var.q;
            SparseIntArray sparseIntArray = (SparseIntArray) tt1Var.n;
            ll3.v(context);
            int e = ceVar.e();
            int i2 = ((SparseIntArray) tt1Var.n).get(e, -1);
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
                    i2 = ((sv0) tt1Var.o).b(context, e);
                }
                sparseIntArray.put(e, i2);
            }
            if (i2 != 0) {
                c10 c10Var = new c10(i2, null);
                Log.w("GoogleApiManager", "The service for " + ceVar.getClass().getName() + " is not available: " + c10Var.toString());
                o(c10Var, null);
                return;
            }
            my1 my1Var = new my1(wv0Var, ceVar, this.i);
            if (ceVar.k()) {
                ja3 ja3Var = this.n;
                ll3.v(ja3Var);
                Handler handler = ja3Var.i;
                sf sfVar = ja3Var.l;
                dl2 dl2Var = ja3Var.m;
                if (dl2Var != null) {
                    dl2Var.o();
                }
                sfVar.f = Integer.valueOf(System.identityHashCode(ja3Var));
                ja3Var.m = (dl2) ja3Var.j.l(ja3Var.h, handler.getLooper(), sfVar, (el2) sfVar.e, ja3Var, ja3Var);
                ja3Var.n = my1Var;
                Set set = ja3Var.k;
                if (set == null || set.isEmpty()) {
                    handler.post(new r7(13, ja3Var));
                } else {
                    dl2 dl2Var2 = ja3Var.m;
                    dl2Var2.getClass();
                    dl2Var2.i(new ar0(i, dl2Var2));
                }
            }
            try {
                ceVar.i(my1Var);
            } catch (SecurityException e2) {
                o(new c10(10), e2);
            }
        } catch (IllegalStateException e3) {
            o(new c10(10), e3);
        }
    }

    public final void n(ga3 ga3Var) {
        ll3.r(this.r.y);
        boolean a = this.h.a();
        LinkedList linkedList = this.g;
        if (a) {
            if (k(ga3Var)) {
                j();
                return;
            } else {
                linkedList.add(ga3Var);
                return;
            }
        }
        linkedList.add(ga3Var);
        c10 c10Var = this.q;
        if (c10Var == null || c10Var.n == 0 || c10Var.o == null) {
            m();
        } else {
            o(c10Var, null);
        }
    }

    public final void o(c10 c10Var, RuntimeException runtimeException) {
        dl2 dl2Var;
        ll3.r(this.r.y);
        ja3 ja3Var = this.n;
        if (ja3Var != null && (dl2Var = ja3Var.m) != null) {
            dl2Var.o();
        }
        ll3.r(this.r.y);
        this.q = null;
        ((SparseIntArray) this.r.s.n).clear();
        a(c10Var);
        if ((this.h instanceof za3) && c10Var.n != 24) {
            wv0 wv0Var = this.r;
            wv0Var.n = true;
            bb3 bb3Var = wv0Var.y;
            bb3Var.sendMessageDelayed(bb3Var.obtainMessage(19), 300000L);
        }
        if (c10Var.n == 4) {
            e(wv0.B);
            return;
        }
        if (this.g.isEmpty()) {
            this.q = c10Var;
            return;
        }
        wv0 wv0Var2 = this.r;
        if (runtimeException != null) {
            ll3.r(wv0Var2.y);
            f(null, runtimeException, false);
            return;
        }
        boolean z = wv0Var2.z;
        oe oeVar = this.i;
        if (!z) {
            e(wv0.b(oeVar, c10Var));
            return;
        }
        f(wv0.b(oeVar, c10Var), null, true);
        if (this.g.isEmpty() || l(c10Var) || this.r.a(c10Var, this.m)) {
            return;
        }
        if (c10Var.n == 18) {
            this.o = true;
        }
        if (!this.o) {
            e(wv0.b(this.i, c10Var));
            return;
        }
        wv0 wv0Var3 = this.r;
        oe oeVar2 = this.i;
        bb3 bb3Var2 = wv0Var3.y;
        bb3Var2.sendMessageDelayed(Message.obtain(bb3Var2, 9, oeVar2), 5000L);
    }

    public final void p(c10 c10Var) {
        ll3.r(this.r.y);
        ce ceVar = this.h;
        ceVar.c("onSignInFailed for " + ceVar.getClass().getName() + " with " + String.valueOf(c10Var));
        o(c10Var, null);
    }

    public final void q() {
        ll3.r(this.r.y);
        Status status = wv0.A;
        e(status);
        this.j.t(false, status);
        for (cf1 cf1Var : (cf1[]) this.l.keySet().toArray(new cf1[0])) {
            n(new sa3(new kt2()));
        }
        a(new c10(4));
        ce ceVar = this.h;
        if (ceVar.a()) {
            ceVar.d(new ot2(11, this));
        }
    }
}

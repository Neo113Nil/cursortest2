package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class coc implements cmt, cmu {
    public final cml b;
    public final cno c;
    public final int f;
    public boolean g;
    public final /* synthetic */ cog k;
    public final fwm l;
    private Set m;
    private final coy n;
    private volatile cpx o;
    public final Queue a = new LinkedList();
    public final Set d = new HashSet();
    public final Map e = new HashMap();
    public final List h = new ArrayList();
    public clg i = null;
    public int j = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public coc(cog cogVar, cms cmsVar) {
        this.k = cogVar;
        Looper looper = cogVar.o.getLooper();
        cpr a = cmsVar.h().a();
        cml y = ((ox) cmsVar.j.a).y(cmsVar.a, looper, a, cmsVar.d, this, this);
        csq csqVar = cmsVar.c;
        if (csqVar != null) {
            ((cpo) y).k = csqVar;
        } else {
            String str = cmsVar.b;
            if (str != null) {
                ((cpo) y).j = str;
            }
        }
        this.b = y;
        this.c = cmsVar.e;
        this.l = new fwm((char[]) null);
        this.f = cmsVar.g;
        if (y.o()) {
            this.n = new coy(cogVar.g, cogVar.o, cmsVar.h().a());
        } else {
            this.n = null;
        }
    }

    private final cli r(cli[] cliVarArr) {
        if (cliVarArr != null && cliVarArr.length != 0) {
            cli[] p = this.b.p();
            if (p == null) {
                p = new cli[0];
            }
            qi qiVar = new qi(p.length);
            for (cli cliVar : p) {
                qiVar.put(cliVar.a, Long.valueOf(cliVar.a()));
            }
            int length = cliVarArr.length;
            for (int i = 0; i < length; i = 1) {
                cli cliVar2 = cliVarArr[0];
                Long l = (Long) qiVar.get(cliVar2.a);
                if (l == null || l.longValue() < cliVar2.a()) {
                    return cliVar2;
                }
            }
        }
        return null;
    }

    private final Status s(clg clgVar) {
        return cog.a(this.c, clgVar);
    }

    private final void t(clg clgVar) {
        Set set = this.d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((gam) it.next()).g(this.c, clgVar, Objects.equals(clgVar, clg.a) ? this.b.h() : null);
        }
        set.clear();
    }

    private final void u(Status status, Exception exc, boolean z) {
        oy.an(this.k.o);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            cnn cnnVar = (cnn) it.next();
            if (!z || cnnVar.c == 2) {
                if (status != null) {
                    cnnVar.f(status);
                } else {
                    cnnVar.g(exc);
                }
                it.remove();
            }
        }
    }

    private final void v(cnn cnnVar) {
        cnnVar.i(this.l, q());
        try {
            cnnVar.h(this);
        } catch (DeadObjectException unused) {
            b(1);
            this.b.l("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean w(cnn cnnVar) {
        y(cnnVar);
        if (!(cnnVar instanceof cng)) {
            v(cnnVar);
            return true;
        }
        cng cngVar = (cng) cnnVar;
        cli r = r(cngVar.d(this));
        if (r == null) {
            v(cnnVar);
            return true;
        }
        String name = this.b.getClass().getName();
        long a = r.a();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        String str = r.a;
        sb.append(str);
        sb.append(", ");
        sb.append(a);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        cog cogVar = this.k;
        if (!cogVar.p || !cngVar.c(this)) {
            cngVar.g(new cnf(r));
            return true;
        }
        int a2 = cngVar.a(this);
        cod codVar = new cod(this.c, r);
        List list = this.h;
        int indexOf = list.indexOf(codVar);
        if (indexOf >= 0) {
            cod codVar2 = (cod) list.get(indexOf);
            Handler handler = cogVar.o;
            handler.removeMessages(15, codVar2);
            handler.sendMessageDelayed(Message.obtain(handler, 15, codVar2), 5000L);
            return false;
        }
        list.add(codVar);
        Handler handler2 = cogVar.o;
        handler2.sendMessageDelayed(Message.obtain(handler2, 15, codVar), 5000L);
        handler2.sendMessageDelayed(Message.obtain(handler2, 16, codVar), 120000L);
        clg clgVar = new clg(1, 2, null, null, Integer.valueOf(a2));
        if (x(clgVar)) {
            Log.w("GoogleApiManager", "A dialog should be displayed for missing feature: " + str + ", version: " + r.a());
            return false;
        }
        if (!cogVar.h(clgVar, this.f)) {
            return false;
        }
        Log.w("GoogleApiManager", "Notification displayed for missing feature: " + str + ", version: " + r.a());
        return false;
    }

    private final boolean x(clg clgVar) {
        synchronized (cog.c) {
            cog cogVar = this.k;
            if (cogVar.l == null || !cogVar.m.contains(this.c)) {
                return false;
            }
            cnz cnzVar = cogVar.l;
            bsh bshVar = new bsh(clgVar, this.f);
            if (a.j(cnzVar.b, bshVar)) {
                cnzVar.c.post(new cns(cnzVar, bshVar, 0));
            }
            return true;
        }
    }

    private final void y(cnn cnnVar) {
        cpx cpxVar;
        cng cngVar;
        int a;
        boolean z;
        int i;
        int i2;
        if (cnnVar.d || cnnVar.e || (cpxVar = this.o) == null || !(cnnVar instanceof cng) || (a = (cngVar = (cng) cnnVar).a(this)) == 0) {
            return;
        }
        cog cogVar = this.k;
        SparseArray sparseArray = cpxVar.a;
        cbp i3 = cogVar.i();
        cxe cxeVar = (cxe) sparseArray.get(a, (cxe) sparseArray.get(0));
        int i4 = 2;
        if (cxeVar == null) {
            i = Integer.MIN_VALUE;
            i2 = Integer.MIN_VALUE;
            z = true;
        } else {
            Object obj = i3.a;
            long j = a;
            int maxInflight = cxeVar.getMaxInflight();
            if (maxInflight <= 0) {
                z = true;
            } else {
                LongSparseArray longSparseArray = ((cxd) obj).b;
                synchronized (longSparseArray) {
                    long[] jArr = (long[]) longSparseArray.get(j);
                    if (jArr != null) {
                        long j2 = jArr[0];
                        z = true;
                        long j3 = ((cxd) obj).a + 1;
                        ((cxd) obj).a = j3;
                        jArr[1] = j3;
                        if (j2 < maxInflight) {
                            jArr[0] = j2 + 1;
                        }
                    } else {
                        z = true;
                        if (longSparseArray.size() >= 2000) {
                            int size = longSparseArray.size();
                            long j4 = Long.MAX_VALUE;
                            int i5 = 0;
                            for (int i6 = 0; i6 < size; i6++) {
                                long j5 = ((long[]) longSparseArray.valueAt(i6))[1];
                                if (j5 < j4) {
                                    j4 = j5;
                                }
                                if (j5 < j4) {
                                    i5 = i6;
                                }
                            }
                            longSparseArray.removeAt(i5);
                        }
                        long j6 = ((cxd) obj).a + 1;
                        ((cxd) obj).a = j6;
                        longSparseArray.put(j, new long[]{1, j6});
                    }
                    i = Integer.MIN_VALUE;
                }
                i2 = Integer.MIN_VALUE;
            }
            i = cxeVar.getMaxInflight();
            i2 = Integer.MIN_VALUE;
        }
        if (i != i2) {
            cog cogVar2 = this.k;
            cpc cpcVar = new cpc(a, cogVar2.g.getPackageName(), i);
            Handler handler = cogVar2.o;
            handler.sendMessage(handler.obtainMessage(21, cpcVar));
            cnnVar.e = true;
            return;
        }
        cnnVar.d = z;
        if (this.m == null) {
            this.m = new HashSet();
        }
        this.m.add(cngVar);
        cog cogVar3 = this.k;
        Handler handler2 = cogVar3.o;
        handler2.getClass();
        cngVar.b(new cob(handler2, i4), new cof(this, cogVar3.i(), cngVar, a));
    }

    @Override // defpackage.cnx
    public final void a(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.k.o;
        if (myLooper == handler.getLooper()) {
            h(bundle);
        } else {
            handler.post(new avl((Object) this, (Object) bundle, 9, (byte[]) null));
        }
    }

    @Override // defpackage.cnx
    public final void b(int i) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.k.o;
        if (myLooper == handler.getLooper()) {
            k(i);
        } else {
            handler.post(new vz(this, i, 2, null));
        }
    }

    public final void c() {
        oy.an(this.k.o);
        this.i = null;
    }

    public final void d() {
        int l;
        cog cogVar = this.k;
        oy.an(cogVar.o);
        cml cmlVar = this.b;
        if (cmlVar.m() || cmlVar.n()) {
            return;
        }
        try {
            fwm fwmVar = cogVar.q;
            Context context = cogVar.g;
            oy.at(context);
            oy.at(cmlVar);
            cmlVar.q();
            int a = cmlVar.a();
            int R = fwmVar.R(a);
            if (R == -1) {
                Object obj = fwmVar.a;
                synchronized (obj) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= ((SparseIntArray) obj).size()) {
                            i = -1;
                            break;
                        }
                        int keyAt = ((SparseIntArray) obj).keyAt(i2);
                        if (keyAt > a && ((SparseIntArray) obj).get(keyAt) == 0) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    l = i == -1 ? ((clm) fwmVar.b).l(context, a) : i;
                    ((SparseIntArray) obj).put(a, l);
                }
                R = l;
            }
            if (R != 0) {
                clg clgVar = new clg(1, R, null, null, null);
                Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + clgVar.toString());
                j(clgVar, null);
                return;
            }
            cog cogVar2 = this.k;
            cml cmlVar2 = this.b;
            coe coeVar = new coe(cogVar2, cmlVar2, this.c);
            if (cmlVar2.o()) {
                coy coyVar = this.n;
                oy.at(coyVar);
                dcu dcuVar = coyVar.e;
                if (dcuVar != null) {
                    dcuVar.y();
                }
                cpr cprVar = coyVar.d;
                cprVar.g = Integer.valueOf(System.identityHashCode(coyVar));
                ox oxVar = coyVar.g;
                Context context2 = coyVar.a;
                Handler handler = coyVar.b;
                coyVar.e = (dcu) oxVar.y(context2, handler.getLooper(), cprVar, cprVar.f, coyVar, coyVar);
                coyVar.f = coeVar;
                Set set = coyVar.c;
                if (set == null || set.isEmpty()) {
                    handler.post(new ath(coyVar, 7, null));
                } else {
                    dcu dcuVar2 = coyVar.e;
                    dcuVar2.k(new cpl(dcuVar2));
                }
            }
            try {
                cmlVar2.k(coeVar);
            } catch (SecurityException e) {
                j(new clg(1, 10, null, null, null), e);
            }
        } catch (IllegalStateException e2) {
            j(new clg(1, 10, null, null, null), e2);
        }
    }

    public final void e(cnn cnnVar) {
        oy.an(this.k.o);
        y(cnnVar);
        if (this.b.m()) {
            if (w(cnnVar)) {
                n();
                return;
            } else {
                this.a.add(cnnVar);
                return;
            }
        }
        this.a.add(cnnVar);
        clg clgVar = this.i;
        if (clgVar == null || !clgVar.b()) {
            d();
        } else {
            j(clgVar, null);
        }
    }

    public final void f(Status status) {
        oy.an(this.k.o);
        u(status, null, false);
    }

    public final void g() {
        Queue queue = this.a;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cnn cnnVar = (cnn) arrayList.get(i);
            if (!this.b.m()) {
                return;
            }
            if (w(cnnVar)) {
                queue.remove(cnnVar);
            }
        }
    }

    public final void h(Bundle bundle) {
        c();
        t(clg.a);
        p();
        if (bundle == null || !bundle.containsKey("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG")) {
            this.o = null;
        } else {
            byte[] byteArray = bundle.getByteArray("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG");
            this.o = byteArray != null ? (cpx) oy.o(byteArray, cpx.CREATOR) : null;
        }
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            Object obj = ((bvw) it.next()).c;
            if (r(((cou) obj).a) != null) {
                it.remove();
            } else {
                try {
                    ((cou) obj).b(this.b, new bst());
                } catch (DeadObjectException unused) {
                    b(3);
                    this.b.l("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        g();
        n();
    }

    @Override // defpackage.cot
    public final void i(clg clgVar) {
        j(clgVar, null);
    }

    public final void j(clg clgVar, Exception exc) {
        dcu dcuVar;
        cog cogVar = this.k;
        Handler handler = cogVar.o;
        oy.an(handler);
        coy coyVar = this.n;
        if (coyVar != null && (dcuVar = coyVar.e) != null) {
            dcuVar.y();
        }
        c();
        cogVar.q.Q();
        t(clgVar);
        if ((this.b instanceof crw) && clgVar.c != 24) {
            cogVar.f = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        int i = clgVar.c;
        if (i == 4) {
            f(cog.b);
            return;
        }
        if (i == 25) {
            f(s(clgVar));
            return;
        }
        Queue queue = this.a;
        if (queue.isEmpty()) {
            this.i = clgVar;
            return;
        }
        if (exc != null) {
            oy.an(handler);
            u(null, exc, false);
            return;
        }
        if (!cogVar.p) {
            f(s(clgVar));
            return;
        }
        u(s(clgVar), null, true);
        if (queue.isEmpty() || x(clgVar) || cogVar.h(clgVar, this.f)) {
            return;
        }
        if (i == 18) {
            this.g = true;
        }
        if (this.g) {
            handler.sendMessageDelayed(Message.obtain(handler, 9, this.c), 5000L);
        } else {
            f(s(clgVar));
        }
    }

    public final void k(int i) {
        c();
        this.g = true;
        cml cmlVar = this.b;
        String i2 = cmlVar.i();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (i2 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(i2);
        }
        this.l.U(true, new Status(20, sb.toString(), null, null));
        Status status = new Status(20, "Connection suspended: ".concat(String.valueOf(cmlVar.i())), null, null);
        Set set = this.m;
        if (set != null) {
            ArrayList arrayList = new ArrayList(set);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                cng cngVar = (cng) arrayList.get(i3);
                cngVar.g(new cmm(status));
                this.a.remove(cngVar);
            }
        }
        cog cogVar = this.k;
        cno cnoVar = this.c;
        Handler handler = cogVar.o;
        handler.sendMessageDelayed(Message.obtain(handler, 9, cnoVar), 5000L);
        handler.sendMessageDelayed(Message.obtain(handler, 11, cnoVar), 120000L);
        cogVar.q.Q();
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            Object obj = ((bvw) it.next()).b;
        }
    }

    public final void l(clg clgVar) {
        oy.an(this.k.o);
        cml cmlVar = this.b;
        cmlVar.l("onSignInFailed for " + cmlVar.getClass().getName() + " with " + String.valueOf(clgVar));
        j(clgVar, null);
    }

    final void m(cng cngVar) {
        oy.an(this.k.o);
        Set set = this.m;
        if (set != null) {
            set.remove(cngVar);
            if (this.m.isEmpty()) {
                this.m = null;
            }
        }
    }

    public final void n() {
        cog cogVar = this.k;
        Handler handler = cogVar.o;
        cno cnoVar = this.c;
        handler.removeMessages(12, cnoVar);
        handler.sendMessageDelayed(handler.obtainMessage(12, cnoVar), cogVar.e);
    }

    public final void o() {
        oy.an(this.k.o);
        Status status = cog.a;
        f(status);
        this.l.U(false, status);
        for (cop copVar : (cop[]) this.e.keySet().toArray(new cop[0])) {
            e(new cnm(copVar, new bst()));
        }
        t(new clg(1, 4, null, null, null));
        cml cmlVar = this.b;
        if (cmlVar.m()) {
            cmlVar.s(new kee(this));
        }
    }

    public final void p() {
        if (this.g) {
            cog cogVar = this.k;
            cno cnoVar = this.c;
            Handler handler = cogVar.o;
            handler.removeMessages(11, cnoVar);
            handler.removeMessages(9, cnoVar);
            this.g = false;
        }
    }

    public final boolean q() {
        return this.b.o();
    }
}

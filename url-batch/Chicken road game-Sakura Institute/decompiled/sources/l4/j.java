package l4;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import l1.x;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j implements k4.c, k4.d {

    /* renamed from: d, reason: collision with root package name */
    public final k4.a f5975d;

    /* renamed from: e, reason: collision with root package name */
    public final a f5976e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.room.c f5977f;

    /* renamed from: i, reason: collision with root package name */
    public final int f5980i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5981j;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f5984m;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f5974c = new LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f5978g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f5979h = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f5982k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public j4.b f5983l = null;

    public j(d dVar, o4.c cVar) {
        this.f5984m = dVar;
        Looper looper = dVar.f5971m.getLooper();
        Context context = cVar.f6833a;
        b1.b bVar = new b1.b(12, false);
        Set set = Collections.EMPTY_SET;
        if (((i.f) bVar.f1230g) == null) {
            bVar.f1230g = new i.f(0);
        }
        ((i.f) bVar.f1230g).addAll(set);
        bVar.f1232i = context.getClass().getName();
        bVar.f1231h = context.getPackageName();
        b1.b bVar2 = new b1.b((i.f) bVar.f1230g, (String) bVar.f1231h, (String) bVar.f1232i);
        o4.b bVar3 = (o4.b) cVar.f6835c.f1069g;
        m4.o.d(bVar3);
        Context context2 = cVar.f6833a;
        m4.i iVar = cVar.f6836d;
        bVar3.getClass();
        o4.d dVar2 = new o4.d(context2, looper, bVar2, iVar, this, this);
        String str = cVar.f6834b;
        if (str != null) {
            dVar2.f1796r = str;
        }
        this.f5975d = dVar2;
        this.f5976e = cVar.f6837e;
        this.f5977f = new androidx.room.c(16);
        this.f5980i = cVar.f6838f;
    }

    @Override // k4.c
    public final void a(int i7) {
        Looper myLooper = Looper.myLooper();
        u4.e eVar = this.f5984m.f5971m;
        if (myLooper == eVar.getLooper()) {
            i(i7);
        } else {
            eVar.post(new l3.i(this, i7));
        }
    }

    @Override // k4.d
    public final void b(j4.b bVar) {
        o(bVar, null);
    }

    public final void c(j4.b bVar) {
        HashSet hashSet = this.f5978g;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (m4.o.f(bVar, j4.b.f5001j)) {
                this.f5975d.i();
            }
            throw null;
        }
    }

    @Override // k4.c
    public final void d() {
        Looper myLooper = Looper.myLooper();
        u4.e eVar = this.f5984m.f5971m;
        if (myLooper == eVar.getLooper()) {
            h();
        } else {
            eVar.post(new androidx.room.o(2, this));
        }
    }

    public final void e(Status status) {
        m4.o.a(this.f5984m.f5971m);
        f(status, null, false);
    }

    public final void f(Status status, Exception exc, boolean z8) {
        m4.o.a(this.f5984m.f5971m);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f5974c.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (!z8 || oVar.f5995a == 2) {
                if (status != null) {
                    oVar.c(status);
                } else {
                    oVar.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.f5974c;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            o oVar = (o) arrayList.get(i7);
            if (!this.f5975d.a()) {
                return;
            }
            if (k(oVar)) {
                linkedList.remove(oVar);
            }
        }
    }

    public final void h() {
        d dVar = this.f5984m;
        m4.o.a(dVar.f5971m);
        this.f5983l = null;
        c(j4.b.f5001j);
        u4.e eVar = dVar.f5971m;
        if (this.f5981j) {
            a aVar = this.f5976e;
            eVar.removeMessages(11, aVar);
            eVar.removeMessages(9, aVar);
            this.f5981j = false;
        }
        Iterator it = this.f5979h.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        g();
        j();
    }

    public final void i(int i7) {
        d dVar = this.f5984m;
        u4.e eVar = dVar.f5971m;
        m4.o.a(dVar.f5971m);
        this.f5983l = null;
        this.f5981j = true;
        String k8 = this.f5975d.k();
        androidx.room.c cVar = this.f5977f;
        cVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i7 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i7 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (k8 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(k8);
        }
        cVar.A(true, new Status(20, sb.toString(), null, null));
        a aVar = this.f5976e;
        eVar.sendMessageDelayed(Message.obtain(eVar, 9, aVar), 5000L);
        eVar.sendMessageDelayed(Message.obtain(eVar, 11, aVar), 120000L);
        ((SparseIntArray) dVar.f5965g.f1069g).clear();
        Iterator it = this.f5979h.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void j() {
        d dVar = this.f5984m;
        u4.e eVar = dVar.f5971m;
        a aVar = this.f5976e;
        eVar.removeMessages(12, aVar);
        eVar.sendMessageDelayed(eVar.obtainMessage(12, aVar), dVar.f5959a);
    }

    public final boolean k(o oVar) {
        j4.d dVar;
        if (oVar == null) {
            androidx.room.c cVar = this.f5977f;
            k4.a aVar = this.f5975d;
            oVar.f(cVar, aVar.m());
            try {
                oVar.e(this);
                return true;
            } catch (DeadObjectException unused) {
                a(1);
                aVar.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        j4.d[] b9 = oVar.b(this);
        if (b9 != null && b9.length != 0) {
            j4.d[] g9 = this.f5975d.g();
            if (g9 == null) {
                g9 = new j4.d[0];
            }
            i.e eVar = new i.e(g9.length);
            for (j4.d dVar2 : g9) {
                eVar.put(dVar2.f5009f, Long.valueOf(dVar2.a()));
            }
            int length = b9.length;
            for (int i7 = 0; i7 < length; i7++) {
                dVar = b9[i7];
                Long l8 = (Long) eVar.get(dVar.f5009f);
                if (l8 == null || l8.longValue() < dVar.a()) {
                    break;
                }
            }
        }
        dVar = null;
        if (dVar == null) {
            androidx.room.c cVar2 = this.f5977f;
            k4.a aVar2 = this.f5975d;
            oVar.f(cVar2, aVar2.m());
            try {
                oVar.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                a(1);
                aVar2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.f5975d.getClass().getName() + " could not execute call because it requires feature (" + dVar.f5009f + ", " + dVar.a() + ").");
        if (!this.f5984m.f5972n || !oVar.a(this)) {
            oVar.d(new k4.g(dVar));
            return true;
        }
        k kVar = new k(this.f5976e, dVar);
        int indexOf = this.f5982k.indexOf(kVar);
        if (indexOf >= 0) {
            k kVar2 = (k) this.f5982k.get(indexOf);
            this.f5984m.f5971m.removeMessages(15, kVar2);
            u4.e eVar2 = this.f5984m.f5971m;
            eVar2.sendMessageDelayed(Message.obtain(eVar2, 15, kVar2), 5000L);
        } else {
            this.f5982k.add(kVar);
            u4.e eVar3 = this.f5984m.f5971m;
            eVar3.sendMessageDelayed(Message.obtain(eVar3, 15, kVar), 5000L);
            u4.e eVar4 = this.f5984m.f5971m;
            eVar4.sendMessageDelayed(Message.obtain(eVar4, 16, kVar), 120000L);
            j4.b bVar = new j4.b(2, null);
            if (!l(bVar)) {
                this.f5984m.a(bVar, this.f5980i);
            }
        }
        return false;
    }

    public final boolean l(j4.b bVar) {
        synchronized (d.f5957q) {
        }
        return false;
    }

    public final void m() {
        d dVar = this.f5984m;
        m4.o.a(dVar.f5971m);
        k4.a aVar = this.f5975d;
        if (aVar.a() || aVar.f()) {
            return;
        }
        try {
            androidx.room.c cVar = dVar.f5965g;
            Context context = dVar.f5963e;
            SparseIntArray sparseIntArray = (SparseIntArray) cVar.f1069g;
            m4.o.d(context);
            int e9 = aVar.e();
            int i7 = ((SparseIntArray) cVar.f1069g).get(e9, -1);
            if (i7 == -1) {
                i7 = 0;
                int i8 = 0;
                while (true) {
                    if (i8 >= sparseIntArray.size()) {
                        i7 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i8);
                    if (keyAt > e9 && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i7 == -1) {
                    i7 = ((j4.e) cVar.f1070h).b(context, e9);
                }
                sparseIntArray.put(e9, i7);
            }
            if (i7 == 0) {
                l lVar = new l(dVar, aVar, this.f5976e);
                if (aVar.m()) {
                    m4.o.d(null);
                    throw null;
                }
                try {
                    aVar.j(lVar);
                    return;
                } catch (SecurityException e10) {
                    o(new j4.b(10), e10);
                    return;
                }
            }
            j4.b bVar = new j4.b(i7, null);
            Log.w("GoogleApiManager", "The service for " + aVar.getClass().getName() + " is not available: " + bVar.toString());
            o(bVar, null);
        } catch (IllegalStateException e11) {
            o(new j4.b(10), e11);
        }
    }

    public final void n(o oVar) {
        m4.o.a(this.f5984m.f5971m);
        boolean a3 = this.f5975d.a();
        LinkedList linkedList = this.f5974c;
        if (a3) {
            if (k(oVar)) {
                j();
                return;
            } else {
                linkedList.add(oVar);
                return;
            }
        }
        linkedList.add(oVar);
        j4.b bVar = this.f5983l;
        if (bVar == null || bVar.f5003g == 0 || bVar.f5004h == null) {
            m();
        } else {
            o(bVar, null);
        }
    }

    public final void o(j4.b bVar, RuntimeException runtimeException) {
        m4.o.a(this.f5984m.f5971m);
        m4.o.a(this.f5984m.f5971m);
        this.f5983l = null;
        ((SparseIntArray) this.f5984m.f5965g.f1069g).clear();
        c(bVar);
        if ((this.f5975d instanceof o4.d) && bVar.f5003g != 24) {
            d dVar = this.f5984m;
            dVar.f5960b = true;
            u4.e eVar = dVar.f5971m;
            eVar.sendMessageDelayed(eVar.obtainMessage(19), 300000L);
        }
        if (bVar.f5003g == 4) {
            e(d.f5956p);
            return;
        }
        if (this.f5974c.isEmpty()) {
            this.f5983l = bVar;
            return;
        }
        if (runtimeException != null) {
            m4.o.a(this.f5984m.f5971m);
            f(null, runtimeException, false);
            return;
        }
        if (!this.f5984m.f5972n) {
            e(d.b(this.f5976e, bVar));
            return;
        }
        f(d.b(this.f5976e, bVar), null, true);
        if (this.f5974c.isEmpty() || l(bVar) || this.f5984m.a(bVar, this.f5980i)) {
            return;
        }
        if (bVar.f5003g == 18) {
            this.f5981j = true;
        }
        if (!this.f5981j) {
            e(d.b(this.f5976e, bVar));
        } else {
            u4.e eVar2 = this.f5984m.f5971m;
            eVar2.sendMessageDelayed(Message.obtain(eVar2, 9, this.f5976e), 5000L);
        }
    }

    public final void p() {
        m4.o.a(this.f5984m.f5971m);
        Status status = d.f5955o;
        e(status);
        this.f5977f.A(false, status);
        for (g gVar : (g[]) this.f5979h.keySet().toArray(new g[0])) {
            n(new t(new z4.c()));
        }
        c(new j4.b(4));
        k4.a aVar = this.f5975d;
        if (aVar.a()) {
            aVar.c(new x(2, this));
        }
    }
}

package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class Bm {

    /* renamed from: a, reason: collision with root package name */
    public final Cm f781a;
    public volatile NetworkTask b;

    public Bm(Cm cm) {
        this.f781a = cm;
    }

    public final Context b() {
        return this.f781a.f803a;
    }

    public final synchronized NetworkTask c() {
        NetworkTask networkTask;
        try {
            try {
                if (g()) {
                    networkTask = this.b;
                    if (networkTask != null && !networkTask.isRemoved()) {
                    }
                    C0106cm d = d();
                    Wd wd = Wd.f1105a;
                    Yl yl = new Yl(new C0227he(), C0401oa.I.p());
                    FinalConfigProvider finalConfigProvider = new FinalConfigProvider(d);
                    try {
                        NetworkTask networkTask2 = new NetworkTask(new SynchronizedBlockingExecutor(), new C0446q5(this.f781a.f803a), new AllHostsExponentialBackoffPolicy(Wd.f1105a.a(Ud.STARTUP)), new C0687zm(this, new Sl(), new FullUrlFormer(yl, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), CollectionsKt.emptyList(), Wd.c);
                        this.b = networkTask2;
                        networkTask = networkTask2;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } else {
                    networkTask = null;
                }
                return networkTask;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final C0106cm d() {
        return (C0106cm) this.f781a.l.a();
    }

    public final C0209gm e() {
        C0209gm c0209gm;
        Jl jl = this.f781a.l;
        synchronized (jl) {
            c0209gm = jl.c.f949a;
        }
        return c0209gm;
    }

    public final void f() {
        C0209gm c0209gm;
        Jl jl = this.f781a.l;
        synchronized (jl) {
            c0209gm = jl.c.f949a;
        }
        C0312km c0312km = c0209gm.c;
        C0286jm a2 = c0312km.a(c0312km.m);
        String str = c0209gm.f1277a;
        String str2 = c0209gm.b;
        qo qoVar = this.f781a.n;
        String str3 = c0209gm.d;
        qoVar.getClass();
        if (!qo.a(str3)) {
            a2.f1327a = this.f781a.m.a().id;
        }
        String str4 = c0209gm.f1277a;
        if (str4 == null || str4.length() == 0) {
            str = this.f781a.h.a();
            str2 = "";
        }
        List<String> list = this.f781a.c.e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        a2.g = list;
        C0209gm c0209gm2 = new C0209gm(str, str2, new C0312km(a2));
        b(c0209gm2);
        a(c0209gm2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[Catch: all -> 0x006b, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0010, B:11:0x001b, B:16:0x0033, B:18:0x003b, B:20:0x0043, B:23:0x004c), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean g() {
        boolean z;
        boolean z2 = false;
        if (C0401oa.I.h().isRestrictedForSdk()) {
            return false;
        }
        C0209gm e = e();
        Set set = AbstractC0132dm.f1223a;
        boolean z3 = true;
        if (!e.w) {
            if (AbstractC0132dm.b.currentTimeSeconds() <= e.o + e.z.f816a) {
                z = false;
                if (!z) {
                    if (AbstractC0132dm.a(e.d) && AbstractC0132dm.a(e.f1277a) && AbstractC0132dm.a(e.b)) {
                        z2 = true;
                    }
                    z = !z2;
                    D3 d3 = this.f781a.k;
                    Map map = d().h;
                    A3 a3 = this.f781a.j;
                    d3.getClass();
                    boolean a2 = D3.a(map, e, a3);
                    if (z2) {
                    }
                }
                z3 = z;
                return z3;
            }
        }
        z = true;
        if (!z) {
        }
        z3 = z;
        return z3;
    }

    public final synchronized void h() {
        this.b = null;
    }

    public final R4 a() {
        return this.f781a.f;
    }

    public final synchronized void b(C0209gm c0209gm) {
        this.f781a.l.a(c0209gm);
        C0183fm c0183fm = this.f781a.g;
        c0183fm.b.a(c0209gm.f1277a);
        c0183fm.b.b(c0209gm.b);
        c0183fm.f1262a.save(c0209gm.c);
        this.f781a.e.a(c0209gm);
    }

    public final synchronized boolean a(List<String> list, Map<String, String> map) {
        return !AbstractC0132dm.a(e(), list, map, new Am(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0209gm a(C0157em c0157em, C0106cm c0106cm, long j) {
        String str;
        boolean equals;
        String a2 = Gm.a(c0106cm.h);
        Map map = c0106cm.i.f1477a;
        String str2 = c0157em.j;
        String str3 = e().k;
        if (!Gm.a(Gm.a(str2))) {
            str2 = Gm.a(Gm.a(str3)) ? str3 : null;
        }
        String str4 = e().f1277a;
        if (str4 != null) {
            str = StringsKt.isBlank(str4) ? null : str4;
        }
        str = c0157em.h;
        C0286jm c0286jm = new C0286jm(c0157em.b);
        String str5 = c0157em.i;
        c0286jm.o = this.f781a.i.currentTimeSeconds();
        c0286jm.f1327a = e().d;
        c0286jm.c = c0157em.d;
        c0286jm.f = c0157em.c;
        c0286jm.g = c0106cm.e;
        c0286jm.b = c0157em.e;
        c0286jm.d = c0157em.f;
        c0286jm.e = c0157em.g;
        c0286jm.h = c0157em.n;
        c0286jm.i = c0157em.o;
        c0286jm.j = str2;
        c0286jm.k = a2;
        this.f781a.k.getClass();
        HashMap a3 = Gm.a(str2);
        if (mo.a(map)) {
            equals = mo.a((Map) a3);
        } else {
            equals = a3.equals(map);
        }
        c0286jm.q = equals;
        c0286jm.l = Gm.a(map);
        c0286jm.r = c0157em.m;
        c0286jm.n = c0157em.k;
        c0286jm.s = c0157em.p;
        c0286jm.p = true;
        c0286jm.t = j;
        C0106cm d = d();
        if (d.n == 0) {
            d.n = j;
        }
        c0286jm.u = d.n;
        c0286jm.v = false;
        c0286jm.w = c0157em.q;
        c0286jm.x = c0157em.r;
        c0286jm.y = c0157em.s;
        c0286jm.z = c0157em.t;
        c0286jm.A = c0157em.u;
        c0286jm.B = c0157em.v;
        return new C0209gm(str, str5, new C0312km(c0286jm));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0035, B:12:0x003c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0157em c0157em, C0106cm c0106cm, Map<String, ? extends List<String>> map) {
        Long l;
        C0209gm a2;
        synchronized (this) {
            if (!mo.a((Map) map)) {
                List list = (List) CollectionUtils.getFromMapIgnoreCase(map, "Date");
                if (!mo.a((Collection) list)) {
                    try {
                        l = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                    } catch (Throwable unused) {
                    }
                    long longValue = l == null ? l.longValue() : 0L;
                    Xj.f1118a.a(longValue, c0157em.l);
                    a2 = a(c0157em, c0106cm, longValue);
                    h();
                    b(a2);
                    Unit unit = Unit.INSTANCE;
                }
            }
            l = null;
            if (l == null) {
            }
            Xj.f1118a.a(longValue, c0157em.l);
            a2 = a(c0157em, c0106cm, longValue);
            h();
            b(a2);
            Unit unit2 = Unit.INSTANCE;
        }
        a(a2);
    }

    public final void a(C0209gm c0209gm) {
        ArrayList arrayList;
        Cm cm = this.f781a;
        Gl gl = cm.d;
        String str = cm.b;
        synchronized (gl.f862a.b) {
            Il il = gl.f862a;
            il.c = c0209gm;
            Collection collection = (Collection) il.f895a.f1451a.get(str);
            if (collection == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(collection);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Rl) it.next()).a(c0209gm);
        }
    }

    public final void a(Kl kl) {
        synchronized (this) {
            this.b = null;
        }
        Cm cm = this.f781a;
        cm.d.a(cm.f.f1025a, kl, e());
    }

    public final synchronized void a(C0054am c0054am) {
        this.f781a.l.a(c0054am);
        C0106cm d = d();
        if (d.k) {
            List list = d.j;
            if (list != null && !list.isEmpty()) {
                if (!mo.a(list, d.e)) {
                    C0209gm e = e();
                    C0312km c0312km = e.c;
                    C0286jm a2 = c0312km.a(c0312km.m);
                    String str = e.f1277a;
                    String str2 = e.b;
                    a2.g = list;
                    C0209gm c0209gm = new C0209gm(str, str2, new C0312km(a2));
                    b(c0209gm);
                    a(c0209gm);
                }
            }
            if (d.e != null && (!r5.isEmpty())) {
                C0209gm e2 = e();
                C0312km c0312km2 = e2.c;
                C0286jm a3 = c0312km2.a(c0312km2.m);
                String str3 = e2.f1277a;
                String str4 = e2.b;
                a3.g = null;
                C0209gm c0209gm2 = new C0209gm(str3, str4, new C0312km(a3));
                b(c0209gm2);
                a(c0209gm2);
            }
        }
    }
}

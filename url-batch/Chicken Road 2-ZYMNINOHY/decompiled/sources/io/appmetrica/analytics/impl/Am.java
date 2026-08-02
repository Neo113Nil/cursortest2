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
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final class Am {

    /* renamed from: a, reason: collision with root package name */
    public final Bm f10061a;

    /* renamed from: b, reason: collision with root package name */
    public volatile NetworkTask f10062b;

    public Am(Bm bm) {
        this.f10061a = bm;
    }

    public final Context b() {
        return this.f10061a.f10123a;
    }

    public final synchronized NetworkTask c() {
        NetworkTask networkTask;
        try {
            try {
                if (g()) {
                    networkTask = this.f10062b;
                    if (networkTask != null && !networkTask.isRemoved()) {
                    }
                    C0519bm d4 = d();
                    Vd vd = Vd.f11116a;
                    Xl xl = new Xl(new C0640ge(), C0817na.f12417I.p());
                    FinalConfigProvider finalConfigProvider = new FinalConfigProvider(d4);
                    try {
                        NetworkTask networkTask2 = new NetworkTask(new SynchronizedBlockingExecutor(), new C0864p5(this.f10061a.f10123a), new AllHostsExponentialBackoffPolicy(Vd.f11116a.a(Td.STARTUP)), new C1114ym(this, new Rl(), new FullUrlFormer(xl, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), d3.q.f8333a, Vd.f11118c);
                        this.f10062b = networkTask2;
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

    public final C0519bm d() {
        return (C0519bm) this.f10061a.f10134l.a();
    }

    public final C0622fm e() {
        C0622fm c0622fm;
        Il il = this.f10061a.f10134l;
        synchronized (il) {
            c0622fm = il.f12499c.f10564a;
        }
        return c0622fm;
    }

    public final void f() {
        C0622fm c0622fm;
        Il il = this.f10061a.f10134l;
        synchronized (il) {
            c0622fm = il.f12499c.f10564a;
        }
        C0725jm c0725jm = c0622fm.f11862c;
        C0699im a3 = c0725jm.a(c0725jm.f12168m);
        String str = c0622fm.f11860a;
        String str2 = c0622fm.f11861b;
        C0883po c0883po = this.f10061a.n;
        String str3 = c0622fm.f11863d;
        c0883po.getClass();
        if (!C0883po.a(str3)) {
            a3.f12056a = this.f10061a.f10135m.a().id;
        }
        String str4 = c0622fm.f11860a;
        if (str4 == null || str4.length() == 0) {
            str = this.f10061a.f10130h.a();
            str2 = "";
        }
        List<String> list = this.f10061a.f10125c.f11401e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        a3.f12062g = list;
        C0622fm c0622fm2 = new C0622fm(str, str2, new C0725jm(a3));
        b(c0622fm2);
        a(c0622fm2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r0 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0001, B:9:0x0010, B:11:0x001b, B:16:0x0035, B:18:0x003d, B:20:0x0045, B:23:0x004e), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean g() {
        boolean z;
        try {
            boolean z4 = false;
            if (C0817na.f12417I.h().isRestrictedForSdk()) {
                return false;
            }
            C0622fm e4 = e();
            Set set = AbstractC0545cm.f11632a;
            boolean z5 = true;
            if (!e4.f11879w) {
                if (AbstractC0545cm.f11633b.currentTimeSeconds() <= e4.o + e4.z.f10172a) {
                    z = false;
                    if (!z) {
                        if (AbstractC0545cm.a(e4.f11863d) && AbstractC0545cm.a(e4.f11860a) && AbstractC0545cm.a(e4.f11861b)) {
                            z4 = true;
                        }
                        z = !z4;
                        C3 c32 = this.f10061a.f10133k;
                        Map map = d().f11558h;
                        C1121z3 c1121z3 = this.f10061a.f10132j;
                        c32.getClass();
                        boolean a3 = C3.a(map, e4, c1121z3);
                        if (z4) {
                        }
                    }
                    z5 = z;
                    return z5;
                }
            }
            z = true;
            if (!z) {
            }
            z5 = z;
            return z5;
        } finally {
        }
    }

    public final synchronized void h() {
        this.f10062b = null;
    }

    public final Q4 a() {
        return this.f10061a.f10128f;
    }

    public final synchronized void b(C0622fm c0622fm) {
        this.f10061a.f10134l.a(c0622fm);
        C0596em c0596em = this.f10061a.f10129g;
        c0596em.f11812b.a(c0622fm.f11860a);
        c0596em.f11812b.b(c0622fm.f11861b);
        c0596em.f11811a.save(c0622fm.f11862c);
        this.f10061a.f10127e.a(c0622fm);
    }

    public final synchronized boolean a(List<String> list, Map<String, String> map) {
        return !AbstractC0545cm.a(e(), list, map, new C1140zm(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0622fm a(C0571dm c0571dm, C0519bm c0519bm, long j4) {
        String str;
        boolean equals;
        String a3 = Fm.a(c0519bm.f11558h);
        Map map = c0519bm.f11559i.f12644a;
        String str2 = c0571dm.f11696j;
        String str3 = e().f11870k;
        if (!Fm.a(Fm.a(str2))) {
            str2 = Fm.a(Fm.a(str3)) ? str3 : null;
        }
        String str4 = e().f11860a;
        if (str4 != null) {
            str = AbstractC1510g.j0(str4) ? null : str4;
        }
        str = c0571dm.f11694h;
        C0699im c0699im = new C0699im(c0571dm.f11688b);
        String str5 = c0571dm.f11695i;
        c0699im.o = this.f10061a.f10131i.currentTimeSeconds();
        c0699im.f12056a = e().f11863d;
        c0699im.f12058c = c0571dm.f11690d;
        c0699im.f12061f = c0571dm.f11689c;
        c0699im.f12062g = c0519bm.f11555e;
        c0699im.f12057b = c0571dm.f11691e;
        c0699im.f12059d = c0571dm.f11692f;
        c0699im.f12060e = c0571dm.f11693g;
        c0699im.f12063h = c0571dm.n;
        c0699im.f12064i = c0571dm.o;
        c0699im.f12065j = str2;
        c0699im.f12066k = a3;
        this.f10061a.f10133k.getClass();
        HashMap a4 = Fm.a(str2);
        if (AbstractC0779lo.a(map)) {
            equals = AbstractC0779lo.a((Map) a4);
        } else {
            equals = a4.equals(map);
        }
        c0699im.f12070q = equals;
        c0699im.f12067l = Fm.a(map);
        c0699im.f12071r = c0571dm.f11699m;
        c0699im.n = c0571dm.f11697k;
        c0699im.f12072s = c0571dm.f11700p;
        c0699im.f12069p = true;
        c0699im.f12073t = j4;
        C0519bm d4 = d();
        if (d4.n == 0) {
            d4.n = j4;
        }
        c0699im.f12074u = d4.n;
        c0699im.v = false;
        c0699im.f12075w = c0571dm.f11701q;
        c0699im.f12076x = c0571dm.f11702r;
        c0699im.f12077y = c0571dm.f11703s;
        c0699im.z = c0571dm.f11704t;
        c0699im.f12054A = c0571dm.f11705u;
        c0699im.f12055B = c0571dm.v;
        return new C0622fm(str, str5, new C0725jm(c0699im));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0037, B:12:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0571dm c0571dm, C0519bm c0519bm, Map<String, ? extends List<String>> map) {
        Long l4;
        C0622fm a3;
        synchronized (this) {
            if (!AbstractC0779lo.a((Map) map)) {
                List list = (List) CollectionUtils.getFromMapIgnoreCase(map, "Date");
                if (!AbstractC0779lo.a((Collection) list)) {
                    try {
                        l4 = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                    } catch (Throwable unused) {
                    }
                    long longValue = l4 == null ? l4.longValue() : 0L;
                    Wj.f11193a.a(longValue, c0571dm.f11698l);
                    a3 = a(c0571dm, c0519bm, longValue);
                    h();
                    b(a3);
                }
            }
            l4 = null;
            if (l4 == null) {
            }
            Wj.f11193a.a(longValue, c0571dm.f11698l);
            a3 = a(c0571dm, c0519bm, longValue);
            h();
            b(a3);
        }
        a(a3);
    }

    public final void a(C0622fm c0622fm) {
        ArrayList arrayList;
        Bm bm = this.f10061a;
        Fl fl = bm.f10126d;
        String str = bm.f10124b;
        synchronized (fl.f10294a.f10383b) {
            try {
                Hl hl = fl.f10294a;
                hl.f10384c = c0622fm;
                Collection collection = (Collection) hl.f10382a.f12571a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((Ql) obj).a(c0622fm);
        }
    }

    public final void a(Jl jl) {
        synchronized (this) {
            this.f10062b = null;
        }
        Bm bm = this.f10061a;
        bm.f10126d.a(bm.f10128f.f10836a, jl, e());
    }

    public final synchronized void a(Zl zl) {
        try {
            this.f10061a.f10134l.a(zl);
            C0519bm d4 = d();
            if (d4.f11561k) {
                List list = d4.f11560j;
                if (list != null && !list.isEmpty()) {
                    if (!AbstractC0779lo.a(list, d4.f11555e)) {
                        C0622fm e4 = e();
                        C0725jm c0725jm = e4.f11862c;
                        C0699im a3 = c0725jm.a(c0725jm.f12168m);
                        String str = e4.f11860a;
                        String str2 = e4.f11861b;
                        a3.f12062g = list;
                        C0622fm c0622fm = new C0622fm(str, str2, new C0725jm(a3));
                        b(c0622fm);
                        a(c0622fm);
                    }
                }
                if (d4.f11555e != null && (!r5.isEmpty())) {
                    C0622fm e5 = e();
                    C0725jm c0725jm2 = e5.f11862c;
                    C0699im a4 = c0725jm2.a(c0725jm2.f12168m);
                    String str3 = e5.f11860a;
                    String str4 = e5.f11861b;
                    a4.f12062g = null;
                    C0622fm c0622fm2 = new C0622fm(str3, str4, new C0725jm(a4));
                    b(c0622fm2);
                    a(c0622fm2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

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

/* loaded from: classes.dex */
public final class Em {

    /* renamed from: a, reason: collision with root package name */
    public final Fm f5968a;

    /* renamed from: b, reason: collision with root package name */
    public volatile NetworkTask f5969b;

    public Em(Fm fm) {
        this.f5968a = fm;
    }

    public final Context b() {
        return this.f5968a.f6005a;
    }

    public final synchronized NetworkTask c() {
        NetworkTask networkTask;
        try {
            try {
                if (g()) {
                    networkTask = this.f5969b;
                    if (networkTask != null && !networkTask.isRemoved()) {
                    }
                    C0500fm d3 = d();
                    C0415ce c0415ce = C0415ce.f7138a;
                    C0397bm c0397bm = new C0397bm(new C0699ne(), C0876ua.f8420H.p());
                    FinalConfigProvider finalConfigProvider = new FinalConfigProvider(d3);
                    try {
                        NetworkTask networkTask2 = new NetworkTask(new SynchronizedBlockingExecutor(), new C0923w5(this.f5968a.f6005a), new AllHostsExponentialBackoffPolicy(C0415ce.f7138a.a(EnumC0363ae.STARTUP)), new Cm(this, new Vl(), new FullUrlFormer(c0397bm, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), c2.m.f2637a, C0415ce.f7140c);
                        this.f5969b = networkTask2;
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

    public final C0500fm d() {
        return (C0500fm) this.f5968a.f6015l.a();
    }

    public final C0603jm e() {
        C0603jm c0603jm;
        Ml ml = this.f5968a.f6015l;
        synchronized (ml) {
            c0603jm = ml.f8492c.f6596a;
        }
        return c0603jm;
    }

    public final void f() {
        C0603jm c0603jm;
        Ml ml = this.f5968a.f6015l;
        synchronized (ml) {
            c0603jm = ml.f8492c.f6596a;
        }
        C0707nm c0707nm = c0603jm.f7665c;
        C0681mm a3 = c0707nm.a(c0707nm.f7968m);
        String str = c0603jm.f7663a;
        String str2 = c0603jm.f7664b;
        C0812ro c0812ro = this.f5968a.f6017n;
        String str3 = c0603jm.f7666d;
        c0812ro.getClass();
        if (!C0812ro.a(str3)) {
            a3.f7890a = this.f5968a.f6016m.a().id;
        }
        String str4 = c0603jm.f7663a;
        if (str4 == null || str4.length() == 0) {
            str = this.f5968a.f6011h.a();
            str2 = "";
        }
        List<String> list = this.f5968a.f6007c.f7200e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        a3.f7895g = list;
        C0603jm c0603jm2 = new C0603jm(str, str2, new C0707nm(a3));
        b(c0603jm2);
        a(c0603jm2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r1 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0002, B:10:0x0011, B:12:0x001b, B:17:0x0035, B:19:0x003d, B:21:0x0045, B:24:0x004e), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean g() {
        boolean z;
        boolean z2 = true;
        synchronized (this) {
            try {
                boolean z3 = false;
                if (C0876ua.f8420H.h().isRestrictedForSdk()) {
                    return false;
                }
                C0603jm e3 = e();
                Set set = AbstractC0526gm.f7416a;
                if (!e3.f7682w) {
                    if (AbstractC0526gm.f7417b.currentTimeSeconds() <= e3.o + e3.z.f6054a) {
                        z = false;
                        if (!z) {
                            if (AbstractC0526gm.a(e3.f7666d) && AbstractC0526gm.a(e3.f7663a) && AbstractC0526gm.a(e3.f7664b)) {
                                z3 = true;
                            }
                            z = !z3;
                            K3 k3 = this.f5968a.f6014k;
                            Map map = d().f7331h;
                            H3 h3 = this.f5968a.f6013j;
                            k3.getClass();
                            boolean a3 = K3.a(map, e3, h3);
                            if (z3) {
                            }
                        }
                        z2 = z;
                        return z2;
                    }
                }
                z = true;
                if (!z) {
                }
                z2 = z;
                return z2;
            } finally {
            }
        }
    }

    public final synchronized void h() {
        this.f5969b = null;
    }

    public final X4 a() {
        return this.f5968a.f;
    }

    public final synchronized void b(C0603jm c0603jm) {
        this.f5968a.f6015l.a(c0603jm);
        C0577im c0577im = this.f5968a.f6010g;
        c0577im.f7573b.a(c0603jm.f7663a);
        c0577im.f7573b.b(c0603jm.f7664b);
        c0577im.f7572a.save(c0603jm.f7665c);
        this.f5968a.f6009e.a(c0603jm);
    }

    public final synchronized boolean a(List<String> list, Map<String, String> map) {
        return !AbstractC0526gm.a(e(), list, map, new Dm(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0603jm a(C0552hm c0552hm, C0500fm c0500fm, long j3) {
        String str;
        boolean equals;
        String a3 = Jm.a(c0500fm.f7331h);
        Map map = c0500fm.f7332i.f8660a;
        String str2 = c0552hm.f7471j;
        String str3 = e().f7672k;
        if (!Jm.a(Jm.a(str2))) {
            str2 = Jm.a(Jm.a(str3)) ? str3 : null;
        }
        String str4 = e().f7663a;
        if (str4 != null) {
            str = s2.n.U(str4) ? null : str4;
        }
        str = c0552hm.f7469h;
        C0681mm c0681mm = new C0681mm(c0552hm.f7464b);
        String str5 = c0552hm.f7470i;
        c0681mm.o = this.f5968a.f6012i.currentTimeSeconds();
        c0681mm.f7890a = e().f7666d;
        c0681mm.f7892c = c0552hm.f7466d;
        c0681mm.f = c0552hm.f7465c;
        c0681mm.f7895g = c0500fm.f7329e;
        c0681mm.f7891b = c0552hm.f7467e;
        c0681mm.f7893d = c0552hm.f;
        c0681mm.f7894e = c0552hm.f7468g;
        c0681mm.f7896h = c0552hm.f7475n;
        c0681mm.f7897i = c0552hm.o;
        c0681mm.f7898j = str2;
        c0681mm.f7899k = a3;
        this.f5968a.f6014k.getClass();
        HashMap a4 = Jm.a(str2);
        if (AbstractC0709no.a(map)) {
            equals = AbstractC0709no.a((Map) a4);
        } else {
            equals = a4.equals(map);
        }
        c0681mm.f7904q = equals;
        c0681mm.f7900l = Jm.a(map);
        c0681mm.f7905r = c0552hm.f7474m;
        c0681mm.f7902n = c0552hm.f7472k;
        c0681mm.f7906s = c0552hm.f7476p;
        c0681mm.f7903p = true;
        c0681mm.f7907t = j3;
        C0500fm d3 = d();
        if (d3.f7337n == 0) {
            d3.f7337n = j3;
        }
        c0681mm.f7908u = d3.f7337n;
        c0681mm.v = false;
        c0681mm.f7909w = c0552hm.f7477q;
        c0681mm.f7910x = c0552hm.f7478r;
        c0681mm.f7911y = c0552hm.f7479s;
        c0681mm.z = c0552hm.f7480t;
        c0681mm.f7888A = c0552hm.f7481u;
        c0681mm.f7889B = c0552hm.v;
        return new C0603jm(str, str5, new C0707nm(c0681mm));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0037, B:12:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0552hm c0552hm, C0500fm c0500fm, Map<String, ? extends List<String>> map) {
        Long l3;
        C0603jm a3;
        synchronized (this) {
            if (!AbstractC0709no.a((Map) map)) {
                List list = (List) CollectionUtils.getFromMapIgnoreCase(map, "Date");
                if (!AbstractC0709no.a((Collection) list)) {
                    try {
                        l3 = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                    } catch (Throwable unused) {
                    }
                    long longValue = l3 == null ? l3.longValue() : 0L;
                    AbstractC0395bk.f7096a.a(longValue, c0552hm.f7473l);
                    a3 = a(c0552hm, c0500fm, longValue);
                    h();
                    b(a3);
                }
            }
            l3 = null;
            if (l3 == null) {
            }
            AbstractC0395bk.f7096a.a(longValue, c0552hm.f7473l);
            a3 = a(c0552hm, c0500fm, longValue);
            h();
            b(a3);
        }
        a(a3);
    }

    public final void a(C0603jm c0603jm) {
        ArrayList arrayList;
        Fm fm = this.f5968a;
        Jl jl = fm.f6008d;
        String str = fm.f6006b;
        synchronized (jl.f6218a.f6300b) {
            try {
                Ll ll = jl.f6218a;
                ll.f6301c = c0603jm;
                Collection collection = (Collection) ll.f6299a.f8560a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Ul) it.next()).a(c0603jm);
        }
    }

    public final void a(Nl nl) {
        synchronized (this) {
            this.f5969b = null;
        }
        Fm fm = this.f5968a;
        fm.f6008d.a(fm.f.f6860a, nl, e());
    }

    public final synchronized void a(C0449dm c0449dm) {
        try {
            this.f5968a.f6015l.a(c0449dm);
            C0500fm d3 = d();
            if (d3.f7334k) {
                List list = d3.f7333j;
                if (list != null && !list.isEmpty()) {
                    if (!AbstractC0709no.a(list, d3.f7329e)) {
                        C0603jm e3 = e();
                        C0707nm c0707nm = e3.f7665c;
                        C0681mm a3 = c0707nm.a(c0707nm.f7968m);
                        String str = e3.f7663a;
                        String str2 = e3.f7664b;
                        a3.f7895g = list;
                        C0603jm c0603jm = new C0603jm(str, str2, new C0707nm(a3));
                        b(c0603jm);
                        a(c0603jm);
                    }
                }
                if (d3.f7329e != null && (!r5.isEmpty())) {
                    C0603jm e4 = e();
                    C0707nm c0707nm2 = e4.f7665c;
                    C0681mm a4 = c0707nm2.a(c0707nm2.f7968m);
                    String str3 = e4.f7663a;
                    String str4 = e4.f7664b;
                    a4.f7895g = null;
                    C0603jm c0603jm2 = new C0603jm(str3, str4, new C0707nm(a4));
                    b(c0603jm2);
                    a(c0603jm2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

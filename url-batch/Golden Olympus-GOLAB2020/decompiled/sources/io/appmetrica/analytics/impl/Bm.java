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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Bm {

    /* renamed from: a, reason: collision with root package name */
    public final Cm f37259a;

    /* renamed from: b, reason: collision with root package name */
    public volatile NetworkTask f37260b;

    public Bm(@NotNull Cm cm) {
        this.f37259a = cm;
    }

    @NotNull
    public final Context b() {
        return this.f37259a.f37311a;
    }

    @Nullable
    public final synchronized NetworkTask c() {
        NetworkTask networkTask;
        try {
            try {
                if (g()) {
                    networkTask = this.f37260b;
                    if (networkTask != null && !networkTask.isRemoved()) {
                    }
                    C2526bm d4 = d();
                    C2755ke c2755ke = C2755ke.f39333a;
                    Xl xl = new Xl(new C3040ve(), Ia.f37730F.o());
                    FinalConfigProvider finalConfigProvider = new FinalConfigProvider(d4);
                    try {
                        NetworkTask networkTask2 = new NetworkTask(new SynchronizedBlockingExecutor(), new K5(this.f37259a.f37311a), new AllHostsExponentialBackoffPolicy(C2755ke.f39333a.a(EnumC2704ie.STARTUP)), new C3152zm(this, new Rl(), new FullUrlFormer(xl, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), CollectionsKt.emptyList(), C2755ke.f39335c);
                        this.f37260b = networkTask2;
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

    @NotNull
    public final C2526bm d() {
        return (C2526bm) this.f37259a.f37322l.a();
    }

    @NotNull
    public final C2633fm e() {
        C2633fm c2633fm;
        Il il = this.f37259a.f37322l;
        synchronized (il) {
            c2633fm = il.f37805c.f39126a;
        }
        return c2633fm;
    }

    public final void f() {
        C2633fm c2633fm;
        Il il = this.f37259a.f37322l;
        synchronized (il) {
            c2633fm = il.f37805c.f39126a;
        }
        C2737jm c2737jm = c2633fm.f38981c;
        C2711im a4 = c2737jm.a(c2737jm.f39306m);
        String str = c2633fm.f38979a;
        String str2 = c2633fm.f38980b;
        C2817mo c2817mo = this.f37259a.f37324n;
        String str3 = c2633fm.f38982d;
        c2817mo.getClass();
        if (!C2817mo.a(str3)) {
            a4.f39218a = this.f37259a.f37323m.a().id;
        }
        String str4 = c2633fm.f38979a;
        if (str4 == null || str4.length() == 0) {
            str = this.f37259a.f37318h.a();
            str2 = "";
        }
        List<String> list = this.f37259a.f37313c.f38648e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        a4.f39224g = list;
        C2633fm c2633fm2 = new C2633fm(str, str2, new C2737jm(a4));
        b(c2633fm2);
        a(c2633fm2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r1 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0002, B:10:0x0011, B:12:0x001b, B:17:0x0035, B:19:0x003d, B:21:0x0045, B:24:0x004e), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean g() {
        boolean z4;
        boolean z5 = true;
        synchronized (this) {
            try {
                boolean z6 = false;
                if (Ia.f37730F.g().isRestrictedForSdk()) {
                    return false;
                }
                C2633fm e4 = e();
                Set set = AbstractC2553cm.f38791a;
                if (!e4.f39001w) {
                    if (AbstractC2553cm.f38792b.currentTimeSeconds() <= e4.f38993o + e4.f38976A.f37383a) {
                        z4 = false;
                        if (!z4) {
                            if (AbstractC2553cm.a(e4.f38982d) && AbstractC2553cm.a(e4.f38979a) && AbstractC2553cm.a(e4.f38980b)) {
                                z6 = true;
                            }
                            z4 = !z6;
                            Y3 y32 = this.f37259a.f37321k;
                            Map map = d().f38746h;
                            V3 v32 = this.f37259a.f37320j;
                            y32.getClass();
                            boolean a4 = Y3.a(map, e4, v32);
                            if (z6) {
                            }
                        }
                        z5 = z4;
                        return z5;
                    }
                }
                z4 = true;
                if (!z4) {
                }
                z5 = z4;
                return z5;
            } finally {
            }
        }
    }

    public final synchronized void h() {
        this.f37260b = null;
    }

    @NotNull
    public final C2772l5 a() {
        return this.f37259a.f37316f;
    }

    public final synchronized void b(C2633fm c2633fm) {
        this.f37259a.f37322l.a(c2633fm);
        C2606em c2606em = this.f37259a.f37317g;
        c2606em.f38936b.a(c2633fm.f38979a);
        c2606em.f38936b.b(c2633fm.f38980b);
        c2606em.f38935a.save(c2633fm.f38981c);
        this.f37259a.f37315e.a(c2633fm);
    }

    public final synchronized boolean a(@Nullable List<String> list, @NotNull Map<String, String> map) {
        return !AbstractC2553cm.a(e(), list, map, new Am(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 == null) goto L15;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2633fm a(@NotNull C2580dm c2580dm, @NotNull C2526bm c2526bm, long j4) {
        String str;
        boolean equals;
        String a4 = Gm.a(c2526bm.f38746h);
        Map map = c2526bm.f38747i.f37991a;
        String str2 = c2580dm.f38868j;
        String str3 = e().f38989k;
        if (!Gm.a(Gm.a(str2))) {
            str2 = Gm.a(Gm.a(str3)) ? str3 : null;
        }
        String str4 = e().f38979a;
        if (str4 != null) {
            str = StringsKt.z(str4) ? null : str4;
        }
        str = c2580dm.f38866h;
        C2711im c2711im = new C2711im(c2580dm.f38860b);
        String str5 = c2580dm.f38867i;
        c2711im.f39232o = this.f37259a.f37319i.currentTimeSeconds();
        c2711im.f39218a = e().f38982d;
        c2711im.f39220c = c2580dm.f38862d;
        c2711im.f39223f = c2580dm.f38861c;
        c2711im.f39224g = c2526bm.f38743e;
        c2711im.f39219b = c2580dm.f38863e;
        c2711im.f39221d = c2580dm.f38864f;
        c2711im.f39222e = c2580dm.f38865g;
        c2711im.f39225h = c2580dm.f38872n;
        c2711im.f39226i = c2580dm.f38873o;
        c2711im.f39227j = str2;
        c2711im.f39228k = a4;
        this.f37259a.f37321k.getClass();
        HashMap a5 = Gm.a(str2);
        if (AbstractC2713io.a(map)) {
            equals = AbstractC2713io.a((Map) a5);
        } else {
            equals = a5.equals(map);
        }
        c2711im.f39234q = equals;
        c2711im.f39229l = Gm.a(map);
        c2711im.f39235r = c2580dm.f38871m;
        c2711im.f39231n = c2580dm.f38869k;
        c2711im.f39236s = c2580dm.f38874p;
        c2711im.f39233p = true;
        c2711im.f39237t = j4;
        C2526bm d4 = d();
        if (d4.f38752n == 0) {
            d4.f38752n = j4;
        }
        c2711im.f39238u = d4.f38752n;
        c2711im.f39239v = false;
        c2711im.f39240w = c2580dm.f38875q;
        c2711im.f39242y = c2580dm.f38877s;
        c2711im.f39241x = c2580dm.f38876r;
        c2711im.f39243z = c2580dm.f38878t;
        c2711im.f39215A = c2580dm.f38879u;
        c2711im.f39216B = c2580dm.f38880v;
        c2711im.f39217C = c2580dm.f38881w;
        return new C2633fm(str, str5, new C2737jm(c2711im));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0037, B:12:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NotNull C2580dm c2580dm, @NotNull C2526bm c2526bm, @Nullable Map<String, ? extends List<String>> map) {
        Long l4;
        C2633fm a4;
        synchronized (this) {
            if (!AbstractC2713io.a((Map) map)) {
                List list = (List) CollectionUtils.getFromMapIgnoreCase(map, "Date");
                if (!AbstractC2713io.a((Collection) list)) {
                    try {
                        l4 = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                    } catch (Throwable unused) {
                    }
                    long longValue = l4 == null ? l4.longValue() : 0L;
                    AbstractC2658gk.f39100a.a(longValue, c2580dm.f38870l);
                    a4 = a(c2580dm, c2526bm, longValue);
                    h();
                    b(a4);
                    Unit unit = Unit.f41027a;
                }
            }
            l4 = null;
            if (l4 == null) {
            }
            AbstractC2658gk.f39100a.a(longValue, c2580dm.f38870l);
            a4 = a(c2580dm, c2526bm, longValue);
            h();
            b(a4);
            Unit unit2 = Unit.f41027a;
        }
        a(a4);
    }

    public final void a(C2633fm c2633fm) {
        ArrayList arrayList;
        Cm cm = this.f37259a;
        Fl fl = cm.f37314d;
        String str = cm.f37312b;
        synchronized (fl.f37543a.f37671b) {
            try {
                Hl hl = fl.f37543a;
                hl.f37672c = c2633fm;
                Collection collection = (Collection) hl.f37670a.f37877a.get(str);
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
            ((Ql) obj).a(c2633fm);
        }
    }

    public final void a(@NotNull Jl jl) {
        synchronized (this) {
            this.f37260b = null;
        }
        Cm cm = this.f37259a;
        cm.f37314d.a(cm.f37316f.f39374a, jl, e());
    }

    public final synchronized void a(@NotNull Zl zl) {
        try {
            this.f37259a.f37322l.a(zl);
            C2526bm d4 = d();
            if (d4.f38749k) {
                List list = d4.f38748j;
                if (list != null && !list.isEmpty()) {
                    if (!AbstractC2713io.a(list, d4.f38743e)) {
                        C2633fm e4 = e();
                        C2737jm c2737jm = e4.f38981c;
                        C2711im a4 = c2737jm.a(c2737jm.f39306m);
                        String str = e4.f38979a;
                        String str2 = e4.f38980b;
                        a4.f39224g = list;
                        C2633fm c2633fm = new C2633fm(str, str2, new C2737jm(a4));
                        b(c2633fm);
                        a(c2633fm);
                    }
                }
                if (d4.f38743e != null && (!r5.isEmpty())) {
                    C2633fm e5 = e();
                    C2737jm c2737jm2 = e5.f38981c;
                    C2711im a5 = c2737jm2.a(c2737jm2.f39306m);
                    String str3 = e5.f38979a;
                    String str4 = e5.f38980b;
                    a5.f39224g = null;
                    C2633fm c2633fm2 = new C2633fm(str3, str4, new C2737jm(a5));
                    b(c2633fm2);
                    a(c2633fm2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

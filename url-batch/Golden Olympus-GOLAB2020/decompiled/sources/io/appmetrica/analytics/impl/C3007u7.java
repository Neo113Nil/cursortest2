package io.appmetrica.analytics.impl;

import android.content.Context;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.b9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.u7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3007u7 {

    /* renamed from: t, reason: collision with root package name */
    public static volatile C3007u7 f39898t;

    /* renamed from: e, reason: collision with root package name */
    public final Context f39903e;

    /* renamed from: f, reason: collision with root package name */
    public C2981t7 f39904f;

    /* renamed from: g, reason: collision with root package name */
    public C2981t7 f39905g;

    /* renamed from: h, reason: collision with root package name */
    public C2848o3 f39906h;

    /* renamed from: i, reason: collision with root package name */
    public C2874p3 f39907i;

    /* renamed from: j, reason: collision with root package name */
    public C2848o3 f39908j;

    /* renamed from: k, reason: collision with root package name */
    public C2874p3 f39909k;

    /* renamed from: l, reason: collision with root package name */
    public Nb f39910l;

    /* renamed from: m, reason: collision with root package name */
    public Ob f39911m;

    /* renamed from: n, reason: collision with root package name */
    public C2894pn f39912n;

    /* renamed from: o, reason: collision with root package name */
    public C2920qn f39913o;

    /* renamed from: p, reason: collision with root package name */
    public Nb f39914p;

    /* renamed from: q, reason: collision with root package name */
    public Ob f39915q;

    /* renamed from: r, reason: collision with root package name */
    public C3012uc f39916r;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f39899a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f39900b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f39901c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final C2671h7 f39902d = S5.a();

    /* renamed from: s, reason: collision with root package name */
    public final C3059w7 f39917s = new C3059w7();

    public C3007u7(Context context) {
        this.f39903e = context;
    }

    public static C3007u7 a(Context context) {
        if (f39898t == null) {
            synchronized (C3007u7.class) {
                try {
                    if (f39898t == null) {
                        f39898t = new C3007u7(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f39898t;
    }

    public final synchronized InterfaceC2542cb b(C2772l5 c2772l5) {
        InterfaceC2542cb interfaceC2542cb;
        String str = new C2536c5(c2772l5).f38765a;
        interfaceC2542cb = (InterfaceC2542cb) this.f39900b.get(str);
        if (interfaceC2542cb == null) {
            interfaceC2542cb = new Nb(new C2918ql(c(c2772l5)));
            this.f39900b.put(str, interfaceC2542cb);
        }
        return interfaceC2542cb;
    }

    public final synchronized C2981t7 c(C2772l5 c2772l5) {
        C2981t7 c2981t7;
        try {
            C2536c5 c2536c5 = new C2536c5(c2772l5);
            c2981t7 = (C2981t7) this.f39899a.get(c2536c5.f38765a);
            if (c2981t7 == null) {
                Context context = this.f39903e;
                C3059w7 c3059w7 = this.f39917s;
                String a4 = new C3033v7(c3059w7.f40016a, c3059w7.f40017b, false).a(context, c2536c5);
                C2671h7 c2671h7 = this.f39902d;
                c2671h7.getClass();
                String str = c2772l5.f39375b;
                if (str == null) {
                    str = b9.h.f15466Z;
                }
                String format = String.format("component-%s", str);
                C2661gn c2661gn = c2671h7.f39130c;
                C2929r7 c2929r7 = c2671h7.f39128a;
                C2722j7 c2722j7 = c2929r7.f39716a;
                C2748k7 c2748k7 = c2929r7.f39717b;
                Ka ka = new Ka(false);
                ka.a(Integer.valueOf(InterfaceC1490j3.d.b.f16818j), new C2616f5());
                C2712in c2712in = new C2712in(format, c2671h7.f39129b.f38159a);
                c2661gn.getClass();
                c2981t7 = new C2981t7(context, a4, new C2687hn(c2722j7, c2748k7, ka, c2712in), PublicLogger.getAnonymousInstance());
                this.f39899a.put(c2536c5.f38765a, c2981t7);
            }
        } finally {
        }
        return c2981t7;
    }

    public final synchronized InterfaceC2542cb d() {
        try {
            if (this.f39910l == null) {
                this.f39910l = new Nb(new C2918ql(h()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f39910l;
    }

    public final IBinaryDataHelper e() {
        if (this.f39908j == null) {
            if (this.f39905g == null) {
                Context context = this.f39903e;
                C3059w7 c3059w7 = this.f39917s;
                String a4 = new C3033v7(c3059w7.f40016a, c3059w7.f40017b, false).a(context, new B2());
                C2671h7 c2671h7 = this.f39902d;
                c2671h7.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("binary_data", N5.f37993a);
                C2661gn c2661gn = c2671h7.f39130c;
                C2929r7 c2929r7 = c2671h7.f39128a;
                C2774l7 c2774l7 = c2929r7.f39722g;
                C2800m7 c2800m7 = c2929r7.f39723h;
                Ka ka = new Ka(false);
                C2712in c2712in = new C2712in("auto_inapp", hashMap);
                c2661gn.getClass();
                this.f39905g = new C2981t7(context, a4, new C2687hn(c2774l7, c2800m7, ka, c2712in), PublicLogger.getAnonymousInstance());
            }
            this.f39908j = new C2848o3(new C2918ql(this.f39905g));
        }
        return this.f39908j;
    }

    public final InterfaceC2542cb f() {
        C3012uc c3012uc;
        if (this.f39914p == null) {
            synchronized (this) {
                try {
                    if (this.f39916r == null) {
                        C3059w7 c3059w7 = this.f39917s;
                        String a4 = new C3033v7(c3059w7.f40016a, c3059w7.f40017b, true).a(this.f39903e, new C2719j4());
                        Context context = this.f39903e;
                        C2671h7 c2671h7 = this.f39902d;
                        c2671h7.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("preferences", P5.f38116a);
                        C2661gn c2661gn = c2671h7.f39130c;
                        C2929r7 c2929r7 = c2671h7.f39128a;
                        C2826n7 c2826n7 = c2929r7.f39718c;
                        C2852o7 c2852o7 = c2929r7.f39719d;
                        Ka ka = new Ka(false);
                        ka.a(Integer.valueOf(InterfaceC1490j3.d.b.f16818j), new C2745k4());
                        C2712in c2712in = new C2712in("service database", hashMap);
                        c2661gn.getClass();
                        this.f39916r = new C3012uc(context, a4, new C2984ta(a4), new C2687hn(c2826n7, c2852o7, ka, c2712in));
                    }
                    c3012uc = this.f39916r;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f39914p = new Nb(c3012uc);
        }
        return this.f39914p;
    }

    public final IBinaryDataHelper g() {
        if (this.f39906h == null) {
            this.f39906h = new C2848o3(new C2918ql(h()));
        }
        return this.f39906h;
    }

    public final synchronized C2981t7 h() {
        try {
            if (this.f39904f == null) {
                Context context = this.f39903e;
                C3059w7 c3059w7 = this.f39917s;
                String a4 = new C3033v7(c3059w7.f40016a, c3059w7.f40017b, true).a(context, new C2839nk());
                C2671h7 c2671h7 = this.f39902d;
                c2671h7.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", P5.f38116a);
                hashMap.put("binary_data", N5.f37993a);
                hashMap.put("temp_cache", AbstractC2971sn.f39818a);
                Iterator<ModuleServicesDatabase> it = Ia.f37730F.o().b().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        hashMap.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C2661gn c2661gn = c2671h7.f39130c;
                C2929r7 c2929r7 = c2671h7.f39128a;
                C2878p7 c2878p7 = c2929r7.f39720e;
                C2904q7 c2904q7 = c2929r7.f39721f;
                Ka ka = new Ka(false);
                ka.a(Integer.valueOf(IronSourceConstants.FIRST_INSTANCE_RESULT), new C2865ok());
                Iterator<ModuleServicesDatabase> it2 = Ia.f37730F.o().b().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            ka.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C2712in c2712in = new C2712in("service database", hashMap);
                c2661gn.getClass();
                this.f39904f = new C2981t7(context, a4, new C2687hn(c2878p7, c2904q7, ka, c2712in), PublicLogger.getAnonymousInstance());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f39904f;
    }

    public final synchronized IBinaryDataHelper a(C2772l5 c2772l5) {
        IBinaryDataHelper iBinaryDataHelper;
        String str = new C2536c5(c2772l5).f38765a;
        iBinaryDataHelper = (IBinaryDataHelper) this.f39901c.get(str);
        if (iBinaryDataHelper == null) {
            iBinaryDataHelper = new C2848o3(new C2918ql(c(c2772l5)));
            this.f39901c.put(str, iBinaryDataHelper);
        }
        return iBinaryDataHelper;
    }

    public final synchronized InterfaceC2542cb b() {
        return f();
    }

    public final synchronized InterfaceC2542cb a() {
        try {
            if (this.f39915q == null) {
                this.f39915q = new Ob(f());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f39915q;
    }

    public final synchronized InterfaceC2542cb c() {
        try {
            if (this.f39911m == null) {
                if (this.f39910l == null) {
                    this.f39910l = new Nb(new C2918ql(h()));
                }
                this.f39911m = new Ob(this.f39910l);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f39911m;
    }
}

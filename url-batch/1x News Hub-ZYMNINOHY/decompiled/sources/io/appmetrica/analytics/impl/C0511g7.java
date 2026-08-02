package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.g7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511g7 {

    /* renamed from: q, reason: collision with root package name */
    public static volatile C0511g7 f7363q;

    /* renamed from: e, reason: collision with root package name */
    public final Context f7368e;
    public C0485f7 f;

    /* renamed from: g, reason: collision with root package name */
    public C0352a3 f7369g;

    /* renamed from: h, reason: collision with root package name */
    public C0378b3 f7370h;

    /* renamed from: i, reason: collision with root package name */
    public C1005zb f7371i;

    /* renamed from: j, reason: collision with root package name */
    public Ab f7372j;

    /* renamed from: k, reason: collision with root package name */
    public C0889un f7373k;

    /* renamed from: l, reason: collision with root package name */
    public C0915vn f7374l;

    /* renamed from: m, reason: collision with root package name */
    public C1005zb f7375m;

    /* renamed from: n, reason: collision with root package name */
    public Ab f7376n;
    public C0516gc o;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7364a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7365b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7366c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final T6 f7367d = D5.a();

    /* renamed from: p, reason: collision with root package name */
    public final C0563i7 f7377p = new C0563i7();

    public C0511g7(Context context) {
        this.f7368e = context;
    }

    public static C0511g7 a(Context context) {
        if (f7363q == null) {
            synchronized (C0511g7.class) {
                try {
                    if (f7363q == null) {
                        f7363q = new C0511g7(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f7363q;
    }

    public final synchronized Oa b(X4 x4) {
        Oa oa;
        String str = new O4(x4).f6397a;
        oa = (Oa) this.f7365b.get(str);
        if (oa == null) {
            oa = new C1005zb(new C0887ul(c(x4)));
            this.f7365b.put(str, oa);
        }
        return oa;
    }

    public final synchronized C0485f7 c(X4 x4) {
        C0485f7 c0485f7;
        try {
            O4 o4 = new O4(x4);
            c0485f7 = (C0485f7) this.f7364a.get(o4.f6397a);
            if (c0485f7 == null) {
                Context context = this.f7368e;
                C0563i7 c0563i7 = this.f7377p;
                String a3 = new C0537h7(c0563i7.f7509a, c0563i7.f7510b, false).a(context, o4);
                T6 t6 = this.f7367d;
                t6.getClass();
                String str = x4.f6861b;
                if (str == null) {
                    str = "main";
                }
                String concat = "component-".concat(str);
                C0630kn c0630kn = t6.f6689c;
                C0434d7 c0434d7 = t6.f6687a;
                V6 v6 = c0434d7.f7175a;
                W6 w6 = c0434d7.f7176b;
                C0928wa c0928wa = new C0928wa(false);
                c0928wa.a(112, new R4());
                C0708nn c0708nn = new C0708nn(concat, t6.f6688b.f5839a);
                c0630kn.getClass();
                c0485f7 = new C0485f7(context, a3, new C0656ln(v6, w6, c0928wa, c0708nn), PublicLogger.getAnonymousInstance());
                this.f7364a.put(o4.f6397a, c0485f7);
            }
        } finally {
        }
        return c0485f7;
    }

    public final synchronized Oa d() {
        try {
            if (this.f7371i == null) {
                this.f7371i = new C1005zb(new C0887ul(h()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7371i;
    }

    public final Oa e() {
        C0516gc c0516gc;
        if (this.f7375m == null) {
            synchronized (this) {
                try {
                    if (this.o == null) {
                        C0563i7 c0563i7 = this.f7377p;
                        String a3 = new C0537h7(c0563i7.f7509a, c0563i7.f7510b, true).a(this.f7368e, new V3());
                        Context context = this.f7368e;
                        T6 t6 = this.f7367d;
                        t6.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("preferences", A5.f5725a);
                        C0630kn c0630kn = t6.f6689c;
                        C0434d7 c0434d7 = t6.f6687a;
                        Z6 z6 = c0434d7.f7177c;
                        C0356a7 c0356a7 = c0434d7.f7178d;
                        C0928wa c0928wa = new C0928wa(false);
                        c0928wa.a(112, new W3());
                        C0708nn c0708nn = new C0708nn("service database", hashMap);
                        c0630kn.getClass();
                        this.o = new C0516gc(context, a3, new C0488fa(a3), new C0656ln(z6, c0356a7, c0928wa, c0708nn));
                    }
                    c0516gc = this.o;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f7375m = new C1005zb(c0516gc);
        }
        return this.f7375m;
    }

    public final IBinaryDataHelper f() {
        if (this.f7369g == null) {
            this.f7369g = new C0352a3(new C0887ul(h()), "binary_data");
        }
        return this.f7369g;
    }

    public final synchronized IBinaryDataHelper g() {
        try {
            if (this.f7370h == null) {
                this.f7370h = new C0378b3(f());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7370h;
    }

    public final synchronized C0485f7 h() {
        try {
            if (this.f == null) {
                Context context = this.f7368e;
                C0563i7 c0563i7 = this.f7377p;
                String a3 = new C0537h7(c0563i7.f7509a, c0563i7.f7510b, true).a(context, new C0627kk());
                T6 t6 = this.f7367d;
                t6.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", A5.f5725a);
                hashMap.put("binary_data", AbstractC0974y5.f8633a);
                hashMap.put("temp_cache", AbstractC0967xn.f8627a);
                Iterator<ModuleServicesDatabase> it = C0876ua.f8420H.p().b().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        hashMap.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C0630kn c0630kn = t6.f6689c;
                C0434d7 c0434d7 = t6.f6687a;
                C0382b7 c0382b7 = c0434d7.f7179e;
                C0408c7 c0408c7 = c0434d7.f;
                C0928wa c0928wa = new C0928wa(false);
                c0928wa.a(114, new C0653lk());
                Iterator<ModuleServicesDatabase> it2 = C0876ua.f8420H.p().b().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            c0928wa.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C0708nn c0708nn = new C0708nn("service database", hashMap);
                c0630kn.getClass();
                this.f = new C0485f7(context, a3, new C0656ln(c0382b7, c0408c7, c0928wa, c0708nn), PublicLogger.getAnonymousInstance());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f;
    }

    public final synchronized IBinaryDataHelper a(X4 x4) {
        IBinaryDataHelper iBinaryDataHelper;
        String str = new O4(x4).f6397a;
        iBinaryDataHelper = (IBinaryDataHelper) this.f7366c.get(str);
        if (iBinaryDataHelper == null) {
            iBinaryDataHelper = new C0352a3(new C0887ul(c(x4)), "binary_data");
            this.f7366c.put(str, iBinaryDataHelper);
        }
        return iBinaryDataHelper;
    }

    public final synchronized Oa b() {
        return e();
    }

    public final synchronized Oa a() {
        try {
            if (this.f7376n == null) {
                this.f7376n = new Ab(e());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7376n;
    }

    public final synchronized Oa c() {
        try {
            if (this.f7372j == null) {
                if (this.f7371i == null) {
                    this.f7371i = new C1005zb(new C0887ul(h()));
                }
                this.f7372j = new Ab(this.f7371i);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7372j;
    }
}

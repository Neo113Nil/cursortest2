package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0685zk {

    /* renamed from: a, reason: collision with root package name */
    public final C0065b7 f1601a;
    public Z6 b;
    public T2 c;
    public U2 d;
    public C0526tb e;
    public C0551ub f;
    public C0538tn g;
    public C0563un h;
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();

    public C0685zk(File file) {
        this.f1601a = new C0065b7(file);
    }

    public final IBinaryDataHelper a(Context context) {
        T2 t2 = this.c;
        if (t2 != null) {
            return t2;
        }
        T2 t22 = new T2(new C0486rl(f(context)), "binary_data");
        this.c = t22;
        return t22;
    }

    public final synchronized IBinaryDataHelper b(Context context) {
        U2 u2;
        u2 = this.d;
        if (u2 == null) {
            u2 = new U2(a(context));
            this.d = u2;
        }
        return u2;
    }

    public final synchronized IBinaryDataHelper c(Context context) {
        return a(context);
    }

    public final synchronized Ia d(Context context) {
        C0551ub c0551ub;
        c0551ub = this.f;
        if (c0551ub == null) {
            C0526tb c0526tb = this.e;
            if (c0526tb == null) {
                c0526tb = new C0526tb(new C0486rl(f(context)));
                this.e = c0526tb;
            }
            c0551ub = new C0551ub(c0526tb);
            this.f = c0551ub;
        }
        return c0551ub;
    }

    public final synchronized Ia e(Context context) {
        C0526tb c0526tb;
        c0526tb = this.e;
        if (c0526tb == null) {
            c0526tb = new C0526tb(new C0486rl(f(context)));
            this.e = c0526tb;
        }
        return c0526tb;
    }

    public final synchronized Z6 f(Context context) {
        Z6 z6;
        z6 = this.b;
        if (z6 == null) {
            C0065b7 c0065b7 = this.f1601a;
            String a2 = new C0039a7(c0065b7.f1179a, c0065b7.b, true).a(context, new C0207gk());
            N6 n6 = AbstractC0620x5.c;
            n6.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("preferences", InterfaceC0545u5.f1509a);
            hashMap.put("binary_data", AbstractC0495s5.f1479a);
            hashMap.put("temp_cache", AbstractC0613wn.f1554a);
            Iterator<ModuleServicesDatabase> it = C0401oa.I.p().b().iterator();
            while (it.hasNext()) {
                for (TableDescription tableDescription : it.next().getTables()) {
                    hashMap.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                }
            }
            C0261in c0261in = n6.c;
            X6 x6 = n6.f965a;
            V6 v6 = x6.e;
            W6 w6 = x6.f;
            C0451qa c0451qa = new C0451qa(false);
            c0451qa.a(114, new C0233hk());
            Iterator<ModuleServicesDatabase> it2 = C0401oa.I.p().b().iterator();
            while (it2.hasNext()) {
                Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                while (it3.hasNext()) {
                    for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                        c0451qa.a(entry.getKey(), entry.getValue());
                    }
                }
            }
            C0339ln c0339ln = new C0339ln("service database", hashMap);
            c0261in.getClass();
            z6 = new Z6(context, a2, new C0287jn(v6, w6, c0451qa, c0339ln), PublicLogger.getAnonymousInstance());
            this.b = z6;
        }
        return z6;
    }

    public final synchronized Z6 c(Context context, R4 r4) {
        Object obj;
        String str = new I4(r4).f885a;
        LinkedHashMap linkedHashMap = this.i;
        obj = linkedHashMap.get(str);
        if (obj == null) {
            C0065b7 c0065b7 = this.f1601a;
            String a2 = new C0039a7(c0065b7.f1179a, c0065b7.b, false).a(context, new I4(r4));
            N6 n6 = AbstractC0620x5.c;
            n6.getClass();
            String str2 = r4.b;
            if (str2 == null) {
                str2 = "main";
            }
            String format = String.format("component-%s", str2);
            C0261in c0261in = n6.c;
            X6 x6 = n6.f965a;
            P6 p6 = x6.f1114a;
            Q6 q6 = x6.b;
            C0451qa c0451qa = new C0451qa(false);
            c0451qa.a(112, new L4());
            C0339ln c0339ln = new C0339ln(format, n6.b.f1530a);
            c0261in.getClass();
            obj = new Z6(context, a2, new C0287jn(p6, q6, c0451qa, c0339ln), PublicLogger.getAnonymousInstance());
            linkedHashMap.put(str, obj);
        }
        return (Z6) obj;
    }

    public final synchronized IBinaryDataHelper a(Context context, R4 r4) {
        Object obj;
        String str = new I4(r4).f885a;
        LinkedHashMap linkedHashMap = this.k;
        obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new T2(new C0486rl(c(context, r4)), "binary_data");
            linkedHashMap.put(str, obj);
        }
        return (IBinaryDataHelper) obj;
    }

    public final synchronized Ia b(Context context, R4 r4) {
        Object obj;
        String str = new I4(r4).f885a;
        LinkedHashMap linkedHashMap = this.j;
        obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new C0526tb(new C0486rl(c(context, r4)));
            linkedHashMap.put(str, obj);
        }
        return (Ia) obj;
    }
}

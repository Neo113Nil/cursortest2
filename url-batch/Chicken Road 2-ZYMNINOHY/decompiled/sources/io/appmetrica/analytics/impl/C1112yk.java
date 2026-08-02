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

/* renamed from: io.appmetrica.analytics.impl.yk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1112yk {

    /* renamed from: a, reason: collision with root package name */
    public final C0478a7 f13067a;

    /* renamed from: b, reason: collision with root package name */
    public Y6 f13068b;

    /* renamed from: c, reason: collision with root package name */
    public S2 f13069c;

    /* renamed from: d, reason: collision with root package name */
    public T2 f13070d;

    /* renamed from: e, reason: collision with root package name */
    public C0947sb f13071e;

    /* renamed from: f, reason: collision with root package name */
    public C0973tb f13072f;

    /* renamed from: g, reason: collision with root package name */
    public C0959sn f13073g;

    /* renamed from: h, reason: collision with root package name */
    public C0985tn f13074h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f13075i = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f13076j = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f13077k = new LinkedHashMap();

    public C1112yk(File file) {
        this.f13067a = new C0478a7(file);
    }

    public final IBinaryDataHelper a(Context context) {
        S2 s22 = this.f13069c;
        if (s22 != null) {
            return s22;
        }
        S2 s23 = new S2(new C0906ql(f(context)), "binary_data");
        this.f13069c = s23;
        return s23;
    }

    public final synchronized IBinaryDataHelper b(Context context) {
        T2 t22;
        t22 = this.f13070d;
        if (t22 == null) {
            t22 = new T2(a(context));
            this.f13070d = t22;
        }
        return t22;
    }

    public final synchronized IBinaryDataHelper c(Context context) {
        return a(context);
    }

    public final synchronized Ha d(Context context) {
        C0973tb c0973tb;
        try {
            c0973tb = this.f13072f;
            if (c0973tb == null) {
                C0947sb c0947sb = this.f13071e;
                if (c0947sb == null) {
                    c0947sb = new C0947sb(new C0906ql(f(context)));
                    this.f13071e = c0947sb;
                }
                c0973tb = new C0973tb(c0947sb);
                this.f13072f = c0973tb;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0973tb;
    }

    public final synchronized Ha e(Context context) {
        C0947sb c0947sb;
        c0947sb = this.f13071e;
        if (c0947sb == null) {
            c0947sb = new C0947sb(new C0906ql(f(context)));
            this.f13071e = c0947sb;
        }
        return c0947sb;
    }

    public final synchronized Y6 f(Context context) {
        Y6 y6;
        try {
            y6 = this.f13068b;
            if (y6 == null) {
                C0478a7 c0478a7 = this.f13067a;
                String a3 = new Z6(c0478a7.f11430a, c0478a7.f11431b, true).a(context, new C0620fk());
                M6 m6 = AbstractC1045w5.f12921c;
                m6.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("preferences", InterfaceC0967t5.f12767a);
                hashMap.put("binary_data", AbstractC0915r5.f12647a);
                hashMap.put("temp_cache", AbstractC1037vn.f12905a);
                Iterator<ModuleServicesDatabase> it = C0817na.f12417I.p().b().iterator();
                while (it.hasNext()) {
                    for (TableDescription tableDescription : it.next().getTables()) {
                        hashMap.put(tableDescription.getTableName(), tableDescription.getColumnNames());
                    }
                }
                C0675hn c0675hn = m6.f10631c;
                W6 w6 = m6.f10629a;
                U6 u6 = w6.f11168e;
                V6 v6 = w6.f11169f;
                C0869pa c0869pa = new C0869pa(false);
                c0869pa.a(114, new C0646gk());
                Iterator<ModuleServicesDatabase> it2 = C0817na.f12417I.p().b().iterator();
                while (it2.hasNext()) {
                    Iterator<TableDescription> it3 = it2.next().getTables().iterator();
                    while (it3.hasNext()) {
                        for (Map.Entry<Integer, DatabaseScript> entry : it3.next().getDatabaseProviderUpgradeScript().entrySet()) {
                            c0869pa.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                C0752kn c0752kn = new C0752kn("service database", hashMap);
                c0675hn.getClass();
                y6 = new Y6(context, a3, new C0700in(u6, v6, c0869pa, c0752kn), PublicLogger.getAnonymousInstance());
                this.f13068b = y6;
            }
        } catch (Throwable th) {
            throw th;
        }
        return y6;
    }

    public final synchronized Y6 c(Context context, Q4 q4) {
        Object obj;
        try {
            String str = new H4(q4).f10357a;
            LinkedHashMap linkedHashMap = this.f13075i;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                C0478a7 c0478a7 = this.f13067a;
                String a3 = new Z6(c0478a7.f11430a, c0478a7.f11431b, false).a(context, new H4(q4));
                M6 m6 = AbstractC1045w5.f12921c;
                m6.getClass();
                String str2 = q4.f10837b;
                if (str2 == null) {
                    str2 = "main";
                }
                String concat = "component-".concat(str2);
                C0675hn c0675hn = m6.f10631c;
                W6 w6 = m6.f10629a;
                O6 o6 = w6.f11164a;
                P6 p6 = w6.f11165b;
                C0869pa c0869pa = new C0869pa(false);
                c0869pa.a(112, new K4());
                C0752kn c0752kn = new C0752kn(concat, m6.f10630b.f12808a);
                c0675hn.getClass();
                obj = new Y6(context, a3, new C0700in(o6, p6, c0869pa, c0752kn), PublicLogger.getAnonymousInstance());
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Y6) obj;
    }

    public final synchronized IBinaryDataHelper a(Context context, Q4 q4) {
        Object obj;
        try {
            String str = new H4(q4).f10357a;
            LinkedHashMap linkedHashMap = this.f13077k;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new S2(new C0906ql(c(context, q4)), "binary_data");
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (IBinaryDataHelper) obj;
    }

    public final synchronized Ha b(Context context, Q4 q4) {
        Object obj;
        try {
            String str = new H4(q4).f10357a;
            LinkedHashMap linkedHashMap = this.f13076j;
            obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new C0947sb(new C0906ql(c(context, q4)));
                linkedHashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Ha) obj;
    }
}

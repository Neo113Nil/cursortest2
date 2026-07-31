package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hi2 implements ij2<ii2> {

    /* renamed from: a, reason: collision with root package name */
    private final dc3 f6314a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f6315b;

    /* renamed from: c, reason: collision with root package name */
    private final hb2 f6316c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f6317d;

    /* renamed from: e, reason: collision with root package name */
    private final ks2 f6318e;

    /* renamed from: f, reason: collision with root package name */
    private final db2 f6319f;

    /* renamed from: g, reason: collision with root package name */
    private final rt1 f6320g;

    /* renamed from: h, reason: collision with root package name */
    final String f6321h;

    public hi2(dc3 dc3Var, ScheduledExecutorService scheduledExecutorService, String str, hb2 hb2Var, Context context, ks2 ks2Var, db2 db2Var, rt1 rt1Var) {
        this.f6314a = dc3Var;
        this.f6315b = scheduledExecutorService;
        this.f6321h = str;
        this.f6316c = hb2Var;
        this.f6317d = context;
        this.f6318e = ks2Var;
        this.f6319f = db2Var;
        this.f6320g = rt1Var;
    }

    public static /* synthetic */ cc3 b(final hi2 hi2Var) {
        Map<String, List<Bundle>> a7 = hi2Var.f6316c.a(hi2Var.f6321h, ((Boolean) sw.c().b(m10.p7)).booleanValue() ? hi2Var.f6318e.f7620f.toLowerCase(Locale.ROOT) : hi2Var.f6318e.f7620f);
        final ArrayList arrayList = new ArrayList();
        Iterator<E> it = ((i73) a7).entrySet().iterator();
        while (true) {
            final Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            final String str = (String) entry.getKey();
            final List list = (List) entry.getValue();
            Bundle bundle2 = hi2Var.f6318e.f7618d.f7655r;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            }
            arrayList.add(rb3.f((ib3) rb3.o(ib3.E(rb3.l(new wa3() { // from class: com.google.android.gms.internal.ads.fi2
                @Override // com.google.android.gms.internal.ads.wa3
                public final cc3 zza() {
                    return hi2.this.c(str, list, bundle);
                }
            }, hi2Var.f6314a)), ((Long) sw.c().b(m10.f8178d1)).longValue(), TimeUnit.MILLISECONDS, hi2Var.f6315b), Throwable.class, new e43() { // from class: com.google.android.gms.internal.ads.bi2
                @Override // com.google.android.gms.internal.ads.e43
                public final Object apply(Object obj) {
                    String valueOf = String.valueOf(str);
                    io0.d(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "));
                    return null;
                }
            }, hi2Var.f6314a));
        }
        Iterator<E> it2 = ((i73) hi2Var.f6316c.b()).entrySet().iterator();
        while (it2.hasNext()) {
            final lb2 lb2Var = (lb2) ((Map.Entry) it2.next()).getValue();
            final String str2 = lb2Var.f7911a;
            Bundle bundle3 = hi2Var.f6318e.f7618d.f7655r;
            final Bundle bundle4 = bundle3 != null ? bundle3.getBundle(str2) : null;
            arrayList.add(rb3.f((ib3) rb3.o(ib3.E(rb3.l(new wa3() { // from class: com.google.android.gms.internal.ads.ei2
                @Override // com.google.android.gms.internal.ads.wa3
                public final cc3 zza() {
                    return hi2.this.d(str2, lb2Var, bundle4);
                }
            }, hi2Var.f6314a)), ((Long) sw.c().b(m10.f8178d1)).longValue(), TimeUnit.MILLISECONDS, hi2Var.f6315b), Throwable.class, new e43() { // from class: com.google.android.gms.internal.ads.ci2
                @Override // com.google.android.gms.internal.ads.e43
                public final Object apply(Object obj) {
                    String valueOf = String.valueOf(str2);
                    io0.d(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "));
                    return null;
                }
            }, hi2Var.f6314a));
        }
        return rb3.c(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.gi2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<cc3> list2 = arrayList;
                JSONArray jSONArray = new JSONArray();
                for (cc3 cc3Var : list2) {
                    if (((JSONObject) cc3Var.get()) != null) {
                        jSONArray.put(cc3Var.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new ii2(jSONArray.toString());
            }
        }, hi2Var.f6314a);
    }

    private final cc3<JSONObject> e(String str, List<Bundle> list, Bundle bundle, boolean z6, boolean z7) {
        cf0 cf0Var;
        bp0 bp0Var = new bp0();
        if (z7) {
            this.f6319f.b(str);
            cf0Var = this.f6319f.a(str);
        } else {
            try {
                cf0Var = this.f6320g.a(str);
            } catch (RemoteException e7) {
                io0.e("Couldn't create RTB adapter : ", e7);
                cf0Var = null;
            }
        }
        cf0 cf0Var2 = cf0Var;
        Objects.requireNonNull(cf0Var2);
        kb2 kb2Var = new kb2(str, cf0Var2, bp0Var);
        if (z6) {
            cf0Var2.T2(x3.b.B3(this.f6317d), this.f6321h, bundle, list.get(0), this.f6318e.f7619e, kb2Var);
        } else {
            kb2Var.a();
        }
        return bp0Var;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<ii2> a() {
        return rb3.l(new wa3() { // from class: com.google.android.gms.internal.ads.di2
            @Override // com.google.android.gms.internal.ads.wa3
            public final cc3 zza() {
                return hi2.b(hi2.this);
            }
        }, this.f6314a);
    }

    final /* synthetic */ cc3 c(String str, List list, Bundle bundle) {
        return e(str, list, bundle, true, true);
    }

    final /* synthetic */ cc3 d(String str, lb2 lb2Var, Bundle bundle) {
        return e(str, Collections.singletonList(lb2Var.f7914d), bundle, lb2Var.f7912b, lb2Var.f7913c);
    }
}

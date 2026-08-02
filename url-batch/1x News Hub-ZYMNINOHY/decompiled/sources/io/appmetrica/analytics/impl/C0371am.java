package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371am {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f7038a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7039b;

    /* renamed from: c, reason: collision with root package name */
    public final Xl f7040c;

    /* renamed from: d, reason: collision with root package name */
    public List f7041d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f7042e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7043g;

    /* renamed from: h, reason: collision with root package name */
    public long f7044h;

    /* renamed from: i, reason: collision with root package name */
    public final C0364af f7045i;

    /* renamed from: j, reason: collision with root package name */
    public final P f7046j;

    /* renamed from: k, reason: collision with root package name */
    public final K3 f7047k;

    /* renamed from: l, reason: collision with root package name */
    public final E6 f7048l;

    /* renamed from: m, reason: collision with root package name */
    public final C0359aa f7049m;

    /* renamed from: n, reason: collision with root package name */
    public final Z9 f7050n;
    public final C0812ro o;

    public C0371am(Context context, C0364af c0364af) {
        this(c0364af, new P(), new K3(), C0585j4.l().a(context), new E6(), new C0359aa(), new Z9(), new C0812ro());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r8.f7043g != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a(List list) {
        boolean z;
        boolean z2;
        try {
            Set other = AbstractC0526gm.f7416a;
            kotlin.jvm.internal.j.e(list, "<this>");
            kotlin.jvm.internal.j.e(other, "other");
            LinkedHashSet linkedHashSet = new LinkedHashSet(list);
            linkedHashSet.retainAll(other);
            boolean a3 = a(linkedHashSet);
            Iterator it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                if (this.f7038a.contains((String) it.next())) {
                    z2 = true;
                    break;
                }
            }
            boolean z3 = AbstractC0526gm.f7417b.currentTimeSeconds() > this.f7044h;
            if (a3 && !z2 && !z3) {
            }
            z = true;
        } finally {
        }
        return z;
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.f7039b.put("appmetrica_clids", identifiersResult);
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            C0812ro c0812ro = this.o;
            String str = identifiersResult.id;
            c0812ro.getClass();
            if (C0812ro.a(str)) {
                this.f7039b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        C0411ca c0411ca;
        C0364af d3 = this.f7045i.i((IdentifiersResult) this.f7039b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.f7039b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.f7039b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((IdentifiersResult) this.f7039b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.f7039b.get("appmetrica_report_ad_url")).e(this.f).h((IdentifiersResult) this.f7039b.get("appmetrica_clids")).j(Jm.a((Map) this.f7042e)).f((IdentifiersResult) this.f7039b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.f7039b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.f7039b.get("appmetrica_yandex_adv_id")).b(this.f7043g).c(this.f7048l.f5951d).d(this.f7044h);
        C0359aa c0359aa = this.f7049m;
        synchronized (c0359aa) {
            c0411ca = c0359aa.f6998b;
        }
        d3.a(c0411ca).b();
    }

    public C0371am(C0364af c0364af, P p3, K3 k3, Cd cd, E6 e6, C0359aa c0359aa, Z9 z9, C0812ro c0812ro) {
        HashSet hashSet = new HashSet();
        this.f7038a = hashSet;
        this.f7039b = new HashMap();
        this.f7040c = new Xl();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.f7045i = c0364af;
        this.f7046j = p3;
        this.f7047k = k3;
        this.f7048l = e6;
        this.f7049m = c0359aa;
        this.f7050n = z9;
        this.o = c0812ro;
        c(cd.a());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, c0364af.j());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, c0364af.i());
        a("appmetrica_get_ad_url", c0364af.d());
        a("appmetrica_report_ad_url", c0364af.e());
        b(c0364af.o());
        a("appmetrica_google_adv_id", c0364af.l());
        a("appmetrica_huawei_oaid", c0364af.m());
        a("appmetrica_yandex_adv_id", c0364af.r());
        e6.a(c0364af.h());
        c0359aa.a(c0364af.k());
        this.f7041d = c0364af.g();
        String i3 = c0364af.i((String) null);
        this.f7042e = i3 != null ? Jm.a(i3) : null;
        this.f7043g = c0364af.a(true);
        this.f = c0364af.b(0L);
        this.f7044h = c0364af.n();
        c();
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f7039b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.id.isEmpty()) {
            return AbstractC0709no.a((Map) this.f7042e);
        }
        return true;
    }

    public static boolean a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.id == null;
    }

    public final void a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.id)) {
            return;
        }
        this.f7039b.put(str, identifiersResult);
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.f7039b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.f7048l.f5950c.get(str2);
                }
                if (identifiersResult == null) {
                    C0411ca c0411ca = this.f7049m.f6998b;
                    if (!kotlin.jvm.internal.j.a(str2, "appmetrica_lib_ssl_enabled") || (bool = c0411ca.f7132a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean booleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = c0411ca.f7133b;
                        String str3 = c0411ca.f7134c;
                        if (booleanValue) {
                            str = "true";
                        } else if (!booleanValue) {
                            str = "false";
                        } else {
                            throw new O0.b();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.f7043g || a(identifiersResult) || (identifiersResult.id.isEmpty() && !AbstractC0709no.a((Map) this.f7042e))) {
                        return false;
                    }
                } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.id)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}

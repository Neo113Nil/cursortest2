package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import g4.AbstractC0465j;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0522am {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f7886a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7887b;

    /* renamed from: c, reason: collision with root package name */
    public final Xl f7888c;

    /* renamed from: d, reason: collision with root package name */
    public List f7889d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f7890e;

    /* renamed from: f, reason: collision with root package name */
    public long f7891f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7892g;

    /* renamed from: h, reason: collision with root package name */
    public long f7893h;

    /* renamed from: i, reason: collision with root package name */
    public final C0515af f7894i;

    /* renamed from: j, reason: collision with root package name */
    public final P f7895j;

    /* renamed from: k, reason: collision with root package name */
    public final K3 f7896k;

    /* renamed from: l, reason: collision with root package name */
    public final E6 f7897l;

    /* renamed from: m, reason: collision with root package name */
    public final C0510aa f7898m;

    /* renamed from: n, reason: collision with root package name */
    public final Z9 f7899n;

    /* renamed from: o, reason: collision with root package name */
    public final C0963ro f7900o;

    public C0522am(Context context, C0515af c0515af) {
        this(c0515af, new P(), new K3(), C0736j4.l().a(context), new E6(), new C0510aa(), new Z9(), new C0963ro());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r8.f7892g != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a(List list) {
        boolean z;
        boolean z5;
        try {
            Set other = AbstractC0677gm.f8292a;
            kotlin.jvm.internal.i.e(list, "<this>");
            kotlin.jvm.internal.i.e(other, "other");
            Set W02 = AbstractC0465j.W0(list);
            W02.retainAll(other);
            boolean a6 = a(W02);
            Iterator it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    z5 = false;
                    break;
                }
                if (this.f7886a.contains((String) it.next())) {
                    z5 = true;
                    break;
                }
            }
            boolean z6 = AbstractC0677gm.f8293b.currentTimeSeconds() > this.f7893h;
            if (a6 && !z5 && !z6) {
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
        this.f7887b.put("appmetrica_clids", identifiersResult);
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            C0963ro c0963ro = this.f7900o;
            String str = identifiersResult.id;
            c0963ro.getClass();
            if (C0963ro.a(str)) {
                this.f7887b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        C0562ca c0562ca;
        C0515af d6 = this.f7894i.i((IdentifiersResult) this.f7887b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.f7887b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.f7887b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((IdentifiersResult) this.f7887b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.f7887b.get("appmetrica_report_ad_url")).e(this.f7891f).h((IdentifiersResult) this.f7887b.get("appmetrica_clids")).j(Jm.a((Map) this.f7890e)).f((IdentifiersResult) this.f7887b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.f7887b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.f7887b.get("appmetrica_yandex_adv_id")).b(this.f7892g).c(this.f7897l.f6740d).d(this.f7893h);
        C0510aa c0510aa = this.f7898m;
        synchronized (c0510aa) {
            c0562ca = c0510aa.f7842b;
        }
        d6.a(c0562ca).b();
    }

    public C0522am(C0515af c0515af, P p5, K3 k3, Cd cd, E6 e6, C0510aa c0510aa, Z9 z9, C0963ro c0963ro) {
        HashSet hashSet = new HashSet();
        this.f7886a = hashSet;
        this.f7887b = new HashMap();
        this.f7888c = new Xl();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.f7894i = c0515af;
        this.f7895j = p5;
        this.f7896k = k3;
        this.f7897l = e6;
        this.f7898m = c0510aa;
        this.f7899n = z9;
        this.f7900o = c0963ro;
        c(cd.a());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, c0515af.j());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, c0515af.i());
        a("appmetrica_get_ad_url", c0515af.d());
        a("appmetrica_report_ad_url", c0515af.e());
        b(c0515af.o());
        a("appmetrica_google_adv_id", c0515af.l());
        a("appmetrica_huawei_oaid", c0515af.m());
        a("appmetrica_yandex_adv_id", c0515af.r());
        e6.a(c0515af.h());
        c0510aa.a(c0515af.k());
        this.f7889d = c0515af.g();
        String i2 = c0515af.i((String) null);
        this.f7890e = i2 != null ? Jm.a(i2) : null;
        this.f7892g = c0515af.a(true);
        this.f7891f = c0515af.b(0L);
        this.f7893h = c0515af.n();
        c();
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f7887b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.id.isEmpty()) {
            return AbstractC0860no.a((Map) this.f7890e);
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
        this.f7887b.put(str, identifiersResult);
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.f7887b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.f7897l.f6739c.get(str2);
                }
                if (identifiersResult == null) {
                    C0562ca c0562ca = this.f7898m.f7842b;
                    if (!kotlin.jvm.internal.i.a(str2, "appmetrica_lib_ssl_enabled") || (bool = c0562ca.f7988a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean booleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = c0562ca.f7989b;
                        String str3 = c0562ca.f7990c;
                        if (booleanValue) {
                            str = "true";
                        } else if (!booleanValue) {
                            str = "false";
                        } else {
                            throw new C1.b();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.f7892g || a(identifiersResult) || (identifiersResult.id.isEmpty() && !AbstractC0860no.a((Map) this.f7890e))) {
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

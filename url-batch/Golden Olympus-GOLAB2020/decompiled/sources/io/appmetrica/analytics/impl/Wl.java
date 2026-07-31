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
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Wl {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f38488a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f38489b;

    /* renamed from: c, reason: collision with root package name */
    public final Tl f38490c;

    /* renamed from: d, reason: collision with root package name */
    public List f38491d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f38492e;

    /* renamed from: f, reason: collision with root package name */
    public long f38493f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f38494g;

    /* renamed from: h, reason: collision with root package name */
    public long f38495h;

    /* renamed from: i, reason: collision with root package name */
    public final C2730jf f38496i;

    /* renamed from: j, reason: collision with root package name */
    public final O f38497j;

    /* renamed from: k, reason: collision with root package name */
    public final Y3 f38498k;

    /* renamed from: l, reason: collision with root package name */
    public final S6 f38499l;

    /* renamed from: m, reason: collision with root package name */
    public final C2855oa f38500m;

    /* renamed from: n, reason: collision with root package name */
    public final C2829na f38501n;

    /* renamed from: o, reason: collision with root package name */
    public final C2817mo f38502o;

    public Wl(Context context, C2730jf c2730jf) {
        this(c2730jf, new O(), new Y3(), C3082x4.l().a(context), new S6(), new C2855oa(), new C2829na(), new C2817mo());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r8.f38494g != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a(List list) {
        boolean z4;
        boolean z5;
        try {
            boolean a4 = a(CollectionsKt.intersect(list, AbstractC2553cm.f38791a));
            Iterator it = list.iterator();
            while (true) {
                z4 = false;
                if (!it.hasNext()) {
                    z5 = false;
                    break;
                }
                if (this.f38488a.contains((String) it.next())) {
                    z5 = true;
                    break;
                }
            }
            boolean z6 = AbstractC2553cm.f38792b.currentTimeSeconds() > this.f38495h;
            if (a4 && !z5 && !z6) {
            }
            z4 = true;
        } finally {
        }
        return z4;
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.f38489b.put("appmetrica_clids", identifiersResult);
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            C2817mo c2817mo = this.f38502o;
            String str = identifiersResult.id;
            c2817mo.getClass();
            if (C2817mo.a(str)) {
                this.f38489b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        C2907qa c2907qa;
        C2730jf d4 = this.f38496i.i((IdentifiersResult) this.f38489b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.f38489b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.f38489b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((IdentifiersResult) this.f38489b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.f38489b.get("appmetrica_report_ad_url")).e(this.f38493f).h((IdentifiersResult) this.f38489b.get("appmetrica_clids")).j(Gm.a((Map) this.f38492e)).f((IdentifiersResult) this.f38489b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.f38489b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.f38489b.get("appmetrica_yandex_adv_id")).b(this.f38494g).c(this.f38499l.f38245d).d(this.f38495h);
        C2855oa c2855oa = this.f38500m;
        synchronized (c2855oa) {
            c2907qa = c2855oa.f39568b;
        }
        d4.a(c2907qa).b();
    }

    public Wl(C2730jf c2730jf, O o4, Y3 y32, Kd kd, S6 s6, C2855oa c2855oa, C2829na c2829na, C2817mo c2817mo) {
        HashSet hashSet = new HashSet();
        this.f38488a = hashSet;
        this.f38489b = new HashMap();
        this.f38490c = new Tl();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.f38496i = c2730jf;
        this.f38497j = o4;
        this.f38498k = y32;
        this.f38499l = s6;
        this.f38500m = c2855oa;
        this.f38501n = c2829na;
        this.f38502o = c2817mo;
        c(kd.a());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, c2730jf.j());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, c2730jf.i());
        a("appmetrica_get_ad_url", c2730jf.d());
        a("appmetrica_report_ad_url", c2730jf.e());
        b(c2730jf.o());
        a("appmetrica_google_adv_id", c2730jf.l());
        a("appmetrica_huawei_oaid", c2730jf.m());
        a("appmetrica_yandex_adv_id", c2730jf.r());
        s6.a(c2730jf.h());
        c2855oa.a(c2730jf.k());
        this.f38491d = c2730jf.g();
        String i4 = c2730jf.i((String) null);
        this.f38492e = i4 != null ? Gm.a(i4) : null;
        this.f38494g = c2730jf.a(true);
        this.f38493f = c2730jf.b(0L);
        this.f38495h = c2730jf.n();
        c();
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f38489b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.id.isEmpty()) {
            return AbstractC2713io.a((Map) this.f38492e);
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
        this.f38489b.put(str, identifiersResult);
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.f38489b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.f38499l.f38244c.get(str2);
                }
                if (identifiersResult == null) {
                    C2907qa c2907qa = this.f38500m.f39568b;
                    if (!Intrinsics.areEqual(str2, "appmetrica_lib_ssl_enabled") || (bool = c2907qa.f39652a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean booleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = c2907qa.f39653b;
                        String str3 = c2907qa.f39654c;
                        if (booleanValue) {
                            str = com.ironsource.mediationsdk.metadata.a.f17681g;
                        } else if (!booleanValue) {
                            str = "false";
                        } else {
                            throw new W1.m();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.f38494g || a(identifiersResult) || (identifiersResult.id.isEmpty() && !AbstractC2713io.a((Map) this.f38492e))) {
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

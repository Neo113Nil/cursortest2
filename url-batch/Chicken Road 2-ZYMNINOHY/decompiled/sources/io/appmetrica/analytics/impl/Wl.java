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

/* loaded from: classes.dex */
public final class Wl {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f11201a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f11202b;

    /* renamed from: c, reason: collision with root package name */
    public final Tl f11203c;

    /* renamed from: d, reason: collision with root package name */
    public List f11204d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f11205e;

    /* renamed from: f, reason: collision with root package name */
    public long f11206f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11207g;

    /* renamed from: h, reason: collision with root package name */
    public long f11208h;

    /* renamed from: i, reason: collision with root package name */
    public final Ve f11209i;

    /* renamed from: j, reason: collision with root package name */
    public final P f11210j;

    /* renamed from: k, reason: collision with root package name */
    public final C3 f11211k;

    /* renamed from: l, reason: collision with root package name */
    public final C1072x6 f11212l;

    /* renamed from: m, reason: collision with root package name */
    public final T9 f11213m;
    public final S9 n;
    public final C0883po o;

    public Wl(Context context, Ve ve) {
        this(ve, new P(), new C3(), C0501b4.l().a(context), new C1072x6(), new T9(), new S9(), new C0883po());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r8.f11207g != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a(List list) {
        boolean z;
        boolean z4;
        try {
            Set other = AbstractC0545cm.f11632a;
            kotlin.jvm.internal.i.e(list, "<this>");
            kotlin.jvm.internal.i.e(other, "other");
            LinkedHashSet linkedHashSet = new LinkedHashSet(list);
            linkedHashSet.retainAll(other);
            boolean a3 = a(linkedHashSet);
            Iterator it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    z4 = false;
                    break;
                }
                if (this.f11201a.contains((String) it.next())) {
                    z4 = true;
                    break;
                }
            }
            boolean z5 = AbstractC0545cm.f11633b.currentTimeSeconds() > this.f11208h;
            if (a3 && !z4 && !z5) {
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
        this.f11202b.put("appmetrica_clids", identifiersResult);
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            C0883po c0883po = this.o;
            String str = identifiersResult.id;
            c0883po.getClass();
            if (C0883po.a(str)) {
                this.f11202b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        V9 v9;
        Ve d4 = this.f11209i.i((IdentifiersResult) this.f11202b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.f11202b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.f11202b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((IdentifiersResult) this.f11202b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.f11202b.get("appmetrica_report_ad_url")).e(this.f11206f).h((IdentifiersResult) this.f11202b.get("appmetrica_clids")).j(Fm.a((Map) this.f11205e)).f((IdentifiersResult) this.f11202b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.f11202b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.f11202b.get("appmetrica_yandex_adv_id")).b(this.f11207g).c(this.f11212l.f13017d).d(this.f11208h);
        T9 t9 = this.f11213m;
        synchronized (t9) {
            v9 = t9.f10989b;
        }
        d4.a(v9).b();
    }

    public Wl(Ve ve, P p2, C3 c32, C1027vd c1027vd, C1072x6 c1072x6, T9 t9, S9 s9, C0883po c0883po) {
        HashSet hashSet = new HashSet();
        this.f11201a = hashSet;
        this.f11202b = new HashMap();
        this.f11203c = new Tl();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.f11209i = ve;
        this.f11210j = p2;
        this.f11211k = c32;
        this.f11212l = c1072x6;
        this.f11213m = t9;
        this.n = s9;
        this.o = c0883po;
        c(c1027vd.a());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, ve.j());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, ve.i());
        a("appmetrica_get_ad_url", ve.d());
        a("appmetrica_report_ad_url", ve.e());
        b(ve.o());
        a("appmetrica_google_adv_id", ve.l());
        a("appmetrica_huawei_oaid", ve.m());
        a("appmetrica_yandex_adv_id", ve.r());
        c1072x6.a(ve.h());
        t9.a(ve.k());
        this.f11204d = ve.g();
        String i4 = ve.i((String) null);
        this.f11205e = i4 != null ? Fm.a(i4) : null;
        this.f11207g = ve.a(true);
        this.f11206f = ve.b(0L);
        this.f11208h = ve.n();
        c();
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f11202b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.id.isEmpty()) {
            return AbstractC0779lo.a((Map) this.f11205e);
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
        this.f11202b.put(str, identifiersResult);
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.f11202b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.f11212l.f13016c.get(str2);
                }
                if (identifiersResult == null) {
                    V9 v9 = this.f11213m.f10989b;
                    if (!kotlin.jvm.internal.i.a(str2, "appmetrica_lib_ssl_enabled") || (bool = v9.f11110a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean booleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = v9.f11111b;
                        String str3 = v9.f11112c;
                        if (booleanValue) {
                            str = "true";
                        } else if (!booleanValue) {
                            str = "false";
                        } else {
                            throw new G1.a();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.f11207g || a(identifiersResult) || (identifiersResult.id.isEmpty() && !AbstractC0779lo.a((Map) this.f11205e))) {
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

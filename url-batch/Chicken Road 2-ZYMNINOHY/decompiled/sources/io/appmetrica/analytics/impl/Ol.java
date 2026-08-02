package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Ol implements Pl {

    /* renamed from: k, reason: collision with root package name */
    public static final Map f10767k = Collections.unmodifiableMap(new Ll());

    /* renamed from: a, reason: collision with root package name */
    public final List f10768a;

    /* renamed from: b, reason: collision with root package name */
    public final C1058wi f10769b;

    /* renamed from: c, reason: collision with root package name */
    public final Wl f10770c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f10771d;

    /* renamed from: e, reason: collision with root package name */
    public PublicLogger f10772e;

    /* renamed from: f, reason: collision with root package name */
    public final Ml f10773f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10774g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f10775h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f10776i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10777j;

    public Ol(Context context, C1058wi c1058wi, Ve ve, Handler handler) {
        this(c1058wi, new Wl(context, ve), handler);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List<String> list, Map<String, String> map) {
        synchronized (this.f10774g) {
            try {
                Wl wl = this.f10770c;
                wl.getClass();
                if (!AbstractC0779lo.a((Map) map) && !AbstractC0779lo.a(map, wl.f11205e)) {
                    wl.f11205e = new HashMap(map);
                    wl.f11207g = true;
                    wl.c();
                }
                a(startupParamsCallback, list);
                if (this.f10770c.a((List) list)) {
                    a(list, new Nl(this, startupParamsCallback), map, true);
                } else {
                    a(new Bundle(), startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b4 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Bundle bundle) {
        HashMap hashMap;
        HashMap a3;
        IdentifiersResult a4 = S3.a(bundle, "Uuid");
        IdentifiersResult a5 = S3.a(bundle, "DeviceId");
        IdentifiersResult a6 = S3.a(bundle, "DeviceIdHash");
        IdentifiersResult a7 = S3.a(bundle, "AdUrlReport");
        IdentifiersResult a8 = S3.a(bundle, "AdUrlGet");
        IdentifiersResult a9 = S3.a(bundle, "Clids");
        IdentifiersResult a10 = S3.a(bundle, "RequestClids");
        IdentifiersResult a11 = S3.a(bundle, "GAID");
        IdentifiersResult a12 = S3.a(bundle, "HOAID");
        IdentifiersResult a13 = S3.a(bundle, "YANDEX_ADV_ID");
        IdentifiersResult a14 = S3.a(bundle, "CUSTOM_SDK_HOSTS");
        long j4 = bundle.getLong("ServerTimeOffset");
        long j5 = bundle.getLong("NextStartupTime");
        V9 a15 = S3.a(bundle);
        Bundle bundle2 = bundle.getBundle("module_configs");
        Wl wl = this.f10770c;
        synchronized (wl) {
            try {
                IdentifiersResult identifiersResult = (IdentifiersResult) wl.f11202b.get(StartupParamsCallback.APPMETRICA_UUID);
                if (identifiersResult != null) {
                    C0883po c0883po = wl.o;
                    String str = identifiersResult.id;
                    c0883po.getClass();
                    if (C0883po.a(str)) {
                        wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a5);
                        wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a6);
                        wl.f11202b.put("appmetrica_google_adv_id", a11);
                        wl.f11202b.put("appmetrica_huawei_oaid", a12);
                        wl.f11202b.put("appmetrica_yandex_adv_id", a13);
                        wl.f11212l.a(a14);
                        wl.f11213m.a(a15);
                        if (!Wl.a(a8)) {
                            wl.f11202b.put("appmetrica_get_ad_url", a8);
                        }
                        if (!Wl.a(a7)) {
                            wl.f11202b.put("appmetrica_report_ad_url", a7);
                        }
                        wl.f11206f = j4;
                        C3 c32 = wl.f11211k;
                        hashMap = wl.f11205e;
                        a3 = AbstractC0637gb.a(a10.id);
                        c32.getClass();
                        if (!AbstractC0779lo.a((Map) hashMap) ? AbstractC0779lo.a((Map) a3) : hashMap.equals(a3)) {
                            wl.f11202b.put("appmetrica_clids", a9);
                            wl.f11207g = false;
                        }
                        wl.f11208h = j5;
                        wl.c();
                    }
                }
                wl.c(a4);
                wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a5);
                wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a6);
                wl.f11202b.put("appmetrica_google_adv_id", a11);
                wl.f11202b.put("appmetrica_huawei_oaid", a12);
                wl.f11202b.put("appmetrica_yandex_adv_id", a13);
                wl.f11212l.a(a14);
                wl.f11213m.a(a15);
                if (!Wl.a(a8)) {
                }
                if (!Wl.a(a7)) {
                }
                wl.f11206f = j4;
                C3 c322 = wl.f11211k;
                hashMap = wl.f11205e;
                a3 = AbstractC0637gb.a(a10.id);
                c322.getClass();
                if (!AbstractC0779lo.a((Map) hashMap) ? AbstractC0779lo.a((Map) a3) : hashMap.equals(a3)) {
                }
                wl.f11208h = j5;
                wl.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        C0501b4.l().m().a(bundle2, new SdkIdentifiers(a4.id, a5.id, a6.id));
        h();
    }

    public final A6 c() {
        return this.f10773f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f10770c.f11202b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final X9 e() {
        V9 v9;
        Wl wl = this.f10770c;
        S9 s9 = wl.n;
        T9 t9 = wl.f11213m;
        synchronized (t9) {
            v9 = t9.f10989b;
        }
        s9.getClass();
        Boolean bool = v9.f11110a;
        return new X9();
    }

    public final long f() {
        return this.f10770c.f11206f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f10770c.f11202b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f10775h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f10770c.a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    public final void i() {
        synchronized (this.f10774g) {
            try {
                if (this.f10777j) {
                    if (this.f10770c.b()) {
                    }
                }
                this.f10777j = true;
                a(this.f10768a, this.f10773f, this.f10776i, false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Ol(C1058wi c1058wi, Wl wl, Handler handler) {
        this.f10768a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f10774g = new Object();
        this.f10775h = new WeakHashMap();
        this.f10777j = false;
        this.f10769b = c1058wi;
        this.f10770c = wl;
        this.f10771d = handler;
        this.f10773f = new Ml(this);
    }

    public final void a(Bundle bundle) {
        b(bundle, null);
    }

    public final void a(PublicLogger publicLogger) {
        this.f10772e = publicLogger;
    }

    public final void a(List list, A6 a6, Map map, boolean z) {
        B6 b6 = new B6(this.f10771d, a6);
        C1058wi c1058wi = this.f10769b;
        c1058wi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new Xa(b6, list, map, z));
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC1049w9.f12924a;
        M3 m32 = new M3("", "", 1536, 0, anonymousInstance);
        m32.f10806m = bundle;
        F4 f4 = c1058wi.f12944a;
        c1058wi.a(C1058wi.a(m32, f4), f4, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (AbstractC0779lo.a((Map) map)) {
            return;
        }
        synchronized (this.f10774g) {
            try {
                HashMap b4 = Fm.b(map);
                this.f10776i = b4;
                this.f10769b.a(b4);
                Wl wl = this.f10770c;
                wl.getClass();
                if (!AbstractC0779lo.a((Map) b4) && !AbstractC0779lo.a(b4, wl.f11205e)) {
                    wl.f11205e = new HashMap(b4);
                    wl.f11207g = true;
                    wl.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str) {
        synchronized (this.f10774g) {
            this.f10769b.a(str);
        }
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        Jl jl;
        if (this.f10775h.containsKey(startupParamsCallback)) {
            List list = (List) this.f10775h.get(startupParamsCallback);
            if (this.f10770c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i4 = bundle.getInt("startup_error_key_code");
                    jl = Jl.UNKNOWN;
                    if (i4 == 1) {
                        jl = Jl.NETWORK;
                    } else if (i4 == 2) {
                        jl = Jl.PARSE;
                    }
                } else {
                    jl = null;
                }
                if (jl == null) {
                    if (!this.f10770c.a()) {
                        PublicLogger publicLogger = this.f10772e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.f10776i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        jl = Jl.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f10767k, jl, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.f10775h.remove(startupParamsCallback);
            if (this.f10775h.isEmpty()) {
                C0859p0 c0859p0 = this.f10769b.f12947d;
                synchronized (c0859p0.f12545f) {
                    c0859p0.f12542c = false;
                    c0859p0.c();
                }
            }
        }
    }

    public final void b(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        synchronized (this.f10774g) {
            try {
                b(bundle);
                h();
                if (startupParamsCallback != null) {
                    a(bundle, startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List<String> list) {
        synchronized (this.f10774g) {
            try {
                List list2 = this.f10770c.f11204d;
                if (AbstractC0779lo.a((Collection) list)) {
                    if (!AbstractC0779lo.a((Collection) list2)) {
                        Wl wl = this.f10770c;
                        wl.f11204d = null;
                        wl.f11209i.a((List<String>) null);
                        this.f10769b.a((List) null);
                    }
                } else if (!AbstractC0779lo.a(list, list2)) {
                    Wl wl2 = this.f10770c;
                    wl2.f11204d = list;
                    wl2.f11209i.a(list);
                    this.f10769b.a(list);
                } else {
                    this.f10769b.a(list2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap hashMap = new HashMap();
        Wl wl = this.f10770c;
        synchronized (wl) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) wl.f11202b.get(str);
                    if (identifiersResult != null) {
                        hashMap.put(str, wl.f11203c.a(identifiersResult));
                    }
                }
                wl.f11212l.a(list, hashMap);
                wl.f11213m.a(list, hashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new StartupParamsCallback.Result(hashMap);
    }

    public final void b(String str) {
        synchronized (this.f10774g) {
            this.f10769b.b(str);
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f10770c.f11202b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.id;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC0637gb.a(str);
        }
        return this.f10776i;
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f10775h.isEmpty()) {
            C0859p0 c0859p0 = this.f10769b.f12947d;
            synchronized (c0859p0.f12545f) {
                c0859p0.f12542c = true;
                c0859p0.b();
            }
        }
        this.f10775h.put(startupParamsCallback, list);
    }

    public final AdvIdentifiersResult a() {
        Wl wl = this.f10770c;
        P p2 = wl.f11210j;
        IdentifiersResult identifiersResult = (IdentifiersResult) wl.f11202b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) wl.f11202b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) wl.f11202b.get("appmetrica_yandex_adv_id");
        p2.getClass();
        return new AdvIdentifiersResult(P.a(identifiersResult), P.a(identifiersResult2), P.a(identifiersResult3));
    }
}

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
public final class Sl implements Tl {

    /* renamed from: k, reason: collision with root package name */
    public static final Map f7479k = Collections.unmodifiableMap(new Pl());

    /* renamed from: a, reason: collision with root package name */
    public final List f7480a;

    /* renamed from: b, reason: collision with root package name */
    public final Bi f7481b;

    /* renamed from: c, reason: collision with root package name */
    public final C0522am f7482c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f7483d;

    /* renamed from: e, reason: collision with root package name */
    public PublicLogger f7484e;

    /* renamed from: f, reason: collision with root package name */
    public final Ql f7485f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7486g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f7487h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f7488i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7489j;

    public Sl(Context context, Bi bi, C0515af c0515af, Handler handler) {
        this(bi, new C0522am(context, c0515af), handler);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List<String> list, Map<String, String> map) {
        synchronized (this.f7486g) {
            try {
                C0522am c0522am = this.f7482c;
                c0522am.getClass();
                if (!AbstractC0860no.a((Map) map) && !AbstractC0860no.a(map, c0522am.f7890e)) {
                    c0522am.f7890e = new HashMap(map);
                    c0522am.f7892g = true;
                    c0522am.c();
                }
                a(startupParamsCallback, list);
                if (this.f7482c.a((List) list)) {
                    a(list, new Rl(this, startupParamsCallback), map, true);
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
        HashMap a6;
        IdentifiersResult a7 = C0504a4.a(bundle, "Uuid");
        IdentifiersResult a8 = C0504a4.a(bundle, "DeviceId");
        IdentifiersResult a9 = C0504a4.a(bundle, "DeviceIdHash");
        IdentifiersResult a10 = C0504a4.a(bundle, "AdUrlReport");
        IdentifiersResult a11 = C0504a4.a(bundle, "AdUrlGet");
        IdentifiersResult a12 = C0504a4.a(bundle, "Clids");
        IdentifiersResult a13 = C0504a4.a(bundle, "RequestClids");
        IdentifiersResult a14 = C0504a4.a(bundle, "GAID");
        IdentifiersResult a15 = C0504a4.a(bundle, "HOAID");
        IdentifiersResult a16 = C0504a4.a(bundle, "YANDEX_ADV_ID");
        IdentifiersResult a17 = C0504a4.a(bundle, "CUSTOM_SDK_HOSTS");
        long j2 = bundle.getLong("ServerTimeOffset");
        long j6 = bundle.getLong("NextStartupTime");
        C0562ca a18 = C0504a4.a(bundle);
        Bundle bundle2 = bundle.getBundle("module_configs");
        C0522am c0522am = this.f7482c;
        synchronized (c0522am) {
            try {
                IdentifiersResult identifiersResult = (IdentifiersResult) c0522am.f7887b.get(StartupParamsCallback.APPMETRICA_UUID);
                if (identifiersResult != null) {
                    C0963ro c0963ro = c0522am.f7900o;
                    String str = identifiersResult.id;
                    c0963ro.getClass();
                    if (C0963ro.a(str)) {
                        c0522am.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a8);
                        c0522am.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a9);
                        c0522am.f7887b.put("appmetrica_google_adv_id", a14);
                        c0522am.f7887b.put("appmetrica_huawei_oaid", a15);
                        c0522am.f7887b.put("appmetrica_yandex_adv_id", a16);
                        c0522am.f7897l.a(a17);
                        c0522am.f7898m.a(a18);
                        if (!C0522am.a(a11)) {
                            c0522am.f7887b.put("appmetrica_get_ad_url", a11);
                        }
                        if (!C0522am.a(a10)) {
                            c0522am.f7887b.put("appmetrica_report_ad_url", a10);
                        }
                        c0522am.f7891f = j2;
                        K3 k3 = c0522am.f7896k;
                        hashMap = c0522am.f7890e;
                        a6 = AbstractC0847nb.a(a13.id);
                        k3.getClass();
                        if (!AbstractC0860no.a((Map) hashMap) ? AbstractC0860no.a((Map) a6) : hashMap.equals(a6)) {
                            c0522am.f7887b.put("appmetrica_clids", a12);
                            c0522am.f7892g = false;
                        }
                        c0522am.f7893h = j6;
                        c0522am.c();
                    }
                }
                c0522am.c(a7);
                c0522am.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a8);
                c0522am.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a9);
                c0522am.f7887b.put("appmetrica_google_adv_id", a14);
                c0522am.f7887b.put("appmetrica_huawei_oaid", a15);
                c0522am.f7887b.put("appmetrica_yandex_adv_id", a16);
                c0522am.f7897l.a(a17);
                c0522am.f7898m.a(a18);
                if (!C0522am.a(a11)) {
                }
                if (!C0522am.a(a10)) {
                }
                c0522am.f7891f = j2;
                K3 k32 = c0522am.f7896k;
                hashMap = c0522am.f7890e;
                a6 = AbstractC0847nb.a(a13.id);
                k32.getClass();
                if (!AbstractC0860no.a((Map) hashMap) ? AbstractC0860no.a((Map) a6) : hashMap.equals(a6)) {
                }
                c0522am.f7893h = j6;
                c0522am.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        C0736j4.l().m().a(bundle2, new SdkIdentifiers(a7.id, a8.id, a9.id));
        h();
    }

    public final H6 c() {
        return this.f7485f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f7482c.f7887b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final C0613ea e() {
        C0562ca c0562ca;
        C0522am c0522am = this.f7482c;
        Z9 z9 = c0522am.f7899n;
        C0510aa c0510aa = c0522am.f7898m;
        synchronized (c0510aa) {
            c0562ca = c0510aa.f7842b;
        }
        z9.getClass();
        Boolean bool = c0562ca.f7988a;
        return new C0613ea();
    }

    public final long f() {
        return this.f7482c.f7891f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f7482c.f7887b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f7487h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f7482c.a((Collection) list)) {
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
        synchronized (this.f7486g) {
            try {
                if (this.f7489j) {
                    if (this.f7482c.b()) {
                    }
                }
                this.f7489j = true;
                a(this.f7480a, this.f7485f, this.f7488i, false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Sl(Bi bi, C0522am c0522am, Handler handler) {
        this.f7480a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f7486g = new Object();
        this.f7487h = new WeakHashMap();
        this.f7489j = false;
        this.f7481b = bi;
        this.f7482c = c0522am;
        this.f7483d = handler;
        this.f7485f = new Ql(this);
    }

    public final void a(Bundle bundle) {
        b(bundle, null);
    }

    public final void a(PublicLogger publicLogger) {
        this.f7484e = publicLogger;
    }

    public final void a(List list, H6 h6, Map map, boolean z) {
        I6 i6 = new I6(this.f7483d, h6);
        Bi bi = this.f7481b;
        bi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new C0614eb(i6, list, map, z));
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = D9.f6670a;
        U3 u32 = new U3("", "", 1536, 0, anonymousInstance);
        u32.f7660m = bundle;
        M4 m42 = bi.f6605a;
        bi.a(Bi.a(u32, m42), m42, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (AbstractC0860no.a((Map) map)) {
            return;
        }
        synchronized (this.f7486g) {
            try {
                HashMap b6 = Jm.b(map);
                this.f7488i = b6;
                this.f7481b.a(b6);
                C0522am c0522am = this.f7482c;
                c0522am.getClass();
                if (!AbstractC0860no.a((Map) b6) && !AbstractC0860no.a(b6, c0522am.f7890e)) {
                    c0522am.f7890e = new HashMap(b6);
                    c0522am.f7892g = true;
                    c0522am.c();
                }
            } finally {
            }
        }
    }

    public final void a(String str) {
        synchronized (this.f7486g) {
            this.f7481b.a(str);
        }
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        Nl nl;
        if (this.f7487h.containsKey(startupParamsCallback)) {
            List list = (List) this.f7487h.get(startupParamsCallback);
            if (this.f7482c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i2 = bundle.getInt("startup_error_key_code");
                    nl = Nl.UNKNOWN;
                    if (i2 == 1) {
                        nl = Nl.NETWORK;
                    } else if (i2 == 2) {
                        nl = Nl.PARSE;
                    }
                } else {
                    nl = null;
                }
                if (nl == null) {
                    if (!this.f7482c.a()) {
                        PublicLogger publicLogger = this.f7484e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.f7488i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        nl = Nl.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f7479k, nl, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.f7487h.remove(startupParamsCallback);
            if (this.f7487h.isEmpty()) {
                C0888p0 c0888p0 = this.f7481b.f6608d;
                synchronized (c0888p0.f8969f) {
                    c0888p0.f8966c = false;
                    c0888p0.c();
                }
            }
        }
    }

    public final void b(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        synchronized (this.f7486g) {
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
        synchronized (this.f7486g) {
            try {
                List list2 = this.f7482c.f7889d;
                if (AbstractC0860no.a((Collection) list)) {
                    if (!AbstractC0860no.a((Collection) list2)) {
                        C0522am c0522am = this.f7482c;
                        c0522am.f7889d = null;
                        c0522am.f7894i.a((List<String>) null);
                        this.f7481b.a((List) null);
                    }
                } else if (!AbstractC0860no.a(list, list2)) {
                    C0522am c0522am2 = this.f7482c;
                    c0522am2.f7889d = list;
                    c0522am2.f7894i.a(list);
                    this.f7481b.a(list);
                } else {
                    this.f7481b.a(list2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap hashMap = new HashMap();
        C0522am c0522am = this.f7482c;
        synchronized (c0522am) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) c0522am.f7887b.get(str);
                    if (identifiersResult != null) {
                        hashMap.put(str, c0522am.f7888c.a(identifiersResult));
                    }
                }
                c0522am.f7897l.a(list, hashMap);
                c0522am.f7898m.a(list, hashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new StartupParamsCallback.Result(hashMap);
    }

    public final void b(String str) {
        synchronized (this.f7486g) {
            this.f7481b.b(str);
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f7482c.f7887b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.id;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC0847nb.a(str);
        }
        return this.f7488i;
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f7487h.isEmpty()) {
            C0888p0 c0888p0 = this.f7481b.f6608d;
            synchronized (c0888p0.f8969f) {
                c0888p0.f8966c = true;
                c0888p0.b();
            }
        }
        this.f7487h.put(startupParamsCallback, list);
    }

    public final AdvIdentifiersResult a() {
        C0522am c0522am = this.f7482c;
        P p5 = c0522am.f7895j;
        IdentifiersResult identifiersResult = (IdentifiersResult) c0522am.f7887b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) c0522am.f7887b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) c0522am.f7887b.get("appmetrica_yandex_adv_id");
        p5.getClass();
        return new AdvIdentifiersResult(P.a(identifiersResult), P.a(identifiersResult2), P.a(identifiersResult3));
    }
}

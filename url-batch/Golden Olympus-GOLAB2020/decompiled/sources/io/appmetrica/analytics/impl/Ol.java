package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
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

/* loaded from: classes3.dex */
public final class Ol implements Pl {

    /* renamed from: k, reason: collision with root package name */
    public static final Map f38092k = Collections.unmodifiableMap(new Ll());

    /* renamed from: a, reason: collision with root package name */
    public final List f38093a;

    /* renamed from: b, reason: collision with root package name */
    public final Ji f38094b;

    /* renamed from: c, reason: collision with root package name */
    public final Wl f38095c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f38096d;

    /* renamed from: e, reason: collision with root package name */
    public PublicLogger f38097e;

    /* renamed from: f, reason: collision with root package name */
    public final Ml f38098f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f38099g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f38100h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f38101i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f38102j;

    public Ol(@NonNull Context context, Ji ji, C2730jf c2730jf, @NonNull Handler handler) {
        this(ji, new Wl(context, c2730jf), handler);
    }

    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list, Map<String, String> map) {
        synchronized (this.f38099g) {
            try {
                Wl wl = this.f38095c;
                wl.getClass();
                if (!AbstractC2713io.a((Map) map) && !AbstractC2713io.a(map, wl.f38492e)) {
                    wl.f38492e = new HashMap(map);
                    wl.f38494g = true;
                    wl.c();
                }
                a(startupParamsCallback, list);
                if (this.f38095c.a((List) list)) {
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
        HashMap a4;
        IdentifiersResult a5 = C2849o4.a(bundle, "Uuid");
        IdentifiersResult a6 = C2849o4.a(bundle, "DeviceId");
        IdentifiersResult a7 = C2849o4.a(bundle, "DeviceIdHash");
        IdentifiersResult a8 = C2849o4.a(bundle, "AdUrlReport");
        IdentifiersResult a9 = C2849o4.a(bundle, "AdUrlGet");
        IdentifiersResult a10 = C2849o4.a(bundle, "Clids");
        IdentifiersResult a11 = C2849o4.a(bundle, "RequestClids");
        IdentifiersResult a12 = C2849o4.a(bundle, IronSourceConstants.TYPE_GAID);
        IdentifiersResult a13 = C2849o4.a(bundle, "HOAID");
        IdentifiersResult a14 = C2849o4.a(bundle, "YANDEX_ADV_ID");
        IdentifiersResult a15 = C2849o4.a(bundle, "CUSTOM_SDK_HOSTS");
        long j4 = bundle.getLong("ServerTimeOffset");
        long j5 = bundle.getLong("NextStartupTime");
        C2907qa a16 = C2849o4.a(bundle);
        Bundle bundle2 = bundle.getBundle("module_configs");
        Wl wl = this.f38095c;
        synchronized (wl) {
            try {
                IdentifiersResult identifiersResult = (IdentifiersResult) wl.f38489b.get(StartupParamsCallback.APPMETRICA_UUID);
                if (identifiersResult != null) {
                    C2817mo c2817mo = wl.f38502o;
                    String str = identifiersResult.id;
                    c2817mo.getClass();
                    if (C2817mo.a(str)) {
                        wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a6);
                        wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a7);
                        wl.f38489b.put("appmetrica_google_adv_id", a12);
                        wl.f38489b.put("appmetrica_huawei_oaid", a13);
                        wl.f38489b.put("appmetrica_yandex_adv_id", a14);
                        wl.f38499l.a(a15);
                        wl.f38500m.a(a16);
                        if (!Wl.a(a9)) {
                            wl.f38489b.put("appmetrica_get_ad_url", a9);
                        }
                        if (!Wl.a(a8)) {
                            wl.f38489b.put("appmetrica_report_ad_url", a8);
                        }
                        wl.f38493f = j4;
                        Y3 y32 = wl.f38498k;
                        hashMap = wl.f38492e;
                        a4 = Bb.a(a11.id);
                        y32.getClass();
                        if (!AbstractC2713io.a((Map) hashMap) ? AbstractC2713io.a((Map) a4) : hashMap.equals(a4)) {
                            wl.f38489b.put("appmetrica_clids", a10);
                            wl.f38494g = false;
                        }
                        wl.f38495h = j5;
                        wl.c();
                    }
                }
                wl.c(a5);
                wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a6);
                wl.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a7);
                wl.f38489b.put("appmetrica_google_adv_id", a12);
                wl.f38489b.put("appmetrica_huawei_oaid", a13);
                wl.f38489b.put("appmetrica_yandex_adv_id", a14);
                wl.f38499l.a(a15);
                wl.f38500m.a(a16);
                if (!Wl.a(a9)) {
                }
                if (!Wl.a(a8)) {
                }
                wl.f38493f = j4;
                Y3 y322 = wl.f38498k;
                hashMap = wl.f38492e;
                a4 = Bb.a(a11.id);
                y322.getClass();
                if (!AbstractC2713io.a((Map) hashMap) ? AbstractC2713io.a((Map) a4) : hashMap.equals(a4)) {
                }
                wl.f38495h = j5;
                wl.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        C3082x4.l().m().a(bundle2, new SdkIdentifiers(a5.id, a6.id, a7.id));
        h();
    }

    @NonNull
    public final V6 c() {
        return this.f38098f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f38095c.f38489b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    @NonNull
    public final C2958sa e() {
        C2907qa c2907qa;
        Wl wl = this.f38095c;
        C2829na c2829na = wl.f38501n;
        C2855oa c2855oa = wl.f38500m;
        synchronized (c2855oa) {
            c2907qa = c2855oa.f39568b;
        }
        c2829na.getClass();
        Boolean bool = c2907qa.f39652a;
        return new C2958sa();
    }

    public final long f() {
        return this.f38095c.f38493f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f38095c.f38489b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f38100h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f38095c.a((Collection) list)) {
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
        synchronized (this.f38099g) {
            try {
                if (this.f38102j) {
                    if (this.f38095c.b()) {
                    }
                }
                this.f38102j = true;
                a(this.f38093a, this.f38098f, this.f38101i, false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Ol(Ji ji, Wl wl, Handler handler) {
        this.f38093a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f38099g = new Object();
        this.f38100h = new WeakHashMap();
        this.f38102j = false;
        this.f38094b = ji;
        this.f38095c = wl;
        this.f38096d = handler;
        this.f38098f = new Ml(this);
    }

    public final void a(@NonNull Bundle bundle) {
        b(bundle, null);
    }

    public final void a(@NonNull PublicLogger publicLogger) {
        this.f38097e = publicLogger;
    }

    public final void a(List list, V6 v6, Map map, boolean z4) {
        W6 w6 = new W6(this.f38096d, v6);
        Ji ji = this.f38094b;
        ji.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new C2959sb(w6, list, map, z4));
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = R9.f38186a;
        C2694i4 c2694i4 = new C2694i4("", "", 1536, 0, anonymousInstance);
        c2694i4.f39388m = bundle;
        C2482a5 c2482a5 = ji.f37839a;
        ji.a(Ji.a(c2694i4, c2482a5), c2482a5, 1, null);
    }

    public final void a(Map<String, String> map) {
        if (AbstractC2713io.a((Map) map)) {
            return;
        }
        synchronized (this.f38099g) {
            try {
                HashMap b4 = Gm.b(map);
                this.f38101i = b4;
                this.f38094b.a(b4);
                Wl wl = this.f38095c;
                wl.getClass();
                if (!AbstractC2713io.a((Map) b4) && !AbstractC2713io.a(b4, wl.f38492e)) {
                    wl.f38492e = new HashMap(b4);
                    wl.f38494g = true;
                    wl.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str) {
        synchronized (this.f38099g) {
            this.f38094b.a(str);
        }
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        Jl jl;
        if (this.f38100h.containsKey(startupParamsCallback)) {
            List list = (List) this.f38100h.get(startupParamsCallback);
            if (this.f38095c.a((Collection) list)) {
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
                    if (!this.f38095c.a()) {
                        PublicLogger publicLogger = this.f38097e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.f38101i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        jl = Jl.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f38092k, jl, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.f38100h.remove(startupParamsCallback);
            if (this.f38100h.isEmpty()) {
                C2793m0 c2793m0 = this.f38094b.f37842d;
                synchronized (c2793m0.f39427f) {
                    c2793m0.f39424c = false;
                    c2793m0.c();
                }
            }
        }
    }

    public final void b(@NonNull Bundle bundle, StartupParamsCallback startupParamsCallback) {
        synchronized (this.f38099g) {
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
        synchronized (this.f38099g) {
            try {
                List list2 = this.f38095c.f38491d;
                if (AbstractC2713io.a((Collection) list)) {
                    if (!AbstractC2713io.a((Collection) list2)) {
                        Wl wl = this.f38095c;
                        wl.f38491d = null;
                        wl.f38496i.a((List<String>) null);
                        this.f38094b.a((List) null);
                    }
                } else if (!AbstractC2713io.a(list, list2)) {
                    Wl wl2 = this.f38095c;
                    wl2.f38491d = list;
                    wl2.f38496i.a(list);
                    this.f38094b.a(list);
                } else {
                    this.f38094b.a(list2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap hashMap = new HashMap();
        Wl wl = this.f38095c;
        synchronized (wl) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) wl.f38489b.get(str);
                    if (identifiersResult != null) {
                        hashMap.put(str, wl.f38490c.a(identifiersResult));
                    }
                }
                wl.f38499l.a(list, hashMap);
                wl.f38500m.a(list, hashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new StartupParamsCallback.Result(hashMap);
    }

    public final void b(String str) {
        synchronized (this.f38099g) {
            this.f38094b.b(str);
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f38095c.f38489b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.id;
        if (!TextUtils.isEmpty(str)) {
            return Bb.a(str);
        }
        return this.f38101i;
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f38100h.isEmpty()) {
            C2793m0 c2793m0 = this.f38094b.f37842d;
            synchronized (c2793m0.f39427f) {
                c2793m0.f39424c = true;
                c2793m0.b();
            }
        }
        this.f38100h.put(startupParamsCallback, list);
    }

    @NonNull
    public final AdvIdentifiersResult a() {
        Wl wl = this.f38095c;
        O o4 = wl.f38497j;
        IdentifiersResult identifiersResult = (IdentifiersResult) wl.f38489b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) wl.f38489b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) wl.f38489b.get("appmetrica_yandex_adv_id");
        o4.getClass();
        return new AdvIdentifiersResult(O.a(identifiersResult), O.a(identifiersResult2), O.a(identifiersResult3));
    }
}

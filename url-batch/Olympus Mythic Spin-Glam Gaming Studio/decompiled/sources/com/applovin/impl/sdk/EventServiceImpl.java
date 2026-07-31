package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.i1;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.r6;
import com.applovin.impl.s1;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.u4;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", "paused", "resumed", "cf_start", "tos_ok", "gdpr_ok");
    private final k a;
    private final AtomicBoolean b = new AtomicBoolean();

    public EventServiceImpl(k kVar) {
        this.a = kVar;
    }

    private void a(final String str, final Map map) {
        final boolean contains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        this.a.q0().a((i5) new r6(this.a, contains, "submitTrackEventPostback", new Runnable() { // from class: com.applovin.impl.sdk.EventServiceImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                EventServiceImpl.this.a(str, map, contains);
            }
        }), d6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, Map map, Map map2) {
        Map map3 = CollectionUtils.map("AppLovin-Event", str);
        map3.put("AppLovin-SDK-Name", "AppLovin-MAX");
        d.b d = com.applovin.impl.sdk.network.d.b().d(b()).a(a()).a(map3).c(a(str, map, map2)).a(((Boolean) this.a.a(x4.k5)).booleanValue()).a(u4.a.a(((Integer) this.a.a(x4.v5)).intValue())).d(false);
        if (this.a.s0().c()) {
            d.b(CollectionUtils.map("axon_test_code", "1"));
        }
        this.a.f0().e(d.a());
    }

    private void c(final String str, final Map map, final Map map2) {
        if (map.containsKey("items")) {
            Object obj = map.get("items");
            if (!(obj instanceof List)) {
                a("Invalid 'items' value: expected a list.");
                return;
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Map)) {
                    a("Invalid element in 'items': expected a map.");
                    return;
                }
            }
        }
        this.a.q0().a((i5) new r6(this.a, false, "track_event:" + str, new Runnable() { // from class: com.applovin.impl.sdk.EventServiceImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                EventServiceImpl.this.b(str, map, map2);
            }
        }), d6.b.OTHER);
    }

    private String d() {
        return ((String) this.a.a(x4.p0)) + "4.0/pix";
    }

    public void maybeTrackAppOpenEvent() {
        if (this.b.compareAndSet(false, true)) {
            this.a.F().trackEvent("landing");
        }
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        map2.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    public void trackEventSynchronously(String str) {
        this.a.O();
        if (o.a()) {
            this.a.O().a("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        s1 s1Var = new s1(str, new HashMap());
        boolean contains = this.a.c(x4.z0).contains(s1Var.c());
        Map a = a(s1Var, true, contains);
        HashMap hashMap = new HashMap(s1Var.d());
        if (((Boolean) this.a.a(x4.E5)).booleanValue() || ((Boolean) this.a.a(x4.z5)).booleanValue()) {
            hashMap.putAll(a);
            a = null;
        }
        this.a.f0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).b(a).c(hashMap).a(a(s1Var, contains)).c(((Boolean) this.a.a(x4.O5)).booleanValue()).a(((Boolean) this.a.a(x4.k5)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, ?> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            o.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.a.D().a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent("iap", map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map) {
        trackEvent(str, map, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Map map, boolean z) {
        s1 s1Var = new s1(str, map);
        boolean contains = this.a.c(x4.z0).contains(s1Var.c());
        Map a = a(s1Var, false, contains);
        HashMap hashMap = new HashMap(s1Var.d());
        if (((Boolean) this.a.a(x4.E5)).booleanValue() || ((Boolean) this.a.a(x4.z5)).booleanValue()) {
            hashMap.putAll(a);
            a = null;
        }
        this.a.f0().e(com.applovin.impl.sdk.network.d.b().d(d()).a(c()).a(a(s1Var, contains)).b(a).c(hashMap).c(((Boolean) this.a.a(x4.O5)).booleanValue()).a(((Boolean) this.a.a(x4.k5)).booleanValue()).d(z).a(u4.a.a(((Integer) this.a.a(x4.u5)).intValue())).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, ?> map, Map<String, Object> map2) {
        if (TextUtils.isEmpty(str)) {
            a("Unable to track empty event");
        } else if (this.a.c(x4.A0).contains(str)) {
            c(str, map, map2);
        } else {
            a(str, map);
        }
    }

    private String b() {
        return ((String) this.a.a(x4.r0)) + "v1/app";
    }

    private String c() {
        return ((String) this.a.a(x4.q0)) + "4.0/pix";
    }

    private void a(String str) {
        o.h("AppLovinEventService", str);
        if (n7.c(this.a)) {
            throw new IllegalArgumentException(str);
        }
    }

    private Map a(s1 s1Var, boolean z, boolean z2) {
        Map a = this.a.A().a((Map) null, z, false);
        a.put("event_id", s1Var.b());
        a.put("ts", Long.toString(s1Var.a()));
        if (z2) {
            a.put("event", s1Var.c());
        } else {
            a.put("event", "postinstall");
            a.put("sub_event", s1Var.c());
        }
        return n7.a(a);
    }

    private Map a(s1 s1Var, boolean z) {
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("AppLovin-Event", s1Var.c());
        } else {
            hashMap.put("AppLovin-Event", "postinstall");
            hashMap.put("AppLovin-Sub-Event", s1Var.c());
        }
        return hashMap;
    }

    private Map a(String str, Map map, Map map2) {
        HashMap hashMap = new HashMap();
        s1 s1Var = new s1(str, map);
        hashMap.put("id", s1Var.b());
        hashMap.put("name", s1Var.c());
        hashMap.put("data", s1Var.d());
        hashMap.put("timestamp", i1.a(s1Var.a()));
        Map G = this.a.A().G();
        hashMap.put("app_info", G);
        hashMap.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, this.a.A().p());
        CollectionUtils.putObjectToStringIfValid("dedupe_id", map2.get("dedupe_id"), hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("connectEventKey", this.a.q());
        CollectionUtils.putStringIfValid("eventId", this.a.E(), hashMap2);
        hashMap2.put("version", AppLovinSdk.VERSION);
        hashMap2.put("sdk_key", this.a.i0());
        hashMap2.put("platform", this.a.A().A());
        if (((Boolean) this.a.a(x4.J3)).booleanValue()) {
            CollectionUtils.putStringIfValid("art", this.a.r(), hashMap2);
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("firstVisitTs", G.get("ia_v2"));
        hashMap3.put("lastVisitTs", G.get("last_launch_ms"));
        hashMap3.put("visitCount", G.get("app_launch_count"));
        hashMap3.put("currentVisitStartTs", G.get("alts_ms"));
        hashMap2.put("visitInfo", hashMap3);
        hashMap.put("axon", hashMap2);
        return hashMap;
    }

    private String a() {
        return ((String) this.a.a(x4.s0)) + "v1/app";
    }
}

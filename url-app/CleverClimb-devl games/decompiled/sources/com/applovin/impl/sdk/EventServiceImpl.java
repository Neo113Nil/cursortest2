package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.impl.sdk.d.i;
import com.applovin.impl.sdk.d.q;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.cmplay.base.util.webview.util.WebUtils;
import com.tapjoy.TapjoyConstants;
import com.youappi.sdk.net.model.ProductRequestItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {

    /* renamed from: a, reason: collision with root package name */
    private final j f2866a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f2867b;

    public EventServiceImpl(j jVar) {
        this.f2866a = jVar;
        this.f2867b = com.applovin.impl.sdk.e.c.a((String) jVar.a(com.applovin.impl.sdk.b.b.aF));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        return ((String) this.f2866a.a(com.applovin.impl.sdk.b.b.aA)) + "4.0/pix";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public HashMap<String, String> a(l lVar, k.a aVar) {
        k G = this.f2866a.G();
        k.d a2 = G.a();
        k.b c2 = G.c();
        boolean contains = this.f2867b.contains(lVar.a());
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("event", contains ? com.applovin.impl.sdk.e.i.e(lVar.a()) : "postinstall");
        hashMap.put("ts", Long.toString(lVar.c()));
        hashMap.put(TapjoyConstants.TJC_PLATFORM, com.applovin.impl.sdk.e.i.e(a2.f3313c));
        hashMap.put("model", com.applovin.impl.sdk.e.i.e(a2.f3311a));
        hashMap.put(com.umeng.commonsdk.proguard.d.n, com.applovin.impl.sdk.e.i.e(c2.f3307c));
        hashMap.put("installer_name", com.applovin.impl.sdk.e.i.e(c2.f3308d));
        hashMap.put("ia", Long.toString(c2.f));
        hashMap.put("api_did", this.f2866a.a(com.applovin.impl.sdk.b.b.M));
        hashMap.put("brand", com.applovin.impl.sdk.e.i.e(a2.f3314d));
        hashMap.put("brand_name", com.applovin.impl.sdk.e.i.e(a2.e));
        hashMap.put("hardware", com.applovin.impl.sdk.e.i.e(a2.f));
        hashMap.put("revision", com.applovin.impl.sdk.e.i.e(a2.g));
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        hashMap.put(com.umeng.commonsdk.proguard.d.w, com.applovin.impl.sdk.e.i.e(a2.f3312b));
        hashMap.put("orientation_lock", a2.l);
        hashMap.put("app_version", com.applovin.impl.sdk.e.i.e(c2.f3306b));
        hashMap.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, com.applovin.impl.sdk.e.i.e(a2.i));
        hashMap.put(com.umeng.commonsdk.proguard.d.O, com.applovin.impl.sdk.e.i.e(a2.j));
        hashMap.put("tz_offset", String.valueOf(a2.o));
        hashMap.put("adr", a2.q ? "1" : "0");
        hashMap.put("volume", String.valueOf(a2.s));
        hashMap.put("sim", a2.u ? "1" : "0");
        hashMap.put("gy", String.valueOf(a2.v));
        hashMap.put(ProductRequestItem.Device.TYPE_TV, String.valueOf(a2.w));
        hashMap.put("tg", c2.e);
        hashMap.put("fs", String.valueOf(a2.y));
        if (!((Boolean) this.f2866a.a(com.applovin.impl.sdk.b.b.eU)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f2866a.s());
        }
        a(aVar, hashMap);
        Boolean bool = a2.z;
        if (bool != null) {
            hashMap.put("huc", bool.toString());
        }
        Boolean bool2 = a2.A;
        if (bool2 != null) {
            hashMap.put("aru", bool2.toString());
        }
        k.c cVar = a2.r;
        if (cVar != null) {
            hashMap.put("act", String.valueOf(cVar.f3309a));
            hashMap.put("acm", String.valueOf(cVar.f3310b));
        }
        String str = a2.t;
        if (com.applovin.impl.sdk.e.i.b(str)) {
            hashMap.put("ua", com.applovin.impl.sdk.e.i.e(str));
        }
        String str2 = a2.x;
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("so", com.applovin.impl.sdk.e.i.e(str2));
        }
        if (!contains) {
            hashMap.put("sub_event", com.applovin.impl.sdk.e.i.e(lVar.a()));
        }
        hashMap.put(WebUtils.SC, com.applovin.impl.sdk.e.i.e((String) this.f2866a.a(com.applovin.impl.sdk.b.b.Q)));
        hashMap.put("sc2", com.applovin.impl.sdk.e.i.e((String) this.f2866a.a(com.applovin.impl.sdk.b.b.R)));
        hashMap.put("server_installed_at", com.applovin.impl.sdk.e.i.e((String) this.f2866a.a(com.applovin.impl.sdk.b.b.S)));
        com.applovin.impl.sdk.e.l.a("persisted_data", com.applovin.impl.sdk.e.i.e((String) this.f2866a.a(com.applovin.impl.sdk.b.d.r)), hashMap);
        return hashMap;
    }

    private Map<String, String> a(Map<String, String> map) {
        String obj;
        String obj2;
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if ((key instanceof String) && (value instanceof String)) {
                    obj = key;
                    obj2 = value;
                } else {
                    this.f2866a.u().c("EventServiceImpl", "Unexpected class type in trackEvent(); all keys and values passed as parameters must be String. Encountered " + key.getClass().getCanonicalName() + "/" + value.getClass().getCanonicalName() + "; will use toString() value instead, which may be unexpected...");
                    obj = key.toString();
                    obj2 = value.toString();
                }
                hashMap.put(obj, obj2);
            }
        }
        return hashMap;
    }

    private void a(i.a aVar) {
        this.f2866a.C().a(new com.applovin.impl.sdk.d.i(this.f2866a, aVar), q.a.BACKGROUND);
    }

    private void a(k.a aVar, Map<String, String> map) {
        String str = aVar.f3304b;
        if (com.applovin.impl.sdk.e.i.b(str)) {
            map.put("idfa", str);
        }
        map.put("dnt", Boolean.toString(aVar.f3303a));
    }

    private void a(final l lVar, final boolean z) {
        if (((Boolean) this.f2866a.a(com.applovin.impl.sdk.b.b.aG)).booleanValue()) {
            this.f2866a.u().a("EventServiceImpl", "Tracking event: " + lVar);
            a(new i.a() { // from class: com.applovin.impl.sdk.EventServiceImpl.1
                @Override // com.applovin.impl.sdk.d.i.a
                public void a(k.a aVar) {
                    try {
                        HashMap a2 = EventServiceImpl.this.a(lVar, aVar);
                        Map<String, String> b2 = lVar.b();
                        if (z) {
                            EventServiceImpl.this.f2866a.F().a(com.applovin.impl.sdk.network.e.j().a(EventServiceImpl.this.a()).b(EventServiceImpl.this.b()).a(a2).b(b2).a(((Boolean) EventServiceImpl.this.f2866a.a(com.applovin.impl.sdk.b.b.eU)).booleanValue()).a());
                        } else {
                            EventServiceImpl.this.f2866a.J().dispatchPostbackRequest(com.applovin.impl.sdk.network.f.b(EventServiceImpl.this.f2866a).a(EventServiceImpl.this.a()).c(EventServiceImpl.this.b()).b((Map<String, String>) a2).a(b2 != null ? new JSONObject(b2) : null).a(((Boolean) EventServiceImpl.this.f2866a.a(com.applovin.impl.sdk.b.b.eU)).booleanValue()).a(), null);
                        }
                    } catch (Throwable th) {
                        EventServiceImpl.this.f2866a.u().b("EventServiceImpl", "Unable to track event due to failure to convert event parameters into JSONObject for event: " + lVar, th);
                    }
                }
            });
        }
    }

    private void a(String str, Map<String, String> map, boolean z) {
        a(new l(str, a(map), System.currentTimeMillis(), com.applovin.impl.sdk.e.i.f(UUID.randomUUID().toString())), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        return ((String) this.f2866a.a(com.applovin.impl.sdk.b.b.aB)) + "4.0/pix";
    }

    void a(String str, boolean z) {
        a(str, new HashMap(), z);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        HashMap hashMap = map != null ? new HashMap(map) : new HashMap(1);
        hashMap.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent("checkout", hashMap);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, String> map) {
        a(str, map, true);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        HashMap hashMap = map != null ? new HashMap(map) : new HashMap();
        try {
            hashMap.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            hashMap.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Exception e) {
            this.f2866a.u().c("EventServiceImpl", "Unable to track in app purchase; invalid purchanse intent", e);
        }
        trackEvent("iap", hashMap);
    }
}

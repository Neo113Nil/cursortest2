package com.ironsource.sdk.a;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import com.ironsource.sdk.b;
import com.ironsource.sdk.controller.d;
import com.ironsource.sdk.data.e;
import com.ironsource.sdk.data.h;
import com.ironsource.sdk.e.a.c;
import com.ironsource.sdk.g.e;
import com.ironsource.sdk.g.f;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IronSourceAdsPublisherAgent.java */
/* loaded from: classes2.dex */
public final class a implements b, com.ironsource.sdk.e.a.a, com.ironsource.sdk.e.a.b, c {

    /* renamed from: a, reason: collision with root package name */
    private static a f6998a;

    /* renamed from: d, reason: collision with root package name */
    private static MutableContextWrapper f6999d;

    /* renamed from: b, reason: collision with root package name */
    private com.ironsource.sdk.controller.c f7000b;

    /* renamed from: c, reason: collision with root package name */
    private h f7001c;
    private com.ironsource.sdk.controller.b e;

    private a(final Activity activity, int i) throws Exception {
        com.ironsource.sdk.g.c.a(activity);
        this.e = new com.ironsource.sdk.controller.b();
        e.a(f.g());
        e.a("IronSourceAdsPublisherAgent", "C'tor");
        f6999d = new MutableContextWrapper(activity);
        activity.runOnUiThread(new Runnable() { // from class: com.ironsource.sdk.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.f7000b = new com.ironsource.sdk.controller.c(a.f6999d, a.this.e);
                a.this.f7000b.a(new d(activity.getApplication()));
                a.this.f7000b.a(new com.ironsource.sdk.controller.e(activity.getApplicationContext()));
                a.this.f7000b.c(activity);
                a.this.f7000b.setDebugMode(f.g());
                a.this.f7000b.b();
            }
        });
        b((Context) activity);
    }

    public static synchronized a c(Activity activity) throws Exception {
        a a2;
        synchronized (a.class) {
            a2 = a(activity, 0);
        }
        return a2;
    }

    public static synchronized a a(Activity activity, int i) throws Exception {
        a aVar;
        synchronized (a.class) {
            e.a("IronSourceAdsPublisherAgent", "getInstance()");
            if (f6998a == null) {
                f6998a = new a(activity, i);
            } else {
                f6999d.setBaseContext(activity);
            }
            aVar = f6998a;
        }
        return aVar;
    }

    public com.ironsource.sdk.controller.c a() {
        return this.f7000b;
    }

    private com.ironsource.sdk.e.e a(com.ironsource.sdk.data.b bVar) {
        if (bVar == null) {
            return null;
        }
        return (com.ironsource.sdk.e.e) bVar.e();
    }

    private com.ironsource.sdk.e.c b(com.ironsource.sdk.data.b bVar) {
        if (bVar == null) {
            return null;
        }
        return (com.ironsource.sdk.e.c) bVar.e();
    }

    private void b(Context context) {
        this.f7001c = new h(context, h.a.launched);
    }

    public void a(Context context) {
        this.f7001c = new h(context, h.a.backFromBG);
    }

    private void c() {
        if (this.f7001c != null) {
            this.f7001c.a();
            com.ironsource.sdk.g.c.a().a(this.f7001c);
            this.f7001c = null;
        }
    }

    @Override // com.ironsource.sdk.b
    public void a(String str, String str2, String str3, Map<String, String> map, com.ironsource.sdk.e.e eVar) {
        this.f7000b.a(str, str2, this.e.a(e.d.RewardedVideo, str3, map, eVar), (c) this);
    }

    @Override // com.ironsource.sdk.b
    public void a(JSONObject jSONObject) {
        this.f7000b.c(jSONObject);
    }

    @Override // com.ironsource.sdk.b
    public void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.e.d dVar) {
        this.f7000b.a(str, str2, map, dVar);
    }

    @Override // com.ironsource.sdk.b
    public void a(Map<String, String> map) {
        this.f7000b.a(map);
    }

    @Override // com.ironsource.sdk.b
    public void a(String str, String str2, com.ironsource.sdk.e.d dVar) {
        this.f7000b.a(str, str2, dVar);
    }

    @Override // com.ironsource.sdk.b
    public void a(String str, String str2, String str3, Map<String, String> map, com.ironsource.sdk.e.c cVar) {
        this.f7000b.a(str, str2, this.e.a(e.d.Interstitial, str3, map, cVar), (com.ironsource.sdk.e.a.b) this);
    }

    @Override // com.ironsource.sdk.b
    public void b(JSONObject jSONObject) {
        this.f7000b.a(jSONObject != null ? jSONObject.optString("demandSourceName") : null);
    }

    @Override // com.ironsource.sdk.b
    public boolean a(String str) {
        return this.f7000b.b(str);
    }

    @Override // com.ironsource.sdk.b
    public void c(JSONObject jSONObject) {
        this.f7000b.a(jSONObject);
    }

    @Override // com.ironsource.sdk.b
    public void b(Activity activity) {
        f6999d.setBaseContext(activity);
        this.f7000b.e();
        this.f7000b.c(activity);
        if (this.f7001c == null) {
            a((Context) activity);
        }
    }

    @Override // com.ironsource.sdk.b
    public void a(Activity activity) {
        try {
            this.f7000b.d();
            this.f7000b.d(activity);
            c();
        } catch (Exception e) {
            e.printStackTrace();
            new com.ironsource.sdk.g.b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=" + e.getStackTrace()[0].getMethodName());
        }
    }

    @Override // com.ironsource.sdk.e.a.a
    public void a(e.d dVar, String str, com.ironsource.sdk.data.a aVar) {
        com.ironsource.sdk.e.c b2;
        com.ironsource.sdk.data.b d2 = d(dVar, str);
        if (d2 != null) {
            d2.a(2);
            if (dVar == e.d.RewardedVideo) {
                com.ironsource.sdk.e.e a2 = a(d2);
                if (a2 != null) {
                    a2.onRVInitSuccess(aVar);
                    return;
                }
                return;
            }
            if (dVar != e.d.Interstitial || (b2 = b(d2)) == null) {
                return;
            }
            b2.onInterstitialInitSuccess();
        }
    }

    @Override // com.ironsource.sdk.e.a.a
    public void a(e.d dVar, String str, String str2) {
        com.ironsource.sdk.e.c b2;
        com.ironsource.sdk.data.b d2 = d(dVar, str);
        if (d2 != null) {
            d2.a(3);
            if (dVar == e.d.RewardedVideo) {
                com.ironsource.sdk.e.e a2 = a(d2);
                if (a2 != null) {
                    a2.onRVInitFail(str2);
                    return;
                }
                return;
            }
            if (dVar != e.d.Interstitial || (b2 = b(d2)) == null) {
                return;
            }
            b2.onInterstitialInitFailed(str2);
        }
    }

    @Override // com.ironsource.sdk.e.a.c
    public void b(String str) {
        com.ironsource.sdk.e.e a2;
        com.ironsource.sdk.data.b d2 = d(e.d.RewardedVideo, str);
        if (d2 == null || (a2 = a(d2)) == null) {
            return;
        }
        a2.onRVNoMoreOffers();
    }

    @Override // com.ironsource.sdk.e.a.c
    public void a(String str, int i) {
        com.ironsource.sdk.e.e a2;
        com.ironsource.sdk.data.b d2 = d(e.d.RewardedVideo, str);
        if (d2 == null || (a2 = a(d2)) == null) {
            return;
        }
        a2.onRVAdCredited(i);
    }

    @Override // com.ironsource.sdk.e.a.a
    public void a(e.d dVar, String str) {
        com.ironsource.sdk.e.c b2;
        com.ironsource.sdk.data.b d2 = d(dVar, str);
        if (d2 != null) {
            if (dVar == e.d.RewardedVideo) {
                com.ironsource.sdk.e.e a2 = a(d2);
                if (a2 != null) {
                    a2.onRVAdClosed();
                    return;
                }
                return;
            }
            if (dVar != e.d.Interstitial || (b2 = b(d2)) == null) {
                return;
            }
            b2.onInterstitialClose();
        }
    }

    @Override // com.ironsource.sdk.e.a.c
    public void a(String str, String str2) {
        com.ironsource.sdk.e.e a2;
        com.ironsource.sdk.data.b d2 = d(e.d.RewardedVideo, str);
        if (d2 == null || (a2 = a(d2)) == null) {
            return;
        }
        a2.onRVShowFail(str2);
    }

    @Override // com.ironsource.sdk.e.a.a
    public void b(e.d dVar, String str) {
        com.ironsource.sdk.e.c b2;
        com.ironsource.sdk.data.b d2 = d(dVar, str);
        if (d2 != null) {
            if (dVar == e.d.RewardedVideo) {
                com.ironsource.sdk.e.e a2 = a(d2);
                if (a2 != null) {
                    a2.onRVAdClicked();
                    return;
                }
                return;
            }
            if (dVar != e.d.Interstitial || (b2 = b(d2)) == null) {
                return;
            }
            b2.onInterstitialClick();
        }
    }

    @Override // com.ironsource.sdk.e.a.a
    public void a(e.d dVar, String str, String str2, JSONObject jSONObject) {
        com.ironsource.sdk.e.e a2;
        com.ironsource.sdk.data.b d2 = d(dVar, str);
        if (d2 != null) {
            try {
                if (dVar == e.d.Interstitial) {
                    com.ironsource.sdk.e.c b2 = b(d2);
                    if (b2 != null) {
                        jSONObject.put("demandSourceName", str);
                        b2.onInterstitialEventNotificationReceived(str2, jSONObject);
                    }
                } else if (dVar == e.d.RewardedVideo && (a2 = a(d2)) != null) {
                    jSONObject.put("demandSourceName", str);
                    a2.onRVEventNotificationReceived(str2, jSONObject);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.ironsource.sdk.e.a.a
    public void c(e.d dVar, String str) {
        com.ironsource.sdk.e.e a2;
        com.ironsource.sdk.data.b d2 = d(dVar, str);
        if (d2 != null) {
            if (dVar == e.d.Interstitial) {
                com.ironsource.sdk.e.c b2 = b(d2);
                if (b2 != null) {
                    b2.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (dVar != e.d.RewardedVideo || (a2 = a(d2)) == null) {
                return;
            }
            a2.onRVAdOpened();
        }
    }

    @Override // com.ironsource.sdk.e.a.b
    public void c(String str) {
        com.ironsource.sdk.e.c b2;
        com.ironsource.sdk.data.b d2 = d(e.d.Interstitial, str);
        if (d2 == null || (b2 = b(d2)) == null) {
            return;
        }
        b2.onInterstitialLoadSuccess();
    }

    @Override // com.ironsource.sdk.e.a.b
    public void b(String str, String str2) {
        com.ironsource.sdk.e.c b2;
        com.ironsource.sdk.data.b d2 = d(e.d.Interstitial, str);
        if (d2 == null || (b2 = b(d2)) == null) {
            return;
        }
        b2.onInterstitialLoadFailed(str2);
    }

    @Override // com.ironsource.sdk.e.a.b
    public void d(String str) {
        com.ironsource.sdk.e.c b2;
        com.ironsource.sdk.data.b d2 = d(e.d.Interstitial, str);
        if (d2 == null || (b2 = b(d2)) == null) {
            return;
        }
        b2.onInterstitialShowSuccess();
    }

    @Override // com.ironsource.sdk.e.a.b
    public void c(String str, String str2) {
        com.ironsource.sdk.e.c b2;
        com.ironsource.sdk.data.b d2 = d(e.d.Interstitial, str);
        if (d2 == null || (b2 = b(d2)) == null) {
            return;
        }
        b2.onInterstitialShowFailed(str2);
    }

    public com.ironsource.sdk.data.b d(e.d dVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.e.a(dVar, str);
    }

    @Override // com.ironsource.sdk.b
    public void a(String str, String str2, int i) {
        e.d f;
        com.ironsource.sdk.data.b a2;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (f = f.f(str)) == null || (a2 = this.e.a(f, str2)) == null) {
            return;
        }
        a2.b(i);
    }

    @Override // com.ironsource.sdk.b
    public void d(JSONObject jSONObject) {
        this.f7000b.b(jSONObject);
    }
}

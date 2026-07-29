package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.n.e;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.flurry.android.FlurryAgent;
import com.flurry.android.ads.FlurryAdErrorType;
import com.flurry.android.ads.FlurryAdNative;
import com.flurry.android.ads.FlurryAdNativeAsset;
import com.flurry.android.ads.FlurryAdNativeListener;
import com.mopub.mobileads.resource.DrawableConstants;
import com.tapjoy.TapjoyConstants;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q extends ab implements x {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f4991a;

    /* renamed from: b, reason: collision with root package name */
    private ac f4992b;

    /* renamed from: c, reason: collision with root package name */
    private FlurryAdNative f4993c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4994d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private com.facebook.ads.internal.n.f j;
    private com.facebook.ads.internal.n.f k;
    private com.facebook.ads.internal.n.f l;

    @Override // com.facebook.ads.internal.adapters.ab
    public String A() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public List<com.facebook.ads.internal.n.e> B() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int C() {
        return 0;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int D() {
        return 0;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.c E() {
        return com.facebook.ads.internal.n.c.FLURRY;
    }

    @Override // com.facebook.ads.internal.adapters.x
    public g F() {
        return g.YAHOO;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(int i) {
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(final Context context, ac acVar, com.facebook.ads.internal.m.c cVar, Map<String, Object> map, e.d dVar) {
        JSONObject jSONObject = (JSONObject) map.get("data");
        String optString = jSONObject.optString(TapjoyConstants.TJC_API_KEY);
        String optString2 = jSONObject.optString("placement_id");
        synchronized (q.class) {
            if (!f4991a) {
                com.facebook.ads.internal.q.a.d.a(context, y.a(F()) + " Initializing");
                FlurryAgent.setLogEnabled(true);
                FlurryAgent.init(context, optString);
                f4991a = true;
            }
        }
        com.facebook.ads.internal.q.a.d.a(context, y.a(F()) + " Loading");
        this.f4992b = acVar;
        this.f4993c = new FlurryAdNative(context, optString2);
        this.f4993c.setListener(new FlurryAdNativeListener() { // from class: com.facebook.ads.internal.adapters.q.1
            public void onAppExit(FlurryAdNative flurryAdNative) {
            }

            public void onClicked(FlurryAdNative flurryAdNative) {
                if (q.this.f4992b != null) {
                    q.this.f4992b.c(q.this);
                }
            }

            public void onCloseFullscreen(FlurryAdNative flurryAdNative) {
            }

            public void onCollapsed(FlurryAdNative flurryAdNative) {
            }

            public void onError(FlurryAdNative flurryAdNative, FlurryAdErrorType flurryAdErrorType, int i) {
                com.facebook.ads.internal.q.a.d.a(context, y.a(q.this.F()) + " Failed with FlurryError: " + flurryAdErrorType.toString());
                if (q.this.f4992b != null) {
                    q.this.f4992b.a(q.this, com.facebook.ads.internal.protocol.a.a(AdErrorType.MEDIATION_ERROR, flurryAdErrorType.toString()));
                }
            }

            public void onExpanded(FlurryAdNative flurryAdNative) {
            }

            public void onFetched(FlurryAdNative flurryAdNative) {
                q qVar;
                String str;
                if (q.this.f4992b == null) {
                    return;
                }
                if (flurryAdNative.isVideoAd()) {
                    com.facebook.ads.internal.q.a.d.a(context, y.a(q.this.F()) + " Failed. AN does not support Flurry video ads");
                    q.this.f4992b.a(q.this, new com.facebook.ads.internal.protocol.a(AdErrorType.MEDIATION_ERROR, "video ad"));
                    return;
                }
                q.this.f4994d = true;
                FlurryAdNativeAsset asset = flurryAdNative.getAsset("headline");
                if (asset != null) {
                    q.this.e = asset.getValue();
                }
                FlurryAdNativeAsset asset2 = flurryAdNative.getAsset("summary");
                if (asset2 != null) {
                    q.this.f = asset2.getValue();
                }
                FlurryAdNativeAsset asset3 = flurryAdNative.getAsset("source");
                if (asset3 != null) {
                    q.this.g = asset3.getValue();
                }
                FlurryAdNativeAsset asset4 = flurryAdNative.getAsset("appCategory");
                if (asset4 != null) {
                    q.this.i = asset4.getValue();
                }
                FlurryAdNativeAsset asset5 = flurryAdNative.getAsset("callToAction");
                if (asset5 != null) {
                    q.this.h = asset5.getValue();
                } else {
                    if (flurryAdNative.getAsset("appRating") != null) {
                        qVar = q.this;
                        str = "Install Now";
                    } else {
                        qVar = q.this;
                        str = DrawableConstants.CtaButton.DEFAULT_CTA_TEXT;
                    }
                    qVar.h = str;
                }
                FlurryAdNativeAsset asset6 = flurryAdNative.getAsset("secImage");
                if (asset6 != null) {
                    q.this.j = new com.facebook.ads.internal.n.f(asset6.getValue(), 82, 82);
                }
                FlurryAdNativeAsset asset7 = flurryAdNative.getAsset("secHqImage");
                if (asset7 != null) {
                    q.this.k = new com.facebook.ads.internal.n.f(asset7.getValue(), 1200, 627);
                }
                FlurryAdNativeAsset asset8 = flurryAdNative.getAsset("secBrandingLogo");
                if (asset8 != null) {
                    q.this.l = new com.facebook.ads.internal.n.f(asset8.getValue(), 20, 20);
                }
                com.facebook.ads.internal.q.a.d.a(context, y.a(q.this.F()) + " Loaded");
                q.this.f4992b.a(q.this);
            }

            public void onImpressionLogged(FlurryAdNative flurryAdNative) {
                if (q.this.f4992b != null) {
                    q.this.f4992b.b(q.this);
                }
            }

            public void onShowFullscreen(FlurryAdNative flurryAdNative) {
            }
        });
        this.f4993c.fetchAd();
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(View view, List<View> list) {
        if (this.f4993c != null) {
            this.f4993c.setTrackingView(view);
        }
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(ac acVar) {
        this.f4992b = acVar;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(Map<String, String> map) {
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void b(Map<String, String> map) {
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void b_() {
        if (this.f4993c != null) {
            this.f4993c.removeTrackingView();
        }
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String c() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean c_() {
        return this.f4994d;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean d() {
        return false;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean e() {
        return false;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean f() {
        return false;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean g() {
        return false;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean h() {
        return true;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int i() {
        return 0;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int j() {
        return 0;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int k() {
        return 0;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.f l() {
        return this.j;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.f m() {
        return this.k;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.h n() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String o() {
        return this.e;
    }

    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public void onDestroy() {
        b_();
        this.f4992b = null;
        if (this.f4993c != null) {
            this.f4993c.destroy();
            this.f4993c = null;
        }
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String p() {
        return this.g;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String q() {
        return this.f;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String r() {
        return this.h;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String s() {
        return this.i;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.g t() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.f u() {
        return this.l;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String v() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String w() {
        return "Ad";
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String x() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String y() {
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.j z() {
        return com.facebook.ads.internal.n.j.DEFAULT;
    }
}

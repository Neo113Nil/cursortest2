package com.facebook.ads.internal.adapters;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAdActivity;
import com.facebook.ads.internal.settings.a;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m extends InterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<String, com.facebook.ads.internal.view.a> f4963a = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private String f4965c;

    /* renamed from: d, reason: collision with root package name */
    private long f4966d;
    private Context e;
    private w f;
    private InterstitialAdapterListener g;
    private r i;
    private v k;
    private a.EnumC0351a l;
    private boolean m;

    /* renamed from: b, reason: collision with root package name */
    private final String f4964b = UUID.randomUUID().toString();
    private boolean h = false;
    private a j = a.UNSPECIFIED;

    public enum a {
        UNSPECIFIED,
        VERTICAL,
        HORIZONTAL;

        public static a a(int i) {
            return i == 0 ? UNSPECIFIED : i == 2 ? HORIZONTAL : VERTICAL;
        }
    }

    private int a() {
        int rotation = ((WindowManager) this.e.getSystemService("window")).getDefaultDisplay().getRotation();
        if (this.j == a.UNSPECIFIED) {
            return -1;
        }
        if (this.j != a.HORIZONTAL) {
            return rotation != 2 ? 1 : 9;
        }
        switch (rotation) {
            case 2:
            case 3:
                return 8;
            default:
                return 0;
        }
    }

    public static com.facebook.ads.internal.view.a a(String str) {
        return f4963a.get(str);
    }

    public static void a(com.facebook.ads.internal.view.a aVar) {
        for (Map.Entry<String, com.facebook.ads.internal.view.a> entry : f4963a.entrySet()) {
            if (entry.getValue() == aVar) {
                f4963a.remove(entry.getKey());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, com.facebook.ads.internal.view.a aVar) {
        f4963a.put(str, aVar);
    }

    @Override // com.facebook.ads.internal.adapters.InterstitialAdapter
    public void loadInterstitialAd(Context context, InterstitialAdapterListener interstitialAdapterListener, Map<String, Object> map, com.facebook.ads.internal.m.c cVar, final EnumSet<CacheFlag> enumSet) {
        com.facebook.ads.internal.d.b bVar;
        com.facebook.ads.internal.d.a aVar;
        this.e = context;
        this.g = interstitialAdapterListener;
        this.f4965c = (String) map.get(AudienceNetworkActivity.PLACEMENT_ID);
        this.f4966d = ((Long) map.get(AudienceNetworkActivity.REQUEST_TIME)).longValue();
        JSONObject jSONObject = (JSONObject) map.get("data");
        if (jSONObject.has("markup")) {
            this.l = a.EnumC0351a.INTERSTITIAL_WEB_VIEW;
            this.i = r.a(jSONObject);
            if (com.facebook.ads.internal.a.d.a(context, this.i, cVar)) {
                interstitialAdapterListener.onInterstitialError(this, AdError.NO_FILL);
                return;
            }
            this.f = new w(context, this.f4964b, this, this.g);
            this.f.a();
            Map<String, String> f = this.i.f();
            if (f.containsKey("orientation")) {
                this.j = a.a(Integer.parseInt(f.get("orientation")));
            }
            this.h = true;
            if (this.g == null) {
                return;
            }
        } else {
            if (jSONObject.has("video")) {
                this.l = a.EnumC0351a.INTERSTITIAL_OLD_NATIVE_VIDEO;
                this.f = new w(context, this.f4964b, this, this.g);
                this.f.a();
                final n nVar = new n();
                nVar.a(context, new com.facebook.ads.a.a() { // from class: com.facebook.ads.internal.adapters.m.1
                    @Override // com.facebook.ads.a.a
                    public void a(u uVar) {
                        m.this.h = true;
                        if (m.this.g == null) {
                            return;
                        }
                        m.this.g.onInterstitialAdLoaded(m.this);
                    }

                    @Override // com.facebook.ads.a.a
                    public void a(u uVar, View view) {
                        m.this.j = nVar.k();
                        m.b(m.this.f4964b, nVar);
                    }

                    @Override // com.facebook.ads.a.a
                    public void a(u uVar, AdError adError) {
                        nVar.l();
                        m.this.g.onInterstitialError(m.this, adError);
                    }

                    @Override // com.facebook.ads.a.a
                    public void b(u uVar) {
                        m.this.g.onInterstitialAdClicked(m.this, "", true);
                    }

                    @Override // com.facebook.ads.a.a
                    public void c(u uVar) {
                        m.this.g.onInterstitialLoggingImpression(m.this);
                    }

                    @Override // com.facebook.ads.a.a
                    public void d(u uVar) {
                    }
                }, map, cVar, enumSet);
                return;
            }
            this.k = v.a(jSONObject, context);
            if (this.k.d().size() == 0) {
                this.g.onInterstitialError(this, AdError.NO_FILL);
            }
            this.f = new w(context, this.f4964b, this, this.g);
            this.f.a();
            if (!jSONObject.has("carousel")) {
                if (jSONObject.has("video_url")) {
                    this.l = a.EnumC0351a.INTERSTITIAL_NATIVE_VIDEO;
                    bVar = new com.facebook.ads.internal.d.b(context);
                    bVar.a(this.k.d().get(0).f(), this.k.d().get(0).h(), this.k.d().get(0).g());
                    bVar.a(this.k.c(), -1, -1);
                    if (enumSet.contains(CacheFlag.VIDEO)) {
                        bVar.a(this.k.d().get(0).i());
                    }
                    aVar = new com.facebook.ads.internal.d.a() { // from class: com.facebook.ads.internal.adapters.m.3
                        private void a(boolean z) {
                            m.this.m = z;
                            m.this.h = true;
                            m.this.g.onInterstitialAdLoaded(m.this);
                        }

                        @Override // com.facebook.ads.internal.d.a
                        public void a() {
                            a(enumSet.contains(CacheFlag.VIDEO));
                        }

                        @Override // com.facebook.ads.internal.d.a
                        public void b() {
                            a(false);
                        }
                    };
                } else {
                    this.l = a.EnumC0351a.INTERSTITIAL_NATIVE_IMAGE;
                    bVar = new com.facebook.ads.internal.d.b(context);
                    bVar.a(this.k.d().get(0).f(), this.k.d().get(0).h(), this.k.d().get(0).g());
                    bVar.a(this.k.c(), -1, -1);
                    aVar = new com.facebook.ads.internal.d.a() { // from class: com.facebook.ads.internal.adapters.m.4
                        private void c() {
                            m.this.h = true;
                            m.this.g.onInterstitialAdLoaded(m.this);
                        }

                        @Override // com.facebook.ads.internal.d.a
                        public void a() {
                            c();
                        }

                        @Override // com.facebook.ads.internal.d.a
                        public void b() {
                            c();
                        }
                    };
                }
                bVar.a(aVar);
                return;
            }
            this.l = a.EnumC0351a.INTERSTITIAL_NATIVE_CAROUSEL;
            com.facebook.ads.internal.d.b bVar2 = new com.facebook.ads.internal.d.b(context);
            bVar2.a(this.k.c(), -1, -1);
            List<d> d2 = this.k.d();
            for (int i = 0; i < d2.size(); i++) {
                bVar2.a(d2.get(i).f(), d2.get(i).h(), d2.get(i).g());
            }
            bVar2.a(new com.facebook.ads.internal.d.a() { // from class: com.facebook.ads.internal.adapters.m.2
                private void c() {
                    m.this.h = true;
                    m.this.g.onInterstitialAdLoaded(m.this);
                }

                @Override // com.facebook.ads.internal.d.a
                public void a() {
                    c();
                }

                @Override // com.facebook.ads.internal.d.a
                public void b() {
                    c();
                }
            });
            this.h = true;
        }
        this.g.onInterstitialAdLoaded(this);
    }

    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public void onDestroy() {
        if (this.f != null) {
            this.f.b();
        }
    }

    @Override // com.facebook.ads.internal.adapters.InterstitialAdapter
    public boolean show() {
        if (!this.h) {
            if (this.g == null) {
                return false;
            }
            this.g.onInterstitialError(this, AdError.INTERNAL_ERROR);
            return false;
        }
        Intent intent = new Intent(this.e, (Class<?>) AudienceNetworkActivity.class);
        intent.putExtra(AudienceNetworkActivity.PREDEFINED_ORIENTATION_KEY, a());
        intent.putExtra(AudienceNetworkActivity.AUDIENCE_NETWORK_UNIQUE_ID_EXTRA, this.f4964b);
        intent.putExtra(AudienceNetworkActivity.PLACEMENT_ID, this.f4965c);
        intent.putExtra(AudienceNetworkActivity.REQUEST_TIME, this.f4966d);
        intent.putExtra(AudienceNetworkActivity.VIEW_TYPE, this.l);
        intent.putExtra(AudienceNetworkActivity.USE_CACHE, this.m);
        if (this.k != null) {
            intent.putExtra("ad_data_bundle", this.k);
        } else if (this.i != null) {
            this.i.a(intent);
        }
        intent.addFlags(268435456);
        try {
            this.e.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            intent.setClass(this.e, InterstitialAdActivity.class);
            this.e.startActivity(intent);
            return true;
        }
    }
}

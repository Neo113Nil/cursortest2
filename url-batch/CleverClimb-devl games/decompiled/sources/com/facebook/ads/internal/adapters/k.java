package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.j.a;
import com.facebook.ads.internal.view.b.a;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k extends BannerAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4946a = "k";

    /* renamed from: b, reason: collision with root package name */
    private a.b f4947b;

    /* renamed from: c, reason: collision with root package name */
    private com.facebook.ads.internal.view.b.a f4948c;

    /* renamed from: d, reason: collision with root package name */
    private s f4949d;
    private BannerAdapterListener e;
    private Map<String, Object> f;
    private com.facebook.ads.internal.m.c g;
    private Context h;
    private long i;
    private a.EnumC0346a j;

    private void a(com.facebook.ads.internal.h.d dVar) {
        this.i = 0L;
        this.j = null;
        final r a2 = r.a((JSONObject) this.f.get("data"));
        if (com.facebook.ads.internal.a.d.a(this.h, a2, this.g)) {
            this.e.onBannerError(this, AdError.NO_FILL);
            return;
        }
        this.f4947b = new a.b() { // from class: com.facebook.ads.internal.adapters.k.1
            @Override // com.facebook.ads.internal.view.b.a.b
            public void a() {
                k.this.f4949d.b();
            }

            @Override // com.facebook.ads.internal.view.b.a.b
            public void a(int i) {
                if (i != 0 || k.this.i <= 0 || k.this.j == null) {
                    return;
                }
                com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(k.this.i, k.this.j, a2.g()));
                k.this.i = 0L;
                k.this.j = null;
            }

            @Override // com.facebook.ads.internal.view.b.a.b
            public void a(String str, Map<String, String> map) {
                Uri parse = Uri.parse(str);
                if ("fbad".equals(parse.getScheme()) && com.facebook.ads.internal.a.b.a(parse.getAuthority()) && k.this.e != null) {
                    k.this.e.onBannerAdClicked(k.this);
                }
                com.facebook.ads.internal.a.a a3 = com.facebook.ads.internal.a.b.a(k.this.h, k.this.g, a2.c(), parse, map);
                if (a3 != null) {
                    try {
                        k.this.j = a3.a();
                        k.this.i = System.currentTimeMillis();
                        a3.b();
                    } catch (Exception e) {
                        Log.e(k.f4946a, "Error executing action", e);
                    }
                }
            }

            @Override // com.facebook.ads.internal.view.b.a.b
            public void b() {
                if (k.this.f4949d != null) {
                    k.this.f4949d.a();
                }
            }
        };
        this.f4948c = new com.facebook.ads.internal.view.b.a(this.h, new WeakReference(this.f4947b), dVar.f());
        this.f4948c.a(dVar.h(), dVar.i());
        this.f4949d = new s(this.h, this.g, this.f4948c, this.f4948c.getViewabilityChecker(), new c() { // from class: com.facebook.ads.internal.adapters.k.2
            @Override // com.facebook.ads.internal.adapters.c
            public void a() {
                if (k.this.e != null) {
                    k.this.e.onBannerLoggingImpression(k.this);
                }
            }
        });
        this.f4949d.a(a2);
        this.f4948c.loadDataWithBaseURL(com.facebook.ads.internal.q.c.b.a(), a2.d(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
        if (this.e != null) {
            this.e.onBannerAdLoaded(this, this.f4948c);
        }
    }

    @Override // com.facebook.ads.internal.adapters.BannerAdapter
    public void loadBannerAd(Context context, com.facebook.ads.internal.m.c cVar, com.facebook.ads.internal.protocol.e eVar, BannerAdapterListener bannerAdapterListener, Map<String, Object> map) {
        this.h = context;
        this.g = cVar;
        this.e = bannerAdapterListener;
        this.f = map;
        a((com.facebook.ads.internal.h.d) this.f.get("definition"));
    }

    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public void onDestroy() {
        if (this.f4948c != null) {
            this.f4948c.destroy();
            this.f4948c = null;
            this.f4947b = null;
        }
    }
}

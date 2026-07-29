package com.facebook.ads.internal.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.j.a;
import com.facebook.ads.internal.view.a;
import com.facebook.ads.internal.view.b.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5832a = "f";

    /* renamed from: b, reason: collision with root package name */
    private final a.InterfaceC0352a f5833b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.ads.internal.view.b.a f5834c;

    /* renamed from: d, reason: collision with root package name */
    private final a.b f5835d;
    private final com.facebook.ads.internal.adapters.s e;
    private final com.facebook.ads.internal.m.c f;
    private com.facebook.ads.internal.adapters.r g;
    private long h = System.currentTimeMillis();
    private long i;
    private a.EnumC0346a j;

    public f(final AudienceNetworkActivity audienceNetworkActivity, final com.facebook.ads.internal.m.c cVar, a.InterfaceC0352a interfaceC0352a) {
        this.f5833b = interfaceC0352a;
        this.f = cVar;
        this.f5835d = new a.b() { // from class: com.facebook.ads.internal.view.f.1

            /* renamed from: d, reason: collision with root package name */
            private long f5839d = 0;

            @Override // com.facebook.ads.internal.view.b.a.b
            public void a() {
                f.this.e.b();
            }

            @Override // com.facebook.ads.internal.view.b.a.b
            public void a(int i) {
            }

            @Override // com.facebook.ads.internal.view.b.a.b
            public void a(String str, Map<String, String> map) {
                Uri parse = Uri.parse(str);
                if ("fbad".equals(parse.getScheme()) && "close".equals(parse.getAuthority())) {
                    audienceNetworkActivity.finish();
                    return;
                }
                long j = this.f5839d;
                this.f5839d = System.currentTimeMillis();
                if (this.f5839d - j < 1000) {
                    return;
                }
                if ("fbad".equals(parse.getScheme()) && com.facebook.ads.internal.a.b.a(parse.getAuthority())) {
                    f.this.f5833b.a("com.facebook.ads.interstitial.clicked");
                }
                com.facebook.ads.internal.a.a a2 = com.facebook.ads.internal.a.b.a(audienceNetworkActivity, cVar, f.this.g.c(), parse, map);
                if (a2 != null) {
                    try {
                        f.this.j = a2.a();
                        f.this.i = System.currentTimeMillis();
                        a2.b();
                    } catch (Exception e) {
                        Log.e(f.f5832a, "Error executing action", e);
                    }
                }
            }

            @Override // com.facebook.ads.internal.view.b.a.b
            public void b() {
                f.this.e.a();
            }
        };
        this.f5834c = new com.facebook.ads.internal.view.b.a(audienceNetworkActivity, new WeakReference(this.f5835d), 1);
        this.f5834c.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.e = new com.facebook.ads.internal.adapters.s(audienceNetworkActivity, cVar, this.f5834c, this.f5834c.getViewabilityChecker(), new com.facebook.ads.internal.adapters.c() { // from class: com.facebook.ads.internal.view.f.2
            @Override // com.facebook.ads.internal.adapters.c
            public void a() {
                f.this.f5833b.a("com.facebook.ads.interstitial.impression.logged");
            }
        });
        interfaceC0352a.a(this.f5834c);
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        if (bundle != null && bundle.containsKey("dataModel")) {
            this.g = com.facebook.ads.internal.adapters.r.a(bundle.getBundle("dataModel"));
            if (this.g != null) {
                this.f5834c.loadDataWithBaseURL(com.facebook.ads.internal.q.c.b.a(), this.g.d(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
                this.f5834c.a(this.g.h(), this.g.i());
                return;
            }
            return;
        }
        this.g = com.facebook.ads.internal.adapters.r.b(intent);
        if (this.g != null) {
            this.e.a(this.g);
            this.f5834c.loadDataWithBaseURL(com.facebook.ads.internal.q.c.b.a(), this.g.d(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
            this.f5834c.a(this.g.h(), this.g.i());
        }
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Bundle bundle) {
        if (this.g != null) {
            bundle.putBundle("dataModel", this.g.j());
        }
    }

    @Override // com.facebook.ads.internal.view.a
    public void i() {
        this.f5834c.onPause();
    }

    @Override // com.facebook.ads.internal.view.a
    public void j() {
        if (this.i > 0 && this.j != null && this.g != null) {
            com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(this.i, this.j, this.g.g()));
        }
        this.f5834c.onResume();
    }

    @Override // com.facebook.ads.internal.view.a
    public void onDestroy() {
        if (this.g != null) {
            com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(this.h, a.EnumC0346a.XOUT, this.g.g()));
            if (!TextUtils.isEmpty(this.g.c())) {
                HashMap hashMap = new HashMap();
                this.f5834c.getViewabilityChecker().a(hashMap);
                hashMap.put("touch", com.facebook.ads.internal.q.a.j.a(this.f5834c.getTouchData()));
                this.f.h(this.g.c(), hashMap);
            }
        }
        com.facebook.ads.internal.q.c.b.a(this.f5834c);
        this.f5834c.destroy();
    }

    @Override // com.facebook.ads.internal.view.a
    public void setListener(a.InterfaceC0352a interfaceC0352a) {
    }
}

package com.facebook.ads.internal.view;

import android.R;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.view.a;
import com.facebook.ads.internal.view.a.a;
import com.facebook.ads.internal.view.a.c;
import com.facebook.ads.internal.view.a.f;

@TargetApi(19)
/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5520a = "b";

    /* renamed from: b, reason: collision with root package name */
    private final AudienceNetworkActivity f5521b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.ads.internal.view.a.a f5522c;

    /* renamed from: d, reason: collision with root package name */
    private final com.facebook.ads.internal.view.a.f f5523d;
    private final com.facebook.ads.internal.view.a.b e;
    private final com.facebook.ads.internal.m.c f;
    private String h;
    private String i;
    private long j;
    private final AudienceNetworkActivity.BackButtonInterceptor g = new AudienceNetworkActivity.BackButtonInterceptor() { // from class: com.facebook.ads.internal.view.b.1
        @Override // com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor
        public boolean interceptBackButton() {
            if (!b.this.f5523d.canGoBack()) {
                return false;
            }
            b.this.f5523d.goBack();
            return true;
        }
    };
    private boolean k = true;
    private long l = -1;
    private boolean m = true;

    public b(final AudienceNetworkActivity audienceNetworkActivity, com.facebook.ads.internal.m.c cVar, a.InterfaceC0352a interfaceC0352a) {
        this.f5521b = audienceNetworkActivity;
        this.f = cVar;
        int i = (int) (com.facebook.ads.internal.q.a.v.f5438b * 2.0f);
        this.f5522c = new com.facebook.ads.internal.view.a.a(audienceNetworkActivity);
        this.f5522c.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.f5522c.setLayoutParams(layoutParams);
        this.f5522c.setListener(new a.InterfaceC0353a() { // from class: com.facebook.ads.internal.view.b.2
            @Override // com.facebook.ads.internal.view.a.a.InterfaceC0353a
            public void a() {
                audienceNetworkActivity.finish();
            }
        });
        interfaceC0352a.a(this.f5522c);
        this.f5523d = new com.facebook.ads.internal.view.a.f(audienceNetworkActivity);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.f5522c.getId());
        layoutParams2.addRule(12);
        this.f5523d.setLayoutParams(layoutParams2);
        this.f5523d.setListener(new f.a() { // from class: com.facebook.ads.internal.view.b.3
            @Override // com.facebook.ads.internal.view.a.f.a
            public void a(int i2) {
                if (b.this.k) {
                    b.this.e.setProgress(i2);
                }
            }

            @Override // com.facebook.ads.internal.view.a.f.a
            public void a(String str) {
                b.this.k = true;
                b.this.f5522c.setUrl(str);
            }

            @Override // com.facebook.ads.internal.view.a.f.a
            public void b(String str) {
                b.this.f5522c.setTitle(str);
            }

            @Override // com.facebook.ads.internal.view.a.f.a
            public void c(String str) {
                b.this.e.setProgress(100);
                b.this.k = false;
            }
        });
        interfaceC0352a.a(this.f5523d);
        this.e = new com.facebook.ads.internal.view.a.b(audienceNetworkActivity, null, R.attr.progressBarStyleHorizontal);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, i);
        layoutParams3.addRule(3, this.f5522c.getId());
        this.e.setLayoutParams(layoutParams3);
        this.e.setProgress(0);
        interfaceC0352a.a(this.e);
        audienceNetworkActivity.addBackButtonInterceptor(this.g);
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        long j;
        if (this.l < 0) {
            this.l = System.currentTimeMillis();
        }
        if (bundle == null) {
            this.h = intent.getStringExtra(AudienceNetworkActivity.BROWSER_URL);
            this.i = intent.getStringExtra(AudienceNetworkActivity.CLIENT_TOKEN);
            j = intent.getLongExtra(AudienceNetworkActivity.HANDLER_TIME, -1L);
        } else {
            this.h = bundle.getString(AudienceNetworkActivity.BROWSER_URL);
            this.i = bundle.getString(AudienceNetworkActivity.CLIENT_TOKEN);
            j = bundle.getLong(AudienceNetworkActivity.HANDLER_TIME, -1L);
        }
        this.j = j;
        String str = this.h != null ? this.h : "about:blank";
        this.f5522c.setUrl(str);
        this.f5523d.loadUrl(str);
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Bundle bundle) {
        bundle.putString(AudienceNetworkActivity.BROWSER_URL, this.h);
    }

    @Override // com.facebook.ads.internal.view.a
    public void i() {
        this.f5523d.onPause();
        if (this.m) {
            this.m = false;
            this.f.f(this.i, new c.a(this.f5523d.getFirstUrl()).a(this.j).b(this.l).c(this.f5523d.getResponseEndMs()).d(this.f5523d.getDomContentLoadedMs()).e(this.f5523d.getScrollReadyMs()).f(this.f5523d.getLoadFinishMs()).g(System.currentTimeMillis()).a().a());
        }
    }

    @Override // com.facebook.ads.internal.view.a
    public void j() {
        this.f5523d.onResume();
    }

    @Override // com.facebook.ads.internal.view.a
    public void onDestroy() {
        this.f5521b.removeBackButtonInterceptor(this.g);
        com.facebook.ads.internal.q.c.b.a(this.f5523d);
        this.f5523d.destroy();
    }

    @Override // com.facebook.ads.internal.view.a
    public void setListener(a.InterfaceC0352a interfaceC0352a) {
    }
}

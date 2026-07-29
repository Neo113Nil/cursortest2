package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.j.a;
import com.facebook.ads.internal.r.a;
import java.util.HashMap;

/* loaded from: classes.dex */
public class k extends m {
    private final com.facebook.ads.internal.adapters.v f;
    private final com.facebook.ads.internal.r.a g;
    private final com.facebook.ads.internal.q.a.s h;
    private final a.AbstractC0350a i;
    private long j;

    public k(Context context, com.facebook.ads.internal.adapters.v vVar, com.facebook.ads.internal.m.c cVar) {
        super(context, cVar);
        this.h = new com.facebook.ads.internal.q.a.s();
        this.f = vVar;
        this.i = new a.AbstractC0350a() { // from class: com.facebook.ads.internal.view.k.1
            @Override // com.facebook.ads.internal.r.a.AbstractC0350a
            public void a() {
                if (k.this.h.b()) {
                    return;
                }
                k.this.h.a();
                k.this.f5894b.a(k.this.f.a(), new HashMap());
                if (k.this.getAudienceNetworkListener() != null) {
                    k.this.getAudienceNetworkListener().a("com.facebook.ads.interstitial.impression.logged");
                }
            }
        };
        this.g = new com.facebook.ads.internal.r.a(this, 100, this.i);
        this.g.a(vVar.j());
        this.g.b(vVar.k());
    }

    private void setUpContent(int i) {
        com.facebook.ads.internal.adapters.d dVar = this.f.d().get(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        new com.facebook.ads.internal.view.b.d(imageView).a(dVar.h(), dVar.g()).a(dVar.f());
        com.facebook.ads.internal.view.component.a.b a2 = com.facebook.ads.internal.view.component.a.c.a(getContext(), this.f5894b, getAudienceNetworkListener(), imageView, this.f5896d, this.e, f5893a, i, dVar.g(), dVar.h());
        String b2 = dVar.b();
        String c2 = dVar.c();
        String d2 = dVar.d();
        String e = dVar.e();
        String a3 = this.f.a();
        double h = dVar.h();
        double g = dVar.g();
        Double.isNaN(h);
        Double.isNaN(g);
        a2.a(b2, c2, d2, e, a3, h / g);
        a(a2, a2.a(), i);
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        super.a(audienceNetworkActivity, this.f);
        setUpContent(audienceNetworkActivity.getResources().getConfiguration().orientation);
        this.j = System.currentTimeMillis();
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Bundle bundle) {
    }

    @Override // com.facebook.ads.internal.view.a
    public void i() {
    }

    @Override // com.facebook.ads.internal.view.a
    public void j() {
    }

    @Override // com.facebook.ads.internal.view.m, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        removeAllViews();
        setUpContent(configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.internal.view.m, com.facebook.ads.internal.view.a
    public void onDestroy() {
        if (this.f != null) {
            com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(this.j, a.EnumC0346a.XOUT, this.f.f()));
            if (!TextUtils.isEmpty(this.f.a())) {
                HashMap hashMap = new HashMap();
                this.g.a(hashMap);
                hashMap.put("touch", com.facebook.ads.internal.q.a.j.a(this.h.e()));
                this.f5894b.h(this.f.a(), hashMap);
            }
        }
        super.onDestroy();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.h.a(motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.g != null) {
            if (i == 0) {
                this.g.a();
            } else if (i == 8) {
                this.g.b();
            }
        }
    }
}

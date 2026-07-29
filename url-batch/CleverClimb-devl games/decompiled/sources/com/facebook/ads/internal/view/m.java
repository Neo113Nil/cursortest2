package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.q.a.q;
import com.facebook.ads.internal.view.a;
import com.facebook.ads.internal.view.g;

/* loaded from: classes.dex */
public abstract class m extends RelativeLayout implements a {

    /* renamed from: a, reason: collision with root package name */
    protected static final int f5893a = (int) (com.facebook.ads.internal.q.a.v.f5438b * 56.0f);

    /* renamed from: b, reason: collision with root package name */
    protected final com.facebook.ads.internal.m.c f5894b;

    /* renamed from: c, reason: collision with root package name */
    protected final g f5895c;

    /* renamed from: d, reason: collision with root package name */
    protected com.facebook.ads.internal.adapters.j f5896d;
    protected com.facebook.ads.internal.adapters.j e;
    private a.InterfaceC0352a f;
    private final com.facebook.ads.internal.q.a.q g;

    m(Context context, com.facebook.ads.internal.m.c cVar) {
        super(context.getApplicationContext());
        this.f5894b = cVar;
        this.f5895c = new g(getContext());
        this.g = new com.facebook.ads.internal.q.a.q(this);
    }

    private void a() {
        removeAllViews();
        com.facebook.ads.internal.q.a.v.b(this);
    }

    void a(View view, boolean z, int i) {
        int d2;
        g gVar;
        com.facebook.ads.internal.adapters.j jVar;
        this.g.a(q.a.DEFAULT);
        a();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z ? 0 : f5893a, 0, 0);
        addView(view, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, f5893a);
        layoutParams2.addRule(10);
        if (i == 1) {
            d2 = this.f5896d.d(z);
            gVar = this.f5895c;
            jVar = this.f5896d;
        } else {
            d2 = this.e.d(z);
            gVar = this.f5895c;
            jVar = this.e;
        }
        gVar.a(jVar, z);
        addView(this.f5895c, layoutParams2);
        com.facebook.ads.internal.q.a.v.a(this, d2);
        if (this.f != null) {
            this.f.a(this);
            if (!z || Build.VERSION.SDK_INT < 19) {
                return;
            }
            this.g.a(q.a.FULL_SCREEN);
        }
    }

    public void a(final AudienceNetworkActivity audienceNetworkActivity, com.facebook.ads.internal.adapters.v vVar) {
        this.g.a(audienceNetworkActivity.getWindow());
        this.f5896d = vVar.h();
        this.e = vVar.i();
        this.f5895c.a(vVar.b(), vVar.c(), vVar.g(), vVar.e(), vVar.a(), vVar.d().get(0).l());
        this.f5895c.setToolbarListener(new g.a() { // from class: com.facebook.ads.internal.view.m.1
            @Override // com.facebook.ads.internal.view.g.a
            public void a() {
                audienceNetworkActivity.finish();
            }
        });
    }

    a.InterfaceC0352a getAudienceNetworkListener() {
        return this.f;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        this.f5895c.d();
        super.onConfigurationChanged(configuration);
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facebook.ads.internal.view.m.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                m.this.f5895c.e();
                if (Build.VERSION.SDK_INT >= 14) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    public void onDestroy() {
        this.g.a();
        this.f5895c.setToolbarListener(null);
        a();
    }

    @Override // com.facebook.ads.internal.view.a
    public void setListener(a.InterfaceC0352a interfaceC0352a) {
        this.f = interfaceC0352a;
    }
}

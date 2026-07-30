package com.anythink.basead.ui.h5template;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.anythink.basead.b.c.d;
import com.anythink.basead.d.f;
import com.anythink.basead.d.g;
import com.anythink.basead.ui.BaseATView;
import com.anythink.basead.ui.BaseSdkSplashATView;
import com.anythink.basead.ui.BaseSplashATView;
import com.anythink.basead.ui.component.a;
import com.anythink.basead.webtemplet.WTWebContainerView;
import com.anythink.basead.webtemplet.WTWebView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class WTWebViewSplashATView extends BaseSdkSplashATView {

    /* renamed from: a, reason: collision with root package name */
    WTWebContainerView f11248a;

    /* renamed from: b, reason: collision with root package name */
    final int f11249b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11250c;

    public WTWebViewSplashATView(Context context) {
        super(context);
        this.f11250c = "WTWebViewBaseScreenATView";
        this.f11249b = 1;
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void b() {
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void d() {
    }

    @Override // com.anythink.basead.ui.BaseSplashATView, com.anythink.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        WTWebContainerView wTWebContainerView = this.f11248a;
        if (wTWebContainerView != null) {
            wTWebContainerView.release();
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashATView
    public boolean needShowSplashEndCard() {
        return false;
    }

    @Override // com.anythink.basead.ui.BaseSplashATView, com.anythink.basead.ui.BaseATView
    public final int r() {
        return 100;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final boolean t() {
        return false;
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void w() {
        super.w();
        WTWebContainerView wTWebContainerView = new WTWebContainerView(getContext(), this.f9893g, this.f9892f, new WTWebContainerView.a() { // from class: com.anythink.basead.ui.h5template.WTWebViewSplashATView.1
            @Override // com.anythink.basead.webtemplet.WTWebContainerView.a
            public final void a() {
            }

            @Override // com.anythink.basead.webtemplet.WTWebContainerView.a
            public final void b() {
                WTWebViewSplashATView.this.a(302);
                WTWebViewSplashATView wTWebViewSplashATView = WTWebViewSplashATView.this;
                WTWebViewSplashATView.super.a(((BaseATView) wTWebViewSplashATView).f9892f.f14325o.ab() < 0 ? 100 : ((BaseATView) WTWebViewSplashATView.this).f9892f.f14325o.ab(), new Runnable() { // from class: com.anythink.basead.ui.h5template.WTWebViewSplashATView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (((BaseSplashATView) WTWebViewSplashATView.this).f10098O == null) {
                            return;
                        }
                        WTWebViewSplashATView.this.j();
                    }
                });
            }

            @Override // com.anythink.basead.webtemplet.WTWebContainerView.a
            public final void a(f fVar) {
                WTWebViewSplashATView.this.a(g.a(g.f6336k, g.af + fVar.c()));
                WTWebViewSplashATView.this.a(true, 10);
            }
        });
        this.f11248a = wTWebContainerView;
        a aVar = this.f9903r;
        if (aVar != null) {
            aVar.a(wTWebContainerView);
        }
        Object obj = null;
        try {
            if (d.a(this.f9893g)) {
                WTWebView d2 = d.d(d.a((x) null, this.f9893g, 3));
                if (d2 != null) {
                    obj = d2.getJsCommunicationObject();
                }
            } else {
                obj = new com.anythink.basead.webtemplet.adformat.splash.a();
            }
            if (obj != null && (obj instanceof com.anythink.basead.webtemplet.adformat.splash.a)) {
                ((com.anythink.basead.webtemplet.adformat.splash.a) obj).a(this.f9903r);
                ((com.anythink.basead.webtemplet.adformat.splash.a) obj).a(new com.anythink.basead.webtemplet.adformat.a() { // from class: com.anythink.basead.ui.h5template.WTWebViewSplashATView.2
                    @Override // com.anythink.basead.webtemplet.adformat.a
                    public final void a(int i, int i4) {
                        WTWebViewSplashATView.this.a(i, i4);
                    }

                    @Override // com.anythink.basead.webtemplet.adformat.a
                    public final void b(int i) {
                        if (i == 1) {
                            WTWebViewSplashATView.this.a(BaseATView.a.f9934N);
                        } else {
                            WTWebViewSplashATView.this.a(BaseATView.a.f9935O);
                        }
                    }

                    @Override // com.anythink.basead.webtemplet.adformat.a
                    public final void a(int i) {
                        WTWebViewSplashATView.this.a(true, i);
                    }

                    @Override // com.anythink.basead.webtemplet.adformat.a
                    public final void a(String str, String str2) {
                        WTWebViewSplashATView.this.a(g.a(g.f6336k, g.af + str + "," + str2));
                        WTWebViewSplashATView.this.a(true, 10);
                    }

                    @Override // com.anythink.basead.webtemplet.adformat.a
                    public final void b() {
                        ((BaseATView) WTWebViewSplashATView.this).f9903r.c(0);
                        WTWebViewSplashATView.this.z();
                    }

                    @Override // com.anythink.basead.webtemplet.adformat.a
                    public final void a() {
                        WTWebViewSplashATView.this.A();
                    }
                });
            }
        } catch (Throwable unused) {
        }
        if (obj == null || !(obj instanceof com.anythink.basead.webtemplet.adformat.splash.a)) {
            a(g.a(g.f6336k, "Adx template show fail without exception:empty jsCommunication"));
            a(true, 10);
        } else {
            this.f11248a.init(obj);
            this.f11248a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(this.f11248a, 1);
        }
    }

    public WTWebViewSplashATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
        this.f11250c = "WTWebViewBaseScreenATView";
        this.f11249b = 1;
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_h5_template_splash", "layout"), this);
        w();
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView, com.anythink.basead.ui.BaseSplashATView, com.anythink.basead.ui.BaseATView
    public final void a(int i) {
        super.a(i);
        if (this.f11248a != null) {
            com.anythink.basead.ui.improveclick.a aVar = this.f9904s;
            this.f11248a.notifyInnerAdEvent(i, aVar != null ? aVar.b() : null);
        }
    }
}

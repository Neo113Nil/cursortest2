package com.anythink.expressad.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.video.bt.module.AnythinkBTContainer;
import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;
import com.anythink.expressad.video.signal.a.h;
import com.anythink.expressad.video.signal.a.j;
import com.anythink.expressad.video.signal.a.k;
import com.anythink.expressad.video.signal.a.l;
import com.anythink.expressad.video.signal.a.m;
import com.anythink.expressad.video.signal.a.n;
import com.anythink.expressad.video.signal.c;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.g;
import com.anythink.expressad.video.signal.i;
import java.util.List;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: h, reason: collision with root package name */
    private Activity f22329h;
    private WebView i;

    /* renamed from: j, reason: collision with root package name */
    private AnythinkVideoView f22330j;

    /* renamed from: k, reason: collision with root package name */
    private AnythinkContainerView f22331k;

    /* renamed from: l, reason: collision with root package name */
    private d f22332l;

    /* renamed from: m, reason: collision with root package name */
    private AnythinkBTContainer f22333m;

    /* renamed from: n, reason: collision with root package name */
    private List<d> f22334n;

    /* renamed from: o, reason: collision with root package name */
    private c.a f22335o;

    /* renamed from: p, reason: collision with root package name */
    private String f22336p;

    public b(Activity activity) {
        this.f22329h = activity;
    }

    public final void a(j jVar) {
        this.f22323b = jVar;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.a getActivityProxy() {
        WebView webView = this.i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f22322a == null) {
            this.f22322a = new h(webView);
        }
        return this.f22322a;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        Activity activity;
        AnythinkContainerView anythinkContainerView = this.f22331k;
        if (anythinkContainerView == null || (activity = this.f22329h) == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f22327f == null) {
            this.f22327f = new m(activity, anythinkContainerView);
        }
        return this.f22327f;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.b getJSBTModule() {
        if (this.f22329h == null || this.f22333m == null) {
            return super.getJSBTModule();
        }
        if (this.f22328g == null) {
            this.f22328g = new com.anythink.expressad.video.signal.a.i(this.f22329h, this.f22333m);
        }
        return this.f22328g;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public c getJSCommon() {
        d dVar;
        List<d> list;
        Activity activity = this.f22329h;
        if (activity == null || (dVar = this.f22332l) == null) {
            return super.getJSCommon();
        }
        if (this.f22323b == null) {
            this.f22323b = new j(activity, dVar);
        }
        if (this.f22332l.k() == 5 && (list = this.f22334n) != null) {
            c cVar = this.f22323b;
            if (cVar instanceof j) {
                ((j) cVar).a(list);
            }
        }
        this.f22323b.a(this.f22329h);
        this.f22323b.a(this.f22336p);
        this.f22323b.a(this.f22335o);
        return this.f22323b;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        AnythinkContainerView anythinkContainerView = this.f22331k;
        if (anythinkContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f22326e == null) {
            this.f22326e = new k(anythinkContainerView);
        }
        return this.f22326e;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        WebView webView = this.i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f22325d == null) {
            this.f22325d = new l(webView);
        }
        return this.f22325d;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.j getJSVideoModule() {
        AnythinkVideoView anythinkVideoView = this.f22330j;
        if (anythinkVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f22324c == null) {
            this.f22324c = new n(anythinkVideoView);
        }
        return this.f22324c;
    }

    public final void a(List<d> list) {
        this.f22334n = list;
    }

    public b(Activity activity, AnythinkBTContainer anythinkBTContainer, WebView webView) {
        this.f22329h = activity;
        this.f22333m = anythinkBTContainer;
        this.i = webView;
    }

    private b(Activity activity, WebView webView, AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, d dVar) {
        this.f22329h = activity;
        this.i = webView;
        this.f22330j = anythinkVideoView;
        this.f22331k = anythinkContainerView;
        this.f22332l = dVar;
    }

    public b(Activity activity, WebView webView, AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, d dVar, c.a aVar) {
        this.f22329h = activity;
        this.i = webView;
        this.f22330j = anythinkVideoView;
        this.f22331k = anythinkContainerView;
        this.f22332l = dVar;
        this.f22335o = aVar;
        this.f22336p = anythinkVideoView.getUnitId();
    }
}

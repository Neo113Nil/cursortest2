package com.anythink.basead.webtemplet;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.anythink.basead.ui.BaseATView;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.basead.webtemplet.a.b;
import com.anythink.core.basead.ui.web.BaseWebView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.g;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.expressad.video.module.a.a.m;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class WTWebView extends BaseWebView {

    /* renamed from: A, reason: collision with root package name */
    private c f11540A;

    /* renamed from: a, reason: collision with root package name */
    k f11541a;

    /* renamed from: b, reason: collision with root package name */
    j f11542b;

    /* renamed from: c, reason: collision with root package name */
    c f11543c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f11544d;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f11545e;

    /* renamed from: f, reason: collision with root package name */
    boolean f11546f;

    /* renamed from: h, reason: collision with root package name */
    private final String f11547h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.core.common.t.b f11548j;

    /* renamed from: k, reason: collision with root package name */
    private w f11549k;

    /* renamed from: l, reason: collision with root package name */
    private x f11550l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f11551m;

    /* renamed from: n, reason: collision with root package name */
    private Object f11552n;

    /* renamed from: o, reason: collision with root package name */
    private f f11553o;

    /* renamed from: p, reason: collision with root package name */
    private a f11554p;

    /* renamed from: q, reason: collision with root package name */
    private Object f11555q;

    /* renamed from: r, reason: collision with root package name */
    private final List<i> f11556r;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f11557s;

    /* renamed from: t, reason: collision with root package name */
    private String f11558t;

    /* renamed from: u, reason: collision with root package name */
    private long f11559u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f11560v;

    /* renamed from: w, reason: collision with root package name */
    private long f11561w;

    /* renamed from: x, reason: collision with root package name */
    private long f11562x;

    /* renamed from: y, reason: collision with root package name */
    private long f11563y;

    /* renamed from: z, reason: collision with root package name */
    private long f11564z;

    public interface a {
        void a();
    }

    public WTWebView(Context context) {
        super(context);
        this.f11547h = "WTWebView";
        this.i = m.ai;
        this.f11544d = false;
        this.f11545e = false;
        this.f11555q = new Object();
        this.f11546f = false;
        this.f11556r = Collections.synchronizedList(new ArrayList());
        this.f11557s = false;
        this.f11558t = "";
        this.f11560v = false;
        this.f11561w = 0L;
        this.f11562x = 0L;
        this.f11563y = 0L;
        this.f11564z = 0L;
        this.f11540A = new c() { // from class: com.anythink.basead.webtemplet.WTWebView.1
            @Override // com.anythink.basead.webtemplet.c
            public final void a() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void b() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void c() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void d() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, String str, Bitmap bitmap) {
                if (WTWebView.this.f11561w == 0) {
                    WTWebView.this.f11561w = System.currentTimeMillis();
                }
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    cVar.a(webView, str, bitmap);
                }
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void b(WebView webView) {
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    cVar.b(webView);
                }
            }

            @Override // com.anythink.basead.webtemplet.c
            public final boolean a(WebView webView, String str) {
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    return cVar.a(webView, str);
                }
                return false;
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, int i, String str, String str2) {
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    cVar.a(webView, i, str, str2);
                }
                WTWebView.this.a("", "onReceivedError:" + i + "," + str);
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    cVar.a(webView, sslErrorHandler, sslError);
                }
                WTWebView.this.a("", "onReceivedSslError");
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView) {
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    cVar.a(webView);
                }
                WTWebView.this.a("", "onRenderProcessGone");
            }
        };
    }

    public Object getJsCommunicationObject() {
        return this.f11552n;
    }

    public Object getJsObject(String str) {
        f fVar = this.f11553o;
        if (fVar == null) {
            return null;
        }
        return fVar.a(str);
    }

    public void h5ShowException(String str) {
        String str2;
        if (this.f11548j != null) {
            com.anythink.core.common.t.d.a().b(this.f11548j);
            this.f11548j = null;
        }
        int i = 0;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.optInt("error_code", 0);
            str2 = jSONObject.optString("error_message", "");
        } catch (Throwable unused) {
            str2 = com.anythink.core.common.v.m.f16967e;
        }
        a(i == -999 ? 3 : 2, i + "," + str2);
        c cVar = this.f11543c;
        if (cVar != null) {
            cVar.a(this, i, str2, getUrl());
        }
        a(String.valueOf(i), str2);
    }

    public void initData(w wVar, x xVar, boolean z8) {
        y yVar;
        this.f11549k = wVar;
        this.f11550l = xVar;
        this.f11551m = z8;
        if (xVar == null || (yVar = xVar.f14325o) == null) {
            return;
        }
        this.i = yVar.bM();
    }

    public boolean isPreload() {
        return this.f11551m;
    }

    public void jsCallInitSuccess() {
        this.f11562x = System.currentTimeMillis();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (TextUtils.isEmpty(this.f11558t)) {
            this.f11558t = str;
            this.f11559u = System.currentTimeMillis();
            if (this.f11548j == null) {
                this.f11548j = new com.anythink.core.common.t.b() { // from class: com.anythink.basead.webtemplet.WTWebView.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        WTWebView.this.h5ShowException("{\"error_code\":-999,\"error_message\":\"render timeout\"}");
                    }
                };
                com.anythink.core.common.t.d.a().a(this.f11548j, this.i, true);
            }
        }
        super.loadUrl(str);
    }

    public void notifyInnerAdEvent(final int i, final Map<String, Object> map) {
        if (this.f11557s) {
            com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.webtemplet.WTWebView.5
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:17:0x01e5 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:19:0x01e6  */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v4 */
                /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    String str;
                    String str2;
                    ?? r12 = i;
                    String str3 = "";
                    if (r12 == 101) {
                        str = b.a.f11584k;
                    } else if (r12 != 301) {
                        if (r12 == 305) {
                            Map map2 = map;
                            r12 = b.a.f11588o;
                            if (map2 != null) {
                                JSONObject jSONObject = new JSONObject();
                                Object obj = map.get("wt_view_width");
                                if (obj != null) {
                                    jSONObject.put("view_width", obj);
                                }
                                Object obj2 = map.get("wt_view_height");
                                if (obj2 != null) {
                                    jSONObject.put("view_height", obj2);
                                }
                                str3 = jSONObject.toString();
                            }
                        } else if (r12 == 107) {
                            str = b.a.f11587n;
                        } else {
                            if (r12 != 108) {
                                switch (r12) {
                                    case 110:
                                        str = b.a.f11580f;
                                        break;
                                    case 111:
                                        str = b.a.f11579e;
                                        break;
                                    case 112:
                                        str = b.a.f11581g;
                                        break;
                                    case 113:
                                        Map map3 = map;
                                        r12 = b.a.f11576b;
                                        if (map3 != null) {
                                            JSONObject jSONObject2 = new JSONObject();
                                            Object obj3 = map.get("click_type");
                                            if (obj3 != null) {
                                                jSONObject2.put("cl_s_type", obj3);
                                            }
                                            Object obj4 = map.get(g.a.f11329g);
                                            if (obj3 != null) {
                                                jSONObject2.put("cl_area", obj4);
                                            }
                                            str3 = jSONObject2.toString();
                                            break;
                                        }
                                        break;
                                    case 114:
                                        str = b.a.f11575a;
                                        break;
                                    case 115:
                                        str = b.a.f11577c;
                                        break;
                                    default:
                                        switch (r12) {
                                            case 121:
                                                if (map != null) {
                                                    try {
                                                        JSONObject jSONObject3 = new JSONObject();
                                                        Object obj5 = map.get(g.a.f11330h);
                                                        if (obj5 != null) {
                                                            jSONObject3.put(g.a.f11330h, obj5);
                                                        }
                                                        str3 = jSONObject3.toString();
                                                    } catch (Throwable unused) {
                                                    }
                                                }
                                                str2 = str3;
                                                str3 = b.a.f11582h;
                                                break;
                                            case 122:
                                                str = b.a.i;
                                                break;
                                            case 123:
                                                Map map4 = map;
                                                r12 = b.a.f11583j;
                                                if (map4 != null) {
                                                    JSONObject jSONObject4 = new JSONObject();
                                                    Object obj6 = map.get("video_length");
                                                    if (obj6 != null) {
                                                        jSONObject4.put("duration", obj6);
                                                    }
                                                    str3 = jSONObject4.toString();
                                                    break;
                                                }
                                                break;
                                            case 124:
                                                str = b.a.f11586m;
                                                break;
                                            case 125:
                                                Map map5 = map;
                                                r12 = b.a.f11589p;
                                                if (map5 != null) {
                                                    JSONObject jSONObject5 = new JSONObject();
                                                    Object obj7 = map.get(g.a.f11332k);
                                                    if (obj7 != null) {
                                                        jSONObject5.put(g.a.f13106C, obj7);
                                                    }
                                                    str3 = jSONObject5.toString();
                                                    break;
                                                }
                                                break;
                                            default:
                                                str2 = "";
                                                break;
                                        }
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    return;
                                }
                                com.anythink.basead.webtemplet.a.c.a().a((WebView) WTWebView.this, str3, str2);
                                return;
                            }
                            Map map6 = map;
                            r12 = b.a.f11585l;
                            if (map6 != null) {
                                JSONObject jSONObject6 = new JSONObject();
                                Object obj8 = map.get(g.a.i);
                                if (obj8 != null) {
                                    jSONObject6.put("error_message", obj8);
                                }
                                str3 = jSONObject6.toString();
                            }
                        }
                        str2 = str3;
                        str3 = r12;
                        if (TextUtils.isEmpty(str3)) {
                        }
                    } else {
                        str = b.a.f11578d;
                        try {
                            JSONObject jSONObject7 = new JSONObject();
                            JSONObject jSONObject8 = new JSONObject();
                            String B8 = WTWebView.this.f11549k.B();
                            if (!TextUtils.isEmpty(B8)) {
                                if (WTWebView.this.f11549k.ab() <= 0 && WTWebView.this.f11549k.ac() <= 0) {
                                    com.anythink.basead.b.f.a();
                                    int[] a9 = com.anythink.core.common.v.h.a(com.anythink.basead.b.f.a(1, B8));
                                    if (a9 != null) {
                                        jSONObject8.put("image_width", a9[0]);
                                        jSONObject8.put("image_height", a9[1]);
                                    }
                                }
                                jSONObject8.put("image_width", WTWebView.this.f11549k.ab());
                                jSONObject8.put("image_height", WTWebView.this.f11549k.ac());
                            }
                            if (!TextUtils.isEmpty(WTWebView.this.f11549k.E()) && WTWebView.this.f11549k.V() > 0 && WTWebView.this.f11549k.W() > 0) {
                                jSONObject8.put("video_width", WTWebView.this.f11549k.V());
                                jSONObject8.put("video_height", WTWebView.this.f11549k.W());
                            }
                            jSONObject7.put(b.c.f11597g, jSONObject8);
                            str3 = jSONObject7.toString();
                        } catch (Throwable unused2) {
                        }
                    }
                    String str4 = str3;
                    str3 = str;
                    str2 = str4;
                    if (TextUtils.isEmpty(str3)) {
                    }
                }
            }, 2);
            return;
        }
        synchronized (this.f11556r) {
            this.f11556r.add(new i(i, map));
        }
    }

    public void offerDataInject() {
        this.f11563y = System.currentTimeMillis();
        String str = "";
        try {
            if (getContext() == null) {
                t.b().g();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("offer_data", new JSONObject(this.f11549k.aw()));
            JSONObject jSONObject2 = new JSONObject();
            String B8 = this.f11549k.B();
            if (!TextUtils.isEmpty(B8)) {
                if (this.f11549k.ab() <= 0 && this.f11549k.ac() <= 0) {
                    com.anythink.basead.b.f.a();
                    int[] a9 = com.anythink.core.common.v.h.a(com.anythink.basead.b.f.a(1, B8));
                    if (a9 != null) {
                        jSONObject2.put("image_width", a9[0]);
                        jSONObject2.put("image_height", a9[1]);
                    }
                }
                jSONObject2.put("image_width", this.f11549k.ab());
                jSONObject2.put("image_height", this.f11549k.ac());
            }
            if (!TextUtils.isEmpty(this.f11549k.E()) && this.f11549k.V() > 0 && this.f11549k.W() > 0) {
                jSONObject2.put("video_width", this.f11549k.V());
                jSONObject2.put("video_height", this.f11549k.W());
            }
            jSONObject.put(b.c.f11597g, jSONObject2);
            str = jSONObject.toString();
        } catch (Throwable unused) {
        }
        com.anythink.basead.webtemplet.a.c.a().a((WebView) this, b.C0065b.f11590a, str);
        this.f11564z = System.currentTimeMillis();
        this.f11557s = true;
        synchronized (this.f11556r) {
            try {
                if (!this.f11556r.isEmpty()) {
                    for (i iVar : this.f11556r) {
                        notifyInnerAdEvent(iVar.f11671a, iVar.f11672b);
                    }
                    this.f11556r.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.anythink.core.basead.ui.web.BaseWebView, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f11546f) {
            return;
        }
        this.f11546f = true;
        notifyInnerAdEvent(BaseATView.a.f9932L, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int i, int i4, int i9, int i10) {
        super.onSizeChanged(i, i4, i9, i10);
        if (i == i9 && i4 == i10) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("wt_view_width", Integer.valueOf(i));
            hashMap.put("wt_view_height", Integer.valueOf(i4));
            notifyInnerAdEvent(BaseATView.a.f9936P, hashMap);
        } catch (Throwable unused) {
        }
    }

    public void prepare(a aVar) {
        this.f11554p = aVar;
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.anythink.basead.webtemplet.WTWebView.3
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                try {
                    if (WTWebView.this.f11544d) {
                        return false;
                    }
                    WTWebView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    WTWebView.this.f11544d = true;
                    WTWebView.this.c();
                    return false;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return false;
                }
            }
        });
    }

    public void release() {
        try {
            if (this.f11548j != null) {
                com.anythink.core.common.t.d.a().b(this.f11548j);
                this.f11548j = null;
            }
            setVisibility(8);
            setDownloadListener(null);
            this.f11552n = null;
            if (this.f11540A != null) {
                this.f11540A = null;
            }
            if (this.f11543c != null) {
                this.f11543c = null;
            }
            destroy();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void renderSuccess() {
        if (this.f11548j != null) {
            com.anythink.core.common.t.d.a().b(this.f11548j);
            this.f11548j = null;
        }
        this.f11545e = true;
        c cVar = this.f11543c;
        if (cVar != null) {
            cVar.b(this);
        }
        c();
        a(1, "");
        if (!this.f11549k.ae() || TextUtils.isEmpty(this.f11549k.D())) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(g.a.f11330h, this.f11549k.D());
        notifyInnerAdEvent(121, hashMap);
    }

    public void sendEventDA(final String str) {
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.webtemplet.WTWebView.4
            @Override // java.lang.Runnable
            public final void run() {
                w unused = WTWebView.this.f11549k;
                com.anythink.core.common.u.e.a(WTWebView.this.f11550l, str);
            }
        }, 2);
    }

    public void setJsCommunicationObject(Object obj) {
        this.f11552n = obj;
    }

    public void setWebViewListener(c cVar) {
        this.f11543c = cVar;
        j jVar = this.f11542b;
        if (jVar != null) {
            jVar.a(this.f11540A);
        }
        k kVar = this.f11541a;
        if (kVar != null) {
            kVar.a(this.f11540A);
        }
    }

    public void setWebViewTransparent() {
        setBackgroundColor(0);
        setBackgroundDrawable(null);
        setBackground(null);
    }

    private void b() {
        Class cls = Boolean.TYPE;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        requestFocus();
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setTextZoom(100);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(false);
            }
        } catch (Throwable unused) {
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setAllowUniversalAccessFromFileURLs(false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            settings.setMixedContentMode(1);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod(com.anythink.core.common.v.k.b("c2V0TWl4ZWRDb250ZW50TW9kZQ=="), Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, 0);
        } catch (Throwable unused2) {
        }
        settings.setDatabaseEnabled(true);
        String path = getContext().getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        try {
            Method declaredMethod2 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", cls);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(settings, Boolean.FALSE);
        } catch (Throwable unused3) {
        }
        try {
            Method declaredMethod3 = WebSettings.class.getDeclaredMethod(com.anythink.core.common.v.k.b("c2V0QWxsb3dVbml2ZXJzYWxBY2Nlc3NGcm9tRmlsZVVSTHM="), cls);
            declaredMethod3.setAccessible(true);
            declaredMethod3.invoke(settings, Boolean.TRUE);
        } catch (Throwable unused4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        a aVar;
        synchronized (this.f11555q) {
            try {
                if (this.f11544d && this.f11545e && (aVar = this.f11554p) != null) {
                    aVar.a();
                    this.f11554p = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d() {
        a(1, "");
        if (!this.f11549k.ae() || TextUtils.isEmpty(this.f11549k.D())) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(g.a.f11330h, this.f11549k.D());
        notifyInnerAdEvent(121, hashMap);
    }

    @Override // com.anythink.core.basead.ui.web.BaseWebView
    public final void a() {
        Class cls = Boolean.TYPE;
        super.a();
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        requestFocus();
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setTextZoom(100);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(false);
            }
        } catch (Throwable unused) {
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setAllowUniversalAccessFromFileURLs(false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            settings.setMixedContentMode(1);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod(com.anythink.core.common.v.k.b("c2V0TWl4ZWRDb250ZW50TW9kZQ=="), Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, 0);
        } catch (Throwable unused2) {
        }
        settings.setDatabaseEnabled(true);
        String path = getContext().getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        try {
            Method declaredMethod2 = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", cls);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(settings, Boolean.FALSE);
        } catch (Throwable unused3) {
        }
        try {
            Method declaredMethod3 = WebSettings.class.getDeclaredMethod(com.anythink.core.common.v.k.b("c2V0QWxsb3dVbml2ZXJzYWxBY2Nlc3NGcm9tRmlsZVVSTHM="), cls);
            declaredMethod3.setAccessible(true);
            declaredMethod3.invoke(settings, Boolean.TRUE);
        } catch (Throwable unused4) {
        }
        j jVar = new j();
        this.f11542b = jVar;
        jVar.f11673a = this;
        jVar.f11674b = new g(this);
        setWebChromeClient(this.f11542b);
        k kVar = new k();
        this.f11541a = kVar;
        kVar.f11678a = new g(this);
        setWebViewClient(this.f11541a);
        this.f11553o = new f(this);
        setWebViewTransparent();
    }

    public WTWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11547h = "WTWebView";
        this.i = m.ai;
        this.f11544d = false;
        this.f11545e = false;
        this.f11555q = new Object();
        this.f11546f = false;
        this.f11556r = Collections.synchronizedList(new ArrayList());
        this.f11557s = false;
        this.f11558t = "";
        this.f11560v = false;
        this.f11561w = 0L;
        this.f11562x = 0L;
        this.f11563y = 0L;
        this.f11564z = 0L;
        this.f11540A = new c() { // from class: com.anythink.basead.webtemplet.WTWebView.1
            @Override // com.anythink.basead.webtemplet.c
            public final void a() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void b() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void c() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void d() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, String str, Bitmap bitmap) {
                if (WTWebView.this.f11561w == 0) {
                    WTWebView.this.f11561w = System.currentTimeMillis();
                }
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    cVar.a(webView, str, bitmap);
                }
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void b(WebView webView) {
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    cVar.b(webView);
                }
            }

            @Override // com.anythink.basead.webtemplet.c
            public final boolean a(WebView webView, String str) {
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    return cVar.a(webView, str);
                }
                return false;
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, int i, String str, String str2) {
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    cVar.a(webView, i, str, str2);
                }
                WTWebView.this.a("", "onReceivedError:" + i + "," + str);
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    cVar.a(webView, sslErrorHandler, sslError);
                }
                WTWebView.this.a("", "onReceivedSslError");
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView) {
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    cVar.a(webView);
                }
                WTWebView.this.a("", "onRenderProcessGone");
            }
        };
    }

    public WTWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11547h = "WTWebView";
        this.i = m.ai;
        this.f11544d = false;
        this.f11545e = false;
        this.f11555q = new Object();
        this.f11546f = false;
        this.f11556r = Collections.synchronizedList(new ArrayList());
        this.f11557s = false;
        this.f11558t = "";
        this.f11560v = false;
        this.f11561w = 0L;
        this.f11562x = 0L;
        this.f11563y = 0L;
        this.f11564z = 0L;
        this.f11540A = new c() { // from class: com.anythink.basead.webtemplet.WTWebView.1
            @Override // com.anythink.basead.webtemplet.c
            public final void a() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void b() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void c() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void d() {
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, String str, Bitmap bitmap) {
                if (WTWebView.this.f11561w == 0) {
                    WTWebView.this.f11561w = System.currentTimeMillis();
                }
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    cVar.a(webView, str, bitmap);
                }
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void b(WebView webView) {
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    cVar.b(webView);
                }
            }

            @Override // com.anythink.basead.webtemplet.c
            public final boolean a(WebView webView, String str) {
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    return cVar.a(webView, str);
                }
                return false;
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, int i4, String str, String str2) {
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    cVar.a(webView, i4, str, str2);
                }
                WTWebView.this.a("", "onReceivedError:" + i4 + "," + str);
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    cVar.a(webView, sslErrorHandler, sslError);
                }
                WTWebView.this.a("", "onReceivedSslError");
            }

            @Override // com.anythink.basead.webtemplet.c
            public final void a(WebView webView) {
                c cVar = WTWebView.this.f11543c;
                if (cVar != null) {
                    cVar.a(webView);
                }
                WTWebView.this.a("", "onRenderProcessGone");
            }
        };
    }

    private static int a(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            }
            if (packageInfo == null || TextUtils.isEmpty(packageInfo.versionName)) {
                return 0;
            }
            return packageInfo.versionName.equals("77.0.3865.92") ? 5 : 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        com.anythink.basead.webtemplet.adformat.a a9;
        Object obj = this.f11552n;
        if (obj == null || !(obj instanceof com.anythink.basead.webtemplet.adformat.e) || (a9 = ((com.anythink.basead.webtemplet.adformat.e) obj).a()) == null) {
            return;
        }
        a9.a(str, str2);
    }

    private synchronized void a(int i, String str) {
        if (!this.f11560v && !this.f12098g) {
            this.f11560v = true;
            w wVar = this.f11549k;
            x xVar = this.f11550l;
            long currentTimeMillis = System.currentTimeMillis();
            long j9 = this.f11559u;
            com.anythink.core.common.u.e.a(wVar, xVar, i, currentTimeMillis - j9, str, this.f11561w, this.f11562x, this.f11563y, this.f11564z, j9);
        }
    }
}

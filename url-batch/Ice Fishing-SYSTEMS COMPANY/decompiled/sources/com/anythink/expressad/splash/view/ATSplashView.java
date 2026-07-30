package com.anythink.expressad.splash.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.splash.js.SplashJSBridgeImpl;
import com.anythink.expressad.splash.js.SplashJsUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ATSplashView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f20888a = "webviewshow";

    /* renamed from: b, reason: collision with root package name */
    protected static final String f20889b = "updateCountdown";

    /* renamed from: c, reason: collision with root package name */
    private static String f20890c = "ATSplashView";

    /* renamed from: d, reason: collision with root package name */
    private int f20891d;

    /* renamed from: e, reason: collision with root package name */
    private ATSplashWebview f20892e;

    /* renamed from: f, reason: collision with root package name */
    private b f20893f;

    /* renamed from: g, reason: collision with root package name */
    private ViewGroup f20894g;

    /* renamed from: h, reason: collision with root package name */
    private View f20895h;
    private View i;

    /* renamed from: j, reason: collision with root package name */
    private int f20896j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20897k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20898l;

    /* renamed from: m, reason: collision with root package name */
    private ViewGroup f20899m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20900n;

    /* renamed from: o, reason: collision with root package name */
    private View f20901o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f20902p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20903q;

    /* renamed from: r, reason: collision with root package name */
    private RelativeLayout.LayoutParams f20904r;

    /* renamed from: s, reason: collision with root package name */
    private SplashJSBridgeImpl f20905s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f20906t;

    public ATSplashView(Context context) {
        this(context, null);
    }

    private void b() {
        setBackgroundColor(0);
        this.f20891d = getResources().getConfiguration().orientation;
        this.f20906t = false;
    }

    private void c() {
        View view;
        View view2;
        View view3;
        if (this.i != null) {
            if (this.f20894g == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f20894g = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f20891d == 2) {
                this.f20896j = v.f(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f20894g.getId());
                if (!this.f20902p || (view2 = this.f20901o) == null) {
                    ATSplashWebview aTSplashWebview = this.f20892e;
                    if (aTSplashWebview != null && aTSplashWebview.getParent() == null) {
                        addView(this.f20892e, layoutParams);
                    }
                    d();
                } else {
                    if (view2.getParent() != null) {
                        am.a(this.f20901o);
                    }
                    addView(this.f20901o, layoutParams);
                }
                ViewGroup viewGroup = this.f20894g;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i = this.f20904r.width;
                    am.a(this.i);
                    int i4 = this.f20896j;
                    if (i > i4 / 4) {
                        i = i4 / 4;
                    }
                    this.f20894g.addView(this.i, i, -1);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f20894g, layoutParams2);
                }
            } else {
                this.f20896j = v.e(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f20894g.getId());
                if (!this.f20902p || (view = this.f20901o) == null) {
                    ATSplashWebview aTSplashWebview2 = this.f20892e;
                    if (aTSplashWebview2 != null && aTSplashWebview2.getParent() == null) {
                        addView(this.f20892e, layoutParams3);
                    }
                    d();
                } else {
                    if (view.getParent() != null) {
                        am.a(this.f20901o);
                    }
                    addView(this.f20901o, layoutParams3);
                }
                ViewGroup viewGroup2 = this.f20894g;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i9 = this.f20904r.height;
                    int i10 = this.f20896j;
                    if (i9 > i10 / 4) {
                        i9 = i10 / 4;
                    }
                    am.a(this.i);
                    this.f20894g.addView(this.i, -1, i9);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i9);
                    layoutParams4.addRule(12);
                    addView(this.f20894g, layoutParams4);
                }
            }
        } else if (!this.f20902p || (view3 = this.f20901o) == null) {
            ATSplashWebview aTSplashWebview3 = this.f20892e;
            if (aTSplashWebview3 != null && aTSplashWebview3.getParent() == null) {
                addView(this.f20892e, new ViewGroup.LayoutParams(-1, -1));
            }
            d();
        } else {
            if (view3.getParent() != null) {
                am.a(this.f20901o);
            }
            addView(this.f20901o, new ViewGroup.LayoutParams(-1, -1));
        }
        View view4 = this.f20895h;
        if (view4 != null) {
            if (view4.getParent() != null) {
                bringChildToFront(this.f20895h);
                return;
            }
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(v.b(getContext(), 100.0f), v.b(getContext(), 30.0f));
            layoutParams5.addRule(10);
            layoutParams5.addRule(11);
            layoutParams5.rightMargin = v.b(getContext(), 10.0f);
            layoutParams5.topMargin = v.b(getContext(), 10.0f);
            addView(this.f20895h, layoutParams5);
        }
    }

    private void d() {
        ATSplashWebview aTSplashWebview = this.f20892e;
        if (aTSplashWebview != null) {
            aTSplashWebview.setObject(this.f20905s);
            this.f20892e.post(new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashView.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        String unused = ATSplashView.f20890c;
                        String str = "";
                        try {
                            ATSplashView.this.f20892e.getLocationOnScreen(new int[2]);
                            String unused2 = ATSplashView.f20890c;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", v.a(t.b().g(), r4[0]));
                            jSONObject.put("startY", v.a(t.b().g(), r4[1]));
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            String unused3 = ATSplashView.f20890c;
                            th.getMessage();
                        }
                        int[] iArr = new int[2];
                        ATSplashView.this.f20892e.getLocationInWindow(iArr);
                        ATSplashView.transInfoForMraid(ATSplashView.this.f20892e, iArr[0], iArr[1], ATSplashView.this.f20892e.getWidth(), ATSplashView.this.f20892e.getHeight());
                        String encodeToString = Base64.encodeToString(str.toString().getBytes(), 2);
                        h.a();
                        com.anythink.core.express.d.a.a((WebView) ATSplashView.this.f20892e, ATSplashView.f20888a, encodeToString);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            });
        }
    }

    public static void transInfoForMraid(WebView webView, int i, int i4, int i9, int i10) {
        try {
            int i11 = t.b().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i11 == 2 ? "landscape" : i11 == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", "true");
            float f6 = n.f(t.b().g());
            float g9 = n.g(t.b().g());
            HashMap h9 = n.h(t.b().g());
            int intValue = ((Integer) h9.get("width")).intValue();
            int intValue2 = ((Integer) h9.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f17683a, "Interstitial");
            hashMap.put(com.anythink.core.express.b.a.f17684b, com.anythink.core.express.b.a.f17688f);
            hashMap.put(com.anythink.core.express.b.a.f17685c, "true");
            hashMap.put(com.anythink.core.express.b.a.f17686d, jSONObject);
            com.anythink.core.express.b.a.a();
            float f9 = i;
            float f10 = i4;
            float f11 = i9;
            float f12 = i10;
            com.anythink.core.express.b.a.a(webView, f9, f10, f11, f12);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(webView, f9, f10, f11, f12);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(webView, f6, g9);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(webView, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(webView, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(webView);
        } catch (Throwable unused) {
        }
    }

    public void changeCloseBtnState(int i) {
        View view = this.f20895h;
        if (view != null) {
            if (i == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void checkSkipViewLocation() {
        if (this.f20906t) {
            return;
        }
        try {
            View view = this.f20895h;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    int i = ((RelativeLayout.LayoutParams) layoutParams).topMargin;
                    int b9 = q.b(getContext()) + i;
                    if (i > 0) {
                        this.f20906t = true;
                    }
                    int[] iArr = new int[2];
                    this.f20895h.getLocationOnScreen(iArr);
                    int i4 = iArr[1];
                    if (i4 < b9) {
                        ((RelativeLayout.LayoutParams) layoutParams).topMargin = i + (b9 - i4);
                        this.f20895h.setLayoutParams(layoutParams);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void clearResState() {
        this.f20900n = false;
        this.f20898l = false;
        this.f20897k = false;
    }

    public void destroy() {
        ATSplashWebview aTSplashWebview = this.f20892e;
        if (aTSplashWebview == null || aTSplashWebview.isDestroyed()) {
            return;
        }
        this.f20892e.finishAdSession();
        SplashJsUtils.sendEventToH5(this.f20892e, "onSystemDestory", "");
        this.f20892e.release();
        this.f20892e = null;
    }

    public View getCloseView() {
        return this.f20895h;
    }

    public ViewGroup getDevContainer() {
        return this.f20899m;
    }

    public View getIconVg() {
        return this.i;
    }

    public SplashJSBridgeImpl getSplashJSBridgeImpl() {
        return this.f20905s;
    }

    public ATSplashWebview getSplashWebview() {
        return this.f20892e;
    }

    public boolean isAttach() {
        return this.f20903q;
    }

    public boolean isDynamicView() {
        return this.f20902p;
    }

    public boolean isH5Ready() {
        return this.f20897k;
    }

    public boolean isImageReady() {
        return this.f20900n;
    }

    public boolean isVideoReady() {
        return this.f20898l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20903q = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
        checkSkipViewLocation();
    }

    public void onPause() {
        View view = this.f20901o;
        if (view == null || !(view instanceof ATSplashNativeView)) {
            return;
        }
        ((ATSplashNativeView) view).setIsPause(true);
    }

    public void onResume() {
        View view = this.f20901o;
        if (view == null || !(view instanceof ATSplashNativeView)) {
            return;
        }
        ((ATSplashNativeView) view).setIsPause(false);
    }

    public void resetLoadState() {
        this.f20898l = false;
        this.f20897k = false;
    }

    public void setAllowClickSplash(final boolean z8) {
        ATSplashWebview aTSplashWebview = this.f20892e;
        if (aTSplashWebview != null) {
            aTSplashWebview.setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.expressad.splash.view.ATSplashView.2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return !z8;
                }
            });
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.anythink.expressad.splash.view.ATSplashView.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return !z8;
            }
        });
    }

    public void setCloseView(View view) {
        this.f20895h = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.f20899m = viewGroup;
    }

    public void setDynamicView(boolean z8) {
        this.f20902p = z8;
    }

    public void setH5Ready(boolean z8) {
        this.f20897k = z8;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.i = view;
        this.f20904r = layoutParams;
    }

    public void setImageReady(boolean z8) {
        this.f20900n = z8;
    }

    public void setNotchPadding(int i, int i4, int i9, int i10) {
        View view = this.f20901o;
        if (view != null && (view instanceof ATSplashNativeView)) {
            ((ATSplashNativeView) view).setNotchPadding(i, i4, i9, i10);
        }
        if (this.f20892e != null) {
            String a9 = i.a(-999, i, i4, i9, i10);
            h.a();
            com.anythink.core.express.d.a.a((WebView) this.f20892e, "oncutoutfetched", Base64.encodeToString(a9.getBytes(), 0));
        }
    }

    public void setSplashJSBridgeImpl(SplashJSBridgeImpl splashJSBridgeImpl) {
        this.f20905s = splashJSBridgeImpl;
        ATSplashWebview aTSplashWebview = this.f20892e;
        if (aTSplashWebview != null) {
            aTSplashWebview.setObject(splashJSBridgeImpl);
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.f20901o = view;
        }
    }

    public void setSplashWebview() {
        if (this.f20892e == null) {
            try {
                ATSplashWebview aTSplashWebview = new ATSplashWebview(getContext());
                this.f20892e = aTSplashWebview;
                SplashJSBridgeImpl splashJSBridgeImpl = this.f20905s;
                if (splashJSBridgeImpl != null) {
                    aTSplashWebview.setObject(splashJSBridgeImpl);
                }
                b bVar = this.f20893f;
                if (bVar != null) {
                    this.f20892e.setWebViewClient(bVar);
                    return;
                }
                b bVar2 = new b();
                this.f20893f = bVar2;
                this.f20892e.setWebViewClient(bVar2);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public void setVideoReady(boolean z8) {
        this.f20898l = z8;
    }

    public void show() {
        View view;
        View view2;
        View view3;
        ViewGroup viewGroup;
        com.anythink.expressad.splash.d.a splashBridgeListener;
        if (this.f20905s != null && (viewGroup = this.f20899m) != null && (viewGroup.getContext() instanceof Activity)) {
            this.f20905s.updateContext(this.f20899m.getContext());
            b bVar = this.f20893f;
            if (bVar != null && (splashBridgeListener = this.f20905s.getSplashBridgeListener()) != null) {
                bVar.f20989a = splashBridgeListener;
            }
        }
        if (this.i != null) {
            if (this.f20894g == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f20894g = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f20891d == 2) {
                this.f20896j = v.f(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f20894g.getId());
                if (!this.f20902p || (view2 = this.f20901o) == null) {
                    ATSplashWebview aTSplashWebview = this.f20892e;
                    if (aTSplashWebview != null && aTSplashWebview.getParent() == null) {
                        addView(this.f20892e, layoutParams);
                    }
                    d();
                } else {
                    if (view2.getParent() != null) {
                        am.a(this.f20901o);
                    }
                    addView(this.f20901o, layoutParams);
                }
                ViewGroup viewGroup2 = this.f20894g;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i = this.f20904r.width;
                    am.a(this.i);
                    int i4 = this.f20896j;
                    if (i > i4 / 4) {
                        i = i4 / 4;
                    }
                    this.f20894g.addView(this.i, i, -1);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f20894g, layoutParams2);
                }
            } else {
                this.f20896j = v.e(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f20894g.getId());
                if (!this.f20902p || (view = this.f20901o) == null) {
                    ATSplashWebview aTSplashWebview2 = this.f20892e;
                    if (aTSplashWebview2 != null && aTSplashWebview2.getParent() == null) {
                        addView(this.f20892e, layoutParams3);
                    }
                    d();
                } else {
                    if (view.getParent() != null) {
                        am.a(this.f20901o);
                    }
                    addView(this.f20901o, layoutParams3);
                }
                ViewGroup viewGroup3 = this.f20894g;
                if (viewGroup3 != null && viewGroup3.getParent() == null) {
                    int i9 = this.f20904r.height;
                    int i10 = this.f20896j;
                    if (i9 > i10 / 4) {
                        i9 = i10 / 4;
                    }
                    am.a(this.i);
                    this.f20894g.addView(this.i, -1, i9);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i9);
                    layoutParams4.addRule(12);
                    addView(this.f20894g, layoutParams4);
                }
            }
        } else if (!this.f20902p || (view3 = this.f20901o) == null) {
            ATSplashWebview aTSplashWebview3 = this.f20892e;
            if (aTSplashWebview3 != null && aTSplashWebview3.getParent() == null) {
                addView(this.f20892e, new ViewGroup.LayoutParams(-1, -1));
            }
            d();
        } else {
            if (view3.getParent() != null) {
                am.a(this.f20901o);
            }
            addView(this.f20901o, new ViewGroup.LayoutParams(-1, -1));
        }
        View view4 = this.f20895h;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(v.b(getContext(), 100.0f), v.b(getContext(), 30.0f));
                layoutParams5.addRule(10);
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = v.b(getContext(), 10.0f);
                layoutParams5.topMargin = v.b(getContext(), 10.0f);
                addView(this.f20895h, layoutParams5);
            } else {
                bringChildToFront(this.f20895h);
            }
        }
        clearResState();
    }

    public void updateCountdown(int i) {
        View view;
        if (this.f20892e != null && !this.f20902p) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.anythink.expressad.f.a.b.dl, i);
                String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                h.a();
                com.anythink.core.express.d.a.a((WebView) this.f20892e, f20889b, encodeToString);
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }
        if (this.f20902p && (view = this.f20901o) != null && (view instanceof ATSplashNativeView)) {
            ((ATSplashNativeView) view).updateCountDown(i);
        }
    }

    public ATSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20906t = false;
        b();
    }
}

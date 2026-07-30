package com.anythink.basead.mraid;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.q;
import com.anythink.core.express.b.c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MraidWebView extends MraidBaseWebView {
    public static String TAG = "MraidWebView";

    /* renamed from: d, reason: collision with root package name */
    e f9758d;

    /* renamed from: e, reason: collision with root package name */
    boolean f9759e;

    /* renamed from: f, reason: collision with root package name */
    com.anythink.core.express.b.c f9760f;

    /* renamed from: g, reason: collision with root package name */
    boolean f9761g;

    /* renamed from: com.anythink.basead.mraid.MraidWebView$2, reason: invalid class name */
    public class AnonymousClass2 implements c.b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.core.express.b.c.b
        public final void a(double d2) {
            String str = MraidWebView.TAG;
            try {
                com.anythink.core.express.b.a.a();
                com.anythink.core.express.b.a.a(MraidWebView.this, d2);
            } catch (Exception e6) {
                String str2 = MraidWebView.TAG;
                e6.getMessage();
            }
        }
    }

    public MraidWebView(Context context) {
        super(context);
        this.f9759e = false;
    }

    public static /* synthetic */ void a(MraidWebView mraidWebView) {
        Object object = mraidWebView.getObject();
        com.anythink.core.express.web.b baseWebViewClient = mraidWebView.getBaseWebViewClient();
        if (object instanceof d) {
            Context context = mraidWebView.getContext();
            if (context instanceof Activity) {
                ((d) object).f9780b = new WeakReference<>((Activity) context);
            }
            ((d) object).a(mraidWebView.f9758d);
        }
        if (baseWebViewClient instanceof k) {
            ((k) baseWebViewClient).f9817c = mraidWebView.f9758d;
        }
    }

    private void b() {
        Object object = getObject();
        com.anythink.core.express.web.b baseWebViewClient = getBaseWebViewClient();
        if (object instanceof d) {
            Context context = getContext();
            if (context instanceof Activity) {
                ((d) object).f9780b = new WeakReference<>((Activity) context);
            }
            ((d) object).a(this.f9758d);
        }
        if (baseWebViewClient instanceof k) {
            ((k) baseWebViewClient).f9817c = this.f9758d;
        }
    }

    private void c() {
        com.anythink.core.express.b.c cVar = new com.anythink.core.express.b.c(getContext());
        this.f9760f = cVar;
        cVar.c();
        this.f9760f.a();
        this.f9760f.a(new AnonymousClass2());
    }

    public void prepare(Context context, e eVar) {
        this.f9758d = eVar;
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.anythink.basead.mraid.MraidWebView.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                try {
                    MraidWebView mraidWebView = MraidWebView.this;
                    if (!mraidWebView.f9759e) {
                        mraidWebView.getViewTreeObserver().removeOnPreDrawListener(this);
                        MraidWebView mraidWebView2 = MraidWebView.this;
                        mraidWebView2.f9759e = true;
                        int[] iArr = new int[2];
                        mraidWebView2.getLocationInWindow(iArr);
                        MraidWebView mraidWebView3 = MraidWebView.this;
                        float f6 = iArr[0];
                        float f9 = iArr[1];
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", f6);
                            jSONObject.put("startY", f9);
                            jSONObject.put("scale", q.h(t.b().g()));
                            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                            f.a();
                            com.anythink.core.express.d.a.a((WebView) mraidWebView3, "webviewshow", encodeToString);
                        } catch (Throwable unused) {
                        }
                        MraidWebView mraidWebView4 = MraidWebView.this;
                        int i = iArr[0];
                        int i4 = iArr[1];
                        int width = mraidWebView4.getWidth();
                        int height = MraidWebView.this.getHeight();
                        try {
                            int i9 = t.b().g().getResources().getConfiguration().orientation;
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("orientation", i9 == 2 ? "landscape" : i9 == 1 ? "portrait" : "undefined");
                            jSONObject2.put("locked", "true");
                            float e6 = q.e(t.b().g());
                            float f10 = q.f(t.b().g());
                            HashMap g9 = q.g(t.b().g());
                            int intValue = ((Integer) g9.get("width")).intValue();
                            int intValue2 = ((Integer) g9.get("height")).intValue();
                            HashMap hashMap = new HashMap();
                            hashMap.put(com.anythink.core.express.b.a.f17683a, com.anythink.core.express.b.a.f17692k);
                            hashMap.put(com.anythink.core.express.b.a.f17684b, com.anythink.core.express.b.a.f17688f);
                            hashMap.put(com.anythink.core.express.b.a.f17685c, "true");
                            hashMap.put(com.anythink.core.express.b.a.f17686d, jSONObject2);
                            com.anythink.core.express.b.a.a();
                            float f11 = i;
                            float f12 = i4;
                            float f13 = width;
                            float f14 = height;
                            com.anythink.core.express.b.a.a(mraidWebView4, f11, f12, f13, f14);
                            com.anythink.core.express.b.a.a();
                            com.anythink.core.express.b.a.b(mraidWebView4, f11, f12, f13, f14);
                            com.anythink.core.express.b.a.a();
                            com.anythink.core.express.b.a.b(mraidWebView4, e6, f10);
                            com.anythink.core.express.b.a.a();
                            com.anythink.core.express.b.a.c(mraidWebView4, intValue, intValue2);
                            com.anythink.core.express.b.a.a();
                            com.anythink.core.express.b.a.a(mraidWebView4, hashMap);
                            com.anythink.core.express.b.a.a();
                            com.anythink.core.express.b.a.a(mraidWebView4);
                        } catch (Throwable unused2) {
                        }
                        MraidWebView.a(MraidWebView.this);
                        MraidWebView mraidWebView5 = MraidWebView.this;
                        if (mraidWebView5.f9761g) {
                            MraidWebView.b(mraidWebView5);
                        }
                        e eVar2 = MraidWebView.this.f9758d;
                        if (eVar2 != null) {
                            eVar2.a();
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return false;
            }
        });
    }

    @Override // com.anythink.basead.mraid.MraidBaseWebView, com.anythink.core.express.web.BaseWebView
    public void release() {
        super.release();
        setWebViewListener(null);
        com.anythink.core.express.b.c cVar = this.f9760f;
        if (cVar != null) {
            cVar.d();
        }
    }

    public void setNeedRegisterVolumeChangeReceiver(boolean z8) {
        this.f9761g = z8;
    }

    public MraidWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9759e = false;
    }

    public MraidWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9759e = false;
    }

    public static /* synthetic */ void b(MraidWebView mraidWebView) {
        com.anythink.core.express.b.c cVar = new com.anythink.core.express.b.c(mraidWebView.getContext());
        mraidWebView.f9760f = cVar;
        cVar.c();
        mraidWebView.f9760f.a();
        mraidWebView.f9760f.a(mraidWebView.new AnonymousClass2());
    }
}

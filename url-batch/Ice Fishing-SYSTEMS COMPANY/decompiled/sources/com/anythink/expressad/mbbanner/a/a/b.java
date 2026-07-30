package com.anythink.expressad.mbbanner.a.a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.z;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.n;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final String f19983a;

    /* renamed from: b, reason: collision with root package name */
    private String f19984b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19985c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f19986d;

    /* renamed from: e, reason: collision with root package name */
    private WindVaneWebView f19987e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f19988f;

    /* renamed from: g, reason: collision with root package name */
    private String f19989g;

    /* renamed from: h, reason: collision with root package name */
    private List<d> f19990h;
    private com.anythink.expressad.mbbanner.a.c.a i;

    /* renamed from: j, reason: collision with root package name */
    private IMraidJSBridge f19991j;

    /* renamed from: com.anythink.expressad.mbbanner.a.a.b$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.dismiss();
        }
    }

    /* renamed from: com.anythink.expressad.mbbanner.a.a.b$2, reason: invalid class name */
    public class AnonymousClass2 extends com.anythink.expressad.atsignalcommon.b.b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.evaluateJavascript("javascript:" + z.a().b(), new ValueCallback<String>() { // from class: com.anythink.expressad.mbbanner.a.a.b.2.1
                private static void a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
            b.a(b.this);
        }
    }

    /* renamed from: com.anythink.expressad.mbbanner.a.a.b$3, reason: invalid class name */
    public class AnonymousClass3 implements DialogInterface.OnDismissListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (b.this.i != null) {
                b.this.i.a(false);
            }
            b.this.f19987e.loadDataWithBaseURL(null, "", "text/html", com.anythink.expressad.foundation.g.a.bR, null);
            b.this.f19986d.removeView(b.this.f19987e);
            b.this.f19987e.release();
            b.this.f19987e = null;
            b.this.i = null;
        }
    }

    public b(Context context, Bundle bundle, com.anythink.expressad.mbbanner.a.c.a aVar) {
        super(context);
        this.f19983a = "BannerExpandDialog";
        this.f19991j = new IMraidJSBridge() { // from class: com.anythink.expressad.mbbanner.a.a.b.4
            @Override // com.anythink.core.express.b.b
            public final void close() {
                b.this.dismiss();
            }

            @Override // com.anythink.core.express.b.b
            public final void expand(String str, boolean z8) {
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final d getMraidCampaign() {
                return null;
            }

            @Override // com.anythink.core.express.b.b
            public final void open(String str) {
                try {
                    if (b.this.f19987e != null && System.currentTimeMillis() - b.this.f19987e.lastTouchTime > com.anythink.expressad.b.c.a.f18356c) {
                        d dVar = (d) b.this.f19990h.get(0);
                        b.this.f19987e.getUrl();
                        com.anythink.expressad.b.c.a.a(dVar);
                    } else {
                        if (b.this.f19990h.size() > 1) {
                            t.b().g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            str = null;
                        }
                        if (b.this.i != null) {
                            b.this.i.a(true, str);
                        }
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // com.anythink.core.express.b.b
            public final void unload() {
                close();
            }

            @Override // com.anythink.core.express.b.b
            public final void useCustomClose(boolean z8) {
                try {
                    b.this.f19988f.setVisibility(z8 ? 4 : 0);
                } catch (Throwable unused) {
                }
            }
        };
        this.f19984b = bundle.getString("url");
        this.f19985c = bundle.getBoolean("shouldUseCustomClose");
        this.i = aVar;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f19986d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f19987e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f19986d.addView(this.f19987e);
        TextView textView = new TextView(getContext());
        this.f19988f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f19988f.setLayoutParams(layoutParams);
        this.f19988f.setVisibility(this.f19985c ? 4 : 0);
        this.f19988f.setOnClickListener(new AnonymousClass1());
        this.f19986d.addView(this.f19988f);
        setContentView(this.f19986d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f19987e.setWebViewListener(new AnonymousClass2());
        this.f19987e.setObject(this.f19991j);
        this.f19987e.loadUrl(this.f19984b);
        setOnDismissListener(new AnonymousClass3());
    }

    private void b() {
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
    }

    private void c() {
        try {
            int i = t.b().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i == 2 ? "landscape" : i == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", "true");
            float f6 = n.f(t.b().g());
            float g9 = n.g(t.b().g());
            HashMap h9 = n.h(t.b().g());
            int intValue = ((Integer) h9.get("width")).intValue();
            int intValue2 = ((Integer) h9.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f17683a, "Interstitial");
            hashMap.put(com.anythink.core.express.b.a.f17684b, com.anythink.core.express.b.a.f17689g);
            hashMap.put(com.anythink.core.express.b.a.f17685c, "true");
            hashMap.put(com.anythink.core.express.b.a.f17686d, jSONObject);
            this.f19987e.getLocationInWindow(new int[2]);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f19987e, r0[0], r0[1], r2.getWidth(), this.f19987e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f19987e, r0[0], r0[1], r2.getWidth(), this.f19987e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f19987e, f6, g9);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(this.f19987e, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f19987e, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f19987e);
        } catch (Throwable unused) {
        }
    }

    private void a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f19986d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f19987e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f19986d.addView(this.f19987e);
        TextView textView = new TextView(getContext());
        this.f19988f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f19988f.setLayoutParams(layoutParams);
        this.f19988f.setVisibility(this.f19985c ? 4 : 0);
        this.f19988f.setOnClickListener(new AnonymousClass1());
        this.f19986d.addView(this.f19988f);
        setContentView(this.f19986d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f19987e.setWebViewListener(new AnonymousClass2());
        this.f19987e.setObject(this.f19991j);
        this.f19987e.loadUrl(this.f19984b);
        setOnDismissListener(new AnonymousClass3());
    }

    public final void a(String str, List<d> list) {
        this.f19989g = str;
        this.f19990h = list;
    }

    public static /* synthetic */ void a(b bVar) {
        String str;
        try {
            int i = t.b().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i == 2) {
                str = "landscape";
            } else {
                str = i == 1 ? "portrait" : "undefined";
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float f6 = n.f(t.b().g());
            float g9 = n.g(t.b().g());
            HashMap h9 = n.h(t.b().g());
            int intValue = ((Integer) h9.get("width")).intValue();
            int intValue2 = ((Integer) h9.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f17683a, "Interstitial");
            hashMap.put(com.anythink.core.express.b.a.f17684b, com.anythink.core.express.b.a.f17689g);
            hashMap.put(com.anythink.core.express.b.a.f17685c, "true");
            hashMap.put(com.anythink.core.express.b.a.f17686d, jSONObject);
            bVar.f19987e.getLocationInWindow(new int[2]);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(bVar.f19987e, r0[0], r0[1], r2.getWidth(), bVar.f19987e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(bVar.f19987e, r0[0], r0[1], r2.getWidth(), bVar.f19987e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(bVar.f19987e, f6, g9);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(bVar.f19987e, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(bVar.f19987e, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(bVar.f19987e);
        } catch (Throwable unused) {
        }
    }
}

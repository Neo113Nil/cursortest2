package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.mopub.common.Constants;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.internal.jr;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TJSplitWebView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private TJWebView f7724a;

    /* renamed from: b, reason: collision with root package name */
    private a f7725b;

    /* renamed from: c, reason: collision with root package name */
    private a f7726c;

    /* renamed from: d, reason: collision with root package name */
    private String f7727d;
    private String e;
    private String f;
    private Uri g;
    private HashSet h;
    private TJAdUnitJSBridge i;

    public TJSplitWebView(final Context context, JSONObject jSONObject, JSONArray jSONArray, TJAdUnitJSBridge tJAdUnitJSBridge) {
        super(context);
        this.i = tJAdUnitJSBridge;
        setLayoutOption(jSONObject);
        setExitHosts(jSONArray);
        this.f7724a = new TJWebView(context);
        this.f7724a.setBackgroundColor(-1);
        WebSettings settings = this.f7724a.getSettings();
        if (settings != null) {
            settings.setUseWideViewPort(true);
        }
        this.f7724a.setWebViewClient(new WebViewClient() { // from class: com.tapjoy.TJSplitWebView.1
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                TapjoyLog.d("TJSplitWebView", "shouldOverrideUrlLoading: " + str);
                Uri parse = Uri.parse(str);
                if (parse != null) {
                    String host = parse.getHost();
                    String scheme = parse.getScheme();
                    if (scheme != null && host != null && ((scheme.equals(Constants.HTTP) || scheme.equals(Constants.HTTPS)) && (TJSplitWebView.this.h == null || !TJSplitWebView.this.h.contains(host)))) {
                        TJSplitWebView.this.e = str;
                        return false;
                    }
                }
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", parse));
                    TJSplitWebView.this.a();
                    return true;
                } catch (Exception e) {
                    TapjoyLog.e("TJSplitWebView", e.getMessage());
                    return true;
                }
            }

            @Override // android.webkit.WebViewClient
            public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                String str2 = TJSplitWebView.this.f;
                Uri uri = TJSplitWebView.this.g;
                if (str2 != null && uri != null && str != null && str.startsWith(str2)) {
                    context.startActivity(new Intent("android.intent.action.VIEW", uri));
                    TJSplitWebView.this.a();
                }
                return super.shouldInterceptRequest(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                TapjoyLog.d("TJSplitWebView", "onReceivedError: " + str2 + " firstUrl:" + TJSplitWebView.this.f7727d);
                if (str2.equals(TJSplitWebView.this.f7727d)) {
                    TJSplitWebView.this.a();
                }
            }
        });
        addView(this.f7724a);
    }

    public void applyLayoutOption(JSONObject jSONObject) {
        setLayoutOption(jSONObject);
        a(getWidth(), getHeight());
    }

    public void setExitHosts(JSONArray jSONArray) {
        if (jSONArray == null) {
            this.h = null;
            return;
        }
        this.h = new HashSet();
        for (int i = 0; i <= jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (optString != null) {
                this.h.add(optString);
            }
        }
    }

    public void setTrigger(String str, String str2) {
        this.f = jr.b(str);
        this.g = str2 != null ? Uri.parse(str2) : null;
    }

    public void loadUrl(String str) {
        if (this.f7724a != null) {
            this.f7727d = str;
            this.e = str;
            this.f7724a.loadUrl(str);
        }
    }

    public String getLastUrl() {
        return this.e;
    }

    protected final void a() {
        this.i.dismissSplitView(null, null);
    }

    protected void setLayoutOption(JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(TJAdUnitConstants.String.LANDSCAPE);
            this.f7726c = optJSONObject != null ? new a(optJSONObject) : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject(TJAdUnitConstants.String.PORTRAIT);
            this.f7725b = optJSONObject2 != null ? new a(optJSONObject2) : null;
        }
    }

    private void a(int i, int i2) {
        a aVar = i <= i2 ? this.f7725b : this.f7726c;
        if (aVar == null) {
            this.f7724a.setVisibility(4);
            return;
        }
        double d2 = i;
        double d3 = aVar.f7730a;
        Double.isNaN(d2);
        int i3 = (int) (d3 * d2);
        double d4 = i2;
        double d5 = aVar.f7731b;
        Double.isNaN(d4);
        int i4 = (int) (d5 * d4);
        if (i3 == 0 || i4 == 0) {
            this.f7724a.setVisibility(4);
            return;
        }
        double d6 = aVar.f7732c;
        Double.isNaN(d2);
        int i5 = (int) (d2 * d6);
        double d7 = aVar.f7733d;
        Double.isNaN(d4);
        int i6 = (int) (d4 * d7);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i5, i6, (i - i3) - i5, (i2 - i4) - i6);
        this.f7724a.setLayoutParams(layoutParams);
        this.f7724a.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 21) {
            if (aVar.e > 0.0f) {
                float[] fArr = new float[8];
                Arrays.fill(fArr, aVar.e * getResources().getDisplayMetrics().density);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                shapeDrawable.getPaint().setColor(-1);
                this.f7724a.setBackground(shapeDrawable);
                this.f7724a.setClipToOutline(true);
                return;
            }
            this.f7724a.setBackground(null);
            this.f7724a.setClipToOutline(false);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final double f7730a;

        /* renamed from: b, reason: collision with root package name */
        final double f7731b;

        /* renamed from: c, reason: collision with root package name */
        final double f7732c;

        /* renamed from: d, reason: collision with root package name */
        final double f7733d;
        final float e;

        a(JSONObject jSONObject) {
            this.f7730a = jSONObject.optDouble("width", 0.0d);
            this.f7731b = jSONObject.optDouble("height", 0.0d);
            this.f7732c = jSONObject.optDouble("left", 0.0d);
            this.f7733d = jSONObject.optDouble("top", 0.0d);
            this.e = (float) jSONObject.optDouble("cornerRadius", 0.0d);
        }
    }
}

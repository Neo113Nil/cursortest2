package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.ironsource.B5;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.ChartboostNetworkBridge;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes14.dex */
public abstract class v4 extends cl {

    public static final class a extends Lambda implements Function1 {
        public static final a b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r3 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new r3(it);
        }
    }

    public static final class b extends Lambda implements Function1 {
        public static final b b = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebChromeClient invoke(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new WebChromeClient();
        }
    }

    public static final class c extends Lambda implements Function2 {
        public final /* synthetic */ oa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(oa oaVar) {
            super(2);
            this.b = oaVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w5 invoke(x5 cb, p7 et) {
            Intrinsics.checkNotNullParameter(cb, "cb");
            Intrinsics.checkNotNullParameter(et, "et");
            return new w5(cb, et, this.b, (sg) f4.b.a().b().get());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(Context context, String html, x5 callback, oa impressionInterface, String str, p7 eventTracker, Function1 cbWebViewFactory, Function1 cbWebChromeClientFactory, Function2 cbWebViewClientFactory) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        Intrinsics.checkNotNullParameter(cbWebChromeClientFactory, "cbWebChromeClientFactory");
        Intrinsics.checkNotNullParameter(cbWebViewClientFactory, "cbWebViewClientFactory");
        setFocusable(false);
        s8 a2 = s8.a();
        setWebViewContainer((RelativeLayout) a2.a(new RelativeLayout(context)));
        setWebView((r3) cbWebViewFactory.invoke(context));
        kj.b.a(context);
        try {
            WebView.setWebContentsDebuggingEnabled(false);
        } catch (RuntimeException e) {
            xb.e("Exception while enabling webview debugging", e);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        r3 webView = getWebView();
        if (webView != null) {
            webView.getSettings().setSupportZoom(false);
            webView.setLayoutParams(layoutParams);
            webView.setBackgroundColor(0);
            webView.setWebViewClient((WebViewClient) a2.a(cbWebViewClientFactory.invoke(callback, eventTracker)));
            RelativeLayout webViewContainer = getWebViewContainer();
            if (webViewContainer != null) {
                webViewContainer.setLayoutParams(layoutParams);
                webView.setWebChromeClient((WebChromeClient) cbWebChromeClientFactory.invoke(webViewContainer));
                webViewContainer.addView(webView);
            }
            ChartboostNetworkBridge.webviewLoadDataWithBaseURL(webView, str, html, POBCommonConstants.CONTENT_TYPE_HTML, B5.O, null);
        }
    }

    @Override // com.chartboost.sdk.impl.cl, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.c, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.chartboost.sdk.impl.cl, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public /* synthetic */ v4(Context context, String str, x5 x5Var, oa oaVar, String str2, p7 p7Var, Function1 function1, Function1 function12, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, x5Var, oaVar, str2, p7Var, (i & 64) != 0 ? a.b : function1, (i & 128) != 0 ? b.b : function12, (i & 256) != 0 ? new c(oaVar) : function2);
    }
}

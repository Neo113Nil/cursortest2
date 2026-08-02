package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.hcaptcha.HCaptchaHtmlKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class PaymentAuthWebView extends WebView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Function0 onLoadBlank;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.onLoadBlank = new HCaptchaHtmlKt$$ExternalSyntheticLambda0(26);
        String str = RequestHeadersFactory.CHARSET;
        WebSettings settings = getSettings();
        String userAgentString = getSettings().getUserAgentString();
        settings.setUserAgentString((userAgentString == null ? "" : userAgentString).concat(" [Stripe/v1 AndroidBindings/23.9.1]"));
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowContentAccess(false);
        getSettings().setDomStorageEnabled(true);
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        clearHistory();
        this.onLoadBlank.invoke();
        loadUrl("about:blank");
        onPause();
        removeAllViews();
        destroyDrawingCache();
        super.destroy();
    }

    public final void setOnLoadBlank$payments_core_release(Function0<Unit> function0) {
        function0.getClass();
        this.onLoadBlank = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ PaymentAuthWebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

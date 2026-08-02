package com.stripe.android.challenge.confirmation;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public final class IntentConfirmationWebViewClient extends WebViewClient {
    public final MaterialButton$$ExternalSyntheticLambda3 errorHandler;
    public final String hostUrl;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final AlertBannerKt$$ExternalSyntheticLambda3 openUri;

    public IntentConfirmationWebViewClient(MaterialButton$$ExternalSyntheticLambda3 materialButton$$ExternalSyntheticLambda3, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, AlertBannerKt$$ExternalSyntheticLambda3 alertBannerKt$$ExternalSyntheticLambda3) {
        logger$Companion$NOOP_LOGGER$1.getClass();
        this.hostUrl = "https://b.stripecdn.com/mobile-confirmation-challenge/assets/index.html?v=1";
        this.errorHandler = materialButton$$ExternalSyntheticLambda3;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.openUri = alertBannerKt$$ExternalSyntheticLambda3;
    }

    public static Uri normalizeTrailingSlash(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        String trimEnd = StringsKt.trimEnd(path, '/');
        if (Intrinsics.areEqual(trimEnd, path)) {
            return uri;
        }
        Uri build = uri.buildUpon().path(trimEnd).build();
        build.getClass();
        return build;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        boolean equals;
        Uri url;
        CharSequence description;
        Uri url2;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String uri = (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null) ? null : url2.toString();
        if (uri == null) {
            equals = false;
        } else {
            Uri parse = Uri.parse(uri);
            parse.getClass();
            Uri normalizeTrailingSlash = normalizeTrailingSlash(parse);
            Uri parse2 = Uri.parse(this.hostUrl);
            parse2.getClass();
            equals = normalizeTrailingSlash.equals(normalizeTrailingSlash(parse2));
        }
        if (equals) {
            String obj = (webResourceError == null || (description = webResourceError.getDescription()) == null) ? null : description.toString();
            Integer valueOf = webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null;
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                url.toString();
            }
            this.errorHandler.invoke(new WebViewError(valueOf, obj, "generic_resource_error"));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        boolean equals;
        Uri url;
        Uri url2;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String uri = (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null) ? null : url2.toString();
        if (uri == null) {
            equals = false;
        } else {
            Uri parse = Uri.parse(uri);
            parse.getClass();
            Uri normalizeTrailingSlash = normalizeTrailingSlash(parse);
            Uri parse2 = Uri.parse(this.hostUrl);
            parse2.getClass();
            equals = normalizeTrailingSlash.equals(normalizeTrailingSlash(parse2));
        }
        if (equals) {
            String reasonPhrase = webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null;
            Integer valueOf = webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null;
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                url.toString();
            }
            this.errorHandler.invoke(new WebViewError(valueOf, reasonPhrase, "http_error"));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        if (sslErrorHandler != null) {
            sslErrorHandler.cancel();
        }
        Integer valueOf = sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null;
        if (sslError != null) {
            sslError.getUrl();
        }
        this.errorHandler.invoke(new WebViewError(valueOf, "received ssl error", "ssl_error"));
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.logger.error("IntentConfirmationWebViewClient: render process gone, url=" + (webView != null ? webView.getUrl() : null), null);
        if (webView != null) {
            webView.getUrl();
        }
        this.errorHandler.invoke(new WebViewError(null, "render process gone", "render_process_gone"));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        this.openUri.invoke(url);
        return true;
    }
}

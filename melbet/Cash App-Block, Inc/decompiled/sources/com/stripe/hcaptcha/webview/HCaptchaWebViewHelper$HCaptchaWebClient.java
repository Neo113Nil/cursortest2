package com.stripe.hcaptcha.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.scannerview.TextSetter;
import com.stripe.hcaptcha.HCaptchaStateListener;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;

/* loaded from: classes8.dex */
public final class HCaptchaWebViewHelper$HCaptchaWebClient extends WebViewClient {
    public final Handler handler;
    public final HCaptchaStateListener listener;
    public final /* synthetic */ TextSetter this$0;

    public HCaptchaWebViewHelper$HCaptchaWebClient(TextSetter textSetter, Handler handler, HCaptchaStateListener hCaptchaStateListener) {
        this.this$0 = textSetter;
        this.handler = handler;
        this.listener = hCaptchaStateListener;
    }

    public static String stripUrl(String str) {
        Collection collection;
        if (str == null) {
            return "null";
        }
        List split = new Regex("[?#]").split(0, str);
        if (!split.isEmpty()) {
            ListIterator listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = EmptyList.INSTANCE;
        return Recorder$$ExternalSyntheticOutline2.m$1(((String[]) collection.toArray(new String[0]))[0], "...");
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Log.d("hCaptchaWebView", "[webview] onLoadResource ".concat(stripUrl(str)));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Log.d("hCaptchaWebView", "[webview] onPageFinished ".concat(stripUrl(str)));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Log.d("hCaptchaWebView", "[webview] onPageStarted ".concat(stripUrl(str)));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        CharSequence description = webResourceError != null ? webResourceError.getDescription() : null;
        Log.d("hCaptchaWebView", "[webview] onReceivedError \"" + ((Object) description) + "\" (" + (webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null) + ")");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Log.d("hCaptchaWebView", "[webview] onReceivedHttpError");
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        Uri url = webResourceRequest.getUrl();
        if (url != null && url.getScheme() != null && Intrinsics.areEqual(url.getScheme(), "http")) {
            this.handler.post(new CardEntryActivityController$$ExternalSyntheticLambda1(16, this.this$0, this, url));
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}

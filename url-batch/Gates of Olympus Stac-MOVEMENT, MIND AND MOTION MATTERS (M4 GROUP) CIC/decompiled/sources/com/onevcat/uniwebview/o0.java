package com.onevcat.uniwebview;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.text.method.PasswordTransformationMethod;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewDatabase;
import android.widget.EditText;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0 extends WebViewClient {
    public final Context a;
    public final z4 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public final LinkedHashMap g;
    public final v h;
    public final LinkedHashSet i;
    public boolean j;

    public o0(Context context, w responderDelegate, z4 loadingObserver) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(responderDelegate, "responderDelegate");
        Intrinsics.checkNotNullParameter(loadingObserver, "loadingObserver");
        this.a = context;
        this.b = loadingObserver;
        this.d = true;
        this.f = 200;
        this.g = new LinkedHashMap();
        this.h = new v(context, responderDelegate);
        this.i = new LinkedHashSet();
        this.j = true;
    }

    public final void a(final WebView webView, final HttpAuthHandler httpAuthHandler, final String str, final String str2) {
        final EditText editText = new EditText(this.a);
        editText.setHint(this.a.getResources().getString(R.string.USERNAME));
        final EditText editText2 = new EditText(this.a);
        editText2.setHint(this.a.getResources().getString(R.string.PASSWORD));
        editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        AlertDialog.Builder message = new AlertDialog.Builder(this.a).setTitle(this.a.getResources().getString(R.string.AUTH_REQUIRE_TITLE)).setMessage(str);
        Intrinsics.checkNotNullExpressionValue(message, "Builder(context)\n       …        .setMessage(host)");
        a.a(message, editText, editText2).setCancelable(false).setPositiveButton(this.a.getString(android.R.string.ok), new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.o0$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                o0.a(editText, editText2, this, str, str2, webView, httpAuthHandler, dialogInterface, i);
            }
        }).setNegativeButton(this.a.getString(android.R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.o0$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                o0.a(httpAuthHandler, dialogInterface, i);
            }
        }).create().show();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.d) {
            if (this.e) {
                o oVar = o.b;
                String message = "WebClient onReceivedError for url: " + str + ", Error Code: -1202, Error: SSL error";
                oVar.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                oVar.a(n.CRITICAL, message);
                this.b.a(b5.a(str, -1202, "SSL error"));
                return;
            }
            if (!this.c) {
                o oVar2 = o.b;
                String message2 = "WebClient onPageFinished: " + str + ", HTTP Status Code: " + this.f;
                oVar2.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                oVar2.a(n.INFO, message2);
                this.b.a(str, this.f);
                return;
            }
            o oVar3 = o.b;
            String message3 = "WebClient onReceivedError for url: " + str + ", Error Code: -999, Error: Operation cancelled";
            oVar3.getClass();
            Intrinsics.checkNotNullParameter(message3, "message");
            oVar3.a(n.INFO, message3);
            this.b.a(b5.a(str, -999, "Operation cancelled"));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        o oVar = o.b;
        oVar.a(n.INFO, d.a("WebClient onPageStarted: ", str, oVar, "message"));
        this.b.a(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        o oVar = o.b;
        String message = "WebClient onReceivedError. URL: " + str2 + "; Error Code: " + i;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.INFO, message);
        this.d = false;
        this.b.a(b5.a(str2, i, str));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        String str3;
        String str4;
        String[] httpAuthUsernamePassword;
        if (httpAuthHandler == null) {
            return;
        }
        if (!httpAuthHandler.useHttpAuthUsernamePassword() || webView == null || (httpAuthUsernamePassword = WebViewDatabase.getInstance(this.a).getHttpAuthUsernamePassword(str, str2)) == null || httpAuthUsernamePassword.length != 2) {
            str3 = null;
            str4 = null;
        } else {
            str3 = httpAuthUsernamePassword[0];
            str4 = httpAuthUsernamePassword[1];
        }
        if (str3 != null && str4 != null) {
            httpAuthHandler.proceed(str3, str4);
        } else if (this.j) {
            a(webView, httpAuthHandler, str, str2);
        } else {
            httpAuthHandler.cancel();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        o oVar = o.b;
        o oVar2 = o.b;
        String message = "WebClient onReceivedHttpError. Error Code: " + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null) + ", url: " + webResourceRequest + "?.url";
        oVar2.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar2.a(n.INFO, message);
        if (webResourceResponse == null || webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        this.f = webResourceResponse.getStatusCode();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        o oVar = o.b;
        String message = "WebClient onReceivedSslError. Error url: " + (sslError != null ? sslError.getUrl() : null) + ", Error type: " + (sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null);
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        n nVar = n.CRITICAL;
        oVar.a(nVar, message);
        if (sslError == null) {
            Intrinsics.checkNotNullParameter("Receiving SSL error callback with `null` error. This should not happen.", "message");
            oVar.a(nVar, "Receiving SSL error callback with `null` error. This should not happen.");
            this.e = true;
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
                return;
            }
            return;
        }
        Intrinsics.checkNotNullParameter("Trying to process SSL error...", "message");
        n nVar2 = n.VERBOSE;
        oVar.a(nVar2, "Trying to process SSL error...");
        try {
            String host = new URI(sslError.getUrl()).getHost();
            SslCertificate certificate = sslError.getCertificate();
            if (certificate.getIssuedBy() != null && certificate.getIssuedTo() != null) {
                if (this.i.contains(host)) {
                    String message2 = "Found domain '" + host + "' in exception list. Processing url.";
                    Intrinsics.checkNotNullParameter(message2, "message");
                    oVar.a(nVar2, message2);
                    if (sslErrorHandler != null) {
                        sslErrorHandler.proceed();
                        return;
                    }
                    return;
                }
                String message3 = "Domain '" + host + "' is not in exception list. Refuse proceeding url.";
                Intrinsics.checkNotNullParameter(message3, "message");
                oVar.a(nVar2, message3);
                this.e = true;
                if (sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                    return;
                }
                return;
            }
            Intrinsics.checkNotNullParameter("Cannot get correct certificate issuer. SSL challenge failed.", "message");
            oVar.a(nVar2, "Cannot get correct certificate issuer. SSL challenge failed.");
            this.e = true;
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
        } catch (Exception e) {
            o oVar2 = o.b;
            String message4 = "Exception during handling SSL error: " + e;
            oVar2.getClass();
            Intrinsics.checkNotNullParameter(message4, "message");
            oVar2.a(n.CRITICAL, message4);
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        o oVar;
        String message;
        if (renderProcessGoneDetail == null) {
            oVar = o.b;
            message = "onRenderProcessGone is triggered. Detail: null";
        } else {
            oVar = o.b;
            message = "onRenderProcessGone is triggered. didCrash: " + renderProcessGoneDetail.didCrash() + ", priority: " + renderProcessGoneDetail.rendererPriorityAtExit();
        }
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.CRITICAL, message);
        this.b.a();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        if (this.h.a(str, false, webView instanceof b0 ? ((b0) webView).getName() : null)) {
            return true;
        }
        this.f = 200;
        this.d = true;
        this.c = false;
        this.e = false;
        if (!(!this.g.isEmpty())) {
            return false;
        }
        o oVar = o.b;
        String message = "Adding customize header to request. " + this.g;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(n.DEBUG, message);
        if (webView != null) {
            webView.loadUrl(str, this.g);
        }
        return true;
    }

    public static final void a(EditText userText, EditText passwordText, o0 this$0, String str, String str2, WebView webView, HttpAuthHandler handler, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(userText, "$userText");
        Intrinsics.checkNotNullParameter(passwordText, "$passwordText");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(handler, "$handler");
        String obj = userText.getText().toString();
        String obj2 = passwordText.getText().toString();
        WebViewDatabase.getInstance(this$0.a).setHttpAuthUsernamePassword(str, str2, obj, obj2);
        handler.proceed(obj, obj2);
    }

    public static final void a(HttpAuthHandler handler, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(handler, "$handler");
        handler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        o oVar = o.b;
        String message = "WebClient onReceivedError. Request: " + webResourceRequest + "; Error: " + webResourceError;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        n nVar = n.INFO;
        oVar.a(nVar, message);
        if (webResourceRequest != null) {
            String message2 = "WebClient request detail: " + webResourceRequest.getUrl();
            Intrinsics.checkNotNullParameter(message2, "message");
            oVar.a(nVar, message2);
        }
        if (webResourceError != null) {
            String message3 = "WebClient error detail: " + ((Object) webResourceError.getDescription());
            Intrinsics.checkNotNullParameter(message3, "message");
            oVar.a(nVar, message3);
        }
        if (webResourceError == null || webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        this.d = false;
        this.b.a(b5.a(webResourceRequest.getUrl().toString(), webResourceError.getErrorCode(), webResourceError.getDescription().toString()));
    }
}

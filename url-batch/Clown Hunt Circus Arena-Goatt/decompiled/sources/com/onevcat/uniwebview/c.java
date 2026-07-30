package com.onevcat.uniwebview;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Bundle;
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
import com.onevcat.uniwebview.internal.obfuscated.A;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0025a;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0045e;
import com.onevcat.uniwebview.internal.obfuscated.AbstractC0094p0;
import com.onevcat.uniwebview.internal.obfuscated.B;
import com.onevcat.uniwebview.internal.obfuscated.C0098q0;
import com.onevcat.uniwebview.internal.obfuscated.K;
import com.onevcat.uniwebview.internal.obfuscated.Y;
import com.onevcat.uniwebview.internal.obfuscated.q3;
import com.onevcat.uniwebview.internal.obfuscated.u3;
import java.io.ByteArrayInputStream;
import java.net.URI;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class c extends WebViewClient {
    public final Context a;
    public final q3 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public final LinkedHashMap g;
    public final K h;
    public final LinkedHashSet i;
    public final LinkedHashMap j;
    public boolean k;
    public boolean l;

    public c(Context context, a responderDelegate, q3 loadingObserver) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(responderDelegate, "responderDelegate");
        Intrinsics.checkNotNullParameter(loadingObserver, "loadingObserver");
        this.a = context;
        this.b = loadingObserver;
        this.d = true;
        this.f = 200;
        this.g = new LinkedHashMap();
        this.h = new K(context, responderDelegate);
        this.i = new LinkedHashSet();
        this.j = new LinkedHashMap();
        this.l = true;
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String obj = StringsKt.trim((CharSequence) str).toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = obj.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (lowerCase.length() == 0) {
            return null;
        }
        return lowerCase;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String replace = new Regex("\\s").replace(StringsKt.replace$default(str, ":", "", false, 4, (Object) null), "");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = replace.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (upperCase.length() != 0 && new Regex("^[0-9A-F]+$").matches(upperCase)) {
            return upperCase;
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.d) {
            if (this.e) {
                B b = B.b;
                String message = "WebClient onReceivedError for url: " + str + ", Error Code: -1202, Error: SSL error";
                b.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                b.a(A.CRITICAL, message);
                this.b.a(u3.a(str, -1202, "SSL error"));
                return;
            }
            if (!this.c) {
                B b2 = B.b;
                String message2 = "WebClient onPageFinished: " + str + ", HTTP Status Code: " + this.f;
                b2.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                b2.a(A.INFO, message2);
                this.b.a(str, this.f);
                return;
            }
            B b3 = B.b;
            String message3 = "WebClient onReceivedError for url: " + str + ", Error Code: -999, Error: Operation cancelled";
            b3.getClass();
            Intrinsics.checkNotNullParameter(message3, "message");
            b3.a(A.INFO, message3);
            this.b.a(u3.a(str, -999, "Operation cancelled"));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        B b = B.b;
        b.a(A.INFO, AbstractC0045e.a("WebClient onPageStarted: ", str, b, "message"));
        if (webView instanceof a) {
            a aVar = (a) webView;
            aVar.getClass();
            Y.a(aVar);
        }
        this.b.a(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
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
        } else if (this.l) {
            a(webView, httpAuthHandler, str, str2);
        } else {
            httpAuthHandler.cancel();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        B b = B.b;
        String message = "WebClient onReceivedHttpError. Error Code: " + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null) + ", url: " + (webResourceRequest != null ? webResourceRequest.getUrl() : null);
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.INFO, message);
        if (webResourceResponse == null || webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        this.f = webResourceResponse.getStatusCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x013b, code lost:
    
        r0 = com.onevcat.uniwebview.internal.obfuscated.B.b;
        r3 = "Failed to compute certificate fingerprint for '" + r5 + "'. Blocking SSL challenge.";
        r0.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "message");
        r0.a(com.onevcat.uniwebview.internal.obfuscated.A.VERBOSE, r3);
        r18.e = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x015d, code lost:
    
        if (r20 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015f, code lost:
    
        r20.cancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0193  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        String a;
        Set set;
        byte[] byteArray;
        String url;
        B b = B.b;
        String str2 = null;
        String message = "WebClient onReceivedSslError. Error url: " + (sslError != null ? sslError.getUrl() : null) + ", Error type: " + (sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null);
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        A a2 = A.CRITICAL;
        b.a(a2, message);
        if (sslError == null) {
            Intrinsics.checkNotNullParameter("Receiving SSL error callback with `null` error. This should not happen.", "message");
            b.a(a2, "Receiving SSL error callback with `null` error. This should not happen.");
            this.e = true;
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
                return;
            }
            return;
        }
        Intrinsics.checkNotNullParameter("Trying to process SSL error...", "message");
        b.a(A.VERBOSE, "Trying to process SSL error...");
        try {
            url = sslError.getUrl();
        } catch (Exception e) {
            B b2 = B.b;
            String message2 = "Exception when parsing URL for SSL error: " + e;
            b2.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            b2.a(A.CRITICAL, message2);
        }
        if (url != null) {
            str = new URI(url).getHost();
            a = a(str);
            if (a != null) {
                B b3 = B.b;
                b3.getClass();
                Intrinsics.checkNotNullParameter("Cannot determine host from SSL error. Cancelling challenge.", "message");
                b3.a(A.VERBOSE, "Cannot determine host from SSL error. Cancelling challenge.");
                this.e = true;
                if (sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                    return;
                }
                return;
            }
            set = (Set) this.j.get(a);
            if (set == null || set.isEmpty()) {
                if (this.i.contains(a)) {
                    B b4 = B.b;
                    String message3 = "Deprecated AddSslExceptionDomain was used for '" + a + "', but fingerprint pinning is now required. Blocking SSL challenge.";
                    b4.getClass();
                    Intrinsics.checkNotNullParameter(message3, "message");
                    b4.a(A.CRITICAL, message3);
                } else {
                    B b5 = B.b;
                    String message4 = "No pinned fingerprints configured for '" + a + "'. Blocking SSL challenge.";
                    b5.getClass();
                    Intrinsics.checkNotNullParameter(message4, "message");
                    b5.a(A.VERBOSE, message4);
                }
                this.e = true;
                if (sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                    return;
                }
                return;
            }
            SslCertificate certificate = sslError.getCertificate();
            if (certificate == null) {
                B b6 = B.b;
                b6.getClass();
                Intrinsics.checkNotNullParameter("SSL error received without certificate information.", "message");
                b6.a(A.CRITICAL, "SSL error received without certificate information.");
            } else {
                try {
                    Bundle saveState = SslCertificate.saveState(certificate);
                    if (saveState != null && (byteArray = saveState.getByteArray("x509-certificate")) != null) {
                        Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
                        Intrinsics.checkNotNull(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        byte[] digest = MessageDigest.getInstance("SHA-256").digest(((X509Certificate) generateCertificate).getEncoded());
                        Intrinsics.checkNotNullExpressionValue(digest, "digest");
                        str2 = ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) C0098q0.a, 30, (Object) null);
                    }
                } catch (Exception e2) {
                    B b7 = B.b;
                    String message5 = "Failed to compute certificate fingerprint: " + e2;
                    b7.getClass();
                    Intrinsics.checkNotNullParameter(message5, "message");
                    b7.a(A.CRITICAL, message5);
                }
            }
            if (set.contains(str2)) {
                B b8 = B.b;
                b8.a(A.CRITICAL, AbstractC0094p0.a(new StringBuilder("Certificate fingerprint mismatch for '").append(a).append("'. Expected one of ").append(set).append(" but got "), str2, ". Blocking SSL challenge.", b8, "message"));
                this.e = true;
                if (sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                    return;
                }
                return;
            }
            B b9 = B.b;
            String message6 = "Certificate fingerprint matched pinned value for '" + a + "'. Proceeding SSL challenge.";
            b9.getClass();
            Intrinsics.checkNotNullParameter(message6, "message");
            b9.a(A.VERBOSE, message6);
            if (sslErrorHandler != null) {
                sslErrorHandler.proceed();
                return;
            }
            return;
        }
        str = null;
        a = a(str);
        if (a != null) {
        }
        if (set.contains(str2)) {
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (renderProcessGoneDetail == null) {
            B b = B.b;
            b.getClass();
            Intrinsics.checkNotNullParameter("onRenderProcessGone is triggered. Detail: null", "message");
            b.a(A.CRITICAL, "onRenderProcessGone is triggered. Detail: null");
        } else {
            B b2 = B.b;
            String message = "onRenderProcessGone is triggered. didCrash: " + renderProcessGoneDetail.didCrash() + ", priority: " + renderProcessGoneDetail.rendererPriorityAtExit();
            b2.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            b2.a(A.CRITICAL, message);
        }
        this.b.a();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        if (this.h.a(str, true, false, webView instanceof a ? ((a) webView).getName() : null)) {
            return true;
        }
        this.f = 200;
        this.d = true;
        this.c = false;
        this.e = false;
        if (this.g.isEmpty()) {
            return false;
        }
        B b = B.b;
        String message = "Adding customize header to request. " + this.g;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.DEBUG, message);
        if (webView != null) {
            webView.loadUrl(str, this.g);
        }
        return true;
    }

    public final void a(final WebView webView, final HttpAuthHandler httpAuthHandler, final String str, final String str2) {
        final EditText editText = new EditText(this.a);
        editText.setHint(this.a.getResources().getString(R.string.USERNAME));
        final EditText editText2 = new EditText(this.a);
        editText2.setHint(this.a.getResources().getString(R.string.PASSWORD));
        editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        AlertDialog.Builder message = new AlertDialog.Builder(this.a).setTitle(this.a.getResources().getString(R.string.AUTH_REQUIRE_TITLE)).setMessage(str);
        Intrinsics.checkNotNullExpressionValue(message, "Builder(context)\n       …        .setMessage(host)");
        AbstractC0025a.a(message, editText, editText2).setCancelable(false).setPositiveButton(this.a.getString(android.R.string.ok), new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.c$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                c.a(editText, editText2, this, str, str2, webView, httpAuthHandler, dialogInterface, i);
            }
        }).setNegativeButton(this.a.getString(android.R.string.cancel), new DialogInterface.OnClickListener() { // from class: com.onevcat.uniwebview.c$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                c.a(httpAuthHandler, dialogInterface, i);
            }
        }).create().show();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        B b = B.b;
        String message = "WebClient onReceivedError. Request: " + webResourceRequest + "; Error: " + webResourceError;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        A a = A.INFO;
        b.a(a, message);
        if (webResourceRequest != null) {
            String message2 = "WebClient request detail: " + webResourceRequest.getUrl();
            Intrinsics.checkNotNullParameter(message2, "message");
            b.a(a, message2);
        }
        if (webResourceError != null) {
            String message3 = "WebClient error detail: " + ((Object) webResourceError.getDescription());
            Intrinsics.checkNotNullParameter(message3, "message");
            b.a(a, message3);
        }
        if (webResourceError == null || webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        this.d = false;
        this.b.a(u3.a(webResourceRequest.getUrl().toString(), webResourceError.getErrorCode(), webResourceError.getDescription().toString()));
    }

    public static final void a(EditText userText, EditText passwordText, c this$0, String str, String str2, WebView webView, HttpAuthHandler handler, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(userText, "$userText");
        Intrinsics.checkNotNullParameter(passwordText, "$passwordText");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(handler, "$handler");
        String obj = userText.getText().toString();
        String obj2 = passwordText.getText().toString();
        WebViewDatabase.getInstance(this$0.a).setHttpAuthUsernamePassword(str, str2, obj, obj2);
        handler.proceed(obj, obj2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "request.url.toString()");
        if (this.h.a(uri, request.isForMainFrame(), false, webView instanceof a ? ((a) webView).getName() : null)) {
            return true;
        }
        this.f = 200;
        this.d = true;
        this.c = false;
        this.e = false;
        if (this.g.isEmpty()) {
            return false;
        }
        B b = B.b;
        String message = "Adding customize header to request. " + this.g;
        b.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(A.DEBUG, message);
        if (webView != null) {
            webView.loadUrl(uri, this.g);
        }
        return true;
    }

    public static final void a(HttpAuthHandler handler, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(handler, "$handler");
        handler.cancel();
    }
}

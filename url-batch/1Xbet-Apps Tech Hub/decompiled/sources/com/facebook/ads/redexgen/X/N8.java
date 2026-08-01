package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public class N8 extends WebViewClient {
    public static byte[] A05;
    public N4 A00 = new N4() { // from class: com.facebook.ads.redexgen.X.TK
        @Override // com.facebook.ads.redexgen.X.N4
        public final boolean A91(String str) {
            return N8.A04(str);
        }
    };
    public WeakReference<N6> A01 = new WeakReference<>(null);
    public final WeakReference<YA> A02;
    public final WeakReference<N5> A03;
    public final WeakReference<N1> A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{54, 55, 68, 74, 73, Ascii.SI, 55, 65, 54, 67, 64, 39, 52, 37, 39, 41, 58, 47, 60, 47, 58, 63, 51, 64, 54, 68, 65, 59, 54, 0, 59, 64, 70, 55, 64, 70, 0, 51, 53, 70, 59, 65, 64, 0, 40, Ascii.ESC, Ascii.ETB, 41, 9, Ascii.SYN, Ascii.FF, Ascii.SUB, Ascii.ETB, 17, Ascii.FF, -42, 17, Ascii.SYN, Ascii.FS, Ascii.CR, Ascii.SYN, Ascii.FS, -42, Ascii.VT, 9, Ascii.FS, Ascii.CR, Ascii.SI, Ascii.ETB, Ascii.SUB, 33, -42, -22, -6, -9, -1, -5, -23, -22, -12, -19, 7, Ascii.ETB, Ascii.DC4, Ascii.FS, Ascii.CAN, 10, Ascii.ETB, 4, Ascii.VT, 6, 17, 17, 7, 6, 8, 16, 4, Ascii.SUB, Ascii.ETB, 17, -54, -57, -38, -57, 49, 54, 60, 45, 54, 60, -36, -39, -45, -95, -121, -30, -48, -51, -54, -31, -44, -48, -30};
    }

    public N8(WeakReference<YA> weakReference, WeakReference<N5> weakReference2, WeakReference<N1> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, YA ya) {
        ya.A07().A9M(A00(11, 11, 101), C03207x.A09, new C03217y(A00(111, 5, 6) + str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
    
        if (r0.contains(r1) == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A03(WebView webView, String str) {
        boolean z;
        boolean A0x;
        String A00;
        String A002;
        String A003;
        boolean z2;
        boolean z3;
        Set set;
        Set set2;
        Intent intent;
        String A004 = A00(116, 8, 10);
        YA ya = this.A02.get();
        if (ya == null) {
            return false;
        }
        z = TJ.A0A;
        if ((z && (TextUtils.isEmpty(str) || A00(0, 11, 116).equals(str))) || !this.A00.A91(str)) {
            return true;
        }
        try {
            Uri uri = C0611Kc.A00(str);
            String scheme = uri.getScheme();
            try {
                A0x = IP.A0x(ya);
                A00 = A00(48, 33, 71);
                A002 = A00(22, 26, 113);
                A003 = A00(105, 6, 103);
            } catch (Exception e) {
                ya.A07().A9N(A004, C03207x.A2a, new C03217y(e));
                ya.A0E().A8a(e.toString());
            }
            if (A0x) {
                set2 = TJ.A0D;
                if (!set2.contains(scheme) && !A00(101, 4, 5).equals(scheme)) {
                    if (A003.equalsIgnoreCase(scheme)) {
                        intent = Intent.parseUri(str, 1);
                        intent.setComponent(null);
                        intent.setSelector(null);
                    } else {
                        intent = new Intent(A002, uri);
                    }
                    intent.addCategory(A00);
                    if (Build.VERSION.SDK_INT >= 30) {
                        intent.setFlags(268436480);
                    } else {
                        intent.setFlags(268435456);
                    }
                    try {
                        if (!KN.A0B(ya, intent)) {
                            A02(str, ya);
                        }
                        return true;
                    } catch (KL unused) {
                        if (A003.equals(scheme)) {
                            String stringExtra = intent.getStringExtra(A00(81, 20, 68));
                            if (!TextUtils.isEmpty(stringExtra)) {
                                if (!KN.A0B(ya, new Intent(A002, C0611Kc.A00(stringExtra)))) {
                                    A02(str, ya);
                                }
                                return true;
                            }
                        }
                        C03217y c03217y = new C03217y(A00(111, 5, 6) + str);
                        c03217y.A03(1);
                        ya.A07().A9N(A00(11, 11, 101), C03207x.A06, c03217y);
                        return true;
                    }
                }
                return false;
            }
            z2 = TJ.A0A;
            if (z2 && A003.equalsIgnoreCase(scheme)) {
                Intent parseUri = Intent.parseUri(str, 1);
                parseUri.addCategory(A00);
                parseUri.setComponent(null);
                parseUri.setSelector(null);
                if (ya.getPackageManager().resolveActivity(parseUri, 65536) != null && KN.A0B(ya, parseUri)) {
                    webView.goBack();
                    return true;
                }
            } else {
                z3 = TJ.A0A;
                if (!z3 || !C0631Ky.A04(str)) {
                    set = TJ.A0D;
                }
                return KN.A0B(ya, new Intent(A002, uri));
            }
            return false;
        } catch (SecurityException e2) {
            ya.A07().A9N(A004, C03207x.A2a, new C03217y(e2));
            return true;
        }
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(N4 n4) {
        this.A00 = n4;
    }

    public final void A06(WeakReference<N6> weakReference) {
        this.A01 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        N1 timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        N5 n5 = this.A03.get();
        if (n5 != null) {
            n5.ACG(str);
        }
        N6 n6 = this.A01.get();
        if (n6 != null) {
            n6.AAg(webView.canGoBack());
            n6.ABP(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        N5 listener = this.A03.get();
        if (listener != null) {
            listener.ACI(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        YA ya = this.A02.get();
        if (ya != null) {
            StringBuilder sb = new StringBuilder();
            String A00 = A00(0, 0, 27);
            String errorMessage = C0631Ky.A01(i, sb.append(A00).append(str).toString(), A00 + str2);
            ya.A0E().A8X(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        YA ya = this.A02.get();
        if (ya != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String A00 = A00(0, 0, 27);
            String errorMessage = C0631Ky.A01(errorCode, sb.append(A00).append((Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl());
            ya.A0E().A8X(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        YA context = this.A02.get();
        if (context != null) {
            context.A0E().A8Y();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        YA context = this.A02.get();
        if (context != null) {
            context.A0E().A8Z();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        NB.A02(C03207x.A2b);
        N5 listener = this.A03.get();
        if (listener != null) {
            listener.ACh();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}

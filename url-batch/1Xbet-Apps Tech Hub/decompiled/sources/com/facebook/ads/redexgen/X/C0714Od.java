package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Od, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0714Od extends WebViewClient {
    public static byte[] A01;
    public static String[] A02 = {"hfMJ0frXuRQdVVGg5HhbkedMp84qvG2m", "353suYezQm1X4xGGmKd", "JSegO1TQToLz4SD5sG2", "wzs2neDsiDlXGMSMfb3", "O6PuLNBrYuNMqKQgURK12L6N", "9iUPqfJGnhoj94eJuJeS1Wm6njk1Rmvr", "BdwoSzPq3MvWa04biSMwYNzp8DFOBLqT", "enVVpEgx3aC4K8YdK2hdvlOQVko"};
    public final /* synthetic */ C0718Oh A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{3, 4, Ascii.DC2, 2, 17, 8, Ascii.SI, 19, 8, Ascii.SO, Ascii.CR, -11, -6, -11, -44, 3, -14, 4, -7, Ascii.CR, Ascii.SUB, Ascii.SUB, Ascii.ETB, Ascii.SUB, -21, Ascii.ETB, Ascii.FF, Ascii.CR, 48, 43, 64, 51, 45, 57, 56, -8, 51, 45, 57, 39, 51, 51, 47, Ascii.RS, 36, 49, 49, 46, 49, 71, 73, 64, 70, 73, 64, 75, 80, -4, -7, -13};
    }

    static {
        A01();
    }

    public C0714Od(C0718Oh c0718Oh) {
        this.A00 = c0718Oh;
    }

    private void A02(int i, String str, String str2, boolean z) {
        C0573In c0573In;
        YA ya;
        OU ou;
        if (z) {
            this.A00.A0S();
        }
        c0573In = this.A00.A0D;
        c0573In.A04(EnumC0572Im.A0Q, null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 9, 44), i);
            jSONObject.put(A00(0, 11, 35), str);
            jSONObject.put(A00(57, 3, 11), str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        ya = this.A00.A0B;
        ya.A0E().A5K(jSONObject2);
        ou = this.A00.A0E;
        ou.A04(C03207x.A16, jSONObject2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C0573In c0573In;
        YA ya;
        long j;
        InterfaceC0716Of interfaceC0716Of;
        InterfaceC0716Of interfaceC0716Of2;
        c0573In = this.A00.A0D;
        c0573In.A04(EnumC0572Im.A0R, null);
        ya = this.A00.A0B;
        C0S A0E = ya.A0E();
        j = this.A00.A00;
        A0E.A5L(LM.A01(j));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        interfaceC0716Of = this.A00.A03;
        if (interfaceC0716Of == null) {
            return;
        }
        interfaceC0716Of2 = this.A00.A03;
        interfaceC0716Of2.ADa();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            A02(i, str, str2, true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        StringBuilder sb = new StringBuilder();
        String A00 = A00(0, 0, 48);
        A02(errorCode, sb.append(A00).append((Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl(), true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A00(28, 11, 78))) {
            return;
        }
        if (webResourceResponse != null) {
            i = webResourceResponse.getStatusCode();
        } else {
            i = -1;
        }
        A02(i, A00(39, 10, 67), A00(0, 0, 48) + webResourceRequest.getUrl(), false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        YA ya;
        AbstractC1045aS abstractC1045aS;
        InterfaceC0717Og interfaceC0717Og;
        InterfaceC0717Og interfaceC0717Og2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(11, 8, 21), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 91), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (JSONException unused) {
        }
        String message = jSONObject.toString();
        ya = this.A00.A0B;
        ya.A0E().A5G(message);
        abstractC1045aS = this.A00.A09;
        C0719Oi.A04(abstractC1045aS.A0R());
        interfaceC0717Og = this.A00.A04;
        if (interfaceC0717Og == null) {
            return true;
        }
        interfaceC0717Og2 = this.A00.A04;
        String[] strArr = A02;
        String message2 = strArr[1];
        if (message2.length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A02[0] = "kv0KfCNN1XAdbICEJBZwu3dTiw7XNBbg";
        interfaceC0717Og2.ACY();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        YA ya;
        C6Q c6q;
        C0730Ot c0730Ot;
        AbstractC1045aS abstractC1045aS;
        ya = this.A00.A0B;
        c6q = this.A00.A0A;
        c0730Ot = this.A00.A0H;
        abstractC1045aS = this.A00.A09;
        return C0732Ov.A00(ya, c6q, webResourceRequest, c0730Ot, abstractC1045aS.A0d());
    }
}

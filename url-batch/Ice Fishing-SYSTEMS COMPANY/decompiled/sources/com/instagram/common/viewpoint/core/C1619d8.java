package com.instagram.common.viewpoint.core;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.d8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1619d8 extends WebViewClient {
    public static byte[] A01;
    public static String[] A02 = {"", "6FWFK2Rjg5lzc4YxuKyAM2pjdKcDgsPX", "X8DXQa0II", "SNpKLA", "Qdf29haAswqAmNE65waVoEZq7xKg2wdQ", "zoYtBkcpJPqvxBhZCETS8Gv12yQPTvJi", "ExNOaNYHlEOFqs215y0dlBgemejMJNEa", "gJ6ZUqdzTjndwEo8cFEFcqem1uRbclUa"};
    public final /* synthetic */ C1623dC A00;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            int i11 = copyOfRange[i10] ^ i9;
            if (A02[5].charAt(10) != 'q') {
                throw new RuntimeException();
            }
            A02[5] = "pKC7szj5R0qBwTmNDTYZuLrnbbbgOopj";
            copyOfRange[i10] = (byte) (i11 ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 99, 117, 101, 116, 111, 118, 114, 111, 105, 104, 124, 113, 124, 91, 106, 121, 107, 112, 6, 17, 17, 12, 17, 32, 12, 7, 6, 90, 93, 74, 85, 95, 83, 82, 18, 85, 95, 83, 13, 17, 17, 21, 58, 0, 23, 23, 10, 23, 19, 17, 10, 12, 17, 10, 23, 26, 106, 109, 115};
    }

    static {
        A01();
    }

    public C1619d8(C1623dC c1623dC) {
        this.A00 = c1623dC;
    }

    private void A02(int i, String str, String str2, boolean z8) {
        VI vi;
        C1839gi c1839gi;
        C1610cz c1610cz;
        if (z8) {
            this.A00.A0S();
        }
        vi = this.A00.A0D;
        vi.A04(VH.A0Q, null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 9, 66), i);
            jSONObject.put(A00(0, 11, 39), str);
            jSONObject.put(A00(57, 3, 62), str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1839gi = this.A00.A0B;
        c1839gi.A0F().A6E(jSONObject2);
        c1610cz = this.A00.A0E;
        c1610cz.A04(AbstractC1251Td.A16, jSONObject2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        VI vi;
        C1839gi c1839gi;
        long j9;
        InterfaceC1621dA interfaceC1621dA;
        InterfaceC1621dA interfaceC1621dA2;
        vi = this.A00.A0D;
        vi.A04(VH.A0R, null);
        c1839gi = this.A00.A0B;
        InterfaceC1065Lt A0F = c1839gi.A0F();
        j9 = this.A00.A00;
        A0F.A6F(Y1.A01(j9));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        interfaceC1621dA = this.A00.A03;
        if (interfaceC1621dA == null) {
            return;
        }
        interfaceC1621dA2 = this.A00.A03;
        interfaceC1621dA2.AGh();
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
        String A00 = A00(0, 0, 93);
        A02(errorCode, sb.append(A00).append((Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl(), true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A00(28, 11, 29))) {
            return;
        }
        if (webResourceResponse != null) {
            i = webResourceResponse.getStatusCode();
        } else {
            i = -1;
        }
        A02(i, A00(39, 10, 68), A00(0, 0, 93) + webResourceRequest.getUrl(), false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C1839gi c1839gi;
        AbstractC2004jd abstractC2004jd;
        InterfaceC1622dB interfaceC1622dB;
        InterfaceC1622dB interfaceC1622dB2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(11, 8, 57), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 66), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1839gi = this.A00.A0B;
        String message = A02[5];
        if (message.charAt(10) == 'q') {
            A02[3] = "cKmn9F08G0LbJgt48cswTZGSotGQ5jj";
            c1839gi.A0F().A6A(jSONObject2);
            abstractC2004jd = this.A00.A09;
            AbstractC1624dD.A04(abstractC2004jd.A1D());
            interfaceC1622dB = this.A00.A04;
            if (interfaceC1622dB != null) {
                interfaceC1622dB2 = this.A00.A04;
                interfaceC1622dB2.AFU();
            }
            String message2 = A02[5];
            if (message2.charAt(10) == 'q') {
                A02[3] = "Jr1n";
                return true;
            }
        }
        throw new RuntimeException();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C1839gi c1839gi;
        C1245Sx c1245Sx;
        C1631dK c1631dK;
        AbstractC2004jd abstractC2004jd;
        c1839gi = this.A00.A0B;
        c1245Sx = this.A00.A0A;
        c1631dK = this.A00.A0H;
        abstractC2004jd = this.A00.A09;
        return C1633dM.A00(c1839gi, c1245Sx, webResourceRequest, c1631dK, abstractC2004jd.A1T());
    }
}

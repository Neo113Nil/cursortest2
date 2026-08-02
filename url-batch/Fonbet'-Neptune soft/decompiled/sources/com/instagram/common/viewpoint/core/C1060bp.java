package com.instagram.common.viewpoint.core;

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

/* renamed from: com.facebook.ads.redexgen.X.bp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1060bp extends WebViewClient {
    public static byte[] A01;
    public static String[] A02 = {"", "6FWFK2Rjg5lzc4YxuKyAM2pjdKcDgsPX", "X8DXQa0II", "SNpKLA", "Qdf29haAswqAmNE65waVoEZq7xKg2wdQ", "zoYtBkcpJPqvxBhZCETS8Gv12yQPTvJi", "ExNOaNYHlEOFqs215y0dlBgemejMJNEa", "gJ6ZUqdzTjndwEo8cFEFcqem1uRbclUa"};
    public final /* synthetic */ C1064bt A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A02[5].charAt(10) != 'q') {
                throw new RuntimeException();
            }
            A02[5] = "pKC7szj5R0qBwTmNDTYZuLrnbbbgOopj";
            copyOfRange[i4] = (byte) (i5 ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 99, 117, 101, 116, 111, 118, 114, 111, 105, 104, 124, 113, 124, 91, 106, 121, 107, 112, 6, 17, 17, Ascii.FF, 17, 32, Ascii.FF, 7, 6, 90, 93, 74, 85, 95, 83, 82, Ascii.DC2, 85, 95, 83, Ascii.CR, 17, 17, Ascii.NAK, 58, 0, Ascii.ETB, Ascii.ETB, 10, Ascii.ETB, 19, 17, 10, Ascii.FF, 17, 10, Ascii.ETB, Ascii.SUB, 106, 109, 115};
    }

    static {
        A01();
    }

    public C1060bp(C1064bt c1064bt) {
        this.A00 = c1064bt;
    }

    private void A02(int i, String str, String str2, boolean z) {
        C0796Ua c0796Ua;
        C1153dL c1153dL;
        C1051bg c1051bg;
        if (z) {
            this.A00.A0S();
        }
        c0796Ua = this.A00.A0D;
        c0796Ua.A04(UZ.A0Q, null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 9, 66), i);
            jSONObject.put(A00(0, 11, 39), str);
            jSONObject.put(A00(57, 3, 62), str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1153dL = this.A00.A0B;
        c1153dL.A0F().A66(jSONObject2);
        c1051bg = this.A00.A0E;
        c1051bg.A04(AbstractC0766Sv.A16, jSONObject2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C0796Ua c0796Ua;
        C1153dL c1153dL;
        long j;
        InterfaceC1062br interfaceC1062br;
        InterfaceC1062br interfaceC1062br2;
        c0796Ua = this.A00.A0D;
        c0796Ua.A04(UZ.A0R, null);
        c1153dL = this.A00.A0B;
        LH A0F = c1153dL.A0F();
        j = this.A00.A00;
        A0F.A67(XG.A01(j));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        interfaceC1062br = this.A00.A03;
        if (interfaceC1062br == null) {
            return;
        }
        interfaceC1062br2 = this.A00.A03;
        interfaceC1062br2.AFx();
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
        C1153dL c1153dL;
        AbstractC1428hy abstractC1428hy;
        InterfaceC1063bs interfaceC1063bs;
        InterfaceC1063bs interfaceC1063bs2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(11, 8, 57), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 66), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1153dL = this.A00.A0B;
        String message = A02[5];
        if (message.charAt(10) == 'q') {
            A02[3] = "cKmn9F08G0LbJgt48cswTZGSotGQ5jj";
            c1153dL.A0F().A62(jSONObject2);
            abstractC1428hy = this.A00.A09;
            AbstractC1065bu.A04(abstractC1428hy.A17());
            interfaceC1063bs = this.A00.A04;
            if (interfaceC1063bs != null) {
                interfaceC1063bs2 = this.A00.A04;
                interfaceC1063bs2.AEm();
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
        C1153dL c1153dL;
        SF sf;
        C1073c2 c1073c2;
        AbstractC1428hy abstractC1428hy;
        c1153dL = this.A00.A0B;
        sf = this.A00.A0A;
        c1073c2 = this.A00.A0H;
        abstractC1428hy = this.A00.A09;
        return C1075c4.A00(c1153dL, sf, webResourceRequest, c1073c2, abstractC1428hy.A1O());
    }
}

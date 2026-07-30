package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Zj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0938Zj extends WebViewClient {
    public static byte[] A0B;
    public static String[] A0C = {"zsPwasR1y7408", "ZGgsKLkccpHpwEVEMRkr0P5MO", "FzTF8imkK53ZXE3O7c0sd3pyoR5CtRCL", "JPkvHHHSAaAEWhLae7UVRehZAXg5QbZs", "c", "Jl8ZDZjQ485DOmiNP3uI8E", "DJVtCfMEOJ4BXbKH6y5pb3wK31xmWsao", "K"};
    public Date A00;
    public boolean A01 = false;
    public final C1159dL A02;
    public final WeakReference<C0555Ki> A03;
    public final WeakReference<InterfaceC0936Zh> A04;
    public final WeakReference<AtomicBoolean> A05;
    public final WeakReference<XH> A06;
    public final WeakReference<C1232eX> A07;
    public final AtomicInteger A08;
    public final AtomicReference<String> A09;
    public final boolean A0A;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {8, 38, 40, 45, 42, -14, 8, 52, 51, 57, 55, 52, 49, -69, -36, -27, -32, -36, -37, Ascii.FS, 77, 56, 67, 76, 56, 75, 64, 69, 62, -9, 44, 41, 32, -9, 39, 56, 75, Utf8.REPLACEMENT_BYTE, -9, Base64.padSymbol, 70, 73, -9, Ascii.GS, 64, 67, 60, -9, Ascii.CAN, 58, 58, 60, 74, 74, -9, -46, 5, 1, -1, -18, -83, -15, -18, 1, -18, -57, -83, 60, 72, 72, 68, Ascii.DC4, 57, 102, 102, 99, 102, 59, 84, 89, 71, 76, 75, 6, 56, 75, 87, 91, 75, 89, 90, 6, 76, 85, 88, 6, 44, 79, 82, 75, 6, 39, 73, 73, 75, 89, 89, 6, 34, 59, 64, 46, 51, 50, -19, Ascii.US, 50, 62, 66, 50, 64, 65, -19, 51, 60, Utf8.REPLACEMENT_BYTE, -19, 19, 54, 57, 50, -19, Ascii.SO, 48, 48, 50, 64, 64, -19, 49, 50, 59, 54, 50, 49, 67, 68, 77, 72, 68, 67, 62, 84, 81, 72, 62, 79, 64, 83, 71, Utf8.REPLACEMENT_BYTE, 76, 76, 73, 76, 57, Base64.padSymbol, 73, 62, Utf8.REPLACEMENT_BYTE, 40, 53, 53, 50, 53, 34, 39, 40, 54, 38, 53, 44, 51, 55, 44, 50, 49, Ascii.SI, 10, Ascii.US, Ascii.DC2, Ascii.FF, Ascii.CAN, Ascii.ETB, -41, Ascii.DC2, Ascii.FF, Ascii.CAN, 19, Ascii.SYN, Ascii.EM, Ascii.DC2, 89, 99, 79, 103, 85, 82, 79, 98, 85, 99, 95, 101, 98, 83, 85, 79, 85, 98, 98, 95, 98, 70, 73, 59, 62, 67, 72, 65, 57, 78, 67, 71, Utf8.REPLACEMENT_BYTE, 57, 67, 72, 57, 71, 67, 70, 70, 67, 77, -3, -12, 3, -55, -55, -44, -31, -31, -18, -44, -36, -33, -29, -24, -18, -31, -44, -30, -33, -34, -35, -30, -44, 46, 47, -19, 51, 52, 47, 50, 37, 66, 53, 65, 69, 53, 67, 68, 47, 57, 52, 101, 86, 105, 101, 32, 97, 93, 82, 90, 95, -8, -29, -18, -21, -26, -31, -14, -29, -10, -22, 62, 44, 41, 38, Base64.padSymbol, 48, 44, 62};
        String[] strArr = A0C;
        if (strArr[0].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[3] = "rhE0g4ovzatryzU62WuE8blUNequGZ6x";
        strArr2[6] = "8iaaY9YuVC21lqcoOxYFj2DPKFldlJdP";
        A0B = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0A(String str, List<String> list) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (lowerCase.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    static {
        A02();
    }

    public C0938Zj(C1159dL c1159dL, WeakReference<InterfaceC0936Zh> weakReference, WeakReference<C1232eX> weakReference2, WeakReference<XH> weakReference3, WeakReference<AtomicBoolean> checkAssetsByJavascriptBridge, WeakReference<C0555Ki> weakReference4, AtomicInteger atomicInteger, AtomicReference<String> requestId, boolean z) {
        this.A02 = c1159dL;
        this.A04 = weakReference;
        this.A07 = weakReference2;
        this.A06 = weakReference3;
        this.A05 = checkAssetsByJavascriptBridge;
        this.A03 = weakReference4;
        this.A08 = atomicInteger;
        this.A09 = requestId;
        this.A0A = z;
    }

    private WebResourceResponse A00() {
        return new WebResourceResponse(A01(286, 10, Opcodes.LSHR), StandardCharsets.UTF_8.name(), TypedValues.CycleType.TYPE_ALPHA, A01(13, 6, 1), Collections.singletonMap(A01(0, 13, 79), A01(268, 8, 74)), new ByteArrayInputStream(A01(13, 6, 1).getBytes()));
    }

    private void A03(int i, CharSequence charSequence, long j) {
        JSONObject jSONObject = new JSONObject();
        boolean z = charSequence != null;
        try {
            jSONObject.put(A01(Opcodes.IF_ICMPNE, 10, 100), i);
            jSONObject.put(A01(Opcodes.TABLESWITCH, 17, 77), charSequence);
            jSONObject.put(A01(202, 21, 122), z);
            jSONObject.put(A01(223, 22, 100), j);
            jSONObject.put(A01(276, 10, 90), this.A09.get());
        } catch (JSONException unused) {
        }
        this.A02.A08().AAy(A01(306, 8, 81), AbstractC0772Sv.A2f, new C0773Sw(AdErrorType.WEB_VIEW_FAILED_TO_LOAD.getDefaultErrorMessage(), A01(55, 12, 23) + jSONObject.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i, String str) {
        if (A01(245, 23, 25).equals(str)) {
            this.A02.A0F().AKC();
            return;
        }
        this.A02.A0F().AKD(i, str);
        Date finishTime = new Date();
        long time = finishTime.getTime();
        Date finishTime2 = this.A00;
        A03(i, str, time - finishTime2.getTime());
        if (this.A04.get() != null) {
            this.A04.get().ADG(i, str);
        }
    }

    private final void A05(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A01(Opcodes.NEW, 11, 51))) {
            return;
        }
        this.A02.A0F().AKH(webResourceResponse.getStatusCode(), AbstractC0866Wp.A01(webResourceResponse.getStatusCode(), A01(67, 10, 126), A01(0, 0, 53) + webResourceRequest.getUrl()));
    }

    private void A07(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A01(Opcodes.I2B, 15, 105), str);
            jSONObject.put(A01(296, 10, 12), str2);
            jSONObject.put(A01(276, 10, 90), this.A09.get());
        } catch (JSONException unused) {
        }
        if (this.A02 != null) {
            this.A02.A08().AAy(A01(306, 8, 81), AbstractC0772Sv.A2c, new C0773Sw(AdErrorType.WEB_VIEW_CACHE_FILE_WAS_DENIED.getDefaultErrorMessage(), A01(55, 12, 23) + jSONObject.toString()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r4 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r4 = new java.lang.StringBuilder();
        r0 = A01(19, 36, 97);
        r4.append(r0).append(r3).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        r5 = com.instagram.common.viewpoint.core.SF.A09(r7.A02);
        r6 = A0A(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (r6 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (com.facebook.ads.internal.api.BuildConfigApi.isDebug() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        r4 = new java.lang.StringBuilder();
        r0 = A01(77, 31, 112);
        r4.append(r0).append(r3).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        r4 = com.instagram.common.viewpoint.core.C0555Ki.A0H;
        r0 = A01(108, 37, 87);
        android.util.Log.w(r4, r0);
        r0 = r5.toString();
        A07(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
    
        if (r4 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A08(Uri uri) {
        String path = uri.getPath();
        String scheme = uri.getScheme();
        if (path == null || scheme == null) {
            return true;
        }
        String[] strArr = A0C;
        String scheme2 = strArr[3];
        String path2 = strArr[6];
        if (scheme2.length() != path2.length()) {
            throw new RuntimeException();
        }
        A0C[5] = "5na5yijD7UxFpHVkXXcSH2RW6Zg";
        String path3 = A01(Opcodes.IFNULL, 4, 55);
        if (scheme.equals(path3)) {
            boolean isDebug = BuildConfigApi.isDebug();
            String[] strArr2 = A0C;
            String scheme3 = strArr2[3];
            String path4 = strArr2[6];
            if (scheme3.length() == path4.length()) {
                A0C[5] = "2SO0ZWlaSU1SnxqLnXbiPhTsGSHCmzPH";
            }
        } else {
            return true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A02.A0F().AKE(this.A03.get() != null);
        if (this.A03.get() != null) {
            AtomicBoolean atomicBoolean = this.A05.get();
            String[] strArr = A0C;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[3] = "U2DnXjrenRRLx1oMUBfcSIJQu5ANNJpT";
            strArr2[6] = "L4ZmgD3GCXt8DfDAt3P3IJDf6GSeHMJn";
            if (atomicBoolean != null && !this.A05.get().get()) {
                this.A03.get().A0K();
            }
        }
        this.A01 = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.A02.A0F().AKF();
        this.A00 = new Date();
        new Handler().postDelayed(new C0557Kk(this), this.A08.get());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.A01 = true;
        A04(i, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        boolean A12 = U7.A12(this.A02);
        String A01 = A01(0, 0, 53);
        if (A12 || webResourceRequest.isForMainFrame()) {
            this.A01 = true;
            A04(webResourceError.getErrorCode(), A01 + ((Object) webResourceError.getDescription()));
        } else {
            this.A02.A0F().AKG(AbstractC0866Wp.A01(webResourceError.getErrorCode(), A01 + ((Object) webResourceError.getDescription()), A01 + webResourceRequest.getUrl()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        A05(webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.A02.A0F().AKI();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC0933Ze.A0D(AbstractC0772Sv.A2b);
        InterfaceC0936Zh adWebViewListener = this.A04.get();
        if (adWebViewListener != null) {
            adWebViewListener.AFw();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (this.A0A && !A08(url)) {
            WebResourceResponse A00 = A00();
            A05(webResourceRequest, A00);
            return A00;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.A04.get() != null) {
            this.A04.get().ACj(str, new C0944Zp().A03(this.A07.get()).A02(this.A06.get()).A05());
        }
        if (A0C[2].charAt(27) != 'C') {
            throw new RuntimeException();
        }
        A0C[5] = "jV60qdj1rgKoRn";
        return true;
    }
}

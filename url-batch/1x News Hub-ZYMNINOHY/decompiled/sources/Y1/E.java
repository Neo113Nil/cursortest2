package Y1;

import E1.AbstractC0033i;
import a.AbstractC0129a;
import android.app.usage.UsageStatsManager;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.util.Log;
import android.view.View;
import android.webkit.WebStorage;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.adinformation.ImageResourceConfig;
import com.startapp.sdk.internal.aa;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.i2;
import com.startapp.sdk.internal.i8;
import com.startapp.sdk.internal.s1;
import com.startapp.sdk.internal.t1;
import com.startapp.sdk.internal.zi;
import e1.C0311b;
import g1.C0335d;
import g1.C0336e;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.appmetrica.analytics.impl.C0635l2;
import io.appmetrica.analytics.impl.C0642l9;
import io.appmetrica.analytics.impl.C2;
import io.appmetrica.analytics.impl.E2;
import io.appmetrica.analytics.impl.P5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements P1.c, P1.b, Z1.c, i2, g7, zi, FunctionWithThrowable, ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1753b;

    public /* synthetic */ E(int i3, Object obj) {
        this.f1752a = i3;
        this.f1753b = obj;
    }

    @Override // com.startapp.sdk.internal.g7
    public Object a(Object obj) {
        switch (this.f1752a) {
            case C0642l9.f7778D /* 20 */:
                return aa.a((aa) this.f1753b, (Throwable) obj);
            case C0642l9.f7779E /* 21 */:
            default:
                return ((t1) this.f1753b).a((Throwable) obj);
            case 22:
                return ((s1) this.f1753b).a((Throwable) obj);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        E2 a3;
        a3 = C2.a((C0635l2) this.f1753b, (UsageStatsManager) obj);
        return a3;
    }

    @Override // Z1.c
    public boolean b(View view) {
        for (Class cls : (Class[]) this.f1753b) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public t0.b c(A0.f fVar) {
        t0.c cVar = (t0.c) this.f1753b;
        String p3 = AbstractC0129a.p("CctTransportBackend");
        boolean isLoggable = Log.isLoggable(p3, 4);
        URL url = (URL) fVar.f23b;
        if (isLoggable) {
            Log.i(p3, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f10369g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) fVar.f25d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    b0.r rVar = cVar.f10364a;
                    u0.i iVar = (u0.i) fVar.f24c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C0335d c0335d = (C0335d) rVar.f2543a;
                    C0336e c0336e = new C0336e(bufferedWriter, c0335d.f5043a, c0335d.f5044b, c0335d.f5045c, c0335d.f5046d);
                    c0336e.e(iVar);
                    c0336e.g();
                    c0336e.f5048b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String p4 = AbstractC0129a.p("CctTransportBackend");
                    if (Log.isLoggable(p4, 4)) {
                        Log.i(p4, String.format("Status Code: %d", valueOf));
                    }
                    AbstractC0129a.j("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC0129a.j("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new t0.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new t0.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            t0.b bVar = new t0.b(responseCode, null, u0.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f10515a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (C0311b e3) {
            e = e3;
            AbstractC0129a.l("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new t0.b(400, null, 0L);
        } catch (ConnectException e4) {
            e = e4;
            AbstractC0129a.l("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new t0.b(500, null, 0L);
        } catch (UnknownHostException e5) {
            e = e5;
            AbstractC0129a.l("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new t0.b(500, null, 0L);
        } catch (IOException e6) {
            e = e6;
            AbstractC0129a.l("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new t0.b(400, null, 0L);
        }
    }

    @Override // P1.c
    public void n(Object obj) {
        switch (this.f1752a) {
            case 0:
                boolean z = obj instanceof List;
                Object obj2 = ((C0110g) this.f1753b).f1855b;
                if (!z) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance'.", "", "PrivateKey", obj2);
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj3 = list.get(0);
                        kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        Object obj4 = list.get(1);
                        kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj3, (String) obj4, (String) list.get(2)), "PrivateKey", obj2);
                        break;
                    }
                }
                break;
            case 1:
                boolean z2 = obj instanceof List;
                Object obj5 = ((C0110g) this.f1753b).f1855b;
                if (!z2) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance'.", "", "SslCertificate", obj5);
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        Object obj6 = list2.get(0);
                        kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list2.get(1);
                        kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj6, (String) obj7, (String) list2.get(2)), "SslCertificate", obj5);
                        break;
                    }
                }
                break;
            case 2:
                boolean z3 = obj instanceof List;
                Object obj8 = ((C0110g) this.f1753b).f1855b;
                if (!z3) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance'.", "", "SslCertificateDName", obj8);
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj9 = list3.get(0);
                        kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        Object obj10 = list3.get(1);
                        kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj9, (String) obj10, (String) list3.get(2)), "SslCertificateDName", obj8);
                        break;
                    }
                }
                break;
            case 3:
                boolean z4 = obj instanceof List;
                Object obj11 = ((C0110g) this.f1753b).f1855b;
                if (!z4) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance'.", "", "SslError", obj11);
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj12 = list4.get(0);
                        kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list4.get(1);
                        kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj12, (String) obj13, (String) list4.get(2)), "SslError", obj11);
                        break;
                    }
                }
                break;
            case 4:
            case 12:
            case 15:
            default:
                boolean z5 = obj instanceof List;
                Object obj14 = ((C0110g) this.f1753b).f1855b;
                if (!z5) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance'.", "", "X509Certificate", obj14);
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() > 1) {
                        Object obj15 = list5.get(0);
                        kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        Object obj16 = list5.get(1);
                        kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj15, (String) obj16, (String) list5.get(2)), "X509Certificate", obj14);
                        break;
                    }
                }
                break;
            case 5:
                boolean z6 = obj instanceof List;
                Object obj17 = ((C0110g) this.f1753b).f1855b;
                if (!z6) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance'.", "", "SslErrorHandler", obj17);
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() > 1) {
                        Object obj18 = list6.get(0);
                        kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list6.get(1);
                        kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj18, (String) obj19, (String) list6.get(2)), "SslErrorHandler", obj17);
                        break;
                    }
                }
                break;
            case 6:
                boolean z7 = obj instanceof List;
                Object obj20 = ((C0110g) this.f1753b).f1855b;
                if (!z7) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance'.", "", "View", obj20);
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() > 1) {
                        Object obj21 = list7.get(0);
                        kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        Object obj22 = list7.get(1);
                        kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj21, (String) obj22, (String) list7.get(2)), "View", obj20);
                        break;
                    }
                }
                break;
            case 7:
                boolean z8 = obj instanceof List;
                Object obj23 = ((C0110g) this.f1753b).f1855b;
                if (!z8) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance'.", "", "WebResourceError", obj23);
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() > 1) {
                        Object obj24 = list8.get(0);
                        kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list8.get(1);
                        kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj24, (String) obj25, (String) list8.get(2)), "WebResourceError", obj23);
                        break;
                    }
                }
                break;
            case 8:
                boolean z9 = obj instanceof List;
                Object obj26 = ((C0110g) this.f1753b).f1855b;
                if (!z9) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance'.", "", "WebResourceRequest", obj26);
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() > 1) {
                        Object obj27 = list9.get(0);
                        kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        Object obj28 = list9.get(1);
                        kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj27, (String) obj28, (String) list9.get(2)), "WebResourceRequest", obj26);
                        break;
                    }
                }
                break;
            case 9:
                boolean z10 = obj instanceof List;
                Object obj29 = ((C0110g) this.f1753b).f1855b;
                if (!z10) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance'.", "", "WebResourceResponse", obj29);
                    break;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() > 1) {
                        Object obj30 = list10.get(0);
                        kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list10.get(1);
                        kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj30, (String) obj31, (String) list10.get(2)), "WebResourceResponse", obj29);
                        break;
                    }
                }
                break;
            case 10:
                boolean z11 = obj instanceof List;
                Object obj32 = ((C0110g) this.f1753b).f1855b;
                if (!z11) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance'.", "", "WebSettings", obj32);
                    break;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() > 1) {
                        Object obj33 = list11.get(0);
                        kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        Object obj34 = list11.get(1);
                        kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj33, (String) obj34, (String) list11.get(2)), "WebSettings", obj32);
                        break;
                    }
                }
                break;
            case 11:
                boolean z12 = obj instanceof List;
                Object obj35 = ((C0110g) this.f1753b).f1855b;
                if (!z12) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance'.", "", "WebStorage", obj35);
                    break;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() > 1) {
                        Object obj36 = list12.get(0);
                        kotlin.jvm.internal.j.c(obj36, "null cannot be cast to non-null type kotlin.String");
                        Object obj37 = list12.get(1);
                        kotlin.jvm.internal.j.c(obj37, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj36, (String) obj37, (String) list12.get(2)), "WebStorage", obj35);
                        break;
                    }
                }
                break;
            case 13:
                boolean z13 = obj instanceof List;
                Object obj38 = ((C0110g) this.f1753b).f1855b;
                if (!z13) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance'.", "", "WebView", obj38);
                    break;
                } else {
                    List list13 = (List) obj;
                    if (list13.size() > 1) {
                        Object obj39 = list13.get(0);
                        kotlin.jvm.internal.j.c(obj39, "null cannot be cast to non-null type kotlin.String");
                        Object obj40 = list13.get(1);
                        kotlin.jvm.internal.j.c(obj40, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj39, (String) obj40, (String) list13.get(2)), "WebView", obj38);
                        break;
                    }
                }
                break;
            case 14:
                boolean z14 = obj instanceof List;
                Object obj41 = ((C0110g) this.f1753b).f1855b;
                if (!z14) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance'.", "", "WebViewClient", obj41);
                    break;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() > 1) {
                        Object obj42 = list14.get(0);
                        kotlin.jvm.internal.j.c(obj42, "null cannot be cast to non-null type kotlin.String");
                        Object obj43 = list14.get(1);
                        kotlin.jvm.internal.j.c(obj43, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj42, (String) obj43, (String) list14.get(2)), "WebViewClient", obj41);
                        break;
                    }
                }
                break;
            case 16:
                boolean z15 = obj instanceof List;
                Object obj44 = ((C0110g) this.f1753b).f1855b;
                if (!z15) {
                    AbstractC0033i.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance'.", "", "WebViewPoint", obj44);
                    break;
                } else {
                    List list15 = (List) obj;
                    if (list15.size() > 1) {
                        Object obj45 = list15.get(0);
                        kotlin.jvm.internal.j.c(obj45, "null cannot be cast to non-null type kotlin.String");
                        Object obj46 = list15.get(1);
                        kotlin.jvm.internal.j.c(obj46, "null cannot be cast to non-null type kotlin.String");
                        AbstractC0033i.o(new C0104a((String) obj45, (String) obj46, (String) list15.get(2)), "WebViewPoint", obj44);
                        break;
                    }
                }
                break;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        P5.a((P5) this.f1753b);
    }

    @Override // com.startapp.sdk.internal.i2
    public void a(Bitmap bitmap, int i3) {
        ((ImageResourceConfig) this.f1753b).a(bitmap, i3);
    }

    @Override // com.startapp.sdk.internal.zi
    public void a(List list, VASTErrorCodes vASTErrorCodes) {
        i8.a((i8) this.f1753b, list, vASTErrorCodes);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // P1.b
    public void a(Object obj, V0.e eVar) {
        List L;
        List L2;
        List L3;
        switch (this.f1752a) {
            case 4:
                C0113j c0113j = (C0113j) this.f1753b;
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                int i3 = 0;
                Object obj2 = list.get(0);
                kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type android.net.http.SslError");
                SslError sslError = (SslError) obj2;
                Object obj3 = list.get(1);
                kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.SslErrorType");
                O o = (O) obj3;
                try {
                } catch (Throwable th) {
                    if (th instanceof C0104a) {
                        C0104a c0104a = th;
                        L = c2.f.L(c0104a.f1816a, c0104a.f1817b, c0104a.f1818c);
                    } else {
                        L = c2.f.L(th.getClass().getSimpleName(), th.toString(), AbstractC0033i.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                    }
                }
                switch (o.ordinal()) {
                    case 0:
                        i3 = 4;
                        L = AbstractC0129a.r(Boolean.valueOf(sslError.hasError(i3)));
                        eVar.n(L);
                        return;
                    case 1:
                        i3 = 1;
                        L = AbstractC0129a.r(Boolean.valueOf(sslError.hasError(i3)));
                        eVar.n(L);
                        return;
                    case 2:
                        i3 = 2;
                        L = AbstractC0129a.r(Boolean.valueOf(sslError.hasError(i3)));
                        eVar.n(L);
                        return;
                    case 3:
                        i3 = 5;
                        L = AbstractC0129a.r(Boolean.valueOf(sslError.hasError(i3)));
                        eVar.n(L);
                        return;
                    case 4:
                        L = AbstractC0129a.r(Boolean.valueOf(sslError.hasError(i3)));
                        eVar.n(L);
                        return;
                    case 5:
                        i3 = 3;
                        L = AbstractC0129a.r(Boolean.valueOf(sslError.hasError(i3)));
                        eVar.n(L);
                        return;
                    case 6:
                        c0113j.f1861a.getClass();
                        throw new IllegalArgumentException(o + " doesn't represent a native value.");
                    default:
                        i3 = -1;
                        L = AbstractC0129a.r(Boolean.valueOf(sslError.hasError(i3)));
                        eVar.n(L);
                        return;
                }
            case 12:
                C0113j c0113j2 = (C0113j) this.f1753b;
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0107d) c0113j2.f1861a.f17b).a(((Long) obj4).longValue(), WebStorage.getInstance());
                    L2 = AbstractC0129a.r(null);
                } catch (Throwable th2) {
                    if (th2 instanceof C0104a) {
                        C0104a c0104a2 = th2;
                        L2 = c2.f.L(c0104a2.f1816a, c0104a2.f1817b, c0104a2.f1818c);
                    } else {
                        L2 = c2.f.L(th2.getClass().getSimpleName(), th2.toString(), AbstractC0033i.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                    }
                }
                eVar.n(L2);
                return;
            case 15:
                C0117n c0117n = (C0117n) this.f1753b;
                kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj5 = ((List) obj).get(0);
                kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0107d) c0117n.f1873a.f17b).a(((Long) obj5).longValue(), new b0(c0117n));
                    L3 = AbstractC0129a.r(null);
                } catch (Throwable th3) {
                    if (th3 instanceof C0104a) {
                        C0104a c0104a3 = th3;
                        L3 = c2.f.L(c0104a3.f1816a, c0104a3.f1817b, c0104a3.f1818c);
                    } else {
                        L3 = c2.f.L(th3.getClass().getSimpleName(), th3.toString(), AbstractC0033i.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                    }
                }
                eVar.n(L3);
                return;
            case 24:
                Pigeon.AppMetricaConfigConverterPigeon.lambda$setup$0((Pigeon.AppMetricaConfigConverterPigeon) this.f1753b, obj, eVar);
                return;
            case C0642l9.f7780F /* 25 */:
                Pigeon.AppMetricaLibraryAdapterPigeon.lambda$setup$0((Pigeon.AppMetricaLibraryAdapterPigeon) this.f1753b, obj, eVar);
                return;
            default:
                Pigeon.InitialDeepLinkHolderPigeon.lambda$setup$0((Pigeon.InitialDeepLinkHolderPigeon) this.f1753b, obj, eVar);
                return;
        }
    }
}

package Y1;

import a.AbstractC0129a;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import b2.C0192f;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: Y1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111h extends C0105b {

    /* renamed from: a, reason: collision with root package name */
    public final A0.d f1859a;

    public C0111h(A0.d registrar) {
        kotlin.jvm.internal.j.e(registrar, "registrar");
        this.f1859a = registrar;
    }

    public static final void a(String str, Object obj, Throwable th) {
        Log.w("PigeonProxyApiBaseCodec", "Failed to create new Dart proxy instance of " + str + ": " + obj + ". " + th);
    }

    @Override // Y1.C0105b, P1.t
    public final Object readValueOfType(byte b3, ByteBuffer byteBuffer) {
        if (b3 != Byte.MIN_VALUE) {
            return super.readValueOfType(b3, byteBuffer);
        }
        Object readValue = readValue(byteBuffer);
        kotlin.jvm.internal.j.c(readValue, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) readValue).longValue();
        Object e3 = ((C0107d) this.f1859a.f17b).e(longValue);
        if (e3 == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + longValue);
        }
        return e3;
    }

    @Override // Y1.C0105b, P1.t
    public final void writeValue(ByteArrayOutputStream stream, Object obj) {
        kotlin.jvm.internal.j.e(stream, "stream");
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof EnumC0121s) || (obj instanceof EnumC0114k) || (obj instanceof EnumC0127y) || (obj instanceof O) || (obj instanceof EnumC0126x) || (obj instanceof g0) || obj == null) {
            super.writeValue(stream, obj);
            return;
        }
        boolean z = obj instanceof WebResourceRequest;
        A0.d dVar = this.f1859a;
        if (z) {
            dVar.getClass();
            WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
            C0110g c0110g = new C0110g(0, obj);
            C0107d c0107d = (C0107d) dVar.f17b;
            if (!c0107d.d(webResourceRequest)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance", dVar.a(), (K0.j) null).h(c2.f.L(Long.valueOf(c0107d.b(webResourceRequest)), webResourceRequest.getUrl().toString(), Boolean.valueOf(webResourceRequest.isForMainFrame()), Boolean.valueOf(webResourceRequest.isRedirect()), Boolean.valueOf(webResourceRequest.hasGesture()), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders() == null ? Collections.EMPTY_MAP : webResourceRequest.getRequestHeaders()), new E(8, c0110g));
            }
        } else if (obj instanceof WebResourceResponse) {
            dVar.getClass();
            WebResourceResponse webResourceResponse = (WebResourceResponse) obj;
            C0110g c0110g2 = new C0110g(25, obj);
            C0107d c0107d2 = (C0107d) dVar.f17b;
            if (!c0107d2.d(webResourceResponse)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance", dVar.a(), (K0.j) null).h(c2.f.L(Long.valueOf(c0107d2.b(webResourceResponse)), Long.valueOf(webResourceResponse.getStatusCode())), new E(9, c0110g2));
            }
        } else if (obj instanceof WebResourceError) {
            dVar.getClass();
            WebResourceError webResourceError = (WebResourceError) obj;
            C0110g c0110g3 = new C0110g(12, obj);
            C0107d c0107d3 = (C0107d) dVar.f17b;
            if (!c0107d3.d(webResourceError)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance", dVar.a(), (K0.j) null).h(c2.f.L(Long.valueOf(c0107d3.b(webResourceError)), Long.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription().toString()), new E(7, c0110g3));
            }
        } else if (obj instanceof d0) {
            dVar.getClass();
            d0 d0Var = (d0) obj;
            C0110g c0110g4 = new C0110g(13, obj);
            C0107d c0107d4 = (C0107d) dVar.f17b;
            if (!c0107d4.d(d0Var)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance", dVar.a(), (K0.j) null).h(c2.f.L(Long.valueOf(c0107d4.b(d0Var)), Long.valueOf(d0Var.f1839a), Long.valueOf(d0Var.f1840b)), new E(16, c0110g4));
            }
        } else if (obj instanceof ConsoleMessage) {
            dVar.getClass();
            ConsoleMessage consoleMessage = (ConsoleMessage) obj;
            C0110g c0110g5 = new C0110g(14, obj);
            C0107d c0107d5 = (C0107d) dVar.f17b;
            if (!c0107d5.d(consoleMessage)) {
                long b3 = c0107d5.b(consoleMessage);
                long lineNumber = consoleMessage.lineNumber();
                String message = consoleMessage.message();
                int i3 = AbstractC0115l.f1870a[consoleMessage.messageLevel().ordinal()];
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance", dVar.a(), (K0.j) null).h(c2.f.L(Long.valueOf(b3), Long.valueOf(lineNumber), message, i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? EnumC0114k.UNKNOWN : EnumC0114k.DEBUG : EnumC0114k.ERROR : EnumC0114k.WARNING : EnumC0114k.LOG : EnumC0114k.TIP, consoleMessage.sourceId()), new B0.g(20, c0110g5));
            }
        } else if (obj instanceof CookieManager) {
            dVar.getClass();
            CookieManager cookieManager = (CookieManager) obj;
            C0110g c0110g6 = new C0110g(15, obj);
            C0107d c0107d6 = (C0107d) dVar.f17b;
            if (!c0107d6.d(cookieManager)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d6.b(cookieManager))), new B0.g(21, c0110g6));
            }
        } else if (obj instanceof WebView) {
            dVar.getClass();
            WebView webView = (WebView) obj;
            C0110g c0110g7 = new C0110g(16, obj);
            C0107d c0107d7 = (C0107d) dVar.f17b;
            if (!c0107d7.d(webView)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d7.b(webView))), new E(13, c0110g7));
            }
        } else if (obj instanceof WebSettings) {
            dVar.getClass();
            WebSettings webSettings = (WebSettings) obj;
            C0110g c0110g8 = new C0110g(17, obj);
            C0107d c0107d8 = (C0107d) dVar.f17b;
            if (!c0107d8.d(webSettings)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d8.b(webSettings))), new E(10, c0110g8));
            }
        } else if (obj instanceof C0125w) {
            dVar.getClass();
            if (!((C0107d) dVar.f17b).d((C0125w) obj)) {
                a("JavaScriptChannel", obj, C0192f.a(android.support.v4.media.session.a.k(new C0104a("new-instance-error", "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method.", ""))));
            }
        } else if (obj instanceof WebViewClient) {
            dVar.getClass();
            WebViewClient webViewClient = (WebViewClient) obj;
            C0110g c0110g9 = new C0110g(11, obj);
            C0107d c0107d9 = (C0107d) dVar.f17b;
            if (!c0107d9.d(webViewClient)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d9.b(webViewClient))), new E(14, c0110g9));
            }
        } else if (obj instanceof DownloadListener) {
            dVar.getClass();
            if (!((C0107d) dVar.f17b).d((DownloadListener) obj)) {
                a("DownloadListener", obj, C0192f.a(android.support.v4.media.session.a.k(new C0104a("new-instance-error", "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method.", ""))));
            }
        } else if (obj instanceof V) {
            dVar.getClass();
            if (!((C0107d) dVar.f17b).d((V) obj)) {
                a("WebChromeClient", obj, C0192f.a(android.support.v4.media.session.a.k(new C0104a("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", ""))));
            }
        } else if (obj instanceof C0122t) {
            dVar.getClass();
            C0122t c0122t = (C0122t) obj;
            C0110g c0110g10 = new C0110g(18, obj);
            C0107d c0107d10 = (C0107d) dVar.f17b;
            if (!c0107d10.d(c0122t)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d10.b(c0122t))), new B0.g(25, c0110g10));
            }
        } else if (obj instanceof WebStorage) {
            dVar.getClass();
            WebStorage webStorage = (WebStorage) obj;
            C0110g c0110g11 = new C0110g(19, obj);
            C0107d c0107d11 = (C0107d) dVar.f17b;
            if (!c0107d11.d(webStorage)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d11.b(webStorage))), new E(11, c0110g11));
            }
        } else if (obj instanceof WebChromeClient.FileChooserParams) {
            dVar.getClass();
            WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj;
            C0110g c0110g12 = new C0110g(20, obj);
            C0107d c0107d12 = (C0107d) dVar.f17b;
            if (!c0107d12.d(fileChooserParams)) {
                long b4 = c0107d12.b(fileChooserParams);
                boolean isCaptureEnabled = fileChooserParams.isCaptureEnabled();
                List asList = Arrays.asList(fileChooserParams.getAcceptTypes());
                int mode = fileChooserParams.getMode();
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", dVar.a(), (K0.j) null).h(c2.f.L(Long.valueOf(b4), Boolean.valueOf(isCaptureEnabled), asList, mode != 0 ? mode != 1 ? mode != 3 ? EnumC0121s.UNKNOWN : EnumC0121s.SAVE : EnumC0121s.OPEN_MULTIPLE : EnumC0121s.OPEN, fileChooserParams.getFilenameHint()), new B0.g(24, c0110g12));
            }
        } else if (obj instanceof PermissionRequest) {
            dVar.getClass();
            PermissionRequest permissionRequest = (PermissionRequest) obj;
            C0110g c0110g13 = new C0110g(21, obj);
            C0107d c0107d13 = (C0107d) dVar.f17b;
            if (!c0107d13.d(permissionRequest)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance", dVar.a(), (K0.j) null).h(c2.f.L(Long.valueOf(c0107d13.b(permissionRequest)), Arrays.asList(permissionRequest.getResources())), new B0.g(29, c0110g13));
            }
        } else if (obj instanceof WebChromeClient.CustomViewCallback) {
            dVar.getClass();
            WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) obj;
            C0110g c0110g14 = new C0110g(22, obj);
            C0107d c0107d14 = (C0107d) dVar.f17b;
            if (!c0107d14.d(customViewCallback)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d14.b(customViewCallback))), new B0.g(22, c0110g14));
            }
        } else if (obj instanceof View) {
            dVar.getClass();
            View view = (View) obj;
            C0110g c0110g15 = new C0110g(23, obj);
            C0107d c0107d15 = (C0107d) dVar.f17b;
            if (!c0107d15.d(view)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d15.b(view))), new E(6, c0110g15));
            }
        } else if (obj instanceof GeolocationPermissions.Callback) {
            dVar.getClass();
            GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj;
            C0110g c0110g16 = new C0110g(24, obj);
            C0107d c0107d16 = (C0107d) dVar.f17b;
            if (!c0107d16.d(callback)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d16.b(callback))), new B0.g(26, c0110g16));
            }
        } else if (obj instanceof HttpAuthHandler) {
            dVar.getClass();
            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj;
            C0110g c0110g17 = new C0110g(1, obj);
            C0107d c0107d17 = (C0107d) dVar.f17b;
            if (!c0107d17.d(httpAuthHandler)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d17.b(httpAuthHandler))), new B0.g(27, c0110g17));
            }
        } else if (obj instanceof Message) {
            dVar.getClass();
            Message message2 = (Message) obj;
            C0110g c0110g18 = new C0110g(2, obj);
            C0107d c0107d18 = (C0107d) dVar.f17b;
            if (!c0107d18.d(message2)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d18.b(message2))), new B0.g(17, c0110g18));
            }
        } else if (obj instanceof ClientCertRequest) {
            dVar.getClass();
            ClientCertRequest clientCertRequest = (ClientCertRequest) obj;
            C0110g c0110g19 = new C0110g(3, obj);
            C0107d c0107d19 = (C0107d) dVar.f17b;
            if (!c0107d19.d(clientCertRequest)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d19.b(clientCertRequest))), new B0.g(19, c0110g19));
            }
        } else if (obj instanceof PrivateKey) {
            dVar.getClass();
            PrivateKey privateKey = (PrivateKey) obj;
            C0110g c0110g20 = new C0110g(4, obj);
            C0107d c0107d20 = (C0107d) dVar.f17b;
            if (!c0107d20.d(privateKey)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d20.b(privateKey))), new E(0, c0110g20));
            }
        } else if (obj instanceof X509Certificate) {
            dVar.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            C0110g c0110g21 = new C0110g(5, obj);
            C0107d c0107d21 = (C0107d) dVar.f17b;
            if (!c0107d21.d(x509Certificate)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d21.b(x509Certificate))), new E(17, c0110g21));
            }
        } else if (obj instanceof SslErrorHandler) {
            dVar.getClass();
            SslErrorHandler sslErrorHandler = (SslErrorHandler) obj;
            C0110g c0110g22 = new C0110g(6, obj);
            C0107d c0107d22 = (C0107d) dVar.f17b;
            if (!c0107d22.d(sslErrorHandler)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d22.b(sslErrorHandler))), new E(5, c0110g22));
            }
        } else if (obj instanceof SslError) {
            dVar.getClass();
            SslError sslError = (SslError) obj;
            C0110g c0110g23 = new C0110g(7, obj);
            C0107d c0107d23 = (C0107d) dVar.f17b;
            if (!c0107d23.d(sslError)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance", dVar.a(), (K0.j) null).h(c2.f.L(Long.valueOf(c0107d23.b(sslError)), sslError.getCertificate(), sslError.getUrl()), new E(3, c0110g23));
            }
        } else if (obj instanceof SslCertificate.DName) {
            dVar.getClass();
            SslCertificate.DName dName = (SslCertificate.DName) obj;
            C0110g c0110g24 = new C0110g(8, obj);
            C0107d c0107d24 = (C0107d) dVar.f17b;
            if (!c0107d24.d(dName)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d24.b(dName))), new E(2, c0110g24));
            }
        } else if (obj instanceof SslCertificate) {
            dVar.getClass();
            SslCertificate sslCertificate = (SslCertificate) obj;
            C0110g c0110g25 = new C0110g(9, obj);
            C0107d c0107d25 = (C0107d) dVar.f17b;
            if (!c0107d25.d(sslCertificate)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d25.b(sslCertificate))), new E(1, c0110g25));
            }
        } else if (obj instanceof Certificate) {
            dVar.getClass();
            Certificate certificate = (Certificate) obj;
            C0110g c0110g26 = new C0110g(10, obj);
            C0107d c0107d26 = (C0107d) dVar.f17b;
            if (!c0107d26.d(certificate)) {
                new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance", dVar.a(), (K0.j) null).h(AbstractC0129a.r(Long.valueOf(c0107d26.b(certificate))), new B0.g(18, c0110g26));
            }
        }
        if (!((C0107d) dVar.f17b).d(obj)) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass().getName() + "'");
        }
        stream.write(128);
        C0107d c0107d27 = (C0107d) dVar.f17b;
        c0107d27.f();
        Long l3 = (Long) c0107d27.f1830b.get(new C0106c(obj));
        if (l3 != null) {
            c0107d27.f1832d.put(l3, obj);
        }
        writeValue(stream, l3);
    }
}

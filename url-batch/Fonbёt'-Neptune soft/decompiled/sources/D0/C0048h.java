package D0;

import A.C0002c;
import I.C0079n;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
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
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import w0.InterfaceC0320f;

/* renamed from: D0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048h extends C0042b {

    /* renamed from: d, reason: collision with root package name */
    public final O f359d;

    public C0048h(O o2) {
        Q0.h.e(o2, "registrar");
        this.f359d = o2;
    }

    @Override // D0.C0042b, w0.o
    public final Object f(byte b2, ByteBuffer byteBuffer) {
        Q0.h.e(byteBuffer, "buffer");
        if (b2 != Byte.MIN_VALUE) {
            return super.f(b2, byteBuffer);
        }
        Object e2 = e(byteBuffer);
        Q0.h.c(e2, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) e2).longValue();
        Object e3 = ((C0044d) this.f359d.f261c).e(longValue);
        if (e3 == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + longValue);
        }
        return e3;
    }

    @Override // D0.C0042b, w0.o
    public final void k(w0.n nVar, Object obj) {
        String str;
        int errorCode;
        CharSequence description;
        int errorCode2;
        CharSequence description2;
        Boolean bool;
        boolean isRedirect;
        int i2 = 24;
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof r) || (obj instanceof EnumC0051k) || (obj instanceof EnumC0064y) || (obj instanceof S) || (obj instanceof EnumC0063x) || obj == null) {
            super.k(nVar, obj);
            return;
        }
        boolean z2 = obj instanceof WebResourceRequest;
        Object obj2 = null;
        O o2 = this.f359d;
        if (z2) {
            o2.getClass();
            WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
            C0044d c0044d = (C0044d) o2.f261c;
            if (!c0044d.d(webResourceRequest)) {
                long b2 = c0044d.b(webResourceRequest);
                String uri = webResourceRequest.getUrl().toString();
                boolean isForMainFrame = webResourceRequest.isForMainFrame();
                if (Build.VERSION.SDK_INT >= 24) {
                    isRedirect = webResourceRequest.isRedirect();
                    bool = Boolean.valueOf(isRedirect);
                } else {
                    bool = null;
                }
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance", o2.a(), obj2).h(G0.e.O(Long.valueOf(b2), uri, Boolean.valueOf(isForMainFrame), bool, Boolean.valueOf(webResourceRequest.hasGesture()), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders() == null ? Collections.emptyMap() : webResourceRequest.getRequestHeaders()), new H(9));
            }
        } else if (obj instanceof WebResourceResponse) {
            o2.getClass();
            WebResourceResponse webResourceResponse = (WebResourceResponse) obj;
            C0044d c0044d2 = (C0044d) o2.f261c;
            if (!c0044d2.d(webResourceResponse)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance", o2.a(), obj2).h(G0.e.O(Long.valueOf(c0044d2.b(webResourceResponse)), Long.valueOf(webResourceResponse.getStatusCode())), new H(10));
            }
        } else if (Build.VERSION.SDK_INT >= 23 && B.c.x(obj)) {
            o2.getClass();
            WebResourceError m2 = B.c.m(obj);
            Q0.h.e(m2, "pigeon_instanceArg");
            C0044d c0044d3 = (C0044d) o2.f261c;
            if (!c0044d3.d(m2)) {
                long b3 = c0044d3.b(m2);
                errorCode2 = m2.getErrorCode();
                description2 = m2.getDescription();
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance", o2.a(), obj2).h(G0.e.O(Long.valueOf(b3), Long.valueOf(errorCode2), description2.toString()), new H(7));
            }
        } else if (obj instanceof V.h) {
            o2.getClass();
            V.h hVar = (V.h) obj;
            C0044d c0044d4 = (C0044d) o2.f261c;
            if (!c0044d4.d(hVar)) {
                long b4 = c0044d4.b(hVar);
                V.b bVar = V.l.f1107b;
                if (bVar.a()) {
                    if (hVar.f1102a == null) {
                        hVar.f1102a = B.c.m(((WebkitToCompatConverterBoundaryInterface) V.m.f1111a.f78f).convertWebResourceError(Proxy.getInvocationHandler(hVar.f1103b)));
                    }
                    errorCode = hVar.f1102a.getErrorCode();
                } else {
                    if (!bVar.b()) {
                        throw V.l.a();
                    }
                    if (hVar.f1103b == null) {
                        hVar.f1103b = (WebResourceErrorBoundaryInterface) i1.a.a(WebResourceErrorBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) V.m.f1111a.f78f).convertWebResourceError(hVar.f1102a));
                    }
                    errorCode = hVar.f1103b.getErrorCode();
                }
                long j2 = errorCode;
                V.b bVar2 = V.l.f1106a;
                if (bVar2.a()) {
                    if (hVar.f1102a == null) {
                        hVar.f1102a = B.c.m(((WebkitToCompatConverterBoundaryInterface) V.m.f1111a.f78f).convertWebResourceError(Proxy.getInvocationHandler(hVar.f1103b)));
                    }
                    description = hVar.f1102a.getDescription();
                } else {
                    if (!bVar2.b()) {
                        throw V.l.a();
                    }
                    if (hVar.f1103b == null) {
                        hVar.f1103b = (WebResourceErrorBoundaryInterface) i1.a.a(WebResourceErrorBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) V.m.f1111a.f78f).convertWebResourceError(hVar.f1102a));
                    }
                    description = hVar.f1103b.getDescription();
                }
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance", o2.a(), obj2).h(G0.e.O(Long.valueOf(b4), Long.valueOf(j2), description.toString()), new H(8));
            }
        } else if (obj instanceof j0) {
            o2.getClass();
            j0 j0Var = (j0) obj;
            C0044d c0044d5 = (C0044d) o2.f261c;
            if (!c0044d5.d(j0Var)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance", o2.a(), obj2).h(G0.e.O(Long.valueOf(c0044d5.b(j0Var)), Long.valueOf(j0Var.f367a), Long.valueOf(j0Var.f368b)), new H(21));
            }
        } else if (obj instanceof ConsoleMessage) {
            o2.getClass();
            ConsoleMessage consoleMessage = (ConsoleMessage) obj;
            C0044d c0044d6 = (C0044d) o2.f261c;
            if (!c0044d6.d(consoleMessage)) {
                long b5 = c0044d6.b(consoleMessage);
                long lineNumber = consoleMessage.lineNumber();
                String message = consoleMessage.message();
                int i3 = AbstractC0052l.f382a[consoleMessage.messageLevel().ordinal()];
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance", o2.a(), obj2).h(G0.e.O(Long.valueOf(b5), Long.valueOf(lineNumber), message, i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? EnumC0051k.f374k : EnumC0051k.f369f : EnumC0051k.f370g : EnumC0051k.f373j : EnumC0051k.f371h : EnumC0051k.f372i, consoleMessage.sourceId()), new C0002c(7));
            }
        } else if (obj instanceof CookieManager) {
            o2.getClass();
            CookieManager cookieManager = (CookieManager) obj;
            C0044d c0044d7 = (C0044d) o2.f261c;
            if (!c0044d7.d(cookieManager)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d7.b(cookieManager))), new C0002c(8));
            }
        } else if (obj instanceof WebView) {
            o2.getClass();
            WebView webView = (WebView) obj;
            C0044d c0044d8 = (C0044d) o2.f261c;
            if (!c0044d8.d(webView)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d8.b(webView))), new H(15));
            }
        } else if (obj instanceof WebSettings) {
            o2.getClass();
            WebSettings webSettings = (WebSettings) obj;
            C0044d c0044d9 = (C0044d) o2.f261c;
            if (!c0044d9.d(webSettings)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d9.b(webSettings))), new H(11));
            }
        } else if (obj instanceof C0062w) {
            o2.getClass();
            if (!((C0044d) o2.f261c).d((C0062w) obj)) {
                str = "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method.";
                A0.b.j("new-instance-error", str, "");
            }
        } else if (obj instanceof WebViewClient) {
            o2.getClass();
            WebViewClient webViewClient = (WebViewClient) obj;
            C0044d c0044d10 = (C0044d) o2.f261c;
            if (!c0044d10.d(webViewClient)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d10.b(webViewClient))), new H(17));
            }
        } else if (obj instanceof DownloadListener) {
            o2.getClass();
            if (!((C0044d) o2.f261c).d((DownloadListener) obj)) {
                str = "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method.";
                A0.b.j("new-instance-error", str, "");
            }
        } else if (obj instanceof X) {
            o2.getClass();
            if (!((C0044d) o2.f261c).d((X) obj)) {
                str = "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.";
                A0.b.j("new-instance-error", str, "");
            }
        } else if (obj instanceof C0058s) {
            o2.getClass();
            C0058s c0058s = (C0058s) obj;
            C0044d c0044d11 = (C0044d) o2.f261c;
            if (!c0044d11.d(c0058s)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d11.b(c0058s))), new C0002c(13));
            }
        } else if (obj instanceof WebStorage) {
            o2.getClass();
            WebStorage webStorage = (WebStorage) obj;
            C0044d c0044d12 = (C0044d) o2.f261c;
            if (!c0044d12.d(webStorage)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d12.b(webStorage))), new H(13));
            }
        } else if (obj instanceof WebChromeClient.FileChooserParams) {
            o2.getClass();
            WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj;
            C0044d c0044d13 = (C0044d) o2.f261c;
            if (!c0044d13.d(fileChooserParams)) {
                long b6 = c0044d13.b(fileChooserParams);
                boolean isCaptureEnabled = fileChooserParams.isCaptureEnabled();
                List asList = Arrays.asList(fileChooserParams.getAcceptTypes());
                int mode = fileChooserParams.getMode();
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", o2.a(), obj2).h(G0.e.O(Long.valueOf(b6), Boolean.valueOf(isCaptureEnabled), asList, mode != 0 ? mode != 1 ? mode != 3 ? r.f403i : r.f402h : r.f401g : r.f400f, fileChooserParams.getFilenameHint()), new C0002c(12));
            }
        } else if (obj instanceof PermissionRequest) {
            o2.getClass();
            PermissionRequest permissionRequest = (PermissionRequest) obj;
            C0044d c0044d14 = (C0044d) o2.f261c;
            if (!c0044d14.d(permissionRequest)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance", o2.a(), obj2).h(G0.e.O(Long.valueOf(c0044d14.b(permissionRequest)), Arrays.asList(permissionRequest.getResources())), new C0002c(18));
            }
        } else if (obj instanceof WebChromeClient.CustomViewCallback) {
            o2.getClass();
            WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) obj;
            C0044d c0044d15 = (C0044d) o2.f261c;
            if (!c0044d15.d(customViewCallback)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d15.b(customViewCallback))), new C0002c(9));
            }
        } else if (obj instanceof View) {
            o2.getClass();
            View view = (View) obj;
            C0044d c0044d16 = (C0044d) o2.f261c;
            if (!c0044d16.d(view)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d16.b(view))), new C0002c(29));
            }
        } else if (obj instanceof GeolocationPermissions.Callback) {
            o2.getClass();
            GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj;
            C0044d c0044d17 = (C0044d) o2.f261c;
            if (!c0044d17.d(callback)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d17.b(callback))), new C0002c(14));
            }
        } else if (obj instanceof HttpAuthHandler) {
            o2.getClass();
            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj;
            C0044d c0044d18 = (C0044d) o2.f261c;
            if (!c0044d18.d(httpAuthHandler)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d18.b(httpAuthHandler))), new C0002c(16));
            }
        } else if (obj instanceof Message) {
            o2.getClass();
            Message message2 = (Message) obj;
            C0044d c0044d19 = (C0044d) o2.f261c;
            if (!c0044d19.d(message2)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d19.b(message2))), new C0002c(2));
            }
        } else if (obj instanceof ClientCertRequest) {
            o2.getClass();
            ClientCertRequest clientCertRequest = (ClientCertRequest) obj;
            C0044d c0044d20 = (C0044d) o2.f261c;
            if (!c0044d20.d(clientCertRequest)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d20.b(clientCertRequest))), new C0002c(6));
            }
        } else if (obj instanceof PrivateKey) {
            o2.getClass();
            PrivateKey privateKey = (PrivateKey) obj;
            C0044d c0044d21 = (C0044d) o2.f261c;
            if (!c0044d21.d(privateKey)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d21.b(privateKey))), new C0002c(21));
            }
        } else if (obj instanceof X509Certificate) {
            o2.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            C0044d c0044d22 = (C0044d) o2.f261c;
            if (!c0044d22.d(x509Certificate)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d22.b(x509Certificate))), new H(22));
            }
        } else if (obj instanceof SslErrorHandler) {
            o2.getClass();
            SslErrorHandler sslErrorHandler = (SslErrorHandler) obj;
            C0044d c0044d23 = (C0044d) o2.f261c;
            if (!c0044d23.d(sslErrorHandler)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d23.b(sslErrorHandler))), new C0002c(26));
            }
        } else if (obj instanceof SslError) {
            o2.getClass();
            SslError sslError = (SslError) obj;
            C0044d c0044d24 = (C0044d) o2.f261c;
            if (!c0044d24.d(sslError)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance", o2.a(), obj2).h(G0.e.O(Long.valueOf(c0044d24.b(sslError)), sslError.getCertificate(), sslError.getUrl()), new C0002c(i2));
            }
        } else if (obj instanceof SslCertificate.DName) {
            o2.getClass();
            SslCertificate.DName dName = (SslCertificate.DName) obj;
            C0044d c0044d25 = (C0044d) o2.f261c;
            if (!c0044d25.d(dName)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d25.b(dName))), new C0002c(23));
            }
        } else if (obj instanceof SslCertificate) {
            o2.getClass();
            SslCertificate sslCertificate = (SslCertificate) obj;
            C0044d c0044d26 = (C0044d) o2.f261c;
            if (!c0044d26.d(sslCertificate)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d26.b(sslCertificate))), new C0002c(22));
            }
        } else if (obj instanceof Certificate) {
            o2.getClass();
            Certificate certificate = (Certificate) obj;
            C0044d c0044d27 = (C0044d) o2.f261c;
            if (!c0044d27.d(certificate)) {
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance", o2.a(), obj2).h(i1.a.u(Long.valueOf(c0044d27.b(certificate))), new C0002c(4));
            }
        }
        if (!((C0044d) o2.f261c).d(obj)) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass().getName() + "'");
        }
        nVar.write(128);
        C0044d c0044d28 = (C0044d) o2.f261c;
        c0044d28.f();
        Long l2 = (Long) c0044d28.f327b.get(obj);
        if (l2 != null) {
            c0044d28.f329d.put(l2, obj);
        }
        k(nVar, l2);
    }
}

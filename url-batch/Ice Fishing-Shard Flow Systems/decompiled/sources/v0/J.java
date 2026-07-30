package v0;

import android.content.Context;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.WebView;
import com.appsflyer.attribution.RequestError;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.net.URLConnection;
import java.util.WeakHashMap;
import java.util.zip.GZIPInputStream;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import u0.AbstractC0941A;

/* loaded from: classes.dex */
public final class J implements WebViewRendererClientBoundaryInterface, WebMessageCallbackBoundaryInterface, WebMessageListenerBoundaryInterface, I {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f8178c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8179a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8180b;

    public /* synthetic */ J(int i2) {
        this.f8179a = i2;
    }

    public static String b(File file) {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005d, code lost:
    
        if (r5.equals("mhtml") == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(String str) {
        String str2 = null;
        if (str != null) {
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
            if (guessContentTypeFromName == null) {
                char c7 = '.';
                int lastIndexOf = str.lastIndexOf(46);
                if (lastIndexOf != -1) {
                    String lowerCase = str.substring(lastIndexOf + 1).toLowerCase();
                    lowerCase.getClass();
                    switch (lowerCase.hashCode()) {
                        case 3315:
                            if (lowerCase.equals("gz")) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3401:
                            if (lowerCase.equals("js")) {
                                c7 = 1;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 97669:
                            if (lowerCase.equals("bmp")) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 98819:
                            if (lowerCase.equals("css")) {
                                c7 = 3;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 102340:
                            if (lowerCase.equals("gif")) {
                                c7 = 4;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 103649:
                            if (lowerCase.equals("htm")) {
                                c7 = 5;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 104085:
                            if (lowerCase.equals("ico")) {
                                c7 = 6;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 105441:
                            if (lowerCase.equals("jpg")) {
                                c7 = 7;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 106458:
                            if (lowerCase.equals("m4a")) {
                                c7 = '\b';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 106479:
                            if (lowerCase.equals("m4v")) {
                                c7 = '\t';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 108089:
                            if (lowerCase.equals("mht")) {
                                c7 = '\n';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 108150:
                            if (lowerCase.equals("mjs")) {
                                c7 = 11;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 108272:
                            if (lowerCase.equals("mp3")) {
                                c7 = '\f';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 108273:
                            if (lowerCase.equals("mp4")) {
                                c7 = '\r';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 108324:
                            if (lowerCase.equals("mpg")) {
                                c7 = 14;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 109961:
                            if (lowerCase.equals("oga")) {
                                c7 = 15;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 109967:
                            if (lowerCase.equals("ogg")) {
                                c7 = 16;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 109973:
                            if (lowerCase.equals("ogm")) {
                                c7 = 17;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 109982:
                            if (lowerCase.equals("ogv")) {
                                c7 = 18;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 110834:
                            if (lowerCase.equals("pdf")) {
                                c7 = 19;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 111030:
                            if (lowerCase.equals("pjp")) {
                                c7 = 20;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 111145:
                            if (lowerCase.equals("png")) {
                                c7 = 21;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 114276:
                            if (lowerCase.equals("svg")) {
                                c7 = 22;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 114791:
                            if (lowerCase.equals("tgz")) {
                                c7 = 23;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 114833:
                            if (lowerCase.equals("tif")) {
                                c7 = 24;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 117484:
                            if (lowerCase.equals("wav")) {
                                c7 = 25;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 118660:
                            if (lowerCase.equals("xht")) {
                                c7 = 26;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 118807:
                            if (lowerCase.equals("xml")) {
                                c7 = 27;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 120609:
                            if (lowerCase.equals("zip")) {
                                c7 = 28;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3000872:
                            if (lowerCase.equals("apng")) {
                                c7 = 29;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3145576:
                            if (lowerCase.equals("flac")) {
                                c7 = 30;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3213227:
                            if (lowerCase.equals(com.onesignal.inAppMessages.internal.d.HTML)) {
                                c7 = 31;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3259225:
                            if (lowerCase.equals("jfif")) {
                                c7 = ' ';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3268712:
                            if (lowerCase.equals("jpeg")) {
                                c7 = '!';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3271912:
                            if (lowerCase.equals("json")) {
                                c7 = '\"';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3358085:
                            if (lowerCase.equals("mpeg")) {
                                c7 = '#';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3418175:
                            if (lowerCase.equals("opus")) {
                                c7 = '$';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3529614:
                            if (lowerCase.equals("shtm")) {
                                c7 = '%';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3542678:
                            if (lowerCase.equals("svgz")) {
                                c7 = '&';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3559925:
                            if (lowerCase.equals("tiff")) {
                                c7 = '\'';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3642020:
                            if (lowerCase.equals("wasm")) {
                                c7 = '(';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3645337:
                            if (lowerCase.equals("webm")) {
                                c7 = ')';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3645340:
                            if (lowerCase.equals("webp")) {
                                c7 = '*';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3655064:
                            if (lowerCase.equals("woff")) {
                                c7 = '+';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3678569:
                            if (lowerCase.equals("xhtm")) {
                                c7 = ',';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 96488848:
                            if (lowerCase.equals("ehtml")) {
                                c7 = '-';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 103877016:
                            break;
                        case 106703064:
                            if (lowerCase.equals("pjpeg")) {
                                c7 = '/';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 109418142:
                            if (lowerCase.equals("shtml")) {
                                c7 = '0';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 114035747:
                            if (lowerCase.equals("xhtml")) {
                                c7 = '1';
                                break;
                            }
                            c7 = 65535;
                            break;
                        default:
                            c7 = 65535;
                            break;
                    }
                    switch (c7) {
                        case 0:
                        case 23:
                            str2 = "application/gzip";
                            break;
                        case 1:
                        case RequestError.STOP_TRACKING /* 11 */:
                            str2 = "text/javascript";
                            break;
                        case 2:
                            str2 = "image/bmp";
                            break;
                        case 3:
                            str2 = "text/css";
                            break;
                        case 4:
                            str2 = "image/gif";
                            break;
                        case 5:
                        case 31:
                        case '%':
                        case '-':
                        case '0':
                            str2 = "text/html";
                            break;
                        case 6:
                            str2 = "image/x-icon";
                            break;
                        case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        case 20:
                        case ' ':
                        case '!':
                        case '/':
                            str2 = "image/jpeg";
                            break;
                        case S.j.BYTES_FIELD_NUMBER /* 8 */:
                            str2 = "audio/x-m4a";
                            break;
                        case '\t':
                        case '\r':
                            str2 = "video/mp4";
                            break;
                        case '\n':
                        case '.':
                            str2 = "multipart/related";
                            break;
                        case '\f':
                            str2 = "audio/mpeg";
                            break;
                        case 14:
                        case '#':
                            str2 = "video/mpeg";
                            break;
                        case 15:
                        case 16:
                        case '$':
                            str2 = "audio/ogg";
                            break;
                        case 17:
                        case 18:
                            str2 = "video/ogg";
                            break;
                        case 19:
                            str2 = "application/pdf";
                            break;
                        case 21:
                            str2 = "image/png";
                            break;
                        case 22:
                        case '&':
                            str2 = "image/svg+xml";
                            break;
                        case 24:
                        case '\'':
                            str2 = "image/tiff";
                            break;
                        case 25:
                            str2 = "audio/wav";
                            break;
                        case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
                        case ',':
                        case '1':
                            str2 = "application/xhtml+xml";
                            break;
                        case 27:
                            str2 = "text/xml";
                            break;
                        case 28:
                            str2 = "application/zip";
                            break;
                        case 29:
                            str2 = "image/apng";
                            break;
                        case 30:
                            str2 = "audio/flac";
                            break;
                        case '\"':
                            str2 = "application/json";
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
                            str2 = "application/wasm";
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            str2 = "video/webm";
                            break;
                        case '*':
                            str2 = "image/webp";
                            break;
                        case '+':
                            str2 = "application/font-woff";
                            break;
                    }
                }
            } else {
                str2 = guessContentTypeFromName;
            }
        }
        return str2 == null ? "text/plain" : str2;
    }

    @Override // v0.I
    public String[] a() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f8180b).getSupportedFeatures();
    }

    @Override // v0.I
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) V6.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f8180b).createWebView(webView));
    }

    public InputStream d(String str) {
        Context context = (Context) this.f8180b;
        if (str.length() > 1 && str.charAt(0) == '/') {
            str = str.substring(1);
        }
        String[] split = str.split("/", -1);
        if (split.length != 2) {
            throw new IllegalArgumentException("Incorrect resource path: ".concat(str));
        }
        String str2 = split[0];
        String str3 = split[1];
        int lastIndexOf = str3.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str3 = str3.substring(0, lastIndexOf);
        }
        int identifier = context.getResources().getIdentifier(str3, str2, context.getPackageName());
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(identifier, typedValue, true);
        int i2 = typedValue.type;
        if (i2 != 3) {
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", str, Integer.valueOf(i2)));
        }
        InputStream openRawResource = context.getResources().openRawResource(identifier);
        return str.endsWith(".svgz") ? new GZIPInputStream(openRawResource) : openRawResource;
    }

    @Override // v0.I
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) V6.b.a(ProxyControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f8180b).getProxyController());
    }

    @Override // v0.I
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) V6.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f8180b).getStatics());
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        switch (this.f8179a) {
            case 0:
                return f8178c;
            case 1:
            default:
                return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
            case 2:
                return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
        }
    }

    @Override // v0.I
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) V6.b.a(TracingControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f8180b).getTracingController());
    }

    @Override // v0.I
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) V6.b.a(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f8180b).getWebkitToCompatConverter());
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        u0.n a7 = z.a((WebMessageBoundaryInterface) V6.b.a(WebMessageBoundaryInterface.class, invocationHandler2));
        if (a7 != null) {
            ((u0.o) this.f8180b).onMessage(new B(invocationHandler), a7);
        }
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z7, InvocationHandler invocationHandler2) {
        u0.n a7 = z.a((WebMessageBoundaryInterface) V6.b.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (a7 != null) {
            JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) V6.b.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            ((u0.x) this.f8180b).onPostMessage(webView, a7, uri, z7, (r) jsReplyProxyBoundaryInterface.getOrCreatePeer(new q(jsReplyProxyBoundaryInterface, 0)));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        WeakHashMap weakHashMap = L.f8182c;
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) V6.b.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        ((AbstractC0941A) this.f8180b).onRenderProcessResponsive(webView, (L) webViewRendererBoundaryInterface.getOrCreatePeer(new q(webViewRendererBoundaryInterface, 1)));
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        WeakHashMap weakHashMap = L.f8182c;
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) V6.b.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        ((AbstractC0941A) this.f8180b).onRenderProcessUnresponsive(webView, (L) webViewRendererBoundaryInterface.getOrCreatePeer(new q(webViewRendererBoundaryInterface, 1)));
    }

    public /* synthetic */ J(int i2, Object obj) {
        this.f8179a = i2;
        this.f8180b = obj;
    }
}

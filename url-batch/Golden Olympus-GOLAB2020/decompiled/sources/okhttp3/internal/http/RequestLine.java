package okhttp3.internal.http;

import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Request;

@Metadata
/* loaded from: classes3.dex */
public final class RequestLine {

    /* renamed from: a, reason: collision with root package name */
    public static final RequestLine f42851a = new RequestLine();

    private RequestLine() {
    }

    private final boolean b(Request request, Proxy.Type type) {
        return !request.g() && type == Proxy.Type.HTTP;
    }

    public final String a(Request request, Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.h());
        sb.append(' ');
        RequestLine requestLine = f42851a;
        if (requestLine.b(request, proxyType)) {
            sb.append(request.j());
        } else {
            sb.append(requestLine.c(request.j()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String c(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String d4 = url.d();
        String f4 = url.f();
        if (f4 == null) {
            return d4;
        }
        return d4 + '?' + f4;
    }
}

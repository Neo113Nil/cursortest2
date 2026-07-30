package okhttp3.internal.http;

import com.baidu.mapapi.http.wrapper.HttpManager;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String method) {
        s.checkNotNullParameter(method, "method");
        return (s.areEqual(method, HttpManager.HTTP_GET) || s.areEqual(method, "HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String method) {
        s.checkNotNullParameter(method, "method");
        return s.areEqual(method, HttpManager.HTTP_POST) || s.areEqual(method, HttpManager.HTTP_PUT) || s.areEqual(method, "PATCH") || s.areEqual(method, "PROPPATCH") || s.areEqual(method, "REPORT");
    }

    public final boolean invalidatesCache(String method) {
        s.checkNotNullParameter(method, "method");
        return s.areEqual(method, HttpManager.HTTP_POST) || s.areEqual(method, "PATCH") || s.areEqual(method, HttpManager.HTTP_PUT) || s.areEqual(method, HttpManager.HTTP_DELETE) || s.areEqual(method, "MOVE");
    }

    public final boolean redirectsToGet(String method) {
        s.checkNotNullParameter(method, "method");
        return !s.areEqual(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(String method) {
        s.checkNotNullParameter(method, "method");
        return s.areEqual(method, "PROPFIND");
    }
}

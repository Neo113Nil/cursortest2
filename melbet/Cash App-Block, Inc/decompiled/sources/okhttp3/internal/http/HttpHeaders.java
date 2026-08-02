package okhttp3.internal.http;

import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public abstract class HttpHeaders {
    static {
        ByteString.Companion companion = ByteString.Companion;
        ByteString.Companion.encodeUtf8("\"\\");
        ByteString.Companion.encodeUtf8("\t ,=");
    }

    public static final boolean promisesBody(Response response) {
        if (Intrinsics.areEqual(response.request.method, "HEAD")) {
            return false;
        }
        int i = response.code;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || _UtilJvmKt.headersContentLength(response) != -1) {
            return true;
        }
        String str = response.headers.get("Transfer-Encoding");
        if (str == null) {
            str = null;
        }
        return "chunked".equalsIgnoreCase(str);
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        cookieJar.getClass();
        httpUrl.getClass();
        headers.getClass();
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        Pattern pattern = Cookie.YEAR_PATTERN;
        List parseAll = Cookie.Companion.parseAll(httpUrl, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, parseAll);
    }
}

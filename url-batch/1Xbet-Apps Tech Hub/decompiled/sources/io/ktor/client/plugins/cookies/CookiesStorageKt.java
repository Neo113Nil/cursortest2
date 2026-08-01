package io.ktor.client.plugins.cookies;

import io.ktor.http.Cookie;
import io.ktor.http.IpParserKt;
import io.ktor.http.URLProtocolKt;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.util.TextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CookiesStorage.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0014\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"addCookie", "", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "urlString", "", "cookie", "Lio/ktor/http/Cookie;", "(Lio/ktor/client/plugins/cookies/CookiesStorage;Ljava/lang/String;Lio/ktor/http/Cookie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fillDefaults", "requestUrl", "Lio/ktor/http/Url;", "matches", "", "ktor-client-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CookiesStorageKt {
    public static final Object addCookie(CookiesStorage cookiesStorage, String str, Cookie cookie, Continuation<? super Unit> continuation) {
        Object addCookie = cookiesStorage.addCookie(URLUtilsKt.Url(str), cookie, continuation);
        return addCookie == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? addCookie : Unit.INSTANCE;
    }

    public static final boolean matches(Cookie cookie, Url requestUrl) {
        String lowerCasePreservingASCIIRules;
        String trimStart;
        Intrinsics.checkNotNullParameter(cookie, "<this>");
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        String domain = cookie.getDomain();
        if (domain == null || (lowerCasePreservingASCIIRules = TextKt.toLowerCasePreservingASCIIRules(domain)) == null || (trimStart = StringsKt.trimStart(lowerCasePreservingASCIIRules, '.')) == null) {
            throw new IllegalStateException("Domain field should have the default value".toString());
        }
        cookie.getPath();
        String path = cookie.getPath();
        if (path == null) {
            throw new IllegalStateException("Path field should have the default value".toString());
        }
        if (!StringsKt.endsWith$default((CharSequence) path, '/', false, 2, (Object) null)) {
            path = cookie.getPath() + '/';
        }
        String lowerCasePreservingASCIIRules2 = TextKt.toLowerCasePreservingASCIIRules(requestUrl.getHost());
        String encodedPath = requestUrl.getEncodedPath();
        if (!StringsKt.endsWith$default((CharSequence) encodedPath, '/', false, 2, (Object) null)) {
            encodedPath = encodedPath + '/';
        }
        if (!Intrinsics.areEqual(lowerCasePreservingASCIIRules2, trimStart) && (IpParserKt.hostIsIp(lowerCasePreservingASCIIRules2) || !StringsKt.endsWith$default(lowerCasePreservingASCIIRules2, "." + trimStart, false, 2, (Object) null))) {
            return false;
        }
        if (Intrinsics.areEqual(path, "/") || Intrinsics.areEqual(encodedPath, path) || StringsKt.startsWith$default(encodedPath, path, false, 2, (Object) null)) {
            return !cookie.getSecure() || URLProtocolKt.isSecure(requestUrl.getProtocol());
        }
        return false;
    }

    public static final Cookie fillDefaults(Cookie cookie, Url requestUrl) {
        boolean z;
        Cookie copy;
        Cookie copy2;
        Cookie cookie2 = cookie;
        Intrinsics.checkNotNullParameter(cookie2, "<this>");
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        String path = cookie.getPath();
        boolean z2 = true;
        if (path != null && StringsKt.startsWith$default(path, "/", false, 2, (Object) null)) {
            z = false;
        } else {
            z = false;
            copy2 = cookie.copy((r22 & 1) != 0 ? cookie.name : null, (r22 & 2) != 0 ? cookie.value : null, (r22 & 4) != 0 ? cookie.encoding : null, (r22 & 8) != 0 ? cookie.maxAge : 0, (r22 & 16) != 0 ? cookie.expires : null, (r22 & 32) != 0 ? cookie.domain : null, (r22 & 64) != 0 ? cookie.path : requestUrl.getEncodedPath(), (r22 & 128) != 0 ? cookie.secure : false, (r22 & 256) != 0 ? cookie.httpOnly : false, (r22 & 512) != 0 ? cookie.extensions : null);
            cookie2 = copy2;
        }
        String domain = cookie2.getDomain();
        if (domain != null && !StringsKt.isBlank(domain)) {
            z2 = z;
        }
        if (!z2) {
            return cookie2;
        }
        copy = cookie2.copy((r22 & 1) != 0 ? cookie2.name : null, (r22 & 2) != 0 ? cookie2.value : null, (r22 & 4) != 0 ? cookie2.encoding : null, (r22 & 8) != 0 ? cookie2.maxAge : 0, (r22 & 16) != 0 ? cookie2.expires : null, (r22 & 32) != 0 ? cookie2.domain : requestUrl.getHost(), (r22 & 64) != 0 ? cookie2.path : null, (r22 & 128) != 0 ? cookie2.secure : false, (r22 & 256) != 0 ? cookie2.httpOnly : false, (r22 & 512) != 0 ? cookie2.extensions : null);
        return copy;
    }
}

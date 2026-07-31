package okhttp3.internal.http;

import com.ironsource.cc;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okio.m;
import okio.p;

@Metadata
/* loaded from: classes3.dex */
public final class BridgeInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    private final CookieJar f42830a;

    public BridgeInterceptor(CookieJar cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f42830a = cookieJar;
    }

    private final String b(List list) {
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Cookie cookie = (Cookie) obj;
            if (i4 > 0) {
                sb.append("; ");
            }
            sb.append(cookie.e());
            sb.append(cc.f15727T);
            sb.append(cookie.g());
            i4 = i5;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // okhttp3.Interceptor
    public Response a(Interceptor.Chain chain) {
        ResponseBody m4;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request b4 = chain.b();
        Request.Builder i4 = b4.i();
        RequestBody a4 = b4.a();
        if (a4 != null) {
            MediaType b5 = a4.b();
            if (b5 != null) {
                i4.d(cc.f15718K, b5.toString());
            }
            long a5 = a4.a();
            if (a5 != -1) {
                i4.d("Content-Length", String.valueOf(a5));
                i4.h("Transfer-Encoding");
            } else {
                i4.d("Transfer-Encoding", "chunked");
                i4.h("Content-Length");
            }
        }
        boolean z4 = false;
        if (b4.d("Host") == null) {
            i4.d("Host", Util.T(b4.j(), false, 1, null));
        }
        if (b4.d("Connection") == null) {
            i4.d("Connection", "Keep-Alive");
        }
        if (b4.d("Accept-Encoding") == null && b4.d("Range") == null) {
            i4.d("Accept-Encoding", "gzip");
            z4 = true;
        }
        List b6 = this.f42830a.b(b4.j());
        if (!b6.isEmpty()) {
            i4.d("Cookie", b(b6));
        }
        if (b4.d("User-Agent") == null) {
            i4.d("User-Agent", "okhttp/4.12.0");
        }
        Response a6 = chain.a(i4.a());
        HttpHeaders.f(this.f42830a, b4.j(), a6.W());
        Response.Builder r4 = a6.a0().r(b4);
        if (z4 && StringsKt.w("gzip", Response.V(a6, "Content-Encoding", null, 2, null), true) && HttpHeaders.b(a6) && (m4 = a6.m()) != null) {
            m mVar = new m(m4.J());
            r4.k(a6.W().e().g("Content-Encoding").g("Content-Length").d());
            r4.b(new RealResponseBody(Response.V(a6, cc.f15718K, null, 2, null), -1L, p.d(mVar)));
        }
        return r4.c();
    }
}

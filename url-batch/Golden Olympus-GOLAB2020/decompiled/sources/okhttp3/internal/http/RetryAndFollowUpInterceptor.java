package okhttp3.internal.http;

import com.ironsource.cc;
import com.ironsource.jn;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;

@Metadata
/* loaded from: classes3.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f42852b = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final OkHttpClient f42853a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RetryAndFollowUpInterceptor(OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f42853a = client;
    }

    private final Request b(Response response, String str) {
        String V3;
        HttpUrl o4;
        if (!this.f42853a.t() || (V3 = Response.V(response, "Location", null, 2, null)) == null || (o4 = response.e0().j().o(V3)) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(o4.p(), response.e0().j().p()) && !this.f42853a.u()) {
            return null;
        }
        Request.Builder i4 = response.e0().i();
        if (HttpMethod.b(str)) {
            int J3 = response.J();
            HttpMethod httpMethod = HttpMethod.f42838a;
            boolean z4 = httpMethod.d(str) || J3 == 308 || J3 == 307;
            if (!httpMethod.c(str) || J3 == 308 || J3 == 307) {
                i4.f(str, z4 ? response.e0().a() : null);
            } else {
                i4.f(jn.f16864a, null);
            }
            if (!z4) {
                i4.h("Transfer-Encoding");
                i4.h("Content-Length");
                i4.h(cc.f15718K);
            }
        }
        if (!Util.j(response.e0().j(), o4)) {
            i4.h("Authorization");
        }
        return i4.j(o4).a();
    }

    private final Request c(Response response, Exchange exchange) {
        RealConnection h4;
        Route A4 = (exchange == null || (h4 = exchange.h()) == null) ? null : h4.A();
        int J3 = response.J();
        String h5 = response.e0().h();
        if (J3 != 307 && J3 != 308) {
            if (J3 == 401) {
                return this.f42853a.i().a(A4, response);
            }
            if (J3 == 421) {
                RequestBody a4 = response.e0().a();
                if ((a4 != null && a4.e()) || exchange == null || !exchange.l()) {
                    return null;
                }
                exchange.h().y();
                return response.e0();
            }
            if (J3 == 503) {
                Response b02 = response.b0();
                if ((b02 == null || b02.J() != 503) && g(response, Integer.MAX_VALUE) == 0) {
                    return response.e0();
                }
                return null;
            }
            if (J3 == 407) {
                Intrinsics.checkNotNull(A4);
                if (A4.b().type() == Proxy.Type.HTTP) {
                    return this.f42853a.C().a(A4, response);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (J3 == 408) {
                if (!this.f42853a.F()) {
                    return null;
                }
                RequestBody a5 = response.e0().a();
                if (a5 != null && a5.e()) {
                    return null;
                }
                Response b03 = response.b0();
                if ((b03 == null || b03.J() != 408) && g(response, 0) <= 0) {
                    return response.e0();
                }
                return null;
            }
            switch (J3) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(response, h5);
    }

    private final boolean d(IOException iOException, boolean z4) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z4 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean e(IOException iOException, RealCall realCall, Request request, boolean z4) {
        if (this.f42853a.F()) {
            return !(z4 && f(iOException, request)) && d(iOException, z4) && realCall.w();
        }
        return false;
    }

    private final boolean f(IOException iOException, Request request) {
        RequestBody a4 = request.a();
        return (a4 != null && a4.e()) || (iOException instanceof FileNotFoundException);
    }

    private final int g(Response response, int i4) {
        String V3 = Response.V(response, "Retry-After", null, 2, null);
        if (V3 == null) {
            return i4;
        }
        if (!new Regex("\\d+").d(V3)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(V3);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r0 = r0.a0().o(r7.a0().b(null).c()).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        r0 = r1.o();
        r6 = c(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        r0 = r6.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r0.e() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        r1.k(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r0 = r7.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        okhttp3.internal.Util.l(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r8 > 20) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        if (r0.m() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        r1.y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005a, code lost:
    
        r1.k(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return r7;
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response a(Interceptor.Chain chain) {
        Request c4;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request i4 = realInterceptorChain.i();
        RealCall e4 = realInterceptorChain.e();
        List emptyList = CollectionsKt.emptyList();
        int i5 = 0;
        Response response = null;
        while (true) {
            boolean z4 = true;
            while (true) {
                e4.j(i4, z4);
                try {
                    if (e4.r()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        Response a4 = realInterceptorChain.a(i4);
                        break;
                    } catch (IOException e5) {
                        if (!e(e5, e4, i4, !(e5 instanceof ConnectionShutdownException))) {
                            throw Util.a0(e5, emptyList);
                        }
                        emptyList = CollectionsKt.plus((Collection<? extends IOException>) emptyList, e5);
                    } catch (RouteException e6) {
                        if (!e(e6.d(), e4, i4, false)) {
                            throw Util.a0(e6.c(), emptyList);
                        }
                        emptyList = CollectionsKt.plus((Collection<? extends IOException>) emptyList, e6.c());
                    }
                    e4.k(true);
                    z4 = false;
                } catch (Throwable th) {
                    e4.k(true);
                    throw th;
                }
            }
            e4.k(true);
            i4 = c4;
        }
    }
}

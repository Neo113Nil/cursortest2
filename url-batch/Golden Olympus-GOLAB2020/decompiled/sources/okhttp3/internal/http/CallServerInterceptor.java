package okhttp3.internal.http;

import W1.AbstractC1233c;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import okio.f;
import okio.p;

@Metadata
/* loaded from: classes3.dex */
public final class CallServerInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f42831a;

    public CallServerInterceptor(boolean z4) {
        this.f42831a = z4;
    }

    private final boolean b(int i4) {
        if (i4 == 100) {
            return true;
        }
        return 102 <= i4 && i4 < 200;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:64:0x00aa, B:66:0x00b3, B:22:0x00bb, B:24:0x00e5, B:26:0x00ee, B:27:0x00f1, B:28:0x0115, B:32:0x0120, B:33:0x013f, B:35:0x014d, B:43:0x0163, B:45:0x0169, B:48:0x0176, B:50:0x0190, B:51:0x0198, B:52:0x01a2, B:61:0x0158, B:62:0x012f), top: B:63:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0169 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:64:0x00aa, B:66:0x00b3, B:22:0x00bb, B:24:0x00e5, B:26:0x00ee, B:27:0x00f1, B:28:0x0115, B:32:0x0120, B:33:0x013f, B:35:0x014d, B:43:0x0163, B:45:0x0169, B:48:0x0176, B:50:0x0190, B:51:0x0198, B:52:0x01a2, B:61:0x0158, B:62:0x012f), top: B:63:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0176 A[Catch: IOException -> 0x00b8, TryCatch #2 {IOException -> 0x00b8, blocks: (B:64:0x00aa, B:66:0x00b3, B:22:0x00bb, B:24:0x00e5, B:26:0x00ee, B:27:0x00f1, B:28:0x0115, B:32:0x0120, B:33:0x013f, B:35:0x014d, B:43:0x0163, B:45:0x0169, B:48:0x0176, B:50:0x0190, B:51:0x0198, B:52:0x01a2, B:61:0x0158, B:62:0x012f), top: B:63:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response a(Interceptor.Chain chain) {
        boolean z4;
        Response.Builder builder;
        Response.Builder builder2;
        int J3;
        Response c4;
        ResponseBody m4;
        Response.Builder builder3;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange g4 = realInterceptorChain.g();
        Intrinsics.checkNotNull(g4);
        Request i4 = realInterceptorChain.i();
        RequestBody a4 = i4.a();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            g4.w(i4);
            ?? b4 = HttpMethod.b(i4.h());
            try {
                if (b4 == 0 || a4 == null) {
                    g4.p();
                    z4 = true;
                    b4 = 0;
                } else {
                    if (StringsKt.w("100-continue", i4.d("Expect"), true)) {
                        g4.f();
                        Response.Builder r4 = g4.r(true);
                        try {
                            g4.t();
                            z4 = false;
                            builder3 = r4;
                        } catch (IOException e4) {
                            e = e4;
                            z4 = true;
                            builder = r4;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            builder2 = builder;
                            if (!g4.k()) {
                                throw e;
                            }
                            if (builder2 == null) {
                            }
                            Response c5 = builder2.r(i4).i(g4.h().r()).s(currentTimeMillis).q(System.currentTimeMillis()).c();
                            J3 = c5.J();
                            if (b(J3)) {
                            }
                            g4.s(c5);
                            if (this.f42831a) {
                            }
                            if (!StringsKt.w("close", c4.e0().d("Connection"), true)) {
                            }
                            g4.o();
                            if (J3 != 204) {
                            }
                            m4 = c4.m();
                            if ((m4 == null ? m4.o() : -1L) > 0) {
                            }
                            return c4;
                        }
                    } else {
                        z4 = true;
                        builder3 = null;
                    }
                    if (builder3 != null) {
                        g4.p();
                        b4 = builder3;
                        if (!g4.h().v()) {
                            g4.o();
                            b4 = builder3;
                        }
                    } else if (a4.d()) {
                        g4.f();
                        a4.f(p.c(g4.c(i4, true)));
                        b4 = builder3;
                    } else {
                        f c6 = p.c(g4.c(i4, false));
                        a4.f(c6);
                        c6.close();
                        b4 = builder3;
                    }
                }
                if (a4 == null || !a4.d()) {
                    g4.e();
                }
                e = null;
                builder2 = b4;
            } catch (IOException e5) {
                e = e5;
                builder = b4;
            }
        } catch (IOException e6) {
            e = e6;
            z4 = true;
            builder = null;
        }
        if (builder2 == null) {
            try {
                builder2 = g4.r(false);
                Intrinsics.checkNotNull(builder2);
                if (z4) {
                    g4.t();
                    z4 = false;
                }
            } catch (IOException e7) {
                if (e == null) {
                    throw e7;
                }
                AbstractC1233c.a(e, e7);
                throw e;
            }
        }
        Response c52 = builder2.r(i4).i(g4.h().r()).s(currentTimeMillis).q(System.currentTimeMillis()).c();
        J3 = c52.J();
        if (b(J3)) {
            Response.Builder r5 = g4.r(false);
            Intrinsics.checkNotNull(r5);
            if (z4) {
                g4.t();
            }
            c52 = r5.r(i4).i(g4.h().r()).s(currentTimeMillis).q(System.currentTimeMillis()).c();
            J3 = c52.J();
        }
        g4.s(c52);
        c4 = (this.f42831a || J3 != 101) ? c52.a0().b(g4.q(c52)).c() : c52.a0().b(Util.f42591c).c();
        if (!StringsKt.w("close", c4.e0().d("Connection"), true) || StringsKt.w("close", Response.V(c4, "Connection", null, 2, null), true)) {
            g4.o();
        }
        if (J3 != 204 || J3 == 205) {
            m4 = c4.m();
            if ((m4 == null ? m4.o() : -1L) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(J3);
                sb.append(" had non-zero Content-Length: ");
                ResponseBody m5 = c4.m();
                sb.append(m5 != null ? Long.valueOf(m5.o()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return c4;
    }
}

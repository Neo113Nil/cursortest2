package r3;

import A0.q;
import C.F;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import m3.n;
import m3.v;
import m3.w;
import m3.x;
import n.AbstractC0864b;
import q3.g;
import q3.i;
import t3.C1210a;
import y2.C1331f;

/* loaded from: classes.dex */
public final class b implements n {
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r3 < 200) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0106 A[Catch: IOException -> 0x00bf, TRY_ENTER, TryCatch #1 {IOException -> 0x00bf, blocks: (B:10:0x006f, B:13:0x00a0, B:14:0x00c2, B:16:0x00e9, B:26:0x0106, B:29:0x0113, B:31:0x0124, B:32:0x012e, B:33:0x0138, B:37:0x00f3), top: B:9:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0113 A[Catch: IOException -> 0x00bf, TryCatch #1 {IOException -> 0x00bf, blocks: (B:10:0x006f, B:13:0x00a0, B:14:0x00c2, B:16:0x00e9, B:26:0x0106, B:29:0x0113, B:31:0x0124, B:32:0x012e, B:33:0x0138, B:37:0x00f3), top: B:9:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    @Override // m3.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w a(f chain) {
        w a4;
        x xVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        F f4 = chain.f9868d;
        Intrinsics.c(f4);
        d dVar = (d) f4.f1054d;
        g call = (g) f4.f1052b;
        i iVar = (i) f4.f1055e;
        q request = chain.f9869e;
        request.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        IOException iOException = null;
        try {
            Intrinsics.checkNotNullParameter(request, "request");
        } catch (IOException e4) {
            if (e4 instanceof C1210a) {
                throw e4;
            }
            if (!f4.f1051a) {
                throw e4;
            }
            iOException = e4;
        }
        try {
            Intrinsics.checkNotNullParameter(call, "call");
            dVar.a(request);
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(request, "request");
            AbstractC0864b.A((String) request.f363d);
            call.f(f4, true, false, null);
            try {
                dVar.d();
                try {
                    v g4 = f4.g(false);
                    Intrinsics.c(g4);
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(request, "request");
                    g4.f8460a = request;
                    g4.f8464e = iVar.f9407e;
                    g4.f8470k = currentTimeMillis;
                    g4.f8471l = System.currentTimeMillis();
                    w response = g4.a();
                    int i2 = response.f8476j;
                    if (i2 != 100) {
                        if (102 <= i2) {
                        }
                        Intrinsics.checkNotNullParameter(response, "response");
                        Intrinsics.checkNotNullParameter(call, "call");
                        Intrinsics.checkNotNullParameter(response, "response");
                        v b4 = response.b();
                        b4.f8466g = f4.d(response);
                        a4 = b4.a();
                        if (!"close".equalsIgnoreCase(a4.f8473d.i("Connection")) || "close".equalsIgnoreCase(w.a("Connection", a4))) {
                            dVar.h().k();
                        }
                        if (i2 != 204 || i2 == 205) {
                            xVar = a4.f8479m;
                            if ((xVar == null ? xVar.a() : -1L) > 0) {
                                StringBuilder sb = new StringBuilder("HTTP ");
                                sb.append(i2);
                                sb.append(" had non-zero Content-Length: ");
                                sb.append(xVar != null ? Long.valueOf(xVar.a()) : null);
                                throw new ProtocolException(sb.toString());
                            }
                        }
                        return a4;
                    }
                    v g5 = f4.g(false);
                    Intrinsics.c(g5);
                    Intrinsics.checkNotNullParameter(request, "request");
                    g5.f8460a = request;
                    g5.f8464e = iVar.f9407e;
                    g5.f8470k = currentTimeMillis;
                    g5.f8471l = System.currentTimeMillis();
                    response = g5.a();
                    i2 = response.f8476j;
                    Intrinsics.checkNotNullParameter(response, "response");
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    v b42 = response.b();
                    b42.f8466g = f4.d(response);
                    a4 = b42.a();
                    if (!"close".equalsIgnoreCase(a4.f8473d.i("Connection"))) {
                    }
                    dVar.h().k();
                    if (i2 != 204) {
                    }
                    xVar = a4.f8479m;
                    if ((xVar == null ? xVar.a() : -1L) > 0) {
                    }
                    return a4;
                } catch (IOException e5) {
                    if (iOException == null) {
                        throw e5;
                    }
                    C1331f.a(iOException, e5);
                    throw iOException;
                }
            } catch (IOException ioe) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
                f4.h(ioe);
                throw ioe;
            }
        } catch (IOException ioe2) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe2, "ioe");
            f4.h(ioe2);
            throw ioe2;
        }
    }
}

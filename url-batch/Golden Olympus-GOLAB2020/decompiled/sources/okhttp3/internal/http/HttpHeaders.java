package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.C3372e;
import okio.h;

@Metadata
/* loaded from: classes3.dex */
public final class HttpHeaders {

    /* renamed from: a, reason: collision with root package name */
    private static final h f42836a;

    /* renamed from: b, reason: collision with root package name */
    private static final h f42837b;

    static {
        h.a aVar = h.f43270e;
        f42836a = aVar.d("\"\\");
        f42837b = aVar.d("\t ,=");
    }

    public static final List a(Headers headers, String headerName) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (StringsKt.w(headerName, headers.d(i4), true)) {
                try {
                    c(new C3372e().C(headers.f(i4)), arrayList);
                } catch (EOFException e4) {
                    Platform.f43120a.g().k("Unable to parse challenge", 5, e4);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (Intrinsics.areEqual(response.e0().h(), "HEAD")) {
            return false;
        }
        int J3 = response.J();
        return (((J3 >= 100 && J3 < 200) || J3 == 204 || J3 == 304) && Util.u(response) == -1 && !StringsKt.w("chunked", Response.V(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bc, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void c(C3372e c3372e, List list) {
        String e4;
        int K3;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    g(c3372e);
                    str = e(c3372e);
                    if (str == null) {
                        return;
                    }
                }
                boolean g4 = g(c3372e);
                e4 = e(c3372e);
                if (e4 == null) {
                    if (c3372e.v()) {
                        list.add(new Challenge(str, MapsKt.emptyMap()));
                        return;
                    }
                    return;
                }
                K3 = Util.K(c3372e, (byte) 61);
                boolean g5 = g(c3372e);
                if (g4 || (!g5 && !c3372e.v())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int K4 = K3 + Util.K(c3372e, (byte) 61);
                    while (true) {
                        if (e4 == null) {
                            e4 = e(c3372e);
                            if (!g(c3372e)) {
                                K4 = Util.K(c3372e, (byte) 61);
                            }
                        }
                        if (K4 != 0) {
                            if (K4 > 1 || g(c3372e)) {
                                return;
                            }
                            String d4 = h(c3372e, (byte) 34) ? d(c3372e) : e(c3372e);
                            if (d4 == null || ((String) linkedHashMap.put(e4, d4)) != null) {
                                return;
                            }
                            if (!g(c3372e) && !c3372e.v()) {
                                return;
                            } else {
                                e4 = null;
                            }
                        }
                    }
                    list.add(new Challenge(str, linkedHashMap));
                    str = e4;
                }
            }
            Map singletonMap = Collections.singletonMap(null, e4 + StringsKt.C("=", K3));
            Intrinsics.checkNotNullExpressionValue(singletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            list.add(new Challenge(str, singletonMap));
        }
    }

    private static final String d(C3372e c3372e) {
        if (c3372e.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C3372e c3372e2 = new C3372e();
        while (true) {
            long Y3 = c3372e.Y(f42836a);
            if (Y3 == -1) {
                return null;
            }
            if (c3372e.U(Y3) == 34) {
                c3372e2.write(c3372e, Y3);
                c3372e.readByte();
                return c3372e2.i0();
            }
            if (c3372e.l0() == Y3 + 1) {
                return null;
            }
            c3372e2.write(c3372e, Y3);
            c3372e.readByte();
            c3372e2.write(c3372e, 1L);
        }
    }

    private static final String e(C3372e c3372e) {
        long Y3 = c3372e.Y(f42837b);
        if (Y3 == -1) {
            Y3 = c3372e.l0();
        }
        if (Y3 != 0) {
            return c3372e.j0(Y3);
        }
        return null;
    }

    public static final void f(CookieJar cookieJar, HttpUrl url, Headers headers) {
        Intrinsics.checkNotNullParameter(cookieJar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (cookieJar == CookieJar.f42357b) {
            return;
        }
        List e4 = Cookie.f42340j.e(url, headers);
        if (e4.isEmpty()) {
            return;
        }
        cookieJar.a(url, e4);
    }

    private static final boolean g(C3372e c3372e) {
        boolean z4 = false;
        while (!c3372e.v()) {
            byte U3 = c3372e.U(0L);
            if (U3 == 44) {
                c3372e.readByte();
                z4 = true;
            } else {
                if (U3 != 32 && U3 != 9) {
                    break;
                }
                c3372e.readByte();
            }
        }
        return z4;
    }

    private static final boolean h(C3372e c3372e, byte b4) {
        return !c3372e.v() && c3372e.U(0L) == b4;
    }
}

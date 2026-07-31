package l3;

import android.content.Context;
import android.net.TrafficStats;
import com.ironsource.cc;
import e3.AbstractC2414b;
import f2.AbstractC2419b;
import f2.AbstractC2420c;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class k implements b {

    /* renamed from: f, reason: collision with root package name */
    public static final a f41355f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f41356a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41357b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41358c;

    /* renamed from: d, reason: collision with root package name */
    private final int f41359d;

    /* renamed from: e, reason: collision with root package name */
    private final int f41360e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public k(Context context, String str, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f41356a = context;
        this.f41357b = str;
        this.f41358c = i4;
        this.f41359d = i5;
        this.f41360e = i6;
    }

    private final void b(HttpURLConnection httpURLConnection, int i4, int i5, int i6) {
        int i7;
        if (i4 != -1) {
            i7 = TrafficStats.getThreadStatsTag();
            TrafficStats.setThreadStatsTag(i4);
        } else {
            i7 = -1;
        }
        try {
            if (i5 > 0) {
                try {
                    try {
                        try {
                            httpURLConnection.setConnectTimeout(i5);
                        } catch (SecurityException e4) {
                            Throwable cause = e4.getCause();
                            if (cause == null) {
                                throw e4;
                            }
                            String name = cause.getClass().getName();
                            if (!Intrinsics.areEqual(name, "libcore.io.GaiException") && !Intrinsics.areEqual(name, "android.system.GaiException")) {
                                throw e4;
                            }
                            throw new UnknownHostException();
                        }
                    } catch (NullPointerException e5) {
                        throw e5;
                    }
                } catch (IllegalArgumentException e6) {
                    throw e6;
                }
            }
            if (i6 > 0) {
                httpURLConnection.setReadTimeout(i6);
            }
            httpURLConnection.connect();
            if (i7 != -1) {
                TrafficStats.setThreadStatsTag(i7);
            }
        } catch (Throwable th) {
            if (i7 != -1) {
                TrafficStats.setThreadStatsTag(i7);
            }
            throw th;
        }
    }

    private final int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw new IOException(e4);
        } catch (NullPointerException e5) {
            String message = e5.getMessage();
            if (message == null || !StringsKt.K(message, "Attempt to read from field 'int com.android.okhttp.okio.Segment.limit'", false, 2, null)) {
                throw e5;
            }
            throw new IOException(e5);
        }
    }

    @Override // l3.b
    public i a(g request) {
        String str;
        BufferedInputStream bufferedInputStream;
        byte[] c4;
        Intrinsics.checkNotNullParameter(request, "request");
        String b4 = request.b();
        String c5 = request.c();
        h a4 = request.a();
        URLConnection openConnection = new URL(c5).openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        if (httpURLConnection instanceof HttpsURLConnection) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(AbstractC2414b.c(AbstractC2414b.d(this.f41356a)));
        }
        try {
            httpURLConnection.setRequestMethod(b4);
            String str2 = this.f41357b;
            if (str2 != null) {
                httpURLConnection.setRequestProperty("User-Agent", str2);
            }
            if (a4 != null) {
                httpURLConnection.setRequestProperty(cc.f15718K, a4.getContentType());
                httpURLConnection.setDoOutput(true);
                if (a4.m() >= 0) {
                    httpURLConnection.setFixedLengthStreamingMode(a4.m());
                } else {
                    httpURLConnection.setChunkedStreamingMode(Base64Utils.IO_BUFFER_SIZE);
                }
            }
            b(httpURLConnection, this.f41358c, this.f41359d, this.f41360e);
            if (a4 != null) {
                OutputStream it = httpURLConnection.getOutputStream();
                try {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    a4.a(it);
                    Unit unit = Unit.f41027a;
                    AbstractC2420c.a(it, null);
                } finally {
                }
            }
            int c6 = c(httpURLConnection);
            String responseMessage = httpURLConnection.getResponseMessage();
            List<String> list = httpURLConnection.getHeaderFields().get(cc.f15718K);
            if (list == null || (str = (String) CollectionsKt.firstOrNull((List) list)) == null) {
                str = "application/octet-stream";
            }
            if (c6 < 400) {
                InputStream inputStream = httpURLConnection.getInputStream();
                Intrinsics.checkNotNullExpressionValue(inputStream, "conn.inputStream");
                bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192);
                try {
                    c4 = AbstractC2419b.c(bufferedInputStream);
                    AbstractC2420c.a(bufferedInputStream, null);
                } finally {
                }
            } else {
                InputStream errorStream = httpURLConnection.getErrorStream();
                Intrinsics.checkNotNullExpressionValue(errorStream, "conn.errorStream");
                bufferedInputStream = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, 8192);
                try {
                    c4 = AbstractC2419b.c(bufferedInputStream);
                    AbstractC2420c.a(bufferedInputStream, null);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            Intrinsics.checkNotNullExpressionValue(responseMessage, "responseMessage");
            return new i(c6, responseMessage, new l3.a(str, c4));
        } catch (IOException e4) {
            httpURLConnection.disconnect();
            throw e4;
        }
    }

    public /* synthetic */ k(Context context, String str, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? -1 : i4, (i7 & 8) != 0 ? 0 : i5, (i7 & 16) != 0 ? 0 : i6);
    }
}

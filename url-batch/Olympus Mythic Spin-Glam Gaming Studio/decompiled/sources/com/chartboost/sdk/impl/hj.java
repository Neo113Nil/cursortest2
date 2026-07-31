package com.chartboost.sdk.impl;

import com.safedk.android.internal.partials.ChartboostNetworkBridge;
import io.bidmachine.util.network.NetworkUtils;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes11.dex */
public final class hj {
    public final Function1 a;
    public final SSLSocketFactory b;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public static final a b = new a();

        public a() {
            super(1, URL.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final URL invoke(String str) {
            return new URL(str);
        }
    }

    public hj(Function1 urlFactory, SSLSocketFactory sslSocket) {
        Intrinsics.checkNotNullParameter(urlFactory, "urlFactory");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        this.a = urlFactory;
        this.b = sslSocket;
    }

    public /* synthetic */ hj(Function1 function1, SSLSocketFactory sSLSocketFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.b : function1, (i & 2) != 0 ? m3.a.a() : sSLSocketFactory);
    }

    public final Object a(b bVar) {
        Result.Companion companion = Result.INSTANCE;
        return Result.m8023constructorimpl(ResultKt.createFailure(bVar));
    }

    public final boolean b(int i) {
        return i <= i9.d.b() && i9.c.b() <= i;
    }

    public static abstract class b extends Exception {

        public static final class a extends b {
            public static final a b = new a();

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                super("Empty or null URL", null, 2, 0 == true ? 1 : 0);
            }
        }

        public b(String str, Throwable th) {
            super(str, th);
        }

        public static final class d extends b {
            public static final d b = new d();

            /* JADX WARN: Multi-variable type inference failed */
            public d() {
                super("Too many redirects", null, 2, 0 == true ? 1 : 0);
            }
        }

        public static final class c extends b {
            public static final c b = new c();

            /* JADX WARN: Multi-variable type inference failed */
            public c() {
                super("Returned connection is null", null, 2, 0 == true ? 1 : 0);
            }
        }

        /* renamed from: com.chartboost.sdk.impl.hj$b$b, reason: collision with other inner class name */
        public static final class C0223b extends b {
            public final int b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0223b(int i) {
                super("Failed with HTTP code " + i, null, 2, 0 == true ? 1 : 0);
                this.b = i;
            }
        }

        public static final class e extends b {
            public final String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String url, Throwable cause) {
                super("Uncontrolled error", cause, null);
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.b = url;
            }

            public final String a() {
                return this.b;
            }

            @Override // com.chartboost.sdk.impl.hj.b, java.lang.Throwable
            public String toString() {
                String th;
                Throwable cause = getCause();
                return (cause == null || (th = cause.toString()) == null) ? "No cause" : th;
            }
        }

        @Override // java.lang.Throwable
        public String toString() {
            String message = getMessage();
            return message == null ? "No message" : message;
        }

        public /* synthetic */ b(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th, null);
        }

        public /* synthetic */ b(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th);
        }
    }

    public final boolean a(int i) {
        return i <= i9.f.b() && i9.e.b() <= i;
    }

    public final HttpsURLConnection a(URL url) {
        URLConnection openConnection = url.openConnection();
        HttpsURLConnection httpsURLConnection = openConnection instanceof HttpsURLConnection ? (HttpsURLConnection) openConnection : null;
        if (httpsURLConnection == null) {
            return null;
        }
        httpsURLConnection.setSSLSocketFactory(this.b);
        httpsURLConnection.setInstanceFollowRedirects(false);
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        return httpsURLConnection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x011d, code lost:
    
        if (r3 != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, int i) {
        Object a2;
        HttpsURLConnection httpsURLConnection;
        URL url;
        HttpsURLConnection httpsURLConnection2 = null;
        xb.a("Attempting to redirect url: " + str + ", limit: " + i, (Throwable) null, 2, (Object) null);
        if (str == null || str.length() == 0) {
            Object a3 = a(b.a.b);
            xb.e("Url is null or empty.", null, 2, null);
            return a3;
        }
        try {
            if (i < 0) {
                Object a4 = a(b.d.b);
                xb.e("Too many redirects for url: " + str, null, 2, null);
                return a4;
            }
            try {
                url = (URL) this.a.invoke(str);
                httpsURLConnection = a(url);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (httpsURLConnection != null) {
                    if (b(ChartboostNetworkBridge.httpUrlConnectionGetResponseCode(httpsURLConnection))) {
                        a2 = Result.m8023constructorimpl(str);
                        xb.a("Successfully fetched url: " + str, (Throwable) null, 2, (Object) null);
                    } else if (a(ChartboostNetworkBridge.httpUrlConnectionGetResponseCode(httpsURLConnection))) {
                        String headerField = httpsURLConnection.getHeaderField(NetworkUtils.HEADER_LOCATION);
                        Intrinsics.checkNotNull(headerField);
                        if (StringsKt.startsWith$default(headerField, "/", false, 2, (Object) null)) {
                            headerField = url.getProtocol() + "://" + url.getHost() + headerField;
                        }
                        xb.a("Redirecting to: " + headerField, (Throwable) null, 2, (Object) null);
                        a2 = a(headerField, i + (-1));
                    } else {
                        a2 = a(new b.C0223b(ChartboostNetworkBridge.httpUrlConnectionGetResponseCode(httpsURLConnection)));
                        xb.e("Failed with HTTP code " + ChartboostNetworkBridge.httpUrlConnectionGetResponseCode(httpsURLConnection) + " for url: " + str, null, 2, null);
                    }
                } else {
                    a2 = a(b.c.b);
                    xb.e("Null connection for url: " + str, null, 2, null);
                }
            } catch (Exception e2) {
                e = e2;
                httpsURLConnection2 = httpsURLConnection;
                xb.b("Cannot redirect " + str, e);
                a2 = a(new b.e(str, e));
                if (httpsURLConnection2 != null) {
                    httpsURLConnection = httpsURLConnection2;
                    ChartboostNetworkBridge.httpUrlConnectionDisconnect(httpsURLConnection);
                }
                return a2;
            } catch (Throwable th) {
                th = th;
                httpsURLConnection2 = httpsURLConnection;
                if (httpsURLConnection2 != null) {
                    ChartboostNetworkBridge.httpUrlConnectionDisconnect(httpsURLConnection2);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static /* synthetic */ Object a(hj hjVar, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 10;
        }
        return hjVar.a(str, i);
    }
}

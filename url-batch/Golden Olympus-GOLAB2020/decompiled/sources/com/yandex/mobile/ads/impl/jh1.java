package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yp0;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class jh1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static volatile jh1 f27655a;

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f27656b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f27657c = 0;

    public static final class a {
        private a() {
        }

        @NotNull
        public static ArrayList a(@NotNull List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((gm1) obj) != gm1.f26228d) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                arrayList2.add(((gm1) obj2).toString());
            }
            return arrayList2;
        }

        @NotNull
        public static byte[] b(@NotNull List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            C3372e c3372e = new C3372e();
            ArrayList a4 = a(protocols);
            int size = a4.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = a4.get(i4);
                i4++;
                String str = (String) obj;
                c3372e.w(str.length());
                c3372e.C(str);
            }
            return c3372e.u();
        }

        public /* synthetic */ a(int i4) {
            this();
        }

        public static boolean b() {
            return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
        }

        @NotNull
        public static jh1 a() {
            return jh1.f27655a;
        }
    }

    static {
        boolean z4;
        jh1 zp0Var;
        jh1 a4;
        boolean z5;
        boolean z6;
        if (Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"))) {
            C1996id.a();
            z5 = C1924fd.f25753e;
            a4 = z5 ? new C1924fd() : null;
            if (a4 == null) {
                z6 = C2043kd.f28175f;
                zp0Var = z6 ? new C2043kd() : null;
                Intrinsics.checkNotNull(zp0Var);
                a4 = zp0Var;
            }
        } else {
            z4 = zp0.f35653d;
            zp0Var = z4 ? new zp0() : null;
            if (zp0Var == null) {
                a4 = yp0.b.a();
                if (a4 == null) {
                    a4 = new jh1();
                }
            }
            a4 = zp0Var;
        }
        f27655a = a4;
        f27656b = Logger.getLogger(td1.class.getName());
    }

    @NotNull
    public static SSLSocketFactory c(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(...)");
            sSLContext.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e4) {
            throw new AssertionError("No System TLS: " + e4, e4);
        }
    }

    public void a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    @NotNull
    public z62 b(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "getAcceptedIssuers(...)");
        return new C1955gk((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    @NotNull
    public final String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    @NotNull
    public nn a(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new C1907ek(b(trustManager));
    }

    @Nullable
    public String b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public void a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<gm1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    @Nullable
    public Object b() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        if (f27656b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public void a(@NotNull Socket socket, @NotNull InetSocketAddress address, int i4) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i4);
    }

    @NotNull
    public static X509TrustManager c() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        throw new IllegalStateException(("Unexpected default trust managers: " + arrays).toString());
    }

    public boolean a(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public static void a(int i4, @NotNull String message, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        f27656b.log(i4 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void a(@Nullable Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        a(5, message, (Throwable) obj);
    }
}

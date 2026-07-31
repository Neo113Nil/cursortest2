package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.yandex.mobile.ads.impl.C1972hd;
import com.yandex.mobile.ads.impl.C2137od;
import com.yandex.mobile.ads.impl.b22;
import com.yandex.mobile.ads.impl.jh1;
import com.yandex.mobile.ads.impl.kp;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.kd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2043kd extends jh1 {

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f28175f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f28176g = 0;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f28177d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final kp f28178e;

    /* renamed from: com.yandex.mobile.ads.impl.kd$a */
    public static final class a implements z62 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final X509TrustManager f28179a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Method f28180b;

        public a(@NotNull X509TrustManager trustManager, @NotNull Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f28179a = trustManager;
            this.f28180b = findByIssuerAndSignatureMethod;
        }

        @Override // com.yandex.mobile.ads.impl.z62
        @Nullable
        public final X509Certificate a(@NotNull X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object invoke = this.f28180b.invoke(this.f28179a, cert);
                Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) invoke).getTrustedCert();
            } catch (IllegalAccessException e4) {
                throw new AssertionError("unable to get issues and signature", e4);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f28179a, aVar.f28179a) && Intrinsics.areEqual(this.f28180b, aVar.f28180b);
        }

        public final int hashCode() {
            return this.f28180b.hashCode() + (this.f28179a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f28179a + ", findByIssuerAndSignatureMethod=" + this.f28180b + ")";
        }
    }

    static {
        f28175f = jh1.a.b() && Build.VERSION.SDK_INT < 30;
    }

    public C2043kd() {
        b22 a4;
        int i4 = b22.f23582h;
        a4 = b22.a.a("com.android.org.conscrypt");
        int i5 = C2137od.f29980g;
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new a12[]{a4, new m00(C2137od.a.a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOfNotNull) {
            if (((a12) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f28177d = arrayList;
        this.f28178e = kp.a.a();
    }

    @Override // com.yandex.mobile.ads.impl.jh1
    @NotNull
    public final nn a(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        C1972hd a4 = C1972hd.a.a(trustManager);
        if (a4 != null) {
            return a4;
        }
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new C1907ek(b(trustManager));
    }

    @Override // com.yandex.mobile.ads.impl.jh1
    @NotNull
    public final z62 b(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            Intrinsics.checkNotNull(declaredMethod);
            return new a(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(trustManager);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jh1
    public final void a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<gm1> protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = this.f28177d;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((a12) obj).a(sslSocket)) {
                break;
            }
        }
        a12 a12Var = (a12) obj;
        if (a12Var != null) {
            a12Var.a(sslSocket, str, protocols);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jh1
    public final void a(@NotNull Socket socket, @NotNull InetSocketAddress address, int i4) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i4);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e4);
            }
            throw e4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.jh1
    @Nullable
    public final String b(@NotNull SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        ArrayList arrayList = this.f28177d;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            if (((a12) obj).a(sslSocket)) {
                break;
            }
        }
        a12 a12Var = (a12) obj;
        if (a12Var != null) {
            return a12Var.b(sslSocket);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.jh1
    @Nullable
    public final Object b() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        return this.f28178e.a();
    }

    @Override // com.yandex.mobile.ads.impl.jh1
    public final boolean a(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // com.yandex.mobile.ads.impl.jh1
    public final void a(@Nullable Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.f28178e.a(obj)) {
            return;
        }
        jh1.a(5, message, (Throwable) null);
    }
}

package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import com.yandex.mobile.ads.impl.jh1;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"NewApi"})
/* renamed from: com.yandex.mobile.ads.impl.gd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1948gd implements a12 {

    /* renamed from: com.yandex.mobile.ads.impl.gd$a */
    public static final class a {
        @Nullable
        public static C1948gd a() {
            if (b()) {
                return new C1948gd();
            }
            return null;
        }

        public static boolean b() {
            int i4 = jh1.f27657c;
            return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // com.yandex.mobile.ads.impl.a12
    @SuppressLint({"NewApi"})
    public final void a(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends gm1> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            int i4 = jh1.f27657c;
            sSLParameters.setApplicationProtocols((String[]) jh1.a.a(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e4) {
            throw new IOException("Android internal error", e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.a12
    @SuppressLint({"NewApi"})
    @Nullable
    public final String b(@NotNull SSLSocket sslSocket) {
        String applicationProtocol;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null || Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // com.yandex.mobile.ads.impl.a12
    public final boolean a(@NotNull SSLSocket sslSocket) {
        boolean isSupportedSocket;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        isSupportedSocket = SSLSockets.isSupportedSocket(sslSocket);
        return isSupportedSocket;
    }

    @Override // com.yandex.mobile.ads.impl.a12
    public final boolean a() {
        return a.b();
    }
}

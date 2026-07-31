package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fr {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<er> f25900a;

    /* renamed from: b, reason: collision with root package name */
    private int f25901b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25902c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25903d;

    public fr(@NotNull List<er> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f25900a = connectionSpecs;
    }

    @NotNull
    public final er a(@NotNull SSLSocket sslSocket) {
        boolean z4;
        er erVar;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i4 = this.f25901b;
        int size = this.f25900a.size();
        while (true) {
            z4 = true;
            if (i4 >= size) {
                erVar = null;
                break;
            }
            erVar = this.f25900a.get(i4);
            if (erVar.a(sslSocket)) {
                this.f25901b = i4 + 1;
                break;
            }
            i4++;
        }
        if (erVar != null) {
            int i5 = this.f25901b;
            int size2 = this.f25900a.size();
            while (true) {
                if (i5 >= size2) {
                    z4 = false;
                    break;
                }
                if (this.f25900a.get(i5).a(sslSocket)) {
                    break;
                }
                i5++;
            }
            this.f25902c = z4;
            erVar.a(sslSocket, this.f25903d);
            return erVar;
        }
        boolean z5 = this.f25903d;
        List<er> list = this.f25900a;
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + z5 + ", modes=" + list + ", supported protocols=" + arrays);
    }

    public final boolean a(@NotNull IOException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        this.f25903d = true;
        if (!this.f25902c || (e4 instanceof ProtocolException) || (e4 instanceof InterruptedIOException)) {
            return false;
        }
        return (((e4 instanceof SSLHandshakeException) && (e4.getCause() instanceof CertificateException)) || (e4 instanceof SSLPeerUnverifiedException) || !(e4 instanceof SSLException)) ? false : true;
    }
}

package com.yandex.mobile.ads.impl;

import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qj1 extends SSLSocketFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30807b = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SSLSocketFactory f30808a;

    public static final class a {
        private a() {
        }

        public static final String[] a(SSLSocketFactory sSLSocketFactory) {
            int i4 = qj1.f30807b;
            String[] defaultCipherSuites = sSLSocketFactory.getDefaultCipherSuites();
            ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(defaultCipherSuites, defaultCipherSuites.length)));
            arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
            return (String[]) arrayList.toArray(new String[0]);
        }

        public static final String[] b(SSLSocketFactory sSLSocketFactory) {
            int i4 = qj1.f30807b;
            String[] supportedCipherSuites = sSLSocketFactory.getSupportedCipherSuites();
            ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(supportedCipherSuites, supportedCipherSuites.length)));
            arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
            arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
            return (String[]) arrayList.toArray(new String[0]);
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    public qj1(@NotNull SSLSocketFactory delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f30808a = delegate;
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public final Socket createSocket(@NotNull String arg0, int i4) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Socket createSocket = this.f30808a.createSocket(arg0, i4);
        String[] a4 = a.a(this.f30808a);
        Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(a4);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @NotNull
    public final String[] getDefaultCipherSuites() {
        return a.a(this.f30808a);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @NotNull
    public final String[] getSupportedCipherSuites() {
        return a.b(this.f30808a);
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public final Socket createSocket(@NotNull String arg0, int i4, @NotNull InetAddress arg2, int i5) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(arg2, "arg2");
        Socket createSocket = this.f30808a.createSocket(arg0, i4, arg2, i5);
        String[] a4 = a.a(this.f30808a);
        Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(a4);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public final Socket createSocket(@NotNull InetAddress arg0, int i4) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Socket createSocket = this.f30808a.createSocket(arg0, i4);
        String[] a4 = a.a(this.f30808a);
        Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(a4);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    @NotNull
    public final Socket createSocket(@NotNull InetAddress arg0, int i4, @NotNull InetAddress arg2, int i5) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(arg2, "arg2");
        Socket createSocket = this.f30808a.createSocket(arg0, i4, arg2, i5);
        String[] a4 = a.a(this.f30808a);
        Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(a4);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @NotNull
    public final Socket createSocket(@NotNull Socket arg0, @NotNull String arg1, int i4, boolean z4) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(arg1, "arg1");
        Socket createSocket = this.f30808a.createSocket(arg0, arg1, i4, z4);
        String[] a4 = a.a(this.f30808a);
        Intrinsics.checkNotNull(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        ((SSLSocket) createSocket).setEnabledCipherSuites(a4);
        return createSocket;
    }
}

package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.f52;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xe0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f52 f34535a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final yn f34536b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<Certificate> f34537c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final W1.h f34538d;

    public static final class a {

        /* renamed from: com.yandex.mobile.ads.impl.xe0$a$a, reason: collision with other inner class name */
        static final class C0207a extends kotlin.jvm.internal.s implements Function0<List<? extends Certificate>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<Certificate> f34539b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0207a(List<? extends Certificate> list) {
                super(0);
                this.f34539b = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f34539b;
            }
        }

        @NotNull
        public static xe0 a(@NotNull SSLSession sSLSession) {
            List emptyList;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            yn a4 = yn.f35246b.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (Intrinsics.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            f52.f25627c.getClass();
            f52 a5 = f52.a.a(protocol);
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                emptyList = peerCertificates != null ? v82.a(Arrays.copyOf(peerCertificates, peerCertificates.length)) : CollectionsKt.emptyList();
            } catch (SSLPeerUnverifiedException unused) {
                emptyList = CollectionsKt.emptyList();
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            return new xe0(a5, a4, localCertificates != null ? v82.a(Arrays.copyOf(localCertificates, localCertificates.length)) : CollectionsKt.emptyList(), new C0207a(emptyList));
        }
    }

    static final class b extends kotlin.jvm.internal.s implements Function0<List<? extends Certificate>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<List<Certificate>> f34540b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function0<? extends List<? extends Certificate>> function0) {
            super(0);
            this.f34540b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            try {
                return (List) this.f34540b.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return CollectionsKt.emptyList();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xe0(@NotNull f52 tlsVersion, @NotNull yn cipherSuite, @NotNull List<? extends Certificate> localCertificates, @NotNull Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f34535a = tlsVersion;
        this.f34536b = cipherSuite;
        this.f34537c = localCertificates;
        this.f34538d = W1.i.b(new b(peerCertificatesFn));
    }

    @NotNull
    public final yn a() {
        return this.f34536b;
    }

    @NotNull
    public final List<Certificate> b() {
        return this.f34537c;
    }

    @NotNull
    public final List<Certificate> c() {
        return (List) this.f34538d.getValue();
    }

    @NotNull
    public final f52 d() {
        return this.f34535a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof xe0)) {
            return false;
        }
        xe0 xe0Var = (xe0) obj;
        return xe0Var.f34535a == this.f34535a && Intrinsics.areEqual(xe0Var.f34536b, this.f34536b) && Intrinsics.areEqual((List) xe0Var.f34538d.getValue(), (List) this.f34538d.getValue()) && Intrinsics.areEqual(xe0Var.f34537c, this.f34537c);
    }

    public final int hashCode() {
        return this.f34537c.hashCode() + C2039k9.a((List) this.f34538d.getValue(), (this.f34536b.hashCode() + ((this.f34535a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        String type;
        String type2;
        List<Certificate> list = (List) this.f34538d.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Certificate certificate : list) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        f52 f52Var = this.f34535a;
        yn ynVar = this.f34536b;
        List<Certificate> list2 = this.f34537c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Certificate certificate2 : list2) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        return "Handshake{tlsVersion=" + f52Var + " cipherSuite=" + ynVar + " peerCertificates=" + obj + " localCertificates=" + arrayList2 + "}";
    }
}

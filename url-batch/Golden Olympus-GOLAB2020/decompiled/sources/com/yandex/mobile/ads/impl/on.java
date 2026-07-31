package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class on {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final on f30105c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<c> f30106a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final nn f30107b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f30108a = new ArrayList();

        @NotNull
        public final on a() {
            return new on(CollectionsKt.toSet(this.f30108a), null);
        }
    }

    public static final class b {
        @NotNull
        public static String a(@NotNull X509Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (certificate == null) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + c(certificate).c();
        }

        @NotNull
        public static okio.h b(@NotNull X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            h.a aVar = okio.h.f43270e;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
            return h.a.f(aVar, encoded, 0, 0, 3, null).t();
        }

        @NotNull
        public static okio.h c(@NotNull X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            h.a aVar = okio.h.f43270e;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
            return h.a.f(aVar, encoded, 0, 0, 3, null).u();
        }
    }

    public static final class c {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null);
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            throw null;
        }
    }

    static final class d extends kotlin.jvm.internal.s implements Function0<List<? extends X509Certificate>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Certificate> f30110c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30111d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends Certificate> list, String str) {
            super(0);
            this.f30110c = list;
            this.f30111d = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        
            if (r0 == null) goto L6;
         */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invoke() {
            List<Certificate> list;
            nn a4 = on.this.a();
            if (a4 != null) {
                list = a4.a(this.f30111d, this.f30110c);
            }
            list = this.f30110c;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Certificate certificate : list) {
                Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public on(@NotNull Set<c> pins, @Nullable nn nnVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f30106a = pins;
        this.f30107b = nnVar;
    }

    public final void a(@NotNull String hostname, @NotNull List<? extends Certificate> peerCertificates) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        a(hostname, new d(peerCertificates, hostname));
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof on)) {
            return false;
        }
        on onVar = (on) obj;
        return Intrinsics.areEqual(onVar.f30106a, this.f30106a) && Intrinsics.areEqual(onVar.f30107b, this.f30107b);
    }

    public final int hashCode() {
        int hashCode = (this.f30106a.hashCode() + 1517) * 41;
        nn nnVar = this.f30107b;
        return hashCode + (nnVar != null ? nnVar.hashCode() : 0);
    }

    public final void a(@NotNull String hostname, @NotNull Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set<c> set = this.f30106a;
        List<c> emptyList = CollectionsKt.emptyList();
        for (Object obj : set) {
            ((c) obj).getClass();
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            if (!StringsKt.K(null, "**.", false, 2, null)) {
                if (!StringsKt.K(null, "*.", false, 2, null)) {
                    if (Intrinsics.areEqual(hostname, (Object) null)) {
                        if (emptyList.isEmpty()) {
                            emptyList = new ArrayList();
                        }
                        Intrinsics.checkNotNull(emptyList, "null cannot be cast to non-null type kotlin.collections.MutableList<T of com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.Util.filterList>");
                        kotlin.jvm.internal.M.c(emptyList).add(obj);
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        if (emptyList.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = emptyList.iterator();
            okio.h hVar = null;
            okio.h hVar2 = null;
            while (it.hasNext()) {
                ((c) it.next()).getClass();
                if (Intrinsics.areEqual((Object) null, "sha256")) {
                    if (hVar == null) {
                        hVar = b.c(x509Certificate);
                    }
                    if (Intrinsics.areEqual((Object) null, hVar)) {
                        return;
                    }
                } else if (Intrinsics.areEqual((Object) null, "sha1")) {
                    if (hVar2 == null) {
                        hVar2 = b.b(x509Certificate);
                    }
                    if (Intrinsics.areEqual((Object) null, hVar2)) {
                        return;
                    }
                } else {
                    throw new AssertionError("unsupported hashAlgorithm: " + ((String) null));
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(b.a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        for (c cVar : emptyList) {
            sb.append("\n    ");
            sb.append(cVar);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        throw new SSLPeerUnverifiedException(sb2);
    }

    @Nullable
    public final nn a() {
        return this.f30107b;
    }

    @NotNull
    public final on a(@NotNull nn certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.areEqual(this.f30107b, certificateChainCleaner) ? this : new on(this.f30106a, certificateChainCleaner);
    }
}

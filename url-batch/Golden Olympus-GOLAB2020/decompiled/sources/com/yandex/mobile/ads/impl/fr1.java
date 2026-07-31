package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mh0;
import com.yandex.mobile.ads.impl.pp1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fr1 implements uo0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final td1 f25904a;

    public fr1(@NotNull td1 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f25904a = client;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r1.intValue() > 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final pp1 a(oq1 oq1Var, r50 r50Var) {
        String link;
        mh0.a aVar;
        String a4;
        un1 f4;
        ps1 k4 = (r50Var == null || (f4 = r50Var.f()) == null) ? null : f4.k();
        int d4 = oq1Var.d();
        String method = oq1Var.o().f();
        if (d4 != 307 && d4 != 308) {
            if (d4 == 401) {
                return this.f25904a.c().a(k4, oq1Var);
            }
            if (d4 == 421) {
                oq1Var.o().getClass();
                if (r50Var == null || !r50Var.i()) {
                    return null;
                }
                r50Var.f().i();
                return oq1Var.o();
            }
            if (d4 == 503) {
                oq1 l4 = oq1Var.l();
                if ((l4 == null || l4.d() != 503) && (a4 = oq1.a(oq1Var, "Retry-After")) != null && new Regex("\\d+").d(a4)) {
                    Integer valueOf = Integer.valueOf(a4);
                    Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
                    if (valueOf.intValue() == 0) {
                        return oq1Var.o();
                    }
                }
                return null;
            }
            if (d4 == 407) {
                Intrinsics.checkNotNull(k4);
                if (k4.b().type() == Proxy.Type.HTTP) {
                    return this.f25904a.s().a(k4, oq1Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (d4 == 408) {
                if (!this.f25904a.v()) {
                    return null;
                }
                oq1Var.o().getClass();
                oq1 l5 = oq1Var.l();
                if (l5 != null && l5.d() == 408) {
                    return null;
                }
                String a5 = oq1.a(oq1Var, "Retry-After");
                if (a5 != null) {
                    if (new Regex("\\d+").d(a5)) {
                        Integer valueOf2 = Integer.valueOf(a5);
                        Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(...)");
                    }
                    return null;
                }
                return oq1Var.o();
            }
            switch (d4) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f25904a.l() || (link = oq1.a(oq1Var, "Location")) == null) {
            return null;
        }
        mh0 g4 = oq1Var.o().g();
        g4.getClass();
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            aVar = new mh0.a().a(g4, link);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        mh0 other = aVar != null ? aVar.a() : null;
        if (other == null) {
            return null;
        }
        if (!Intrinsics.areEqual(other.k(), oq1Var.o().g().k()) && !this.f25904a.m()) {
            return null;
        }
        pp1 o4 = oq1Var.o();
        o4.getClass();
        pp1.a aVar2 = new pp1.a(o4);
        if (fh0.a(method)) {
            int d5 = oq1Var.d();
            Intrinsics.checkNotNullParameter(method, "method");
            boolean z4 = Intrinsics.areEqual(method, "PROPFIND") || d5 == 308 || d5 == 307;
            Intrinsics.checkNotNullParameter(method, "method");
            if (Intrinsics.areEqual(method, "PROPFIND") || d5 == 308 || d5 == 307) {
                aVar2.a(method, z4 ? oq1Var.o().a() : null);
            } else {
                aVar2.a(com.ironsource.jn.f16864a, (sp1) null);
            }
            if (!z4) {
                aVar2.a("Transfer-Encoding");
                aVar2.a("Content-Length");
                aVar2.a(com.ironsource.cc.f15718K);
            }
        }
        mh0 g5 = oq1Var.o().g();
        Intrinsics.checkNotNullParameter(g5, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.areEqual(g5.g(), other.g()) || g5.i() != other.i() || !Intrinsics.areEqual(g5.k(), other.k())) {
            aVar2.a("Authorization");
        }
        return aVar2.a(other).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r0 = r0.k().c(r7.k().a((com.yandex.mobile.ads.impl.sq1) null).a()).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        r0 = r1.g();
        r6 = a(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        r0 = r7.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        com.yandex.mobile.ads.impl.v82.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r8 > 20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r0.j() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        r1.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        r1.a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        return r7;
     */
    @Override // com.yandex.mobile.ads.impl.uo0
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oq1 a(@NotNull xn1 chain) {
        pp1 a4;
        Intrinsics.checkNotNullParameter(chain, "chain");
        pp1 f4 = chain.f();
        tn1 b4 = chain.b();
        List emptyList = CollectionsKt.emptyList();
        int i4 = 0;
        oq1 oq1Var = null;
        while (true) {
            boolean z4 = true;
            while (true) {
                b4.a(f4, z4);
                try {
                    if (!b4.j()) {
                        try {
                            try {
                                oq1 a5 = chain.a(f4);
                                break;
                            } catch (IOException e4) {
                                if (a(e4, b4, f4, !(e4 instanceof dr))) {
                                    emptyList = CollectionsKt.plus((Collection<? extends IOException>) emptyList, e4);
                                    b4.a(true);
                                } else {
                                    throw v82.a(e4, emptyList);
                                }
                            }
                        } catch (rs1 e5) {
                            if (a(e5.b(), b4, f4, false)) {
                                emptyList = CollectionsKt.plus((Collection<? extends IOException>) emptyList, e5.a());
                                b4.a(true);
                            } else {
                                throw v82.a(e5.a(), emptyList);
                            }
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                    z4 = false;
                } catch (Throwable th) {
                    b4.a(true);
                    throw th;
                }
            }
            b4.a(true);
            f4 = a4;
        }
    }

    private final boolean a(IOException iOException, tn1 tn1Var, pp1 pp1Var, boolean z4) {
        if (this.f25904a.v()) {
            return !(z4 && (iOException instanceof FileNotFoundException)) && !(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z4)) && tn1Var.m();
        }
        return false;
    }
}

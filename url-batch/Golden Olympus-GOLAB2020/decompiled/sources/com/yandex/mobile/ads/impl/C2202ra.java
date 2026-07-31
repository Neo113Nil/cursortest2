package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.mh0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ra, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2202ra {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f30 f31089a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SocketFactory f31090b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final SSLSocketFactory f31091c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final HostnameVerifier f31092d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final on f31093e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC2164ph f31094f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final Proxy f31095g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ProxySelector f31096h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final mh0 f31097i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<gm1> f31098j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final List<er> f31099k;

    public C2202ra(@NotNull String uriHost, int i4, @NotNull f30 dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable sd1 sd1Var, @Nullable on onVar, @NotNull InterfaceC2164ph proxyAuthenticator, @NotNull List protocols, @NotNull List connectionSpecs, @NotNull ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f31089a = dns;
        this.f31090b = socketFactory;
        this.f31091c = sSLSocketFactory;
        this.f31092d = sd1Var;
        this.f31093e = onVar;
        this.f31094f = proxyAuthenticator;
        this.f31095g = null;
        this.f31096h = proxySelector;
        this.f31097i = new mh0.a().c(sSLSocketFactory != null ? "https" : "http").b(uriHost).a(i4).a();
        this.f31098j = v82.b(protocols);
        this.f31099k = v82.b(connectionSpecs);
    }

    @Nullable
    public final on a() {
        return this.f31093e;
    }

    @NotNull
    public final List<er> b() {
        return this.f31099k;
    }

    @NotNull
    public final f30 c() {
        return this.f31089a;
    }

    @Nullable
    public final HostnameVerifier d() {
        return this.f31092d;
    }

    @NotNull
    public final List<gm1> e() {
        return this.f31098j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C2202ra)) {
            return false;
        }
        C2202ra c2202ra = (C2202ra) obj;
        return Intrinsics.areEqual(this.f31097i, c2202ra.f31097i) && a(c2202ra);
    }

    @Nullable
    public final Proxy f() {
        return this.f31095g;
    }

    @NotNull
    public final InterfaceC2164ph g() {
        return this.f31094f;
    }

    @NotNull
    public final ProxySelector h() {
        return this.f31096h;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f31093e) + ((Objects.hashCode(this.f31092d) + ((Objects.hashCode(this.f31091c) + ((Objects.hashCode(this.f31095g) + ((this.f31096h.hashCode() + C2039k9.a(this.f31099k, C2039k9.a(this.f31098j, (this.f31094f.hashCode() + ((this.f31089a.hashCode() + ((this.f31097i.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final SocketFactory i() {
        return this.f31090b;
    }

    @Nullable
    public final SSLSocketFactory j() {
        return this.f31091c;
    }

    @NotNull
    public final mh0 k() {
        return this.f31097i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb;
        String str;
        String g4 = this.f31097i.g();
        int i4 = this.f31097i.i();
        Object obj = this.f31095g;
        if (obj != null) {
            sb = new StringBuilder();
            str = "proxy=";
        } else {
            obj = this.f31096h;
            sb = new StringBuilder();
            str = "proxySelector=";
        }
        sb.append(str);
        sb.append(obj);
        return "Address{" + g4 + StringUtils.PROCESS_POSTFIX_DELIMITER + i4 + ", " + sb.toString() + "}";
    }

    public final boolean a(@NotNull C2202ra that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f31089a, that.f31089a) && Intrinsics.areEqual(this.f31094f, that.f31094f) && Intrinsics.areEqual(this.f31098j, that.f31098j) && Intrinsics.areEqual(this.f31099k, that.f31099k) && Intrinsics.areEqual(this.f31096h, that.f31096h) && Intrinsics.areEqual(this.f31095g, that.f31095g) && Intrinsics.areEqual(this.f31091c, that.f31091c) && Intrinsics.areEqual(this.f31092d, that.f31092d) && Intrinsics.areEqual(this.f31093e, that.f31093e) && this.f31097i.i() == that.f31097i.i();
    }
}

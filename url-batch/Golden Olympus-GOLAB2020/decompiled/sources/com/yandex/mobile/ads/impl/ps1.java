package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ps1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2202ra f30557a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Proxy f30558b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InetSocketAddress f30559c;

    public ps1(@NotNull C2202ra address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f30557a = address;
        this.f30558b = proxy;
        this.f30559c = socketAddress;
    }

    @NotNull
    public final C2202ra a() {
        return this.f30557a;
    }

    @NotNull
    public final Proxy b() {
        return this.f30558b;
    }

    public final boolean c() {
        return this.f30557a.j() != null && this.f30558b.type() == Proxy.Type.HTTP;
    }

    @NotNull
    public final InetSocketAddress d() {
        return this.f30559c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ps1)) {
            return false;
        }
        ps1 ps1Var = (ps1) obj;
        return Intrinsics.areEqual(ps1Var.f30557a, this.f30557a) && Intrinsics.areEqual(ps1Var.f30558b, this.f30558b) && Intrinsics.areEqual(ps1Var.f30559c, this.f30559c);
    }

    public final int hashCode() {
        return this.f30559c.hashCode() + ((this.f30558b.hashCode() + ((this.f30557a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "Route{" + this.f30559c + "}";
    }
}

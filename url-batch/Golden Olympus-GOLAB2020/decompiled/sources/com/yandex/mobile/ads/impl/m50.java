package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class m50 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f28890a = new a();

    public static final class a extends m50 {
        a() {
        }
    }

    public interface b {
        @NotNull
        m50 a(@NotNull wm wmVar);
    }

    public static void a(@NotNull wm call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public static void b(@NotNull tn1 call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public static void a(@NotNull wm call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public static void a(@NotNull tn1 call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public static void a(@NotNull tn1 call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public static void a(@NotNull wm call, @NotNull un1 connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public static void a(@NotNull wm call, @NotNull String domainName, @NotNull List inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public static void a(@NotNull wm call, @NotNull String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    public static void a(@NotNull tn1 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }
}

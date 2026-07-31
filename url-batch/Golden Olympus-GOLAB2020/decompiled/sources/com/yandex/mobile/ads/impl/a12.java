package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface a12 {
    void a(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<? extends gm1> list);

    boolean a();

    boolean a(@NotNull SSLSocket sSLSocket);

    @Nullable
    String b(@NotNull SSLSocket sSLSocket);
}

package com.yandex.mobile.ads.impl;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class nn {

    public static final class a {
        @NotNull
        public static nn a(@NotNull X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return jh1.f27655a.a(trustManager);
        }
    }

    @NotNull
    public abstract List a(@NotNull String str, @NotNull List list);
}

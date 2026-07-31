package ru.rustore.sdk.pay.internal;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class p6 implements o6 {
    @Override // ru.rustore.sdk.pay.internal.o6
    public final void a(@NotNull HttpsURLConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    @Override // ru.rustore.sdk.pay.internal.o6
    public final void a(@NotNull HttpsURLConnection connection, @NotNull String responseBody) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
    }
}

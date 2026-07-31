package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class uc1 {
    @NotNull
    public static URL a(@NotNull op1 request, @Nullable i82 i82Var) {
        Intrinsics.checkNotNullParameter(request, "request");
        String l4 = request.l();
        if (i82Var != null) {
            String a4 = i82Var.a();
            if (a4 == null) {
                throw new IOException("URL blocked by rewriter: " + l4);
            }
            l4 = a4;
        }
        return new URL(l4);
    }
}

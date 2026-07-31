package com.ironsource;

import java.io.InputStream;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ia implements u8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ia f16705a = new ia();

    private ia() {
    }

    @Override // com.ironsource.u8
    @NotNull
    public InputStream a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        InputStream openStream = new URL(url).openStream();
        Intrinsics.checkNotNullExpressionValue(openStream, "URL(url).openStream()");
        return openStream;
    }
}

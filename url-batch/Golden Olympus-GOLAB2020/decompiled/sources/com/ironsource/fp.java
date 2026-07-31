package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class fp {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16264a;

    public fp(@NotNull String baseControllerUrl) {
        Intrinsics.checkNotNullParameter(baseControllerUrl, "baseControllerUrl");
        this.f16264a = baseControllerUrl;
    }

    @NotNull
    public final String a() {
        String str = this.f16264a;
        String substring = str.substring(0, StringsKt.h0(str, "/", 0, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}

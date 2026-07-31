package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class jt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16877a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f16878b;

    public jt(@NotNull String identifier, @NotNull String baseConst) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(baseConst, "baseConst");
        this.f16877a = identifier;
        this.f16878b = baseConst;
    }

    @NotNull
    public final String a() {
        return this.f16877a + '_' + this.f16878b;
    }
}

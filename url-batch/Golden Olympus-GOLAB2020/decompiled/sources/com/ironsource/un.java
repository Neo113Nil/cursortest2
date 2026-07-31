package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class un implements mm<tn, C1469g3> {
    @Override // com.ironsource.mm
    @NotNull
    public C1469g3 a(@NotNull tn input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new C1469g3(input.d(), input.b(), input.a());
    }
}

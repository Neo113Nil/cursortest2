package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1582w implements mm<C1576v, C1461f2> {
    @Override // com.ironsource.mm
    @NotNull
    public C1461f2 a(@NotNull C1576v input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new C1461f2(input.f(), input.d(), input.e(), input.b(), input.a());
    }
}

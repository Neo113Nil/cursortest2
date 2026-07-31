package com.yandex.div.core.state;

import O1.C1013qd;
import O1.Z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivPathUtils$findByPath$3 extends s implements Function1<C1013qd.c, Z> {
    public static final DivPathUtils$findByPath$3 INSTANCE = new DivPathUtils$findByPath$3();

    DivPathUtils$findByPath$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Z invoke(@NotNull C1013qd.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.f7643a;
    }
}

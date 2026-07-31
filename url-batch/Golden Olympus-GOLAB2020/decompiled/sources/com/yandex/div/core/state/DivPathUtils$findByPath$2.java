package com.yandex.div.core.state;

import O1.Bc;
import O1.Z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivPathUtils$findByPath$2 extends s implements Function1<Bc.c, Z> {
    public static final DivPathUtils$findByPath$2 INSTANCE = new DivPathUtils$findByPath$2();

    DivPathUtils$findByPath$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Z invoke(@NotNull Bc.c it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.f1536c;
    }
}

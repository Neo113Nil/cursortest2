package com.yandex.div.core.view2.divs;

import O1.Z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivStateBinder$setupTransitions$transition$3 extends s implements Function1<Z, Boolean> {
    public static final DivStateBinder$setupTransitions$transition$3 INSTANCE = new DivStateBinder$setupTransitions$transition$3();

    DivStateBinder$setupTransitions$transition$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Z div) {
        Intrinsics.checkNotNullParameter(div, "div");
        return Boolean.valueOf(!(div instanceof Z.o));
    }
}

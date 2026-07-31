package com.yandex.div.core.view2.divs;

import O1.EnumC0997pf;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivStateBinder$setupTransitions$transition$2 extends s implements Function1<DivItemBuilderResult, Boolean> {
    public static final DivStateBinder$setupTransitions$transition$2 INSTANCE = new DivStateBinder$setupTransitions$transition$2();

    DivStateBinder$setupTransitions$transition$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull DivItemBuilderResult item) {
        Intrinsics.checkNotNullParameter(item, "item");
        List j4 = item.getDiv().b().j();
        return Boolean.valueOf(j4 != null ? DivTransitionsKt.allowsTransitionsOnStateChange((List<? extends EnumC0997pf>) j4) : true);
    }
}

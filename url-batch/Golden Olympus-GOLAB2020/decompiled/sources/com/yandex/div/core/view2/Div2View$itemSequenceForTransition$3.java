package com.yandex.div.core.view2;

import O1.EnumC0979of;
import O1.EnumC0997pf;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C3218h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class Div2View$itemSequenceForTransition$3 extends s implements Function1<DivItemBuilderResult, Boolean> {
    final /* synthetic */ C3218h $selectors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Div2View$itemSequenceForTransition$3(C3218h c3218h) {
        super(1);
        this.$selectors = c3218h;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull DivItemBuilderResult item) {
        boolean allowsTransitionsOnDataChange;
        Intrinsics.checkNotNullParameter(item, "item");
        List j4 = item.getDiv().b().j();
        if (j4 != null) {
            allowsTransitionsOnDataChange = DivTransitionsKt.allowsTransitionsOnDataChange((List<? extends EnumC0997pf>) j4);
        } else {
            EnumC0979of enumC0979of = (EnumC0979of) this.$selectors.m();
            allowsTransitionsOnDataChange = enumC0979of != null ? DivTransitionsKt.allowsTransitionsOnDataChange(enumC0979of) : false;
        }
        return Boolean.valueOf(allowsTransitionsOnDataChange);
    }
}

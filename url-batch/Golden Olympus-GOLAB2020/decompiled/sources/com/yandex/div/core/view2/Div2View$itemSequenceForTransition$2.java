package com.yandex.div.core.view2;

import O1.Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C3218h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class Div2View$itemSequenceForTransition$2 extends s implements Function1<Z, Unit> {
    final /* synthetic */ C3218h $selectors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Div2View$itemSequenceForTransition$2(C3218h c3218h) {
        super(1);
        this.$selectors = c3218h;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Z) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Z div) {
        Intrinsics.checkNotNullParameter(div, "div");
        if (div instanceof Z.o) {
            this.$selectors.removeLast();
        }
    }
}

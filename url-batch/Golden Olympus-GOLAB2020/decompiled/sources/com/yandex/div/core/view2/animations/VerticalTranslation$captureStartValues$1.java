package com.yandex.div.core.view2.animations;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class VerticalTranslation$captureStartValues$1 extends s implements Function1<int[], Unit> {
    final /* synthetic */ k0.s $transitionValues;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerticalTranslation$captureStartValues$1(k0.s sVar) {
        super(1);
        this.$transitionValues = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((int[]) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull int[] position) {
        Intrinsics.checkNotNullParameter(position, "position");
        Map map = this.$transitionValues.f40979a;
        Intrinsics.checkNotNullExpressionValue(map, "transitionValues.values");
        map.put("yandex:verticalTranslation:screenPosition", position);
    }
}

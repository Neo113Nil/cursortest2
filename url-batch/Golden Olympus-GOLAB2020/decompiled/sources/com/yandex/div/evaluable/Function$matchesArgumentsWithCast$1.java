package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class Function$matchesArgumentsWithCast$1 extends s implements Function2<EvaluableType, EvaluableType, Boolean> {
    final /* synthetic */ Function this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Function$matchesArgumentsWithCast$1(Function function) {
        super(2);
        this.this$0 = function;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Boolean invoke(@NotNull EvaluableType type, @NotNull EvaluableType declaredType) {
        boolean z4;
        boolean canCastTo;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(declaredType, "declaredType");
        if (type != declaredType) {
            canCastTo = this.this$0.canCastTo(type, declaredType);
            if (!canCastTo) {
                z4 = false;
                return Boolean.valueOf(z4);
            }
        }
        z4 = true;
        return Boolean.valueOf(z4);
    }
}

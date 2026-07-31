package com.yandex.div.core.view2.divs;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$observeValidators$2$1 extends s implements Function1<Boolean, Unit> {
    final /* synthetic */ int $index;
    final /* synthetic */ Function1<Integer, Unit> $revalidateExpressionValidator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DivInputBinder$observeValidators$2$1(Function1<? super Integer, Unit> function1, int i4) {
        super(1);
        this.$revalidateExpressionValidator = function1;
        this.$index = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f41027a;
    }

    public final void invoke(boolean z4) {
        this.$revalidateExpressionValidator.invoke(Integer.valueOf(this.$index));
    }
}

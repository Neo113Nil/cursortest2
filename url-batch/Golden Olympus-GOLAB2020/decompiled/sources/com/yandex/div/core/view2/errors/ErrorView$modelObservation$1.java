package com.yandex.div.core.view2.errors;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ErrorView$modelObservation$1 extends s implements Function1<ErrorViewModel, Unit> {
    final /* synthetic */ ErrorView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorView$modelObservation$1(ErrorView errorView) {
        super(1);
        this.this$0 = errorView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ErrorViewModel) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull ErrorViewModel m4) {
        Intrinsics.checkNotNullParameter(m4, "m");
        this.this$0.setViewModel(m4);
    }
}

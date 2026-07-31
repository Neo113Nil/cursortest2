package com.yandex.div.core.view2.errors;

import com.yandex.div.core.view2.Binding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ErrorVisualMonitor$connectOrDisconnect$1 extends s implements Function1<Binding, Unit> {
    final /* synthetic */ ErrorVisualMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorVisualMonitor$connectOrDisconnect$1(ErrorVisualMonitor errorVisualMonitor) {
        super(1);
        this.this$0 = errorVisualMonitor;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Binding) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Binding it) {
        ErrorModel errorModel;
        Intrinsics.checkNotNullParameter(it, "it");
        errorModel = this.this$0.errorModel;
        errorModel.bind(it);
    }
}

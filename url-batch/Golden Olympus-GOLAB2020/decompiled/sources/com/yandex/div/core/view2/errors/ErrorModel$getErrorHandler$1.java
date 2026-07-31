package com.yandex.div.core.view2.errors;

import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
/* synthetic */ class ErrorModel$getErrorHandler$1 extends p implements Function1<Throwable, Unit> {
    ErrorModel$getErrorHandler$1(Object obj) {
        super(1, obj, DivActionTypedUtilsKt.class, "logError", "logError(Lcom/yandex/div/core/view2/Div2View;Ljava/lang/Throwable;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Throwable p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        DivActionTypedUtilsKt.logError((Div2View) this.receiver, p02);
    }
}

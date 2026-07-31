package com.yandex.div.core;

import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.expression.variables.GlobalVariableController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class Div2Context$globalVariableController$2 extends s implements Function0<GlobalVariableController> {
    final /* synthetic */ Div2Context this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Div2Context$globalVariableController$2(Div2Context div2Context) {
        super(0);
        this.this$0 = div2Context;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final GlobalVariableController invoke() {
        DivVariableController divVariableController = this.this$0.getDiv2Component$div_release().getDivVariableController();
        Intrinsics.checkNotNullExpressionValue(divVariableController, "div2Component.divVariableController");
        return new GlobalVariableController(divVariableController);
    }
}

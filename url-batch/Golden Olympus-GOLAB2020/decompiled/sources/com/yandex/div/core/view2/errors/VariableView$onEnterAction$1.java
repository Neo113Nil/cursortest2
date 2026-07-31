package com.yandex.div.core.view2.errors;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class VariableView$onEnterAction$1 extends s implements Function1<String, Unit> {
    public static final VariableView$onEnterAction$1 INSTANCE = new VariableView$onEnterAction$1();

    VariableView$onEnterAction$1() {
        super(1);
    }

    public final void invoke(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.f41027a;
    }
}

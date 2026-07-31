package com.yandex.div.core.view2.divs;

import android.text.Editable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$createCallbacks$1$setViewStateChangeListener$1 extends s implements Function1<Editable, Unit> {
    final /* synthetic */ Function1<String, Unit> $valueUpdater;
    final /* synthetic */ DivInputBinder$createCallbacks$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DivInputBinder$createCallbacks$1$setViewStateChangeListener$1(DivInputBinder$createCallbacks$1 divInputBinder$createCallbacks$1, Function1<? super String, Unit> function1) {
        super(1);
        this.this$0 = divInputBinder$createCallbacks$1;
        this.$valueUpdater = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Editable) obj);
        return Unit.f41027a;
    }

    public final void invoke(@Nullable Editable editable) {
        this.this$0.applyMaskOrFilters(editable, this.$valueUpdater);
    }
}

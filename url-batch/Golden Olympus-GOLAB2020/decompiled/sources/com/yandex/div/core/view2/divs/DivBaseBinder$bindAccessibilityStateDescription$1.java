package com.yandex.div.core.view2.divs;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivBaseBinder$bindAccessibilityStateDescription$1 extends s implements Function1<String, Unit> {
    final /* synthetic */ View $this_bindAccessibilityStateDescription;
    final /* synthetic */ DivBaseBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivBaseBinder$bindAccessibilityStateDescription$1(DivBaseBinder divBaseBinder, View view) {
        super(1);
        this.this$0 = divBaseBinder;
        this.$this_bindAccessibilityStateDescription = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull String stateDescription) {
        Intrinsics.checkNotNullParameter(stateDescription, "stateDescription");
        this.this$0.applyAccessibilityStateDescription(this.$this_bindAccessibilityStateDescription, stateDescription);
    }
}

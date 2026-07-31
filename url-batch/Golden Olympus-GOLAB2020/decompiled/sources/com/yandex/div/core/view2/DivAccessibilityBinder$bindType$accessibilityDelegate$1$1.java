package com.yandex.div.core.view2;

import B.w;
import android.view.View;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivAccessibilityBinder$bindType$accessibilityDelegate$1$1 extends s implements Function2<View, w, Unit> {
    final /* synthetic */ DivAccessibilityBinder.AccessibilityType $accessibilityType;
    final /* synthetic */ DivAccessibilityBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivAccessibilityBinder$bindType$accessibilityDelegate$1$1(DivAccessibilityBinder divAccessibilityBinder, DivAccessibilityBinder.AccessibilityType accessibilityType) {
        super(2);
        this.this$0 = divAccessibilityBinder;
        this.$accessibilityType = accessibilityType;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((View) obj, (w) obj2);
        return Unit.f41027a;
    }

    public final void invoke(@Nullable View view, @Nullable w wVar) {
        if (wVar != null) {
            this.this$0.bindType(wVar, this.$accessibilityType);
        }
    }
}

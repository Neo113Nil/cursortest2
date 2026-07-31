package com.yandex.div.core.view2.divs;

import O1.C0839h0;
import O1.InterfaceC0752c3;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivBaseBinder$bindAccessibilityMode$1 extends s implements Function1<C0839h0.c, Unit> {
    final /* synthetic */ Div2View $divView;
    final /* synthetic */ InterfaceC0752c3 $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ View $this_bindAccessibilityMode;
    final /* synthetic */ DivBaseBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivBaseBinder$bindAccessibilityMode$1(DivBaseBinder divBaseBinder, View view, Div2View div2View, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver) {
        super(1);
        this.this$0 = divBaseBinder;
        this.$this_bindAccessibilityMode = view;
        this.$divView = div2View;
        this.$newDiv = interfaceC0752c3;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C0839h0.c) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull C0839h0.c mode) {
        C0839h0.d dVar;
        DivAccessibilityBinder divAccessibilityBinder;
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.this$0.applyAccessibilityMode(this.$this_bindAccessibilityMode, this.$divView, this.$newDiv, mode);
        C0839h0 d4 = this.$newDiv.d();
        if (d4 == null || (dVar = d4.f6321g) == null) {
            dVar = C0839h0.d.AUTO;
        }
        if (dVar == C0839h0.d.AUTO) {
            divAccessibilityBinder = this.this$0.divAccessibilityBinder;
            divAccessibilityBinder.bindType(this.$this_bindAccessibilityMode, this.$newDiv, dVar, this.$resolver);
        }
    }
}

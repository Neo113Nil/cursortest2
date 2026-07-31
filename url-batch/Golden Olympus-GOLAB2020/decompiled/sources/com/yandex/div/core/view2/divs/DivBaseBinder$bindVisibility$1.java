package com.yandex.div.core.view2.divs;

import O1.InterfaceC0752c3;
import O1.Vf;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivBaseBinder$bindVisibility$1 extends s implements Function1<Vf, Unit> {
    final /* synthetic */ Div2View $divView;
    final /* synthetic */ InterfaceC0752c3 $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ View $this_bindVisibility;
    final /* synthetic */ DivBaseBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivBaseBinder$bindVisibility$1(DivBaseBinder divBaseBinder, View view, Div2View div2View, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver) {
        super(1);
        this.this$0 = divBaseBinder;
        this.$this_bindVisibility = view;
        this.$divView = div2View;
        this.$newDiv = interfaceC0752c3;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Vf) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Vf it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.applyVisibility(this.$this_bindVisibility, this.$divView, this.$newDiv, this.$resolver, false);
    }
}

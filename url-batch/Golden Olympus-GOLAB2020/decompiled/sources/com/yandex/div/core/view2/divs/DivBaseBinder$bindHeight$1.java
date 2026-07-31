package com.yandex.div.core.view2.divs;

import O1.C0765cg;
import O1.InterfaceC0752c3;
import android.view.View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivBaseBinder$bindHeight$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ InterfaceC0752c3 $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ View $this_bindHeight;
    final /* synthetic */ DivBaseBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivBaseBinder$bindHeight$1(View view, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver, DivBaseBinder divBaseBinder) {
        super(1);
        this.$this_bindHeight = view;
        this.$newDiv = interfaceC0752c3;
        this.$resolver = expressionResolver;
        this.this$0 = divBaseBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m77invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m77invoke(@NotNull Object it) {
        C0765cg.c minSize;
        C0765cg.c maxSize;
        Intrinsics.checkNotNullParameter(it, "it");
        BaseDivViewExtensionsKt.applyHeight(this.$this_bindHeight, this.$newDiv, this.$resolver);
        BaseDivViewExtensionsKt.applyVerticalWeightValue(this.$this_bindHeight, BaseDivViewExtensionsKt.getWeight(this.$newDiv.getHeight(), this.$resolver));
        View view = this.$this_bindHeight;
        minSize = this.this$0.getMinSize(this.$newDiv.getHeight());
        BaseDivViewExtensionsKt.applyMinHeight(view, minSize, this.$resolver);
        View view2 = this.$this_bindHeight;
        maxSize = this.this$0.getMaxSize(this.$newDiv.getHeight());
        BaseDivViewExtensionsKt.applyMaxHeight(view2, maxSize, this.$resolver);
    }
}

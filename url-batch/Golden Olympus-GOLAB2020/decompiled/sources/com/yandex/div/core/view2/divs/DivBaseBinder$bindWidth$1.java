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
final class DivBaseBinder$bindWidth$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ InterfaceC0752c3 $newDiv;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ View $this_bindWidth;
    final /* synthetic */ DivBaseBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivBaseBinder$bindWidth$1(View view, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver, DivBaseBinder divBaseBinder) {
        super(1);
        this.$this_bindWidth = view;
        this.$newDiv = interfaceC0752c3;
        this.$resolver = expressionResolver;
        this.this$0 = divBaseBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m81invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m81invoke(@NotNull Object it) {
        C0765cg.c minSize;
        C0765cg.c maxSize;
        Intrinsics.checkNotNullParameter(it, "it");
        BaseDivViewExtensionsKt.applyWidth(this.$this_bindWidth, this.$newDiv, this.$resolver);
        BaseDivViewExtensionsKt.applyHorizontalWeightValue(this.$this_bindWidth, BaseDivViewExtensionsKt.getWeight(this.$newDiv.getWidth(), this.$resolver));
        View view = this.$this_bindWidth;
        minSize = this.this$0.getMinSize(this.$newDiv.getWidth());
        BaseDivViewExtensionsKt.applyMinWidth(view, minSize, this.$resolver);
        View view2 = this.$this_bindWidth;
        maxSize = this.this$0.getMaxSize(this.$newDiv.getWidth());
        BaseDivViewExtensionsKt.applyMaxWidth(view2, maxSize, this.$resolver);
    }
}

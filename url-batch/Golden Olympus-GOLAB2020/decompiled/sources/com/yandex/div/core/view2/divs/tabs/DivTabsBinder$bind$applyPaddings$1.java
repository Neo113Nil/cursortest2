package com.yandex.div.core.view2.divs.tabs;

import O1.C1013qd;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivTabsBinder$bind$applyPaddings$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ C1013qd $div;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivTabsLayout $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTabsBinder$bind$applyPaddings$1(DivTabsLayout divTabsLayout, C1013qd c1013qd, ExpressionResolver expressionResolver) {
        super(1);
        this.$this_bind = divTabsLayout;
        this.$div = c1013qd;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m152invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m152invoke(@Nullable Object obj) {
        BaseDivViewExtensionsKt.applyPaddings(this.$this_bind.getTitleLayout(), this.$div.f7599E, this.$resolver);
    }
}

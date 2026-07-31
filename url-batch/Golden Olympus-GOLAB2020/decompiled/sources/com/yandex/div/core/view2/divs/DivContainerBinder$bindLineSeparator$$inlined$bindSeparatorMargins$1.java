package com.yandex.div.core.view2.divs;

import O1.C0754c5;
import android.content.res.Resources;
import android.graphics.Rect;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorMargins$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ C0754c5 $margins;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ ExpressionResolver $resolver$inlined;
    final /* synthetic */ DivWrapLayout $this_bindLineSeparator$inlined;
    final /* synthetic */ DivContainerBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorMargins$1(C0754c5 c0754c5, ExpressionResolver expressionResolver, DivContainerBinder divContainerBinder, DivWrapLayout divWrapLayout, ExpressionResolver expressionResolver2) {
        super(1);
        this.$margins = c0754c5;
        this.$resolver = expressionResolver;
        this.this$0 = divContainerBinder;
        this.$this_bindLineSeparator$inlined = divWrapLayout;
        this.$resolver$inlined = expressionResolver2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m82invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m82invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        C0754c5 c0754c5 = this.$margins;
        DivContainerBinder divContainerBinder = this.this$0;
        Resources resources = this.$this_bindLineSeparator$inlined.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        Rect rect = divContainerBinder.toRect(c0754c5, resources, this.$resolver$inlined);
        this.$this_bindLineSeparator$inlined.setLineSeparatorMargins(rect.left, rect.top, rect.right, rect.bottom);
    }
}

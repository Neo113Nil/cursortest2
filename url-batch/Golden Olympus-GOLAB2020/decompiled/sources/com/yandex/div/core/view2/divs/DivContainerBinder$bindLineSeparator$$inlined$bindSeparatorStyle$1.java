package com.yandex.div.core.view2.divs;

import O1.R3;
import O1.X4;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
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
public final class DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorStyle$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ R3.e $newSeparator;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ ExpressionResolver $resolver$inlined;
    final /* synthetic */ DivWrapLayout $this_bindLineSeparator$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivContainerBinder$bindLineSeparator$$inlined$bindSeparatorStyle$1(R3.e eVar, ExpressionResolver expressionResolver, DivWrapLayout divWrapLayout, ExpressionResolver expressionResolver2) {
        super(1);
        this.$newSeparator = eVar;
        this.$resolver = expressionResolver;
        this.$this_bindLineSeparator$inlined = divWrapLayout;
        this.$resolver$inlined = expressionResolver2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m84invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m84invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        R3.e eVar = this.$newSeparator;
        Drawable drawable = null;
        X4 x4 = eVar != null ? eVar.f4593e : null;
        DivWrapLayout divWrapLayout = this.$this_bindLineSeparator$inlined;
        if (x4 != null) {
            DisplayMetrics displayMetrics = divWrapLayout.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            drawable = BaseDivViewExtensionsKt.toDrawable(x4, displayMetrics, this.$resolver$inlined);
        }
        divWrapLayout.setLineSeparatorDrawable(drawable);
    }
}

package com.yandex.div.core.view2.divs.tabs;

import O1.C0754c5;
import O1.C1013qd;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.widget.tabs.TabTitlesLayoutView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivTabsBinder$observeHeight$applyHeight$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ C1013qd $div;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ TabTitlesLayoutView<?> $this_observeHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTabsBinder$observeHeight$applyHeight$1(C1013qd c1013qd, ExpressionResolver expressionResolver, TabTitlesLayoutView<?> tabTitlesLayoutView) {
        super(1);
        this.$div = c1013qd;
        this.$resolver = expressionResolver;
        this.$this_observeHeight = tabTitlesLayoutView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m156invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m156invoke(@Nullable Object obj) {
        C1013qd.e eVar = this.$div.f7598D;
        if (eVar == null) {
            eVar = DivTabsBinder.DEFAULT_TAB_TITLE_STYLE;
        }
        C0754c5 c0754c5 = eVar.f7689t;
        C0754c5 c0754c52 = this.$div.f7599E;
        Expression expression = eVar.f7688s;
        long longValue = (expression != null ? ((Number) expression.evaluate(this.$resolver)).longValue() : (long) (((Number) eVar.f7679j.evaluate(this.$resolver)).floatValue() * 1.3f)) + ((Number) c0754c5.f5855f.evaluate(this.$resolver)).longValue() + ((Number) c0754c5.f5850a.evaluate(this.$resolver)).longValue() + ((Number) c0754c52.f5855f.evaluate(this.$resolver)).longValue() + ((Number) c0754c52.f5850a.evaluate(this.$resolver)).longValue();
        DisplayMetrics metrics = this.$this_observeHeight.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = this.$this_observeHeight.getLayoutParams();
        Long valueOf = Long.valueOf(longValue);
        Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
        layoutParams.height = BaseDivViewExtensionsKt.spToPx(valueOf, metrics);
    }
}

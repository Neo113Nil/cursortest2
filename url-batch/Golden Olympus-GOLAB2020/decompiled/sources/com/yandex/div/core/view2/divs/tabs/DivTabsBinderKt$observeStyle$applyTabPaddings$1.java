package com.yandex.div.core.view2.divs.tabs;

import O1.C0754c5;
import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.widget.tabs.TabView;
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
final class DivTabsBinderKt$observeStyle$applyTabPaddings$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ DisplayMetrics $metrics;
    final /* synthetic */ C0754c5 $paddings;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ TabView $this_observeStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTabsBinderKt$observeStyle$applyTabPaddings$1(C0754c5 c0754c5, TabView tabView, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics) {
        super(1);
        this.$paddings = c0754c5;
        this.$this_observeStyle = tabView;
        this.$resolver = expressionResolver;
        this.$metrics = displayMetrics;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m158invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m158invoke(@Nullable Object obj) {
        C0754c5 c0754c5 = this.$paddings;
        Expression expression = c0754c5.f5854e;
        if (expression == null && c0754c5.f5851b == null) {
            TabView tabView = this.$this_observeStyle;
            Long l4 = (Long) c0754c5.f5852c.evaluate(this.$resolver);
            DisplayMetrics metrics = this.$metrics;
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            int dpToPx = BaseDivViewExtensionsKt.dpToPx(l4, metrics);
            Long l5 = (Long) this.$paddings.f5855f.evaluate(this.$resolver);
            DisplayMetrics metrics2 = this.$metrics;
            Intrinsics.checkNotNullExpressionValue(metrics2, "metrics");
            int dpToPx2 = BaseDivViewExtensionsKt.dpToPx(l5, metrics2);
            Long l6 = (Long) this.$paddings.f5853d.evaluate(this.$resolver);
            DisplayMetrics metrics3 = this.$metrics;
            Intrinsics.checkNotNullExpressionValue(metrics3, "metrics");
            int dpToPx3 = BaseDivViewExtensionsKt.dpToPx(l6, metrics3);
            Long l7 = (Long) this.$paddings.f5850a.evaluate(this.$resolver);
            DisplayMetrics metrics4 = this.$metrics;
            Intrinsics.checkNotNullExpressionValue(metrics4, "metrics");
            tabView.setTabPadding(dpToPx, dpToPx2, dpToPx3, BaseDivViewExtensionsKt.dpToPx(l7, metrics4));
            return;
        }
        TabView tabView2 = this.$this_observeStyle;
        Long l8 = expression != null ? (Long) expression.evaluate(this.$resolver) : null;
        DisplayMetrics metrics5 = this.$metrics;
        Intrinsics.checkNotNullExpressionValue(metrics5, "metrics");
        int dpToPx4 = BaseDivViewExtensionsKt.dpToPx(l8, metrics5);
        Long l9 = (Long) this.$paddings.f5855f.evaluate(this.$resolver);
        DisplayMetrics metrics6 = this.$metrics;
        Intrinsics.checkNotNullExpressionValue(metrics6, "metrics");
        int dpToPx5 = BaseDivViewExtensionsKt.dpToPx(l9, metrics6);
        Expression expression2 = this.$paddings.f5851b;
        Long l10 = expression2 != null ? (Long) expression2.evaluate(this.$resolver) : null;
        DisplayMetrics metrics7 = this.$metrics;
        Intrinsics.checkNotNullExpressionValue(metrics7, "metrics");
        int dpToPx6 = BaseDivViewExtensionsKt.dpToPx(l10, metrics7);
        Long l11 = (Long) this.$paddings.f5850a.evaluate(this.$resolver);
        DisplayMetrics metrics8 = this.$metrics;
        Intrinsics.checkNotNullExpressionValue(metrics8, "metrics");
        tabView2.setTabPadding(dpToPx4, dpToPx5, dpToPx6, BaseDivViewExtensionsKt.dpToPx(l11, metrics8));
    }
}

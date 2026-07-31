package com.yandex.div.core.widget;

import android.view.View;
import androidx.core.view.AbstractC1293g0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ViewPager2Wrapper$findMaxChildDimension$1 extends s implements Function1<RecyclerView, Unit> {
    final /* synthetic */ Function2<RecyclerView.p, View, Integer> $decoratedDimensionGetter;
    final /* synthetic */ E $maxValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ViewPager2Wrapper$findMaxChildDimension$1(E e4, Function2<? super RecyclerView.p, ? super View, Integer> function2) {
        super(1);
        this.$maxValue = e4;
        this.$decoratedDimensionGetter = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RecyclerView) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull RecyclerView withRecyclerView) {
        Intrinsics.checkNotNullParameter(withRecyclerView, "$this$withRecyclerView");
        Sequence<View> b4 = AbstractC1293g0.b(withRecyclerView);
        E e4 = this.$maxValue;
        Function2<RecyclerView.p, View, Integer> function2 = this.$decoratedDimensionGetter;
        for (View view : b4) {
            RecyclerView.p it = withRecyclerView.getLayoutManager();
            if (it != null) {
                int i4 = e4.f41130b;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                e4.f41130b = Math.max(i4, ((Number) function2.invoke(it, view)).intValue());
            }
        }
    }
}

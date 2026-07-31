package com.yandex.div.core.widget;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ViewPager2Wrapper$setRecycledViewPool$1 extends s implements Function1<RecyclerView, Unit> {
    final /* synthetic */ RecyclerView.v $viewPool;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewPager2Wrapper$setRecycledViewPool$1(RecyclerView.v vVar) {
        super(1);
        this.$viewPool = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RecyclerView) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull RecyclerView withRecyclerView) {
        Intrinsics.checkNotNullParameter(withRecyclerView, "$this$withRecyclerView");
        withRecyclerView.setRecycledViewPool(this.$viewPool);
    }
}

package com.yandex.div.core.widget;

import android.view.View;
import androidx.core.view.AbstractC1293g0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class ViewPager2Wrapper$orientation$1 extends s implements Function1<RecyclerView, Unit> {
    public static final ViewPager2Wrapper$orientation$1 INSTANCE = new ViewPager2Wrapper$orientation$1();

    ViewPager2Wrapper$orientation$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RecyclerView) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull RecyclerView withRecyclerView) {
        Intrinsics.checkNotNullParameter(withRecyclerView, "$this$withRecyclerView");
        withRecyclerView.getRecycledViewPool().clear();
        for (View view : AbstractC1293g0.b(withRecyclerView)) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }
}

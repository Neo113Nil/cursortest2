package com.yandex.div.core.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
/* synthetic */ class ViewPager2Wrapper$onMeasure$maxHeight$1 extends p implements Function2<RecyclerView.p, View, Integer> {
    public static final ViewPager2Wrapper$onMeasure$maxHeight$1 INSTANCE = new ViewPager2Wrapper$onMeasure$maxHeight$1();

    ViewPager2Wrapper$onMeasure$maxHeight$1() {
        super(2, RecyclerView.p.class, "getDecoratedMeasuredHeight", "getDecoratedMeasuredHeight(Landroid/view/View;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Integer invoke(@NotNull RecyclerView.p p02, @NotNull View p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return Integer.valueOf(p02.getDecoratedMeasuredHeight(p12));
    }
}

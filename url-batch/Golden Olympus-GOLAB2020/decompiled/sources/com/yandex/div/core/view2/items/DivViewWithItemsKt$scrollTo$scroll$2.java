package com.yandex.div.core.view2.items;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.p;

@Metadata
/* loaded from: classes2.dex */
/* synthetic */ class DivViewWithItemsKt$scrollTo$scroll$2 extends p implements Function2<Integer, Integer, Unit> {
    DivViewWithItemsKt$scrollTo$scroll$2(Object obj) {
        super(2, obj, RecyclerView.class, "scrollBy", "scrollBy(II)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
        return Unit.f41027a;
    }

    public final void invoke(int i4, int i5) {
        ((RecyclerView) this.receiver).scrollBy(i4, i5);
    }
}

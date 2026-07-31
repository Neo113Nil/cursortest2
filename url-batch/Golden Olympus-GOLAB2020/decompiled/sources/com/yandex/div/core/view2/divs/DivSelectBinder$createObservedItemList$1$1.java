package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivSelectBinder$createObservedItemList$1$1 extends s implements Function1<String, Unit> {
    final /* synthetic */ int $index;
    final /* synthetic */ List<String> $itemList;
    final /* synthetic */ DivSelectView $this_createObservedItemList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivSelectBinder$createObservedItemList$1$1(List<String> list, int i4, DivSelectView divSelectView) {
        super(1);
        this.$itemList = list;
        this.$index = i4;
        this.$this_createObservedItemList = divSelectView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$itemList.set(this.$index, it);
        this.$this_createObservedItemList.setItems(this.$itemList);
    }
}

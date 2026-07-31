package com.yandex.div.core.view2.divs;

import O1.C0939mb;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivSelectBinder$applyOptions$1 extends s implements Function1<Integer, Unit> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ C0939mb $div;
    final /* synthetic */ List<String> $itemList;
    final /* synthetic */ DivSelectView $this_applyOptions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivSelectBinder$applyOptions$1(DivSelectView divSelectView, List<String> list, C0939mb c0939mb, BindingContext bindingContext) {
        super(1);
        this.$this_applyOptions = divSelectView;
        this.$itemList = list;
        this.$div = c0939mb;
        this.$bindingContext = bindingContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.f41027a;
    }

    public final void invoke(int i4) {
        this.$this_applyOptions.setText(this.$itemList.get(i4));
        Function1<String, Unit> valueUpdater = this.$this_applyOptions.getValueUpdater();
        if (valueUpdater != null) {
            valueUpdater.invoke(((C0939mb.c) this.$div.f7041A.get(i4)).f7091b.evaluate(this.$bindingContext.getExpressionResolver()));
        }
    }
}

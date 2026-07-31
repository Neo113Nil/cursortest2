package com.yandex.div.core.view2.divs;

import O1.O6;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivImageBinder$bindFilters$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ O6 $newDiv;
    final /* synthetic */ DivImageView $this_bindFilters;
    final /* synthetic */ DivImageBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivImageBinder$bindFilters$callback$1(DivImageBinder divImageBinder, DivImageView divImageView, BindingContext bindingContext, O6 o6) {
        super(1);
        this.this$0 = divImageBinder;
        this.$this_bindFilters = divImageView;
        this.$bindingContext = bindingContext;
        this.$newDiv = o6;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m99invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m99invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.applyFiltersAndSetBitmap(this.$this_bindFilters, this.$bindingContext, this.$newDiv.f4260t);
    }
}

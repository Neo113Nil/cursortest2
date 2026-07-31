package com.yandex.div.core.view2.divs;

import O1.Kd;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivTextBinder$bindRichEllipsis$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ Kd $newDiv;
    final /* synthetic */ DivLineHeightTextView $this_bindRichEllipsis;
    final /* synthetic */ DivTextBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTextBinder$bindRichEllipsis$callback$1(DivTextBinder divTextBinder, DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, Kd kd) {
        super(1);
        this.this$0 = divTextBinder;
        this.$this_bindRichEllipsis = divLineHeightTextView;
        this.$bindingContext = bindingContext;
        this.$newDiv = kd;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m137invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m137invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.applyRichEllipsis(this.$this_bindRichEllipsis, this.$bindingContext, this.$newDiv);
    }
}

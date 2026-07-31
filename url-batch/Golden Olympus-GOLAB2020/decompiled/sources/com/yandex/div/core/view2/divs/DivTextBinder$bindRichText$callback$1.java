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
final class DivTextBinder$bindRichText$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ Kd $newDiv;
    final /* synthetic */ DivLineHeightTextView $this_bindRichText;
    final /* synthetic */ DivTextBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTextBinder$bindRichText$callback$1(DivTextBinder divTextBinder, DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, Kd kd) {
        super(1);
        this.this$0 = divTextBinder;
        this.$this_bindRichText = divLineHeightTextView;
        this.$bindingContext = bindingContext;
        this.$newDiv = kd;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m138invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m138invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.applyRichText(this.$this_bindRichText, this.$bindingContext, this.$newDiv);
    }
}

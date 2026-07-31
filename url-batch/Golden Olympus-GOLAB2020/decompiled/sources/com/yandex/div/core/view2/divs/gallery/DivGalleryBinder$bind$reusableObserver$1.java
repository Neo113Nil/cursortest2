package com.yandex.div.core.view2.divs.gallery;

import O1.C0970o6;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivGalleryBinder$bind$reusableObserver$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ C0970o6 $div;
    final /* synthetic */ DivRecyclerView $this_bind;
    final /* synthetic */ DivGalleryBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivGalleryBinder$bind$reusableObserver$1(DivGalleryBinder divGalleryBinder, DivRecyclerView divRecyclerView, BindingContext bindingContext, C0970o6 c0970o6) {
        super(1);
        this.this$0 = divGalleryBinder;
        this.$this_bind = divRecyclerView;
        this.$bindingContext = bindingContext;
        this.$div = c0970o6;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m146invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m146invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.updateDecorations(this.$this_bind, this.$bindingContext, this.$div);
    }
}

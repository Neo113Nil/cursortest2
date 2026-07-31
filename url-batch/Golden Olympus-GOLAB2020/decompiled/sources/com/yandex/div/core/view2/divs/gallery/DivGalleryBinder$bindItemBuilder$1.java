package com.yandex.div.core.view2.divs.gallery;

import O1.H3;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivGalleryBinder$bindItemBuilder$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ H3 $builder;
    final /* synthetic */ BindingContext $context;
    final /* synthetic */ DivRecyclerView $this_bindItemBuilder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivGalleryBinder$bindItemBuilder$1(DivRecyclerView divRecyclerView, H3 h32, BindingContext bindingContext) {
        super(1);
        this.$this_bindItemBuilder = divRecyclerView;
        this.$builder = h32;
        this.$context = bindingContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m147invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m147invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DivGalleryAdapter divGalleryAdapter = (DivGalleryAdapter) this.$this_bindItemBuilder.getAdapter();
        if (divGalleryAdapter != null) {
            divGalleryAdapter.setItems(DivCollectionExtensionsKt.build(this.$builder, this.$context.getDivView(), this.$context.getExpressionResolver()));
        }
    }
}

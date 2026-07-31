package com.yandex.div.core.view2.divs;

import O1.H3;
import O1.R3;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivCollectionHolder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivContainerBinder$bindItemBuilder$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ H3 $builder;
    final /* synthetic */ BindingContext $context;
    final /* synthetic */ R3 $div;
    final /* synthetic */ ErrorCollector $errorCollector;
    final /* synthetic */ DivStatePath $path;
    final /* synthetic */ ViewGroup $this_bindItemBuilder;
    final /* synthetic */ DivContainerBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivContainerBinder$bindItemBuilder$1(H3 h32, BindingContext bindingContext, ViewGroup viewGroup, DivContainerBinder divContainerBinder, R3 r32, DivStatePath divStatePath, ErrorCollector errorCollector) {
        super(1);
        this.$builder = h32;
        this.$context = bindingContext;
        this.$this_bindItemBuilder = viewGroup;
        this.this$0 = divContainerBinder;
        this.$div = r32;
        this.$path = divStatePath;
        this.$errorCollector = errorCollector;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m94invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m94invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<DivItemBuilderResult> build = DivCollectionExtensionsKt.build(this.$builder, this.$context.getDivView(), this.$context.getExpressionResolver());
        ViewParent viewParent = this.$this_bindItemBuilder;
        Intrinsics.checkNotNull(viewParent, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivCollectionHolder");
        List<DivItemBuilderResult> items = ((DivCollectionHolder) viewParent).getItems();
        if (items == null) {
            items = CollectionsKt.emptyList();
        }
        List<DivItemBuilderResult> list = items;
        this.this$0.replaceWithReuse(this.$this_bindItemBuilder, this.$context.getDivView(), list, build);
        DivContainerBinder divContainerBinder = this.this$0;
        ViewGroup viewGroup = this.$this_bindItemBuilder;
        BindingContext bindingContext = this.$context;
        R3 r32 = this.$div;
        divContainerBinder.applyItems(viewGroup, bindingContext, r32, r32, build, list, this.$path, this.$errorCollector);
    }
}

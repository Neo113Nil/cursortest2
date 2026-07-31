package com.yandex.div.core.view2.divs;

import O1.X2;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.div.core.view2.BindingContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivBackgroundBinder$bindFocusBackground$callback$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ BindingContext $context;
    final /* synthetic */ Drawable $newAdditionalLayer;
    final /* synthetic */ List<X2> $newDefaultBackgroundList;
    final /* synthetic */ List<X2> $newFocusedBackgroundList;
    final /* synthetic */ View $view;
    final /* synthetic */ DivBackgroundBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DivBackgroundBinder$bindFocusBackground$callback$1(DivBackgroundBinder divBackgroundBinder, View view, BindingContext bindingContext, Drawable drawable, List<? extends X2> list, List<? extends X2> list2) {
        super(1);
        this.this$0 = divBackgroundBinder;
        this.$view = view;
        this.$context = bindingContext;
        this.$newAdditionalLayer = drawable;
        this.$newDefaultBackgroundList = list;
        this.$newFocusedBackgroundList = list2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m74invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m74invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        this.this$0.applyFocusedBackground(this.$view, this.$context, this.$newAdditionalLayer, this.$newDefaultBackgroundList, this.$newFocusedBackgroundList);
    }
}

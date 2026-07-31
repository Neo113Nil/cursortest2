package com.yandex.div.core.view2.divs;

import O1.O6;
import android.net.Uri;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivImageBinder$bindPreviewAndImage$1 extends s implements Function1<Uri, Unit> {
    final /* synthetic */ BindingContext $context;
    final /* synthetic */ ErrorCollector $errorCollector;
    final /* synthetic */ O6 $newDiv;
    final /* synthetic */ DivImageView $this_bindPreviewAndImage;
    final /* synthetic */ DivImageBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivImageBinder$bindPreviewAndImage$1(DivImageBinder divImageBinder, DivImageView divImageView, BindingContext bindingContext, O6 o6, ErrorCollector errorCollector) {
        super(1);
        this.this$0 = divImageBinder;
        this.$this_bindPreviewAndImage = divImageView;
        this.$context = bindingContext;
        this.$newDiv = o6;
        this.$errorCollector = errorCollector;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Uri) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.applyImage(this.$this_bindPreviewAndImage, this.$context, this.$newDiv, this.$errorCollector);
    }
}

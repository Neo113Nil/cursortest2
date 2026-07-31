package com.yandex.div.core.view2.divs;

import O1.EnumC0770d3;
import O1.O6;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivImageBinder$applyPlaceholders$2 extends s implements Function1<ImageRepresentation, Unit> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ O6 $div;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivImageView $this_applyPlaceholders;
    final /* synthetic */ DivImageBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivImageBinder$applyPlaceholders$2(DivImageView divImageView, DivImageBinder divImageBinder, BindingContext bindingContext, O6 o6, ExpressionResolver expressionResolver) {
        super(1);
        this.$this_applyPlaceholders = divImageView;
        this.this$0 = divImageBinder;
        this.$bindingContext = bindingContext;
        this.$div = o6;
        this.$resolver = expressionResolver;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ImageRepresentation) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull ImageRepresentation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.$this_applyPlaceholders.isImageLoaded()) {
            return;
        }
        if (!(it instanceof ImageRepresentation.Bitmap)) {
            if (it instanceof ImageRepresentation.PictureDrawable) {
                this.$this_applyPlaceholders.previewLoaded();
                this.$this_applyPlaceholders.setImageDrawable(((ImageRepresentation.PictureDrawable) it).m55unboximpl());
                return;
            }
            return;
        }
        this.$this_applyPlaceholders.setCurrentBitmapWithoutFilters$div_release(((ImageRepresentation.Bitmap) it).m49unboximpl());
        this.this$0.applyFiltersAndSetBitmap(this.$this_applyPlaceholders, this.$bindingContext, this.$div.f4260t);
        this.$this_applyPlaceholders.previewLoaded();
        DivImageBinder divImageBinder = this.this$0;
        DivImageView divImageView = this.$this_applyPlaceholders;
        Expression expression = this.$div.f4226P;
        divImageBinder.applyTint(divImageView, expression != null ? (Integer) expression.evaluate(this.$resolver) : null, (EnumC0770d3) this.$div.f4227Q.evaluate(this.$resolver));
    }
}

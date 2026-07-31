package com.yandex.div.core.view2.divs;

import O1.C1167z6;
import android.net.Uri;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivGifImageBinder$bind$2 extends s implements Function1<Uri, Unit> {
    final /* synthetic */ C1167z6 $div;
    final /* synthetic */ Div2View $divView;
    final /* synthetic */ ErrorCollector $errorCollector;
    final /* synthetic */ ExpressionResolver $expressionResolver;
    final /* synthetic */ DivGifImageView $this_bind;
    final /* synthetic */ DivGifImageBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivGifImageBinder$bind$2(DivGifImageBinder divGifImageBinder, DivGifImageView divGifImageView, Div2View div2View, ExpressionResolver expressionResolver, C1167z6 c1167z6, ErrorCollector errorCollector) {
        super(1);
        this.this$0 = divGifImageBinder;
        this.$this_bind = divGifImageView;
        this.$divView = div2View;
        this.$expressionResolver = expressionResolver;
        this.$div = c1167z6;
        this.$errorCollector = errorCollector;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Uri) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Uri it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.this$0.applyGifImage(this.$this_bind, this.$divView, this.$expressionResolver, this.$div, this.$errorCollector);
    }
}

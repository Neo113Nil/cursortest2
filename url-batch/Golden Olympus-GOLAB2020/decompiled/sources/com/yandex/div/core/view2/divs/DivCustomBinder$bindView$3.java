package com.yandex.div.core.view2.divs;

import O1.C1039s4;
import android.view.View;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivCustomBinder$bindView$3 extends s implements Function1<View, Unit> {
    final /* synthetic */ C1039s4 $divValue;
    final /* synthetic */ Div2View $divView;
    final /* synthetic */ DivStatePath $path;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivCustomBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivCustomBinder$bindView$3(DivCustomBinder divCustomBinder, C1039s4 c1039s4, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        super(1);
        this.this$0 = divCustomBinder;
        this.$divValue = c1039s4;
        this.$divView = div2View;
        this.$resolver = expressionResolver;
        this.$path = divStatePath;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull View it) {
        DivCustomContainerViewAdapter divCustomContainerViewAdapter;
        Intrinsics.checkNotNullParameter(it, "it");
        divCustomContainerViewAdapter = this.this$0.divCustomContainerViewAdapter;
        divCustomContainerViewAdapter.bindView(it, this.$divValue, this.$divView, this.$resolver, this.$path);
    }
}

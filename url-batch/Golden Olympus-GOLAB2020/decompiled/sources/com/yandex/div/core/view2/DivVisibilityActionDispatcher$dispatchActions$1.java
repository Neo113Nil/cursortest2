package com.yandex.div.core.view2;

import O1.Xb;
import android.view.View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivVisibilityActionDispatcher$dispatchActions$1 extends s implements Function0<Unit> {
    final /* synthetic */ Xb[] $actions;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ Div2View $scope;
    final /* synthetic */ View $view;
    final /* synthetic */ DivVisibilityActionDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivVisibilityActionDispatcher$dispatchActions$1(Xb[] xbArr, DivVisibilityActionDispatcher divVisibilityActionDispatcher, Div2View div2View, ExpressionResolver expressionResolver, View view) {
        super(0);
        this.$actions = xbArr;
        this.this$0 = divVisibilityActionDispatcher;
        this.$scope = div2View;
        this.$resolver = expressionResolver;
        this.$view = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m61invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m61invoke() {
        Xb[] xbArr = this.$actions;
        DivVisibilityActionDispatcher divVisibilityActionDispatcher = this.this$0;
        Div2View div2View = this.$scope;
        ExpressionResolver expressionResolver = this.$resolver;
        View view = this.$view;
        for (Xb xb : xbArr) {
            divVisibilityActionDispatcher.dispatchAction(div2View, expressionResolver, view, xb);
        }
    }
}

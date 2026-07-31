package com.yandex.div.core.view2;

import O1.C1165z4;
import android.view.View;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.json.ParsingException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class Div2View$buildViewAsyncAndUpdateState$1 extends s implements Function0<Unit> {
    final /* synthetic */ C1165z4.c $newState;
    final /* synthetic */ DivStatePath $path;
    final /* synthetic */ View $view;
    final /* synthetic */ Div2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Div2View$buildViewAsyncAndUpdateState$1(Div2View div2View, View view, C1165z4.c cVar, DivStatePath divStatePath) {
        super(0);
        this.this$0 = div2View;
        this.$view = view;
        this.$newState = cVar;
        this.$path = divStatePath;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m58invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m58invoke() {
        boolean isExpressionResolveFail;
        Div2View div2View = this.this$0;
        View view = this.$view;
        C1165z4.c cVar = this.$newState;
        try {
            div2View.getDiv2Component$div_release().getDivBinder().bind(div2View.getBindingContext$div_release(), view, cVar.f8721a, this.$path);
        } catch (ParsingException e4) {
            isExpressionResolveFail = ExpressionFallbacksHelperKt.isExpressionResolveFail(e4);
            if (!isExpressionResolveFail) {
                throw e4;
            }
        }
        this.this$0.getDiv2Component$div_release().getDivBinder().attachIndicators$div_release();
    }
}

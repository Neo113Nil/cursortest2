package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.core.VariableMutationHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata
/* loaded from: classes2.dex */
final class TwoWayVariableBinder$bindVariable$1<T> extends s implements Function1<T, Unit> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ Div2View $divView;
    final /* synthetic */ G $pendingValue;
    final /* synthetic */ String $variableName;
    final /* synthetic */ TwoWayVariableBinder<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TwoWayVariableBinder$bindVariable$1(G g4, Div2View div2View, String str, TwoWayVariableBinder<T> twoWayVariableBinder, BindingContext bindingContext) {
        super(1);
        this.$pendingValue = g4;
        this.$divView = div2View;
        this.$variableName = str;
        this.this$0 = twoWayVariableBinder;
        this.$bindingContext = bindingContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m37invoke((TwoWayVariableBinder$bindVariable$1<T>) obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m37invoke(T t4) {
        if (Intrinsics.areEqual(this.$pendingValue.f41132b, t4)) {
            return;
        }
        this.$pendingValue.f41132b = t4;
        VariableMutationHandler.Companion.setVariable(this.$divView, this.$variableName, this.this$0.toStringValue(t4), this.$bindingContext.getExpressionResolver());
    }
}

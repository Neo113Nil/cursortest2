package com.yandex.div.core.view2.divs;

import O1.C0887jd;
import O1.Z;
import com.yandex.div.core.expression.variables.TwoWayBooleanVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivSwitchBinder extends DivViewBinder<Z.p, C0887jd, DivSwitchView> {

    @NotNull
    private final TwoWayBooleanVariableBinder variableBinder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivSwitchBinder(@NotNull DivBaseBinder baseBinder, @NotNull TwoWayBooleanVariableBinder variableBinder) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        Intrinsics.checkNotNullParameter(variableBinder, "variableBinder");
        this.variableBinder = variableBinder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyIsEnabled(DivSwitchView divSwitchView, C0887jd c0887jd, ExpressionResolver expressionResolver) {
        divSwitchView.setEnabled(((Boolean) c0887jd.f6720o.evaluate(expressionResolver)).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyOnColor(DivSwitchView divSwitchView, C0887jd c0887jd, ExpressionResolver expressionResolver) {
        Expression expression = c0887jd.f6724s;
        divSwitchView.setColorOn(expression != null ? (Integer) expression.evaluate(expressionResolver) : null);
    }

    private final void bindIsEnabled(DivSwitchView divSwitchView, C0887jd c0887jd, C0887jd c0887jd2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(c0887jd.f6720o, c0887jd2 != null ? c0887jd2.f6720o : null)) {
            return;
        }
        applyIsEnabled(divSwitchView, c0887jd, expressionResolver);
        if (ExpressionsKt.isConstant(c0887jd.f6720o)) {
            return;
        }
        divSwitchView.addSubscription(c0887jd.f6720o.observe(expressionResolver, new DivSwitchBinder$bindIsEnabled$callback$1(this, divSwitchView, c0887jd, expressionResolver)));
    }

    private final void bindOnColor(DivSwitchView divSwitchView, C0887jd c0887jd, C0887jd c0887jd2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(c0887jd.f6724s, c0887jd2 != null ? c0887jd2.f6724s : null)) {
            return;
        }
        applyOnColor(divSwitchView, c0887jd, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(c0887jd.f6724s)) {
            return;
        }
        DivSwitchBinder$bindOnColor$callback$1 divSwitchBinder$bindOnColor$callback$1 = new DivSwitchBinder$bindOnColor$callback$1(this, divSwitchView, c0887jd, expressionResolver);
        Expression expression = c0887jd.f6724s;
        divSwitchView.addSubscription(expression != null ? expression.observe(expressionResolver, divSwitchBinder$bindOnColor$callback$1) : null);
    }

    private final void observeVariable(final DivSwitchView divSwitchView, C0887jd c0887jd, BindingContext bindingContext, DivStatePath divStatePath) {
        divSwitchView.addSubscription(this.variableBinder.bindVariable(bindingContext, c0887jd.f6721p, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivSwitchBinder$observeVariable$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull Function1<? super Boolean, Unit> valueUpdater) {
                Intrinsics.checkNotNullParameter(valueUpdater, "valueUpdater");
                DivSwitchView.this.setOnCheckedChangeListener(valueUpdater);
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable Boolean bool) {
                if (bool != null) {
                    DivSwitchView.this.setChecked(bool.booleanValue());
                }
            }
        }, divStatePath));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivSwitchView divSwitchView, @NotNull BindingContext bindingContext, @NotNull C0887jd div, @Nullable C0887jd c0887jd, @NotNull DivStatePath path) {
        Intrinsics.checkNotNullParameter(divSwitchView, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        bindIsEnabled(divSwitchView, div, c0887jd, bindingContext.getExpressionResolver());
        bindOnColor(divSwitchView, div, c0887jd, bindingContext.getExpressionResolver());
        observeVariable(divSwitchView, div, bindingContext, path);
    }
}

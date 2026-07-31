package com.yandex.div.core.expression;

import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.triggers.TriggersController;
import com.yandex.div.core.expression.variables.VariableController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ExpressionsRuntime {

    @NotNull
    private final ExpressionResolverImpl expressionResolver;

    @NotNull
    private final RuntimeStore runtimeStore;

    @Nullable
    private final TriggersController triggersController;
    private boolean unsubscribed;

    @NotNull
    private final VariableController variableController;

    public ExpressionsRuntime(@NotNull ExpressionResolverImpl expressionResolver, @Nullable TriggersController triggersController) {
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        this.expressionResolver = expressionResolver;
        this.triggersController = triggersController;
        this.unsubscribed = true;
        this.variableController = expressionResolver.getVariableController();
        this.runtimeStore = expressionResolver.getRuntimeStore();
    }

    public final void cleanup$div_release(@Nullable DivViewFacade divViewFacade) {
        if (this.unsubscribed) {
            return;
        }
        this.unsubscribed = true;
        TriggersController triggersController = this.triggersController;
        if (triggersController != null) {
            triggersController.clearBinding(divViewFacade);
        }
        this.variableController.cleanupSubscriptions();
    }

    public final void clearBinding(@NotNull DivViewFacade view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TriggersController triggersController = this.triggersController;
        if (triggersController != null) {
            triggersController.clearBinding(view);
        }
    }

    @NotNull
    public final ExpressionResolverImpl getExpressionResolver() {
        return this.expressionResolver;
    }

    @NotNull
    public final RuntimeStore getRuntimeStore() {
        return this.runtimeStore;
    }

    @Nullable
    public final TriggersController getTriggersController() {
        return this.triggersController;
    }

    @NotNull
    public final VariableController getVariableController() {
        return this.variableController;
    }

    public final void onAttachedToWindow(@NotNull DivViewFacade view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TriggersController triggersController = this.triggersController;
        if (triggersController != null) {
            triggersController.onAttachedToWindow(view);
        }
    }

    public final void updateSubscriptions() {
        if (this.unsubscribed) {
            this.unsubscribed = false;
            this.expressionResolver.subscribeOnVariables$div_release();
            this.variableController.restoreSubscriptions();
        }
    }
}

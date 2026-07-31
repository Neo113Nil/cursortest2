package com.yandex.div.core.expression.triggers;

import O1.C0892k0;
import O1.C1015qf;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.downloader.PersistentDivDataObserver;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.Expression;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class TriggerExecutor {

    @NotNull
    private final List<C0892k0> actions;

    @NotNull
    private final Set<DivViewFacade> attachedViews;

    @NotNull
    private Disposable bindCompletionDisposable;

    @NotNull
    private final Function1<Boolean, Unit> changeTrigger;

    @NotNull
    private C1015qf.c currentMode;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final Expression.MutableExpression<?, Boolean> expression;

    @NotNull
    private final Div2Logger logger;

    @NotNull
    private final Expression<C1015qf.c> mode;

    @NotNull
    private Disposable modeObserver;

    @NotNull
    private Disposable observersDisposable;

    @NotNull
    private Disposable removingDisposable;

    @NotNull
    private final ExpressionResolverImpl resolver;

    @NotNull
    private WeakHashMap<DivViewFacade, Boolean> wasConditionSatisfied;

    public TriggerExecutor(@NotNull Expression.MutableExpression<?, Boolean> expression, @NotNull List<C0892k0> actions, @NotNull Expression<C1015qf.c> mode, @NotNull ExpressionResolverImpl resolver, @NotNull ErrorCollector errorCollector, @NotNull Div2Logger logger, @NotNull DivActionBinder divActionBinder) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(errorCollector, "errorCollector");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(divActionBinder, "divActionBinder");
        this.expression = expression;
        this.actions = actions;
        this.mode = mode;
        this.resolver = resolver;
        this.errorCollector = errorCollector;
        this.logger = logger;
        this.divActionBinder = divActionBinder;
        this.changeTrigger = new TriggerExecutor$changeTrigger$1(this);
        this.modeObserver = mode.observeAndGet(resolver, new TriggerExecutor$modeObserver$1(this));
        this.currentMode = C1015qf.c.ON_CONDITION;
        this.wasConditionSatisfied = new WeakHashMap<>();
        Disposable disposable = Disposable.NULL;
        this.observersDisposable = disposable;
        this.removingDisposable = disposable;
        this.bindCompletionDisposable = disposable;
        this.attachedViews = new LinkedHashSet();
    }

    private final boolean conditionSatisfied(DivViewFacade divViewFacade) {
        RuntimeException runtimeException;
        try {
            Boolean evaluate = this.expression.evaluate(this.resolver);
            boolean booleanValue = evaluate.booleanValue();
            Boolean bool = this.wasConditionSatisfied.get(divViewFacade);
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            boolean booleanValue2 = bool.booleanValue();
            this.wasConditionSatisfied.put(divViewFacade, evaluate);
            if (booleanValue) {
                return (this.currentMode == C1015qf.c.ON_CONDITION && booleanValue2) ? false : true;
            }
            return false;
        } catch (Exception e4) {
            if (e4 instanceof ClassCastException) {
                runtimeException = new RuntimeException("Condition evaluated in non-boolean result! (expression: '" + this.expression.getRawValue() + "')", e4);
            } else {
                if (!(e4 instanceof EvaluableException)) {
                    throw e4;
                }
                runtimeException = new RuntimeException("Condition evaluation failed! (expression: '" + this.expression.getRawValue() + "')", e4);
            }
            this.errorCollector.logError(runtimeException);
            return false;
        }
    }

    private final void invalidateObservation() {
        if (this.attachedViews.isEmpty()) {
            stopObserving();
        } else {
            startObserving();
        }
    }

    private final void startObserving() {
        this.modeObserver.close();
        this.observersDisposable = this.expression.observe(this.resolver, this.changeTrigger);
        this.removingDisposable = this.resolver.getVariableController().subscribeToVariablesUndeclared(this.expression.getVariablesName(this.resolver), new TriggerExecutor$startObserving$1(this));
        this.modeObserver = this.mode.observeAndGet(this.resolver, new TriggerExecutor$startObserving$2(this));
        tryTriggerActions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopObserving() {
        this.modeObserver.close();
        this.observersDisposable.close();
        this.removingDisposable.close();
        this.bindCompletionDisposable.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryTriggerActions() {
        Assert.assertMainThread();
        Iterator<T> it = this.attachedViews.iterator();
        while (it.hasNext()) {
            tryTriggerActions((DivViewFacade) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.div.core.downloader.PersistentDivDataObserver, com.yandex.div.core.expression.triggers.TriggerExecutor$tryTriggerActionsAfterBind$observer$1] */
    private final void tryTriggerActionsAfterBind(final Div2View div2View) {
        this.bindCompletionDisposable.close();
        final ?? r02 = new PersistentDivDataObserver() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$tryTriggerActionsAfterBind$observer$1
            @Override // com.yandex.div.core.downloader.PersistentDivDataObserver
            public void onAfterDivDataChanged() {
                Div2View.this.removePersistentDivDataObserver$div_release(this);
                this.tryTriggerActions();
            }
        };
        this.bindCompletionDisposable = new Disposable() { // from class: com.yandex.div.core.expression.triggers.a
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                TriggerExecutor.tryTriggerActionsAfterBind$lambda$5(Div2View.this, r02);
            }
        };
        div2View.addPersistentDivDataObserver$div_release(r02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryTriggerActionsAfterBind$lambda$5(Div2View div2View, TriggerExecutor$tryTriggerActionsAfterBind$observer$1 observer) {
        Intrinsics.checkNotNullParameter(div2View, "$div2View");
        Intrinsics.checkNotNullParameter(observer, "$observer");
        div2View.removePersistentDivDataObserver$div_release(observer);
    }

    public final void onAttach(@NotNull DivViewFacade view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.attachedViews.add(view);
        invalidateObservation();
    }

    public final void onDetach(@Nullable DivViewFacade divViewFacade) {
        M.a(this.attachedViews).remove(divViewFacade);
        invalidateObservation();
    }

    private final void tryTriggerActions(DivViewFacade divViewFacade) {
        boolean z4 = divViewFacade instanceof Div2View;
        Div2View div2View = z4 ? (Div2View) divViewFacade : null;
        if (div2View != null) {
            if (!div2View.getInMiddleOfBind$div_release()) {
                div2View = null;
            }
            if (div2View != null) {
                tryTriggerActionsAfterBind(div2View);
                return;
            }
        }
        if (conditionSatisfied(divViewFacade)) {
            for (C0892k0 c0892k0 : this.actions) {
                Div2View div2View2 = z4 ? (Div2View) divViewFacade : null;
                if (div2View2 != null) {
                    this.logger.logTrigger(div2View2, c0892k0);
                }
            }
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, divViewFacade, this.resolver, this.actions, "trigger", null, 16, null);
        }
    }
}

package com.yandex.div.core.expression.triggers;

import O1.C1015qf;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.json.expressions.Expression;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class TriggersController {

    @Nullable
    private List<C1015qf> activeTriggers;

    @Nullable
    private DivViewFacade currentView;

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final Map<List<C1015qf>, List<TriggerExecutor>> executors;

    @NotNull
    private final ExpressionResolverImpl expressionResolver;

    @NotNull
    private final Div2Logger logger;

    public TriggersController(@NotNull ExpressionResolverImpl expressionResolver, @NotNull ErrorCollector errorCollector, @NotNull Div2Logger logger, @NotNull DivActionBinder divActionBinder) {
        Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
        Intrinsics.checkNotNullParameter(errorCollector, "errorCollector");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(divActionBinder, "divActionBinder");
        this.expressionResolver = expressionResolver;
        this.errorCollector = errorCollector;
        this.logger = logger;
        this.divActionBinder = divActionBinder;
        this.executors = new LinkedHashMap();
    }

    private Throwable findErrors(List<String> list) {
        if (list.isEmpty()) {
            return new RuntimeException("No variables defined!");
        }
        return null;
    }

    public void clearBinding(@Nullable DivViewFacade divViewFacade) {
        this.currentView = null;
        Iterator<Map.Entry<List<C1015qf>, List<TriggerExecutor>>> it = this.executors.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                ((TriggerExecutor) it2.next()).onDetach(divViewFacade);
            }
        }
    }

    public void ensureTriggersSynced(@NotNull List<C1015qf> divTriggers) {
        Intrinsics.checkNotNullParameter(divTriggers, "divTriggers");
        if (this.activeTriggers == divTriggers) {
            return;
        }
        this.activeTriggers = divTriggers;
        DivViewFacade divViewFacade = this.currentView;
        Map<List<C1015qf>, List<TriggerExecutor>> map = this.executors;
        List<TriggerExecutor> list = map.get(divTriggers);
        if (list == null) {
            list = new ArrayList<>();
            map.put(divTriggers, list);
        }
        List<TriggerExecutor> list2 = list;
        if (divViewFacade != null) {
            clearBinding(divViewFacade);
        }
        for (C1015qf c1015qf : divTriggers) {
            Expression expression = c1015qf.f7706b;
            Expression.MutableExpression mutableExpression = expression instanceof Expression.MutableExpression ? (Expression.MutableExpression) expression : null;
            if (mutableExpression == null) {
                this.errorCollector.logError(new IllegalStateException("Invalid condition: '" + c1015qf.f7706b + '\'', new RuntimeException("Condition is not mutable!")));
            } else {
                Throwable findErrors = findErrors(mutableExpression.getVariablesName(this.expressionResolver));
                if (findErrors != null) {
                    this.errorCollector.logError(new IllegalStateException("Invalid condition: '" + c1015qf.f7706b + '\'', findErrors));
                } else {
                    list2.add(new TriggerExecutor(mutableExpression, c1015qf.f7705a, c1015qf.f7707c, this.expressionResolver, this.errorCollector, this.logger, this.divActionBinder));
                }
            }
        }
        if (divViewFacade != null) {
            onAttachedToWindow(divViewFacade);
        }
    }

    public void onAttachedToWindow(@NotNull DivViewFacade view) {
        List<TriggerExecutor> list;
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual(this.currentView, view)) {
            return;
        }
        this.currentView = view;
        List<C1015qf> list2 = this.activeTriggers;
        if (list2 == null || (list = this.executors.get(list2)) == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((TriggerExecutor) it.next()).onAttach(view);
        }
    }
}

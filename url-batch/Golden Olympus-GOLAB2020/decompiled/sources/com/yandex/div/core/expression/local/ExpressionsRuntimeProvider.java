package com.yandex.div.core.expression.local;

import O1.AbstractC1176zf;
import O1.C1015qf;
import O1.C1165z4;
import O1.InterfaceC0752c3;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.FunctionProviderDecorator;
import com.yandex.div.core.expression.local.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.storedvalues.StoredValuesController;
import com.yandex.div.core.expression.triggers.TriggersController;
import com.yandex.div.core.expression.variables.DivVariableController;
import com.yandex.div.core.expression.variables.VariableControllerImpl;
import com.yandex.div.core.expression.variables.VariableControllerKt;
import com.yandex.div.core.util.FunctionMapperKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.FunctionProvider;
import com.yandex.div.evaluable.StoredValueProvider;
import com.yandex.div.evaluable.WarningSender;
import com.yandex.div.evaluable.function.GeneratedBuiltinFunctionProvider;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class ExpressionsRuntimeProvider {

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final DivVariableController divVariableController;

    @NotNull
    private final Div2Logger logger;

    @NotNull
    private final StoredValuesController storedValuesController;

    public ExpressionsRuntimeProvider(@NotNull DivVariableController divVariableController, @NotNull DivActionBinder divActionBinder, @NotNull Div2Logger logger, @NotNull StoredValuesController storedValuesController) {
        Intrinsics.checkNotNullParameter(divVariableController, "divVariableController");
        Intrinsics.checkNotNullParameter(divActionBinder, "divActionBinder");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(storedValuesController, "storedValuesController");
        this.divVariableController = divVariableController;
        this.divActionBinder = divActionBinder;
        this.logger = logger;
        this.storedValuesController = storedValuesController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createRootRuntime$lambda$0(ExpressionsRuntimeProvider this$0, ErrorCollector errorCollector, String storedValueName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(errorCollector, "$errorCollector");
        Intrinsics.checkNotNullParameter(storedValueName, "storedValueName");
        StoredValue storedValue = this$0.storedValuesController.getStoredValue(storedValueName, errorCollector);
        if (storedValue != null) {
            return storedValue.getValue();
        }
        return null;
    }

    private TriggersController toTriggersController(List<C1015qf> list, ExpressionResolverImpl expressionResolverImpl, ErrorCollector errorCollector) {
        List<C1015qf> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        TriggersController triggersController = new TriggersController(expressionResolverImpl, errorCollector, this.logger, this.divActionBinder);
        triggersController.ensureTriggersSynced(list);
        return triggersController;
    }

    @NotNull
    public ExpressionsRuntime createChildRuntime(@NotNull String path, @NotNull InterfaceC0752c3 div, @NotNull ExpressionResolverImpl parentResolver, @NotNull ErrorCollector errorCollector) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(parentResolver, "parentResolver");
        Intrinsics.checkNotNullParameter(errorCollector, "errorCollector");
        VariableControllerImpl variableControllerImpl = new VariableControllerImpl(parentResolver.getVariableController());
        List r4 = div.r();
        FunctionProvider functionProvider = parentResolver.getEvaluator().getEvaluationContext().getFunctionProvider();
        Intrinsics.checkNotNull(functionProvider, "null cannot be cast to non-null type com.yandex.div.core.expression.FunctionProviderDecorator");
        FunctionProviderDecorator functionProviderDecorator = (FunctionProviderDecorator) functionProvider;
        List list = r4;
        if (list != null && !list.isEmpty()) {
            functionProviderDecorator = functionProviderDecorator.plus(FunctionMapperKt.toLocalFunctions(r4));
        }
        ExpressionResolverImpl expressionResolverImpl = new ExpressionResolverImpl(path + '/' + parentResolver.getPath(), parentResolver.getRuntimeStore(), variableControllerImpl, new Evaluator(new EvaluationContext(variableControllerImpl, parentResolver.getEvaluator().getEvaluationContext().getStoredValueProvider(), functionProviderDecorator, parentResolver.getEvaluator().getEvaluationContext().getWarningSender())), errorCollector);
        List f4 = div.f();
        if (f4 != null) {
            Iterator it = f4.iterator();
            while (it.hasNext()) {
                VariableControllerKt.declare(variableControllerImpl, (AbstractC1176zf) it.next(), expressionResolverImpl, errorCollector);
            }
        }
        return new ExpressionsRuntime(expressionResolverImpl, toTriggersController(div.o(), expressionResolverImpl, errorCollector));
    }

    @NotNull
    public ExpressionsRuntime createRootRuntime(@NotNull C1165z4 data, @NotNull final ErrorCollector errorCollector, @NotNull RuntimeStore runtimeStore) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(errorCollector, "errorCollector");
        Intrinsics.checkNotNullParameter(runtimeStore, "runtimeStore");
        VariableControllerImpl variableControllerImpl = new VariableControllerImpl(null, 1, null);
        variableControllerImpl.addSource(this.divVariableController.getVariableSource$div_release());
        ExpressionResolverImpl expressionResolverImpl = new ExpressionResolverImpl("", runtimeStore, variableControllerImpl, new Evaluator(new EvaluationContext(variableControllerImpl, new StoredValueProvider() { // from class: p1.a
            @Override // com.yandex.div.evaluable.StoredValueProvider
            public final Object get(String str) {
                Object createRootRuntime$lambda$0;
                createRootRuntime$lambda$0 = ExpressionsRuntimeProvider.createRootRuntime$lambda$0(ExpressionsRuntimeProvider.this, errorCollector, str);
                return createRootRuntime$lambda$0;
            }
        }, new FunctionProviderDecorator(GeneratedBuiltinFunctionProvider.INSTANCE), new WarningSender() { // from class: com.yandex.div.core.expression.local.ExpressionsRuntimeProvider$createRootRuntime$warningSender$1
            @Override // com.yandex.div.evaluable.WarningSender
            /* renamed from: send-BIH1yYw, reason: not valid java name */
            public final void mo33sendBIH1yYw(@NotNull Evaluable expressionContext, @NotNull String message) {
                Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
                Intrinsics.checkNotNullParameter(message, "message");
                ErrorCollector.this.logWarning(new Throwable("Warning occurred while evaluating '" + expressionContext.getRawExpr() + "': " + message));
            }
        })), errorCollector);
        List list = data.f8715g;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                VariableControllerKt.declare(variableControllerImpl, (AbstractC1176zf) it.next(), expressionResolverImpl, errorCollector);
            }
        }
        return new ExpressionsRuntime(expressionResolverImpl, toTriggersController(data.f8714f, expressionResolverImpl, errorCollector));
    }
}

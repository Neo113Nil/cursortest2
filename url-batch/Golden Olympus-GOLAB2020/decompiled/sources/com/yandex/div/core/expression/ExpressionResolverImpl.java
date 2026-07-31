package com.yandex.div.core.expression;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.variables.ConstantsProvider;
import com.yandex.div.core.expression.variables.VariableAndConstantController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class ExpressionResolverImpl implements ExpressionResolver {

    @NotNull
    private final ErrorCollector errorCollector;

    @NotNull
    private final Map<String, Object> evaluationsCache;

    @NotNull
    private final Evaluator evaluator;

    @NotNull
    private final Map<String, ObserverList<Function0<Unit>>> expressionObservers;

    @NotNull
    private final String path;

    @NotNull
    private final RuntimeStore runtimeStore;
    private boolean suppressMissingVariableException;

    @NotNull
    private final Map<String, Set<String>> varToExpressions;

    @NotNull
    private final VariableController variableController;

    public ExpressionResolverImpl(@NotNull String path, @NotNull RuntimeStore runtimeStore, @NotNull VariableController variableController, @NotNull Evaluator evaluator, @NotNull ErrorCollector errorCollector) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(runtimeStore, "runtimeStore");
        Intrinsics.checkNotNullParameter(variableController, "variableController");
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Intrinsics.checkNotNullParameter(errorCollector, "errorCollector");
        this.path = path;
        this.runtimeStore = runtimeStore;
        this.variableController = variableController;
        this.evaluator = evaluator;
        this.errorCollector = errorCollector;
        this.evaluationsCache = new LinkedHashMap();
        this.varToExpressions = new LinkedHashMap();
        this.expressionObservers = new LinkedHashMap();
    }

    private final <R> R getEvaluationResult(String str, Evaluable evaluable) {
        R r4 = (R) this.evaluationsCache.get(str);
        if (r4 != null) {
            return r4;
        }
        R r5 = (R) this.evaluator.eval(evaluable);
        if (evaluable.checkIsCacheable()) {
            for (String str2 : evaluable.getVariables()) {
                Map<String, Set<String>> map = this.varToExpressions;
                Set<String> set = map.get(str2);
                if (set == null) {
                    set = new LinkedHashSet<>();
                    map.put(str2, set);
                }
                set.add(str);
            }
            this.evaluationsCache.put(str, r5);
        }
        return r5;
    }

    private final <R, T> T safeConvert(String str, String str2, Function1<? super R, ? extends T> function1, R r4, TypeHelper<T> typeHelper) {
        if (function1 != null) {
            try {
                r4 = (T) function1.invoke(r4);
            } catch (ClassCastException e4) {
                throw ParsingExceptionKt.typeMismatch(str, str2, r4, e4);
            } catch (Exception e5) {
                throw ParsingExceptionKt.invalidValue(str, str2, r4, e5);
            }
        } else if (r4 == null) {
            r4 = (T) null;
        }
        return safeConvert$fieldAwaitsStringButValueNotConverted(typeHelper, r4) ? (T) String.valueOf(r4) : (T) r4;
    }

    private static final <T> boolean safeConvert$fieldAwaitsStringButValueNotConverted(TypeHelper<T> typeHelper, T t4) {
        return (t4 == null || !(typeHelper.getTypeDefault() instanceof String) || typeHelper.isTypeValid(t4)) ? false : true;
    }

    private final <T> void safeValidate(String str, String str2, ValueValidator<T> valueValidator, T t4) {
        try {
            if (valueValidator.isValid(t4)) {
            } else {
                throw ParsingExceptionKt.invalidValue(str2, t4);
            }
        } catch (ClassCastException e4) {
            throw ParsingExceptionKt.typeMismatch(str, str2, t4, e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToExpression$lambda$7(ExpressionResolverImpl this$0, String rawExpression, Function0 callback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rawExpression, "$rawExpression");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        ObserverList<Function0<Unit>> observerList = this$0.expressionObservers.get(rawExpression);
        if (observerList != null) {
            observerList.removeObserver(callback);
        }
    }

    private final String tryGetMissingVariableName(EvaluableException evaluableException) {
        if (evaluableException instanceof MissingVariableException) {
            return ((MissingVariableException) evaluableException).getVariableName();
        }
        return null;
    }

    private final <R, T> T tryResolve(String str, String str2, Evaluable evaluable, Function1<? super R, ? extends T> function1, ValueValidator<T> valueValidator, TypeHelper<T> typeHelper) {
        String str3;
        String str4;
        try {
            T t4 = (T) getEvaluationResult(str2, evaluable);
            if (typeHelper.isTypeValid(t4)) {
                Intrinsics.checkNotNull(t4, "null cannot be cast to non-null type T of com.yandex.div.core.expression.ExpressionResolverImpl.tryResolve");
                str3 = str;
                str4 = str2;
            } else {
                str3 = str;
                str4 = str2;
                Object safeConvert = safeConvert(str3, str4, function1, t4, typeHelper);
                if (safeConvert == null) {
                    throw ParsingExceptionKt.invalidValue(str3, str4, t4);
                }
                t4 = (T) safeConvert;
            }
            safeValidate(str3, str4, valueValidator, t4);
            return t4;
        } catch (EvaluableException e4) {
            String tryGetMissingVariableName = tryGetMissingVariableName(e4);
            if (tryGetMissingVariableName != null) {
                throw ParsingExceptionKt.missingVariable(str, str2, tryGetMissingVariableName, e4);
            }
            throw ParsingExceptionKt.resolveFailed(str, str2, e4);
        }
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    @NotNull
    public <R, T> T get(@NotNull String expressionKey, @NotNull String rawExpression, @NotNull Evaluable evaluable, @Nullable Function1<? super R, ? extends T> function1, @NotNull ValueValidator<T> validator, @NotNull TypeHelper<T> fieldType, @NotNull ParsingErrorLogger logger) {
        Intrinsics.checkNotNullParameter(expressionKey, "expressionKey");
        Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
        Intrinsics.checkNotNullParameter(evaluable, "evaluable");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        Intrinsics.checkNotNullParameter(logger, "logger");
        try {
            return (T) tryResolve(expressionKey, rawExpression, evaluable, function1, validator, fieldType);
        } catch (ParsingException e4) {
            if (e4.getReason() == ParsingExceptionReason.MISSING_VARIABLE) {
                if (this.suppressMissingVariableException) {
                    throw ParsingExceptionKt.getSILENT_PARSING_EXCEPTION();
                }
                throw e4;
            }
            logger.logError(e4);
            this.errorCollector.logError(e4);
            return (T) tryResolve(expressionKey, rawExpression, evaluable, function1, validator, fieldType);
        }
    }

    @NotNull
    public final Evaluator getEvaluator() {
        return this.evaluator;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final RuntimeStore getRuntimeStore() {
        return this.runtimeStore;
    }

    @NotNull
    public final VariableController getVariableController() {
        return this.variableController;
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    public void notifyResolveFailed(@NotNull ParsingException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        this.errorCollector.logError(e4);
    }

    public final void setSuppressMissingVariableException(boolean z4) {
        this.suppressMissingVariableException = z4;
    }

    public final void subscribeOnVariables$div_release() {
        this.variableController.setOnAnyVariableChangeCallback(this, new ExpressionResolverImpl$subscribeOnVariables$1(this));
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    @NotNull
    public Disposable subscribeToExpression(@NotNull final String rawExpression, @NotNull List<String> variableNames, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
        Intrinsics.checkNotNullParameter(variableNames, "variableNames");
        Intrinsics.checkNotNullParameter(callback, "callback");
        for (String str : variableNames) {
            Map<String, Set<String>> map = this.varToExpressions;
            Set<String> set = map.get(str);
            if (set == null) {
                set = new LinkedHashSet<>();
                map.put(str, set);
            }
            set.add(rawExpression);
        }
        Map<String, ObserverList<Function0<Unit>>> map2 = this.expressionObservers;
        ObserverList<Function0<Unit>> observerList = map2.get(rawExpression);
        if (observerList == null) {
            observerList = new ObserverList<>();
            map2.put(rawExpression, observerList);
        }
        observerList.addObserver(callback);
        return new Disposable() { // from class: o1.a
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                ExpressionResolverImpl.subscribeToExpression$lambda$7(ExpressionResolverImpl.this, rawExpression, callback);
            }
        };
    }

    @Nullable
    public final JSONObject validateItemBuilderDataElement(@NotNull Object element, int i4) {
        Intrinsics.checkNotNullParameter(element, "element");
        JSONObject jSONObject = element instanceof JSONObject ? (JSONObject) element : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        this.errorCollector.logError(ParsingExceptionKt.typeMismatch(i4, element));
        return null;
    }

    @NotNull
    public final ExpressionResolverImpl withConstants$div_release(@NotNull String pathSegment, @NotNull ConstantsProvider constants) {
        Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
        Intrinsics.checkNotNullParameter(constants, "constants");
        VariableAndConstantController variableAndConstantController = new VariableAndConstantController(this.variableController, constants);
        return new ExpressionResolverImpl(this.path + '/' + pathSegment, this.runtimeStore, variableAndConstantController, new Evaluator(new EvaluationContext(variableAndConstantController, this.evaluator.getEvaluationContext().getStoredValueProvider(), this.evaluator.getEvaluationContext().getFunctionProvider(), this.evaluator.getEvaluationContext().getWarningSender())), this.errorCollector);
    }
}

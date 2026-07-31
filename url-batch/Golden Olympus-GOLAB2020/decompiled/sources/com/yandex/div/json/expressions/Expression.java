package com.yandex.div.json.expressions;

import com.yandex.div.core.CompositeDisposable;
import com.yandex.div.core.CompositeDisposableKt;
import com.yandex.div.core.Disposable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.internal.LiteralsEscaper;
import com.yandex.div.internal.parser.JsonParsers;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class Expression<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final <T> Expression<T> constant(@NotNull T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!(value instanceof String)) {
                return new ConstantExpression(value);
            }
            return new StringConstantExpression((String) value, null, null, 6, null);
        }

        public final boolean mayBeExpression(@Nullable Object obj) {
            return (obj instanceof String) && StringsKt.P((CharSequence) obj, "@{", false, 2, null);
        }

        private Companion() {
        }
    }

    @Metadata
    public static class ConstantExpression<T> extends Expression<T> {

        @NotNull
        private final T value;

        public ConstantExpression(@NotNull T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public T evaluate(@NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return this.value;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public Object getRawValue() {
            T t4 = this.value;
            Intrinsics.checkNotNull(t4, "null cannot be cast to non-null type kotlin.Any");
            return t4;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public Disposable observe(@NotNull ExpressionResolver resolver, @NotNull Function1<? super T, Unit> callback) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return Disposable.NULL;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public Disposable observeAndGet(@NotNull ExpressionResolver resolver, @NotNull Function1<? super T, Unit> callback) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.invoke(this.value);
            return Disposable.NULL;
        }
    }

    @Metadata
    public static final class MutableExpression<R, T> extends Expression<T> {

        @Nullable
        private final Function1<R, T> converter;

        @Nullable
        private Evaluable evaluable;

        @NotNull
        private final String expressionKey;

        @Nullable
        private final Expression<T> fieldDefaultValue;

        @Nullable
        private T lastValidValue;

        @NotNull
        private final ParsingErrorLogger logger;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final String rawValue;

        @NotNull
        private final TypeHelper<T> typeHelper;

        @NotNull
        private final ValueValidator<T> validator;

        /* JADX WARN: Multi-variable type inference failed */
        public MutableExpression(@NotNull String expressionKey, @NotNull String rawExpression, @Nullable Function1<? super R, ? extends T> function1, @NotNull ValueValidator<T> validator, @NotNull ParsingErrorLogger logger, @NotNull TypeHelper<T> typeHelper, @Nullable Expression<T> expression) {
            Intrinsics.checkNotNullParameter(expressionKey, "expressionKey");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            Intrinsics.checkNotNullParameter(validator, "validator");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(typeHelper, "typeHelper");
            this.expressionKey = expressionKey;
            this.rawExpression = rawExpression;
            this.converter = function1;
            this.validator = validator;
            this.logger = logger;
            this.typeHelper = typeHelper;
            this.fieldDefaultValue = expression;
            this.rawValue = rawExpression;
        }

        private final List<Evaluable> getDynamicVariables() {
            Object m243constructorimpl;
            try {
                Result.Companion companion = Result.Companion;
                Evaluable evaluable = this.evaluable;
                m243constructorimpl = Result.m243constructorimpl(evaluable != null ? evaluable.getDynamicVariables() : null);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            return (List) (Result.m244isFailureimpl(m243constructorimpl) ? null : m243constructorimpl);
        }

        private final Evaluable getEvaluable() {
            Evaluable evaluable = this.evaluable;
            if (evaluable != null) {
                return evaluable;
            }
            try {
                Evaluable lazy = Evaluable.Companion.lazy(this.rawExpression);
                this.evaluable = lazy;
                return lazy;
            } catch (EvaluableException e4) {
                throw ParsingExceptionKt.resolveFailed(this.expressionKey, this.rawExpression, e4);
            }
        }

        private final List<String> getVariables(ExpressionResolver expressionResolver) {
            try {
                return getEvaluable().getVariables();
            } catch (Exception e4) {
                logError(ParsingExceptionKt.resolveFailed(this.expressionKey, this.rawExpression, e4), expressionResolver);
                return CollectionsKt.emptyList();
            }
        }

        private final void logError(ParsingException parsingException, ExpressionResolver expressionResolver) {
            this.logger.logError(parsingException);
            expressionResolver.notifyResolveFailed(parsingException);
        }

        private final String resolveVariableName(Evaluable evaluable, ExpressionResolver expressionResolver) {
            String str = this.expressionKey;
            String obj = evaluable.toString();
            Function1<? super R, ? extends T> doNotConvert = JsonParsers.doNotConvert();
            ValueValidator<T> alwaysValid = JsonParsers.alwaysValid();
            Intrinsics.checkNotNullExpressionValue(alwaysValid, "alwaysValid()");
            return (String) expressionResolver.get(str, obj, evaluable, doNotConvert, alwaysValid, TypeHelpersKt.TYPE_HELPER_STRING, this.logger);
        }

        private final T tryResolve(ExpressionResolver expressionResolver) {
            T t4 = (T) expressionResolver.get(this.expressionKey, this.rawExpression, getEvaluable(), this.converter, this.validator, this.typeHelper, this.logger);
            if (t4 == null) {
                throw ParsingExceptionKt.resolveFailed$default(this.expressionKey, this.rawExpression, null, 4, null);
            }
            if (this.typeHelper.isTypeValid(t4)) {
                return t4;
            }
            throw ParsingExceptionKt.typeMismatch$default(this.expressionKey, this.rawExpression, t4, null, 8, null);
        }

        private final T tryResolveOrUseLast(ExpressionResolver expressionResolver) {
            T evaluate;
            try {
                T tryResolve = tryResolve(expressionResolver);
                this.lastValidValue = tryResolve;
                return tryResolve;
            } catch (ParsingException e4) {
                String message = e4.getMessage();
                if (message != null && message.length() != 0) {
                    logError(e4, expressionResolver);
                }
                T t4 = this.lastValidValue;
                if (t4 != null) {
                    return t4;
                }
                try {
                    Expression<T> expression = this.fieldDefaultValue;
                    if (expression == null || (evaluate = expression.evaluate(expressionResolver)) == null) {
                        return this.typeHelper.getTypeDefault();
                    }
                    this.lastValidValue = evaluate;
                    return evaluate;
                } catch (ParsingException e5) {
                    logError(e5, expressionResolver);
                    throw e5;
                }
            }
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public T evaluate(@NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return tryResolveOrUseLast(resolver);
        }

        @NotNull
        public final List<String> getVariablesName(@NotNull ExpressionResolver resolver) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            List<String> variables = getVariables(resolver);
            List<Evaluable> dynamicVariables = getDynamicVariables();
            if (dynamicVariables != null) {
                arrayList = new ArrayList();
                Iterator<T> it = dynamicVariables.iterator();
                while (it.hasNext()) {
                    String resolveVariableName = resolveVariableName((Evaluable) it.next(), resolver);
                    if (resolveVariableName != null) {
                        arrayList.add(resolveVariableName);
                    }
                }
            } else {
                arrayList = null;
            }
            return (arrayList == null || arrayList.isEmpty()) ? variables : CollectionsKt.plus((Collection) variables, (Iterable) arrayList);
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public Disposable observe(@NotNull ExpressionResolver resolver, @NotNull Function1<? super T, Unit> callback) {
            List<Evaluable> list;
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(callback, "callback");
            List<String> variables = getVariables(resolver);
            List<Evaluable> dynamicVariables = getDynamicVariables();
            if (variables.isEmpty() && ((list = dynamicVariables) == null || list.isEmpty())) {
                return Disposable.NULL;
            }
            Expression$MutableExpression$observe$callbackWithValue$1 expression$MutableExpression$observe$callbackWithValue$1 = new Expression$MutableExpression$observe$callbackWithValue$1(callback, this, resolver);
            Disposable subscribeToExpression = resolver.subscribeToExpression(this.rawExpression, variables, expression$MutableExpression$observe$callbackWithValue$1);
            List<Evaluable> list2 = dynamicVariables;
            if (list2 == null || list2.isEmpty()) {
                return subscribeToExpression;
            }
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            CompositeDisposableKt.plusAssign(compositeDisposable, subscribeToExpression);
            CompositeDisposableKt.plusAssign(compositeDisposable, observe(dynamicVariables, resolver, expression$MutableExpression$observe$callbackWithValue$1));
            for (Evaluable evaluable : dynamicVariables) {
                ExpressionResolver expressionResolver = resolver;
                Expression$MutableExpression$observe$1$dynamicVarCallback$1 expression$MutableExpression$observe$1$dynamicVarCallback$1 = new Expression$MutableExpression$observe$1$dynamicVarCallback$1(compositeDisposable, this, evaluable, expressionResolver, expression$MutableExpression$observe$callbackWithValue$1);
                CompositeDisposableKt.plusAssign(compositeDisposable, expressionResolver.subscribeToExpression(evaluable.toString(), evaluable.getVariables(), expression$MutableExpression$observe$1$dynamicVarCallback$1));
                CompositeDisposableKt.plusAssign(compositeDisposable, observe(evaluable.getDynamicVariables(), expressionResolver, expression$MutableExpression$observe$1$dynamicVarCallback$1));
                resolver = expressionResolver;
            }
            return compositeDisposable;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        public String getRawValue() {
            return this.rawValue;
        }

        private final Disposable observe(List<? extends Evaluable> list, ExpressionResolver expressionResolver, Function0<Unit> function0) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String resolveVariableName = resolveVariableName((Evaluable) it.next(), expressionResolver);
                if (resolveVariableName != null) {
                    arrayList.add(resolveVariableName);
                }
            }
            return arrayList.isEmpty() ? Disposable.NULL : expressionResolver.subscribeToExpression(this.rawExpression, arrayList, function0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Disposable observe(Evaluable evaluable, ExpressionResolver expressionResolver, Function0<Unit> function0) {
            String resolveVariableName = resolveVariableName(evaluable, expressionResolver);
            return resolveVariableName == null ? Disposable.NULL : expressionResolver.subscribeToExpression(this.rawExpression, CollectionsKt.listOf(resolveVariableName), function0);
        }
    }

    @Metadata
    public static final class StringConstantExpression extends ConstantExpression<String> {

        @Nullable
        private String cachedValue;

        @NotNull
        private final String defaultValue;

        @NotNull
        private final ParsingErrorLogger logger;

        @NotNull
        private final String value;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ StringConstantExpression(String str, String str2, ParsingErrorLogger LOG, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, LOG);
            str2 = (i4 & 2) != 0 ? "" : str2;
            if ((i4 & 4) != 0) {
                LOG = ParsingErrorLogger.LOG;
                Intrinsics.checkNotNullExpressionValue(LOG, "LOG");
            }
        }

        @Override // com.yandex.div.json.expressions.Expression.ConstantExpression, com.yandex.div.json.expressions.Expression
        @NotNull
        public String evaluate(@NotNull ExpressionResolver resolver) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            String str = this.cachedValue;
            if (str != null) {
                return str;
            }
            try {
                String process$default = LiteralsEscaper.process$default(LiteralsEscaper.INSTANCE, this.value, null, 2, null);
                this.cachedValue = process$default;
                return process$default;
            } catch (EvaluableException e4) {
                this.logger.logError(e4);
                String str2 = this.defaultValue;
                this.cachedValue = str2;
                return str2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringConstantExpression(@NotNull String value, @NotNull String defaultValue, @NotNull ParsingErrorLogger logger) {
            super(value);
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            Intrinsics.checkNotNullParameter(logger, "logger");
            this.value = value;
            this.defaultValue = defaultValue;
            this.logger = logger;
        }
    }

    @NotNull
    public static final <T> Expression<T> constant(@NotNull T t4) {
        return Companion.constant(t4);
    }

    public static final boolean mayBeExpression(@Nullable Object obj) {
        return Companion.mayBeExpression(obj);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Expression) {
            return Intrinsics.areEqual(getRawValue(), ((Expression) obj).getRawValue());
        }
        return false;
    }

    @NotNull
    public abstract T evaluate(@NotNull ExpressionResolver expressionResolver);

    @NotNull
    public abstract Object getRawValue();

    public int hashCode() {
        return getRawValue().hashCode() * 16;
    }

    @NotNull
    public abstract Disposable observe(@NotNull ExpressionResolver expressionResolver, @NotNull Function1<? super T, Unit> function1);

    @NotNull
    public Disposable observeAndGet(@NotNull ExpressionResolver resolver, @NotNull Function1<? super T, Unit> callback) {
        T t4;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            t4 = evaluate(resolver);
        } catch (ParsingException unused) {
            t4 = null;
        }
        if (t4 != null) {
            callback.invoke(t4);
        }
        return observe(resolver, callback);
    }
}

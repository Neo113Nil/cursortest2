package com.yandex.div.json.expressions;

import com.yandex.div.core.Disposable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface ExpressionResolver {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final ExpressionResolver EMPTY = new ExpressionResolver() { // from class: com.yandex.div.json.expressions.ExpressionResolver$Companion$EMPTY$1
        @Override // com.yandex.div.json.expressions.ExpressionResolver
        @Nullable
        public <R, T> T get(@NotNull String expressionKey, @NotNull String rawExpression, @NotNull Evaluable evaluable, @Nullable Function1<? super R, ? extends T> function1, @NotNull ValueValidator<T> validator, @NotNull TypeHelper<T> fieldType, @NotNull ParsingErrorLogger logger) {
            Intrinsics.checkNotNullParameter(expressionKey, "expressionKey");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            Intrinsics.checkNotNullParameter(evaluable, "evaluable");
            Intrinsics.checkNotNullParameter(validator, "validator");
            Intrinsics.checkNotNullParameter(fieldType, "fieldType");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return null;
        }

        @Override // com.yandex.div.json.expressions.ExpressionResolver
        @NotNull
        public Disposable subscribeToExpression(@NotNull String rawExpression, @NotNull List<String> variableNames, @NotNull Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            Intrinsics.checkNotNullParameter(variableNames, "variableNames");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return Disposable.NULL;
        }
    };

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Nullable
    <R, T> T get(@NotNull String str, @NotNull String str2, @NotNull Evaluable evaluable, @Nullable Function1<? super R, ? extends T> function1, @NotNull ValueValidator<T> valueValidator, @NotNull TypeHelper<T> typeHelper, @NotNull ParsingErrorLogger parsingErrorLogger);

    default void notifyResolveFailed(@NotNull ParsingException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
    }

    @NotNull
    Disposable subscribeToExpression(@NotNull String str, @NotNull List<String> list, @NotNull Function0<Unit> function0);
}

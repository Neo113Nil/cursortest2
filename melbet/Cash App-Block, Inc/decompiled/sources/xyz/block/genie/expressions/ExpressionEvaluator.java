package xyz.block.genie.expressions;

import com.squareup.cash.genie.backend.real.GenieLogger;
import java.util.LinkedHashSet;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import xyz.block.genie.GenieLogLevel;
import xyz.block.genie.expressions.ExpressionError;
import xyz.block.genie.expressions.core.ExpressionEvaluator$DivisionByZeroException;
import xyz.block.genie.expressions.core.ExpressionEvaluator$EmptyKeyPathException;
import xyz.block.genie.expressions.core.ExpressionEvaluator$MaxDepthExceededException;
import xyz.block.genie.expressions.core.ExpressionEvaluator$MissingExpressionException;
import xyz.block.genie.expressions.core.ExpressionEvaluator$TypeMismatchException;
import xyz.block.genie.expressions.core.ExpressionEvaluator$UnsupportedOperatorException;
import xyz.block.genie.state.GenieStateValue;
import xyz.block.genie.state.GenieViewState;
import xyz.block.protos.genie.Expression;
import xyz.block.protos.genie.UnaryOp;

/* loaded from: classes10.dex */
public final class ExpressionEvaluator {
    public final GenieLogger logger;

    public ExpressionEvaluator(GenieLogger genieLogger) {
        this.logger = genieLogger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlin.Result$Failure] */
    public final GenieStateValue evaluate(Expression expression, GenieViewState genieViewState) {
        ExpressionError.TypeMismatch typeMismatch;
        expression.getClass();
        genieViewState.getClass();
        try {
            return ValueConversionsKt.toGenieStateValue(UnaryOp.Operator.Companion.evaluate(expression, new GenieViewStateAdapter(genieViewState), 0));
        } catch (Exception e) {
            Exception exc = e;
            try {
                Result.Companion companion = Result.Companion;
                if (this.logger != null) {
                    GenieLogger.log(GenieLogLevel.ERROR, "Expression evaluation failed: " + exc);
                }
            } catch (Throwable unused) {
                Result.Companion companion2 = Result.Companion;
            }
            if (exc instanceof ExpressionError) {
                throw exc;
            }
            if (exc instanceof ExpressionEvaluator$MissingExpressionException) {
                throw new ExpressionError.MissingExpression("Expression has no type set");
            }
            if (exc instanceof ExpressionEvaluator$MaxDepthExceededException) {
                throw new ExpressionError.MaxDepthExceeded("Expression exceeded maximum recursion depth of 64");
            }
            if (exc instanceof ExpressionEvaluator$EmptyKeyPathException) {
                throw new ExpressionError.UnresolvedKeyPath(EmptyList.INSTANCE);
            }
            if (exc instanceof ExpressionEvaluator$UnsupportedOperatorException) {
                throw new ExpressionError.UnsupportedOperator("Unsupported operator");
            }
            if (exc instanceof ExpressionEvaluator$DivisionByZeroException) {
                throw new ExpressionError.DivisionByZero("Division by zero");
            }
            if (!(exc instanceof ExpressionEvaluator$TypeMismatchException)) {
                if (!(exc instanceof UnresolvedTemplateTokensException)) {
                    throw exc;
                }
                LinkedHashSet linkedHashSet = ((UnresolvedTemplateTokensException) exc).keys;
                linkedHashSet.getClass();
                throw new ExpressionError.UnresolvedTemplateTokens("Unresolved template tokens: ".concat(CollectionsKt.joinToString$default(CollectionsKt.sorted(linkedHashSet), ", ", null, null, 0, null, null, 62)));
            }
            try {
                ExpressionEvaluator$TypeMismatchException expressionEvaluator$TypeMismatchException = (ExpressionEvaluator$TypeMismatchException) exc;
                typeMismatch = new ExpressionError.TypeMismatch(expressionEvaluator$TypeMismatchException.expected, ValueConversionsKt.toGenieStateValue(expressionEvaluator$TypeMismatchException.actual));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.Companion;
                typeMismatch = new Result.Failure(th);
            }
            if (Result.m4120exceptionOrNullimpl(typeMismatch) == null) {
                exc = typeMismatch;
            }
            throw exc;
        }
    }
}

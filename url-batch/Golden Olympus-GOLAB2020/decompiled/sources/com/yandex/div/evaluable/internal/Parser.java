package com.yandex.div.evaluable.internal;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.internal.Token;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class Parser {

    @NotNull
    public static final Parser INSTANCE = new Parser();

    @Metadata
    private static final class ParsingState {
        private int index;

        @NotNull
        private final String rawExpr;

        @NotNull
        private final List<Token> tokens;

        /* JADX WARN: Multi-variable type inference failed */
        public ParsingState(@NotNull List<? extends Token> tokens, @NotNull String rawExpr) {
            Intrinsics.checkNotNullParameter(tokens, "tokens");
            Intrinsics.checkNotNullParameter(rawExpr, "rawExpr");
            this.tokens = tokens;
            this.rawExpr = rawExpr;
        }

        @NotNull
        public final Token currentToken() {
            return this.tokens.get(this.index);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParsingState)) {
                return false;
            }
            ParsingState parsingState = (ParsingState) obj;
            return Intrinsics.areEqual(this.tokens, parsingState.tokens) && Intrinsics.areEqual(this.rawExpr, parsingState.rawExpr);
        }

        public final int forward() {
            int i4 = this.index;
            this.index = i4 + 1;
            return i4;
        }

        @NotNull
        public final String getRawExpr() {
            return this.rawExpr;
        }

        public int hashCode() {
            return (this.tokens.hashCode() * 31) + this.rawExpr.hashCode();
        }

        public final boolean isAtEnd() {
            return this.index >= this.tokens.size();
        }

        public final boolean isNotAtEnd() {
            return !isAtEnd();
        }

        @NotNull
        public final Token next() {
            return this.tokens.get(forward());
        }

        @NotNull
        public String toString() {
            return "ParsingState(tokens=" + this.tokens + ", rawExpr=" + this.rawExpr + ')';
        }
    }

    private Parser() {
    }

    private final Evaluable and(ParsingState parsingState) {
        Evaluable equal = equal(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Logical.And)) {
            parsingState.forward();
            equal = new Evaluable.Binary(Token.Operator.Binary.Logical.And.INSTANCE, equal, equal(parsingState), parsingState.getRawExpr());
        }
        return equal;
    }

    private final Evaluable call(ParsingState parsingState, Evaluable evaluable) {
        if (parsingState.isAtEnd()) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        Token next = parsingState.next();
        if (evaluable != null && !(next instanceof Token.Function)) {
            throw new EvaluableException("Method expected after .", null, 2, null);
        }
        if (next instanceof Token.Operand.Literal) {
            return new Evaluable.Value((Token.Operand.Literal) next, parsingState.getRawExpr());
        }
        if (next instanceof Token.Operand.Variable) {
            return new Evaluable.Variable(((Token.Operand.Variable) next).m206unboximpl(), parsingState.getRawExpr(), null);
        }
        if (next instanceof Token.Function) {
            return parseFunction((Token.Function) next, parsingState, evaluable);
        }
        if (next instanceof Token$Bracket$LeftRound) {
            Evaluable expression = expression(parsingState);
            if (parsingState.next() instanceof Token$Bracket$RightRound) {
                return expression;
            }
            throw new EvaluableException("')' expected after expression", null, 2, null);
        }
        if (!(next instanceof Token$StringTemplate$Start)) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        ArrayList arrayList = new ArrayList();
        while (parsingState.isNotAtEnd() && !(parsingState.currentToken() instanceof Token$StringTemplate$End)) {
            if ((parsingState.currentToken() instanceof Token$StringTemplate$StartOfExpression) || (parsingState.currentToken() instanceof Token$StringTemplate$EndOfExpression)) {
                parsingState.forward();
            } else {
                arrayList.add(expression(parsingState));
            }
        }
        if (parsingState.next() instanceof Token$StringTemplate$End) {
            return new Evaluable.StringTemplate(arrayList, parsingState.getRawExpr());
        }
        throw new EvaluableException("expected ''' at end of a string template", null, 2, null);
    }

    static /* synthetic */ Evaluable call$default(Parser parser, ParsingState parsingState, Evaluable evaluable, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            evaluable = null;
        }
        return parser.call(parsingState, evaluable);
    }

    private final Evaluable comparison(ParsingState parsingState) {
        Evaluable sum = sum(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Comparison)) {
            Token next = parsingState.next();
            Evaluable sum2 = sum(parsingState);
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            sum = new Evaluable.Binary((Token.Operator.Binary) next, sum, sum2, parsingState.getRawExpr());
        }
        return sum;
    }

    private final Evaluable equal(ParsingState parsingState) {
        Evaluable comparison = comparison(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Equality)) {
            Token next = parsingState.next();
            Evaluable comparison2 = comparison(parsingState);
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            comparison = new Evaluable.Binary((Token.Operator.Binary) next, comparison, comparison2, parsingState.getRawExpr());
        }
        return comparison;
    }

    private final Evaluable exponent(ParsingState parsingState) {
        Evaluable method = method(parsingState);
        if (!parsingState.isNotAtEnd() || !(parsingState.currentToken() instanceof Token.Operator.Binary.Power)) {
            return method;
        }
        parsingState.forward();
        return new Evaluable.Binary(Token.Operator.Binary.Power.INSTANCE, method, unary(parsingState), parsingState.getRawExpr());
    }

    private final Evaluable expression(ParsingState parsingState) {
        Evaluable m181try = m181try(parsingState);
        if (!parsingState.isNotAtEnd() || !(parsingState.currentToken() instanceof Token.Operator.TernaryIf)) {
            return m181try;
        }
        parsingState.forward();
        Evaluable expression = expression(parsingState);
        if (parsingState.isAtEnd() || !(parsingState.currentToken() instanceof Token.Operator.TernaryElse)) {
            throw new EvaluableException("':' expected in ternary-if-else expression", null, 2, null);
        }
        parsingState.forward();
        return new Evaluable.Ternary(Token.Operator.TernaryIfElse.INSTANCE, m181try, expression, expression(parsingState), parsingState.getRawExpr());
    }

    private final Evaluable factor(ParsingState parsingState) {
        Evaluable unary = unary(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Factor)) {
            Token next = parsingState.next();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            unary = new Evaluable.Binary((Token.Operator.Binary) next, unary, unary(parsingState), parsingState.getRawExpr());
        }
        return unary;
    }

    private final Evaluable method(ParsingState parsingState) {
        Evaluable call$default = call$default(this, parsingState, null, 2, null);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Dot)) {
            parsingState.forward();
            call$default = call(parsingState, call$default);
        }
        return call$default;
    }

    private final Evaluable or(ParsingState parsingState) {
        Evaluable and = and(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Logical.Or)) {
            parsingState.forward();
            and = new Evaluable.Binary(Token.Operator.Binary.Logical.Or.INSTANCE, and, and(parsingState), parsingState.getRawExpr());
        }
        return and;
    }

    private final Evaluable parseFunction(Token.Function function, ParsingState parsingState, Evaluable evaluable) {
        if (!(parsingState.next() instanceof Token$Bracket$LeftRound)) {
            throw new EvaluableException("'(' expected after function call", null, 2, null);
        }
        ArrayList arrayList = new ArrayList();
        if (evaluable != null) {
            arrayList.add(evaluable);
        }
        while (!(parsingState.currentToken() instanceof Token$Bracket$RightRound)) {
            arrayList.add(expression(parsingState));
            if (parsingState.currentToken() instanceof Token.Function.ArgumentDelimiter) {
                parsingState.forward();
            }
        }
        if (parsingState.next() instanceof Token$Bracket$RightRound) {
            return evaluable == null ? new Evaluable.FunctionCall(function, arrayList, parsingState.getRawExpr()) : new Evaluable.MethodCall(function, arrayList, parsingState.getRawExpr());
        }
        throw new EvaluableException("expected ')' after a function call", null, 2, null);
    }

    private final Evaluable sum(ParsingState parsingState) {
        Evaluable factor = factor(parsingState);
        while (parsingState.isNotAtEnd() && (parsingState.currentToken() instanceof Token.Operator.Binary.Sum)) {
            Token next = parsingState.next();
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Binary");
            factor = new Evaluable.Binary((Token.Operator.Binary) next, factor, factor(parsingState), parsingState.getRawExpr());
        }
        return factor;
    }

    /* renamed from: try, reason: not valid java name */
    private final Evaluable m181try(ParsingState parsingState) {
        Evaluable or = or(parsingState);
        if (!parsingState.isNotAtEnd() || !(parsingState.currentToken() instanceof Token.Operator.Try)) {
            return or;
        }
        Token next = parsingState.next();
        Evaluable expression = expression(parsingState);
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator.Try");
        return new Evaluable.Try((Token.Operator.Try) next, or, expression, parsingState.getRawExpr());
    }

    private final Evaluable unary(ParsingState parsingState) {
        if (!parsingState.isNotAtEnd() || !(parsingState.currentToken() instanceof Token.Operator.Unary)) {
            return exponent(parsingState);
        }
        Token next = parsingState.next();
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Token.Operator");
        return new Evaluable.Unary((Token.Operator) next, unary(parsingState), parsingState.getRawExpr());
    }

    @NotNull
    public final Evaluable parse(@NotNull List<? extends Token> tokens, @NotNull String rawExpression) {
        Intrinsics.checkNotNullParameter(tokens, "tokens");
        Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
        if (tokens.isEmpty()) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        ParsingState parsingState = new ParsingState(tokens, rawExpression);
        Evaluable expression = expression(parsingState);
        if (parsingState.isNotAtEnd()) {
            throw new EvaluableException("Expression expected", null, 2, null);
        }
        return expression;
    }
}

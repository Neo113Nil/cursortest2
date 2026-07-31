package com.yandex.div.evaluable.internal;

import com.ironsource.mediationsdk.metadata.a;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.TokenizingException;
import com.yandex.div.evaluable.internal.Token;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class Tokenizer {

    @NotNull
    public static final Tokenizer INSTANCE = new Tokenizer();

    @Metadata
    private static final class TokenizationState {
        private int index;

        @NotNull
        private final char[] source;

        @NotNull
        private final List<Token> tokens;

        public TokenizationState(@NotNull char[] source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
            this.tokens = new ArrayList();
        }

        public static /* synthetic */ int forward$default(TokenizationState tokenizationState, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = 1;
            }
            return tokenizationState.forward(i4);
        }

        public static /* synthetic */ char nextChar$default(TokenizationState tokenizationState, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = 1;
            }
            return tokenizationState.nextChar(i4);
        }

        public static /* synthetic */ char prevChar$default(TokenizationState tokenizationState, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = 1;
            }
            return tokenizationState.prevChar(i4);
        }

        public final char charAt(int i4) {
            if (i4 < 0) {
                return (char) 0;
            }
            char[] cArr = this.source;
            if (i4 < cArr.length) {
                return cArr[i4];
            }
            return (char) 0;
        }

        public final char currentChar() {
            int i4 = this.index;
            char[] cArr = this.source;
            if (i4 >= cArr.length) {
                return (char) 0;
            }
            return cArr[i4];
        }

        public final boolean currentCharIsEscaped() {
            int i4 = this.index;
            if (i4 >= this.source.length) {
                return false;
            }
            int i5 = 0;
            for (int i6 = i4 - 1; i6 > 0 && this.source[i6] == '\\'; i6--) {
                i5++;
            }
            return i5 % 2 == 1;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.areEqual(TokenizationState.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.internal.Tokenizer.TokenizationState");
            return Arrays.equals(this.source, ((TokenizationState) obj).source);
        }

        public final int forward(int i4) {
            int i5 = this.index;
            this.index = i4 + i5;
            return i5;
        }

        public final int getIndex() {
            return this.index;
        }

        @NotNull
        public final List<Token> getTokens() {
            return this.tokens;
        }

        public int hashCode() {
            return Arrays.hashCode(this.source);
        }

        public final char nextChar(int i4) {
            int i5 = this.index;
            int i6 = i5 + i4;
            char[] cArr = this.source;
            if (i6 >= cArr.length) {
                return (char) 0;
            }
            return cArr[i5 + i4];
        }

        @NotNull
        public final String part(int i4, int i5) {
            return StringsKt.s(this.source, i4, i5);
        }

        public final char prevChar(int i4) {
            int i5 = this.index;
            if (i5 - i4 >= 0) {
                return this.source[i5 - i4];
            }
            return (char) 0;
        }

        @NotNull
        public String toString() {
            return "TokenizationState(source=" + Arrays.toString(this.source) + ')';
        }
    }

    private Tokenizer() {
    }

    private final EvaluableException invalidToken(TokenizationState tokenizationState) {
        return new EvaluableException("Invalid token '" + tokenizationState.currentChar() + "' at position " + tokenizationState.getIndex(), null, 2, null);
    }

    private final boolean isAlphabetic(char c4) {
        if ('a' > c4 || c4 >= '{') {
            return ('A' <= c4 && c4 < '[') || c4 == '_';
        }
        return true;
    }

    private final boolean isAtEnd(char c4) {
        return c4 == 0;
    }

    private final boolean isAtEndOfExpression(char c4) {
        return c4 == '}';
    }

    private final boolean isAtEndOfString(TokenizationState tokenizationState, boolean z4) {
        if (isAtEnd(tokenizationState.currentChar()) || isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
            return true;
        }
        return z4 && isAtEndOfStringLiteral(tokenizationState.currentChar(), tokenizationState);
    }

    private final boolean isAtEndOfStringLiteral(char c4, TokenizationState tokenizationState) {
        return c4 == '\'' && !tokenizationState.currentCharIsEscaped();
    }

    private final boolean isDecimal(char c4, char c5, char c6) {
        if (!Character.isDigit(c4)) {
            if (!(c4 == '.' ? Character.isDigit(c6) : !(c4 == 'e' || c4 == 'E') ? !((c4 == '+' || c4 == '-') && ((c5 == 'e' || c5 == 'E') && Character.isDigit(c6))) : !(Character.isDigit(c5) && (Character.isDigit(c6) || c6 == '+' || c6 == '-')))) {
                return false;
            }
        }
        return true;
    }

    private final boolean isDot(char c4) {
        return c4 == '.';
    }

    private final boolean isNumber(char c4) {
        return '0' <= c4 && c4 < ':';
    }

    private final boolean isOperator(List<? extends Token> list) {
        if (list.isEmpty() || (CollectionsKt.last((List) list) instanceof Token.Operator.Unary)) {
            return false;
        }
        return (CollectionsKt.last((List) list) instanceof Token.Operand) || (CollectionsKt.last((List) list) instanceof Token$Bracket$RightRound);
    }

    private final boolean isStartOfExpression(char c4, TokenizationState tokenizationState) {
        return c4 == '@' && TokenizationState.prevChar$default(tokenizationState, 0, 1, null) != '\\' && TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '{';
    }

    private final boolean isUnaryOperator(List<? extends Token> list) {
        return (isOperator(list) || (CollectionsKt.lastOrNull((List) list) instanceof Token.Operator.Unary)) ? false : true;
    }

    private final boolean isValidIdentifier(char c4) {
        return isAlphabetic(c4) || isNumber(c4);
    }

    private final boolean isWhiteSpace(char c4) {
        return c4 == ' ' || c4 == '\t' || c4 == '\r' || c4 == '\n';
    }

    private final boolean processExpression(TokenizationState tokenizationState, List<Token> list) {
        Token token;
        Token token2;
        if (!isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
            return false;
        }
        tokenizationState.forward(2);
        while (!isAtEnd(tokenizationState.currentChar()) && tokenizationState.currentChar() != '}') {
            char currentChar = tokenizationState.currentChar();
            if (currentChar == '?') {
                list.add(Token.Operator.TernaryIf.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == ':') {
                list.add(Token.Operator.TernaryElse.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == '+') {
                if (isUnaryOperator(list)) {
                    token = Token.Operator.Unary.Plus.INSTANCE;
                } else {
                    if (!isOperator(list)) {
                        throw invalidToken(tokenizationState);
                    }
                    token = Token.Operator.Binary.Sum.Plus.INSTANCE;
                }
                list.add(token);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == '-') {
                if (isUnaryOperator(list)) {
                    token2 = Token.Operator.Unary.Minus.INSTANCE;
                } else {
                    if (!isOperator(list)) {
                        throw invalidToken(tokenizationState);
                    }
                    token2 = Token.Operator.Binary.Sum.Minus.INSTANCE;
                }
                list.add(token2);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == '*') {
                list.add(Token.Operator.Binary.Factor.Multiplication.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == '/') {
                list.add(Token.Operator.Binary.Factor.Division.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == '%') {
                list.add(Token.Operator.Binary.Factor.Modulo.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == '!') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '=') {
                    list.add(Token.Operator.Binary.Equality.NotEqual.INSTANCE);
                    tokenizationState.forward(2);
                } else if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == ':') {
                    list.add(Token.Operator.Try.INSTANCE);
                    tokenizationState.forward(2);
                } else {
                    if (!isUnaryOperator(list)) {
                        throw invalidToken(tokenizationState);
                    }
                    list.add(Token.Operator.Unary.Not.INSTANCE);
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                }
            } else if (currentChar == '&') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) != '&') {
                    throw invalidToken(tokenizationState);
                }
                list.add(Token.Operator.Binary.Logical.And.INSTANCE);
                tokenizationState.forward(2);
            } else if (currentChar == '|') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) != '|') {
                    throw invalidToken(tokenizationState);
                }
                list.add(Token.Operator.Binary.Logical.Or.INSTANCE);
                tokenizationState.forward(2);
            } else if (currentChar == '<') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '=') {
                    list.add(Token.Operator.Binary.Comparison.LessOrEqual.INSTANCE);
                    tokenizationState.forward(2);
                } else {
                    list.add(Token.Operator.Binary.Comparison.Less.INSTANCE);
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                }
            } else if (currentChar == '>') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) == '=') {
                    list.add(Token.Operator.Binary.Comparison.GreaterOrEqual.INSTANCE);
                    tokenizationState.forward(2);
                } else {
                    list.add(Token.Operator.Binary.Comparison.Greater.INSTANCE);
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                }
            } else if (currentChar == '=') {
                if (TokenizationState.nextChar$default(tokenizationState, 0, 1, null) != '=') {
                    throw invalidToken(tokenizationState);
                }
                list.add(Token.Operator.Binary.Equality.Equal.INSTANCE);
                tokenizationState.forward(2);
            } else if (currentChar == '(') {
                list.add(Token$Bracket$LeftRound.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == ')') {
                list.add(Token$Bracket$RightRound.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == ',') {
                list.add(Token.Function.ArgumentDelimiter.INSTANCE);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            } else if (currentChar == '\'') {
                processStringTemplate$default(this, tokenizationState, list, false, 4, null);
            } else {
                TokenizationState tokenizationState2 = tokenizationState;
                List<Token> list2 = list;
                if (isWhiteSpace(tokenizationState2.currentChar())) {
                    TokenizationState.forward$default(tokenizationState2, 0, 1, null);
                } else if (isDecimal(tokenizationState2.currentChar(), TokenizationState.prevChar$default(tokenizationState2, 0, 1, null), TokenizationState.nextChar$default(tokenizationState2, 0, 1, null))) {
                    processNumber(tokenizationState2, list2);
                } else if (isAlphabetic(tokenizationState2.currentChar())) {
                    processIdentifier(tokenizationState2, list2);
                } else {
                    if (!isDot(tokenizationState2.currentChar())) {
                        throw invalidToken(tokenizationState2);
                    }
                    TokenizationState.forward$default(tokenizationState2, 0, 1, null);
                    list2.add(Token.Operator.Dot.INSTANCE);
                }
                tokenizationState = tokenizationState2;
                list = list2;
            }
        }
        TokenizationState tokenizationState3 = tokenizationState;
        if (isAtEndOfExpression(tokenizationState3.currentChar())) {
            TokenizationState.forward$default(tokenizationState3, 0, 1, null);
            return true;
        }
        throw new TokenizingException("'}' expected at end of expression at " + tokenizationState3.getIndex(), null, 2, null);
    }

    private final void processIdentifier(TokenizationState tokenizationState, List<Token> list) {
        Token.Function function;
        int index = tokenizationState.getIndex();
        Integer num = null;
        while (true) {
            int index2 = tokenizationState.getIndex();
            while (isValidIdentifier(tokenizationState.currentChar())) {
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
            }
            if (isDot(tokenizationState.currentChar())) {
                int index3 = tokenizationState.getIndex() + 1;
                Integer valueOf = Integer.valueOf(index3);
                TokenizationState.forward$default(tokenizationState, 0, 1, null);
                if (index3 - index2 <= 1) {
                    throw new EvaluableException("Unexpected token: .", null, 2, null);
                }
                num = valueOf;
            }
            if (!isValidIdentifier(tokenizationState.currentChar()) && !isDot(tokenizationState.currentChar())) {
                int index4 = tokenizationState.getIndex();
                while (isWhiteSpace(tokenizationState.currentChar())) {
                    TokenizationState.forward$default(tokenizationState, 0, 1, null);
                }
                if (tokenizationState.currentChar() == '(') {
                    function = new Token.Function(tokenizationState.part(num != null ? num.intValue() : index, index4));
                    if (num == null) {
                        list.add(function);
                        return;
                    }
                    index4 = num.intValue() - 1;
                } else {
                    function = null;
                }
                String part = tokenizationState.part(index, index4);
                Tokenizer tokenizer = INSTANCE;
                if (!tokenizer.processKeyword(part, list)) {
                    if (tokenizer.isDot(tokenizationState.charAt(index4 - 1))) {
                        throw new EvaluableException("Unexpected token: .", null, 2, null);
                    }
                    list.add(Token.Operand.Variable.m200boximpl(Token.Operand.Variable.m201constructorimpl(part)));
                }
                if (function != null) {
                    list.add(Token.Operator.Dot.INSTANCE);
                    list.add(function);
                    return;
                }
                return;
            }
        }
    }

    private final boolean processKeyword(String str, List<Token> list) {
        Token.Operand.Literal.Bool m182boximpl = Intrinsics.areEqual(str, a.f17681g) ? Token.Operand.Literal.Bool.m182boximpl(Token.Operand.Literal.Bool.m183constructorimpl(true)) : Intrinsics.areEqual(str, "false") ? Token.Operand.Literal.Bool.m182boximpl(Token.Operand.Literal.Bool.m183constructorimpl(false)) : null;
        if (m182boximpl == null) {
            return false;
        }
        list.add(m182boximpl);
        return true;
    }

    private final void processNumber(TokenizationState tokenizationState, List<Token> list) {
        String part;
        String part2;
        int index = tokenizationState.getIndex();
        boolean z4 = CollectionsKt.lastOrNull((List) list) instanceof Token.Operator.Unary.Minus;
        if (z4) {
            CollectionsKt.removeLastOrNull(list);
        }
        do {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        } while (Character.isDigit(tokenizationState.currentChar()));
        if (tokenizationState.charAt(index) != '.' && !isDecimal(tokenizationState.currentChar(), TokenizationState.prevChar$default(tokenizationState, 0, 1, null), TokenizationState.nextChar$default(tokenizationState, 0, 1, null))) {
            if (z4) {
                part2 = '-' + tokenizationState.part(index, tokenizationState.getIndex());
            } else {
                part2 = tokenizationState.part(index, tokenizationState.getIndex());
            }
            try {
                list.add(Token.Operand.Literal.Num.m188boximpl(Token.Operand.Literal.Num.m189constructorimpl(Long.valueOf(Long.parseLong(part2)))));
                return;
            } catch (Exception unused) {
                throw new EvaluableException("Value " + part2 + " can't be converted to Integer type.", null, 2, null);
            }
        }
        while (isDecimal(tokenizationState.currentChar(), TokenizationState.prevChar$default(tokenizationState, 0, 1, null), TokenizationState.nextChar$default(tokenizationState, 0, 1, null))) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
        if (z4) {
            part = '-' + tokenizationState.part(index, tokenizationState.getIndex());
        } else {
            part = tokenizationState.part(index, tokenizationState.getIndex());
        }
        try {
            list.add(Token.Operand.Literal.Num.m188boximpl(Token.Operand.Literal.Num.m189constructorimpl(Double.valueOf(Double.parseDouble(part)))));
        } catch (Exception unused2) {
            throw new EvaluableException("Value " + part + " can't be converted to Number type.", null, 2, null);
        }
    }

    /* renamed from: processString-wB-4SYI, reason: not valid java name */
    private final String m207processStringwB4SYI(TokenizationState tokenizationState, boolean z4) {
        int index = tokenizationState.getIndex();
        while (!isAtEndOfString(tokenizationState, z4)) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
        String process$default = LiteralsEscaper.process$default(LiteralsEscaper.INSTANCE, tokenizationState.part(index, tokenizationState.getIndex()), null, 2, null);
        if (process$default.length() > 0) {
            return Token.Operand.Literal.Str.m195constructorimpl(process$default);
        }
        return null;
    }

    private final void processStringTemplate(TokenizationState tokenizationState, List<Token> list, boolean z4) {
        if (z4) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
        ArrayList arrayList = new ArrayList();
        String m207processStringwB4SYI = m207processStringwB4SYI(tokenizationState, z4);
        if (isAtEnd(tokenizationState.currentChar())) {
            if (z4) {
                throw new TokenizingException("''' expected at end of string literal at " + tokenizationState.getIndex(), null, 2, null);
            }
            if (m207processStringwB4SYI != null) {
                list.add(Token.Operand.Literal.Str.m194boximpl(m207processStringwB4SYI));
                return;
            }
            return;
        }
        if (isAtEndOfStringLiteral(tokenizationState.currentChar(), tokenizationState)) {
            if (m207processStringwB4SYI == null) {
                m207processStringwB4SYI = Token.Operand.Literal.Str.m195constructorimpl("");
            }
            list.add(Token.Operand.Literal.Str.m194boximpl(m207processStringwB4SYI));
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
            return;
        }
        if (m207processStringwB4SYI != null && isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
            arrayList.add(Token$StringTemplate$Start.INSTANCE);
            arrayList.add(Token.Operand.Literal.Str.m194boximpl(m207processStringwB4SYI));
        }
        while (isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
            ArrayList arrayList2 = new ArrayList();
            processExpression(tokenizationState, arrayList2);
            String m207processStringwB4SYI2 = m207processStringwB4SYI(tokenizationState, z4);
            if (!z4 && arrayList.isEmpty() && m207processStringwB4SYI2 == null && !isStartOfExpression(tokenizationState.currentChar(), tokenizationState)) {
                list.addAll(arrayList2);
                return;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(Token$StringTemplate$Start.INSTANCE);
            }
            arrayList.add(Token$StringTemplate$StartOfExpression.INSTANCE);
            arrayList.addAll(arrayList2);
            arrayList.add(Token$StringTemplate$EndOfExpression.INSTANCE);
            if (m207processStringwB4SYI2 != null) {
                arrayList.add(Token.Operand.Literal.Str.m194boximpl(m207processStringwB4SYI2));
            }
        }
        if (z4 && !isAtEndOfStringLiteral(tokenizationState.currentChar(), tokenizationState)) {
            throw new TokenizingException("''' expected at end of string literal at " + tokenizationState.getIndex(), null, 2, null);
        }
        if (!arrayList.isEmpty()) {
            list.addAll(arrayList);
            list.add(Token$StringTemplate$End.INSTANCE);
        }
        if (z4) {
            TokenizationState.forward$default(tokenizationState, 0, 1, null);
        }
    }

    static /* synthetic */ void processStringTemplate$default(Tokenizer tokenizer, TokenizationState tokenizationState, List list, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = true;
        }
        tokenizer.processStringTemplate(tokenizationState, list, z4);
    }

    @NotNull
    public final List<Token> tokenize(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        char[] charArray = input.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        return tokenize(charArray);
    }

    private final List<Token> tokenize(char[] cArr) {
        TokenizationState tokenizationState = new TokenizationState(cArr);
        try {
            processStringTemplate(tokenizationState, tokenizationState.getTokens(), false);
            return tokenizationState.getTokens();
        } catch (EvaluableException e4) {
            if (!(e4 instanceof TokenizingException)) {
                throw e4;
            }
            throw new EvaluableException("Error tokenizing '" + StringsKt.r(cArr) + "'.", e4);
        }
    }
}

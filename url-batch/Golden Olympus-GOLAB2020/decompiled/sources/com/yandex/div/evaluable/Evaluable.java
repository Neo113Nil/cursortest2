package com.yandex.div.evaluable;

import W1.m;
import com.yandex.div.evaluable.function.GetBooleanValue;
import com.yandex.div.evaluable.function.GetColorValue;
import com.yandex.div.evaluable.function.GetColorValueString;
import com.yandex.div.evaluable.function.GetIntegerValue;
import com.yandex.div.evaluable.function.GetNumberValue;
import com.yandex.div.evaluable.function.GetStringValue;
import com.yandex.div.evaluable.function.GetUrlValueWithStringFallback;
import com.yandex.div.evaluable.function.GetUrlValueWithUrlFallback;
import com.yandex.div.evaluable.internal.Parser;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.internal.Tokenizer;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.T;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class Evaluable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Set<String> functionsWithVariableName = T.h(GetIntegerValue.INSTANCE.getName(), GetNumberValue.INSTANCE.getName(), GetStringValue.INSTANCE.getName(), GetColorValue.INSTANCE.getName(), GetColorValueString.INSTANCE.getName(), GetUrlValueWithUrlFallback.INSTANCE.getName(), GetUrlValueWithStringFallback.INSTANCE.getName(), GetBooleanValue.INSTANCE.getName());
    private boolean evalCalled;
    private boolean isCacheable;

    @NotNull
    private final String rawExpr;

    @Metadata
    public static final class Binary extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable left;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Evaluable right;

        @NotNull
        private final Token.Operator.Binary token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Binary(@NotNull Token.Operator.Binary token, @NotNull Evaluable left, @NotNull Evaluable right, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.left = left;
            this.right = right;
            this.rawExpression = rawExpression;
            this.variables = CollectionsKt.plus((Collection) left.getVariables(), (Iterable) right.getVariables());
            this.dynamicVariables = CollectionsKt.plus((Collection) left.getDynamicVariables(), (Iterable) right.getDynamicVariables());
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Binary)) {
                return false;
            }
            Binary binary = (Binary) obj;
            return Intrinsics.areEqual(this.token, binary.token) && Intrinsics.areEqual(this.left, binary.left) && Intrinsics.areEqual(this.right, binary.right) && Intrinsics.areEqual(this.rawExpression, binary.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalBinary$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Evaluable getLeft() {
            return this.left;
        }

        @NotNull
        public final Evaluable getRight() {
            return this.right;
        }

        @NotNull
        public final Token.Operator.Binary getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((((this.token.hashCode() * 31) + this.left.hashCode()) * 31) + this.right.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(this.left);
            sb.append(' ');
            sb.append(this.token);
            sb.append(' ');
            sb.append(this.right);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<String> getFunctionsWithVariableName$div_evaluable() {
            return Evaluable.functionsWithVariableName;
        }

        @NotNull
        public final Evaluable lazy(@NotNull String expr) {
            Intrinsics.checkNotNullParameter(expr, "expr");
            return new Lazy(expr);
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class FunctionCall extends Evaluable {

        @NotNull
        private final List<Evaluable> arguments;

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Function token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FunctionCall(@NotNull Token.Function token, @NotNull List<? extends Evaluable> arguments, @NotNull String rawExpression) {
            super(rawExpression);
            Object obj;
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.arguments = arguments;
            this.rawExpression = rawExpression;
            List<? extends Evaluable> list = arguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = CollectionsKt.plus((Collection) next, (Iterable) it2.next());
                }
                obj = next;
            } else {
                obj = null;
            }
            List<String> list2 = (List) obj;
            this.variables = list2 == null ? CollectionsKt.emptyList() : list2;
            this.dynamicVariables = findDynamicVariables();
        }

        private final List<Evaluable> findDynamicVariables() {
            Object obj;
            List<Evaluable> emptyList = Evaluable.Companion.getFunctionsWithVariableName$div_evaluable().contains(this.token.getName()) ? this.arguments : CollectionsKt.emptyList();
            List<Evaluable> list = this.arguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getDynamicVariables());
            }
            Iterator it2 = CollectionsKt.plus((Collection) arrayList, (Iterable) CollectionsKt.listOf(emptyList)).iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = CollectionsKt.plus((Collection) next, (Iterable) it2.next());
                }
                obj = next;
            } else {
                obj = null;
            }
            List<Evaluable> list2 = (List) obj;
            return list2 == null ? CollectionsKt.emptyList() : list2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FunctionCall)) {
                return false;
            }
            FunctionCall functionCall = (FunctionCall) obj;
            return Intrinsics.areEqual(this.token, functionCall.token) && Intrinsics.areEqual(this.arguments, functionCall.arguments) && Intrinsics.areEqual(this.rawExpression, functionCall.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalFunctionCall$div_evaluable(this);
        }

        @NotNull
        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Token.Function getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((this.token.hashCode() * 31) + this.arguments.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            return this.token.getName() + '(' + CollectionsKt.joinToString$default(this.arguments, Token.Function.ArgumentDelimiter.INSTANCE.toString(), null, null, 0, null, null, 62, null) + ')';
        }
    }

    @Metadata
    public static final class Lazy extends Evaluable {

        @NotNull
        private final String expr;
        private Evaluable expression;

        @NotNull
        private final List<Token> tokens;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Lazy(@NotNull String expr) {
            super(expr);
            Intrinsics.checkNotNullParameter(expr, "expr");
            this.expr = expr;
            this.tokens = Tokenizer.INSTANCE.tokenize(expr);
        }

        private final void initExpression() {
            if (this.expression == null) {
                this.expression = Parser.INSTANCE.parse(this.tokens, getRawExpr());
            }
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            initExpression();
            Evaluable evaluable = this.expression;
            Evaluable evaluable2 = null;
            if (evaluable == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expression");
                evaluable = null;
            }
            Object eval$div_evaluable = evaluable.eval$div_evaluable(evaluator);
            Evaluable evaluable3 = this.expression;
            if (evaluable3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expression");
            } else {
                evaluable2 = evaluable3;
            }
            updateIsCacheable$div_evaluable(evaluable2.isCacheable);
            return eval$div_evaluable;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            initExpression();
            Unit unit = Unit.f41027a;
            Evaluable evaluable = this.expression;
            if (evaluable == null) {
                Intrinsics.throwUninitializedPropertyAccessException("expression");
                evaluable = null;
            }
            return evaluable.getDynamicVariables();
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            Evaluable evaluable = this.expression;
            if (evaluable != null) {
                if (evaluable == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("expression");
                    evaluable = null;
                }
                return evaluable.getVariables();
            }
            List<Token> list = this.tokens;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof Token.Operand.Variable) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                arrayList2.add(((Token.Operand.Variable) obj2).m206unboximpl());
            }
            return arrayList2;
        }

        @NotNull
        public String toString() {
            return this.expr;
        }
    }

    @Metadata
    public static final class MethodCall extends Evaluable {

        @NotNull
        private final List<Evaluable> arguments;

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Function token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MethodCall(@NotNull Token.Function token, @NotNull List<? extends Evaluable> arguments, @NotNull String rawExpression) {
            super(rawExpression);
            Object next;
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.arguments = arguments;
            this.rawExpression = rawExpression;
            List<? extends Evaluable> list = arguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            Object obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                while (it2.hasNext()) {
                    next = CollectionsKt.plus((Collection) next, (Iterable) it2.next());
                }
            } else {
                next = null;
            }
            List<String> list2 = (List) next;
            this.variables = list2 == null ? CollectionsKt.emptyList() : list2;
            List<Evaluable> list3 = this.arguments;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Evaluable) it3.next()).getDynamicVariables());
            }
            Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                obj = it4.next();
                while (it4.hasNext()) {
                    obj = CollectionsKt.plus((Collection) obj, (Iterable) it4.next());
                }
            }
            List<Evaluable> list4 = (List) obj;
            this.dynamicVariables = list4 == null ? CollectionsKt.emptyList() : list4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodCall)) {
                return false;
            }
            MethodCall methodCall = (MethodCall) obj;
            return Intrinsics.areEqual(this.token, methodCall.token) && Intrinsics.areEqual(this.arguments, methodCall.arguments) && Intrinsics.areEqual(this.rawExpression, methodCall.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalMethodCall$div_evaluable(this);
        }

        @NotNull
        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Token.Function getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((this.token.hashCode() * 31) + this.arguments.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            String str;
            if (this.arguments.size() > 1) {
                List<Evaluable> list = this.arguments;
                str = CollectionsKt.joinToString$default(list.subList(1, list.size()), Token.Function.ArgumentDelimiter.INSTANCE.toString(), null, null, 0, null, null, 62, null);
            } else {
                str = "";
            }
            return CollectionsKt.first((List) this.arguments) + JwtParser.SEPARATOR_CHAR + this.token.getName() + '(' + str + ')';
        }
    }

    @Metadata
    public static final class StringTemplate extends Evaluable {

        @NotNull
        private final List<Evaluable> arguments;

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StringTemplate(@NotNull List<? extends Evaluable> arguments, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.arguments = arguments;
            this.rawExpression = rawExpression;
            List<? extends Evaluable> list = arguments;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = CollectionsKt.plus((Collection) next, (Iterable) it2.next());
            }
            this.variables = (List) next;
            List<Evaluable> list2 = this.arguments;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Evaluable) it3.next()).getDynamicVariables());
            }
            Iterator it4 = arrayList2.iterator();
            if (!it4.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next2 = it4.next();
            while (it4.hasNext()) {
                next2 = CollectionsKt.plus((Collection) next2, (Iterable) it4.next());
            }
            this.dynamicVariables = (List) next2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringTemplate)) {
                return false;
            }
            StringTemplate stringTemplate = (StringTemplate) obj;
            return Intrinsics.areEqual(this.arguments, stringTemplate.arguments) && Intrinsics.areEqual(this.rawExpression, stringTemplate.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalStringTemplate$div_evaluable(this);
        }

        @NotNull
        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (this.arguments.hashCode() * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            return CollectionsKt.joinToString$default(this.arguments, "", null, null, 0, null, null, 62, null);
        }
    }

    @Metadata
    public static final class Ternary extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable firstExpression;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Evaluable secondExpression;

        @NotNull
        private final Evaluable thirdExpression;

        @NotNull
        private final Token.Operator token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ternary(@NotNull Token.Operator token, @NotNull Evaluable firstExpression, @NotNull Evaluable secondExpression, @NotNull Evaluable thirdExpression, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(firstExpression, "firstExpression");
            Intrinsics.checkNotNullParameter(secondExpression, "secondExpression");
            Intrinsics.checkNotNullParameter(thirdExpression, "thirdExpression");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.firstExpression = firstExpression;
            this.secondExpression = secondExpression;
            this.thirdExpression = thirdExpression;
            this.rawExpression = rawExpression;
            this.variables = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) firstExpression.getVariables(), (Iterable) secondExpression.getVariables()), (Iterable) thirdExpression.getVariables());
            this.dynamicVariables = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) firstExpression.getDynamicVariables(), (Iterable) secondExpression.getDynamicVariables()), (Iterable) thirdExpression.getDynamicVariables());
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ternary)) {
                return false;
            }
            Ternary ternary = (Ternary) obj;
            return Intrinsics.areEqual(this.token, ternary.token) && Intrinsics.areEqual(this.firstExpression, ternary.firstExpression) && Intrinsics.areEqual(this.secondExpression, ternary.secondExpression) && Intrinsics.areEqual(this.thirdExpression, ternary.thirdExpression) && Intrinsics.areEqual(this.rawExpression, ternary.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalTernary$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Evaluable getFirstExpression() {
            return this.firstExpression;
        }

        @NotNull
        public final Evaluable getSecondExpression() {
            return this.secondExpression;
        }

        @NotNull
        public final Evaluable getThirdExpression() {
            return this.thirdExpression;
        }

        @NotNull
        public final Token.Operator getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((((((this.token.hashCode() * 31) + this.firstExpression.hashCode()) * 31) + this.secondExpression.hashCode()) * 31) + this.thirdExpression.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            Token.Operator.TernaryIf ternaryIf = Token.Operator.TernaryIf.INSTANCE;
            Token.Operator.TernaryElse ternaryElse = Token.Operator.TernaryElse.INSTANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(this.firstExpression);
            sb.append(' ');
            sb.append(ternaryIf);
            sb.append(' ');
            sb.append(this.secondExpression);
            sb.append(' ');
            sb.append(ternaryElse);
            sb.append(' ');
            sb.append(this.thirdExpression);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata
    public static final class Try extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable fallbackExpression;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Operator.Try token;

        @NotNull
        private final Evaluable tryExpression;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Try(@NotNull Token.Operator.Try token, @NotNull Evaluable tryExpression, @NotNull Evaluable fallbackExpression, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(tryExpression, "tryExpression");
            Intrinsics.checkNotNullParameter(fallbackExpression, "fallbackExpression");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.tryExpression = tryExpression;
            this.fallbackExpression = fallbackExpression;
            this.rawExpression = rawExpression;
            this.variables = CollectionsKt.plus((Collection) tryExpression.getVariables(), (Iterable) fallbackExpression.getVariables());
            this.dynamicVariables = CollectionsKt.plus((Collection) tryExpression.getDynamicVariables(), (Iterable) fallbackExpression.getDynamicVariables());
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Try)) {
                return false;
            }
            Try r5 = (Try) obj;
            return Intrinsics.areEqual(this.token, r5.token) && Intrinsics.areEqual(this.tryExpression, r5.tryExpression) && Intrinsics.areEqual(this.fallbackExpression, r5.fallbackExpression) && Intrinsics.areEqual(this.rawExpression, r5.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalTry$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Evaluable getFallbackExpression() {
            return this.fallbackExpression;
        }

        @NotNull
        public final Evaluable getTryExpression() {
            return this.tryExpression;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((((this.token.hashCode() * 31) + this.tryExpression.hashCode()) * 31) + this.fallbackExpression.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(this.tryExpression);
            sb.append(' ');
            sb.append(this.token);
            sb.append(' ');
            sb.append(this.fallbackExpression);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata
    public static final class Unary extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final Evaluable expression;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Operator token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unary(@NotNull Token.Operator token, @NotNull Evaluable expression, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(expression, "expression");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.expression = expression;
            this.rawExpression = rawExpression;
            this.variables = expression.getVariables();
            this.dynamicVariables = expression.getDynamicVariables();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unary)) {
                return false;
            }
            Unary unary = (Unary) obj;
            return Intrinsics.areEqual(this.token, unary.token) && Intrinsics.areEqual(this.expression, unary.expression) && Intrinsics.areEqual(this.rawExpression, unary.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalUnary$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Evaluable getExpression() {
            return this.expression;
        }

        @NotNull
        public final Token.Operator getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (((this.token.hashCode() * 31) + this.expression.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.token);
            sb.append(this.expression);
            return sb.toString();
        }
    }

    @Metadata
    public static final class Value extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final Token.Operand.Literal token;

        @NotNull
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Value(@NotNull Token.Operand.Literal token, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.rawExpression = rawExpression;
            this.variables = CollectionsKt.emptyList();
            this.dynamicVariables = CollectionsKt.emptyList();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return Intrinsics.areEqual(this.token, value.token) && Intrinsics.areEqual(this.rawExpression, value.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalValue$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        public final Token.Operand.Literal getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (this.token.hashCode() * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            Token.Operand.Literal literal = this.token;
            if (literal instanceof Token.Operand.Literal.Str) {
                return '\'' + ((Token.Operand.Literal.Str) this.token).m199unboximpl() + '\'';
            }
            if (literal instanceof Token.Operand.Literal.Num) {
                return ((Token.Operand.Literal.Num) literal).m193unboximpl().toString();
            }
            if (literal instanceof Token.Operand.Literal.Bool) {
                return String.valueOf(((Token.Operand.Literal.Bool) literal).m187unboximpl());
            }
            throw new m();
        }
    }

    @Metadata
    public static final class Variable extends Evaluable {

        @NotNull
        private final List<Evaluable> dynamicVariables;

        @NotNull
        private final String rawExpression;

        @NotNull
        private final String token;

        @NotNull
        private final List<String> variables;

        public /* synthetic */ Variable(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Variable)) {
                return false;
            }
            Variable variable = (Variable) obj;
            return Token.Operand.Variable.m203equalsimpl0(this.token, variable.token) && Intrinsics.areEqual(this.rawExpression, variable.rawExpression);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        protected Object evalImpl(@NotNull Evaluator evaluator) {
            Intrinsics.checkNotNullParameter(evaluator, "evaluator");
            return evaluator.evalVariable$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @NotNull
        /* renamed from: getToken-A4lXSVo, reason: not valid java name */
        public final String m169getTokenA4lXSVo() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        public List<String> getVariables() {
            return this.variables;
        }

        public int hashCode() {
            return (Token.Operand.Variable.m204hashCodeimpl(this.token) * 31) + this.rawExpression.hashCode();
        }

        @NotNull
        public String toString() {
            return this.token;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Variable(String token, String rawExpression) {
            super(rawExpression);
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
            this.token = token;
            this.rawExpression = rawExpression;
            this.variables = CollectionsKt.listOf(token);
            this.dynamicVariables = CollectionsKt.emptyList();
        }
    }

    public Evaluable(@NotNull String rawExpr) {
        Intrinsics.checkNotNullParameter(rawExpr, "rawExpr");
        this.rawExpr = rawExpr;
        this.isCacheable = true;
    }

    public final boolean checkIsCacheable() {
        return this.isCacheable;
    }

    @NotNull
    public final Object eval$div_evaluable(@NotNull Evaluator evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Object evalImpl = evalImpl(evaluator);
        this.evalCalled = true;
        return evalImpl;
    }

    @NotNull
    protected abstract Object evalImpl(@NotNull Evaluator evaluator);

    @NotNull
    public abstract List<Evaluable> getDynamicVariables();

    @NotNull
    public final String getRawExpr() {
        return this.rawExpr;
    }

    @NotNull
    public abstract List<String> getVariables();

    public final void updateIsCacheable$div_evaluable(boolean z4) {
        this.isCacheable = this.isCacheable && z4;
    }
}

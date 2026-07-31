package com.yandex.div.evaluable;

import W1.f;
import W1.m;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import com.yandex.div.evaluable.types.Url;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public class Evaluator {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final EvaluationContext evaluationContext;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
        
            if (r2 == r11.longValue()) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r13, (java.lang.Object) (-1L)) != false) goto L21;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object evalFactor$div_evaluable(@NotNull Token.Operator.Binary.Factor operator, @NotNull Object left, @NotNull Object right) {
            double doubleValue;
            long longValue;
            Intrinsics.checkNotNullParameter(operator, "operator");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            if (!(left instanceof Long) || !(right instanceof Long)) {
                if (!(left instanceof Double) || !(right instanceof Double)) {
                    EvaluableExceptionKt.throwExceptionOnEvaluationFailed(operator, left, right);
                    throw new f();
                }
                if (operator instanceof Token.Operator.Binary.Factor.Multiplication) {
                    doubleValue = ((Number) left).doubleValue() * ((Number) right).doubleValue();
                } else if (operator instanceof Token.Operator.Binary.Factor.Division) {
                    Number number = (Number) right;
                    if (number.doubleValue() == 0.0d) {
                        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(left + " / " + right, "Division by zero is not supported.", null, 4, null);
                        throw new f();
                    }
                    doubleValue = ((Number) left).doubleValue() / number.doubleValue();
                } else {
                    if (!(operator instanceof Token.Operator.Binary.Factor.Modulo)) {
                        throw new m();
                    }
                    Number number2 = (Number) right;
                    if (number2.doubleValue() == 0.0d) {
                        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(left + " % " + right, "Division by zero is not supported.", null, 4, null);
                        throw new f();
                    }
                    doubleValue = ((Number) left).doubleValue() % number2.doubleValue();
                }
                return Double.valueOf(doubleValue);
            }
            if (operator instanceof Token.Operator.Binary.Factor.Multiplication) {
                Number number3 = (Number) left;
                Number number4 = (Number) right;
                long longValue2 = number3.longValue() * number4.longValue();
                if (((Math.abs(number3.longValue()) | Math.abs(number4.longValue())) >>> 31) != 0) {
                    if (!Intrinsics.areEqual(right, (Object) 0L)) {
                        long longValue3 = longValue2 / number4.longValue();
                        if (left != null) {
                        }
                        throw new IntegerOverflow(left + " * " + right, null, 2, null);
                    }
                    if (Intrinsics.areEqual(left, (Object) Long.MIN_VALUE)) {
                    }
                }
                return Long.valueOf(longValue2);
            }
            if (operator instanceof Token.Operator.Binary.Factor.Division) {
                if (Intrinsics.areEqual(right, (Object) 0L)) {
                    EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(left + " / " + right, "Division by zero is not supported.", null, 4, null);
                    throw new f();
                }
                longValue = ((Number) left).longValue() / ((Number) right).longValue();
            } else {
                if (!(operator instanceof Token.Operator.Binary.Factor.Modulo)) {
                    throw new m();
                }
                if (Intrinsics.areEqual(right, (Object) 0L)) {
                    EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(left + " % " + right, "Division by zero is not supported.", null, 4, null);
                    throw new f();
                }
                longValue = ((Number) left).longValue() % ((Number) right).longValue();
            }
            return Long.valueOf(longValue);
        }

        @NotNull
        public final Object evalSum$div_evaluable(@NotNull Token.Operator.Binary.Sum operator, @NotNull Object left, @NotNull Object right) {
            double doubleValue;
            Intrinsics.checkNotNullParameter(operator, "operator");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            if ((left instanceof String) && (right instanceof String)) {
                if (!(operator instanceof Token.Operator.Binary.Sum.Plus)) {
                    EvaluableExceptionKt.throwExceptionOnEvaluationFailed(operator, left, right);
                    throw new f();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(left);
                sb.append(right);
                return sb.toString();
            }
            if (!(left instanceof Long) || !(right instanceof Long)) {
                if (!(left instanceof Double) || !(right instanceof Double)) {
                    EvaluableExceptionKt.throwExceptionOnEvaluationFailed(operator, left, right);
                    throw new f();
                }
                if (operator instanceof Token.Operator.Binary.Sum.Plus) {
                    doubleValue = ((Number) left).doubleValue() + ((Number) right).doubleValue();
                } else {
                    if (!(operator instanceof Token.Operator.Binary.Sum.Minus)) {
                        throw new m();
                    }
                    doubleValue = ((Number) left).doubleValue() - ((Number) right).doubleValue();
                }
                return Double.valueOf(doubleValue);
            }
            if (operator instanceof Token.Operator.Binary.Sum.Plus) {
                Number number = (Number) left;
                Number number2 = (Number) right;
                long longValue = number.longValue() + number2.longValue();
                if (((number.longValue() ^ longValue) & (number2.longValue() ^ longValue)) >= 0) {
                    return Long.valueOf(longValue);
                }
                throw new IntegerOverflow(left + " + " + right, null, 2, null);
            }
            if (!(operator instanceof Token.Operator.Binary.Sum.Minus)) {
                throw new m();
            }
            Number number3 = (Number) left;
            Number number4 = (Number) right;
            long longValue2 = number3.longValue() - number4.longValue();
            if (((number3.longValue() ^ number4.longValue()) & (number3.longValue() ^ longValue2)) >= 0) {
                return Long.valueOf(longValue2);
            }
            throw new IntegerOverflow(left + " - " + right, null, 2, null);
        }

        private Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EvaluableType.values().length];
            try {
                iArr[EvaluableType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Evaluator(@NotNull EvaluationContext evaluationContext) {
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        this.evaluationContext = evaluationContext;
    }

    private Pair<Object, Object> castArgumentsIfNeeded(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj.getClass(), obj2.getClass()) ? TuplesKt.to(obj, obj2) : ((obj instanceof Long) && (obj2 instanceof Double)) ? TuplesKt.to(Double.valueOf(((Number) obj).longValue()), obj2) : ((obj instanceof Double) && (obj2 instanceof Long)) ? TuplesKt.to(obj, Double.valueOf(((Number) obj2).longValue())) : TuplesKt.to(obj, obj2);
    }

    private List<Object> castEvalArgumentsIfNeeded(Function function, List<? extends Object> list) {
        EvaluableType evaluableType;
        List<FunctionArgument> declaredArgs = function.getDeclaredArgs();
        List<? extends Object> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        int i4 = 0;
        for (Object obj : list2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            EvaluableType type = declaredArgs.get(g.g(i4, CollectionsKt.getLastIndex(declaredArgs))).getType();
            EvaluableType.Companion companion = EvaluableType.Companion;
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    if (obj == null) {
                        throw new EvaluableException("Unable to find type for null", null, 2, null);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to find type for ");
                    Intrinsics.checkNotNull(obj);
                    sb.append(obj.getClass().getName());
                    throw new EvaluableException(sb.toString(), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            if (type != evaluableType) {
                obj = castIfPossible(obj, type);
            }
            arrayList.add(obj);
            i4 = i5;
        }
        return arrayList;
    }

    private Object castIfPossible(Object obj, EvaluableType evaluableType) {
        return ((obj instanceof Long) && WhenMappings.$EnumSwitchMapping$0[evaluableType.ordinal()] == 1) ? Double.valueOf(((Number) obj).longValue()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
    
        if (r5.compareTo(r6) <= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        if (r5.compareTo(r6) >= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r5.compareTo(r6) > 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r5.compareTo(r6) < 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        return java.lang.Boolean.valueOf(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private <T extends Comparable<? super T>> Object evalComparableTypes(Token.Operator.Binary.Comparison comparison, T t4, T t5) {
        boolean z4 = false;
        if (!(comparison instanceof Token.Operator.Binary.Comparison.Less)) {
            if (!(comparison instanceof Token.Operator.Binary.Comparison.LessOrEqual)) {
                if (!(comparison instanceof Token.Operator.Binary.Comparison.GreaterOrEqual)) {
                    if (!(comparison instanceof Token.Operator.Binary.Comparison.Greater)) {
                        throw new m();
                    }
                }
            }
        }
    }

    private Object evalComparison(Token.Operator.Binary.Comparison comparison, Object obj, Object obj2) {
        if ((obj instanceof Double) && (obj2 instanceof Double)) {
            return evalComparableTypes(comparison, (Comparable) obj, (Comparable) obj2);
        }
        if ((obj instanceof Long) && (obj2 instanceof Long)) {
            return evalComparableTypes(comparison, (Comparable) obj, (Comparable) obj2);
        }
        if ((obj instanceof DateTime) && (obj2 instanceof DateTime)) {
            return evalComparableTypes(comparison, (Comparable) obj, (Comparable) obj2);
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed(comparison, obj, obj2);
        throw new f();
    }

    private Object evalEquality(Token.Operator.Binary.Equality equality, Object obj, Object obj2) {
        boolean z4;
        if (equality instanceof Token.Operator.Binary.Equality.Equal) {
            z4 = Intrinsics.areEqual(obj, obj2);
        } else {
            if (!(equality instanceof Token.Operator.Binary.Equality.NotEqual)) {
                throw new m();
            }
            z4 = !Intrinsics.areEqual(obj, obj2);
        }
        return Boolean.valueOf(z4);
    }

    private Object evalLogical(Token.Operator.Binary.Logical logical, Object obj, Function0<? extends Object> function0) {
        if (!(obj instanceof Boolean)) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(obj + ' ' + logical + " ...", '\'' + logical + "' must be called with boolean operands.", null, 4, null);
            throw new f();
        }
        boolean z4 = logical instanceof Token.Operator.Binary.Logical.Or;
        if ((z4 && ((Boolean) obj).booleanValue()) || ((logical instanceof Token.Operator.Binary.Logical.And) && !((Boolean) obj).booleanValue())) {
            return obj;
        }
        Object invoke = function0.invoke();
        if (!(invoke instanceof Boolean)) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed(logical, obj, invoke);
            throw new f();
        }
        boolean z5 = true;
        if (!z4 ? !((Boolean) obj).booleanValue() || !((Boolean) invoke).booleanValue() : !((Boolean) obj).booleanValue() && !((Boolean) invoke).booleanValue()) {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }

    public <T> T eval(@NotNull Evaluable expr) {
        Intrinsics.checkNotNullParameter(expr, "expr");
        try {
            return (T) expr.eval$div_evaluable(this);
        } catch (EvaluableException e4) {
            throw e4;
        } catch (Exception e5) {
            String message = e5.getMessage();
            if (message == null) {
                message = "";
            }
            throw new EvaluableException(message, e5);
        }
    }

    @NotNull
    public Object evalBinary$div_evaluable(@NotNull Evaluable.Binary binary) {
        Intrinsics.checkNotNullParameter(binary, "binary");
        Object eval = eval(binary.getLeft());
        binary.updateIsCacheable$div_evaluable(binary.getLeft().checkIsCacheable());
        if (binary.getToken() instanceof Token.Operator.Binary.Logical) {
            return evalLogical((Token.Operator.Binary.Logical) binary.getToken(), eval, new Evaluator$evalBinary$1(this, binary));
        }
        Object eval2 = eval(binary.getRight());
        binary.updateIsCacheable$div_evaluable(binary.getRight().checkIsCacheable());
        Pair<Object, Object> castArgumentsIfNeeded = castArgumentsIfNeeded(eval, eval2);
        Object component1 = castArgumentsIfNeeded.component1();
        Object component2 = castArgumentsIfNeeded.component2();
        if (!Intrinsics.areEqual(component1.getClass(), component2.getClass())) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed(binary.getToken(), component1, component2);
            throw new f();
        }
        Token.Operator.Binary token = binary.getToken();
        if (token instanceof Token.Operator.Binary.Equality) {
            return evalEquality((Token.Operator.Binary.Equality) binary.getToken(), component1, component2);
        }
        if (token instanceof Token.Operator.Binary.Sum) {
            return Companion.evalSum$div_evaluable((Token.Operator.Binary.Sum) binary.getToken(), component1, component2);
        }
        if (token instanceof Token.Operator.Binary.Factor) {
            return Companion.evalFactor$div_evaluable((Token.Operator.Binary.Factor) binary.getToken(), component1, component2);
        }
        if (token instanceof Token.Operator.Binary.Comparison) {
            return evalComparison((Token.Operator.Binary.Comparison) binary.getToken(), component1, component2);
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed(binary.getToken(), component1, component2);
        throw new f();
    }

    @NotNull
    public Object evalFunctionCall$div_evaluable(@NotNull Evaluable.FunctionCall functionCall) {
        EvaluableType evaluableType;
        Intrinsics.checkNotNullParameter(functionCall, "functionCall");
        ArrayList arrayList = new ArrayList();
        for (Evaluable evaluable : functionCall.getArguments()) {
            arrayList.add(eval(evaluable));
            functionCall.updateIsCacheable$div_evaluable(evaluable.checkIsCacheable());
        }
        List<? extends EvaluableType> arrayList2 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            EvaluableType.Companion companion = EvaluableType.Companion;
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    if (obj == null) {
                        throw new EvaluableException("Unable to find type for null", null, 2, null);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to find type for ");
                    Intrinsics.checkNotNull(obj);
                    sb.append(obj.getClass().getName());
                    throw new EvaluableException(sb.toString(), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            arrayList2.add(evaluableType);
        }
        try {
            Function function = getEvaluationContext().getFunctionProvider().get(functionCall.getToken().getName(), arrayList2);
            Evaluable m170constructorimpl = ExpressionContext.m170constructorimpl(functionCall);
            functionCall.updateIsCacheable$div_evaluable(function.isPure());
            try {
                return function.m171invokeex6DHhM(getEvaluationContext(), m170constructorimpl, castEvalArgumentsIfNeeded(function, arrayList));
            } catch (IntegerOverflow unused) {
                throw new IntegerOverflow(EvaluableExceptionKt.functionToMessageFormat(function.getName(), arrayList), null, 2, null);
            }
        } catch (EvaluableException e4) {
            String name = functionCall.getToken().getName();
            String message = e4.getMessage();
            if (message == null) {
                message = "";
            }
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(name, arrayList, message, null, 8, null);
            throw new f();
        }
    }

    @NotNull
    public Object evalMethodCall$div_evaluable(@NotNull Evaluable.MethodCall methodCall) {
        EvaluableType evaluableType;
        Intrinsics.checkNotNullParameter(methodCall, "methodCall");
        ArrayList arrayList = new ArrayList();
        for (Evaluable evaluable : methodCall.getArguments()) {
            arrayList.add(eval(evaluable));
            methodCall.updateIsCacheable$div_evaluable(evaluable.checkIsCacheable());
        }
        List<? extends EvaluableType> arrayList2 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            EvaluableType.Companion companion = EvaluableType.Companion;
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    if (obj == null) {
                        throw new EvaluableException("Unable to find type for null", null, 2, null);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to find type for ");
                    Intrinsics.checkNotNull(obj);
                    sb.append(obj.getClass().getName());
                    throw new EvaluableException(sb.toString(), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            arrayList2.add(evaluableType);
        }
        try {
            Function method = getEvaluationContext().getFunctionProvider().getMethod(methodCall.getToken().getName(), arrayList2);
            Evaluable m170constructorimpl = ExpressionContext.m170constructorimpl(methodCall);
            methodCall.updateIsCacheable$div_evaluable(method.isPure());
            return method.m171invokeex6DHhM(getEvaluationContext(), m170constructorimpl, castEvalArgumentsIfNeeded(method, arrayList));
        } catch (EvaluableException e4) {
            String name = methodCall.getToken().getName();
            String message = e4.getMessage();
            if (message == null) {
                message = "";
            }
            EvaluableExceptionKt.throwExceptionOnMethodEvaluationFailed(name, arrayList, message, e4);
            throw new f();
        }
    }

    @NotNull
    public String evalStringTemplate$div_evaluable(@NotNull Evaluable.StringTemplate stringTemplate) {
        Intrinsics.checkNotNullParameter(stringTemplate, "stringTemplate");
        ArrayList arrayList = new ArrayList();
        for (Evaluable evaluable : stringTemplate.getArguments()) {
            arrayList.add(eval(evaluable).toString());
            stringTemplate.updateIsCacheable$div_evaluable(evaluable.checkIsCacheable());
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    @NotNull
    public Object evalTernary$div_evaluable(@NotNull Evaluable.Ternary ternary) {
        Intrinsics.checkNotNullParameter(ternary, "ternary");
        if (!(ternary.getToken() instanceof Token.Operator.TernaryIfElse)) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(ternary.getRawExpr(), ternary.getToken() + " was incorrectly parsed as a ternary operator.", null, 4, null);
            throw new f();
        }
        Object eval = eval(ternary.getFirstExpression());
        ternary.updateIsCacheable$div_evaluable(ternary.getFirstExpression().checkIsCacheable());
        if (eval instanceof Boolean) {
            if (((Boolean) eval).booleanValue()) {
                Object eval2 = eval(ternary.getSecondExpression());
                ternary.updateIsCacheable$div_evaluable(ternary.getSecondExpression().checkIsCacheable());
                return eval2;
            }
            Object eval3 = eval(ternary.getThirdExpression());
            ternary.updateIsCacheable$div_evaluable(ternary.getThirdExpression().checkIsCacheable());
            return eval3;
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(ternary.getFirstExpression() + " ? " + ternary.getSecondExpression() + " : " + ternary.getThirdExpression(), "Ternary must be called with a Boolean value as a condition.", null, 4, null);
        throw new f();
    }

    @NotNull
    public Object evalTry$div_evaluable(@NotNull Evaluable.Try tryEvaluable) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(tryEvaluable, "tryEvaluable");
        try {
            Result.Companion companion = Result.Companion;
            Object eval = eval(tryEvaluable.getTryExpression());
            tryEvaluable.updateIsCacheable$div_evaluable(tryEvaluable.getTryExpression().checkIsCacheable());
            m243constructorimpl = Result.m243constructorimpl(eval);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) == null) {
            return m243constructorimpl;
        }
        Object eval2 = eval(tryEvaluable.getFallbackExpression());
        tryEvaluable.updateIsCacheable$div_evaluable(tryEvaluable.getFallbackExpression().checkIsCacheable());
        return eval2;
    }

    @NotNull
    public Object evalUnary$div_evaluable(@NotNull Evaluable.Unary unary) {
        Intrinsics.checkNotNullParameter(unary, "unary");
        Object eval = eval(unary.getExpression());
        unary.updateIsCacheable$div_evaluable(unary.getExpression().checkIsCacheable());
        Token.Operator token = unary.getToken();
        if (token instanceof Token.Operator.Unary.Plus) {
            if (eval instanceof Long) {
                return Long.valueOf(((Number) eval).longValue());
            }
            if (eval instanceof Double) {
                return Double.valueOf(((Number) eval).doubleValue());
            }
            StringBuilder sb = new StringBuilder();
            sb.append('+');
            sb.append(eval);
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(sb.toString(), "A Number is expected after a unary plus.", null, 4, null);
            throw new f();
        }
        if (token instanceof Token.Operator.Unary.Minus) {
            if (eval instanceof Long) {
                return Long.valueOf(-((Number) eval).longValue());
            }
            if (eval instanceof Double) {
                return Double.valueOf(-((Number) eval).doubleValue());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('-');
            sb2.append(eval);
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(sb2.toString(), "A Number is expected after a unary minus.", null, 4, null);
            throw new f();
        }
        if (!Intrinsics.areEqual(token, Token.Operator.Unary.Not.INSTANCE)) {
            throw new EvaluableException(unary.getToken() + " was incorrectly parsed as a unary operator.", null, 2, null);
        }
        if (eval instanceof Boolean) {
            return Boolean.valueOf(!((Boolean) eval).booleanValue());
        }
        String str = eval instanceof String ? "'" : "";
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default('!' + str + eval + str, "A Boolean is expected after a unary not.", null, 4, null);
        throw new f();
    }

    @NotNull
    public Object evalValue$div_evaluable(@NotNull Evaluable.Value call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Token.Operand.Literal token = call.getToken();
        if (token instanceof Token.Operand.Literal.Num) {
            return ((Token.Operand.Literal.Num) token).m193unboximpl();
        }
        if (token instanceof Token.Operand.Literal.Bool) {
            return Boolean.valueOf(((Token.Operand.Literal.Bool) token).m187unboximpl());
        }
        if (token instanceof Token.Operand.Literal.Str) {
            return ((Token.Operand.Literal.Str) token).m199unboximpl();
        }
        throw new m();
    }

    @NotNull
    public Object evalVariable$div_evaluable(@NotNull Evaluable.Variable call) {
        Intrinsics.checkNotNullParameter(call, "call");
        Object obj = getEvaluationContext().getVariableProvider().get(call.m169getTokenA4lXSVo());
        if (obj != null) {
            return obj;
        }
        throw new MissingVariableException(call.m169getTokenA4lXSVo(), null, 2, null);
    }

    @NotNull
    public EvaluationContext getEvaluationContext() {
        return this.evaluationContext;
    }
}

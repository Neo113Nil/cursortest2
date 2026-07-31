package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import com.ironsource.b9;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.expressions.ConstantExpressionList;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.MutableExpressionList;
import com.yandex.div.serialization.ParsingContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class JsonExpressionParser {
    private static final ExpressionList<?> EMPTY_EXPRESSION_LIST = new ConstantExpressionList(Collections.EMPTY_LIST);

    @NonNull
    private static <V> ExpressionList<V> emptyExpressionList() {
        return (ExpressionList<V>) EMPTY_EXPRESSION_LIST;
    }

    private static <T> T optSafe(JSONObject jSONObject, String str) {
        T t4 = (T) jSONObject.opt(str);
        if (t4 == JSONObject.NULL) {
            return null;
        }
        return t4;
    }

    @NonNull
    public static <V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper) {
        return readExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    public static <V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), JsonParsers.alwaysValid(), null);
    }

    public static <R, V> ExpressionList<V> readOptionalExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator) {
        return readOptionalExpressionList(parsingContext, jSONObject, str, typeHelper, function1, listValidator, JsonParsers.alwaysValid());
    }

    public static <V> void writeExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, Expression<V> expression) {
        writeExpression(parsingContext, jSONObject, str, expression, JsonParsers.doNotConvert());
    }

    public static <R, V> void writeExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, ExpressionList<V> expressionList, @NonNull Function1<V, R> function1) {
        if (expressionList == null) {
            return;
        }
        int i4 = 0;
        if (expressionList instanceof ConstantExpressionList) {
            List<V> evaluate = expressionList.evaluate(ExpressionResolver.EMPTY);
            int size = evaluate.size();
            JSONArray jSONArray = new JSONArray();
            while (i4 < size) {
                jSONArray.put(function1.invoke(evaluate.get(i4)));
                i4++;
            }
            try {
                jSONObject.put(str, jSONArray);
                return;
            } catch (JSONException e4) {
                parsingContext.getLogger().logError(e4);
                return;
            }
        }
        if (expressionList instanceof MutableExpressionList) {
            List expressionsInternal = ((MutableExpressionList) expressionList).getExpressionsInternal();
            if (expressionsInternal.isEmpty()) {
                return;
            }
            int size2 = expressionsInternal.size();
            JSONArray jSONArray2 = new JSONArray();
            while (i4 < size2) {
                Expression expression = (Expression) expressionsInternal.get(i4);
                if (expression instanceof Expression.ConstantExpression) {
                    jSONArray2.put(function1.invoke(expression.evaluate(ExpressionResolver.EMPTY)));
                } else {
                    jSONArray2.put(expression.getRawValue());
                }
                i4++;
            }
            try {
                jSONObject.put(str, jSONArray2);
            } catch (JSONException e5) {
                parsingContext.getLogger().logError(e5);
            }
        }
    }

    @NonNull
    public static <R, V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1) {
        return readExpression(parsingContext, jSONObject, str, typeHelper, function1, JsonParsers.alwaysValid());
    }

    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1, JsonParsers.alwaysValid(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> ExpressionList<V> readOptionalExpressionList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        ExpressionList<V> expressionList;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        ExpressionList<V> expressionList2 = null;
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        if (length == 0) {
            List<? extends V> list = Collections.EMPTY_LIST;
            try {
                if (listValidator.isValid(list)) {
                    return emptyExpressionList();
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, list));
                return emptyExpressionList();
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, list));
                return emptyExpressionList();
            }
        }
        ArrayList arrayList = new ArrayList(length);
        ParsingErrorLogger parsingErrorLogger = null;
        int i4 = 0;
        boolean z4 = false;
        while (i4 < length) {
            Object optSafe = optSafe(optJSONArray, i4);
            if (optSafe != null) {
                if (Expression.mayBeExpression(optSafe)) {
                    if (parsingErrorLogger == null) {
                        parsingErrorLogger = parsingContext.getLogger();
                    }
                    ParsingErrorLogger parsingErrorLogger2 = parsingErrorLogger;
                    arrayList.add(new Expression.MutableExpression(str + b9.i.f15550d + i4 + b9.i.f15552e, optSafe.toString(), function1, valueValidator, parsingErrorLogger2, typeHelper, null));
                    z4 = true;
                    expressionList = expressionList2;
                    parsingErrorLogger = parsingErrorLogger2;
                } else {
                    try {
                        Object invoke = function1.invoke(optSafe);
                        if (invoke != null) {
                            if (typeHelper.isTypeValid(invoke)) {
                                try {
                                    if (valueValidator.isValid(invoke)) {
                                        expressionList = expressionList2;
                                        arrayList.add(invoke);
                                    } else {
                                        expressionList = expressionList2;
                                        try {
                                            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i4, invoke));
                                        } catch (ClassCastException unused2) {
                                            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i4, invoke));
                                            i4++;
                                            expressionList2 = expressionList;
                                        }
                                    }
                                } catch (ClassCastException unused3) {
                                    expressionList = expressionList2;
                                }
                            } else {
                                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i4, optSafe));
                            }
                        }
                    } catch (ClassCastException unused4) {
                        expressionList = expressionList2;
                        parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(optJSONArray, str, i4, optSafe));
                    } catch (Exception e4) {
                        expressionList = expressionList2;
                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(optJSONArray, str, i4, optSafe, e4));
                    }
                }
                i4++;
                expressionList2 = expressionList;
            }
            expressionList = expressionList2;
            i4++;
            expressionList2 = expressionList;
        }
        ExpressionList<V> expressionList3 = expressionList2;
        if (!z4) {
            try {
                if (listValidator.isValid(arrayList)) {
                    return new ConstantExpressionList(arrayList);
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
                return expressionList3;
            } catch (ClassCastException unused5) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
                return expressionList3;
            }
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = arrayList.get(i5);
            if (!(obj instanceof Expression)) {
                arrayList.set(i5, Expression.constant(obj));
            }
        }
        return new MutableExpressionList(str, arrayList, listValidator, parsingContext.getLogger());
    }

    public static <R, V> void writeExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, Expression<V> expression, @NonNull Function1<V, R> function1) {
        if (expression == null) {
            return;
        }
        Object rawValue = expression.getRawValue();
        try {
            if (expression instanceof Expression.MutableExpression) {
                jSONObject.put(str, rawValue);
            } else {
                jSONObject.put(str, function1.invoke(rawValue));
            }
        } catch (JSONException e4) {
            parsingContext.getLogger().logError(e4);
        }
    }

    private static <T> T optSafe(JSONArray jSONArray, int i4) {
        T t4 = (T) jSONArray.opt(i4);
        if (t4 == JSONObject.NULL) {
            return null;
        }
        return t4;
    }

    @NonNull
    public static <V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ValueValidator<V> valueValidator) {
        return readExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), valueValidator);
    }

    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, Expression<V> expression) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1, JsonParsers.alwaysValid(), expression);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, V> Expression<V> readExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe != null) {
            if (Expression.mayBeExpression(optSafe)) {
                return new Expression.MutableExpression(str, optSafe.toString(), function1, valueValidator, parsingContext.getLogger(), typeHelper, null);
            }
            try {
                Object invoke = function1.invoke(optSafe);
                if (invoke != null) {
                    if (typeHelper.isTypeValid(invoke)) {
                        try {
                            if (valueValidator.isValid(invoke)) {
                                return Expression.constant(invoke);
                            }
                            throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe);
                        } catch (ClassCastException unused) {
                            throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
                        }
                    }
                    throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe);
            } catch (ClassCastException unused2) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe);
            } catch (Exception e4) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e4);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    public static <V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull ValueValidator<V> valueValidator, Expression<V> expression) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, JsonParsers.doNotConvert(), valueValidator, expression);
    }

    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        return readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1, valueValidator, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> Expression<V> readOptionalExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator, Expression<V> expression) {
        Object optSafe = optSafe(jSONObject, str);
        if (optSafe == null) {
            return null;
        }
        if (Expression.mayBeExpression(optSafe)) {
            return new Expression.MutableExpression(str, optSafe.toString(), function1, valueValidator, parsingContext.getLogger(), typeHelper, expression);
        }
        try {
            Object invoke = function1.invoke(optSafe);
            if (invoke == null) {
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                return null;
            }
            if (!typeHelper.isTypeValid(invoke)) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
                return null;
            }
            try {
                if (!valueValidator.isValid(invoke)) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe));
                    return null;
                }
                return Expression.constant(invoke);
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, optSafe));
            return null;
        } catch (Exception e4) {
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, optSafe, e4));
            return null;
        }
    }
}

package com.yandex.div.evaluable;

import W1.f;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import com.yandex.div.evaluable.types.Url;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.jsonwebtoken.JwtParser;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public abstract class EvaluableExceptionKt {
    @NotNull
    public static final String functionToMessageFormat(@NotNull String name, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        return CollectionsKt.joinToString$default(args, null, name + '(', ")", 0, null, EvaluableExceptionKt$functionToMessageFormat$1.INSTANCE, 25, null);
    }

    @NotNull
    public static final String methodToMessageFormat(@NotNull String name, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        if (args.size() <= 1) {
            return name + "()";
        }
        return CollectionsKt.joinToString$default(args.subList(1, args.size()), StringUtils.COMMA, name + '(', ")", 0, null, null, 56, null);
    }

    @NotNull
    public static final Void throwExceptionOnEvaluationFailed(@NotNull String expression, @NotNull String reason, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(reason, "reason");
        throw new EvaluableException("Failed to evaluate [" + expression + "]. " + reason, exc);
    }

    public static /* synthetic */ Void throwExceptionOnEvaluationFailed$default(String str, String str2, Exception exc, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            exc = null;
        }
        return throwExceptionOnEvaluationFailed(str, str2, exc);
    }

    @NotNull
    public static final Void throwExceptionOnFunctionEvaluationFailed(@NotNull String name, @NotNull List<? extends Object> args, @NotNull String reason, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(reason, "reason");
        throwExceptionOnEvaluationFailed(functionToMessageFormat(name, args), reason, exc);
        throw new f();
    }

    public static /* synthetic */ Void throwExceptionOnFunctionEvaluationFailed$default(String str, List list, String str2, Exception exc, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            exc = null;
        }
        return throwExceptionOnFunctionEvaluationFailed(str, list, str2, exc);
    }

    @NotNull
    public static final Void throwExceptionOnMethodEvaluationFailed(@NotNull String name, @NotNull List<? extends Object> args, @NotNull String reason, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(reason, "reason");
        throwExceptionOnEvaluationFailed(methodToMessageFormat(name, args), reason, exc);
        throw new f();
    }

    @NotNull
    public static final String toMessageFormat(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, EvaluableExceptionKt$toMessageFormat$1.INSTANCE, 30, null);
    }

    @NotNull
    public static final Void throwExceptionOnEvaluationFailed(@NotNull Token.Operator.Binary operator, @NotNull Object left, @NotNull Object right) {
        EvaluableType evaluableType;
        String sb;
        EvaluableType evaluableType2;
        EvaluableType evaluableType3;
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        String str = toMessageFormat(left) + ' ' + operator + ' ' + toMessageFormat(right);
        if (Intrinsics.areEqual(left.getClass(), right.getClass())) {
            StringBuilder sb2 = new StringBuilder();
            EvaluableType.Companion companion = EvaluableType.Companion;
            if (left instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (left instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (left instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (left instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (left instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (left instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (left instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (left instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(left instanceof JSONArray)) {
                    throw new EvaluableException("Unable to find type for " + left.getClass().getName(), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            sb2.append(evaluableType.getTypeName$div_evaluable());
            sb2.append(" type");
            sb = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("different types: ");
            EvaluableType.Companion companion2 = EvaluableType.Companion;
            if (left instanceof Long) {
                evaluableType2 = EvaluableType.INTEGER;
            } else if (left instanceof Double) {
                evaluableType2 = EvaluableType.NUMBER;
            } else if (left instanceof Boolean) {
                evaluableType2 = EvaluableType.BOOLEAN;
            } else if (left instanceof String) {
                evaluableType2 = EvaluableType.STRING;
            } else if (left instanceof DateTime) {
                evaluableType2 = EvaluableType.DATETIME;
            } else if (left instanceof Color) {
                evaluableType2 = EvaluableType.COLOR;
            } else if (left instanceof Url) {
                evaluableType2 = EvaluableType.URL;
            } else if (left instanceof JSONObject) {
                evaluableType2 = EvaluableType.DICT;
            } else {
                if (!(left instanceof JSONArray)) {
                    throw new EvaluableException("Unable to find type for " + left.getClass().getName(), null, 2, null);
                }
                evaluableType2 = EvaluableType.ARRAY;
            }
            sb3.append(evaluableType2.getTypeName$div_evaluable());
            sb3.append(" and ");
            if (right instanceof Long) {
                evaluableType3 = EvaluableType.INTEGER;
            } else if (right instanceof Double) {
                evaluableType3 = EvaluableType.NUMBER;
            } else if (right instanceof Boolean) {
                evaluableType3 = EvaluableType.BOOLEAN;
            } else if (right instanceof String) {
                evaluableType3 = EvaluableType.STRING;
            } else if (right instanceof DateTime) {
                evaluableType3 = EvaluableType.DATETIME;
            } else if (right instanceof Color) {
                evaluableType3 = EvaluableType.COLOR;
            } else if (right instanceof Url) {
                evaluableType3 = EvaluableType.URL;
            } else if (right instanceof JSONObject) {
                evaluableType3 = EvaluableType.DICT;
            } else {
                if (!(right instanceof JSONArray)) {
                    throw new EvaluableException("Unable to find type for " + right.getClass().getName(), null, 2, null);
                }
                evaluableType3 = EvaluableType.ARRAY;
            }
            sb3.append(evaluableType3.getTypeName$div_evaluable());
            sb = sb3.toString();
        }
        throwExceptionOnEvaluationFailed$default(str, "Operator '" + operator + "' cannot be applied to " + sb + JwtParser.SEPARATOR_CHAR, null, 4, null);
        throw new f();
    }

    @NotNull
    public static final String toMessageFormat(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (obj instanceof JSONArray) {
            return "<array>";
        }
        if (obj instanceof JSONObject) {
            return "<dict>";
        }
        if (!(obj instanceof String)) {
            return obj.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append('\'');
        sb.append(obj);
        sb.append('\'');
        return sb.toString();
    }
}

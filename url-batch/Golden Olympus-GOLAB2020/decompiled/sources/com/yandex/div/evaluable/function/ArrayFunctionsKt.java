package com.yandex.div.evaluable.function;

import W1.f;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import io.jsonwebtoken.JwtParser;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public abstract class ArrayFunctionsKt {
    private static final void checkIndexOfBoundException(String str, List<? extends Object> list, boolean z4) {
        Object obj = list.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
        int length = ((JSONArray) obj).length();
        Object obj2 = list.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj2).longValue();
        if (longValue < length) {
            return;
        }
        throwArrayException(str, list, "Requested index (" + longValue + ") out of bounds array size (" + length + ").", z4);
        throw new f();
    }

    static /* synthetic */ void checkIndexOfBoundException$default(String str, List list, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        checkIndexOfBoundException(str, list, z4);
    }

    @NotNull
    public static final Object evaluateArray(@NotNull String functionName, @NotNull List<? extends Object> args, boolean z4) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        checkIndexOfBoundException(functionName, args, z4);
        Object obj = args.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
        Object obj2 = args.get(1);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
        Object obj3 = ((JSONArray) obj).get((int) ((Long) obj2).longValue());
        Intrinsics.checkNotNullExpressionValue(obj3, "array.get(index.toInt())");
        return obj3;
    }

    public static /* synthetic */ Object evaluateArray$default(String str, List list, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return evaluateArray(str, list, z4);
    }

    @Nullable
    public static final Object evaluateSafe(@NotNull String functionName, @NotNull List<? extends Object> args) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            Result.Companion companion = Result.Companion;
            checkIndexOfBoundException$default(functionName, args, false, 4, null);
            Object obj = args.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj2 = args.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Long");
            m243constructorimpl = Result.m243constructorimpl(((JSONArray) obj).get((int) ((Long) obj2).longValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            return null;
        }
        return m243constructorimpl;
    }

    @Nullable
    public static final Color safeConvertToColor(@Nullable String str) {
        Object m243constructorimpl;
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(Color.m210boximpl(Color.Companion.m220parseC4zCDoM(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        return (Color) (Result.m244isFailureimpl(m243constructorimpl) ? null : m243constructorimpl);
    }

    @Nullable
    public static final String safeConvertToUrl(@Nullable String str) {
        Object m243constructorimpl;
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(Url.m221boximpl(Url.Companion.m228fromVcSV9u8(str)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        Url url = (Url) m243constructorimpl;
        if (url != null) {
            return url.m227unboximpl();
        }
        return null;
    }

    @NotNull
    public static final Void throwArrayException(@NotNull String functionName, @NotNull List<? extends Object> args, @NotNull String message, boolean z4) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(message, "message");
        throwException("array", functionName, args, message, z4);
        throw new f();
    }

    public static /* synthetic */ Void throwArrayException$default(String str, List list, String str2, boolean z4, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z4 = false;
        }
        return throwArrayException(str, list, str2, z4);
    }

    public static final void throwArrayWrongTypeException(@NotNull String functionName, @NotNull List<? extends Object> args, @NotNull EvaluableType expected, @NotNull Object actual, boolean z4) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(expected, "expected");
        Intrinsics.checkNotNullParameter(actual, "actual");
        throwArrayException(functionName, args, "Incorrect value type: expected " + expected.getTypeName$div_evaluable() + ", got " + (!Intrinsics.areEqual(actual, JSONObject.NULL) ? !(actual instanceof Number) ? !(actual instanceof JSONObject) ? actual instanceof JSONArray ? "Array" : actual.getClass().getSimpleName() : "Dict" : "Number" : "Null") + JwtParser.SEPARATOR_CHAR, z4);
        throw new f();
    }

    @NotNull
    public static final Void throwException(@NotNull String type, @NotNull String functionName, @NotNull List<? extends Object> args, @NotNull String message, boolean z4) {
        String str;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(message, "message");
        if (z4) {
            str = "";
        } else {
            str = '<' + type + ">, ";
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(CollectionsKt.joinToString$default(args.subList(1, args.size()), null, functionName + '(' + str, ")", 0, null, ArrayFunctionsKt$throwException$signature$1.INSTANCE, 25, null), message, null, 4, null);
        throw new f();
    }

    public static /* synthetic */ Void throwException$default(String str, String str2, List list, String str3, boolean z4, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z4 = false;
        }
        return throwException(str, str2, list, str3, z4);
    }
}

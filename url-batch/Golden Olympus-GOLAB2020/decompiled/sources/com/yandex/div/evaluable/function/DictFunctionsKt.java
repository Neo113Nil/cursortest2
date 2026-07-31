package com.yandex.div.evaluable.function;

import W1.f;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import io.jsonwebtoken.JwtParser;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public abstract class DictFunctionsKt {
    @NotNull
    public static final Object evaluate(@NotNull String functionName, @NotNull List<? extends Object> args, boolean z4) {
        Object m243constructorimpl;
        Object m243constructorimpl2;
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        JSONObject jSONObject = (JSONObject) CollectionsKt.first((List) args);
        int size = args.size() - 1;
        for (int i4 = 1; i4 < size; i4++) {
            Object obj = args.get(i4);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            try {
                Result.Companion companion = Result.Companion;
                Intrinsics.checkNotNull(jSONObject);
                Object opt = jSONObject.opt(str);
                jSONObject = opt instanceof JSONObject ? (JSONObject) opt : null;
                m243constructorimpl2 = Result.m243constructorimpl(Unit.f41027a);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl2 = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.d(m243constructorimpl2) != null) {
                throwMissingPropertyException(functionName, args, str, z4);
                throw new f();
            }
        }
        Object last = CollectionsKt.last(args);
        Intrinsics.checkNotNull(last, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) last;
        try {
            Result.Companion companion3 = Result.Companion;
            Intrinsics.checkNotNull(jSONObject);
            m243constructorimpl = Result.m243constructorimpl(jSONObject.get(str2));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.d(m243constructorimpl) == null) {
            Intrinsics.checkNotNullExpressionValue(m243constructorimpl, "runCatching { dict!!.get…propName, isMethod)\n    }");
            return m243constructorimpl;
        }
        throwMissingPropertyException(functionName, args, str2, z4);
        throw new f();
    }

    @Nullable
    public static final Object evaluateSafe(@NotNull List<? extends Object> args, @NotNull Object fallback, boolean z4) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        int i4 = !z4 ? 1 : 0;
        Object obj = args.get(i4);
        JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObject != null) {
            int size = args.size() - 1;
            for (int i5 = i4 + 1; i5 < size; i5++) {
                Object obj2 = args.get(i5);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                jSONObject = jSONObject.optJSONObject((String) obj2);
                if (jSONObject != null) {
                }
            }
            Object last = CollectionsKt.last(args);
            Intrinsics.checkNotNull(last, "null cannot be cast to non-null type kotlin.String");
            return jSONObject.opt((String) last);
        }
        return fallback;
    }

    public static /* synthetic */ Object evaluateSafe$default(List list, Object obj, boolean z4, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return evaluateSafe(list, obj, z4);
    }

    @NotNull
    public static final Void throwDictException(@NotNull String functionName, @NotNull List<? extends Object> args, @NotNull String message) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(message, "message");
        ArrayFunctionsKt.throwException$default("dict", functionName, args, message, false, 16, null);
        throw new f();
    }

    @NotNull
    public static final Void throwException(@NotNull String functionName, @NotNull List<? extends Object> args, @NotNull String message, boolean z4) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = z4 ? "" : "<dict>, ";
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(CollectionsKt.joinToString$default(args.subList(1, args.size()), null, functionName + '(' + str, ")", 0, null, DictFunctionsKt$throwException$signature$1.INSTANCE, 25, null), message, null, 4, null);
        throw new f();
    }

    private static final Void throwMissingPropertyException(String str, List<? extends Object> list, String str2, boolean z4) {
        throwException(str, list, "Missing property \"" + str2 + "\" in the dict.", z4);
        throw new f();
    }

    @NotNull
    public static final Void throwWrongTypeException(@NotNull String functionName, @NotNull List<? extends Object> args, @NotNull EvaluableType expected, @NotNull Object actual, boolean z4) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(expected, "expected");
        Intrinsics.checkNotNullParameter(actual, "actual");
        throwException(functionName, args, "Incorrect value type: expected " + expected.getTypeName$div_evaluable() + ", got " + (!Intrinsics.areEqual(actual, JSONObject.NULL) ? !(actual instanceof Number) ? !(actual instanceof JSONObject) ? actual instanceof JSONArray ? "Array" : actual.getClass().getSimpleName() : "Dict" : "Number" : "Null") + JwtParser.SEPARATOR_CHAR, z4);
        throw new f();
    }
}

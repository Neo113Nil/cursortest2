package com.yandex.div.evaluable.function;

import W1.m;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import io.jsonwebtoken.JwtParser;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class FunctionValidatorKt {
    @NotNull
    public static final Exception getFunctionArgumentsException(@NotNull String name, @NotNull List<? extends EvaluableType> args, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        if (z4) {
            return getMethodArgumentsException(name, args);
        }
        if (args.isEmpty()) {
            return new EvaluableException("Function requires non empty argument list.", null, 2, null);
        }
        return new EvaluableException("Function has no matching overload for given argument types: " + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) args) + JwtParser.SEPARATOR_CHAR, null, 2, null);
    }

    public static /* synthetic */ Exception getFunctionArgumentsException$default(String str, List list, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return getFunctionArgumentsException(str, list, z4);
    }

    @NotNull
    public static final Exception getMethodArgumentsException(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        if (args.size() == 1) {
            return new EvaluableException("Method requires non empty argument list.", null, 2, null);
        }
        return new EvaluableException("Method has no matching overload for given argument types: " + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) args.subList(1, args.size())) + JwtParser.SEPARATOR_CHAR, null, 2, null);
    }

    @NotNull
    public static final Function withArgumentsValidation(@NotNull Function function, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        Function.MatchResult matchesArguments$div_evaluable = function.matchesArguments$div_evaluable(args);
        if (!(matchesArguments$div_evaluable instanceof Function.MatchResult.Ok)) {
            if (matchesArguments$div_evaluable instanceof Function.MatchResult.ArgCountMismatch) {
                StringBuilder sb = new StringBuilder();
                sb.append(function.getHasVarArg$div_evaluable() ? "At least" : "Exactly");
                sb.append(' ');
                sb.append(((Function.MatchResult.ArgCountMismatch) matchesArguments$div_evaluable).getExpected());
                sb.append(" argument(s) expected.");
                throw new EvaluableException(sb.toString(), null, 2, null);
            }
            if (!(matchesArguments$div_evaluable instanceof Function.MatchResult.ArgTypeMismatch)) {
                throw new m();
            }
            if (!Intrinsics.areEqual(function.matchesArgumentsWithCast$div_evaluable(args), Function.MatchResult.Ok.INSTANCE)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid argument type: expected ");
                Function.MatchResult.ArgTypeMismatch argTypeMismatch = (Function.MatchResult.ArgTypeMismatch) matchesArguments$div_evaluable;
                sb2.append(argTypeMismatch.getExpected());
                sb2.append(", got ");
                sb2.append(argTypeMismatch.getActual());
                sb2.append(JwtParser.SEPARATOR_CHAR);
                throw new EvaluableException(sb2.toString(), null, 2, null);
            }
        }
        return function;
    }
}

package com.yandex.div.evaluable;

import com.yandex.div.evaluable.Function;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class LocalFunctionProvider implements FunctionProvider {

    @NotNull
    private final List<Function> functions;

    /* JADX WARN: Multi-variable type inference failed */
    public LocalFunctionProvider(@NotNull List<? extends Function> functions) {
        Intrinsics.checkNotNullParameter(functions, "functions");
        this.functions = functions;
    }

    private final Function findFunction(String str, Function1<? super Function, ? extends Function.MatchResult> function1) {
        List<Function> list = this.functions;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Function function = (Function) obj;
            if (Intrinsics.areEqual(function.getName(), str) && Intrinsics.areEqual(function1.invoke(function), Function.MatchResult.Ok.INSTANCE)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (Function) arrayList.get(0);
        }
        throw new EvaluableException("Function " + arrayList.get(0) + " declared multiple times.", null, 2, null);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function get(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        Function findFunction = findFunction(name, new LocalFunctionProvider$get$1(args));
        if (findFunction != null) {
            return findFunction;
        }
        Function findFunction2 = findFunction(name, new LocalFunctionProvider$get$3(args));
        if (findFunction2 != null) {
            return findFunction2;
        }
        throw new MissingLocalFunctionException(name, args);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function getMethod(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        Function findFunction = findFunction(name, new LocalFunctionProvider$getMethod$1(args));
        if (findFunction != null) {
            return findFunction;
        }
        Function findFunction2 = findFunction(name, new LocalFunctionProvider$getMethod$3(args));
        if (findFunction2 != null) {
            return findFunction2;
        }
        throw new MissingLocalFunctionException(name, args);
    }
}

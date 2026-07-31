package com.yandex.div.core.expression;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionProvider;
import com.yandex.div.evaluable.LocalFunctionProvider;
import com.yandex.div.evaluable.MissingLocalFunctionException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class FunctionProviderDecorator implements FunctionProvider {

    @NotNull
    private final FunctionProvider provider;

    public FunctionProviderDecorator(@NotNull FunctionProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function get(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        return this.provider.get(name, args);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    public Function getMethod(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        return this.provider.getMethod(name, args);
    }

    @NotNull
    public final FunctionProviderDecorator plus(@NotNull List<? extends Function> functions) {
        Intrinsics.checkNotNullParameter(functions, "functions");
        final LocalFunctionProvider localFunctionProvider = new LocalFunctionProvider(functions);
        return new FunctionProviderDecorator(new FunctionProvider() { // from class: com.yandex.div.core.expression.FunctionProviderDecorator$plus$1
            @Override // com.yandex.div.evaluable.FunctionProvider
            @NotNull
            public Function get(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
                FunctionProvider functionProvider;
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(args, "args");
                try {
                    return LocalFunctionProvider.this.get(name, args);
                } catch (MissingLocalFunctionException unused) {
                    functionProvider = this.provider;
                    return functionProvider.get(name, args);
                }
            }

            @Override // com.yandex.div.evaluable.FunctionProvider
            @NotNull
            public Function getMethod(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
                FunctionProvider functionProvider;
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(args, "args");
                try {
                    return LocalFunctionProvider.this.getMethod(name, args);
                } catch (MissingLocalFunctionException unused) {
                    functionProvider = this.provider;
                    return functionProvider.getMethod(name, args);
                }
            }
        });
    }
}

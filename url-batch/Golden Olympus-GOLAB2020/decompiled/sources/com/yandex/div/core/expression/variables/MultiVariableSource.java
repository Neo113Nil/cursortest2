package com.yandex.div.core.expression.variables;

import com.yandex.div.data.Variable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class MultiVariableSource implements VariableSource {

    @NotNull
    private final DivVariableController variableController;

    @NotNull
    private final Function1<String, Unit> variableRequestObserver;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiVariableSource(@NotNull DivVariableController variableController, @NotNull Function1<? super String, Unit> variableRequestObserver) {
        Intrinsics.checkNotNullParameter(variableController, "variableController");
        Intrinsics.checkNotNullParameter(variableRequestObserver, "variableRequestObserver");
        this.variableController = variableController;
        this.variableRequestObserver = variableRequestObserver;
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    @Nullable
    public Variable getMutableVariable(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.variableRequestObserver.invoke(name);
        return this.variableController.get(name);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void observeDeclaration(@NotNull DeclarationObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.variableController.addDeclarationObserver$div_release(observer);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void observeVariables(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.variableController.addVariableObserver$div_release(observer);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void receiveVariablesUpdates(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.variableController.receiveVariablesUpdates$div_release(observer);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void removeDeclarationObserver(@NotNull DeclarationObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.variableController.removeDeclarationObserver$div_release(observer);
    }

    @Override // com.yandex.div.core.expression.variables.VariableSource
    public void removeVariablesObserver(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.variableController.removeVariablesObserver$div_release(observer);
    }
}

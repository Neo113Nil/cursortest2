package com.yandex.div.core.expression.variables;

import com.yandex.div.data.Variable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface VariableSource {
    @Nullable
    Variable getMutableVariable(@NotNull String str);

    void observeDeclaration(@NotNull DeclarationObserver declarationObserver);

    void observeVariables(@NotNull Function1<? super Variable, Unit> function1);

    void receiveVariablesUpdates(@NotNull Function1<? super Variable, Unit> function1);

    void removeDeclarationObserver(@NotNull DeclarationObserver declarationObserver);

    void removeVariablesObserver(@NotNull Function1<? super Variable, Unit> function1);
}

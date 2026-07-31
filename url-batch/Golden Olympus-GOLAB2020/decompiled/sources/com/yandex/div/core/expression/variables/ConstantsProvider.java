package com.yandex.div.core.expression.variables;

import com.yandex.div.evaluable.VariableProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ConstantsProvider implements VariableProvider {

    @NotNull
    private final Map<String, Object> constants;

    public ConstantsProvider(@NotNull Map<String, ? extends Object> constants) {
        Intrinsics.checkNotNullParameter(constants, "constants");
        this.constants = constants;
    }

    @Override // com.yandex.div.evaluable.VariableProvider
    @Nullable
    public Object get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.constants.get(name);
    }
}

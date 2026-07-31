package com.yandex.div.core.view2.state;

import O1.C1165z4;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface DivStateSwitcher {
    void switchStates(@NotNull C1165z4.c cVar, @NotNull List<DivStatePath> list, @NotNull ExpressionResolver expressionResolver);
}

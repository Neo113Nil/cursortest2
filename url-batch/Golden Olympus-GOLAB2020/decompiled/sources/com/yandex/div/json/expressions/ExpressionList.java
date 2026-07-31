package com.yandex.div.json.expressions;

import com.yandex.div.core.Disposable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface ExpressionList<T> {
    @NotNull
    List<T> evaluate(@NotNull ExpressionResolver expressionResolver);

    @NotNull
    Disposable observe(@NotNull ExpressionResolver expressionResolver, @NotNull Function1<? super List<? extends T>, Unit> function1);
}

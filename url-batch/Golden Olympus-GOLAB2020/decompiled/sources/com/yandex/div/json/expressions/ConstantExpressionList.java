package com.yandex.div.json.expressions;

import com.yandex.div.core.Disposable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ConstantExpressionList<T> implements ExpressionList<T> {

    @NotNull
    private final List<T> values;

    /* JADX WARN: Multi-variable type inference failed */
    public ConstantExpressionList(@NotNull List<? extends T> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = values;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ConstantExpressionList) && Intrinsics.areEqual(this.values, ((ConstantExpressionList) obj).values);
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @NotNull
    public List<T> evaluate(@NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return this.values;
    }

    @NotNull
    public final List<T> getValues$div_data_release() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() * 16;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @NotNull
    public Disposable observe(@NotNull ExpressionResolver resolver, @NotNull Function1<? super List<? extends T>, Unit> callback) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return Disposable.NULL;
    }
}

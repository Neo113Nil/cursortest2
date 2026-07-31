package com.yandex.div.evaluable;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class FunctionArgument {
    private final boolean isVariadic;

    @NotNull
    private final EvaluableType type;

    public FunctionArgument(@NotNull EvaluableType type, boolean z4) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.isVariadic = z4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunctionArgument)) {
            return false;
        }
        FunctionArgument functionArgument = (FunctionArgument) obj;
        return this.type == functionArgument.type && this.isVariadic == functionArgument.isVariadic;
    }

    @NotNull
    public final EvaluableType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        boolean z4 = this.isVariadic;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        return hashCode + i4;
    }

    public final boolean isVariadic() {
        return this.isVariadic;
    }

    @NotNull
    public String toString() {
        return "FunctionArgument(type=" + this.type + ", isVariadic=" + this.isVariadic + ')';
    }

    public /* synthetic */ FunctionArgument(EvaluableType evaluableType, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(evaluableType, (i4 & 2) != 0 ? false : z4);
    }
}

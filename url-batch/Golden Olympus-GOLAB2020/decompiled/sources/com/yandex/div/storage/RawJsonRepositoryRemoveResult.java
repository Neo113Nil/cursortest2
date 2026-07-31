package com.yandex.div.storage;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class RawJsonRepositoryRemoveResult {

    @NotNull
    private final List<RawJsonRepositoryException> errors;

    @NotNull
    private final Set<String> ids;

    public RawJsonRepositoryRemoveResult(@NotNull Set<String> ids, @NotNull List<RawJsonRepositoryException> errors) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.ids = ids;
        this.errors = errors;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawJsonRepositoryRemoveResult)) {
            return false;
        }
        RawJsonRepositoryRemoveResult rawJsonRepositoryRemoveResult = (RawJsonRepositoryRemoveResult) obj;
        return Intrinsics.areEqual(this.ids, rawJsonRepositoryRemoveResult.ids) && Intrinsics.areEqual(this.errors, rawJsonRepositoryRemoveResult.errors);
    }

    public int hashCode() {
        return (this.ids.hashCode() * 31) + this.errors.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawJsonRepositoryRemoveResult(ids=" + this.ids + ", errors=" + this.errors + ')';
    }
}

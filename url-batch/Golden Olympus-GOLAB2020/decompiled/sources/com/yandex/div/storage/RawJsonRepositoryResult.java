package com.yandex.div.storage;

import com.yandex.div.storage.rawjson.RawJson;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class RawJsonRepositoryResult {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final RawJsonRepositoryResult EMPTY = new RawJsonRepositoryResult(CollectionsKt.emptyList(), CollectionsKt.emptyList());

    @NotNull
    private final List<RawJsonRepositoryException> errors;

    @NotNull
    private final List<RawJson> resultData;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RawJsonRepositoryResult getEMPTY() {
            return RawJsonRepositoryResult.EMPTY;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawJsonRepositoryResult(@NotNull List<? extends RawJson> resultData, @NotNull List<RawJsonRepositoryException> errors) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.resultData = resultData;
        this.errors = errors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RawJsonRepositoryResult copy$default(RawJsonRepositoryResult rawJsonRepositoryResult, List list, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = rawJsonRepositoryResult.resultData;
        }
        if ((i4 & 2) != 0) {
            list2 = rawJsonRepositoryResult.errors;
        }
        return rawJsonRepositoryResult.copy(list, list2);
    }

    @NotNull
    public final RawJsonRepositoryResult addData(@NotNull Collection<? extends RawJson> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return copy$default(this, CollectionsKt.plus((Collection) this.resultData, (Iterable) data), null, 2, null);
    }

    @NotNull
    public final RawJsonRepositoryResult copy(@NotNull List<? extends RawJson> resultData, @NotNull List<RawJsonRepositoryException> errors) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        Intrinsics.checkNotNullParameter(errors, "errors");
        return new RawJsonRepositoryResult(resultData, errors);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawJsonRepositoryResult)) {
            return false;
        }
        RawJsonRepositoryResult rawJsonRepositoryResult = (RawJsonRepositoryResult) obj;
        return Intrinsics.areEqual(this.resultData, rawJsonRepositoryResult.resultData) && Intrinsics.areEqual(this.errors, rawJsonRepositoryResult.errors);
    }

    @NotNull
    public final List<RawJsonRepositoryException> getErrors() {
        return this.errors;
    }

    @NotNull
    public final List<RawJson> getResultData() {
        return this.resultData;
    }

    public int hashCode() {
        return (this.resultData.hashCode() * 31) + this.errors.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawJsonRepositoryResult(resultData=" + this.resultData + ", errors=" + this.errors + ')';
    }
}

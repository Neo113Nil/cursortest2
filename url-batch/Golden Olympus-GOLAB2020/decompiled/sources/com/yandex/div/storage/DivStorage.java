package com.yandex.div.storage;

import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.database.ExecutionResult;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface DivStorage {

    @Metadata
    public static class LoadDataResult<T> {

        @NotNull
        private final List<StorageException> errors;

        @NotNull
        private final List<T> restoredData;

        /* JADX WARN: Multi-variable type inference failed */
        public LoadDataResult(@NotNull List<? extends T> restoredData, @NotNull List<? extends StorageException> errors) {
            Intrinsics.checkNotNullParameter(restoredData, "restoredData");
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.restoredData = restoredData;
            this.errors = errors;
        }

        @NotNull
        public final List<T> component1() {
            return getRestoredData();
        }

        @NotNull
        public final List<StorageException> component2() {
            return getErrors();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadDataResult)) {
                return false;
            }
            LoadDataResult loadDataResult = (LoadDataResult) obj;
            return Intrinsics.areEqual(getRestoredData(), loadDataResult.getRestoredData()) && Intrinsics.areEqual(getErrors(), loadDataResult.getErrors());
        }

        @NotNull
        public List<StorageException> getErrors() {
            return this.errors;
        }

        @NotNull
        public List<T> getRestoredData() {
            return this.restoredData;
        }

        public int hashCode() {
            return (getRestoredData().hashCode() * 31) + getErrors().hashCode();
        }

        @NotNull
        public String toString() {
            return "LoadDataResult(restoredData=" + getRestoredData() + ", errors=" + getErrors() + ')';
        }
    }

    @Metadata
    public static final class RemoveResult {

        @NotNull
        private final List<StorageException> errors;

        @NotNull
        private final Set<String> ids;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoveResult(@NotNull Set<String> ids, @NotNull List<? extends StorageException> errors) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.ids = ids;
            this.errors = errors;
        }

        @NotNull
        public final Set<String> component1() {
            return this.ids;
        }

        @NotNull
        public final List<StorageException> component2() {
            return this.errors;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveResult)) {
                return false;
            }
            RemoveResult removeResult = (RemoveResult) obj;
            return Intrinsics.areEqual(this.ids, removeResult.ids) && Intrinsics.areEqual(this.errors, removeResult.errors);
        }

        public int hashCode() {
            return (this.ids.hashCode() * 31) + this.errors.hashCode();
        }

        @NotNull
        public String toString() {
            return "RemoveResult(ids=" + this.ids + ", errors=" + this.errors + ')';
        }
    }

    @NotNull
    LoadDataResult<RawJson> readRawJsons(@NotNull Set<String> set);

    @NotNull
    RemoveResult removeRawJsons(@NotNull Function1<? super RawJson, Boolean> function1);

    @NotNull
    ExecutionResult saveRawJsons(@NotNull List<? extends RawJson> list, @NotNull DivDataRepository.ActionOnError actionOnError);
}

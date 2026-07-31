package com.yandex.div.storage;

import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface RawJsonRepository {
    @NotNull
    RawJsonRepositoryResult get(@NotNull List<String> list);

    @NotNull
    RawJsonRepositoryResult put(@NotNull Payload payload);

    @NotNull
    RawJsonRepositoryRemoveResult remove(@NotNull Function1<? super RawJson, Boolean> function1);

    @Metadata
    public static final class Payload {

        @NotNull
        private final DivDataRepository.ActionOnError actionOnError;

        @NotNull
        private final List<RawJson> jsons;

        /* JADX WARN: Multi-variable type inference failed */
        public Payload(@NotNull List<? extends RawJson> jsons, @NotNull DivDataRepository.ActionOnError actionOnError) {
            Intrinsics.checkNotNullParameter(jsons, "jsons");
            Intrinsics.checkNotNullParameter(actionOnError, "actionOnError");
            this.jsons = jsons;
            this.actionOnError = actionOnError;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return Intrinsics.areEqual(this.jsons, payload.jsons) && this.actionOnError == payload.actionOnError;
        }

        @NotNull
        public final DivDataRepository.ActionOnError getActionOnError() {
            return this.actionOnError;
        }

        @NotNull
        public final List<RawJson> getJsons() {
            return this.jsons;
        }

        public int hashCode() {
            return (this.jsons.hashCode() * 31) + this.actionOnError.hashCode();
        }

        @NotNull
        public String toString() {
            return "Payload(jsons=" + this.jsons + ", actionOnError=" + this.actionOnError + ')';
        }

        public /* synthetic */ Payload(List list, DivDataRepository.ActionOnError actionOnError, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i4 & 2) != 0 ? DivDataRepository.ActionOnError.ABORT_TRANSACTION : actionOnError);
        }
    }
}

package com.yandex.div.storage.rawjson;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public interface RawJson {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final RawJson invoke(@NotNull String id, @NotNull JSONObject data) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(data, "data");
            return new Ready(id, data);
        }
    }

    @Metadata
    public static final class Ready implements RawJson {

        @NotNull
        private final JSONObject data;

        @NotNull
        private final String id;

        public Ready(@NotNull String id, @NotNull JSONObject data) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(data, "data");
            this.id = id;
            this.data = data;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return Intrinsics.areEqual(this.id, ready.id) && Intrinsics.areEqual(this.data, ready.data);
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        @NotNull
        public JSONObject getData() {
            return this.data;
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        @NotNull
        public String getId() {
            return this.id;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.data.hashCode();
        }

        @NotNull
        public String toString() {
            return "Ready(id=" + this.id + ", data=" + this.data + ')';
        }
    }

    @NotNull
    JSONObject getData();

    @NotNull
    String getId();
}

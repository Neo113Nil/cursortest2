package com.squareup.cash.storage;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public interface StorageLink {

    public final class Legacy implements StorageLink {
        public static final Legacy INSTANCE = new Legacy();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Legacy);
        }

        @Override // com.squareup.cash.storage.StorageLink
        public final /* bridge */ /* synthetic */ Long getId() {
            return null;
        }

        public final int hashCode() {
            return 2085656903;
        }

        public final String toString() {
            return "Legacy";
        }
    }

    Long getId();

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/storage/StorageLink$Sandboxed", "Lcom/squareup/cash/storage/StorageLink;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class Sandboxed implements StorageLink {
        public final long createdAtMs;
        public final long id;
        public final long signInGroupId;

        public /* synthetic */ Sandboxed(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, (i & 4) != 0 ? 0L : j3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Sandboxed)) {
                return false;
            }
            Sandboxed sandboxed = (Sandboxed) obj;
            return this.id == sandboxed.id && this.signInGroupId == sandboxed.signInGroupId && this.createdAtMs == sandboxed.createdAtMs;
        }

        @Override // com.squareup.cash.storage.StorageLink
        public final Long getId() {
            return Long.valueOf(this.id);
        }

        public final int hashCode() {
            return Long.hashCode(this.createdAtMs) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.id) * 31, 31, this.signInGroupId);
        }

        public final String toString() {
            StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.id, "Sandboxed(id=", ", signInGroupId=");
            m1149m.append(this.signInGroupId);
            return Boxes$$ExternalSyntheticOutline1.m(this.createdAtMs, ", createdAtMs=", ")", m1149m);
        }

        public Sandboxed(long j, long j2, long j3) {
            this.id = j;
            this.signInGroupId = j2;
            this.createdAtMs = j3;
        }
    }
}

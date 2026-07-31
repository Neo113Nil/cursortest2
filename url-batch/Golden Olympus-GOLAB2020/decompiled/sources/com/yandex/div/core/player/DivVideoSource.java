package com.yandex.div.core.player;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivVideoSource {

    @Nullable
    private final Long bitrate;

    @NotNull
    private final String mimeType;

    @Nullable
    private final DivVideoResolution resolution;

    @NotNull
    private final Uri url;

    public DivVideoSource(@NotNull Uri url, @NotNull String mimeType, @Nullable DivVideoResolution divVideoResolution, @Nullable Long l4) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.url = url;
        this.mimeType = mimeType;
        this.resolution = divVideoResolution;
        this.bitrate = l4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivVideoSource)) {
            return false;
        }
        DivVideoSource divVideoSource = (DivVideoSource) obj;
        return Intrinsics.areEqual(this.url, divVideoSource.url) && Intrinsics.areEqual(this.mimeType, divVideoSource.mimeType) && Intrinsics.areEqual(this.resolution, divVideoSource.resolution) && Intrinsics.areEqual(this.bitrate, divVideoSource.bitrate);
    }

    public int hashCode() {
        int hashCode = ((this.url.hashCode() * 31) + this.mimeType.hashCode()) * 31;
        DivVideoResolution divVideoResolution = this.resolution;
        int hashCode2 = (hashCode + (divVideoResolution == null ? 0 : divVideoResolution.hashCode())) * 31;
        Long l4 = this.bitrate;
        return hashCode2 + (l4 != null ? l4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DivVideoSource(url=" + this.url + ", mimeType=" + this.mimeType + ", resolution=" + this.resolution + ", bitrate=" + this.bitrate + ')';
    }
}

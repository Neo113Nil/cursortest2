package ru.rustore.sdk.install.identifier.internal.domain;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class VersionCode {
    private final long value;

    public VersionCode(long j4) {
        this.value = j4;
    }

    public static /* synthetic */ VersionCode copy$default(VersionCode versionCode, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = versionCode.value;
        }
        return versionCode.copy(j4);
    }

    public final long component1() {
        return this.value;
    }

    @NotNull
    public final VersionCode copy(long j4) {
        return new VersionCode(j4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VersionCode) && this.value == ((VersionCode) obj).value;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.value);
    }

    @NotNull
    public String toString() {
        return "VersionCode(value=" + this.value + ')';
    }
}

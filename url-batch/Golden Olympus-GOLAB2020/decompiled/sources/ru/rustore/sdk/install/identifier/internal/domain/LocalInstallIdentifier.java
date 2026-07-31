package ru.rustore.sdk.install.identifier.internal.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class LocalInstallIdentifier {
    private final long installationDate;

    @NotNull
    private final String installationId;

    @NotNull
    private final VersionCode versionCode;

    public LocalInstallIdentifier(@NotNull String installationId, @NotNull VersionCode versionCode, long j4) {
        Intrinsics.checkNotNullParameter(installationId, "installationId");
        Intrinsics.checkNotNullParameter(versionCode, "versionCode");
        this.installationId = installationId;
        this.versionCode = versionCode;
        this.installationDate = j4;
    }

    public static /* synthetic */ LocalInstallIdentifier copy$default(LocalInstallIdentifier localInstallIdentifier, String str, VersionCode versionCode, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = localInstallIdentifier.installationId;
        }
        if ((i4 & 2) != 0) {
            versionCode = localInstallIdentifier.versionCode;
        }
        if ((i4 & 4) != 0) {
            j4 = localInstallIdentifier.installationDate;
        }
        return localInstallIdentifier.copy(str, versionCode, j4);
    }

    @NotNull
    public final String component1() {
        return this.installationId;
    }

    @NotNull
    public final VersionCode component2() {
        return this.versionCode;
    }

    public final long component3() {
        return this.installationDate;
    }

    @NotNull
    public final LocalInstallIdentifier copy(@NotNull String installationId, @NotNull VersionCode versionCode, long j4) {
        Intrinsics.checkNotNullParameter(installationId, "installationId");
        Intrinsics.checkNotNullParameter(versionCode, "versionCode");
        return new LocalInstallIdentifier(installationId, versionCode, j4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalInstallIdentifier)) {
            return false;
        }
        LocalInstallIdentifier localInstallIdentifier = (LocalInstallIdentifier) obj;
        return Intrinsics.areEqual(this.installationId, localInstallIdentifier.installationId) && Intrinsics.areEqual(this.versionCode, localInstallIdentifier.versionCode) && this.installationDate == localInstallIdentifier.installationDate;
    }

    public final long getInstallationDate() {
        return this.installationDate;
    }

    @NotNull
    public final String getInstallationId() {
        return this.installationId;
    }

    @NotNull
    public final VersionCode getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        return Long.hashCode(this.installationDate) + ((this.versionCode.hashCode() + (this.installationId.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "LocalInstallIdentifier(installationId=" + this.installationId + ", versionCode=" + this.versionCode + ", installationDate=" + this.installationDate + ')';
    }
}

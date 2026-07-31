package ru.rustore.sdk.install.identifier.internal.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class RemoteInstallIdentifier {
    private final long installationDate;

    @NotNull
    private final String installationId;

    @NotNull
    private final VersionCode versionCode;

    public RemoteInstallIdentifier(@NotNull String installationId, @NotNull VersionCode versionCode, long j4) {
        Intrinsics.checkNotNullParameter(installationId, "installationId");
        Intrinsics.checkNotNullParameter(versionCode, "versionCode");
        this.installationId = installationId;
        this.versionCode = versionCode;
        this.installationDate = j4;
    }

    public static /* synthetic */ RemoteInstallIdentifier copy$default(RemoteInstallIdentifier remoteInstallIdentifier, String str, VersionCode versionCode, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = remoteInstallIdentifier.installationId;
        }
        if ((i4 & 2) != 0) {
            versionCode = remoteInstallIdentifier.versionCode;
        }
        if ((i4 & 4) != 0) {
            j4 = remoteInstallIdentifier.installationDate;
        }
        return remoteInstallIdentifier.copy(str, versionCode, j4);
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
    public final RemoteInstallIdentifier copy(@NotNull String installationId, @NotNull VersionCode versionCode, long j4) {
        Intrinsics.checkNotNullParameter(installationId, "installationId");
        Intrinsics.checkNotNullParameter(versionCode, "versionCode");
        return new RemoteInstallIdentifier(installationId, versionCode, j4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteInstallIdentifier)) {
            return false;
        }
        RemoteInstallIdentifier remoteInstallIdentifier = (RemoteInstallIdentifier) obj;
        return Intrinsics.areEqual(this.installationId, remoteInstallIdentifier.installationId) && Intrinsics.areEqual(this.versionCode, remoteInstallIdentifier.versionCode) && this.installationDate == remoteInstallIdentifier.installationDate;
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
        return "RemoteInstallIdentifier(installationId=" + this.installationId + ", versionCode=" + this.versionCode + ", installationDate=" + this.installationDate + ')';
    }
}

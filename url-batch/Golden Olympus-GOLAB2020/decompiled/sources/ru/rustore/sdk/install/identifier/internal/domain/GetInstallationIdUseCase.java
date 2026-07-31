package ru.rustore.sdk.install.identifier.internal.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.install.identifier.internal.data.CurrentVersionRepository;
import ru.rustore.sdk.install.identifier.internal.data.LocalInstallIdentifierRepository;
import ru.rustore.sdk.install.identifier.model.InstallationId;

@Metadata
/* loaded from: classes3.dex */
public final class GetInstallationIdUseCase {

    @NotNull
    private final LocalInstallIdentifierRepository localInstallIdentifierRepository;

    @NotNull
    private final CurrentVersionRepository versionCodeRepository;

    public GetInstallationIdUseCase(@NotNull LocalInstallIdentifierRepository localInstallIdentifierRepository, @NotNull CurrentVersionRepository versionCodeRepository) {
        Intrinsics.checkNotNullParameter(localInstallIdentifierRepository, "localInstallIdentifierRepository");
        Intrinsics.checkNotNullParameter(versionCodeRepository, "versionCodeRepository");
        this.localInstallIdentifierRepository = localInstallIdentifierRepository;
        this.versionCodeRepository = versionCodeRepository;
    }

    @Nullable
    public final InstallationId invoke() {
        LocalInstallIdentifier localInstallIdentifier = this.localInstallIdentifierRepository.get();
        VersionCode versionCode = this.versionCodeRepository.get();
        if (localInstallIdentifier == null || !Intrinsics.areEqual(localInstallIdentifier.getVersionCode(), versionCode)) {
            return null;
        }
        return new InstallationId(localInstallIdentifier.getInstallationId());
    }
}

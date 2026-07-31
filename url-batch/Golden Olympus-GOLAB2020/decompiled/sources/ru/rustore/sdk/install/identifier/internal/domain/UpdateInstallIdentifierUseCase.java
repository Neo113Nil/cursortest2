package ru.rustore.sdk.install.identifier.internal.domain;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.install.identifier.internal.data.CurrentVersionRepository;
import ru.rustore.sdk.install.identifier.internal.data.LocalInstallIdentifierRepository;
import ru.rustore.sdk.install.identifier.internal.data.RemoteInstallIdentifierRepository;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleMapKt;

@Metadata
/* loaded from: classes3.dex */
public final class UpdateInstallIdentifierUseCase {

    @NotNull
    private final LocalInstallIdentifierRepository localInstallIdentifierRepository;

    @NotNull
    private final RemoteInstallIdentifierRepository remoteInstallIdentifierRepository;

    @NotNull
    private final CurrentVersionRepository versionCodeRepository;

    public UpdateInstallIdentifierUseCase(@NotNull LocalInstallIdentifierRepository localInstallIdentifierRepository, @NotNull RemoteInstallIdentifierRepository remoteInstallIdentifierRepository, @NotNull CurrentVersionRepository versionCodeRepository) {
        Intrinsics.checkNotNullParameter(localInstallIdentifierRepository, "localInstallIdentifierRepository");
        Intrinsics.checkNotNullParameter(remoteInstallIdentifierRepository, "remoteInstallIdentifierRepository");
        Intrinsics.checkNotNullParameter(versionCodeRepository, "versionCodeRepository");
        this.localInstallIdentifierRepository = localInstallIdentifierRepository;
        this.remoteInstallIdentifierRepository = remoteInstallIdentifierRepository;
        this.versionCodeRepository = versionCodeRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveInstallIdentifier(RemoteInstallIdentifier remoteInstallIdentifier) {
        this.localInstallIdentifierRepository.set(new LocalInstallIdentifier(remoteInstallIdentifier.getInstallationId(), remoteInstallIdentifier.getVersionCode(), remoteInstallIdentifier.getInstallationDate()));
    }

    @NotNull
    public final Single<Unit> invoke() {
        VersionCode versionCode = this.versionCodeRepository.get();
        return versionCode == null ? Single.Companion.from(UpdateInstallIdentifierUseCase$invoke$currentVersionCode$1.INSTANCE) : SingleMapKt.map(this.remoteInstallIdentifierRepository.get(), new UpdateInstallIdentifierUseCase$invoke$1(this, versionCode));
    }
}

package ru.rustore.sdk.install.identifier.internal.domain;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.install.identifier.internal.data.LocalInstallIdentifierRepository;

@Metadata
/* loaded from: classes3.dex */
public final class UpdateInstallIdentifierUseCase$invoke$1 extends s implements Function1<RemoteInstallIdentifier, Unit> {
    final /* synthetic */ VersionCode $currentVersionCode;
    final /* synthetic */ UpdateInstallIdentifierUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateInstallIdentifierUseCase$invoke$1(UpdateInstallIdentifierUseCase updateInstallIdentifierUseCase, VersionCode versionCode) {
        super(1);
        this.this$0 = updateInstallIdentifierUseCase;
        this.$currentVersionCode = versionCode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RemoteInstallIdentifier) obj);
        return Unit.f41027a;
    }

    public final void invoke(RemoteInstallIdentifier remoteInstallIdentifier) {
        LocalInstallIdentifierRepository localInstallIdentifierRepository;
        VersionCode versionCode;
        localInstallIdentifierRepository = this.this$0.localInstallIdentifierRepository;
        LocalInstallIdentifier localInstallIdentifier = localInstallIdentifierRepository.get();
        boolean z4 = false;
        boolean z5 = localInstallIdentifier == null && remoteInstallIdentifier != null && (versionCode = remoteInstallIdentifier.getVersionCode()) != null && this.$currentVersionCode.getValue() == versionCode.getValue();
        if (localInstallIdentifier != null && remoteInstallIdentifier != null && localInstallIdentifier.getVersionCode().getValue() < remoteInstallIdentifier.getVersionCode().getValue() && this.$currentVersionCode.getValue() == remoteInstallIdentifier.getVersionCode().getValue()) {
            z4 = true;
        }
        if ((z5 || z4) && remoteInstallIdentifier != null) {
            this.this$0.saveInstallIdentifier(remoteInstallIdentifier);
        }
    }
}

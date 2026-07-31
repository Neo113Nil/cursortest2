package ru.rustore.sdk.install.identifier.internal.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.install.identifier.internal.data.CurrentVersionRepository;
import ru.rustore.sdk.install.identifier.internal.data.LocalInstallIdentifierRepository;
import ru.rustore.sdk.install.identifier.internal.domain.GetInstallationIdUseCase;

@Metadata
/* loaded from: classes3.dex */
public final class ServiceLocator$getInstallationIdUseCase$2 extends s implements Function0<GetInstallationIdUseCase> {
    final /* synthetic */ ServiceLocator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceLocator$getInstallationIdUseCase$2(ServiceLocator serviceLocator) {
        super(0);
        this.this$0 = serviceLocator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final GetInstallationIdUseCase invoke() {
        LocalInstallIdentifierRepository localInstallIdentifierRepository;
        CurrentVersionRepository currentVersionRepository;
        localInstallIdentifierRepository = this.this$0.getLocalInstallIdentifierRepository();
        currentVersionRepository = this.this$0.getCurrentVersionRepository();
        return new GetInstallationIdUseCase(localInstallIdentifierRepository, currentVersionRepository);
    }
}

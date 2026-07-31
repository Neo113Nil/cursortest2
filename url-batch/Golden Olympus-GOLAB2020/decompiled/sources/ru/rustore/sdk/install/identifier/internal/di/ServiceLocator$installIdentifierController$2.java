package ru.rustore.sdk.install.identifier.internal.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.install.identifier.internal.InstallIdentifierController;
import ru.rustore.sdk.install.identifier.internal.domain.GetInstallationIdUseCase;
import ru.rustore.sdk.install.identifier.internal.domain.UpdateInstallIdentifierUseCase;

@Metadata
/* loaded from: classes3.dex */
public final class ServiceLocator$installIdentifierController$2 extends s implements Function0<InstallIdentifierController> {
    final /* synthetic */ ServiceLocator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceLocator$installIdentifierController$2(ServiceLocator serviceLocator) {
        super(0);
        this.this$0 = serviceLocator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InstallIdentifierController invoke() {
        UpdateInstallIdentifierUseCase updateInstallIdentifierUseCase;
        GetInstallationIdUseCase getInstallationIdUseCase;
        updateInstallIdentifierUseCase = this.this$0.getUpdateInstallIdentifierUseCase();
        getInstallationIdUseCase = this.this$0.getGetInstallationIdUseCase();
        return new InstallIdentifierController(updateInstallIdentifierUseCase, getInstallationIdUseCase);
    }
}

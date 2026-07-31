package ru.rustore.sdk.install.identifier.internal.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.install.identifier.InstallIdentifierClient;
import ru.rustore.sdk.install.identifier.internal.InstallIdentifierController;

@Metadata
/* loaded from: classes3.dex */
public final class ServiceLocator$installIdentifierClient$2 extends s implements Function0<InstallIdentifierClient> {
    final /* synthetic */ ServiceLocator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceLocator$installIdentifierClient$2(ServiceLocator serviceLocator) {
        super(0);
        this.this$0 = serviceLocator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InstallIdentifierClient invoke() {
        InstallIdentifierController installIdentifierController;
        installIdentifierController = this.this$0.getInstallIdentifierController();
        return new InstallIdentifierClient(installIdentifierController);
    }
}

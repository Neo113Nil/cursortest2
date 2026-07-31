package ru.rustore.sdk.install.identifier.internal.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.install.identifier.internal.data.LocalInstallIdentifierDataSource;
import ru.rustore.sdk.install.identifier.internal.data.LocalInstallIdentifierMapper;
import ru.rustore.sdk.install.identifier.internal.data.LocalInstallIdentifierRepository;

@Metadata
/* loaded from: classes3.dex */
public final class ServiceLocator$localInstallIdentifierRepository$2 extends s implements Function0<LocalInstallIdentifierRepository> {
    final /* synthetic */ ServiceLocator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceLocator$localInstallIdentifierRepository$2(ServiceLocator serviceLocator) {
        super(0);
        this.this$0 = serviceLocator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LocalInstallIdentifierRepository invoke() {
        LocalInstallIdentifierDataSource localInstallIdentifierDataSource;
        localInstallIdentifierDataSource = this.this$0.getLocalInstallIdentifierDataSource();
        return new LocalInstallIdentifierRepository(localInstallIdentifierDataSource, new LocalInstallIdentifierMapper());
    }
}

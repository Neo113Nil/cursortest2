package ru.rustore.sdk.install.identifier.internal.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.install.identifier.internal.data.RemoteInstallIdentifierDataSource;
import ru.rustore.sdk.install.identifier.internal.data.RemoteInstallIdentifierMapper;
import ru.rustore.sdk.install.identifier.internal.data.RemoteInstallIdentifierRepository;

@Metadata
/* loaded from: classes3.dex */
public final class ServiceLocator$remoteInstallIdentifierRepository$2 extends s implements Function0<RemoteInstallIdentifierRepository> {
    final /* synthetic */ ServiceLocator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceLocator$remoteInstallIdentifierRepository$2(ServiceLocator serviceLocator) {
        super(0);
        this.this$0 = serviceLocator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RemoteInstallIdentifierRepository invoke() {
        RemoteInstallIdentifierDataSource remoteInstallIdentifierDataSource;
        remoteInstallIdentifierDataSource = this.this$0.getRemoteInstallIdentifierDataSource();
        return new RemoteInstallIdentifierRepository(remoteInstallIdentifierDataSource, new RemoteInstallIdentifierMapper());
    }
}

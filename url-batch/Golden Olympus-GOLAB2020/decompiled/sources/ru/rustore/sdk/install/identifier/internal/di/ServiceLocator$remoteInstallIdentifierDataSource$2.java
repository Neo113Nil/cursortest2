package ru.rustore.sdk.install.identifier.internal.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.install.identifier.internal.data.InstallIdentifierProvider;
import ru.rustore.sdk.install.identifier.internal.data.RemoteInstallIdentifierDataSource;

@Metadata
/* loaded from: classes3.dex */
public final class ServiceLocator$remoteInstallIdentifierDataSource$2 extends s implements Function0<RemoteInstallIdentifierDataSource> {
    final /* synthetic */ ServiceLocator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceLocator$remoteInstallIdentifierDataSource$2(ServiceLocator serviceLocator) {
        super(0);
        this.this$0 = serviceLocator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RemoteInstallIdentifierDataSource invoke() {
        InstallIdentifierProvider installIdentifierProvider;
        Context context;
        installIdentifierProvider = this.this$0.getInstallIdentifierProvider();
        context = this.this$0.applicationContext;
        return new RemoteInstallIdentifierDataSource(installIdentifierProvider, context);
    }
}

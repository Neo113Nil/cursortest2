package ru.rustore.sdk.install.identifier.internal.di;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.install.identifier.internal.data.LocalInstallIdentifierDataSource;

@Metadata
/* loaded from: classes3.dex */
public final class ServiceLocator$localInstallIdentifierDataSource$2 extends s implements Function0<LocalInstallIdentifierDataSource> {
    final /* synthetic */ ServiceLocator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceLocator$localInstallIdentifierDataSource$2(ServiceLocator serviceLocator) {
        super(0);
        this.this$0 = serviceLocator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LocalInstallIdentifierDataSource invoke() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.this$0.getSharedPreferences();
        return new LocalInstallIdentifierDataSource(sharedPreferences);
    }
}

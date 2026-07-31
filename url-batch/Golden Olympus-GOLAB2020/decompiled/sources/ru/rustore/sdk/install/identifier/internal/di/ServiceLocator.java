package ru.rustore.sdk.install.identifier.internal.di;

import W1.h;
import W1.i;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.install.identifier.InstallIdentifierClient;
import ru.rustore.sdk.install.identifier.internal.InstallIdentifierController;
import ru.rustore.sdk.install.identifier.internal.data.CurrentVersionRepository;
import ru.rustore.sdk.install.identifier.internal.data.InstallIdentifierProvider;
import ru.rustore.sdk.install.identifier.internal.data.LocalInstallIdentifierDataSource;
import ru.rustore.sdk.install.identifier.internal.data.LocalInstallIdentifierRepository;
import ru.rustore.sdk.install.identifier.internal.data.RemoteInstallIdentifierDataSource;
import ru.rustore.sdk.install.identifier.internal.data.RemoteInstallIdentifierRepository;
import ru.rustore.sdk.install.identifier.internal.domain.GetInstallationIdUseCase;
import ru.rustore.sdk.install.identifier.internal.domain.UpdateInstallIdentifierUseCase;
import ru.rustore.sdk.install.identifier.model.InstallIdentifierException;

@Metadata
/* loaded from: classes3.dex */
public final class ServiceLocator {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private static volatile ServiceLocator _instance;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final h currentVersionRepository$delegate;

    @NotNull
    private final h getInstallationIdUseCase$delegate;

    @NotNull
    private final h installIdentifierClient$delegate;

    @NotNull
    private final h installIdentifierController$delegate;

    @NotNull
    private final h installIdentifierProvider$delegate;

    @NotNull
    private final h localInstallIdentifierDataSource$delegate;

    @NotNull
    private final h localInstallIdentifierRepository$delegate;

    @NotNull
    private final h remoteInstallIdentifierDataSource$delegate;

    @NotNull
    private final h remoteInstallIdentifierRepository$delegate;

    @NotNull
    private final h sharedPreferences$delegate;

    @NotNull
    private final h updateInstallIdentifierUseCase$delegate;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ServiceLocator getInstance() {
            ServiceLocator serviceLocator = ServiceLocator._instance;
            if (serviceLocator != null) {
                return serviceLocator;
            }
            throw new InstallIdentifierException.ClientNotCreated("To get an instance of the InstallIdentifierClient, you must first call\n                   InstallIdentifierClientProvider.provide(context)", null, 2, null);
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class ServiceLocatorInstanceFactory {
        @NotNull
        public final ServiceLocator create(@NotNull Context applicationContext) {
            ServiceLocator serviceLocator;
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            synchronized (ServiceLocatorInstanceFactory.class) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (ServiceLocator._instance != null) {
                    throw new InstallIdentifierException.ClientAlreadyExist("InstallIdentifierClient instance already exist", null, 2, null);
                }
                serviceLocator = new ServiceLocator(applicationContext, defaultConstructorMarker);
                ServiceLocator._instance = serviceLocator;
            }
            return serviceLocator;
        }
    }

    public /* synthetic */ ServiceLocator(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CurrentVersionRepository getCurrentVersionRepository() {
        return (CurrentVersionRepository) this.currentVersionRepository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GetInstallationIdUseCase getGetInstallationIdUseCase() {
        return (GetInstallationIdUseCase) this.getInstallationIdUseCase$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InstallIdentifierController getInstallIdentifierController() {
        return (InstallIdentifierController) this.installIdentifierController$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InstallIdentifierProvider getInstallIdentifierProvider() {
        return (InstallIdentifierProvider) this.installIdentifierProvider$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalInstallIdentifierDataSource getLocalInstallIdentifierDataSource() {
        return (LocalInstallIdentifierDataSource) this.localInstallIdentifierDataSource$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocalInstallIdentifierRepository getLocalInstallIdentifierRepository() {
        return (LocalInstallIdentifierRepository) this.localInstallIdentifierRepository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RemoteInstallIdentifierDataSource getRemoteInstallIdentifierDataSource() {
        return (RemoteInstallIdentifierDataSource) this.remoteInstallIdentifierDataSource$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RemoteInstallIdentifierRepository getRemoteInstallIdentifierRepository() {
        return (RemoteInstallIdentifierRepository) this.remoteInstallIdentifierRepository$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getSharedPreferences() {
        Object value = this.sharedPreferences$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-sharedPreferences>(...)");
        return (SharedPreferences) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdateInstallIdentifierUseCase getUpdateInstallIdentifierUseCase() {
        return (UpdateInstallIdentifierUseCase) this.updateInstallIdentifierUseCase$delegate.getValue();
    }

    @NotNull
    public final InstallIdentifierClient getInstallIdentifierClient$sdk_public_install_identifier_release() {
        return (InstallIdentifierClient) this.installIdentifierClient$delegate.getValue();
    }

    private ServiceLocator(Context context) {
        this.applicationContext = context;
        this.installIdentifierClient$delegate = i.b(new ServiceLocator$installIdentifierClient$2(this));
        this.installIdentifierController$delegate = i.b(new ServiceLocator$installIdentifierController$2(this));
        this.sharedPreferences$delegate = i.b(new ServiceLocator$sharedPreferences$2(this));
        this.localInstallIdentifierDataSource$delegate = i.b(new ServiceLocator$localInstallIdentifierDataSource$2(this));
        this.localInstallIdentifierRepository$delegate = i.b(new ServiceLocator$localInstallIdentifierRepository$2(this));
        this.installIdentifierProvider$delegate = i.b(ServiceLocator$installIdentifierProvider$2.INSTANCE);
        this.remoteInstallIdentifierDataSource$delegate = i.b(new ServiceLocator$remoteInstallIdentifierDataSource$2(this));
        this.remoteInstallIdentifierRepository$delegate = i.b(new ServiceLocator$remoteInstallIdentifierRepository$2(this));
        this.currentVersionRepository$delegate = i.b(new ServiceLocator$currentVersionRepository$2(this));
        this.updateInstallIdentifierUseCase$delegate = i.b(new ServiceLocator$updateInstallIdentifierUseCase$2(this));
        this.getInstallationIdUseCase$delegate = i.b(new ServiceLocator$getInstallationIdUseCase$2(this));
    }
}
